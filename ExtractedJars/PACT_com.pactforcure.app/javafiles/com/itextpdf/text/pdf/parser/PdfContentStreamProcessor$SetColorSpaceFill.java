// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfName;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$SetColorSpaceFill
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfcontentstreamprocessor.gs().colorSpaceFill = (PdfName)arraylist.get(0);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//    2    4:aload_3         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #30  <Class PdfName>
	//    6   12:putfield        #36  <Field PdfName GraphicsState.colorSpaceFill>
	//    7   15:return          
	}

	private PdfContentStreamProcessor$SetColorSpaceFill()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$SetColorSpaceFill(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$SetColorSpaceFill()>
	//    2    4:return          
	}
}
