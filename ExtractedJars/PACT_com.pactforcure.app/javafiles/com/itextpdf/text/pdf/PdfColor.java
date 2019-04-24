// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.BaseColor;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfArray, PdfNumber

class PdfColor extends PdfArray
{

	PdfColor(int i, int j, int k)
	{
		super(((PdfObject) (new PdfNumber((double)(i & 0xff) / 255D))));
	//    0    0:aload_0         
	//    1    1:new             #8   <Class PdfNumber>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:sipush          255
	//    5    9:iand            
	//    6   10:i2d             
	//    7   11:ldc2w           #9   <Double 255D>
	//    8   14:ddiv            
	//    9   15:invokespecial   #13  <Method void PdfNumber(double)>
	//   10   18:invokespecial   #16  <Method void PdfArray(PdfObject)>
		add(((PdfObject) (new PdfNumber((double)(j & 0xff) / 255D))));
	//   11   21:aload_0         
	//   12   22:new             #8   <Class PdfNumber>
	//   13   25:dup             
	//   14   26:iload_2         
	//   15   27:sipush          255
	//   16   30:iand            
	//   17   31:i2d             
	//   18   32:ldc2w           #9   <Double 255D>
	//   19   35:ddiv            
	//   20   36:invokespecial   #13  <Method void PdfNumber(double)>
	//   21   39:invokevirtual   #20  <Method boolean add(PdfObject)>
	//   22   42:pop             
		add(((PdfObject) (new PdfNumber((double)(k & 0xff) / 255D))));
	//   23   43:aload_0         
	//   24   44:new             #8   <Class PdfNumber>
	//   25   47:dup             
	//   26   48:iload_3         
	//   27   49:sipush          255
	//   28   52:iand            
	//   29   53:i2d             
	//   30   54:ldc2w           #9   <Double 255D>
	//   31   57:ddiv            
	//   32   58:invokespecial   #13  <Method void PdfNumber(double)>
	//   33   61:invokevirtual   #20  <Method boolean add(PdfObject)>
	//   34   64:pop             
	//   35   65:return          
	}

	PdfColor(BaseColor basecolor)
	{
		this(basecolor.getRed(), basecolor.getGreen(), basecolor.getBlue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method int BaseColor.getRed()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method int BaseColor.getGreen()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method int BaseColor.getBlue()>
	//    7   13:invokespecial   #36  <Method void PdfColor(int, int, int)>
	//    8   16:return          
	}
}
