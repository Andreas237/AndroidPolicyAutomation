// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$PopGraphicsState
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		PdfContentStreamProcessor.access$5400(pdfcontentstreamprocessor).pop();
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method Stack PdfContentStreamProcessor.access$5400(PdfContentStreamProcessor)>
	//    2    4:invokevirtual   #28  <Method Object Stack.pop()>
	//    3    7:pop             
	//    4    8:return          
	}

	private PdfContentStreamProcessor$PopGraphicsState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$PopGraphicsState(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$PopGraphicsState()>
	//    2    4:return          
	}
}
