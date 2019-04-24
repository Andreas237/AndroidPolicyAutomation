// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			QuadCurve2D, Rectangle2D, Point2D

public static class QuadCurve2D$Float extends QuadCurve2D
{

	public Rectangle2D getBounds2D()
	{
		float f = Math.min(Math.min(x1, x2), ctrlx);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float x1>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field float x2>
	//    4    8:invokestatic    #33  <Method float Math.min(float, float)>
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field float ctrlx>
	//    7   15:invokestatic    #33  <Method float Math.min(float, float)>
	//    8   18:fstore_1        
		float f1 = Math.min(Math.min(y1, y2), ctrly);
	//    9   19:aload_0         
	//   10   20:getfield        #37  <Field float y1>
	//   11   23:aload_0         
	//   12   24:getfield        #39  <Field float y2>
	//   13   27:invokestatic    #33  <Method float Math.min(float, float)>
	//   14   30:aload_0         
	//   15   31:getfield        #41  <Field float ctrly>
	//   16   34:invokestatic    #33  <Method float Math.min(float, float)>
	//   17   37:fstore_2        
		return ((Rectangle2D) (new Rectangle2D$Float(f, f1, Math.max(Math.max(x1, x2), ctrlx) - f, Math.max(Math.max(y1, y2), ctrly) - f1)));
	//   18   38:new             #43  <Class Rectangle2D$Float>
	//   19   41:dup             
	//   20   42:fload_1         
	//   21   43:fload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #25  <Field float x1>
	//   24   48:aload_0         
	//   25   49:getfield        #27  <Field float x2>
	//   26   52:invokestatic    #46  <Method float Math.max(float, float)>
	//   27   55:aload_0         
	//   28   56:getfield        #35  <Field float ctrlx>
	//   29   59:invokestatic    #46  <Method float Math.max(float, float)>
	//   30   62:fload_1         
	//   31   63:fsub            
	//   32   64:aload_0         
	//   33   65:getfield        #37  <Field float y1>
	//   34   68:aload_0         
	//   35   69:getfield        #39  <Field float y2>
	//   36   72:invokestatic    #46  <Method float Math.max(float, float)>
	//   37   75:aload_0         
	//   38   76:getfield        #41  <Field float ctrly>
	//   39   79:invokestatic    #46  <Method float Math.max(float, float)>
	//   40   82:fload_2         
	//   41   83:fsub            
	//   42   84:invokespecial   #49  <Method void Rectangle2D$Float(float, float, float, float)>
	//   43   87:areturn         
	}

	public Point2D getCtrlPt()
	{
		return ((Point2D) (new Point2D.Float(ctrlx, ctrly)));
	//    0    0:new             #53  <Class Point2D$Float>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field float ctrlx>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field float ctrly>
	//    6   12:invokespecial   #56  <Method void Point2D$Float(float, float)>
	//    7   15:areturn         
	}

	public double getCtrlX()
	{
		return (double)ctrlx;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float ctrlx>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getCtrlY()
	{
		return (double)ctrly;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float ctrly>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public Point2D getP1()
	{
		return ((Point2D) (new Point2D.Float(x1, y1)));
	//    0    0:new             #53  <Class Point2D$Float>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field float x1>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field float y1>
	//    6   12:invokespecial   #56  <Method void Point2D$Float(float, float)>
	//    7   15:areturn         
	}

	public Point2D getP2()
	{
		return ((Point2D) (new Point2D.Float(x2, y2)));
	//    0    0:new             #53  <Class Point2D$Float>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field float x2>
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field float y2>
	//    6   12:invokespecial   #56  <Method void Point2D$Float(float, float)>
	//    7   15:areturn         
	}

	public double getX1()
	{
		return (double)x1;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float x1>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getX2()
	{
		return (double)x2;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float x2>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getY1()
	{
		return (double)y1;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field float y1>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getY2()
	{
		return (double)y2;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field float y2>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public void setCurve(double d, double d1, double d2, double d3, double d4, double d5)
	{
		x1 = (float)d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:d2f             
	//    3    3:putfield        #25  <Field float x1>
		y1 = (float)d1;
	//    4    6:aload_0         
	//    5    7:dload_3         
	//    6    8:d2f             
	//    7    9:putfield        #37  <Field float y1>
		ctrlx = (float)d2;
	//    8   12:aload_0         
	//    9   13:dload           5
	//   10   15:d2f             
	//   11   16:putfield        #35  <Field float ctrlx>
		ctrly = (float)d3;
	//   12   19:aload_0         
	//   13   20:dload           7
	//   14   22:d2f             
	//   15   23:putfield        #41  <Field float ctrly>
		x2 = (float)d4;
	//   16   26:aload_0         
	//   17   27:dload           9
	//   18   29:d2f             
	//   19   30:putfield        #27  <Field float x2>
		y2 = (float)d5;
	//   20   33:aload_0         
	//   21   34:dload           11
	//   22   36:d2f             
	//   23   37:putfield        #39  <Field float y2>
	//   24   40:return          
	}

	public void setCurve(float f, float f1, float f2, float f3, float f4, float f5)
	{
		x1 = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #25  <Field float x1>
		y1 = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #37  <Field float y1>
		ctrlx = f2;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #35  <Field float ctrlx>
		ctrly = f3;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #41  <Field float ctrly>
		x2 = f4;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #27  <Field float x2>
		y2 = f5;
	//   15   27:aload_0         
	//   16   28:fload           6
	//   17   30:putfield        #39  <Field float y2>
	//   18   33:return          
	}

	public float ctrlx;
	public float ctrly;
	public float x1;
	public float x2;
	public float y1;
	public float y2;

	public QuadCurve2D$Float()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void QuadCurve2D()>
	//    2    4:return          
	}

	public QuadCurve2D$Float(float f, float f1, float f2, float f3, float f4, float f5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void QuadCurve2D()>
		setCurve(f, f1, f2, f3, f4, f5);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:fload           5
	//    8   12:fload           6
	//    9   14:invokevirtual   #21  <Method void setCurve(float, float, float, float, float, float)>
	//   10   17:return          
	}
}
