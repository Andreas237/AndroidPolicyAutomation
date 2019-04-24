// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.math.BigInteger;
import java.util.Comparator;

public abstract class Point
{
	public static class DoublePoint extends Point
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

		public DoublePoint()
		{
			this(0.0D, 0.0D);
		//    0    0:aload_0         
		//    1    1:dconst_0        
		//    2    2:dconst_0        
		//    3    3:invokespecial   #11  <Method void Point$DoublePoint(double, double)>
		//    4    6:return          
		}

		public DoublePoint(double d, double d1)
		{
			this(d, d1, 0.0D);
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:dload_3         
		//    3    3:dconst_0        
		//    4    4:invokespecial   #15  <Method void Point$DoublePoint(double, double, double)>
		//    5    7:return          
		}

		public DoublePoint(double d, double d1, double d2)
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

		public DoublePoint(DoublePoint doublepoint)
		{
			super(((Point) (doublepoint)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #28  <Method void Point(Point)>
		//    3    5:return          
		}
	}

	public static class LongPoint extends Point
	{

		public static double getDeltaX(LongPoint longpoint, LongPoint longpoint1)
		{
			if(longpoint.getY() == longpoint1.getY())
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
				return (double)(longpoint1.getX() - longpoint.getX()) / (double)(longpoint1.getY() - longpoint.getY());
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

		public LongPoint()
		{
			this(0L, 0L);
		//    0    0:aload_0         
		//    1    1:lconst_0        
		//    2    2:lconst_0        
		//    3    3:invokespecial   #11  <Method void Point$LongPoint(long, long)>
		//    4    6:return          
		}

		public LongPoint(double d, double d1)
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

		public LongPoint(long l, long l1)
		{
			this(l, l1, 0L);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:lload_3         
		//    3    3:lconst_0        
		//    4    4:invokespecial   #16  <Method void Point$LongPoint(long, long, long)>
		//    5    7:return          
		}

		public LongPoint(long l, long l1, long l2)
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

		public LongPoint(LongPoint longpoint)
		{
			super(((Point) (longpoint)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #29  <Method void Point(Point)>
		//    3    5:return          
		}
	}

	private static class NumberComparator
		implements Comparator
	{

		public int compare(Number number, Number number1)
			throws ClassCastException
		{
			return ((Comparable)number).compareTo(((Object) (number1)));
		//    0    0:aload_1         
		//    1    1:checkcast       #23  <Class Comparable>
		//    2    4:aload_2         
		//    3    5:invokeinterface #27  <Method int Comparable.compareTo(Object)>
		//    4   10:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Number)obj, (Number)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #33  <Class Number>
		//    3    5:aload_2         
		//    4    6:checkcast       #33  <Class Number>
		//    5    9:invokevirtual   #35  <Method int compare(Number, Number)>
		//    6   12:ireturn         
		}

		private NumberComparator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}


	protected Point(Point point)
	{
		this(point.x, point.y, point.z);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #35  <Field Number x>
	//    3    5:aload_1         
	//    4    6:getfield        #37  <Field Number y>
	//    5    9:aload_1         
	//    6   10:getfield        #39  <Field Number z>
	//    7   13:invokespecial   #42  <Method void Point(Number, Number, Number)>
	//    8   16:return          
	}

	protected Point(Number number, Number number1, Number number2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		x = number;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Number x>
		y = number1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field Number y>
		z = number2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field Number z>
	//   11   19:return          
	}

	static boolean arePointsClose(Point point, Point point1, double d)
	{
		double d1 = point.x.doubleValue() - point1.x.doubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Number x>
	//    2    4:invokevirtual   #55  <Method double Number.doubleValue()>
	//    3    7:aload_1         
	//    4    8:getfield        #35  <Field Number x>
	//    5   11:invokevirtual   #55  <Method double Number.doubleValue()>
	//    6   14:dsub            
	//    7   15:dstore          4
		double d2 = point.y.doubleValue() - point1.y.doubleValue();
	//    8   17:aload_0         
	//    9   18:getfield        #37  <Field Number y>
	//   10   21:invokevirtual   #55  <Method double Number.doubleValue()>
	//   11   24:aload_1         
	//   12   25:getfield        #37  <Field Number y>
	//   13   28:invokevirtual   #55  <Method double Number.doubleValue()>
	//   14   31:dsub            
	//   15   32:dstore          6
		return d1 * d1 + d2 * d2 <= d;
	//   16   34:dload           4
	//   17   36:dload           4
	//   18   38:dmul            
	//   19   39:dload           6
	//   20   41:dload           6
	//   21   43:dmul            
	//   22   44:dadd            
	//   23   45:dload_2         
	//   24   46:dcmpg           
	//   25   47:ifgt            52
	//   26   50:iconst_1        
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	static double distanceFromLineSqrd(Point point, Point point1, Point point2)
	{
		double d = point1.y.doubleValue() - point2.y.doubleValue();
	//    0    0:aload_1         
	//    1    1:getfield        #37  <Field Number y>
	//    2    4:invokevirtual   #55  <Method double Number.doubleValue()>
	//    3    7:aload_2         
	//    4    8:getfield        #37  <Field Number y>
	//    5   11:invokevirtual   #55  <Method double Number.doubleValue()>
	//    6   14:dsub            
	//    7   15:dstore_3        
		double d1 = point2.x.doubleValue() - point1.x.doubleValue();
	//    8   16:aload_2         
	//    9   17:getfield        #35  <Field Number x>
	//   10   20:invokevirtual   #55  <Method double Number.doubleValue()>
	//   11   23:aload_1         
	//   12   24:getfield        #35  <Field Number x>
	//   13   27:invokevirtual   #55  <Method double Number.doubleValue()>
	//   14   30:dsub            
	//   15   31:dstore          5
		double d2 = point1.x.doubleValue();
	//   16   33:aload_1         
	//   17   34:getfield        #35  <Field Number x>
	//   18   37:invokevirtual   #55  <Method double Number.doubleValue()>
	//   19   40:dstore          7
		double d3 = point1.y.doubleValue();
	//   20   42:aload_1         
	//   21   43:getfield        #37  <Field Number y>
	//   22   46:invokevirtual   #55  <Method double Number.doubleValue()>
	//   23   49:dstore          9
		d2 = (point.x.doubleValue() * d + point.y.doubleValue() * d1) - (d2 * d + d3 * d1);
	//   24   51:aload_0         
	//   25   52:getfield        #35  <Field Number x>
	//   26   55:invokevirtual   #55  <Method double Number.doubleValue()>
	//   27   58:dload_3         
	//   28   59:dmul            
	//   29   60:aload_0         
	//   30   61:getfield        #37  <Field Number y>
	//   31   64:invokevirtual   #55  <Method double Number.doubleValue()>
	//   32   67:dload           5
	//   33   69:dmul            
	//   34   70:dadd            
	//   35   71:dload           7
	//   36   73:dload_3         
	//   37   74:dmul            
	//   38   75:dload           9
	//   39   77:dload           5
	//   40   79:dmul            
	//   41   80:dadd            
	//   42   81:dsub            
	//   43   82:dstore          7
		return (d2 * d2) / (d * d + d1 * d1);
	//   44   84:dload           7
	//   45   86:dload           7
	//   46   88:dmul            
	//   47   89:dload_3         
	//   48   90:dload_3         
	//   49   91:dmul            
	//   50   92:dload           5
	//   51   94:dload           5
	//   52   96:dmul            
	//   53   97:dadd            
	//   54   98:ddiv            
	//   55   99:dreturn         
	}

	static DoublePoint getUnitNormal(LongPoint longpoint, LongPoint longpoint1)
	{
		double d = ((Long)longpoint1.x).longValue() - ((Long)longpoint.x).longValue();
	//    0    0:aload_1         
	//    1    1:getfield        #62  <Field Number Point$LongPoint.x>
	//    2    4:checkcast       #64  <Class Long>
	//    3    7:invokevirtual   #68  <Method long Long.longValue()>
	//    4   10:aload_0         
	//    5   11:getfield        #62  <Field Number Point$LongPoint.x>
	//    6   14:checkcast       #64  <Class Long>
	//    7   17:invokevirtual   #68  <Method long Long.longValue()>
	//    8   20:lsub            
	//    9   21:l2d             
	//   10   22:dstore_2        
		double d1 = ((Long)longpoint1.y).longValue() - ((Long)longpoint.y).longValue();
	//   11   23:aload_1         
	//   12   24:getfield        #69  <Field Number Point$LongPoint.y>
	//   13   27:checkcast       #64  <Class Long>
	//   14   30:invokevirtual   #68  <Method long Long.longValue()>
	//   15   33:aload_0         
	//   16   34:getfield        #69  <Field Number Point$LongPoint.y>
	//   17   37:checkcast       #64  <Class Long>
	//   18   40:invokevirtual   #68  <Method long Long.longValue()>
	//   19   43:lsub            
	//   20   44:l2d             
	//   21   45:dstore          4
		if(d == 0.0D && d1 == 0.0D)
	//*  22   47:dload_2         
	//*  23   48:dconst_0        
	//*  24   49:dcmpl           
	//*  25   50:ifne            68
	//*  26   53:dload           4
	//*  27   55:dconst_0        
	//*  28   56:dcmpl           
	//*  29   57:ifne            68
		{
			return new DoublePoint();
	//   30   60:new             #9   <Class Point$DoublePoint>
	//   31   63:dup             
	//   32   64:invokespecial   #70  <Method void Point$DoublePoint()>
	//   33   67:areturn         
		} else
		{
			double d2 = 1.0D / Math.sqrt(d * d + d1 * d1);
	//   34   68:dconst_1        
	//   35   69:dload_2         
	//   36   70:dload_2         
	//   37   71:dmul            
	//   38   72:dload           4
	//   39   74:dload           4
	//   40   76:dmul            
	//   41   77:dadd            
	//   42   78:invokestatic    #76  <Method double Math.sqrt(double)>
	//   43   81:ddiv            
	//   44   82:dstore          6
			return new DoublePoint(d1 * d2, -(d * d2));
	//   45   84:new             #9   <Class Point$DoublePoint>
	//   46   87:dup             
	//   47   88:dload           4
	//   48   90:dload           6
	//   49   92:dmul            
	//   50   93:dload_2         
	//   51   94:dload           6
	//   52   96:dmul            
	//   53   97:dneg            
	//   54   98:invokespecial   #79  <Method void Point$DoublePoint(double, double)>
	//   55  101:areturn         
		}
	}

	protected static boolean isPt2BetweenPt1AndPt3(LongPoint longpoint, LongPoint longpoint1, LongPoint longpoint2)
	{
		boolean flag4 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		if(!longpoint.equals(((Object) (longpoint2))) && !longpoint.equals(((Object) (longpoint1))) && !longpoint2.equals(((Object) (longpoint1)))) goto _L2; else goto _L1
	//    2    3:aload_0         
	//    3    4:aload_2         
	//    4    5:invokevirtual   #85  <Method boolean Point$LongPoint.equals(Object)>
	//    5    8:ifne            27
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokevirtual   #85  <Method boolean Point$LongPoint.equals(Object)>
	//    9   16:ifne            27
	//   10   19:aload_2         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #85  <Method boolean Point$LongPoint.equals(Object)>
	//   13   24:ifeq            33
_L1:
		flag4 = false;
	//   14   27:iconst_0        
	//   15   28:istore          5
_L4:
		return flag4;
	//   16   30:iload           5
	//   17   32:ireturn         
_L2:
		if(longpoint.x == longpoint2.x)
			break; /* Loop/switch isn't completed */
	//   18   33:aload_0         
	//   19   34:getfield        #62  <Field Number Point$LongPoint.x>
	//   20   37:aload_2         
	//   21   38:getfield        #62  <Field Number Point$LongPoint.x>
	//   22   41:if_acmpeq       116
		boolean flag;
		boolean flag2;
		if(((Long)longpoint1.x).longValue() > ((Long)longpoint.x).longValue())
	//*  23   44:aload_1         
	//*  24   45:getfield        #62  <Field Number Point$LongPoint.x>
	//*  25   48:checkcast       #64  <Class Long>
	//*  26   51:invokevirtual   #68  <Method long Long.longValue()>
	//*  27   54:aload_0         
	//*  28   55:getfield        #62  <Field Number Point$LongPoint.x>
	//*  29   58:checkcast       #64  <Class Long>
	//*  30   61:invokevirtual   #68  <Method long Long.longValue()>
	//*  31   64:lcmp            
	//*  32   65:ifle            105
			flag = true;
	//   33   68:iconst_1        
	//   34   69:istore_3        
		else
	//*  35   70:aload_1         
	//*  36   71:getfield        #62  <Field Number Point$LongPoint.x>
	//*  37   74:checkcast       #64  <Class Long>
	//*  38   77:invokevirtual   #68  <Method long Long.longValue()>
	//*  39   80:aload_2         
	//*  40   81:getfield        #62  <Field Number Point$LongPoint.x>
	//*  41   84:checkcast       #64  <Class Long>
	//*  42   87:invokevirtual   #68  <Method long Long.longValue()>
	//*  43   90:lcmp            
	//*  44   91:ifge            110
	//*  45   94:iconst_1        
	//*  46   95:istore          4
	//*  47   97:iload_3         
	//*  48   98:iload           4
	//*  49  100:icmpeq          30
	//*  50  103:iconst_0        
	//*  51  104:ireturn         
			flag = false;
	//   52  105:iconst_0        
	//   53  106:istore_3        
		if(((Long)longpoint1.x).longValue() < ((Long)longpoint2.x).longValue())
			flag2 = true;
		else
	//*  54  107:goto            70
			flag2 = false;
	//   55  110:iconst_0        
	//   56  111:istore          4
		if(flag != flag2)
			return false;
		if(true) goto _L4; else goto _L3
	//   57  113:goto            97
_L3:
		boolean flag1;
		boolean flag3;
		if(((Long)longpoint1.y).longValue() > ((Long)longpoint.y).longValue())
	//*  58  116:aload_1         
	//*  59  117:getfield        #69  <Field Number Point$LongPoint.y>
	//*  60  120:checkcast       #64  <Class Long>
	//*  61  123:invokevirtual   #68  <Method long Long.longValue()>
	//*  62  126:aload_0         
	//*  63  127:getfield        #69  <Field Number Point$LongPoint.y>
	//*  64  130:checkcast       #64  <Class Long>
	//*  65  133:invokevirtual   #68  <Method long Long.longValue()>
	//*  66  136:lcmp            
	//*  67  137:ifle            177
			flag1 = true;
	//   68  140:iconst_1        
	//   69  141:istore_3        
		else
	//*  70  142:aload_1         
	//*  71  143:getfield        #69  <Field Number Point$LongPoint.y>
	//*  72  146:checkcast       #64  <Class Long>
	//*  73  149:invokevirtual   #68  <Method long Long.longValue()>
	//*  74  152:aload_2         
	//*  75  153:getfield        #69  <Field Number Point$LongPoint.y>
	//*  76  156:checkcast       #64  <Class Long>
	//*  77  159:invokevirtual   #68  <Method long Long.longValue()>
	//*  78  162:lcmp            
	//*  79  163:ifge            182
	//*  80  166:iconst_1        
	//*  81  167:istore          4
	//*  82  169:iload_3         
	//*  83  170:iload           4
	//*  84  172:icmpeq          30
	//*  85  175:iconst_0        
	//*  86  176:ireturn         
			flag1 = false;
	//   87  177:iconst_0        
	//   88  178:istore_3        
		if(((Long)longpoint1.y).longValue() < ((Long)longpoint2.y).longValue())
			flag3 = true;
		else
	//*  89  179:goto            142
			flag3 = false;
	//   90  182:iconst_0        
	//   91  183:istore          4
		if(flag1 != flag3)
			return false;
		if(true) goto _L4; else goto _L5
	//   92  185:goto            169
_L5:
	}

	protected static boolean slopesEqual(LongPoint longpoint, LongPoint longpoint1, LongPoint longpoint2, LongPoint longpoint3, boolean flag)
	{
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            63
			return BigInteger.valueOf(longpoint.getY() - longpoint1.getY()).multiply(BigInteger.valueOf(longpoint2.getX() - longpoint3.getX())).equals(((Object) (BigInteger.valueOf(longpoint.getX() - longpoint1.getX()).multiply(BigInteger.valueOf(longpoint2.getY() - longpoint3.getY())))));
	//    2    5:aload_0         
	//    3    6:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//    6   13:lsub            
	//    7   14:invokestatic    #96  <Method BigInteger BigInteger.valueOf(long)>
	//    8   17:aload_2         
	//    9   18:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   10   21:aload_3         
	//   11   22:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   12   25:lsub            
	//   13   26:invokestatic    #96  <Method BigInteger BigInteger.valueOf(long)>
	//   14   29:invokevirtual   #103 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   15   32:aload_0         
	//   16   33:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   17   36:aload_1         
	//   18   37:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   19   40:lsub            
	//   20   41:invokestatic    #96  <Method BigInteger BigInteger.valueOf(long)>
	//   21   44:aload_2         
	//   22   45:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   23   48:aload_3         
	//   24   49:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   25   52:lsub            
	//   26   53:invokestatic    #96  <Method BigInteger BigInteger.valueOf(long)>
	//   27   56:invokevirtual   #103 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   28   59:invokevirtual   #104 <Method boolean BigInteger.equals(Object)>
	//   29   62:ireturn         
		return (longpoint.getY() - longpoint1.getY()) * (longpoint2.getX() - longpoint3.getX()) - (longpoint.getX() - longpoint1.getX()) * (longpoint2.getY() - longpoint3.getY()) == 0L;
	//   30   63:aload_0         
	//   31   64:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   32   67:aload_1         
	//   33   68:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   34   71:lsub            
	//   35   72:aload_2         
	//   36   73:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   37   76:aload_3         
	//   38   77:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   39   80:lsub            
	//   40   81:lmul            
	//   41   82:aload_0         
	//   42   83:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   43   86:aload_1         
	//   44   87:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   45   90:lsub            
	//   46   91:aload_2         
	//   47   92:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   48   95:aload_3         
	//   49   96:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   50   99:lsub            
	//   51  100:lmul            
	//   52  101:lsub            
	//   53  102:lconst_0        
	//   54  103:lcmp            
	//   55  104:ifne            109
	//   56  107:iconst_1        
	//   57  108:ireturn         
	//   58  109:iconst_0        
	//   59  110:ireturn         
	}

	protected static boolean slopesEqual(LongPoint longpoint, LongPoint longpoint1, LongPoint longpoint2, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            62
			return BigInteger.valueOf(longpoint.getY() - longpoint1.getY()).multiply(BigInteger.valueOf(longpoint1.getX() - longpoint2.getX())).equals(((Object) (BigInteger.valueOf(longpoint.getX() - longpoint1.getX()).multiply(BigInteger.valueOf(longpoint1.getY() - longpoint2.getY())))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//    6   12:lsub            
	//    7   13:invokestatic    #96  <Method BigInteger BigInteger.valueOf(long)>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   12   24:lsub            
	//   13   25:invokestatic    #96  <Method BigInteger BigInteger.valueOf(long)>
	//   14   28:invokevirtual   #103 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   19   39:lsub            
	//   20   40:invokestatic    #96  <Method BigInteger BigInteger.valueOf(long)>
	//   21   43:aload_1         
	//   22   44:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   23   47:aload_2         
	//   24   48:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   25   51:lsub            
	//   26   52:invokestatic    #96  <Method BigInteger BigInteger.valueOf(long)>
	//   27   55:invokevirtual   #103 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   28   58:invokevirtual   #104 <Method boolean BigInteger.equals(Object)>
	//   29   61:ireturn         
		return (longpoint.getY() - longpoint1.getY()) * (longpoint1.getX() - longpoint2.getX()) - (longpoint.getX() - longpoint1.getX()) * (longpoint1.getY() - longpoint2.getY()) == 0L;
	//   30   62:aload_0         
	//   31   63:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   32   66:aload_1         
	//   33   67:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   34   70:lsub            
	//   35   71:aload_1         
	//   36   72:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   37   75:aload_2         
	//   38   76:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   39   79:lsub            
	//   40   80:lmul            
	//   41   81:aload_0         
	//   42   82:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   43   85:aload_1         
	//   44   86:invokevirtual   #99  <Method long Point$LongPoint.getX()>
	//   45   89:lsub            
	//   46   90:aload_1         
	//   47   91:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   48   94:aload_2         
	//   49   95:invokevirtual   #90  <Method long Point$LongPoint.getY()>
	//   50   98:lsub            
	//   51   99:lmul            
	//   52  100:lsub            
	//   53  101:lconst_0        
	//   54  102:lcmp            
	//   55  103:ifne            108
	//   56  106:iconst_1        
	//   57  107:ireturn         
	//   58  108:iconst_0        
	//   59  109:ireturn         
	}

	static boolean slopesNearCollinear(LongPoint longpoint, LongPoint longpoint1, LongPoint longpoint2, double d)
	{
		if(Math.abs(((Long)longpoint.x).longValue() - ((Long)longpoint1.x).longValue()) <= Math.abs(((Long)longpoint.y).longValue() - ((Long)longpoint1.y).longValue())) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Number Point$LongPoint.x>
	//    2    4:checkcast       #64  <Class Long>
	//    3    7:invokevirtual   #68  <Method long Long.longValue()>
	//    4   10:aload_1         
	//    5   11:getfield        #62  <Field Number Point$LongPoint.x>
	//    6   14:checkcast       #64  <Class Long>
	//    7   17:invokevirtual   #68  <Method long Long.longValue()>
	//    8   20:lsub            
	//    9   21:invokestatic    #111 <Method long Math.abs(long)>
	//   10   24:aload_0         
	//   11   25:getfield        #69  <Field Number Point$LongPoint.y>
	//   12   28:checkcast       #64  <Class Long>
	//   13   31:invokevirtual   #68  <Method long Long.longValue()>
	//   14   34:aload_1         
	//   15   35:getfield        #69  <Field Number Point$LongPoint.y>
	//   16   38:checkcast       #64  <Class Long>
	//   17   41:invokevirtual   #68  <Method long Long.longValue()>
	//   18   44:lsub            
	//   19   45:invokestatic    #111 <Method long Math.abs(long)>
	//   20   48:lcmp            
	//   21   49:ifle            239
_L1:
		boolean flag;
		boolean flag4;
		if(((Long)longpoint.x).longValue() > ((Long)longpoint1.x).longValue())
	//*  22   52:aload_0         
	//*  23   53:getfield        #62  <Field Number Point$LongPoint.x>
	//*  24   56:checkcast       #64  <Class Long>
	//*  25   59:invokevirtual   #68  <Method long Long.longValue()>
	//*  26   62:aload_1         
	//*  27   63:getfield        #62  <Field Number Point$LongPoint.x>
	//*  28   66:checkcast       #64  <Class Long>
	//*  29   69:invokevirtual   #68  <Method long Long.longValue()>
	//*  30   72:lcmp            
	//*  31   73:ifle            126
			flag = true;
	//   32   76:iconst_1        
	//   33   77:istore          5
		else
	//*  34   79:aload_0         
	//*  35   80:getfield        #62  <Field Number Point$LongPoint.x>
	//*  36   83:checkcast       #64  <Class Long>
	//*  37   86:invokevirtual   #68  <Method long Long.longValue()>
	//*  38   89:aload_2         
	//*  39   90:getfield        #62  <Field Number Point$LongPoint.x>
	//*  40   93:checkcast       #64  <Class Long>
	//*  41   96:invokevirtual   #68  <Method long Long.longValue()>
	//*  42   99:lcmp            
	//*  43  100:ifge            132
	//*  44  103:iconst_1        
	//*  45  104:istore          6
	//*  46  106:iload           5
	//*  47  108:iload           6
	//*  48  110:icmpne          140
	//*  49  113:aload_0         
	//*  50  114:aload_1         
	//*  51  115:aload_2         
	//*  52  116:invokestatic    #113 <Method double distanceFromLineSqrd(Point, Point, Point)>
	//*  53  119:dload_3         
	//*  54  120:dcmpg           
	//*  55  121:ifge            138
	//*  56  124:iconst_1        
	//*  57  125:ireturn         
			flag = false;
	//   58  126:iconst_0        
	//   59  127:istore          5
		if(((Long)longpoint.x).longValue() < ((Long)longpoint2.x).longValue())
			flag4 = true;
		else
	//*  60  129:goto            79
			flag4 = false;
	//   61  132:iconst_0        
	//   62  133:istore          6
		if(flag != flag4) goto _L4; else goto _L3
_L3:
		if(distanceFromLineSqrd(((Point) (longpoint)), ((Point) (longpoint1)), ((Point) (longpoint2))) >= d) goto _L6; else goto _L5
_L5:
		return true;
	//*  63  135:goto            106
_L6:
		return false;
	//   64  138:iconst_0        
	//   65  139:ireturn         
_L4:
		boolean flag1;
		boolean flag5;
		if(((Long)longpoint1.x).longValue() > ((Long)longpoint.x).longValue())
	//*  66  140:aload_1         
	//*  67  141:getfield        #62  <Field Number Point$LongPoint.x>
	//*  68  144:checkcast       #64  <Class Long>
	//*  69  147:invokevirtual   #68  <Method long Long.longValue()>
	//*  70  150:aload_0         
	//*  71  151:getfield        #62  <Field Number Point$LongPoint.x>
	//*  72  154:checkcast       #64  <Class Long>
	//*  73  157:invokevirtual   #68  <Method long Long.longValue()>
	//*  74  160:lcmp            
	//*  75  161:ifle            214
			flag1 = true;
	//   76  164:iconst_1        
	//   77  165:istore          5
		else
	//*  78  167:aload_1         
	//*  79  168:getfield        #62  <Field Number Point$LongPoint.x>
	//*  80  171:checkcast       #64  <Class Long>
	//*  81  174:invokevirtual   #68  <Method long Long.longValue()>
	//*  82  177:aload_2         
	//*  83  178:getfield        #62  <Field Number Point$LongPoint.x>
	//*  84  181:checkcast       #64  <Class Long>
	//*  85  184:invokevirtual   #68  <Method long Long.longValue()>
	//*  86  187:lcmp            
	//*  87  188:ifge            220
	//*  88  191:iconst_1        
	//*  89  192:istore          6
	//*  90  194:iload           5
	//*  91  196:iload           6
	//*  92  198:icmpne          226
	//*  93  201:aload_1         
	//*  94  202:aload_0         
	//*  95  203:aload_2         
	//*  96  204:invokestatic    #113 <Method double distanceFromLineSqrd(Point, Point, Point)>
	//*  97  207:dload_3         
	//*  98  208:dcmpg           
	//*  99  209:iflt            124
	//* 100  212:iconst_0        
	//* 101  213:ireturn         
			flag1 = false;
	//  102  214:iconst_0        
	//  103  215:istore          5
		if(((Long)longpoint1.x).longValue() < ((Long)longpoint2.x).longValue())
			flag5 = true;
		else
	//* 104  217:goto            167
			flag5 = false;
	//  105  220:iconst_0        
	//  106  221:istore          6
		if(flag1 != flag5)
			continue; /* Loop/switch isn't completed */
		if(distanceFromLineSqrd(((Point) (longpoint1)), ((Point) (longpoint)), ((Point) (longpoint2))) >= d)
			return false;
		continue; /* Loop/switch isn't completed */
	//  107  223:goto            194
		if(distanceFromLineSqrd(((Point) (longpoint2)), ((Point) (longpoint)), ((Point) (longpoint1))) < d) goto _L5; else goto _L7
	//  108  226:aload_2         
	//  109  227:aload_0         
	//  110  228:aload_1         
	//  111  229:invokestatic    #113 <Method double distanceFromLineSqrd(Point, Point, Point)>
	//  112  232:dload_3         
	//  113  233:dcmpg           
	//  114  234:iflt            124
_L7:
		return false;
	//  115  237:iconst_0        
	//  116  238:ireturn         
_L2:
		boolean flag2;
		boolean flag6;
		if(((Long)longpoint.y).longValue() > ((Long)longpoint1.y).longValue())
	//* 117  239:aload_0         
	//* 118  240:getfield        #69  <Field Number Point$LongPoint.y>
	//* 119  243:checkcast       #64  <Class Long>
	//* 120  246:invokevirtual   #68  <Method long Long.longValue()>
	//* 121  249:aload_1         
	//* 122  250:getfield        #69  <Field Number Point$LongPoint.y>
	//* 123  253:checkcast       #64  <Class Long>
	//* 124  256:invokevirtual   #68  <Method long Long.longValue()>
	//* 125  259:lcmp            
	//* 126  260:ifle            313
			flag2 = true;
	//  127  263:iconst_1        
	//  128  264:istore          5
		else
	//* 129  266:aload_0         
	//* 130  267:getfield        #69  <Field Number Point$LongPoint.y>
	//* 131  270:checkcast       #64  <Class Long>
	//* 132  273:invokevirtual   #68  <Method long Long.longValue()>
	//* 133  276:aload_2         
	//* 134  277:getfield        #69  <Field Number Point$LongPoint.y>
	//* 135  280:checkcast       #64  <Class Long>
	//* 136  283:invokevirtual   #68  <Method long Long.longValue()>
	//* 137  286:lcmp            
	//* 138  287:ifge            319
	//* 139  290:iconst_1        
	//* 140  291:istore          6
	//* 141  293:iload           5
	//* 142  295:iload           6
	//* 143  297:icmpne          325
	//* 144  300:aload_0         
	//* 145  301:aload_1         
	//* 146  302:aload_2         
	//* 147  303:invokestatic    #113 <Method double distanceFromLineSqrd(Point, Point, Point)>
	//* 148  306:dload_3         
	//* 149  307:dcmpg           
	//* 150  308:iflt            124
	//* 151  311:iconst_0        
	//* 152  312:ireturn         
			flag2 = false;
	//  153  313:iconst_0        
	//  154  314:istore          5
		if(((Long)longpoint.y).longValue() < ((Long)longpoint2.y).longValue())
			flag6 = true;
		else
	//* 155  316:goto            266
			flag6 = false;
	//  156  319:iconst_0        
	//  157  320:istore          6
		if(flag2 != flag6)
			break; /* Loop/switch isn't completed */
		if(distanceFromLineSqrd(((Point) (longpoint)), ((Point) (longpoint1)), ((Point) (longpoint2))) >= d)
			return false;
		if(true) goto _L5; else goto _L8
	//* 158  322:goto            293
_L8:
		boolean flag3;
		boolean flag7;
		if(((Long)longpoint1.y).longValue() > ((Long)longpoint.y).longValue())
	//* 159  325:aload_1         
	//* 160  326:getfield        #69  <Field Number Point$LongPoint.y>
	//* 161  329:checkcast       #64  <Class Long>
	//* 162  332:invokevirtual   #68  <Method long Long.longValue()>
	//* 163  335:aload_0         
	//* 164  336:getfield        #69  <Field Number Point$LongPoint.y>
	//* 165  339:checkcast       #64  <Class Long>
	//* 166  342:invokevirtual   #68  <Method long Long.longValue()>
	//* 167  345:lcmp            
	//* 168  346:ifle            399
			flag3 = true;
	//  169  349:iconst_1        
	//  170  350:istore          5
		else
	//* 171  352:aload_1         
	//* 172  353:getfield        #69  <Field Number Point$LongPoint.y>
	//* 173  356:checkcast       #64  <Class Long>
	//* 174  359:invokevirtual   #68  <Method long Long.longValue()>
	//* 175  362:aload_2         
	//* 176  363:getfield        #69  <Field Number Point$LongPoint.y>
	//* 177  366:checkcast       #64  <Class Long>
	//* 178  369:invokevirtual   #68  <Method long Long.longValue()>
	//* 179  372:lcmp            
	//* 180  373:ifge            405
	//* 181  376:iconst_1        
	//* 182  377:istore          6
	//* 183  379:iload           5
	//* 184  381:iload           6
	//* 185  383:icmpne          411
	//* 186  386:aload_1         
	//* 187  387:aload_0         
	//* 188  388:aload_2         
	//* 189  389:invokestatic    #113 <Method double distanceFromLineSqrd(Point, Point, Point)>
	//* 190  392:dload_3         
	//* 191  393:dcmpg           
	//* 192  394:iflt            124
	//* 193  397:iconst_0        
	//* 194  398:ireturn         
			flag3 = false;
	//  195  399:iconst_0        
	//  196  400:istore          5
		if(((Long)longpoint1.y).longValue() < ((Long)longpoint2.y).longValue())
			flag7 = true;
		else
	//* 197  402:goto            352
			flag7 = false;
	//  198  405:iconst_0        
	//  199  406:istore          6
		if(flag3 != flag7)
			continue; /* Loop/switch isn't completed */
		if(distanceFromLineSqrd(((Point) (longpoint1)), ((Point) (longpoint)), ((Point) (longpoint2))) < d) goto _L5; else goto _L9
_L9:
		return false;
	//* 200  408:goto            379
		if(distanceFromLineSqrd(((Point) (longpoint2)), ((Point) (longpoint)), ((Point) (longpoint1))) < d) goto _L5; else goto _L10
	//  201  411:aload_2         
	//  202  412:aload_0         
	//  203  413:aload_1         
	//  204  414:invokestatic    #113 <Method double distanceFromLineSqrd(Point, Point, Point)>
	//  205  417:dload_3         
	//  206  418:dcmpg           
	//  207  419:iflt            124
_L10:
		return false;
	//  208  422:iconst_0        
	//  209  423:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null && (obj instanceof Point))
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
	//*   2    4:iconst_0        
	//*   3    5:ireturn         
	//*   4    6:aload_1         
	//*   5    7:instanceof      #2   <Class Point>
	//*   6   10:ifeq            4
		{
			obj = ((Object) ((Point)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Point>
	//    9   17:astore_1        
			if(NUMBER_COMPARATOR.compare(x, ((Point) (obj)).x) == 0 && NUMBER_COMPARATOR.compare(y, ((Point) (obj)).y) == 0)
	//*  10   18:getstatic       #31  <Field Point$NumberComparator NUMBER_COMPARATOR>
	//*  11   21:aload_0         
	//*  12   22:getfield        #35  <Field Number x>
	//*  13   25:aload_1         
	//*  14   26:getfield        #35  <Field Number x>
	//*  15   29:invokevirtual   #117 <Method int Point$NumberComparator.compare(Number, Number)>
	//*  16   32:ifne            4
	//*  17   35:getstatic       #31  <Field Point$NumberComparator NUMBER_COMPARATOR>
	//*  18   38:aload_0         
	//*  19   39:getfield        #37  <Field Number y>
	//*  20   42:aload_1         
	//*  21   43:getfield        #37  <Field Number y>
	//*  22   46:invokevirtual   #117 <Method int Point$NumberComparator.compare(Number, Number)>
	//*  23   49:ifne            4
				return true;
	//   24   52:iconst_1        
	//   25   53:ireturn         
		}
		return false;
	}

	public void set(Point point)
	{
		x = point.x;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #35  <Field Number x>
	//    3    5:putfield        #35  <Field Number x>
		y = point.y;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #37  <Field Number y>
	//    7   13:putfield        #37  <Field Number y>
		z = point.z;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #39  <Field Number z>
	//   11   21:putfield        #39  <Field Number z>
	//   12   24:return          
	}

	public void setX(Number number)
	{
		x = number;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Number x>
	//    3    5:return          
	}

	public void setY(Number number)
	{
		y = number;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field Number y>
	//    3    5:return          
	}

	public void setZ(Number number)
	{
		z = number;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field Number z>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("Point [x=").append(((Object) (x))).append(", y=").append(((Object) (y))).append(", z=").append(((Object) (z))).append("]").toString();
	//    0    0:new             #127 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #128 <Method void StringBuilder()>
	//    3    7:ldc1            #130 <String "Point [x=">
	//    4    9:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #35  <Field Number x>
	//    7   16:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #139 <String ", y=">
	//    9   21:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #37  <Field Number y>
	//   12   28:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #141 <String ", z=">
	//   14   33:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #39  <Field Number z>
	//   17   40:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:ldc1            #143 <String "]">
	//   19   45:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private static final NumberComparator NUMBER_COMPARATOR = new NumberComparator();
	protected Number x;
	protected Number y;
	protected Number z;

	static 
	{
	//    0    0:new             #15  <Class Point$NumberComparator>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #29  <Method void Point$NumberComparator(Point$1)>
	//    4    8:putstatic       #31  <Field Point$NumberComparator NUMBER_COMPARATOR>
	//*   5   11:return          
	}
}
