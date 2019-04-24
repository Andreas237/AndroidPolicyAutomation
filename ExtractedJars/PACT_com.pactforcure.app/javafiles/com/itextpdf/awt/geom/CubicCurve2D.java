// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.gl.Crossing;
import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			Shape, Line2D, Point2D, Rectangle2D, 
//			FlatteningPathIterator, Rectangle, AffineTransform, PathIterator

public abstract class CubicCurve2D
	implements Shape, Cloneable
{
	public static class Double extends CubicCurve2D
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

		public Double()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void CubicCurve2D()>
		//    2    4:return          
		}

		public Double(double d, double d1, double d2, double d3, double d4, double d5, double d6, 
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

	public static class Float extends CubicCurve2D
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

		public Float()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void CubicCurve2D()>
		//    2    4:return          
		}

		public Float(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
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

	class Iterator
		implements PathIterator
	{

		public int currentSegment(double ad[])
		{
			if(isDone())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #34  <Method boolean isDone()>
		//*   2    4:ifeq            20
				throw new NoSuchElementException(Messages.getString("awt.4B"));
		//    3    7:new             #36  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:ldc1            #38  <String "awt.4B">
		//    6   13:invokestatic    #44  <Method String Messages.getString(String)>
		//    7   16:invokespecial   #47  <Method void NoSuchElementException(String)>
		//    8   19:athrow          
			int i;
			int j;
			if(index == 0)
		//*   9   20:aload_0         
		//*  10   21:getfield        #49  <Field int index>
		//*  11   24:ifne            72
			{
				j = 0;
		//   12   27:iconst_0        
		//   13   28:istore_3        
				ad[0] = c.getX1();
		//   14   29:aload_1         
		//   15   30:iconst_0        
		//   16   31:aload_0         
		//   17   32:getfield        #25  <Field CubicCurve2D c>
		//   18   35:invokevirtual   #53  <Method double CubicCurve2D.getX1()>
		//   19   38:dastore         
				ad[1] = c.getY1();
		//   20   39:aload_1         
		//   21   40:iconst_1        
		//   22   41:aload_0         
		//   23   42:getfield        #25  <Field CubicCurve2D c>
		//   24   45:invokevirtual   #56  <Method double CubicCurve2D.getY1()>
		//   25   48:dastore         
				i = 1;
		//   26   49:iconst_1        
		//   27   50:istore_2        
			} else
		//*  28   51:aload_0         
		//*  29   52:getfield        #27  <Field AffineTransform t>
		//*  30   55:ifnull          70
		//*  31   58:aload_0         
		//*  32   59:getfield        #27  <Field AffineTransform t>
		//*  33   62:aload_1         
		//*  34   63:iconst_0        
		//*  35   64:aload_1         
		//*  36   65:iconst_0        
		//*  37   66:iload_2         
		//*  38   67:invokevirtual   #62  <Method void AffineTransform.transform(double[], int, double[], int, int)>
		//*  39   70:iload_3         
		//*  40   71:ireturn         
			{
				j = 3;
		//   41   72:iconst_3        
		//   42   73:istore_3        
				ad[0] = c.getCtrlX1();
		//   43   74:aload_1         
		//   44   75:iconst_0        
		//   45   76:aload_0         
		//   46   77:getfield        #25  <Field CubicCurve2D c>
		//   47   80:invokevirtual   #65  <Method double CubicCurve2D.getCtrlX1()>
		//   48   83:dastore         
				ad[1] = c.getCtrlY1();
		//   49   84:aload_1         
		//   50   85:iconst_1        
		//   51   86:aload_0         
		//   52   87:getfield        #25  <Field CubicCurve2D c>
		//   53   90:invokevirtual   #68  <Method double CubicCurve2D.getCtrlY1()>
		//   54   93:dastore         
				ad[2] = c.getCtrlX2();
		//   55   94:aload_1         
		//   56   95:iconst_2        
		//   57   96:aload_0         
		//   58   97:getfield        #25  <Field CubicCurve2D c>
		//   59  100:invokevirtual   #71  <Method double CubicCurve2D.getCtrlX2()>
		//   60  103:dastore         
				ad[3] = c.getCtrlY2();
		//   61  104:aload_1         
		//   62  105:iconst_3        
		//   63  106:aload_0         
		//   64  107:getfield        #25  <Field CubicCurve2D c>
		//   65  110:invokevirtual   #74  <Method double CubicCurve2D.getCtrlY2()>
		//   66  113:dastore         
				ad[4] = c.getX2();
		//   67  114:aload_1         
		//   68  115:iconst_4        
		//   69  116:aload_0         
		//   70  117:getfield        #25  <Field CubicCurve2D c>
		//   71  120:invokevirtual   #77  <Method double CubicCurve2D.getX2()>
		//   72  123:dastore         
				ad[5] = c.getY2();
		//   73  124:aload_1         
		//   74  125:iconst_5        
		//   75  126:aload_0         
		//   76  127:getfield        #25  <Field CubicCurve2D c>
		//   77  130:invokevirtual   #80  <Method double CubicCurve2D.getY2()>
		//   78  133:dastore         
				i = 3;
		//   79  134:iconst_3        
		//   80  135:istore_2        
			}
			if(t != null)
				t.transform(ad, 0, ad, 0, i);
			return j;
		//*  81  136:goto            51
		}

		public int currentSegment(float af[])
		{
			if(isDone())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #34  <Method boolean isDone()>
		//*   2    4:ifeq            20
				throw new NoSuchElementException(Messages.getString("awt.4B"));
		//    3    7:new             #36  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:ldc1            #38  <String "awt.4B">
		//    6   13:invokestatic    #44  <Method String Messages.getString(String)>
		//    7   16:invokespecial   #47  <Method void NoSuchElementException(String)>
		//    8   19:athrow          
			int i;
			int j;
			if(index == 0)
		//*   9   20:aload_0         
		//*  10   21:getfield        #49  <Field int index>
		//*  11   24:ifne            74
			{
				j = 0;
		//   12   27:iconst_0        
		//   13   28:istore_3        
				af[0] = (float)c.getX1();
		//   14   29:aload_1         
		//   15   30:iconst_0        
		//   16   31:aload_0         
		//   17   32:getfield        #25  <Field CubicCurve2D c>
		//   18   35:invokevirtual   #53  <Method double CubicCurve2D.getX1()>
		//   19   38:d2f             
		//   20   39:fastore         
				af[1] = (float)c.getY1();
		//   21   40:aload_1         
		//   22   41:iconst_1        
		//   23   42:aload_0         
		//   24   43:getfield        #25  <Field CubicCurve2D c>
		//   25   46:invokevirtual   #56  <Method double CubicCurve2D.getY1()>
		//   26   49:d2f             
		//   27   50:fastore         
				i = 1;
		//   28   51:iconst_1        
		//   29   52:istore_2        
			} else
		//*  30   53:aload_0         
		//*  31   54:getfield        #27  <Field AffineTransform t>
		//*  32   57:ifnull          72
		//*  33   60:aload_0         
		//*  34   61:getfield        #27  <Field AffineTransform t>
		//*  35   64:aload_1         
		//*  36   65:iconst_0        
		//*  37   66:aload_1         
		//*  38   67:iconst_0        
		//*  39   68:iload_2         
		//*  40   69:invokevirtual   #84  <Method void AffineTransform.transform(float[], int, float[], int, int)>
		//*  41   72:iload_3         
		//*  42   73:ireturn         
			{
				j = 3;
		//   43   74:iconst_3        
		//   44   75:istore_3        
				af[0] = (float)c.getCtrlX1();
		//   45   76:aload_1         
		//   46   77:iconst_0        
		//   47   78:aload_0         
		//   48   79:getfield        #25  <Field CubicCurve2D c>
		//   49   82:invokevirtual   #65  <Method double CubicCurve2D.getCtrlX1()>
		//   50   85:d2f             
		//   51   86:fastore         
				af[1] = (float)c.getCtrlY1();
		//   52   87:aload_1         
		//   53   88:iconst_1        
		//   54   89:aload_0         
		//   55   90:getfield        #25  <Field CubicCurve2D c>
		//   56   93:invokevirtual   #68  <Method double CubicCurve2D.getCtrlY1()>
		//   57   96:d2f             
		//   58   97:fastore         
				af[2] = (float)c.getCtrlX2();
		//   59   98:aload_1         
		//   60   99:iconst_2        
		//   61  100:aload_0         
		//   62  101:getfield        #25  <Field CubicCurve2D c>
		//   63  104:invokevirtual   #71  <Method double CubicCurve2D.getCtrlX2()>
		//   64  107:d2f             
		//   65  108:fastore         
				af[3] = (float)c.getCtrlY2();
		//   66  109:aload_1         
		//   67  110:iconst_3        
		//   68  111:aload_0         
		//   69  112:getfield        #25  <Field CubicCurve2D c>
		//   70  115:invokevirtual   #74  <Method double CubicCurve2D.getCtrlY2()>
		//   71  118:d2f             
		//   72  119:fastore         
				af[4] = (float)c.getX2();
		//   73  120:aload_1         
		//   74  121:iconst_4        
		//   75  122:aload_0         
		//   76  123:getfield        #25  <Field CubicCurve2D c>
		//   77  126:invokevirtual   #77  <Method double CubicCurve2D.getX2()>
		//   78  129:d2f             
		//   79  130:fastore         
				af[5] = (float)c.getY2();
		//   80  131:aload_1         
		//   81  132:iconst_5        
		//   82  133:aload_0         
		//   83  134:getfield        #25  <Field CubicCurve2D c>
		//   84  137:invokevirtual   #80  <Method double CubicCurve2D.getY2()>
		//   85  140:d2f             
		//   86  141:fastore         
				i = 3;
		//   87  142:iconst_3        
		//   88  143:istore_2        
			}
			if(t != null)
				t.transform(af, 0, af, 0, i);
			return j;
		//*  89  144:goto            53
		}

		public int getWindingRule()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean isDone()
		{
			return index > 1;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int index>
		//    2    4:iconst_1        
		//    3    5:icmple          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public void next()
		{
			index = index + 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #49  <Field int index>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #49  <Field int index>
		//    6   10:return          
		}

		CubicCurve2D c;
		int index;
		AffineTransform t;
		final CubicCurve2D this$0;

		Iterator(CubicCurve2D cubiccurve2d1, AffineTransform affinetransform)
		{
			this$0 = CubicCurve2D.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field CubicCurve2D this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			c = cubiccurve2d1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field CubicCurve2D c>
			t = affinetransform;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field AffineTransform t>
		//   11   19:return          
		}
	}


	protected CubicCurve2D()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static double getFlatness(double d, double d1, double d2, double d3, 
			double d4, double d5, double d6, double d7)
	{
		return Math.sqrt(getFlatnessSq(d, d1, d2, d3, d4, d5, d6, d7));
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dload           4
	//    3    4:dload           6
	//    4    6:dload           8
	//    5    8:dload           10
	//    6   10:dload           12
	//    7   12:dload           14
	//    8   14:invokestatic    #27  <Method double getFlatnessSq(double, double, double, double, double, double, double, double)>
	//    9   17:invokestatic    #33  <Method double Math.sqrt(double)>
	//   10   20:dreturn         
	}

	public static double getFlatness(double ad[], int i)
	{
		return getFlatness(ad[i + 0], ad[i + 1], ad[i + 2], ad[i + 3], ad[i + 4], ad[i + 5], ad[i + 6], ad[i + 7]);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:iadd            
	//    4    4:daload          
	//    5    5:aload_0         
	//    6    6:iload_1         
	//    7    7:iconst_1        
	//    8    8:iadd            
	//    9    9:daload          
	//   10   10:aload_0         
	//   11   11:iload_1         
	//   12   12:iconst_2        
	//   13   13:iadd            
	//   14   14:daload          
	//   15   15:aload_0         
	//   16   16:iload_1         
	//   17   17:iconst_3        
	//   18   18:iadd            
	//   19   19:daload          
	//   20   20:aload_0         
	//   21   21:iload_1         
	//   22   22:iconst_4        
	//   23   23:iadd            
	//   24   24:daload          
	//   25   25:aload_0         
	//   26   26:iload_1         
	//   27   27:iconst_5        
	//   28   28:iadd            
	//   29   29:daload          
	//   30   30:aload_0         
	//   31   31:iload_1         
	//   32   32:bipush          6
	//   33   34:iadd            
	//   34   35:daload          
	//   35   36:aload_0         
	//   36   37:iload_1         
	//   37   38:bipush          7
	//   38   40:iadd            
	//   39   41:daload          
	//   40   42:invokestatic    #36  <Method double getFlatness(double, double, double, double, double, double, double, double)>
	//   41   45:dreturn         
	}

	public static double getFlatnessSq(double d, double d1, double d2, double d3, 
			double d4, double d5, double d6, double d7)
	{
		return Math.max(Line2D.ptSegDistSq(d, d1, d6, d7, d2, d3), Line2D.ptSegDistSq(d, d1, d6, d7, d4, d5));
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dload           12
	//    3    4:dload           14
	//    4    6:dload           4
	//    5    8:dload           6
	//    6   10:invokestatic    #42  <Method double Line2D.ptSegDistSq(double, double, double, double, double, double)>
	//    7   13:dload_0         
	//    8   14:dload_2         
	//    9   15:dload           12
	//   10   17:dload           14
	//   11   19:dload           8
	//   12   21:dload           10
	//   13   23:invokestatic    #42  <Method double Line2D.ptSegDistSq(double, double, double, double, double, double)>
	//   14   26:invokestatic    #46  <Method double Math.max(double, double)>
	//   15   29:dreturn         
	}

	public static double getFlatnessSq(double ad[], int i)
	{
		return getFlatnessSq(ad[i + 0], ad[i + 1], ad[i + 2], ad[i + 3], ad[i + 4], ad[i + 5], ad[i + 6], ad[i + 7]);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:iadd            
	//    4    4:daload          
	//    5    5:aload_0         
	//    6    6:iload_1         
	//    7    7:iconst_1        
	//    8    8:iadd            
	//    9    9:daload          
	//   10   10:aload_0         
	//   11   11:iload_1         
	//   12   12:iconst_2        
	//   13   13:iadd            
	//   14   14:daload          
	//   15   15:aload_0         
	//   16   16:iload_1         
	//   17   17:iconst_3        
	//   18   18:iadd            
	//   19   19:daload          
	//   20   20:aload_0         
	//   21   21:iload_1         
	//   22   22:iconst_4        
	//   23   23:iadd            
	//   24   24:daload          
	//   25   25:aload_0         
	//   26   26:iload_1         
	//   27   27:iconst_5        
	//   28   28:iadd            
	//   29   29:daload          
	//   30   30:aload_0         
	//   31   31:iload_1         
	//   32   32:bipush          6
	//   33   34:iadd            
	//   34   35:daload          
	//   35   36:aload_0         
	//   36   37:iload_1         
	//   37   38:bipush          7
	//   38   40:iadd            
	//   39   41:daload          
	//   40   42:invokestatic    #27  <Method double getFlatnessSq(double, double, double, double, double, double, double, double)>
	//   41   45:dreturn         
	}

	public static int solveCubic(double ad[])
	{
		return solveCubic(ad, ad);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #51  <Method int solveCubic(double[], double[])>
	//    3    5:ireturn         
	}

	public static int solveCubic(double ad[], double ad1[])
	{
		return Crossing.solveCubic(ad, ad1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #54  <Method int Crossing.solveCubic(double[], double[])>
	//    3    5:ireturn         
	}

	public static void subdivide(CubicCurve2D cubiccurve2d, CubicCurve2D cubiccurve2d1, CubicCurve2D cubiccurve2d2)
	{
		double d = cubiccurve2d.getX1();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method double getX1()>
	//    2    4:dstore_3        
		double d1 = cubiccurve2d.getY1();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #63  <Method double getY1()>
	//    5    9:dstore          5
		double d4 = cubiccurve2d.getCtrlX1();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #66  <Method double getCtrlX1()>
	//    8   15:dstore          11
		double d5 = cubiccurve2d.getCtrlY1();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #69  <Method double getCtrlY1()>
	//   11   21:dstore          13
		double d7 = cubiccurve2d.getCtrlX2();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #72  <Method double getCtrlX2()>
	//   14   27:dstore          17
		double d9 = cubiccurve2d.getCtrlY2();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #75  <Method double getCtrlY2()>
	//   17   33:dstore          21
		double d2 = cubiccurve2d.getX2();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #78  <Method double getX2()>
	//   20   39:dstore          7
		double d3 = cubiccurve2d.getY2();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #81  <Method double getY2()>
	//   23   45:dstore          9
		double d8 = (d4 + d7) / 2D;
	//   24   47:dload           11
	//   25   49:dload           17
	//   26   51:dadd            
	//   27   52:ldc2w           #82  <Double 2D>
	//   28   55:ddiv            
	//   29   56:dstore          19
		double d6 = (d5 + d9) / 2D;
	//   30   58:dload           13
	//   31   60:dload           21
	//   32   62:dadd            
	//   33   63:ldc2w           #82  <Double 2D>
	//   34   66:ddiv            
	//   35   67:dstore          15
		d4 = (d + d4) / 2D;
	//   36   69:dload_3         
	//   37   70:dload           11
	//   38   72:dadd            
	//   39   73:ldc2w           #82  <Double 2D>
	//   40   76:ddiv            
	//   41   77:dstore          11
		d5 = (d1 + d5) / 2D;
	//   42   79:dload           5
	//   43   81:dload           13
	//   44   83:dadd            
	//   45   84:ldc2w           #82  <Double 2D>
	//   46   87:ddiv            
	//   47   88:dstore          13
		d7 = (d2 + d7) / 2D;
	//   48   90:dload           7
	//   49   92:dload           17
	//   50   94:dadd            
	//   51   95:ldc2w           #82  <Double 2D>
	//   52   98:ddiv            
	//   53   99:dstore          17
		d9 = (d3 + d9) / 2D;
	//   54  101:dload           9
	//   55  103:dload           21
	//   56  105:dadd            
	//   57  106:ldc2w           #82  <Double 2D>
	//   58  109:ddiv            
	//   59  110:dstore          21
		double d10 = (d4 + d8) / 2D;
	//   60  112:dload           11
	//   61  114:dload           19
	//   62  116:dadd            
	//   63  117:ldc2w           #82  <Double 2D>
	//   64  120:ddiv            
	//   65  121:dstore          23
		double d11 = (d5 + d6) / 2D;
	//   66  123:dload           13
	//   67  125:dload           15
	//   68  127:dadd            
	//   69  128:ldc2w           #82  <Double 2D>
	//   70  131:ddiv            
	//   71  132:dstore          25
		d8 = (d7 + d8) / 2D;
	//   72  134:dload           17
	//   73  136:dload           19
	//   74  138:dadd            
	//   75  139:ldc2w           #82  <Double 2D>
	//   76  142:ddiv            
	//   77  143:dstore          19
		d6 = (d9 + d6) / 2D;
	//   78  145:dload           21
	//   79  147:dload           15
	//   80  149:dadd            
	//   81  150:ldc2w           #82  <Double 2D>
	//   82  153:ddiv            
	//   83  154:dstore          15
		double d12 = (d10 + d8) / 2D;
	//   84  156:dload           23
	//   85  158:dload           19
	//   86  160:dadd            
	//   87  161:ldc2w           #82  <Double 2D>
	//   88  164:ddiv            
	//   89  165:dstore          27
		double d13 = (d11 + d6) / 2D;
	//   90  167:dload           25
	//   91  169:dload           15
	//   92  171:dadd            
	//   93  172:ldc2w           #82  <Double 2D>
	//   94  175:ddiv            
	//   95  176:dstore          29
		if(cubiccurve2d1 != null)
	//*  96  178:aload_1         
	//*  97  179:ifnull          201
			cubiccurve2d1.setCurve(d, d1, d4, d5, d10, d11, d12, d13);
	//   98  182:aload_1         
	//   99  183:dload_3         
	//  100  184:dload           5
	//  101  186:dload           11
	//  102  188:dload           13
	//  103  190:dload           23
	//  104  192:dload           25
	//  105  194:dload           27
	//  106  196:dload           29
	//  107  198:invokevirtual   #87  <Method void setCurve(double, double, double, double, double, double, double, double)>
		if(cubiccurve2d2 != null)
	//* 108  201:aload_2         
	//* 109  202:ifnull          225
			cubiccurve2d2.setCurve(d12, d13, d8, d6, d7, d9, d2, d3);
	//  110  205:aload_2         
	//  111  206:dload           27
	//  112  208:dload           29
	//  113  210:dload           19
	//  114  212:dload           15
	//  115  214:dload           17
	//  116  216:dload           21
	//  117  218:dload           7
	//  118  220:dload           9
	//  119  222:invokevirtual   #87  <Method void setCurve(double, double, double, double, double, double, double, double)>
	//  120  225:return          
	}

	public static void subdivide(double ad[], int i, double ad1[], int j, double ad2[], int k)
	{
		double d = ad[i + 0];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:iadd            
	//    4    4:daload          
	//    5    5:dstore          6
		double d1 = ad[i + 1];
	//    6    7:aload_0         
	//    7    8:iload_1         
	//    8    9:iconst_1        
	//    9   10:iadd            
	//   10   11:daload          
	//   11   12:dstore          8
		double d4 = ad[i + 2];
	//   12   14:aload_0         
	//   13   15:iload_1         
	//   14   16:iconst_2        
	//   15   17:iadd            
	//   16   18:daload          
	//   17   19:dstore          14
		double d5 = ad[i + 3];
	//   18   21:aload_0         
	//   19   22:iload_1         
	//   20   23:iconst_3        
	//   21   24:iadd            
	//   22   25:daload          
	//   23   26:dstore          16
		double d7 = ad[i + 4];
	//   24   28:aload_0         
	//   25   29:iload_1         
	//   26   30:iconst_4        
	//   27   31:iadd            
	//   28   32:daload          
	//   29   33:dstore          20
		double d9 = ad[i + 5];
	//   30   35:aload_0         
	//   31   36:iload_1         
	//   32   37:iconst_5        
	//   33   38:iadd            
	//   34   39:daload          
	//   35   40:dstore          24
		double d2 = ad[i + 6];
	//   36   42:aload_0         
	//   37   43:iload_1         
	//   38   44:bipush          6
	//   39   46:iadd            
	//   40   47:daload          
	//   41   48:dstore          10
		double d3 = ad[i + 7];
	//   42   50:aload_0         
	//   43   51:iload_1         
	//   44   52:bipush          7
	//   45   54:iadd            
	//   46   55:daload          
	//   47   56:dstore          12
		double d8 = (d4 + d7) / 2D;
	//   48   58:dload           14
	//   49   60:dload           20
	//   50   62:dadd            
	//   51   63:ldc2w           #82  <Double 2D>
	//   52   66:ddiv            
	//   53   67:dstore          22
		double d6 = (d5 + d9) / 2D;
	//   54   69:dload           16
	//   55   71:dload           24
	//   56   73:dadd            
	//   57   74:ldc2w           #82  <Double 2D>
	//   58   77:ddiv            
	//   59   78:dstore          18
		d4 = (d + d4) / 2D;
	//   60   80:dload           6
	//   61   82:dload           14
	//   62   84:dadd            
	//   63   85:ldc2w           #82  <Double 2D>
	//   64   88:ddiv            
	//   65   89:dstore          14
		d5 = (d1 + d5) / 2D;
	//   66   91:dload           8
	//   67   93:dload           16
	//   68   95:dadd            
	//   69   96:ldc2w           #82  <Double 2D>
	//   70   99:ddiv            
	//   71  100:dstore          16
		d7 = (d2 + d7) / 2D;
	//   72  102:dload           10
	//   73  104:dload           20
	//   74  106:dadd            
	//   75  107:ldc2w           #82  <Double 2D>
	//   76  110:ddiv            
	//   77  111:dstore          20
		d9 = (d3 + d9) / 2D;
	//   78  113:dload           12
	//   79  115:dload           24
	//   80  117:dadd            
	//   81  118:ldc2w           #82  <Double 2D>
	//   82  121:ddiv            
	//   83  122:dstore          24
		double d10 = (d4 + d8) / 2D;
	//   84  124:dload           14
	//   85  126:dload           22
	//   86  128:dadd            
	//   87  129:ldc2w           #82  <Double 2D>
	//   88  132:ddiv            
	//   89  133:dstore          26
		double d11 = (d5 + d6) / 2D;
	//   90  135:dload           16
	//   91  137:dload           18
	//   92  139:dadd            
	//   93  140:ldc2w           #82  <Double 2D>
	//   94  143:ddiv            
	//   95  144:dstore          28
		d8 = (d7 + d8) / 2D;
	//   96  146:dload           20
	//   97  148:dload           22
	//   98  150:dadd            
	//   99  151:ldc2w           #82  <Double 2D>
	//  100  154:ddiv            
	//  101  155:dstore          22
		d6 = (d9 + d6) / 2D;
	//  102  157:dload           24
	//  103  159:dload           18
	//  104  161:dadd            
	//  105  162:ldc2w           #82  <Double 2D>
	//  106  165:ddiv            
	//  107  166:dstore          18
		double d12 = (d10 + d8) / 2D;
	//  108  168:dload           26
	//  109  170:dload           22
	//  110  172:dadd            
	//  111  173:ldc2w           #82  <Double 2D>
	//  112  176:ddiv            
	//  113  177:dstore          30
		double d13 = (d11 + d6) / 2D;
	//  114  179:dload           28
	//  115  181:dload           18
	//  116  183:dadd            
	//  117  184:ldc2w           #82  <Double 2D>
	//  118  187:ddiv            
	//  119  188:dstore          32
		if(ad1 != null)
	//* 120  190:aload_2         
	//* 121  191:ifnull          252
		{
			ad1[j + 0] = d;
	//  122  194:aload_2         
	//  123  195:iload_3         
	//  124  196:iconst_0        
	//  125  197:iadd            
	//  126  198:dload           6
	//  127  200:dastore         
			ad1[j + 1] = d1;
	//  128  201:aload_2         
	//  129  202:iload_3         
	//  130  203:iconst_1        
	//  131  204:iadd            
	//  132  205:dload           8
	//  133  207:dastore         
			ad1[j + 2] = d4;
	//  134  208:aload_2         
	//  135  209:iload_3         
	//  136  210:iconst_2        
	//  137  211:iadd            
	//  138  212:dload           14
	//  139  214:dastore         
			ad1[j + 3] = d5;
	//  140  215:aload_2         
	//  141  216:iload_3         
	//  142  217:iconst_3        
	//  143  218:iadd            
	//  144  219:dload           16
	//  145  221:dastore         
			ad1[j + 4] = d10;
	//  146  222:aload_2         
	//  147  223:iload_3         
	//  148  224:iconst_4        
	//  149  225:iadd            
	//  150  226:dload           26
	//  151  228:dastore         
			ad1[j + 5] = d11;
	//  152  229:aload_2         
	//  153  230:iload_3         
	//  154  231:iconst_5        
	//  155  232:iadd            
	//  156  233:dload           28
	//  157  235:dastore         
			ad1[j + 6] = d12;
	//  158  236:aload_2         
	//  159  237:iload_3         
	//  160  238:bipush          6
	//  161  240:iadd            
	//  162  241:dload           30
	//  163  243:dastore         
			ad1[j + 7] = d13;
	//  164  244:aload_2         
	//  165  245:iload_3         
	//  166  246:bipush          7
	//  167  248:iadd            
	//  168  249:dload           32
	//  169  251:dastore         
		}
		if(ad2 != null)
	//* 170  252:aload           4
	//* 171  254:ifnull          331
		{
			ad2[k + 0] = d12;
	//  172  257:aload           4
	//  173  259:iload           5
	//  174  261:iconst_0        
	//  175  262:iadd            
	//  176  263:dload           30
	//  177  265:dastore         
			ad2[k + 1] = d13;
	//  178  266:aload           4
	//  179  268:iload           5
	//  180  270:iconst_1        
	//  181  271:iadd            
	//  182  272:dload           32
	//  183  274:dastore         
			ad2[k + 2] = d8;
	//  184  275:aload           4
	//  185  277:iload           5
	//  186  279:iconst_2        
	//  187  280:iadd            
	//  188  281:dload           22
	//  189  283:dastore         
			ad2[k + 3] = d6;
	//  190  284:aload           4
	//  191  286:iload           5
	//  192  288:iconst_3        
	//  193  289:iadd            
	//  194  290:dload           18
	//  195  292:dastore         
			ad2[k + 4] = d7;
	//  196  293:aload           4
	//  197  295:iload           5
	//  198  297:iconst_4        
	//  199  298:iadd            
	//  200  299:dload           20
	//  201  301:dastore         
			ad2[k + 5] = d9;
	//  202  302:aload           4
	//  203  304:iload           5
	//  204  306:iconst_5        
	//  205  307:iadd            
	//  206  308:dload           24
	//  207  310:dastore         
			ad2[k + 6] = d2;
	//  208  311:aload           4
	//  209  313:iload           5
	//  210  315:bipush          6
	//  211  317:iadd            
	//  212  318:dload           10
	//  213  320:dastore         
			ad2[k + 7] = d3;
	//  214  321:aload           4
	//  215  323:iload           5
	//  216  325:bipush          7
	//  217  327:iadd            
	//  218  328:dload           12
	//  219  330:dastore         
		}
	//  220  331:return          
	}

	public Object clone()
	{
		Object obj;
		try
		{
			obj = super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   5    7:astore_1        
		{
			throw new InternalError();
	//    6    8:new             #96  <Class InternalError>
	//    7   11:dup             
	//    8   12:invokespecial   #97  <Method void InternalError()>
	//    9   15:athrow          
		}
		return obj;
	}

	public boolean contains(double d, double d1)
	{
		return Crossing.isInsideEvenOdd(Crossing.crossShape(((Shape) (this)), d, d1));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:invokestatic    #103 <Method int Crossing.crossShape(Shape, double, double)>
	//    4    6:invokestatic    #107 <Method boolean Crossing.isInsideEvenOdd(int)>
	//    5    9:ireturn         
	}

	public boolean contains(double d, double d1, double d2, double d3)
	{
		int i = Crossing.intersectShape(((Shape) (this)), d, d1, d2, d3);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:dload           5
	//    4    5:dload           7
	//    5    7:invokestatic    #112 <Method int Crossing.intersectShape(Shape, double, double, double, double)>
	//    6   10:istore          9
		return i != 255 && Crossing.isInsideEvenOdd(i);
	//    7   12:iload           9
	//    8   14:sipush          255
	//    9   17:icmpeq          30
	//   10   20:iload           9
	//   11   22:invokestatic    #107 <Method boolean Crossing.isInsideEvenOdd(int)>
	//   12   25:ifeq            30
	//   13   28:iconst_1        
	//   14   29:ireturn         
	//   15   30:iconst_0        
	//   16   31:ireturn         
	}

	public boolean contains(Point2D point2d)
	{
		return contains(point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #121 <Method double Point2D.getY()>
	//    5    9:invokevirtual   #123 <Method boolean contains(double, double)>
	//    6   12:ireturn         
	}

	public boolean contains(Rectangle2D rectangle2d)
	{
		return contains(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #127 <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #128 <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #131 <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #134 <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #136 <Method boolean contains(double, double, double, double)>
	//   10   20:ireturn         
	}

	public Rectangle getBounds()
	{
		return getBounds2D().getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #142 <Method Rectangle2D getBounds2D()>
	//    2    4:invokevirtual   #144 <Method Rectangle Rectangle2D.getBounds()>
	//    3    7:areturn         
	}

	public abstract Point2D getCtrlP1();

	public abstract Point2D getCtrlP2();

	public abstract double getCtrlX1();

	public abstract double getCtrlX2();

	public abstract double getCtrlY1();

	public abstract double getCtrlY2();

	public double getFlatness()
	{
		return getFlatness(getX1(), getY1(), getCtrlX1(), getCtrlY1(), getCtrlX2(), getCtrlY2(), getX2(), getY2());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #63  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #66  <Method double getCtrlX1()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #69  <Method double getCtrlY1()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #72  <Method double getCtrlX2()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #75  <Method double getCtrlY2()>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #78  <Method double getX2()>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #81  <Method double getY2()>
	//   16   32:invokestatic    #36  <Method double getFlatness(double, double, double, double, double, double, double, double)>
	//   17   35:dreturn         
	}

	public double getFlatnessSq()
	{
		return getFlatnessSq(getX1(), getY1(), getCtrlX1(), getCtrlY1(), getCtrlX2(), getCtrlY2(), getX2(), getY2());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #63  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #66  <Method double getCtrlX1()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #69  <Method double getCtrlY1()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #72  <Method double getCtrlX2()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #75  <Method double getCtrlY2()>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #78  <Method double getX2()>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #81  <Method double getY2()>
	//   16   32:invokestatic    #27  <Method double getFlatnessSq(double, double, double, double, double, double, double, double)>
	//   17   35:dreturn         
	}

	public abstract Point2D getP1();

	public abstract Point2D getP2();

	public PathIterator getPathIterator(AffineTransform affinetransform)
	{
		return ((PathIterator) (new Iterator(this, affinetransform)));
	//    0    0:new             #16  <Class CubicCurve2D$Iterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #154 <Method void CubicCurve2D$Iterator(CubicCurve2D, CubicCurve2D, AffineTransform)>
	//    6   10:areturn         
	}

	public PathIterator getPathIterator(AffineTransform affinetransform, double d)
	{
		return ((PathIterator) (new FlatteningPathIterator(getPathIterator(affinetransform), d)));
	//    0    0:new             #157 <Class FlatteningPathIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #159 <Method PathIterator getPathIterator(AffineTransform)>
	//    5    9:dload_2         
	//    6   10:invokespecial   #162 <Method void FlatteningPathIterator(PathIterator, double)>
	//    7   13:areturn         
	}

	public abstract double getX1();

	public abstract double getX2();

	public abstract double getY1();

	public abstract double getY2();

	public boolean intersects(double d, double d1, double d2, double d3)
	{
		int i = Crossing.intersectShape(((Shape) (this)), d, d1, d2, d3);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:dload           5
	//    4    5:dload           7
	//    5    7:invokestatic    #112 <Method int Crossing.intersectShape(Shape, double, double, double, double)>
	//    6   10:istore          9
		return i == 255 || Crossing.isInsideEvenOdd(i);
	//    7   12:iload           9
	//    8   14:sipush          255
	//    9   17:icmpeq          28
	//   10   20:iload           9
	//   11   22:invokestatic    #107 <Method boolean Crossing.isInsideEvenOdd(int)>
	//   12   25:ifeq            30
	//   13   28:iconst_1        
	//   14   29:ireturn         
	//   15   30:iconst_0        
	//   16   31:ireturn         
	}

	public boolean intersects(Rectangle2D rectangle2d)
	{
		return intersects(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #127 <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #128 <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #131 <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #134 <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #165 <Method boolean intersects(double, double, double, double)>
	//   10   20:ireturn         
	}

	public abstract void setCurve(double d, double d1, double d2, double d3, double d4, double d5, double d6, 
			double d7);

	public void setCurve(CubicCurve2D cubiccurve2d)
	{
		setCurve(cubiccurve2d.getX1(), cubiccurve2d.getY1(), cubiccurve2d.getCtrlX1(), cubiccurve2d.getCtrlY1(), cubiccurve2d.getCtrlX2(), cubiccurve2d.getCtrlY2(), cubiccurve2d.getX2(), cubiccurve2d.getY2());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method double getX1()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #63  <Method double getY1()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #66  <Method double getCtrlX1()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #69  <Method double getCtrlY1()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #72  <Method double getCtrlX2()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #75  <Method double getCtrlY2()>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #78  <Method double getX2()>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #81  <Method double getY2()>
	//   17   33:invokevirtual   #87  <Method void setCurve(double, double, double, double, double, double, double, double)>
	//   18   36:return          
	}

	public void setCurve(Point2D point2d, Point2D point2d1, Point2D point2d2, Point2D point2d3)
	{
		setCurve(point2d.getX(), point2d.getY(), point2d1.getX(), point2d1.getY(), point2d2.getX(), point2d2.getY(), point2d3.getX(), point2d3.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #121 <Method double Point2D.getY()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #118 <Method double Point2D.getX()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #121 <Method double Point2D.getY()>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #118 <Method double Point2D.getX()>
	//   11   21:aload_3         
	//   12   22:invokevirtual   #121 <Method double Point2D.getY()>
	//   13   25:aload           4
	//   14   27:invokevirtual   #118 <Method double Point2D.getX()>
	//   15   30:aload           4
	//   16   32:invokevirtual   #121 <Method double Point2D.getY()>
	//   17   35:invokevirtual   #87  <Method void setCurve(double, double, double, double, double, double, double, double)>
	//   18   38:return          
	}

	public void setCurve(double ad[], int i)
	{
		setCurve(ad[i + 0], ad[i + 1], ad[i + 2], ad[i + 3], ad[i + 4], ad[i + 5], ad[i + 6], ad[i + 7]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iadd            
	//    5    5:daload          
	//    6    6:aload_1         
	//    7    7:iload_2         
	//    8    8:iconst_1        
	//    9    9:iadd            
	//   10   10:daload          
	//   11   11:aload_1         
	//   12   12:iload_2         
	//   13   13:iconst_2        
	//   14   14:iadd            
	//   15   15:daload          
	//   16   16:aload_1         
	//   17   17:iload_2         
	//   18   18:iconst_3        
	//   19   19:iadd            
	//   20   20:daload          
	//   21   21:aload_1         
	//   22   22:iload_2         
	//   23   23:iconst_4        
	//   24   24:iadd            
	//   25   25:daload          
	//   26   26:aload_1         
	//   27   27:iload_2         
	//   28   28:iconst_5        
	//   29   29:iadd            
	//   30   30:daload          
	//   31   31:aload_1         
	//   32   32:iload_2         
	//   33   33:bipush          6
	//   34   35:iadd            
	//   35   36:daload          
	//   36   37:aload_1         
	//   37   38:iload_2         
	//   38   39:bipush          7
	//   39   41:iadd            
	//   40   42:daload          
	//   41   43:invokevirtual   #87  <Method void setCurve(double, double, double, double, double, double, double, double)>
	//   42   46:return          
	}

	public void setCurve(Point2D apoint2d[], int i)
	{
		setCurve(apoint2d[i + 0].getX(), apoint2d[i + 0].getY(), apoint2d[i + 1].getX(), apoint2d[i + 1].getY(), apoint2d[i + 2].getX(), apoint2d[i + 2].getY(), apoint2d[i + 3].getX(), apoint2d[i + 3].getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iadd            
	//    5    5:aaload          
	//    6    6:invokevirtual   #118 <Method double Point2D.getX()>
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:iconst_0        
	//   10   12:iadd            
	//   11   13:aaload          
	//   12   14:invokevirtual   #121 <Method double Point2D.getY()>
	//   13   17:aload_1         
	//   14   18:iload_2         
	//   15   19:iconst_1        
	//   16   20:iadd            
	//   17   21:aaload          
	//   18   22:invokevirtual   #118 <Method double Point2D.getX()>
	//   19   25:aload_1         
	//   20   26:iload_2         
	//   21   27:iconst_1        
	//   22   28:iadd            
	//   23   29:aaload          
	//   24   30:invokevirtual   #121 <Method double Point2D.getY()>
	//   25   33:aload_1         
	//   26   34:iload_2         
	//   27   35:iconst_2        
	//   28   36:iadd            
	//   29   37:aaload          
	//   30   38:invokevirtual   #118 <Method double Point2D.getX()>
	//   31   41:aload_1         
	//   32   42:iload_2         
	//   33   43:iconst_2        
	//   34   44:iadd            
	//   35   45:aaload          
	//   36   46:invokevirtual   #121 <Method double Point2D.getY()>
	//   37   49:aload_1         
	//   38   50:iload_2         
	//   39   51:iconst_3        
	//   40   52:iadd            
	//   41   53:aaload          
	//   42   54:invokevirtual   #118 <Method double Point2D.getX()>
	//   43   57:aload_1         
	//   44   58:iload_2         
	//   45   59:iconst_3        
	//   46   60:iadd            
	//   47   61:aaload          
	//   48   62:invokevirtual   #121 <Method double Point2D.getY()>
	//   49   65:invokevirtual   #87  <Method void setCurve(double, double, double, double, double, double, double, double)>
	//   50   68:return          
	}

	public void subdivide(CubicCurve2D cubiccurve2d, CubicCurve2D cubiccurve2d1)
	{
		subdivide(this, cubiccurve2d, cubiccurve2d1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #172 <Method void subdivide(CubicCurve2D, CubicCurve2D, CubicCurve2D)>
	//    4    6:return          
	}
}
