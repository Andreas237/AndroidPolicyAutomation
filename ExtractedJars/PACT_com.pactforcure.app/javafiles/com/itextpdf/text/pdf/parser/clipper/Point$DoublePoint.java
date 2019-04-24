// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Point

public static class Point$DoublePoint extends Point
{

	public double getX()
	{
		return ((Double)x).doubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Number x>
	//    2    4:checkcast       #17  <Class Double>
	//    3    7:invokevirtual   #37  <Method double Double.doubleValue()>
	//    4   10:dreturn         
	}

	public double getY()
	{
		return ((Double)y).doubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Number y>
	//    2    4:checkcast       #17  <Class Double>
	//    3    7:invokevirtual   #37  <Method double Double.doubleValue()>
	//    4   10:dreturn         
	}

	public double getZ()
	{
		return ((Double)z).doubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Number z>
	//    2    4:checkcast       #17  <Class Double>
	//    3    7:invokevirtual   #37  <Method double Double.doubleValue()>
	//    4   10:dreturn         
	}

	public Point$DoublePoint()
	{
		this(0.0D, 0.0D);
	//    0    0:aload_0         
	//    1    1:dconst_0        
	//    2    2:dconst_0        
	//    3    3:invokespecial   #11  <Method void Point$DoublePoint(double, double)>
	//    4    6:return          
	}

	public Point$DoublePoint(double d, double d1)
	{
		this(d, d1, 0.0D);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:dconst_0        
	//    4    4:invokespecial   #15  <Method void Point$DoublePoint(double, double, double)>
	//    5    7:return          
	}

	public Point$DoublePoint(double d, double d1, double d2)
	{
		super(((Number) (Double.valueOf(d))), ((Number) (Double.valueOf(d1))), ((Number) (Double.valueOf(d2))));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #21  <Method Double Double.valueOf(double)>
	//    3    5:dload_3         
	//    4    6:invokestatic    #21  <Method Double Double.valueOf(double)>
	//    5    9:dload           5
	//    6   11:invokestatic    #21  <Method Double Double.valueOf(double)>
	//    7   14:invokespecial   #24  <Method void Point(Number, Number, Number)>
	//    8   17:return          
	}

	public Point$DoublePoint(Point$DoublePoint point$doublepoint)
	{
		super(((Point) (point$doublepoint)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void Point(Point)>
	//    3    5:return          
	}
}
