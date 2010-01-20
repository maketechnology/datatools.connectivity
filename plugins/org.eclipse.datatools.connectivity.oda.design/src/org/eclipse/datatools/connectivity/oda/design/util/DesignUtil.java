/**
 *************************************************************************
 * Copyright (c) 2006, 2010 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation - initial API and implementation
 *  
 *************************************************************************
 *
 * $Id: DesignUtil.java,v 1.17 2009/05/08 00:55:25 lchan Exp $
 */

package org.eclipse.datatools.connectivity.oda.design.util;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.datatools.connectivity.oda.design.ColumnDefinition;
import org.eclipse.datatools.connectivity.oda.design.DataSourceDesign;
import org.eclipse.datatools.connectivity.oda.design.DesignFactory;
import org.eclipse.datatools.connectivity.oda.design.DesignPackage;
import org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest;
import org.eclipse.datatools.connectivity.oda.design.DocumentRoot;
import org.eclipse.datatools.connectivity.oda.design.ExpressionVariable;
import org.eclipse.datatools.connectivity.oda.design.ExpressionVariableType;
import org.eclipse.datatools.connectivity.oda.design.OdaDesignSession;
import org.eclipse.datatools.connectivity.oda.design.Properties;
import org.eclipse.datatools.connectivity.oda.design.Property;
import org.eclipse.datatools.connectivity.oda.design.ResultSetColumns;
import org.eclipse.datatools.connectivity.oda.design.SortKey;
import org.eclipse.datatools.connectivity.oda.design.nls.Messages;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;

/**
 * An utility class to handle the ODA Design API objects.
 * @generated NOT
 */
public class DesignUtil
{
    private static Diagnostician sm_diagnostician;
    
    // trace logging variables
    private static final String sm_loggerName = "org.eclipse.datatools.connectivity.oda.design.util"; //$NON-NLS-1$
    private static String sm_className;
    private static Logger sm_logger;
    
    // class has static methods only; not intended to instantiate
    private DesignUtil()
    {
    }
    
    /**
     * Validates the given EMF object is valid and has all required
     * elements. 
     * @param eObject   an EMF object
     * @throws IllegalStateException    if the given object is not valid
     *                  and have error diagnostics;
     *                  the exception thrown includes all error and warning
     *                  diagnostic messages found in given object
     */
    public static void validateObject( EObject eObject )
        throws IllegalStateException
    {
        final String context = "validateObject";  //$NON-NLS-1$
        
        Diagnostic diagnostic = diagnoseObject( eObject );
        if( diagnostic == null || 
            diagnostic.getSeverity() == Diagnostic.OK )
            return;     // eObject is valid
        
        // found error diagnostic(s), thrown exception 
        // with all error and warning messages
        if( diagnostic.getSeverity() == Diagnostic.ERROR )
        {
            String errWarnMsg = getDiagnosticMessages( diagnostic, 
                                        Diagnostic.ERROR,
                                        Diagnostic.WARNING );
    
            throw new IllegalStateException( errWarnMsg );
        }
        
        // only found warning or informational diagnostic(s), 
        // simply log it; the given object is considered valid
        String diagnosticMsg = getDiagnosticMessages( diagnostic, 
                                    Diagnostic.WARNING,
                                    Diagnostic.INFO );
        
        if( diagnostic.getSeverity() == Diagnostic.WARNING )
        {
            Throwable ex = new DiagnosticException( diagnostic );           
            getLogger().logp( Level.WARNING, sm_className, context,
                                diagnosticMsg, ex ); 
        }
        else    // informational diagnostic(s) only
        {
            getLogger().logp( Level.INFO, sm_className, context,
                                diagnosticMsg ); 
        }
        return;     // eObject is considered valid
    }

    /**
     * Diagnoses the given EMF object, and returns the diagnostic result found. 
     * @param eObject   an EMF object
     * @return  the diagnostic result, or null if no diagnostic result found 
     */
    public static Diagnostic diagnoseObject( EObject eObject )
    {
        if( ! canDiagnose() )
            return null;    // assumes eObject is valid
        
        Diagnostician designDiagnostician = getDiagnostician();
        return designDiagnostician.validate( eObject );
    }
    
    /**
     * Returns the Diagnostician for the ODA Design model,
     * using a validator registry with specialized design validator(s).
     * @return Diagnostician
     */
    private static Diagnostician getDiagnostician()
    {
        if( sm_diagnostician == null )
        {
            synchronized( DesignUtil.class )
            {
                if( sm_diagnostician == null )
                {
                    EValidator.Registry eValidatorRegistry = EValidator.Registry.INSTANCE;
            
                    // add specialized design validator(s) to registry
                    // for use by Diagnostician
                    eValidatorRegistry.put( (EPackage) DesignPackage.Literals.DATA_SET_QUERY.eContainer(),
                                            new DesignValidator() );
                    sm_diagnostician = new Diagnostician( eValidatorRegistry );
                }
            }
        }
        
        return sm_diagnostician;
    }
    
