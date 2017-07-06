package transformation

import SC.SecurityConcept
import SC.SCPackage
import SC.Component
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
		newSecurityConcept = factory.createSecurityConcept
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
		val int[] componentIDs = #[1]
		componentIDs.stream.filter(id|findComponentByID(securityConcept, id) !== null).forEach [ id |
			componentsOfInterest.add(findComponentByID(securityConcept, id))
		]
		for (Component comp : componentsOfInterest) {
			generateSG(comp)
		}
		writeToSecrutiyConcept(newSecurityConcept, securityGoals)
	}

	def generateSG(Component component) {
		transformedSecurityGoals = new ArrayList<SecurityGoal>
		ancestorStack = new Stack<Component>
		childStack = new Stack<Component>
		if (!visitedNodes.contains(component)) {
			visitedNodes.add(component)
			// Add the new component and its asset to the transformed lists
			transformedComponents.add(component)
			if (component.asset === null) {
				val asset = factory.createAsset
				asset.name = "Asset_".concat(component.name)
				asset.component = component
				asset.assetID = oldSecurityConcept.assets.last.assetID + 1
				transformedAssets.add(asset)
			} else {
				transformedAssets.add(component.asset)
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
		// Add the respective security goals to the new security concept
		
	}

	def dispatch generateCode(EObject object) {
		print("bla")
	}

	def findAncestors(Component component, Component child) {
		if (component.ancestor !== null) {
			if (componentsOfInterest.contains(component.ancestor)) {
				ancestorStack.add(component.ancestor)
				// Pass the current component as the child element
				findAncestors(component.ancestor, component)
			}
			addSgAtoC(component.ancestor, component)
			findAncestors(component.ancestor, component)
		}
		for (Component comp : ancestorStack) {
			generateSG(component)
			addSgAtoC(comp, component)
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
				addSgCtoA(subcomp, component)
				fixConnection(component, subcomp)
				findChildren(subcomp, component)
			}
		}
	}

	def addSgAtoC(Component anc, Component child) {
		val assets = getAssets(anc)
		for (Asset asset : assets) {
			// Transfer the security goals that address the ancestor directly
			if (asset.component != null) {
				if (asset.component.componentID == anc.componentID) {
					for (sg : asset.securitygoals) {
						// There must already be an asset defined for the child component
						var newSG = sg
						newSG.component = child
						newSG.asset = child.asset
//						child.asset.securitygoals.add(sg)
						transformedSecurityGoals.add(newSG)
					}
				} else if (child.assets.contains(asset)) {
					for (sg : asset.securitygoals) {
						var newSG = sg
						newSG.component = child
//						child.asset.securitygoals.add(sg)
						transformedSecurityGoals.add(newSG)
					}
				}
			}
		}
	}

	def addSgCtoA(Component child, Component anc) {
		for (asset : child.assets) {
			for (sg : asset.securitygoals) {
				if (!anc.assets.contains(asset)) {
					// Check whether the sub-component is an asset
					if (asset.component.equals(child)) {
						var newSG = sg
						newSG.asset = anc.asset 
						newSG.component = anc
					} else {
						// If not, copy the data assets that do not exist in the abstraction layer above
						copyAsset(asset, anc)
					}
				} else if (!sg.securityGoalClass.equals(SecurityGoalClassType.INTEGRITY)) {
					var newSG = sg
					newSG.component = anc
//					anc.asset.securitygoals.add(sg)
					transformedSecurityGoals.add(newSG)
				}
			}
		}
	}
	
	def SecurityGoal createSecurityGoal(){
		return factory.createSecurityGoal
	}

	def copyAsset(Asset asset, Component anc) {
		val newAsset = asset
		newAsset.component = anc
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
		val component = securityConcept.components.findFirst[componentID.equals(id)]
		return component
	}

	def writeToSecrutiyConcept(SecurityConcept newSecurityConcept, List<SecurityGoal> securityGoals) {
		val resourceSet = new ResourceSetImpl
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put(SCPackage.eNS_URI, SCPackage.eINSTANCE)
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
//		val resource = resourceSet.createResource(URI.createURI("MetaModel/SecurityConceptTransformation.xmi"))
		val resource = resourceSet.createResource(URI.createURI("MetaModel/transform.xmi"))

		val comp = newSecurityConcept.components
		val asset = newSecurityConcept.assets
		val sg = newSecurityConcept.securityGoals
		print(newSecurityConcept.securityGoals.toString)
		resource.contents.addAll(comp)
		resource.contents.addAll(asset)
		resource.contents.addAll(sg)
		try {
			resource.save(Collections.EMPTY_MAP)
		} catch (IOException exception) {
			exception.printStackTrace
		}
	}
}
