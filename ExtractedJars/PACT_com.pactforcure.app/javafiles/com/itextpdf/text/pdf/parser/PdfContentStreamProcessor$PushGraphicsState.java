// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$PushGraphicsState
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfliteral = ((PdfLiteral) (new GraphicsState((GraphicsState)PdfContentStreamProcessor.access$5400(pdfcontentstreamprocessor).peek())));
	//    0    0:new             #20  <Class GraphicsState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #24  <Method Stack PdfContentStreamProcessor.access$5400(PdfContentStreamProcessor)>
	//    4    8:invokevirtual   #30  <Method Object Stack.peek()>
	//    5   11:checkcast       #20  <Class GraphicsState>
	//    6   14:invokespecial   #33  <Method void GraphicsState(GraphicsState)>
	//    7   17:astore_2        
		PdfContentStreamProcessor.access$5400(pdfcontentstreamprocessor).push(((Object) (pdfliteral)));
	//    8   18:aload_1         
	//    9   19:invokestatic    #24  <Method Stack PdfContentStreamProcessor.access$5400(PdfContentStreamProcessor)>
	//   10   22:aload_2         
	//   11   23:invokevirtual   #37  <Method Object Stack.push(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	private PdfContentStreamProcessor$PushGraphicsState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$PushGraphicsState(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$PushGraphicsState()>
	//    2    4:return          
	}
}
