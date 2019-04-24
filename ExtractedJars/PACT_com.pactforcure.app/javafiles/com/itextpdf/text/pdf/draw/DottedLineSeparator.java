// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.draw;

import com.itextpdf.text.pdf.PdfContentByte;

// Referenced classes of package com.itextpdf.text.pdf.draw:
//			LineSeparator

public class DottedLineSeparator extends LineSeparator
{

	public DottedLineSeparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void LineSeparator()>
		gap = 5F;
	//    2    4:aload_0         
	//    3    5:ldc1            #11  <Float 5F>
	//    4    7:putfield        #13  <Field float gap>
	//    5   10:return          
	}

	public void draw(PdfContentByte pdfcontentbyte, float f, float f1, float f2, float f3, float f4)
	{
		pdfcontentbyte.saveState();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method void PdfContentByte.saveState()>
		pdfcontentbyte.setLineWidth(lineWidth);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field float lineWidth>
	//    5    9:invokevirtual   #28  <Method void PdfContentByte.setLineWidth(float)>
		pdfcontentbyte.setLineCap(1);
	//    6   12:aload_1         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #32  <Method void PdfContentByte.setLineCap(int)>
		pdfcontentbyte.setLineDash(0.0F, gap, gap / 2.0F);
	//    9   17:aload_1         
	//   10   18:fconst_0        
	//   11   19:aload_0         
	//   12   20:getfield        #13  <Field float gap>
	//   13   23:aload_0         
	//   14   24:getfield        #13  <Field float gap>
	//   15   27:fconst_2        
	//   16   28:fdiv            
	//   17   29:invokevirtual   #36  <Method void PdfContentByte.setLineDash(float, float, float)>
		drawLine(pdfcontentbyte, f, f2, f4);
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:fload_2         
	//   21   35:fload           4
	//   22   37:fload           6
	//   23   39:invokevirtual   #40  <Method void drawLine(PdfContentByte, float, float, float)>
		pdfcontentbyte.restoreState();
	//   24   42:aload_1         
	//   25   43:invokevirtual   #43  <Method void PdfContentByte.restoreState()>
	//   26   46:return          
	}

	public float getGap()
	{
		return gap;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float gap>
	//    2    4:freturn         
	}

	public void setGap(float f)
	{
		gap = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #13  <Field float gap>
	//    3    5:return          
	}

	protected float gap;
}
