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
package org.eclipse.ui.contexts;

import java.util.Collection;

import org.eclipse.core.commands.contexts.Context;
import org.eclipse.ui.IService;

/**
 * @since 3.1
 */
public interface IContextService extends IService {

	/**
	 * Retrieves the context with the given identifier. If no such context
	 * exists, then an undefined context with the given id is created.
	 * 
	 * @param contextId
	 *            The identifier to find; must not be <code>null</code>.
	 * @return A context with the given identifier, either defined or undefined.
	 */
	public Context getContext(String contextId);

	/**
	 * Returns the collection of the identifiers for all of the defined contexts
	 * in the workbench.
	 * 
	 * @return The collection of context identifiers (<code>String</code>)
	 *         that are defined; never <code>null</code>, but may be empty.
	 */
	public Collection getDefinedContextIds();

}
