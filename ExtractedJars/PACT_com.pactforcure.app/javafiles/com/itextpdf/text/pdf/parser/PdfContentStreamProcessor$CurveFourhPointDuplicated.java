// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.PdfLiteral;
import com.itextpdf.text.pdf.PdfNumber;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$CurveFourhPointDuplicated
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		throws Exception
	{
		PdfContentStreamProcessor.access$6200(pdfcontentstreamprocessor, 5, Arrays.asList(((Object []) (new Float[] {
			Float.valueOf(((PdfNumber)arraylist.get(0)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(1)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(2)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(3)).floatValue())
		}))));
	//    0    0:aload_1         
	//    1    1:iconst_5        
	//    2    2:iconst_4        
	//    3    3:anewarray       Float[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_3         
	//    7    9:iconst_0        
	//    8   10:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//    9   13:checkcast       #30  <Class PdfNumber>
	//   10   16:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   11   19:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_1        
	//   15   25:aload_3         
	//   16   26:iconst_1        
	//   17   27:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   18   30:checkcast       #30  <Class PdfNumber>
	//   19   33:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   20   36:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   21   39:aastore         
	//   22   40:dup             
	//   23   41:iconst_2        
	//   24   42:aload_3         
	//   25   43:iconst_2        
	//   26   44:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   27   47:checkcast       #30  <Class PdfNumber>
	//   28   50:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   29   53:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   30   56:aastore         
	//   31   57:dup             
	//   32   58:iconst_3        
	//   33   59:aload_3         
	//   34   60:iconst_3        
	//   35   61:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   36   64:checkcast       #30  <Class PdfNumber>
	//   37   67:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   38   70:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   39   73:aastore         
	//   40   74:invokestatic    #44  <Method java.util.List Arrays.asList(Object[])>
	//   41   77:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, java.util.List)>
	//   42   80:return          
	}

	private PdfContentStreamProcessor$CurveFourhPointDuplicated()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$CurveFourhPointDuplicated(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$CurveFourhPointDuplicated()>
	//    2    4:return          
	}
}
