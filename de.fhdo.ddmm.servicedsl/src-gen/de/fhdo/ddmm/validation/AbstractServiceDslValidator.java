/*
 * generated by Xtext 2.16.0
 */
package de.fhdo.ddmm.validation;

import de.fhdo.ddmm.technology.validation.TechnologyDslValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractServiceDslValidator extends TechnologyDslValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("de.fhdo.ddmm.service"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("de.fhdo.ddmm.technology"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("de.fhdo.ddmm.data"));
		return result;
	}
}
