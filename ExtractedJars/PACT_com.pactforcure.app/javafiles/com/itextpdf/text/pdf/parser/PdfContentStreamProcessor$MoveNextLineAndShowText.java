// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$MoveNextLineAndShowText
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		textMoveNextLine.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), new ArrayList(0));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PdfContentStreamProcessor$TextMoveNextLine textMoveNextLine>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:new             #27  <Class ArrayList>
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:invokespecial   #30  <Method void ArrayList(int)>
	//    8   14:invokevirtual   #34  <Method void PdfContentStreamProcessor$TextMoveNextLine.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
		showText.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), arraylist);
	//    9   17:aload_0         
	//   10   18:getfield        #22  <Field PdfContentStreamProcessor$ShowText showText>
	//   11   21:aload_1         
	//   12   22:aconst_null     
	//   13   23:aload_3         
	//   14   24:invokevirtual   #37  <Method void PdfContentStreamProcessor$ShowText.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
	//   15   27:return          
	}

	private final PdfContentStreamProcessor.ShowText showText;
	private final PdfContentStreamProcessor.TextMoveNextLine textMoveNextLine;

	public PdfContentStreamProcessor$MoveNextLineAndShowText(PdfContentStreamProcessor.TextMoveNextLine textmovenextline, PdfContentStreamProcessor.ShowText showtext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		textMoveNextLine = textmovenextline;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field PdfContentStreamProcessor$TextMoveNextLine textMoveNextLine>
		showText = showtext;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field PdfContentStreamProcessor$ShowText showText>
	//    8   14:return          
	}
}
