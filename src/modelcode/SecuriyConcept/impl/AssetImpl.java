/**
 */
package SecuriyConcept.impl;

import SecuriyConcept.Asset;
import SecuriyConcept.SecurityGoal;
import SecuriyConcept.SecuriyConceptPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecuriyConcept.impl.AssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.impl.AssetImpl#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link SecuriyConcept.impl.AssetImpl#getSecuritygoal <em>Securitygoal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetID() <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetID()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSET_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssetID() <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetID()
	 * @generated
	 * @ordered
	 */
	protected int assetID = ASSET_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecuritygoal() <em>Securitygoal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritygoal()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGoal> securitygoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuriyConceptPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.ASSET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssetID() {
		return assetID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetID(int newAssetID) {
		int oldAssetID = assetID;
		assetID = newAssetID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.ASSET__ASSET_ID, oldAssetID, assetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGoal> getSecuritygoal() {
		if (securitygoal == null) {
			securitygoal = new EObjectWithInverseResolvingEList<SecurityGoal>(SecurityGoal.class, this, SecuriyConceptPackage.ASSET__SECURITYGOAL, SecuriyConceptPackage.SECURITY_GOAL__ASSET);
		}
		return securitygoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecuriyConceptPackage.ASSET__SECURITYGOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecuritygoal()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecuriyConceptPackage.ASSET__SECURITYGOAL:
				return ((InternalEList<?>)getSecuritygoal()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuriyConceptPackage.ASSET__NAME:
				return getName();
			case SecuriyConceptPackage.ASSET__ASSET_ID:
				return getAssetID();
			case SecuriyConceptPackage.ASSET__SECURITYGOAL:
				return getSecuritygoal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecuriyConceptPackage.ASSET__NAME:
				setName((String)newValue);
				return;
			case SecuriyConceptPackage.ASSET__ASSET_ID:
				setAssetID((Integer)newValue);
				return;
			case SecuriyConceptPackage.ASSET__SECURITYGOAL:
				getSecuritygoal().clear();
				getSecuritygoal().addAll((Collection<? extends SecurityGoal>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SecuriyConceptPackage.ASSET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecuriyConceptPackage.ASSET__ASSET_ID:
				setAssetID(ASSET_ID_EDEFAULT);
				return;
			case SecuriyConceptPackage.ASSET__SECURITYGOAL:
				getSecuritygoal().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecuriyConceptPackage.ASSET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecuriyConceptPackage.ASSET__ASSET_ID:
				return assetID != ASSET_ID_EDEFAULT;
			case SecuriyConceptPackage.ASSET__SECURITYGOAL:
				return securitygoal != null && !securitygoal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", assetID: ");
		result.append(assetID);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
