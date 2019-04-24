// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;


public class XMPException extends Exception
{

	public XMPException(String s, int i)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void Exception(String)>
		errorCode = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #13  <Field int errorCode>
	//    6   10:return          
	}

	public XMPException(String s, int i, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #18  <Method void Exception(String, Throwable)>
		errorCode = i;
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:putfield        #13  <Field int errorCode>
	//    7   11:return          
	}

	public int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int errorCode>
	//    2    4:ireturn         
	}

	private int errorCode;
}
