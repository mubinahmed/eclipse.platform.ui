/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.e4.workbench;

import org.eclipse.e4.ui.model.application.MContribution;

import org.eclipse.e4.core.services.IContributionFactory;
import org.eclipse.e4.core.services.context.IEclipseContext;

/**
 *
 */
public class ContributionUtils {

	/**
	 * Returns the instance of the implementation for a given contribution, if
	 * necessary create the instance and cache it
	 * 
	 * @param factory
	 *            The contribution factory to use
	 * @param contrib
	 *            The UI Model MContribution
	 * @param context
	 *            The context in which to create the instance
	 * 
	 * @return The implementation instance for this MContribution
	 */
	public static Object getInstance(IContributionFactory factory,
			MContribution contrib, IEclipseContext context) {
		if (contrib.getObject() != null)
			return contrib.getObject();

		contrib.setObject(factory.create(contrib.getURI(), context));
		return contrib.getObject();
	}

	/**
	 * Executes the 'command' represented by the given MContribution's URI
	 * 
	 * @param factory
	 *            The contribution factory to use
	 * @param contrib
	 *            The UI Model's MContribution to be executed
	 * @param context
	 *            The eclipse context in which to execute
	 */
	public static void execute(IContributionFactory factory,
			MContribution contrib, IEclipseContext context) {
		Object implementation = getInstance(factory, contrib, context);
		factory
				.call(implementation, contrib.getURI(),
						"execute", context, null); //$NON-NLS-1$
	}

}