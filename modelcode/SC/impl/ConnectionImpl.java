/**
 */
package SC.impl;

import SC.Component;
import SC.Connection;
import SC.Data;
import SC.SCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SC.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link SC.impl.ConnectionImpl#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link SC.impl.ConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link SC.impl.ConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link SC.impl.ConnectionImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
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
	 * The default value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected int connectionID = CONNECTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Component source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Component target;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCPackage.Literals.CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.CONNECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConnectionID() {
		return connectionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionID(int newConnectionID) {
		int oldConnectionID = connectionID;
		connectionID = newConnectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.CONNECTION__CONNECTION_ID, oldConnectionID, connectionID));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.CONNECTION__DATA, oldData, data));
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
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.CONNECTION__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Component)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.CONNECTION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Component newSource) {
		Component oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.CONNECTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Component)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.CONNECTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Component newTarget) {
		Component oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.CONNECTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SCPackage.CONNECTION__NAME:
				return getName();
			case SCPackage.CONNECTION__CONNECTION_ID:
				return getConnectionID();
			case SCPackage.CONNECTION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SCPackage.CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SCPackage.CONNECTION__DATA:
				if (resolve) return getData();
				return basicGetData();
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
			case SCPackage.CONNECTION__NAME:
				setName((String)newValue);
				return;
			case SCPackage.CONNECTION__CONNECTION_ID:
				setConnectionID((Integer)newValue);
				return;
			case SCPackage.CONNECTION__SOURCE:
				setSource((Component)newValue);
				return;
			case SCPackage.CONNECTION__TARGET:
				setTarget((Component)newValue);
				return;
			case SCPackage.CONNECTION__DATA:
				setData((Data)newValue);
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
			case SCPackage.CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SCPackage.CONNECTION__CONNECTION_ID:
				setConnectionID(CONNECTION_ID_EDEFAULT);
				return;
			case SCPackage.CONNECTION__SOURCE:
				setSource((Component)null);
				return;
			case SCPackage.CONNECTION__TARGET:
				setTarget((Component)null);
				return;
			case SCPackage.CONNECTION__DATA:
				setData((Data)null);
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
			case SCPackage.CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SCPackage.CONNECTION__CONNECTION_ID:
				return connectionID != CONNECTION_ID_EDEFAULT;
			case SCPackage.CONNECTION__SOURCE:
				return source != null;
			case SCPackage.CONNECTION__TARGET:
				return target != null;
			case SCPackage.CONNECTION__DATA:
				return data != null;
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
		result.append(", connectionID: ");
		result.append(connectionID);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
