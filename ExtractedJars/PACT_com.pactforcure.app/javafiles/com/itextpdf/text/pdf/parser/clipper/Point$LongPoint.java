// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Point

public static class Point$LongPoint extends Point
{

	public static double getDeltaX(Point$LongPoint point$longpoint, Point$LongPoint point$longpoint1)
	{
		if(point$longpoint.getY() == point$longpoint1.getY())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #35  <Method long getY()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #35  <Method long getY()>
	//*   4    8:lcmp            
	//*   5    9:ifne            16
			return -3.4E+38D;
	//    6   12:ldc2w           #36  <Double -3.4E+38D>
	//    7   15:dreturn         
		else
			return (double)(point$longpoint1.getX() - point$longpoint.getX()) / (double)(point$longpoint1.getY() - point$longpoint.getY());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #40  <Method long getX()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #40  <Method long getX()>
	//   12   24:lsub            
	//   13   25:l2d             
	//   14   26:aload_1         
	//   15   27:invokevirtual   #35  <Method long getY()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #35  <Method long getY()>
	//   18   34:lsub            
	//   19   35:l2d             
	//   20   36:ddiv            
	//   21   37:dreturn         
	}

	public long getX()
	{
		return ((Long)x).longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Number x>
	//    2    4:checkcast       #18  <Class Long>
	//    3    7:invokevirtual   #47  <Method long Long.longValue()>
	//    4   10:lreturn         
	}

	public long getY()
	{
		return ((Long)y).longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Number y>
	//    2    4:checkcast       #18  <Class Long>
	//    3    7:invokevirtual   #47  <Method long Long.longValue()>
	//    4   10:lreturn         
	}

	public long getZ()
	{
		return ((Long)z).longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Number z>
	//    2    4:checkcast       #18  <Class Long>
	//    3    7:invokevirtual   #47  <Method long Long.longValue()>
	//    4   10:lreturn         
	}

	public Point$LongPoint()
	{
		this(0L, 0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:lconst_0        
	//    3    3:invokespecial   #11  <Method void Point$LongPoint(long, long)>
	//    4    6:return          
	}

	public Point$LongPoint(double d, double d1)
	{
		this((long)d, (long)d1);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:d2l             
	//    3    3:dload_3         
	//    4    4:d2l             
	//    5    5:invokespecial   #11  <Method void Point$LongPoint(long, long)>
	//    6    8:return          
	}

	public Point$LongPoint(long l, long l1)
	{
		this(l, l1, 0L);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:lconst_0        
	//    4    4:invokespecial   #16  <Method void Point$LongPoint(long, long, long)>
	//    5    7:return          
	}

	public Point$LongPoint(long l, long l1, long l2)
	{
		super(((Number) (Long.valueOf(l))), ((Number) (Long.valueOf(l1))), ((Number) (Long.valueOf(l2))));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #22  <Method Long Long.valueOf(long)>
	//    3    5:lload_3         
	//    4    6:invokestatic    #22  <Method Long Long.valueOf(long)>
	//    5    9:lload           5
	//    6   11:invokestatic    #22  <Method Long Long.valueOf(long)>
	//    7   14:invokespecial   #25  <Method void Point(Number, Number, Number)>
	//    8   17:return          
	}

	public Point$LongPoint(Point$LongPoint point$longpoint)
	{
		super(((Point) (point$longpoint)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void Point(Point)>
	//    3    5:return          
	}
}
