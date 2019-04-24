// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


// Referenced classes of package com.itextpdf.awt.geom:
//			Line2D, Point2D, Rectangle2D

public static class Line2D$Double extends Line2D
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
		return ((Rectangle2D) (new uble(d, d2, d1, d3)));
	//*  57  105:goto            56
	}

	public Point2D getP1()
	{
		return ((Point2D) (new (x1, y1)));
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
		return ((Point2D) (new (x2, y2)));
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

	public Line2D$Double()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Line2D()>
	//    2    4:return          
	}

	public Line2D$Double(double d, double d1, double d2, double d3)
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

	public Line2D$Double(Point2D point2d, Point2D point2d1)
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
