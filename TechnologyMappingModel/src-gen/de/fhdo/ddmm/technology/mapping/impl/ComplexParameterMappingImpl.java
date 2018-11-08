/**
 */
package de.fhdo.ddmm.technology.mapping.impl;

import de.fhdo.ddmm.data.ComplexType;

import de.fhdo.ddmm.technology.mapping.ComplexParameterMapping;
import de.fhdo.ddmm.technology.mapping.MappingPackage;
import de.fhdo.ddmm.technology.mapping.TechnologySpecificDataFieldTypeMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.technology.mapping.impl.ComplexParameterMappingImpl#getTechnologySpecificComplexType <em>Technology Specific Complex Type</em>}</li>
 *   <li>{@link de.fhdo.ddmm.technology.mapping.impl.ComplexParameterMappingImpl#getDataFieldMappings <em>Data Field Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexParameterMappingImpl extends ParameterMappingImpl implements ComplexParameterMapping {
    /**
     * The cached value of the '{@link #getTechnologySpecificComplexType() <em>Technology Specific Complex Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTechnologySpecificComplexType()
     * @generated
     * @ordered
     */
    protected ComplexType technologySpecificComplexType;

    /**
     * The cached value of the '{@link #getDataFieldMappings() <em>Data Field Mappings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataFieldMappings()
     * @generated
     * @ordered
     */
    protected EList<TechnologySpecificDataFieldTypeMapping> dataFieldMappings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexParameterMappingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.COMPLEX_PARAMETER_MAPPING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexType getTechnologySpecificComplexType() {
        if (technologySpecificComplexType != null && technologySpecificComplexType.eIsProxy()) {
            InternalEObject oldTechnologySpecificComplexType = (InternalEObject)technologySpecificComplexType;
            technologySpecificComplexType = (ComplexType)eResolveProxy(oldTechnologySpecificComplexType);
            if (technologySpecificComplexType != oldTechnologySpecificComplexType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.COMPLEX_PARAMETER_MAPPING__TECHNOLOGY_SPECIFIC_COMPLEX_TYPE, oldTechnologySpecificComplexType, technologySpecificComplexType));
            }
        }
        return technologySpecificComplexType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexType basicGetTechnologySpecificComplexType() {
        return technologySpecificComplexType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTechnologySpecificComplexType(ComplexType newTechnologySpecificComplexType) {
        ComplexType oldTechnologySpecificComplexType = technologySpecificComplexType;
        technologySpecificComplexType = newTechnologySpecificComplexType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COMPLEX_PARAMETER_MAPPING__TECHNOLOGY_SPECIFIC_COMPLEX_TYPE, oldTechnologySpecificComplexType, technologySpecificComplexType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TechnologySpecificDataFieldTypeMapping> getDataFieldMappings() {
        if (dataFieldMappings == null) {
            dataFieldMappings = new EObjectContainmentWithInverseEList<TechnologySpecificDataFieldTypeMapping>(TechnologySpecificDataFieldTypeMapping.class, this, MappingPackage.COMPLEX_PARAMETER_MAPPING__DATA_FIELD_MAPPINGS, MappingPackage.TECHNOLOGY_SPECIFIC_DATA_FIELD_TYPE_MAPPING__PARAMETER_MAPPING);
        }
        return dataFieldMappings;
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
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__DATA_FIELD_MAPPINGS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataFieldMappings()).basicAdd(otherEnd, msgs);
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
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__DATA_FIELD_MAPPINGS:
                return ((InternalEList<?>)getDataFieldMappings()).basicRemove(otherEnd, msgs);
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
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__TECHNOLOGY_SPECIFIC_COMPLEX_TYPE:
                if (resolve) return getTechnologySpecificComplexType();
                return basicGetTechnologySpecificComplexType();
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__DATA_FIELD_MAPPINGS:
                return getDataFieldMappings();
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
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__TECHNOLOGY_SPECIFIC_COMPLEX_TYPE:
                setTechnologySpecificComplexType((ComplexType)newValue);
                return;
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__DATA_FIELD_MAPPINGS:
                getDataFieldMappings().clear();
                getDataFieldMappings().addAll((Collection<? extends TechnologySpecificDataFieldTypeMapping>)newValue);
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
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__TECHNOLOGY_SPECIFIC_COMPLEX_TYPE:
                setTechnologySpecificComplexType((ComplexType)null);
                return;
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__DATA_FIELD_MAPPINGS:
                getDataFieldMappings().clear();
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
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__TECHNOLOGY_SPECIFIC_COMPLEX_TYPE:
                return technologySpecificComplexType != null;
            case MappingPackage.COMPLEX_PARAMETER_MAPPING__DATA_FIELD_MAPPINGS:
                return dataFieldMappings != null && !dataFieldMappings.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ComplexParameterMappingImpl
