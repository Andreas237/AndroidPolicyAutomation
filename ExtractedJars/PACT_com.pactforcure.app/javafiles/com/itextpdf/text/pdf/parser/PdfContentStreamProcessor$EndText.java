// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$EndText
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		PdfContentStreamProcessor.access$5002(pdfcontentstreamprocessor, ((Matrix) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #22  <Method Matrix PdfContentStreamProcessor.access$5002(PdfContentStreamProcessor, Matrix)>
	//    3    5:pop             
		PdfContentStreamProcessor.access$4902(pdfcontentstreamprocessor, ((Matrix) (null)));
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokestatic    #25  <Method Matrix PdfContentStreamProcessor.access$4902(PdfContentStreamProcessor, Matrix)>
	//    7   11:pop             
		PdfContentStreamProcessor.access$5800(pdfcontentstreamprocessor);
	//    8   12:aload_1         
	//    9   13:invokestatic    #29  <Method void PdfContentStreamProcessor.access$5800(PdfContentStreamProcessor)>
	//   10   16:return          
	}

	private PdfContentStreamProcessor$EndText()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$EndText(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$EndText()>
	//    2    4:return          
	}
}
