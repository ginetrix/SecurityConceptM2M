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
import SC.SecurityGoalClassType
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

	def dispatch generateCode(SecurityConcept securityConcept) {
		oldSecurityConcept = securityConcept
		// Select the IDs of components that should be aggregated
		val int[] componentIDs = #[1, 2]
		componentIDs.stream.filter(id|findComponentByID(securityConcept, id) !== null).forEach [ id |
			componentsOfInterest.add(findComponentByID(securityConcept, id))
		]
		for (Component comp : componentsOfInterest) {
			generateSG(comp)
		}
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
				// Remove the ancestor/child references
				removeReferences(component)
				transformedComponents.add(component)
				transformedAssets.add(asset)
			} else {
				// Remove the ancestor/child references
				removeReferences(component)
				transformedComponents.add(component)
				var asset = factory.createAsset
				asset = component.asset
				transformedAssets.add(asset)
			}
			for (SecurityGoal securityGoal : component.asset.securitygoals) {
				transformedSecurityGoals.add(securityGoal)
			}
			// Check connections and add their security goals
			for (Connection con : component.connections) {
				transformedSecurityGoals.addAll(con.data.asset.securitygoals)
			}
		}
		findAncestors(component, component)
		findChildren(component, component)
		checkConnections(securityGoals, component)
	}

	def dispatch generateCode(EObject object) {
	}

	def findAncestors(Component component, Component child) {
		if (component.ancestor !== null) {
			// Check whether the ancestor must be processed
			if (componentsOfInterest.contains(component.ancestor)) {
				ancestorStack.add(component.ancestor)
				// Pass the current component as the child element
				findAncestors(component.ancestor, component)
			}
			findAncestors(component.ancestor, component)
			addSgAtoC(component.ancestor, component)
		}
		for (Component comp : ancestorStack) {
			generateSG(component)
			addSgAtoC(comp, component)
			ancestorStack.pop
		}
	}

	def findChildren(Component component, Component anc) {
		if (component.subcomponents !== null) {
			for (subcomp : component.subcomponents) {
				if (componentsOfInterest.contains(subcomp)) {
					childStack.add(subcomp)
					findChildren(subcomp, component)
					fixConnection(component, subcomp)
				}
				fixConnection(component, subcomp)
				findChildren(subcomp, component)
				addSgCtoA(subcomp, component)
			}
		}
//		for (comp : childStack){
//			addSgCtoA(comp, component)
//			childStack.pop
//		}
	}

// Security goals ancestor to child
	def addSgAtoC(Component anc, Component child) {
		val assets = getAssets(anc)
		for (Asset asset : assets) {
			// Transfer the security goals that address the ancestor directly
			if (asset.component != null) {
				if (asset.component.componentID.equals(anc.componentID)) {
					for (sg : asset.securitygoals) {
						// There must already be an asset defined for the child component
					}
				} else if (child.assets.contains(asset)) {
					for (sg : asset.securitygoals) {
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
					if (!ancData.asset.equals(null)) {
						// Add the security goals to the asset
						tmpSG = copySecurityGoal(sg)
						tmpSG.component = anc
						tmpSG.asset = ancData.asset
						tmpSG.name = data.name
						oldSecurityConcept.securityGoals.add(tmpSG)
					} else {
						// Create the corresponding asset
						tmpAsset = createAsset
						tmpAsset.assetID = oldSecurityConcept.assets.last.assetID + 1
						tmpAsset.data = data
						tmpAsset.name = data.name
						// Create the new security goal for the new asset
						tmpSG = copySecurityGoal(sg)
						tmpSG.component = anc
						tmpSG.asset = ancData.asset
						tmpSG.name = data.name
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
		return copy
	}

	def ArrayList<Asset> getAssets(Component component) {
		var assetList = new ArrayList<Asset>
		if (component.asset != null) {
			assetList.add(component.asset)
		}
		for (connection : component.connections) {
			assetList.add(connection.data.asset)
		}
		return assetList
	}

	def fixConnection(Component child, Component anc) {
		for (Connection con : child.connections) {
			if (con.source.equals(child)) {
				con.source = anc
			} else if (con.target.equals(child)) {
				con.target = anc
			}
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