    /**
     * Concatenates and returns all messages of the two specified messageTypes
     * from given diagnostic.
     */   
    private static String getDiagnosticMessages( Diagnostic diagnostic,
                                    int messageType1, int messageType2 )
    {
        if( diagnostic == null )
            return null;

        String errMsg = diagnostic.getMessage();
        for( Iterator i = diagnostic.getChildren().iterator(); i.hasNext();)
        {
            Diagnostic childDiagnostic = (Diagnostic) i.next();
            if( childDiagnostic.getSeverity() == messageType1 ||
                childDiagnostic.getSeverity() == messageType2 )
            {
                errMsg += "\n" + childDiagnostic.getMessage(); //$NON-NLS-1$
            }
        }

        return errMsg;
    }
    
    /**
     * When loading EMF plugins in a runtime web application in Eclipse 3.3, 
     * Plugin.start() of 3 EMF plug-ins were not called. 
     * This led to null bundles of those EMF plug-ins, and triggers NPE when tried 
     * to use the associated resource bundles (Eclipse Bugzilla 200892).
     * Before a fix is available, this work-around attempts to detect this use case,
     * and logs a warning message. 
     * The caller can then avoid the use of the emf.ecore Diagnostician class, 
     * which triggers a NPE in accessing its resource bundle.
     */
    private static boolean canDiagnose()
    {
        return true;
        
        /* below workaround assumes that EMF is used in 
         * plugin mode, which is not necessarily true; 
         * keep the code commented for now
         */
/*        
        final String methodName = "canDiagnose()"; //$NON-NLS-1$   
        final String CANT_DIAGNOSE_WARNING_MSG = "Unable to diagnose ODA design objects, possibly due to unavailablity of the EcorePlugin resource bundle";  //$NON-NLS-1$

        boolean canDiagnose = ( EcorePlugin.getPlugin() != null &&
                 EcorePlugin.getPlugin().getBundle() != null );
        
        if( ! canDiagnose )
            getLogger().logp( Level.WARNING, sm_className, methodName, CANT_DIAGNOSE_WARNING_MSG );
        
        return canDiagnose;
*/    }
    
    /**
     * Converts the public and private properties defined in an 
     * ODA data source design definition, and returns in a combined
     * java.util.Properties collection.
     * @param dataSourceDesign
     * @return
     */
    public static java.util.Properties convertDataSourceProperties( DataSourceDesign dataSourceDesign )
    {
        java.util.Properties publicProps = convertDesignProperties( 
                dataSourceDesign.getPublicProperties() );
        java.util.Properties propCollection = convertDesignProperties( 
                dataSourceDesign.getPrivateProperties() );

        // merge public and private properties, with public values
        // taking precedence if same property key is used
        propCollection.putAll( publicProps );
        return propCollection;        
    }

    /**
     * Converts the given design properties defined in an 
     * ODA data source or data set design definition, to
     * a java.util.Properties collection.
     * @param designProps   the ODA design properties to convert from
     * @return              converted properties in a java.util.Properties collection
     */
    public static java.util.Properties convertDesignProperties( Properties designProps )
    {
        java.util.Properties utilProps = new java.util.Properties();
        if( designProps == null || designProps.isEmpty() )
            return utilProps;  // return an empty collection
        
        Iterator itr = designProps.getProperties().iterator();
        while( itr.hasNext() )
        {
            Property designProp = (Property) itr.next();

            // util collection does not allow null name or value;
            // excludes the property in such case, which would allow
            // consumer to get a null value 
            // when a property name is not found in collection
            if( designProp.getNameValue() == null ||
                designProp.getNameValue().getName() == null ||
                designProp.getNameValue().getValue() == null )
                continue;   // skip property
            
            utilProps.setProperty( designProp.getNameValue().getName(),
                                   designProp.getNameValue().getValue() );
        }
        return utilProps;
    }
    
    /**
     * Converts the given java.util.Properties collection 
     * to ODA design properties that can be applied in an 
     * ODA data source or data set design definition.
     * @param utilProps the java.util.Properties collection to convert from
     * @return          converted properties in a design properties collection
     */
    public static Properties convertToDesignProperties( 
                                java.util.Properties utilProps )
    {
        Properties designProps = 
            DesignFactory.eINSTANCE.createProperties();
        if( utilProps == null || utilProps.size() == 0 )
            return designProps;  // return an empty collection
        
        Iterator iter = utilProps.entrySet().iterator();
        while( iter.hasNext() )
        {
            Entry utilProp = (Entry) iter.next();
            designProps.setProperty( (String) utilProp.getKey(), 
                                    (String) utilProp.getValue() );
        }

        return designProps;   
    }

