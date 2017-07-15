/**
 */
package SC;

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
 * @see SC.SCFactory
 * @model kind="package"
 * @generated
 */
public interface SCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SC";

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
	SCPackage eINSTANCE = SC.impl.SCPackageImpl.init();

	/**
	 * The meta object id for the '{@link SC.impl.SecurityGoalImpl <em>Security Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.SecurityGoalImpl
	 * @see SC.impl.SCPackageImpl#getSecurityGoal()
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
	 * The feature id for the '<em><b>Depends On Security Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__DEPENDS_ON_SECURITY_GOALS = 2;

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
	 * The feature id for the '<em><b>Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__THREATS = 7;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL__COMPONENT = 8;

	/**
	 * The number of structural features of the '<em>Security Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Security Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SC.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.ThreatImpl
	 * @see SC.impl.SCPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 1;

	/**
	 * The feature id for the '<em><b>Threat Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREAT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Threat ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREAT_ID = 2;

	/**
	 * The feature id for the '<em><b>Attack Potential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ATTACK_POTENTIAL = 3;

	/**
	 * The feature id for the '<em><b>Security Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__SECURITY_GOALS = 4;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ASSET = 5;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__CONTROLS = 6;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SC.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.ControlImpl
	 * @see SC.impl.SCPackageImpl#getControl()
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
	 * The feature id for the '<em><b>Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ASSET = 3;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__THREATS = 4;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SC.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.ComponentImpl
	 * @see SC.impl.SCPackageImpl#getComponent()
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
	 * The feature id for the '<em><b>Component ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Subcomponents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUBCOMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANCESTOR = 3;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASSET = 4;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA = 5;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONNECTIONS = 6;

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
	 * The meta object id for the '{@link SC.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.FunctionImpl
	 * @see SC.impl.SCPackageImpl#getFunction()
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
	 * The meta object id for the '{@link SC.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.AssetImpl
	 * @see SC.impl.SCPackageImpl#getAsset()
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
	 * The feature id for the '<em><b>Security Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__SECURITY_GOALS = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__COMPONENTS = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DATA = 4;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__THREATS = 5;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONTROLS = 6;

	/**
	 * The feature id for the '<em><b>Aggregated Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__AGGREGATED_COMPONENTS = 7;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SC.impl.SecurityConceptImpl <em>Security Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.SecurityConceptImpl
	 * @see SC.impl.SCPackageImpl#getSecurityConcept()
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
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT__DATA = 6;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT__CONNECTIONS = 7;

	/**
	 * The number of structural features of the '<em>Security Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Security Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SC.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.ConnectionImpl
	 * @see SC.impl.SCPackageImpl#getConnection()
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
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DATA = 4;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SC.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.impl.DataImpl
	 * @see SC.impl.SCPackageImpl#getData()
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
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ASSET = 2;

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
	 * The meta object id for the '{@link SC.SecurityGoalClassType <em>Security Goal Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.SecurityGoalClassType
	 * @see SC.impl.SCPackageImpl#getSecurityGoalClassType()
	 * @generated
	 */
	int SECURITY_GOAL_CLASS_TYPE = 9;

	/**
	 * The meta object id for the '{@link SC.Damages <em>Damages</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.Damages
	 * @see SC.impl.SCPackageImpl#getDamages()
	 * @generated
	 */
	int DAMAGES = 10;


	/**
	 * The meta object id for the '{@link SC.ThreatClass <em>Threat Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SC.ThreatClass
	 * @see SC.impl.SCPackageImpl#getThreatClass()
	 * @generated
	 */
	int THREAT_CLASS = 11;


	/**
	 * Returns the meta object for class '{@link SC.SecurityGoal <em>Security Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Goal</em>'.
	 * @see SC.SecurityGoal
	 * @generated
	 */
	EClass getSecurityGoal();

	/**
	 * Returns the meta object for the attribute '{@link SC.SecurityGoal#getSecurityGoalClass <em>Security Goal Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Goal Class</em>'.
	 * @see SC.SecurityGoal#getSecurityGoalClass()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_SecurityGoalClass();

	/**
	 * Returns the meta object for the attribute '{@link SC.SecurityGoal#getDamagePotential <em>Damage Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Potential</em>'.
	 * @see SC.SecurityGoal#getDamagePotential()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_DamagePotential();

	/**
	 * Returns the meta object for the reference list '{@link SC.SecurityGoal#getDependsOnSecurityGoals <em>Depends On Security Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On Security Goals</em>'.
	 * @see SC.SecurityGoal#getDependsOnSecurityGoals()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EReference getSecurityGoal_DependsOnSecurityGoals();

	/**
	 * Returns the meta object for the attribute '{@link SC.SecurityGoal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SC.SecurityGoal#getDescription()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_Description();

	/**
	 * Returns the meta object for the attribute '{@link SC.SecurityGoal#getSecurityGoalID <em>Security Goal ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Goal ID</em>'.
	 * @see SC.SecurityGoal#getSecurityGoalID()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_SecurityGoalID();

	/**
	 * Returns the meta object for the attribute '{@link SC.SecurityGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SC.SecurityGoal#getName()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EAttribute getSecurityGoal_Name();

	/**
	 * Returns the meta object for the reference '{@link SC.SecurityGoal#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see SC.SecurityGoal#getAsset()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EReference getSecurityGoal_Asset();

	/**
	 * Returns the meta object for the reference list '{@link SC.SecurityGoal#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threats</em>'.
	 * @see SC.SecurityGoal#getThreats()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EReference getSecurityGoal_Threats();

	/**
	 * Returns the meta object for the reference '{@link SC.SecurityGoal#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see SC.SecurityGoal#getComponent()
	 * @see #getSecurityGoal()
	 * @generated
	 */
	EReference getSecurityGoal_Component();

	/**
	 * Returns the meta object for class '{@link SC.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see SC.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the attribute '{@link SC.Threat#getThreatClass <em>Threat Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threat Class</em>'.
	 * @see SC.Threat#getThreatClass()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_ThreatClass();

	/**
	 * Returns the meta object for the attribute '{@link SC.Threat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SC.Threat#getDescription()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Description();

	/**
	 * Returns the meta object for the attribute '{@link SC.Threat#getThreatID <em>Threat ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threat ID</em>'.
	 * @see SC.Threat#getThreatID()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_ThreatID();

	/**
	 * Returns the meta object for the attribute '{@link SC.Threat#getAttackPotential <em>Attack Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack Potential</em>'.
	 * @see SC.Threat#getAttackPotential()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_AttackPotential();

	/**
	 * Returns the meta object for the reference list '{@link SC.Threat#getSecurityGoals <em>Security Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Goals</em>'.
	 * @see SC.Threat#getSecurityGoals()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_SecurityGoals();

	/**
	 * Returns the meta object for the reference '{@link SC.Threat#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see SC.Threat#getAsset()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Asset();

	/**
	 * Returns the meta object for the reference list '{@link SC.Threat#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see SC.Threat#getControls()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Controls();

	/**
	 * Returns the meta object for class '{@link SC.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see SC.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link SC.Control#getControlID <em>Control ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control ID</em>'.
	 * @see SC.Control#getControlID()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_ControlID();

	/**
	 * Returns the meta object for the attribute '{@link SC.Control#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SC.Control#getName()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Name();

	/**
	 * Returns the meta object for the reference list '{@link SC.Control#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see SC.Control#getDependsOn()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_DependsOn();

	/**
	 * Returns the meta object for the reference list '{@link SC.Control#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset</em>'.
	 * @see SC.Control#getAsset()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Asset();

	/**
	 * Returns the meta object for the reference list '{@link SC.Control#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threats</em>'.
	 * @see SC.Control#getThreats()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Threats();

	/**
	 * Returns the meta object for class '{@link SC.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see SC.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link SC.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SC.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link SC.Component#getComponentID <em>Component ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component ID</em>'.
	 * @see SC.Component#getComponentID()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentID();

	/**
	 * Returns the meta object for the reference list '{@link SC.Component#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see SC.Component#getData()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Data();

	/**
	 * Returns the meta object for the reference list '{@link SC.Component#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see SC.Component#getConnections()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Connections();

	/**
	 * Returns the meta object for the reference list '{@link SC.Component#getSubcomponents <em>Subcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subcomponents</em>'.
	 * @see SC.Component#getSubcomponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Subcomponents();

	/**
	 * Returns the meta object for the reference '{@link SC.Component#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see SC.Component#getAncestor()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ancestor();

	/**
	 * Returns the meta object for the reference '{@link SC.Component#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see SC.Component#getAsset()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Asset();

	/**
	 * Returns the meta object for class '{@link SC.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see SC.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link SC.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see SC.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link SC.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SC.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for the attribute '{@link SC.Asset#getAssetID <em>Asset ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset ID</em>'.
	 * @see SC.Asset#getAssetID()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetID();

	/**
	 * Returns the meta object for the reference list '{@link SC.Asset#getSecurityGoals <em>Security Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Goals</em>'.
	 * @see SC.Asset#getSecurityGoals()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_SecurityGoals();

	/**
	 * Returns the meta object for the reference list '{@link SC.Asset#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see SC.Asset#getComponents()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Components();

	/**
	 * Returns the meta object for the reference '{@link SC.Asset#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see SC.Asset#getData()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Data();

	/**
	 * Returns the meta object for the reference list '{@link SC.Asset#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threats</em>'.
	 * @see SC.Asset#getThreats()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Threats();

	/**
	 * Returns the meta object for the reference list '{@link SC.Asset#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see SC.Asset#getControls()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Controls();

	/**
	 * Returns the meta object for the attribute '{@link SC.Asset#getAggregatedComponents <em>Aggregated Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregated Components</em>'.
	 * @see SC.Asset#getAggregatedComponents()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AggregatedComponents();

	/**
	 * Returns the meta object for class '{@link SC.SecurityConcept <em>Security Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Concept</em>'.
	 * @see SC.SecurityConcept
	 * @generated
	 */
	EClass getSecurityConcept();

	/**
	 * Returns the meta object for the attribute '{@link SC.SecurityConcept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SC.SecurityConcept#getName()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EAttribute getSecurityConcept_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SC.SecurityConcept#getSecurityGoals <em>Security Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Goals</em>'.
	 * @see SC.SecurityConcept#getSecurityGoals()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_SecurityGoals();

	/**
	 * Returns the meta object for the containment reference list '{@link SC.SecurityConcept#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threats</em>'.
	 * @see SC.SecurityConcept#getThreats()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Threats();

	/**
	 * Returns the meta object for the containment reference list '{@link SC.SecurityConcept#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see SC.SecurityConcept#getControls()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link SC.SecurityConcept#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see SC.SecurityConcept#getAssets()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Assets();

	/**
	 * Returns the meta object for the containment reference list '{@link SC.SecurityConcept#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see SC.SecurityConcept#getComponents()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link SC.SecurityConcept#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see SC.SecurityConcept#getData()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link SC.SecurityConcept#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see SC.SecurityConcept#getConnections()
	 * @see #getSecurityConcept()
	 * @generated
	 */
	EReference getSecurityConcept_Connections();

	/**
	 * Returns the meta object for class '{@link SC.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see SC.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link SC.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SC.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link SC.Connection#getConnectionID <em>Connection ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection ID</em>'.
	 * @see SC.Connection#getConnectionID()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionID();

	/**
	 * Returns the meta object for the reference '{@link SC.Connection#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see SC.Connection#getData()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Data();

	/**
	 * Returns the meta object for the reference '{@link SC.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see SC.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link SC.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see SC.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link SC.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see SC.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link SC.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SC.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link SC.Data#getDataID <em>Data ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data ID</em>'.
	 * @see SC.Data#getDataID()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_DataID();

	/**
	 * Returns the meta object for the reference '{@link SC.Data#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see SC.Data#getAsset()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Asset();

	/**
	 * Returns the meta object for enum '{@link SC.SecurityGoalClassType <em>Security Goal Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Goal Class Type</em>'.
	 * @see SC.SecurityGoalClassType
	 * @generated
	 */
	EEnum getSecurityGoalClassType();

	/**
	 * Returns the meta object for enum '{@link SC.Damages <em>Damages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Damages</em>'.
	 * @see SC.Damages
	 * @generated
	 */
	EEnum getDamages();

	/**
	 * Returns the meta object for enum '{@link SC.ThreatClass <em>Threat Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Threat Class</em>'.
	 * @see SC.ThreatClass
	 * @generated
	 */
	EEnum getThreatClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SCFactory getSCFactory();

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
		 * The meta object literal for the '{@link SC.impl.SecurityGoalImpl <em>Security Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.SecurityGoalImpl
		 * @see SC.impl.SCPackageImpl#getSecurityGoal()
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
		 * The meta object literal for the '<em><b>Depends On Security Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GOAL__DEPENDS_ON_SECURITY_GOALS = eINSTANCE.getSecurityGoal_DependsOnSecurityGoals();

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
		 * The meta object literal for the '<em><b>Threats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GOAL__THREATS = eINSTANCE.getSecurityGoal_Threats();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GOAL__COMPONENT = eINSTANCE.getSecurityGoal_Component();

		/**
		 * The meta object literal for the '{@link SC.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.ThreatImpl
		 * @see SC.impl.SCPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Threat Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__THREAT_CLASS = eINSTANCE.getThreat_ThreatClass();

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
		 * The meta object literal for the '<em><b>Security Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__SECURITY_GOALS = eINSTANCE.getThreat_SecurityGoals();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__ASSET = eINSTANCE.getThreat_Asset();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__CONTROLS = eINSTANCE.getThreat_Controls();

		/**
		 * The meta object literal for the '{@link SC.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.ControlImpl
		 * @see SC.impl.SCPackageImpl#getControl()
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
		 * The meta object literal for the '<em><b>Asset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__ASSET = eINSTANCE.getControl_Asset();

		/**
		 * The meta object literal for the '<em><b>Threats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__THREATS = eINSTANCE.getControl_Threats();

		/**
		 * The meta object literal for the '{@link SC.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.ComponentImpl
		 * @see SC.impl.SCPackageImpl#getComponent()
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
		 * The meta object literal for the '<em><b>Component ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_ID = eINSTANCE.getComponent_ComponentID();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DATA = eINSTANCE.getComponent_Data();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONNECTIONS = eINSTANCE.getComponent_Connections();

		/**
		 * The meta object literal for the '<em><b>Subcomponents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SUBCOMPONENTS = eINSTANCE.getComponent_Subcomponents();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ANCESTOR = eINSTANCE.getComponent_Ancestor();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ASSET = eINSTANCE.getComponent_Asset();

		/**
		 * The meta object literal for the '{@link SC.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.FunctionImpl
		 * @see SC.impl.SCPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link SC.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.AssetImpl
		 * @see SC.impl.SCPackageImpl#getAsset()
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
		 * The meta object literal for the '<em><b>Security Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__SECURITY_GOALS = eINSTANCE.getAsset_SecurityGoals();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__COMPONENTS = eINSTANCE.getAsset_Components();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__DATA = eINSTANCE.getAsset_Data();

		/**
		 * The meta object literal for the '<em><b>Threats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__THREATS = eINSTANCE.getAsset_Threats();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__CONTROLS = eINSTANCE.getAsset_Controls();

		/**
		 * The meta object literal for the '<em><b>Aggregated Components</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__AGGREGATED_COMPONENTS = eINSTANCE.getAsset_AggregatedComponents();

		/**
		 * The meta object literal for the '{@link SC.impl.SecurityConceptImpl <em>Security Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.SecurityConceptImpl
		 * @see SC.impl.SCPackageImpl#getSecurityConcept()
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
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONCEPT__DATA = eINSTANCE.getSecurityConcept_Data();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONCEPT__CONNECTIONS = eINSTANCE.getSecurityConcept_Connections();

		/**
		 * The meta object literal for the '{@link SC.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.ConnectionImpl
		 * @see SC.impl.SCPackageImpl#getConnection()
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
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DATA = eINSTANCE.getConnection_Data();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link SC.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.impl.DataImpl
		 * @see SC.impl.SCPackageImpl#getData()
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
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__ASSET = eINSTANCE.getData_Asset();

		/**
		 * The meta object literal for the '{@link SC.SecurityGoalClassType <em>Security Goal Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.SecurityGoalClassType
		 * @see SC.impl.SCPackageImpl#getSecurityGoalClassType()
		 * @generated
		 */
		EEnum SECURITY_GOAL_CLASS_TYPE = eINSTANCE.getSecurityGoalClassType();

		/**
		 * The meta object literal for the '{@link SC.Damages <em>Damages</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.Damages
		 * @see SC.impl.SCPackageImpl#getDamages()
		 * @generated
		 */
		EEnum DAMAGES = eINSTANCE.getDamages();

		/**
		 * The meta object literal for the '{@link SC.ThreatClass <em>Threat Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SC.ThreatClass
		 * @see SC.impl.SCPackageImpl#getThreatClass()
		 * @generated
		 */
		EEnum THREAT_CLASS = eINSTANCE.getThreatClass();

	}

} //SCPackage
