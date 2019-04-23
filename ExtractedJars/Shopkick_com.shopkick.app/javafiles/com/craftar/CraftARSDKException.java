// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


public class CraftARSDKException extends Exception
{

	public CraftARSDKException(int i, String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #19  <Method void Exception(String)>
		mExceptionId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #21  <Field int mExceptionId>
	//    6   10:return          
	}

	public int getExceptionId()
	{
		return mExceptionId;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int mExceptionId>
	//    2    4:ireturn         
	}

	public static final int AR_ITEM_EXCEPTION = 1;
	public static final int SDK_CONTENT_EXCEPTION = 0;
	private static final long serialVersionUID = 0x86f3fa8dL;
	private int mExceptionId;
}
