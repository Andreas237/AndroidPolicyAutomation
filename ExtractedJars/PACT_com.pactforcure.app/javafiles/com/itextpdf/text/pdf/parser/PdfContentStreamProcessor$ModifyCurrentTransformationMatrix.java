// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, Matrix, GraphicsState

private static class PdfContentStreamProcessor$ModifyCurrentTransformationMatrix
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfliteral = ((PdfLiteral) (new Matrix(((PdfNumber)arraylist.get(0)).floatValue(), ((PdfNumber)arraylist.get(1)).floatValue(), ((PdfNumber)arraylist.get(2)).floatValue(), ((PdfNumber)arraylist.get(3)).floatValue(), ((PdfNumber)arraylist.get(4)).floatValue(), ((PdfNumber)arraylist.get(5)).floatValue())));
	//    0    0:new             #20  <Class Matrix>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//    5    9:checkcast       #28  <Class PdfNumber>
	//    6   12:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//    7   15:aload_3         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   10   20:checkcast       #28  <Class PdfNumber>
	//   11   23:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   12   26:aload_3         
	//   13   27:iconst_2        
	//   14   28:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   15   31:checkcast       #28  <Class PdfNumber>
	//   16   34:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   17   37:aload_3         
	//   18   38:iconst_3        
	//   19   39:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   20   42:checkcast       #28  <Class PdfNumber>
	//   21   45:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   22   48:aload_3         
	//   23   49:iconst_4        
	//   24   50:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   25   53:checkcast       #28  <Class PdfNumber>
	//   26   56:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   27   59:aload_3         
	//   28   60:iconst_5        
	//   29   61:invokevirtual   #26  <Method Object ArrayList.get(int)>
	//   30   64:checkcast       #28  <Class PdfNumber>
	//   31   67:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   32   70:invokespecial   #35  <Method void Matrix(float, float, float, float, float, float)>
	//   33   73:astore_2        
		pdfcontentstreamprocessor = ((PdfContentStreamProcessor) ((GraphicsState)PdfContentStreamProcessor.access$5400(pdfcontentstreamprocessor).peek()));
	//   34   74:aload_1         
	//   35   75:invokestatic    #39  <Method Stack PdfContentStreamProcessor.access$5400(PdfContentStreamProcessor)>
	//   36   78:invokevirtual   #45  <Method Object Stack.peek()>
	//   37   81:checkcast       #47  <Class GraphicsState>
	//   38   84:astore_1        
		pdfcontentstreamprocessor.ctm = ((Matrix) (pdfliteral)).multiply(((GraphicsState) (pdfcontentstreamprocessor)).ctm);
	//   39   85:aload_1         
	//   40   86:aload_2         
	//   41   87:aload_1         
	//   42   88:getfield        #51  <Field Matrix GraphicsState.ctm>
	//   43   91:invokevirtual   #55  <Method Matrix Matrix.multiply(Matrix)>
	//   44   94:putfield        #51  <Field Matrix GraphicsState.ctm>
	//   45   97:return          
	}

	private PdfContentStreamProcessor$ModifyCurrentTransformationMatrix()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$ModifyCurrentTransformationMatrix(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$ModifyCurrentTransformationMatrix()>
	//    2    4:return          
	}
}
