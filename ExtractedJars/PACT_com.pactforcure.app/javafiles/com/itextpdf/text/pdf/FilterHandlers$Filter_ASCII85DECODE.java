// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			FilterHandlers, PdfReader, PdfName, PdfObject, 
//			PdfDictionary

private static class FilterHandlers$Filter_ASCII85DECODE
	implements FilterHandlers.FilterHandler
{

	public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
		throws IOException
	{
		return PdfReader.ASCII85Decode(abyte0);
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method byte[] PdfReader.ASCII85Decode(byte[])>
	//    2    4:areturn         
	}

	private FilterHandlers$Filter_ASCII85DECODE()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	FilterHandlers$Filter_ASCII85DECODE(FilterHandlers._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void FilterHandlers$Filter_ASCII85DECODE()>
	//    2    4:return          
	}
}
