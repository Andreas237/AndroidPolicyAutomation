// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class zzabk extends Exception
{

	public zzabk(String s, int i)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void Exception(String)>
		mErrorCode = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #13  <Field int mErrorCode>
	//    6   10:return          
	}

	public final int getErrorCode()
	{
		return mErrorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int mErrorCode>
	//    2    4:ireturn         
	}

	private final int mErrorCode;
}
