// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, PdfNumber, PdfLiteral, PdfName, 
//			PdfTemplate, PdfRectangle, PdfOCG

public class PdfFormXObject extends PdfStream
{

	PdfFormXObject(PdfTemplate pdftemplate, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void PdfStream()>
		put(PdfName.TYPE, ((PdfObject) (PdfName.XOBJECT)));
	//    2    4:aload_0         
	//    3    5:getstatic       #40  <Field PdfName PdfName.TYPE>
	//    4    8:getstatic       #43  <Field PdfName PdfName.XOBJECT>
	//    5   11:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		put(PdfName.SUBTYPE, ((PdfObject) (PdfName.FORM)));
	//    6   14:aload_0         
	//    7   15:getstatic       #50  <Field PdfName PdfName.SUBTYPE>
	//    8   18:getstatic       #53  <Field PdfName PdfName.FORM>
	//    9   21:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		put(PdfName.RESOURCES, pdftemplate.getResources());
	//   10   24:aload_0         
	//   11   25:getstatic       #56  <Field PdfName PdfName.RESOURCES>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #62  <Method PdfObject PdfTemplate.getResources()>
	//   14   32:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		put(PdfName.BBOX, ((PdfObject) (new PdfRectangle(pdftemplate.getBoundingBox()))));
	//   15   35:aload_0         
	//   16   36:getstatic       #65  <Field PdfName PdfName.BBOX>
	//   17   39:new             #67  <Class PdfRectangle>
	//   18   42:dup             
	//   19   43:aload_1         
	//   20   44:invokevirtual   #71  <Method com.itextpdf.text.Rectangle PdfTemplate.getBoundingBox()>
	//   21   47:invokespecial   #74  <Method void PdfRectangle(com.itextpdf.text.Rectangle)>
	//   22   50:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		put(PdfName.FORMTYPE, ((PdfObject) (ONE)));
	//   23   53:aload_0         
	//   24   54:getstatic       #77  <Field PdfName PdfName.FORMTYPE>
	//   25   57:getstatic       #21  <Field PdfNumber ONE>
	//   26   60:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		if(pdftemplate.getLayer() != null)
	//*  27   63:aload_1         
	//*  28   64:invokevirtual   #81  <Method PdfOCG PdfTemplate.getLayer()>
	//*  29   67:ifnull          86
			put(PdfName.OC, ((PdfObject) (pdftemplate.getLayer().getRef())));
	//   30   70:aload_0         
	//   31   71:getstatic       #84  <Field PdfName PdfName.OC>
	//   32   74:aload_1         
	//   33   75:invokevirtual   #81  <Method PdfOCG PdfTemplate.getLayer()>
	//   34   78:invokeinterface #90  <Method PdfIndirectReference PdfOCG.getRef()>
	//   35   83:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		if(pdftemplate.getGroup() != null)
	//*  36   86:aload_1         
	//*  37   87:invokevirtual   #94  <Method PdfTransparencyGroup PdfTemplate.getGroup()>
	//*  38   90:ifnull          104
			put(PdfName.GROUP, ((PdfObject) (pdftemplate.getGroup())));
	//   39   93:aload_0         
	//   40   94:getstatic       #97  <Field PdfName PdfName.GROUP>
	//   41   97:aload_1         
	//   42   98:invokevirtual   #94  <Method PdfTransparencyGroup PdfTemplate.getGroup()>
	//   43  101:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		PdfArray pdfarray = pdftemplate.getMatrix();
	//   44  104:aload_1         
	//   45  105:invokevirtual   #101 <Method PdfArray PdfTemplate.getMatrix()>
	//   46  108:astore_3        
		if(pdfarray == null)
	//*  47  109:aload_3         
	//*  48  110:ifnonnull       172
			put(PdfName.MATRIX, ((PdfObject) (MATRIX)));
	//   49  113:aload_0         
	//   50  114:getstatic       #103 <Field PdfName PdfName.MATRIX>
	//   51  117:getstatic       #30  <Field PdfLiteral MATRIX>
	//   52  120:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		else
	//*  53  123:aload_0         
	//*  54  124:aload_1         
	//*  55  125:aconst_null     
	//*  56  126:invokevirtual   #107 <Method byte[] PdfTemplate.toPdf(PdfWriter)>
	//*  57  129:putfield        #111 <Field byte[] bytes>
	//*  58  132:aload_0         
	//*  59  133:getstatic       #114 <Field PdfName PdfName.LENGTH>
	//*  60  136:new             #13  <Class PdfNumber>
	//*  61  139:dup             
	//*  62  140:aload_0         
	//*  63  141:getfield        #111 <Field byte[] bytes>
	//*  64  144:arraylength     
	//*  65  145:invokespecial   #17  <Method void PdfNumber(int)>
	//*  66  148:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//*  67  151:aload_1         
	//*  68  152:invokevirtual   #118 <Method PdfDictionary PdfTemplate.getAdditional()>
	//*  69  155:ifnull          166
	//*  70  158:aload_0         
	//*  71  159:aload_1         
	//*  72  160:invokevirtual   #118 <Method PdfDictionary PdfTemplate.getAdditional()>
	//*  73  163:invokevirtual   #122 <Method void putAll(PdfDictionary)>
	//*  74  166:aload_0         
	//*  75  167:iload_2         
	//*  76  168:invokevirtual   #125 <Method void flateCompress(int)>
	//*  77  171:return          
			put(PdfName.MATRIX, ((PdfObject) (pdfarray)));
	//   78  172:aload_0         
	//   79  173:getstatic       #103 <Field PdfName PdfName.MATRIX>
	//   80  176:aload_3         
	//   81  177:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		bytes = pdftemplate.toPdf(((PdfWriter) (null)));
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
		if(pdftemplate.getAdditional() != null)
			putAll(pdftemplate.getAdditional());
		flateCompress(i);
	//*  82  180:goto            123
	}

	public static final PdfLiteral MATRIX = new PdfLiteral("[1 0 0 1 0 0]");
	public static final PdfNumber ONE = new PdfNumber(1);
	public static final PdfNumber ZERO = new PdfNumber(0);

	static 
	{
	//    0    0:new             #13  <Class PdfNumber>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #17  <Method void PdfNumber(int)>
	//    4    8:putstatic       #19  <Field PdfNumber ZERO>
	//    5   11:new             #13  <Class PdfNumber>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #17  <Method void PdfNumber(int)>
	//    9   19:putstatic       #21  <Field PdfNumber ONE>
	//   10   22:new             #23  <Class PdfLiteral>
	//   11   25:dup             
	//   12   26:ldc1            #25  <String "[1 0 0 1 0 0]">
	//   13   28:invokespecial   #28  <Method void PdfLiteral(String)>
	//   14   31:putstatic       #30  <Field PdfLiteral MATRIX>
	//*  15   34:return          
	}
}
