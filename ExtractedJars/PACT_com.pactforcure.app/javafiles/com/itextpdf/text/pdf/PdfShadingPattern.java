// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfShading, PdfName, PdfNumber, 
//			PdfArray, PdfWriter, PdfIndirectReference, ColorDetails

public class PdfShadingPattern extends PdfDictionary
{

	public PdfShadingPattern(PdfShading pdfshading)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PdfDictionary()>
	//    2    4:aload_0         
	//    3    5:bipush          6
	//    4    7:newarray        float[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:fconst_1        
	//    8   12:fastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:fconst_0        
	//   12   16:fastore         
	//   13   17:dup             
	//   14   18:iconst_2        
	//   15   19:fconst_0        
	//   16   20:fastore         
	//   17   21:dup             
	//   18   22:iconst_3        
	//   19   23:fconst_1        
	//   20   24:fastore         
	//   21   25:dup             
	//   22   26:iconst_4        
	//   23   27:fconst_0        
	//   24   28:fastore         
	//   25   29:dup             
	//   26   30:iconst_5        
	//   27   31:fconst_0        
	//   28   32:fastore         
	//   29   33:putfield        #21  <Field float[] matrix>
		writer = pdfshading.getWriter();
	//   30   36:aload_0         
	//   31   37:aload_1         
	//   32   38:invokevirtual   #27  <Method PdfWriter PdfShading.getWriter()>
	//   33   41:putfield        #29  <Field PdfWriter writer>
		put(PdfName.PATTERNTYPE, ((PdfObject) (new PdfNumber(2))));
	//   34   44:aload_0         
	//   35   45:getstatic       #34  <Field PdfName PdfName.PATTERNTYPE>
	//   36   48:new             #36  <Class PdfNumber>
	//   37   51:dup             
	//   38   52:iconst_2        
	//   39   53:invokespecial   #39  <Method void PdfNumber(int)>
	//   40   56:invokevirtual   #43  <Method void put(PdfName, PdfObject)>
		shading = pdfshading;
	//   41   59:aload_0         
	//   42   60:aload_1         
	//   43   61:putfield        #45  <Field PdfShading shading>
	//   44   64:return          
	}

	public void addToBody()
		throws IOException
	{
		put(PdfName.SHADING, ((PdfObject) (getShadingReference())));
	//    0    0:aload_0         
	//    1    1:getstatic       #52  <Field PdfName PdfName.SHADING>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #56  <Method PdfIndirectReference getShadingReference()>
	//    4    8:invokevirtual   #43  <Method void put(PdfName, PdfObject)>
		put(PdfName.MATRIX, ((PdfObject) (new PdfArray(matrix))));
	//    5   11:aload_0         
	//    6   12:getstatic       #59  <Field PdfName PdfName.MATRIX>
	//    7   15:new             #61  <Class PdfArray>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field float[] matrix>
	//   11   23:invokespecial   #64  <Method void PdfArray(float[])>
	//   12   26:invokevirtual   #43  <Method void put(PdfName, PdfObject)>
		writer.addToBody(((PdfObject) (this)), getPatternReference());
	//   13   29:aload_0         
	//   14   30:getfield        #29  <Field PdfWriter writer>
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #67  <Method PdfIndirectReference getPatternReference()>
	//   18   38:invokevirtual   #72  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//   19   41:pop             
	//   20   42:return          
	}

	ColorDetails getColorDetails()
	{
		return shading.getColorDetails();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field PdfShading shading>
	//    2    4:invokevirtual   #77  <Method ColorDetails PdfShading.getColorDetails()>
	//    3    7:areturn         
	}

	public float[] getMatrix()
	{
		return matrix;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float[] matrix>
	//    2    4:areturn         
	}

	PdfName getPatternName()
	{
		return patternName;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field PdfName patternName>
	//    2    4:areturn         
	}

	PdfIndirectReference getPatternReference()
	{
		if(patternReference == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field PdfIndirectReference patternReference>
	//*   2    4:ifnonnull       18
			patternReference = writer.getPdfIndirectReference();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field PdfWriter writer>
	//    6   12:invokevirtual   #88  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//    7   15:putfield        #85  <Field PdfIndirectReference patternReference>
		return patternReference;
	//    8   18:aload_0         
	//    9   19:getfield        #85  <Field PdfIndirectReference patternReference>
	//   10   22:areturn         
	}

	public PdfShading getShading()
	{
		return shading;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field PdfShading shading>
	//    2    4:areturn         
	}

	PdfName getShadingName()
	{
		return shading.getShadingName();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field PdfShading shading>
	//    2    4:invokevirtual   #93  <Method PdfName PdfShading.getShadingName()>
	//    3    7:areturn         
	}

	PdfIndirectReference getShadingReference()
	{
		return shading.getShadingReference();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field PdfShading shading>
	//    2    4:invokevirtual   #94  <Method PdfIndirectReference PdfShading.getShadingReference()>
	//    3    7:areturn         
	}

	public void setMatrix(float af[])
	{
		if(af.length != 6)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:bipush          6
	//*   3    4:icmpeq          24
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("the.matrix.size.must.be.6", new Object[0]));
	//    4    7:new             #97  <Class RuntimeException>
	//    5   10:dup             
	//    6   11:ldc1            #99  <String "the.matrix.size.must.be.6">
	//    7   13:iconst_0        
	//    8   14:anewarray       Object[]
	//    9   17:invokestatic    #107 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   20:invokespecial   #110 <Method void RuntimeException(String)>
	//   11   23:athrow          
		} else
		{
			matrix = af;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #21  <Field float[] matrix>
			return;
	//   15   29:return          
		}
	}

	void setName(int i)
	{
		patternName = new PdfName((new StringBuilder()).append("P").append(i).toString());
	//    0    0:aload_0         
	//    1    1:new             #31  <Class PdfName>
	//    2    4:dup             
	//    3    5:new             #113 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #114 <Method void StringBuilder()>
	//    6   12:ldc1            #116 <String "P">
	//    7   14:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:iload_1         
	//    9   18:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   10   21:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   11   24:invokespecial   #128 <Method void PdfName(String)>
	//   12   27:putfield        #83  <Field PdfName patternName>
	//   13   30:return          
	}

	protected float matrix[] = {
		1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F
	};
	protected PdfName patternName;
	protected PdfIndirectReference patternReference;
	protected PdfShading shading;
	protected PdfWriter writer;
}
