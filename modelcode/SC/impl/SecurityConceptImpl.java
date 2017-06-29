/**
 */
package SC.impl;

import SC.Asset;
import SC.Component;
import SC.Connection;
import SC.Control;
import SC.Data;
import SC.SCPackage;
import SC.SecurityConcept;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SC.impl.SecurityConceptImpl#getName <em>Name</em>}</li>
 *   <li>{@link SC.impl.SecurityConceptImpl#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link SC.impl.SecurityConceptImpl#getThreats <em>Threats</em>}</li>
 *   <li>{@link SC.impl.SecurityConceptImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link SC.impl.SecurityConceptImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link SC.impl.SecurityConceptImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link SC.impl.SecurityConceptImpl#getData <em>Data</em>}</li>
 *   <li>{@link SC.impl.SecurityConceptImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityConceptImpl extends MinimalEObjectImpl.Container implements SecurityConcept {
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
	 * The cached value of the '{@link #getSecurityGoals() <em>Security Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGoal> securityGoals;

	/**
	 * The cached value of the '{@link #getThreats() <em>Threats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threats;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

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
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCPackage.Literals.SECURITY_CONCEPT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.SECURITY_CONCEPT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGoal> getSecurityGoals() {
		if (securityGoals == null) {
			securityGoals = new EObjectContainmentEList<SecurityGoal>(SecurityGoal.class, this, SCPackage.SECURITY_CONCEPT__SECURITY_GOALS);
		}
		return securityGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getThreats() {
		if (threats == null) {
			threats = new EObjectContainmentEList<Threat>(Threat.class, this, SCPackage.SECURITY_CONCEPT__THREATS);
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
			controls = new EObjectContainmentEList<Control>(Control.class, this, SCPackage.SECURITY_CONCEPT__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectContainmentEList<Asset>(Asset.class, this, SCPackage.SECURITY_CONCEPT__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, SCPackage.SECURITY_CONCEPT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, SCPackage.SECURITY_CONCEPT__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, SCPackage.SECURITY_CONCEPT__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCPackage.SECURITY_CONCEPT__SECURITY_GOALS:
				return ((InternalEList<?>)getSecurityGoals()).basicRemove(otherEnd, msgs);
			case SCPackage.SECURITY_CONCEPT__THREATS:
				return ((InternalEList<?>)getThreats()).basicRemove(otherEnd, msgs);
			case SCPackage.SECURITY_CONCEPT__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case SCPackage.SECURITY_CONCEPT__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case SCPackage.SECURITY_CONCEPT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case SCPackage.SECURITY_CONCEPT__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case SCPackage.SECURITY_CONCEPT__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
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
			case SCPackage.SECURITY_CONCEPT__NAME:
				return getName();
			case SCPackage.SECURITY_CONCEPT__SECURITY_GOALS:
				return getSecurityGoals();
			case SCPackage.SECURITY_CONCEPT__THREATS:
				return getThreats();
			case SCPackage.SECURITY_CONCEPT__CONTROLS:
				return getControls();
			case SCPackage.SECURITY_CONCEPT__ASSETS:
				return getAssets();
			case SCPackage.SECURITY_CONCEPT__COMPONENTS:
				return getComponents();
			case SCPackage.SECURITY_CONCEPT__DATA:
				return getData();
			case SCPackage.SECURITY_CONCEPT__CONNECTION:
				return getConnection();
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
			case SCPackage.SECURITY_CONCEPT__NAME:
				setName((String)newValue);
				return;
			case SCPackage.SECURITY_CONCEPT__SECURITY_GOALS:
				getSecurityGoals().clear();
				getSecurityGoals().addAll((Collection<? extends SecurityGoal>)newValue);
				return;
			case SCPackage.SECURITY_CONCEPT__THREATS:
				getThreats().clear();
				getThreats().addAll((Collection<? extends Threat>)newValue);
				return;
			case SCPackage.SECURITY_CONCEPT__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case SCPackage.SECURITY_CONCEPT__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case SCPackage.SECURITY_CONCEPT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case SCPackage.SECURITY_CONCEPT__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
				return;
			case SCPackage.SECURITY_CONCEPT__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
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
			case SCPackage.SECURITY_CONCEPT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SCPackage.SECURITY_CONCEPT__SECURITY_GOALS:
				getSecurityGoals().clear();
				return;
			case SCPackage.SECURITY_CONCEPT__THREATS:
				getThreats().clear();
				return;
			case SCPackage.SECURITY_CONCEPT__CONTROLS:
				getControls().clear();
				return;
			case SCPackage.SECURITY_CONCEPT__ASSETS:
				getAssets().clear();
				return;
			case SCPackage.SECURITY_CONCEPT__COMPONENTS:
				getComponents().clear();
				return;
			case SCPackage.SECURITY_CONCEPT__DATA:
				getData().clear();
				return;
			case SCPackage.SECURITY_CONCEPT__CONNECTION:
				getConnection().clear();
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
			case SCPackage.SECURITY_CONCEPT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SCPackage.SECURITY_CONCEPT__SECURITY_GOALS:
				return securityGoals != null && !securityGoals.isEmpty();
			case SCPackage.SECURITY_CONCEPT__THREATS:
				return threats != null && !threats.isEmpty();
			case SCPackage.SECURITY_CONCEPT__CONTROLS:
				return controls != null && !controls.isEmpty();
			case SCPackage.SECURITY_CONCEPT__ASSETS:
				return assets != null && !assets.isEmpty();
			case SCPackage.SECURITY_CONCEPT__COMPONENTS:
				return components != null && !components.isEmpty();
			case SCPackage.SECURITY_CONCEPT__DATA:
				return data != null && !data.isEmpty();
			case SCPackage.SECURITY_CONCEPT__CONNECTION:
				return connection != null && !connection.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SecurityConceptImpl
