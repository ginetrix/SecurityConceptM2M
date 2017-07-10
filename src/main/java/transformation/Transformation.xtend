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
		new Transformation().generate("MetaModel/minitest.xmi")
//		new Transformation().generate("MetaModel/SecurityConcept_MT_example.xmi")
	}

	def generate(String file) {
		// Initialize the variables
		componentsOfInterest = new ArrayList<Component>()
		visitedNodes = new ArrayList<Component>
		factory = SCFactory.eINSTANCE
		oldSecurityConcept = factory.createSecurityConcept
		newSecurityConcept = factory.createSecurityConcept
		transformedComponents = new ArrayList<Component>
		transformedAssets = new ArrayList<Asset>
		transformedSecurityGoals = new ArrayList<SecurityGoal>
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
		val int[] componentIDs = #[2,3]
		componentIDs.stream.filter(id|findComponentByID(securityConcept, id) !== null).forEach [ id |
			componentsOfInterest.add(findComponentByID(securityConcept, id))
		]
		
		oldSecurityConcept.securityGoals.forEach[sg|println(sg.toString)]
		oldSecurityConcept.connection.forEach[con|println(con.source.toString + con.target.toString)]

		for (Component comp : componentsOfInterest) {
			generateSG(comp)
		}
		
		oldSecurityConcept.connection.forEach[con|println(con.source.toString + con.target.toString)]
		
//		oldSecurityConcept.assets.findFirst[a|a.component.componentID.equals(2)].securitygoals.forEach[sg|println(sg.toString)]
	
		// Add the resulting elements and security attributes to the new security concept
		newSecurityConcept.components.addAll(transformedComponents)
		newSecurityConcept.securityGoals.addAll(transformedSecurityGoals)
		newSecurityConcept.assets.addAll(transformedAssets)
//		newSecurityConcept.threats.addAll(transformedThreats)
		writeToSecrutiyConcept(newSecurityConcept)
	}

	def generateSG(Component component) {
		transformedSecurityGoals = new ArrayList<SecurityGoal>
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
			} else {
				transformedComponents.add(component)
				var asset = factory.createAsset
				asset = component.asset
			}
			// Check connections and add their security goals
			for (Connection con : component.connections) {
				transformedSecurityGoals.addAll(con.data.asset.securitygoals)
			}
		}
		findAncestors(component, component)
		findChildren(component, component)
//		checkConnections(securityGoals, component)
	}

	def dispatch generateCode(EObject object) {
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
			addSgAtoC(comp, component)
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
			addSgCtoA(comp, component)
		}
	}

