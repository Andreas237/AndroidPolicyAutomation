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

private static class PdfContentStreamProcessor$Curve
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		throws Exception
	{
		PdfContentStreamProcessor.access$6200(pdfcontentstreamprocessor, 3, Arrays.asList(((Object []) (new Float[] {
			Float.valueOf(((PdfNumber)arraylist.get(0)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(1)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(2)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(3)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(4)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(5)).floatValue())
		}))));
	//    0    0:aload_1         
	//    1    1:iconst_3        
	//    2    2:bipush          6
	//    3    4:anewarray       Float[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_3         
	//    7   10:iconst_0        
	//    8   11:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//    9   14:checkcast       #30  <Class PdfNumber>
	//   10   17:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   11   20:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   12   23:aastore         
	//   13   24:dup             
	//   14   25:iconst_1        
	//   15   26:aload_3         
	//   16   27:iconst_1        
	//   17   28:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   18   31:checkcast       #30  <Class PdfNumber>
	//   19   34:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   20   37:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   21   40:aastore         
	//   22   41:dup             
	//   23   42:iconst_2        
	//   24   43:aload_3         
	//   25   44:iconst_2        
	//   26   45:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   27   48:checkcast       #30  <Class PdfNumber>
	//   28   51:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   29   54:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_3        
	//   33   60:aload_3         
	//   34   61:iconst_3        
	//   35   62:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   36   65:checkcast       #30  <Class PdfNumber>
	//   37   68:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   38   71:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   39   74:aastore         
	//   40   75:dup             
	//   41   76:iconst_4        
	//   42   77:aload_3         
	//   43   78:iconst_4        
	//   44   79:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   45   82:checkcast       #30  <Class PdfNumber>
	//   46   85:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   47   88:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_5        
	//   51   94:aload_3         
	//   52   95:iconst_5        
	//   53   96:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   54   99:checkcast       #30  <Class PdfNumber>
	//   55  102:invokevirtual   #34  <Method float PdfNumber.floatValue()>
	//   56  105:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   57  108:aastore         
	//   58  109:invokestatic    #44  <Method java.util.List Arrays.asList(Object[])>
	//   59  112:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, java.util.List)>
	//   60  115:return          
	}

	private PdfContentStreamProcessor$Curve()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$Curve(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$Curve()>
	//    2    4:return          
	}
}
