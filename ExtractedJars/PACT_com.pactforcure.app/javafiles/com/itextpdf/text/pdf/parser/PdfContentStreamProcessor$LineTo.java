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

private static class PdfContentStreamProcessor$LineTo
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		throws Exception
	{
		PdfContentStreamProcessor.access$6200(pdfcontentstreamprocessor, 2, Arrays.asList(((Object []) (new Float[] {
			Float.valueOf(((PdfNumber)arraylist.get(0)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(1)).floatValue())
		}))));
	//    0    0:aload_1         
	//    1    1:iconst_2        
	//    2    2:iconst_2        
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
	//   22   40:invokestatic    #44  <Method java.util.List Arrays.asList(Object[])>
	//   23   43:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, java.util.List)>
	//   24   46:return          
	}

	private PdfContentStreamProcessor$LineTo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$LineTo(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$LineTo()>
	//    2    4:return          
	}
}
