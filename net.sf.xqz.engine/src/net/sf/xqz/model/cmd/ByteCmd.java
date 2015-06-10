/**
 */
package net.sf.xqz.model.cmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.xqz.model.cmd.ByteCmd#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.xqz.model.cmd.CmdPackage#getByteCmd()
 * @model
 * @generated
 */
public interface ByteCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(byte[])
	 * @see net.sf.xqz.model.cmd.CmdPackage#getByteCmd_Message()
	 * @model
	 * @generated
	 */
	byte[] getMessage();

	/**
	 * Sets the value of the '{@link net.sf.xqz.model.cmd.ByteCmd#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(byte[] value);

} // ByteCmd
