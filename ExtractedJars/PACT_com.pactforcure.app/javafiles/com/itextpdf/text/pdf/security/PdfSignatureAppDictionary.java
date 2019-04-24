// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.pdf.*;

public class PdfSignatureAppDictionary extends PdfDictionary
{

	public PdfSignatureAppDictionary()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void PdfDictionary()>
	//    2    4:return          
	}

	public void setSignatureCreator(String s)
	{
		put(PdfName.NAME, ((com.itextpdf.text.pdf.PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #17  <Field PdfName PdfName.NAME>
	//    2    4:new             #19  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #21  <String "UnicodeBig">
	//    6   11:invokespecial   #24  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #28  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    8   17:return          
	}
}
