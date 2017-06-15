package transformation;

import SecuriyConcept.Component;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Transformation {
  public static void main(final String[] args) {
    new Transformation().generate("MetaModel/SecurityConcept1.xmi");
  }
  
  public void generate(final String file) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(SecuriyConceptPackage.eNS_URI, SecuriyConceptPackage.eINSTANCE);
    Map<String, Object> _extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    final Resource resource = resourceSet.getResource(URI.createFileURI(file), true);
    EList<EObject> _contents = resource.getContents();
    for (final EObject content : _contents) {
      this.generateCode(content);
    }
  }
  
  protected String _generateCode(final SecurityConcept securityConcept) {
    this.findComponentByID(securityConcept, 1);
    EList<Component> _components = securityConcept.getComponents();
    for (final Component component : _components) {
      String _name = component.getName();
      String _plus = (_name + "\n");
      InputOutput.<String>print(_plus);
    }
    return null;
  }
  
  protected String _generateCode(final EObject object) {
    return InputOutput.<String>print("bla");
  }
  
  public Integer findComponentByID(final SecurityConcept securityConcept, final int id) {
    final Function1<Component, Boolean> _function = new Function1<Component, Boolean>() {
      public Boolean apply(final Component it) {
        return Boolean.valueOf(Integer.valueOf(it.getComponentID()).equals(Integer.valueOf(id)));
      }
    };
    return InputOutput.<Integer>print(Integer.valueOf(((Component[])Conversions.unwrapArray(IterableExtensions.<Component>filter(securityConcept.getComponents(), _function), Component.class))[0].getIsAn().getAssetID()));
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
