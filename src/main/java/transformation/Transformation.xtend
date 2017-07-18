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
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import java.util.List
import java.util.Stack
import SC.SCFactory
import java.util.ArrayList
import SC.Connection
import SC.Asset
import org.eclipse.emf.ecore.resource.Resource
import SC.Threat
import SC.SecurityGoalClassType
import SC.Control

class Transformation {

	List<Component> visitedNodes
	List<Component> componentsOfInterest
	List<Component> transformedComponents
	Stack<Component> ancestorStack
	Stack<Component> childStack
	SCFactory factory
	SecurityConcept newSecurityConcept
	SecurityConcept oldSecurityConcept
	SecurityConcept initialConcept

	def static void main(String[] args) {
		new Transformation().generate("MetaModel/SecurityConcept_MT_example.xmi")
	}

	def generate(String file) {
		// Initialize the variables
		componentsOfInterest = new ArrayList<Component>
		transformedComponents = new ArrayList<Component>
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

	def dispatch generateCode(SecurityConcept securityConcept) {
		var Copier copier = new Copier
		initialConcept = copier.copy(securityConcept) as SecurityConcept
		copier.copyReferences
		oldSecurityConcept = securityConcept
		// Select the IDs of components that should be aggregated
		val int[] componentIDs = #[1, 4, 6]
		componentIDs.stream.filter(id|findComponentByID(securityConcept, id) !== null).forEach [ id |
			componentsOfInterest.add(findComponentByID(securityConcept, id))
		]

		// Create assets for each and every component
		generateAssets(oldSecurityConcept.components)

		for (Component comp : componentsOfInterest) {
			generateSG(comp)
		}

		// Generate output for now
		for (componentID : componentIDs) {

			println("COMPONENT " + componentID)

			oldSecurityConcept.components.findFirst[c|c.componentID.equals(componentID)].asset.securityGoals.forEach [ sg |
				println("SEC GOAL: " + securityGoalOutput(sg))
			]

			oldSecurityConcept.components.findFirst[c|c.componentID.equals(componentID)].asset.securityGoals.forEach [ sg |
				sg.threats.forEach[t|println("SEC GOAL THREAT: " + threatOutput(t))]
			]

			var componentData = oldSecurityConcept.components.findFirst[c|c.componentID.equals(componentID)].data

			componentData.forEach[d|d.asset.securityGoals.forEach[sg|println("DATA GOAL: " + securityGoalOutput(sg))]]

			componentData.forEach[d|d.asset.threats.forEach[t|println("DATA THREAT: " + threatOutput(t))]]

			oldSecurityConcept.components.findFirst[c|c.componentID.equals(componentID)].asset.threats.filter [ t |
				t.securityGoals.empty == true
			].forEach[threat|println("OTHER THREAT: " + threatOutput(threat))]
			println("#########")

			var List<SecurityGoal> sgl = getFullSecurityGoalList(oldSecurityConcept,
				findComponentByID(securityConcept, componentID))

			println("SG BEFORE AGGREGATION: " + sgl.size)
			var List<SecurityGoal> finalSecurityGoals = securityGoalAggregation(sgl)

			println("SG AFTER AGGREGATION: " + finalSecurityGoals.size)
			println("#########")

			getAggregatedSG(sgl, finalSecurityGoals)

			var List<Threat> tl = getFullThreatList(oldSecurityConcept, findComponentByID(securityConcept, componentID))

			println("THREATS BEFORE AGGREGATION: " + tl.size)

			var List<Threat> finalThreats = threatAggregation(tl)

			println("THREATS AFTER AGGREGATION: " + finalThreats.size)

			getAggregatedThreats(tl, finalThreats)
			println("#########")

			var List<Control> ctrls = getFullControlList(oldSecurityConcept,
				findComponentByID(securityConcept, componentID))

			println("CONTROLS BEFORE AGGREGATION: " + ctrls.size)

			var List<Control> finalControls = controlAggregation(ctrls)

			println("CONTROLS AFTER AGGREGATION: " + finalControls.size)

			getAggregatedControls(ctrls, finalControls)

			println("#########")
		}

		oldSecurityConcept.connections.forEach[con|println("CONNECTION: " + connectionOutput(con))]

		// Add the resulting elements and security attributes to the new security concept
		println("#########")
		println("VALIDATION: ")

		componentIDs.stream.filter(id|findComponentByID(oldSecurityConcept, id) !== null).forEach [ id |
			transformedComponents.add(findComponentByID(oldSecurityConcept, id))
		]

		newSecurityConcept = createSecurityConcept

		for (component : transformedComponents) {
			var tmpC = copier.copy(component) as Component
			var threats = copier.copyAll(component.asset.threats)
			copier.copyReferences
			newSecurityConcept.threats.addAll(threats as ArrayList<Threat>)
			newSecurityConcept.components.add(tmpC)
		}

		var value = securityOracleValidation(oldSecurityConcept, newSecurityConcept, componentsOfInterest)
		println(value)
	}

	def Boolean componentExistsInSC(SecurityConcept concept, Component component) {
		var foundComp = concept.components.findFirst[c|c.name.equals(component.name)]
		return foundComp != null
	}

	def deleteReferences(Component component) {
		component.ancestor = null
		component.subcomponents = null
	}

	def generateSG(Component component) {
		ancestorStack = new Stack<Component>
		childStack = new Stack<Component>
		if (!visitedNodes.contains(component)) {
			visitedNodes.add(component)
			if (component.asset === null) {
				var asset = factory.createAsset
				asset.name = "Asset_".concat(component.name)
				asset.components.add(component)
				asset.assetID = oldSecurityConcept.assets.last.assetID + 1
				// Add the new component and its asset to the transformed lists
				component.asset = asset
				oldSecurityConcept.assets.add(asset)
			}
		}
		findAncestors(component, component)
		findChildren(component, component)
		checkConnections(oldSecurityConcept.connections)
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

	def findAncestors(
		Component component,
		Component child
	) {
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
		var Control tmpControl
		// Check whether the ancestor is an asset 
		if (anc.asset != null) {
			for (sg : anc.asset.securityGoals) {
				// Only add if the security goal is not addressing data
				if (!sg.securityGoalClass.equals(SecurityGoalClassType.CONFIDENTIALITY)) {
					// Check whether the child is an asset already
					if (child.asset == null) {
						tmpAsset = createAsset
						tmpAsset.name = "Asset_".concat(child.name)
						tmpAsset.components.add(child)
						tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
						// Add the new component and its asset to the transformed lists
						child.asset = tmpAsset
						oldSecurityConcept.assets.add(tmpAsset)
					}
					// Create the security goal and assign the new values
					if (!securityGoalExists(child.asset, sg)) {
						tmpSG = createSecurityGoal
						tmpSG = copySecurityGoal(tmpSG, sg)
						tmpSG.name = child.name
						tmpSG.component = child
						tmpSG.asset = child.asset
						for (threat : sg.threats) {
							tmpThreat = createThreat
							tmpThreat = copyThreat(tmpThreat, threat)
							tmpThreat.asset = child.asset
							tmpThreat.description = child.name
							if(!threatExists(child.asset, tmpThreat)) oldSecurityConcept.threats.add(tmpThreat)
							tmpSG.threats.add(tmpThreat)
							// Create and adjust control
							for (control : threat.controls) {
								tmpControl = createControl
								tmpControl = copyControl(tmpControl, control)
								tmpControl.name = "CTRL + " + child.name
								tmpControl.asset.add(child.asset)
								tmpControl.threats.add(tmpThreat)
								oldSecurityConcept.controls.add(tmpControl)
							}
						}
						// Add the security goal to the old security concept
						if(!securityGoalExists(child.asset, tmpSG)) oldSecurityConcept.securityGoals.add(tmpSG)
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
		var EObject tmpComp
		var Threat tmpThreat
		var Control tmpControl
		var Copier copier = new Copier
		// Add the child component to the ancestor asset list
		if (!componentExists(anc.asset, child)) {
			tmpComp = copier.copy(child)
			anc.asset.components.add(tmpComp as Component)
			oldSecurityConcept.components.add(tmpComp as Component)
		}
		// Add all the components in child's asset to the ancestor's asset list
		if (child.asset?.components != null) {
			for (comp : child.asset.components) {
				if (!componentExists(anc.asset, comp)) {
					tmpComp = copier.copy(comp)
					anc.asset.components.add(tmpComp as Component)
					oldSecurityConcept.components.add(tmpComp as Component)
				}
			}
		}
		// Add threats that address the subcomponent directly and create the corresponding threats
		if (child.asset == null) {
			tmpAsset = createAsset
			tmpAsset.name = "Asset_".concat(child.name)
			tmpAsset.components.add(child)
			tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
			// Add the new component and its asset to the transformed lists
			child.asset = tmpAsset
			oldSecurityConcept.assets.add(tmpAsset)
		}
		if (child != anc) {
			for (threat : child.asset.threats) {
				if (!threatExists(anc.asset, threat)) {
					tmpThreat = createThreat
					tmpThreat = copyThreat(tmpThreat, threat)
					tmpThreat.description = anc.name
					tmpThreat.asset = anc.asset
					tmpThreat.asset.components.addAll(anc.asset.components)
					oldSecurityConcept.threats.add(tmpThreat)
					// Create and adjust control
					for (control : threat.controls) {
						tmpControl = createControl
						tmpControl = copyControl(tmpControl, control)
						tmpControl.name = "CTRL " + anc.name
						tmpControl.asset.add(anc.asset)
						tmpControl.threats.add(tmpThreat)
						oldSecurityConcept.controls.add(tmpControl)
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
							tmpControl.name = "CTRL " + anc.name
							tmpThreat.asset = tmpAsset
							oldSecurityConcept.threats.add(tmpThreat)
							// Create and adjust control
							for (control : threat.controls) {
								tmpControl = createControl
								tmpControl = copyControl(tmpControl, control)
								tmpControl.name = "CTRL " + anc.name
								tmpControl.asset.add(anc.asset)
								tmpControl.threats.add(tmpThreat)
								oldSecurityConcept.controls.add(tmpControl)
							}
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
								// Create and adjust control
								for (control : threat.controls) {
									tmpControl = createControl
									tmpControl = copyControl(tmpControl, control)
									tmpControl.asset.add(anc.asset)
									tmpControl.threats.add(tmpThreat)
									oldSecurityConcept.controls.add(tmpControl)
								}
							}
						}
					}
				}
			}
		}

	}

	def String securityGoalOutput(SecurityGoal sg) {
		return "CLASS: " + sg.securityGoalClass + " ASSET: " + sg.asset.name + " DMG: " + sg.damagePotential
	}

	def String threatOutput(Threat threat) {
		return "CLASS: " + threat.threatClass + " ASSET: " + threat.asset.name + " ATTACK: " + threat.attackPotential
	}

	def String controlOutput(Control control) {
		return "NAME: " + control.name + " ATTACK: " + control.attackPotential
	}

	def String connectionOutput(Connection con) {
		return "SOURCE: " + con.source.name + " TARGET: " + con.target.name + " DATA: " + con.data.name
	}

	def String dataOutput(Data data) {
		return "NAME: " + data.name
	}

	def Boolean dataExists(SecurityConcept securityConcept, Data data) {
		var foundData = securityConcept.data.findFirst[dt|dt.name.equals(data.name)]
		return foundData != null
	}

// Check whether a component has a specific asset
	def Data findData(
		Component component,
		Data data
	) {
		var foundData = component.data.findFirst(dt|dt?.equals(data))
		return foundData
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

	def Control createControl() {
		return factory.createControl
	}

	def SecurityConcept createSecurityConcept() {
		return factory.createSecurityConcept
	}

	def Data copyData(Data data) {
		var copy = createData
		copy.name = data.name
		return copy
	}

	def Control copyControl(Control tmpControl, Control control) {
		tmpControl.attackPotential = control.attackPotential
		tmpControl.controlID = oldSecurityConcept.controls.last.controlID + 1
		return tmpControl
	}

	def Asset copyAsset(Asset asset) {
		var copy = createAsset
		return copy
	}

	def SecurityGoal copySecurityGoal(SecurityGoal tmpSG, SecurityGoal securityGoal) {
		tmpSG.securityGoalClass = securityGoal.securityGoalClass
		tmpSG.damagePotential = securityGoal.damagePotential
		tmpSG.dependsOnSecurityGoals.addAll(securityGoal.dependsOnSecurityGoals)
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

	def checkConnections(List<Connection> connections) {
		for (con : connections) {
			con.name = con.source.name.concat("_").concat(con.target.name).concat(" ").concat(con.data.name)
		}
	}

	def Boolean securityGoalExists(Asset asset, SecurityGoal sg) {
		return getSecurityGoal(asset, sg) != null
	}

	def Boolean threatExists(Asset asset, Threat threat) {
		return getThreat(asset, threat) != null
	}

	def SecurityGoal getSecurityGoal(Asset asset, SecurityGoal sg) {
		var foundSG = asset.securityGoals.findFirst [ securityGoal |
			securityGoal.damagePotential.equals(sg.damagePotential) &&
				securityGoal.securityGoalClass.equals(sg.securityGoalClass) &&
				securityGoal.dependsOnSecurityGoals.equals(sg.dependsOnSecurityGoals)
		]
		return foundSG
	}

	def Threat getThreat(Asset asset, Threat t) {
		var foundThreat = asset.threats.findFirst [ threat |
			threat.attackPotential.equals(t.attackPotential) && threat.threatClass.equals(t.threatClass)
		]
		return foundThreat
	}

	def generateAssets(List<Component> initialComponents) {
		for (comp : initialComponents) {
			if (comp.asset == null) {
				var tmpAsset = createAsset
				tmpAsset.name = comp.name
				tmpAsset.components.add(comp)
				oldSecurityConcept.assets.add(tmpAsset)
			}
		}
	}

	def Boolean componentExists(Asset asset, Component component) {
		return getComponent(asset, component) != null
	}

	def Component getComponent(Asset asset, Component c) {
		var foundComponent = asset.components.findFirst [ component |
			component.componentID.equals(c.componentID) && component.name.equals(c.name)
		]
		return foundComponent
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
		var List<SecurityGoal> tmpList = new ArrayList<SecurityGoal>
		for (sg : securityGoalList) {
			tmpList = new ArrayList<SecurityGoal>
			tmpList.addAll(securityGoalList.filter [ secgoal |
				secgoal.asset?.name.equals(sg.asset.name) && secgoal.securityGoalClass.equals(sg.securityGoalClass)
			])

			var List<SecurityGoal> maxPot = chooseMaxPotentialSG(tmpList)
			// Adjust controls
			if (maxPot.size > 1) {
				var aggSG = createSecurityGoal
				getAggSG(maxPot, aggSG)
				adjustDependenciesSG(tmpList, aggSG)
				adjustSGReferences(tmpList, aggSG)
			} else {
				adjustDependenciesSG(tmpList, maxPot.get(0))
				adjustSGReferences(tmpList, maxPot.get(0))
			}
			for (sec : maxPot) {
				if(!securityGoalInList(finalSecurityGoals, sg)) finalSecurityGoals.add(sec)
			}
		}
		return finalSecurityGoals
	}
	
	def getAggSG(List<SecurityGoal> tmpList, SecurityGoal sg){
		sg.name = "AGGREGATED"
		for (secgoal : tmpList){
			for (threat : secgoal.threats){
				if (!threatExists(sg.asset, threat)) sg.threats.add(threat)
				for (control : threat.controls){
					if (!controlExists(sg.asset, control)) sg.asset.controls.add(control)
				}
			}
			oldSecurityConcept.securityGoals.remove(secgoal)
		}
	}

	def List<Threat> threatAggregation(List<Threat> threatList) {
		var List<Threat> finalThreats = new ArrayList<Threat>
		var List<Threat> tmpList
		for (t : threatList) {
			tmpList = new ArrayList<Threat>
			tmpList.addAll(threatList.filter [ threat |
				threat.asset.name.equals(t.asset.name) && threat.threatClass.equals(t.threatClass)
			])
			var List<Threat> maxPot = chooseMaxPotentialThreats(tmpList)
			// Adjust controls
			if (maxPot.size > 1) {
				var aggThreat = createThreat
				getAggThreatControls(aggThreat, maxPot)
				adjustThreatReferences(tmpList, aggThreat)
			} else {
				adjustThreatReferences(tmpList, maxPot.get(0))
			}
			for (threat : maxPot) {
				if(!threatInList(finalThreats, threat)) finalThreats.add(threat)
			}
		}
		return finalThreats
	}

	def getAggThreatControls(Threat tmpThreat, List<Threat> threatList) {
		for (t : threatList) {
			for (c : t.controls) {
				if(!controlExists(tmpThreat.asset, c)) tmpThreat.controls.add(c)
			}
		}
	}

	def List<Control> controlAggregation(List<Control> controlList) {
		var List<Control> finalControls = new ArrayList<Control>
		var List<Control> tmpList
		for (ctrl : controlList) {
			tmpList = new ArrayList<Control>
			tmpList.addAll(controlList.filter [ c |
				c.threats.equals(ctrl.threats)
			])
			tmpList = chooseMinPotentialControls(tmpList)
			for (control : tmpList) {
				if(!controlInList(finalControls, control)) finalControls.add(control)
			}
		}
		return finalControls
	}

	def List<Control> chooseMinPotentialControls(List<Control> controls) {
		var potential = controls.get(0).attackPotential.value
		var List<Control> minPotentials = new ArrayList<Control>
		for (c : controls) {
			if (c.attackPotential.value < potential) {
				minPotentials.clear
				potential = c.attackPotential.value
				minPotentials.add(c)
			} else if (c.attackPotential.value == potential && !controlInList(minPotentials, c)) {
				minPotentials.add(c)
			}
		}
		return minPotentials
	}

	def Boolean controlInList(List<Control> controls, Control ctrl) {
		var foundControl = controls.findFirst [ c |
			c.threats.equals(ctrl.threats) && c.attackPotential.equals(ctrl.attackPotential)
		]
		return foundControl != null
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
			} else if (t.attackPotential.value == potential && !threatInList(maxPotentials, t)) {
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

	def List<Threat> getFullThreatList(SecurityConcept securityConcept, Component component) {
		var List<Threat> fullList = new ArrayList<Threat>
		// Add the direct threats to the security goals
		var tmpC = securityConcept.components.findFirst [ c |
			c.componentID.equals(component.componentID)
		]
		var List<SecurityGoal> securityGoalList = new ArrayList<SecurityGoal>
		if (tmpC.asset != null) {
			securityGoalList = tmpC.asset.securityGoals
		}
		for (sg : securityGoalList) {
			fullList.addAll(sg.threats)
		}
		// Add the threats addressing the data 
		var List<Data> dataList = securityConcept.components.findFirst[c|c.componentID.equals(component.componentID)].
			data
		for (data : dataList) {
			fullList.addAll(data.asset.threats)
		}
		// Add the remaining threats addressing the component
		var List<Threat> allThreats = new ArrayList<Threat>
		if (tmpC.asset != null) {
			allThreats.addAll(tmpC.asset.threats)
		}
		for (threat : allThreats) {
			if (threat.securityGoals.empty == true) {
				fullList.add(threat)
			}
		}
		return fullList
	}

	def adjustSGReferences(List<SecurityGoal> oldSGs, SecurityGoal aggregatedSG) {
		for (sg : oldSGs) {
			for (threat : sg.threats) {
				if(!threatExists(aggregatedSG.asset, threat)) aggregatedSG.threats.add(threat)
				for (control : threat.controls) {
					if(!controlExists(aggregatedSG.asset, control)) aggregatedSG.asset.controls.add(control)
				}
			}
		}
	}

	def adjustDependenciesSG(List<SecurityGoal> oldSGs, SecurityGoal aggregatedSG) {
		for (sg : oldSecurityConcept.securityGoals) {
			for (oldSG : oldSGs) {
				if (sg.dependsOnSecurityGoals.contains(oldSG)) {
					for (threat : oldSG.threats) {
						if(!threatExists(aggregatedSG.asset, threat)) aggregatedSG.threats.add(threat)
						for (control : threat.controls) {
							if(!controlExists(aggregatedSG.asset, control)) aggregatedSG.asset.controls.add(control)
						}
					}
					sg.dependsOnSecurityGoals.add(aggregatedSG)
					sg.dependsOnSecurityGoals.remove(oldSG)
				}
			}
		}
	}

	def Boolean controlExists(Asset asset, Control control) {
		var foundControl = asset.controls.findFirst [ ctrl |
			ctrl.attackPotential.equals(control.attackPotential) && ctrl.threats.equals(control.threats)
		]
		return foundControl != null
	}

	def adjustThreatReferences(
		List<Threat> oldThreats,
		Threat aggregatedThreat
	) {
		for (t : oldThreats) {
			for (c : t.controls) {
				if (!controlExists(aggregatedThreat.asset, c)) {
					aggregatedThreat.controls.add(c)
				}
			}
			oldSecurityConcept.threats.remove(t)
		}
	}

	def List<SecurityGoal> getFullSecurityGoalList(SecurityConcept securityConcept, Component component) {
		var List<SecurityGoal> fullList = new ArrayList<SecurityGoal>
		// Add the direct security goals
		var tmpComp = securityConcept.components.findFirst[c|c.componentID.equals(component.componentID)]
		if (tmpComp.asset != null) {
			fullList.addAll(tmpComp.asset.securityGoals)
		}
		// Add the security goals addressing the data
		var List<Data> dataList = securityConcept.components.findFirst [ c |
			c.componentID.equals(component.componentID)
		].data
		for (data : dataList) {
			fullList.addAll(data.asset?.securityGoals)
		}
		return fullList
	}

	def List<Control> getFullControlList(SecurityConcept securityConcept, Component component) {
		var List<Control> fullList = new ArrayList<Control>
		// Add the direct controls
		var tmpComp = securityConcept.components.findFirst[c|c.componentID.equals(component.componentID)]
		if (tmpComp.asset != null) {
			for (threat : tmpComp.asset.threats) {
				fullList.addAll(threat.controls)
			}
		}
		// Add the controls addressing the data
		var List<Data> dataList = securityConcept.components.findFirst [ c |
			c.componentID.equals(component.componentID)
		].data
		for (data : dataList) {
			if (data.asset != null) {
				for (threat : data.asset.threats) {
					fullList.addAll(threat.controls)
				}
			}
		}
		return fullList
	}

	def Boolean securityOracleValidation(SecurityConcept initialConcept, SecurityConcept newSecurityConcept,
		List<Component> components) {
		var Boolean valid = true
		for (comp : components) {
			var oldSGList = getFullSecurityGoalList(initialConcept, comp)
			var newSGList = getFullSecurityGoalList(newSecurityConcept, comp)
			var oldThreatList = getFullThreatList(initialConcept, comp)
			var newThreatList = getFullThreatList(newSecurityConcept, comp)
			// Check whether all old security goals are in the new concept
			for (sg : oldSGList) {
				if (!securityGoalInList(newSGList, sg)) {
					valid = false
					return valid
				}
			}
			// Check whether all the old threats are in the new concept
			for (threat : oldThreatList) {
				if (!threatInList(newThreatList, threat)) {
					valid = false
					return valid
				}
			}
			return valid
		}
	}

	def getAggregatedThreats(List<Threat> initialList, List<Threat> newList) {
		for (threat : initialList) {
			if (!newList.contains(threat)) {
				println("AGGREGATED THREAT: " + threatOutput(threat))
			}
		}
	}

	def getAggregatedSG(List<SecurityGoal> initialList, List<SecurityGoal> newList) {
		for (sg : initialList) {
			if (!newList.contains(sg)) {
				println("AGGREGATED SG: " + securityGoalOutput(sg))
			}
		}
	}

	def getAggregatedControls(List<Control> initialList, List<Control> newList) {
		for (c : initialList) {
			if (!newList.contains(c)) {
				println("AGGREGATED CONTROL: " + controlOutput(c))
			}
		}
	}
}
