/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.internal.contexts;

import java.util.Collection;

import org.eclipse.core.commands.contexts.Context;
import org.eclipse.core.commands.contexts.ContextManager;
import org.eclipse.ui.contexts.IContextService;

/**
 * @since 3.1
 */
public class ContextService implements IContextService {

	/**
	 * The context manager that supports this service. This value is never
	 * <code>null</code>.
	 */
	private final ContextManager contextManager;

	/**
	 * Constructs a new instance of <code>ContextService</code> using a
	 * context manager.
	 * 
	 * @param contextManager
	 *            The context manager to use; must not be <code>null</code>.
	 */
	public ContextService(final ContextManager contextManager) {
		if (contextManager == null) {
			throw new NullPointerException(
					"Cannot create a context service with a null manager"); //$NON-NLS-1$
		}
		this.contextManager = contextManager;
	}
	
	public final Context getContext(final String contextId) {
		/*
		 * TODO Need to put in place protection against the context being
		 * changed.
		 */
		return contextManager.getContext(contextId);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.contexts.IContextService#getDefinedContextIds()
	 */
	public Collection getDefinedContextIds() {
		return contextManager.getDefinedContextIds();
	}
}
