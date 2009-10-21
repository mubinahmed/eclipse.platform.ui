/**
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      IBM Corporation - initial API and implementation
 */
package org.eclipse.e4.ui.model.application.util;

import org.eclipse.e4.ui.model.application.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.ui.model.application.MApplicationPackage
 * @generated
 */
public class ApplicationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MApplicationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MApplicationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationSwitch<Adapter> modelSwitch =
		new ApplicationSwitch<Adapter>() {
			@Override
			public Adapter caseV____________Abstract_____________V(MV____________Abstract_____________V object) {
				return createV____________Abstract_____________VAdapter();
			}
			@Override
			public Adapter caseApplicationElement(MApplicationElement object) {
				return createApplicationElementAdapter();
			}
			@Override
			public Adapter caseContribution(MContribution object) {
				return createContributionAdapter();
			}
			@Override
			public Adapter caseCommand(MCommand object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseInput(MInput object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseParameter(MParameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseUIItem(MUIItem object) {
				return createUIItemAdapter();
			}
			@Override
			public Adapter caseUIElement(MUIElement object) {
				return createUIElementAdapter();
			}
			@Override
			public Adapter caseContext(MContext object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseV_________Testing__________V(MV_________Testing__________V object) {
				return createV_________Testing__________VAdapter();
			}
			@Override
			public Adapter caseTestHarness(MTestHarness object) {
				return createTestHarnessAdapter();
			}
			@Override
			public Adapter caseV_________AbstractContainers__________V(MV_________AbstractContainers__________V object) {
				return createV_________AbstractContainers__________VAdapter();
			}
			@Override
			public <T extends MUIElement> Adapter caseElementContainer(MElementContainer<T> object) {
				return createElementContainerAdapter();
			}
			@Override
			public <T extends MUIElement> Adapter caseGenericTile(MGenericTile<T> object) {
				return createGenericTileAdapter();
			}
			@Override
			public <T extends MUIElement> Adapter caseTrimStructure(MTrimStructure<T> object) {
				return createTrimStructureAdapter();
			}
			@Override
			public Adapter caseV______________RCP_______________V(MV______________RCP_______________V object) {
				return createV______________RCP_______________VAdapter();
			}
			@Override
			public Adapter caseApplication(MApplication object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseItem(MItem object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseHandledItem(MHandledItem object) {
				return createHandledItemAdapter();
			}
			@Override
			public Adapter caseMenuItem(MMenuItem object) {
				return createMenuItemAdapter();
			}
			@Override
			public Adapter caseMenu(MMenu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseToolItem(MToolItem object) {
				return createToolItemAdapter();
			}
			@Override
			public Adapter caseToolBar(MToolBar object) {
				return createToolBarAdapter();
			}
			@Override
			public Adapter casePSCElement(MPSCElement object) {
				return createPSCElementAdapter();
			}
			@Override
			public Adapter casePart(MPart object) {
				return createPartAdapter();
			}
			@Override
			public Adapter casePartStack(MPartStack object) {
				return createPartStackAdapter();
			}
			@Override
			public Adapter casePartSashContainer(MPartSashContainer object) {
				return createPartSashContainerAdapter();
			}
			@Override
			public Adapter caseWindow(MWindow object) {
				return createWindowAdapter();
			}
			@Override
			public Adapter caseV______________IDE_______________V(MV______________IDE_______________V object) {
				return createV______________IDE_______________VAdapter();
			}
			@Override
			public Adapter caseVSCElement(MVSCElement object) {
				return createVSCElementAdapter();
			}
			@Override
			public Adapter caseView(MView object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseViewStack(MViewStack object) {
				return createViewStackAdapter();
			}
			@Override
			public Adapter caseViewSashContainer(MViewSashContainer object) {
				return createViewSashContainerAdapter();
			}
			@Override
			public Adapter caseEditor(MEditor object) {
				return createEditorAdapter();
			}
			@Override
			public Adapter caseMultiEditor(MMultiEditor object) {
				return createMultiEditorAdapter();
			}
			@Override
			public Adapter caseESCElement(MESCElement object) {
				return createESCElementAdapter();
			}
			@Override
			public Adapter caseEditorStack(MEditorStack object) {
				return createEditorStackAdapter();
			}
			@Override
			public Adapter caseEditorSashContainer(MEditorSashContainer object) {
				return createEditorSashContainerAdapter();
			}
			@Override
			public Adapter casePerspective(MPerspective object) {
				return createPerspectiveAdapter();
			}
			@Override
			public Adapter casePerspectiveStack(MPerspectiveStack object) {
				return createPerspectiveStackAdapter();
			}
			@Override
			public Adapter caseIDEWindow(MIDEWindow object) {
				return createIDEWindowAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MV____________Abstract_____________V <em>VAbstract V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MV____________Abstract_____________V
	 * @generated
	 */
	public Adapter createV____________Abstract_____________VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MApplicationElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MApplicationElement
	 * @generated
	 */
	public Adapter createApplicationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MContribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MContribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MCommand
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MInput
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MParameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MUIItem <em>UI Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MUIItem
	 * @generated
	 */
	public Adapter createUIItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MUIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MUIElement
	 * @generated
	 */
	public Adapter createUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MContext
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MV_________Testing__________V <em>VTesting V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MV_________Testing__________V
	 * @generated
	 */
	public Adapter createV_________Testing__________VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MTestHarness <em>Test Harness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MTestHarness
	 * @generated
	 */
	public Adapter createTestHarnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MV_________AbstractContainers__________V <em>VAbstract Containers V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MV_________AbstractContainers__________V
	 * @generated
	 */
	public Adapter createV_________AbstractContainers__________VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MElementContainer <em>Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MElementContainer
	 * @generated
	 */
	public Adapter createElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MGenericTile <em>Generic Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MGenericTile
	 * @generated
	 */
	public Adapter createGenericTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MTrimStructure <em>Trim Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MTrimStructure
	 * @generated
	 */
	public Adapter createTrimStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MV______________RCP_______________V <em>VRCP V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MV______________RCP_______________V
	 * @generated
	 */
	public Adapter createV______________RCP_______________VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MApplication
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MItem
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MHandledItem <em>Handled Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MHandledItem
	 * @generated
	 */
	public Adapter createHandledItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MMenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MMenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MMenu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MToolItem <em>Tool Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MToolItem
	 * @generated
	 */
	public Adapter createToolItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MToolBar
	 * @generated
	 */
	public Adapter createToolBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MPSCElement <em>PSC Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MPSCElement
	 * @generated
	 */
	public Adapter createPSCElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MPart
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MPartStack <em>Part Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MPartStack
	 * @generated
	 */
	public Adapter createPartStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MPartSashContainer <em>Part Sash Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MPartSashContainer
	 * @generated
	 */
	public Adapter createPartSashContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MWindow
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MV______________IDE_______________V <em>VIDE V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MV______________IDE_______________V
	 * @generated
	 */
	public Adapter createV______________IDE_______________VAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MVSCElement <em>VSC Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MVSCElement
	 * @generated
	 */
	public Adapter createVSCElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MView
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MViewStack <em>View Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MViewStack
	 * @generated
	 */
	public Adapter createViewStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MViewSashContainer <em>View Sash Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MViewSashContainer
	 * @generated
	 */
	public Adapter createViewSashContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MEditor
	 * @generated
	 */
	public Adapter createEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MMultiEditor <em>Multi Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MMultiEditor
	 * @generated
	 */
	public Adapter createMultiEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MESCElement <em>ESC Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MESCElement
	 * @generated
	 */
	public Adapter createESCElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MEditorStack <em>Editor Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MEditorStack
	 * @generated
	 */
	public Adapter createEditorStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MEditorSashContainer <em>Editor Sash Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MEditorSashContainer
	 * @generated
	 */
	public Adapter createEditorSashContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MPerspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MPerspective
	 * @generated
	 */
	public Adapter createPerspectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MPerspectiveStack <em>Perspective Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MPerspectiveStack
	 * @generated
	 */
	public Adapter createPerspectiveStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.e4.ui.model.application.MIDEWindow <em>IDE Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.e4.ui.model.application.MIDEWindow
	 * @generated
	 */
	public Adapter createIDEWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApplicationAdapterFactory