package transformation

import SC.SecurityConcept
import SC.SCPackage
import SC.Component
import SC.Data
import SC.SecurityGoal

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EObject
import java.io.IOException
import java.util.Collections
import java.util.List
import java.util.Stack
import SC.SCFactory
import java.util.ArrayList
import SC.Connection
import SC.Asset
import org.eclipse.emf.ecore.resource.Resource
import SC.Threat
import SC.SecurityGoalClassType
import SC.Damages
import java.util.HashSet
import java.util.Set

class Transformation {

	List<Component> visitedNodes
	List<Component> componentsOfInterest
	List<SecurityGoal> securityGoals
	Stack<Component> ancestorStack
	Stack<Component> childStack
	SCFactory factory
	SecurityConcept newSecurityConcept
	SecurityConcept oldSecurityConcept
	// Resulting lists of security concept elements
	List<Component> transformedComponents
	List<Asset> transformedAssets
	List<SecurityGoal> transformedSecurityGoals
	List<Threat> transformedThreats

	def static void main(String[] args) {
//		new Transformation().generate("MetaModel/minitest.xmi")
		new Transformation().generate("MetaModel/SecurityConcept_MT_example.xmi")
	}

	def generate(String file) {
		// Initialize the variables
		componentsOfInterest = new ArrayList<Component>()
		visitedNodes = new ArrayList<Component>
		factory = SCFactory.eINSTANCE
		oldSecurityConcept = factory.createSecurityConcept
		val resourceSet = new ResourceSetImpl
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put(SCPackage.eNS_URI, SCPackage.eINSTANCE)
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
		val resource = resourceSet.getResource(URI.createFileURI(file), true)
		for (content : resource.contents) {
			generateCode(content)
		}
	}

	// TODO: if connection array is empty check the sources/targets and add the corresponding connections to the components
	def dispatch generateCode(SecurityConcept securityConcept) {
		oldSecurityConcept = securityConcept
		// Select the IDs of components that should be aggregated
		val int[] componentIDs = #[1, 4, 6]
		componentIDs.stream.filter(id|findComponentByID(securityConcept, id) !== null).forEach [ id |
			componentsOfInterest.add(findComponentByID(securityConcept, id))
		]

//		oldSecurityConcept.securityGoals.forEach[sg|println(sg.toString)]
//		oldSecurityConcept.connection.forEach[con|println(con.source.toString + con.target.toString)]
		for (Component comp : componentsOfInterest) {
			generateSG(comp)
		}
		
		oldSecurityConcept.components.findFirst[c|c.componentID.equals(6)].asset.securityGoals.forEach [ sg |
			println("SEC GOAL: " + sg.toString)
		]

		oldSecurityConcept.components.findFirst[c|c.componentID.equals(6)].asset.securityGoals.forEach [ sg |
			sg.threats.forEach[t|println("SEC GOAL THREAT: " + t)]
		]

		oldSecurityConcept.components.findFirst[c|c.componentID.equals(6)].data.forEach [ d |
			println("DATA " + d.asset.securityGoals)
		]

		oldSecurityConcept.components.findFirst[c|c.componentID.equals(6)].data.forEach [ d |
			println("DATA THREAT " + d.asset.threats + " " + d.asset)
		]

		oldSecurityConcept.components.findFirst[c|c.componentID.equals(6)].asset.threats.filter [ t |
			t.securityGoals.empty == true
		].forEach[threat|println("OTHER THREAT: " + threat)]
		println("#########")

		var List<SecurityGoal> sgl = getFullSecurityGoalList(findComponentByID(securityConcept, 1))
		println("SG BEFORE AGGREGATION: " + sgl.size)

		var List<SecurityGoal> finalSecurityGoals = securityGoalAggregation(sgl)

		println("SG AFTER AGGREGATION: " + finalSecurityGoals.size)
		println("#########")

		var List<Threat> tl = getFullThreatList(findComponentByID(securityConcept, 1))

		println("THREATS BEFORE AGGREGATION: " + tl.size)

		var List<Threat> finalThreats = threatAggregation(tl)

		println("THREATS AFTER AGGREGATION: " + finalThreats.size)

//		oldSecurityConcept.components.findFirst[c|c.componentID.equals(6)].connections.forEach [con|
//			println(con.data.asset.securitygoals)
//		]
//		oldSecurityConcept.connection.forEach[con|println(con.source.toString + con.target.toString)]
//		oldSecurityConcept.securityGoals.forEach[sg|println(sg)]
		println("#########")

		oldSecurityConcept.connections.forEach[con|println("CONNECTION: " + con.source + con.target + con.data)]

//		oldSecurityConcept.components.findFirst[c|c.componentID.equals(1)].connections.forEach[con|println(con.data)]
		// Add the resulting elements and security attributes to the new security concept
		newSecurityConcept = buildSecurityConcept()
		writeToSecrutiyConcept(newSecurityConcept)
	}

	def SecurityConcept buildSecurityConcept() {
		newSecurityConcept = factory.createSecurityConcept
		newSecurityConcept.components.addAll(componentsOfInterest)
		newSecurityConcept.connections.addAll(oldSecurityConcept.connections)
		for (comp : componentsOfInterest) {
			newSecurityConcept.assets.add(comp.asset)
			newSecurityConcept.data.addAll(comp.data)
			newSecurityConcept.securityGoals.addAll(comp.asset.securityGoals)
			newSecurityConcept.threats.addAll(comp.asset.threats)
		}
		return newSecurityConcept
	}

	def generateSG(Component component) {
		transformedSecurityGoals = new ArrayList<SecurityGoal>
		transformedThreats = new ArrayList<Threat>
		ancestorStack = new Stack<Component>
		childStack = new Stack<Component>
		if (!visitedNodes.contains(component)) {
			visitedNodes.add(component)
			if (component.asset === null) {
				var asset = factory.createAsset
				asset.name = "Asset_".concat(component.name)
				asset.component = component
				asset.assetID = oldSecurityConcept.assets.last.assetID + 1
				// Add the new component and its asset to the transformed lists
				component.asset = asset
				oldSecurityConcept.assets.add(asset)
			}
			// Check connections and add their security goals
			for (Connection con : component.connections) {
				transformedSecurityGoals.addAll(con.data.asset.securityGoals)
			}
		}
		findAncestors(component, component)
		findChildren(component, component)
//		checkConnections(securityGoals, component)
		addSecurityGoalsFromConnections(component)
	}

	def addSecurityGoalsFromConnections(Component component) {
		var SecurityGoal tmpSG
		var Asset tmpAsset
		var Data tmpData
		var Threat tmpThreat
		var list = oldSecurityConcept.connections.filter[con|(con.target == component || con.source == component)]
		for (con : list) {
			for (sg : con.data.asset.securityGoals) {
				tmpSG = createSecurityGoal
				tmpSG = copySecurityGoal(tmpSG, sg)
				tmpSG.component = component
				tmpData = copyData(con.data)
				component.data.add(tmpData)
				tmpAsset = createAsset
				tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
				tmpAsset.data = tmpData
				tmpAsset.name = tmpData.name
				tmpData.asset = tmpAsset
				if(!oldSecurityConcept.assets.contains(tmpAsset)) oldSecurityConcept.assets.add(tmpAsset)
				// Create the new security goal for the new asset
				tmpSG = createSecurityGoal
				tmpSG = copySecurityGoal(tmpSG, sg)
				tmpSG.component = component
				tmpSG.asset = tmpAsset
				tmpSG.name = tmpData.name.concat("_".concat(component.name))
				if(!securityGoalExists(component.asset, tmpSG)) oldSecurityConcept.securityGoals.add(tmpSG)
				// Get and adjust the threats
				for (threat : sg.threats) {
					tmpThreat = createThreat
					tmpThreat = copyThreat(tmpThreat, threat)
					tmpThreat.asset = tmpAsset
					oldSecurityConcept.threats.add(tmpThreat)
				}
			}
		}
	}

	def dispatch generateCode(EObject object) {
		println("")
	}

	def findAncestors(Component component, Component child) {
		if (component.ancestor !== null) {
			// Check whether the ancestor must be processed
			if (componentsOfInterest.contains(component.ancestor)) {
				// Check whether the component has already been processed
				if (!visitedNodes.contains(component.ancestor)) {
					ancestorStack.add(component.ancestor)
				}
			}
			findAncestors(component.ancestor, component)
			addSgAtoC(component.ancestor, component)
		}
		while (!ancestorStack.empty()) {
			var comp = ancestorStack.pop
			generateSG(comp)
			addSgAtoC(component, comp)
		}
	}

