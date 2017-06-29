/**
 */
package SC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SC.Data#getName <em>Name</em>}</li>
 *   <li>{@link SC.Data#getDataID <em>Data ID</em>}</li>
 *   <li>{@link SC.Data#getAsset <em>Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @see SC.SCPackage#getData()
 * @model extendedMetaData="name='SecurityGoal'"
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
	 * @see SC.SCPackage#getData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SC.Data#getName <em>Name</em>}' attribute.
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
	 * @see SC.SCPackage#getData_DataID()
	 * @model
	 * @generated
	 */
	int getDataID();

	/**
	 * Sets the value of the '{@link SC.Data#getDataID <em>Data ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data ID</em>' attribute.
	 * @see #getDataID()
	 * @generated
	 */
	void setDataID(int value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see SC.SCPackage#getData_Asset()
	 * @model keys="assetID"
	 *        extendedMetaData="name='SecurityGoal'"
	 * @generated
	 */
	Asset getAsset();

	/**
	 * Sets the value of the '{@link SC.Data#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	void setAsset(Asset value);

} // Data
