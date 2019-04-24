// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfString;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$ShowText
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		PdfContentStreamProcessor.access$4700(pdfcontentstreamprocessor, (PdfString)arraylist.get(0));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #24  <Method Object ArrayList.get(int)>
	//    4    6:checkcast       #26  <Class PdfString>
	//    5    9:invokestatic    #30  <Method void PdfContentStreamProcessor.access$4700(PdfContentStreamProcessor, PdfString)>
	//    6   12:return          
	}

	private PdfContentStreamProcessor$ShowText()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$ShowText(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$ShowText()>
	//    2    4:return          
	}
}
