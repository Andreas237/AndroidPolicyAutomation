// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			PdfImageObject

private static class PdfImageObject$TrackingFilter
	implements com.itextpdf.text.pdf.FilterHandlers.FilterHandler
{

	public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
		throws IOException
	{
		lastFilterName = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #17  <Field PdfName lastFilterName>
		return abyte0;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public PdfName lastFilterName;

	private PdfImageObject$TrackingFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		lastFilterName = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field PdfName lastFilterName>
	//    5    9:return          
	}

	PdfImageObject$TrackingFilter(PdfImageObject._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PdfImageObject$TrackingFilter()>
	//    2    4:return          
	}
}
