// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.Map;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfPTable, PdfPRow

public static class PdfPTable$FittingRows
{

	public void correctLastRowChosen(PdfPTable pdfptable, int i)
	{
		pdfptable = ((PdfPTable) (pdfptable.getRow(i)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #40  <Method PdfPRow PdfPTable.getRow(int)>
	//    3    5:astore_1        
		Float float1 = (Float)correctedHeightsForLastRow.get(((Object) (Integer.valueOf(i))));
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field Map correctedHeightsForLastRow>
	//    6   10:iload_2         
	//    7   11:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//    8   14:invokeinterface #52  <Method Object Map.get(Object)>
	//    9   19:checkcast       #54  <Class Float>
	//   10   22:astore_3        
		if(float1 != null)
	//*  11   23:aload_3         
	//*  12   24:ifnull          35
			((PdfPRow) (pdfptable)).setFinalMaxHeights(float1.floatValue());
	//   13   27:aload_1         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #58  <Method float Float.floatValue()>
	//   16   32:invokevirtual   #64  <Method void PdfPRow.setFinalMaxHeights(float)>
	//   17   35:return          
	}

	public final float completedRowsHeight;
	private final Map correctedHeightsForLastRow;
	public final int firstRow;
	public final float height;
	public final int lastRow;

	public PdfPTable$FittingRows(int i, int j, float f, float f1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		firstRow = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int firstRow>
		lastRow = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field int lastRow>
		height = f;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #27  <Field float height>
		completedRowsHeight = f1;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #29  <Field float completedRowsHeight>
		correctedHeightsForLastRow = map;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #31  <Field Map correctedHeightsForLastRow>
	//   17   31:return          
	}
}
