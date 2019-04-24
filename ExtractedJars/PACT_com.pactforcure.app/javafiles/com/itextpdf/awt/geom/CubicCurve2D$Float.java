// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			CubicCurve2D, Rectangle2D, Point2D

public static class CubicCurve2D$Float extends CubicCurve2D
{

	public Rectangle2D getBounds2D()
	{
		float f = Math.min(Math.min(x1, x2), Math.min(ctrlx1, ctrlx2));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float x1>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field float x2>
	//    4    8:invokestatic    #35  <Method float Math.min(float, float)>
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field float ctrlx1>
	//    7   15:aload_0         
	//    8   16:getfield        #39  <Field float ctrlx2>
	//    9   19:invokestatic    #35  <Method float Math.min(float, float)>
	//   10   22:invokestatic    #35  <Method float Math.min(float, float)>
	//   11   25:fstore_1        
		float f1 = Math.min(Math.min(y1, y2), Math.min(ctrly1, ctrly2));
	//   12   26:aload_0         
	//   13   27:getfield        #41  <Field float y1>
	//   14   30:aload_0         
	//   15   31:getfield        #43  <Field float y2>
	//   16   34:invokestatic    #35  <Method float Math.min(float, float)>
	//   17   37:aload_0         
	//   18   38:getfield        #45  <Field float ctrly1>
	//   19   41:aload_0         
	//   20   42:getfield        #47  <Field float ctrly2>
	//   21   45:invokestatic    #35  <Method float Math.min(float, float)>
	//   22   48:invokestatic    #35  <Method float Math.min(float, float)>
	//   23   51:fstore_2        
		return ((Rectangle2D) (new Rectangle2D.Float(f, f1, Math.max(Math.max(x1, x2), Math.max(ctrlx1, ctrlx2)) - f, Math.max(Math.max(y1, y2), Math.max(ctrly1, ctrly2)) - f1)));
	//   24   52:new             #49  <Class Rectangle2D$Float>
	//   25   55:dup             
	//   26   56:fload_1         
	//   27   57:fload_2         
	//   28   58:aload_0         
	//   29   59:getfield        #27  <Field float x1>
	//   30   62:aload_0         
	//   31   63:getfield        #29  <Field float x2>
	//   32   66:invokestatic    #52  <Method float Math.max(float, float)>
	//   33   69:aload_0         
	//   34   70:getfield        #37  <Field float ctrlx1>
	//   35   73:aload_0         
	//   36   74:getfield        #39  <Field float ctrlx2>
	//   37   77:invokestatic    #52  <Method float Math.max(float, float)>
	//   38   80:invokestatic    #52  <Method float Math.max(float, float)>
	//   39   83:fload_1         
	//   40   84:fsub            
	//   41   85:aload_0         
	//   42   86:getfield        #41  <Field float y1>
	//   43   89:aload_0         
	//   44   90:getfield        #43  <Field float y2>
	//   45   93:invokestatic    #52  <Method float Math.max(float, float)>
	//   46   96:aload_0         
	//   47   97:getfield        #45  <Field float ctrly1>
	//   48  100:aload_0         
	//   49  101:getfield        #47  <Field float ctrly2>
	//   50  104:invokestatic    #52  <Method float Math.max(float, float)>
	//   51  107:invokestatic    #52  <Method float Math.max(float, float)>
	//   52  110:fload_2         
	//   53  111:fsub            
	//   54  112:invokespecial   #55  <Method void Rectangle2D$Float(float, float, float, float)>
	//   55  115:areturn         
	}

	public Point2D getCtrlP1()
	{
		return ((Point2D) (new Point2D.Float(ctrlx1, ctrly1)));
	//    0    0:new             #59  <Class Point2D$Float>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field float ctrlx1>
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field float ctrly1>
	//    6   12:invokespecial   #62  <Method void Point2D$Float(float, float)>
	//    7   15:areturn         
	}

	public Point2D getCtrlP2()
	{
		return ((Point2D) (new Point2D.Float(ctrlx2, ctrly2)));
	//    0    0:new             #59  <Class Point2D$Float>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field float ctrlx2>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field float ctrly2>
	//    6   12:invokespecial   #62  <Method void Point2D$Float(float, float)>
	//    7   15:areturn         
	}

