/**
 *   Copyright (c) 2009 ACO Groupe and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Lucas Bigeardel - initial API and implementation
 *  
 */
package net.sf.xqz.model.engine.provider;


import java.util.Collection;
import java.util.List;

import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineFactory;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.temporal.provider.TemporalEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.xqz.model.engine.CmdPipe} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CmdPipeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addClientPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addTxPropertyDescriptor(object);
			addRxPropertyDescriptor(object);
			addOutputInterpreterPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addInputInterpreterPropertyDescriptor(object);
			addRecordingPropertyDescriptor(object);
			addAddrPropertyDescriptor(object);
			addPortsPropertyDescriptor(object);
			addTransportProtocolPropertyDescriptor(object);
			addCommunicationProtocolPropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
			addActivatedPropertyDescriptor(object);
			addLockedPropertyDescriptor(object);
			addTopicPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Client feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_client_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_client_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__CLIENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_id_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_name_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_priority_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_tx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_tx_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__TX,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_rx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_rx_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__RX,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Interpreter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputInterpreterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_outputInterpreter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_outputInterpreter_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__OUTPUT_INTERPRETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_port_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Interpreter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputInterpreterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_inputInterpreter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_inputInterpreter_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__INPUT_INTERPRETER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recording feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_recording_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_recording_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__RECORDING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Addr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAddrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_addr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_addr_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__ADDR,
				 true,
				 false,
				 false,
				 TemporalEditPlugin.getPlugin().getImage("arobase"),
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_ports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_ports_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__PORTS,
				 true,
				 false,
				 false,
				 TemporalEditPlugin.getPlugin().getImage("port1"),
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transport Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTransportProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_transportProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_transportProtocol_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__TRANSPORT_PROTOCOL,
				 true,
				 false,
				 false,
				 TemporalEditPlugin.getPlugin().getImage("arobase"),
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communication Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCommunicationProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_communicationProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_communicationProtocol_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__COMMUNICATION_PROTOCOL,
				 true,
				 false,
				 false,
				 TemporalEditPlugin.getPlugin().getImage("protocol"),
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_speed_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_activated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_activated_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__ACTIVATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_locked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_locked_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__LOCKED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Topic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmdPipe_topic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmdPipe_topic_feature", "_UI_CmdPipe_type"),
				 EnginePackage.Literals.CMD_PIPE__TOPIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EnginePackage.Literals.CMD_PIPE__QUEUES);
			childrenFeatures.add(EnginePackage.Literals.CMD_PIPE__EVENTS);
			childrenFeatures.add(EnginePackage.Literals.CMD_PIPE__COMMAND_POOL);
			childrenFeatures.add(EnginePackage.Literals.CMD_PIPE__TRIGGERS);
			childrenFeatures.add(EnginePackage.Literals.CMD_PIPE__TX_EVENTS);
			childrenFeatures.add(EnginePackage.Literals.CMD_PIPE__RX_EVENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CmdPipe.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CmdPipe"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CmdPipe)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CmdPipe_type") :
			getString("_UI_CmdPipe_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CmdPipe.class)) {
			case EnginePackage.CMD_PIPE__ID:
			case EnginePackage.CMD_PIPE__NAME:
			case EnginePackage.CMD_PIPE__PRIORITY:
			case EnginePackage.CMD_PIPE__RECORDING:
			case EnginePackage.CMD_PIPE__ADDR:
			case EnginePackage.CMD_PIPE__PORTS:
			case EnginePackage.CMD_PIPE__TRANSPORT_PROTOCOL:
			case EnginePackage.CMD_PIPE__COMMUNICATION_PROTOCOL:
			case EnginePackage.CMD_PIPE__SPEED:
			case EnginePackage.CMD_PIPE__ACTIVATED:
			case EnginePackage.CMD_PIPE__LOCKED:
			case EnginePackage.CMD_PIPE__TOPIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EnginePackage.CMD_PIPE__QUEUES:
			case EnginePackage.CMD_PIPE__EVENTS:
			case EnginePackage.CMD_PIPE__COMMAND_POOL:
			case EnginePackage.CMD_PIPE__TRIGGERS:
			case EnginePackage.CMD_PIPE__TX_EVENTS:
			case EnginePackage.CMD_PIPE__RX_EVENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__QUEUES,
				 EngineFactory.eINSTANCE.createTx()));

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__QUEUES,
				 EngineFactory.eINSTANCE.createRx()));

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__EVENTS,
				 EngineFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__COMMAND_POOL,
				 CmdFactory.eINSTANCE.createCompoundCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__COMMAND_POOL,
				 CmdFactory.eINSTANCE.createXCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__COMMAND_POOL,
				 CmdFactory.eINSTANCE.createByteCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__TRIGGERS,
				 EngineFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__TX_EVENTS,
				 EngineFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(EnginePackage.Literals.CMD_PIPE__RX_EVENTS,
				 EngineFactory.eINSTANCE.createEvent()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EnginePackage.Literals.CMD_PIPE__EVENTS ||
			childFeature == EnginePackage.Literals.CMD_PIPE__TX_EVENTS ||
			childFeature == EnginePackage.Literals.CMD_PIPE__RX_EVENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TemporalEditPlugin.INSTANCE;
	}

}
