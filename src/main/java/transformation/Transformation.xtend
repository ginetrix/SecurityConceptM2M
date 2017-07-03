package transformation

import SC.SecurityConcept
import SC.SCPackage
import SC.Component
import SC.SecurityGoal

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource$Factory
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

class Transformation {
	
	List<Component> visitedNodes
	List<Component> componentsOfInterest
	List<SecurityGoal> securityGoals
	Stack<Component> ancestorStack
	Stack<Component> childStack
	
		
	def static void main(String[] args) {
		new Transformation().generate("MetaModel/SecurityConcept_MT_example.xmi")
	}

	def generate(String file) {
		componentsOfInterest = new ArrayList<Component>()
		val resourceSet = new ResourceSetImpl
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put(SCPackage.eNS_URI,
			SCPackage.eINSTANCE)
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
		val resource = resourceSet.getResource(URI.createFileURI(file), true)
		for (content : resource.contents) {
			generateCode(content)
		}
	}

	def dispatch generateCode(SecurityConcept securityConcept) {
		// Initialize the visitedNodes list, factory and security concept
		visitedNodes = new ArrayList<Component>
		val factory = SCFactory.eINSTANCE
		var newSecurityConcept = factory.createSecurityConcept
		// Select the IDs of components that should be aggregated
		val int[] componentIDs = #[1,4,6]
		componentIDs.stream.filter(id | findComponentByID(securityConcept,id) !== null).forEach[id | componentsOfInterest.add(findComponentByID(securityConcept,id))]
		for (Component comp : componentsOfInterest){
			securityGoals = new ArrayList<SecurityGoal>
			if (!visitedNodes.contains(comp)){
				visitedNodes.add(comp)
				// Add the new component and its asset to the new security concept
				newSecurityConcept.components.add(comp)
				if (comp.asset === null){
					val asset = factory.createAsset
					asset.name = "Asset_".concat(comp.name)
					asset.component = comp
					asset.assetID = securityConcept.assets.last.assetID+1
					newSecurityConcept.assets.add(asset)
				}else{
					newSecurityConcept.assets.add(comp.asset)
				}
				for (SecurityGoal securityGoal : comp.asset.securitygoals){
					securityGoals.add(securityGoal)
				}
				// Check connections
				for (Connection con : comp.connections){
					securityGoals.addAll(con.data.asset.securitygoals)
				}
			}
		}
		writeToSecrutiyConcept(newSecurityConcept, securityGoals)
	}

	def dispatch generateCode(EObject object) {
		print("bla")
	}

	

	def Component findComponentByID(SecurityConcept securityConcept, int id) {
		val component = securityConcept.components.findFirst[componentID.equals(id)]
		return component
	}

	def writeToSecrutiyConcept(SecurityConcept newSecurityConcept, List<SecurityGoal> securityGoals) {
		val resourceSet = new ResourceSetImpl
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put(SCPackage.eNS_URI,
			SCPackage.eINSTANCE)
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
		val resource = resourceSet.createResource(URI.createURI("MetaModel/SecurityConceptTransformation.xmi"))
		val comp = newSecurityConcept.components
		val asset = newSecurityConcept.assets
		val sg = newSecurityConcept.securityGoals
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
