// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			Line2D, Point2D, Rectangle2D

public static class Line2D$Float extends Line2D
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
		return ((Rectangle2D) (new loat(f1, f3, f, f2)));
	//*  57  102:goto            55
	}

	public Point2D getP1()
	{
		return ((Point2D) (new (x1, y1)));
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
		return ((Point2D) (new (x2, y2)));
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

	public Line2D$Float()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Line2D()>
	//    2    4:return          
	}

	public Line2D$Float(float f, float f1, float f2, float f3)
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

	public Line2D$Float(Point2D point2d, Point2D point2d1)
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
