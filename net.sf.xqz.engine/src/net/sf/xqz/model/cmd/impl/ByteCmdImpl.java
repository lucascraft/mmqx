/**
 */
package net.sf.xqz.model.cmd.impl;

import net.sf.xqz.model.cmd.ByteCmd;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.xqz.model.cmd.impl.ByteCmdImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ByteCmdImpl extends CmdImpl implements ByteCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmdPackage.Literals.BYTE_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMessage() {
		return (byte[])eGet(CmdPackage.Literals.BYTE_CMD__MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(byte[] newMessage) {
		eSet(CmdPackage.Literals.BYTE_CMD__MESSAGE, newMessage);
	}

} //ByteCmdImpl
