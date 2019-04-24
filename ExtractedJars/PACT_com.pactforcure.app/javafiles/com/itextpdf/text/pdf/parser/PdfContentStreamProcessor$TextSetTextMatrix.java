// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, Matrix

private static class PdfContentStreamProcessor$TextSetTextMatrix
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		PdfContentStreamProcessor.access$4902(pdfcontentstreamprocessor, new Matrix(((PdfNumber)arraylist.get(0)).floatValue(), ((PdfNumber)arraylist.get(1)).floatValue(), ((PdfNumber)arraylist.get(2)).floatValue(), ((PdfNumber)arraylist.get(3)).floatValue(), ((PdfNumber)arraylist.get(4)).floatValue(), ((PdfNumber)arraylist.get(5)).floatValue()));
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
	//   13   27:aload_3         
	//   14   28:iconst_2        
	//   15   29:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   16   32:checkcast       #28  <Class PdfNumber>
	//   17   35:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   18   38:aload_3         
	//   19   39:iconst_3        
	//   20   40:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   21   43:checkcast       #28  <Class PdfNumber>
	//   22   46:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   23   49:aload_3         
	//   24   50:iconst_4        
	//   25   51:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   26   54:checkcast       #28  <Class PdfNumber>
	//   27   57:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   28   60:aload_3         
	//   29   61:iconst_5        
	//   30   62:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   31   65:checkcast       #28  <Class PdfNumber>
	//   32   68:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   33   71:invokespecial   #35  <Method void Matrix(float, float, float, float, float, float)>
	//   34   74:invokestatic    #39  <Method Matrix PdfContentStreamProcessor.access$4902(PdfContentStreamProcessor, Matrix)>
	//   35   77:pop             
		PdfContentStreamProcessor.access$5002(pdfcontentstreamprocessor, PdfContentStreamProcessor.access$4900(pdfcontentstreamprocessor));
	//   36   78:aload_1         
	//   37   79:aload_1         
	//   38   80:invokestatic    #43  <Method Matrix PdfContentStreamProcessor.access$4900(PdfContentStreamProcessor)>
	//   39   83:invokestatic    #46  <Method Matrix PdfContentStreamProcessor.access$5002(PdfContentStreamProcessor, Matrix)>
	//   40   86:pop             
	//   41   87:return          
	}

	private PdfContentStreamProcessor$TextSetTextMatrix()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$TextSetTextMatrix(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$TextSetTextMatrix()>
	//    2    4:return          
	}
}