	def findChildren(Component component, Component anc) {
		if (component.subcomponents !== null) {
			for (subcomp : component.subcomponents) {
				if (componentsOfInterest.contains(subcomp)) {
					// Check whether the component has already been processed
					if (!visitedNodes.contains(subcomp)) {
						childStack.add(subcomp)
					}
				}
				fixConnection(component, subcomp)
				findChildren(subcomp, component)
				addSgCtoA(subcomp, component)
			}
		}
		while (!childStack.empty()) {
			var comp = childStack.pop
			generateSG(comp)
			addSgCtoA(component, comp)
		}
	}

// Security goals ancestor to child
	def addSgAtoC(Component anc, Component child) {
		var Asset tmpAsset
		var SecurityGoal tmpSG
		var Threat tmpThreat
		// Check whether the ancestor is an asset 
		if (anc.asset != null) {
			for (sg : anc.asset.securityGoals) {
				// Only add if the security goal is not addressing data
				if (!sg.securityGoalClass.equals(SecurityGoalClassType.CONFIDENTIALITY)) {
					// Check whether the child is an asset already
					if (child.asset == null) {
						tmpAsset = createAsset
						tmpAsset.name = "Asset_".concat(child.name)
						tmpAsset.component = child
						tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
						// Add the new component and its asset to the transformed lists
						child.asset = tmpAsset
						oldSecurityConcept.assets.add(tmpAsset)
						tmpAsset = createAsset
					}
					// Create the security goal and assign the new values
					tmpSG = createSecurityGoal
					tmpSG = copySecurityGoal(tmpSG, sg)
					if (!securityGoalExists(child.asset, tmpSG)) {
						tmpSG.name = child.name
						tmpSG.component = child
						tmpSG.asset = child.asset
						for (threat : sg.threats) {
							tmpThreat = createThreat
							tmpThreat = copyThreat(tmpThreat, threat)
							tmpThreat.asset = tmpAsset
							tmpThreat.description = child.name
							oldSecurityConcept.threats.add(tmpThreat)
							tmpSG.threats.add(tmpThreat)
						}
						// Add the security goal to the old security concept
						oldSecurityConcept.securityGoals.add(tmpSG)
						// Clear references
						tmpSG = createSecurityGoal
					}

				}

			}
		}
		// Iterate through all the data of the ancestor and check if it exists in the layer below
		for (data : anc.data) {
			for (sg : data.asset?.securityGoals) {
				if (child.data.contains(data)) {
					var childData = findData(child, data)
					if (childData.asset != null) {
						// Add the security goals to the asset
						tmpSG = copySecurityGoal(tmpSG, sg)
						tmpSG.component = child
						tmpSG.asset = childData.asset
						tmpSG.name = childData.name
						if(!securityGoalExists(childData.asset, tmpSG)) oldSecurityConcept.securityGoals.add(tmpSG)
					} else {
						// Create the corresponding asset
						tmpAsset = createAsset
						tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
						tmpAsset.data = childData
						tmpAsset.name = childData.name
						// Create the new security goal for the new asset
						tmpSG = copySecurityGoal(tmpSG, sg)
						tmpSG.component = child
						tmpSG.asset = childData.asset
						tmpSG.name = childData.name
						// Add the goal to the list of security goals of the asset
						tmpAsset.securityGoals.add(tmpSG)
						// Add the security goal and the asset to the old security concept
						oldSecurityConcept.assets.add(tmpAsset)
						oldSecurityConcept.securityGoals.add(tmpSG)
					}
				}
			}
		}
	}

// Security goal child to ancestor
	def addSgCtoA(Component child, Component anc) {
		var Asset tmpAsset
		var SecurityGoal tmpSG
		var Threat tmpThreat
		// Add threats that address the subcomponent directly and create the corresponding threats
		if (child.asset == null) {
			tmpAsset = createAsset
			tmpAsset.name = "Asset_".concat(child.name)
			tmpAsset.component = child
			tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
			// Add the new component and its asset to the transformed lists
			child.asset = tmpAsset
			oldSecurityConcept.assets.add(tmpAsset)
		}
		if (child != anc) {
			for (sg : child?.asset?.securityGoals) {
				for (threat : child.asset.threats) {
					if (!threatExists(anc.asset, threat)) {
						tmpThreat = createThreat
						tmpThreat = copyThreat(tmpThreat, threat)
						tmpThreat.description = anc.name
						tmpThreat.asset = anc.asset
						tmpThreat.asset.component = anc.asset.component
						oldSecurityConcept.threats.add(tmpThreat)
					}
				}
			}
		}
		// Check the data and add the corresponding security goals accordingly
		for (data : child.data) {
			for (sg : data?.asset?.securityGoals) {
				if (anc.data.contains(data)) {
					var ancData = findData(anc, data)
					if (ancData.asset != null) {
						// Add the security goals to the asset
						tmpSG = createSecurityGoal
						tmpSG = copySecurityGoal(tmpSG, sg)
						tmpSG.component = anc
						tmpSG.asset = ancData.asset
						tmpSG.name = ancData.name
						if(!securityGoalExists(ancData.asset, tmpSG)) oldSecurityConcept.securityGoals.add(tmpSG)
					} else {
						// Create the corresponding asset
						tmpAsset = createAsset
						tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
						tmpAsset.data = ancData
						tmpAsset.name = ancData.name
						// Create the new security goal for the new asset
						tmpSG = createSecurityGoal
						tmpSG = copySecurityGoal(tmpSG, sg)
						tmpSG.component = anc
						tmpSG.asset = ancData.asset
						tmpSG.name = ancData.name
						// Add the goal to the list of security goals of the asset
						tmpAsset.securityGoals.add(tmpSG)
						// Add the security goal and the asset to the old security concept
						oldSecurityConcept.assets.add(tmpAsset)
						oldSecurityConcept.securityGoals.add(tmpSG)
						// Add the corresponding threats to the ancestor
						for (threat : sg.threats) {
							tmpThreat = createThreat
							tmpThreat = copyThreat(tmpThreat, threat)
							tmpThreat.asset = tmpAsset
							oldSecurityConcept.threats.add(tmpThreat)
						}
					}
				} else {
					if (!anc.data.contains(data)) {
						if (sg.asset.data != null) {
							// Create the data and add the security goals of the child element
							var newData = copyData(data)
							newData.asset = anc.asset
							anc.data.add(newData)
							tmpAsset = createAsset
							tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
							tmpAsset.data = newData
							tmpAsset.name = newData.name
							// Create the new security goal for the new asset
							tmpSG = createSecurityGoal
							tmpSG = copySecurityGoal(tmpSG, sg)
							tmpSG.component = anc
							tmpSG.asset = tmpAsset
							tmpSG.name = newData.name.concat("_".concat(anc.name))
							oldSecurityConcept.assets.add(tmpAsset)
							oldSecurityConcept.data.add(newData)
							oldSecurityConcept.securityGoals.add(tmpSG)
							// Add the corresponding threats to the ancestor
							for (threat : sg.threats) {
								tmpThreat = createThreat
								tmpThreat = copyThreat(tmpThreat, threat)
								tmpThreat.asset = tmpAsset
								oldSecurityConcept.threats.add(tmpThreat)
							}
						}
					}
				}
			}
		}

	}

