/**
 */
package SecuriyConcept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecuriyConcept.Component#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.Component#getIsAn <em>Is An</em>}</li>
 *   <li>{@link SecuriyConcept.Component#getComponentID <em>Component ID</em>}</li>
 *   <li>{@link SecuriyConcept.Component#getConnection <em>Connection</em>}</li>
 *   <li>{@link SecuriyConcept.Component#getData <em>Data</em>}</li>
 *   <li>{@link SecuriyConcept.Component#getHasComponent <em>Has Component</em>}</li>
 *   <li>{@link SecuriyConcept.Component#getHasAncestor <em>Has Ancestor</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecuriyConcept.SecuriyConceptPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SecuriyConcept.SecuriyConceptPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is An</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is An</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is An</em>' reference.
	 * @see #setIsAn(Asset)
	 * @see SecuriyConcept.SecuriyConceptPackage#getComponent_IsAn()
	 * @model
	 * @generated
	 */
	Asset getIsAn();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Component#getIsAn <em>Is An</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is An</em>' reference.
	 * @see #getIsAn()
	 * @generated
	 */
	void setIsAn(Asset value);

	/**
	 * Returns the value of the '<em><b>Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component ID</em>' attribute.
	 * @see #setComponentID(int)
	 * @see SecuriyConcept.SecuriyConceptPackage#getComponent_ComponentID()
	 * @model
	 * @generated
	 */
	int getComponentID();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Component#getComponentID <em>Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component ID</em>' attribute.
	 * @see #getComponentID()
	 * @generated
	 */
	void setComponentID(int value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.Connection}.
	 * It is bidirectional and its opposite is '{@link SecuriyConcept.Connection#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getComponent_Connection()
	 * @see SecuriyConcept.Connection#getComponent
	 * @model opposite="component"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link SecuriyConcept.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getComponent_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Has Component</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.Component}.
	 * It is bidirectional and its opposite is '{@link SecuriyConcept.Component#getHasAncestor <em>Has Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Component</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getComponent_HasComponent()
	 * @see SecuriyConcept.Component#getHasAncestor
	 * @model opposite="hasAncestor"
	 * @generated
	 */
	EList<Component> getHasComponent();

	/**
	 * Returns the value of the '<em><b>Has Ancestor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SecuriyConcept.Component#getHasComponent <em>Has Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ancestor</em>' reference.
	 * @see #setHasAncestor(Component)
	 * @see SecuriyConcept.SecuriyConceptPackage#getComponent_HasAncestor()
	 * @see SecuriyConcept.Component#getHasComponent
	 * @model opposite="hasComponent"
	 * @generated
	 */
	Component getHasAncestor();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Component#getHasAncestor <em>Has Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Ancestor</em>' reference.
	 * @see #getHasAncestor()
	 * @generated
	 */
	void setHasAncestor(Component value);

} // Component
