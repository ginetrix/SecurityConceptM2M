/**
 */
package SecuriyConcept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecuriyConcept.Threat#getDescription <em>Description</em>}</li>
 *   <li>{@link SecuriyConcept.Threat#getThreatID <em>Threat ID</em>}</li>
 *   <li>{@link SecuriyConcept.Threat#getAttackPotential <em>Attack Potential</em>}</li>
 *   <li>{@link SecuriyConcept.Threat#getSecuritygoal <em>Securitygoal</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecuriyConcept.SecuriyConceptPackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see SecuriyConcept.SecuriyConceptPackage#getThreat_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Threat#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Threat ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat ID</em>' attribute.
	 * @see #setThreatID(int)
	 * @see SecuriyConcept.SecuriyConceptPackage#getThreat_ThreatID()
	 * @model
	 * @generated
	 */
	int getThreatID();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Threat#getThreatID <em>Threat ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat ID</em>' attribute.
	 * @see #getThreatID()
	 * @generated
	 */
	void setThreatID(int value);

	/**
	 * Returns the value of the '<em><b>Attack Potential</b></em>' attribute.
	 * The default value is <code>"low"</code>.
	 * The literals are from the enumeration {@link SecuriyConcept.Damages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Potential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Potential</em>' attribute.
	 * @see SecuriyConcept.Damages
	 * @see #setAttackPotential(Damages)
	 * @see SecuriyConcept.SecuriyConceptPackage#getThreat_AttackPotential()
	 * @model default="low"
	 * @generated
	 */
	Damages getAttackPotential();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Threat#getAttackPotential <em>Attack Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Potential</em>' attribute.
	 * @see SecuriyConcept.Damages
	 * @see #getAttackPotential()
	 * @generated
	 */
	void setAttackPotential(Damages value);

	/**
	 * Returns the value of the '<em><b>Securitygoal</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.SecurityGoal}.
	 * It is bidirectional and its opposite is '{@link SecuriyConcept.SecurityGoal#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitygoal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitygoal</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getThreat_Securitygoal()
	 * @see SecuriyConcept.SecurityGoal#getThreat
	 * @model opposite="threat" required="true"
	 * @generated
	 */
	EList<SecurityGoal> getSecuritygoal();

} // Threat
