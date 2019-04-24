// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


public class DocumentException extends Exception
{

	public DocumentException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Exception()>
	//    2    4:return          
	}

	public DocumentException(Exception exception)
	{
		super(((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void Exception(Throwable)>
	//    3    5:return          
	}

	public DocumentException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void Exception(String)>
	//    3    5:return          
	}

	public DocumentException(String s, Exception exception)
	{
		super(s, ((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void Exception(String, Throwable)>
	//    4    6:return          
	}

	private static final long serialVersionUID = 0xfeafb45dL;
}
