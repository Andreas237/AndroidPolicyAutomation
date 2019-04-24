// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfName;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$Do
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		throws IOException
	{
		PdfContentStreamProcessor.access$6100(pdfcontentstreamprocessor, (PdfName)arraylist.get(0));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//    4    6:checkcast       #28  <Class PdfName>
	//    5    9:invokestatic    #32  <Method void PdfContentStreamProcessor.access$6100(PdfContentStreamProcessor, PdfName)>
	//    6   12:return          
	}

	private PdfContentStreamProcessor$Do()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$Do(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$Do()>
	//    2    4:return          
	}
}
