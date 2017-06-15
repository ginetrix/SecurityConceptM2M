/**
 */
package SecuriyConcept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecuriyConcept.SecurityGoal#getSecurityGoalClass <em>Security Goal Class</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityGoal#getDamagePotential <em>Damage Potential</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityGoal#getDependsOnSecurityGoal <em>Depends On Security Goal</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityGoal#getDescription <em>Description</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityGoal#getSecurityGoalID <em>Security Goal ID</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityGoal#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityGoal#getAsset <em>Asset</em>}</li>
 *   <li>{@link SecuriyConcept.SecurityGoal#getThreat <em>Threat</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal()
 * @model
 * @generated
 */
public interface SecurityGoal extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Goal Class</b></em>' attribute.
	 * The default value is <code>"Confidentiality"</code>.
	 * The literals are from the enumeration {@link SecuriyConcept.SecurityGoalClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Goal Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goal Class</em>' attribute.
	 * @see SecuriyConcept.SecurityGoalClassType
	 * @see #setSecurityGoalClass(SecurityGoalClassType)
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal_SecurityGoalClass()
	 * @model default="Confidentiality" unique="false"
	 * @generated
	 */
	SecurityGoalClassType getSecurityGoalClass();

	/**
	 * Sets the value of the '{@link SecuriyConcept.SecurityGoal#getSecurityGoalClass <em>Security Goal Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Goal Class</em>' attribute.
	 * @see SecuriyConcept.SecurityGoalClassType
	 * @see #getSecurityGoalClass()
	 * @generated
	 */
	void setSecurityGoalClass(SecurityGoalClassType value);

	/**
	 * Returns the value of the '<em><b>Damage Potential</b></em>' attribute.
	 * The literals are from the enumeration {@link SecuriyConcept.Damages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Potential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Potential</em>' attribute.
	 * @see SecuriyConcept.Damages
	 * @see #setDamagePotential(Damages)
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal_DamagePotential()
	 * @model
	 * @generated
	 */
	Damages getDamagePotential();

	/**
	 * Sets the value of the '{@link SecuriyConcept.SecurityGoal#getDamagePotential <em>Damage Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Potential</em>' attribute.
	 * @see SecuriyConcept.Damages
	 * @see #getDamagePotential()
	 * @generated
	 */
	void setDamagePotential(Damages value);

	/**
	 * Returns the value of the '<em><b>Depends On Security Goal</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.SecurityGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On Security Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On Security Goal</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal_DependsOnSecurityGoal()
	 * @model keys="securityGoalID"
	 * @generated
	 */
	EList<SecurityGoal> getDependsOnSecurityGoal();

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
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SecuriyConcept.SecurityGoal#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Security Goal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Goal ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goal ID</em>' attribute.
	 * @see #setSecurityGoalID(int)
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal_SecurityGoalID()
	 * @model
	 * @generated
	 */
	int getSecurityGoalID();

	/**
	 * Sets the value of the '{@link SecuriyConcept.SecurityGoal#getSecurityGoalID <em>Security Goal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Goal ID</em>' attribute.
	 * @see #getSecurityGoalID()
	 * @generated
	 */
	void setSecurityGoalID(int value);

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
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecuriyConcept.SecurityGoal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SecuriyConcept.Asset#getSecuritygoal <em>Securitygoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal_Asset()
	 * @see SecuriyConcept.Asset#getSecuritygoal
	 * @model opposite="securitygoal" required="true"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link SecuriyConcept.SecurityGoal#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Threat</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.Threat}.
	 * It is bidirectional and its opposite is '{@link SecuriyConcept.Threat#getSecuritygoal <em>Securitygoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getSecurityGoal_Threat()
	 * @see SecuriyConcept.Threat#getSecuritygoal
	 * @model opposite="securitygoal"
	 * @generated
	 */
	EList<Threat> getThreat();

} // SecurityGoal
