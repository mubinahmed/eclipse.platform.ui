/*
Copyright (c) 2000, 2001, 2002 IBM Corp.
All rights reserved.  This program and the accompanying materials
are made available under the terms of the Common Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/cpl-v10.html
*/

package org.eclipse.ui.internal.actions.keybindings;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import org.eclipse.jface.preference.IPreferenceStore;

import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.internal.IWorkbenchConstants;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.WorkbenchPlugin;

public class PreferencePage extends org.eclipse.jface.preference.PreferencePage
	implements IWorkbenchPreferencePage {
	
	private Button buttonCustomize;
	private Combo comboConfiguration;
	private String configurationId;
	private HashMap nameToConfigurationMap;
	private KeyManager keyManager;
	private SortedSet preferenceBindingSet;
	private IPreferenceStore preferenceStore;
	private SortedSet registryBindingSet;
	private SortedMap registryConfigurationMap;
	private SortedMap registryScopeMap;
	private TabFolder tabFolder;
	private IWorkbench workbench;

	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setFont(parent.getFont());
		GridLayout gridLayoutComposite = new GridLayout();
		gridLayoutComposite.marginWidth = 0;
		gridLayoutComposite.marginHeight = 0;
		composite.setLayout(gridLayoutComposite);

		tabFolder = new TabFolder(composite, SWT.NULL);
		GridData gridDataTabFolder = new GridData(GridData.FILL_BOTH);
		tabFolder.setLayoutData(gridDataTabFolder);
		
		TabItem tabItemGeneral = new TabItem(tabFolder, SWT.NULL);
		tabItemGeneral.setText("General");
		tabItemGeneral.setImage(ImageFactory.getImage("key"));

		Composite compositeGeneral = new Composite(tabFolder, SWT.NULL);
		compositeGeneral.setFont(composite.getFont());
		GridLayout layoutGeneral = new GridLayout();
		layoutGeneral.marginWidth = 8;
		layoutGeneral.marginHeight = 8;
		compositeGeneral.setLayout(layoutGeneral);

		tabItemGeneral.setControl(compositeGeneral);

		Label label = new Label(compositeGeneral, SWT.LEFT);
		label.setFont(parent.getFont());
		label.setText("Active Configuration:");

		comboConfiguration = new Combo(compositeGeneral, SWT.READ_ONLY);
		GridData gridData = new GridData();
		gridData.widthHint = 200;
		comboConfiguration.setLayoutData(gridData);

		if (nameToConfigurationMap.isEmpty())
			comboConfiguration.setEnabled(false);
		else {
			String[] items = (String[]) nameToConfigurationMap.keySet().toArray(new String[nameToConfigurationMap.size()]);
			Arrays.sort(items, Collator.getInstance());
			comboConfiguration.setItems(items);
			Configuration configuration = (Configuration) registryConfigurationMap.get(configurationId);

			if (configuration != null)
				comboConfiguration.select(comboConfiguration.indexOf(configuration.getLabel().getName()));
		}
		
		TabItem tabItemCustomize = new TabItem(tabFolder, SWT.NULL);
		tabItemCustomize.setText("Customize");
		tabItemCustomize.setImage(ImageFactory.getImage("pencil"));

		Composite compositeCustomize = new Composite(tabFolder, SWT.NULL);		
		compositeCustomize.setFont(composite.getFont());
		GridLayout layoutCustomize = new GridLayout();
		layoutCustomize.marginWidth = 8;
		layoutCustomize.marginHeight = 8;
		compositeCustomize.setLayout(layoutCustomize);

		tabItemCustomize.setControl(compositeCustomize);

		buttonCustomize = new Button(compositeCustomize, SWT.LEFT | SWT.PUSH);
		buttonCustomize.setText("Customize Key Bindings...");
		setButtonLayoutData(buttonCustomize);

		buttonCustomize.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				DialogCustomize dialogCustomize = new DialogCustomize(getShell(), IWorkbenchConstants.DEFAULT_ACCELERATOR_CONFIGURATION_ID, 
					IWorkbenchConstants.DEFAULT_ACCELERATOR_SCOPE_ID, preferenceBindingSet);
				
				if (dialogCustomize.open() == DialogCustomize.OK) {
					preferenceBindingSet = dialogCustomize.getPreferenceBindingSet();	
				}
				
				//TBD: doesn't this have to be disposed somehow?
			}	
		});

		//TBD: WorkbenchHelp.setHelp(parent, IHelpContextIds.WORKBENCH_KEYBINDINGS_PREFERENCE_PAGE);
		
		return composite;	
	}

	public void init(IWorkbench workbench) {
		this.workbench = workbench;
		preferenceStore = getPreferenceStore();
		configurationId = loadConfiguration();		
		keyManager = KeyManager.getInstance();
		preferenceBindingSet = keyManager.getPreferenceBindingSet();
		registryBindingSet = keyManager.getRegistryBindingSet();
		registryConfigurationMap = keyManager.getRegistryConfigurationMap();
		registryScopeMap = keyManager.getRegistryScopeMap();	
		nameToConfigurationMap = new HashMap();	
		Collection configurations = registryConfigurationMap.values();
		Iterator iterator = configurations.iterator();

		while (iterator.hasNext()) {
			Configuration configuration = (Configuration) iterator.next();
			String name = configuration.getLabel().getName();
			
			if (!nameToConfigurationMap.containsKey(name))
				nameToConfigurationMap.put(name, configuration);
		}	
	}
	
	protected void performDefaults() {
		int result = SWT.YES;
		
		if (!preferenceBindingSet.isEmpty()) {		
			MessageBox messageBox = new MessageBox(getShell(), SWT.YES | SWT.NO | SWT.ICON_WARNING | SWT.APPLICATION_MODAL);
			messageBox.setText("Restore Defaults");
			messageBox.setMessage("This will clear all of your customized key bindings.\r\nAre you sure you want to do this?");
			result = messageBox.open();
		}
		
		if (result == SWT.YES) {			
			if (comboConfiguration != null && comboConfiguration.isEnabled()) {
				comboConfiguration.clearSelection();
				comboConfiguration.deselectAll();
				configurationId = preferenceStore.getDefaultString(IWorkbenchConstants.ACCELERATOR_CONFIGURATION_ID);
				Configuration configuration = (Configuration) registryConfigurationMap.get(configurationId);

				if (configuration != null)
					comboConfiguration.select(comboConfiguration.indexOf(configuration.getLabel().getName()));
			}

			preferenceBindingSet = new TreeSet();
		}
	}	
	
	public boolean performOk() {
		if (comboConfiguration != null && comboConfiguration.isEnabled()) {
			String configurationName = comboConfiguration.getItem(comboConfiguration.getSelectionIndex());
			
			if (configurationName != null) {				
				Configuration configuration = (Configuration) nameToConfigurationMap.get(configurationName);
				
				if (configuration != null) {
					configurationId = configuration.getLabel().getId();
					saveConfiguration(configurationId);					

					keyManager.setPreferenceBindingSet(preferenceBindingSet);
					keyManager.savePreference();					
					keyManager.update();

					if (workbench instanceof Workbench) {
						Workbench workbench = (Workbench) this.workbench;
						workbench.setActiveAcceleratorConfiguration(configuration);
					}
				}
			}
		}
		
		return super.performOk();
	}
	
	protected IPreferenceStore doGetPreferenceStore() {
		return WorkbenchPlugin.getDefault().getPreferenceStore();
	}
	
	private String loadConfiguration() {
		String configuration = preferenceStore.getString(IWorkbenchConstants.ACCELERATOR_CONFIGURATION_ID);
		
		if (configuration.length() != 0)
			return configuration;
		else {
			String defaultConfiguration = preferenceStore.getDefaultString(IWorkbenchConstants.ACCELERATOR_CONFIGURATION_ID);		
			preferenceStore.setValue(IWorkbenchConstants.ACCELERATOR_CONFIGURATION_ID, defaultConfiguration);
			return defaultConfiguration;
		}
	}
	
	private void saveConfiguration(String configuration)
		throws IllegalArgumentException {
		if (configuration == null)
			throw new IllegalArgumentException();

		preferenceStore.setValue(IWorkbenchConstants.ACCELERATOR_CONFIGURATION_ID, configuration);
	}
}
