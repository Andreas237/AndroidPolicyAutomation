// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			XObjectDoHandler, PdfContentStreamProcessor, ImageRenderInfo, RenderListener

private static class PdfContentStreamProcessor$ImageXObjectDoHandler
	implements XObjectDoHandler
{

	public void handleXObject(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfStream pdfstream, PdfIndirectReference pdfindirectreference)
	{
		pdfstream = ((PdfStream) (PdfContentStreamProcessor.access$5100(pdfcontentstreamprocessor).getAsDict(PdfName.COLORSPACE)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method PdfContentStreamProcessor$ResourceDictionary PdfContentStreamProcessor.access$5100(PdfContentStreamProcessor)>
	//    2    4:getstatic       #28  <Field PdfName PdfName.COLORSPACE>
	//    3    7:invokevirtual   #34  <Method com.itextpdf.text.pdf.PdfDictionary PdfContentStreamProcessor$ResourceDictionary.getAsDict(PdfName)>
	//    4   10:astore_2        
		pdfstream = ((PdfStream) (ImageRenderInfo.createForXObject(pdfcontentstreamprocessor.gs(), pdfindirectreference, ((com.itextpdf.text.pdf.PdfDictionary) (pdfstream)))));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #38  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//    7   15:aload_3         
	//    8   16:aload_2         
	//    9   17:invokestatic    #44  <Method ImageRenderInfo ImageRenderInfo.createForXObject(GraphicsState, PdfIndirectReference, com.itextpdf.text.pdf.PdfDictionary)>
	//   10   20:astore_2        
		PdfContentStreamProcessor.access$6500(pdfcontentstreamprocessor).renderImage(((ImageRenderInfo) (pdfstream)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #48  <Method RenderListener PdfContentStreamProcessor.access$6500(PdfContentStreamProcessor)>
	//   13   25:aload_2         
	//   14   26:invokeinterface #54  <Method void RenderListener.renderImage(ImageRenderInfo)>
	//   15   31:return          
	}

	private PdfContentStreamProcessor$ImageXObjectDoHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$ImageXObjectDoHandler(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$ImageXObjectDoHandler()>
	//    2    4:return          
	}
}
