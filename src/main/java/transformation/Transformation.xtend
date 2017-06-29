package transformation

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource$Factory
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.EObject
import java.io.IOException
import java.util.Collections
import SC.SecurityConcept
import SC.SCPackage

class Transformation {
	def static void main(String[] args) {
		new Transformation().generate("MetaModel/SecurityConcept1.xmi")
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
		for (component : securityConcept.components) {
			print(component.name + "\n")
		}

		writeToSecrutiyConcept(securityConcept)
	}

	def dispatch generateCode(EObject object) {
		print("bla")
	}

	def findComponentByID(SecurityConcept securityConcept, int id) {
		print(securityConcept.components.filter[componentID.equals(id)].get(0).asset.assetID)
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