	public double getCtrlX1()
	{
		return (double)ctrlx1;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field float ctrlx1>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getCtrlX2()
	{
		return (double)ctrlx2;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field float ctrlx2>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getCtrlY1()
	{
		return (double)ctrly1;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float ctrly1>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getCtrlY2()
	{
		return (double)ctrly2;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float ctrly2>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public Point2D getP1()
	{
		return ((Point2D) (new Point2D.Float(x1, y1)));
	//    0    0:new             #59  <Class Point2D$Float>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field float x1>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field float y1>
	//    6   12:invokespecial   #62  <Method void Point2D$Float(float, float)>
	//    7   15:areturn         
	}

	public Point2D getP2()
	{
		return ((Point2D) (new Point2D.Float(x2, y2)));
	//    0    0:new             #59  <Class Point2D$Float>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field float x2>
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field float y2>
	//    6   12:invokespecial   #62  <Method void Point2D$Float(float, float)>
	//    7   15:areturn         
	}

	public double getX1()
	{
		return (double)x1;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float x1>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getX2()
	{
		return (double)x2;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float x2>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getY1()
	{
		return (double)y1;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float y1>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public double getY2()
	{
		return (double)y2;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float y2>
	//    2    4:f2d             
	//    3    5:dreturn         
	}

	public void setCurve(double d, double d1, double d2, double d3, double d4, double d5, double d6, 
			double d7)
	{
		x1 = (float)d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:d2f             
	//    3    3:putfield        #27  <Field float x1>
		y1 = (float)d1;
	//    4    6:aload_0         
	//    5    7:dload_3         
	//    6    8:d2f             
	//    7    9:putfield        #41  <Field float y1>
		ctrlx1 = (float)d2;
	//    8   12:aload_0         
	//    9   13:dload           5
	//   10   15:d2f             
	//   11   16:putfield        #37  <Field float ctrlx1>
		ctrly1 = (float)d3;
	//   12   19:aload_0         
	//   13   20:dload           7
	//   14   22:d2f             
	//   15   23:putfield        #45  <Field float ctrly1>
		ctrlx2 = (float)d4;
	//   16   26:aload_0         
	//   17   27:dload           9
	//   18   29:d2f             
	//   19   30:putfield        #39  <Field float ctrlx2>
		ctrly2 = (float)d5;
	//   20   33:aload_0         
	//   21   34:dload           11
	//   22   36:d2f             
	//   23   37:putfield        #47  <Field float ctrly2>
		x2 = (float)d6;
	//   24   40:aload_0         
	//   25   41:dload           13
	//   26   43:d2f             
	//   27   44:putfield        #29  <Field float x2>
		y2 = (float)d7;
	//   28   47:aload_0         
	//   29   48:dload           15
	//   30   50:d2f             
	//   31   51:putfield        #43  <Field float y2>
	//   32   54:return          
	}

	public void setCurve(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
			float f7)
	{
		x1 = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #27  <Field float x1>
		y1 = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #41  <Field float y1>
		ctrlx1 = f2;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #37  <Field float ctrlx1>
		ctrly1 = f3;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #45  <Field float ctrly1>
		ctrlx2 = f4;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #39  <Field float ctrlx2>
		ctrly2 = f5;
	//   15   27:aload_0         
	//   16   28:fload           6
	//   17   30:putfield        #47  <Field float ctrly2>
		x2 = f6;
	//   18   33:aload_0         
	//   19   34:fload           7
	//   20   36:putfield        #29  <Field float x2>
		y2 = f7;
	//   21   39:aload_0         
	//   22   40:fload           8
	//   23   42:putfield        #43  <Field float y2>
	//   24   45:return          
	}

	public float ctrlx1;
	public float ctrlx2;
	public float ctrly1;
	public float ctrly2;
	public float x1;
	public float x2;
	public float y1;
	public float y2;

	public CubicCurve2D$Float()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void CubicCurve2D()>
	//    2    4:return          
	}

	public CubicCurve2D$Float(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
			float f7)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void CubicCurve2D()>
		setCurve(f, f1, f2, f3, f4, f5, f6, f7);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:fload           5
	//    8   12:fload           6
	//    9   14:fload           7
	//   10   16:fload           8
	//   11   18:invokevirtual   #23  <Method void setCurve(float, float, float, float, float, float, float, float)>
	//   12   21:return          
	}
}
