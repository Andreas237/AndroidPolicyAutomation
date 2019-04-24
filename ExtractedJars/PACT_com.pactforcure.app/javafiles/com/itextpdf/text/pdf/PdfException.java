// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;

public class PdfException extends DocumentException
{

	PdfException()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void DocumentException()>
	//    2    4:return          
	}

	public PdfException(Exception exception)
	{
		super(exception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void DocumentException(Exception)>
	//    3    5:return          
	}

	PdfException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void DocumentException(String)>
	//    3    5:return          
	}

	private static final long serialVersionUID = 0x3aa975fL;
}
