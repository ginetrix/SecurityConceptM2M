/**
 */
package SC.impl;

import SC.Asset;
import SC.Component;
import SC.SCPackage;
import SC.SecurityGoal;

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
 * </p>
 * <ul>
 *   <li>{@link SC.impl.AssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getSecuritygoals <em>Securitygoals</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getComponent <em>Component</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getSecuritygoals() <em>Securitygoals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritygoals()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGoal> securitygoals;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

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
		return SCPackage.Literals.ASSET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.ASSET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.ASSET__ASSET_ID, oldAssetID, assetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGoal> getSecuritygoals() {
		if (securitygoals == null) {
			securitygoals = new EObjectWithInverseResolvingEList<SecurityGoal>(SecurityGoal.class, this, SCPackage.ASSET__SECURITYGOALS, SCPackage.SECURITY_GOAL__ASSET);
		}
		return securitygoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.ASSET__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCPackage.ASSET__COMPONENT, oldComponent, newComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, SCPackage.COMPONENT__ASSET, Component.class, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, SCPackage.COMPONENT__ASSET, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.ASSET__COMPONENT, newComponent, newComponent));
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
			case SCPackage.ASSET__SECURITYGOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecuritygoals()).basicAdd(otherEnd, msgs);
			case SCPackage.ASSET__COMPONENT:
				if (component != null)
					msgs = ((InternalEObject)component).eInverseRemove(this, SCPackage.COMPONENT__ASSET, Component.class, msgs);
				return basicSetComponent((Component)otherEnd, msgs);
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
			case SCPackage.ASSET__SECURITYGOALS:
				return ((InternalEList<?>)getSecuritygoals()).basicRemove(otherEnd, msgs);
			case SCPackage.ASSET__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case SCPackage.ASSET__NAME:
				return getName();
			case SCPackage.ASSET__ASSET_ID:
				return getAssetID();
			case SCPackage.ASSET__SECURITYGOALS:
				return getSecuritygoals();
			case SCPackage.ASSET__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case SCPackage.ASSET__NAME:
				setName((String)newValue);
				return;
			case SCPackage.ASSET__ASSET_ID:
				setAssetID((Integer)newValue);
				return;
			case SCPackage.ASSET__SECURITYGOALS:
				getSecuritygoals().clear();
				getSecuritygoals().addAll((Collection<? extends SecurityGoal>)newValue);
				return;
			case SCPackage.ASSET__COMPONENT:
				setComponent((Component)newValue);
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
			case SCPackage.ASSET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SCPackage.ASSET__ASSET_ID:
				setAssetID(ASSET_ID_EDEFAULT);
				return;
			case SCPackage.ASSET__SECURITYGOALS:
				getSecuritygoals().clear();
				return;
			case SCPackage.ASSET__COMPONENT:
				setComponent((Component)null);
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
			case SCPackage.ASSET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SCPackage.ASSET__ASSET_ID:
				return assetID != ASSET_ID_EDEFAULT;
			case SCPackage.ASSET__SECURITYGOALS:
				return securitygoals != null && !securitygoals.isEmpty();
			case SCPackage.ASSET__COMPONENT:
				return component != null;
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
