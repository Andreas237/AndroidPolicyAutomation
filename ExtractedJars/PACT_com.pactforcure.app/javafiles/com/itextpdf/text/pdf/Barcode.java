// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfContentByte, PdfTemplate, BaseFont

public abstract class Barcode
{

	public Barcode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		code = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #55  <String "">
	//    4    7:putfield        #57  <Field String code>
		inkSpreading = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #59  <Field float inkSpreading>
	//    8   15:return          
	}

	public Image createImageWithBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		try
		{
			pdfcontentbyte = ((PdfContentByte) (Image.getInstance(createTemplateWithBarcode(pdfcontentbyte, basecolor, basecolor1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #68  <Method PdfTemplate createTemplateWithBarcode(PdfContentByte, BaseColor, BaseColor)>
	//    5    7:invokestatic    #74  <Method Image Image.getInstance(PdfTemplate)>
	//    6   10:astore_1        
		}
	//*   7   11:aload_1         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(PdfContentByte pdfcontentbyte)
	//*   9   13:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfcontentbyte)));
	//   10   14:new             #76  <Class ExceptionConverter>
	//   11   17:dup             
	//   12   18:aload_1         
	//   13   19:invokespecial   #79  <Method void ExceptionConverter(Exception)>
	//   14   22:athrow          
		}
		return ((Image) (pdfcontentbyte));
	}

	public PdfTemplate createTemplateWithBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1)
	{
		pdfcontentbyte = ((PdfContentByte) (pdfcontentbyte.createTemplate(0.0F, 0.0F)));
	//    0    0:aload_1         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:invokevirtual   #85  <Method PdfTemplate PdfContentByte.createTemplate(float, float)>
	//    4    6:astore_1        
		((PdfTemplate) (pdfcontentbyte)).setBoundingBox(placeBarcode(pdfcontentbyte, basecolor, basecolor1));
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:aload_3         
	//   10   12:invokevirtual   #89  <Method Rectangle placeBarcode(PdfContentByte, BaseColor, BaseColor)>
	//   11   15:invokevirtual   #95  <Method void PdfTemplate.setBoundingBox(Rectangle)>
		return ((PdfTemplate) (pdfcontentbyte));
	//   12   18:aload_1         
	//   13   19:areturn         
	}

	public String getAltText()
	{
		return altText;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String altText>
	//    2    4:areturn         
	}

	public float getBarHeight()
	{
		return barHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field float barHeight>
	//    2    4:freturn         
	}

	public abstract Rectangle getBarcodeSize();

	public float getBaseline()
	{
		return baseline;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field float baseline>
	//    2    4:freturn         
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String code>
	//    2    4:areturn         
	}

	public int getCodeType()
	{
		return codeType;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int codeType>
	//    2    4:ireturn         
	}

	public BaseFont getFont()
	{
		return font;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field BaseFont font>
	//    2    4:areturn         
	}

	public float getInkSpreading()
	{
		return inkSpreading;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field float inkSpreading>
	//    2    4:freturn         
	}

	public float getN()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field float n>
	//    2    4:freturn         
	}

	public float getSize()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field float size>
	//    2    4:freturn         
	}

	public int getTextAlignment()
	{
		return textAlignment;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field int textAlignment>
	//    2    4:ireturn         
	}

	public float getX()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field float x>
	//    2    4:freturn         
	}

	public boolean isChecksumText()
	{
		return checksumText;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field boolean checksumText>
	//    2    4:ireturn         
	}

	public boolean isExtended()
	{
		return extended;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field boolean extended>
	//    2    4:ireturn         
	}

	public boolean isGenerateChecksum()
	{
		return generateChecksum;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field boolean generateChecksum>
	//    2    4:ireturn         
	}

	public boolean isGuardBars()
	{
		return guardBars;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field boolean guardBars>
	//    2    4:ireturn         
	}

	public boolean isStartStopText()
	{
		return startStopText;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field boolean startStopText>
	//    2    4:ireturn         
	}

	public abstract Rectangle placeBarcode(PdfContentByte pdfcontentbyte, BaseColor basecolor, BaseColor basecolor1);

	public void setAltText(String s)
	{
		altText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field String altText>
	//    3    5:return          
	}

	public void setBarHeight(float f)
	{
		barHeight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #103 <Field float barHeight>
	//    3    5:return          
	}

	public void setBaseline(float f)
	{
		baseline = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #108 <Field float baseline>
	//    3    5:return          
	}

	public void setChecksumText(boolean flag)
	{
		checksumText = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #134 <Field boolean checksumText>
	//    3    5:return          
	}

	public void setCode(String s)
	{
		code = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field String code>
	//    3    5:return          
	}

	public void setCodeType(int i)
	{
		codeType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #113 <Field int codeType>
	//    3    5:return          
	}

	public void setExtended(boolean flag)
	{
		extended = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #137 <Field boolean extended>
	//    3    5:return          
	}

	public void setFont(BaseFont basefont)
	{
		font = basefont;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field BaseFont font>
	//    3    5:return          
	}

	public void setGenerateChecksum(boolean flag)
	{
		generateChecksum = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #140 <Field boolean generateChecksum>
	//    3    5:return          
	}

	public void setGuardBars(boolean flag)
	{
		guardBars = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #143 <Field boolean guardBars>
	//    3    5:return          
	}

	public void setInkSpreading(float f)
	{
		inkSpreading = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #59  <Field float inkSpreading>
	//    3    5:return          
	}

	public void setN(float f)
	{
		n = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #121 <Field float n>
	//    3    5:return          
	}

	public void setSize(float f)
	{
		size = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #124 <Field float size>
	//    3    5:return          
	}

	public void setStartStopText(boolean flag)
	{
		startStopText = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #146 <Field boolean startStopText>
	//    3    5:return          
	}

	public void setTextAlignment(int i)
	{
		textAlignment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #127 <Field int textAlignment>
	//    3    5:return          
	}

	public void setX(float f)
	{
		x = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #130 <Field float x>
	//    3    5:return          
	}

	public static final int CODABAR = 12;
	public static final int CODE128 = 9;
	public static final int CODE128_RAW = 11;
	public static final int CODE128_UCC = 10;
	public static final int EAN13 = 1;
	public static final int EAN8 = 2;
	public static final int PLANET = 8;
	public static final int POSTNET = 7;
	public static final int SUPP2 = 5;
	public static final int SUPP5 = 6;
	public static final int UPCA = 3;
	public static final int UPCE = 4;
	protected String altText;
	protected float barHeight;
	protected float baseline;
	protected boolean checksumText;
	protected String code;
	protected int codeType;
	protected boolean extended;
	protected BaseFont font;
	protected boolean generateChecksum;
	protected boolean guardBars;
	protected float inkSpreading;
	protected float n;
	protected float size;
	protected boolean startStopText;
	protected int textAlignment;
	protected float x;
}
