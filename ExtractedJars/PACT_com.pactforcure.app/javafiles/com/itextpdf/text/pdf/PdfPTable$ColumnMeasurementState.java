// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPTable, PdfPCell

public static class PdfPTable$ColumnMeasurementState
{

	public void beginCell(PdfPCell pdfpcell, float f, float f1)
	{
		rowspan = pdfpcell.getRowspan();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method int PdfPCell.getRowspan()>
	//    3    5:putfield        #20  <Field int rowspan>
		colspan = pdfpcell.getColspan();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method int PdfPCell.getColspan()>
	//    7   13:putfield        #22  <Field int colspan>
		float f2;
		if(pdfpcell.hasCachedMaxHeight())
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #38  <Method boolean PdfPCell.hasCachedMaxHeight()>
	//*  10   20:ifeq            42
			f2 = pdfpcell.getCachedMaxHeight();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #42  <Method float PdfPCell.getCachedMaxHeight()>
	//   13   27:fstore          4
		else
	//*  14   29:aload_0         
	//*  15   30:fload           4
	//*  16   32:fload_3         
	//*  17   33:invokestatic    #48  <Method float Math.max(float, float)>
	//*  18   36:fload_2         
	//*  19   37:fadd            
	//*  20   38:putfield        #18  <Field float height>
	//*  21   41:return          
			f2 = pdfpcell.getMaxHeight();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #51  <Method float PdfPCell.getMaxHeight()>
	//   24   46:fstore          4
		height = Math.max(f2, f1) + f;
	//*  25   48:goto            29
	}

	public boolean cellEnds()
	{
		return rowspan == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int rowspan>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void consumeRowspan(float f, float f1)
	{
		rowspan = rowspan - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field int rowspan>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #20  <Field int rowspan>
	//    6   10:return          
	}

	public int colspan;
	public float height;
	public int rowspan;

	public PdfPTable$ColumnMeasurementState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		height = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #18  <Field float height>
		rowspan = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #20  <Field int rowspan>
		colspan = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #22  <Field int colspan>
	//   11   19:return          
	}
}
