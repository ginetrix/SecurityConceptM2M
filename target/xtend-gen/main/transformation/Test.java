package transformation;

import SecuriyConcept.Asset;
import SecuriyConcept.SecurityConcept;
import SecuriyConcept.SecuriyConceptPackage;
import java.util.Arrays;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Test {
  public static void main(final String[] args) {
    Test _test = new Test();
    _test.generate("model/SecurityConceptExample.xmi");
  }
  
  public void generate(final String file) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put(SecuriyConceptPackage.eNS_URI, SecuriyConceptPackage.eINSTANCE);
    Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap_1 = _resourceFactoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap_1.put("xmi", _xMIResourceFactoryImpl);
    URI _createFileURI = URI.createFileURI(file);
    final Resource resource = resourceSet.getResource(_createFileURI, true);
    EList<EObject> _contents = resource.getContents();
    for (final EObject content : _contents) {
      this.generateCode(content);
    }
  }
  
  protected String _generateCode(final SecurityConcept securityConcept) {
    EList<Asset> _assets = securityConcept.getAssets();
    for (final Asset asset : _assets) {
      String _name = asset.getName();
      InputOutput.<String>print(_name);
    }
    return null;
  }
  
  protected String _generateCode(final EObject object) {
    return InputOutput.<String>print("bla");
  }
  
  public String generateCode(final EObject securityConcept) {
    if (securityConcept instanceof SecurityConcept) {
      return _generateCode((SecurityConcept)securityConcept);
    } else if (securityConcept != null) {
      return _generateCode(securityConcept);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(securityConcept).toString());
    }
  }
}
