// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfTemplate, PdfPattern, PdfWriter, PdfContentByte, 
//			PdfSpotColor

public final class PdfPatternPainter extends PdfTemplate
{

	private PdfPatternPainter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void PdfTemplate()>
		stencil = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean stencil>
		type = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #21  <Field int type>
	//    8   14:return          
	}

	PdfPatternPainter(PdfWriter pdfwriter)
	{
		super(pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void PdfTemplate(PdfWriter)>
		stencil = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field boolean stencil>
		type = 3;
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:putfield        #21  <Field int type>
	//    9   15:return          
	}

	PdfPatternPainter(PdfWriter pdfwriter, BaseColor basecolor)
	{
		this(pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void PdfPatternPainter(PdfWriter)>
		stencil = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #17  <Field boolean stencil>
		if(basecolor == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       22
		{
			defaultColor = BaseColor.GRAY;
	//    8   14:aload_0         
	//    9   15:getstatic       #32  <Field BaseColor BaseColor.GRAY>
	//   10   18:putfield        #34  <Field BaseColor defaultColor>
			return;
	//   11   21:return          
		} else
		{
			defaultColor = basecolor;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #34  <Field BaseColor defaultColor>
			return;
	//   15   27:return          
		}
	}

	public void addImage(Image image, float f, float f1, float f2, float f3, float f4, float f5)
		throws DocumentException
	{
		if(stencil && !image.isMask())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean stencil>
	//*   2    4:ifeq            18
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #44  <Method boolean Image.isMask()>
	//*   5   11:ifne            18
			checkNoColor();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #47  <Method void checkNoColor()>
		super.addImage(image, f, f1, f2, f3, f4, f5);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:fload_2         
	//   11   21:fload_3         
	//   12   22:fload           4
	//   13   24:fload           5
	//   14   26:fload           6
	//   15   28:fload           7
	//   16   30:invokespecial   #49  <Method void PdfTemplate.addImage(Image, float, float, float, float, float, float)>
	//   17   33:return          
	}

	void checkNoColor()
	{
		if(stencil)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean stencil>
	//*   2    4:ifeq            24
			throw new RuntimeException(MessageLocalization.getComposedMessage("colors.are.not.allowed.in.uncolored.tile.patterns", new Object[0]));
	//    3    7:new             #52  <Class RuntimeException>
	//    4   10:dup             
	//    5   11:ldc1            #54  <String "colors.are.not.allowed.in.uncolored.tile.patterns">
	//    6   13:iconst_0        
	//    7   14:anewarray       Object[]
	//    8   17:invokestatic    #62  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   20:invokespecial   #65  <Method void RuntimeException(String)>
	//   10   23:athrow          
		else
			return;
	//   11   24:return          
	}

	public BaseColor getDefaultColor()
	{
		return defaultColor;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field BaseColor defaultColor>
	//    2    4:areturn         
	}

	public PdfContentByte getDuplicate()
	{
		PdfPatternPainter pdfpatternpainter = new PdfPatternPainter();
	//    0    0:new             #2   <Class PdfPatternPainter>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void PdfPatternPainter()>
	//    3    7:astore_1        
		pdfpatternpainter.writer = writer;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #74  <Field PdfWriter writer>
	//    7   13:putfield        #74  <Field PdfWriter writer>
		pdfpatternpainter.pdf = pdf;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #78  <Field PdfDocument pdf>
	//   11   21:putfield        #78  <Field PdfDocument pdf>
		pdfpatternpainter.thisReference = thisReference;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #82  <Field PdfIndirectReference thisReference>
	//   15   29:putfield        #82  <Field PdfIndirectReference thisReference>
		pdfpatternpainter.pageResources = pageResources;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #86  <Field PageResources pageResources>
	//   19   37:putfield        #86  <Field PageResources pageResources>
		pdfpatternpainter.bBox = new Rectangle(bBox);
	//   20   40:aload_1         
	//   21   41:new             #88  <Class Rectangle>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #92  <Field Rectangle bBox>
	//   25   49:invokespecial   #95  <Method void Rectangle(Rectangle)>
	//   26   52:putfield        #92  <Field Rectangle bBox>
		pdfpatternpainter.xstep = xstep;
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #97  <Field float xstep>
	//   30   60:putfield        #97  <Field float xstep>
		pdfpatternpainter.ystep = ystep;
	//   31   63:aload_1         
	//   32   64:aload_0         
	//   33   65:getfield        #99  <Field float ystep>
	//   34   68:putfield        #99  <Field float ystep>
		pdfpatternpainter.matrix = matrix;
	//   35   71:aload_1         
	//   36   72:aload_0         
	//   37   73:getfield        #103 <Field PdfArray matrix>
	//   38   76:putfield        #103 <Field PdfArray matrix>
		pdfpatternpainter.stencil = stencil;
	//   39   79:aload_1         
	//   40   80:aload_0         
	//   41   81:getfield        #17  <Field boolean stencil>
	//   42   84:putfield        #17  <Field boolean stencil>
		pdfpatternpainter.defaultColor = defaultColor;
	//   43   87:aload_1         
	//   44   88:aload_0         
	//   45   89:getfield        #34  <Field BaseColor defaultColor>
	//   46   92:putfield        #34  <Field BaseColor defaultColor>
		return ((PdfContentByte) (pdfpatternpainter));
	//   47   95:aload_1         
	//   48   96:areturn         
	}

	public PdfPattern getPattern()
	{
		return new PdfPattern(this);
	//    0    0:new             #107 <Class PdfPattern>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #110 <Method void PdfPattern(PdfPatternPainter)>
	//    4    8:areturn         
	}

	public PdfPattern getPattern(int i)
	{
		return new PdfPattern(this, i);
	//    0    0:new             #107 <Class PdfPattern>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #114 <Method void PdfPattern(PdfPatternPainter, int)>
	//    5    9:areturn         
	}

	public float getXStep()
	{
		return xstep;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field float xstep>
	//    2    4:freturn         
	}

	public float getYStep()
	{
		return ystep;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field float ystep>
	//    2    4:freturn         
	}

	public boolean isStencil()
	{
		return stencil;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean stencil>
	//    2    4:ireturn         
	}

	public void resetCMYKColorFill()
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.resetCMYKColorFill();
	//    2    4:aload_0         
	//    3    5:invokespecial   #121 <Method void PdfTemplate.resetCMYKColorFill()>
	//    4    8:return          
	}

	public void resetCMYKColorStroke()
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.resetCMYKColorStroke();
	//    2    4:aload_0         
	//    3    5:invokespecial   #124 <Method void PdfTemplate.resetCMYKColorStroke()>
	//    4    8:return          
	}

	public void resetGrayFill()
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.resetGrayFill();
	//    2    4:aload_0         
	//    3    5:invokespecial   #127 <Method void PdfTemplate.resetGrayFill()>
	//    4    8:return          
	}

	public void resetGrayStroke()
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.resetGrayStroke();
	//    2    4:aload_0         
	//    3    5:invokespecial   #130 <Method void PdfTemplate.resetGrayStroke()>
	//    4    8:return          
	}

	public void resetRGBColorFill()
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.resetRGBColorFill();
	//    2    4:aload_0         
	//    3    5:invokespecial   #133 <Method void PdfTemplate.resetRGBColorFill()>
	//    4    8:return          
	}

	public void resetRGBColorStroke()
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.resetRGBColorStroke();
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method void PdfTemplate.resetRGBColorStroke()>
	//    4    8:return          
	}

	public void setCMYKColorFill(int i, int j, int k, int l)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setCMYKColorFill(i, j, k, l);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #140 <Method void PdfTemplate.setCMYKColorFill(int, int, int, int)>
	//    8   13:return          
	}

	public void setCMYKColorFillF(float f, float f1, float f2, float f3)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setCMYKColorFillF(f, f1, f2, f3);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:invokespecial   #144 <Method void PdfTemplate.setCMYKColorFillF(float, float, float, float)>
	//    8   13:return          
	}

	public void setCMYKColorStroke(int i, int j, int k, int l)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setCMYKColorStroke(i, j, k, l);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #147 <Method void PdfTemplate.setCMYKColorStroke(int, int, int, int)>
	//    8   13:return          
	}

	public void setCMYKColorStrokeF(float f, float f1, float f2, float f3)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setCMYKColorStrokeF(f, f1, f2, f3);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:invokespecial   #150 <Method void PdfTemplate.setCMYKColorStrokeF(float, float, float, float)>
	//    8   13:return          
	}

	public void setColorFill(BaseColor basecolor)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setColorFill(basecolor);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #154 <Method void PdfTemplate.setColorFill(BaseColor)>
	//    5    9:return          
	}

	public void setColorFill(PdfSpotColor pdfspotcolor, float f)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setColorFill(pdfspotcolor, f);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:fload_2         
	//    5    7:invokespecial   #157 <Method void PdfTemplate.setColorFill(PdfSpotColor, float)>
	//    6   10:return          
	}

	public void setColorStroke(BaseColor basecolor)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setColorStroke(basecolor);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #160 <Method void PdfTemplate.setColorStroke(BaseColor)>
	//    5    9:return          
	}

	public void setColorStroke(PdfSpotColor pdfspotcolor, float f)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setColorStroke(pdfspotcolor, f);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:fload_2         
	//    5    7:invokespecial   #162 <Method void PdfTemplate.setColorStroke(PdfSpotColor, float)>
	//    6   10:return          
	}

	public void setGrayFill(float f)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setGrayFill(f);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:invokespecial   #166 <Method void PdfTemplate.setGrayFill(float)>
	//    5    9:return          
	}

	public void setGrayStroke(float f)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setGrayStroke(f);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:invokespecial   #169 <Method void PdfTemplate.setGrayStroke(float)>
	//    5    9:return          
	}

	public void setPatternFill(PdfPatternPainter pdfpatternpainter)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setPatternFill(pdfpatternpainter);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #172 <Method void PdfTemplate.setPatternFill(PdfPatternPainter)>
	//    5    9:return          
	}

	public void setPatternFill(PdfPatternPainter pdfpatternpainter, BaseColor basecolor, float f)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setPatternFill(pdfpatternpainter, basecolor, f);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:fload_3         
	//    6    8:invokespecial   #175 <Method void PdfTemplate.setPatternFill(PdfPatternPainter, BaseColor, float)>
	//    7   11:return          
	}

	public void setPatternMatrix(float f, float f1, float f2, float f3, float f4, float f5)
	{
		setMatrix(f, f1, f2, f3, f4, f5);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:invokevirtual   #180 <Method void setMatrix(float, float, float, float, float, float)>
	//    8   13:return          
	}

	public void setPatternStroke(PdfPatternPainter pdfpatternpainter)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setPatternStroke(pdfpatternpainter);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #183 <Method void PdfTemplate.setPatternStroke(PdfPatternPainter)>
	//    5    9:return          
	}

	public void setPatternStroke(PdfPatternPainter pdfpatternpainter, BaseColor basecolor, float f)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setPatternStroke(pdfpatternpainter, basecolor, f);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:fload_3         
	//    6    8:invokespecial   #185 <Method void PdfTemplate.setPatternStroke(PdfPatternPainter, BaseColor, float)>
	//    7   11:return          
	}

	public void setRGBColorFill(int i, int j, int k)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setRGBColorFill(i, j, k);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #189 <Method void PdfTemplate.setRGBColorFill(int, int, int)>
	//    7   11:return          
	}

	public void setRGBColorFillF(float f, float f1, float f2)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setRGBColorFillF(f, f1, f2);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:invokespecial   #193 <Method void PdfTemplate.setRGBColorFillF(float, float, float)>
	//    7   11:return          
	}

	public void setRGBColorStroke(int i, int j, int k)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setRGBColorStroke(i, j, k);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #196 <Method void PdfTemplate.setRGBColorStroke(int, int, int)>
	//    7   11:return          
	}

	public void setRGBColorStrokeF(float f, float f1, float f2)
	{
		checkNoColor();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method void checkNoColor()>
		super.setRGBColorStrokeF(f, f1, f2);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:invokespecial   #199 <Method void PdfTemplate.setRGBColorStrokeF(float, float, float)>
	//    7   11:return          
	}

	public void setXStep(float f)
	{
		xstep = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #97  <Field float xstep>
	//    3    5:return          
	}

	public void setYStep(float f)
	{
		ystep = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #99  <Field float ystep>
	//    3    5:return          
	}

	BaseColor defaultColor;
	boolean stencil;
	float xstep;
	float ystep;
}
