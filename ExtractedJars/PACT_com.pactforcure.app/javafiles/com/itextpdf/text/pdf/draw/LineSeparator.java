// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.draw;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfContentByte;

// Referenced classes of package com.itextpdf.text.pdf.draw:
//			VerticalPositionMark

public class LineSeparator extends VerticalPositionMark
{

	public LineSeparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void VerticalPositionMark()>
		lineWidth = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #17  <Field float lineWidth>
		percentage = 100F;
	//    5    9:aload_0         
	//    6   10:ldc1            #18  <Float 100F>
	//    7   12:putfield        #20  <Field float percentage>
		alignment = 6;
	//    8   15:aload_0         
	//    9   16:bipush          6
	//   10   18:putfield        #22  <Field int alignment>
	//   11   21:return          
	}

	public LineSeparator(float f, float f1, BaseColor basecolor, int i, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void VerticalPositionMark()>
		lineWidth = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #17  <Field float lineWidth>
		percentage = 100F;
	//    5    9:aload_0         
	//    6   10:ldc1            #18  <Float 100F>
	//    7   12:putfield        #20  <Field float percentage>
		alignment = 6;
	//    8   15:aload_0         
	//    9   16:bipush          6
	//   10   18:putfield        #22  <Field int alignment>
		lineWidth = f;
	//   11   21:aload_0         
	//   12   22:fload_1         
	//   13   23:putfield        #17  <Field float lineWidth>
		percentage = f1;
	//   14   26:aload_0         
	//   15   27:fload_2         
	//   16   28:putfield        #20  <Field float percentage>
		lineColor = basecolor;
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:putfield        #26  <Field BaseColor lineColor>
		alignment = i;
	//   20   36:aload_0         
	//   21   37:iload           4
	//   22   39:putfield        #22  <Field int alignment>
		offset = f2;
	//   23   42:aload_0         
	//   24   43:fload           5
	//   25   45:putfield        #29  <Field float offset>
	//   26   48:return          
	}

	public LineSeparator(Font font)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void VerticalPositionMark()>
		lineWidth = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #17  <Field float lineWidth>
		percentage = 100F;
	//    5    9:aload_0         
	//    6   10:ldc1            #18  <Float 100F>
	//    7   12:putfield        #20  <Field float percentage>
		alignment = 6;
	//    8   15:aload_0         
	//    9   16:bipush          6
	//   10   18:putfield        #22  <Field int alignment>
		lineWidth = 0.06666667F * font.getSize();
	//   11   21:aload_0         
	//   12   22:ldc1            #31  <Float 0.06666667F>
	//   13   24:aload_1         
	//   14   25:invokevirtual   #37  <Method float Font.getSize()>
	//   15   28:fmul            
	//   16   29:putfield        #17  <Field float lineWidth>
		offset = -0.3333333F * font.getSize();
	//   17   32:aload_0         
	//   18   33:ldc1            #38  <Float -0.3333333F>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #37  <Method float Font.getSize()>
	//   21   39:fmul            
	//   22   40:putfield        #29  <Field float offset>
		percentage = 100F;
	//   23   43:aload_0         
	//   24   44:ldc1            #18  <Float 100F>
	//   25   46:putfield        #20  <Field float percentage>
		lineColor = font.getColor();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #42  <Method BaseColor Font.getColor()>
	//   29   54:putfield        #26  <Field BaseColor lineColor>
	//   30   57:return          
	}

	public void draw(PdfContentByte pdfcontentbyte, float f, float f1, float f2, float f3, float f4)
	{
		pdfcontentbyte.saveState();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method void PdfContentByte.saveState()>
		drawLine(pdfcontentbyte, f, f2, f4);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:fload_2         
	//    5    7:fload           4
	//    6    9:fload           6
	//    7   11:invokevirtual   #53  <Method void drawLine(PdfContentByte, float, float, float)>
		pdfcontentbyte.restoreState();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #56  <Method void PdfContentByte.restoreState()>
	//   10   18:return          
	}

	public void drawLine(PdfContentByte pdfcontentbyte, float f, float f1, float f2)
	{
		float f3;
		if(getPercentage() < 0.0F)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #59  <Method float getPercentage()>
	//*   2    4:fconst_0        
	//*   3    5:fcmpg           
	//*   4    6:ifge            116
			f3 = -getPercentage();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #59  <Method float getPercentage()>
	//    7   13:fneg            
	//    8   14:fstore          5
		else
	//*   9   16:aload_0         
	//*  10   17:invokevirtual   #63  <Method int getAlignment()>
	//*  11   20:tableswitch     0 2: default 48
	//	               0 132
	//	               1 48
	//	               2 137
	//*  12   48:fload_3         
	//*  13   49:fload_2         
	//*  14   50:fsub            
	//*  15   51:fload           5
	//*  16   53:fsub            
	//*  17   54:fconst_2        
	//*  18   55:fdiv            
	//*  19   56:fstore_3        
	//*  20   57:aload_1         
	//*  21   58:aload_0         
	//*  22   59:invokevirtual   #66  <Method float getLineWidth()>
	//*  23   62:invokevirtual   #70  <Method void PdfContentByte.setLineWidth(float)>
	//*  24   65:aload_0         
	//*  25   66:invokevirtual   #73  <Method BaseColor getLineColor()>
	//*  26   69:ifnull          80
	//*  27   72:aload_1         
	//*  28   73:aload_0         
	//*  29   74:invokevirtual   #73  <Method BaseColor getLineColor()>
	//*  30   77:invokevirtual   #77  <Method void PdfContentByte.setColorStroke(BaseColor)>
	//*  31   80:aload_1         
	//*  32   81:fload_3         
	//*  33   82:fload_2         
	//*  34   83:fadd            
	//*  35   84:aload_0         
	//*  36   85:getfield        #29  <Field float offset>
	//*  37   88:fload           4
	//*  38   90:fadd            
	//*  39   91:invokevirtual   #81  <Method void PdfContentByte.moveTo(float, float)>
	//*  40   94:aload_1         
	//*  41   95:fload_3         
	//*  42   96:fload           5
	//*  43   98:fadd            
	//*  44   99:fload_2         
	//*  45  100:fadd            
	//*  46  101:aload_0         
	//*  47  102:getfield        #29  <Field float offset>
	//*  48  105:fload           4
	//*  49  107:fadd            
	//*  50  108:invokevirtual   #84  <Method void PdfContentByte.lineTo(float, float)>
	//*  51  111:aload_1         
	//*  52  112:invokevirtual   #87  <Method void PdfContentByte.stroke()>
	//*  53  115:return          
			f3 = ((f1 - f) * getPercentage()) / 100F;
	//   54  116:fload_3         
	//   55  117:fload_2         
	//   56  118:fsub            
	//   57  119:aload_0         
	//   58  120:invokevirtual   #59  <Method float getPercentage()>
	//   59  123:fmul            
	//   60  124:ldc1            #18  <Float 100F>
	//   61  126:fdiv            
	//   62  127:fstore          5
		getAlignment();
		JVM INSTR tableswitch 0 2: default 48
	//	               0 132
	//	               1 48
	//	               2 137;
		   goto _L1 _L2 _L1 _L3
_L1:
		f1 = (f1 - f - f3) / 2.0F;
_L5:
		pdfcontentbyte.setLineWidth(getLineWidth());
		if(getLineColor() != null)
			pdfcontentbyte.setColorStroke(getLineColor());
		pdfcontentbyte.moveTo(f1 + f, offset + f2);
		pdfcontentbyte.lineTo(f1 + f3 + f, offset + f2);
		pdfcontentbyte.stroke();
		return;
	//*  63  129:goto            16
_L2:
		f1 = 0.0F;
	//   64  132:fconst_0        
	//   65  133:fstore_3        
		continue; /* Loop/switch isn't completed */
	//   66  134:goto            57
_L3:
		f1 = f1 - f - f3;
	//   67  137:fload_3         
	//   68  138:fload_2         
	//   69  139:fsub            
	//   70  140:fload           5
	//   71  142:fsub            
	//   72  143:fstore_3        
		if(true) goto _L5; else goto _L4
	//   73  144:goto            57
_L4:
	}

	public int getAlignment()
	{
		return alignment;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int alignment>
	//    2    4:ireturn         
	}

	public BaseColor getLineColor()
	{
		return lineColor;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field BaseColor lineColor>
	//    2    4:areturn         
	}

	public float getLineWidth()
	{
		return lineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field float lineWidth>
	//    2    4:freturn         
	}

	public float getPercentage()
	{
		return percentage;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float percentage>
	//    2    4:freturn         
	}

	public void setAlignment(int i)
	{
		alignment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int alignment>
	//    3    5:return          
	}

	public void setLineColor(BaseColor basecolor)
	{
		lineColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field BaseColor lineColor>
	//    3    5:return          
	}

	public void setLineWidth(float f)
	{
		lineWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #17  <Field float lineWidth>
	//    3    5:return          
	}

	public void setPercentage(float f)
	{
		percentage = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #20  <Field float percentage>
	//    3    5:return          
	}

	protected int alignment;
	protected BaseColor lineColor;
	protected float lineWidth;
	protected float percentage;
}
