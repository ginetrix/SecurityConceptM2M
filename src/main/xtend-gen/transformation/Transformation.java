package transformation;

import SecuriyConcept.Asset;
import SecuriyConcept.Component;
import SecuriyConcept.SecurityConcept;
import SecuriyConcept.SecuriyConceptPackage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Transformation {
  public static void main(final String[] args) {
    Transformation _transformation = new Transformation();
    _transformation.generate("MetaModel/SecurityConcept1.xmi");
  }
  
  public void generate(final String file) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put(SecuriyConceptPackage.eNS_URI, 
      SecuriyConceptPackage.eINSTANCE);
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
    EList<Component> _components = securityConcept.getComponents();
    for (final Component component : _components) {
      String _name = component.getName();
      String _plus = (_name + "\n");
      InputOutput.<String>print(_plus);
    }
    this.writeToSecrutiyConcept(securityConcept);
    return null;
  }
  
  protected String _generateCode(final EObject object) {
    return InputOutput.<String>print("bla");
  }
  
  public Integer findComponentByID(final SecurityConcept securityConcept, final int id) {
    EList<Component> _components = securityConcept.getComponents();
    final Function1<Component, Boolean> _function = new Function1<Component, Boolean>() {
      public Boolean apply(final Component it) {
        int _componentID = it.getComponentID();
        return Boolean.valueOf(Integer.valueOf(_componentID).equals(Integer.valueOf(id)));
      }
    };
    Iterable<Component> _filter = IterableExtensions.<Component>filter(_components, _function);
    Component _get = ((Component[])Conversions.unwrapArray(_filter, Component.class))[0];
    Asset _isAn = _get.getIsAn();
    int _assetID = _isAn.getAssetID();
    return InputOutput.<Integer>print(Integer.valueOf(_assetID));
  }
  
  public void writeToSecrutiyConcept(final SecurityConcept securityConcept) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put(SecuriyConceptPackage.eNS_URI, 
      SecuriyConceptPackage.eINSTANCE);
    Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap_1 = _resourceFactoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap_1.put("xmi", _xMIResourceFactoryImpl);
    URI _createURI = URI.createURI("MetaModel/SecurityConceptTransformation.xmi");
    final Resource resource = resourceSet.createResource(_createURI);
    EList<EObject> _contents = resource.getContents();
    _contents.add(securityConcept);
    try {
      resource.save(Collections.EMPTY_MAP);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException exception = (IOException)_t;
        exception.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
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
