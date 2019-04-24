// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, Matrix

private static class PdfContentStreamProcessor$TextMoveStartNextLine
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		PdfContentStreamProcessor.access$5002(pdfcontentstreamprocessor, (new Matrix(((PdfNumber)arraylist.get(0)).floatValue(), ((PdfNumber)arraylist.get(1)).floatValue())).multiply(PdfContentStreamProcessor.access$4900(pdfcontentstreamprocessor)));
	//    0    0:aload_1         
	//    1    1:new             #20  <Class Matrix>
	//    2    4:dup             
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//    6   10:checkcast       #28  <Class PdfNumber>
	//    7   13:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//    8   16:aload_3         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #28  <Class PdfNumber>
	//   12   24:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   13   27:invokespecial   #35  <Method void Matrix(float, float)>
	//   14   30:aload_1         
	//   15   31:invokestatic    #39  <Method Matrix PdfContentStreamProcessor.access$4900(PdfContentStreamProcessor)>
	//   16   34:invokevirtual   #43  <Method Matrix Matrix.multiply(Matrix)>
	//   17   37:invokestatic    #47  <Method Matrix PdfContentStreamProcessor.access$5002(PdfContentStreamProcessor, Matrix)>
	//   18   40:pop             
		PdfContentStreamProcessor.access$4902(pdfcontentstreamprocessor, PdfContentStreamProcessor.access$5000(pdfcontentstreamprocessor));
	//   19   41:aload_1         
	//   20   42:aload_1         
	//   21   43:invokestatic    #50  <Method Matrix PdfContentStreamProcessor.access$5000(PdfContentStreamProcessor)>
	//   22   46:invokestatic    #53  <Method Matrix PdfContentStreamProcessor.access$4902(PdfContentStreamProcessor, Matrix)>
	//   23   49:pop             
	//   24   50:return          
	}

	private PdfContentStreamProcessor$TextMoveStartNextLine()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$TextMoveStartNextLine(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$TextMoveStartNextLine()>
	//    2    4:return          
	}
}
