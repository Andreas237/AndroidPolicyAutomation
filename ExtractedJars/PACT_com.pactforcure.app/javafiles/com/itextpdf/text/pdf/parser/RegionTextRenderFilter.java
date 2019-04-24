// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.awt.geom.Rectangle2D;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			RenderFilter, TextRenderInfo, LineSegment, Vector

public class RegionTextRenderFilter extends RenderFilter
{

	public RegionTextRenderFilter(Rectangle2D rectangle2d)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void RenderFilter()>
		filterRect = rectangle2d;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Rectangle2D filterRect>
	//    5    9:return          
	}

	public RegionTextRenderFilter(com.itextpdf.text.Rectangle rectangle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void RenderFilter()>
		filterRect = ((Rectangle2D) (new Rectangle(rectangle)));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Rectangle>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #19  <Method void Rectangle(com.itextpdf.text.Rectangle)>
	//    7   13:putfield        #13  <Field Rectangle2D filterRect>
	//    8   16:return          
	}

	public boolean allowText(TextRenderInfo textrenderinfo)
	{
		Object obj = ((Object) (textrenderinfo.getBaseline()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method LineSegment TextRenderInfo.getBaseline()>
	//    2    4:astore          6
		textrenderinfo = ((TextRenderInfo) (((LineSegment) (obj)).getStartPoint()));
	//    3    6:aload           6
	//    4    8:invokevirtual   #33  <Method Vector LineSegment.getStartPoint()>
	//    5   11:astore_1        
		obj = ((Object) (((LineSegment) (obj)).getEndPoint()));
	//    6   12:aload           6
	//    7   14:invokevirtual   #36  <Method Vector LineSegment.getEndPoint()>
	//    8   17:astore          6
		float f = ((Vector) (textrenderinfo)).get(0);
	//    9   19:aload_1         
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #42  <Method float Vector.get(int)>
	//   12   24:fstore_2        
		float f1 = ((Vector) (textrenderinfo)).get(1);
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #42  <Method float Vector.get(int)>
	//   16   30:fstore_3        
		float f2 = ((Vector) (obj)).get(0);
	//   17   31:aload           6
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #42  <Method float Vector.get(int)>
	//   20   37:fstore          4
		float f3 = ((Vector) (obj)).get(1);
	//   21   39:aload           6
	//   22   41:iconst_1        
	//   23   42:invokevirtual   #42  <Method float Vector.get(int)>
	//   24   45:fstore          5
		return filterRect.intersectsLine(f, f1, f2, f3);
	//   25   47:aload_0         
	//   26   48:getfield        #13  <Field Rectangle2D filterRect>
	//   27   51:fload_2         
	//   28   52:f2d             
	//   29   53:fload_3         
	//   30   54:f2d             
	//   31   55:fload           4
	//   32   57:f2d             
	//   33   58:fload           5
	//   34   60:f2d             
	//   35   61:invokevirtual   #48  <Method boolean Rectangle2D.intersectsLine(double, double, double, double)>
	//   36   64:ireturn         
	}

	private final Rectangle2D filterRect;
}