    /**
     * Validates the specified design session request.
     * If valid, returns the request's ODA data source element id.
     * @param requestSession
     * @return
     * @throws IllegalStateException if specified session request is invalid
     */
    public static String validateRequestSession( 
                    DesignSessionRequest requestSession )
        throws IllegalStateException
    {
        if( requestSession == null )
            throw new IllegalStateException( Messages.design_nullArgument );
    
        validateObject( requestSession );
    
        // validate the given request' data source design
        DataSourceDesign dataSourceDesign = 
                    requestSession.getDataSourceDesign();
        if( dataSourceDesign == null )
            throw new IllegalStateException( Messages.design_missingDataSourceDesign );
    
        String odaDataSourceId = dataSourceDesign.getOdaExtensionDataSourceId();
        if( odaDataSourceId == null || odaDataSourceId.length() == 0 )
            throw new IllegalStateException( Messages.design_missingId );
    
        // done validation
        return odaDataSourceId;
    }

    /**
     * Validates the specified data source design instance.
     * @param dataSourceDesign
     * @throws IllegalStateException if specified design is invalid
     */
    public static void validateDataSourceDesign( 
                        DataSourceDesign dataSourceDesign )
        throws IllegalStateException
    {
        if( dataSourceDesign == null )
            throw new IllegalStateException( Messages.design_nullArgument );
    
        validateObject( dataSourceDesign );
    }
    
