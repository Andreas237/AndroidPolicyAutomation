// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;


public class GoogleAuthException extends Exception
{

	public GoogleAuthException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Exception()>
	//    2    4:return          
	}

	public GoogleAuthException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void Exception(String)>
	//    3    5:return          
	}

	public GoogleAuthException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void Exception(String, Throwable)>
	//    4    6:return          
	}

	public GoogleAuthException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void Exception(Throwable)>
	//    3    5:return          
	}
}
