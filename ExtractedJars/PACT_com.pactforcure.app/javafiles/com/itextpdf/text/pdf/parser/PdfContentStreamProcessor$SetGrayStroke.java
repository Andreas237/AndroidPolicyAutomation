// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$SetGrayStroke
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfcontentstreamprocessor.gs().strokeColor = PdfContentStreamProcessor.access$5500(1, ((java.util.List) (arraylist)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//    2    4:iconst_1        
	//    3    5:aload_3         
	//    4    6:invokestatic    #26  <Method com.itextpdf.text.BaseColor PdfContentStreamProcessor.access$5500(int, java.util.List)>
	//    5    9:putfield        #32  <Field com.itextpdf.text.BaseColor GraphicsState.strokeColor>
	//    6   12:return          
	}

	private PdfContentStreamProcessor$SetGrayStroke()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$SetGrayStroke(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$SetGrayStroke()>
	//    2    4:return          
	}
}
