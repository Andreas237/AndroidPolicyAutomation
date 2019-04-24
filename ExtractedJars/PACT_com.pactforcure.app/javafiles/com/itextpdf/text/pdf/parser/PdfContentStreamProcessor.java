// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.RandomAccessSourceFactory;
import com.itextpdf.text.pdf.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			Matrix, GraphicsState, MarkedContentInfo, RenderListener, 
//			ExtRenderListener, TextRenderInfo, XObjectDoHandler, ContentOperator, 
//			PathConstructionRenderInfo, PathPaintingRenderInfo, ImageRenderInfo, InlineImageUtils, 
//			InlineImageInfo, ContentByteUtils, LineDashPattern

public class PdfContentStreamProcessor
{
	private static class BeginMarkedContent
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.beginMarkedContent((PdfName)arraylist.get(0), new PdfDictionary());
		//    0    0:aload_1         
		//    1    1:aload_3         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//    4    6:checkcast       #28  <Class PdfName>
		//    5    9:new             #30  <Class PdfDictionary>
		//    6   12:dup             
		//    7   13:invokespecial   #31  <Method void PdfDictionary()>
		//    8   16:invokestatic    #35  <Method void PdfContentStreamProcessor.access$5900(PdfContentStreamProcessor, PdfName, PdfDictionary)>
		//    9   19:return          
		}

		private BeginMarkedContent()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class BeginMarkedContentDictionary
		implements ContentOperator
	{

		private PdfDictionary getPropertiesDictionary(PdfObject pdfobject, ResourceDictionary resourcedictionary)
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
			pdfcontentstreamprocessor.beginMarkedContent((PdfName)arraylist.get(0), getPropertiesDictionary(((PdfObject) (pdfliteral)), pdfcontentstreamprocessor.resources));
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

		private BeginMarkedContentDictionary()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class BeginText
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.textMatrix = new Matrix();
		//    0    0:aload_1         
		//    1    1:new             #20  <Class Matrix>
		//    2    4:dup             
		//    3    5:invokespecial   #21  <Method void Matrix()>
		//    4    8:invokestatic    #25  <Method Matrix PdfContentStreamProcessor.access$5002(PdfContentStreamProcessor, Matrix)>
		//    5   11:pop             
			pdfcontentstreamprocessor.textLineMatrix = pdfcontentstreamprocessor.textMatrix;
		//    6   12:aload_1         
		//    7   13:aload_1         
		//    8   14:invokestatic    #29  <Method Matrix PdfContentStreamProcessor.access$5000(PdfContentStreamProcessor)>
		//    9   17:invokestatic    #32  <Method Matrix PdfContentStreamProcessor.access$4902(PdfContentStreamProcessor, Matrix)>
		//   10   20:pop             
			pdfcontentstreamprocessor.beginText();
		//   11   21:aload_1         
		//   12   22:invokestatic    #36  <Method void PdfContentStreamProcessor.access$5700(PdfContentStreamProcessor)>
		//   13   25:return          
		}

		private BeginText()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ClipPath
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.clipPath(rule);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #18  <Field int rule>
		//    3    5:invokestatic    #27  <Method void PdfContentStreamProcessor.access$6400(PdfContentStreamProcessor, int)>
		//    4    8:return          
		}

		private int rule;

		public ClipPath(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			rule = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int rule>
		//    5    9:return          
		}
	}

	private static class CloseSubpath
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.modifyPath(6, ((List) (null)));
		//    0    0:aload_1         
		//    1    1:bipush          6
		//    2    3:aconst_null     
		//    3    4:invokestatic    #24  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, List)>
		//    4    7:return          
		}

		private CloseSubpath()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Curve
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.modifyPath(3, Arrays.asList(((Object []) (new Float[] {
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
		//   58  109:invokestatic    #44  <Method List Arrays.asList(Object[])>
		//   59  112:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, List)>
		//   60  115:return          
		}

		private Curve()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class CurveFirstPointDuplicated
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.modifyPath(4, Arrays.asList(((Object []) (new Float[] {
				Float.valueOf(((PdfNumber)arraylist.get(0)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(1)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(2)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(3)).floatValue())
			}))));
		//    0    0:aload_1         
		//    1    1:iconst_4        
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
		//   40   74:invokestatic    #44  <Method List Arrays.asList(Object[])>
		//   41   77:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, List)>
		//   42   80:return          
		}

		private CurveFirstPointDuplicated()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class CurveFourhPointDuplicated
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.modifyPath(5, Arrays.asList(((Object []) (new Float[] {
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
		//   40   74:invokestatic    #44  <Method List Arrays.asList(Object[])>
		//   41   77:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, List)>
		//   42   80:return          
		}

		private CurveFourhPointDuplicated()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Do
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws IOException
		{
			pdfcontentstreamprocessor.displayXObject((PdfName)arraylist.get(0));
		//    0    0:aload_1         
		//    1    1:aload_3         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//    4    6:checkcast       #28  <Class PdfName>
		//    5    9:invokestatic    #32  <Method void PdfContentStreamProcessor.access$6100(PdfContentStreamProcessor, PdfName)>
		//    6   12:return          
		}

		private Do()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class EndMarkedContent
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.endMarkedContent();
		//    0    0:aload_1         
		//    1    1:invokestatic    #24  <Method void PdfContentStreamProcessor.access$6000(PdfContentStreamProcessor)>
		//    2    4:return          
		}

		private EndMarkedContent()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class EndPath
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.paintPath(0, -1, false);
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:iconst_m1       
		//    3    3:iconst_0        
		//    4    4:invokestatic    #22  <Method void PdfContentStreamProcessor.access$6300(PdfContentStreamProcessor, int, int, boolean)>
		//    5    7:return          
		}

		private EndPath()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class EndText
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.textMatrix = null;
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:invokestatic    #22  <Method Matrix PdfContentStreamProcessor.access$5002(PdfContentStreamProcessor, Matrix)>
		//    3    5:pop             
			pdfcontentstreamprocessor.textLineMatrix = null;
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokestatic    #25  <Method Matrix PdfContentStreamProcessor.access$4902(PdfContentStreamProcessor, Matrix)>
		//    7   11:pop             
			pdfcontentstreamprocessor.endText();
		//    8   12:aload_1         
		//    9   13:invokestatic    #29  <Method void PdfContentStreamProcessor.access$5800(PdfContentStreamProcessor)>
		//   10   16:return          
		}

		private EndText()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class FormXObjectDoHandler
		implements XObjectDoHandler
	{

		public void handleXObject(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfStream pdfstream, PdfIndirectReference pdfindirectreference)
		{
			pdfindirectreference = ((PdfIndirectReference) (pdfstream.getAsDict(PdfName.RESOURCES)));
		//    0    0:aload_2         
		//    1    1:getstatic       #26  <Field PdfName PdfName.RESOURCES>
		//    2    4:invokevirtual   #32  <Method PdfDictionary PdfStream.getAsDict(PdfName)>
		//    3    7:astore_3        
			byte abyte0[];
			try
			{
				abyte0 = ContentByteUtils.getContentBytesFromContentObject(((PdfObject) (pdfstream)));
		//    4    8:aload_2         
		//    5    9:invokestatic    #38  <Method byte[] ContentByteUtils.getContentBytesFromContentObject(PdfObject)>
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
		//*  18   33:invokevirtual   #53  <Method void PdfContentStreamProcessor$PushGraphicsState.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
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
		//*  60  118:invokevirtual   #88  <Method void PdfContentStreamProcessor.processContent(byte[], PdfDictionary)>
		//*  61  121:new             #90  <Class PdfContentStreamProcessor$PopGraphicsState>
		//*  62  124:dup             
		//*  63  125:aconst_null     
		//*  64  126:invokespecial   #91  <Method void PdfContentStreamProcessor$PopGraphicsState(PdfContentStreamProcessor$1)>
		//*  65  129:aload_1         
		//*  66  130:aconst_null     
		//*  67  131:aconst_null     
		//*  68  132:invokevirtual   #92  <Method void PdfContentStreamProcessor$PopGraphicsState.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
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
			(new PushGraphicsState()).invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (null)));
			if(pdfstream != null)
			{
				pdfstream = ((PdfStream) (new Matrix(((PdfArray) (pdfstream)).getAsNumber(0).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(1).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(2).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(3).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(4).floatValue(), ((PdfArray) (pdfstream)).getAsNumber(5).floatValue())));
				pdfcontentstreamprocessor.gs().ctm = ((Matrix) (pdfstream)).multiply(pdfcontentstreamprocessor.gs().ctm);
			}
			pdfcontentstreamprocessor.processContent(abyte0, ((PdfDictionary) (pdfindirectreference)));
			(new PopGraphicsState()).invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (null)));
		}

		private FormXObjectDoHandler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class IgnoreOperatorContentOperator
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
		//    0    0:return          
		}

		private IgnoreOperatorContentOperator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class IgnoreXObjectDoHandler
		implements XObjectDoHandler
	{

		public void handleXObject(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfStream pdfstream, PdfIndirectReference pdfindirectreference)
		{
		//    0    0:return          
		}

		private IgnoreXObjectDoHandler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ImageXObjectDoHandler
		implements XObjectDoHandler
	{

		public void handleXObject(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfStream pdfstream, PdfIndirectReference pdfindirectreference)
		{
			pdfstream = ((PdfStream) (pdfcontentstreamprocessor.resources.getAsDict(PdfName.COLORSPACE)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #22  <Method PdfContentStreamProcessor$ResourceDictionary PdfContentStreamProcessor.access$5100(PdfContentStreamProcessor)>
		//    2    4:getstatic       #28  <Field PdfName PdfName.COLORSPACE>
		//    3    7:invokevirtual   #34  <Method PdfDictionary PdfContentStreamProcessor$ResourceDictionary.getAsDict(PdfName)>
		//    4   10:astore_2        
			pdfstream = ((PdfStream) (ImageRenderInfo.createForXObject(pdfcontentstreamprocessor.gs(), pdfindirectreference, ((PdfDictionary) (pdfstream)))));
		//    5   11:aload_1         
		//    6   12:invokevirtual   #38  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    7   15:aload_3         
		//    8   16:aload_2         
		//    9   17:invokestatic    #44  <Method ImageRenderInfo ImageRenderInfo.createForXObject(GraphicsState, PdfIndirectReference, PdfDictionary)>
		//   10   20:astore_2        
			pdfcontentstreamprocessor.renderListener.renderImage(((ImageRenderInfo) (pdfstream)));
		//   11   21:aload_1         
		//   12   22:invokestatic    #48  <Method RenderListener PdfContentStreamProcessor.access$6500(PdfContentStreamProcessor)>
		//   13   25:aload_2         
		//   14   26:invokeinterface #54  <Method void RenderListener.renderImage(ImageRenderInfo)>
		//   15   31:return          
		}

		private ImageXObjectDoHandler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class LineTo
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.modifyPath(2, Arrays.asList(((Object []) (new Float[] {
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
		//   22   40:invokestatic    #44  <Method List Arrays.asList(Object[])>
		//   23   43:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, List)>
		//   24   46:return          
		}

		private LineTo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ModifyCurrentTransformationMatrix
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
			pdfcontentstreamprocessor = ((PdfContentStreamProcessor) ((GraphicsState)pdfcontentstreamprocessor.gsStack.peek()));
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

		private ModifyCurrentTransformationMatrix()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class MoveNextLineAndShowText
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			textMoveNextLine.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), new ArrayList(0));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field PdfContentStreamProcessor$TextMoveNextLine textMoveNextLine>
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:new             #27  <Class ArrayList>
		//    5    9:dup             
		//    6   10:iconst_0        
		//    7   11:invokespecial   #30  <Method void ArrayList(int)>
		//    8   14:invokevirtual   #34  <Method void PdfContentStreamProcessor$TextMoveNextLine.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
			showText.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), arraylist);
		//    9   17:aload_0         
		//   10   18:getfield        #22  <Field PdfContentStreamProcessor$ShowText showText>
		//   11   21:aload_1         
		//   12   22:aconst_null     
		//   13   23:aload_3         
		//   14   24:invokevirtual   #37  <Method void PdfContentStreamProcessor$ShowText.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
		//   15   27:return          
		}

		private final ShowText showText;
		private final TextMoveNextLine textMoveNextLine;

		public MoveNextLineAndShowText(TextMoveNextLine textmovenextline, ShowText showtext)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			textMoveNextLine = textmovenextline;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field PdfContentStreamProcessor$TextMoveNextLine textMoveNextLine>
			showText = showtext;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field PdfContentStreamProcessor$ShowText showText>
		//    8   14:return          
		}
	}

	private static class MoveNextLineAndShowTextWithSpacing
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			Object obj = ((Object) ((PdfNumber)arraylist.get(0)));
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #35  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #37  <Class PdfNumber>
		//    4    8:astore          4
			pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(1)));
		//    5   10:aload_3         
		//    6   11:iconst_1        
		//    7   12:invokevirtual   #35  <Method Object ArrayList.get(int)>
		//    8   15:checkcast       #37  <Class PdfNumber>
		//    9   18:astore_2        
			arraylist = ((ArrayList) ((PdfString)arraylist.get(2)));
		//   10   19:aload_3         
		//   11   20:iconst_2        
		//   12   21:invokevirtual   #35  <Method Object ArrayList.get(int)>
		//   13   24:checkcast       #39  <Class PdfString>
		//   14   27:astore_3        
			ArrayList arraylist1 = new ArrayList(1);
		//   15   28:new             #31  <Class ArrayList>
		//   16   31:dup             
		//   17   32:iconst_1        
		//   18   33:invokespecial   #42  <Method void ArrayList(int)>
		//   19   36:astore          5
			arraylist1.add(0, obj);
		//   20   38:aload           5
		//   21   40:iconst_0        
		//   22   41:aload           4
		//   23   43:invokevirtual   #46  <Method void ArrayList.add(int, Object)>
			setTextWordSpacing.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), arraylist1);
		//   24   46:aload_0         
		//   25   47:getfield        #22  <Field PdfContentStreamProcessor$SetTextWordSpacing setTextWordSpacing>
		//   26   50:aload_1         
		//   27   51:aconst_null     
		//   28   52:aload           5
		//   29   54:invokevirtual   #50  <Method void PdfContentStreamProcessor$SetTextWordSpacing.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
			obj = ((Object) (new ArrayList(1)));
		//   30   57:new             #31  <Class ArrayList>
		//   31   60:dup             
		//   32   61:iconst_1        
		//   33   62:invokespecial   #42  <Method void ArrayList(int)>
		//   34   65:astore          4
			((ArrayList) (obj)).add(0, ((Object) (pdfliteral)));
		//   35   67:aload           4
		//   36   69:iconst_0        
		//   37   70:aload_2         
		//   38   71:invokevirtual   #46  <Method void ArrayList.add(int, Object)>
			setTextCharacterSpacing.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (obj)));
		//   39   74:aload_0         
		//   40   75:getfield        #24  <Field PdfContentStreamProcessor$SetTextCharacterSpacing setTextCharacterSpacing>
		//   41   78:aload_1         
		//   42   79:aconst_null     
		//   43   80:aload           4
		//   44   82:invokevirtual   #53  <Method void PdfContentStreamProcessor$SetTextCharacterSpacing.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
			pdfliteral = ((PdfLiteral) (new ArrayList(1)));
		//   45   85:new             #31  <Class ArrayList>
		//   46   88:dup             
		//   47   89:iconst_1        
		//   48   90:invokespecial   #42  <Method void ArrayList(int)>
		//   49   93:astore_2        
			((ArrayList) (pdfliteral)).add(0, ((Object) (arraylist)));
		//   50   94:aload_2         
		//   51   95:iconst_0        
		//   52   96:aload_3         
		//   53   97:invokevirtual   #46  <Method void ArrayList.add(int, Object)>
			moveNextLineAndShowText.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (pdfliteral)));
		//   54  100:aload_0         
		//   55  101:getfield        #26  <Field PdfContentStreamProcessor$MoveNextLineAndShowText moveNextLineAndShowText>
		//   56  104:aload_1         
		//   57  105:aconst_null     
		//   58  106:aload_2         
		//   59  107:invokevirtual   #56  <Method void PdfContentStreamProcessor$MoveNextLineAndShowText.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
		//   60  110:return          
		}

		private final MoveNextLineAndShowText moveNextLineAndShowText;
		private final SetTextCharacterSpacing setTextCharacterSpacing;
		private final SetTextWordSpacing setTextWordSpacing;

		public MoveNextLineAndShowTextWithSpacing(SetTextWordSpacing settextwordspacing, SetTextCharacterSpacing settextcharacterspacing, MoveNextLineAndShowText movenextlineandshowtext)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			setTextWordSpacing = settextwordspacing;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field PdfContentStreamProcessor$SetTextWordSpacing setTextWordSpacing>
			setTextCharacterSpacing = settextcharacterspacing;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field PdfContentStreamProcessor$SetTextCharacterSpacing setTextCharacterSpacing>
			moveNextLineAndShowText = movenextlineandshowtext;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field PdfContentStreamProcessor$MoveNextLineAndShowText moveNextLineAndShowText>
		//   11   19:return          
		}
	}

	private static class MoveTo
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.modifyPath(1, Arrays.asList(((Object []) (new Float[] {
				Float.valueOf(((PdfNumber)arraylist.get(0)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(1)).floatValue())
			}))));
		//    0    0:aload_1         
		//    1    1:iconst_1        
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
		//   22   40:invokestatic    #44  <Method List Arrays.asList(Object[])>
		//   23   43:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, List)>
		//   24   46:return          
		}

		private MoveTo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class PaintPath
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.paintPath(operation, rule, close);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #21  <Field int operation>
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field int rule>
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field boolean close>
		//    7   13:invokestatic    #34  <Method void PdfContentStreamProcessor.access$6300(PdfContentStreamProcessor, int, int, boolean)>
		//    8   16:return          
		}

		private boolean close;
		private int operation;
		private int rule;

		public PaintPath(int i, int j, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			operation = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int operation>
			rule = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int rule>
			close = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #25  <Field boolean close>
		//   11   19:return          
		}
	}

	private static class PopGraphicsState
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gsStack.pop();
		//    0    0:aload_1         
		//    1    1:invokestatic    #22  <Method Stack PdfContentStreamProcessor.access$5400(PdfContentStreamProcessor)>
		//    2    4:invokevirtual   #28  <Method Object Stack.pop()>
		//    3    7:pop             
		//    4    8:return          
		}

		private PopGraphicsState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ProcessGraphicsStateResource
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
			PdfDictionary pdfdictionary = pdfcontentstreamprocessor.resources.getAsDict(PdfName.EXTGSTATE);
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
				arraylist = ((ArrayList) (pdfcontentstreamprocessor.getFont((PRIndirectReference)((PdfArray) (pdfliteral)).getPdfObject(0))));
		//   48   91:aload_1         
		//   49   92:aload_2         
		//   50   93:iconst_0        
		//   51   94:invokevirtual   #71  <Method PdfObject PdfArray.getPdfObject(int)>
		//   52   97:checkcast       #73  <Class PRIndirectReference>
		//   53  100:invokestatic    #77  <Method CMapAwareDocumentFont PdfContentStreamProcessor.access$5300(PdfContentStreamProcessor, PRIndirectReference)>
		//   54  103:astore_3        
				float f = ((PdfArray) (pdfliteral)).getAsNumber(1).floatValue();
		//   55  104:aload_2         
		//   56  105:iconst_1        
		//   57  106:invokevirtual   #81  <Method PdfNumber PdfArray.getAsNumber(int)>
		//   58  109:invokevirtual   #87  <Method float PdfNumber.floatValue()>
		//   59  112:fstore          4
				pdfcontentstreamprocessor.gs().font = ((CMapAwareDocumentFont) (arraylist));
		//   60  114:aload_1         
		//   61  115:invokevirtual   #91  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//   62  118:aload_3         
		//   63  119:putfield        #97  <Field CMapAwareDocumentFont GraphicsState.font>
				pdfcontentstreamprocessor.gs().fontSize = f;
		//   64  122:aload_1         
		//   65  123:invokevirtual   #91  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//   66  126:fload           4
		//   67  128:putfield        #101 <Field float GraphicsState.fontSize>
			}
		//   68  131:return          
		}

		private ProcessGraphicsStateResource()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class PushGraphicsState
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) (new GraphicsState((GraphicsState)pdfcontentstreamprocessor.gsStack.peek())));
		//    0    0:new             #20  <Class GraphicsState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokestatic    #24  <Method Stack PdfContentStreamProcessor.access$5400(PdfContentStreamProcessor)>
		//    4    8:invokevirtual   #30  <Method Object Stack.peek()>
		//    5   11:checkcast       #20  <Class GraphicsState>
		//    6   14:invokespecial   #33  <Method void GraphicsState(GraphicsState)>
		//    7   17:astore_2        
			pdfcontentstreamprocessor.gsStack.push(((Object) (pdfliteral)));
		//    8   18:aload_1         
		//    9   19:invokestatic    #24  <Method Stack PdfContentStreamProcessor.access$5400(PdfContentStreamProcessor)>
		//   10   22:aload_2         
		//   11   23:invokevirtual   #37  <Method Object Stack.push(Object)>
		//   12   26:pop             
		//   13   27:return          
		}

		private PushGraphicsState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Rectangle
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
			throws Exception
		{
			pdfcontentstreamprocessor.modifyPath(7, Arrays.asList(((Object []) (new Float[] {
				Float.valueOf(((PdfNumber)arraylist.get(0)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(1)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(2)).floatValue()), Float.valueOf(((PdfNumber)arraylist.get(3)).floatValue())
			}))));
		//    0    0:aload_1         
		//    1    1:bipush          7
		//    2    3:iconst_4        
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
		//   40   75:invokestatic    #44  <Method List Arrays.asList(Object[])>
		//   41   78:invokestatic    #48  <Method void PdfContentStreamProcessor.access$6200(PdfContentStreamProcessor, int, List)>
		//   42   81:return          
		}

		private Rectangle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ResourceDictionary extends PdfDictionary
	{

		public PdfObject getDirectObject(PdfName pdfname)
		{
			for(int i = resourcesStack.size() - 1; i >= 0; i--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field List resourcesStack>
		//*   2    4:invokeinterface #28  <Method int List.size()>
		//*   3    9:iconst_1        
		//*   4   10:isub            
		//*   5   11:istore_2        
		//*   6   12:iload_2         
		//*   7   13:iflt            53
			{
				Object obj = ((Object) ((PdfDictionary)resourcesStack.get(i)));
		//    8   16:aload_0         
		//    9   17:getfield        #19  <Field List resourcesStack>
		//   10   20:iload_2         
		//   11   21:invokeinterface #32  <Method Object List.get(int)>
		//   12   26:checkcast       #4   <Class PdfDictionary>
		//   13   29:astore_3        
				if(obj == null)
					continue;
		//   14   30:aload_3         
		//   15   31:ifnull          46
				obj = ((Object) (((PdfDictionary) (obj)).getDirectObject(pdfname)));
		//   16   34:aload_3         
		//   17   35:aload_1         
		//   18   36:invokevirtual   #34  <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
		//   19   39:astore_3        
				if(obj != null)
		//*  20   40:aload_3         
		//*  21   41:ifnull          46
					return ((PdfObject) (obj));
		//   22   44:aload_3         
		//   23   45:areturn         
			}

		//   24   46:iload_2         
		//   25   47:iconst_1        
		//   26   48:isub            
		//   27   49:istore_2        
		//*  28   50:goto            12
			return super.getDirectObject(pdfname);
		//   29   53:aload_0         
		//   30   54:aload_1         
		//   31   55:invokespecial   #34  <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
		//   32   58:areturn         
		}

		public void pop()
		{
			resourcesStack.remove(resourcesStack.size() - 1);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field List resourcesStack>
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field List resourcesStack>
		//    4    8:invokeinterface #28  <Method int List.size()>
		//    5   13:iconst_1        
		//    6   14:isub            
		//    7   15:invokeinterface #38  <Method Object List.remove(int)>
		//    8   20:pop             
		//    9   21:return          
		}

		public void push(PdfDictionary pdfdictionary)
		{
			resourcesStack.add(((Object) (pdfdictionary)));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field List resourcesStack>
		//    2    4:aload_1         
		//    3    5:invokeinterface #44  <Method boolean List.add(Object)>
		//    4   10:pop             
		//    5   11:return          
		}

		private final List resourcesStack = new ArrayList();

		public ResourceDictionary()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void PdfDictionary()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void ArrayList()>
		//    6   12:putfield        #19  <Field List resourcesStack>
		//    7   15:return          
		}
	}

	private static class SetCMYKFill
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().fillColor = PdfContentStreamProcessor.getColor(4, ((List) (arraylist)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:iconst_4        
		//    3    5:aload_3         
		//    4    6:invokestatic    #26  <Method BaseColor PdfContentStreamProcessor.access$5500(int, List)>
		//    5    9:putfield        #32  <Field BaseColor GraphicsState.fillColor>
		//    6   12:return          
		}

		private SetCMYKFill()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetCMYKStroke
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().strokeColor = PdfContentStreamProcessor.getColor(4, ((List) (arraylist)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:iconst_4        
		//    3    5:aload_3         
		//    4    6:invokestatic    #26  <Method BaseColor PdfContentStreamProcessor.access$5500(int, List)>
		//    5    9:putfield        #32  <Field BaseColor GraphicsState.strokeColor>
		//    6   12:return          
		}

		private SetCMYKStroke()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetColorFill
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().fillColor = PdfContentStreamProcessor.getColor(pdfcontentstreamprocessor.gs().colorSpaceFill, ((List) (arraylist)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    4    8:getfield        #28  <Field PdfName GraphicsState.colorSpaceFill>
		//    5   11:aload_3         
		//    6   12:invokestatic    #32  <Method BaseColor PdfContentStreamProcessor.access$5600(PdfName, List)>
		//    7   15:putfield        #36  <Field BaseColor GraphicsState.fillColor>
		//    8   18:return          
		}

		private SetColorFill()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetColorSpaceFill
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().colorSpaceFill = (PdfName)arraylist.get(0);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:aload_3         
		//    3    5:iconst_0        
		//    4    6:invokevirtual   #28  <Method Object ArrayList.get(int)>
		//    5    9:checkcast       #30  <Class PdfName>
		//    6   12:putfield        #36  <Field PdfName GraphicsState.colorSpaceFill>
		//    7   15:return          
		}

		private SetColorSpaceFill()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetColorSpaceStroke
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().colorSpaceStroke = (PdfName)arraylist.get(0);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:aload_3         
		//    3    5:iconst_0        
		//    4    6:invokevirtual   #28  <Method Object ArrayList.get(int)>
		//    5    9:checkcast       #30  <Class PdfName>
		//    6   12:putfield        #36  <Field PdfName GraphicsState.colorSpaceStroke>
		//    7   15:return          
		}

		private SetColorSpaceStroke()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetColorStroke
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().strokeColor = PdfContentStreamProcessor.getColor(pdfcontentstreamprocessor.gs().colorSpaceStroke, ((List) (arraylist)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    4    8:getfield        #28  <Field PdfName GraphicsState.colorSpaceStroke>
		//    5   11:aload_3         
		//    6   12:invokestatic    #32  <Method BaseColor PdfContentStreamProcessor.access$5600(PdfName, List)>
		//    7   15:putfield        #36  <Field BaseColor GraphicsState.strokeColor>
		//    8   18:return          
		}

		private SetColorStroke()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetGrayFill
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().fillColor = PdfContentStreamProcessor.getColor(1, ((List) (arraylist)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:iconst_1        
		//    3    5:aload_3         
		//    4    6:invokestatic    #26  <Method BaseColor PdfContentStreamProcessor.access$5500(int, List)>
		//    5    9:putfield        #32  <Field BaseColor GraphicsState.fillColor>
		//    6   12:return          
		}

		private SetGrayFill()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetGrayStroke
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().strokeColor = PdfContentStreamProcessor.getColor(1, ((List) (arraylist)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:iconst_1        
		//    3    5:aload_3         
		//    4    6:invokestatic    #26  <Method BaseColor PdfContentStreamProcessor.access$5500(int, List)>
		//    5    9:putfield        #32  <Field BaseColor GraphicsState.strokeColor>
		//    6   12:return          
		}

		private SetGrayStroke()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private class SetLineCap
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			int i = ((PdfNumber)arraylist.get(0)).intValue();
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #30  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #32  <Class PdfNumber>
		//    4    8:invokevirtual   #36  <Method int PdfNumber.intValue()>
		//    5   11:istore          4
			pdfcontentstreamprocessor.gs().setLineCapStyle(i);
		//    6   13:aload_1         
		//    7   14:invokevirtual   #40  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    8   17:iload           4
		//    9   19:invokevirtual   #46  <Method void GraphicsState.setLineCapStyle(int)>
		//   10   22:return          
		}

		final PdfContentStreamProcessor this$0;

		private SetLineCap()
		{
			this$0 = PdfContentStreamProcessor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field PdfContentStreamProcessor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private class SetLineDashPattern
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) (new LineDashPattern((PdfArray)arraylist.get(0), ((PdfNumber)arraylist.get(1)).floatValue())));
		//    0    0:new             #26  <Class LineDashPattern>
		//    1    3:dup             
		//    2    4:aload_3         
		//    3    5:iconst_0        
		//    4    6:invokevirtual   #32  <Method Object ArrayList.get(int)>
		//    5    9:checkcast       #34  <Class PdfArray>
		//    6   12:aload_3         
		//    7   13:iconst_1        
		//    8   14:invokevirtual   #32  <Method Object ArrayList.get(int)>
		//    9   17:checkcast       #36  <Class PdfNumber>
		//   10   20:invokevirtual   #40  <Method float PdfNumber.floatValue()>
		//   11   23:invokespecial   #43  <Method void LineDashPattern(PdfArray, float)>
		//   12   26:astore_2        
			pdfcontentstreamprocessor.gs().setLineDashPattern(((LineDashPattern) (pdfliteral)));
		//   13   27:aload_1         
		//   14   28:invokevirtual   #47  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//   15   31:aload_2         
		//   16   32:invokevirtual   #53  <Method void GraphicsState.setLineDashPattern(LineDashPattern)>
		//   17   35:return          
		}

		final PdfContentStreamProcessor this$0;

		private SetLineDashPattern()
		{
			this$0 = PdfContentStreamProcessor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field PdfContentStreamProcessor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private class SetLineJoin
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			int i = ((PdfNumber)arraylist.get(0)).intValue();
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #30  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #32  <Class PdfNumber>
		//    4    8:invokevirtual   #36  <Method int PdfNumber.intValue()>
		//    5   11:istore          4
			pdfcontentstreamprocessor.gs().setLineJoinStyle(i);
		//    6   13:aload_1         
		//    7   14:invokevirtual   #40  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    8   17:iload           4
		//    9   19:invokevirtual   #46  <Method void GraphicsState.setLineJoinStyle(int)>
		//   10   22:return          
		}

		final PdfContentStreamProcessor this$0;

		private SetLineJoin()
		{
			this$0 = PdfContentStreamProcessor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field PdfContentStreamProcessor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private static class SetLineWidth
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			float f = ((PdfNumber)arraylist.get(0)).floatValue();
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #26  <Class PdfNumber>
		//    4    8:invokevirtual   #30  <Method float PdfNumber.floatValue()>
		//    5   11:fstore          4
			pdfcontentstreamprocessor.gs().setLineWidth(f);
		//    6   13:aload_1         
		//    7   14:invokevirtual   #34  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    8   17:fload           4
		//    9   19:invokevirtual   #40  <Method void GraphicsState.setLineWidth(float)>
		//   10   22:return          
		}

		private SetLineWidth()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private class SetMiterLimit
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			float f = ((PdfNumber)arraylist.get(0)).floatValue();
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #30  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #32  <Class PdfNumber>
		//    4    8:invokevirtual   #36  <Method float PdfNumber.floatValue()>
		//    5   11:fstore          4
			pdfcontentstreamprocessor.gs().setMiterLimit(f);
		//    6   13:aload_1         
		//    7   14:invokevirtual   #40  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    8   17:fload           4
		//    9   19:invokevirtual   #46  <Method void GraphicsState.setMiterLimit(float)>
		//   10   22:return          
		}

		final PdfContentStreamProcessor this$0;

		private SetMiterLimit()
		{
			this$0 = PdfContentStreamProcessor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field PdfContentStreamProcessor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private static class SetRGBFill
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().fillColor = PdfContentStreamProcessor.getColor(3, ((List) (arraylist)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:iconst_3        
		//    3    5:aload_3         
		//    4    6:invokestatic    #26  <Method BaseColor PdfContentStreamProcessor.access$5500(int, List)>
		//    5    9:putfield        #32  <Field BaseColor GraphicsState.fillColor>
		//    6   12:return          
		}

		private SetRGBFill()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetRGBStroke
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.gs().strokeColor = PdfContentStreamProcessor.getColor(3, ((List) (arraylist)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    2    4:iconst_3        
		//    3    5:aload_3         
		//    4    6:invokestatic    #26  <Method BaseColor PdfContentStreamProcessor.access$5500(int, List)>
		//    5    9:putfield        #32  <Field BaseColor GraphicsState.strokeColor>
		//    6   12:return          
		}

		private SetRGBStroke()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetTextCharacterSpacing
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(0)));
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #26  <Class PdfNumber>
		//    4    8:astore_2        
			pdfcontentstreamprocessor.gs().characterSpacing = ((PdfNumber) (pdfliteral)).floatValue();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #30  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #34  <Method float PdfNumber.floatValue()>
		//    9   17:putfield        #40  <Field float GraphicsState.characterSpacing>
		//   10   20:return          
		}

		private SetTextCharacterSpacing()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetTextFont
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
			pdfliteral = ((PdfLiteral) (pdfcontentstreamprocessor.resources.getAsDict(PdfName.FONT).get(((PdfName) (pdfliteral)))));
		//   11   22:aload_1         
		//   12   23:invokestatic    #36  <Method PdfContentStreamProcessor$ResourceDictionary PdfContentStreamProcessor.access$5100(PdfContentStreamProcessor)>
		//   13   26:getstatic       #40  <Field PdfName PdfName.FONT>
		//   14   29:invokevirtual   #46  <Method PdfDictionary PdfContentStreamProcessor$ResourceDictionary.getAsDict(PdfName)>
		//   15   32:aload_2         
		//   16   33:invokevirtual   #51  <Method PdfObject PdfDictionary.get(PdfName)>
		//   17   36:astore_2        
			if(pdfliteral instanceof PdfDictionary)
		//*  18   37:aload_2         
		//*  19   38:instanceof      #48  <Class PdfDictionary>
		//*  20   41:ifeq            71
				pdfliteral = ((PdfLiteral) (pdfcontentstreamprocessor.getFont((PdfDictionary)pdfliteral)));
		//   21   44:aload_1         
		//   22   45:aload_2         
		//   23   46:checkcast       #48  <Class PdfDictionary>
		//   24   49:invokestatic    #55  <Method CMapAwareDocumentFont PdfContentStreamProcessor.access$5200(PdfContentStreamProcessor, PdfDictionary)>
		//   25   52:astore_2        
			else
		//*  26   53:aload_1         
		//*  27   54:invokevirtual   #59  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//*  28   57:aload_2         
		//*  29   58:putfield        #65  <Field CMapAwareDocumentFont GraphicsState.font>
		//*  30   61:aload_1         
		//*  31   62:invokevirtual   #59  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//*  32   65:fload           4
		//*  33   67:putfield        #69  <Field float GraphicsState.fontSize>
		//*  34   70:return          
				pdfliteral = ((PdfLiteral) (pdfcontentstreamprocessor.getFont((PRIndirectReference)pdfliteral)));
		//   35   71:aload_1         
		//   36   72:aload_2         
		//   37   73:checkcast       #71  <Class PRIndirectReference>
		//   38   76:invokestatic    #75  <Method CMapAwareDocumentFont PdfContentStreamProcessor.access$5300(PdfContentStreamProcessor, PRIndirectReference)>
		//   39   79:astore_2        
			pdfcontentstreamprocessor.gs().font = ((CMapAwareDocumentFont) (pdfliteral));
			pdfcontentstreamprocessor.gs().fontSize = f;
		//*  40   80:goto            53
		}

		private SetTextFont()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetTextHorizontalScaling
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(0)));
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #26  <Class PdfNumber>
		//    4    8:astore_2        
			pdfcontentstreamprocessor.gs().horizontalScaling = ((PdfNumber) (pdfliteral)).floatValue() / 100F;
		//    5    9:aload_1         
		//    6   10:invokevirtual   #30  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #34  <Method float PdfNumber.floatValue()>
		//    9   17:ldc1            #35  <Float 100F>
		//   10   19:fdiv            
		//   11   20:putfield        #41  <Field float GraphicsState.horizontalScaling>
		//   12   23:return          
		}

		private SetTextHorizontalScaling()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetTextLeading
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(0)));
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #26  <Class PdfNumber>
		//    4    8:astore_2        
			pdfcontentstreamprocessor.gs().leading = ((PdfNumber) (pdfliteral)).floatValue();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #30  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #34  <Method float PdfNumber.floatValue()>
		//    9   17:putfield        #40  <Field float GraphicsState.leading>
		//   10   20:return          
		}

		private SetTextLeading()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetTextRenderMode
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(0)));
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #26  <Class PdfNumber>
		//    4    8:astore_2        
			pdfcontentstreamprocessor.gs().renderMode = ((PdfNumber) (pdfliteral)).intValue();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #30  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #34  <Method int PdfNumber.intValue()>
		//    9   17:putfield        #40  <Field int GraphicsState.renderMode>
		//   10   20:return          
		}

		private SetTextRenderMode()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetTextRise
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(0)));
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #26  <Class PdfNumber>
		//    4    8:astore_2        
			pdfcontentstreamprocessor.gs().rise = ((PdfNumber) (pdfliteral)).floatValue();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #30  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #34  <Method float PdfNumber.floatValue()>
		//    9   17:putfield        #40  <Field float GraphicsState.rise>
		//   10   20:return          
		}

		private SetTextRise()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SetTextWordSpacing
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) ((PdfNumber)arraylist.get(0)));
		//    0    0:aload_3         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #26  <Class PdfNumber>
		//    4    8:astore_2        
			pdfcontentstreamprocessor.gs().wordSpacing = ((PdfNumber) (pdfliteral)).floatValue();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #30  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #34  <Method float PdfNumber.floatValue()>
		//    9   17:putfield        #40  <Field float GraphicsState.wordSpacing>
		//   10   20:return          
		}

		private SetTextWordSpacing()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ShowText
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.displayPdfString((PdfString)arraylist.get(0));
		//    0    0:aload_1         
		//    1    1:aload_3         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #24  <Method Object ArrayList.get(int)>
		//    4    6:checkcast       #26  <Class PdfString>
		//    5    9:invokestatic    #30  <Method void PdfContentStreamProcessor.access$4700(PdfContentStreamProcessor, PdfString)>
		//    6   12:return          
		}

		private ShowText()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ShowTextArray
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
					pdfcontentstreamprocessor.displayPdfString((PdfString)arraylist);
		//   16   38:aload_1         
		//   17   39:aload_3         
		//   18   40:checkcast       #44  <Class PdfString>
		//   19   43:invokestatic    #48  <Method void PdfContentStreamProcessor.access$4700(PdfContentStreamProcessor, PdfString)>
				else
		//*  20   46:goto            12
					pdfcontentstreamprocessor.applyTextAdjust(((PdfNumber)arraylist).floatValue());
		//   21   49:aload_1         
		//   22   50:aload_3         
		//   23   51:checkcast       #50  <Class PdfNumber>
		//   24   54:invokevirtual   #54  <Method float PdfNumber.floatValue()>
		//   25   57:invokestatic    #58  <Method void PdfContentStreamProcessor.access$4800(PdfContentStreamProcessor, float)>
			}

		//*  26   60:goto            12
		//   27   63:return          
		}

		private ShowTextArray()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class TextMoveNextLine
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfliteral = ((PdfLiteral) (new ArrayList(2)));
		//    0    0:new             #23  <Class ArrayList>
		//    1    3:dup             
		//    2    4:iconst_2        
		//    3    5:invokespecial   #26  <Method void ArrayList(int)>
		//    4    8:astore_2        
			((ArrayList) (pdfliteral)).add(0, ((Object) (new PdfNumber(0))));
		//    5    9:aload_2         
		//    6   10:iconst_0        
		//    7   11:new             #28  <Class PdfNumber>
		//    8   14:dup             
		//    9   15:iconst_0        
		//   10   16:invokespecial   #29  <Method void PdfNumber(int)>
		//   11   19:invokevirtual   #33  <Method void ArrayList.add(int, Object)>
			((ArrayList) (pdfliteral)).add(1, ((Object) (new PdfNumber(-pdfcontentstreamprocessor.gs().leading))));
		//   12   22:aload_2         
		//   13   23:iconst_1        
		//   14   24:new             #28  <Class PdfNumber>
		//   15   27:dup             
		//   16   28:aload_1         
		//   17   29:invokevirtual   #37  <Method GraphicsState PdfContentStreamProcessor.gs()>
		//   18   32:getfield        #43  <Field float GraphicsState.leading>
		//   19   35:fneg            
		//   20   36:invokespecial   #46  <Method void PdfNumber(float)>
		//   21   39:invokevirtual   #33  <Method void ArrayList.add(int, Object)>
			moveStartNextLine.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (pdfliteral)));
		//   22   42:aload_0         
		//   23   43:getfield        #18  <Field PdfContentStreamProcessor$TextMoveStartNextLine moveStartNextLine>
		//   24   46:aload_1         
		//   25   47:aconst_null     
		//   26   48:aload_2         
		//   27   49:invokevirtual   #50  <Method void PdfContentStreamProcessor$TextMoveStartNextLine.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
		//   28   52:return          
		}

		private final TextMoveStartNextLine moveStartNextLine;

		public TextMoveNextLine(TextMoveStartNextLine textmovestartnextline)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			moveStartNextLine = textmovestartnextline;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field PdfContentStreamProcessor$TextMoveStartNextLine moveStartNextLine>
		//    5    9:return          
		}
	}

	private static class TextMoveStartNextLine
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.textMatrix = (new Matrix(((PdfNumber)arraylist.get(0)).floatValue(), ((PdfNumber)arraylist.get(1)).floatValue())).multiply(pdfcontentstreamprocessor.textLineMatrix);
		//    0    0:aload_1         
		//    1    1:new             #20  <Class Matrix>
		//    2    4:dup             
		//    3    5:aload_3         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//    6   10:checkcast       #28  <Class PdfNumber>
		//    7   13:invokevirtual   #32  <Method float PdfNumber.floatValue()>
		//    8   16:aload_3         
		//    9   17:iconst_1        
		//   10   18:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//   11   21:checkcast       #28  <Class PdfNumber>
		//   12   24:invokevirtual   #32  <Method float PdfNumber.floatValue()>
		//   13   27:invokespecial   #35  <Method void Matrix(float, float)>
		//   14   30:aload_1         
		//   15   31:invokestatic    #39  <Method Matrix PdfContentStreamProcessor.access$4900(PdfContentStreamProcessor)>
		//   16   34:invokevirtual   #43  <Method Matrix Matrix.multiply(Matrix)>
		//   17   37:invokestatic    #47  <Method Matrix PdfContentStreamProcessor.access$5002(PdfContentStreamProcessor, Matrix)>
		//   18   40:pop             
			pdfcontentstreamprocessor.textLineMatrix = pdfcontentstreamprocessor.textMatrix;
		//   19   41:aload_1         
		//   20   42:aload_1         
		//   21   43:invokestatic    #50  <Method Matrix PdfContentStreamProcessor.access$5000(PdfContentStreamProcessor)>
		//   22   46:invokestatic    #53  <Method Matrix PdfContentStreamProcessor.access$4902(PdfContentStreamProcessor, Matrix)>
		//   23   49:pop             
		//   24   50:return          
		}

		private TextMoveStartNextLine()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class TextMoveStartNextLineWithLeading
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			float f = ((PdfNumber)arraylist.get(1)).floatValue();
		//    0    0:aload_3         
		//    1    1:iconst_1        
		//    2    2:invokevirtual   #31  <Method Object ArrayList.get(int)>
		//    3    5:checkcast       #33  <Class PdfNumber>
		//    4    8:invokevirtual   #37  <Method float PdfNumber.floatValue()>
		//    5   11:fstore          4
			pdfliteral = ((PdfLiteral) (new ArrayList(1)));
		//    6   13:new             #27  <Class ArrayList>
		//    7   16:dup             
		//    8   17:iconst_1        
		//    9   18:invokespecial   #40  <Method void ArrayList(int)>
		//   10   21:astore_2        
			((ArrayList) (pdfliteral)).add(0, ((Object) (new PdfNumber(-f))));
		//   11   22:aload_2         
		//   12   23:iconst_0        
		//   13   24:new             #33  <Class PdfNumber>
		//   14   27:dup             
		//   15   28:fload           4
		//   16   30:fneg            
		//   17   31:invokespecial   #43  <Method void PdfNumber(float)>
		//   18   34:invokevirtual   #47  <Method void ArrayList.add(int, Object)>
			setTextLeading.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), ((ArrayList) (pdfliteral)));
		//   19   37:aload_0         
		//   20   38:getfield        #22  <Field PdfContentStreamProcessor$SetTextLeading setTextLeading>
		//   21   41:aload_1         
		//   22   42:aconst_null     
		//   23   43:aload_2         
		//   24   44:invokevirtual   #51  <Method void PdfContentStreamProcessor$SetTextLeading.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
			moveStartNextLine.invoke(pdfcontentstreamprocessor, ((PdfLiteral) (null)), arraylist);
		//   25   47:aload_0         
		//   26   48:getfield        #20  <Field PdfContentStreamProcessor$TextMoveStartNextLine moveStartNextLine>
		//   27   51:aload_1         
		//   28   52:aconst_null     
		//   29   53:aload_3         
		//   30   54:invokevirtual   #54  <Method void PdfContentStreamProcessor$TextMoveStartNextLine.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
		//   31   57:return          
		}

		private final TextMoveStartNextLine moveStartNextLine;
		private final SetTextLeading setTextLeading;

		public TextMoveStartNextLineWithLeading(TextMoveStartNextLine textmovestartnextline, SetTextLeading settextleading)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			moveStartNextLine = textmovestartnextline;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field PdfContentStreamProcessor$TextMoveStartNextLine moveStartNextLine>
			setTextLeading = settextleading;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field PdfContentStreamProcessor$SetTextLeading setTextLeading>
		//    8   14:return          
		}
	}

	private static class TextSetTextMatrix
		implements ContentOperator
	{

		public void invoke(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfLiteral pdfliteral, ArrayList arraylist)
		{
			pdfcontentstreamprocessor.textLineMatrix = new Matrix(((PdfNumber)arraylist.get(0)).floatValue(), ((PdfNumber)arraylist.get(1)).floatValue(), ((PdfNumber)arraylist.get(2)).floatValue(), ((PdfNumber)arraylist.get(3)).floatValue(), ((PdfNumber)arraylist.get(4)).floatValue(), ((PdfNumber)arraylist.get(5)).floatValue());
		//    0    0:aload_1         
		//    1    1:new             #20  <Class Matrix>
		//    2    4:dup             
		//    3    5:aload_3         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//    6   10:checkcast       #28  <Class PdfNumber>
		//    7   13:invokevirtual   #32  <Method float PdfNumber.floatValue()>
		//    8   16:aload_3         
		//    9   17:iconst_1        
		//   10   18:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//   11   21:checkcast       #28  <Class PdfNumber>
		//   12   24:invokevirtual   #32  <Method float PdfNumber.floatValue()>
		//   13   27:aload_3         
		//   14   28:iconst_2        
		//   15   29:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//   16   32:checkcast       #28  <Class PdfNumber>
		//   17   35:invokevirtual   #32  <Method float PdfNumber.floatValue()>
		//   18   38:aload_3         
		//   19   39:iconst_3        
		//   20   40:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//   21   43:checkcast       #28  <Class PdfNumber>
		//   22   46:invokevirtual   #32  <Method float PdfNumber.floatValue()>
		//   23   49:aload_3         
		//   24   50:iconst_4        
		//   25   51:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//   26   54:checkcast       #28  <Class PdfNumber>
		//   27   57:invokevirtual   #32  <Method float PdfNumber.floatValue()>
		//   28   60:aload_3         
		//   29   61:iconst_5        
		//   30   62:invokevirtual   #26  <Method Object ArrayList.get(int)>
		//   31   65:checkcast       #28  <Class PdfNumber>
		//   32   68:invokevirtual   #32  <Method float PdfNumber.floatValue()>
		//   33   71:invokespecial   #35  <Method void Matrix(float, float, float, float, float, float)>
		//   34   74:invokestatic    #39  <Method Matrix PdfContentStreamProcessor.access$4902(PdfContentStreamProcessor, Matrix)>
		//   35   77:pop             
			pdfcontentstreamprocessor.textMatrix = pdfcontentstreamprocessor.textLineMatrix;
		//   36   78:aload_1         
		//   37   79:aload_1         
		//   38   80:invokestatic    #43  <Method Matrix PdfContentStreamProcessor.access$4900(PdfContentStreamProcessor)>
		//   39   83:invokestatic    #46  <Method Matrix PdfContentStreamProcessor.access$5002(PdfContentStreamProcessor, Matrix)>
		//   40   86:pop             
		//   41   87:return          
		}

		private TextSetTextMatrix()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	public PdfContentStreamProcessor(RenderListener renderlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #201 <Class Stack>
	//    4    8:dup             
	//    5    9:invokespecial   #202 <Method void Stack()>
	//    6   12:putfield        #204 <Field Stack gsStack>
	//    7   15:aload_0         
	//    8   16:new             #206 <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #207 <Method void HashMap()>
	//   11   23:putfield        #209 <Field Map cachedFonts>
	//   12   26:aload_0         
	//   13   27:new             #201 <Class Stack>
	//   14   30:dup             
	//   15   31:invokespecial   #202 <Method void Stack()>
	//   16   34:putfield        #211 <Field Stack markedContentStack>
		renderListener = renderlistener;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #213 <Field RenderListener renderListener>
	//   20   42:aload_0         
	//   21   43:new             #206 <Class HashMap>
	//   22   46:dup             
	//   23   47:invokespecial   #207 <Method void HashMap()>
	//   24   50:putfield        #215 <Field Map operators>
		populateOperators();
	//   25   53:aload_0         
	//   26   54:invokespecial   #218 <Method void populateOperators()>
	//   27   57:aload_0         
	//   28   58:new             #206 <Class HashMap>
	//   29   61:dup             
	//   30   62:invokespecial   #207 <Method void HashMap()>
	//   31   65:putfield        #220 <Field Map xobjectDoHandlers>
		populateXObjectDoHandlers();
	//   32   68:aload_0         
	//   33   69:invokespecial   #223 <Method void populateXObjectDoHandlers()>
		reset();
	//   34   72:aload_0         
	//   35   73:invokevirtual   #226 <Method void reset()>
	//   36   76:return          
	}

	private void applyTextAdjust(float f)
	{
		textMatrix = (new Matrix((-f / 1000F) * gs().fontSize * gs().horizontalScaling, 0.0F)).multiply(textMatrix);
	//    0    0:aload_0         
	//    1    1:new             #325 <Class Matrix>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:fneg            
	//    5    7:ldc2            #326 <Float 1000F>
	//    6   10:fdiv            
	//    7   11:aload_0         
	//    8   12:invokevirtual   #330 <Method GraphicsState gs()>
	//    9   15:getfield        #336 <Field float GraphicsState.fontSize>
	//   10   18:fmul            
	//   11   19:aload_0         
	//   12   20:invokevirtual   #330 <Method GraphicsState gs()>
	//   13   23:getfield        #339 <Field float GraphicsState.horizontalScaling>
	//   14   26:fmul            
	//   15   27:fconst_0        
	//   16   28:invokespecial   #342 <Method void Matrix(float, float)>
	//   17   31:aload_0         
	//   18   32:getfield        #248 <Field Matrix textMatrix>
	//   19   35:invokevirtual   #346 <Method Matrix Matrix.multiply(Matrix)>
	//   20   38:putfield        #248 <Field Matrix textMatrix>
	//   21   41:return          
	}

	private void beginMarkedContent(PdfName pdfname, PdfDictionary pdfdictionary)
	{
		markedContentStack.push(((Object) (new MarkedContentInfo(pdfname, pdfdictionary))));
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field Stack markedContentStack>
	//    2    4:new             #348 <Class MarkedContentInfo>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #350 <Method void MarkedContentInfo(PdfName, PdfDictionary)>
	//    7   13:invokevirtual   #354 <Method Object Stack.push(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void beginText()
	{
		renderListener.beginTextBlock();
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field RenderListener renderListener>
	//    2    4:invokeinterface #359 <Method void RenderListener.beginTextBlock()>
	//    3    9:return          
	}

	private void clipPath(int i)
	{
		((ExtRenderListener)renderListener).clipPath(i);
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field RenderListener renderListener>
	//    2    4:checkcast       #361 <Class ExtRenderListener>
	//    3    7:iload_1         
	//    4    8:invokeinterface #362 <Method void ExtRenderListener.clipPath(int)>
	//    5   13:return          
	}

	private void displayPdfString(PdfString pdfstring)
	{
		pdfstring = ((PdfString) (new TextRenderInfo(pdfstring, gs(), textMatrix, ((Collection) (markedContentStack)))));
	//    0    0:new             #364 <Class TextRenderInfo>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #330 <Method GraphicsState gs()>
	//    5    9:aload_0         
	//    6   10:getfield        #248 <Field Matrix textMatrix>
	//    7   13:aload_0         
	//    8   14:getfield        #211 <Field Stack markedContentStack>
	//    9   17:invokespecial   #367 <Method void TextRenderInfo(PdfString, GraphicsState, Matrix, Collection)>
	//   10   20:astore_1        
		renderListener.renderText(((TextRenderInfo) (pdfstring)));
	//   11   21:aload_0         
	//   12   22:getfield        #213 <Field RenderListener renderListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #371 <Method void RenderListener.renderText(TextRenderInfo)>
		textMatrix = (new Matrix(((TextRenderInfo) (pdfstring)).getUnscaledWidth(), 0.0F)).multiply(textMatrix);
	//   15   31:aload_0         
	//   16   32:new             #325 <Class Matrix>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokevirtual   #375 <Method float TextRenderInfo.getUnscaledWidth()>
	//   20   40:fconst_0        
	//   21   41:invokespecial   #342 <Method void Matrix(float, float)>
	//   22   44:aload_0         
	//   23   45:getfield        #248 <Field Matrix textMatrix>
	//   24   48:invokevirtual   #346 <Method Matrix Matrix.multiply(Matrix)>
	//   25   51:putfield        #248 <Field Matrix textMatrix>
	//   26   54:return          
	}

	private void displayXObject(PdfName pdfname)
		throws IOException
	{
		PdfDictionary pdfdictionary = resources.getAsDict(PdfName.XOBJECT);
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field PdfContentStreamProcessor$ResourceDictionary resources>
	//    2    4:getstatic       #381 <Field PdfName PdfName.XOBJECT>
	//    3    7:invokevirtual   #385 <Method PdfDictionary PdfContentStreamProcessor$ResourceDictionary.getAsDict(PdfName)>
	//    4   10:astore          4
		PdfObject pdfobject = pdfdictionary.getDirectObject(pdfname);
	//    5   12:aload           4
	//    6   14:aload_1         
	//    7   15:invokevirtual   #391 <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//    8   18:astore_2        
		PdfStream pdfstream = (PdfStream)pdfobject;
	//    9   19:aload_2         
	//   10   20:checkcast       #393 <Class PdfStream>
	//   11   23:astore          5
		Object obj = ((Object) (pdfstream.getAsName(PdfName.SUBTYPE)));
	//   12   25:aload           5
	//   13   27:getstatic       #396 <Field PdfName PdfName.SUBTYPE>
	//   14   30:invokevirtual   #400 <Method PdfName PdfStream.getAsName(PdfName)>
	//   15   33:astore_3        
		if(pdfobject.isStream())
	//*  16   34:aload_2         
	//*  17   35:invokevirtual   #406 <Method boolean PdfObject.isStream()>
	//*  18   38:ifeq            93
		{
			obj = ((Object) ((XObjectDoHandler)xobjectDoHandlers.get(obj)));
	//   19   41:aload_0         
	//   20   42:getfield        #220 <Field Map xobjectDoHandlers>
	//   21   45:aload_3         
	//   22   46:invokeinterface #411 <Method Object Map.get(Object)>
	//   23   51:checkcast       #413 <Class XObjectDoHandler>
	//   24   54:astore_3        
			XObjectDoHandler xobjectdohandler = ((XObjectDoHandler) (obj));
	//   25   55:aload_3         
	//   26   56:astore_2        
			if(obj == null)
	//*  27   57:aload_3         
	//*  28   58:ifnonnull       77
				xobjectdohandler = (XObjectDoHandler)xobjectDoHandlers.get(((Object) (PdfName.DEFAULT)));
	//   29   61:aload_0         
	//   30   62:getfield        #220 <Field Map xobjectDoHandlers>
	//   31   65:getstatic       #416 <Field PdfName PdfName.DEFAULT>
	//   32   68:invokeinterface #411 <Method Object Map.get(Object)>
	//   33   73:checkcast       #413 <Class XObjectDoHandler>
	//   34   76:astore_2        
			xobjectdohandler.handleXObject(this, pdfstream, pdfdictionary.getAsIndirectObject(pdfname));
	//   35   77:aload_2         
	//   36   78:aload_0         
	//   37   79:aload           5
	//   38   81:aload           4
	//   39   83:aload_1         
	//   40   84:invokevirtual   #420 <Method PdfIndirectReference PdfDictionary.getAsIndirectObject(PdfName)>
	//   41   87:invokeinterface #424 <Method void XObjectDoHandler.handleXObject(PdfContentStreamProcessor, PdfStream, PdfIndirectReference)>
			return;
	//   42   92:return          
		} else
		{
			throw new IllegalStateException(MessageLocalization.getComposedMessage("XObject.1.is.not.a.stream", new Object[] {
				pdfname
			}));
	//   43   93:new             #426 <Class IllegalStateException>
	//   44   96:dup             
	//   45   97:ldc2            #428 <String "XObject.1.is.not.a.stream">
	//   46  100:iconst_1        
	//   47  101:anewarray       Object[]
	//   48  104:dup             
	//   49  105:iconst_0        
	//   50  106:aload_1         
	//   51  107:aastore         
	//   52  108:invokestatic    #434 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   53  111:invokespecial   #437 <Method void IllegalStateException(String)>
	//   54  114:athrow          
		}
	}

	private void endMarkedContent()
	{
		markedContentStack.pop();
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field Stack markedContentStack>
	//    2    4:invokevirtual   #441 <Method Object Stack.pop()>
	//    3    7:pop             
	//    4    8:return          
	}

	private void endText()
	{
		renderListener.endTextBlock();
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field RenderListener renderListener>
	//    2    4:invokeinterface #444 <Method void RenderListener.endTextBlock()>
	//    3    9:return          
	}

	private static BaseColor getColor(int i, List list)
	{
		float af[] = new float[i];
	//    0    0:iload_0         
	//    1    1:newarray        float[]
	//    2    3:astore_3        
		int j = 0;
	//    3    4:iconst_0        
	//    4    5:istore_2        
		while(j < i) 
	//*   5    6:iload_2         
	//*   6    7:iload_0         
	//*   7    8:icmpge          61
		{
			af[j] = ((PdfNumber)list.get(j)).floatValue();
	//    8   11:aload_3         
	//    9   12:iload_2         
	//   10   13:aload_1         
	//   11   14:iload_2         
	//   12   15:invokeinterface #449 <Method Object List.get(int)>
	//   13   20:checkcast       #451 <Class PdfNumber>
	//   14   23:invokevirtual   #454 <Method float PdfNumber.floatValue()>
	//   15   26:fastore         
			if(af[j] > 1.0F)
	//*  16   27:aload_3         
	//*  17   28:iload_2         
	//*  18   29:faload          
	//*  19   30:fconst_1        
	//*  20   31:fcmpl           
	//*  21   32:ifle            46
				af[j] = 1.0F;
	//   22   35:aload_3         
	//   23   36:iload_2         
	//   24   37:fconst_1        
	//   25   38:fastore         
			else
	//*  26   39:iload_2         
	//*  27   40:iconst_1        
	//*  28   41:iadd            
	//*  29   42:istore_2        
	//*  30   43:goto            6
			if(af[j] < 0.0F)
	//*  31   46:aload_3         
	//*  32   47:iload_2         
	//*  33   48:faload          
	//*  34   49:fconst_0        
	//*  35   50:fcmpg           
	//*  36   51:ifge            39
				af[j] = 0.0F;
	//   37   54:aload_3         
	//   38   55:iload_2         
	//   39   56:fconst_0        
	//   40   57:fastore         
			j++;
		}
	//*  41   58:goto            39
		switch(i)
	//*  42   61:iload_0         
		{
	//*  43   62:tableswitch     1 4: default 92
	//	               1 94
	//	               2 92
	//	               3 105
	//	               4 122
		case 2: // '\002'
		default:
			return null;
	//   44   92:aconst_null     
	//   45   93:areturn         

		case 1: // '\001'
			return ((BaseColor) (new GrayColor(af[0])));
	//   46   94:new             #456 <Class GrayColor>
	//   47   97:dup             
	//   48   98:aload_3         
	//   49   99:iconst_0        
	//   50  100:faload          
	//   51  101:invokespecial   #458 <Method void GrayColor(float)>
	//   52  104:areturn         

		case 3: // '\003'
			return new BaseColor(af[0], af[1], af[2]);
	//   53  105:new             #460 <Class BaseColor>
	//   54  108:dup             
	//   55  109:aload_3         
	//   56  110:iconst_0        
	//   57  111:faload          
	//   58  112:aload_3         
	//   59  113:iconst_1        
	//   60  114:faload          
	//   61  115:aload_3         
	//   62  116:iconst_2        
	//   63  117:faload          
	//   64  118:invokespecial   #463 <Method void BaseColor(float, float, float)>
	//   65  121:areturn         

		case 4: // '\004'
			return ((BaseColor) (new CMYKColor(af[0], af[1], af[2], af[3])));
	//   66  122:new             #465 <Class CMYKColor>
	//   67  125:dup             
	//   68  126:aload_3         
	//   69  127:iconst_0        
	//   70  128:faload          
	//   71  129:aload_3         
	//   72  130:iconst_1        
	//   73  131:faload          
	//   74  132:aload_3         
	//   75  133:iconst_2        
	//   76  134:faload          
	//   77  135:aload_3         
	//   78  136:iconst_3        
	//   79  137:faload          
	//   80  138:invokespecial   #468 <Method void CMYKColor(float, float, float, float)>
	//   81  141:areturn         
		}
	}

	private static BaseColor getColor(PdfName pdfname, List list)
	{
		if(PdfName.DEVICEGRAY.equals(((Object) (pdfname))))
	//*   0    0:getstatic       #473 <Field PdfName PdfName.DEVICEGRAY>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #477 <Method boolean PdfName.equals(Object)>
	//*   3    7:ifeq            16
			return getColor(1, list);
	//    4   10:iconst_1        
	//    5   11:aload_1         
	//    6   12:invokestatic    #271 <Method BaseColor getColor(int, List)>
	//    7   15:areturn         
		if(PdfName.DEVICERGB.equals(((Object) (pdfname))))
	//*   8   16:getstatic       #480 <Field PdfName PdfName.DEVICERGB>
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #477 <Method boolean PdfName.equals(Object)>
	//*  11   23:ifeq            32
			return getColor(3, list);
	//   12   26:iconst_3        
	//   13   27:aload_1         
	//   14   28:invokestatic    #271 <Method BaseColor getColor(int, List)>
	//   15   31:areturn         
		if(PdfName.DEVICECMYK.equals(((Object) (pdfname))))
	//*  16   32:getstatic       #483 <Field PdfName PdfName.DEVICECMYK>
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #477 <Method boolean PdfName.equals(Object)>
	//*  19   39:ifeq            48
			return getColor(4, list);
	//   20   42:iconst_4        
	//   21   43:aload_1         
	//   22   44:invokestatic    #271 <Method BaseColor getColor(int, List)>
	//   23   47:areturn         
		else
			return null;
	//   24   48:aconst_null     
	//   25   49:areturn         
	}

	private CMapAwareDocumentFont getFont(PRIndirectReference prindirectreference)
	{
		Integer integer = Integer.valueOf(prindirectreference.getNumber());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #490 <Method int PRIndirectReference.getNumber()>
	//    2    4:invokestatic    #496 <Method Integer Integer.valueOf(int)>
	//    3    7:astore          4
		CMapAwareDocumentFont cmapawaredocumentfont1 = (CMapAwareDocumentFont)cachedFonts.get(((Object) (integer)));
	//    4    9:aload_0         
	//    5   10:getfield        #209 <Field Map cachedFonts>
	//    6   13:aload           4
	//    7   15:invokeinterface #411 <Method Object Map.get(Object)>
	//    8   20:checkcast       #498 <Class CMapAwareDocumentFont>
	//    9   23:astore_3        
		CMapAwareDocumentFont cmapawaredocumentfont = cmapawaredocumentfont1;
	//   10   24:aload_3         
	//   11   25:astore_2        
		if(cmapawaredocumentfont1 == null)
	//*  12   26:aload_3         
	//*  13   27:ifnonnull       52
		{
			cmapawaredocumentfont = new CMapAwareDocumentFont(prindirectreference);
	//   14   30:new             #498 <Class CMapAwareDocumentFont>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokespecial   #501 <Method void CMapAwareDocumentFont(PRIndirectReference)>
	//   18   38:astore_2        
			cachedFonts.put(((Object) (integer)), ((Object) (cmapawaredocumentfont)));
	//   19   39:aload_0         
	//   20   40:getfield        #209 <Field Map cachedFonts>
	//   21   43:aload           4
	//   22   45:aload_2         
	//   23   46:invokeinterface #505 <Method Object Map.put(Object, Object)>
	//   24   51:pop             
		}
		return cmapawaredocumentfont;
	//   25   52:aload_2         
	//   26   53:areturn         
	}

	private CMapAwareDocumentFont getFont(PdfDictionary pdfdictionary)
	{
		return new CMapAwareDocumentFont(pdfdictionary);
	//    0    0:new             #498 <Class CMapAwareDocumentFont>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #508 <Method void CMapAwareDocumentFont(PdfDictionary)>
	//    4    8:areturn         
	}

	private void invokeOperator(PdfLiteral pdfliteral, ArrayList arraylist)
		throws Exception
	{
		ContentOperator contentoperator1 = (ContentOperator)operators.get(((Object) (pdfliteral.toString())));
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field Map operators>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #518 <Method String PdfLiteral.toString()>
	//    4    8:invokeinterface #411 <Method Object Map.get(Object)>
	//    5   13:checkcast       #520 <Class ContentOperator>
	//    6   16:astore          4
		ContentOperator contentoperator = contentoperator1;
	//    7   18:aload           4
	//    8   20:astore_3        
		if(contentoperator1 == null)
	//*   9   21:aload           4
	//*  10   23:ifnonnull       41
			contentoperator = (ContentOperator)operators.get("DefaultOperator");
	//   11   26:aload_0         
	//   12   27:getfield        #215 <Field Map operators>
	//   13   30:ldc1            #175 <String "DefaultOperator">
	//   14   32:invokeinterface #411 <Method Object Map.get(Object)>
	//   15   37:checkcast       #520 <Class ContentOperator>
	//   16   40:astore_3        
		contentoperator.invoke(this, pdfliteral, arraylist);
	//   17   41:aload_3         
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokeinterface #524 <Method void ContentOperator.invoke(PdfContentStreamProcessor, PdfLiteral, ArrayList)>
	//   22   50:return          
	}

	private void modifyPath(int i, List list)
	{
		list = ((List) (new PathConstructionRenderInfo(i, list, gs().getCtm())));
	//    0    0:new             #527 <Class PathConstructionRenderInfo>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #330 <Method GraphicsState gs()>
	//    6   10:invokevirtual   #531 <Method Matrix GraphicsState.getCtm()>
	//    7   13:invokespecial   #534 <Method void PathConstructionRenderInfo(int, List, Matrix)>
	//    8   16:astore_2        
		((ExtRenderListener)renderListener).modifyPath(((PathConstructionRenderInfo) (list)));
	//    9   17:aload_0         
	//   10   18:getfield        #213 <Field RenderListener renderListener>
	//   11   21:checkcast       #361 <Class ExtRenderListener>
	//   12   24:aload_2         
	//   13   25:invokeinterface #537 <Method void ExtRenderListener.modifyPath(PathConstructionRenderInfo)>
	//   14   30:return          
	}

	private void paintPath(int i, int j, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            11
			modifyPath(6, ((List) (null)));
	//    2    4:aload_0         
	//    3    5:bipush          6
	//    4    7:aconst_null     
	//    5    8:invokespecial   #309 <Method void modifyPath(int, List)>
		PathPaintingRenderInfo pathpaintingrenderinfo = new PathPaintingRenderInfo(i, j, gs());
	//    6   11:new             #540 <Class PathPaintingRenderInfo>
	//    7   14:dup             
	//    8   15:iload_1         
	//    9   16:iload_2         
	//   10   17:aload_0         
	//   11   18:invokevirtual   #330 <Method GraphicsState gs()>
	//   12   21:invokespecial   #543 <Method void PathPaintingRenderInfo(int, int, GraphicsState)>
	//   13   24:astore          4
		((ExtRenderListener)renderListener).renderPath(pathpaintingrenderinfo);
	//   14   26:aload_0         
	//   15   27:getfield        #213 <Field RenderListener renderListener>
	//   16   30:checkcast       #361 <Class ExtRenderListener>
	//   17   33:aload           4
	//   18   35:invokeinterface #547 <Method Path ExtRenderListener.renderPath(PathPaintingRenderInfo)>
	//   19   40:pop             
	//   20   41:return          
	}

	private void populateOperators()
	{
		registerContentOperator("DefaultOperator", ((ContentOperator) (new IgnoreOperatorContentOperator())));
	//    0    0:aload_0         
	//    1    1:ldc1            #175 <String "DefaultOperator">
	//    2    3:new             #47  <Class PdfContentStreamProcessor$IgnoreOperatorContentOperator>
	//    3    6:dup             
	//    4    7:aconst_null     
	//    5    8:invokespecial   #550 <Method void PdfContentStreamProcessor$IgnoreOperatorContentOperator(PdfContentStreamProcessor$1)>
	//    6   11:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//    7   14:pop             
		registerContentOperator("q", ((ContentOperator) (new PushGraphicsState())));
	//    8   15:aload_0         
	//    9   16:ldc2            #556 <String "q">
	//   10   19:new             #80  <Class PdfContentStreamProcessor$PushGraphicsState>
	//   11   22:dup             
	//   12   23:aconst_null     
	//   13   24:invokespecial   #557 <Method void PdfContentStreamProcessor$PushGraphicsState(PdfContentStreamProcessor$1)>
	//   14   27:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   15   30:pop             
		registerContentOperator("Q", ((ContentOperator) (new PopGraphicsState())));
	//   16   31:aload_0         
	//   17   32:ldc2            #559 <String "Q">
	//   18   35:new             #74  <Class PdfContentStreamProcessor$PopGraphicsState>
	//   19   38:dup             
	//   20   39:aconst_null     
	//   21   40:invokespecial   #560 <Method void PdfContentStreamProcessor$PopGraphicsState(PdfContentStreamProcessor$1)>
	//   22   43:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   23   46:pop             
		registerContentOperator("g", ((ContentOperator) (new SetGrayFill())));
	//   24   47:aload_0         
	//   25   48:ldc2            #562 <String "g">
	//   26   51:new             #107 <Class PdfContentStreamProcessor$SetGrayFill>
	//   27   54:dup             
	//   28   55:aconst_null     
	//   29   56:invokespecial   #563 <Method void PdfContentStreamProcessor$SetGrayFill(PdfContentStreamProcessor$1)>
	//   30   59:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   31   62:pop             
		registerContentOperator("G", ((ContentOperator) (new SetGrayStroke())));
	//   32   63:aload_0         
	//   33   64:ldc2            #565 <String "G">
	//   34   67:new             #110 <Class PdfContentStreamProcessor$SetGrayStroke>
	//   35   70:dup             
	//   36   71:aconst_null     
	//   37   72:invokespecial   #566 <Method void PdfContentStreamProcessor$SetGrayStroke(PdfContentStreamProcessor$1)>
	//   38   75:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   39   78:pop             
		registerContentOperator("rg", ((ContentOperator) (new SetRGBFill())));
	//   40   79:aload_0         
	//   41   80:ldc2            #568 <String "rg">
	//   42   83:new             #128 <Class PdfContentStreamProcessor$SetRGBFill>
	//   43   86:dup             
	//   44   87:aconst_null     
	//   45   88:invokespecial   #569 <Method void PdfContentStreamProcessor$SetRGBFill(PdfContentStreamProcessor$1)>
	//   46   91:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   47   94:pop             
		registerContentOperator("RG", ((ContentOperator) (new SetRGBStroke())));
	//   48   95:aload_0         
	//   49   96:ldc2            #571 <String "RG">
	//   50   99:new             #131 <Class PdfContentStreamProcessor$SetRGBStroke>
	//   51  102:dup             
	//   52  103:aconst_null     
	//   53  104:invokespecial   #572 <Method void PdfContentStreamProcessor$SetRGBStroke(PdfContentStreamProcessor$1)>
	//   54  107:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   55  110:pop             
		registerContentOperator("k", ((ContentOperator) (new SetCMYKFill())));
	//   56  111:aload_0         
	//   57  112:ldc2            #574 <String "k">
	//   58  115:new             #89  <Class PdfContentStreamProcessor$SetCMYKFill>
	//   59  118:dup             
	//   60  119:aconst_null     
	//   61  120:invokespecial   #575 <Method void PdfContentStreamProcessor$SetCMYKFill(PdfContentStreamProcessor$1)>
	//   62  123:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   63  126:pop             
		registerContentOperator("K", ((ContentOperator) (new SetCMYKStroke())));
	//   64  127:aload_0         
	//   65  128:ldc2            #577 <String "K">
	//   66  131:new             #92  <Class PdfContentStreamProcessor$SetCMYKStroke>
	//   67  134:dup             
	//   68  135:aconst_null     
	//   69  136:invokespecial   #578 <Method void PdfContentStreamProcessor$SetCMYKStroke(PdfContentStreamProcessor$1)>
	//   70  139:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   71  142:pop             
		registerContentOperator("cs", ((ContentOperator) (new SetColorSpaceFill())));
	//   72  143:aload_0         
	//   73  144:ldc2            #580 <String "cs">
	//   74  147:new             #98  <Class PdfContentStreamProcessor$SetColorSpaceFill>
	//   75  150:dup             
	//   76  151:aconst_null     
	//   77  152:invokespecial   #581 <Method void PdfContentStreamProcessor$SetColorSpaceFill(PdfContentStreamProcessor$1)>
	//   78  155:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   79  158:pop             
		registerContentOperator("CS", ((ContentOperator) (new SetColorSpaceStroke())));
	//   80  159:aload_0         
	//   81  160:ldc2            #583 <String "CS">
	//   82  163:new             #101 <Class PdfContentStreamProcessor$SetColorSpaceStroke>
	//   83  166:dup             
	//   84  167:aconst_null     
	//   85  168:invokespecial   #584 <Method void PdfContentStreamProcessor$SetColorSpaceStroke(PdfContentStreamProcessor$1)>
	//   86  171:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   87  174:pop             
		registerContentOperator("sc", ((ContentOperator) (new SetColorFill())));
	//   88  175:aload_0         
	//   89  176:ldc2            #586 <String "sc">
	//   90  179:new             #95  <Class PdfContentStreamProcessor$SetColorFill>
	//   91  182:dup             
	//   92  183:aconst_null     
	//   93  184:invokespecial   #587 <Method void PdfContentStreamProcessor$SetColorFill(PdfContentStreamProcessor$1)>
	//   94  187:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//   95  190:pop             
		registerContentOperator("SC", ((ContentOperator) (new SetColorStroke())));
	//   96  191:aload_0         
	//   97  192:ldc2            #589 <String "SC">
	//   98  195:new             #104 <Class PdfContentStreamProcessor$SetColorStroke>
	//   99  198:dup             
	//  100  199:aconst_null     
	//  101  200:invokespecial   #590 <Method void PdfContentStreamProcessor$SetColorStroke(PdfContentStreamProcessor$1)>
	//  102  203:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  103  206:pop             
		registerContentOperator("scn", ((ContentOperator) (new SetColorFill())));
	//  104  207:aload_0         
	//  105  208:ldc2            #592 <String "scn">
	//  106  211:new             #95  <Class PdfContentStreamProcessor$SetColorFill>
	//  107  214:dup             
	//  108  215:aconst_null     
	//  109  216:invokespecial   #587 <Method void PdfContentStreamProcessor$SetColorFill(PdfContentStreamProcessor$1)>
	//  110  219:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  111  222:pop             
		registerContentOperator("SCN", ((ContentOperator) (new SetColorStroke())));
	//  112  223:aload_0         
	//  113  224:ldc2            #594 <String "SCN">
	//  114  227:new             #104 <Class PdfContentStreamProcessor$SetColorStroke>
	//  115  230:dup             
	//  116  231:aconst_null     
	//  117  232:invokespecial   #590 <Method void PdfContentStreamProcessor$SetColorStroke(PdfContentStreamProcessor$1)>
	//  118  235:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  119  238:pop             
		registerContentOperator("cm", ((ContentOperator) (new ModifyCurrentTransformationMatrix())));
	//  120  239:aload_0         
	//  121  240:ldc2            #596 <String "cm">
	//  122  243:new             #59  <Class PdfContentStreamProcessor$ModifyCurrentTransformationMatrix>
	//  123  246:dup             
	//  124  247:aconst_null     
	//  125  248:invokespecial   #597 <Method void PdfContentStreamProcessor$ModifyCurrentTransformationMatrix(PdfContentStreamProcessor$1)>
	//  126  251:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  127  254:pop             
		registerContentOperator("gs", ((ContentOperator) (new ProcessGraphicsStateResource())));
	//  128  255:aload_0         
	//  129  256:ldc2            #598 <String "gs">
	//  130  259:new             #77  <Class PdfContentStreamProcessor$ProcessGraphicsStateResource>
	//  131  262:dup             
	//  132  263:aconst_null     
	//  133  264:invokespecial   #599 <Method void PdfContentStreamProcessor$ProcessGraphicsStateResource(PdfContentStreamProcessor$1)>
	//  134  267:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  135  270:pop             
		SetTextCharacterSpacing settextcharacterspacing = new SetTextCharacterSpacing();
	//  136  271:new             #134 <Class PdfContentStreamProcessor$SetTextCharacterSpacing>
	//  137  274:dup             
	//  138  275:aconst_null     
	//  139  276:invokespecial   #600 <Method void PdfContentStreamProcessor$SetTextCharacterSpacing(PdfContentStreamProcessor$1)>
	//  140  279:astore_1        
		registerContentOperator("Tc", ((ContentOperator) (settextcharacterspacing)));
	//  141  280:aload_0         
	//  142  281:ldc2            #602 <String "Tc">
	//  143  284:aload_1         
	//  144  285:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  145  288:pop             
		SetTextWordSpacing settextwordspacing = new SetTextWordSpacing();
	//  146  289:new             #152 <Class PdfContentStreamProcessor$SetTextWordSpacing>
	//  147  292:dup             
	//  148  293:aconst_null     
	//  149  294:invokespecial   #603 <Method void PdfContentStreamProcessor$SetTextWordSpacing(PdfContentStreamProcessor$1)>
	//  150  297:astore_2        
		registerContentOperator("Tw", ((ContentOperator) (settextwordspacing)));
	//  151  298:aload_0         
	//  152  299:ldc2            #605 <String "Tw">
	//  153  302:aload_2         
	//  154  303:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  155  306:pop             
		registerContentOperator("Tz", ((ContentOperator) (new SetTextHorizontalScaling())));
	//  156  307:aload_0         
	//  157  308:ldc2            #607 <String "Tz">
	//  158  311:new             #140 <Class PdfContentStreamProcessor$SetTextHorizontalScaling>
	//  159  314:dup             
	//  160  315:aconst_null     
	//  161  316:invokespecial   #608 <Method void PdfContentStreamProcessor$SetTextHorizontalScaling(PdfContentStreamProcessor$1)>
	//  162  319:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  163  322:pop             
		Object obj = ((Object) (new SetTextLeading()));
	//  164  323:new             #143 <Class PdfContentStreamProcessor$SetTextLeading>
	//  165  326:dup             
	//  166  327:aconst_null     
	//  167  328:invokespecial   #609 <Method void PdfContentStreamProcessor$SetTextLeading(PdfContentStreamProcessor$1)>
	//  168  331:astore_3        
		registerContentOperator("TL", ((ContentOperator) (obj)));
	//  169  332:aload_0         
	//  170  333:ldc2            #611 <String "TL">
	//  171  336:aload_3         
	//  172  337:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  173  340:pop             
		registerContentOperator("Tf", ((ContentOperator) (new SetTextFont())));
	//  174  341:aload_0         
	//  175  342:ldc2            #613 <String "Tf">
	//  176  345:new             #137 <Class PdfContentStreamProcessor$SetTextFont>
	//  177  348:dup             
	//  178  349:aconst_null     
	//  179  350:invokespecial   #614 <Method void PdfContentStreamProcessor$SetTextFont(PdfContentStreamProcessor$1)>
	//  180  353:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  181  356:pop             
		registerContentOperator("Tr", ((ContentOperator) (new SetTextRenderMode())));
	//  182  357:aload_0         
	//  183  358:ldc2            #616 <String "Tr">
	//  184  361:new             #146 <Class PdfContentStreamProcessor$SetTextRenderMode>
	//  185  364:dup             
	//  186  365:aconst_null     
	//  187  366:invokespecial   #617 <Method void PdfContentStreamProcessor$SetTextRenderMode(PdfContentStreamProcessor$1)>
	//  188  369:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  189  372:pop             
		registerContentOperator("Ts", ((ContentOperator) (new SetTextRise())));
	//  190  373:aload_0         
	//  191  374:ldc2            #619 <String "Ts">
	//  192  377:new             #149 <Class PdfContentStreamProcessor$SetTextRise>
	//  193  380:dup             
	//  194  381:aconst_null     
	//  195  382:invokespecial   #620 <Method void PdfContentStreamProcessor$SetTextRise(PdfContentStreamProcessor$1)>
	//  196  385:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  197  388:pop             
		registerContentOperator("BT", ((ContentOperator) (new BeginText())));
	//  198  389:aload_0         
	//  199  390:ldc2            #622 <String "BT">
	//  200  393:new             #14  <Class PdfContentStreamProcessor$BeginText>
	//  201  396:dup             
	//  202  397:aconst_null     
	//  203  398:invokespecial   #623 <Method void PdfContentStreamProcessor$BeginText(PdfContentStreamProcessor$1)>
	//  204  401:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  205  404:pop             
		registerContentOperator("ET", ((ContentOperator) (new EndText())));
	//  206  405:aload_0         
	//  207  406:ldc2            #625 <String "ET">
	//  208  409:new             #41  <Class PdfContentStreamProcessor$EndText>
	//  209  412:dup             
	//  210  413:aconst_null     
	//  211  414:invokespecial   #626 <Method void PdfContentStreamProcessor$EndText(PdfContentStreamProcessor$1)>
	//  212  417:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  213  420:pop             
		registerContentOperator("BMC", ((ContentOperator) (new BeginMarkedContent())));
	//  214  421:aload_0         
	//  215  422:ldc2            #628 <String "BMC">
	//  216  425:new             #8   <Class PdfContentStreamProcessor$BeginMarkedContent>
	//  217  428:dup             
	//  218  429:aconst_null     
	//  219  430:invokespecial   #629 <Method void PdfContentStreamProcessor$BeginMarkedContent(PdfContentStreamProcessor$1)>
	//  220  433:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  221  436:pop             
		registerContentOperator("BDC", ((ContentOperator) (new BeginMarkedContentDictionary())));
	//  222  437:aload_0         
	//  223  438:ldc2            #631 <String "BDC">
	//  224  441:new             #11  <Class PdfContentStreamProcessor$BeginMarkedContentDictionary>
	//  225  444:dup             
	//  226  445:aconst_null     
	//  227  446:invokespecial   #632 <Method void PdfContentStreamProcessor$BeginMarkedContentDictionary(PdfContentStreamProcessor$1)>
	//  228  449:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  229  452:pop             
		registerContentOperator("EMC", ((ContentOperator) (new EndMarkedContent())));
	//  230  453:aload_0         
	//  231  454:ldc2            #634 <String "EMC">
	//  232  457:new             #35  <Class PdfContentStreamProcessor$EndMarkedContent>
	//  233  460:dup             
	//  234  461:aconst_null     
	//  235  462:invokespecial   #635 <Method void PdfContentStreamProcessor$EndMarkedContent(PdfContentStreamProcessor$1)>
	//  236  465:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  237  468:pop             
		Object obj1 = ((Object) (new TextMoveStartNextLine()));
	//  238  469:new             #164 <Class PdfContentStreamProcessor$TextMoveStartNextLine>
	//  239  472:dup             
	//  240  473:aconst_null     
	//  241  474:invokespecial   #636 <Method void PdfContentStreamProcessor$TextMoveStartNextLine(PdfContentStreamProcessor$1)>
	//  242  477:astore          4
		registerContentOperator("Td", ((ContentOperator) (obj1)));
	//  243  479:aload_0         
	//  244  480:ldc2            #638 <String "Td">
	//  245  483:aload           4
	//  246  485:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  247  488:pop             
		registerContentOperator("TD", ((ContentOperator) (new TextMoveStartNextLineWithLeading(((TextMoveStartNextLine) (obj1)), ((SetTextLeading) (obj))))));
	//  248  489:aload_0         
	//  249  490:ldc2            #640 <String "TD">
	//  250  493:new             #167 <Class PdfContentStreamProcessor$TextMoveStartNextLineWithLeading>
	//  251  496:dup             
	//  252  497:aload           4
	//  253  499:aload_3         
	//  254  500:invokespecial   #643 <Method void PdfContentStreamProcessor$TextMoveStartNextLineWithLeading(PdfContentStreamProcessor$TextMoveStartNextLine, PdfContentStreamProcessor$SetTextLeading)>
	//  255  503:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  256  506:pop             
		registerContentOperator("Tm", ((ContentOperator) (new TextSetTextMatrix())));
	//  257  507:aload_0         
	//  258  508:ldc2            #645 <String "Tm">
	//  259  511:new             #170 <Class PdfContentStreamProcessor$TextSetTextMatrix>
	//  260  514:dup             
	//  261  515:aconst_null     
	//  262  516:invokespecial   #646 <Method void PdfContentStreamProcessor$TextSetTextMatrix(PdfContentStreamProcessor$1)>
	//  263  519:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  264  522:pop             
		obj = ((Object) (new TextMoveNextLine(((TextMoveStartNextLine) (obj1)))));
	//  265  523:new             #161 <Class PdfContentStreamProcessor$TextMoveNextLine>
	//  266  526:dup             
	//  267  527:aload           4
	//  268  529:invokespecial   #649 <Method void PdfContentStreamProcessor$TextMoveNextLine(PdfContentStreamProcessor$TextMoveStartNextLine)>
	//  269  532:astore_3        
		registerContentOperator("T*", ((ContentOperator) (obj)));
	//  270  533:aload_0         
	//  271  534:ldc2            #651 <String "T*">
	//  272  537:aload_3         
	//  273  538:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  274  541:pop             
		obj1 = ((Object) (new ShowText()));
	//  275  542:new             #155 <Class PdfContentStreamProcessor$ShowText>
	//  276  545:dup             
	//  277  546:aconst_null     
	//  278  547:invokespecial   #652 <Method void PdfContentStreamProcessor$ShowText(PdfContentStreamProcessor$1)>
	//  279  550:astore          4
		registerContentOperator("Tj", ((ContentOperator) (obj1)));
	//  280  552:aload_0         
	//  281  553:ldc2            #654 <String "Tj">
	//  282  556:aload           4
	//  283  558:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  284  561:pop             
		obj = ((Object) (new MoveNextLineAndShowText(((TextMoveNextLine) (obj)), ((ShowText) (obj1)))));
	//  285  562:new             #62  <Class PdfContentStreamProcessor$MoveNextLineAndShowText>
	//  286  565:dup             
	//  287  566:aload_3         
	//  288  567:aload           4
	//  289  569:invokespecial   #657 <Method void PdfContentStreamProcessor$MoveNextLineAndShowText(PdfContentStreamProcessor$TextMoveNextLine, PdfContentStreamProcessor$ShowText)>
	//  290  572:astore_3        
		registerContentOperator("'", ((ContentOperator) (obj)));
	//  291  573:aload_0         
	//  292  574:ldc2            #659 <String "'">
	//  293  577:aload_3         
	//  294  578:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  295  581:pop             
		registerContentOperator("\"", ((ContentOperator) (new MoveNextLineAndShowTextWithSpacing(settextwordspacing, settextcharacterspacing, ((MoveNextLineAndShowText) (obj))))));
	//  296  582:aload_0         
	//  297  583:ldc2            #661 <String "\"">
	//  298  586:new             #65  <Class PdfContentStreamProcessor$MoveNextLineAndShowTextWithSpacing>
	//  299  589:dup             
	//  300  590:aload_2         
	//  301  591:aload_1         
	//  302  592:aload_3         
	//  303  593:invokespecial   #664 <Method void PdfContentStreamProcessor$MoveNextLineAndShowTextWithSpacing(PdfContentStreamProcessor$SetTextWordSpacing, PdfContentStreamProcessor$SetTextCharacterSpacing, PdfContentStreamProcessor$MoveNextLineAndShowText)>
	//  304  596:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  305  599:pop             
		registerContentOperator("TJ", ((ContentOperator) (new ShowTextArray())));
	//  306  600:aload_0         
	//  307  601:ldc2            #666 <String "TJ">
	//  308  604:new             #158 <Class PdfContentStreamProcessor$ShowTextArray>
	//  309  607:dup             
	//  310  608:aconst_null     
	//  311  609:invokespecial   #667 <Method void PdfContentStreamProcessor$ShowTextArray(PdfContentStreamProcessor$1)>
	//  312  612:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  313  615:pop             
		registerContentOperator("Do", ((ContentOperator) (new Do())));
	//  314  616:aload_0         
	//  315  617:ldc2            #668 <String "Do">
	//  316  620:new             #32  <Class PdfContentStreamProcessor$Do>
	//  317  623:dup             
	//  318  624:aconst_null     
	//  319  625:invokespecial   #669 <Method void PdfContentStreamProcessor$Do(PdfContentStreamProcessor$1)>
	//  320  628:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  321  631:pop             
		registerContentOperator("w", ((ContentOperator) (new SetLineWidth())));
	//  322  632:aload_0         
	//  323  633:ldc2            #671 <String "w">
	//  324  636:new             #122 <Class PdfContentStreamProcessor$SetLineWidth>
	//  325  639:dup             
	//  326  640:aconst_null     
	//  327  641:invokespecial   #672 <Method void PdfContentStreamProcessor$SetLineWidth(PdfContentStreamProcessor$1)>
	//  328  644:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  329  647:pop             
		registerContentOperator("J", ((ContentOperator) (new SetLineCap())));
	//  330  648:aload_0         
	//  331  649:ldc2            #674 <String "J">
	//  332  652:new             #113 <Class PdfContentStreamProcessor$SetLineCap>
	//  333  655:dup             
	//  334  656:aload_0         
	//  335  657:aconst_null     
	//  336  658:invokespecial   #677 <Method void PdfContentStreamProcessor$SetLineCap(PdfContentStreamProcessor, PdfContentStreamProcessor$1)>
	//  337  661:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  338  664:pop             
		registerContentOperator("j", ((ContentOperator) (new SetLineJoin())));
	//  339  665:aload_0         
	//  340  666:ldc2            #679 <String "j">
	//  341  669:new             #119 <Class PdfContentStreamProcessor$SetLineJoin>
	//  342  672:dup             
	//  343  673:aload_0         
	//  344  674:aconst_null     
	//  345  675:invokespecial   #680 <Method void PdfContentStreamProcessor$SetLineJoin(PdfContentStreamProcessor, PdfContentStreamProcessor$1)>
	//  346  678:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  347  681:pop             
		registerContentOperator("M", ((ContentOperator) (new SetMiterLimit())));
	//  348  682:aload_0         
	//  349  683:ldc2            #682 <String "M">
	//  350  686:new             #125 <Class PdfContentStreamProcessor$SetMiterLimit>
	//  351  689:dup             
	//  352  690:aload_0         
	//  353  691:aconst_null     
	//  354  692:invokespecial   #683 <Method void PdfContentStreamProcessor$SetMiterLimit(PdfContentStreamProcessor, PdfContentStreamProcessor$1)>
	//  355  695:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  356  698:pop             
		registerContentOperator("d", ((ContentOperator) (new SetLineDashPattern())));
	//  357  699:aload_0         
	//  358  700:ldc2            #685 <String "d">
	//  359  703:new             #116 <Class PdfContentStreamProcessor$SetLineDashPattern>
	//  360  706:dup             
	//  361  707:aload_0         
	//  362  708:aconst_null     
	//  363  709:invokespecial   #686 <Method void PdfContentStreamProcessor$SetLineDashPattern(PdfContentStreamProcessor, PdfContentStreamProcessor$1)>
	//  364  712:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  365  715:pop             
		if(renderListener instanceof ExtRenderListener)
	//* 366  716:aload_0         
	//* 367  717:getfield        #213 <Field RenderListener renderListener>
	//* 368  720:instanceof      #361 <Class ExtRenderListener>
	//* 369  723:ifeq            1050
		{
			registerContentOperator("m", ((ContentOperator) (new MoveTo())));
	//  370  726:aload_0         
	//  371  727:ldc2            #688 <String "m">
	//  372  730:new             #68  <Class PdfContentStreamProcessor$MoveTo>
	//  373  733:dup             
	//  374  734:aconst_null     
	//  375  735:invokespecial   #689 <Method void PdfContentStreamProcessor$MoveTo(PdfContentStreamProcessor$1)>
	//  376  738:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  377  741:pop             
			registerContentOperator("l", ((ContentOperator) (new LineTo())));
	//  378  742:aload_0         
	//  379  743:ldc2            #691 <String "l">
	//  380  746:new             #56  <Class PdfContentStreamProcessor$LineTo>
	//  381  749:dup             
	//  382  750:aconst_null     
	//  383  751:invokespecial   #692 <Method void PdfContentStreamProcessor$LineTo(PdfContentStreamProcessor$1)>
	//  384  754:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  385  757:pop             
			registerContentOperator("c", ((ContentOperator) (new Curve())));
	//  386  758:aload_0         
	//  387  759:ldc2            #694 <String "c">
	//  388  762:new             #23  <Class PdfContentStreamProcessor$Curve>
	//  389  765:dup             
	//  390  766:aconst_null     
	//  391  767:invokespecial   #695 <Method void PdfContentStreamProcessor$Curve(PdfContentStreamProcessor$1)>
	//  392  770:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  393  773:pop             
			registerContentOperator("v", ((ContentOperator) (new CurveFirstPointDuplicated())));
	//  394  774:aload_0         
	//  395  775:ldc2            #697 <String "v">
	//  396  778:new             #26  <Class PdfContentStreamProcessor$CurveFirstPointDuplicated>
	//  397  781:dup             
	//  398  782:aconst_null     
	//  399  783:invokespecial   #698 <Method void PdfContentStreamProcessor$CurveFirstPointDuplicated(PdfContentStreamProcessor$1)>
	//  400  786:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  401  789:pop             
			registerContentOperator("y", ((ContentOperator) (new CurveFourhPointDuplicated())));
	//  402  790:aload_0         
	//  403  791:ldc2            #700 <String "y">
	//  404  794:new             #29  <Class PdfContentStreamProcessor$CurveFourhPointDuplicated>
	//  405  797:dup             
	//  406  798:aconst_null     
	//  407  799:invokespecial   #701 <Method void PdfContentStreamProcessor$CurveFourhPointDuplicated(PdfContentStreamProcessor$1)>
	//  408  802:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  409  805:pop             
			registerContentOperator("h", ((ContentOperator) (new CloseSubpath())));
	//  410  806:aload_0         
	//  411  807:ldc2            #703 <String "h">
	//  412  810:new             #20  <Class PdfContentStreamProcessor$CloseSubpath>
	//  413  813:dup             
	//  414  814:aconst_null     
	//  415  815:invokespecial   #704 <Method void PdfContentStreamProcessor$CloseSubpath(PdfContentStreamProcessor$1)>
	//  416  818:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  417  821:pop             
			registerContentOperator("re", ((ContentOperator) (new Rectangle())));
	//  418  822:aload_0         
	//  419  823:ldc2            #706 <String "re">
	//  420  826:new             #83  <Class PdfContentStreamProcessor$Rectangle>
	//  421  829:dup             
	//  422  830:aconst_null     
	//  423  831:invokespecial   #707 <Method void PdfContentStreamProcessor$Rectangle(PdfContentStreamProcessor$1)>
	//  424  834:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  425  837:pop             
			registerContentOperator("S", ((ContentOperator) (new PaintPath(1, -1, false))));
	//  426  838:aload_0         
	//  427  839:ldc2            #709 <String "S">
	//  428  842:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  429  845:dup             
	//  430  846:iconst_1        
	//  431  847:iconst_m1       
	//  432  848:iconst_0        
	//  433  849:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  434  852:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  435  855:pop             
			registerContentOperator("s", ((ContentOperator) (new PaintPath(1, -1, true))));
	//  436  856:aload_0         
	//  437  857:ldc2            #713 <String "s">
	//  438  860:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  439  863:dup             
	//  440  864:iconst_1        
	//  441  865:iconst_m1       
	//  442  866:iconst_1        
	//  443  867:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  444  870:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  445  873:pop             
			registerContentOperator("f", ((ContentOperator) (new PaintPath(2, 1, false))));
	//  446  874:aload_0         
	//  447  875:ldc2            #715 <String "f">
	//  448  878:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  449  881:dup             
	//  450  882:iconst_2        
	//  451  883:iconst_1        
	//  452  884:iconst_0        
	//  453  885:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  454  888:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  455  891:pop             
			registerContentOperator("F", ((ContentOperator) (new PaintPath(2, 1, false))));
	//  456  892:aload_0         
	//  457  893:ldc2            #716 <String "F">
	//  458  896:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  459  899:dup             
	//  460  900:iconst_2        
	//  461  901:iconst_1        
	//  462  902:iconst_0        
	//  463  903:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  464  906:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  465  909:pop             
			registerContentOperator("f*", ((ContentOperator) (new PaintPath(2, 2, false))));
	//  466  910:aload_0         
	//  467  911:ldc2            #718 <String "f*">
	//  468  914:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  469  917:dup             
	//  470  918:iconst_2        
	//  471  919:iconst_2        
	//  472  920:iconst_0        
	//  473  921:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  474  924:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  475  927:pop             
			registerContentOperator("B", ((ContentOperator) (new PaintPath(3, 1, false))));
	//  476  928:aload_0         
	//  477  929:ldc2            #720 <String "B">
	//  478  932:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  479  935:dup             
	//  480  936:iconst_3        
	//  481  937:iconst_1        
	//  482  938:iconst_0        
	//  483  939:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  484  942:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  485  945:pop             
			registerContentOperator("B*", ((ContentOperator) (new PaintPath(3, 2, false))));
	//  486  946:aload_0         
	//  487  947:ldc2            #722 <String "B*">
	//  488  950:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  489  953:dup             
	//  490  954:iconst_3        
	//  491  955:iconst_2        
	//  492  956:iconst_0        
	//  493  957:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  494  960:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  495  963:pop             
			registerContentOperator("b", ((ContentOperator) (new PaintPath(3, 1, true))));
	//  496  964:aload_0         
	//  497  965:ldc2            #724 <String "b">
	//  498  968:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  499  971:dup             
	//  500  972:iconst_3        
	//  501  973:iconst_1        
	//  502  974:iconst_1        
	//  503  975:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  504  978:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  505  981:pop             
			registerContentOperator("b*", ((ContentOperator) (new PaintPath(3, 2, true))));
	//  506  982:aload_0         
	//  507  983:ldc2            #726 <String "b*">
	//  508  986:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  509  989:dup             
	//  510  990:iconst_3        
	//  511  991:iconst_2        
	//  512  992:iconst_1        
	//  513  993:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  514  996:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  515  999:pop             
			registerContentOperator("n", ((ContentOperator) (new PaintPath(0, -1, false))));
	//  516 1000:aload_0         
	//  517 1001:ldc2            #728 <String "n">
	//  518 1004:new             #71  <Class PdfContentStreamProcessor$PaintPath>
	//  519 1007:dup             
	//  520 1008:iconst_0        
	//  521 1009:iconst_m1       
	//  522 1010:iconst_0        
	//  523 1011:invokespecial   #711 <Method void PdfContentStreamProcessor$PaintPath(int, int, boolean)>
	//  524 1014:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  525 1017:pop             
			registerContentOperator("W", ((ContentOperator) (new ClipPath(1))));
	//  526 1018:aload_0         
	//  527 1019:ldc2            #730 <String "W">
	//  528 1022:new             #17  <Class PdfContentStreamProcessor$ClipPath>
	//  529 1025:dup             
	//  530 1026:iconst_1        
	//  531 1027:invokespecial   #732 <Method void PdfContentStreamProcessor$ClipPath(int)>
	//  532 1030:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  533 1033:pop             
			registerContentOperator("W*", ((ContentOperator) (new ClipPath(2))));
	//  534 1034:aload_0         
	//  535 1035:ldc2            #734 <String "W*">
	//  536 1038:new             #17  <Class PdfContentStreamProcessor$ClipPath>
	//  537 1041:dup             
	//  538 1042:iconst_2        
	//  539 1043:invokespecial   #732 <Method void PdfContentStreamProcessor$ClipPath(int)>
	//  540 1046:invokevirtual   #554 <Method ContentOperator registerContentOperator(String, ContentOperator)>
	//  541 1049:pop             
		}
	//  542 1050:return          
	}

	private void populateXObjectDoHandlers()
	{
		registerXObjectDoHandler(PdfName.DEFAULT, ((XObjectDoHandler) (new IgnoreXObjectDoHandler())));
	//    0    0:aload_0         
	//    1    1:getstatic       #416 <Field PdfName PdfName.DEFAULT>
	//    2    4:new             #50  <Class PdfContentStreamProcessor$IgnoreXObjectDoHandler>
	//    3    7:dup             
	//    4    8:aconst_null     
	//    5    9:invokespecial   #735 <Method void PdfContentStreamProcessor$IgnoreXObjectDoHandler(PdfContentStreamProcessor$1)>
	//    6   12:invokevirtual   #739 <Method XObjectDoHandler registerXObjectDoHandler(PdfName, XObjectDoHandler)>
	//    7   15:pop             
		registerXObjectDoHandler(PdfName.FORM, ((XObjectDoHandler) (new FormXObjectDoHandler())));
	//    8   16:aload_0         
	//    9   17:getstatic       #742 <Field PdfName PdfName.FORM>
	//   10   20:new             #44  <Class PdfContentStreamProcessor$FormXObjectDoHandler>
	//   11   23:dup             
	//   12   24:aconst_null     
	//   13   25:invokespecial   #743 <Method void PdfContentStreamProcessor$FormXObjectDoHandler(PdfContentStreamProcessor$1)>
	//   14   28:invokevirtual   #739 <Method XObjectDoHandler registerXObjectDoHandler(PdfName, XObjectDoHandler)>
	//   15   31:pop             
		registerXObjectDoHandler(PdfName.IMAGE, ((XObjectDoHandler) (new ImageXObjectDoHandler())));
	//   16   32:aload_0         
	//   17   33:getstatic       #746 <Field PdfName PdfName.IMAGE>
	//   18   36:new             #53  <Class PdfContentStreamProcessor$ImageXObjectDoHandler>
	//   19   39:dup             
	//   20   40:aconst_null     
	//   21   41:invokespecial   #747 <Method void PdfContentStreamProcessor$ImageXObjectDoHandler(PdfContentStreamProcessor$1)>
	//   22   44:invokevirtual   #739 <Method XObjectDoHandler registerXObjectDoHandler(PdfName, XObjectDoHandler)>
	//   23   47:pop             
	//   24   48:return          
	}

	public Collection getRegisteredOperatorStrings()
	{
		return ((Collection) (new ArrayList(((Collection) (operators.keySet())))));
	//    0    0:new             #751 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #215 <Field Map operators>
	//    4    8:invokeinterface #755 <Method java.util.Set Map.keySet()>
	//    5   13:invokespecial   #758 <Method void ArrayList(Collection)>
	//    6   16:areturn         
	}

	public RenderListener getRenderListener()
	{
		return renderListener;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field RenderListener renderListener>
	//    2    4:areturn         
	}

	public GraphicsState gs()
	{
		return (GraphicsState)gsStack.peek();
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field Stack gsStack>
	//    2    4:invokevirtual   #764 <Method Object Stack.peek()>
	//    3    7:checkcast       #332 <Class GraphicsState>
	//    4   10:areturn         
	}

	protected void handleInlineImage(InlineImageInfo inlineimageinfo, PdfDictionary pdfdictionary)
	{
		inlineimageinfo = ((InlineImageInfo) (ImageRenderInfo.createForEmbeddedImage(gs(), inlineimageinfo, pdfdictionary)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method GraphicsState gs()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #772 <Method ImageRenderInfo ImageRenderInfo.createForEmbeddedImage(GraphicsState, InlineImageInfo, PdfDictionary)>
	//    5    9:astore_1        
		renderListener.renderImage(((ImageRenderInfo) (inlineimageinfo)));
	//    6   10:aload_0         
	//    7   11:getfield        #213 <Field RenderListener renderListener>
	//    8   14:aload_1         
	//    9   15:invokeinterface #776 <Method void RenderListener.renderImage(ImageRenderInfo)>
	//   10   20:return          
	}

	public void processContent(byte abyte0[], PdfDictionary pdfdictionary)
	{
		resources.push(pdfdictionary);
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field PdfContentStreamProcessor$ResourceDictionary resources>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #780 <Method void PdfContentStreamProcessor$ResourceDictionary.push(PdfDictionary)>
		PdfContentParser pdfcontentparser;
		ArrayList arraylist;
		pdfcontentparser = new PdfContentParser(new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(abyte0))));
	//    4    8:new             #782 <Class PdfContentParser>
	//    5   11:dup             
	//    6   12:new             #784 <Class PRTokeniser>
	//    7   15:dup             
	//    8   16:new             #786 <Class RandomAccessFileOrArray>
	//    9   19:dup             
	//   10   20:new             #788 <Class RandomAccessSourceFactory>
	//   11   23:dup             
	//   12   24:invokespecial   #789 <Method void RandomAccessSourceFactory()>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #793 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   15   31:invokespecial   #796 <Method void RandomAccessFileOrArray(com.itextpdf.text.io.RandomAccessSource)>
	//   16   34:invokespecial   #799 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   17   37:invokespecial   #802 <Method void PdfContentParser(PRTokeniser)>
	//   18   40:astore_3        
		arraylist = new ArrayList();
	//   19   41:new             #751 <Class ArrayList>
	//   20   44:dup             
	//   21   45:invokespecial   #803 <Method void ArrayList()>
	//   22   48:astore          4
_L1:
		if(pdfcontentparser.parse(arraylist).size() <= 0)
			break MISSING_BLOCK_LABEL_141;
	//   23   50:aload_3         
	//   24   51:aload           4
	//   25   53:invokevirtual   #807 <Method ArrayList PdfContentParser.parse(ArrayList)>
	//   26   56:invokevirtual   #810 <Method int ArrayList.size()>
	//   27   59:ifle            141
		abyte0 = ((byte []) ((PdfLiteral)arraylist.get(arraylist.size() - 1)));
	//   28   62:aload           4
	//   29   64:aload           4
	//   30   66:invokevirtual   #810 <Method int ArrayList.size()>
	//   31   69:iconst_1        
	//   32   70:isub            
	//   33   71:invokevirtual   #811 <Method Object ArrayList.get(int)>
	//   34   74:checkcast       #514 <Class PdfLiteral>
	//   35   77:astore_1        
		if(!"BI".equals(((Object) (((PdfLiteral) (abyte0)).toString()))))
			break MISSING_BLOCK_LABEL_131;
	//   36   78:ldc2            #813 <String "BI">
	//   37   81:aload_1         
	//   38   82:invokevirtual   #518 <Method String PdfLiteral.toString()>
	//   39   85:invokevirtual   #816 <Method boolean String.equals(Object)>
	//   40   88:ifeq            131
		if(pdfdictionary == null)
			break MISSING_BLOCK_LABEL_126;
	//   41   91:aload_2         
	//   42   92:ifnull          126
		abyte0 = ((byte []) (pdfdictionary.getAsDict(PdfName.COLORSPACE)));
	//   43   95:aload_2         
	//   44   96:getstatic       #819 <Field PdfName PdfName.COLORSPACE>
	//   45   99:invokevirtual   #820 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   46  102:astore_1        
_L2:
		handleInlineImage(InlineImageUtils.parseInlineImage(pdfcontentparser, ((PdfDictionary) (abyte0))), ((PdfDictionary) (abyte0)));
	//   47  103:aload_0         
	//   48  104:aload_3         
	//   49  105:aload_1         
	//   50  106:invokestatic    #826 <Method InlineImageInfo InlineImageUtils.parseInlineImage(PdfContentParser, PdfDictionary)>
	//   51  109:aload_1         
	//   52  110:invokevirtual   #828 <Method void handleInlineImage(InlineImageInfo, PdfDictionary)>
		  goto _L1
	//*  53  113:goto            50
	//*  54  116:astore_1        
	//*  55  117:new             #830 <Class ExceptionConverter>
	//*  56  120:dup             
	//*  57  121:aload_1         
	//*  58  122:invokespecial   #833 <Method void ExceptionConverter(Exception)>
	//*  59  125:athrow          
		abyte0 = null;
	//   60  126:aconst_null     
	//   61  127:astore_1        
		  goto _L2
	//*  62  128:goto            103
		try
		{
			invokeOperator(((PdfLiteral) (abyte0)), arraylist);
	//   63  131:aload_0         
	//   64  132:aload_1         
	//   65  133:aload           4
	//   66  135:invokespecial   #835 <Method void invokeOperator(PdfLiteral, ArrayList)>
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
		}
		  goto _L1
	//*  67  138:goto            50
		resources.pop();
	//   68  141:aload_0         
	//   69  142:getfield        #253 <Field PdfContentStreamProcessor$ResourceDictionary resources>
	//   70  145:invokevirtual   #837 <Method void PdfContentStreamProcessor$ResourceDictionary.pop()>
		return;
	//   71  148:return          
	}

	public ContentOperator registerContentOperator(String s, ContentOperator contentoperator)
	{
		return (ContentOperator)operators.put(((Object) (s)), ((Object) (contentoperator)));
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field Map operators>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #505 <Method Object Map.put(Object, Object)>
	//    5   11:checkcast       #520 <Class ContentOperator>
	//    6   14:areturn         
	}

	public XObjectDoHandler registerXObjectDoHandler(PdfName pdfname, XObjectDoHandler xobjectdohandler)
	{
		return (XObjectDoHandler)xobjectDoHandlers.put(((Object) (pdfname)), ((Object) (xobjectdohandler)));
	//    0    0:aload_0         
	//    1    1:getfield        #220 <Field Map xobjectDoHandlers>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #505 <Method Object Map.put(Object, Object)>
	//    5   11:checkcast       #413 <Class XObjectDoHandler>
	//    6   14:areturn         
	}

	public void reset()
	{
		gsStack.removeAllElements();
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field Stack gsStack>
	//    2    4:invokevirtual   #840 <Method void Stack.removeAllElements()>
		gsStack.add(((Object) (new GraphicsState())));
	//    3    7:aload_0         
	//    4    8:getfield        #204 <Field Stack gsStack>
	//    5   11:new             #332 <Class GraphicsState>
	//    6   14:dup             
	//    7   15:invokespecial   #841 <Method void GraphicsState()>
	//    8   18:invokevirtual   #844 <Method boolean Stack.add(Object)>
	//    9   21:pop             
		textMatrix = null;
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:putfield        #248 <Field Matrix textMatrix>
		textLineMatrix = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #243 <Field Matrix textLineMatrix>
		resources = new ResourceDictionary();
	//   16   32:aload_0         
	//   17   33:new             #86  <Class PdfContentStreamProcessor$ResourceDictionary>
	//   18   36:dup             
	//   19   37:invokespecial   #845 <Method void PdfContentStreamProcessor$ResourceDictionary()>
	//   20   40:putfield        #253 <Field PdfContentStreamProcessor$ResourceDictionary resources>
	//   21   43:return          
	}

	public static final String DEFAULTOPERATOR = "DefaultOperator";
	private final Map cachedFonts = new HashMap();
	private final Stack gsStack = new Stack();
	private final Stack markedContentStack = new Stack();
	private final Map operators = new HashMap();
	private final RenderListener renderListener;
	private ResourceDictionary resources;
	private Matrix textLineMatrix;
	private Matrix textMatrix;
	private final Map xobjectDoHandlers = new HashMap();


/*
	static void access$4700(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfString pdfstring)
	{
		pdfcontentstreamprocessor.displayPdfString(pdfstring);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #233 <Method void displayPdfString(PdfString)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$4800(PdfContentStreamProcessor pdfcontentstreamprocessor, float f)
	{
		pdfcontentstreamprocessor.applyTextAdjust(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #239 <Method void applyTextAdjust(float)>
		return;
	//    3    5:return          
	}

*/


/*
	static Matrix access$4900(PdfContentStreamProcessor pdfcontentstreamprocessor)
	{
		return pdfcontentstreamprocessor.textLineMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field Matrix textLineMatrix>
	//    2    4:areturn         
	}

*/


/*
	static Matrix access$4902(PdfContentStreamProcessor pdfcontentstreamprocessor, Matrix matrix)
	{
		pdfcontentstreamprocessor.textLineMatrix = matrix;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #243 <Field Matrix textLineMatrix>
		return matrix;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Matrix access$5000(PdfContentStreamProcessor pdfcontentstreamprocessor)
	{
		return pdfcontentstreamprocessor.textMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #248 <Field Matrix textMatrix>
	//    2    4:areturn         
	}

*/


/*
	static Matrix access$5002(PdfContentStreamProcessor pdfcontentstreamprocessor, Matrix matrix)
	{
		pdfcontentstreamprocessor.textMatrix = matrix;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #248 <Field Matrix textMatrix>
		return matrix;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ResourceDictionary access$5100(PdfContentStreamProcessor pdfcontentstreamprocessor)
	{
		return pdfcontentstreamprocessor.resources;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field PdfContentStreamProcessor$ResourceDictionary resources>
	//    2    4:areturn         
	}

*/


/*
	static CMapAwareDocumentFont access$5200(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfDictionary pdfdictionary)
	{
		return pdfcontentstreamprocessor.getFont(pdfdictionary);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #259 <Method CMapAwareDocumentFont getFont(PdfDictionary)>
	//    3    5:areturn         
	}

*/


/*
	static CMapAwareDocumentFont access$5300(PdfContentStreamProcessor pdfcontentstreamprocessor, PRIndirectReference prindirectreference)
	{
		return pdfcontentstreamprocessor.getFont(prindirectreference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #264 <Method CMapAwareDocumentFont getFont(PRIndirectReference)>
	//    3    5:areturn         
	}

*/


/*
	static Stack access$5400(PdfContentStreamProcessor pdfcontentstreamprocessor)
	{
		return pdfcontentstreamprocessor.gsStack;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field Stack gsStack>
	//    2    4:areturn         
	}

*/


/*
	static BaseColor access$5500(int i, List list)
	{
		return getColor(i, list);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #271 <Method BaseColor getColor(int, List)>
	//    3    5:areturn         
	}

*/


/*
	static BaseColor access$5600(PdfName pdfname, List list)
	{
		return getColor(pdfname, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #275 <Method BaseColor getColor(PdfName, List)>
	//    3    5:areturn         
	}

*/


/*
	static void access$5700(PdfContentStreamProcessor pdfcontentstreamprocessor)
	{
		pdfcontentstreamprocessor.beginText();
	//    0    0:aload_0         
	//    1    1:invokespecial   #280 <Method void beginText()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$5800(PdfContentStreamProcessor pdfcontentstreamprocessor)
	{
		pdfcontentstreamprocessor.endText();
	//    0    0:aload_0         
	//    1    1:invokespecial   #284 <Method void endText()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$5900(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfName pdfname, PdfDictionary pdfdictionary)
	{
		pdfcontentstreamprocessor.beginMarkedContent(pdfname, pdfdictionary);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #290 <Method void beginMarkedContent(PdfName, PdfDictionary)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$6000(PdfContentStreamProcessor pdfcontentstreamprocessor)
	{
		pdfcontentstreamprocessor.endMarkedContent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #294 <Method void endMarkedContent()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$6100(PdfContentStreamProcessor pdfcontentstreamprocessor, PdfName pdfname)
		throws IOException
	{
		pdfcontentstreamprocessor.displayXObject(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #302 <Method void displayXObject(PdfName)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$6200(PdfContentStreamProcessor pdfcontentstreamprocessor, int i, List list)
	{
		pdfcontentstreamprocessor.modifyPath(i, list);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #309 <Method void modifyPath(int, List)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$6300(PdfContentStreamProcessor pdfcontentstreamprocessor, int i, int j, boolean flag)
	{
		pdfcontentstreamprocessor.paintPath(i, j, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #315 <Method void paintPath(int, int, boolean)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$6400(PdfContentStreamProcessor pdfcontentstreamprocessor, int i)
	{
		pdfcontentstreamprocessor.clipPath(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #321 <Method void clipPath(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static RenderListener access$6500(PdfContentStreamProcessor pdfcontentstreamprocessor)
	{
		return pdfcontentstreamprocessor.renderListener;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field RenderListener renderListener>
	//    2    4:areturn         
	}

*/
}
