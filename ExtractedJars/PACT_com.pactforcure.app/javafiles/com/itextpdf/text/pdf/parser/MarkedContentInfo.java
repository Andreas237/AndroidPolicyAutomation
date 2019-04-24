// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;

public class MarkedContentInfo
{

	public MarkedContentInfo(PdfName pdfname, PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		tag = pdfname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field PdfName tag>
		if(pdfdictionary == null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          19
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:putfield        #17  <Field PdfDictionary dictionary>
	//*  10   18:return          
			pdfdictionary = new PdfDictionary();
	//   11   19:new             #19  <Class PdfDictionary>
	//   12   22:dup             
	//   13   23:invokespecial   #20  <Method void PdfDictionary()>
	//   14   26:astore_2        
		dictionary = pdfdictionary;
	//*  15   27:goto            13
	}

	public int getMcid()
	{
		PdfNumber pdfnumber = dictionary.getAsNumber(PdfName.MCID);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PdfDictionary dictionary>
	//    2    4:getstatic       #28  <Field PdfName PdfName.MCID>
	//    3    7:invokevirtual   #32  <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//    4   10:astore_1        
		if(pdfnumber == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       25
			throw new IllegalStateException("MarkedContentInfo does not contain MCID");
	//    7   15:new             #34  <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc1            #36  <String "MarkedContentInfo does not contain MCID">
	//   10   21:invokespecial   #39  <Method void IllegalStateException(String)>
	//   11   24:athrow          
		else
			return pdfnumber.intValue();
	//   12   25:aload_1         
	//   13   26:invokevirtual   #44  <Method int PdfNumber.intValue()>
	//   14   29:ireturn         
	}

	public PdfName getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PdfName tag>
	//    2    4:areturn         
	}

	public boolean hasMcid()
	{
		return dictionary.contains(PdfName.MCID);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PdfDictionary dictionary>
	//    2    4:getstatic       #28  <Field PdfName PdfName.MCID>
	//    3    7:invokevirtual   #52  <Method boolean PdfDictionary.contains(PdfName)>
	//    4   10:ireturn         
	}

	private final PdfDictionary dictionary;
	private final PdfName tag;
}
