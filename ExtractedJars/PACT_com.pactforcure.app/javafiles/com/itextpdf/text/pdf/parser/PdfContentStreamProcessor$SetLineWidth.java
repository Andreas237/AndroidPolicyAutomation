// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$SetLineWidth
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		float f = ((PdfNumber)arraylist.get(0)).floatValue();
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #26  <Class PdfNumber>
	//    4    8:invokevirtual   #30  <Method float PdfNumber.floatValue()>
	//    5   11:fstore          4
		pdfcontentstreamprocessor.gs().setLineWidth(f);
	//    6   13:aload_1         
	//    7   14:invokevirtual   #34  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//    8   17:fload           4
	//    9   19:invokevirtual   #40  <Method void GraphicsState.setLineWidth(float)>
	//   10   22:return          
	}

	private PdfContentStreamProcessor$SetLineWidth()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$SetLineWidth(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$SetLineWidth()>
	//    2    4:return          
	}
}