// Security goals ancestor to child
	def addSgAtoC(Component anc, Component child) {
		var tmpAsset = createAsset
		var tmpSG = createSecurityGoal
		// Check whether the ancestor is an asset 
		if (anc.asset != null) {
			for (sg : anc.asset.securitygoals) {
				// Check whether the child is an asset already
				if (child.asset != null) {
					// Create the security goal and assign the new values
					tmpSG = copySecurityGoal(sg)
					tmpSG.name = child.name
					tmpSG.component = child
					tmpSG.asset = child.asset
					// Add the security goal to the old security concept
					oldSecurityConcept.securityGoals.add(tmpSG)
				} else {
					// Create the corresponding asset if not
					tmpAsset = createAsset
					tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
					tmpAsset.component = child
					tmpAsset.name = child.name
					// Create the new security goal for the new asset
					tmpSG = copySecurityGoal(sg)
					tmpSG.component = child
					tmpSG.asset = tmpAsset
					tmpSG.name = child.name
					// Add the goal to the list of security goals of the asset
					tmpAsset.securitygoals.add(tmpSG)
					// Add the security goal and the asset to the old security concept
					oldSecurityConcept.assets.add(tmpAsset)
					oldSecurityConcept.securityGoals.add(tmpSG)
				}
			}
		}
		// Iterate through all the data of the ancestor and check if it exists in the layer below
		for (data : anc.data) {
			for (sg : data.asset?.securitygoals) {
				if (child.data.contains(data)) {
					var childData = findData(child, data)
					if (childData.asset != null) {
						// Add the security goals to the asset
						tmpSG = copySecurityGoal(sg)
						tmpSG.component = child
						tmpSG.asset = childData.asset
						tmpSG.name = childData.name
						oldSecurityConcept.securityGoals.add(tmpSG)
					} else {
						// Create the corresponding asset
						tmpAsset = createAsset
						tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
						tmpAsset.data = childData
						tmpAsset.name = childData.name
						// Create the new security goal for the new asset
						tmpSG = copySecurityGoal(sg)
						tmpSG.component = child
						tmpSG.asset = childData.asset
						tmpSG.name = childData.name
						// Add the goal to the list of security goals of the asset
						tmpAsset.securitygoals.add(tmpSG)
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
		var tmpAsset = createAsset
		var tmpSG = createSecurityGoal
		// Check whether the sub-component is an asset
		if (child.asset != null) {
			for (sg : child.asset.securitygoals) {
				// Check whether the ancestor is an asset itself already
				if (anc.asset != null) {
					// Create the security goal and assign the new values
					tmpSG = copySecurityGoal(sg)
					tmpSG.name = anc.name
					tmpSG.component = anc
					tmpSG.asset = anc.asset
					// Add the security goal to the old security concept
					oldSecurityConcept.securityGoals.add(tmpSG)
				} else {
					// Create the corresponding asset if not
					tmpAsset = createAsset
					tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
					tmpAsset.component = anc
					tmpAsset.name = anc.name
					// Create the new security goal for the new asset
					tmpSG = copySecurityGoal(sg)
					tmpSG.component = anc
					tmpSG.asset = tmpAsset
					tmpSG.name = anc.name
					// Add the goal to the list of security goals of the asset
					tmpAsset.securitygoals.add(tmpSG)
					// Add the security goal and the asset to the old security concept
					oldSecurityConcept.assets.add(tmpAsset)
					oldSecurityConcept.securityGoals.add(tmpSG)
				}
			}
		}
		// Check the data and add the corresponding security goals accordingly
		for (data : child.data) {
			for (sg : data.asset?.securitygoals) {
				if (anc.data.contains(data)) {
					var ancData = findData(anc, data)
					if (ancData.asset != null) {
						// Add the security goals to the asset
						tmpSG = copySecurityGoal(sg)
						tmpSG.component = anc
						tmpSG.asset = ancData.asset
						tmpSG.name = ancData.name						
						oldSecurityConcept.securityGoals.add(tmpSG)
					} else {
						// Create the corresponding asset
						tmpAsset = createAsset
						tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
						tmpAsset.data = ancData
						tmpAsset.name = ancData.name
						// Create the new security goal for the new asset
						tmpSG = copySecurityGoal(sg)
						tmpSG.component = anc
						tmpSG.asset = ancData.asset
						tmpSG.name = ancData.name
						// Add the goal to the list of security goals of the asset
						tmpAsset.securitygoals.add(tmpSG)
						// Add the security goal and the asset to the old security concept
						oldSecurityConcept.assets.add(tmpAsset)
						oldSecurityConcept.securityGoals.add(tmpSG)
					}
				} else {
					if (!anc.data.contains(data)) {
						// Create the data and add the security goals of the child element
						var newData = copyData(data)
						// Create the corresponding asset
						tmpAsset = createAsset
						tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
						tmpAsset.data = newData
						tmpAsset.name = newData.name
						// Create the new security goal for the new asset
						tmpSG = copySecurityGoal(sg)
						tmpSG.component = anc
						tmpSG.asset = newData.asset
						tmpSG.name = newData.name
						oldSecurityConcept.data.add(newData)
						oldSecurityConcept.assets.add(tmpAsset)						
						oldSecurityConcept.securityGoals.add(tmpSG)
					}
				}
			}
		}
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

	def Data createData() {
		return factory.createData
	}
	
	def Connection createConnection(){
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

	def SecurityGoal copySecurityGoal(SecurityGoal securityGoal) {
		var copy = createSecurityGoal
		copy.securityGoalClass = securityGoal.securityGoalClass
		copy.damagePotential = securityGoal.damagePotential
		// TODO: Adjust security goal dependencies
		copy.description = securityGoal.description
		copy.securityGoalID = oldSecurityConcept.securityGoals.last.securityGoalID + 1
		copy.description = securityGoal.description
		return copy
	}
	
	def Connection copyConnection(Connection connection){
		var copy = createConnection
		copy.connectionID = oldSecurityConcept.connection.last.connectionID + 1
		copy.name = connection.name
		copy.data = connection.data
		return copy
	}

	def fixConnection(Component anc, Component child) {
		var tmpCon = createConnection
		for (Connection con : child.connections) {
			tmpCon = copyConnection(con)
			if (con.source.equals(child)) {
				tmpCon.source = anc
				tmpCon.target = con.target
			} else if (con.target.equals(child)) {
				tmpCon.source = con.source
				tmpCon.target = anc
			}
			// Add the connection to the old security concept
			oldSecurityConcept.connection.add(tmpCon)
		}
	}

	def checkConnections(List<SecurityGoal> securityGoals, Component comp) {
		for (Connection con : comp.connections) {
			if (!componentsOfInterest.contains(con.source) || !componentsOfInterest.contains(con.target)) {
				comp.connections.remove(con)
			} else {
				securityGoals.addAll(con.data.asset.securitygoals)
			}
		}
	}

	def filterDuplicateSecurityGoals(Component component) {
//		var tmpList = new HashSet<SecurityGoal>
		for (sg : component.securitygoals) {
		}
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
		return securityConcept.connection.findFirst[connectionID.equals(id)]
	}

	def Threat findThreatByID(SecurityConcept securityConcept, int id) {
		return securityConcept.threats.findFirst[threatID.equals(id)]
	}

	def writeToSecrutiyConcept(SecurityConcept newSecurityConcept) {
		val resourceSet = new ResourceSetImpl
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put(SCPackage.eNS_URI, SCPackage.eINSTANCE)
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
//		val resource = resourceSet.createResource(URI.createURI("MetaModel/SecurityConceptTransformation.xmi"))
		val resource = resourceSet.createResource(URI.createURI("MetaModel/transform.xmi"))

		val assets = newSecurityConcept.assets
		val sg = newSecurityConcept.securityGoals
		val comp = newSecurityConcept.components
		val threats = newSecurityConcept.threats

		resource.contents.addAll(assets)
		resource.contents.addAll(sg)
		resource.contents.addAll(comp)
		resource.contents.addAll(threats)
		println("ASSET SIZE: " + assets.size)
		println("SG SIZE: " + sg.size)
		println("COMP SIZE: " + comp.size)
		println("THREAT SIZE: " + threats.size)
		println("############################")
		print("DONE!!!")
		try {
			resource.save(Collections.EMPTY_MAP)
		} catch (IOException exception) {
			exception.printStackTrace
		}
	}
}
