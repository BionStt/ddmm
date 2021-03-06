package de.fhdo.ddmm

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.resource.IEObjectDescription
import de.fhdo.ddmm.service.Import

/**
 * Custom resource description strategy for the ServiceDsl.
 *
 * @author <a href="mailto:florian.rademacher@fh-dortmund.de">Florian Rademacher</a>
 */
class ServiceDslResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
    /**
     * Export selected EObjects from DSL models
     */
    override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
        switch (eObject) {
            // Don't export imports to prevent transitive imports
            Import: return false
        }

        return super.createEObjectDescriptions(eObject, acceptor)
    }
}