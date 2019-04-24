// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, LineDashPattern, GraphicsState

private class PdfContentStreamProcessor$SetLineDashPattern
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfliteral = ((PdfLiteral) (new LineDashPattern((PdfArray)arraylist.get(0), ((PdfNumber)arraylist.get(1)).floatValue())));
	//    0    0:new             #26  <Class LineDashPattern>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #32  <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #34  <Class PdfArray>
	//    6   12:aload_3         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #32  <Method Object ArrayList.get(int)>
	//    9   17:checkcast       #36  <Class PdfNumber>
	//   10   20:invokevirtual   #40  <Method float PdfNumber.floatValue()>
	//   11   23:invokespecial   #43  <Method void LineDashPattern(PdfArray, float)>
	//   12   26:astore_2        
		pdfcontentstreamprocessor.gs().setLineDashPattern(((LineDashPattern) (pdfliteral)));
	//   13   27:aload_1         
	//   14   28:invokevirtual   #47  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #53  <Method void GraphicsState.setLineDashPattern(LineDashPattern)>
	//   17   35:return          
	}

	final PdfContentStreamProcessor this$0;

	private PdfContentStreamProcessor$SetLineDashPattern()
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

	PdfContentStreamProcessor$SetLineDashPattern(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void PdfContentStreamProcessor$SetLineDashPattern(PdfContentStreamProcessor)>
	//    3    5:return          
	}
}
