/**
 */
package SecuriyConcept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecuriyConcept.SecurityConcept#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityConcept#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityConcept#getThreats <em>Threats</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityConcept#getControls <em>Controls</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityConcept#getAssets <em>Assets</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityConcept#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityConcept()
 * @model
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
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityConcept_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecuriyConcept.SecurityConcept#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Security Goals</b></em>' containment reference list.
	 * The list contents are of type {@link SecuriyConcept.SecurityGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goals</em>' containment reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityConcept_SecurityGoals()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityGoal> getSecurityGoals();

	/**
	 * Returns the value of the '<em><b>Threats</b></em>' containment reference list.
	 * The list contents are of type {@link SecuriyConcept.Threat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' containment reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityConcept_Threats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getThreats();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link SecuriyConcept.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityConcept_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link SecuriyConcept.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityConcept_Assets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link SecuriyConcept.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityConcept_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // SecurityConcept
