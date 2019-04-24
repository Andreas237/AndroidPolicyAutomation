// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$SetTextFont
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		pdfliteral = ((PdfLiteral) ((PdfName)arraylist.get(0)));
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #26  <Class PdfName>
	//    4    8:astore_2        
		float f = ((PdfNumber)arraylist.get(1)).floatValue();
	//    5    9:aload_3         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #24  <Method Object ArrayList.get(int)>
	//    8   14:checkcast       #28  <Class PdfNumber>
	//    9   17:invokevirtual   #32  <Method float PdfNumber.floatValue()>
	//   10   20:fstore          4
		pdfliteral = ((PdfLiteral) (PdfContentStreamProcessor.access$5100(pdfcontentstreamprocessor).getAsDict(PdfName.FONT).get(((PdfName) (pdfliteral)))));
	//   11   22:aload_1         
	//   12   23:invokestatic    #36  <Method PdfContentStreamProcessor$ResourceDictionary PdfContentStreamProcessor.access$5100(PdfContentStreamProcessor)>
	//   13   26:getstatic       #40  <Field PdfName PdfName.FONT>
	//   14   29:invokevirtual   #46  <Method PdfDictionary PdfContentStreamProcessor$ResourceDictionary.getAsDict(PdfName)>
	//   15   32:aload_2         
	//   16   33:invokevirtual   #51  <Method com.itextpdf.text.pdf.PdfObject PdfDictionary.get(PdfName)>
	//   17   36:astore_2        
		if(pdfliteral instanceof PdfDictionary)
	//*  18   37:aload_2         
	//*  19   38:instanceof      #48  <Class PdfDictionary>
	//*  20   41:ifeq            71
			pdfliteral = ((PdfLiteral) (PdfContentStreamProcessor.access$5200(pdfcontentstreamprocessor, (PdfDictionary)pdfliteral)));
	//   21   44:aload_1         
	//   22   45:aload_2         
	//   23   46:checkcast       #48  <Class PdfDictionary>
	//   24   49:invokestatic    #55  <Method com.itextpdf.text.pdf.CMapAwareDocumentFont PdfContentStreamProcessor.access$5200(PdfContentStreamProcessor, PdfDictionary)>
	//   25   52:astore_2        
		else
	//*  26   53:aload_1         
	//*  27   54:invokevirtual   #59  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//*  28   57:aload_2         
	//*  29   58:putfield        #65  <Field com.itextpdf.text.pdf.CMapAwareDocumentFont GraphicsState.font>
	//*  30   61:aload_1         
	//*  31   62:invokevirtual   #59  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//*  32   65:fload           4
	//*  33   67:putfield        #69  <Field float GraphicsState.fontSize>
	//*  34   70:return          
			pdfliteral = ((PdfLiteral) (PdfContentStreamProcessor.access$5300(pdfcontentstreamprocessor, (PRIndirectReference)pdfliteral)));
	//   35   71:aload_1         
	//   36   72:aload_2         
	//   37   73:checkcast       #71  <Class PRIndirectReference>
	//   38   76:invokestatic    #75  <Method com.itextpdf.text.pdf.CMapAwareDocumentFont PdfContentStreamProcessor.access$5300(PdfContentStreamProcessor, PRIndirectReference)>
	//   39   79:astore_2        
		pdfcontentstreamprocessor.gs().font = ((com.itextpdf.text.pdf.CMapAwareDocumentFont) (pdfliteral));
		pdfcontentstreamprocessor.gs().fontSize = f;
	//*  40   80:goto            53
	}

	private PdfContentStreamProcessor$SetTextFont()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$SetTextFont(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$SetTextFont()>
	//    2    4:return          
	}
}
