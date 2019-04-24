// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.core;


public class TerminalInfo
{

	public TerminalInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public byte[] getAppend()
	{
		return append;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field byte[] append>
	//    2    4:areturn         
	}

	public byte[] getExponent()
	{
		return exponent;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field byte[] exponent>
	//    2    4:areturn         
	}

	public byte getKeyIndex()
	{
		return keyIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte keyIndex>
	//    2    4:ireturn         
	}

	public byte[] getModulus()
	{
		return modulus;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field byte[] modulus>
	//    2    4:areturn         
	}

	public byte[] getSecurityCode()
	{
		return securityCode;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field byte[] securityCode>
	//    2    4:areturn         
	}

	public byte[] getTerminalNumber()
	{
		return terminalNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field byte[] terminalNumber>
	//    2    4:areturn         
	}

	public byte[] getTerminalType()
	{
		return terminalType;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field byte[] terminalType>
	//    2    4:areturn         
	}

	public void setAppend(byte abyte0[])
	{
		append = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field byte[] append>
	//    3    5:return          
	}

	public void setExponent(byte abyte0[])
	{
		exponent = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field byte[] exponent>
	//    3    5:return          
	}

	public void setKeyIndex(byte byte0)
	{
		keyIndex = byte0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field byte keyIndex>
	//    3    5:return          
	}

	public void setModulus(byte abyte0[])
	{
		modulus = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field byte[] modulus>
	//    3    5:return          
	}

	public void setSecurityCode(byte abyte0[])
	{
		securityCode = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field byte[] securityCode>
	//    3    5:return          
	}

	public void setTerminalNumber(byte abyte0[])
	{
		terminalNumber = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field byte[] terminalNumber>
	//    3    5:return          
	}

	public void setTerminalType(byte abyte0[])
	{
		terminalType = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field byte[] terminalType>
	//    3    5:return          
	}

	private byte append[];
	private byte exponent[];
	private byte keyIndex;
	private byte modulus[];
	private byte securityCode[];
	private byte terminalNumber[];
	private byte terminalType[];
}
