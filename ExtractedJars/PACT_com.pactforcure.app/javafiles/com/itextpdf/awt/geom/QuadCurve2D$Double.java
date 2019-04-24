// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			QuadCurve2D, Rectangle2D, Point2D

public static class QuadCurve2D$Double extends QuadCurve2D
{

	public Rectangle2D getBounds2D()
	{
		double d = Math.min(Math.min(x1, x2), ctrlx);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field double x1>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field double x2>
	//    4    8:invokestatic    #33  <Method double Math.min(double, double)>
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field double ctrlx>
	//    7   15:invokestatic    #33  <Method double Math.min(double, double)>
	//    8   18:dstore_1        
		double d1 = Math.min(Math.min(y1, y2), ctrly);
	//    9   19:aload_0         
	//   10   20:getfield        #37  <Field double y1>
	//   11   23:aload_0         
	//   12   24:getfield        #39  <Field double y2>
	//   13   27:invokestatic    #33  <Method double Math.min(double, double)>
	//   14   30:aload_0         
	//   15   31:getfield        #41  <Field double ctrly>
	//   16   34:invokestatic    #33  <Method double Math.min(double, double)>
	//   17   37:dstore_3        
		return ((Rectangle2D) (new Rectangle2D$Double(d, d1, Math.max(Math.max(x1, x2), ctrlx) - d, Math.max(Math.max(y1, y2), ctrly) - d1)));
	//   18   38:new             #43  <Class Rectangle2D$Double>
	//   19   41:dup             
	//   20   42:dload_1         
	//   21   43:dload_3         
	//   22   44:aload_0         
	//   23   45:getfield        #25  <Field double x1>
	//   24   48:aload_0         
	//   25   49:getfield        #27  <Field double x2>
	//   26   52:invokestatic    #46  <Method double Math.max(double, double)>
	//   27   55:aload_0         
	//   28   56:getfield        #35  <Field double ctrlx>
	//   29   59:invokestatic    #46  <Method double Math.max(double, double)>
	//   30   62:dload_1         
	//   31   63:dsub            
	//   32   64:aload_0         
	//   33   65:getfield        #37  <Field double y1>
	//   34   68:aload_0         
	//   35   69:getfield        #39  <Field double y2>
	//   36   72:invokestatic    #46  <Method double Math.max(double, double)>
	//   37   75:aload_0         
	//   38   76:getfield        #41  <Field double ctrly>
	//   39   79:invokestatic    #46  <Method double Math.max(double, double)>
	//   40   82:dload_3         
	//   41   83:dsub            
	//   42   84:invokespecial   #49  <Method void Rectangle2D$Double(double, double, double, double)>
	//   43   87:areturn         
	}

	public Point2D getCtrlPt()
	{
		return ((Point2D) (new Point2D.Double(ctrlx, ctrly)));
	//    0    0:new             #53  <Class Point2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field double ctrlx>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field double ctrly>
	//    6   12:invokespecial   #56  <Method void Point2D$Double(double, double)>
	//    7   15:areturn         
	}

	public double getCtrlX()
	{
		return ctrlx;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field double ctrlx>
	//    2    4:dreturn         
	}

	public double getCtrlY()
	{
		return ctrly;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field double ctrly>
	//    2    4:dreturn         
	}

	public Point2D getP1()
	{
		return ((Point2D) (new Point2D.Double(x1, y1)));
	//    0    0:new             #53  <Class Point2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field double x1>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field double y1>
	//    6   12:invokespecial   #56  <Method void Point2D$Double(double, double)>
	//    7   15:areturn         
	}

	public Point2D getP2()
	{
		return ((Point2D) (new Point2D.Double(x2, y2)));
	//    0    0:new             #53  <Class Point2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field double x2>
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field double y2>
	//    6   12:invokespecial   #56  <Method void Point2D$Double(double, double)>
	//    7   15:areturn         
	}

	public double getX1()
	{
		return x1;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field double x1>
	//    2    4:dreturn         
	}

	public double getX2()
	{
		return x2;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field double x2>
	//    2    4:dreturn         
	}

	public double getY1()
	{
		return y1;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field double y1>
	//    2    4:dreturn         
	}

	public double getY2()
	{
		return y2;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field double y2>
	//    2    4:dreturn         
	}

	public void setCurve(double d, double d1, double d2, double d3, double d4, double d5)
	{
		x1 = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #25  <Field double x1>
		y1 = d1;
	//    3    5:aload_0         
	//    4    6:dload_3         
	//    5    7:putfield        #37  <Field double y1>
		ctrlx = d2;
	//    6   10:aload_0         
	//    7   11:dload           5
	//    8   13:putfield        #35  <Field double ctrlx>
		ctrly = d3;
	//    9   16:aload_0         
	//   10   17:dload           7
	//   11   19:putfield        #41  <Field double ctrly>
		x2 = d4;
	//   12   22:aload_0         
	//   13   23:dload           9
	//   14   25:putfield        #27  <Field double x2>
		y2 = d5;
	//   15   28:aload_0         
	//   16   29:dload           11
	//   17   31:putfield        #39  <Field double y2>
	//   18   34:return          
	}

	public double ctrlx;
	public double ctrly;
	public double x1;
	public double x2;
	public double y1;
	public double y2;

	public QuadCurve2D$Double()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void QuadCurve2D()>
	//    2    4:return          
	}

	public QuadCurve2D$Double(double d, double d1, double d2, double d3, double d4, double d5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void QuadCurve2D()>
		setCurve(d, d1, d2, d3, d4, d5);
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:dload_3         
	//    5    7:dload           5
	//    6    9:dload           7
	//    7   11:dload           9
	//    8   13:dload           11
	//    9   15:invokevirtual   #21  <Method void setCurve(double, double, double, double, double, double)>
	//   10   18:return          
	}
}
