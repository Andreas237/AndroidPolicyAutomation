// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$SetTextRenderMode
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(0)));
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #26  <Class PdfNumber>
	//    4    8:astore_2        
		pdfcontentstreamprocessor.gs().renderMode = ((PdfNumber) (pdfliteral)).intValue();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #30  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #34  <Method int PdfNumber.intValue()>
	//    9   17:putfield        #40  <Field int GraphicsState.renderMode>
	//   10   20:return          
	}

	private PdfContentStreamProcessor$SetTextRenderMode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$SetTextRenderMode(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$SetTextRenderMode()>
	//    2    4:return          
	}
}
