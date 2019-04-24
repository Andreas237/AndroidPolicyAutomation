// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private class PdfContentStreamProcessor$SetLineJoin
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		int i = ((PdfNumber)arraylist.get(0)).intValue();
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #30  <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #32  <Class PdfNumber>
	//    4    8:invokevirtual   #36  <Method int PdfNumber.intValue()>
	//    5   11:istore          4
		pdfcontentstreamprocessor.gs().setLineJoinStyle(i);
	//    6   13:aload_1         
	//    7   14:invokevirtual   #40  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//    8   17:iload           4
	//    9   19:invokevirtual   #46  <Method void GraphicsState.setLineJoinStyle(int)>
	//   10   22:return          
	}

	final PdfContentStreamProcessor this$0;

	private PdfContentStreamProcessor$SetLineJoin()
	{
		this$0 = PdfContentStreamProcessor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field PdfContentStreamProcessor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	PdfContentStreamProcessor$SetLineJoin(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void PdfContentStreamProcessor$SetLineJoin(PdfContentStreamProcessor)>
	//    3    5:return          
	}
}
