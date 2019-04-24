// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.collection;

import com.itextpdf.text.pdf.*;

// Referenced classes of package com.itextpdf.text.pdf.collection:
//			PdfCollectionSchema, PdfCollectionSort

public class PdfCollection extends PdfDictionary
{

	public PdfCollection(int i)
	{
		super(PdfName.COLLECTION);
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field PdfName PdfName.COLLECTION>
	//    2    4:invokespecial   #24  <Method void PdfDictionary(PdfName)>
		switch(i)
	//*   3    7:iload_1         
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 47
	//	               2 58
	//	               3 69
		default:
			put(PdfName.VIEW, ((com.itextpdf.text.pdf.PdfObject) (PdfName.D)));
	//    5   36:aload_0         
	//    6   37:getstatic       #27  <Field PdfName PdfName.VIEW>
	//    7   40:getstatic       #30  <Field PdfName PdfName.D>
	//    8   43:invokevirtual   #34  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			return;
	//    9   46:return          

		case 1: // '\001'
			put(PdfName.VIEW, ((com.itextpdf.text.pdf.PdfObject) (PdfName.T)));
	//   10   47:aload_0         
	//   11   48:getstatic       #27  <Field PdfName PdfName.VIEW>
	//   12   51:getstatic       #37  <Field PdfName PdfName.T>
	//   13   54:invokevirtual   #34  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			return;
	//   14   57:return          

		case 2: // '\002'
			put(PdfName.VIEW, ((com.itextpdf.text.pdf.PdfObject) (PdfName.H)));
	//   15   58:aload_0         
	//   16   59:getstatic       #27  <Field PdfName PdfName.VIEW>
	//   17   62:getstatic       #40  <Field PdfName PdfName.H>
	//   18   65:invokevirtual   #34  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			return;
	//   19   68:return          

		case 3: // '\003'
			put(PdfName.VIEW, ((com.itextpdf.text.pdf.PdfObject) (PdfName.C)));
	//   20   69:aload_0         
	//   21   70:getstatic       #27  <Field PdfName PdfName.VIEW>
	//   22   73:getstatic       #43  <Field PdfName PdfName.C>
	//   23   76:invokevirtual   #34  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			break;
		}
	//   24   79:return          
	}

	public PdfCollectionSchema getSchema()
	{
		return (PdfCollectionSchema)get(PdfName.SCHEMA);
	//    0    0:aload_0         
	//    1    1:getstatic       #49  <Field PdfName PdfName.SCHEMA>
	//    2    4:invokevirtual   #53  <Method com.itextpdf.text.pdf.PdfObject get(PdfName)>
	//    3    7:checkcast       #55  <Class PdfCollectionSchema>
	//    4   10:areturn         
	}

	public void setInitialDocument(String s)
	{
		put(PdfName.D, ((com.itextpdf.text.pdf.PdfObject) (new PdfString(s, ((String) (null))))));
	//    0    0:aload_0         
	//    1    1:getstatic       #30  <Field PdfName PdfName.D>
	//    2    4:new             #59  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #62  <Method void PdfString(String, String)>
	//    7   13:invokevirtual   #34  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    8   16:return          
	}

	public void setSchema(PdfCollectionSchema pdfcollectionschema)
	{
		put(PdfName.SCHEMA, ((com.itextpdf.text.pdf.PdfObject) (pdfcollectionschema)));
	//    0    0:aload_0         
	//    1    1:getstatic       #49  <Field PdfName PdfName.SCHEMA>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    4    8:return          
	}

	public void setSort(PdfCollectionSort pdfcollectionsort)
	{
		put(PdfName.SORT, ((com.itextpdf.text.pdf.PdfObject) (pdfcollectionsort)));
	//    0    0:aload_0         
	//    1    1:getstatic       #69  <Field PdfName PdfName.SORT>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void put(PdfName, com.itextpdf.text.pdf.PdfObject)>
	//    4    8:return          
	}

	public static final int CUSTOM = 3;
	public static final int DETAILS = 0;
	public static final int HIDDEN = 2;
	public static final int TILE = 1;
}
