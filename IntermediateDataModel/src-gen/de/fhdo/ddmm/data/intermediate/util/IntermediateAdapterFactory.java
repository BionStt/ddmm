/**
 */
package de.fhdo.ddmm.data.intermediate.util;

import de.fhdo.ddmm.data.intermediate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fhdo.ddmm.data.intermediate.IntermediatePackage
 * @generated
 */
public class IntermediateAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static IntermediatePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = IntermediatePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntermediateSwitch<Adapter> modelSwitch =
        new IntermediateSwitch<Adapter>() {
            @Override
            public Adapter caseIntermediateDataModel(IntermediateDataModel object) {
                return createIntermediateDataModelAdapter();
            }
            @Override
            public Adapter caseIntermediateImport(IntermediateImport object) {
                return createIntermediateImportAdapter();
            }
            @Override
            public Adapter caseIntermediateVersion(IntermediateVersion object) {
                return createIntermediateVersionAdapter();
            }
            @Override
            public Adapter caseIntermediateContext(IntermediateContext object) {
                return createIntermediateContextAdapter();
            }
            @Override
            public Adapter caseIntermediateType(IntermediateType object) {
                return createIntermediateTypeAdapter();
            }
            @Override
            public Adapter caseIntermediatePrimitiveType(IntermediatePrimitiveType object) {
                return createIntermediatePrimitiveTypeAdapter();
            }
            @Override
            public Adapter caseIntermediateComplexType(IntermediateComplexType object) {
                return createIntermediateComplexTypeAdapter();
            }
            @Override
            public Adapter caseIntermediateImportedComplexType(IntermediateImportedComplexType object) {
                return createIntermediateImportedComplexTypeAdapter();
            }
            @Override
            public Adapter caseIntermediateDataStructure(IntermediateDataStructure object) {
                return createIntermediateDataStructureAdapter();
            }
            @Override
            public Adapter caseIntermediateListType(IntermediateListType object) {
                return createIntermediateListTypeAdapter();
            }
            @Override
            public Adapter caseIntermediateDataField(IntermediateDataField object) {
                return createIntermediateDataFieldAdapter();
            }
            @Override
            public Adapter caseIntermediateEnumeration(IntermediateEnumeration object) {
                return createIntermediateEnumerationAdapter();
            }
            @Override
            public Adapter caseIntermediateEnumerationField(IntermediateEnumerationField object) {
                return createIntermediateEnumerationFieldAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateDataModel
     * @generated
     */
    public Adapter createIntermediateDataModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateImport <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateImport
     * @generated
     */
    public Adapter createIntermediateImportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateVersion
     * @generated
     */
    public Adapter createIntermediateVersionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateContext
     * @generated
     */
    public Adapter createIntermediateContextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateType
     * @generated
     */
    public Adapter createIntermediateTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediatePrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediatePrimitiveType
     * @generated
     */
    public Adapter createIntermediatePrimitiveTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateComplexType
     * @generated
     */
    public Adapter createIntermediateComplexTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateImportedComplexType <em>Imported Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateImportedComplexType
     * @generated
     */
    public Adapter createIntermediateImportedComplexTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataStructure <em>Data Structure</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateDataStructure
     * @generated
     */
    public Adapter createIntermediateDataStructureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateListType <em>List Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateListType
     * @generated
     */
    public Adapter createIntermediateListTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateDataField <em>Data Field</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateDataField
     * @generated
     */
    public Adapter createIntermediateDataFieldAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateEnumeration
     * @generated
     */
    public Adapter createIntermediateEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.data.intermediate.IntermediateEnumerationField <em>Enumeration Field</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.fhdo.ddmm.data.intermediate.IntermediateEnumerationField
     * @generated
     */
    public Adapter createIntermediateEnumerationFieldAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //IntermediateAdapterFactory
