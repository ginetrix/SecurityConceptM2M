/**
 */
package SecuriyConcept.impl;

import SecuriyConcept.Asset;
import SecuriyConcept.Data;
import SecuriyConcept.SecuriyConceptPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecuriyConcept.impl.DataImpl#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.impl.DataImpl#getDataID <em>Data ID</em>}</li>
 *   <li>{@link SecuriyConcept.impl.DataImpl#getIsAn <em>Is An</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
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
	 * The default value of the '{@link #getDataID() <em>Data ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataID()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataID() <em>Data ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataID()
	 * @generated
	 * @ordered
	 */
	protected int dataID = DATA_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsAn() <em>Is An</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAn()
	 * @generated
	 * @ordered
	 */
	protected Asset isAn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuriyConceptPackage.Literals.DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataID() {
		return dataID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataID(int newDataID) {
		int oldDataID = dataID;
		dataID = newDataID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.DATA__DATA_ID, oldDataID, dataID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getIsAn() {
		if (isAn != null && isAn.eIsProxy()) {
			InternalEObject oldIsAn = (InternalEObject)isAn;
			isAn = (Asset)eResolveProxy(oldIsAn);
			if (isAn != oldIsAn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecuriyConceptPackage.DATA__IS_AN, oldIsAn, isAn));
			}
		}
		return isAn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetIsAn() {
		return isAn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAn(Asset newIsAn) {
		Asset oldIsAn = isAn;
		isAn = newIsAn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.DATA__IS_AN, oldIsAn, isAn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuriyConceptPackage.DATA__NAME:
				return getName();
			case SecuriyConceptPackage.DATA__DATA_ID:
				return getDataID();
			case SecuriyConceptPackage.DATA__IS_AN:
				if (resolve) return getIsAn();
				return basicGetIsAn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecuriyConceptPackage.DATA__NAME:
				setName((String)newValue);
				return;
			case SecuriyConceptPackage.DATA__DATA_ID:
				setDataID((Integer)newValue);
				return;
			case SecuriyConceptPackage.DATA__IS_AN:
				setIsAn((Asset)newValue);
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
			case SecuriyConceptPackage.DATA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecuriyConceptPackage.DATA__DATA_ID:
				setDataID(DATA_ID_EDEFAULT);
				return;
			case SecuriyConceptPackage.DATA__IS_AN:
				setIsAn((Asset)null);
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
			case SecuriyConceptPackage.DATA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecuriyConceptPackage.DATA__DATA_ID:
				return dataID != DATA_ID_EDEFAULT;
			case SecuriyConceptPackage.DATA__IS_AN:
				return isAn != null;
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
		result.append(", dataID: ");
		result.append(dataID);
		result.append(')');
		return result.toString();
	}

} //DataImpl
