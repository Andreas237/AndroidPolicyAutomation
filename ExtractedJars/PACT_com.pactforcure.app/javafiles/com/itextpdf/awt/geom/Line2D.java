// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			Shape, Rectangle2D, Point2D, Rectangle, 
//			AffineTransform, PathIterator

public abstract class Line2D
	implements Shape, Cloneable
{
	public static class Double extends Line2D
	{

		public Rectangle2D getBounds2D()
		{
			double d;
			double d1;
			double d2;
			double d3;
			if(x1 < x2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field double x1>
		//*   2    4:aload_0         
		//*   3    5:getfield        #28  <Field double x2>
		//*   4    8:dcmpg           
		//*   5    9:ifge            70
			{
				d = x1;
		//    6   12:aload_0         
		//    7   13:getfield        #26  <Field double x1>
		//    8   16:dstore_1        
				d1 = x2 - x1;
		//    9   17:aload_0         
		//   10   18:getfield        #28  <Field double x2>
		//   11   21:aload_0         
		//   12   22:getfield        #26  <Field double x1>
		//   13   25:dsub            
		//   14   26:dstore_3        
			} else
		//*  15   27:aload_0         
		//*  16   28:getfield        #30  <Field double y1>
		//*  17   31:aload_0         
		//*  18   32:getfield        #32  <Field double y2>
		//*  19   35:dcmpg           
		//*  20   36:ifge            88
		//*  21   39:aload_0         
		//*  22   40:getfield        #30  <Field double y1>
		//*  23   43:dstore          5
		//*  24   45:aload_0         
		//*  25   46:getfield        #32  <Field double y2>
		//*  26   49:aload_0         
		//*  27   50:getfield        #30  <Field double y1>
		//*  28   53:dsub            
		//*  29   54:dstore          7
		//*  30   56:new             #34  <Class Rectangle2D$Double>
		//*  31   59:dup             
		//*  32   60:dload_1         
		//*  33   61:dload           5
		//*  34   63:dload_3         
		//*  35   64:dload           7
		//*  36   66:invokespecial   #36  <Method void Rectangle2D$Double(double, double, double, double)>
		//*  37   69:areturn         
			{
				d = x2;
		//   38   70:aload_0         
		//   39   71:getfield        #28  <Field double x2>
		//   40   74:dstore_1        
				d1 = x1 - x2;
		//   41   75:aload_0         
		//   42   76:getfield        #26  <Field double x1>
		//   43   79:aload_0         
		//   44   80:getfield        #28  <Field double x2>
		//   45   83:dsub            
		//   46   84:dstore_3        
			}
			if(y1 < y2)
			{
				d2 = y1;
				d3 = y2 - y1;
			} else
		//*  47   85:goto            27
			{
				d2 = y2;
		//   48   88:aload_0         
		//   49   89:getfield        #32  <Field double y2>
		//   50   92:dstore          5
				d3 = y1 - y2;
		//   51   94:aload_0         
		//   52   95:getfield        #30  <Field double y1>
		//   53   98:aload_0         
		//   54   99:getfield        #32  <Field double y2>
		//   55  102:dsub            
		//   56  103:dstore          7
			}
			return ((Rectangle2D) (new Rectangle2D.Double(d, d2, d1, d3)));
		//*  57  105:goto            56
		}

		public Point2D getP1()
		{
			return ((Point2D) (new Point2D.Double(x1, y1)));
		//    0    0:new             #40  <Class Point2D$Double>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field double x1>
		//    4    8:aload_0         
		//    5    9:getfield        #30  <Field double y1>
		//    6   12:invokespecial   #43  <Method void Point2D$Double(double, double)>
		//    7   15:areturn         
		}

		public Point2D getP2()
		{
			return ((Point2D) (new Point2D.Double(x2, y2)));
		//    0    0:new             #40  <Class Point2D$Double>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field double x2>
		//    4    8:aload_0         
		//    5    9:getfield        #32  <Field double y2>
		//    6   12:invokespecial   #43  <Method void Point2D$Double(double, double)>
		//    7   15:areturn         
		}

		public double getX1()
		{
			return x1;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field double x1>
		//    2    4:dreturn         
		}

		public double getX2()
		{
			return x2;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field double x2>
		//    2    4:dreturn         
		}

		public double getY1()
		{
			return y1;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field double y1>
		//    2    4:dreturn         
		}

		public double getY2()
		{
			return y2;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field double y2>
		//    2    4:dreturn         
		}

		public void setLine(double d, double d1, double d2, double d3)
		{
			x1 = d;
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:putfield        #26  <Field double x1>
			y1 = d1;
		//    3    5:aload_0         
		//    4    6:dload_3         
		//    5    7:putfield        #30  <Field double y1>
			x2 = d2;
		//    6   10:aload_0         
		//    7   11:dload           5
		//    8   13:putfield        #28  <Field double x2>
			y2 = d3;
		//    9   16:aload_0         
		//   10   17:dload           7
		//   11   19:putfield        #32  <Field double y2>
		//   12   22:return          
		}

		public double x1;
		public double x2;
		public double y1;
		public double y2;

		public Double()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Line2D()>
		//    2    4:return          
		}

		public Double(double d, double d1, double d2, double d3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Line2D()>
			setLine(d, d1, d2, d3);
		//    2    4:aload_0         
		//    3    5:dload_1         
		//    4    6:dload_3         
		//    5    7:dload           5
		//    6    9:dload           7
		//    7   11:invokevirtual   #19  <Method void setLine(double, double, double, double)>
		//    8   14:return          
		}

		public Double(Point2D point2d, Point2D point2d1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Line2D()>
			setLine(point2d, point2d1);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #22  <Method void setLine(Point2D, Point2D)>
		//    6   10:return          
		}
	}

	public static class Float extends Line2D
	{

		public Rectangle2D getBounds2D()
		{
			float f;
			float f1;
			float f2;
			float f3;
			if(x1 < x2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field float x1>
		//*   2    4:aload_0         
		//*   3    5:getfield        #28  <Field float x2>
		//*   4    8:fcmpg           
		//*   5    9:ifge            68
			{
				f1 = x1;
		//    6   12:aload_0         
		//    7   13:getfield        #26  <Field float x1>
		//    8   16:fstore_2        
				f = x2 - x1;
		//    9   17:aload_0         
		//   10   18:getfield        #28  <Field float x2>
		//   11   21:aload_0         
		//   12   22:getfield        #26  <Field float x1>
		//   13   25:fsub            
		//   14   26:fstore_1        
			} else
		//*  15   27:aload_0         
		//*  16   28:getfield        #30  <Field float y1>
		//*  17   31:aload_0         
		//*  18   32:getfield        #32  <Field float y2>
		//*  19   35:fcmpg           
		//*  20   36:ifge            86
		//*  21   39:aload_0         
		//*  22   40:getfield        #30  <Field float y1>
		//*  23   43:fstore          4
		//*  24   45:aload_0         
		//*  25   46:getfield        #32  <Field float y2>
		//*  26   49:aload_0         
		//*  27   50:getfield        #30  <Field float y1>
		//*  28   53:fsub            
		//*  29   54:fstore_3        
		//*  30   55:new             #34  <Class Rectangle2D$Float>
		//*  31   58:dup             
		//*  32   59:fload_2         
		//*  33   60:fload           4
		//*  34   62:fload_1         
		//*  35   63:fload_3         
		//*  36   64:invokespecial   #36  <Method void Rectangle2D$Float(float, float, float, float)>
		//*  37   67:areturn         
			{
				f1 = x2;
		//   38   68:aload_0         
		//   39   69:getfield        #28  <Field float x2>
		//   40   72:fstore_2        
				f = x1 - x2;
		//   41   73:aload_0         
		//   42   74:getfield        #26  <Field float x1>
		//   43   77:aload_0         
		//   44   78:getfield        #28  <Field float x2>
		//   45   81:fsub            
		//   46   82:fstore_1        
			}
			if(y1 < y2)
			{
				f3 = y1;
				f2 = y2 - y1;
			} else
		//*  47   83:goto            27
			{
				f3 = y2;
		//   48   86:aload_0         
		//   49   87:getfield        #32  <Field float y2>
		//   50   90:fstore          4
				f2 = y1 - y2;
		//   51   92:aload_0         
		//   52   93:getfield        #30  <Field float y1>
		//   53   96:aload_0         
		//   54   97:getfield        #32  <Field float y2>
		//   55  100:fsub            
		//   56  101:fstore_3        
			}
			return ((Rectangle2D) (new Rectangle2D.Float(f1, f3, f, f2)));
		//*  57  102:goto            55
		}

		public Point2D getP1()
		{
			return ((Point2D) (new Point2D.Float(x1, y1)));
		//    0    0:new             #40  <Class Point2D$Float>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field float x1>
		//    4    8:aload_0         
		//    5    9:getfield        #30  <Field float y1>
		//    6   12:invokespecial   #43  <Method void Point2D$Float(float, float)>
		//    7   15:areturn         
		}

		public Point2D getP2()
		{
			return ((Point2D) (new Point2D.Float(x2, y2)));
		//    0    0:new             #40  <Class Point2D$Float>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field float x2>
		//    4    8:aload_0         
		//    5    9:getfield        #32  <Field float y2>
		//    6   12:invokespecial   #43  <Method void Point2D$Float(float, float)>
		//    7   15:areturn         
		}

		public double getX1()
		{
			return (double)x1;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field float x1>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public double getX2()
		{
			return (double)x2;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field float x2>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public double getY1()
		{
			return (double)y1;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field float y1>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public double getY2()
		{
			return (double)y2;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field float y2>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public void setLine(double d, double d1, double d2, double d3)
		{
			x1 = (float)d;
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:d2f             
		//    3    3:putfield        #26  <Field float x1>
			y1 = (float)d1;
		//    4    6:aload_0         
		//    5    7:dload_3         
		//    6    8:d2f             
		//    7    9:putfield        #30  <Field float y1>
			x2 = (float)d2;
		//    8   12:aload_0         
		//    9   13:dload           5
		//   10   15:d2f             
		//   11   16:putfield        #28  <Field float x2>
			y2 = (float)d3;
		//   12   19:aload_0         
		//   13   20:dload           7
		//   14   22:d2f             
		//   15   23:putfield        #32  <Field float y2>
		//   16   26:return          
		}

		public void setLine(float f, float f1, float f2, float f3)
		{
			x1 = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #26  <Field float x1>
			y1 = f1;
		//    3    5:aload_0         
		//    4    6:fload_2         
		//    5    7:putfield        #30  <Field float y1>
			x2 = f2;
		//    6   10:aload_0         
		//    7   11:fload_3         
		//    8   12:putfield        #28  <Field float x2>
			y2 = f3;
		//    9   15:aload_0         
		//   10   16:fload           4
		//   11   18:putfield        #32  <Field float y2>
		//   12   21:return          
		}

		public float x1;
		public float x2;
		public float y1;
		public float y2;

		public Float()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Line2D()>
		//    2    4:return          
		}

		public Float(float f, float f1, float f2, float f3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Line2D()>
			setLine(f, f1, f2, f3);
		//    2    4:aload_0         
		//    3    5:fload_1         
		//    4    6:fload_2         
		//    5    7:fload_3         
		//    6    8:fload           4
		//    7   10:invokevirtual   #19  <Method void setLine(float, float, float, float)>
		//    8   13:return          
		}

		public Float(Point2D point2d, Point2D point2d1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Line2D()>
			setLine(point2d, point2d1);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #22  <Method void setLine(Point2D, Point2D)>
		//    6   10:return          
		}
	}

	class Iterator
		implements PathIterator
	{

		public int currentSegment(double ad[])
		{
			if(isDone())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #57  <Method boolean isDone()>
		//*   2    4:ifeq            20
				throw new NoSuchElementException(Messages.getString("awt.4B"));
		//    3    7:new             #59  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:ldc1            #61  <String "awt.4B">
		//    6   13:invokestatic    #67  <Method String Messages.getString(String)>
		//    7   16:invokespecial   #70  <Method void NoSuchElementException(String)>
		//    8   19:athrow          
			int i;
			if(index == 0)
		//*   9   20:aload_0         
		//*  10   21:getfield        #72  <Field int index>
		//*  11   24:ifne            64
			{
				i = 0;
		//   12   27:iconst_0        
		//   13   28:istore_2        
				ad[0] = x1;
		//   14   29:aload_1         
		//   15   30:iconst_0        
		//   16   31:aload_0         
		//   17   32:getfield        #33  <Field double x1>
		//   18   35:dastore         
				ad[1] = y1;
		//   19   36:aload_1         
		//   20   37:iconst_1        
		//   21   38:aload_0         
		//   22   39:getfield        #38  <Field double y1>
		//   23   42:dastore         
			} else
		//*  24   43:aload_0         
		//*  25   44:getfield        #50  <Field AffineTransform t>
		//*  26   47:ifnull          62
		//*  27   50:aload_0         
		//*  28   51:getfield        #50  <Field AffineTransform t>
		//*  29   54:aload_1         
		//*  30   55:iconst_0        
		//*  31   56:aload_1         
		//*  32   57:iconst_0        
		//*  33   58:iconst_1        
		//*  34   59:invokevirtual   #78  <Method void AffineTransform.transform(double[], int, double[], int, int)>
		//*  35   62:iload_2         
		//*  36   63:ireturn         
			{
				i = 1;
		//   37   64:iconst_1        
		//   38   65:istore_2        
				ad[0] = x2;
		//   39   66:aload_1         
		//   40   67:iconst_0        
		//   41   68:aload_0         
		//   42   69:getfield        #43  <Field double x2>
		//   43   72:dastore         
				ad[1] = y2;
		//   44   73:aload_1         
		//   45   74:iconst_1        
		//   46   75:aload_0         
		//   47   76:getfield        #48  <Field double y2>
		//   48   79:dastore         
			}
			if(t != null)
				t.transform(ad, 0, ad, 0, 1);
			return i;
		//*  49   80:goto            43
		}

		public int currentSegment(float af[])
		{
			if(isDone())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #57  <Method boolean isDone()>
		//*   2    4:ifeq            20
				throw new NoSuchElementException(Messages.getString("awt.4B"));
		//    3    7:new             #59  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:ldc1            #61  <String "awt.4B">
		//    6   13:invokestatic    #67  <Method String Messages.getString(String)>
		//    7   16:invokespecial   #70  <Method void NoSuchElementException(String)>
		//    8   19:athrow          
			int i;
			if(index == 0)
		//*   9   20:aload_0         
		//*  10   21:getfield        #72  <Field int index>
		//*  11   24:ifne            66
			{
				i = 0;
		//   12   27:iconst_0        
		//   13   28:istore_2        
				af[0] = (float)x1;
		//   14   29:aload_1         
		//   15   30:iconst_0        
		//   16   31:aload_0         
		//   17   32:getfield        #33  <Field double x1>
		//   18   35:d2f             
		//   19   36:fastore         
				af[1] = (float)y1;
		//   20   37:aload_1         
		//   21   38:iconst_1        
		//   22   39:aload_0         
		//   23   40:getfield        #38  <Field double y1>
		//   24   43:d2f             
		//   25   44:fastore         
			} else
		//*  26   45:aload_0         
		//*  27   46:getfield        #50  <Field AffineTransform t>
		//*  28   49:ifnull          64
		//*  29   52:aload_0         
		//*  30   53:getfield        #50  <Field AffineTransform t>
		//*  31   56:aload_1         
		//*  32   57:iconst_0        
		//*  33   58:aload_1         
		//*  34   59:iconst_0        
		//*  35   60:iconst_1        
		//*  36   61:invokevirtual   #82  <Method void AffineTransform.transform(float[], int, float[], int, int)>
		//*  37   64:iload_2         
		//*  38   65:ireturn         
			{
				i = 1;
		//   39   66:iconst_1        
		//   40   67:istore_2        
				af[0] = (float)x2;
		//   41   68:aload_1         
		//   42   69:iconst_0        
		//   43   70:aload_0         
		//   44   71:getfield        #43  <Field double x2>
		//   45   74:d2f             
		//   46   75:fastore         
				af[1] = (float)y2;
		//   47   76:aload_1         
		//   48   77:iconst_1        
		//   49   78:aload_0         
		//   50   79:getfield        #48  <Field double y2>
		//   51   82:d2f             
		//   52   83:fastore         
			}
			if(t != null)
				t.transform(af, 0, af, 0, 1);
			return i;
		//*  53   84:goto            45
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
		//    1    1:getfield        #72  <Field int index>
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
		//    2    2:getfield        #72  <Field int index>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #72  <Field int index>
		//    6   10:return          
		}

		int index;
		AffineTransform t;
		final Line2D this$0;
		double x1;
		double x2;
		double y1;
		double y2;

		Iterator(Line2D line2d1, AffineTransform affinetransform)
		{
			this$0 = Line2D.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field Line2D this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void Object()>
			x1 = line2d1.getX1();
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #31  <Method double Line2D.getX1()>
		//    8   14:putfield        #33  <Field double x1>
			y1 = line2d1.getY1();
		//    9   17:aload_0         
		//   10   18:aload_2         
		//   11   19:invokevirtual   #36  <Method double Line2D.getY1()>
		//   12   22:putfield        #38  <Field double y1>
			x2 = line2d1.getX2();
		//   13   25:aload_0         
		//   14   26:aload_2         
		//   15   27:invokevirtual   #41  <Method double Line2D.getX2()>
		//   16   30:putfield        #43  <Field double x2>
			y2 = line2d1.getY2();
		//   17   33:aload_0         
		//   18   34:aload_2         
		//   19   35:invokevirtual   #46  <Method double Line2D.getY2()>
		//   20   38:putfield        #48  <Field double y2>
			t = affinetransform;
		//   21   41:aload_0         
		//   22   42:aload_3         
		//   23   43:putfield        #50  <Field AffineTransform t>
		//   24   46:return          
		}
	}


	protected Line2D()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static boolean linesIntersect(double d, double d1, double d2, double d3, 
			double d4, double d5, double d6, double d7)
	{
		d2 -= d;
	//    0    0:dload           4
	//    1    2:dload_0         
	//    2    3:dsub            
	//    3    4:dstore          4
		d3 -= d1;
	//    4    6:dload           6
	//    5    8:dload_2         
	//    6    9:dsub            
	//    7   10:dstore          6
		d4 -= d;
	//    8   12:dload           8
	//    9   14:dload_0         
	//   10   15:dsub            
	//   11   16:dstore          8
		d5 -= d1;
	//   12   18:dload           10
	//   13   20:dload_2         
	//   14   21:dsub            
	//   15   22:dstore          10
		d = d6 - d;
	//   16   24:dload           12
	//   17   26:dload_0         
	//   18   27:dsub            
	//   19   28:dstore_0        
		d7 -= d1;
	//   20   29:dload           14
	//   21   31:dload_2         
	//   22   32:dsub            
	//   23   33:dstore          14
		d1 = d2 * d5 - d4 * d3;
	//   24   35:dload           4
	//   25   37:dload           10
	//   26   39:dmul            
	//   27   40:dload           8
	//   28   42:dload           6
	//   29   44:dmul            
	//   30   45:dsub            
	//   31   46:dstore_2        
		d6 = d2 * d7 - d * d3;
	//   32   47:dload           4
	//   33   49:dload           14
	//   34   51:dmul            
	//   35   52:dload_0         
	//   36   53:dload           6
	//   37   55:dmul            
	//   38   56:dsub            
	//   39   57:dstore          12
		if(d1 == 0.0D && d6 == 0.0D)
	//*  40   59:dload_2         
	//*  41   60:dconst_0        
	//*  42   61:dcmpl           
	//*  43   62:ifne            211
	//*  44   65:dload           12
	//*  45   67:dconst_0        
	//*  46   68:dcmpl           
	//*  47   69:ifne            211
		{
			if(d2 != 0.0D)
	//*  48   72:dload           4
	//*  49   74:dconst_0        
	//*  50   75:dcmpl           
	//*  51   76:ifeq            139
				return d * d4 <= 0.0D || d4 * d2 >= 0.0D && (d2 <= 0.0D ? d4 >= d2 || d >= d2 : d4 <= d2 || d <= d2);
	//   52   79:dload_0         
	//   53   80:dload           8
	//   54   82:dmul            
	//   55   83:dconst_0        
	//   56   84:dcmpg           
	//   57   85:ifle            120
	//   58   88:dload           8
	//   59   90:dload           4
	//   60   92:dmul            
	//   61   93:dconst_0        
	//   62   94:dcmpl           
	//   63   95:iflt            137
	//   64   98:dload           4
	//   65  100:dconst_0        
	//   66  101:dcmpl           
	//   67  102:ifle            122
	//   68  105:dload           8
	//   69  107:dload           4
	//   70  109:dcmpg           
	//   71  110:ifle            120
	//   72  113:dload_0         
	//   73  114:dload           4
	//   74  116:dcmpg           
	//   75  117:ifgt            137
	//   76  120:iconst_1        
	//   77  121:ireturn         
	//   78  122:dload           8
	//   79  124:dload           4
	//   80  126:dcmpl           
	//   81  127:ifge            120
	//   82  130:dload_0         
	//   83  131:dload           4
	//   84  133:dcmpl           
	//   85  134:ifge            120
	//   86  137:iconst_0        
	//   87  138:ireturn         
			if(d3 != 0.0D)
	//*  88  139:dload           6
	//*  89  141:dconst_0        
	//*  90  142:dcmpl           
	//*  91  143:ifeq            209
				return d7 * d5 <= 0.0D || d5 * d3 >= 0.0D && (d3 <= 0.0D ? d5 >= d3 || d7 >= d3 : d5 <= d3 || d7 <= d3);
	//   92  146:dload           14
	//   93  148:dload           10
	//   94  150:dmul            
	//   95  151:dconst_0        
	//   96  152:dcmpg           
	//   97  153:ifle            189
	//   98  156:dload           10
	//   99  158:dload           6
	//  100  160:dmul            
	//  101  161:dconst_0        
	//  102  162:dcmpl           
	//  103  163:iflt            207
	//  104  166:dload           6
	//  105  168:dconst_0        
	//  106  169:dcmpl           
	//  107  170:ifle            191
	//  108  173:dload           10
	//  109  175:dload           6
	//  110  177:dcmpg           
	//  111  178:ifle            189
	//  112  181:dload           14
	//  113  183:dload           6
	//  114  185:dcmpg           
	//  115  186:ifgt            207
	//  116  189:iconst_1        
	//  117  190:ireturn         
	//  118  191:dload           10
	//  119  193:dload           6
	//  120  195:dcmpl           
	//  121  196:ifge            189
	//  122  199:dload           14
	//  123  201:dload           6
	//  124  203:dcmpl           
	//  125  204:ifge            189
	//  126  207:iconst_0        
	//  127  208:ireturn         
			else
				return false;
	//  128  209:iconst_0        
	//  129  210:ireturn         
		}
		d = d4 * d7 - d * d5;
	//  130  211:dload           8
	//  131  213:dload           14
	//  132  215:dmul            
	//  133  216:dload_0         
	//  134  217:dload           10
	//  135  219:dmul            
	//  136  220:dsub            
	//  137  221:dstore_0        
		return d1 * d6 <= 0.0D && ((d1 + d) - d6) * d <= 0.0D;
	//  138  222:dload_2         
	//  139  223:dload           12
	//  140  225:dmul            
	//  141  226:dconst_0        
	//  142  227:dcmpg           
	//  143  228:ifgt            246
	//  144  231:dload_2         
	//  145  232:dload_0         
	//  146  233:dadd            
	//  147  234:dload           12
	//  148  236:dsub            
	//  149  237:dload_0         
	//  150  238:dmul            
	//  151  239:dconst_0        
	//  152  240:dcmpg           
	//  153  241:ifgt            246
	//  154  244:iconst_1        
	//  155  245:ireturn         
	//  156  246:iconst_0        
	//  157  247:ireturn         
	}

	public static double ptLineDist(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		return Math.sqrt(ptLineDistSq(d, d1, d2, d3, d4, d5));
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dload           4
	//    3    4:dload           6
	//    4    6:dload           8
	//    5    8:dload           10
	//    6   10:invokestatic    #29  <Method double ptLineDistSq(double, double, double, double, double, double)>
	//    7   13:invokestatic    #35  <Method double Math.sqrt(double)>
	//    8   16:dreturn         
	}

	public static double ptLineDistSq(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		d2 -= d;
	//    0    0:dload           4
	//    1    2:dload_0         
	//    2    3:dsub            
	//    3    4:dstore          4
		d3 -= d1;
	//    4    6:dload           6
	//    5    8:dload_2         
	//    6    9:dsub            
	//    7   10:dstore          6
		d = (d4 - d) * d3 - (d5 - d1) * d2;
	//    8   12:dload           8
	//    9   14:dload_0         
	//   10   15:dsub            
	//   11   16:dload           6
	//   12   18:dmul            
	//   13   19:dload           10
	//   14   21:dload_2         
	//   15   22:dsub            
	//   16   23:dload           4
	//   17   25:dmul            
	//   18   26:dsub            
	//   19   27:dstore_0        
		return (d * d) / (d2 * d2 + d3 * d3);
	//   20   28:dload_0         
	//   21   29:dload_0         
	//   22   30:dmul            
	//   23   31:dload           4
	//   24   33:dload           4
	//   25   35:dmul            
	//   26   36:dload           6
	//   27   38:dload           6
	//   28   40:dmul            
	//   29   41:dadd            
	//   30   42:ddiv            
	//   31   43:dreturn         
	}

	public static double ptSegDist(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		return Math.sqrt(ptSegDistSq(d, d1, d2, d3, d4, d5));
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dload           4
	//    3    4:dload           6
	//    4    6:dload           8
	//    5    8:dload           10
	//    6   10:invokestatic    #39  <Method double ptSegDistSq(double, double, double, double, double, double)>
	//    7   13:invokestatic    #35  <Method double Math.sqrt(double)>
	//    8   16:dreturn         
	}

	public static double ptSegDistSq(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		d2 -= d;
	//    0    0:dload           4
	//    1    2:dload_0         
	//    2    3:dsub            
	//    3    4:dstore          4
		d3 -= d1;
	//    4    6:dload           6
	//    5    8:dload_2         
	//    6    9:dsub            
	//    7   10:dstore          6
		d = d4 - d;
	//    8   12:dload           8
	//    9   14:dload_0         
	//   10   15:dsub            
	//   11   16:dstore_0        
		d1 = d5 - d1;
	//   12   17:dload           10
	//   13   19:dload_2         
	//   14   20:dsub            
	//   15   21:dstore_2        
		if(d * d2 + d1 * d3 <= 0.0D)
	//*  16   22:dload_0         
	//*  17   23:dload           4
	//*  18   25:dmul            
	//*  19   26:dload_2         
	//*  20   27:dload           6
	//*  21   29:dmul            
	//*  22   30:dadd            
	//*  23   31:dconst_0        
	//*  24   32:dcmpg           
	//*  25   33:ifgt            56
		{
			d = d * d + d1 * d1;
	//   26   36:dload_0         
	//   27   37:dload_0         
	//   28   38:dmul            
	//   29   39:dload_2         
	//   30   40:dload_2         
	//   31   41:dmul            
	//   32   42:dadd            
	//   33   43:dstore_0        
		} else
	//*  34   44:dload_0         
	//*  35   45:dstore_2        
	//*  36   46:dload_0         
	//*  37   47:dconst_0        
	//*  38   48:dcmpg           
	//*  39   49:ifge            54
	//*  40   52:dconst_0        
	//*  41   53:dstore_2        
	//*  42   54:dload_2         
	//*  43   55:dreturn         
		{
			d = d2 - d;
	//   44   56:dload           4
	//   45   58:dload_0         
	//   46   59:dsub            
	//   47   60:dstore_0        
			d1 = d3 - d1;
	//   48   61:dload           6
	//   49   63:dload_2         
	//   50   64:dsub            
	//   51   65:dstore_2        
			if(d * d2 + d1 * d3 <= 0.0D)
	//*  52   66:dload_0         
	//*  53   67:dload           4
	//*  54   69:dmul            
	//*  55   70:dload_2         
	//*  56   71:dload           6
	//*  57   73:dmul            
	//*  58   74:dadd            
	//*  59   75:dconst_0        
	//*  60   76:dcmpg           
	//*  61   77:ifgt            91
			{
				d = d * d + d1 * d1;
	//   62   80:dload_0         
	//   63   81:dload_0         
	//   64   82:dmul            
	//   65   83:dload_2         
	//   66   84:dload_2         
	//   67   85:dmul            
	//   68   86:dadd            
	//   69   87:dstore_0        
			} else
	//*  70   88:goto            44
			{
				d = d * d3 - d1 * d2;
	//   71   91:dload_0         
	//   72   92:dload           6
	//   73   94:dmul            
	//   74   95:dload_2         
	//   75   96:dload           4
	//   76   98:dmul            
	//   77   99:dsub            
	//   78  100:dstore_0        
				d = (d * d) / (d2 * d2 + d3 * d3);
	//   79  101:dload_0         
	//   80  102:dload_0         
	//   81  103:dmul            
	//   82  104:dload           4
	//   83  106:dload           4
	//   84  108:dmul            
	//   85  109:dload           6
	//   86  111:dload           6
	//   87  113:dmul            
	//   88  114:dadd            
	//   89  115:ddiv            
	//   90  116:dstore_0        
			}
		}
		d1 = d;
		if(d < 0.0D)
			d1 = 0.0D;
		return d1;
	//*  91  117:goto            44
	}

	public static int relativeCCW(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		d2 -= d;
	//    0    0:dload           4
	//    1    2:dload_0         
	//    2    3:dsub            
	//    3    4:dstore          4
		d3 -= d1;
	//    4    6:dload           6
	//    5    8:dload_2         
	//    6    9:dsub            
	//    7   10:dstore          6
		d4 -= d;
	//    8   12:dload           8
	//    9   14:dload_0         
	//   10   15:dsub            
	//   11   16:dstore          8
		d5 -= d1;
	//   12   18:dload           10
	//   13   20:dload_2         
	//   14   21:dsub            
	//   15   22:dstore          10
		d1 = d4 * d3 - d5 * d2;
	//   16   24:dload           8
	//   17   26:dload           6
	//   18   28:dmul            
	//   19   29:dload           10
	//   20   31:dload           4
	//   21   33:dmul            
	//   22   34:dsub            
	//   23   35:dstore_2        
		d = d1;
	//   24   36:dload_2         
	//   25   37:dstore_0        
		if(d1 == 0.0D)
	//*  26   38:dload_2         
	//*  27   39:dconst_0        
	//*  28   40:dcmpl           
	//*  29   41:ifne            92
		{
			d1 = d4 * d2 + d5 * d3;
	//   30   44:dload           8
	//   31   46:dload           4
	//   32   48:dmul            
	//   33   49:dload           10
	//   34   51:dload           6
	//   35   53:dmul            
	//   36   54:dadd            
	//   37   55:dstore_2        
			d = d1;
	//   38   56:dload_2         
	//   39   57:dstore_0        
			if(d1 > 0.0D)
	//*  40   58:dload_2         
	//*  41   59:dconst_0        
	//*  42   60:dcmpl           
	//*  43   61:ifle            92
			{
				d1 = (d4 - d2) * d2 + (d5 - d3) * d3;
	//   44   64:dload           8
	//   45   66:dload           4
	//   46   68:dsub            
	//   47   69:dload           4
	//   48   71:dmul            
	//   49   72:dload           10
	//   50   74:dload           6
	//   51   76:dsub            
	//   52   77:dload           6
	//   53   79:dmul            
	//   54   80:dadd            
	//   55   81:dstore_2        
				d = d1;
	//   56   82:dload_2         
	//   57   83:dstore_0        
				if(d1 < 0.0D)
	//*  58   84:dload_2         
	//*  59   85:dconst_0        
	//*  60   86:dcmpg           
	//*  61   87:ifge            92
					d = 0.0D;
	//   62   90:dconst_0        
	//   63   91:dstore_0        
			}
		}
		if(d < 0.0D)
	//*  64   92:dload_0         
	//*  65   93:dconst_0        
	//*  66   94:dcmpg           
	//*  67   95:ifge            100
			return -1;
	//   68   98:iconst_m1       
	//   69   99:ireturn         
		return d <= 0.0D ? 0 : 1;
	//   70  100:dload_0         
	//   71  101:dconst_0        
	//   72  102:dcmpl           
	//   73  103:ifle            108
	//   74  106:iconst_1        
	//   75  107:ireturn         
	//   76  108:iconst_0        
	//   77  109:ireturn         
	}

	public Object clone()
	{
		Object obj;
		try
		{
			obj = super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   5    7:astore_1        
		{
			throw new InternalError();
	//    6    8:new             #49  <Class InternalError>
	//    7   11:dup             
	//    8   12:invokespecial   #50  <Method void InternalError()>
	//    9   15:athrow          
		}
		return obj;
	}

	public boolean contains(double d, double d1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean contains(double d, double d1, double d2, double d3)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean contains(Point2D point2d)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean contains(Rectangle2D rectangle2d)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Rectangle getBounds()
	{
		return getBounds2D().getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method Rectangle2D getBounds2D()>
	//    2    4:invokevirtual   #65  <Method Rectangle Rectangle2D.getBounds()>
	//    3    7:areturn         
	}

	public abstract Point2D getP1();

	public abstract Point2D getP2();

	public PathIterator getPathIterator(AffineTransform affinetransform)
	{
		return ((PathIterator) (new Iterator(this, affinetransform)));
	//    0    0:new             #16  <Class Line2D$Iterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #73  <Method void Line2D$Iterator(Line2D, Line2D, AffineTransform)>
	//    6   10:areturn         
	}

	public PathIterator getPathIterator(AffineTransform affinetransform, double d)
	{
		return ((PathIterator) (new Iterator(this, affinetransform)));
	//    0    0:new             #16  <Class Line2D$Iterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #73  <Method void Line2D$Iterator(Line2D, Line2D, AffineTransform)>
	//    6   10:areturn         
	}

	public abstract double getX1();

	public abstract double getX2();

	public abstract double getY1();

	public abstract double getY2();

	public boolean intersects(double d, double d1, double d2, double d3)
	{
		return intersects(((Rectangle2D) (new Rectangle2D.Double(d, d1, d2, d3))));
	//    0    0:aload_0         
	//    1    1:new             #82  <Class Rectangle2D$Double>
	//    2    4:dup             
	//    3    5:dload_1         
	//    4    6:dload_3         
	//    5    7:dload           5
	//    6    9:dload           7
	//    7   11:invokespecial   #85  <Method void Rectangle2D$Double(double, double, double, double)>
	//    8   14:invokevirtual   #87  <Method boolean intersects(Rectangle2D)>
	//    9   17:ireturn         
	}

	public boolean intersects(Rectangle2D rectangle2d)
	{
		return rectangle2d.intersectsLine(getX1(), getY1(), getX2(), getY2());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #89  <Method double getX1()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #91  <Method double getY1()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #93  <Method double getX2()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #95  <Method double getY2()>
	//    9   17:invokevirtual   #98  <Method boolean Rectangle2D.intersectsLine(double, double, double, double)>
	//   10   20:ireturn         
	}

	public boolean intersectsLine(double d, double d1, double d2, double d3)
	{
		return linesIntersect(d, d1, d2, d3, getX1(), getY1(), getX2(), getY2());
	//    0    0:dload_1         
	//    1    1:dload_3         
	//    2    2:dload           5
	//    3    4:dload           7
	//    4    6:aload_0         
	//    5    7:invokevirtual   #89  <Method double getX1()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #91  <Method double getY1()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #93  <Method double getX2()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #95  <Method double getY2()>
	//   12   22:invokestatic    #100 <Method boolean linesIntersect(double, double, double, double, double, double, double, double)>
	//   13   25:ireturn         
	}

	public boolean intersectsLine(Line2D line2d)
	{
		return linesIntersect(line2d.getX1(), line2d.getY1(), line2d.getX2(), line2d.getY2(), getX1(), getY1(), getX2(), getY2());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #89  <Method double getX1()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #91  <Method double getY1()>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #93  <Method double getX2()>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #95  <Method double getY2()>
	//   16   32:invokestatic    #100 <Method boolean linesIntersect(double, double, double, double, double, double, double, double)>
	//   17   35:ireturn         
	}

	public double ptLineDist(double d, double d1)
	{
		return ptLineDist(getX1(), getY1(), getX2(), getY2(), d, d1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:dload_1         
	//    9   17:dload_3         
	//   10   18:invokestatic    #104 <Method double ptLineDist(double, double, double, double, double, double)>
	//   11   21:dreturn         
	}

	public double ptLineDist(Point2D point2d)
	{
		return ptLineDist(getX1(), getY1(), getX2(), getY2(), point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #110 <Method double Point2D.getX()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #113 <Method double Point2D.getY()>
	//   12   24:invokestatic    #104 <Method double ptLineDist(double, double, double, double, double, double)>
	//   13   27:dreturn         
	}

	public double ptLineDistSq(double d, double d1)
	{
		return ptLineDistSq(getX1(), getY1(), getX2(), getY2(), d, d1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:dload_1         
	//    9   17:dload_3         
	//   10   18:invokestatic    #29  <Method double ptLineDistSq(double, double, double, double, double, double)>
	//   11   21:dreturn         
	}

	public double ptLineDistSq(Point2D point2d)
	{
		return ptLineDistSq(getX1(), getY1(), getX2(), getY2(), point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #110 <Method double Point2D.getX()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #113 <Method double Point2D.getY()>
	//   12   24:invokestatic    #29  <Method double ptLineDistSq(double, double, double, double, double, double)>
	//   13   27:dreturn         
	}

	public double ptSegDist(double d, double d1)
	{
		return ptSegDist(getX1(), getY1(), getX2(), getY2(), d, d1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:dload_1         
	//    9   17:dload_3         
	//   10   18:invokestatic    #115 <Method double ptSegDist(double, double, double, double, double, double)>
	//   11   21:dreturn         
	}

	public double ptSegDist(Point2D point2d)
	{
		return ptSegDist(getX1(), getY1(), getX2(), getY2(), point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #110 <Method double Point2D.getX()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #113 <Method double Point2D.getY()>
	//   12   24:invokestatic    #115 <Method double ptSegDist(double, double, double, double, double, double)>
	//   13   27:dreturn         
	}

	public double ptSegDistSq(double d, double d1)
	{
		return ptSegDistSq(getX1(), getY1(), getX2(), getY2(), d, d1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:dload_1         
	//    9   17:dload_3         
	//   10   18:invokestatic    #39  <Method double ptSegDistSq(double, double, double, double, double, double)>
	//   11   21:dreturn         
	}

	public double ptSegDistSq(Point2D point2d)
	{
		return ptSegDistSq(getX1(), getY1(), getX2(), getY2(), point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #110 <Method double Point2D.getX()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #113 <Method double Point2D.getY()>
	//   12   24:invokestatic    #39  <Method double ptSegDistSq(double, double, double, double, double, double)>
	//   13   27:dreturn         
	}

	public int relativeCCW(double d, double d1)
	{
		return relativeCCW(getX1(), getY1(), getX2(), getY2(), d, d1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:dload_1         
	//    9   17:dload_3         
	//   10   18:invokestatic    #118 <Method int relativeCCW(double, double, double, double, double, double)>
	//   11   21:ireturn         
	}

	public int relativeCCW(Point2D point2d)
	{
		return relativeCCW(getX1(), getY1(), getX2(), getY2(), point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method double getX1()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #91  <Method double getY1()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #93  <Method double getX2()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #95  <Method double getY2()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #110 <Method double Point2D.getX()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #113 <Method double Point2D.getY()>
	//   12   24:invokestatic    #118 <Method int relativeCCW(double, double, double, double, double, double)>
	//   13   27:ireturn         
	}

	public abstract void setLine(double d, double d1, double d2, double d3);

	public void setLine(Line2D line2d)
	{
		setLine(line2d.getX1(), line2d.getY1(), line2d.getX2(), line2d.getY2());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #89  <Method double getX1()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #91  <Method double getY1()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #93  <Method double getX2()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #95  <Method double getY2()>
	//    9   17:invokevirtual   #123 <Method void setLine(double, double, double, double)>
	//   10   20:return          
	}

	public void setLine(Point2D point2d, Point2D point2d1)
	{
		setLine(point2d.getX(), point2d.getY(), point2d1.getX(), point2d1.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #113 <Method double Point2D.getY()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #110 <Method double Point2D.getX()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #113 <Method double Point2D.getY()>
	//    9   17:invokevirtual   #123 <Method void setLine(double, double, double, double)>
	//   10   20:return          
	}
}
