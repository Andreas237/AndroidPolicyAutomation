// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$ClipPath
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		throws Exception
	{
		PdfContentStreamProcessor.access$6400(pdfcontentstreamprocessor, rule);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field int rule>
	//    3    5:invokestatic    #27  <Method void PdfContentStreamProcessor.access$6400(PdfContentStreamProcessor, int)>
	//    4    8:return          
	}

	private int rule;

	public PdfContentStreamProcessor$ClipPath(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		rule = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int rule>
	//    5    9:return          
	}
}