	def dataExists(Component anc, Data data) {
		var foundData = anc.data.findFirst[dt|dt.name.equals(data.name)]
		return true
	}

	// Check whether a component has a specific asset
	def Data findData(
		Component component,
		Data data
	) {
		var foundData = component.data.findFirst(dt|dt?.equals(data))
		return foundData
	}

	def removeReferences(Component component) {
		component.ancestor = null
		component.subcomponents = null
	}

	def SecurityGoal createSecurityGoal() {
		return factory.createSecurityGoal
	}

	def Component createComponent() {
		return factory.createComponent
	}

	def Asset createAsset() {
		return factory.createAsset
	}

	def Threat createThreat() {
		return factory.createThreat
	}

	def Data createData() {
		return factory.createData
	}

	def Connection createConnection() {
		return factory.createConnection
	}

	def Component copyComponent(Component component) {
		var copy = createComponent
		return copy
	}

	def Data copyData(Data data) {
		var copy = createData
		copy.name = data.name
		return copy
	}

	def Asset copyAsset(Asset asset) {
		var copy = createAsset
		return copy
	}

	def SecurityGoal copySecurityGoal(SecurityGoal tmpSG, SecurityGoal securityGoal) {
		tmpSG.securityGoalClass = securityGoal.securityGoalClass
		tmpSG.damagePotential = securityGoal.damagePotential
		// TODO: Adjust security goal dependencies
		tmpSG.description = securityGoal.description
		tmpSG.securityGoalID = oldSecurityConcept.securityGoals.last.securityGoalID + 1
		tmpSG.description = securityGoal.description
		return tmpSG
	}

