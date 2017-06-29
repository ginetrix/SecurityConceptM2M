/**
 */
package SC.tests;

import SC.SCFactory;
import SC.SecurityConcept;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Concept</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityConceptTest extends TestCase {

	/**
	 * The fixture for this Security Concept test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityConcept fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityConceptTest.class);
	}

	/**
	 * Constructs a new Security Concept test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConceptTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Concept test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityConcept fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Concept test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityConcept getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SCFactory.eINSTANCE.createSecurityConcept());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SecurityConceptTest
