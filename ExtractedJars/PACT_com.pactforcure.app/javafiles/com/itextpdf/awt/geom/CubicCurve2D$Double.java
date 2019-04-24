// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			CubicCurve2D, Rectangle2D, Point2D

public static class CubicCurve2D$Double extends CubicCurve2D
{

	public Rectangle2D getBounds2D()
	{
		double d = Math.min(Math.min(x1, x2), Math.min(ctrlx1, ctrlx2));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field double x1>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field double x2>
	//    4    8:invokestatic    #35  <Method double Math.min(double, double)>
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field double ctrlx1>
	//    7   15:aload_0         
	//    8   16:getfield        #39  <Field double ctrlx2>
	//    9   19:invokestatic    #35  <Method double Math.min(double, double)>
	//   10   22:invokestatic    #35  <Method double Math.min(double, double)>
	//   11   25:dstore_1        
		double d1 = Math.min(Math.min(y1, y2), Math.min(ctrly1, ctrly2));
	//   12   26:aload_0         
	//   13   27:getfield        #41  <Field double y1>
	//   14   30:aload_0         
	//   15   31:getfield        #43  <Field double y2>
	//   16   34:invokestatic    #35  <Method double Math.min(double, double)>
	//   17   37:aload_0         
	//   18   38:getfield        #45  <Field double ctrly1>
	//   19   41:aload_0         
	//   20   42:getfield        #47  <Field double ctrly2>
	//   21   45:invokestatic    #35  <Method double Math.min(double, double)>
	//   22   48:invokestatic    #35  <Method double Math.min(double, double)>
	//   23   51:dstore_3        
		return ((Rectangle2D) (new Rectangle2D.Double(d, d1, Math.max(Math.max(x1, x2), Math.max(ctrlx1, ctrlx2)) - d, Math.max(Math.max(y1, y2), Math.max(ctrly1, ctrly2)) - d1)));
	//   24   52:new             #49  <Class Rectangle2D$Double>
	//   25   55:dup             
	//   26   56:dload_1         
	//   27   57:dload_3         
	//   28   58:aload_0         
	//   29   59:getfield        #27  <Field double x1>
	//   30   62:aload_0         
	//   31   63:getfield        #29  <Field double x2>
	//   32   66:invokestatic    #52  <Method double Math.max(double, double)>
	//   33   69:aload_0         
	//   34   70:getfield        #37  <Field double ctrlx1>
	//   35   73:aload_0         
	//   36   74:getfield        #39  <Field double ctrlx2>
	//   37   77:invokestatic    #52  <Method double Math.max(double, double)>
	//   38   80:invokestatic    #52  <Method double Math.max(double, double)>
	//   39   83:dload_1         
	//   40   84:dsub            
	//   41   85:aload_0         
	//   42   86:getfield        #41  <Field double y1>
	//   43   89:aload_0         
	//   44   90:getfield        #43  <Field double y2>
	//   45   93:invokestatic    #52  <Method double Math.max(double, double)>
	//   46   96:aload_0         
	//   47   97:getfield        #45  <Field double ctrly1>
	//   48  100:aload_0         
	//   49  101:getfield        #47  <Field double ctrly2>
	//   50  104:invokestatic    #52  <Method double Math.max(double, double)>
	//   51  107:invokestatic    #52  <Method double Math.max(double, double)>
	//   52  110:dload_3         
	//   53  111:dsub            
	//   54  112:invokespecial   #55  <Method void Rectangle2D$Double(double, double, double, double)>
	//   55  115:areturn         
	}

	public Point2D getCtrlP1()
	{
		return ((Point2D) (new Point2D.Double(ctrlx1, ctrly1)));
	//    0    0:new             #59  <Class Point2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field double ctrlx1>
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field double ctrly1>
	//    6   12:invokespecial   #62  <Method void Point2D$Double(double, double)>
	//    7   15:areturn         
	}

