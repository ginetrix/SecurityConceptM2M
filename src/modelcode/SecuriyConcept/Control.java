/**
 */
package SecuriyConcept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecuriyConcept.Control#getControlID <em>Control ID</em>}</li>
 *   <li>{@link SecuriyConcept.Control#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.Control#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link SecuriyConcept.Control#getMitigates <em>Mitigates</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecuriyConcept.SecuriyConceptPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Control ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control ID</em>' attribute.
	 * @see #setControlID(int)
	 * @see SecuriyConcept.SecuriyConceptPackage#getControl_ControlID()
	 * @model
	 * @generated
	 */
	int getControlID();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Control#getControlID <em>Control ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control ID</em>' attribute.
	 * @see #getControlID()
	 * @generated
	 */
	void setControlID(int value);

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
	 * @see SecuriyConcept.SecuriyConceptPackage#getControl_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Control#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.SecurityGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getControl_DependsOn()
	 * @model keys="securityGoalID"
	 * @generated
	 */
	EList<SecurityGoal> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Mitigates</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.Threat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mitigates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigates</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getControl_Mitigates()
	 * @model required="true"
	 * @generated
	 */
	EList<Threat> getMitigates();

} // Control
