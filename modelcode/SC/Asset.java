/**
 */
package SC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SC.Asset#getName <em>Name</em>}</li>
 *   <li>{@link SC.Asset#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link SC.Asset#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link SC.Asset#getComponent <em>Component</em>}</li>
 *   <li>{@link SC.Asset#getData <em>Data</em>}</li>
 *   <li>{@link SC.Asset#getThreats <em>Threats</em>}</li>
 *   <li>{@link SC.Asset#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see SC.SCPackage#getAsset()
 * @model extendedMetaData="name='SecurityGoal'"
 * @generated
 */
public interface Asset extends EObject {
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
	 * @see SC.SCPackage#getAsset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SC.Asset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset ID</em>' attribute.
	 * @see #setAssetID(int)
	 * @see SC.SCPackage#getAsset_AssetID()
	 * @model
	 * @generated
	 */
	int getAssetID();

	/**
	 * Sets the value of the '{@link SC.Asset#getAssetID <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset ID</em>' attribute.
	 * @see #getAssetID()
	 * @generated
	 */
	void setAssetID(int value);

	/**
	 * Returns the value of the '<em><b>Security Goals</b></em>' reference list.
	 * The list contents are of type {@link SC.SecurityGoal}.
	 * It is bidirectional and its opposite is '{@link SC.SecurityGoal#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goals</em>' reference list.
	 * @see SC.SCPackage#getAsset_SecurityGoals()
	 * @see SC.SecurityGoal#getAsset
	 * @model opposite="asset"
	 * @generated
	 */
	EList<SecurityGoal> getSecurityGoals();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SC.Component#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see SC.SCPackage#getAsset_Component()
	 * @see SC.Component#getAsset
	 * @model opposite="asset" keys="componentID"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link SC.Asset#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SC.Data#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see SC.SCPackage#getAsset_Data()
	 * @see SC.Data#getAsset
	 * @model opposite="asset"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link SC.Asset#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Threats</b></em>' reference list.
	 * The list contents are of type {@link SC.Threat}.
	 * It is bidirectional and its opposite is '{@link SC.Threat#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threats</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' reference list.
	 * @see SC.SCPackage#getAsset_Threats()
	 * @see SC.Threat#getAsset
	 * @model opposite="asset"
	 * @generated
	 */
	EList<Threat> getThreats();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link SC.Control}.
	 * It is bidirectional and its opposite is '{@link SC.Control#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see SC.SCPackage#getAsset_Controls()
	 * @see SC.Control#getAsset
	 * @model opposite="asset"
	 * @generated
	 */
	EList<Control> getControls();

} // Asset
