// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			Shape

public class Line
	implements Shape
{

	public Line()
	{
		this(0.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:invokespecial   #14  <Method void Line(float, float, float, float)>
	//    6    8:return          
	}

	public Line(float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		p1 = ((Point2D) (new com.itextpdf.awt.geom.Point2D.Float(f, f1)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class com.itextpdf.awt.geom.Point2D$Float>
	//    4    8:dup             
	//    5    9:fload_1         
	//    6   10:fload_2         
	//    7   11:invokespecial   #22  <Method void com.itextpdf.awt.geom.Point2D$Float(float, float)>
	//    8   14:putfield        #24  <Field Point2D p1>
		p2 = ((Point2D) (new com.itextpdf.awt.geom.Point2D.Float(f2, f3)));
	//    9   17:aload_0         
	//   10   18:new             #19  <Class com.itextpdf.awt.geom.Point2D$Float>
	//   11   21:dup             
	//   12   22:fload_3         
	//   13   23:fload           4
	//   14   25:invokespecial   #22  <Method void com.itextpdf.awt.geom.Point2D$Float(float, float)>
	//   15   28:putfield        #26  <Field Point2D p2>
	//   16   31:return          
	}

	public Line(Point2D point2d, Point2D point2d1)
	{
		this((float)point2d.getX(), (float)point2d.getY(), (float)point2d1.getX(), (float)point2d1.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method double Point2D.getX()>
	//    3    5:d2f             
	//    4    6:aload_1         
	//    5    7:invokevirtual   #36  <Method double Point2D.getY()>
	//    6   10:d2f             
	//    7   11:aload_2         
	//    8   12:invokevirtual   #33  <Method double Point2D.getX()>
	//    9   15:d2f             
	//   10   16:aload_2         
	//   11   17:invokevirtual   #36  <Method double Point2D.getY()>
	//   12   20:d2f             
	//   13   21:invokespecial   #14  <Method void Line(float, float, float, float)>
	//   14   24:return          
	}

	public List getBasePoints()
	{
		ArrayList arraylist = new ArrayList(2);
	//    0    0:new             #40  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:invokespecial   #43  <Method void ArrayList(int)>
	//    4    8:astore_1        
		((List) (arraylist)).add(((Object) (p1)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #24  <Field Point2D p1>
	//    8   14:invokeinterface #49  <Method boolean List.add(Object)>
	//    9   19:pop             
		((List) (arraylist)).add(((Object) (p2)));
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #26  <Field Point2D p2>
	//   13   25:invokeinterface #49  <Method boolean List.add(Object)>
	//   14   30:pop             
		return ((List) (arraylist));
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	private final Point2D p1;
	private final Point2D p2;
}