	public Point2D getCtrlP2()
	{
		return ((Point2D) (new Point2D.Double(ctrlx2, ctrly2)));
	//    0    0:new             #59  <Class Point2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field double ctrlx2>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field double ctrly2>
	//    6   12:invokespecial   #62  <Method void Point2D$Double(double, double)>
	//    7   15:areturn         
	}

	public double getCtrlX1()
	{
		return ctrlx1;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field double ctrlx1>
	//    2    4:dreturn         
	}

	public double getCtrlX2()
	{
		return ctrlx2;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field double ctrlx2>
	//    2    4:dreturn         
	}

	public double getCtrlY1()
	{
		return ctrly1;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field double ctrly1>
	//    2    4:dreturn         
	}

	public double getCtrlY2()
	{
		return ctrly2;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field double ctrly2>
	//    2    4:dreturn         
	}

	public Point2D getP1()
	{
		return ((Point2D) (new Point2D.Double(x1, y1)));
	//    0    0:new             #59  <Class Point2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field double x1>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field double y1>
	//    6   12:invokespecial   #62  <Method void Point2D$Double(double, double)>
	//    7   15:areturn         
	}

	public Point2D getP2()
	{
		return ((Point2D) (new Point2D.Double(x2, y2)));
	//    0    0:new             #59  <Class Point2D$Double>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field double x2>
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field double y2>
	//    6   12:invokespecial   #62  <Method void Point2D$Double(double, double)>
	//    7   15:areturn         
	}

	public double getX1()
	{
		return x1;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field double x1>
	//    2    4:dreturn         
	}

	public double getX2()
	{
		return x2;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field double x2>
	//    2    4:dreturn         
	}

	public double getY1()
	{
		return y1;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field double y1>
	//    2    4:dreturn         
	}

	public double getY2()
	{
		return y2;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field double y2>
	//    2    4:dreturn         
	}

	public void setCurve(double d, double d1, double d2, double d3, double d4, double d5, double d6, 
			double d7)
	{
		x1 = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #27  <Field double x1>
		y1 = d1;
	//    3    5:aload_0         
	//    4    6:dload_3         
	//    5    7:putfield        #41  <Field double y1>
		ctrlx1 = d2;
	//    6   10:aload_0         
	//    7   11:dload           5
	//    8   13:putfield        #37  <Field double ctrlx1>
		ctrly1 = d3;
	//    9   16:aload_0         
	//   10   17:dload           7
	//   11   19:putfield        #45  <Field double ctrly1>
		ctrlx2 = d4;
	//   12   22:aload_0         
	//   13   23:dload           9
	//   14   25:putfield        #39  <Field double ctrlx2>
		ctrly2 = d5;
	//   15   28:aload_0         
	//   16   29:dload           11
	//   17   31:putfield        #47  <Field double ctrly2>
		x2 = d6;
	//   18   34:aload_0         
	//   19   35:dload           13
	//   20   37:putfield        #29  <Field double x2>
		y2 = d7;
	//   21   40:aload_0         
	//   22   41:dload           15
	//   23   43:putfield        #43  <Field double y2>
	//   24   46:return          
	}

	public double ctrlx1;
	public double ctrlx2;
	public double ctrly1;
	public double ctrly2;
	public double x1;
	public double x2;
	public double y1;
	public double y2;

	public CubicCurve2D$Double()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void CubicCurve2D()>
	//    2    4:return          
	}

	public CubicCurve2D$Double(double d, double d1, double d2, double d3, double d4, double d5, double d6, 
			double d7)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void CubicCurve2D()>
		setCurve(d, d1, d2, d3, d4, d5, d6, d7);
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:dload_3         
	//    5    7:dload           5
	//    6    9:dload           7
	//    7   11:dload           9
	//    8   13:dload           11
	//    9   15:dload           13
	//   10   17:dload           15
	//   11   19:invokevirtual   #23  <Method void setCurve(double, double, double, double, double, double, double, double)>
	//   12   22:return          
	}
}
