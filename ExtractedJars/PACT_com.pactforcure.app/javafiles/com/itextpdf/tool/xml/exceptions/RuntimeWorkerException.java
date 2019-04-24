// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.exceptions;


public class RuntimeWorkerException extends RuntimeException
{

	public RuntimeWorkerException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void RuntimeException()>
	//    2    4:return          
	}

	public RuntimeWorkerException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void RuntimeException(String)>
	//    3    5:return          
	}

	public RuntimeWorkerException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void RuntimeException(String, Throwable)>
	//    4    6:return          
	}

	public RuntimeWorkerException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void RuntimeException(Throwable)>
	//    3    5:return          
	}

	private static final long serialVersionUID = 1L;
}
