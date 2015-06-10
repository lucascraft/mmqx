package net.sf.xqz.model.engine.util;

import net.sf.xqz.model.engine.*;
import net.sf.xqz.model.engine.AbstractCmdEngineAction;
import net.sf.xqz.model.engine.AbstractCmdInterpreter;
import net.sf.xqz.model.engine.AbstractFrameInterpreter;
import net.sf.xqz.model.engine.AbstractQxEventHandler;
import net.sf.xqz.model.engine.AbstractQxEventNotifier;
import net.sf.xqz.model.engine.CmdEngineActionArg;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.EngineClient;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.ICmdEngineAction;
import net.sf.xqz.model.engine.IConnectedUnit;
import net.sf.xqz.model.engine.IOJob;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.IQxEventNotifier;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.OutputJob;
import net.sf.xqz.model.engine.Port;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.QxTimeRange;
import net.sf.xqz.model.engine.Rx;
import net.sf.xqz.model.engine.SynchronousQxEventHandler;
import net.sf.xqz.model.engine.Trigger;
import net.sf.xqz.model.engine.Tx;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.xqz.model.engine.EnginePackage
 * @generated
 */
public class EngineSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EnginePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineSwitch() {
		if (modelPackage == null) {
			modelPackage = EnginePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EnginePackage.TX: {
				Tx tx = (Tx)theEObject;
				T result = caseTx(tx);
				if (result == null) result = caseQx(tx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.RX: {
				Rx rx = (Rx)theEObject;
				T result = caseRx(rx);
				if (result == null) result = caseQx(rx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.QX: {
				Qx qx = (Qx)theEObject;
				T result = caseQx(qx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.CMD_PIPE: {
				CmdPipe cmdPipe = (CmdPipe)theEObject;
				T result = caseCmdPipe(cmdPipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ENGINE_CLIENT: {
				EngineClient engineClient = (EngineClient)theEObject;
				T result = caseEngineClient(engineClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ENGINE_APPLICATION: {
				EngineApplication engineApplication = (EngineApplication)theEObject;
				T result = caseEngineApplication(engineApplication);
				if (result == null) result = caseIConnectedUnit(engineApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.IX_CMD_INTERPRETER: {
				IXCmdInterpreter ixCmdInterpreter = (IXCmdInterpreter)theEObject;
				T result = caseIXCmdInterpreter(ixCmdInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ABSTRACT_CMD_INTERPRETER: {
				AbstractCmdInterpreter abstractCmdInterpreter = (AbstractCmdInterpreter)theEObject;
				T result = caseAbstractCmdInterpreter(abstractCmdInterpreter);
				if (result == null) result = caseIXCmdInterpreter(abstractCmdInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.IQX_EVENT_HANDLER: {
				IQxEventHandler iQxEventHandler = (IQxEventHandler)theEObject;
				T result = caseIQxEventHandler(iQxEventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.IQX_EVENT_NOTIFIER: {
				IQxEventNotifier iQxEventNotifier = (IQxEventNotifier)theEObject;
				T result = caseIQxEventNotifier(iQxEventNotifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ABSTRACT_QX_EVENT_HANDLER: {
				AbstractQxEventHandler abstractQxEventHandler = (AbstractQxEventHandler)theEObject;
				T result = caseAbstractQxEventHandler(abstractQxEventHandler);
				if (result == null) result = caseIQxEventHandler(abstractQxEventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ABSTRACT_QX_EVENT_NOTIFIER: {
				AbstractQxEventNotifier abstractQxEventNotifier = (AbstractQxEventNotifier)theEObject;
				T result = caseAbstractQxEventNotifier(abstractQxEventNotifier);
				if (result == null) result = caseIQxEventNotifier(abstractQxEventNotifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.IX_FRAME_INTERPRETER: {
				IXFrameInterpreter ixFrameInterpreter = (IXFrameInterpreter)theEObject;
				T result = caseIXFrameInterpreter(ixFrameInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ABSTRACT_FRAME_INTERPRETER: {
				AbstractFrameInterpreter abstractFrameInterpreter = (AbstractFrameInterpreter)theEObject;
				T result = caseAbstractFrameInterpreter(abstractFrameInterpreter);
				if (result == null) result = caseIXFrameInterpreter(abstractFrameInterpreter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ICMD_ENGINE_ACTION: {
				ICmdEngineAction iCmdEngineAction = (ICmdEngineAction)theEObject;
				T result = caseICmdEngineAction(iCmdEngineAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ABSTRACT_CMD_ENGINE_ACTION: {
				AbstractCmdEngineAction abstractCmdEngineAction = (AbstractCmdEngineAction)theEObject;
				T result = caseAbstractCmdEngineAction(abstractCmdEngineAction);
				if (result == null) result = caseICmdEngineAction(abstractCmdEngineAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.CMD_ENGINE_ACTION_ARG: {
				CmdEngineActionArg cmdEngineActionArg = (CmdEngineActionArg)theEObject;
				T result = caseCmdEngineActionArg(cmdEngineActionArg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.QX_TIME_RANGE: {
				QxTimeRange qxTimeRange = (QxTimeRange)theEObject;
				T result = caseQxTimeRange(qxTimeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.INPUT_JOB: {
				InputJob inputJob = (InputJob)theEObject;
				T result = caseInputJob(inputJob);
				if (result == null) result = caseIOJob(inputJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.OUTPUT_JOB: {
				OutputJob outputJob = (OutputJob)theEObject;
				T result = caseOutputJob(outputJob);
				if (result == null) result = caseIOJob(outputJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ICONNECTED_UNIT: {
				IConnectedUnit iConnectedUnit = (IConnectedUnit)theEObject;
				T result = caseIConnectedUnit(iConnectedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.IO_JOB: {
				IOJob ioJob = (IOJob)theEObject;
				T result = caseIOJob(ioJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.SYNCHRONOUS_QX_EVENT_HANDLER: {
				SynchronousQxEventHandler synchronousQxEventHandler = (SynchronousQxEventHandler)theEObject;
				T result = caseSynchronousQxEventHandler(synchronousQxEventHandler);
				if (result == null) result = caseAbstractQxEventHandler(synchronousQxEventHandler);
				if (result == null) result = caseIQxEventHandler(synchronousQxEventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnginePackage.ICHANNEL: {
				IChannel iChannel = (IChannel)theEObject;
				T result = caseIChannel(iChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tx</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tx</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTx(Tx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rx</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rx</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRx(Rx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qx</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qx</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQx(Qx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmdPipe(CmdPipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineClient(EngineClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineApplication(EngineApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IX Cmd Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IX Cmd Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXCmdInterpreter(IXCmdInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Cmd Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Cmd Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCmdInterpreter(AbstractCmdInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IQx Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IQx Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIQxEventHandler(IQxEventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IQx Event Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IQx Event Notifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIQxEventNotifier(IQxEventNotifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Qx Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Qx Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractQxEventHandler(AbstractQxEventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Qx Event Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Qx Event Notifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractQxEventNotifier(AbstractQxEventNotifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IX Frame Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IX Frame Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXFrameInterpreter(IXFrameInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Frame Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Frame Interpreter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFrameInterpreter(AbstractFrameInterpreter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICmd Engine Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICmd Engine Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICmdEngineAction(ICmdEngineAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Cmd Engine Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Cmd Engine Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCmdEngineAction(AbstractCmdEngineAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd Engine Action Arg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd Engine Action Arg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmdEngineActionArg(CmdEngineActionArg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qx Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qx Time Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQxTimeRange(QxTimeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputJob(InputJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputJob(OutputJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIConnectedUnit(IConnectedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOJob(IOJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronous Qx Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronous Qx Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronousQxEventHandler(SynchronousQxEventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IChannel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IChannel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIChannel(IChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EngineSwitch
