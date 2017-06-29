/**
 */
package SC.impl;

import SC.Asset;
import SC.Damages;
import SC.SCPackage;
import SC.SecurityGoal;
import SC.SecurityGoalClassType;
import SC.Threat;

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
 * An implementation of the model object '<em><b>Security Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SC.impl.SecurityGoalImpl#getSecurityGoalClass <em>Security Goal Class</em>}</li>
 *   <li>{@link SC.impl.SecurityGoalImpl#getDamagePotential <em>Damage Potential</em>}</li>
 *   <li>{@link SC.impl.SecurityGoalImpl#getDependsOnSecurityGoal <em>Depends On Security Goal</em>}</li>
 *   <li>{@link SC.impl.SecurityGoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SC.impl.SecurityGoalImpl#getSecurityGoalID <em>Security Goal ID</em>}</li>
 *   <li>{@link SC.impl.SecurityGoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link SC.impl.SecurityGoalImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link SC.impl.SecurityGoalImpl#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityGoalImpl extends MinimalEObjectImpl.Container implements SecurityGoal {
	/**
	 * The default value of the '{@link #getSecurityGoalClass() <em>Security Goal Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGoalClass()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityGoalClassType SECURITY_GOAL_CLASS_EDEFAULT = SecurityGoalClassType.CONFIDENTIALITY;

	/**
	 * The cached value of the '{@link #getSecurityGoalClass() <em>Security Goal Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGoalClass()
	 * @generated
	 * @ordered
	 */
	protected SecurityGoalClassType securityGoalClass = SECURITY_GOAL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamagePotential() <em>Damage Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamagePotential()
	 * @generated
	 * @ordered
	 */
	protected static final Damages DAMAGE_POTENTIAL_EDEFAULT = Damages.LOW;

	/**
	 * The cached value of the '{@link #getDamagePotential() <em>Damage Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamagePotential()
	 * @generated
	 * @ordered
	 */
	protected Damages damagePotential = DAMAGE_POTENTIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependsOnSecurityGoal() <em>Depends On Security Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOnSecurityGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGoal> dependsOnSecurityGoal;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGoalID() <em>Security Goal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGoalID()
	 * @generated
	 * @ordered
	 */
	protected static final int SECURITY_GOAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecurityGoalID() <em>Security Goal ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGoalID()
	 * @generated
	 * @ordered
	 */
	protected int securityGoalID = SECURITY_GOAL_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The cached value of the '{@link #getThreat() <em>Threat</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCPackage.Literals.SECURITY_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGoalClassType getSecurityGoalClass() {
		return securityGoalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGoalClass(SecurityGoalClassType newSecurityGoalClass) {
		SecurityGoalClassType oldSecurityGoalClass = securityGoalClass;
		securityGoalClass = newSecurityGoalClass == null ? SECURITY_GOAL_CLASS_EDEFAULT : newSecurityGoalClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.SECURITY_GOAL__SECURITY_GOAL_CLASS, oldSecurityGoalClass, securityGoalClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Damages getDamagePotential() {
		return damagePotential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamagePotential(Damages newDamagePotential) {
		Damages oldDamagePotential = damagePotential;
		damagePotential = newDamagePotential == null ? DAMAGE_POTENTIAL_EDEFAULT : newDamagePotential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.SECURITY_GOAL__DAMAGE_POTENTIAL, oldDamagePotential, damagePotential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGoal> getDependsOnSecurityGoal() {
		if (dependsOnSecurityGoal == null) {
			dependsOnSecurityGoal = new EObjectResolvingEList<SecurityGoal>(SecurityGoal.class, this, SCPackage.SECURITY_GOAL__DEPENDS_ON_SECURITY_GOAL);
		}
		return dependsOnSecurityGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.SECURITY_GOAL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecurityGoalID() {
		return securityGoalID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGoalID(int newSecurityGoalID) {
		int oldSecurityGoalID = securityGoalID;
		securityGoalID = newSecurityGoalID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.SECURITY_GOAL__SECURITY_GOAL_ID, oldSecurityGoalID, securityGoalID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.SECURITY_GOAL__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.SECURITY_GOAL__ASSET, oldAsset, asset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCPackage.SECURITY_GOAL__ASSET, oldAsset, newAsset);
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
				msgs = ((InternalEObject)asset).eInverseRemove(this, SCPackage.ASSET__SECURITYGOALS, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, SCPackage.ASSET__SECURITYGOALS, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.SECURITY_GOAL__ASSET, newAsset, newAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getThreat() {
		if (threat == null) {
			threat = new EObjectWithInverseResolvingEList.ManyInverse<Threat>(Threat.class, this, SCPackage.SECURITY_GOAL__THREAT, SCPackage.THREAT__SECURITYGOAL);
		}
		return threat;
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
			case SCPackage.SECURITY_GOAL__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, SCPackage.ASSET__SECURITYGOALS, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
			case SCPackage.SECURITY_GOAL__THREAT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThreat()).basicAdd(otherEnd, msgs);
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
			case SCPackage.SECURITY_GOAL__ASSET:
				return basicSetAsset(null, msgs);
			case SCPackage.SECURITY_GOAL__THREAT:
				return ((InternalEList<?>)getThreat()).basicRemove(otherEnd, msgs);
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
			case SCPackage.SECURITY_GOAL__SECURITY_GOAL_CLASS:
				return getSecurityGoalClass();
			case SCPackage.SECURITY_GOAL__DAMAGE_POTENTIAL:
				return getDamagePotential();
			case SCPackage.SECURITY_GOAL__DEPENDS_ON_SECURITY_GOAL:
				return getDependsOnSecurityGoal();
			case SCPackage.SECURITY_GOAL__DESCRIPTION:
				return getDescription();
			case SCPackage.SECURITY_GOAL__SECURITY_GOAL_ID:
				return getSecurityGoalID();
			case SCPackage.SECURITY_GOAL__NAME:
				return getName();
			case SCPackage.SECURITY_GOAL__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case SCPackage.SECURITY_GOAL__THREAT:
				return getThreat();
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
			case SCPackage.SECURITY_GOAL__SECURITY_GOAL_CLASS:
				setSecurityGoalClass((SecurityGoalClassType)newValue);
				return;
			case SCPackage.SECURITY_GOAL__DAMAGE_POTENTIAL:
				setDamagePotential((Damages)newValue);
				return;
			case SCPackage.SECURITY_GOAL__DEPENDS_ON_SECURITY_GOAL:
				getDependsOnSecurityGoal().clear();
				getDependsOnSecurityGoal().addAll((Collection<? extends SecurityGoal>)newValue);
				return;
			case SCPackage.SECURITY_GOAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SCPackage.SECURITY_GOAL__SECURITY_GOAL_ID:
				setSecurityGoalID((Integer)newValue);
				return;
			case SCPackage.SECURITY_GOAL__NAME:
				setName((String)newValue);
				return;
			case SCPackage.SECURITY_GOAL__ASSET:
				setAsset((Asset)newValue);
				return;
			case SCPackage.SECURITY_GOAL__THREAT:
				getThreat().clear();
				getThreat().addAll((Collection<? extends Threat>)newValue);
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
			case SCPackage.SECURITY_GOAL__SECURITY_GOAL_CLASS:
				setSecurityGoalClass(SECURITY_GOAL_CLASS_EDEFAULT);
				return;
			case SCPackage.SECURITY_GOAL__DAMAGE_POTENTIAL:
				setDamagePotential(DAMAGE_POTENTIAL_EDEFAULT);
				return;
			case SCPackage.SECURITY_GOAL__DEPENDS_ON_SECURITY_GOAL:
				getDependsOnSecurityGoal().clear();
				return;
			case SCPackage.SECURITY_GOAL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SCPackage.SECURITY_GOAL__SECURITY_GOAL_ID:
				setSecurityGoalID(SECURITY_GOAL_ID_EDEFAULT);
				return;
			case SCPackage.SECURITY_GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SCPackage.SECURITY_GOAL__ASSET:
				setAsset((Asset)null);
				return;
			case SCPackage.SECURITY_GOAL__THREAT:
				getThreat().clear();
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
			case SCPackage.SECURITY_GOAL__SECURITY_GOAL_CLASS:
				return securityGoalClass != SECURITY_GOAL_CLASS_EDEFAULT;
			case SCPackage.SECURITY_GOAL__DAMAGE_POTENTIAL:
				return damagePotential != DAMAGE_POTENTIAL_EDEFAULT;
			case SCPackage.SECURITY_GOAL__DEPENDS_ON_SECURITY_GOAL:
				return dependsOnSecurityGoal != null && !dependsOnSecurityGoal.isEmpty();
			case SCPackage.SECURITY_GOAL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SCPackage.SECURITY_GOAL__SECURITY_GOAL_ID:
				return securityGoalID != SECURITY_GOAL_ID_EDEFAULT;
			case SCPackage.SECURITY_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SCPackage.SECURITY_GOAL__ASSET:
				return asset != null;
			case SCPackage.SECURITY_GOAL__THREAT:
				return threat != null && !threat.isEmpty();
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
		result.append(" (securityGoalClass: ");
		result.append(securityGoalClass);
		result.append(", damagePotential: ");
		result.append(damagePotential);
		result.append(", description: ");
		result.append(description);
		result.append(", securityGoalID: ");
		result.append(securityGoalID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SecurityGoalImpl