    /**
     * Converts the specified string representation of a file pathname,
     * persisted in an oda design model, to its abstract representation.
     * @param filePath  the string representation of a file
     * @return  the abstract representation of a file pathname,
     *          or null if the specified argument is null, invalid or
     *          the file does not exist
     * @see #convertFileToPath(File)
     * @since 3.0.4
     */
    public static File convertPathToFile( String filePath )
    {
        if( filePath == null || filePath.length() == 0 )
            return null;

       // First try to parse the filePath argument as file name
        File file = new File( filePath );
        if( file.exists() )
            return file;

        // next try to parse the filePath argument as an url on web
        try
        {
            URL url = new URL( filePath );
            return new File( FileLocator.toFileURL( url ).getPath( ) );
        }
        catch( MalformedURLException e )
        {
            getLogger().fine( e.toString() + " (" + filePath + ")" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        catch( IOException e )
        {
            getLogger().warning( e.toString() + " (" + filePath + ")" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        return null;
    }
    
    /**
     * Converts the specified file to a string representation
     * that can be persisted in an oda design model.
     * @param aFile the abstract representation of a file pathname
     * @return  the string representation of the specified file,
     *          or null if the specified argument is null
     * @see #convertPathToFile(String)
     * @since 3.0.4
     */
    public static String convertFileToPath( File aFile )
    {
        if( aFile == null )
            return null;
        return aFile.getPath();
    }
    
    /**
     * An utility method to save the specified OdaDesignSession instance
     * in the specified output file.
     * @param outputFile    an output file; any existing content would get overwritten
     * @param odaDesignSession  the design session instance to save
     * @throws IOException
     * @throws IllegalArgumentException
     * @since DTP 1.6
     */
    public static void saveOdaDesignSession( OdaDesignSession odaDesignSession, File outputFile )
        throws IOException, IllegalArgumentException
    {
        if( outputFile == null )
            throw new IllegalArgumentException();
        
        URI fileURI = URI.createFileURI( outputFile.getAbsolutePath() );
        saveOdaDesignSession( odaDesignSession, fileURI );
    }
    
    /**
     * An utility method to save the specified OdaDesignSession instance in the specified URI.
     * @param uri   the URI of the saved resource
     * @param odaDesignSession  the design session instance to save
     * @throws IOException
     * @since DTP 1.6
     */
    public static void saveOdaDesignSession( OdaDesignSession odaDesignSession, URI uri )
        throws IOException
    {
        DocumentRoot documentRoot = DesignFactory.eINSTANCE.createDocumentRoot();
        documentRoot.setOdaDesignSession( odaDesignSession );

        DesignXMLProcessor xmlProcessor = new DesignXMLProcessor();
        Resource resource = xmlProcessor.createResource( uri );    
        resource.getContents().add( documentRoot );
    
        // Save the contents of the resource to the URI
        try
        {
            resource.save( null );
        }
        catch( IOException ex )
        {
            // log and re-throw exception
            getLogger().logp( Level.INFO, sm_className, "saveOdaDesignSession( OdaDesignSession, URI )", //$NON-NLS-1$
                    "Not able to serialize the ODA design session to specified URI.", ex );  //$NON-NLS-1$
            throw ex;
        }
    }

    /**
     * An utility method to load the specified resource file, and returns the 
     * OdaDesignSession instance found in the file.
     * @param resourceFile  a resource file to load from
     * @return  the design session instance found in the specified file
     * @throws IOException
     * @throws IllegalArgumentException
     * @since DTP 1.6
     */
    public static OdaDesignSession loadOdaDesignSession( File resourceFile )
        throws IOException, IllegalArgumentException
    {
        if( resourceFile == null )
            throw new IllegalArgumentException();
        
        URI fileURI = URI.createFileURI( resourceFile.getAbsolutePath() );
        return loadOdaDesignSession( fileURI );
    }

    /**
     * An utility method to load the specified resource URI, and returns the 
     * OdaDesignSession instance found in the resource.
     * @param uri   the URI of the resource to load from
     * @return the design session instance found in the specified URI
     * @throws IOException
     * @since DTP 1.6
     */
    public static OdaDesignSession loadOdaDesignSession( URI uri )
        throws IOException
    {
        DesignXMLProcessor xmlProcessor = new DesignXMLProcessor();
        Resource resource = xmlProcessor.createResource( uri );    
        
        try 
        {
            resource.load( null );
        }
        catch( IOException ex ) 
        {
            // log and re-throw exception
            getLogger().logp( Level.INFO, sm_className, "loadOdaDesignSession( URI )", //$NON-NLS-1$
                    "Not able to load the specified URI.", ex );  //$NON-NLS-1$
            throw ex;
        }
        
        if( resource.getContents().isEmpty() )
        {
            getLogger().logp( Level.WARNING, sm_className, "loadOdaDesignSession( URI )", //$NON-NLS-1$
                    "The specified resource URI (" + uri.toString() + ") is empty." );  //$NON-NLS-1$ //$NON-NLS-2$
            return null;
        }
        
        Object content = resource.getContents().get( 0 );
        if( content instanceof DocumentRoot )
        {
            DocumentRoot documentRoot = (DocumentRoot) content;
            OdaDesignSession odaDesignSession = documentRoot.getOdaDesignSession();
            if( odaDesignSession != null )
                return odaDesignSession;
        }
        
        // the resource content does not contain an ODA design session
        getLogger().logp( Level.WARNING, sm_className, "loadOdaDesignSession( URI )", //$NON-NLS-1$
                "The resource URI (" + uri.toString()  //$NON-NLS-1$
                + ") does not contain an ODA Design Session." ); //$NON-NLS-1$
        return null;
    }

    /**
     * Creates a new filter expression variable for the column defined in the 
     * specified result set at the specified index.
     * @param columns   a {@link ResultSetColumns} that contains a collection of column definitions
     * @param columnIndex   0-based index of column in the specified columns; 
     *                      must be a valid index within range of the specified columns
     * @return  a new instance of {@link ExpressionVariable} based on the attributes 
     *          of the specified column; may be null if specified column does not exist
     */
    public static ExpressionVariable createFilterVariable( ResultSetColumns columns, int columnIndex )
    {
        ColumnDefinition columnDefn = columns.getResultColumnDefinitions().get( columnIndex );
        if( columnDefn == null )
            return null;
        
        String identifier = columnDefn.getAttributes().getName();
        if( identifier.length() == 0 )
            identifier = (new Integer( columnDefn.getAttributes().getPosition() )).toString();

        ExpressionVariable columnExprVar = DesignFactory.eINSTANCE.createExpressionVariable();
        columnExprVar.setIdentifier( identifier );
        columnExprVar.setNativeDataTypeCode( columnDefn.getAttributes().getNativeDataTypeCode() );
        columnExprVar.setType( ExpressionVariableType.RESULT_SET_COLUMN );
        return columnExprVar;
    }
    
    /**
     * Creates a new SortKey with the identifier, i.e. name and position, of the column 
     * defined in the specified result set at the specified index.
     * @param columns   a {@link ResultSetColumns} that contains a collection of column definitions
     * @param columnIndex   0-based index of column in the specified columns; 
     *                      must be a valid index within range of the specified columns
     * @return  a new instance of {@link SortKey} based on the name and position 
     *          of the specified column; may be null if specified column does not exist
     */
    public static SortKey createSortKeyWithColumnIdentifier( ResultSetColumns columns, int columnIndex )
    {
        ColumnDefinition columnDefn = columns.getResultColumnDefinitions().get( columnIndex );
        if( columnDefn == null )
            return null;

        SortKey aSortKey = DesignFactory.eINSTANCE.createSortKey();
        aSortKey.setColumnName( columnDefn.getAttributes().getName() );
        aSortKey.setColumnPosition( columnDefn.getAttributes().getPosition() );
        
        return aSortKey;
    }
    
    private static Logger getLogger()
    {
        if( sm_logger == null )
        {
            synchronized( DesignUtil.class )
            {
                if( sm_logger == null )
                {
                    sm_className = DesignUtil.class.getName();
                    sm_logger = Logger.getLogger( sm_loggerName );
                }
            }
        }
        return sm_logger;
    }

}
