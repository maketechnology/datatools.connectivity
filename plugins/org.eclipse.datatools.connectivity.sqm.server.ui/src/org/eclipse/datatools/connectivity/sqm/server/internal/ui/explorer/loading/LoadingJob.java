/*******************************************************************************
 * Copyright (c) 2001, 2007 IBM Corporation and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.connectivity.sqm.server.internal.ui.explorer.loading;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.ui.progress.UIJob;

public class LoadingJob extends UIJob
{
	private ILoadingService loadingService;
	private LoadingNode placeHolder;
	private AbstractTreeViewer viewer;
	private Object parent;

	public LoadingJob(AbstractTreeViewer viewer, LoadingNode placeHolder, Object parent, ILoadingService loadingService)
	{
		super(placeHolder.getText(placeHolder));
		this.viewer = viewer;
		this.placeHolder = placeHolder;
		this.parent = parent;
		this.loadingService = loadingService;
		setRule(new NonConflictingRule());
	}

    public IStatus runInUIThread(IProgressMonitor monitor)
	{
		LoadingUIJob updateUIJob = new LoadingUIJob(viewer, placeHolder);
		updateUIJob.schedule();
		Object[] children = null;
		try
		{
			children = this.loadingService.load(parent);
		}
		finally
		{
			new ClearPlaceHolderJob(viewer, placeHolder, parent, children).schedule();
		}
		return Status.OK_STATUS;
	}

    public boolean belongsTo(Object family)
	{
		return family == LoadingNode.LOADING_FAMILY;
	}


}
