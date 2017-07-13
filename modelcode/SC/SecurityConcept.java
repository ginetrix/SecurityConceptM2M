/**
 */
package SC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SC.SecurityConcept#getName <em>Name</em>}</li>
 *   <li>{@link SC.SecurityConcept#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link SC.SecurityConcept#getThreats <em>Threats</em>}</li>
 *   <li>{@link SC.SecurityConcept#getControls <em>Controls</em>}</li>
 *   <li>{@link SC.SecurityConcept#getAssets <em>Assets</em>}</li>
 *   <li>{@link SC.SecurityConcept#getComponents <em>Components</em>}</li>
 *   <li>{@link SC.SecurityConcept#getData <em>Data</em>}</li>
 *   <li>{@link SC.SecurityConcept#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see SC.SCPackage#getSecurityConcept()
 * @model extendedMetaData="name='SecurityGoal'"
 * @generated
 */
public interface SecurityConcept extends EObject {
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
	 * @see SC.SCPackage#getSecurityConcept_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SC.SecurityConcept#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Security Goals</b></em>' containment reference list.
	 * The list contents are of type {@link SC.SecurityGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goals</em>' containment reference list.
	 * @see SC.SCPackage#getSecurityConcept_SecurityGoals()
	 * @model containment="true"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	EList<SecurityGoal> getSecurityGoals();

	/**
	 * Returns the value of the '<em><b>Threats</b></em>' containment reference list.
	 * The list contents are of type {@link SC.Threat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' containment reference list.
	 * @see SC.SCPackage#getSecurityConcept_Threats()
	 * @model containment="true"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	EList<Threat> getThreats();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link SC.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see SC.SCPackage#getSecurityConcept_Controls()
	 * @model containment="true"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link SC.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see SC.SCPackage#getSecurityConcept_Assets()
	 * @model containment="true"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link SC.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see SC.SCPackage#getSecurityConcept_Components()
	 * @model containment="true"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link SC.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see SC.SCPackage#getSecurityConcept_Data()
	 * @model containment="true"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link SC.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see SC.SCPackage#getSecurityConcept_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // SecurityConcept
