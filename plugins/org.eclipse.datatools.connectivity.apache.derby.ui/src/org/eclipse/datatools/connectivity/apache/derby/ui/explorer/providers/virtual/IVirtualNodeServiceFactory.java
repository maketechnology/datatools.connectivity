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
package org.eclipse.datatools.connectivity.apache.derby.ui.explorer.providers.virtual;

import org.eclipse.datatools.connectivity.apache.derby.internal.ui.explorer.providers.virtual.NodeFactory;
public interface IVirtualNodeServiceFactory {
    public static final IVirtualNodeServiceFactory INSTANCE = new NodeFactory();
    
    public ISynonymFolder makeSynonymFolder (String name, String displayName, Object parent);

}
