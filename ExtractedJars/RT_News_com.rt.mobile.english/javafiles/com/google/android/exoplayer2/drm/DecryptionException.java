// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;


public class DecryptionException extends Exception
{

	public DecryptionException(int i, String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #11  <Method void Exception(String)>
		errorCode = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #13  <Field int errorCode>
	//    6   10:return          
	}

	public final int errorCode;
}
