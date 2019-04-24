// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, Matrix

private static class PdfContentStreamProcessor$BeginText
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		PdfContentStreamProcessor.access$5002(pdfcontentstreamprocessor, new Matrix());
	//    0    0:aload_1         
	//    1    1:new             #20  <Class Matrix>
	//    2    4:dup             
	//    3    5:invokespecial   #21  <Method void Matrix()>
	//    4    8:invokestatic    #25  <Method Matrix PdfContentStreamProcessor.access$5002(PdfContentStreamProcessor, Matrix)>
	//    5   11:pop             
		PdfContentStreamProcessor.access$4902(pdfcontentstreamprocessor, PdfContentStreamProcessor.access$5000(pdfcontentstreamprocessor));
	//    6   12:aload_1         
	//    7   13:aload_1         
	//    8   14:invokestatic    #29  <Method Matrix PdfContentStreamProcessor.access$5000(PdfContentStreamProcessor)>
	//    9   17:invokestatic    #32  <Method Matrix PdfContentStreamProcessor.access$4902(PdfContentStreamProcessor, Matrix)>
	//   10   20:pop             
		PdfContentStreamProcessor.access$5700(pdfcontentstreamprocessor);
	//   11   21:aload_1         
	//   12   22:invokestatic    #36  <Method void PdfContentStreamProcessor.access$5700(PdfContentStreamProcessor)>
	//   13   25:return          
	}

	private PdfContentStreamProcessor$BeginText()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$BeginText(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$BeginText()>
	//    2    4:return          
	}
}
