/*
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.data.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import de.fhdo.ddmm.data.DataPackage
import de.fhdo.ddmm.data.DataModel
import de.fhdo.ddmm.utils.DdmmUtils
import de.fhdo.ddmm.data.PossiblyImportedComplexType
import org.eclipse.xtext.EcoreUtil2
import de.fhdo.ddmm.data.Version
import de.fhdo.ddmm.data.Context

/**
 * Scope provider for data models.
 *
 * @author <a href="mailto:florian.rademacher@fh-dortmund.de">Florian Rademacher</a>
 */
class DataDslScopeProvider extends AbstractDataDslScopeProvider {
    /**
     * Build scope for a given context and reference
     */
    override getScope(EObject context, EReference reference) {
        /*
         * Build scope for possibly imported complex types
         */
        if (context instanceof PossiblyImportedComplexType &&
            reference == DataPackage::Literals.POSSIBLY_IMPORTED_COMPLEX_TYPE__COMPLEX_TYPE)
            return (context as PossiblyImportedComplexType).scopeForPossiblyImportedComplexTypes

        return super.getScope(context, reference)
    }

    /**
     * Build relatively named scope for possibly imported complex types w.r.t. the import's name,
     * i.e., its "alias"
     */
    private def getScopeForPossiblyImportedComplexTypes(PossiblyImportedComplexType type) {
        val importUri = if (type.import !== null) type.import.importURI

        /*
         * Container of type is version, whose qualifying name parts will be used for relative
         * naming
         */
        val containingVersion = EcoreUtil2.getContainerOfType(type, Version)
        if (containingVersion !== null) {
            return DdmmUtils.getScopeForPossiblyImportedConcept(
                containingVersion,
                containingVersion.qualifiedNameParts,
                DataModel,
                importUri,
                [containedComplexTypes.toList],
                [qualifiedNameParts]
            )
        }

        /*
         * Container of type is context, whose qualifying name parts will be used for relative
         * naming
         */
        val containingContext = EcoreUtil2.getContainerOfType(type, Context)
        if (containingContext !== null) {
            return DdmmUtils.getScopeForPossiblyImportedConcept(
                containingContext,
                containingContext.qualifiedNameParts,
                DataModel,
                importUri,
                [containedComplexTypes.toList],
                [qualifiedNameParts]
            )
        }

        /*
         * Container of type is data model. In this case no relative naming will happen as data
         * models do not have names themselves (hence parameter containerNameParts is null). That
         * is, the full qualified name will be used instead.
         */
        val containingDataModel = EcoreUtil2.getContainerOfType(type, DataModel)
        return DdmmUtils.getScopeForPossiblyImportedConcept(
                containingDataModel,
                null,
                DataModel,
                importUri,
                [containedComplexTypes.toList],
                [qualifiedNameParts]
            )
   }
}