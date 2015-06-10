/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.xqz.model.engine.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.xqz.model.engine.util.EngineAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EngineItemProviderAdapterFactory extends EngineAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.Tx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TxItemProvider txItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.Tx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTxAdapter() {
		if (txItemProvider == null) {
			txItemProvider = new TxItemProvider(this);
		}

		return txItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.Rx} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RxItemProvider rxItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.Rx}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRxAdapter() {
		if (rxItemProvider == null) {
			rxItemProvider = new RxItemProvider(this);
		}

		return rxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.CmdPipe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdPipeItemProvider cmdPipeItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.CmdPipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCmdPipeAdapter() {
		if (cmdPipeItemProvider == null) {
			cmdPipeItemProvider = new CmdPipeItemProvider(this);
		}

		return cmdPipeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.EngineClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineClientItemProvider engineClientItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.EngineClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEngineClientAdapter() {
		if (engineClientItemProvider == null) {
			engineClientItemProvider = new EngineClientItemProvider(this);
		}

		return engineClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.EngineApplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineApplicationItemProvider engineApplicationItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.EngineApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEngineApplicationAdapter() {
		if (engineApplicationItemProvider == null) {
			engineApplicationItemProvider = new EngineApplicationItemProvider(this);
		}

		return engineApplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.IXFrameInterpreter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IXFrameInterpreterItemProvider ixFrameInterpreterItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.IXFrameInterpreter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIXFrameInterpreterAdapter() {
		if (ixFrameInterpreterItemProvider == null) {
			ixFrameInterpreterItemProvider = new IXFrameInterpreterItemProvider(this);
		}

		return ixFrameInterpreterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.AbstractFrameInterpreter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFrameInterpreterItemProvider abstractFrameInterpreterItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.AbstractFrameInterpreter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractFrameInterpreterAdapter() {
		if (abstractFrameInterpreterItemProvider == null) {
			abstractFrameInterpreterItemProvider = new AbstractFrameInterpreterItemProvider(this);
		}

		return abstractFrameInterpreterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.CmdEngineActionArg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmdEngineActionArgItemProvider cmdEngineActionArgItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.CmdEngineActionArg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCmdEngineActionArgAdapter() {
		if (cmdEngineActionArgItemProvider == null) {
			cmdEngineActionArgItemProvider = new CmdEngineActionArgItemProvider(this);
		}

		return cmdEngineActionArgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.QxTimeRange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QxTimeRangeItemProvider qxTimeRangeItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.QxTimeRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQxTimeRangeAdapter() {
		if (qxTimeRangeItemProvider == null) {
			qxTimeRangeItemProvider = new QxTimeRangeItemProvider(this);
		}

		return qxTimeRangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.InputJob} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputJobItemProvider inputJobItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.InputJob}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputJobAdapter() {
		if (inputJobItemProvider == null) {
			inputJobItemProvider = new InputJobItemProvider(this);
		}

		return inputJobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.OutputJob} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputJobItemProvider outputJobItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.OutputJob}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputJobAdapter() {
		if (outputJobItemProvider == null) {
			outputJobItemProvider = new OutputJobItemProvider(this);
		}

		return outputJobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.IOJob} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOJobItemProvider ioJobItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.IOJob}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIOJobAdapter() {
		if (ioJobItemProvider == null) {
			ioJobItemProvider = new IOJobItemProvider(this);
		}

		return ioJobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.SynchronousQxEventHandler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronousQxEventHandlerItemProvider synchronousQxEventHandlerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.SynchronousQxEventHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchronousQxEventHandlerAdapter() {
		if (synchronousQxEventHandlerItemProvider == null) {
			synchronousQxEventHandlerItemProvider = new SynchronousQxEventHandlerItemProvider(this);
		}

		return synchronousQxEventHandlerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.xqz.model.engine.IChannel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChannelItemProvider iChannelItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.xqz.model.engine.IChannel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIChannelAdapter() {
		if (iChannelItemProvider == null) {
			iChannelItemProvider = new IChannelItemProvider(this);
		}

		return iChannelItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (txItemProvider != null) txItemProvider.dispose();
		if (rxItemProvider != null) rxItemProvider.dispose();
		if (cmdPipeItemProvider != null) cmdPipeItemProvider.dispose();
		if (engineClientItemProvider != null) engineClientItemProvider.dispose();
		if (engineApplicationItemProvider != null) engineApplicationItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (portItemProvider != null) portItemProvider.dispose();
		if (ixFrameInterpreterItemProvider != null) ixFrameInterpreterItemProvider.dispose();
		if (abstractFrameInterpreterItemProvider != null) abstractFrameInterpreterItemProvider.dispose();
		if (cmdEngineActionArgItemProvider != null) cmdEngineActionArgItemProvider.dispose();
		if (qxTimeRangeItemProvider != null) qxTimeRangeItemProvider.dispose();
		if (inputJobItemProvider != null) inputJobItemProvider.dispose();
		if (outputJobItemProvider != null) outputJobItemProvider.dispose();
		if (triggerItemProvider != null) triggerItemProvider.dispose();
		if (ioJobItemProvider != null) ioJobItemProvider.dispose();
		if (synchronousQxEventHandlerItemProvider != null) synchronousQxEventHandlerItemProvider.dispose();
		if (iChannelItemProvider != null) iChannelItemProvider.dispose();
	}

}