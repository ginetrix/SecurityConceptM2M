/**
 */
package SecuriyConcept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecuriyConcept.Asset#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.Asset#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link SecuriyConcept.Asset#getSecuritygoal <em>Securitygoal</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecuriyConcept.SecuriyConceptPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject {
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
	 * @see SecuriyConcept.SecuriyConceptPackage#getAsset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Asset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset ID</em>' attribute.
	 * @see #setAssetID(int)
	 * @see SecuriyConcept.SecuriyConceptPackage#getAsset_AssetID()
	 * @model
	 * @generated
	 */
	int getAssetID();

	/**
	 * Sets the value of the '{@link SecuriyConcept.Asset#getAssetID <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset ID</em>' attribute.
	 * @see #getAssetID()
	 * @generated
	 */
	void setAssetID(int value);

	/**
	 * Returns the value of the '<em><b>Securitygoal</b></em>' reference list.
	 * The list contents are of type {@link SecuriyConcept.SecurityGoal}.
	 * It is bidirectional and its opposite is '{@link SecuriyConcept.SecurityGoal#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitygoal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitygoal</em>' reference list.
	 * @see SecuriyConcept.SecuriyConceptPackage#getAsset_Securitygoal()
	 * @see SecuriyConcept.SecurityGoal#getAsset
	 * @model opposite="asset"
	 * @generated
	 */
	EList<SecurityGoal> getSecuritygoal();

} // Asset
