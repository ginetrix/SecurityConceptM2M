/**
 */
package SecuriyConcept.impl;

import SecuriyConcept.Asset;
import SecuriyConcept.Component;
import SecuriyConcept.Connection;
import SecuriyConcept.Data;
import SecuriyConcept.SecuriyConceptPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecuriyConcept.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ComponentImpl#getIsAn <em>Is An</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ComponentImpl#getComponentID <em>Component ID</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ComponentImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ComponentImpl#getData <em>Data</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ComponentImpl#getHasComponent <em>Has Component</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ComponentImpl#getHasAncestor <em>Has Ancestor</em>}</li>
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
	 * The cached value of the '{@link #getIsAn() <em>Is An</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAn()
	 * @generated
	 * @ordered
	 */
	protected Asset isAn;

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
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getHasComponent() <em>Has Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> hasComponent;

	/**
	 * The cached value of the '{@link #getHasAncestor() <em>Has Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAncestor()
	 * @generated
	 * @ordered
	 */
	protected Component hasAncestor;

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
		return SecuriyConceptPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.COMPONENT__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecuriyConceptPackage.COMPONENT__IS_AN, oldIsAn, isAn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.COMPONENT__IS_AN, oldIsAn, isAn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.COMPONENT__COMPONENT_ID, oldComponentID, componentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectWithInverseResolvingEList.ManyInverse<Connection>(Connection.class, this, SecuriyConceptPackage.COMPONENT__CONNECTION, SecuriyConceptPackage.CONNECTION__COMPONENT);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, SecuriyConceptPackage.COMPONENT__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getHasComponent() {
		if (hasComponent == null) {
			hasComponent = new EObjectWithInverseResolvingEList<Component>(Component.class, this, SecuriyConceptPackage.COMPONENT__HAS_COMPONENT, SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR);
		}
		return hasComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getHasAncestor() {
		if (hasAncestor != null && hasAncestor.eIsProxy()) {
			InternalEObject oldHasAncestor = (InternalEObject)hasAncestor;
			hasAncestor = (Component)eResolveProxy(oldHasAncestor);
			if (hasAncestor != oldHasAncestor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR, oldHasAncestor, hasAncestor));
			}
		}
		return hasAncestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetHasAncestor() {
		return hasAncestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasAncestor(Component newHasAncestor, NotificationChain msgs) {
		Component oldHasAncestor = hasAncestor;
		hasAncestor = newHasAncestor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR, oldHasAncestor, newHasAncestor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAncestor(Component newHasAncestor) {
		if (newHasAncestor != hasAncestor) {
			NotificationChain msgs = null;
			if (hasAncestor != null)
				msgs = ((InternalEObject)hasAncestor).eInverseRemove(this, SecuriyConceptPackage.COMPONENT__HAS_COMPONENT, Component.class, msgs);
			if (newHasAncestor != null)
				msgs = ((InternalEObject)newHasAncestor).eInverseAdd(this, SecuriyConceptPackage.COMPONENT__HAS_COMPONENT, Component.class, msgs);
			msgs = basicSetHasAncestor(newHasAncestor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR, newHasAncestor, newHasAncestor));
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
			case SecuriyConceptPackage.COMPONENT__CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnection()).basicAdd(otherEnd, msgs);
			case SecuriyConceptPackage.COMPONENT__HAS_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasComponent()).basicAdd(otherEnd, msgs);
			case SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR:
				if (hasAncestor != null)
					msgs = ((InternalEObject)hasAncestor).eInverseRemove(this, SecuriyConceptPackage.COMPONENT__HAS_COMPONENT, Component.class, msgs);
				return basicSetHasAncestor((Component)otherEnd, msgs);
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
			case SecuriyConceptPackage.COMPONENT__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case SecuriyConceptPackage.COMPONENT__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case SecuriyConceptPackage.COMPONENT__HAS_COMPONENT:
				return ((InternalEList<?>)getHasComponent()).basicRemove(otherEnd, msgs);
			case SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR:
				return basicSetHasAncestor(null, msgs);
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
			case SecuriyConceptPackage.COMPONENT__NAME:
				return getName();
			case SecuriyConceptPackage.COMPONENT__IS_AN:
				if (resolve) return getIsAn();
				return basicGetIsAn();
			case SecuriyConceptPackage.COMPONENT__COMPONENT_ID:
				return getComponentID();
			case SecuriyConceptPackage.COMPONENT__CONNECTION:
				return getConnection();
			case SecuriyConceptPackage.COMPONENT__DATA:
				return getData();
			case SecuriyConceptPackage.COMPONENT__HAS_COMPONENT:
				return getHasComponent();
			case SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR:
				if (resolve) return getHasAncestor();
				return basicGetHasAncestor();
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
			case SecuriyConceptPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case SecuriyConceptPackage.COMPONENT__IS_AN:
				setIsAn((Asset)newValue);
				return;
			case SecuriyConceptPackage.COMPONENT__COMPONENT_ID:
				setComponentID((Integer)newValue);
				return;
			case SecuriyConceptPackage.COMPONENT__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case SecuriyConceptPackage.COMPONENT__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case SecuriyConceptPackage.COMPONENT__HAS_COMPONENT:
				getHasComponent().clear();
				getHasComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR:
				setHasAncestor((Component)newValue);
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
			case SecuriyConceptPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecuriyConceptPackage.COMPONENT__IS_AN:
				setIsAn((Asset)null);
				return;
			case SecuriyConceptPackage.COMPONENT__COMPONENT_ID:
				setComponentID(COMPONENT_ID_EDEFAULT);
				return;
			case SecuriyConceptPackage.COMPONENT__CONNECTION:
				getConnection().clear();
				return;
			case SecuriyConceptPackage.COMPONENT__DATA:
				getData().clear();
				return;
			case SecuriyConceptPackage.COMPONENT__HAS_COMPONENT:
				getHasComponent().clear();
				return;
			case SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR:
				setHasAncestor((Component)null);
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
			case SecuriyConceptPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecuriyConceptPackage.COMPONENT__IS_AN:
				return isAn != null;
			case SecuriyConceptPackage.COMPONENT__COMPONENT_ID:
				return componentID != COMPONENT_ID_EDEFAULT;
			case SecuriyConceptPackage.COMPONENT__CONNECTION:
				return connection != null && !connection.isEmpty();
			case SecuriyConceptPackage.COMPONENT__DATA:
				return data != null && !data.isEmpty();
			case SecuriyConceptPackage.COMPONENT__HAS_COMPONENT:
				return hasComponent != null && !hasComponent.isEmpty();
			case SecuriyConceptPackage.COMPONENT__HAS_ANCESTOR:
				return hasAncestor != null;
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