	def Connection copyConnection(Connection connection) {
		var copy = createConnection
		copy.connectionID = oldSecurityConcept.connections.last.connectionID + 1
		copy.name = connection.name
		copy.data = connection.data
		return copy
	}

	def Threat copyThreat(Threat tmpThreat, Threat threat) {
		tmpThreat.threatClass = threat.threatClass
		tmpThreat.attackPotential = threat.attackPotential
		tmpThreat.threatID = oldSecurityConcept.threats.last.threatID + 1
		return tmpThreat
	}

	def fixConnection(Component anc, Component child) {
		for (Connection con : child.connections) {
			if (con.source.equals(child)) {
				con.source = anc
				con.target = con.target
				con.data = con.data
			} else if (con.target.equals(child)) {
				con.source = con.source
				con.target = anc
				con.data = con.data
			}
		}
	}

	def checkConnections(List<SecurityGoal> securityGoals, Component comp) {
		for (Connection con : comp.connections) {
			if (!componentsOfInterest.contains(con.source) || !componentsOfInterest.contains(con.target)) {
				comp.connections.remove(con)
			} else {
				securityGoals.addAll(con.data.asset.securityGoals)
			}
		}
	}

	def Boolean securityGoalExists(Asset asset, SecurityGoal sg) {
		return getSecurityGoal(asset, sg) != null
	}

	def Boolean threatExists(Asset asset, Threat threat) {
		return getThreat(asset, threat) != null
	}

	def SecurityGoal getSecurityGoal(Asset asset, SecurityGoal sg) {
		var foundSG = asset.securityGoals.findFirst [ secgoal |
			secgoal.damagePotential.equals(sg.damagePotential) &&
				secgoal.securityGoalClass.equals(sg.securityGoalClass) &&
				secgoal.dependsOnSecurityGoal.equals(sg.dependsOnSecurityGoal) &&
				secgoal.asset?.name.equals(sg.asset?.name)
		]
		return foundSG
	}

	def Threat getThreat(Asset asset, Threat t) {
		var foundThreat = asset.threats.findFirst [ threat |
			threat.attackPotential.equals(t.attackPotential) && threat.threatClass.equals(t.threatClass)
		]
		return foundThreat
	}

	def Component findComponentByID(SecurityConcept securityConcept, int id) {
		return securityConcept.components.findFirst[componentID.equals(id)]
	}

	def Asset findAssetByID(SecurityConcept securityConcept, int id) {
		return securityConcept.assets.findFirst[assetID.equals(id)]
	}

	def SecurityGoal findSecurityGoalByID(SecurityConcept securityConcept, int id) {
		return securityConcept.securityGoals.findFirst[securityGoalID.equals(id)]
	}

	def Connection findConnectionByID(SecurityConcept securityConcept, int id) {
		return securityConcept.connections.findFirst[connectionID.equals(id)]
	}

	def Threat findThreatByID(SecurityConcept securityConcept, int id) {
		return securityConcept.threats.findFirst[threatID.equals(id)]
	}

	def List<SecurityGoal> securityGoalAggregation(List<SecurityGoal> securityGoalList) {
		var List<SecurityGoal> finalSecurityGoals = new ArrayList<SecurityGoal>
		var List<SecurityGoal> tmpList
		for (sg : securityGoalList) {
			tmpList = new ArrayList<SecurityGoal>
			tmpList.addAll(securityGoalList.filter [ secgoal |
				secgoal.asset?.name.equals(sg.asset.name) && secgoal.securityGoalClass.equals(sg.securityGoalClass)
			])
			tmpList = chooseMaxPotentialSG(tmpList)
			for (sec : tmpList) {
				if(!securityGoalInList(finalSecurityGoals, sec)) finalSecurityGoals.add(sec)
			}
		}
		return finalSecurityGoals
	}

	def List<Threat> threatAggregation(List<Threat> threatList) {
		var List<Threat> finalThreats = new ArrayList<Threat>
		var List<Threat> tmpList
		for (t : threatList) {
			tmpList = new ArrayList<Threat>
			tmpList.addAll(threatList.filter [ threat |
				threat.asset.name.equals(t.asset.name) && threat.threatClass.equals(t.threatClass)
			])
			tmpList = chooseMaxPotentialThreats(tmpList)
			for (threat : tmpList) {
				if(!threatInList(finalThreats, t)) finalThreats.add(threat)
			}
		}
		return finalThreats
	}

