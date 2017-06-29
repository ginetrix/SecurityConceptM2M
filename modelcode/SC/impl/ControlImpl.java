/**
 */
package SC.impl;

import SC.Control;
import SC.SCPackage;
import SC.SecurityGoal;
import SC.Threat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SC.impl.ControlImpl#getControlID <em>Control ID</em>}</li>
 *   <li>{@link SC.impl.ControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link SC.impl.ControlImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link SC.impl.ControlImpl#getMitigates <em>Mitigates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends MinimalEObjectImpl.Container implements Control {
	/**
	 * The default value of the '{@link #getControlID() <em>Control ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlID()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTROL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getControlID() <em>Control ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlID()
	 * @generated
	 * @ordered
	 */
	protected int controlID = CONTROL_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGoal> dependsOn;

	/**
	 * The cached value of the '{@link #getMitigates() <em>Mitigates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigates()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> mitigates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getControlID() {
		return controlID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlID(int newControlID) {
		int oldControlID = controlID;
		controlID = newControlID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.CONTROL__CONTROL_ID, oldControlID, controlID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGoal> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectResolvingEList<SecurityGoal>(SecurityGoal.class, this, SCPackage.CONTROL__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getMitigates() {
		if (mitigates == null) {
			mitigates = new EObjectResolvingEList<Threat>(Threat.class, this, SCPackage.CONTROL__MITIGATES);
		}
		return mitigates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SCPackage.CONTROL__CONTROL_ID:
				return getControlID();
			case SCPackage.CONTROL__NAME:
				return getName();
			case SCPackage.CONTROL__DEPENDS_ON:
				return getDependsOn();
			case SCPackage.CONTROL__MITIGATES:
				return getMitigates();
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
			case SCPackage.CONTROL__CONTROL_ID:
				setControlID((Integer)newValue);
				return;
			case SCPackage.CONTROL__NAME:
				setName((String)newValue);
				return;
			case SCPackage.CONTROL__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends SecurityGoal>)newValue);
				return;
			case SCPackage.CONTROL__MITIGATES:
				getMitigates().clear();
				getMitigates().addAll((Collection<? extends Threat>)newValue);
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
			case SCPackage.CONTROL__CONTROL_ID:
				setControlID(CONTROL_ID_EDEFAULT);
				return;
			case SCPackage.CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SCPackage.CONTROL__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case SCPackage.CONTROL__MITIGATES:
				getMitigates().clear();
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
			case SCPackage.CONTROL__CONTROL_ID:
				return controlID != CONTROL_ID_EDEFAULT;
			case SCPackage.CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SCPackage.CONTROL__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case SCPackage.CONTROL__MITIGATES:
				return mitigates != null && !mitigates.isEmpty();
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
		result.append(" (controlID: ");
		result.append(controlID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
