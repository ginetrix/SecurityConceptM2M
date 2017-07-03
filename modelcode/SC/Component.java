/**
 */
package SC;

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
 *   <li>{@link SC.Component#getName <em>Name</em>}</li>
 *   <li>{@link SC.Component#getComponentID <em>Component ID</em>}</li>
 *   <li>{@link SC.Component#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link SC.Component#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link SC.Component#getAsset <em>Asset</em>}</li>
 *   <li>{@link SC.Component#getData <em>Data</em>}</li>
 *   <li>{@link SC.Component#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see SC.SCPackage#getComponent()
 * @model extendedMetaData="name='SecurityGoal'"
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
	 * @see SC.SCPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SC.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see SC.SCPackage#getComponent_ComponentID()
	 * @model
	 * @generated
	 */
	int getComponentID();

	/**
	 * Sets the value of the '{@link SC.Component#getComponentID <em>Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component ID</em>' attribute.
	 * @see #getComponentID()
	 * @generated
	 */
	void setComponentID(int value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link SC.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see SC.SCPackage#getComponent_Data()
	 * @model
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link SC.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see SC.SCPackage#getComponent_Connections()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Subcomponents</b></em>' reference list.
	 * The list contents are of type {@link SC.Component}.
	 * It is bidirectional and its opposite is '{@link SC.Component#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponents</em>' reference list.
	 * @see SC.SCPackage#getComponent_Subcomponents()
	 * @see SC.Component#getAncestor
	 * @model opposite="Ancestor"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	EList<Component> getSubcomponents();

	/**
	 * Returns the value of the '<em><b>Ancestor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SC.Component#getSubcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancestor</em>' reference.
	 * @see #setAncestor(Component)
	 * @see SC.SCPackage#getComponent_Ancestor()
	 * @see SC.Component#getSubcomponents
	 * @model opposite="Subcomponents"
	 * @generated
	 */
	Component getAncestor();

	/**
	 * Sets the value of the '{@link SC.Component#getAncestor <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestor</em>' reference.
	 * @see #getAncestor()
	 * @generated
	 */
	void setAncestor(Component value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SC.Asset#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see SC.SCPackage#getComponent_Asset()
	 * @see SC.Asset#getComponent
	 * @model opposite="component" keys="assetID"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link SC.Component#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

} // Component
