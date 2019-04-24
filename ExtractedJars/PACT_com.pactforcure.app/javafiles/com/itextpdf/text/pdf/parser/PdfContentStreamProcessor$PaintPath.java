// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$PaintPath
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		throws Exception
	{
		PdfContentStreamProcessor.access$6300(pdfcontentstreamprocessor, operation, rule, close);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field int operation>
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field int rule>
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field boolean close>
	//    7   13:invokestatic    #34  <Method void PdfContentStreamProcessor.access$6300(PdfContentStreamProcessor, int, int, boolean)>
	//    8   16:return          
	}

	private boolean close;
	private int operation;
	private int rule;

	public PdfContentStreamProcessor$PaintPath(int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		operation = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int operation>
		rule = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int rule>
		close = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field boolean close>
	//   11   19:return          
	}
}
