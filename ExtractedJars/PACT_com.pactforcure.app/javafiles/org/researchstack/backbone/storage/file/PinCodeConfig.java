// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.file;


public class PinCodeConfig
{

	public PinCodeConfig()
	{
		this(0x493e0L);
	//    0    0:aload_0         
	//    1    1:ldc2w           #27  <Long 0x493e0L>
	//    2    4:invokespecial   #31  <Method void PinCodeConfig(long)>
	//    3    7:return          
	}

	public PinCodeConfig(long l)
	{
	/* block-local class not found */
	class PinCodeType {}

		this(((Type) (PinCodeType.Numeric)), 4, l);
	//    0    0:aload_0         
	//    1    1:getstatic       #36  <Field PinCodeConfig$PinCodeType PinCodeConfig$PinCodeType.Numeric>
	//    2    4:iconst_4        
	//    3    5:lload_1         
	//    4    6:invokespecial   #39  <Method void PinCodeConfig(PinCodeConfig$Type, int, long)>
	//    5    9:return          
	}

	public PinCodeConfig(Type type1, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		type = type1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field PinCodeConfig$Type type>
		length = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #45  <Field int length>
		autoLockTime = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #47  <Field long autoLockTime>
	//   11   19:return          
	}

	public long getPinAutoLockTime()
	{
		return autoLockTime;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field long autoLockTime>
	//    2    4:lreturn         
	}

	public int getPinLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int length>
	//    2    4:ireturn         
	}

	public Type getPinType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field PinCodeConfig$Type type>
	//    2    4:areturn         
	}

	public void setPinAutoLockTime(long l)
	{
		autoLockTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #47  <Field long autoLockTime>
	//    3    5:return          
	}

	private static final String DIGITS_ALPHABETIC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String DIGITS_ALPHANUMERIC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final String DIGITS_NUMERIC = "1234567890";
	private long autoLockTime;
	private int length;
	private Type type;

	// Unreferenced inner class org/researchstack/backbone/storage/file/PinCodeConfig$Type
	/* block-local class not found */
	class Type {}

}
