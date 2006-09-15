/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.services;

import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.ICatalogNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IColumnNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IConnectionNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IConstraintNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IDependencyNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IIndexNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IKnownConnectionNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.ISchemaNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.ISequenceNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IStoredProcedureNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.ITableNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.ITriggerNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IUDFNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IUDTNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.IViewNode;
import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionInfo;


/**
 * @author ljulien
 */
public interface IVirtualNodeServiceFactory
{
	public IKnownConnectionNode makeKnownConnectionNode (String name, String displayName, Object parent);
	public IConnectionNode makeConnectionNode (String name, String displayName, Object parent, ConnectionInfo info);
	public IColumnNode makeColumnNode (String name, String displayName, Object parent);
	public ISchemaNode makeSchemaNode (String name, String displayName, Object parent);
	public ITableNode makeTableNode (String name, String displayName, Object parent);
	public IStoredProcedureNode makeStoredProcedureNode (String name, String displayName, Object parent);
	public IUDFNode makeUDFNode (String name, String displayName, Object parent);
	public ISequenceNode makeSequenceNode (String name, String displayName, Object parent);
	public IUDTNode makeUDTNode (String name, String displayName, Object parent);
	public IViewNode makeViewNode (String name, String displayName, Object parent);
	public ITriggerNode makeTriggerNode (String name, String displayName, Object parent);
	public IIndexNode makeIndexNode (String name, String displayName, Object parent);
	public IConstraintNode makeConstraintNode (String name, String displayName, Object parent);
	public IDependencyNode makeDependencyNode (String name, String displayName, Object parent);
	public ICatalogNode makeCatalogNode (String name, String displayName, Object parent);
}
