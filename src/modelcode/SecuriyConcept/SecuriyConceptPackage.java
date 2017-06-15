/**
 */
package SecuriyConcept;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SecuriyConcept.SecuriyConceptFactory
 * @model kind="package"
 * @generated
 */
public interface SecuriyConceptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SecuriyConcept";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/securityconcept";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecuriyConceptPackage eINSTANCE = SecuriyConcept.impl.SecuriyConceptPackageImpl.init();

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.SecurityGoalImpl <em>Security Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.SecurityGoalImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getSecurityGoal()
	 * @generated
	 */
	int SECURITY_GOAL = 0;

	/**
	 * The feature id for the '<em><b>Security Goal Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__SECURITY_GOAL_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Damage Potential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__DAMAGE_POTENTIAL = 1;

	/**
	 * The feature id for the '<em><b>Depends On Security Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__DEPENDS_ON_SECURITY_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Security Goal ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__SECURITY_GOAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__NAME = 5;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__ASSET = 6;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__THREAT = 7;

	/**
	 * The number of structural features of the '<em>Security Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Security Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.ThreatImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Threat ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREAT_ID = 1;

	/**
	 * The feature id for the '<em><b>Attack Potential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ATTACK_POTENTIAL = 2;

	/**
	 * The feature id for the '<em><b>Securitygoal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__SECURITYGOAL = 3;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.ControlImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Control ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROL_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DEPENDS_ON = 2;

	/**
	 * The feature id for the '<em><b>Mitigates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MITIGATES = 3;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.ComponentImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is An</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_AN = 1;

	/**
	 * The feature id for the '<em><b>Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA = 4;

	/**
	 * The feature id for the '<em><b>Has Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HAS_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Has Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HAS_ANCESTOR = 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.FunctionImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.AssetImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_ID = 1;

	/**
	 * The feature id for the '<em><b>Securitygoal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__SECURITYGOAL = 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.SecurityConceptImpl <em>Security Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.SecurityConceptImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getSecurityConcept()
	 * @generated
	 */
	int SECURITY_CONCEPT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Security Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT__SECURITY_GOALS = 1;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT__THREATS = 2;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT__CONTROLS = 3;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT__ASSETS = 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT__COMPONENTS = 5;

	/**
	 * The number of structural features of the '<em>Security Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Security Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.ConnectionImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_ID = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DATA = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.impl.DataImpl
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getData()
	 * @generated
	 */
	int DATA = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_ID = 1;

	/**
	 * The feature id for the '<em><b>Is An</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__IS_AN = 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecuriyConcept.SecurityGoalClassType <em>Security Goal Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.SecurityGoalClassType
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getSecurityGoalClassType()
	 * @generated
	 */
	int SECURITY_GOAL_CLASS_TYPE = 9;

	/**
	 * The meta object id for the '{@link SecuriyConcept.Damages <em>Damages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecuriyConcept.Damages
	 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getDamages()
	 * @generated
	 */
	int DAMAGES = 10;


	/**
	 * Returns the meta object for class '{@link SecuriyConcept.SecurityGoal <em>Security Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Goal</em>'.
	 * @see SecuriyConcept.SecurityGoal
	 * @generated
	 */
	EClass getSecurityGoal();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.SecurityGoal#getSecurityGoalClass <em>Security Goal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Goal Class</em>'.
	 * @see SecuriyConcept.SecurityGoal#getSecurityGoalClass()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_SecurityGoalClass();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.SecurityGoal#getDamagePotential <em>Damage Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Potential</em>'.
	 * @see SecuriyConcept.SecurityGoal#getDamagePotential()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_DamagePotential();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.SecurityGoal#getDependsOnSecurityGoal <em>Depends On Security Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On Security Goal</em>'.
	 * @see SecuriyConcept.SecurityGoal#getDependsOnSecurityGoal()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EReference getSecurityGoal_DependsOnSecurityGoal();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.SecurityGoal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SecuriyConcept.SecurityGoal#getDescription()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_Description();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.SecurityGoal#getSecurityGoalID <em>Security Goal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Goal ID</em>'.
	 * @see SecuriyConcept.SecurityGoal#getSecurityGoalID()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_SecurityGoalID();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.SecurityGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SecuriyConcept.SecurityGoal#getName()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_Name();

	/**
	 * Returns the meta object for the reference '{@link SecuriyConcept.SecurityGoal#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see SecuriyConcept.SecurityGoal#getAsset()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EReference getSecurityGoal_Asset();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.SecurityGoal#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threat</em>'.
	 * @see SecuriyConcept.SecurityGoal#getThreat()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EReference getSecurityGoal_Threat();

	/**
	 * Returns the meta object for class '{@link SecuriyConcept.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see SecuriyConcept.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Threat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SecuriyConcept.Threat#getDescription()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Description();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Threat#getThreatID <em>Threat ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threat ID</em>'.
	 * @see SecuriyConcept.Threat#getThreatID()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_ThreatID();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Threat#getAttackPotential <em>Attack Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack Potential</em>'.
	 * @see SecuriyConcept.Threat#getAttackPotential()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_AttackPotential();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.Threat#getSecuritygoal <em>Securitygoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Securitygoal</em>'.
	 * @see SecuriyConcept.Threat#getSecuritygoal()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Securitygoal();

	/**
	 * Returns the meta object for class '{@link SecuriyConcept.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see SecuriyConcept.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Control#getControlID <em>Control ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control ID</em>'.
	 * @see SecuriyConcept.Control#getControlID()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_ControlID();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Control#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SecuriyConcept.Control#getName()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Name();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.Control#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see SecuriyConcept.Control#getDependsOn()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_DependsOn();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.Control#getMitigates <em>Mitigates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigates</em>'.
	 * @see SecuriyConcept.Control#getMitigates()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Mitigates();

	/**
	 * Returns the meta object for class '{@link SecuriyConcept.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see SecuriyConcept.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SecuriyConcept.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link SecuriyConcept.Component#getIsAn <em>Is An</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is An</em>'.
	 * @see SecuriyConcept.Component#getIsAn()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_IsAn();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Component#getComponentID <em>Component ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component ID</em>'.
	 * @see SecuriyConcept.Component#getComponentID()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentID();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.Component#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection</em>'.
	 * @see SecuriyConcept.Component#getConnection()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link SecuriyConcept.Component#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see SecuriyConcept.Component#getData()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Data();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.Component#getHasComponent <em>Has Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Component</em>'.
	 * @see SecuriyConcept.Component#getHasComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_HasComponent();

	/**
	 * Returns the meta object for the reference '{@link SecuriyConcept.Component#getHasAncestor <em>Has Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Ancestor</em>'.
	 * @see SecuriyConcept.Component#getHasAncestor()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_HasAncestor();

	/**
	 * Returns the meta object for class '{@link SecuriyConcept.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see SecuriyConcept.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link SecuriyConcept.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see SecuriyConcept.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SecuriyConcept.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Asset#getAssetID <em>Asset ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset ID</em>'.
	 * @see SecuriyConcept.Asset#getAssetID()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetID();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.Asset#getSecuritygoal <em>Securitygoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Securitygoal</em>'.
	 * @see SecuriyConcept.Asset#getSecuritygoal()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Securitygoal();

	/**
	 * Returns the meta object for class '{@link SecuriyConcept.SecurityConcept <em>Security Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Concept</em>'.
	 * @see SecuriyConcept.SecurityConcept
	 * @generated
	 */
	EClass getSecurityConcept();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.SecurityConcept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SecuriyConcept.SecurityConcept#getName()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EAttribute getSecurityConcept_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SecuriyConcept.SecurityConcept#getSecurityGoals <em>Security Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Goals</em>'.
	 * @see SecuriyConcept.SecurityConcept#getSecurityGoals()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_SecurityGoals();

	/**
	 * Returns the meta object for the containment reference list '{@link SecuriyConcept.SecurityConcept#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threats</em>'.
	 * @see SecuriyConcept.SecurityConcept#getThreats()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Threats();

	/**
	 * Returns the meta object for the containment reference list '{@link SecuriyConcept.SecurityConcept#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see SecuriyConcept.SecurityConcept#getControls()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link SecuriyConcept.SecurityConcept#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see SecuriyConcept.SecurityConcept#getAssets()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Assets();

	/**
	 * Returns the meta object for the containment reference list '{@link SecuriyConcept.SecurityConcept#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see SecuriyConcept.SecurityConcept#getComponents()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Components();

	/**
	 * Returns the meta object for class '{@link SecuriyConcept.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see SecuriyConcept.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SecuriyConcept.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Connection#getConnectionID <em>Connection ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection ID</em>'.
	 * @see SecuriyConcept.Connection#getConnectionID()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionID();

	/**
	 * Returns the meta object for the reference list '{@link SecuriyConcept.Connection#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see SecuriyConcept.Connection#getComponent()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Component();

	/**
	 * Returns the meta object for the containment reference '{@link SecuriyConcept.Connection#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see SecuriyConcept.Connection#getData()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Data();

	/**
	 * Returns the meta object for class '{@link SecuriyConcept.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see SecuriyConcept.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SecuriyConcept.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link SecuriyConcept.Data#getDataID <em>Data ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data ID</em>'.
	 * @see SecuriyConcept.Data#getDataID()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_DataID();

	/**
	 * Returns the meta object for the reference '{@link SecuriyConcept.Data#getIsAn <em>Is An</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is An</em>'.
	 * @see SecuriyConcept.Data#getIsAn()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_IsAn();

	/**
	 * Returns the meta object for enum '{@link SecuriyConcept.SecurityGoalClassType <em>Security Goal Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Goal Class Type</em>'.
	 * @see SecuriyConcept.SecurityGoalClassType
	 * @generated
	 */
	EEnum getSecurityGoalClassType();

	/**
	 * Returns the meta object for enum '{@link SecuriyConcept.Damages <em>Damages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Damages</em>'.
	 * @see SecuriyConcept.Damages
	 * @generated
	 */
	EEnum getDamages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecuriyConceptFactory getSecuriyConceptFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.SecurityGoalImpl <em>Security Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.SecurityGoalImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getSecurityGoal()
		 * @generated
		 */
		EClass SECURITY_GOAL = eINSTANCE.getSecurityGoal();

		/**
		 * The meta object literal for the '<em><b>Security Goal Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GOAL__SECURITY_GOAL_CLASS = eINSTANCE.getSecurityGoal_SecurityGoalClass();

		/**
		 * The meta object literal for the '<em><b>Damage Potential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GOAL__DAMAGE_POTENTIAL = eINSTANCE.getSecurityGoal_DamagePotential();

		/**
		 * The meta object literal for the '<em><b>Depends On Security Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GOAL__DEPENDS_ON_SECURITY_GOAL = eINSTANCE.getSecurityGoal_DependsOnSecurityGoal();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GOAL__DESCRIPTION = eINSTANCE.getSecurityGoal_Description();

		/**
		 * The meta object literal for the '<em><b>Security Goal ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GOAL__SECURITY_GOAL_ID = eINSTANCE.getSecurityGoal_SecurityGoalID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GOAL__NAME = eINSTANCE.getSecurityGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GOAL__ASSET = eINSTANCE.getSecurityGoal_Asset();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GOAL__THREAT = eINSTANCE.getSecurityGoal_Threat();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.ThreatImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__DESCRIPTION = eINSTANCE.getThreat_Description();

		/**
		 * The meta object literal for the '<em><b>Threat ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__THREAT_ID = eINSTANCE.getThreat_ThreatID();

		/**
		 * The meta object literal for the '<em><b>Attack Potential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__ATTACK_POTENTIAL = eINSTANCE.getThreat_AttackPotential();

		/**
		 * The meta object literal for the '<em><b>Securitygoal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__SECURITYGOAL = eINSTANCE.getThreat_Securitygoal();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.ControlImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Control ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__CONTROL_ID = eINSTANCE.getControl_ControlID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NAME = eINSTANCE.getControl_Name();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__DEPENDS_ON = eINSTANCE.getControl_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Mitigates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MITIGATES = eINSTANCE.getControl_Mitigates();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.ComponentImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Is An</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IS_AN = eINSTANCE.getComponent_IsAn();

		/**
		 * The meta object literal for the '<em><b>Component ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_ID = eINSTANCE.getComponent_ComponentID();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONNECTION = eINSTANCE.getComponent_Connection();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DATA = eINSTANCE.getComponent_Data();

		/**
		 * The meta object literal for the '<em><b>Has Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HAS_COMPONENT = eINSTANCE.getComponent_HasComponent();

		/**
		 * The meta object literal for the '<em><b>Has Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HAS_ANCESTOR = eINSTANCE.getComponent_HasAncestor();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.FunctionImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.AssetImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '<em><b>Asset ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_ID = eINSTANCE.getAsset_AssetID();

		/**
		 * The meta object literal for the '<em><b>Securitygoal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__SECURITYGOAL = eINSTANCE.getAsset_Securitygoal();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.SecurityConceptImpl <em>Security Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.SecurityConceptImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getSecurityConcept()
		 * @generated
		 */
		EClass SECURITY_CONCEPT = eINSTANCE.getSecurityConcept();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONCEPT__NAME = eINSTANCE.getSecurityConcept_Name();

		/**
		 * The meta object literal for the '<em><b>Security Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONCEPT__SECURITY_GOALS = eINSTANCE.getSecurityConcept_SecurityGoals();

		/**
		 * The meta object literal for the '<em><b>Threats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONCEPT__THREATS = eINSTANCE.getSecurityConcept_Threats();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONCEPT__CONTROLS = eINSTANCE.getSecurityConcept_Controls();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONCEPT__ASSETS = eINSTANCE.getSecurityConcept_Assets();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONCEPT__COMPONENTS = eINSTANCE.getSecurityConcept_Components();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.ConnectionImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Connection ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_ID = eINSTANCE.getConnection_ConnectionID();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__COMPONENT = eINSTANCE.getConnection_Component();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DATA = eINSTANCE.getConnection_Data();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.impl.DataImpl
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Data ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DATA_ID = eINSTANCE.getData_DataID();

		/**
		 * The meta object literal for the '<em><b>Is An</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__IS_AN = eINSTANCE.getData_IsAn();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.SecurityGoalClassType <em>Security Goal Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.SecurityGoalClassType
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getSecurityGoalClassType()
		 * @generated
		 */
		EEnum SECURITY_GOAL_CLASS_TYPE = eINSTANCE.getSecurityGoalClassType();

		/**
		 * The meta object literal for the '{@link SecuriyConcept.Damages <em>Damages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecuriyConcept.Damages
		 * @see SecuriyConcept.impl.SecuriyConceptPackageImpl#getDamages()
		 * @generated
		 */
		EEnum DAMAGES = eINSTANCE.getDamages();

	}

} //SecuriyConceptPackage
