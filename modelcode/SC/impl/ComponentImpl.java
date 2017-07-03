/**
 */
package SC.impl;

import SC.Asset;
import SC.Component;
import SC.Connection;
import SC.Data;
import SC.SCPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SC.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link SC.impl.ComponentImpl#getComponentID <em>Component ID</em>}</li>
 *   <li>{@link SC.impl.ComponentImpl#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link SC.impl.ComponentImpl#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link SC.impl.ComponentImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link SC.impl.ComponentImpl#getData <em>Data</em>}</li>
 *   <li>{@link SC.impl.ComponentImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The default value of the '{@link #getComponentID() <em>Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentID()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPONENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getComponentID() <em>Component ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentID()
	 * @generated
	 * @ordered
	 */
	protected int componentID = COMPONENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubcomponents() <em>Subcomponents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> subcomponents;

	/**
	 * The cached value of the '{@link #getAncestor() <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncestor()
	 * @generated
	 * @ordered
	 */
	protected Component ancestor;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getComponentID() {
		return componentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentID(int newComponentID) {
		int oldComponentID = componentID;
		componentID = newComponentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.COMPONENT__COMPONENT_ID, oldComponentID, componentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Data>(Data.class, this, SCPackage.COMPONENT__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectResolvingEList<Connection>(Connection.class, this, SCPackage.COMPONENT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getSubcomponents() {
		if (subcomponents == null) {
			subcomponents = new EObjectWithInverseResolvingEList<Component>(Component.class, this, SCPackage.COMPONENT__SUBCOMPONENTS, SCPackage.COMPONENT__ANCESTOR);
		}
		return subcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAncestor() {
		if (ancestor != null && ancestor.eIsProxy()) {
			InternalEObject oldAncestor = (InternalEObject)ancestor;
			ancestor = (Component)eResolveProxy(oldAncestor);
			if (ancestor != oldAncestor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.COMPONENT__ANCESTOR, oldAncestor, ancestor));
			}
		}
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetAncestor() {
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAncestor(Component newAncestor, NotificationChain msgs) {
		Component oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCPackage.COMPONENT__ANCESTOR, oldAncestor, newAncestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAncestor(Component newAncestor) {
		if (newAncestor != ancestor) {
			NotificationChain msgs = null;
			if (ancestor != null)
				msgs = ((InternalEObject)ancestor).eInverseRemove(this, SCPackage.COMPONENT__SUBCOMPONENTS, Component.class, msgs);
			if (newAncestor != null)
				msgs = ((InternalEObject)newAncestor).eInverseAdd(this, SCPackage.COMPONENT__SUBCOMPONENTS, Component.class, msgs);
			msgs = basicSetAncestor(newAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.COMPONENT__ANCESTOR, newAncestor, newAncestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.COMPONENT__ASSET, oldAsset, asset));
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCPackage.COMPONENT__ASSET, oldAsset, newAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, SCPackage.ASSET__COMPONENT, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, SCPackage.ASSET__COMPONENT, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.COMPONENT__ASSET, newAsset, newAsset));
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
			case SCPackage.COMPONENT__SUBCOMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubcomponents()).basicAdd(otherEnd, msgs);
			case SCPackage.COMPONENT__ANCESTOR:
				if (ancestor != null)
					msgs = ((InternalEObject)ancestor).eInverseRemove(this, SCPackage.COMPONENT__SUBCOMPONENTS, Component.class, msgs);
				return basicSetAncestor((Component)otherEnd, msgs);
			case SCPackage.COMPONENT__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, SCPackage.ASSET__COMPONENT, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
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
			case SCPackage.COMPONENT__SUBCOMPONENTS:
				return ((InternalEList<?>)getSubcomponents()).basicRemove(otherEnd, msgs);
			case SCPackage.COMPONENT__ANCESTOR:
				return basicSetAncestor(null, msgs);
			case SCPackage.COMPONENT__ASSET:
				return basicSetAsset(null, msgs);
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
			case SCPackage.COMPONENT__NAME:
				return getName();
			case SCPackage.COMPONENT__COMPONENT_ID:
				return getComponentID();
			case SCPackage.COMPONENT__SUBCOMPONENTS:
				return getSubcomponents();
			case SCPackage.COMPONENT__ANCESTOR:
				if (resolve) return getAncestor();
				return basicGetAncestor();
			case SCPackage.COMPONENT__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case SCPackage.COMPONENT__DATA:
				return getData();
			case SCPackage.COMPONENT__CONNECTIONS:
				return getConnections();
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
			case SCPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case SCPackage.COMPONENT__COMPONENT_ID:
				setComponentID((Integer)newValue);
				return;
			case SCPackage.COMPONENT__SUBCOMPONENTS:
				getSubcomponents().clear();
				getSubcomponents().addAll((Collection<? extends Component>)newValue);
				return;
			case SCPackage.COMPONENT__ANCESTOR:
				setAncestor((Component)newValue);
				return;
			case SCPackage.COMPONENT__ASSET:
				setAsset((Asset)newValue);
				return;
			case SCPackage.COMPONENT__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case SCPackage.COMPONENT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
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
			case SCPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SCPackage.COMPONENT__COMPONENT_ID:
				setComponentID(COMPONENT_ID_EDEFAULT);
				return;
			case SCPackage.COMPONENT__SUBCOMPONENTS:
				getSubcomponents().clear();
				return;
			case SCPackage.COMPONENT__ANCESTOR:
				setAncestor((Component)null);
				return;
			case SCPackage.COMPONENT__ASSET:
				setAsset((Asset)null);
				return;
			case SCPackage.COMPONENT__DATA:
				getData().clear();
				return;
			case SCPackage.COMPONENT__CONNECTIONS:
				getConnections().clear();
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
			case SCPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SCPackage.COMPONENT__COMPONENT_ID:
				return componentID != COMPONENT_ID_EDEFAULT;
			case SCPackage.COMPONENT__SUBCOMPONENTS:
				return subcomponents != null && !subcomponents.isEmpty();
			case SCPackage.COMPONENT__ANCESTOR:
				return ancestor != null;
			case SCPackage.COMPONENT__ASSET:
				return asset != null;
			case SCPackage.COMPONENT__DATA:
				return data != null && !data.isEmpty();
			case SCPackage.COMPONENT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
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
		result.append(", componentID: ");
		result.append(componentID);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
