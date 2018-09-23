/*
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm

import de.fhdo.ddmm.scoping.ServiceDslScopeProvider
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy

/**
 * Use this class to register components to be used at runtime / without the Equinox extension
 * registry.
 *
 * @author <a href="mailto:florian.rademacher@fh-dortmund.de">Florian Rademacher</a>
 */
class ServiceDslRuntimeModule extends AbstractServiceDslRuntimeModule {
    /**
     * Bind custom scope provider
     */
    override bindIScopeProvider() {
         ServiceDslScopeProvider
     }

    /**
     * Bind custom qualified name provider
     */
    override bindIQualifiedNameProvider() {
        ServiceDslQualifiedNameProvider
    }

    /**
     * Bind custom resource description strategy
     */
    def Class<? extends IDefaultResourceDescriptionStrategy>
       bindIDefaultResourceDescriptionStrategy() {
        ServiceDslResourceDescriptionStrategy
    }
}