/**
 *
 * $Id$
 */
package SC.validation;

import SC.Asset;
import SC.Damages;
import SC.SecurityGoal;
import SC.SecurityGoalClassType;
import SC.Threat;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link SC.SecurityGoal}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SecurityGoalValidator {
	boolean validate();

	boolean validateSecurityGoalClass(SecurityGoalClassType value);
	boolean validateDamagePotential(Damages value);
	boolean validateDependsOnSecurityGoal(EList<SecurityGoal> value);
	boolean validateDescription(String value);
	boolean validateSecurityGoalID(int value);
	boolean validateName(String value);
	boolean validateAsset(Asset value);
	boolean validateThreat(EList<Threat> value);
}
