/**
 */
package SC;

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
 *   <li>{@link SC.Threat#getThreatClass <em>Threat Class</em>}</li>
 *   <li>{@link SC.Threat#getDescription <em>Description</em>}</li>
 *   <li>{@link SC.Threat#getThreatID <em>Threat ID</em>}</li>
 *   <li>{@link SC.Threat#getAttackPotential <em>Attack Potential</em>}</li>
 *   <li>{@link SC.Threat#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link SC.Threat#getAsset <em>Asset</em>}</li>
 *   <li>{@link SC.Threat#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see SC.SCPackage#getThreat()
 * @model extendedMetaData="name='SecurityGoal'"
 * @generated
 */
public interface Threat extends EObject {
	/**
	 * Returns the value of the '<em><b>Threat Class</b></em>' attribute.
	 * The default value is <code>"Spoofing"</code>.
	 * The literals are from the enumeration {@link SC.ThreatClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threat Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Class</em>' attribute.
	 * @see SC.ThreatClass
	 * @see #setThreatClass(ThreatClass)
	 * @see SC.SCPackage#getThreat_ThreatClass()
	 * @model default="Spoofing"
	 * @generated
	 */
	ThreatClass getThreatClass();

	/**
	 * Sets the value of the '{@link SC.Threat#getThreatClass <em>Threat Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat Class</em>' attribute.
	 * @see SC.ThreatClass
	 * @see #getThreatClass()
	 * @generated
	 */
	void setThreatClass(ThreatClass value);

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
	 * @see SC.SCPackage#getThreat_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SC.Threat#getDescription <em>Description</em>}' attribute.
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
	 * @see SC.SCPackage#getThreat_ThreatID()
	 * @model
	 * @generated
	 */
	int getThreatID();

	/**
	 * Sets the value of the '{@link SC.Threat#getThreatID <em>Threat ID</em>}' attribute.
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
	 * The literals are from the enumeration {@link SC.Damages}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Potential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Potential</em>' attribute.
	 * @see SC.Damages
	 * @see #setAttackPotential(Damages)
	 * @see SC.SCPackage#getThreat_AttackPotential()
	 * @model default="low"
	 * @generated
	 */
	Damages getAttackPotential();

	/**
	 * Sets the value of the '{@link SC.Threat#getAttackPotential <em>Attack Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Potential</em>' attribute.
	 * @see SC.Damages
	 * @see #getAttackPotential()
	 * @generated
	 */
	void setAttackPotential(Damages value);

	/**
	 * Returns the value of the '<em><b>Security Goals</b></em>' reference list.
	 * The list contents are of type {@link SC.SecurityGoal}.
	 * It is bidirectional and its opposite is '{@link SC.SecurityGoal#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Goals</em>' reference list.
	 * @see SC.SCPackage#getThreat_SecurityGoals()
	 * @see SC.SecurityGoal#getThreats
	 * @model opposite="threats"
	 * @generated
	 */
	EList<SecurityGoal> getSecurityGoals();

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SC.Asset#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see SC.SCPackage#getThreat_Asset()
	 * @see SC.Asset#getThreats
	 * @model opposite="threats"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link SC.Threat#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link SC.Control}.
	 * It is bidirectional and its opposite is '{@link SC.Control#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see SC.SCPackage#getThreat_Controls()
	 * @see SC.Control#getThreats
	 * @model opposite="threats"
	 * @generated
	 */
	EList<Control> getControls();

} // Threat
