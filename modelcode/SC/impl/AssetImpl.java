/**
 */
package SC.impl;

import SC.Asset;
import SC.Component;
import SC.Control;
import SC.Data;
import SC.SCPackage;
import SC.SecurityGoal;

import SC.Threat;
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
 *   <li>{@link SC.impl.AssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getData <em>Data</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getThreats <em>Threats</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link SC.impl.AssetImpl#getAggregatedComponents <em>Aggregated Components</em>}</li>
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
	 * The cached value of the '{@link #getSecurityGoals() <em>Security Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGoal> securityGoals;

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
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getThreats() <em>Threats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threats;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * The default value of the '{@link #getAggregatedComponents() <em>Aggregated Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedComponents()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATED_COMPONENTS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getAggregatedComponents() <em>Aggregated Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedComponents()
	 * @generated
	 * @ordered
	 */
	protected String aggregatedComponents = AGGREGATED_COMPONENTS_EDEFAULT;

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
	public EList<SecurityGoal> getSecurityGoals() {
		if (securityGoals == null) {
			securityGoals = new EObjectWithInverseResolvingEList<SecurityGoal>(SecurityGoal.class, this, SCPackage.ASSET__SECURITY_GOALS, SCPackage.SECURITY_GOAL__ASSET);
		}
		return securityGoals;
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
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.ASSET__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Data newData, NotificationChain msgs) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCPackage.ASSET__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, SCPackage.DATA__ASSET, Data.class, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, SCPackage.DATA__ASSET, Data.class, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.ASSET__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getThreats() {
		if (threats == null) {
			threats = new EObjectWithInverseResolvingEList<Threat>(Threat.class, this, SCPackage.ASSET__THREATS, SCPackage.THREAT__ASSET);
		}
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectWithInverseResolvingEList.ManyInverse<Control>(Control.class, this, SCPackage.ASSET__CONTROLS, SCPackage.CONTROL__ASSET);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregatedComponents() {
		return aggregatedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregatedComponents(String newAggregatedComponents) {
		String oldAggregatedComponents = aggregatedComponents;
		aggregatedComponents = newAggregatedComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.ASSET__AGGREGATED_COMPONENTS, oldAggregatedComponents, aggregatedComponents));
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
			case SCPackage.ASSET__SECURITY_GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecurityGoals()).basicAdd(otherEnd, msgs);
			case SCPackage.ASSET__COMPONENT:
				if (component != null)
					msgs = ((InternalEObject)component).eInverseRemove(this, SCPackage.COMPONENT__ASSET, Component.class, msgs);
				return basicSetComponent((Component)otherEnd, msgs);
			case SCPackage.ASSET__DATA:
				if (data != null)
					msgs = ((InternalEObject)data).eInverseRemove(this, SCPackage.DATA__ASSET, Data.class, msgs);
				return basicSetData((Data)otherEnd, msgs);
			case SCPackage.ASSET__THREATS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThreats()).basicAdd(otherEnd, msgs);
			case SCPackage.ASSET__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
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
			case SCPackage.ASSET__SECURITY_GOALS:
				return ((InternalEList<?>)getSecurityGoals()).basicRemove(otherEnd, msgs);
			case SCPackage.ASSET__COMPONENT:
				return basicSetComponent(null, msgs);
			case SCPackage.ASSET__DATA:
				return basicSetData(null, msgs);
			case SCPackage.ASSET__THREATS:
				return ((InternalEList<?>)getThreats()).basicRemove(otherEnd, msgs);
			case SCPackage.ASSET__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
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
			case SCPackage.ASSET__SECURITY_GOALS:
				return getSecurityGoals();
			case SCPackage.ASSET__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case SCPackage.ASSET__DATA:
				if (resolve) return getData();
				return basicGetData();
			case SCPackage.ASSET__THREATS:
				return getThreats();
			case SCPackage.ASSET__CONTROLS:
				return getControls();
			case SCPackage.ASSET__AGGREGATED_COMPONENTS:
				return getAggregatedComponents();
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
			case SCPackage.ASSET__SECURITY_GOALS:
				getSecurityGoals().clear();
				getSecurityGoals().addAll((Collection<? extends SecurityGoal>)newValue);
				return;
			case SCPackage.ASSET__COMPONENT:
				setComponent((Component)newValue);
				return;
			case SCPackage.ASSET__DATA:
				setData((Data)newValue);
				return;
			case SCPackage.ASSET__THREATS:
				getThreats().clear();
				getThreats().addAll((Collection<? extends Threat>)newValue);
				return;
			case SCPackage.ASSET__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case SCPackage.ASSET__AGGREGATED_COMPONENTS:
				setAggregatedComponents((String)newValue);
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
			case SCPackage.ASSET__SECURITY_GOALS:
				getSecurityGoals().clear();
				return;
			case SCPackage.ASSET__COMPONENT:
				setComponent((Component)null);
				return;
			case SCPackage.ASSET__DATA:
				setData((Data)null);
				return;
			case SCPackage.ASSET__THREATS:
				getThreats().clear();
				return;
			case SCPackage.ASSET__CONTROLS:
				getControls().clear();
				return;
			case SCPackage.ASSET__AGGREGATED_COMPONENTS:
				setAggregatedComponents(AGGREGATED_COMPONENTS_EDEFAULT);
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
			case SCPackage.ASSET__SECURITY_GOALS:
				return securityGoals != null && !securityGoals.isEmpty();
			case SCPackage.ASSET__COMPONENT:
				return component != null;
			case SCPackage.ASSET__DATA:
				return data != null;
			case SCPackage.ASSET__THREATS:
				return threats != null && !threats.isEmpty();
			case SCPackage.ASSET__CONTROLS:
				return controls != null && !controls.isEmpty();
			case SCPackage.ASSET__AGGREGATED_COMPONENTS:
				return AGGREGATED_COMPONENTS_EDEFAULT == null ? aggregatedComponents != null : !AGGREGATED_COMPONENTS_EDEFAULT.equals(aggregatedComponents);
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
		result.append(", aggregatedComponents: ");
		result.append(aggregatedComponents);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
