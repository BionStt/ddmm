/**
 */
package de.fhdo.ddmm.service;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fhdo.ddmm.service.ServicePackage
 * @generated
 */
public interface ServiceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ServiceFactory eINSTANCE = de.fhdo.ddmm.service.impl.ServiceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model</em>'.
     * @generated
     */
    ServiceModel createServiceModel();

    /**
     * Returns a new object of class '<em>Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Import</em>'.
     * @generated
     */
    Import createImport();

    /**
     * Returns a new object of class '<em>Microservice</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Microservice</em>'.
     * @generated
     */
    Microservice createMicroservice();

    /**
     * Returns a new object of class '<em>Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface</em>'.
     * @generated
     */
    Interface createInterface();

    /**
     * Returns a new object of class '<em>Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation</em>'.
     * @generated
     */
    Operation createOperation();

    /**
     * Returns a new object of class '<em>Referred Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Referred Operation</em>'.
     * @generated
     */
    ReferredOperation createReferredOperation();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Mapped Data Field</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mapped Data Field</em>'.
     * @generated
     */
    MappedDataField createMappedDataField();

    /**
     * Returns a new object of class '<em>Possibly Imported Microservice</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Possibly Imported Microservice</em>'.
     * @generated
     */
    PossiblyImportedMicroservice createPossiblyImportedMicroservice();

    /**
     * Returns a new object of class '<em>Possibly Imported Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Possibly Imported Interface</em>'.
     * @generated
     */
    PossiblyImportedInterface createPossiblyImportedInterface();

    /**
     * Returns a new object of class '<em>Possibly Imported Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Possibly Imported Operation</em>'.
     * @generated
     */
    PossiblyImportedOperation createPossiblyImportedOperation();

    /**
     * Returns a new object of class '<em>Imported Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Imported Type</em>'.
     * @generated
     */
    ImportedType createImportedType();

    /**
     * Returns a new object of class '<em>Imported Protocol And Data Format</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Imported Protocol And Data Format</em>'.
     * @generated
     */
    ImportedProtocolAndDataFormat createImportedProtocolAndDataFormat();

    /**
     * Returns a new object of class '<em>Protocol Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol Specification</em>'.
     * @generated
     */
    ProtocolSpecification createProtocolSpecification();

    /**
     * Returns a new object of class '<em>Endpoint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Endpoint</em>'.
     * @generated
     */
    Endpoint createEndpoint();

    /**
     * Returns a new object of class '<em>Imported Service Aspect</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Imported Service Aspect</em>'.
     * @generated
     */
    ImportedServiceAspect createImportedServiceAspect();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ServicePackage getServicePackage();

} //ServiceFactory
