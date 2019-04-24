// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, PdfNumber, PdfPatternPainter, PdfName, 
//			PdfRectangle

public class PdfPattern extends PdfStream
{

	PdfPattern(PdfPatternPainter pdfpatternpainter)
	{
		this(pdfpatternpainter, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #9   <Method void PdfPattern(PdfPatternPainter, int)>
	//    4    6:return          
	}

	PdfPattern(PdfPatternPainter pdfpatternpainter, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void PdfStream()>
		PdfNumber pdfnumber = new PdfNumber(1);
	//    2    4:new             #17  <Class PdfNumber>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:invokespecial   #20  <Method void PdfNumber(int)>
	//    6   12:astore_3        
		PdfArray pdfarray = pdfpatternpainter.getMatrix();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #26  <Method PdfArray PdfPatternPainter.getMatrix()>
	//    9   17:astore          4
		if(pdfarray != null)
	//*  10   19:aload           4
	//*  11   21:ifnull          33
			put(PdfName.MATRIX, ((PdfObject) (pdfarray)));
	//   12   24:aload_0         
	//   13   25:getstatic       #32  <Field PdfName PdfName.MATRIX>
	//   14   28:aload           4
	//   15   30:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		put(PdfName.TYPE, ((PdfObject) (PdfName.PATTERN)));
	//   16   33:aload_0         
	//   17   34:getstatic       #39  <Field PdfName PdfName.TYPE>
	//   18   37:getstatic       #42  <Field PdfName PdfName.PATTERN>
	//   19   40:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		put(PdfName.BBOX, ((PdfObject) (new PdfRectangle(pdfpatternpainter.getBoundingBox()))));
	//   20   43:aload_0         
	//   21   44:getstatic       #45  <Field PdfName PdfName.BBOX>
	//   22   47:new             #47  <Class PdfRectangle>
	//   23   50:dup             
	//   24   51:aload_1         
	//   25   52:invokevirtual   #51  <Method com.itextpdf.text.Rectangle PdfPatternPainter.getBoundingBox()>
	//   26   55:invokespecial   #54  <Method void PdfRectangle(com.itextpdf.text.Rectangle)>
	//   27   58:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		put(PdfName.RESOURCES, pdfpatternpainter.getResources());
	//   28   61:aload_0         
	//   29   62:getstatic       #57  <Field PdfName PdfName.RESOURCES>
	//   30   65:aload_1         
	//   31   66:invokevirtual   #61  <Method PdfObject PdfPatternPainter.getResources()>
	//   32   69:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		put(PdfName.TILINGTYPE, ((PdfObject) (pdfnumber)));
	//   33   72:aload_0         
	//   34   73:getstatic       #64  <Field PdfName PdfName.TILINGTYPE>
	//   35   76:aload_3         
	//   36   77:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		put(PdfName.PATTERNTYPE, ((PdfObject) (pdfnumber)));
	//   37   80:aload_0         
	//   38   81:getstatic       #67  <Field PdfName PdfName.PATTERNTYPE>
	//   39   84:aload_3         
	//   40   85:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		if(pdfpatternpainter.isStencil())
	//*  41   88:aload_1         
	//*  42   89:invokevirtual   #71  <Method boolean PdfPatternPainter.isStencil()>
	//*  43   92:ifeq            180
			put(PdfName.PAINTTYPE, ((PdfObject) (new PdfNumber(2))));
	//   44   95:aload_0         
	//   45   96:getstatic       #74  <Field PdfName PdfName.PAINTTYPE>
	//   46   99:new             #17  <Class PdfNumber>
	//   47  102:dup             
	//   48  103:iconst_2        
	//   49  104:invokespecial   #20  <Method void PdfNumber(int)>
	//   50  107:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		else
	//*  51  110:aload_0         
	//*  52  111:getstatic       #77  <Field PdfName PdfName.XSTEP>
	//*  53  114:new             #17  <Class PdfNumber>
	//*  54  117:dup             
	//*  55  118:aload_1         
	//*  56  119:invokevirtual   #81  <Method float PdfPatternPainter.getXStep()>
	//*  57  122:invokespecial   #84  <Method void PdfNumber(float)>
	//*  58  125:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
	//*  59  128:aload_0         
	//*  60  129:getstatic       #87  <Field PdfName PdfName.YSTEP>
	//*  61  132:new             #17  <Class PdfNumber>
	//*  62  135:dup             
	//*  63  136:aload_1         
	//*  64  137:invokevirtual   #90  <Method float PdfPatternPainter.getYStep()>
	//*  65  140:invokespecial   #84  <Method void PdfNumber(float)>
	//*  66  143:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
	//*  67  146:aload_0         
	//*  68  147:aload_1         
	//*  69  148:aconst_null     
	//*  70  149:invokevirtual   #94  <Method byte[] PdfPatternPainter.toPdf(PdfWriter)>
	//*  71  152:putfield        #98  <Field byte[] bytes>
	//*  72  155:aload_0         
	//*  73  156:getstatic       #101 <Field PdfName PdfName.LENGTH>
	//*  74  159:new             #17  <Class PdfNumber>
	//*  75  162:dup             
	//*  76  163:aload_0         
	//*  77  164:getfield        #98  <Field byte[] bytes>
	//*  78  167:arraylength     
	//*  79  168:invokespecial   #20  <Method void PdfNumber(int)>
	//*  80  171:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
	//*  81  174:aload_0         
	//*  82  175:iload_2         
	//*  83  176:invokevirtual   #104 <Method void flateCompress(int)>
	//*  84  179:return          
			put(PdfName.PAINTTYPE, ((PdfObject) (pdfnumber)));
	//   85  180:aload_0         
	//   86  181:getstatic       #74  <Field PdfName PdfName.PAINTTYPE>
	//   87  184:aload_3         
	//   88  185:invokevirtual   #36  <Method void put(PdfName, PdfObject)>
		put(PdfName.XSTEP, ((PdfObject) (new PdfNumber(pdfpatternpainter.getXStep()))));
		put(PdfName.YSTEP, ((PdfObject) (new PdfNumber(pdfpatternpainter.getYStep()))));
		bytes = pdfpatternpainter.toPdf(((PdfWriter) (null)));
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
		try
		{
			flateCompress(i);
			return;
		}
	//*  89  188:goto            110
		// Misplaced declaration of an exception variable
		catch(PdfPatternPainter pdfpatternpainter)
	//*  90  191:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfpatternpainter)));
	//   91  192:new             #106 <Class ExceptionConverter>
	//   92  195:dup             
	//   93  196:aload_1         
	//   94  197:invokespecial   #109 <Method void ExceptionConverter(Exception)>
	//   95  200:athrow          
		}
	}
}
