/**
 *************************************************************************
 * Copyright (c) 2005, 2007 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *  
 *************************************************************************
 *
 * $Id: DesignPackage.java,v 1.3 2006/03/17 14:52:32 lchan Exp $
 */
package org.eclipse.datatools.connectivity.oda.design;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.datatools.connectivity.oda.design.DesignFactory
 * @model kind="package"
 * @generated
 */
public interface DesignPackage extends EPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = "Copyright (c) 2005, 2007 Actuate Corporation"; //$NON-NLS-1$

    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "design"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.eclipse.org/datatools/connectivity/oda/design"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "design"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DesignPackage eINSTANCE = org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl
            .init();

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.AxisAttributesImpl <em>Axis Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.AxisAttributesImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getAxisAttributes()
     * @generated
     */
    int AXIS_ATTRIBUTES = 0;

    /**
     * The feature id for the '<em><b>Axis Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AXIS_ATTRIBUTES__AXIS_TYPE = 0;

    /**
     * The feature id for the '<em><b>On Column Layout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AXIS_ATTRIBUTES__ON_COLUMN_LAYOUT = 1;

    /**
     * The number of structural features of the '<em>Axis Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AXIS_ATTRIBUTES_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ColumnDefinitionImpl <em>Column Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ColumnDefinitionImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getColumnDefinition()
     * @generated
     */
    int COLUMN_DEFINITION = 1;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEFINITION__ATTRIBUTES = 0;

    /**
     * The feature id for the '<em><b>Usage Hints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEFINITION__USAGE_HINTS = 1;

    /**
     * The feature id for the '<em><b>Multi Dimension Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEFINITION__MULTI_DIMENSION_ATTRIBUTES = 2;

    /**
     * The number of structural features of the '<em>Column Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_DEFINITION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataAccessDesignImpl <em>Data Access Design</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DataAccessDesignImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataAccessDesign()
     * @generated
     */
    int DATA_ACCESS_DESIGN = 2;

    /**
     * The feature id for the '<em><b>Data Set Design</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ACCESS_DESIGN__DATA_SET_DESIGN = 0;

    /**
     * The number of structural features of the '<em>Data Access Design</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ACCESS_DESIGN_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataElementAttributesImpl <em>Data Element Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DataElementAttributesImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataElementAttributes()
     * @generated
     */
    int DATA_ELEMENT_ATTRIBUTES = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_ATTRIBUTES__NAME = 0;

    /**
     * The feature id for the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_ATTRIBUTES__POSITION = 1;

    /**
     * The feature id for the '<em><b>Native Data Type Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_ATTRIBUTES__NATIVE_DATA_TYPE_CODE = 2;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_ATTRIBUTES__PRECISION = 3;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_ATTRIBUTES__SCALE = 4;

    /**
     * The feature id for the '<em><b>Nullability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_ATTRIBUTES__NULLABILITY = 5;

    /**
     * The feature id for the '<em><b>Ui Hints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_ATTRIBUTES__UI_HINTS = 6;

    /**
     * The number of structural features of the '<em>Data Element Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_ATTRIBUTES_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataElementUIHintsImpl <em>Data Element UI Hints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DataElementUIHintsImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataElementUIHints()
     * @generated
     */
    int DATA_ELEMENT_UI_HINTS = 4;

    /**
     * The feature id for the '<em><b>Display Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_UI_HINTS__DISPLAY_NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_UI_HINTS__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Data Element UI Hints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ELEMENT_UI_HINTS_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataSetDesignImpl <em>Data Set Design</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DataSetDesignImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataSetDesign()
     * @generated
     */
    int DATA_SET_DESIGN = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__NAME = 0;

    /**
     * The feature id for the '<em><b>Oda Extension Data Set Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__ODA_EXTENSION_DATA_SET_ID = 1;

    /**
     * The feature id for the '<em><b>Data Source Design</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__DATA_SOURCE_DESIGN = 2;

    /**
     * The feature id for the '<em><b>Query</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__QUERY = 3;

    /**
     * The feature id for the '<em><b>Display Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__DISPLAY_NAME = 4;

    /**
     * The feature id for the '<em><b>Public Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__PUBLIC_PROPERTIES = 5;

    /**
     * The feature id for the '<em><b>Private Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__PRIVATE_PROPERTIES = 6;

    /**
     * The feature id for the '<em><b>Result Sets</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__RESULT_SETS = 7;

    /**
     * The feature id for the '<em><b>Primary Result Set Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__PRIMARY_RESULT_SET_NAME = 8;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN__PARAMETERS = 9;

    /**
     * The number of structural features of the '<em>Data Set Design</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DESIGN_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataSetParametersImpl <em>Data Set Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DataSetParametersImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataSetParameters()
     * @generated
     */
    int DATA_SET_PARAMETERS = 6;

    /**
     * The feature id for the '<em><b>Parameter Definitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_PARAMETERS__PARAMETER_DEFINITIONS = 0;

    /**
     * The feature id for the '<em><b>Derived Meta Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_PARAMETERS__DERIVED_META_DATA = 1;

    /**
     * The number of structural features of the '<em>Data Set Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_PARAMETERS_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataSetQueryImpl <em>Data Set Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DataSetQueryImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataSetQuery()
     * @generated
     */
    int DATA_SET_QUERY = 7;

    /**
     * The feature id for the '<em><b>Query Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_QUERY__QUERY_TEXT = 0;

    /**
     * The number of structural features of the '<em>Data Set Query</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_QUERY_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataSourceDesignImpl <em>Data Source Design</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DataSourceDesignImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataSourceDesign()
     * @generated
     */
    int DATA_SOURCE_DESIGN = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN__NAME = 0;

    /**
     * The feature id for the '<em><b>Oda Extension Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN__ODA_EXTENSION_ID = 1;

    /**
     * The feature id for the '<em><b>Oda Extension Data Source Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN__ODA_EXTENSION_DATA_SOURCE_ID = 2;

    /**
     * The feature id for the '<em><b>Display Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN__DISPLAY_NAME = 3;

    /**
     * The feature id for the '<em><b>Public Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN__PUBLIC_PROPERTIES = 4;

    /**
     * The feature id for the '<em><b>Private Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN__PRIVATE_PROPERTIES = 5;

    /**
     * The feature id for the '<em><b>Linked Profile Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN__LINKED_PROFILE_NAME = 6;

    /**
     * The feature id for the '<em><b>Linked Profile Store File Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN__LINKED_PROFILE_STORE_FILE_PATH = 7;

    /**
     * The number of structural features of the '<em>Data Source Design</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SOURCE_DESIGN_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DesignerStateImpl <em>Designer State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignerStateImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDesignerState()
     * @generated
     */
    int DESIGNER_STATE = 9;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGNER_STATE__VERSION = 0;

    /**
     * The feature id for the '<em><b>State Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGNER_STATE__STATE_CONTENT = 1;

    /**
     * The number of structural features of the '<em>Designer State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGNER_STATE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DesignerStateContentImpl <em>Designer State Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignerStateContentImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDesignerStateContent()
     * @generated
     */
    int DESIGNER_STATE_CONTENT = 10;

    /**
     * The feature id for the '<em><b>State Content As String</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGNER_STATE_CONTENT__STATE_CONTENT_AS_STRING = 0;

    /**
     * The feature id for the '<em><b>State Content As Blob</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGNER_STATE_CONTENT__STATE_CONTENT_AS_BLOB = 1;

    /**
     * The number of structural features of the '<em>Designer State Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGNER_STATE_CONTENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DesignSessionRequestImpl <em>Session Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignSessionRequestImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDesignSessionRequest()
     * @generated
     */
    int DESIGN_SESSION_REQUEST = 11;

    /**
     * The feature id for the '<em><b>Data Access Design</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_REQUEST__DATA_ACCESS_DESIGN = 0;

    /**
     * The feature id for the '<em><b>Editable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_REQUEST__EDITABLE = 1;

    /**
     * The feature id for the '<em><b>Session Locale</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_REQUEST__SESSION_LOCALE = 2;

    /**
     * The feature id for the '<em><b>Designer State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_REQUEST__DESIGNER_STATE = 3;

    /**
     * The number of structural features of the '<em>Session Request</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_REQUEST_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DesignSessionResponseImpl <em>Session Response</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignSessionResponseImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDesignSessionResponse()
     * @generated
     */
    int DESIGN_SESSION_RESPONSE = 12;

    /**
     * The feature id for the '<em><b>Session Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_RESPONSE__SESSION_STATUS = 0;

    /**
     * The feature id for the '<em><b>Data Access Design</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_RESPONSE__DATA_ACCESS_DESIGN = 1;

    /**
     * The feature id for the '<em><b>Designer State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_RESPONSE__DESIGNER_STATE = 2;

    /**
     * The number of structural features of the '<em>Session Response</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESIGN_SESSION_RESPONSE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DocumentRootImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 13;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Oda Design Session</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ODA_DESIGN_SESSION = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DynamicValuesQueryImpl <em>Dynamic Values Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DynamicValuesQueryImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDynamicValuesQuery()
     * @generated
     */
    int DYNAMIC_VALUES_QUERY = 14;

    /**
     * The feature id for the '<em><b>Data Set Design</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_VALUES_QUERY__DATA_SET_DESIGN = 0;

    /**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_VALUES_QUERY__ENABLED = 1;

    /**
     * The feature id for the '<em><b>Value Column</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_VALUES_QUERY__VALUE_COLUMN = 2;

    /**
     * The feature id for the '<em><b>Display Name Column</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_VALUES_QUERY__DISPLAY_NAME_COLUMN = 3;

    /**
     * The number of structural features of the '<em>Dynamic Values Query</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYNAMIC_VALUES_QUERY_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.InputElementAttributesImpl <em>Input Element Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.InputElementAttributesImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputElementAttributes()
     * @generated
     */
    int INPUT_ELEMENT_ATTRIBUTES = 15;

    /**
     * The feature id for the '<em><b>Default Scalar Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_ATTRIBUTES__DEFAULT_SCALAR_VALUE = 0;

    /**
     * The feature id for the '<em><b>Editable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_ATTRIBUTES__EDITABLE = 1;

    /**
     * The feature id for the '<em><b>Optional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_ATTRIBUTES__OPTIONAL = 2;

    /**
     * The feature id for the '<em><b>Masks Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_ATTRIBUTES__MASKS_VALUE = 3;

    /**
     * The feature id for the '<em><b>Static Value Choices</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_ATTRIBUTES__STATIC_VALUE_CHOICES = 4;

    /**
     * The feature id for the '<em><b>Dynamic Value Choices</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_ATTRIBUTES__DYNAMIC_VALUE_CHOICES = 5;

    /**
     * The feature id for the '<em><b>Ui Hints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_ATTRIBUTES__UI_HINTS = 6;

    /**
     * The number of structural features of the '<em>Input Element Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_ATTRIBUTES_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.InputElementUIHintsImpl <em>Input Element UI Hints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.InputElementUIHintsImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputElementUIHints()
     * @generated
     */
    int INPUT_ELEMENT_UI_HINTS = 16;

    /**
     * The feature id for the '<em><b>Prompt Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_UI_HINTS__PROMPT_STYLE = 0;

    /**
     * The number of structural features of the '<em>Input Element UI Hints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_ELEMENT_UI_HINTS_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.InputParameterAttributesImpl <em>Input Parameter Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.InputParameterAttributesImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputParameterAttributes()
     * @generated
     */
    int INPUT_PARAMETER_ATTRIBUTES = 17;

    /**
     * The feature id for the '<em><b>Element Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PARAMETER_ATTRIBUTES__ELEMENT_ATTRIBUTES = 0;

    /**
     * The feature id for the '<em><b>Ui Hints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PARAMETER_ATTRIBUTES__UI_HINTS = 1;

    /**
     * The number of structural features of the '<em>Input Parameter Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PARAMETER_ATTRIBUTES_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.InputParameterUIHintsImpl <em>Input Parameter UI Hints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.InputParameterUIHintsImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputParameterUIHints()
     * @generated
     */
    int INPUT_PARAMETER_UI_HINTS = 18;

    /**
     * The feature id for the '<em><b>Group Prompt Display Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PARAMETER_UI_HINTS__GROUP_PROMPT_DISPLAY_NAME = 0;

    /**
     * The number of structural features of the '<em>Input Parameter UI Hints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_PARAMETER_UI_HINTS_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.LocaleImpl <em>Locale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.LocaleImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getLocale()
     * @generated
     */
    int LOCALE = 19;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALE__LANGUAGE = 0;

    /**
     * The feature id for the '<em><b>Country</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALE__COUNTRY = 1;

    /**
     * The feature id for the '<em><b>Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALE__VARIANT = 2;

    /**
     * The number of structural features of the '<em>Locale</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.NameValuePairImpl <em>Name Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.NameValuePairImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getNameValuePair()
     * @generated
     */
    int NAME_VALUE_PAIR = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_VALUE_PAIR__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_VALUE_PAIR__VALUE = 1;

    /**
     * The number of structural features of the '<em>Name Value Pair</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_VALUE_PAIR_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.OdaDesignSessionImpl <em>Oda Design Session</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.OdaDesignSessionImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaDesignSession()
     * @generated
     */
    int ODA_DESIGN_SESSION = 21;

    /**
     * The feature id for the '<em><b>Request</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ODA_DESIGN_SESSION__REQUEST = 0;

    /**
     * The feature id for the '<em><b>Response</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ODA_DESIGN_SESSION__RESPONSE = 1;

    /**
     * The number of structural features of the '<em>Oda Design Session</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ODA_DESIGN_SESSION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.OutputElementAttributesImpl <em>Output Element Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.OutputElementAttributesImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOutputElementAttributes()
     * @generated
     */
    int OUTPUT_ELEMENT_ATTRIBUTES = 22;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_ELEMENT_ATTRIBUTES__LABEL = 0;

    /**
     * The feature id for the '<em><b>Formatting Hints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_ELEMENT_ATTRIBUTES__FORMATTING_HINTS = 1;

    /**
     * The feature id for the '<em><b>Help Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_ELEMENT_ATTRIBUTES__HELP_TEXT = 2;

    /**
     * The number of structural features of the '<em>Output Element Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_ELEMENT_ATTRIBUTES_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ParameterDefinitionImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterDefinition()
     * @generated
     */
    int PARAMETER_DEFINITION = 23;

    /**
     * The feature id for the '<em><b>In Out Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_DEFINITION__IN_OUT_MODE = 0;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_DEFINITION__ATTRIBUTES = 1;

    /**
     * The feature id for the '<em><b>Input Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_DEFINITION__INPUT_ATTRIBUTES = 2;

    /**
     * The feature id for the '<em><b>Output Usage Hints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_DEFINITION__OUTPUT_USAGE_HINTS = 3;

    /**
     * The feature id for the '<em><b>Fields</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_DEFINITION__FIELDS = 4;

    /**
     * The number of structural features of the '<em>Parameter Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_DEFINITION_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ParameterFieldDefinitionImpl <em>Parameter Field Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ParameterFieldDefinitionImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterFieldDefinition()
     * @generated
     */
    int PARAMETER_FIELD_DEFINITION = 24;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FIELD_DEFINITION__ATTRIBUTES = 0;

    /**
     * The feature id for the '<em><b>Input Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FIELD_DEFINITION__INPUT_ATTRIBUTES = 1;

    /**
     * The feature id for the '<em><b>Output Usage Hints</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FIELD_DEFINITION__OUTPUT_USAGE_HINTS = 2;

    /**
     * The number of structural features of the '<em>Parameter Field Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FIELD_DEFINITION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ParameterFieldsImpl <em>Parameter Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ParameterFieldsImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterFields()
     * @generated
     */
    int PARAMETER_FIELDS = 25;

    /**
     * The feature id for the '<em><b>Field Collection</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FIELDS__FIELD_COLLECTION = 0;

    /**
     * The number of structural features of the '<em>Parameter Fields</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FIELDS_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.PropertiesImpl <em>Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.PropertiesImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getProperties()
     * @generated
     */
    int PROPERTIES = 26;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES__PROPERTIES = 0;

    /**
     * The number of structural features of the '<em>Properties</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.PropertyImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 27;

    /**
     * The feature id for the '<em><b>Name Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME_VALUE = 0;

    /**
     * The feature id for the '<em><b>Design Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DESIGN_ATTRIBUTES = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.PropertyAttributesImpl <em>Property Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.PropertyAttributesImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getPropertyAttributes()
     * @generated
     */
    int PROPERTY_ATTRIBUTES = 28;

    /**
     * The feature id for the '<em><b>Display Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTES__DISPLAY_NAME = 0;

    /**
     * The feature id for the '<em><b>Element Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTES__ELEMENT_ATTRIBUTES = 1;

    /**
     * The feature id for the '<em><b>Derived Meta Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTES__DERIVED_META_DATA = 2;

    /**
     * The number of structural features of the '<em>Property Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_ATTRIBUTES_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ResultSetColumnsImpl <em>Result Set Columns</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ResultSetColumnsImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getResultSetColumns()
     * @generated
     */
    int RESULT_SET_COLUMNS = 29;

    /**
     * The feature id for the '<em><b>Result Column Definitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_SET_COLUMNS__RESULT_COLUMN_DEFINITIONS = 0;

    /**
     * The number of structural features of the '<em>Result Set Columns</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_SET_COLUMNS_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ResultSetDefinitionImpl <em>Result Set Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ResultSetDefinitionImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getResultSetDefinition()
     * @generated
     */
    int RESULT_SET_DEFINITION = 30;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_SET_DEFINITION__NAME = 0;

    /**
     * The feature id for the '<em><b>Result Set Columns</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_SET_DEFINITION__RESULT_SET_COLUMNS = 1;

    /**
     * The number of structural features of the '<em>Result Set Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_SET_DEFINITION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ResultSetsImpl <em>Result Sets</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ResultSetsImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getResultSets()
     * @generated
     */
    int RESULT_SETS = 31;

    /**
     * The feature id for the '<em><b>Result Set Definitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_SETS__RESULT_SET_DEFINITIONS = 0;

    /**
     * The feature id for the '<em><b>Derived Meta Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_SETS__DERIVED_META_DATA = 1;

    /**
     * The number of structural features of the '<em>Result Sets</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESULT_SETS_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ScalarValueChoicesImpl <em>Scalar Value Choices</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ScalarValueChoicesImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getScalarValueChoices()
     * @generated
     */
    int SCALAR_VALUE_CHOICES = 32;

    /**
     * The feature id for the '<em><b>Scalar Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALAR_VALUE_CHOICES__SCALAR_VALUES = 0;

    /**
     * The number of structural features of the '<em>Scalar Value Choices</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALAR_VALUE_CHOICES_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ScalarValueDefinitionImpl <em>Scalar Value Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ScalarValueDefinitionImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getScalarValueDefinition()
     * @generated
     */
    int SCALAR_VALUE_DEFINITION = 33;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALAR_VALUE_DEFINITION__VALUE = 0;

    /**
     * The feature id for the '<em><b>Display Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALAR_VALUE_DEFINITION__DISPLAY_NAME = 1;

    /**
     * The number of structural features of the '<em>Scalar Value Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALAR_VALUE_DEFINITION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ValueFormatHintsImpl <em>Value Format Hints</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.ValueFormatHintsImpl
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getValueFormatHints()
     * @generated
     */
    int VALUE_FORMAT_HINTS = 34;

    /**
     * The feature id for the '<em><b>Display Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FORMAT_HINTS__DISPLAY_SIZE = 0;

    /**
     * The feature id for the '<em><b>Display Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FORMAT_HINTS__DISPLAY_FORMAT = 1;

    /**
     * The feature id for the '<em><b>Text Format Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FORMAT_HINTS__TEXT_FORMAT_TYPE = 2;

    /**
     * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FORMAT_HINTS__HORIZONTAL_ALIGNMENT = 3;

    /**
     * The feature id for the '<em><b>Text Wrap Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FORMAT_HINTS__TEXT_WRAP_TYPE = 4;

    /**
     * The number of structural features of the '<em>Value Format Hints</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_FORMAT_HINTS_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.AxisType <em>Axis Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.AxisType
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getAxisType()
     * @generated
     */
    int AXIS_TYPE = 35;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.ElementNullability <em>Element Nullability</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.ElementNullability
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getElementNullability()
     * @generated
     */
    int ELEMENT_NULLABILITY = 36;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.HorizontalAlignment <em>Horizontal Alignment</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.HorizontalAlignment
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getHorizontalAlignment()
     * @generated
     */
    int HORIZONTAL_ALIGNMENT = 37;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.InputPromptControlStyle <em>Input Prompt Control Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.InputPromptControlStyle
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputPromptControlStyle()
     * @generated
     */
    int INPUT_PROMPT_CONTROL_STYLE = 38;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.OdaComplexDataType <em>Oda Complex Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.OdaComplexDataType
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaComplexDataType()
     * @generated
     */
    int ODA_COMPLEX_DATA_TYPE = 39;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.OdaScalarDataType <em>Oda Scalar Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.OdaScalarDataType
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaScalarDataType()
     * @generated
     */
    int ODA_SCALAR_DATA_TYPE = 40;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.ParameterMode <em>Parameter Mode</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterMode
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterMode()
     * @generated
     */
    int PARAMETER_MODE = 41;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.SessionStatus <em>Session Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.SessionStatus
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getSessionStatus()
     * @generated
     */
    int SESSION_STATUS = 42;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.TextFormatType <em>Text Format Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.TextFormatType
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getTextFormatType()
     * @generated
     */
    int TEXT_FORMAT_TYPE = 43;

    /**
     * The meta object id for the '{@link org.eclipse.datatools.connectivity.oda.design.TextWrapType <em>Text Wrap Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.TextWrapType
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getTextWrapType()
     * @generated
     */
    int TEXT_WRAP_TYPE = 44;

    /**
     * The meta object id for the '<em>Axis Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getAxisTypeObject()
     * @generated
     */
    int AXIS_TYPE_OBJECT = 45;

    /**
     * The meta object id for the '<em>Element Nullability Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getElementNullabilityObject()
     * @generated
     */
    int ELEMENT_NULLABILITY_OBJECT = 46;

    /**
     * The meta object id for the '<em>Horizontal Alignment Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getHorizontalAlignmentObject()
     * @generated
     */
    int HORIZONTAL_ALIGNMENT_OBJECT = 47;

    /**
     * The meta object id for the '<em>Input Prompt Control Style Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputPromptControlStyleObject()
     * @generated
     */
    int INPUT_PROMPT_CONTROL_STYLE_OBJECT = 48;

    /**
     * The meta object id for the '<em>Native Data Type Code</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getNativeDataTypeCode()
     * @generated
     */
    int NATIVE_DATA_TYPE_CODE = 49;

    /**
     * The meta object id for the '<em>Native Data Type Code Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Integer
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getNativeDataTypeCodeObject()
     * @generated
     */
    int NATIVE_DATA_TYPE_CODE_OBJECT = 50;

    /**
     * The meta object id for the '<em>Oda Complex Data Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaComplexDataTypeObject()
     * @generated
     */
    int ODA_COMPLEX_DATA_TYPE_OBJECT = 51;

    /**
     * The meta object id for the '<em>Oda Scalar Data Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaScalarDataTypeObject()
     * @generated
     */
    int ODA_SCALAR_DATA_TYPE_OBJECT = 52;

    /**
     * The meta object id for the '<em>Parameter Mode Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterModeObject()
     * @generated
     */
    int PARAMETER_MODE_OBJECT = 53;

    /**
     * The meta object id for the '<em>Session Status Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getSessionStatusObject()
     * @generated
     */
    int SESSION_STATUS_OBJECT = 54;

    /**
     * The meta object id for the '<em>Text Format Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getTextFormatTypeObject()
     * @generated
     */
    int TEXT_FORMAT_TYPE_OBJECT = 55;

    /**
     * The meta object id for the '<em>Text Wrap Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getTextWrapTypeObject()
     * @generated
     */
    int TEXT_WRAP_TYPE_OBJECT = 56;

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.AxisAttributes <em>Axis Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Axis Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.AxisAttributes
     * @generated
     */
    EClass getAxisAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.AxisAttributes#getAxisType <em>Axis Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Axis Type</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.AxisAttributes#getAxisType()
     * @see #getAxisAttributes()
     * @generated
     */
    EAttribute getAxisAttributes_AxisType();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.AxisAttributes#isOnColumnLayout <em>On Column Layout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>On Column Layout</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.AxisAttributes#isOnColumnLayout()
     * @see #getAxisAttributes()
     * @generated
     */
    EAttribute getAxisAttributes_OnColumnLayout();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ColumnDefinition <em>Column Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Column Definition</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ColumnDefinition
     * @generated
     */
    EClass getColumnDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ColumnDefinition#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ColumnDefinition#getAttributes()
     * @see #getColumnDefinition()
     * @generated
     */
    EReference getColumnDefinition_Attributes();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ColumnDefinition#getUsageHints <em>Usage Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Usage Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ColumnDefinition#getUsageHints()
     * @see #getColumnDefinition()
     * @generated
     */
    EReference getColumnDefinition_UsageHints();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ColumnDefinition#getMultiDimensionAttributes <em>Multi Dimension Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Multi Dimension Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ColumnDefinition#getMultiDimensionAttributes()
     * @see #getColumnDefinition()
     * @generated
     */
    EReference getColumnDefinition_MultiDimensionAttributes();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DataAccessDesign <em>Data Access Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Access Design</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataAccessDesign
     * @generated
     */
    EClass getDataAccessDesign();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataAccessDesign#getDataSetDesign <em>Data Set Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Set Design</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataAccessDesign#getDataSetDesign()
     * @see #getDataAccessDesign()
     * @generated
     */
    EReference getDataAccessDesign_DataSetDesign();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DataElementAttributes <em>Data Element Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Element Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementAttributes
     * @generated
     */
    EClass getDataElementAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getName()
     * @see #getDataElementAttributes()
     * @generated
     */
    EAttribute getDataElementAttributes_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Position</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getPosition()
     * @see #getDataElementAttributes()
     * @generated
     */
    EAttribute getDataElementAttributes_Position();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getNativeDataTypeCode <em>Native Data Type Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Native Data Type Code</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getNativeDataTypeCode()
     * @see #getDataElementAttributes()
     * @generated
     */
    EAttribute getDataElementAttributes_NativeDataTypeCode();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Precision</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getPrecision()
     * @see #getDataElementAttributes()
     * @generated
     */
    EAttribute getDataElementAttributes_Precision();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getScale <em>Scale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scale</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getScale()
     * @see #getDataElementAttributes()
     * @generated
     */
    EAttribute getDataElementAttributes_Scale();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getNullability <em>Nullability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullability</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getNullability()
     * @see #getDataElementAttributes()
     * @generated
     */
    EAttribute getDataElementAttributes_Nullability();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getUiHints <em>Ui Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Ui Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementAttributes#getUiHints()
     * @see #getDataElementAttributes()
     * @generated
     */
    EReference getDataElementAttributes_UiHints();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DataElementUIHints <em>Data Element UI Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Element UI Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementUIHints
     * @generated
     */
    EClass getDataElementUIHints();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataElementUIHints#getDisplayName <em>Display Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementUIHints#getDisplayName()
     * @see #getDataElementUIHints()
     * @generated
     */
    EAttribute getDataElementUIHints_DisplayName();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataElementUIHints#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataElementUIHints#getDescription()
     * @see #getDataElementUIHints()
     * @generated
     */
    EAttribute getDataElementUIHints_Description();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign <em>Data Set Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set Design</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign
     * @generated
     */
    EClass getDataSetDesign();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getName()
     * @see #getDataSetDesign()
     * @generated
     */
    EAttribute getDataSetDesign_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getOdaExtensionDataSetId <em>Oda Extension Data Set Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Oda Extension Data Set Id</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getOdaExtensionDataSetId()
     * @see #getDataSetDesign()
     * @generated
     */
    EAttribute getDataSetDesign_OdaExtensionDataSetId();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getDataSourceDesign <em>Data Source Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Source Design</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getDataSourceDesign()
     * @see #getDataSetDesign()
     * @generated
     */
    EReference getDataSetDesign_DataSourceDesign();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getQuery <em>Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Query</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getQuery()
     * @see #getDataSetDesign()
     * @generated
     */
    EReference getDataSetDesign_Query();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getDisplayName <em>Display Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getDisplayName()
     * @see #getDataSetDesign()
     * @generated
     */
    EAttribute getDataSetDesign_DisplayName();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getPublicProperties <em>Public Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Public Properties</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getPublicProperties()
     * @see #getDataSetDesign()
     * @generated
     */
    EReference getDataSetDesign_PublicProperties();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getPrivateProperties <em>Private Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Private Properties</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getPrivateProperties()
     * @see #getDataSetDesign()
     * @generated
     */
    EReference getDataSetDesign_PrivateProperties();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getResultSets <em>Result Sets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Result Sets</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getResultSets()
     * @see #getDataSetDesign()
     * @generated
     */
    EReference getDataSetDesign_ResultSets();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getPrimaryResultSetName <em>Primary Result Set Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Primary Result Set Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getPrimaryResultSetName()
     * @see #getDataSetDesign()
     * @generated
     */
    EAttribute getDataSetDesign_PrimaryResultSetName();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameters</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetDesign#getParameters()
     * @see #getDataSetDesign()
     * @generated
     */
    EReference getDataSetDesign_Parameters();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DataSetParameters <em>Data Set Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set Parameters</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetParameters
     * @generated
     */
    EClass getDataSetParameters();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.datatools.connectivity.oda.design.DataSetParameters#getParameterDefinitions <em>Parameter Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter Definitions</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetParameters#getParameterDefinitions()
     * @see #getDataSetParameters()
     * @generated
     */
    EReference getDataSetParameters_ParameterDefinitions();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSetParameters#isDerivedMetaData <em>Derived Meta Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Derived Meta Data</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetParameters#isDerivedMetaData()
     * @see #getDataSetParameters()
     * @generated
     */
    EAttribute getDataSetParameters_DerivedMetaData();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DataSetQuery <em>Data Set Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set Query</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetQuery
     * @generated
     */
    EClass getDataSetQuery();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSetQuery#getQueryText <em>Query Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Query Text</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSetQuery#getQueryText()
     * @see #getDataSetQuery()
     * @generated
     */
    EAttribute getDataSetQuery_QueryText();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign <em>Data Source Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Source Design</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign
     * @generated
     */
    EClass getDataSourceDesign();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getName()
     * @see #getDataSourceDesign()
     * @generated
     */
    EAttribute getDataSourceDesign_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getOdaExtensionId <em>Oda Extension Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Oda Extension Id</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getOdaExtensionId()
     * @see #getDataSourceDesign()
     * @generated
     */
    EAttribute getDataSourceDesign_OdaExtensionId();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getOdaExtensionDataSourceId <em>Oda Extension Data Source Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Oda Extension Data Source Id</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getOdaExtensionDataSourceId()
     * @see #getDataSourceDesign()
     * @generated
     */
    EAttribute getDataSourceDesign_OdaExtensionDataSourceId();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getDisplayName <em>Display Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getDisplayName()
     * @see #getDataSourceDesign()
     * @generated
     */
    EAttribute getDataSourceDesign_DisplayName();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getPublicProperties <em>Public Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Public Properties</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getPublicProperties()
     * @see #getDataSourceDesign()
     * @generated
     */
    EReference getDataSourceDesign_PublicProperties();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getPrivateProperties <em>Private Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Private Properties</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getPrivateProperties()
     * @see #getDataSourceDesign()
     * @generated
     */
    EReference getDataSourceDesign_PrivateProperties();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getLinkedProfileName <em>Linked Profile Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Linked Profile Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getLinkedProfileName()
     * @see #getDataSourceDesign()
     * @generated
     */
    EAttribute getDataSourceDesign_LinkedProfileName();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getLinkedProfileStoreFilePath <em>Linked Profile Store File Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Linked Profile Store File Path</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DataSourceDesign#getLinkedProfileStoreFilePath()
     * @see #getDataSourceDesign()
     * @generated
     */
    EAttribute getDataSourceDesign_LinkedProfileStoreFilePath();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DesignerState <em>Designer State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Designer State</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignerState
     * @generated
     */
    EClass getDesignerState();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DesignerState#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignerState#getVersion()
     * @see #getDesignerState()
     * @generated
     */
    EAttribute getDesignerState_Version();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DesignerState#getStateContent <em>State Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>State Content</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignerState#getStateContent()
     * @see #getDesignerState()
     * @generated
     */
    EReference getDesignerState_StateContent();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DesignerStateContent <em>Designer State Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Designer State Content</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignerStateContent
     * @generated
     */
    EClass getDesignerStateContent();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DesignerStateContent#getStateContentAsString <em>State Content As String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State Content As String</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignerStateContent#getStateContentAsString()
     * @see #getDesignerStateContent()
     * @generated
     */
    EAttribute getDesignerStateContent_StateContentAsString();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DesignerStateContent#getStateContentAsBlob <em>State Content As Blob</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State Content As Blob</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignerStateContent#getStateContentAsBlob()
     * @see #getDesignerStateContent()
     * @generated
     */
    EAttribute getDesignerStateContent_StateContentAsBlob();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest <em>Session Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Session Request</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest
     * @generated
     */
    EClass getDesignSessionRequest();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest#getDataAccessDesign <em>Data Access Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Access Design</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest#getDataAccessDesign()
     * @see #getDesignSessionRequest()
     * @generated
     */
    EReference getDesignSessionRequest_DataAccessDesign();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest#isEditable <em>Editable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editable</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest#isEditable()
     * @see #getDesignSessionRequest()
     * @generated
     */
    EAttribute getDesignSessionRequest_Editable();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest#getSessionLocale <em>Session Locale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Session Locale</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest#getSessionLocale()
     * @see #getDesignSessionRequest()
     * @generated
     */
    EReference getDesignSessionRequest_SessionLocale();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest#getDesignerState <em>Designer State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Designer State</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest#getDesignerState()
     * @see #getDesignSessionRequest()
     * @generated
     */
    EReference getDesignSessionRequest_DesignerState();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionResponse <em>Session Response</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Session Response</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionResponse
     * @generated
     */
    EClass getDesignSessionResponse();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionResponse#getSessionStatus <em>Session Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Session Status</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionResponse#getSessionStatus()
     * @see #getDesignSessionResponse()
     * @generated
     */
    EAttribute getDesignSessionResponse_SessionStatus();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionResponse#getDataAccessDesign <em>Data Access Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Access Design</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionResponse#getDataAccessDesign()
     * @see #getDesignSessionResponse()
     * @generated
     */
    EReference getDesignSessionResponse_DataAccessDesign();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DesignSessionResponse#getDesignerState <em>Designer State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Designer State</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DesignSessionResponse#getDesignerState()
     * @see #getDesignSessionResponse()
     * @generated
     */
    EReference getDesignSessionResponse_DesignerState();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link org.eclipse.datatools.connectivity.oda.design.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link org.eclipse.datatools.connectivity.oda.design.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link org.eclipse.datatools.connectivity.oda.design.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DocumentRoot#getOdaDesignSession <em>Oda Design Session</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Oda Design Session</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DocumentRoot#getOdaDesignSession()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_OdaDesignSession();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery <em>Dynamic Values Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dynamic Values Query</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery
     * @generated
     */
    EClass getDynamicValuesQuery();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery#getDataSetDesign <em>Data Set Design</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Set Design</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery#getDataSetDesign()
     * @see #getDynamicValuesQuery()
     * @generated
     */
    EReference getDynamicValuesQuery_DataSetDesign();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery#isEnabled <em>Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enabled</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery#isEnabled()
     * @see #getDynamicValuesQuery()
     * @generated
     */
    EAttribute getDynamicValuesQuery_Enabled();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery#getValueColumn <em>Value Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value Column</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery#getValueColumn()
     * @see #getDynamicValuesQuery()
     * @generated
     */
    EAttribute getDynamicValuesQuery_ValueColumn();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery#getDisplayNameColumn <em>Display Name Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Name Column</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.DynamicValuesQuery#getDisplayNameColumn()
     * @see #getDynamicValuesQuery()
     * @generated
     */
    EAttribute getDynamicValuesQuery_DisplayNameColumn();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.InputElementAttributes <em>Input Element Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Element Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementAttributes
     * @generated
     */
    EClass getInputElementAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#getDefaultScalarValue <em>Default Scalar Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Scalar Value</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#getDefaultScalarValue()
     * @see #getInputElementAttributes()
     * @generated
     */
    EAttribute getInputElementAttributes_DefaultScalarValue();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#isEditable <em>Editable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Editable</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#isEditable()
     * @see #getInputElementAttributes()
     * @generated
     */
    EAttribute getInputElementAttributes_Editable();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#isOptional <em>Optional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Optional</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#isOptional()
     * @see #getInputElementAttributes()
     * @generated
     */
    EAttribute getInputElementAttributes_Optional();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#isMasksValue <em>Masks Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Masks Value</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#isMasksValue()
     * @see #getInputElementAttributes()
     * @generated
     */
    EAttribute getInputElementAttributes_MasksValue();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#getStaticValueChoices <em>Static Value Choices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Static Value Choices</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#getStaticValueChoices()
     * @see #getInputElementAttributes()
     * @generated
     */
    EReference getInputElementAttributes_StaticValueChoices();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#getDynamicValueChoices <em>Dynamic Value Choices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Dynamic Value Choices</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#getDynamicValueChoices()
     * @see #getInputElementAttributes()
     * @generated
     */
    EReference getInputElementAttributes_DynamicValueChoices();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#getUiHints <em>Ui Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Ui Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementAttributes#getUiHints()
     * @see #getInputElementAttributes()
     * @generated
     */
    EReference getInputElementAttributes_UiHints();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.InputElementUIHints <em>Input Element UI Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Element UI Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementUIHints
     * @generated
     */
    EClass getInputElementUIHints();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.InputElementUIHints#getPromptStyle <em>Prompt Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prompt Style</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputElementUIHints#getPromptStyle()
     * @see #getInputElementUIHints()
     * @generated
     */
    EAttribute getInputElementUIHints_PromptStyle();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.InputParameterAttributes <em>Input Parameter Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Parameter Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputParameterAttributes
     * @generated
     */
    EClass getInputParameterAttributes();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.InputParameterAttributes#getElementAttributes <em>Element Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Element Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputParameterAttributes#getElementAttributes()
     * @see #getInputParameterAttributes()
     * @generated
     */
    EReference getInputParameterAttributes_ElementAttributes();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.InputParameterAttributes#getUiHints <em>Ui Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Ui Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputParameterAttributes#getUiHints()
     * @see #getInputParameterAttributes()
     * @generated
     */
    EReference getInputParameterAttributes_UiHints();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.InputParameterUIHints <em>Input Parameter UI Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Parameter UI Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputParameterUIHints
     * @generated
     */
    EClass getInputParameterUIHints();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.InputParameterUIHints#getGroupPromptDisplayName <em>Group Prompt Display Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Prompt Display Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputParameterUIHints#getGroupPromptDisplayName()
     * @see #getInputParameterUIHints()
     * @generated
     */
    EAttribute getInputParameterUIHints_GroupPromptDisplayName();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.Locale <em>Locale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Locale</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Locale
     * @generated
     */
    EClass getLocale();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.Locale#getLanguage <em>Language</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Language</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Locale#getLanguage()
     * @see #getLocale()
     * @generated
     */
    EAttribute getLocale_Language();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.Locale#getCountry <em>Country</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Country</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Locale#getCountry()
     * @see #getLocale()
     * @generated
     */
    EAttribute getLocale_Country();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.Locale#getVariant <em>Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variant</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Locale#getVariant()
     * @see #getLocale()
     * @generated
     */
    EAttribute getLocale_Variant();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.NameValuePair <em>Name Value Pair</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name Value Pair</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.NameValuePair
     * @generated
     */
    EClass getNameValuePair();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.NameValuePair#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.NameValuePair#getName()
     * @see #getNameValuePair()
     * @generated
     */
    EAttribute getNameValuePair_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.NameValuePair#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.NameValuePair#getValue()
     * @see #getNameValuePair()
     * @generated
     */
    EAttribute getNameValuePair_Value();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.OdaDesignSession <em>Oda Design Session</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Oda Design Session</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OdaDesignSession
     * @generated
     */
    EClass getOdaDesignSession();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.OdaDesignSession#getRequest <em>Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Request</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OdaDesignSession#getRequest()
     * @see #getOdaDesignSession()
     * @generated
     */
    EReference getOdaDesignSession_Request();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.OdaDesignSession#getResponse <em>Response</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Response</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OdaDesignSession#getResponse()
     * @see #getOdaDesignSession()
     * @generated
     */
    EReference getOdaDesignSession_Response();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.OutputElementAttributes <em>Output Element Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Element Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OutputElementAttributes
     * @generated
     */
    EClass getOutputElementAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.OutputElementAttributes#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OutputElementAttributes#getLabel()
     * @see #getOutputElementAttributes()
     * @generated
     */
    EAttribute getOutputElementAttributes_Label();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.OutputElementAttributes#getFormattingHints <em>Formatting Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Formatting Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OutputElementAttributes#getFormattingHints()
     * @see #getOutputElementAttributes()
     * @generated
     */
    EReference getOutputElementAttributes_FormattingHints();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.OutputElementAttributes#getHelpText <em>Help Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Help Text</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OutputElementAttributes#getHelpText()
     * @see #getOutputElementAttributes()
     * @generated
     */
    EAttribute getOutputElementAttributes_HelpText();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ParameterDefinition <em>Parameter Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Definition</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterDefinition
     * @generated
     */
    EClass getParameterDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getInOutMode <em>In Out Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Out Mode</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getInOutMode()
     * @see #getParameterDefinition()
     * @generated
     */
    EAttribute getParameterDefinition_InOutMode();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getAttributes()
     * @see #getParameterDefinition()
     * @generated
     */
    EReference getParameterDefinition_Attributes();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getInputAttributes <em>Input Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getInputAttributes()
     * @see #getParameterDefinition()
     * @generated
     */
    EReference getParameterDefinition_InputAttributes();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getOutputUsageHints <em>Output Usage Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Usage Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getOutputUsageHints()
     * @see #getParameterDefinition()
     * @generated
     */
    EReference getParameterDefinition_OutputUsageHints();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getFields <em>Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Fields</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterDefinition#getFields()
     * @see #getParameterDefinition()
     * @generated
     */
    EReference getParameterDefinition_Fields();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ParameterFieldDefinition <em>Parameter Field Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Field Definition</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterFieldDefinition
     * @generated
     */
    EClass getParameterFieldDefinition();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ParameterFieldDefinition#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterFieldDefinition#getAttributes()
     * @see #getParameterFieldDefinition()
     * @generated
     */
    EReference getParameterFieldDefinition_Attributes();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ParameterFieldDefinition#getInputAttributes <em>Input Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Input Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterFieldDefinition#getInputAttributes()
     * @see #getParameterFieldDefinition()
     * @generated
     */
    EReference getParameterFieldDefinition_InputAttributes();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ParameterFieldDefinition#getOutputUsageHints <em>Output Usage Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Output Usage Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterFieldDefinition#getOutputUsageHints()
     * @see #getParameterFieldDefinition()
     * @generated
     */
    EReference getParameterFieldDefinition_OutputUsageHints();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ParameterFields <em>Parameter Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Fields</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterFields
     * @generated
     */
    EClass getParameterFields();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.datatools.connectivity.oda.design.ParameterFields#getFieldCollection <em>Field Collection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Field Collection</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterFields#getFieldCollection()
     * @see #getParameterFields()
     * @generated
     */
    EReference getParameterFields_FieldCollection();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.Properties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Properties</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Properties
     * @generated
     */
    EClass getProperties();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.datatools.connectivity.oda.design.Properties#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Properties#getProperties()
     * @see #getProperties()
     * @generated
     */
    EReference getProperties_Properties();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.Property#getNameValue <em>Name Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Name Value</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Property#getNameValue()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_NameValue();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.Property#getDesignAttributes <em>Design Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Design Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.Property#getDesignAttributes()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_DesignAttributes();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.PropertyAttributes <em>Property Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.PropertyAttributes
     * @generated
     */
    EClass getPropertyAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.PropertyAttributes#getDisplayName <em>Display Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.PropertyAttributes#getDisplayName()
     * @see #getPropertyAttributes()
     * @generated
     */
    EAttribute getPropertyAttributes_DisplayName();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.PropertyAttributes#getElementAttributes <em>Element Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Element Attributes</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.PropertyAttributes#getElementAttributes()
     * @see #getPropertyAttributes()
     * @generated
     */
    EReference getPropertyAttributes_ElementAttributes();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.PropertyAttributes#isDerivedMetaData <em>Derived Meta Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Derived Meta Data</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.PropertyAttributes#isDerivedMetaData()
     * @see #getPropertyAttributes()
     * @generated
     */
    EAttribute getPropertyAttributes_DerivedMetaData();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ResultSetColumns <em>Result Set Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Set Columns</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ResultSetColumns
     * @generated
     */
    EClass getResultSetColumns();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.datatools.connectivity.oda.design.ResultSetColumns#getResultColumnDefinitions <em>Result Column Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Result Column Definitions</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ResultSetColumns#getResultColumnDefinitions()
     * @see #getResultSetColumns()
     * @generated
     */
    EReference getResultSetColumns_ResultColumnDefinitions();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ResultSetDefinition <em>Result Set Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Set Definition</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ResultSetDefinition
     * @generated
     */
    EClass getResultSetDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ResultSetDefinition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ResultSetDefinition#getName()
     * @see #getResultSetDefinition()
     * @generated
     */
    EAttribute getResultSetDefinition_Name();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.datatools.connectivity.oda.design.ResultSetDefinition#getResultSetColumns <em>Result Set Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Result Set Columns</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ResultSetDefinition#getResultSetColumns()
     * @see #getResultSetDefinition()
     * @generated
     */
    EReference getResultSetDefinition_ResultSetColumns();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ResultSets <em>Result Sets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Result Sets</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ResultSets
     * @generated
     */
    EClass getResultSets();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.datatools.connectivity.oda.design.ResultSets#getResultSetDefinitions <em>Result Set Definitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Result Set Definitions</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ResultSets#getResultSetDefinitions()
     * @see #getResultSets()
     * @generated
     */
    EReference getResultSets_ResultSetDefinitions();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ResultSets#isDerivedMetaData <em>Derived Meta Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Derived Meta Data</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ResultSets#isDerivedMetaData()
     * @see #getResultSets()
     * @generated
     */
    EAttribute getResultSets_DerivedMetaData();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ScalarValueChoices <em>Scalar Value Choices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scalar Value Choices</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ScalarValueChoices
     * @generated
     */
    EClass getScalarValueChoices();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.datatools.connectivity.oda.design.ScalarValueChoices#getScalarValues <em>Scalar Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scalar Values</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ScalarValueChoices#getScalarValues()
     * @see #getScalarValueChoices()
     * @generated
     */
    EReference getScalarValueChoices_ScalarValues();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ScalarValueDefinition <em>Scalar Value Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scalar Value Definition</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ScalarValueDefinition
     * @generated
     */
    EClass getScalarValueDefinition();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ScalarValueDefinition#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ScalarValueDefinition#getValue()
     * @see #getScalarValueDefinition()
     * @generated
     */
    EAttribute getScalarValueDefinition_Value();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ScalarValueDefinition#getDisplayName <em>Display Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Name</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ScalarValueDefinition#getDisplayName()
     * @see #getScalarValueDefinition()
     * @generated
     */
    EAttribute getScalarValueDefinition_DisplayName();

    /**
     * Returns the meta object for class '{@link org.eclipse.datatools.connectivity.oda.design.ValueFormatHints <em>Value Format Hints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Format Hints</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ValueFormatHints
     * @generated
     */
    EClass getValueFormatHints();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getDisplaySize <em>Display Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Size</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getDisplaySize()
     * @see #getValueFormatHints()
     * @generated
     */
    EAttribute getValueFormatHints_DisplaySize();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getDisplayFormat <em>Display Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Display Format</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getDisplayFormat()
     * @see #getValueFormatHints()
     * @generated
     */
    EAttribute getValueFormatHints_DisplayFormat();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getTextFormatType <em>Text Format Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text Format Type</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getTextFormatType()
     * @see #getValueFormatHints()
     * @generated
     */
    EAttribute getValueFormatHints_TextFormatType();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getHorizontalAlignment()
     * @see #getValueFormatHints()
     * @generated
     */
    EAttribute getValueFormatHints_HorizontalAlignment();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getTextWrapType <em>Text Wrap Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text Wrap Type</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ValueFormatHints#getTextWrapType()
     * @see #getValueFormatHints()
     * @generated
     */
    EAttribute getValueFormatHints_TextWrapType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.AxisType <em>Axis Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Axis Type</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.AxisType
     * @generated
     */
    EEnum getAxisType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.ElementNullability <em>Element Nullability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Element Nullability</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ElementNullability
     * @generated
     */
    EEnum getElementNullability();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.HorizontalAlignment <em>Horizontal Alignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Horizontal Alignment</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.HorizontalAlignment
     * @generated
     */
    EEnum getHorizontalAlignment();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.InputPromptControlStyle <em>Input Prompt Control Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Input Prompt Control Style</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.InputPromptControlStyle
     * @generated
     */
    EEnum getInputPromptControlStyle();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.OdaComplexDataType <em>Oda Complex Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Oda Complex Data Type</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OdaComplexDataType
     * @generated
     */
    EEnum getOdaComplexDataType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.OdaScalarDataType <em>Oda Scalar Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Oda Scalar Data Type</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.OdaScalarDataType
     * @generated
     */
    EEnum getOdaScalarDataType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.ParameterMode <em>Parameter Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Parameter Mode</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.ParameterMode
     * @generated
     */
    EEnum getParameterMode();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.SessionStatus <em>Session Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Session Status</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.SessionStatus
     * @generated
     */
    EEnum getSessionStatus();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.TextFormatType <em>Text Format Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Text Format Type</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.TextFormatType
     * @generated
     */
    EEnum getTextFormatType();

    /**
     * Returns the meta object for enum '{@link org.eclipse.datatools.connectivity.oda.design.TextWrapType <em>Text Wrap Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Text Wrap Type</em>'.
     * @see org.eclipse.datatools.connectivity.oda.design.TextWrapType
     * @generated
     */
    EEnum getTextWrapType();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Axis Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Axis Type Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='AxisType:Object' baseType='AxisType'" 
     * @generated
     */
    EDataType getAxisTypeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Element Nullability Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Element Nullability Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='ElementNullability:Object' baseType='ElementNullability'" 
     * @generated
     */
    EDataType getElementNullabilityObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Horizontal Alignment Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Horizontal Alignment Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='HorizontalAlignment:Object' baseType='HorizontalAlignment'" 
     * @generated
     */
    EDataType getHorizontalAlignmentObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Input Prompt Control Style Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Input Prompt Control Style Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='InputPromptControlStyle:Object' baseType='InputPromptControlStyle'" 
     * @generated
     */
    EDataType getInputPromptControlStyleObject();

    /**
     * Returns the meta object for data type '<em>Native Data Type Code</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Native Data Type Code</em>'.
     * @model instanceClass="int"
     *        extendedMetaData="name='NativeDataTypeCode' baseType='http://www.eclipse.org/emf/2003/XMLType#int'" 
     * @generated
     */
    EDataType getNativeDataTypeCode();

    /**
     * Returns the meta object for data type '{@link java.lang.Integer <em>Native Data Type Code Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Native Data Type Code Object</em>'.
     * @see java.lang.Integer
     * @model instanceClass="java.lang.Integer"
     *        extendedMetaData="name='NativeDataTypeCode:Object' baseType='NativeDataTypeCode'" 
     * @generated
     */
    EDataType getNativeDataTypeCodeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Oda Complex Data Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Oda Complex Data Type Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='OdaComplexDataType:Object' baseType='OdaComplexDataType'" 
     * @generated
     */
    EDataType getOdaComplexDataTypeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Oda Scalar Data Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Oda Scalar Data Type Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='OdaScalarDataType:Object' baseType='OdaScalarDataType'" 
     * @generated
     */
    EDataType getOdaScalarDataTypeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Parameter Mode Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Parameter Mode Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='ParameterMode:Object' baseType='ParameterMode'" 
     * @generated
     */
    EDataType getParameterModeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Session Status Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Session Status Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='SessionStatus:Object' baseType='SessionStatus'" 
     * @generated
     */
    EDataType getSessionStatusObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Text Format Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Text Format Type Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='TextFormatType:Object' baseType='TextFormatType'" 
     * @generated
     */
    EDataType getTextFormatTypeObject();

    /**
     * Returns the meta object for data type '{@link org.eclipse.emf.common.util.AbstractEnumerator <em>Text Wrap Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Text Wrap Type Object</em>'.
     * @see org.eclipse.emf.common.util.AbstractEnumerator
     * @model instanceClass="org.eclipse.emf.common.util.AbstractEnumerator"
     *        extendedMetaData="name='TextWrapType:Object' baseType='TextWrapType'" 
     * @generated
     */
    EDataType getTextWrapTypeObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DesignFactory getDesignFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.AxisAttributesImpl <em>Axis Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.AxisAttributesImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getAxisAttributes()
         * @generated
         */
        EClass AXIS_ATTRIBUTES = eINSTANCE.getAxisAttributes();

        /**
         * The meta object literal for the '<em><b>Axis Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AXIS_ATTRIBUTES__AXIS_TYPE = eINSTANCE
                .getAxisAttributes_AxisType();

        /**
         * The meta object literal for the '<em><b>On Column Layout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AXIS_ATTRIBUTES__ON_COLUMN_LAYOUT = eINSTANCE
                .getAxisAttributes_OnColumnLayout();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ColumnDefinitionImpl <em>Column Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ColumnDefinitionImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getColumnDefinition()
         * @generated
         */
        EClass COLUMN_DEFINITION = eINSTANCE.getColumnDefinition();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_DEFINITION__ATTRIBUTES = eINSTANCE
                .getColumnDefinition_Attributes();

        /**
         * The meta object literal for the '<em><b>Usage Hints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_DEFINITION__USAGE_HINTS = eINSTANCE
                .getColumnDefinition_UsageHints();

        /**
         * The meta object literal for the '<em><b>Multi Dimension Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN_DEFINITION__MULTI_DIMENSION_ATTRIBUTES = eINSTANCE
                .getColumnDefinition_MultiDimensionAttributes();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataAccessDesignImpl <em>Data Access Design</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DataAccessDesignImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataAccessDesign()
         * @generated
         */
        EClass DATA_ACCESS_DESIGN = eINSTANCE.getDataAccessDesign();

        /**
         * The meta object literal for the '<em><b>Data Set Design</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ACCESS_DESIGN__DATA_SET_DESIGN = eINSTANCE
                .getDataAccessDesign_DataSetDesign();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataElementAttributesImpl <em>Data Element Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DataElementAttributesImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataElementAttributes()
         * @generated
         */
        EClass DATA_ELEMENT_ATTRIBUTES = eINSTANCE.getDataElementAttributes();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT_ATTRIBUTES__NAME = eINSTANCE
                .getDataElementAttributes_Name();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT_ATTRIBUTES__POSITION = eINSTANCE
                .getDataElementAttributes_Position();

        /**
         * The meta object literal for the '<em><b>Native Data Type Code</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT_ATTRIBUTES__NATIVE_DATA_TYPE_CODE = eINSTANCE
                .getDataElementAttributes_NativeDataTypeCode();

        /**
         * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT_ATTRIBUTES__PRECISION = eINSTANCE
                .getDataElementAttributes_Precision();

        /**
         * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT_ATTRIBUTES__SCALE = eINSTANCE
                .getDataElementAttributes_Scale();

        /**
         * The meta object literal for the '<em><b>Nullability</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT_ATTRIBUTES__NULLABILITY = eINSTANCE
                .getDataElementAttributes_Nullability();

        /**
         * The meta object literal for the '<em><b>Ui Hints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ELEMENT_ATTRIBUTES__UI_HINTS = eINSTANCE
                .getDataElementAttributes_UiHints();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataElementUIHintsImpl <em>Data Element UI Hints</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DataElementUIHintsImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataElementUIHints()
         * @generated
         */
        EClass DATA_ELEMENT_UI_HINTS = eINSTANCE.getDataElementUIHints();

        /**
         * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT_UI_HINTS__DISPLAY_NAME = eINSTANCE
                .getDataElementUIHints_DisplayName();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ELEMENT_UI_HINTS__DESCRIPTION = eINSTANCE
                .getDataElementUIHints_Description();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataSetDesignImpl <em>Data Set Design</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DataSetDesignImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataSetDesign()
         * @generated
         */
        EClass DATA_SET_DESIGN = eINSTANCE.getDataSetDesign();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET_DESIGN__NAME = eINSTANCE.getDataSetDesign_Name();

        /**
         * The meta object literal for the '<em><b>Oda Extension Data Set Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET_DESIGN__ODA_EXTENSION_DATA_SET_ID = eINSTANCE
                .getDataSetDesign_OdaExtensionDataSetId();

        /**
         * The meta object literal for the '<em><b>Data Source Design</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET_DESIGN__DATA_SOURCE_DESIGN = eINSTANCE
                .getDataSetDesign_DataSourceDesign();

        /**
         * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET_DESIGN__QUERY = eINSTANCE.getDataSetDesign_Query();

        /**
         * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET_DESIGN__DISPLAY_NAME = eINSTANCE
                .getDataSetDesign_DisplayName();

        /**
         * The meta object literal for the '<em><b>Public Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET_DESIGN__PUBLIC_PROPERTIES = eINSTANCE
                .getDataSetDesign_PublicProperties();

        /**
         * The meta object literal for the '<em><b>Private Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET_DESIGN__PRIVATE_PROPERTIES = eINSTANCE
                .getDataSetDesign_PrivateProperties();

        /**
         * The meta object literal for the '<em><b>Result Sets</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET_DESIGN__RESULT_SETS = eINSTANCE
                .getDataSetDesign_ResultSets();

        /**
         * The meta object literal for the '<em><b>Primary Result Set Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET_DESIGN__PRIMARY_RESULT_SET_NAME = eINSTANCE
                .getDataSetDesign_PrimaryResultSetName();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET_DESIGN__PARAMETERS = eINSTANCE
                .getDataSetDesign_Parameters();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataSetParametersImpl <em>Data Set Parameters</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DataSetParametersImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataSetParameters()
         * @generated
         */
        EClass DATA_SET_PARAMETERS = eINSTANCE.getDataSetParameters();

        /**
         * The meta object literal for the '<em><b>Parameter Definitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET_PARAMETERS__PARAMETER_DEFINITIONS = eINSTANCE
                .getDataSetParameters_ParameterDefinitions();

        /**
         * The meta object literal for the '<em><b>Derived Meta Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET_PARAMETERS__DERIVED_META_DATA = eINSTANCE
                .getDataSetParameters_DerivedMetaData();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataSetQueryImpl <em>Data Set Query</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DataSetQueryImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataSetQuery()
         * @generated
         */
        EClass DATA_SET_QUERY = eINSTANCE.getDataSetQuery();

        /**
         * The meta object literal for the '<em><b>Query Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET_QUERY__QUERY_TEXT = eINSTANCE
                .getDataSetQuery_QueryText();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DataSourceDesignImpl <em>Data Source Design</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DataSourceDesignImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDataSourceDesign()
         * @generated
         */
        EClass DATA_SOURCE_DESIGN = eINSTANCE.getDataSourceDesign();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SOURCE_DESIGN__NAME = eINSTANCE
                .getDataSourceDesign_Name();

        /**
         * The meta object literal for the '<em><b>Oda Extension Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SOURCE_DESIGN__ODA_EXTENSION_ID = eINSTANCE
                .getDataSourceDesign_OdaExtensionId();

        /**
         * The meta object literal for the '<em><b>Oda Extension Data Source Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SOURCE_DESIGN__ODA_EXTENSION_DATA_SOURCE_ID = eINSTANCE
                .getDataSourceDesign_OdaExtensionDataSourceId();

        /**
         * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SOURCE_DESIGN__DISPLAY_NAME = eINSTANCE
                .getDataSourceDesign_DisplayName();

        /**
         * The meta object literal for the '<em><b>Public Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SOURCE_DESIGN__PUBLIC_PROPERTIES = eINSTANCE
                .getDataSourceDesign_PublicProperties();

        /**
         * The meta object literal for the '<em><b>Private Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SOURCE_DESIGN__PRIVATE_PROPERTIES = eINSTANCE
                .getDataSourceDesign_PrivateProperties();

        /**
         * The meta object literal for the '<em><b>Linked Profile Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SOURCE_DESIGN__LINKED_PROFILE_NAME = eINSTANCE
                .getDataSourceDesign_LinkedProfileName();

        /**
         * The meta object literal for the '<em><b>Linked Profile Store File Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SOURCE_DESIGN__LINKED_PROFILE_STORE_FILE_PATH = eINSTANCE
                .getDataSourceDesign_LinkedProfileStoreFilePath();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DesignerStateImpl <em>Designer State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignerStateImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDesignerState()
         * @generated
         */
        EClass DESIGNER_STATE = eINSTANCE.getDesignerState();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESIGNER_STATE__VERSION = eINSTANCE
                .getDesignerState_Version();

        /**
         * The meta object literal for the '<em><b>State Content</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DESIGNER_STATE__STATE_CONTENT = eINSTANCE
                .getDesignerState_StateContent();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DesignerStateContentImpl <em>Designer State Content</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignerStateContentImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDesignerStateContent()
         * @generated
         */
        EClass DESIGNER_STATE_CONTENT = eINSTANCE.getDesignerStateContent();

        /**
         * The meta object literal for the '<em><b>State Content As String</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESIGNER_STATE_CONTENT__STATE_CONTENT_AS_STRING = eINSTANCE
                .getDesignerStateContent_StateContentAsString();

        /**
         * The meta object literal for the '<em><b>State Content As Blob</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESIGNER_STATE_CONTENT__STATE_CONTENT_AS_BLOB = eINSTANCE
                .getDesignerStateContent_StateContentAsBlob();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DesignSessionRequestImpl <em>Session Request</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignSessionRequestImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDesignSessionRequest()
         * @generated
         */
        EClass DESIGN_SESSION_REQUEST = eINSTANCE.getDesignSessionRequest();

        /**
         * The meta object literal for the '<em><b>Data Access Design</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DESIGN_SESSION_REQUEST__DATA_ACCESS_DESIGN = eINSTANCE
                .getDesignSessionRequest_DataAccessDesign();

        /**
         * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESIGN_SESSION_REQUEST__EDITABLE = eINSTANCE
                .getDesignSessionRequest_Editable();

        /**
         * The meta object literal for the '<em><b>Session Locale</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DESIGN_SESSION_REQUEST__SESSION_LOCALE = eINSTANCE
                .getDesignSessionRequest_SessionLocale();

        /**
         * The meta object literal for the '<em><b>Designer State</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DESIGN_SESSION_REQUEST__DESIGNER_STATE = eINSTANCE
                .getDesignSessionRequest_DesignerState();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DesignSessionResponseImpl <em>Session Response</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignSessionResponseImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDesignSessionResponse()
         * @generated
         */
        EClass DESIGN_SESSION_RESPONSE = eINSTANCE.getDesignSessionResponse();

        /**
         * The meta object literal for the '<em><b>Session Status</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESIGN_SESSION_RESPONSE__SESSION_STATUS = eINSTANCE
                .getDesignSessionResponse_SessionStatus();

        /**
         * The meta object literal for the '<em><b>Data Access Design</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DESIGN_SESSION_RESPONSE__DATA_ACCESS_DESIGN = eINSTANCE
                .getDesignSessionResponse_DataAccessDesign();

        /**
         * The meta object literal for the '<em><b>Designer State</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DESIGN_SESSION_RESPONSE__DESIGNER_STATE = eINSTANCE
                .getDesignSessionResponse_DesignerState();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DocumentRootImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE
                .getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE
                .getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Oda Design Session</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ODA_DESIGN_SESSION = eINSTANCE
                .getDocumentRoot_OdaDesignSession();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.DynamicValuesQueryImpl <em>Dynamic Values Query</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DynamicValuesQueryImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getDynamicValuesQuery()
         * @generated
         */
        EClass DYNAMIC_VALUES_QUERY = eINSTANCE.getDynamicValuesQuery();

        /**
         * The meta object literal for the '<em><b>Data Set Design</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DYNAMIC_VALUES_QUERY__DATA_SET_DESIGN = eINSTANCE
                .getDynamicValuesQuery_DataSetDesign();

        /**
         * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DYNAMIC_VALUES_QUERY__ENABLED = eINSTANCE
                .getDynamicValuesQuery_Enabled();

        /**
         * The meta object literal for the '<em><b>Value Column</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DYNAMIC_VALUES_QUERY__VALUE_COLUMN = eINSTANCE
                .getDynamicValuesQuery_ValueColumn();

        /**
         * The meta object literal for the '<em><b>Display Name Column</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DYNAMIC_VALUES_QUERY__DISPLAY_NAME_COLUMN = eINSTANCE
                .getDynamicValuesQuery_DisplayNameColumn();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.InputElementAttributesImpl <em>Input Element Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.InputElementAttributesImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputElementAttributes()
         * @generated
         */
        EClass INPUT_ELEMENT_ATTRIBUTES = eINSTANCE.getInputElementAttributes();

        /**
         * The meta object literal for the '<em><b>Default Scalar Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_ELEMENT_ATTRIBUTES__DEFAULT_SCALAR_VALUE = eINSTANCE
                .getInputElementAttributes_DefaultScalarValue();

        /**
         * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_ELEMENT_ATTRIBUTES__EDITABLE = eINSTANCE
                .getInputElementAttributes_Editable();

        /**
         * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_ELEMENT_ATTRIBUTES__OPTIONAL = eINSTANCE
                .getInputElementAttributes_Optional();

        /**
         * The meta object literal for the '<em><b>Masks Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_ELEMENT_ATTRIBUTES__MASKS_VALUE = eINSTANCE
                .getInputElementAttributes_MasksValue();

        /**
         * The meta object literal for the '<em><b>Static Value Choices</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_ELEMENT_ATTRIBUTES__STATIC_VALUE_CHOICES = eINSTANCE
                .getInputElementAttributes_StaticValueChoices();

        /**
         * The meta object literal for the '<em><b>Dynamic Value Choices</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_ELEMENT_ATTRIBUTES__DYNAMIC_VALUE_CHOICES = eINSTANCE
                .getInputElementAttributes_DynamicValueChoices();

        /**
         * The meta object literal for the '<em><b>Ui Hints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_ELEMENT_ATTRIBUTES__UI_HINTS = eINSTANCE
                .getInputElementAttributes_UiHints();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.InputElementUIHintsImpl <em>Input Element UI Hints</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.InputElementUIHintsImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputElementUIHints()
         * @generated
         */
        EClass INPUT_ELEMENT_UI_HINTS = eINSTANCE.getInputElementUIHints();

        /**
         * The meta object literal for the '<em><b>Prompt Style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_ELEMENT_UI_HINTS__PROMPT_STYLE = eINSTANCE
                .getInputElementUIHints_PromptStyle();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.InputParameterAttributesImpl <em>Input Parameter Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.InputParameterAttributesImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputParameterAttributes()
         * @generated
         */
        EClass INPUT_PARAMETER_ATTRIBUTES = eINSTANCE
                .getInputParameterAttributes();

        /**
         * The meta object literal for the '<em><b>Element Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PARAMETER_ATTRIBUTES__ELEMENT_ATTRIBUTES = eINSTANCE
                .getInputParameterAttributes_ElementAttributes();

        /**
         * The meta object literal for the '<em><b>Ui Hints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INPUT_PARAMETER_ATTRIBUTES__UI_HINTS = eINSTANCE
                .getInputParameterAttributes_UiHints();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.InputParameterUIHintsImpl <em>Input Parameter UI Hints</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.InputParameterUIHintsImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputParameterUIHints()
         * @generated
         */
        EClass INPUT_PARAMETER_UI_HINTS = eINSTANCE.getInputParameterUIHints();

        /**
         * The meta object literal for the '<em><b>Group Prompt Display Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INPUT_PARAMETER_UI_HINTS__GROUP_PROMPT_DISPLAY_NAME = eINSTANCE
                .getInputParameterUIHints_GroupPromptDisplayName();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.LocaleImpl <em>Locale</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.LocaleImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getLocale()
         * @generated
         */
        EClass LOCALE = eINSTANCE.getLocale();

        /**
         * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCALE__LANGUAGE = eINSTANCE.getLocale_Language();

        /**
         * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCALE__COUNTRY = eINSTANCE.getLocale_Country();

        /**
         * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCALE__VARIANT = eINSTANCE.getLocale_Variant();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.NameValuePairImpl <em>Name Value Pair</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.NameValuePairImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getNameValuePair()
         * @generated
         */
        EClass NAME_VALUE_PAIR = eINSTANCE.getNameValuePair();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAME_VALUE_PAIR__NAME = eINSTANCE.getNameValuePair_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAME_VALUE_PAIR__VALUE = eINSTANCE.getNameValuePair_Value();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.OdaDesignSessionImpl <em>Oda Design Session</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.OdaDesignSessionImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaDesignSession()
         * @generated
         */
        EClass ODA_DESIGN_SESSION = eINSTANCE.getOdaDesignSession();

        /**
         * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ODA_DESIGN_SESSION__REQUEST = eINSTANCE
                .getOdaDesignSession_Request();

        /**
         * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ODA_DESIGN_SESSION__RESPONSE = eINSTANCE
                .getOdaDesignSession_Response();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.OutputElementAttributesImpl <em>Output Element Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.OutputElementAttributesImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOutputElementAttributes()
         * @generated
         */
        EClass OUTPUT_ELEMENT_ATTRIBUTES = eINSTANCE
                .getOutputElementAttributes();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_ELEMENT_ATTRIBUTES__LABEL = eINSTANCE
                .getOutputElementAttributes_Label();

        /**
         * The meta object literal for the '<em><b>Formatting Hints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OUTPUT_ELEMENT_ATTRIBUTES__FORMATTING_HINTS = eINSTANCE
                .getOutputElementAttributes_FormattingHints();

        /**
         * The meta object literal for the '<em><b>Help Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OUTPUT_ELEMENT_ATTRIBUTES__HELP_TEXT = eINSTANCE
                .getOutputElementAttributes_HelpText();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ParameterDefinitionImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterDefinition()
         * @generated
         */
        EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

        /**
         * The meta object literal for the '<em><b>In Out Mode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_DEFINITION__IN_OUT_MODE = eINSTANCE
                .getParameterDefinition_InOutMode();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_DEFINITION__ATTRIBUTES = eINSTANCE
                .getParameterDefinition_Attributes();

        /**
         * The meta object literal for the '<em><b>Input Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_DEFINITION__INPUT_ATTRIBUTES = eINSTANCE
                .getParameterDefinition_InputAttributes();

        /**
         * The meta object literal for the '<em><b>Output Usage Hints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_DEFINITION__OUTPUT_USAGE_HINTS = eINSTANCE
                .getParameterDefinition_OutputUsageHints();

        /**
         * The meta object literal for the '<em><b>Fields</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_DEFINITION__FIELDS = eINSTANCE
                .getParameterDefinition_Fields();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ParameterFieldDefinitionImpl <em>Parameter Field Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ParameterFieldDefinitionImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterFieldDefinition()
         * @generated
         */
        EClass PARAMETER_FIELD_DEFINITION = eINSTANCE
                .getParameterFieldDefinition();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_FIELD_DEFINITION__ATTRIBUTES = eINSTANCE
                .getParameterFieldDefinition_Attributes();

        /**
         * The meta object literal for the '<em><b>Input Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_FIELD_DEFINITION__INPUT_ATTRIBUTES = eINSTANCE
                .getParameterFieldDefinition_InputAttributes();

        /**
         * The meta object literal for the '<em><b>Output Usage Hints</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_FIELD_DEFINITION__OUTPUT_USAGE_HINTS = eINSTANCE
                .getParameterFieldDefinition_OutputUsageHints();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ParameterFieldsImpl <em>Parameter Fields</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ParameterFieldsImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterFields()
         * @generated
         */
        EClass PARAMETER_FIELDS = eINSTANCE.getParameterFields();

        /**
         * The meta object literal for the '<em><b>Field Collection</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_FIELDS__FIELD_COLLECTION = eINSTANCE
                .getParameterFields_FieldCollection();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.PropertiesImpl <em>Properties</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.PropertiesImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getProperties()
         * @generated
         */
        EClass PROPERTIES = eINSTANCE.getProperties();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTIES__PROPERTIES = eINSTANCE
                .getProperties_Properties();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.PropertyImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Name Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__NAME_VALUE = eINSTANCE.getProperty_NameValue();

        /**
         * The meta object literal for the '<em><b>Design Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__DESIGN_ATTRIBUTES = eINSTANCE
                .getProperty_DesignAttributes();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.PropertyAttributesImpl <em>Property Attributes</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.PropertyAttributesImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getPropertyAttributes()
         * @generated
         */
        EClass PROPERTY_ATTRIBUTES = eINSTANCE.getPropertyAttributes();

        /**
         * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_ATTRIBUTES__DISPLAY_NAME = eINSTANCE
                .getPropertyAttributes_DisplayName();

        /**
         * The meta object literal for the '<em><b>Element Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_ATTRIBUTES__ELEMENT_ATTRIBUTES = eINSTANCE
                .getPropertyAttributes_ElementAttributes();

        /**
         * The meta object literal for the '<em><b>Derived Meta Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY_ATTRIBUTES__DERIVED_META_DATA = eINSTANCE
                .getPropertyAttributes_DerivedMetaData();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ResultSetColumnsImpl <em>Result Set Columns</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ResultSetColumnsImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getResultSetColumns()
         * @generated
         */
        EClass RESULT_SET_COLUMNS = eINSTANCE.getResultSetColumns();

        /**
         * The meta object literal for the '<em><b>Result Column Definitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESULT_SET_COLUMNS__RESULT_COLUMN_DEFINITIONS = eINSTANCE
                .getResultSetColumns_ResultColumnDefinitions();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ResultSetDefinitionImpl <em>Result Set Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ResultSetDefinitionImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getResultSetDefinition()
         * @generated
         */
        EClass RESULT_SET_DEFINITION = eINSTANCE.getResultSetDefinition();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_SET_DEFINITION__NAME = eINSTANCE
                .getResultSetDefinition_Name();

        /**
         * The meta object literal for the '<em><b>Result Set Columns</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESULT_SET_DEFINITION__RESULT_SET_COLUMNS = eINSTANCE
                .getResultSetDefinition_ResultSetColumns();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ResultSetsImpl <em>Result Sets</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ResultSetsImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getResultSets()
         * @generated
         */
        EClass RESULT_SETS = eINSTANCE.getResultSets();

        /**
         * The meta object literal for the '<em><b>Result Set Definitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RESULT_SETS__RESULT_SET_DEFINITIONS = eINSTANCE
                .getResultSets_ResultSetDefinitions();

        /**
         * The meta object literal for the '<em><b>Derived Meta Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESULT_SETS__DERIVED_META_DATA = eINSTANCE
                .getResultSets_DerivedMetaData();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ScalarValueChoicesImpl <em>Scalar Value Choices</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ScalarValueChoicesImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getScalarValueChoices()
         * @generated
         */
        EClass SCALAR_VALUE_CHOICES = eINSTANCE.getScalarValueChoices();

        /**
         * The meta object literal for the '<em><b>Scalar Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCALAR_VALUE_CHOICES__SCALAR_VALUES = eINSTANCE
                .getScalarValueChoices_ScalarValues();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ScalarValueDefinitionImpl <em>Scalar Value Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ScalarValueDefinitionImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getScalarValueDefinition()
         * @generated
         */
        EClass SCALAR_VALUE_DEFINITION = eINSTANCE.getScalarValueDefinition();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCALAR_VALUE_DEFINITION__VALUE = eINSTANCE
                .getScalarValueDefinition_Value();

        /**
         * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCALAR_VALUE_DEFINITION__DISPLAY_NAME = eINSTANCE
                .getScalarValueDefinition_DisplayName();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.impl.ValueFormatHintsImpl <em>Value Format Hints</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.ValueFormatHintsImpl
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getValueFormatHints()
         * @generated
         */
        EClass VALUE_FORMAT_HINTS = eINSTANCE.getValueFormatHints();

        /**
         * The meta object literal for the '<em><b>Display Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_FORMAT_HINTS__DISPLAY_SIZE = eINSTANCE
                .getValueFormatHints_DisplaySize();

        /**
         * The meta object literal for the '<em><b>Display Format</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_FORMAT_HINTS__DISPLAY_FORMAT = eINSTANCE
                .getValueFormatHints_DisplayFormat();

        /**
         * The meta object literal for the '<em><b>Text Format Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_FORMAT_HINTS__TEXT_FORMAT_TYPE = eINSTANCE
                .getValueFormatHints_TextFormatType();

        /**
         * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_FORMAT_HINTS__HORIZONTAL_ALIGNMENT = eINSTANCE
                .getValueFormatHints_HorizontalAlignment();

        /**
         * The meta object literal for the '<em><b>Text Wrap Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_FORMAT_HINTS__TEXT_WRAP_TYPE = eINSTANCE
                .getValueFormatHints_TextWrapType();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.AxisType <em>Axis Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.AxisType
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getAxisType()
         * @generated
         */
        EEnum AXIS_TYPE = eINSTANCE.getAxisType();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.ElementNullability <em>Element Nullability</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.ElementNullability
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getElementNullability()
         * @generated
         */
        EEnum ELEMENT_NULLABILITY = eINSTANCE.getElementNullability();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.HorizontalAlignment <em>Horizontal Alignment</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.HorizontalAlignment
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getHorizontalAlignment()
         * @generated
         */
        EEnum HORIZONTAL_ALIGNMENT = eINSTANCE.getHorizontalAlignment();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.InputPromptControlStyle <em>Input Prompt Control Style</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.InputPromptControlStyle
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputPromptControlStyle()
         * @generated
         */
        EEnum INPUT_PROMPT_CONTROL_STYLE = eINSTANCE
                .getInputPromptControlStyle();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.OdaComplexDataType <em>Oda Complex Data Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.OdaComplexDataType
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaComplexDataType()
         * @generated
         */
        EEnum ODA_COMPLEX_DATA_TYPE = eINSTANCE.getOdaComplexDataType();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.OdaScalarDataType <em>Oda Scalar Data Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.OdaScalarDataType
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaScalarDataType()
         * @generated
         */
        EEnum ODA_SCALAR_DATA_TYPE = eINSTANCE.getOdaScalarDataType();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.ParameterMode <em>Parameter Mode</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.ParameterMode
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterMode()
         * @generated
         */
        EEnum PARAMETER_MODE = eINSTANCE.getParameterMode();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.SessionStatus <em>Session Status</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.SessionStatus
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getSessionStatus()
         * @generated
         */
        EEnum SESSION_STATUS = eINSTANCE.getSessionStatus();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.TextFormatType <em>Text Format Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.TextFormatType
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getTextFormatType()
         * @generated
         */
        EEnum TEXT_FORMAT_TYPE = eINSTANCE.getTextFormatType();

        /**
         * The meta object literal for the '{@link org.eclipse.datatools.connectivity.oda.design.TextWrapType <em>Text Wrap Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.TextWrapType
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getTextWrapType()
         * @generated
         */
        EEnum TEXT_WRAP_TYPE = eINSTANCE.getTextWrapType();

        /**
         * The meta object literal for the '<em>Axis Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getAxisTypeObject()
         * @generated
         */
        EDataType AXIS_TYPE_OBJECT = eINSTANCE.getAxisTypeObject();

        /**
         * The meta object literal for the '<em>Element Nullability Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getElementNullabilityObject()
         * @generated
         */
        EDataType ELEMENT_NULLABILITY_OBJECT = eINSTANCE
                .getElementNullabilityObject();

        /**
         * The meta object literal for the '<em>Horizontal Alignment Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getHorizontalAlignmentObject()
         * @generated
         */
        EDataType HORIZONTAL_ALIGNMENT_OBJECT = eINSTANCE
                .getHorizontalAlignmentObject();

        /**
         * The meta object literal for the '<em>Input Prompt Control Style Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getInputPromptControlStyleObject()
         * @generated
         */
        EDataType INPUT_PROMPT_CONTROL_STYLE_OBJECT = eINSTANCE
                .getInputPromptControlStyleObject();

        /**
         * The meta object literal for the '<em>Native Data Type Code</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getNativeDataTypeCode()
         * @generated
         */
        EDataType NATIVE_DATA_TYPE_CODE = eINSTANCE.getNativeDataTypeCode();

        /**
         * The meta object literal for the '<em>Native Data Type Code Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Integer
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getNativeDataTypeCodeObject()
         * @generated
         */
        EDataType NATIVE_DATA_TYPE_CODE_OBJECT = eINSTANCE
                .getNativeDataTypeCodeObject();

        /**
         * The meta object literal for the '<em>Oda Complex Data Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaComplexDataTypeObject()
         * @generated
         */
        EDataType ODA_COMPLEX_DATA_TYPE_OBJECT = eINSTANCE
                .getOdaComplexDataTypeObject();

        /**
         * The meta object literal for the '<em>Oda Scalar Data Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getOdaScalarDataTypeObject()
         * @generated
         */
        EDataType ODA_SCALAR_DATA_TYPE_OBJECT = eINSTANCE
                .getOdaScalarDataTypeObject();

        /**
         * The meta object literal for the '<em>Parameter Mode Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getParameterModeObject()
         * @generated
         */
        EDataType PARAMETER_MODE_OBJECT = eINSTANCE.getParameterModeObject();

        /**
         * The meta object literal for the '<em>Session Status Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getSessionStatusObject()
         * @generated
         */
        EDataType SESSION_STATUS_OBJECT = eINSTANCE.getSessionStatusObject();

        /**
         * The meta object literal for the '<em>Text Format Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getTextFormatTypeObject()
         * @generated
         */
        EDataType TEXT_FORMAT_TYPE_OBJECT = eINSTANCE.getTextFormatTypeObject();

        /**
         * The meta object literal for the '<em>Text Wrap Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.AbstractEnumerator
         * @see org.eclipse.datatools.connectivity.oda.design.impl.DesignPackageImpl#getTextWrapTypeObject()
         * @generated
         */
        EDataType TEXT_WRAP_TYPE_OBJECT = eINSTANCE.getTextWrapTypeObject();

    }

} //DesignPackage