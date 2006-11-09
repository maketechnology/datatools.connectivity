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
package org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.providers.content.virtual;

import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.filter.IFilterNode;
import org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.virtual.ITableNode;
import org.eclipse.datatools.connectivity.sqm.core.ui.explorer.providers.content.virtual.VirtualNode;
import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionFilter;
import org.eclipse.datatools.connectivity.sqm.internal.core.containment.GroupID;
import org.eclipse.datatools.modelbase.sql.schema.Schema;

/**
 * @author ljulien
 */
public class TableNode extends VirtualNode implements ITableNode, IFilterNode
{
	/**
	 * @param name
	 * @param displayName
	 */
	public TableNode(String name, String displayName, Object parent)
	{
		super(name, displayName, parent);
	}

    public String getGroupID ()
    {
        return GroupID.TABLE;
    }

    public String getFilterName()
    {
        return ((Schema)getParent()).getName() + IFilterNode.SEPARATOR + ConnectionFilter.TABLE_FILTER;
    }
}
