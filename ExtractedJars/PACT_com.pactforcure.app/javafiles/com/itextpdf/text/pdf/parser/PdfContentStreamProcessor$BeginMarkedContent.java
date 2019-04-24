// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$BeginMarkedContent
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		throws Exception
	{
		PdfContentStreamProcessor.access$5900(pdfcontentstreamprocessor, (PdfName)arraylist.get(0), new PdfDictionary());
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//    4    6:checkcast       #28  <Class PdfName>
	//    5    9:new             #30  <Class PdfDictionary>
	//    6   12:dup             
	//    7   13:invokespecial   #31  <Method void PdfDictionary()>
	//    8   16:invokestatic    #35  <Method void PdfContentStreamProcessor.access$5900(PdfContentStreamProcessor, PdfName, PdfDictionary)>
	//    9   19:return          
	}

	private PdfContentStreamProcessor$BeginMarkedContent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$BeginMarkedContent(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$BeginMarkedContent()>
	//    2    4:return          
	}
}
