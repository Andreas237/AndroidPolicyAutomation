// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import java.io.InputStream;
import java.security.GeneralSecurityException;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			ExternalSignatureContainer

public class ExternalBlankSignatureContainer
	implements ExternalSignatureContainer
{

	public ExternalBlankSignatureContainer(PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		sigDic = pdfdictionary;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field PdfDictionary sigDic>
	//    5    9:return          
	}

	public ExternalBlankSignatureContainer(PdfName pdfname, PdfName pdfname1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		sigDic = new PdfDictionary();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void PdfDictionary()>
	//    6   12:putfield        #15  <Field PdfDictionary sigDic>
		sigDic.put(PdfName.FILTER, ((com.itextpdf.text.pdf.PdfObject) (pdfname)));
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field PdfDictionary sigDic>
	//    9   19:getstatic       #26  <Field PdfName PdfName.FILTER>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #30  <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		sigDic.put(PdfName.SUBFILTER, ((com.itextpdf.text.pdf.PdfObject) (pdfname1)));
	//   12   26:aload_0         
	//   13   27:getfield        #15  <Field PdfDictionary sigDic>
	//   14   30:getstatic       #33  <Field PdfName PdfName.SUBFILTER>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #30  <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//   17   37:return          
	}

	public void modifySigningDictionary(PdfDictionary pdfdictionary)
	{
		pdfdictionary.putAll(sigDic);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field PdfDictionary sigDic>
	//    3    5:invokevirtual   #37  <Method void PdfDictionary.putAll(PdfDictionary)>
	//    4    8:return          
	}

	public byte[] sign(InputStream inputstream)
		throws GeneralSecurityException
	{
		return new byte[0];
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:areturn         
	}

	private PdfDictionary sigDic;
}
