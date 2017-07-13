/**
 */
package SC.impl;

import SC.Asset;
import SC.Damages;
import SC.SCPackage;
import SC.SecurityGoal;
import SC.Threat;

import SC.ThreatClass;
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
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SC.impl.ThreatImpl#getThreatClass <em>Threat Class</em>}</li>
 *   <li>{@link SC.impl.ThreatImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SC.impl.ThreatImpl#getThreatID <em>Threat ID</em>}</li>
 *   <li>{@link SC.impl.ThreatImpl#getAttackPotential <em>Attack Potential</em>}</li>
 *   <li>{@link SC.impl.ThreatImpl#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link SC.impl.ThreatImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreatImpl extends MinimalEObjectImpl.Container implements Threat {
	/**
	 * The default value of the '{@link #getThreatClass() <em>Threat Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatClass()
	 * @generated
	 * @ordered
	 */
	protected static final ThreatClass THREAT_CLASS_EDEFAULT = ThreatClass.SPOOFING;

	/**
	 * The cached value of the '{@link #getThreatClass() <em>Threat Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatClass()
	 * @generated
	 * @ordered
	 */
	protected ThreatClass threatClass = THREAT_CLASS_EDEFAULT;

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
	 * The default value of the '{@link #getThreatID() <em>Threat ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatID()
	 * @generated
	 * @ordered
	 */
	protected static final int THREAT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreatID() <em>Threat ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatID()
	 * @generated
	 * @ordered
	 */
	protected int threatID = THREAT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackPotential() <em>Attack Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackPotential()
	 * @generated
	 * @ordered
	 */
	protected static final Damages ATTACK_POTENTIAL_EDEFAULT = Damages.LOW;

	/**
	 * The cached value of the '{@link #getAttackPotential() <em>Attack Potential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackPotential()
	 * @generated
	 * @ordered
	 */
	protected Damages attackPotential = ATTACK_POTENTIAL_EDEFAULT;

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
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCPackage.Literals.THREAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatClass getThreatClass() {
		return threatClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreatClass(ThreatClass newThreatClass) {
		ThreatClass oldThreatClass = threatClass;
		threatClass = newThreatClass == null ? THREAT_CLASS_EDEFAULT : newThreatClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.THREAT__THREAT_CLASS, oldThreatClass, threatClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.THREAT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreatID() {
		return threatID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreatID(int newThreatID) {
		int oldThreatID = threatID;
		threatID = newThreatID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.THREAT__THREAT_ID, oldThreatID, threatID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Damages getAttackPotential() {
		return attackPotential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackPotential(Damages newAttackPotential) {
		Damages oldAttackPotential = attackPotential;
		attackPotential = newAttackPotential == null ? ATTACK_POTENTIAL_EDEFAULT : newAttackPotential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.THREAT__ATTACK_POTENTIAL, oldAttackPotential, attackPotential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGoal> getSecurityGoals() {
		if (securityGoals == null) {
			securityGoals = new EObjectWithInverseResolvingEList.ManyInverse<SecurityGoal>(SecurityGoal.class, this, SCPackage.THREAT__SECURITY_GOALS, SCPackage.SECURITY_GOAL__THREATS);
		}
		return securityGoals;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCPackage.THREAT__ASSET, oldAsset, asset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCPackage.THREAT__ASSET, oldAsset, newAsset);
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
				msgs = ((InternalEObject)asset).eInverseRemove(this, SCPackage.ASSET__THREATS, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, SCPackage.ASSET__THREATS, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCPackage.THREAT__ASSET, newAsset, newAsset));
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
			case SCPackage.THREAT__SECURITY_GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecurityGoals()).basicAdd(otherEnd, msgs);
			case SCPackage.THREAT__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, SCPackage.ASSET__THREATS, Asset.class, msgs);
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
			case SCPackage.THREAT__SECURITY_GOALS:
				return ((InternalEList<?>)getSecurityGoals()).basicRemove(otherEnd, msgs);
			case SCPackage.THREAT__ASSET:
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
			case SCPackage.THREAT__THREAT_CLASS:
				return getThreatClass();
			case SCPackage.THREAT__DESCRIPTION:
				return getDescription();
			case SCPackage.THREAT__THREAT_ID:
				return getThreatID();
			case SCPackage.THREAT__ATTACK_POTENTIAL:
				return getAttackPotential();
			case SCPackage.THREAT__SECURITY_GOALS:
				return getSecurityGoals();
			case SCPackage.THREAT__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
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
			case SCPackage.THREAT__THREAT_CLASS:
				setThreatClass((ThreatClass)newValue);
				return;
			case SCPackage.THREAT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SCPackage.THREAT__THREAT_ID:
				setThreatID((Integer)newValue);
				return;
			case SCPackage.THREAT__ATTACK_POTENTIAL:
				setAttackPotential((Damages)newValue);
				return;
			case SCPackage.THREAT__SECURITY_GOALS:
				getSecurityGoals().clear();
				getSecurityGoals().addAll((Collection<? extends SecurityGoal>)newValue);
				return;
			case SCPackage.THREAT__ASSET:
				setAsset((Asset)newValue);
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
			case SCPackage.THREAT__THREAT_CLASS:
				setThreatClass(THREAT_CLASS_EDEFAULT);
				return;
			case SCPackage.THREAT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SCPackage.THREAT__THREAT_ID:
				setThreatID(THREAT_ID_EDEFAULT);
				return;
			case SCPackage.THREAT__ATTACK_POTENTIAL:
				setAttackPotential(ATTACK_POTENTIAL_EDEFAULT);
				return;
			case SCPackage.THREAT__SECURITY_GOALS:
				getSecurityGoals().clear();
				return;
			case SCPackage.THREAT__ASSET:
				setAsset((Asset)null);
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
			case SCPackage.THREAT__THREAT_CLASS:
				return threatClass != THREAT_CLASS_EDEFAULT;
			case SCPackage.THREAT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SCPackage.THREAT__THREAT_ID:
				return threatID != THREAT_ID_EDEFAULT;
			case SCPackage.THREAT__ATTACK_POTENTIAL:
				return attackPotential != ATTACK_POTENTIAL_EDEFAULT;
			case SCPackage.THREAT__SECURITY_GOALS:
				return securityGoals != null && !securityGoals.isEmpty();
			case SCPackage.THREAT__ASSET:
				return asset != null;
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
		result.append(" (threatClass: ");
		result.append(threatClass);
		result.append(", description: ");
		result.append(description);
		result.append(", threatID: ");
		result.append(threatID);
		result.append(", attackPotential: ");
		result.append(attackPotential);
		result.append(')');
		return result.toString();
	}

} //ThreatImpl
