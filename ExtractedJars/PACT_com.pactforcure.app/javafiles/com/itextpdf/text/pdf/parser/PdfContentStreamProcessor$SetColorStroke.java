// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$SetColorStroke
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfcontentstreamprocessor.gs().strokeColor = PdfContentStreamProcessor.access$5600(pdfcontentstreamprocessor.gs().colorSpaceStroke, ((java.util.List) (arraylist)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//    4    8:getfield        #28  <Field com.itextpdf.text.pdf.PdfName GraphicsState.colorSpaceStroke>
	//    5   11:aload_3         
	//    6   12:invokestatic    #32  <Method com.itextpdf.text.BaseColor PdfContentStreamProcessor.access$5600(com.itextpdf.text.pdf.PdfName, java.util.List)>
	//    7   15:putfield        #36  <Field com.itextpdf.text.BaseColor GraphicsState.strokeColor>
	//    8   18:return          
	}

	private PdfContentStreamProcessor$SetColorStroke()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$SetColorStroke(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$SetColorStroke()>
	//    2    4:return          
	}
}
