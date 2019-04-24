// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor, GraphicsState

private static class PdfContentStreamProcessor$ProcessGraphicsStateResource
	implements ContentOperator
{

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
	{
		arraylist = ((ArrayList) ((PdfName)arraylist.get(0)));
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #26  <Class PdfName>
	//    4    8:astore_3        
		PdfDictionary pdfdictionary = PdfContentStreamProcessor.access$5100(pdfcontentstreamprocessor).getAsDict(PdfName.EXTGSTATE);
	//    5    9:aload_1         
	//    6   10:invokestatic    #30  <Method PdfContentStreamProcessor$ResourceDictionary PdfContentStreamProcessor.access$5100(PdfContentStreamProcessor)>
	//    7   13:getstatic       #34  <Field PdfName PdfName.EXTGSTATE>
	//    8   16:invokevirtual   #40  <Method PdfDictionary PdfContentStreamProcessor$ResourceDictionary.getAsDict(PdfName)>
	//    9   19:astore          5
		if(pdfdictionary == null)
	//*  10   21:aload           5
	//*  11   23:ifnonnull       47
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("resources.do.not.contain.extgstate.entry.unable.to.process.operator.1", new Object[] {
				pdfliteral
			}));
	//   12   26:new             #42  <Class IllegalArgumentException>
	//   13   29:dup             
	//   14   30:ldc1            #44  <String "resources.do.not.contain.extgstate.entry.unable.to.process.operator.1">
	//   15   32:iconst_1        
	//   16   33:anewarray       Object[]
	//   17   36:dup             
	//   18   37:iconst_0        
	//   19   38:aload_2         
	//   20   39:aastore         
	//   21   40:invokestatic    #50  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   43:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   23   46:athrow          
		pdfliteral = ((PdfLiteral) (pdfdictionary.getAsDict(((PdfName) (arraylist)))));
	//   24   47:aload           5
	//   25   49:aload_3         
	//   26   50:invokevirtual   #56  <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   27   53:astore_2        
		if(pdfliteral == null)
	//*  28   54:aload_2         
	//*  29   55:ifnonnull       79
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("1.is.an.unknown.graphics.state.dictionary", new Object[] {
				arraylist
			}));
	//   30   58:new             #42  <Class IllegalArgumentException>
	//   31   61:dup             
	//   32   62:ldc1            #58  <String "1.is.an.unknown.graphics.state.dictionary">
	//   33   64:iconst_1        
	//   34   65:anewarray       Object[]
	//   35   68:dup             
	//   36   69:iconst_0        
	//   37   70:aload_3         
	//   38   71:aastore         
	//   39   72:invokestatic    #50  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   40   75:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   41   78:athrow          
		pdfliteral = ((PdfLiteral) (((PdfDictionary) (pdfliteral)).getAsArray(PdfName.FONT)));
	//   42   79:aload_2         
	//   43   80:getstatic       #61  <Field PdfName PdfName.FONT>
	//   44   83:invokevirtual   #65  <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   45   86:astore_2        
		if(pdfliteral != null)
	//*  46   87:aload_2         
	//*  47   88:ifnull          131
		{
			arraylist = ((ArrayList) (PdfContentStreamProcessor.access$5300(pdfcontentstreamprocessor, (PRIndirectReference)((PdfArray) (pdfliteral)).getPdfObject(0))));
	//   48   91:aload_1         
	//   49   92:aload_2         
	//   50   93:iconst_0        
	//   51   94:invokevirtual   #71  <Method com.itextpdf.text.pdf.PdfObject PdfArray.getPdfObject(int)>
	//   52   97:checkcast       #73  <Class PRIndirectReference>
	//   53  100:invokestatic    #77  <Method com.itextpdf.text.pdf.CMapAwareDocumentFont PdfContentStreamProcessor.access$5300(PdfContentStreamProcessor, PRIndirectReference)>
	//   54  103:astore_3        
			float f = ((PdfArray) (pdfliteral)).getAsNumber(1).floatValue();
	//   55  104:aload_2         
	//   56  105:iconst_1        
	//   57  106:invokevirtual   #81  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   58  109:invokevirtual   #87  <Method float PdfNumber.floatValue()>
	//   59  112:fstore          4
			pdfcontentstreamprocessor.gs().font = ((com.itextpdf.text.pdf.CMapAwareDocumentFont) (arraylist));
	//   60  114:aload_1         
	//   61  115:invokevirtual   #91  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//   62  118:aload_3         
	//   63  119:putfield        #97  <Field com.itextpdf.text.pdf.CMapAwareDocumentFont GraphicsState.font>
			pdfcontentstreamprocessor.gs().fontSize = f;
	//   64  122:aload_1         
	//   65  123:invokevirtual   #91  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//   66  126:fload           4
	//   67  128:putfield        #101 <Field float GraphicsState.fontSize>
		}
	//   68  131:return          
	}

	private PdfContentStreamProcessor$ProcessGraphicsStateResource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$ProcessGraphicsStateResource(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$ProcessGraphicsStateResource()>
	//    2    4:return          
	}
}
