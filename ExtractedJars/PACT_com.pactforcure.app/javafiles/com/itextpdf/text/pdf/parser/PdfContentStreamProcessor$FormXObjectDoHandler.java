// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.pdf.*;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			XObjectDoHandler, PdfContentStreamProcessor, ContentByteUtils, Matrix, 
//			GraphicsState

private static class PdfContentStreamProcessor$FormXObjectDoHandler
	implements XObjectDoHandler
{

	public void handleXObject(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfStream pdfstream, PdfIndirectReference pdfindirectreference)
	{
		pdfindirectreference = ((PdfIndirectReference) (pdfstream.getAsDict(PdfName.RESOURCES)));
	//    0    0:aload_2         
	//    1    1:getstatic       #26  <Field PdfName PdfName.RESOURCES>
	//    2    4:invokevirtual   #32  <Method com.itextpdf.text.pdf.PdfDictionary PdfStream.getAsDict(PdfName)>
	//    3    7:astore_3        
		byte abyte0[];
		try
		{
			abyte0 = ContentByteUtils.getContentBytesFromContentObject(((com.itextpdf.text.pdf.PdfObject) (pdfstream)));
	//    4    8:aload_2         
	//    5    9:invokestatic    #38  <Method byte[] ContentByteUtils.getContentBytesFromContentObject(com.itextpdf.text.pdf.PdfObject)>
	//    6   12:astore          4
		}
	//*   7   14:aload_2         
	//*   8   15:getstatic       #41  <Field PdfName PdfName.MATRIX>
	//*   9   18:invokevirtual   #45  <Method PdfArray PdfStream.getAsArray(PdfName)>
	//*  10   21:astore_2        
	//*  11   22:new             #47  <Class PdfContentStreamProcessor$PushGraphicsState>
	//*  12   25:dup             
	//*  13   26:aconst_null     
	//*  14   27:invokespecial   #49  <Method void PdfContentStreamProcessor$PushGraphicsState(PdfContentStreamProcessor$1)>
	//*  15   30:aload_1         
	//*  16   31:aconst_null     
	//*  17   32:aconst_null     
	//*  18   33:invokevirtual   #53  <Method void PdfContentStreamProcessor$PushGraphicsState.invoke(PdfContentStreamProcessor, com.itextpdf.text.pdf.PdfLiteral, java.util.ArrayList)>
	//*  19   36:aload_2         
	//*  20   37:ifnull          114
	//*  21   40:new             #55  <Class Matrix>
	//*  22   43:dup             
	//*  23   44:aload_2         
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #61  <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  26   49:invokevirtual   #67  <Method float PdfNumber.floatValue()>
	//*  27   52:aload_2         
	//*  28   53:iconst_1        
	//*  29   54:invokevirtual   #61  <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  30   57:invokevirtual   #67  <Method float PdfNumber.floatValue()>
	//*  31   60:aload_2         
	//*  32   61:iconst_2        
	//*  33   62:invokevirtual   #61  <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  34   65:invokevirtual   #67  <Method float PdfNumber.floatValue()>
	//*  35   68:aload_2         
	//*  36   69:iconst_3        
	//*  37   70:invokevirtual   #61  <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  38   73:invokevirtual   #67  <Method float PdfNumber.floatValue()>
	//*  39   76:aload_2         
	//*  40   77:iconst_4        
	//*  41   78:invokevirtual   #61  <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  42   81:invokevirtual   #67  <Method float PdfNumber.floatValue()>
	//*  43   84:aload_2         
	//*  44   85:iconst_5        
	//*  45   86:invokevirtual   #61  <Method PdfNumber PdfArray.getAsNumber(int)>
	//*  46   89:invokevirtual   #67  <Method float PdfNumber.floatValue()>
	//*  47   92:invokespecial   #70  <Method void Matrix(float, float, float, float, float, float)>
	//*  48   95:astore_2        
	//*  49   96:aload_1         
	//*  50   97:invokevirtual   #74  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//*  51  100:aload_2         
	//*  52  101:aload_1         
	//*  53  102:invokevirtual   #74  <Method GraphicsState PdfContentStreamProcessor.gs()>
	//*  54  105:getfield        #80  <Field Matrix GraphicsState.ctm>
	//*  55  108:invokevirtual   #84  <Method Matrix Matrix.multiply(Matrix)>
	//*  56  111:putfield        #80  <Field Matrix GraphicsState.ctm>
	//*  57  114:aload_1         
	//*  58  115:aload           4
	//*  59  117:aload_3         
	//*  60  118:invokevirtual   #88  <Method void PdfContentStreamProcessor.processContent(byte[], com.itextpdf.text.pdf.PdfDictionary)>
	//*  61  121:new             #90  <Class PdfContentStreamProcessor$PopGraphicsState>
	//*  62  124:dup             
	//*  63  125:aconst_null     
	//*  64  126:invokespecial   #91  <Method void PdfContentStreamProcessor$PopGraphicsState(PdfContentStreamProcessor$1)>
	//*  65  129:aload_1         
	//*  66  130:aconst_null     
	//*  67  131:aconst_null     
	//*  68  132:invokevirtual   #92  <Method void PdfContentStreamProcessor$PopGraphicsState.invoke(PdfContentStreamProcessor, com.itextpdf.text.pdf.PdfLiteral, java.util.ArrayList)>
	//*  69  135:return          
		// Misplaced declaration of an exception variable
		catch(PdfContentStreamProcessor pdfcontentstreamprocessor)
	//*  70  136:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfcontentstreamprocessor)));
	//   71  137:new             #94  <Class ExceptionConverter>
	//   72  140:dup             
	//   73  141:aload_1         
	//   74  142:invokespecial   #97  <Method void ExceptionConverter(Exception)>
	//   75  145:athrow          
		}
		pdfstream = ((PdfStream) (pdfstream.getAsArray(PdfName.MATRIX)));
		(new PdfContentStreamProcessor.PushGraphicsState(((PdfContentStreamProcessor._cls1) (null)))).invoke(pdfcontentstreamprocessor, ((com.itextpdf.text.pdf.PdfLiteral) (null)), ((java.util.ArrayList) (null)));
		if(pdfstream != null)
		{
			pdfstream = ((PdfStream) (new Matrix(((PdfArray) (pdfstream)).getAsNumber(0).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(1).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(2).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(3).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(4).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(5).floatValue())));
			pdfcontentstreamprocessor.gs().ctm = ((Matrix) (pdfstream)).multiply(pdfcontentstreamprocessor.gs().ctm);
		}
		pdfcontentstreamprocessor.processContent(abyte0, ((com.itextpdf.text.pdf.PdfDictionary) (pdfindirectreference)));
		(new PdfContentStreamProcessor.PopGraphicsState(((PdfContentStreamProcessor._cls1) (null)))).invoke(pdfcontentstreamprocessor, ((com.itextpdf.text.pdf.PdfLiteral) (null)), ((java.util.ArrayList) (null)));
	}

	private PdfContentStreamProcessor$FormXObjectDoHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	PdfContentStreamProcessor$FormXObjectDoHandler(PdfContentStreamProcessor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfContentStreamProcessor$FormXObjectDoHandler()>
	//    2    4:return          
	}
}
