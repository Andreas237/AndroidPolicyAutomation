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

public abstract class QuadCurve2D
	implements Shape, Cloneable
{
	public static class Double extends QuadCurve2D
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
			return ((Rectangle2D) (new Rectangle2D.Double(d, d1, Math.max(Math.max(x1, x2), ctrlx) - d, Math.max(Math.max(y1, y2), ctrly) - d1)));
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

		public Double()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void QuadCurve2D()>
		//    2    4:return          
		}

		public Double(double d, double d1, double d2, double d3, double d4, double d5)
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

	public static class Float extends QuadCurve2D
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
			return ((Rectangle2D) (new Rectangle2D.Float(f, f1, Math.max(Math.max(x1, x2), ctrlx) - f, Math.max(Math.max(y1, y2), ctrly) - f1)));
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

		public Float()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void QuadCurve2D()>
		//    2    4:return          
		}

		public Float(float f, float f1, float f2, float f3, float f4, float f5)
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
		//   17   32:getfield        #25  <Field QuadCurve2D c>
		//   18   35:invokevirtual   #53  <Method double QuadCurve2D.getX1()>
		//   19   38:dastore         
				ad[1] = c.getY1();
		//   20   39:aload_1         
		//   21   40:iconst_1        
		//   22   41:aload_0         
		//   23   42:getfield        #25  <Field QuadCurve2D c>
		//   24   45:invokevirtual   #56  <Method double QuadCurve2D.getY1()>
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
				j = 2;
		//   41   72:iconst_2        
		//   42   73:istore_3        
				ad[0] = c.getCtrlX();
		//   43   74:aload_1         
		//   44   75:iconst_0        
		//   45   76:aload_0         
		//   46   77:getfield        #25  <Field QuadCurve2D c>
		//   47   80:invokevirtual   #65  <Method double QuadCurve2D.getCtrlX()>
		//   48   83:dastore         
				ad[1] = c.getCtrlY();
		//   49   84:aload_1         
		//   50   85:iconst_1        
		//   51   86:aload_0         
		//   52   87:getfield        #25  <Field QuadCurve2D c>
		//   53   90:invokevirtual   #68  <Method double QuadCurve2D.getCtrlY()>
		//   54   93:dastore         
				ad[2] = c.getX2();
		//   55   94:aload_1         
		//   56   95:iconst_2        
		//   57   96:aload_0         
		//   58   97:getfield        #25  <Field QuadCurve2D c>
		//   59  100:invokevirtual   #71  <Method double QuadCurve2D.getX2()>
		//   60  103:dastore         
				ad[3] = c.getY2();
		//   61  104:aload_1         
		//   62  105:iconst_3        
		//   63  106:aload_0         
		//   64  107:getfield        #25  <Field QuadCurve2D c>
		//   65  110:invokevirtual   #74  <Method double QuadCurve2D.getY2()>
		//   66  113:dastore         
				i = 2;
		//   67  114:iconst_2        
		//   68  115:istore_2        
			}
			if(t != null)
				t.transform(ad, 0, ad, 0, i);
			return j;
		//*  69  116:goto            51
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
		//   17   32:getfield        #25  <Field QuadCurve2D c>
		//   18   35:invokevirtual   #53  <Method double QuadCurve2D.getX1()>
		//   19   38:d2f             
		//   20   39:fastore         
				af[1] = (float)c.getY1();
		//   21   40:aload_1         
		//   22   41:iconst_1        
		//   23   42:aload_0         
		//   24   43:getfield        #25  <Field QuadCurve2D c>
		//   25   46:invokevirtual   #56  <Method double QuadCurve2D.getY1()>
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
		//*  40   69:invokevirtual   #78  <Method void AffineTransform.transform(float[], int, float[], int, int)>
		//*  41   72:iload_3         
		//*  42   73:ireturn         
			{
				j = 2;
		//   43   74:iconst_2        
		//   44   75:istore_3        
				af[0] = (float)c.getCtrlX();
		//   45   76:aload_1         
		//   46   77:iconst_0        
		//   47   78:aload_0         
		//   48   79:getfield        #25  <Field QuadCurve2D c>
		//   49   82:invokevirtual   #65  <Method double QuadCurve2D.getCtrlX()>
		//   50   85:d2f             
		//   51   86:fastore         
				af[1] = (float)c.getCtrlY();
		//   52   87:aload_1         
		//   53   88:iconst_1        
		//   54   89:aload_0         
		//   55   90:getfield        #25  <Field QuadCurve2D c>
		//   56   93:invokevirtual   #68  <Method double QuadCurve2D.getCtrlY()>
		//   57   96:d2f             
		//   58   97:fastore         
				af[2] = (float)c.getX2();
		//   59   98:aload_1         
		//   60   99:iconst_2        
		//   61  100:aload_0         
		//   62  101:getfield        #25  <Field QuadCurve2D c>
		//   63  104:invokevirtual   #71  <Method double QuadCurve2D.getX2()>
		//   64  107:d2f             
		//   65  108:fastore         
				af[3] = (float)c.getY2();
		//   66  109:aload_1         
		//   67  110:iconst_3        
		//   68  111:aload_0         
		//   69  112:getfield        #25  <Field QuadCurve2D c>
		//   70  115:invokevirtual   #74  <Method double QuadCurve2D.getY2()>
		//   71  118:d2f             
		//   72  119:fastore         
				i = 2;
		//   73  120:iconst_2        
		//   74  121:istore_2        
			}
			if(t != null)
				t.transform(af, 0, af, 0, i);
			return j;
		//*  75  122:goto            53
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

		QuadCurve2D c;
		int index;
		AffineTransform t;
		final QuadCurve2D this$0;

		Iterator(QuadCurve2D quadcurve2d1, AffineTransform affinetransform)
		{
			this$0 = QuadCurve2D.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field QuadCurve2D this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			c = quadcurve2d1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field QuadCurve2D c>
			t = affinetransform;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field AffineTransform t>
		//   11   19:return          
		}
	}


	protected QuadCurve2D()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static double getFlatness(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		return Line2D.ptSegDist(d, d1, d4, d5, d2, d3);
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dload           8
	//    3    4:dload           10
	//    4    6:dload           4
	//    5    8:dload           6
	//    6   10:invokestatic    #29  <Method double Line2D.ptSegDist(double, double, double, double, double, double)>
	//    7   13:dreturn         
	}

	public static double getFlatness(double ad[], int i)
	{
		return Line2D.ptSegDist(ad[i + 0], ad[i + 1], ad[i + 4], ad[i + 5], ad[i + 2], ad[i + 3]);
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
	//   12   12:iconst_4        
	//   13   13:iadd            
	//   14   14:daload          
	//   15   15:aload_0         
	//   16   16:iload_1         
	//   17   17:iconst_5        
	//   18   18:iadd            
	//   19   19:daload          
	//   20   20:aload_0         
	//   21   21:iload_1         
	//   22   22:iconst_2        
	//   23   23:iadd            
	//   24   24:daload          
	//   25   25:aload_0         
	//   26   26:iload_1         
	//   27   27:iconst_3        
	//   28   28:iadd            
	//   29   29:daload          
	//   30   30:invokestatic    #29  <Method double Line2D.ptSegDist(double, double, double, double, double, double)>
	//   31   33:dreturn         
	}

	public static double getFlatnessSq(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		return Line2D.ptSegDistSq(d, d1, d4, d5, d2, d3);
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dload           8
	//    3    4:dload           10
	//    4    6:dload           4
	//    5    8:dload           6
	//    6   10:invokestatic    #34  <Method double Line2D.ptSegDistSq(double, double, double, double, double, double)>
	//    7   13:dreturn         
	}

	public static double getFlatnessSq(double ad[], int i)
	{
		return Line2D.ptSegDistSq(ad[i + 0], ad[i + 1], ad[i + 4], ad[i + 5], ad[i + 2], ad[i + 3]);
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
	//   12   12:iconst_4        
	//   13   13:iadd            
	//   14   14:daload          
	//   15   15:aload_0         
	//   16   16:iload_1         
	//   17   17:iconst_5        
	//   18   18:iadd            
	//   19   19:daload          
	//   20   20:aload_0         
	//   21   21:iload_1         
	//   22   22:iconst_2        
	//   23   23:iadd            
	//   24   24:daload          
	//   25   25:aload_0         
	//   26   26:iload_1         
	//   27   27:iconst_3        
	//   28   28:iadd            
	//   29   29:daload          
	//   30   30:invokestatic    #34  <Method double Line2D.ptSegDistSq(double, double, double, double, double, double)>
	//   31   33:dreturn         
	}

	public static int solveQuadratic(double ad[])
	{
		return solveQuadratic(ad, ad);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #39  <Method int solveQuadratic(double[], double[])>
	//    3    5:ireturn         
	}

	public static int solveQuadratic(double ad[], double ad1[])
	{
		return Crossing.solveQuad(ad, ad1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #44  <Method int Crossing.solveQuad(double[], double[])>
	//    3    5:ireturn         
	}

	public static void subdivide(QuadCurve2D quadcurve2d, QuadCurve2D quadcurve2d1, QuadCurve2D quadcurve2d2)
	{
		double d = quadcurve2d.getX1();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method double getX1()>
	//    2    4:dstore_3        
		double d1 = quadcurve2d.getY1();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #53  <Method double getY1()>
	//    5    9:dstore          5
		double d6 = quadcurve2d.getCtrlX();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #56  <Method double getCtrlX()>
	//    8   15:dstore          15
		double d7 = quadcurve2d.getCtrlY();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #59  <Method double getCtrlY()>
	//   11   21:dstore          17
		double d2 = quadcurve2d.getX2();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #62  <Method double getX2()>
	//   14   27:dstore          7
		double d3 = quadcurve2d.getY2();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #65  <Method double getY2()>
	//   17   33:dstore          9
		double d4 = (d + d6) / 2D;
	//   18   35:dload_3         
	//   19   36:dload           15
	//   20   38:dadd            
	//   21   39:ldc2w           #66  <Double 2D>
	//   22   42:ddiv            
	//   23   43:dstore          11
		double d5 = (d1 + d7) / 2D;
	//   24   45:dload           5
	//   25   47:dload           17
	//   26   49:dadd            
	//   27   50:ldc2w           #66  <Double 2D>
	//   28   53:ddiv            
	//   29   54:dstore          13
		d6 = (d2 + d6) / 2D;
	//   30   56:dload           7
	//   31   58:dload           15
	//   32   60:dadd            
	//   33   61:ldc2w           #66  <Double 2D>
	//   34   64:ddiv            
	//   35   65:dstore          15
		d7 = (d3 + d7) / 2D;
	//   36   67:dload           9
	//   37   69:dload           17
	//   38   71:dadd            
	//   39   72:ldc2w           #66  <Double 2D>
	//   40   75:ddiv            
	//   41   76:dstore          17
		double d8 = (d4 + d6) / 2D;
	//   42   78:dload           11
	//   43   80:dload           15
	//   44   82:dadd            
	//   45   83:ldc2w           #66  <Double 2D>
	//   46   86:ddiv            
	//   47   87:dstore          19
		double d9 = (d5 + d7) / 2D;
	//   48   89:dload           13
	//   49   91:dload           17
	//   50   93:dadd            
	//   51   94:ldc2w           #66  <Double 2D>
	//   52   97:ddiv            
	//   53   98:dstore          21
		if(quadcurve2d1 != null)
	//*  54  100:aload_1         
	//*  55  101:ifnull          119
			quadcurve2d1.setCurve(d, d1, d4, d5, d8, d9);
	//   56  104:aload_1         
	//   57  105:dload_3         
	//   58  106:dload           5
	//   59  108:dload           11
	//   60  110:dload           13
	//   61  112:dload           19
	//   62  114:dload           21
	//   63  116:invokevirtual   #71  <Method void setCurve(double, double, double, double, double, double)>
		if(quadcurve2d2 != null)
	//*  64  119:aload_2         
	//*  65  120:ifnull          139
			quadcurve2d2.setCurve(d8, d9, d6, d7, d2, d3);
	//   66  123:aload_2         
	//   67  124:dload           19
	//   68  126:dload           21
	//   69  128:dload           15
	//   70  130:dload           17
	//   71  132:dload           7
	//   72  134:dload           9
	//   73  136:invokevirtual   #71  <Method void setCurve(double, double, double, double, double, double)>
	//   74  139:return          
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
		double d6 = ad[i + 2];
	//   12   14:aload_0         
	//   13   15:iload_1         
	//   14   16:iconst_2        
	//   15   17:iadd            
	//   16   18:daload          
	//   17   19:dstore          18
		double d7 = ad[i + 3];
	//   18   21:aload_0         
	//   19   22:iload_1         
	//   20   23:iconst_3        
	//   21   24:iadd            
	//   22   25:daload          
	//   23   26:dstore          20
		double d2 = ad[i + 4];
	//   24   28:aload_0         
	//   25   29:iload_1         
	//   26   30:iconst_4        
	//   27   31:iadd            
	//   28   32:daload          
	//   29   33:dstore          10
		double d3 = ad[i + 5];
	//   30   35:aload_0         
	//   31   36:iload_1         
	//   32   37:iconst_5        
	//   33   38:iadd            
	//   34   39:daload          
	//   35   40:dstore          12
		double d4 = (d + d6) / 2D;
	//   36   42:dload           6
	//   37   44:dload           18
	//   38   46:dadd            
	//   39   47:ldc2w           #66  <Double 2D>
	//   40   50:ddiv            
	//   41   51:dstore          14
		double d5 = (d1 + d7) / 2D;
	//   42   53:dload           8
	//   43   55:dload           20
	//   44   57:dadd            
	//   45   58:ldc2w           #66  <Double 2D>
	//   46   61:ddiv            
	//   47   62:dstore          16
		d6 = (d2 + d6) / 2D;
	//   48   64:dload           10
	//   49   66:dload           18
	//   50   68:dadd            
	//   51   69:ldc2w           #66  <Double 2D>
	//   52   72:ddiv            
	//   53   73:dstore          18
		d7 = (d3 + d7) / 2D;
	//   54   75:dload           12
	//   55   77:dload           20
	//   56   79:dadd            
	//   57   80:ldc2w           #66  <Double 2D>
	//   58   83:ddiv            
	//   59   84:dstore          20
		double d8 = (d4 + d6) / 2D;
	//   60   86:dload           14
	//   61   88:dload           18
	//   62   90:dadd            
	//   63   91:ldc2w           #66  <Double 2D>
	//   64   94:ddiv            
	//   65   95:dstore          22
		double d9 = (d5 + d7) / 2D;
	//   66   97:dload           16
	//   67   99:dload           20
	//   68  101:dadd            
	//   69  102:ldc2w           #66  <Double 2D>
	//   70  105:ddiv            
	//   71  106:dstore          24
		if(ad1 != null)
	//*  72  108:aload_2         
	//*  73  109:ifnull          154
		{
			ad1[j + 0] = d;
	//   74  112:aload_2         
	//   75  113:iload_3         
	//   76  114:iconst_0        
	//   77  115:iadd            
	//   78  116:dload           6
	//   79  118:dastore         
			ad1[j + 1] = d1;
	//   80  119:aload_2         
	//   81  120:iload_3         
	//   82  121:iconst_1        
	//   83  122:iadd            
	//   84  123:dload           8
	//   85  125:dastore         
			ad1[j + 2] = d4;
	//   86  126:aload_2         
	//   87  127:iload_3         
	//   88  128:iconst_2        
	//   89  129:iadd            
	//   90  130:dload           14
	//   91  132:dastore         
			ad1[j + 3] = d5;
	//   92  133:aload_2         
	//   93  134:iload_3         
	//   94  135:iconst_3        
	//   95  136:iadd            
	//   96  137:dload           16
	//   97  139:dastore         
			ad1[j + 4] = d8;
	//   98  140:aload_2         
	//   99  141:iload_3         
	//  100  142:iconst_4        
	//  101  143:iadd            
	//  102  144:dload           22
	//  103  146:dastore         
			ad1[j + 5] = d9;
	//  104  147:aload_2         
	//  105  148:iload_3         
	//  106  149:iconst_5        
	//  107  150:iadd            
	//  108  151:dload           24
	//  109  153:dastore         
		}
		if(ad2 != null)
	//* 110  154:aload           4
	//* 111  156:ifnull          213
		{
			ad2[k + 0] = d8;
	//  112  159:aload           4
	//  113  161:iload           5
	//  114  163:iconst_0        
	//  115  164:iadd            
	//  116  165:dload           22
	//  117  167:dastore         
			ad2[k + 1] = d9;
	//  118  168:aload           4
	//  119  170:iload           5
	//  120  172:iconst_1        
	//  121  173:iadd            
	//  122  174:dload           24
	//  123  176:dastore         
			ad2[k + 2] = d6;
	//  124  177:aload           4
	//  125  179:iload           5
	//  126  181:iconst_2        
	//  127  182:iadd            
	//  128  183:dload           18
	//  129  185:dastore         
			ad2[k + 3] = d7;
	//  130  186:aload           4
	//  131  188:iload           5
	//  132  190:iconst_3        
	//  133  191:iadd            
	//  134  192:dload           20
	//  135  194:dastore         
			ad2[k + 4] = d2;
	//  136  195:aload           4
	//  137  197:iload           5
	//  138  199:iconst_4        
	//  139  200:iadd            
	//  140  201:dload           10
	//  141  203:dastore         
			ad2[k + 5] = d3;
	//  142  204:aload           4
	//  143  206:iload           5
	//  144  208:iconst_5        
	//  145  209:iadd            
	//  146  210:dload           12
	//  147  212:dastore         
		}
	//  148  213:return          
	}

	public Object clone()
	{
		Object obj;
		try
		{
			obj = super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   5    7:astore_1        
		{
			throw new InternalError();
	//    6    8:new             #80  <Class InternalError>
	//    7   11:dup             
	//    8   12:invokespecial   #81  <Method void InternalError()>
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
	//    3    3:invokestatic    #87  <Method int Crossing.crossShape(Shape, double, double)>
	//    4    6:invokestatic    #91  <Method boolean Crossing.isInsideEvenOdd(int)>
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
	//    5    7:invokestatic    #96  <Method int Crossing.intersectShape(Shape, double, double, double, double)>
	//    6   10:istore          9
		return i != 255 && Crossing.isInsideEvenOdd(i);
	//    7   12:iload           9
	//    8   14:sipush          255
	//    9   17:icmpeq          30
	//   10   20:iload           9
	//   11   22:invokestatic    #91  <Method boolean Crossing.isInsideEvenOdd(int)>
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
	//    2    2:invokevirtual   #102 <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #105 <Method double Point2D.getY()>
	//    5    9:invokevirtual   #107 <Method boolean contains(double, double)>
	//    6   12:ireturn         
	}

	public boolean contains(Rectangle2D rectangle2d)
	{
		return contains(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #112 <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #115 <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #118 <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #120 <Method boolean contains(double, double, double, double)>
	//   10   20:ireturn         
	}

	public Rectangle getBounds()
	{
		return getBounds2D().getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method Rectangle2D getBounds2D()>
	//    2    4:invokevirtual   #128 <Method Rectangle Rectangle2D.getBounds()>
	//    3    7:areturn         
	}

	public abstract Point2D getCtrlPt();

	public abstract double getCtrlX();

	public abstract double getCtrlY();

	public double getFlatness()
	{
		return Line2D.ptSegDist(getX1(), getY1(), getX2(), getY2(), getCtrlX(), getCtrlY());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #53  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #62  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #65  <Method double getY2()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #56  <Method double getCtrlX()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #59  <Method double getCtrlY()>
	//   12   24:invokestatic    #29  <Method double Line2D.ptSegDist(double, double, double, double, double, double)>
	//   13   27:dreturn         
	}

	public double getFlatnessSq()
	{
		return Line2D.ptSegDistSq(getX1(), getY1(), getX2(), getY2(), getCtrlX(), getCtrlY());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #53  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #62  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #65  <Method double getY2()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #56  <Method double getCtrlX()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #59  <Method double getCtrlY()>
	//   12   24:invokestatic    #34  <Method double Line2D.ptSegDistSq(double, double, double, double, double, double)>
	//   13   27:dreturn         
	}

	public abstract Point2D getP1();

	public abstract Point2D getP2();

	public PathIterator getPathIterator(AffineTransform affinetransform)
	{
		return ((PathIterator) (new Iterator(this, affinetransform)));
	//    0    0:new             #16  <Class QuadCurve2D$Iterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #137 <Method void QuadCurve2D$Iterator(QuadCurve2D, QuadCurve2D, AffineTransform)>
	//    6   10:areturn         
	}

	public PathIterator getPathIterator(AffineTransform affinetransform, double d)
	{
		return ((PathIterator) (new FlatteningPathIterator(getPathIterator(affinetransform), d)));
	//    0    0:new             #140 <Class FlatteningPathIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #142 <Method PathIterator getPathIterator(AffineTransform)>
	//    5    9:dload_2         
	//    6   10:invokespecial   #145 <Method void FlatteningPathIterator(PathIterator, double)>
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
	//    5    7:invokestatic    #96  <Method int Crossing.intersectShape(Shape, double, double, double, double)>
	//    6   10:istore          9
		return i == 255 || Crossing.isInsideEvenOdd(i);
	//    7   12:iload           9
	//    8   14:sipush          255
	//    9   17:icmpeq          28
	//   10   20:iload           9
	//   11   22:invokestatic    #91  <Method boolean Crossing.isInsideEvenOdd(int)>
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
	//    2    2:invokevirtual   #111 <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #112 <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #115 <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #118 <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #148 <Method boolean intersects(double, double, double, double)>
	//   10   20:ireturn         
	}

	public abstract void setCurve(double d, double d1, double d2, double d3, double d4, double d5);

	public void setCurve(Point2D point2d, Point2D point2d1, Point2D point2d2)
	{
		setCurve(point2d.getX(), point2d.getY(), point2d1.getX(), point2d1.getY(), point2d2.getX(), point2d2.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #102 <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #105 <Method double Point2D.getY()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #102 <Method double Point2D.getX()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #105 <Method double Point2D.getY()>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #102 <Method double Point2D.getX()>
	//   11   21:aload_3         
	//   12   22:invokevirtual   #105 <Method double Point2D.getY()>
	//   13   25:invokevirtual   #71  <Method void setCurve(double, double, double, double, double, double)>
	//   14   28:return          
	}

	public void setCurve(QuadCurve2D quadcurve2d)
	{
		setCurve(quadcurve2d.getX1(), quadcurve2d.getY1(), quadcurve2d.getCtrlX(), quadcurve2d.getCtrlY(), quadcurve2d.getX2(), quadcurve2d.getY2());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method double getX1()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #53  <Method double getY1()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #56  <Method double getCtrlX()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #59  <Method double getCtrlY()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #62  <Method double getX2()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #65  <Method double getY2()>
	//   13   25:invokevirtual   #71  <Method void setCurve(double, double, double, double, double, double)>
	//   14   28:return          
	}

	public void setCurve(double ad[], int i)
	{
		setCurve(ad[i + 0], ad[i + 1], ad[i + 2], ad[i + 3], ad[i + 4], ad[i + 5]);
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
	//   31   31:invokevirtual   #71  <Method void setCurve(double, double, double, double, double, double)>
	//   32   34:return          
	}

	public void setCurve(Point2D apoint2d[], int i)
	{
		setCurve(apoint2d[i + 0].getX(), apoint2d[i + 0].getY(), apoint2d[i + 1].getX(), apoint2d[i + 1].getY(), apoint2d[i + 2].getX(), apoint2d[i + 2].getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iadd            
	//    5    5:aaload          
	//    6    6:invokevirtual   #102 <Method double Point2D.getX()>
	//    7    9:aload_1         
	//    8   10:iload_2         
	//    9   11:iconst_0        
	//   10   12:iadd            
	//   11   13:aaload          
	//   12   14:invokevirtual   #105 <Method double Point2D.getY()>
	//   13   17:aload_1         
	//   14   18:iload_2         
	//   15   19:iconst_1        
	//   16   20:iadd            
	//   17   21:aaload          
	//   18   22:invokevirtual   #102 <Method double Point2D.getX()>
	//   19   25:aload_1         
	//   20   26:iload_2         
	//   21   27:iconst_1        
	//   22   28:iadd            
	//   23   29:aaload          
	//   24   30:invokevirtual   #105 <Method double Point2D.getY()>
	//   25   33:aload_1         
	//   26   34:iload_2         
	//   27   35:iconst_2        
	//   28   36:iadd            
	//   29   37:aaload          
	//   30   38:invokevirtual   #102 <Method double Point2D.getX()>
	//   31   41:aload_1         
	//   32   42:iload_2         
	//   33   43:iconst_2        
	//   34   44:iadd            
	//   35   45:aaload          
	//   36   46:invokevirtual   #105 <Method double Point2D.getY()>
	//   37   49:invokevirtual   #71  <Method void setCurve(double, double, double, double, double, double)>
	//   38   52:return          
	}

	public void subdivide(QuadCurve2D quadcurve2d, QuadCurve2D quadcurve2d1)
	{
		subdivide(this, quadcurve2d, quadcurve2d1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #155 <Method void subdivide(QuadCurve2D, QuadCurve2D, QuadCurve2D)>
	//    4    6:return          
	}
}
