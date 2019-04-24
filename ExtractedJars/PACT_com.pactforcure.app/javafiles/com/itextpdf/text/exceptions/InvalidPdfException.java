// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.exceptions;

import java.io.IOException;

public class InvalidPdfException extends IOException
{

	public InvalidPdfException(String s)
	{
		this(s, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void InvalidPdfException(String, Throwable)>
	//    4    6:return          
	}

	public InvalidPdfException(String s, Throwable throwable)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void IOException(String)>
		cause = throwable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Throwable cause>
	//    6   10:return          
	}

	public Throwable getCause()
	{
		return cause;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Throwable cause>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 0x1f541586L;
	private final Throwable cause;
}
