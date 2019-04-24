// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			Vector, Matrix

public class LineSegment
{

	public LineSegment(Vector vector, Vector vector1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		startPoint = vector;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field Vector startPoint>
		endPoint = vector1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field Vector endPoint>
	//    8   14:return          
	}

	public com.itextpdf.awt.geom.Rectangle2D.Float getBoundingRectange()
	{
		float f = getStartPoint().get(0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Vector getStartPoint()>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #29  <Method float Vector.get(int)>
	//    4    8:fstore_1        
		float f1 = getStartPoint().get(1);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #23  <Method Vector getStartPoint()>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #29  <Method float Vector.get(int)>
	//    9   17:fstore_2        
		float f2 = getEndPoint().get(0);
	//   10   18:aload_0         
	//   11   19:invokevirtual   #32  <Method Vector getEndPoint()>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #29  <Method float Vector.get(int)>
	//   14   26:fstore_3        
		float f3 = getEndPoint().get(1);
	//   15   27:aload_0         
	//   16   28:invokevirtual   #32  <Method Vector getEndPoint()>
	//   17   31:iconst_1        
	//   18   32:invokevirtual   #29  <Method float Vector.get(int)>
	//   19   35:fstore          4
		return new com.itextpdf.awt.geom.Rectangle2D.Float(Math.min(f, f2), Math.min(f1, f3), Math.abs(f2 - f), Math.abs(f3 - f1));
	//   20   37:new             #34  <Class com.itextpdf.awt.geom.Rectangle2D$Float>
	//   21   40:dup             
	//   22   41:fload_1         
	//   23   42:fload_3         
	//   24   43:invokestatic    #40  <Method float Math.min(float, float)>
	//   25   46:fload_2         
	//   26   47:fload           4
	//   27   49:invokestatic    #40  <Method float Math.min(float, float)>
	//   28   52:fload_3         
	//   29   53:fload_1         
	//   30   54:fsub            
	//   31   55:invokestatic    #44  <Method float Math.abs(float)>
	//   32   58:fload           4
	//   33   60:fload_2         
	//   34   61:fsub            
	//   35   62:invokestatic    #44  <Method float Math.abs(float)>
	//   36   65:invokespecial   #47  <Method void com.itextpdf.awt.geom.Rectangle2D$Float(float, float, float, float)>
	//   37   68:areturn         
	}

	public Vector getEndPoint()
	{
		return endPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Vector endPoint>
	//    2    4:areturn         
	}

	public float getLength()
	{
		return endPoint.subtract(startPoint).length();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Vector endPoint>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field Vector startPoint>
	//    4    8:invokevirtual   #53  <Method Vector Vector.subtract(Vector)>
	//    5   11:invokevirtual   #56  <Method float Vector.length()>
	//    6   14:freturn         
	}

	public Vector getStartPoint()
	{
		return startPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Vector startPoint>
	//    2    4:areturn         
	}

	public LineSegment transformBy(Matrix matrix)
	{
		return new LineSegment(startPoint.cross(matrix), endPoint.cross(matrix));
	//    0    0:new             #2   <Class LineSegment>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field Vector startPoint>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #62  <Method Vector Vector.cross(Matrix)>
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field Vector endPoint>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #62  <Method Vector Vector.cross(Matrix)>
	//   10   20:invokespecial   #64  <Method void LineSegment(Vector, Vector)>
	//   11   23:areturn         
	}

	private final Vector endPoint;
	private final Vector startPoint;
}
