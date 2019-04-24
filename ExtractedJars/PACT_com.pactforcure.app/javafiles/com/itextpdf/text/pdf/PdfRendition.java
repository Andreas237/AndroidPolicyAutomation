// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfString, PdfMediaClipData, 
//			PdfFileSpecification

public class PdfRendition extends PdfDictionary
{

	PdfRendition(String s, PdfFileSpecification pdffilespecification, String s1)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PdfDictionary()>
		put(PdfName.S, ((PdfObject) (new PdfName("MR"))));
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field PdfName PdfName.S>
	//    4    8:new             #13  <Class PdfName>
	//    5   11:dup             
	//    6   12:ldc1            #19  <String "MR">
	//    7   14:invokespecial   #22  <Method void PdfName(String)>
	//    8   17:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
		put(PdfName.N, ((PdfObject) (new PdfString((new StringBuilder()).append("Rendition for ").append(s).toString()))));
	//    9   20:aload_0         
	//   10   21:getstatic       #29  <Field PdfName PdfName.N>
	//   11   24:new             #31  <Class PdfString>
	//   12   27:dup             
	//   13   28:new             #33  <Class StringBuilder>
	//   14   31:dup             
	//   15   32:invokespecial   #34  <Method void StringBuilder()>
	//   16   35:ldc1            #36  <String "Rendition for ">
	//   17   37:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   21   47:invokespecial   #45  <Method void PdfString(String)>
	//   22   50:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
		put(PdfName.C, ((PdfObject) (new PdfMediaClipData(s, pdffilespecification, s1))));
	//   23   53:aload_0         
	//   24   54:getstatic       #48  <Field PdfName PdfName.C>
	//   25   57:new             #50  <Class PdfMediaClipData>
	//   26   60:dup             
	//   27   61:aload_1         
	//   28   62:aload_2         
	//   29   63:aload_3         
	//   30   64:invokespecial   #52  <Method void PdfMediaClipData(String, PdfFileSpecification, String)>
	//   31   67:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
	//   32   70:return          
	}
}