	def List<SecurityGoal> chooseMaxPotentialSG(List<SecurityGoal> securityGoalList) {
		var potential = securityGoalList.get(0).damagePotential.value
		var List<SecurityGoal> maxPotentials = new ArrayList<SecurityGoal>
		for (sg : securityGoalList) {
			if (sg.damagePotential.value > potential) {
				maxPotentials.clear
				potential = sg.damagePotential.value
				maxPotentials.add(sg)
			} else if (sg.damagePotential.value == potential) {
				maxPotentials.add(sg)
			}
		}
		return maxPotentials
	}

	def List<Threat> chooseMaxPotentialThreats(List<Threat> threatList) {
		var potential = threatList.get(0).attackPotential.value
		var List<Threat> maxPotentials = new ArrayList<Threat>
		for (t : threatList) {
			if (t.attackPotential.value > potential) {
				maxPotentials.clear
				potential = t.attackPotential.value
				maxPotentials.add(t)
			} else if (t.attackPotential.value == potential) {
				maxPotentials.add(t)
			}
		}
		return maxPotentials
	}

	def Boolean threatInList(List<Threat> threats, Threat t) {
		var foundThreat = threats.findFirst [ threat |
			threat.attackPotential.equals(t.attackPotential) && threat.asset.name.equals(t.asset.name) &&
				threat.threatClass.equals(t.threatClass)
		]

		return foundThreat != null
	}

	def Boolean securityGoalInList(List<SecurityGoal> securityGoals, SecurityGoal sg) {
		var foundSG = securityGoals.findFirst [ secgoal |
			secgoal.damagePotential.equals(sg.damagePotential) &&
				secgoal.securityGoalClass.equals(sg.securityGoalClass) && secgoal.asset.name.equals(sg.asset.name)
		]
		return foundSG != null
	}

	def List<Threat> getFullThreatList(Component component) {
		var List<Threat> fullList = new ArrayList<Threat>
		// Add the direct threats to the security goals
		var List<SecurityGoal> securityGoalList = oldSecurityConcept.components.findFirst [ c |
			c.componentID.equals(component.componentID)
		].asset.securityGoals
		for (sg : securityGoalList) {
			fullList.addAll(sg.threats)
		}
		// Add the threats addressing the data 
		var List<Data> dataList = oldSecurityConcept.components.
			findFirst[c|c.componentID.equals(component.componentID)].data
		for (data : dataList) {
			fullList.addAll(data.asset.threats)
		}
		// Add the remaining threats addressing the component
		var List<Threat> allThreats = oldSecurityConcept.components.findFirst [ c |
			c.componentID.equals(component.componentID)
		].asset.threats
		for (threat : allThreats) {
			if (threat.securityGoals.empty == true) {
				fullList.add(threat)
			}
		}
		return fullList
	}

	def List<SecurityGoal> getFullSecurityGoalList(Component component) {
		var List<SecurityGoal> fullList = new ArrayList<SecurityGoal>
		// Add the direct security goals
		fullList.addAll(
			oldSecurityConcept.components.findFirst[c|c.componentID.equals(component.componentID)].asset.securityGoals)
		// Add the security goals addressing the data
		var List<Data> dataList = oldSecurityConcept.components.
			findFirst[c|c.componentID.equals(component.componentID)].data
		for (data : dataList) {
			fullList.addAll(data.asset?.securityGoals)
		}
		return fullList
	}

	def writeToSecrutiyConcept(SecurityConcept newSecurityConcept) {
		val resourceSet = new ResourceSetImpl
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put(SCPackage.eNS_URI, SCPackage.eINSTANCE)
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
		val resource = resourceSet.createResource(URI.createURI("MetaModel/SecurityConceptTransformation.xmi"))
//		val resource = resourceSet.createResource(URI.createURI("MetaModel/transform.xmi"))
		val assets = newSecurityConcept.assets
		val sg = newSecurityConcept.securityGoals
		val comp = newSecurityConcept.components
		val threats = newSecurityConcept.threats
		val data = newSecurityConcept.data
		val connections = newSecurityConcept.connections

		resource.contents.addAll(assets)
		resource.contents.addAll(sg)
		resource.contents.addAll(comp)
		resource.contents.addAll(threats)
		resource.contents.addAll(data)
		resource.contents.addAll(connections)

		println("############################")
		print("DONE!!!")
		try {
			resource.save(Collections.EMPTY_MAP)
		} catch (IOException exception) {
			exception.printStackTrace
		}
	}
}
