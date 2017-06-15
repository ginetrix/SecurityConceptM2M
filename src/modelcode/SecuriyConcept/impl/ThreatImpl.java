/**
 */
package SecuriyConcept.impl;

import SecuriyConcept.Damages;
import SecuriyConcept.SecurityGoal;
import SecuriyConcept.SecuriyConceptPackage;
import SecuriyConcept.Threat;

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
 *   <li>{@link SecuriyConcept.impl.ThreatImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ThreatImpl#getThreatID <em>Threat ID</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ThreatImpl#getAttackPotential <em>Attack Potential</em>}</li>
 *   <li>{@link SecuriyConcept.impl.ThreatImpl#getSecuritygoal <em>Securitygoal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreatImpl extends MinimalEObjectImpl.Container implements Threat {
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
	 * The cached value of the '{@link #getSecuritygoal() <em>Securitygoal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritygoal()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGoal> securitygoal;

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
		return SecuriyConceptPackage.Literals.THREAT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.THREAT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.THREAT__THREAT_ID, oldThreatID, threatID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecuriyConceptPackage.THREAT__ATTACK_POTENTIAL, oldAttackPotential, attackPotential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGoal> getSecuritygoal() {
		if (securitygoal == null) {
			securitygoal = new EObjectWithInverseResolvingEList.ManyInverse<SecurityGoal>(SecurityGoal.class, this, SecuriyConceptPackage.THREAT__SECURITYGOAL, SecuriyConceptPackage.SECURITY_GOAL__THREAT);
		}
		return securitygoal;
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
			case SecuriyConceptPackage.THREAT__SECURITYGOAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecuritygoal()).basicAdd(otherEnd, msgs);
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
			case SecuriyConceptPackage.THREAT__SECURITYGOAL:
				return ((InternalEList<?>)getSecuritygoal()).basicRemove(otherEnd, msgs);
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
			case SecuriyConceptPackage.THREAT__DESCRIPTION:
				return getDescription();
			case SecuriyConceptPackage.THREAT__THREAT_ID:
				return getThreatID();
			case SecuriyConceptPackage.THREAT__ATTACK_POTENTIAL:
				return getAttackPotential();
			case SecuriyConceptPackage.THREAT__SECURITYGOAL:
				return getSecuritygoal();
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
			case SecuriyConceptPackage.THREAT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SecuriyConceptPackage.THREAT__THREAT_ID:
				setThreatID((Integer)newValue);
				return;
			case SecuriyConceptPackage.THREAT__ATTACK_POTENTIAL:
				setAttackPotential((Damages)newValue);
				return;
			case SecuriyConceptPackage.THREAT__SECURITYGOAL:
				getSecuritygoal().clear();
				getSecuritygoal().addAll((Collection<? extends SecurityGoal>)newValue);
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
			case SecuriyConceptPackage.THREAT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SecuriyConceptPackage.THREAT__THREAT_ID:
				setThreatID(THREAT_ID_EDEFAULT);
				return;
			case SecuriyConceptPackage.THREAT__ATTACK_POTENTIAL:
				setAttackPotential(ATTACK_POTENTIAL_EDEFAULT);
				return;
			case SecuriyConceptPackage.THREAT__SECURITYGOAL:
				getSecuritygoal().clear();
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
			case SecuriyConceptPackage.THREAT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SecuriyConceptPackage.THREAT__THREAT_ID:
				return threatID != THREAT_ID_EDEFAULT;
			case SecuriyConceptPackage.THREAT__ATTACK_POTENTIAL:
				return attackPotential != ATTACK_POTENTIAL_EDEFAULT;
			case SecuriyConceptPackage.THREAT__SECURITYGOAL:
				return securitygoal != null && !securitygoal.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", threatID: ");
		result.append(threatID);
		result.append(", attackPotential: ");
		result.append(attackPotential);
		result.append(')');
		return result.toString();
	}

} //ThreatImpl
