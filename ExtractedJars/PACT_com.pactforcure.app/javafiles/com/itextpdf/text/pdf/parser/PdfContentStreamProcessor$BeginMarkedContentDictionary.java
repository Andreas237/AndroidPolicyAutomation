// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ContentOperator, PdfContentStreamProcessor

private static class PdfContentStreamProcessor$BeginMarkedContentDictionary
	implements ContentOperator
{

	private PdfDictionary getPropertiesDictionary(PdfObject pdfobject, PdfContentStreamProcessor.ResourceDictionary resourcedictionary)
	{
		if(pdfobject.isDictionary())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #24  <Method boolean PdfObject.isDictionary()>
	//*   2    4:ifeq            12
			return (PdfDictionary)pdfobject;
	//    3    7:aload_1         
	//    4    8:checkcast       #26  <Class PdfDictionary>
	//    5   11:areturn         
		else
			return resourcedictionary.getAsDict((PdfName)pdfobject);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:checkcast       #28  <Class PdfName>
	//    9   17:invokevirtual   #34  <Method PdfDictionary PdfContentStreamProcessor$ResourceDictionary.getAsDict(PdfName)>
	//   10   20:areturn         
	}

	public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		throws Exception
	{
		pdfliteral = ((PdfLiteral) ((PdfObject)arraylist.get(1)));
	//    0    0:aload_3         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #44  <Method Object ArrayList.get(int)>
	//    3    5:checkcast       #20  <Class PdfObject>
	//    4    8:astore_2        
		PdfContentStreamProcessor.access$5900(pdfcontentstreamprocessor, (PdfName)arraylist.get(0), getPropertiesDictionary(((PdfObject) (pdfliteral)), PdfContentStreamProcessor.access$5100(pdfcontentstreamprocessor)));
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #44  <Method Object ArrayList.get(int)>
	//    9   15:checkcast       #28  <Class PdfName>
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokestatic    #48  <Method PdfContentStreamProcessor$ResourceDictionary PdfContentStreamProcessor.access$5100(PdfContentStreamProcessor)>
	//   14   24:invokespecial   #50  <Method PdfDictionary getPropertiesDictionary(PdfObject, PdfContentStreamProcessor$ResourceDictionary)>
	//   15   27:invokestatic    #54  <Method void PdfContentStreamProcessor.access$5900(PdfContentStreamProcessor, PdfName, PdfDictionary)>
	//   16   30:return          
	}

	private PdfContentStreamProcessor$BeginMarkedContentDictionary()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$BeginMarkedContentDictionary(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$BeginMarkedContentDictionary()>
	//    2    4:return          
	}
}
