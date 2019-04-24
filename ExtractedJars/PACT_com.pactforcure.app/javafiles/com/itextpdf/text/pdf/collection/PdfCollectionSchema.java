// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.collection;

import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;

// Referenced classes of package com.itextpdf.text.pdf.collection:
//			PdfCollectionField

public class PdfCollectionSchema extends PdfDictionary
{

	public PdfCollectionSchema()
	{
		super(PdfName.COLLECTIONSCHEMA);
	//    0    0:aload_0         
	//    1    1:getstatic       #12  <Field PdfName PdfName.COLLECTIONSCHEMA>
	//    2    4:invokespecial   #15  <Method void PdfDictionary(PdfName)>
	//    3    7:return          
	}

	public void addField(String s, PdfCollectionField pdfcollectionfield)
	{
		put(new PdfName(s), ((com.itextpdf.text.pdf.PdfObject) (pdfcollectionfield)));
	//    0    0:aload_0         
	//    1    1:new             #8   <Class PdfName>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #21  <Method void PdfName(String)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #25  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    7   13:return          
	}
}
