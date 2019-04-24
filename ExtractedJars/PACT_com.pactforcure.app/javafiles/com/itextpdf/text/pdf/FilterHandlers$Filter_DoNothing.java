// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			FilterHandlers, PdfName, PdfObject, PdfDictionary

private static class FilterHandlers$Filter_DoNothing
	implements FilterHandlers.FilterHandler
{

	public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
		throws IOException
	{
		return abyte0;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	private FilterHandlers$Filter_DoNothing()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	FilterHandlers$Filter_DoNothing(FilterHandlers._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void FilterHandlers$Filter_DoNothing()>
	//    2    4:return          
	}
}
