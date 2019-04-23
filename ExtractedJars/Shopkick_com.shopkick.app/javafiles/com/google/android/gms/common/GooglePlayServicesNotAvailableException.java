// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;


public final class GooglePlayServicesNotAvailableException extends Exception
{

	public GooglePlayServicesNotAvailableException(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Exception()>
		errorCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #13  <Field int errorCode>
	//    5    9:return          
	}

	public final int errorCode;
}
