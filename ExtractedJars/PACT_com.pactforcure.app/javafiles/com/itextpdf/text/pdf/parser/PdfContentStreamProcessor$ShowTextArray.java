// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$ShowTextArray
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		for(pdfliteral = ((PdfLiteral) (((PdfArray)arraylist.get(0)).listIterator())); ((Iterator) (pdfliteral)).hasNext();)
	//*   0    0:aload_3         
	//*   1    1:iconst_0        
	//*   2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
	//*   3    5:checkcast       #26  <Class PdfArray>
	//*   4    8:invokevirtual   #30  <Method java.util.ListIterator PdfArray.listIterator()>
	//*   5   11:astore_2        
	//*   6   12:aload_2         
	//*   7   13:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            63
		{
			arraylist = ((ArrayList) ((PdfObject)((Iterator) (pdfliteral)).next()));
	//    9   21:aload_2         
	//   10   22:invokeinterface #40  <Method Object Iterator.next()>
	//   11   27:checkcast       #42  <Class PdfObject>
	//   12   30:astore_3        
			if(arraylist instanceof PdfString)
	//*  13   31:aload_3         
	//*  14   32:instanceof      #44  <Class PdfString>
	//*  15   35:ifeq            49
				PdfContentStreamProcessor.access$4700(pdfcontentstreamprocessor, (PdfString)arraylist);
	//   16   38:aload_1         
	//   17   39:aload_3         
	//   18   40:checkcast       #44  <Class PdfString>
	//   19   43:invokestatic    #48  <Method void PdfContentStreamProcessor.access$4700(PdfContentStreamProcessor, PdfString)>
			else
	//*  20   46:goto            12
				PdfContentStreamProcessor.access$4800(pdfcontentstreamprocessor, ((PdfNumber)arraylist).floatValue());
	//   21   49:aload_1         
	//   22   50:aload_3         
	//   23   51:checkcast       #50  <Class PdfNumber>
	//   24   54:invokevirtual   #54  <Method float PdfNumber.floatValue()>
	//   25   57:invokestatic    #58  <Method void PdfContentStreamProcessor.access$4800(PdfContentStreamProcessor, float)>
		}

	//*  26   60:goto            12
	//   27   63:return          
	}

	private PdfContentStreamProcessor$ShowTextArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$ShowTextArray(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$ShowTextArray()>
	//    2    4:return          
	}
}
