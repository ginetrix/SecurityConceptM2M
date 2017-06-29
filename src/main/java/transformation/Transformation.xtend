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
		for (data : securityConcept.data) {
			print(data.name + "\n")
		}
		val myComp = findComponentByID(securityConcept, 3)
		print(myComp)
		// writeToSecrutiyConcept(securityConcept)
	}

	def dispatch generateCode(EObject object) {
		print("bla")
	}

	

	def Component findComponentByID(SecurityConcept securityConcept, int id) {
		val component = securityConcept.components.findFirst[componentID.equals(id)]
		return component
	}

	def writeToSecrutiyConcept(SecurityConcept securityConcept) {
		val resourceSet = new ResourceSetImpl
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put(SCPackage.eNS_URI,
			SCPackage.eINSTANCE)
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
		val resource = resourceSet.createResource(URI.createURI("MetaModel/SecurityConceptTransformation.xmi"))
		val comp = securityConcept.components.get(0)
		resource.contents.add(comp)
		try {
			resource.save(Collections.EMPTY_MAP)
		} catch (IOException exception) {
			exception.printStackTrace
		}
	}
}
