package transformation;

import SC.Asset;
import SC.Component;
import SC.Data;
import SC.SCFactory;
import SC.SCPackage;
import SC.SecurityConcept;
import SC.SecurityGoal;
import SC.SecurityGoalClassType;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Transformation {
  private List<Component> visitedNodes;
  
  private List<Component> componentsOfInterest;
  
  private List<SecurityGoal> securityGoals;
  
  private Stack<Component> ancestorStack;
  
  private Stack<Component> childStack;
  
  public static void main(final String[] args) {
    new Transformation().generate("MetaModel/SecurityConcept_MT_example.xmi");
  }
  
  public void generate(final String file) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(SCPackage.eNS_URI, 
      SCPackage.eINSTANCE);
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
    EList<Data> _data = securityConcept.getData();
    for (final Data data : _data) {
      String _name = data.getName();
      String _plus = (_name + "\n");
      InputOutput.<String>print(_plus);
    }
    final Component myComp = this.findComponentByID(securityConcept, 1);
    final SCFactory factory = SCFactory.eINSTANCE;
    final SecurityGoal sg = factory.createSecurityGoal();
    sg.setName("Supergoal");
    sg.setSecurityGoalClass(SecurityGoalClassType.INTEGRITY);
    sg.setAsset(securityConcept.getAssets().get(0));
    InputOutput.<Asset>print(sg.getAsset());
    securityConcept.getSecurityGoals().add(sg);
    this.writeToSecrutiyConcept(securityConcept);
    return null;
  }
  
  protected String _generateCode(final EObject object) {
    return InputOutput.<String>print("bla");
  }
  
  public Component findComponentByID(final SecurityConcept securityConcept, final int id) {
    final Function1<Component, Boolean> _function = new Function1<Component, Boolean>() {
      public Boolean apply(final Component it) {
        return Boolean.valueOf(Integer.valueOf(it.getComponentID()).equals(Integer.valueOf(id)));
      }
    };
    final Component component = IterableExtensions.<Component>findFirst(securityConcept.getComponents(), _function);
    return component;
  }
  
  public void writeToSecrutiyConcept(final SecurityConcept securityConcept) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(SCPackage.eNS_URI, 
      SCPackage.eINSTANCE);
    Map<String, Object> _extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    final Resource resource = resourceSet.createResource(URI.createURI("MetaModel/SecurityConceptTransformation.xmi"));
    final EList<Component> comp = securityConcept.getComponents();
    final EList<Asset> asset = securityConcept.getAssets();
    final EList<SecurityGoal> sg = securityConcept.getSecurityGoals();
    resource.getContents().addAll(comp);
    resource.getContents().addAll(asset);
    resource.getContents().addAll(sg);
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
