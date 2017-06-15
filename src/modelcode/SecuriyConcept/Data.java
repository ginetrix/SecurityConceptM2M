/**
 */
package SecuriyConcept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecuriyConcept.Data#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.Data#getDataID <em>Data ID</em>}</li>
 *   <li>{@link SecuriyConcept.Data#getIsAn <em>Is An</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecuriyConcept.SecuriyConceptPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
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
	 * @see SecuriyConcept.SecuriyConceptPackage#getData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data ID</em>' attribute.
	 * @see #setDataID(int)
	 * @see SecuriyConcept.SecuriyConceptPackage#getData_DataID()
	 * @model
	 * @generated
	 */
	int getDataID();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Data#getDataID <em>Data ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data ID</em>' attribute.
	 * @see #getDataID()
	 * @generated
	 */
	void setDataID(int value);

	/**
	 * Returns the value of the '<em><b>Is An</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is An</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is An</em>' reference.
	 * @see #setIsAn(Asset)
	 * @see SecuriyConcept.SecuriyConceptPackage#getData_IsAn()
	 * @model
	 * @generated
	 */
	Asset getIsAn();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Data#getIsAn <em>Is An</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is An</em>' reference.
	 * @see #getIsAn()
	 * @generated
	 */
	void setIsAn(Asset value);

} // Data
