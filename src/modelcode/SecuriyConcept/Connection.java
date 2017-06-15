/**
 */
package SecuriyConcept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecuriyConcept.Connection#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.Connection#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link SecuriyConcept.Connection#getComponent <em>Component</em>}</li>
 *   <li>{@link SecuriyConcept.Connection#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecuriyConcept.SecuriyConceptPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
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
	 * @see SecuriyConcept.SecuriyConceptPackage#getConnection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection ID</em>' attribute.
	 * @see #setConnectionID(int)
	 * @see SecuriyConcept.SecuriyConceptPackage#getConnection_ConnectionID()
	 * @model
	 * @generated
	 */
	int getConnectionID();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Connection#getConnectionID <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection ID</em>' attribute.
	 * @see #getConnectionID()
	 * @generated
	 */
	void setConnectionID(int value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.Component}.
	 * It is bidirectional and its opposite is '{@link SecuriyConcept.Component#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getConnection_Component()
	 * @see SecuriyConcept.Component#getConnection
	 * @model opposite="connection" lower="2" upper="2"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Data)
	 * @see SecuriyConcept.SecuriyConceptPackage#getConnection_Data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Connection#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // Connection
