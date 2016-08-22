package edsdk.bindings;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : EDSDK\Header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsPropertyDesc extends Structure {
	/** C type : EdsInt32 */
	public NativeLong form;
	/** C type : EdsInt32 */
	public NativeLong access;
	/** C type : EdsInt32 */
	public NativeLong numElements;
	/** C type : EdsInt32[128] */
	public NativeLong[] propDesc = new NativeLong[128];
	public EdsPropertyDesc() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("form", "access", "numElements", "propDesc");
	}
	/**
	 * @param form C type : EdsInt32<br>
	 * @param access C type : EdsInt32<br>
	 * @param numElements C type : EdsInt32<br>
	 * @param propDesc C type : EdsInt32[128]
	 */
	public EdsPropertyDesc(NativeLong form, NativeLong access, NativeLong numElements, NativeLong propDesc[]) {
		super();
		this.form = form;
		this.access = access;
		this.numElements = numElements;
		if ((propDesc.length != this.propDesc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.propDesc = propDesc;
	}
	public EdsPropertyDesc(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsPropertyDesc implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsPropertyDesc implements Structure.ByValue {
		
	};
}
