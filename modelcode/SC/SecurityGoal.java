/**
 */
package SC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SC.SecurityGoal#getSecurityGoalClass <em>Security Goal Class</em>}</li>
 *   <li>{@link SC.SecurityGoal#getDamagePotential <em>Damage Potential</em>}</li>
 *   <li>{@link SC.SecurityGoal#getDependsOnSecurityGoal <em>Depends On Security Goal</em>}</li>
 *   <li>{@link SC.SecurityGoal#getDescription <em>Description</em>}</li>
 *   <li>{@link SC.SecurityGoal#getSecurityGoalID <em>Security Goal ID</em>}</li>
 *   <li>{@link SC.SecurityGoal#getName <em>Name</em>}</li>
 *   <li>{@link SC.SecurityGoal#getAsset <em>Asset</em>}</li>
 *   <li>{@link SC.SecurityGoal#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @see SC.SCPackage#getSecurityGoal()
 * @model
 * @generated
 */
public interface SecurityGoal extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Goal Class</b></em>' attribute.
	 * The default value is <code>"Confidentiality"</code>.
	 * The literals are from the enumeration {@link SC.SecurityGoalClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Goal Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goal Class</em>' attribute.
	 * @see SC.SecurityGoalClassType
	 * @see #setSecurityGoalClass(SecurityGoalClassType)
	 * @see SC.SCPackage#getSecurityGoal_SecurityGoalClass()
	 * @model default="Confidentiality" unique="false"
	 * @generated
	 */
	SecurityGoalClassType getSecurityGoalClass();

	/**
	 * Sets the value of the '{@link SC.SecurityGoal#getSecurityGoalClass <em>Security Goal Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Goal Class</em>' attribute.
	 * @see SC.SecurityGoalClassType
	 * @see #getSecurityGoalClass()
	 * @generated
	 */
	void setSecurityGoalClass(SecurityGoalClassType value);

	/**
	 * Returns the value of the '<em><b>Damage Potential</b></em>' attribute.
	 * The literals are from the enumeration {@link SC.Damages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Potential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Potential</em>' attribute.
	 * @see SC.Damages
	 * @see #setDamagePotential(Damages)
	 * @see SC.SCPackage#getSecurityGoal_DamagePotential()
	 * @model
	 * @generated
	 */
	Damages getDamagePotential();

	/**
	 * Sets the value of the '{@link SC.SecurityGoal#getDamagePotential <em>Damage Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Potential</em>' attribute.
	 * @see SC.Damages
	 * @see #getDamagePotential()
	 * @generated
	 */
	void setDamagePotential(Damages value);

	/**
	 * Returns the value of the '<em><b>Depends On Security Goal</b></em>' reference list.
	 * The list contents are of type {@link SC.SecurityGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On Security Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On Security Goal</em>' reference list.
	 * @see SC.SCPackage#getSecurityGoal_DependsOnSecurityGoal()
	 * @model keys="securityGoalID"
	 *        extendedMetaData="name='SecurityGoal'"
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
	 * @see SC.SCPackage#getSecurityGoal_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SC.SecurityGoal#getDescription <em>Description</em>}' attribute.
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
	 * @see SC.SCPackage#getSecurityGoal_SecurityGoalID()
	 * @model
	 * @generated
	 */
	int getSecurityGoalID();

	/**
	 * Sets the value of the '{@link SC.SecurityGoal#getSecurityGoalID <em>Security Goal ID</em>}' attribute.
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
	 * @see SC.SCPackage#getSecurityGoal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SC.SecurityGoal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SC.Asset#getSecuritygoals <em>Securitygoals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see SC.SCPackage#getSecurityGoal_Asset()
	 * @see SC.Asset#getSecuritygoals
	 * @model opposite="securitygoals" required="true"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link SC.SecurityGoal#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Threat</b></em>' reference list.
	 * The list contents are of type {@link SC.Threat}.
	 * It is bidirectional and its opposite is '{@link SC.Threat#getSecuritygoal <em>Securitygoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference list.
	 * @see SC.SCPackage#getSecurityGoal_Threat()
	 * @see SC.Threat#getSecuritygoal
	 * @model opposite="securitygoal"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	EList<Threat> getThreat();

} // SecurityGoal
