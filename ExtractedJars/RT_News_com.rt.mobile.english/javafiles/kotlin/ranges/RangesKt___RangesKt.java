// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;

// Referenced classes of package kotlin.ranges:
//			RangesKt__RangesKt, RangesKt, ClosedRange, ClosedFloatingPointRange, 
//			CharRange, IntRange, LongRange, CharProgression, 
//			IntProgression, LongProgression

class RangesKt___RangesKt extends RangesKt__RangesKt
{

	public RangesKt___RangesKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void RangesKt__RangesKt()>
	//    2    4:return          
	}

	public static final boolean byteRangeContains(ClosedRange closedrange, double d)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Byte byte1 = RangesKt.toByteExactOrNull(d);
	//    3    6:dload_1         
	//    4    7:invokestatic    #100 <Method Byte RangesKt.toByteExactOrNull(double)>
	//    5   10:astore_3        
		if(byte1 != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)byte1);
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean byteRangeContains(ClosedRange closedrange, float f)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Byte byte1 = RangesKt.toByteExactOrNull(f);
	//    3    6:fload_1         
	//    4    7:invokestatic    #115 <Method Byte RangesKt.toByteExactOrNull(float)>
	//    5   10:astore_2        
		if(byte1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)byte1);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean byteRangeContains(ClosedRange closedrange, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Byte byte1 = RangesKt.toByteExactOrNull(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #119 <Method Byte RangesKt.toByteExactOrNull(int)>
	//    5   10:astore_2        
		if(byte1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)byte1);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean byteRangeContains(ClosedRange closedrange, long l)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Byte byte1 = RangesKt.toByteExactOrNull(l);
	//    3    6:lload_1         
	//    4    7:invokestatic    #123 <Method Byte RangesKt.toByteExactOrNull(long)>
	//    5   10:astore_3        
		if(byte1 != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)byte1);
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean byteRangeContains(ClosedRange closedrange, short word0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Byte byte1 = RangesKt.toByteExactOrNull(word0);
	//    3    6:iload_1         
	//    4    7:invokestatic    #127 <Method Byte RangesKt.toByteExactOrNull(short)>
	//    5   10:astore_2        
		if(byte1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)byte1);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final byte coerceAtLeast(byte byte0, byte byte1)
	{
		byte byte2 = byte0;
	//    0    0:iload_0         
	//    1    1:istore_2        
		if(byte0 < byte1)
	//*   2    2:iload_0         
	//*   3    3:iload_1         
	//*   4    4:icmpge          9
			byte2 = byte1;
	//    5    7:iload_1         
	//    6    8:istore_2        
		return byte2;
	//    7    9:iload_2         
	//    8   10:ireturn         
	}

	public static final double coerceAtLeast(double d, double d1)
	{
		double d2 = d;
	//    0    0:dload_0         
	//    1    1:dstore          4
		if(d < d1)
	//*   2    3:dload_0         
	//*   3    4:dload_2         
	//*   4    5:dcmpg           
	//*   5    6:ifge            12
			d2 = d1;
	//    6    9:dload_2         
	//    7   10:dstore          4
		return d2;
	//    8   12:dload           4
	//    9   14:dreturn         
	}

	public static final float coerceAtLeast(float f, float f1)
	{
		float f2 = f;
	//    0    0:fload_0         
	//    1    1:fstore_2        
		if(f < f1)
	//*   2    2:fload_0         
	//*   3    3:fload_1         
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f2 = f1;
	//    6    8:fload_1         
	//    7    9:fstore_2        
		return f2;
	//    8   10:fload_2         
	//    9   11:freturn         
	}

	public static final int coerceAtLeast(int i, int j)
	{
		int k = i;
	//    0    0:iload_0         
	//    1    1:istore_2        
		if(i < j)
	//*   2    2:iload_0         
	//*   3    3:iload_1         
	//*   4    4:icmpge          9
			k = j;
	//    5    7:iload_1         
	//    6    8:istore_2        
		return k;
	//    7    9:iload_2         
	//    8   10:ireturn         
	}

	public static final long coerceAtLeast(long l, long l1)
	{
		long l2 = l;
	//    0    0:lload_0         
	//    1    1:lstore          4
		if(l < l1)
	//*   2    3:lload_0         
	//*   3    4:lload_2         
	//*   4    5:lcmp            
	//*   5    6:ifge            12
			l2 = l1;
	//    6    9:lload_2         
	//    7   10:lstore          4
		return l2;
	//    8   12:lload           4
	//    9   14:lreturn         
	}

	public static final Comparable coerceAtLeast(Comparable comparable, Comparable comparable1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (comparable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (comparable1)), "minimumValue");
	//    3    6:aload_1         
	//    4    7:ldc1            #134 <String "minimumValue">
	//    5    9:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Comparable comparable2 = comparable;
	//    6   12:aload_0         
	//    7   13:astore_2        
		if(comparable.compareTo(((Object) (comparable1))) < 0)
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  11   21:ifge            26
			comparable2 = comparable1;
	//   12   24:aload_1         
	//   13   25:astore_2        
		return comparable2;
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	public static final short coerceAtLeast(short word0, short word1)
	{
		short word2 = word0;
	//    0    0:iload_0         
	//    1    1:istore_2        
		if(word0 < word1)
	//*   2    2:iload_0         
	//*   3    3:iload_1         
	//*   4    4:icmpge          9
			word2 = word1;
	//    5    7:iload_1         
	//    6    8:istore_2        
		return word2;
	//    7    9:iload_2         
	//    8   10:ireturn         
	}

	public static final byte coerceAtMost(byte byte0, byte byte1)
	{
		byte byte2 = byte0;
	//    0    0:iload_0         
	//    1    1:istore_2        
		if(byte0 > byte1)
	//*   2    2:iload_0         
	//*   3    3:iload_1         
	//*   4    4:icmple          9
			byte2 = byte1;
	//    5    7:iload_1         
	//    6    8:istore_2        
		return byte2;
	//    7    9:iload_2         
	//    8   10:ireturn         
	}

	public static final double coerceAtMost(double d, double d1)
	{
		double d2 = d;
	//    0    0:dload_0         
	//    1    1:dstore          4
		if(d > d1)
	//*   2    3:dload_0         
	//*   3    4:dload_2         
	//*   4    5:dcmpl           
	//*   5    6:ifle            12
			d2 = d1;
	//    6    9:dload_2         
	//    7   10:dstore          4
		return d2;
	//    8   12:dload           4
	//    9   14:dreturn         
	}

	public static final float coerceAtMost(float f, float f1)
	{
		float f2 = f;
	//    0    0:fload_0         
	//    1    1:fstore_2        
		if(f > f1)
	//*   2    2:fload_0         
	//*   3    3:fload_1         
	//*   4    4:fcmpl           
	//*   5    5:ifle            10
			f2 = f1;
	//    6    8:fload_1         
	//    7    9:fstore_2        
		return f2;
	//    8   10:fload_2         
	//    9   11:freturn         
	}

	public static final int coerceAtMost(int i, int j)
	{
		int k = i;
	//    0    0:iload_0         
	//    1    1:istore_2        
		if(i > j)
	//*   2    2:iload_0         
	//*   3    3:iload_1         
	//*   4    4:icmple          9
			k = j;
	//    5    7:iload_1         
	//    6    8:istore_2        
		return k;
	//    7    9:iload_2         
	//    8   10:ireturn         
	}

	public static final long coerceAtMost(long l, long l1)
	{
		long l2 = l;
	//    0    0:lload_0         
	//    1    1:lstore          4
		if(l > l1)
	//*   2    3:lload_0         
	//*   3    4:lload_2         
	//*   4    5:lcmp            
	//*   5    6:ifle            12
			l2 = l1;
	//    6    9:lload_2         
	//    7   10:lstore          4
		return l2;
	//    8   12:lload           4
	//    9   14:lreturn         
	}

	public static final Comparable coerceAtMost(Comparable comparable, Comparable comparable1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (comparable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (comparable1)), "maximumValue");
	//    3    6:aload_1         
	//    4    7:ldc1            #141 <String "maximumValue">
	//    5    9:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Comparable comparable2 = comparable;
	//    6   12:aload_0         
	//    7   13:astore_2        
		if(comparable.compareTo(((Object) (comparable1))) > 0)
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  11   21:ifle            26
			comparable2 = comparable1;
	//   12   24:aload_1         
	//   13   25:astore_2        
		return comparable2;
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	public static final short coerceAtMost(short word0, short word1)
	{
		short word2 = word0;
	//    0    0:iload_0         
	//    1    1:istore_2        
		if(word0 > word1)
	//*   2    2:iload_0         
	//*   3    3:iload_1         
	//*   4    4:icmple          9
			word2 = word1;
	//    5    7:iload_1         
	//    6    8:istore_2        
		return word2;
	//    7    9:iload_2         
	//    8   10:ireturn         
	}

	public static final byte coerceIn(byte byte0, byte byte1, byte byte2)
	{
		if(byte1 > byte2)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          61
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #144 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #145 <Method void StringBuilder()>
	//    6   12:astore_3        
			stringbuilder.append("Cannot coerce value to an empty range: maximum ");
	//    7   13:aload_3         
	//    8   14:ldc1            #147 <String "Cannot coerce value to an empty range: maximum ">
	//    9   16:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
			stringbuilder.append(((int) (byte2)));
	//   11   20:aload_3         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   14   25:pop             
			stringbuilder.append(" is less than minimum ");
	//   15   26:aload_3         
	//   16   27:ldc1            #156 <String " is less than minimum ">
	//   17   29:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			stringbuilder.append(((int) (byte1)));
	//   19   33:aload_3         
	//   20   34:iload_1         
	//   21   35:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   22   38:pop             
			stringbuilder.append('.');
	//   23   39:aload_3         
	//   24   40:bipush          46
	//   25   42:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   26   45:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   27   46:new             #161 <Class IllegalArgumentException>
	//   28   49:dup             
	//   29   50:aload_3         
	//   30   51:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   31   54:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   32   57:checkcast       #170 <Class Throwable>
	//   33   60:athrow          
		}
		if(byte0 < byte1)
	//*  34   61:iload_0         
	//*  35   62:iload_1         
	//*  36   63:icmpge          68
			return byte1;
	//   37   66:iload_1         
	//   38   67:ireturn         
		if(byte0 > byte2)
	//*  39   68:iload_0         
	//*  40   69:iload_2         
	//*  41   70:icmple          75
			return byte2;
	//   42   73:iload_2         
	//   43   74:ireturn         
		else
			return byte0;
	//   44   75:iload_0         
	//   45   76:ireturn         
	}

	public static final double coerceIn(double d, double d1, double d2)
	{
		if(d1 > d2)
	//*   0    0:dload_2         
	//*   1    1:dload           4
	//*   2    3:dcmpl           
	//*   3    4:ifle            71
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    7:new             #144 <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #145 <Method void StringBuilder()>
	//    7   14:astore          6
			stringbuilder.append("Cannot coerce value to an empty range: maximum ");
	//    8   16:aload           6
	//    9   18:ldc1            #147 <String "Cannot coerce value to an empty range: maximum ">
	//   10   20:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(d2);
	//   12   24:aload           6
	//   13   26:dload           4
	//   14   28:invokevirtual   #174 <Method StringBuilder StringBuilder.append(double)>
	//   15   31:pop             
			stringbuilder.append(" is less than minimum ");
	//   16   32:aload           6
	//   17   34:ldc1            #156 <String " is less than minimum ">
	//   18   36:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			stringbuilder.append(d1);
	//   20   40:aload           6
	//   21   42:dload_2         
	//   22   43:invokevirtual   #174 <Method StringBuilder StringBuilder.append(double)>
	//   23   46:pop             
			stringbuilder.append('.');
	//   24   47:aload           6
	//   25   49:bipush          46
	//   26   51:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   27   54:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   28   55:new             #161 <Class IllegalArgumentException>
	//   29   58:dup             
	//   30   59:aload           6
	//   31   61:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   32   64:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   33   67:checkcast       #170 <Class Throwable>
	//   34   70:athrow          
		}
		if(d < d1)
	//*  35   71:dload_0         
	//*  36   72:dload_2         
	//*  37   73:dcmpg           
	//*  38   74:ifge            79
			return d1;
	//   39   77:dload_2         
	//   40   78:dreturn         
		if(d > d2)
	//*  41   79:dload_0         
	//*  42   80:dload           4
	//*  43   82:dcmpl           
	//*  44   83:ifle            89
			return d2;
	//   45   86:dload           4
	//   46   88:dreturn         
		else
			return d;
	//   47   89:dload_0         
	//   48   90:dreturn         
	}

	public static final float coerceIn(float f, float f1, float f2)
	{
		if(f1 > f2)
	//*   0    0:fload_1         
	//*   1    1:fload_2         
	//*   2    2:fcmpl           
	//*   3    3:ifle            62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #144 <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #145 <Method void StringBuilder()>
	//    7   13:astore_3        
			stringbuilder.append("Cannot coerce value to an empty range: maximum ");
	//    8   14:aload_3         
	//    9   15:ldc1            #147 <String "Cannot coerce value to an empty range: maximum ">
	//   10   17:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			stringbuilder.append(f2);
	//   12   21:aload_3         
	//   13   22:fload_2         
	//   14   23:invokevirtual   #178 <Method StringBuilder StringBuilder.append(float)>
	//   15   26:pop             
			stringbuilder.append(" is less than minimum ");
	//   16   27:aload_3         
	//   17   28:ldc1            #156 <String " is less than minimum ">
	//   18   30:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			stringbuilder.append(f1);
	//   20   34:aload_3         
	//   21   35:fload_1         
	//   22   36:invokevirtual   #178 <Method StringBuilder StringBuilder.append(float)>
	//   23   39:pop             
			stringbuilder.append('.');
	//   24   40:aload_3         
	//   25   41:bipush          46
	//   26   43:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   27   46:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   28   47:new             #161 <Class IllegalArgumentException>
	//   29   50:dup             
	//   30   51:aload_3         
	//   31   52:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   32   55:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   33   58:checkcast       #170 <Class Throwable>
	//   34   61:athrow          
		}
		if(f < f1)
	//*  35   62:fload_0         
	//*  36   63:fload_1         
	//*  37   64:fcmpg           
	//*  38   65:ifge            70
			return f1;
	//   39   68:fload_1         
	//   40   69:freturn         
		if(f > f2)
	//*  41   70:fload_0         
	//*  42   71:fload_2         
	//*  43   72:fcmpl           
	//*  44   73:ifle            78
			return f2;
	//   45   76:fload_2         
	//   46   77:freturn         
		else
			return f;
	//   47   78:fload_0         
	//   48   79:freturn         
	}

	public static final int coerceIn(int i, int j, int k)
	{
		if(j > k)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          61
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #144 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #145 <Method void StringBuilder()>
	//    6   12:astore_3        
			stringbuilder.append("Cannot coerce value to an empty range: maximum ");
	//    7   13:aload_3         
	//    8   14:ldc1            #147 <String "Cannot coerce value to an empty range: maximum ">
	//    9   16:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
			stringbuilder.append(k);
	//   11   20:aload_3         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   14   25:pop             
			stringbuilder.append(" is less than minimum ");
	//   15   26:aload_3         
	//   16   27:ldc1            #156 <String " is less than minimum ">
	//   17   29:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			stringbuilder.append(j);
	//   19   33:aload_3         
	//   20   34:iload_1         
	//   21   35:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   22   38:pop             
			stringbuilder.append('.');
	//   23   39:aload_3         
	//   24   40:bipush          46
	//   25   42:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   26   45:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   27   46:new             #161 <Class IllegalArgumentException>
	//   28   49:dup             
	//   29   50:aload_3         
	//   30   51:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   31   54:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   32   57:checkcast       #170 <Class Throwable>
	//   33   60:athrow          
		}
		if(i < j)
	//*  34   61:iload_0         
	//*  35   62:iload_1         
	//*  36   63:icmpge          68
			return j;
	//   37   66:iload_1         
	//   38   67:ireturn         
		if(i > k)
	//*  39   68:iload_0         
	//*  40   69:iload_2         
	//*  41   70:icmple          75
			return k;
	//   42   73:iload_2         
	//   43   74:ireturn         
		else
			return i;
	//   44   75:iload_0         
	//   45   76:ireturn         
	}

	public static final int coerceIn(int i, ClosedRange closedrange)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "range");
	//    0    0:aload_1         
	//    1    1:ldc1            #181 <String "range">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(closedrange instanceof ClosedFloatingPointRange)
	//*   3    6:aload_1         
	//*   4    7:instanceof      #183 <Class ClosedFloatingPointRange>
	//*   5   10:ifeq            34
			return ((Number)RangesKt.coerceIn((Comparable)Integer.valueOf(i), (ClosedFloatingPointRange)closedrange)).intValue();
	//    6   13:iload_0         
	//    7   14:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//    8   17:checkcast       #102 <Class Comparable>
	//    9   20:aload_1         
	//   10   21:checkcast       #183 <Class ClosedFloatingPointRange>
	//   11   24:invokestatic    #191 <Method Comparable RangesKt.coerceIn(Comparable, ClosedFloatingPointRange)>
	//   12   27:checkcast       #193 <Class Number>
	//   13   30:invokevirtual   #197 <Method int Number.intValue()>
	//   14   33:ireturn         
		if(closedrange.isEmpty())
	//*  15   34:aload_1         
	//*  16   35:invokeinterface #201 <Method boolean ClosedRange.isEmpty()>
	//*  17   40:ifeq            86
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   43:new             #144 <Class StringBuilder>
	//   19   46:dup             
	//   20   47:invokespecial   #145 <Method void StringBuilder()>
	//   21   50:astore_3        
			stringbuilder.append("Cannot coerce value to an empty range: ");
	//   22   51:aload_3         
	//   23   52:ldc1            #203 <String "Cannot coerce value to an empty range: ">
	//   24   54:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:pop             
			stringbuilder.append(((Object) (closedrange)));
	//   26   58:aload_3         
	//   27   59:aload_1         
	//   28   60:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//   29   63:pop             
			stringbuilder.append('.');
	//   30   64:aload_3         
	//   31   65:bipush          46
	//   32   67:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   33   70:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   34   71:new             #161 <Class IllegalArgumentException>
	//   35   74:dup             
	//   36   75:aload_3         
	//   37   76:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   38   79:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   39   82:checkcast       #170 <Class Throwable>
	//   40   85:athrow          
		}
		if(i < ((Number)closedrange.getStart()).intValue())
	//*  41   86:iload_0         
	//*  42   87:aload_1         
	//*  43   88:invokeinterface #210 <Method Comparable ClosedRange.getStart()>
	//*  44   93:checkcast       #193 <Class Number>
	//*  45   96:invokevirtual   #197 <Method int Number.intValue()>
	//*  46   99:icmpge          115
			return ((Number)closedrange.getStart()).intValue();
	//   47  102:aload_1         
	//   48  103:invokeinterface #210 <Method Comparable ClosedRange.getStart()>
	//   49  108:checkcast       #193 <Class Number>
	//   50  111:invokevirtual   #197 <Method int Number.intValue()>
	//   51  114:ireturn         
		int j = i;
	//   52  115:iload_0         
	//   53  116:istore_2        
		if(i > ((Number)closedrange.getEndInclusive()).intValue())
	//*  54  117:iload_0         
	//*  55  118:aload_1         
	//*  56  119:invokeinterface #213 <Method Comparable ClosedRange.getEndInclusive()>
	//*  57  124:checkcast       #193 <Class Number>
	//*  58  127:invokevirtual   #197 <Method int Number.intValue()>
	//*  59  130:icmple          146
			j = ((Number)closedrange.getEndInclusive()).intValue();
	//   60  133:aload_1         
	//   61  134:invokeinterface #213 <Method Comparable ClosedRange.getEndInclusive()>
	//   62  139:checkcast       #193 <Class Number>
	//   63  142:invokevirtual   #197 <Method int Number.intValue()>
	//   64  145:istore_2        
		return j;
	//   65  146:iload_2         
	//   66  147:ireturn         
	}

	public static final long coerceIn(long l, long l1, long l2)
	{
		if(l1 > l2)
	//*   0    0:lload_2         
	//*   1    1:lload           4
	//*   2    3:lcmp            
	//*   3    4:ifle            71
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    7:new             #144 <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #145 <Method void StringBuilder()>
	//    7   14:astore          6
			stringbuilder.append("Cannot coerce value to an empty range: maximum ");
	//    8   16:aload           6
	//    9   18:ldc1            #147 <String "Cannot coerce value to an empty range: maximum ">
	//   10   20:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(l2);
	//   12   24:aload           6
	//   13   26:lload           4
	//   14   28:invokevirtual   #218 <Method StringBuilder StringBuilder.append(long)>
	//   15   31:pop             
			stringbuilder.append(" is less than minimum ");
	//   16   32:aload           6
	//   17   34:ldc1            #156 <String " is less than minimum ">
	//   18   36:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			stringbuilder.append(l1);
	//   20   40:aload           6
	//   21   42:lload_2         
	//   22   43:invokevirtual   #218 <Method StringBuilder StringBuilder.append(long)>
	//   23   46:pop             
			stringbuilder.append('.');
	//   24   47:aload           6
	//   25   49:bipush          46
	//   26   51:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   27   54:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   28   55:new             #161 <Class IllegalArgumentException>
	//   29   58:dup             
	//   30   59:aload           6
	//   31   61:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   32   64:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   33   67:checkcast       #170 <Class Throwable>
	//   34   70:athrow          
		}
		if(l < l1)
	//*  35   71:lload_0         
	//*  36   72:lload_2         
	//*  37   73:lcmp            
	//*  38   74:ifge            79
			return l1;
	//   39   77:lload_2         
	//   40   78:lreturn         
		if(l > l2)
	//*  41   79:lload_0         
	//*  42   80:lload           4
	//*  43   82:lcmp            
	//*  44   83:ifle            89
			return l2;
	//   45   86:lload           4
	//   46   88:lreturn         
		else
			return l;
	//   47   89:lload_0         
	//   48   90:lreturn         
	}

	public static final long coerceIn(long l, ClosedRange closedrange)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "range");
	//    0    0:aload_2         
	//    1    1:ldc1            #181 <String "range">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(closedrange instanceof ClosedFloatingPointRange)
	//*   3    6:aload_2         
	//*   4    7:instanceof      #183 <Class ClosedFloatingPointRange>
	//*   5   10:ifeq            34
			return ((Number)RangesKt.coerceIn((Comparable)Long.valueOf(l), (ClosedFloatingPointRange)closedrange)).longValue();
	//    6   13:lload_0         
	//    7   14:invokestatic    #224 <Method Long Long.valueOf(long)>
	//    8   17:checkcast       #102 <Class Comparable>
	//    9   20:aload_2         
	//   10   21:checkcast       #183 <Class ClosedFloatingPointRange>
	//   11   24:invokestatic    #191 <Method Comparable RangesKt.coerceIn(Comparable, ClosedFloatingPointRange)>
	//   12   27:checkcast       #193 <Class Number>
	//   13   30:invokevirtual   #228 <Method long Number.longValue()>
	//   14   33:lreturn         
		if(closedrange.isEmpty())
	//*  15   34:aload_2         
	//*  16   35:invokeinterface #201 <Method boolean ClosedRange.isEmpty()>
	//*  17   40:ifeq            91
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   43:new             #144 <Class StringBuilder>
	//   19   46:dup             
	//   20   47:invokespecial   #145 <Method void StringBuilder()>
	//   21   50:astore          5
			stringbuilder.append("Cannot coerce value to an empty range: ");
	//   22   52:aload           5
	//   23   54:ldc1            #203 <String "Cannot coerce value to an empty range: ">
	//   24   56:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   25   59:pop             
			stringbuilder.append(((Object) (closedrange)));
	//   26   60:aload           5
	//   27   62:aload_2         
	//   28   63:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//   29   66:pop             
			stringbuilder.append('.');
	//   30   67:aload           5
	//   31   69:bipush          46
	//   32   71:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   33   74:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   34   75:new             #161 <Class IllegalArgumentException>
	//   35   78:dup             
	//   36   79:aload           5
	//   37   81:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   38   84:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   39   87:checkcast       #170 <Class Throwable>
	//   40   90:athrow          
		}
		if(l < ((Number)closedrange.getStart()).longValue())
	//*  41   91:lload_0         
	//*  42   92:aload_2         
	//*  43   93:invokeinterface #210 <Method Comparable ClosedRange.getStart()>
	//*  44   98:checkcast       #193 <Class Number>
	//*  45  101:invokevirtual   #228 <Method long Number.longValue()>
	//*  46  104:lcmp            
	//*  47  105:ifge            121
			return ((Number)closedrange.getStart()).longValue();
	//   48  108:aload_2         
	//   49  109:invokeinterface #210 <Method Comparable ClosedRange.getStart()>
	//   50  114:checkcast       #193 <Class Number>
	//   51  117:invokevirtual   #228 <Method long Number.longValue()>
	//   52  120:lreturn         
		long l1 = l;
	//   53  121:lload_0         
	//   54  122:lstore_3        
		if(l > ((Number)closedrange.getEndInclusive()).longValue())
	//*  55  123:lload_0         
	//*  56  124:aload_2         
	//*  57  125:invokeinterface #213 <Method Comparable ClosedRange.getEndInclusive()>
	//*  58  130:checkcast       #193 <Class Number>
	//*  59  133:invokevirtual   #228 <Method long Number.longValue()>
	//*  60  136:lcmp            
	//*  61  137:ifle            153
			l1 = ((Number)closedrange.getEndInclusive()).longValue();
	//   62  140:aload_2         
	//   63  141:invokeinterface #213 <Method Comparable ClosedRange.getEndInclusive()>
	//   64  146:checkcast       #193 <Class Number>
	//   65  149:invokevirtual   #228 <Method long Number.longValue()>
	//   66  152:lstore_3        
		return l1;
	//   67  153:lload_3         
	//   68  154:lreturn         
	}

	public static final Comparable coerceIn(Comparable comparable, Comparable comparable1, Comparable comparable2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (comparable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(comparable1 != null && comparable2 != null)
	//*   3    6:aload_1         
	//*   4    7:ifnull          104
	//*   5   10:aload_2         
	//*   6   11:ifnull          104
		{
			if(comparable1.compareTo(((Object) (comparable2))) > 0)
	//*   7   14:aload_1         
	//*   8   15:aload_2         
	//*   9   16:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  10   21:ifle            80
			{
				comparable = ((Comparable) (new StringBuilder()));
	//   11   24:new             #144 <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #145 <Method void StringBuilder()>
	//   14   31:astore_0        
				((StringBuilder) (comparable)).append("Cannot coerce value to an empty range: maximum ");
	//   15   32:aload_0         
	//   16   33:ldc1            #147 <String "Cannot coerce value to an empty range: maximum ">
	//   17   35:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
				((StringBuilder) (comparable)).append(((Object) (comparable2)));
	//   19   39:aload_0         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//   22   44:pop             
				((StringBuilder) (comparable)).append(" is less than minimum ");
	//   23   45:aload_0         
	//   24   46:ldc1            #156 <String " is less than minimum ">
	//   25   48:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				((StringBuilder) (comparable)).append(((Object) (comparable1)));
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//   30   57:pop             
				((StringBuilder) (comparable)).append('.');
	//   31   58:aload_0         
	//   32   59:bipush          46
	//   33   61:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   34   64:pop             
				throw (Throwable)new IllegalArgumentException(((StringBuilder) (comparable)).toString());
	//   35   65:new             #161 <Class IllegalArgumentException>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   39   73:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   40   76:checkcast       #170 <Class Throwable>
	//   41   79:athrow          
			}
			if(comparable.compareTo(((Object) (comparable1))) < 0)
	//*  42   80:aload_0         
	//*  43   81:aload_1         
	//*  44   82:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  45   87:ifge            92
				return comparable1;
	//   46   90:aload_1         
	//   47   91:areturn         
			if(comparable.compareTo(((Object) (comparable2))) > 0)
	//*  48   92:aload_0         
	//*  49   93:aload_2         
	//*  50   94:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  51   99:ifle            136
				return comparable2;
	//   52  102:aload_2         
	//   53  103:areturn         
		} else
		{
			if(comparable1 != null && comparable.compareTo(((Object) (comparable1))) < 0)
	//*  54  104:aload_1         
	//*  55  105:ifnull          120
	//*  56  108:aload_0         
	//*  57  109:aload_1         
	//*  58  110:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  59  115:ifge            120
				return comparable1;
	//   60  118:aload_1         
	//   61  119:areturn         
			if(comparable2 != null && comparable.compareTo(((Object) (comparable2))) > 0)
	//*  62  120:aload_2         
	//*  63  121:ifnull          136
	//*  64  124:aload_0         
	//*  65  125:aload_2         
	//*  66  126:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  67  131:ifle            136
				return comparable2;
	//   68  134:aload_2         
	//   69  135:areturn         
		}
		return comparable;
	//   70  136:aload_0         
	//   71  137:areturn         
	}

	public static final Comparable coerceIn(Comparable comparable, ClosedFloatingPointRange closedfloatingpointrange)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (comparable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (closedfloatingpointrange)), "range");
	//    3    6:aload_1         
	//    4    7:ldc1            #181 <String "range">
	//    5    9:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(closedfloatingpointrange.isEmpty())
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #235 <Method boolean ClosedFloatingPointRange.isEmpty()>
	//*   8   18:ifeq            64
		{
			comparable = ((Comparable) (new StringBuilder()));
	//    9   21:new             #144 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #145 <Method void StringBuilder()>
	//   12   28:astore_0        
			((StringBuilder) (comparable)).append("Cannot coerce value to an empty range: ");
	//   13   29:aload_0         
	//   14   30:ldc1            #203 <String "Cannot coerce value to an empty range: ">
	//   15   32:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
			((StringBuilder) (comparable)).append(((Object) (closedfloatingpointrange)));
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//   20   41:pop             
			((StringBuilder) (comparable)).append('.');
	//   21   42:aload_0         
	//   22   43:bipush          46
	//   23   45:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   24   48:pop             
			throw (Throwable)new IllegalArgumentException(((StringBuilder) (comparable)).toString());
	//   25   49:new             #161 <Class IllegalArgumentException>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   29   57:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   30   60:checkcast       #170 <Class Throwable>
	//   31   63:athrow          
		}
		if(closedfloatingpointrange.lessThanOrEquals(comparable, closedfloatingpointrange.getStart()) && !closedfloatingpointrange.lessThanOrEquals(closedfloatingpointrange.getStart(), comparable))
	//*  32   64:aload_1         
	//*  33   65:aload_0         
	//*  34   66:aload_1         
	//*  35   67:invokeinterface #236 <Method Comparable ClosedFloatingPointRange.getStart()>
	//*  36   72:invokeinterface #240 <Method boolean ClosedFloatingPointRange.lessThanOrEquals(Comparable, Comparable)>
	//*  37   77:ifeq            103
	//*  38   80:aload_1         
	//*  39   81:aload_1         
	//*  40   82:invokeinterface #236 <Method Comparable ClosedFloatingPointRange.getStart()>
	//*  41   87:aload_0         
	//*  42   88:invokeinterface #240 <Method boolean ClosedFloatingPointRange.lessThanOrEquals(Comparable, Comparable)>
	//*  43   93:ifne            103
			return closedfloatingpointrange.getStart();
	//   44   96:aload_1         
	//   45   97:invokeinterface #236 <Method Comparable ClosedFloatingPointRange.getStart()>
	//   46  102:areturn         
		Comparable comparable1 = comparable;
	//   47  103:aload_0         
	//   48  104:astore_2        
		if(closedfloatingpointrange.lessThanOrEquals(closedfloatingpointrange.getEndInclusive(), comparable))
	//*  49  105:aload_1         
	//*  50  106:aload_1         
	//*  51  107:invokeinterface #241 <Method Comparable ClosedFloatingPointRange.getEndInclusive()>
	//*  52  112:aload_0         
	//*  53  113:invokeinterface #240 <Method boolean ClosedFloatingPointRange.lessThanOrEquals(Comparable, Comparable)>
	//*  54  118:ifeq            146
		{
			comparable1 = comparable;
	//   55  121:aload_0         
	//   56  122:astore_2        
			if(!closedfloatingpointrange.lessThanOrEquals(comparable, closedfloatingpointrange.getEndInclusive()))
	//*  57  123:aload_1         
	//*  58  124:aload_0         
	//*  59  125:aload_1         
	//*  60  126:invokeinterface #241 <Method Comparable ClosedFloatingPointRange.getEndInclusive()>
	//*  61  131:invokeinterface #240 <Method boolean ClosedFloatingPointRange.lessThanOrEquals(Comparable, Comparable)>
	//*  62  136:ifne            146
				comparable1 = closedfloatingpointrange.getEndInclusive();
	//   63  139:aload_1         
	//   64  140:invokeinterface #241 <Method Comparable ClosedFloatingPointRange.getEndInclusive()>
	//   65  145:astore_2        
		}
		return comparable1;
	//   66  146:aload_2         
	//   67  147:areturn         
	}

	public static final Comparable coerceIn(Comparable comparable, ClosedRange closedrange)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (comparable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "range");
	//    3    6:aload_1         
	//    4    7:ldc1            #181 <String "range">
	//    5    9:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(closedrange instanceof ClosedFloatingPointRange)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #183 <Class ClosedFloatingPointRange>
	//*   8   16:ifeq            28
			return RangesKt.coerceIn(comparable, (ClosedFloatingPointRange)closedrange);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:checkcast       #183 <Class ClosedFloatingPointRange>
	//   12   24:invokestatic    #191 <Method Comparable RangesKt.coerceIn(Comparable, ClosedFloatingPointRange)>
	//   13   27:areturn         
		if(closedrange.isEmpty())
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #201 <Method boolean ClosedRange.isEmpty()>
	//*  16   34:ifeq            80
		{
			comparable = ((Comparable) (new StringBuilder()));
	//   17   37:new             #144 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #145 <Method void StringBuilder()>
	//   20   44:astore_0        
			((StringBuilder) (comparable)).append("Cannot coerce value to an empty range: ");
	//   21   45:aload_0         
	//   22   46:ldc1            #203 <String "Cannot coerce value to an empty range: ">
	//   23   48:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
			((StringBuilder) (comparable)).append(((Object) (closedrange)));
	//   25   52:aload_0         
	//   26   53:aload_1         
	//   27   54:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//   28   57:pop             
			((StringBuilder) (comparable)).append('.');
	//   29   58:aload_0         
	//   30   59:bipush          46
	//   31   61:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   32   64:pop             
			throw (Throwable)new IllegalArgumentException(((StringBuilder) (comparable)).toString());
	//   33   65:new             #161 <Class IllegalArgumentException>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   37   73:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   38   76:checkcast       #170 <Class Throwable>
	//   39   79:athrow          
		}
		if(comparable.compareTo(((Object) (closedrange.getStart()))) < 0)
	//*  40   80:aload_0         
	//*  41   81:aload_1         
	//*  42   82:invokeinterface #210 <Method Comparable ClosedRange.getStart()>
	//*  43   87:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  44   92:ifge            102
			return closedrange.getStart();
	//   45   95:aload_1         
	//   46   96:invokeinterface #210 <Method Comparable ClosedRange.getStart()>
	//   47  101:areturn         
		Comparable comparable1 = comparable;
	//   48  102:aload_0         
	//   49  103:astore_2        
		if(comparable.compareTo(((Object) (closedrange.getEndInclusive()))) > 0)
	//*  50  104:aload_0         
	//*  51  105:aload_1         
	//*  52  106:invokeinterface #213 <Method Comparable ClosedRange.getEndInclusive()>
	//*  53  111:invokeinterface #138 <Method int Comparable.compareTo(Object)>
	//*  54  116:ifle            126
			comparable1 = closedrange.getEndInclusive();
	//   55  119:aload_1         
	//   56  120:invokeinterface #213 <Method Comparable ClosedRange.getEndInclusive()>
	//   57  125:astore_2        
		return comparable1;
	//   58  126:aload_2         
	//   59  127:areturn         
	}

	public static final short coerceIn(short word0, short word1, short word2)
	{
		if(word1 > word2)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          61
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #144 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #145 <Method void StringBuilder()>
	//    6   12:astore_3        
			stringbuilder.append("Cannot coerce value to an empty range: maximum ");
	//    7   13:aload_3         
	//    8   14:ldc1            #147 <String "Cannot coerce value to an empty range: maximum ">
	//    9   16:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
			stringbuilder.append(((int) (word2)));
	//   11   20:aload_3         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   14   25:pop             
			stringbuilder.append(" is less than minimum ");
	//   15   26:aload_3         
	//   16   27:ldc1            #156 <String " is less than minimum ">
	//   17   29:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			stringbuilder.append(((int) (word1)));
	//   19   33:aload_3         
	//   20   34:iload_1         
	//   21   35:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   22   38:pop             
			stringbuilder.append('.');
	//   23   39:aload_3         
	//   24   40:bipush          46
	//   25   42:invokevirtual   #159 <Method StringBuilder StringBuilder.append(char)>
	//   26   45:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   27   46:new             #161 <Class IllegalArgumentException>
	//   28   49:dup             
	//   29   50:aload_3         
	//   30   51:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   31   54:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//   32   57:checkcast       #170 <Class Throwable>
	//   33   60:athrow          
		}
		if(word0 < word1)
	//*  34   61:iload_0         
	//*  35   62:iload_1         
	//*  36   63:icmpge          68
			return word1;
	//   37   66:iload_1         
	//   38   67:ireturn         
		if(word0 > word2)
	//*  39   68:iload_0         
	//*  40   69:iload_2         
	//*  41   70:icmple          75
			return word2;
	//   42   73:iload_2         
	//   43   74:ireturn         
		else
			return word0;
	//   44   75:iload_0         
	//   45   76:ireturn         
	}

	private static final boolean contains(CharRange charrange, Character character)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return character != null && charrange.contains(character.charValue());
	//    3    6:aload_1         
	//    4    7:ifnull          23
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #252 <Method char Character.charValue()>
	//    8   15:invokevirtual   #257 <Method boolean CharRange.contains(char)>
	//    9   18:ifeq            23
	//   10   21:iconst_1        
	//   11   22:ireturn         
	//   12   23:iconst_0        
	//   13   24:ireturn         
	}

	private static final boolean contains(IntRange intrange, Integer integer)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (intrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return integer != null && intrange.contains(integer.intValue());
	//    3    6:aload_1         
	//    4    7:ifnull          23
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #258 <Method int Integer.intValue()>
	//    8   15:invokevirtual   #263 <Method boolean IntRange.contains(int)>
	//    9   18:ifeq            23
	//   10   21:iconst_1        
	//   11   22:ireturn         
	//   12   23:iconst_0        
	//   13   24:ireturn         
	}

	private static final boolean contains(LongRange longrange, Long long1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (longrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return long1 != null && longrange.contains(long1.longValue());
	//    3    6:aload_1         
	//    4    7:ifnull          23
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #264 <Method long Long.longValue()>
	//    8   15:invokevirtual   #269 <Method boolean LongRange.contains(long)>
	//    9   18:ifeq            23
	//   10   21:iconst_1        
	//   11   22:ireturn         
	//   12   23:iconst_0        
	//   13   24:ireturn         
	}

	public static final boolean doubleRangeContains(ClosedRange closedrange, byte byte0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Double.valueOf(byte0));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2d             
	//    6    9:invokestatic    #275 <Method Double Double.valueOf(double)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean doubleRangeContains(ClosedRange closedrange, float f)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Double.valueOf(f));
	//    3    6:aload_0         
	//    4    7:fload_1         
	//    5    8:f2d             
	//    6    9:invokestatic    #275 <Method Double Double.valueOf(double)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean doubleRangeContains(ClosedRange closedrange, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Double.valueOf(i));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2d             
	//    6    9:invokestatic    #275 <Method Double Double.valueOf(double)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean doubleRangeContains(ClosedRange closedrange, long l)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Double.valueOf(l));
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:l2d             
	//    6    9:invokestatic    #275 <Method Double Double.valueOf(double)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean doubleRangeContains(ClosedRange closedrange, short word0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Double.valueOf(word0));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2d             
	//    6    9:invokestatic    #275 <Method Double Double.valueOf(double)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final CharProgression downTo(char c, char c1)
	{
		return CharProgression.Companion.fromClosedRange(c, c1, -1);
	//    0    0:getstatic       #287 <Field CharProgression$Companion CharProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #293 <Method CharProgression CharProgression$Companion.fromClosedRange(char, char, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(byte byte0, byte byte1)
	{
		return IntProgression.Companion.fromClosedRange(((int) (byte0)), ((int) (byte1)), -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(byte byte0, int i)
	{
		return IntProgression.Companion.fromClosedRange(((int) (byte0)), i, -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(byte byte0, short word0)
	{
		return IntProgression.Companion.fromClosedRange(((int) (byte0)), ((int) (word0)), -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(int i, byte byte0)
	{
		return IntProgression.Companion.fromClosedRange(i, ((int) (byte0)), -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(int i, int j)
	{
		return IntProgression.Companion.fromClosedRange(i, j, -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(int i, short word0)
	{
		return IntProgression.Companion.fromClosedRange(i, ((int) (word0)), -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(short word0, byte byte0)
	{
		return IntProgression.Companion.fromClosedRange(((int) (word0)), ((int) (byte0)), -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(short word0, int i)
	{
		return IntProgression.Companion.fromClosedRange(((int) (word0)), i, -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final IntProgression downTo(short word0, short word1)
	{
		return IntProgression.Companion.fromClosedRange(((int) (word0)), ((int) (word1)), -1);
	//    0    0:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//    5    9:areturn         
	}

	public static final LongProgression downTo(byte byte0, long l)
	{
		return LongProgression.Companion.fromClosedRange(byte0, l, -1L);
	//    0    0:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//    1    3:iload_0         
	//    2    4:i2l             
	//    3    5:lload_1         
	//    4    6:ldc2w           #319 <Long -1L>
	//    5    9:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//    6   12:areturn         
	}

	public static final LongProgression downTo(int i, long l)
	{
		return LongProgression.Companion.fromClosedRange(i, l, -1L);
	//    0    0:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//    1    3:iload_0         
	//    2    4:i2l             
	//    3    5:lload_1         
	//    4    6:ldc2w           #319 <Long -1L>
	//    5    9:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//    6   12:areturn         
	}

	public static final LongProgression downTo(long l, byte byte0)
	{
		return LongProgression.Companion.fromClosedRange(l, byte0, -1L);
	//    0    0:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//    1    3:lload_0         
	//    2    4:iload_2         
	//    3    5:i2l             
	//    4    6:ldc2w           #319 <Long -1L>
	//    5    9:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//    6   12:areturn         
	}

	public static final LongProgression downTo(long l, int i)
	{
		return LongProgression.Companion.fromClosedRange(l, i, -1L);
	//    0    0:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//    1    3:lload_0         
	//    2    4:iload_2         
	//    3    5:i2l             
	//    4    6:ldc2w           #319 <Long -1L>
	//    5    9:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//    6   12:areturn         
	}

	public static final LongProgression downTo(long l, long l1)
	{
		return LongProgression.Companion.fromClosedRange(l, l1, -1L);
	//    0    0:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//    1    3:lload_0         
	//    2    4:lload_2         
	//    3    5:ldc2w           #319 <Long -1L>
	//    4    8:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//    5   11:areturn         
	}

	public static final LongProgression downTo(long l, short word0)
	{
		return LongProgression.Companion.fromClosedRange(l, word0, -1L);
	//    0    0:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//    1    3:lload_0         
	//    2    4:iload_2         
	//    3    5:i2l             
	//    4    6:ldc2w           #319 <Long -1L>
	//    5    9:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//    6   12:areturn         
	}

	public static final LongProgression downTo(short word0, long l)
	{
		return LongProgression.Companion.fromClosedRange(word0, l, -1L);
	//    0    0:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//    1    3:iload_0         
	//    2    4:i2l             
	//    3    5:lload_1         
	//    4    6:ldc2w           #319 <Long -1L>
	//    5    9:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//    6   12:areturn         
	}

	public static final boolean floatRangeContains(ClosedRange closedrange, byte byte0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Float.valueOf(byte0));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2f             
	//    6    9:invokestatic    #336 <Method Float Float.valueOf(float)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean floatRangeContains(ClosedRange closedrange, double d)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Float.valueOf((float)d));
	//    3    6:aload_0         
	//    4    7:dload_1         
	//    5    8:d2f             
	//    6    9:invokestatic    #336 <Method Float Float.valueOf(float)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean floatRangeContains(ClosedRange closedrange, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Float.valueOf(i));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2f             
	//    6    9:invokestatic    #336 <Method Float Float.valueOf(float)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean floatRangeContains(ClosedRange closedrange, long l)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Float.valueOf(l));
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:l2f             
	//    6    9:invokestatic    #336 <Method Float Float.valueOf(float)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean floatRangeContains(ClosedRange closedrange, short word0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Float.valueOf(word0));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2f             
	//    6    9:invokestatic    #336 <Method Float Float.valueOf(float)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean intRangeContains(ClosedRange closedrange, byte byte0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Integer.valueOf(((int) (byte0))));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//    6   11:checkcast       #102 <Class Comparable>
	//    7   14:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    8   19:ireturn         
	}

	public static final boolean intRangeContains(ClosedRange closedrange, double d)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Integer integer = RangesKt.toIntExactOrNull(d);
	//    3    6:dload_1         
	//    4    7:invokestatic    #344 <Method Integer RangesKt.toIntExactOrNull(double)>
	//    5   10:astore_3        
		if(integer != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)integer);
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean intRangeContains(ClosedRange closedrange, float f)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Integer integer = RangesKt.toIntExactOrNull(f);
	//    3    6:fload_1         
	//    4    7:invokestatic    #347 <Method Integer RangesKt.toIntExactOrNull(float)>
	//    5   10:astore_2        
		if(integer != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)integer);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean intRangeContains(ClosedRange closedrange, long l)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Integer integer = RangesKt.toIntExactOrNull(l);
	//    3    6:lload_1         
	//    4    7:invokestatic    #350 <Method Integer RangesKt.toIntExactOrNull(long)>
	//    5   10:astore_3        
		if(integer != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)integer);
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean intRangeContains(ClosedRange closedrange, short word0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Integer.valueOf(((int) (word0))));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//    6   11:checkcast       #102 <Class Comparable>
	//    7   14:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    8   19:ireturn         
	}

	public static final boolean longRangeContains(ClosedRange closedrange, byte byte0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Long.valueOf(byte0));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2l             
	//    6    9:invokestatic    #224 <Method Long Long.valueOf(long)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean longRangeContains(ClosedRange closedrange, double d)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Long long1 = RangesKt.toLongExactOrNull(d);
	//    3    6:dload_1         
	//    4    7:invokestatic    #355 <Method Long RangesKt.toLongExactOrNull(double)>
	//    5   10:astore_3        
		if(long1 != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)long1);
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean longRangeContains(ClosedRange closedrange, float f)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Long long1 = RangesKt.toLongExactOrNull(f);
	//    3    6:fload_1         
	//    4    7:invokestatic    #358 <Method Long RangesKt.toLongExactOrNull(float)>
	//    5   10:astore_2        
		if(long1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)long1);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean longRangeContains(ClosedRange closedrange, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Long.valueOf(i));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2l             
	//    6    9:invokestatic    #224 <Method Long Long.valueOf(long)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean longRangeContains(ClosedRange closedrange, short word0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Long.valueOf(word0));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:i2l             
	//    6    9:invokestatic    #224 <Method Long Long.valueOf(long)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	private static final char random(CharRange charrange)
	{
		return RangesKt.random(charrange, (Random)Random.Default);
	//    0    0:aload_0         
	//    1    1:getstatic       #368 <Field kotlin.random.Random$Default Random.Default>
	//    2    4:checkcast       #364 <Class Random>
	//    3    7:invokestatic    #371 <Method char RangesKt.random(CharRange, Random)>
	//    4   10:ireturn         
	}

	public static final char random(CharRange charrange, Random random1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (random1)), "random");
	//    3    6:aload_1         
	//    4    7:ldc2            #372 <String "random">
	//    5   10:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i;
		try
		{
			i = random1.nextInt(((int) (charrange.getFirst())), charrange.getLast() + 1);
	//    6   13:aload_1         
	//    7   14:aload_0         
	//    8   15:invokevirtual   #375 <Method char CharRange.getFirst()>
	//    9   18:aload_0         
	//   10   19:invokevirtual   #378 <Method char CharRange.getLast()>
	//   11   22:iconst_1        
	//   12   23:iadd            
	//   13   24:invokevirtual   #381 <Method int Random.nextInt(int, int)>
	//   14   27:istore_2        
		}
	//*  15   28:iload_2         
	//*  16   29:int2char        
	//*  17   30:ireturn         
		// Misplaced declaration of an exception variable
		catch(CharRange charrange)
	//*  18   31:astore_0        
		{
			throw (Throwable)new NoSuchElementException(((IllegalArgumentException) (charrange)).getMessage());
	//   19   32:new             #383 <Class NoSuchElementException>
	//   20   35:dup             
	//   21   36:aload_0         
	//   22   37:invokevirtual   #386 <Method String IllegalArgumentException.getMessage()>
	//   23   40:invokespecial   #387 <Method void NoSuchElementException(String)>
	//   24   43:checkcast       #170 <Class Throwable>
	//   25   46:athrow          
		}
		return (char)i;
	}

	private static final int random(IntRange intrange)
	{
		return RangesKt.random(intrange, (Random)Random.Default);
	//    0    0:aload_0         
	//    1    1:getstatic       #368 <Field kotlin.random.Random$Default Random.Default>
	//    2    4:checkcast       #364 <Class Random>
	//    3    7:invokestatic    #391 <Method int RangesKt.random(IntRange, Random)>
	//    4   10:ireturn         
	}

	public static final int random(IntRange intrange, Random random1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (intrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (random1)), "random");
	//    3    6:aload_1         
	//    4    7:ldc2            #372 <String "random">
	//    5   10:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i;
		try
		{
			i = RandomKt.nextInt(random1, intrange);
	//    6   13:aload_1         
	//    7   14:aload_0         
	//    8   15:invokestatic    #396 <Method int RandomKt.nextInt(Random, IntRange)>
	//    9   18:istore_2        
		}
	//*  10   19:iload_2         
	//*  11   20:ireturn         
		// Misplaced declaration of an exception variable
		catch(IntRange intrange)
	//*  12   21:astore_0        
		{
			throw (Throwable)new NoSuchElementException(((IllegalArgumentException) (intrange)).getMessage());
	//   13   22:new             #383 <Class NoSuchElementException>
	//   14   25:dup             
	//   15   26:aload_0         
	//   16   27:invokevirtual   #386 <Method String IllegalArgumentException.getMessage()>
	//   17   30:invokespecial   #387 <Method void NoSuchElementException(String)>
	//   18   33:checkcast       #170 <Class Throwable>
	//   19   36:athrow          
		}
		return i;
	}

	private static final long random(LongRange longrange)
	{
		return RangesKt.random(longrange, (Random)Random.Default);
	//    0    0:aload_0         
	//    1    1:getstatic       #368 <Field kotlin.random.Random$Default Random.Default>
	//    2    4:checkcast       #364 <Class Random>
	//    3    7:invokestatic    #400 <Method long RangesKt.random(LongRange, Random)>
	//    4   10:lreturn         
	}

	public static final long random(LongRange longrange, Random random1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (longrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (random1)), "random");
	//    3    6:aload_1         
	//    4    7:ldc2            #372 <String "random">
	//    5   10:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		long l;
		try
		{
			l = RandomKt.nextLong(random1, longrange);
	//    6   13:aload_1         
	//    7   14:aload_0         
	//    8   15:invokestatic    #404 <Method long RandomKt.nextLong(Random, LongRange)>
	//    9   18:lstore_2        
		}
	//*  10   19:lload_2         
	//*  11   20:lreturn         
		// Misplaced declaration of an exception variable
		catch(LongRange longrange)
	//*  12   21:astore_0        
		{
			throw (Throwable)new NoSuchElementException(((IllegalArgumentException) (longrange)).getMessage());
	//   13   22:new             #383 <Class NoSuchElementException>
	//   14   25:dup             
	//   15   26:aload_0         
	//   16   27:invokevirtual   #386 <Method String IllegalArgumentException.getMessage()>
	//   17   30:invokespecial   #387 <Method void NoSuchElementException(String)>
	//   18   33:checkcast       #170 <Class Throwable>
	//   19   36:athrow          
		}
		return l;
	}

	public static final CharProgression reversed(CharProgression charprogression)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charprogression)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return CharProgression.Companion.fromClosedRange(charprogression.getLast(), charprogression.getFirst(), -charprogression.getStep());
	//    3    6:getstatic       #287 <Field CharProgression$Companion CharProgression.Companion>
	//    4    9:aload_0         
	//    5   10:invokevirtual   #406 <Method char CharProgression.getLast()>
	//    6   13:aload_0         
	//    7   14:invokevirtual   #407 <Method char CharProgression.getFirst()>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #410 <Method int CharProgression.getStep()>
	//   10   21:ineg            
	//   11   22:invokevirtual   #293 <Method CharProgression CharProgression$Companion.fromClosedRange(char, char, int)>
	//   12   25:areturn         
	}

	public static final IntProgression reversed(IntProgression intprogression)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (intprogression)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return IntProgression.Companion.fromClosedRange(intprogression.getLast(), intprogression.getFirst(), -intprogression.getStep());
	//    3    6:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//    4    9:aload_0         
	//    5   10:invokevirtual   #413 <Method int IntProgression.getLast()>
	//    6   13:aload_0         
	//    7   14:invokevirtual   #415 <Method int IntProgression.getFirst()>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #416 <Method int IntProgression.getStep()>
	//   10   21:ineg            
	//   11   22:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//   12   25:areturn         
	}

	public static final LongProgression reversed(LongProgression longprogression)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (longprogression)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return LongProgression.Companion.fromClosedRange(longprogression.getLast(), longprogression.getFirst(), -longprogression.getStep());
	//    3    6:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//    4    9:aload_0         
	//    5   10:invokevirtual   #419 <Method long LongProgression.getLast()>
	//    6   13:aload_0         
	//    7   14:invokevirtual   #421 <Method long LongProgression.getFirst()>
	//    8   17:aload_0         
	//    9   18:invokevirtual   #423 <Method long LongProgression.getStep()>
	//   10   21:lneg            
	//   11   22:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//   12   25:areturn         
	}

	public static final boolean shortRangeContains(ClosedRange closedrange, byte byte0)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return closedrange.contains((Comparable)Short.valueOf(byte0));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:int2short       
	//    6    9:invokestatic    #428 <Method Short Short.valueOf(short)>
	//    7   12:checkcast       #102 <Class Comparable>
	//    8   15:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//    9   20:ireturn         
	}

	public static final boolean shortRangeContains(ClosedRange closedrange, double d)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Short short1 = RangesKt.toShortExactOrNull(d);
	//    3    6:dload_1         
	//    4    7:invokestatic    #431 <Method Short RangesKt.toShortExactOrNull(double)>
	//    5   10:astore_3        
		if(short1 != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)short1);
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean shortRangeContains(ClosedRange closedrange, float f)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Short short1 = RangesKt.toShortExactOrNull(f);
	//    3    6:fload_1         
	//    4    7:invokestatic    #434 <Method Short RangesKt.toShortExactOrNull(float)>
	//    5   10:astore_2        
		if(short1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)short1);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean shortRangeContains(ClosedRange closedrange, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Short short1 = RangesKt.toShortExactOrNull(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #437 <Method Short RangesKt.toShortExactOrNull(int)>
	//    5   10:astore_2        
		if(short1 != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)short1);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final boolean shortRangeContains(ClosedRange closedrange, long l)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (closedrange)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Short short1 = RangesKt.toShortExactOrNull(l);
	//    3    6:lload_1         
	//    4    7:invokestatic    #440 <Method Short RangesKt.toShortExactOrNull(long)>
	//    5   10:astore_3        
		if(short1 != null)
	//*   6   11:aload_3         
	//*   7   12:ifnull          26
			return closedrange.contains((Comparable)short1);
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:checkcast       #102 <Class Comparable>
	//   11   20:invokeinterface #107 <Method boolean ClosedRange.contains(Comparable)>
	//   12   25:ireturn         
		else
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public static final CharProgression step(CharProgression charprogression, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (charprogression)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag;
		if(i > 0)
	//*   3    6:iload_1         
	//*   4    7:ifle            16
			flag = true;
	//    5   10:iconst_1        
	//    6   11:istore          4
		else
	//*   7   13:goto            19
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore          4
		RangesKt.checkStepIsPositive(flag, (Number)Integer.valueOf(i));
	//   10   19:iload           4
	//   11   21:iload_1         
	//   12   22:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   13   25:checkcast       #193 <Class Number>
	//   14   28:invokestatic    #446 <Method void RangesKt.checkStepIsPositive(boolean, Number)>
		CharProgression.Companion companion = CharProgression.Companion;
	//   15   31:getstatic       #287 <Field CharProgression$Companion CharProgression.Companion>
	//   16   34:astore          5
		char c = charprogression.getFirst();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #407 <Method char CharProgression.getFirst()>
	//   19   40:istore_2        
		char c1 = charprogression.getLast();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #406 <Method char CharProgression.getLast()>
	//   22   45:istore_3        
		if(charprogression.getStep() <= 0)
	//*  23   46:aload_0         
	//*  24   47:invokevirtual   #410 <Method int CharProgression.getStep()>
	//*  25   50:ifle            56
	//*  26   53:goto            59
			i = -i;
	//   27   56:iload_1         
	//   28   57:ineg            
	//   29   58:istore_1        
		return companion.fromClosedRange(c, c1, i);
	//   30   59:aload           5
	//   31   61:iload_2         
	//   32   62:iload_3         
	//   33   63:iload_1         
	//   34   64:invokevirtual   #293 <Method CharProgression CharProgression$Companion.fromClosedRange(char, char, int)>
	//   35   67:areturn         
	}

	public static final IntProgression step(IntProgression intprogression, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (intprogression)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag;
		if(i > 0)
	//*   3    6:iload_1         
	//*   4    7:ifle            16
			flag = true;
	//    5   10:iconst_1        
	//    6   11:istore          4
		else
	//*   7   13:goto            19
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore          4
		RangesKt.checkStepIsPositive(flag, (Number)Integer.valueOf(i));
	//   10   19:iload           4
	//   11   21:iload_1         
	//   12   22:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   13   25:checkcast       #193 <Class Number>
	//   14   28:invokestatic    #446 <Method void RangesKt.checkStepIsPositive(boolean, Number)>
		IntProgression.Companion companion = IntProgression.Companion;
	//   15   31:getstatic       #299 <Field IntProgression$Companion IntProgression.Companion>
	//   16   34:astore          5
		int j = intprogression.getFirst();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #415 <Method int IntProgression.getFirst()>
	//   19   40:istore_2        
		int k = intprogression.getLast();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #413 <Method int IntProgression.getLast()>
	//   22   45:istore_3        
		if(intprogression.getStep() <= 0)
	//*  23   46:aload_0         
	//*  24   47:invokevirtual   #416 <Method int IntProgression.getStep()>
	//*  25   50:ifle            56
	//*  26   53:goto            59
			i = -i;
	//   27   56:iload_1         
	//   28   57:ineg            
	//   29   58:istore_1        
		return companion.fromClosedRange(j, k, i);
	//   30   59:aload           5
	//   31   61:iload_2         
	//   32   62:iload_3         
	//   33   63:iload_1         
	//   34   64:invokevirtual   #304 <Method IntProgression IntProgression$Companion.fromClosedRange(int, int, int)>
	//   35   67:areturn         
	}

	public static final LongProgression step(LongProgression longprogression, long l)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (longprogression)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "receiver$0">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag;
		if(l > 0L)
	//*   3    6:lload_1         
	//*   4    7:lconst_0        
	//*   5    8:lcmp            
	//*   6    9:ifle            18
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          7
		else
	//*   9   15:goto            21
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore          7
		RangesKt.checkStepIsPositive(flag, (Number)Long.valueOf(l));
	//   12   21:iload           7
	//   13   23:lload_1         
	//   14   24:invokestatic    #224 <Method Long Long.valueOf(long)>
	//   15   27:checkcast       #193 <Class Number>
	//   16   30:invokestatic    #446 <Method void RangesKt.checkStepIsPositive(boolean, Number)>
		LongProgression.Companion companion = LongProgression.Companion;
	//   17   33:getstatic       #318 <Field LongProgression$Companion LongProgression.Companion>
	//   18   36:astore          8
		long l1 = longprogression.getFirst();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #421 <Method long LongProgression.getFirst()>
	//   21   42:lstore_3        
		long l2 = longprogression.getLast();
	//   22   43:aload_0         
	//   23   44:invokevirtual   #419 <Method long LongProgression.getLast()>
	//   24   47:lstore          5
		if(longprogression.getStep() <= 0L)
	//*  25   49:aload_0         
	//*  26   50:invokevirtual   #423 <Method long LongProgression.getStep()>
	//*  27   53:lconst_0        
	//*  28   54:lcmp            
	//*  29   55:ifle            61
	//*  30   58:goto            67
			l = -l;
	//   31   61:lload_1         
	//   32   62:lneg            
	//   33   63:lstore_1        
	//*  34   64:goto            58
		return companion.fromClosedRange(l1, l2, l);
	//   35   67:aload           8
	//   36   69:lload_3         
	//   37   70:lload           5
	//   38   72:lload_1         
	//   39   73:invokevirtual   #325 <Method LongProgression LongProgression$Companion.fromClosedRange(long, long, long)>
	//   40   76:areturn         
	}

	public static final Byte toByteExactOrNull(double d)
	{
		double d1 = -128;
	//    0    0:bipush          -128
	//    1    2:i2d             
	//    2    3:dstore_2        
		double d2 = 127;
	//    3    4:bipush          127
	//    4    6:i2d             
	//    5    7:dstore          4
		if(d >= d1 && d <= d2)
	//*   6    9:dload_0         
	//*   7   10:dload_2         
	//*   8   11:dcmpl           
	//*   9   12:iflt            29
	//*  10   15:dload_0         
	//*  11   16:dload           4
	//*  12   18:dcmpg           
	//*  13   19:ifgt            29
			return Byte.valueOf((byte)(int)d);
	//   14   22:dload_0         
	//   15   23:d2i             
	//   16   24:int2byte        
	//   17   25:invokestatic    #453 <Method Byte Byte.valueOf(byte)>
	//   18   28:areturn         
		else
			return null;
	//   19   29:aconst_null     
	//   20   30:areturn         
	}

	public static final Byte toByteExactOrNull(float f)
	{
		float f1 = -128;
	//    0    0:bipush          -128
	//    1    2:i2f             
	//    2    3:fstore_1        
		float f2 = 127;
	//    3    4:bipush          127
	//    4    6:i2f             
	//    5    7:fstore_2        
		if(f >= f1 && f <= f2)
	//*   6    8:fload_0         
	//*   7    9:fload_1         
	//*   8   10:fcmpl           
	//*   9   11:iflt            27
	//*  10   14:fload_0         
	//*  11   15:fload_2         
	//*  12   16:fcmpg           
	//*  13   17:ifgt            27
			return Byte.valueOf((byte)(int)f);
	//   14   20:fload_0         
	//   15   21:f2i             
	//   16   22:int2byte        
	//   17   23:invokestatic    #453 <Method Byte Byte.valueOf(byte)>
	//   18   26:areturn         
		else
			return null;
	//   19   27:aconst_null     
	//   20   28:areturn         
	}

	public static final Byte toByteExactOrNull(int i)
	{
		if(-128 <= i && 127 >= i)
	//*   0    0:bipush          -128
	//*   1    2:iload_0         
	//*   2    3:icmple          9
	//*   3    6:goto            21
	//*   4    9:bipush          127
	//*   5   11:iload_0         
	//*   6   12:icmplt          21
			return Byte.valueOf((byte)i);
	//    7   15:iload_0         
	//    8   16:int2byte        
	//    9   17:invokestatic    #453 <Method Byte Byte.valueOf(byte)>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public static final Byte toByteExactOrNull(long l)
	{
		long l1 = -128;
	//    0    0:bipush          -128
	//    1    2:i2l             
	//    2    3:lstore_2        
		long l2 = 127;
	//    3    4:bipush          127
	//    4    6:i2l             
	//    5    7:lstore          4
		if(l1 <= l && l2 >= l)
	//*   6    9:lload_2         
	//*   7   10:lload_0         
	//*   8   11:lcmp            
	//*   9   12:ifle            18
	//*  10   15:goto            32
	//*  11   18:lload           4
	//*  12   20:lload_0         
	//*  13   21:lcmp            
	//*  14   22:iflt            32
			return Byte.valueOf((byte)(int)l);
	//   15   25:lload_0         
	//   16   26:l2i             
	//   17   27:int2byte        
	//   18   28:invokestatic    #453 <Method Byte Byte.valueOf(byte)>
	//   19   31:areturn         
		else
			return null;
	//   20   32:aconst_null     
	//   21   33:areturn         
	}

	public static final Byte toByteExactOrNull(short word0)
	{
		short word1 = (short)-128;
	//    0    0:bipush          -128
	//    1    2:int2short       
	//    2    3:istore_1        
		short word2 = (short)127;
	//    3    4:bipush          127
	//    4    6:int2short       
	//    5    7:istore_2        
		if(word1 <= word0 && word2 >= word0)
	//*   6    8:iload_1         
	//*   7    9:iload_0         
	//*   8   10:icmple          16
	//*   9   13:goto            27
	//*  10   16:iload_2         
	//*  11   17:iload_0         
	//*  12   18:icmplt          27
			return Byte.valueOf((byte)word0);
	//   13   21:iload_0         
	//   14   22:int2byte        
	//   15   23:invokestatic    #453 <Method Byte Byte.valueOf(byte)>
	//   16   26:areturn         
		else
			return null;
	//   17   27:aconst_null     
	//   18   28:areturn         
	}

	public static final Integer toIntExactOrNull(double d)
	{
		double d1 = 0x80000000;
	//    0    0:ldc2            #454 <Int 0x80000000>
	//    1    3:i2d             
	//    2    4:dstore_2        
		double d2 = 0x7fffffff;
	//    3    5:ldc2            #455 <Int 0x7fffffff>
	//    4    8:i2d             
	//    5    9:dstore          4
		if(d >= d1 && d <= d2)
	//*   6   11:dload_0         
	//*   7   12:dload_2         
	//*   8   13:dcmpl           
	//*   9   14:iflt            30
	//*  10   17:dload_0         
	//*  11   18:dload           4
	//*  12   20:dcmpg           
	//*  13   21:ifgt            30
			return Integer.valueOf((int)d);
	//   14   24:dload_0         
	//   15   25:d2i             
	//   16   26:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   17   29:areturn         
		else
			return null;
	//   18   30:aconst_null     
	//   19   31:areturn         
	}

	public static final Integer toIntExactOrNull(float f)
	{
		float f1 = 0x80000000;
	//    0    0:ldc2            #454 <Int 0x80000000>
	//    1    3:i2f             
	//    2    4:fstore_1        
		float f2 = 0x7fffffff;
	//    3    5:ldc2            #455 <Int 0x7fffffff>
	//    4    8:i2f             
	//    5    9:fstore_2        
		if(f >= f1 && f <= f2)
	//*   6   10:fload_0         
	//*   7   11:fload_1         
	//*   8   12:fcmpl           
	//*   9   13:iflt            28
	//*  10   16:fload_0         
	//*  11   17:fload_2         
	//*  12   18:fcmpg           
	//*  13   19:ifgt            28
			return Integer.valueOf((int)f);
	//   14   22:fload_0         
	//   15   23:f2i             
	//   16   24:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   17   27:areturn         
		else
			return null;
	//   18   28:aconst_null     
	//   19   29:areturn         
	}

	public static final Integer toIntExactOrNull(long l)
	{
		long l1 = 0x80000000;
	//    0    0:ldc2            #454 <Int 0x80000000>
	//    1    3:i2l             
	//    2    4:lstore_2        
		long l2 = 0x7fffffff;
	//    3    5:ldc2            #455 <Int 0x7fffffff>
	//    4    8:i2l             
	//    5    9:lstore          4
		if(l1 <= l && l2 >= l)
	//*   6   11:lload_2         
	//*   7   12:lload_0         
	//*   8   13:lcmp            
	//*   9   14:ifle            20
	//*  10   17:goto            33
	//*  11   20:lload           4
	//*  12   22:lload_0         
	//*  13   23:lcmp            
	//*  14   24:iflt            33
			return Integer.valueOf((int)l);
	//   15   27:lload_0         
	//   16   28:l2i             
	//   17   29:invokestatic    #189 <Method Integer Integer.valueOf(int)>
	//   18   32:areturn         
		else
			return null;
	//   19   33:aconst_null     
	//   20   34:areturn         
	}

	public static final Long toLongExactOrNull(double d)
	{
		double d1 = 0x0L;
	//    0    0:ldc2w           #456 <Long 0x0L>
	//    1    3:l2d             
	//    2    4:dstore_2        
		double d2 = 0xffffffffL;
	//    3    5:ldc2w           #458 <Long 0xffffffffL>
	//    4    8:l2d             
	//    5    9:dstore          4
		if(d >= d1 && d <= d2)
	//*   6   11:dload_0         
	//*   7   12:dload_2         
	//*   8   13:dcmpl           
	//*   9   14:iflt            30
	//*  10   17:dload_0         
	//*  11   18:dload           4
	//*  12   20:dcmpg           
	//*  13   21:ifgt            30
			return Long.valueOf((long)d);
	//   14   24:dload_0         
	//   15   25:d2l             
	//   16   26:invokestatic    #224 <Method Long Long.valueOf(long)>
	//   17   29:areturn         
		else
			return null;
	//   18   30:aconst_null     
	//   19   31:areturn         
	}

	public static final Long toLongExactOrNull(float f)
	{
		float f1 = 0x0L;
	//    0    0:ldc2w           #456 <Long 0x0L>
	//    1    3:l2f             
	//    2    4:fstore_1        
		float f2 = 0xffffffffL;
	//    3    5:ldc2w           #458 <Long 0xffffffffL>
	//    4    8:l2f             
	//    5    9:fstore_2        
		if(f >= f1 && f <= f2)
	//*   6   10:fload_0         
	//*   7   11:fload_1         
	//*   8   12:fcmpl           
	//*   9   13:iflt            28
	//*  10   16:fload_0         
	//*  11   17:fload_2         
	//*  12   18:fcmpg           
	//*  13   19:ifgt            28
			return Long.valueOf((long)f);
	//   14   22:fload_0         
	//   15   23:f2l             
	//   16   24:invokestatic    #224 <Method Long Long.valueOf(long)>
	//   17   27:areturn         
		else
			return null;
	//   18   28:aconst_null     
	//   19   29:areturn         
	}

	public static final Short toShortExactOrNull(double d)
	{
		double d1 = -32768;
	//    0    0:sipush          -32768
	//    1    3:i2d             
	//    2    4:dstore_2        
		double d2 = 32767;
	//    3    5:sipush          32767
	//    4    8:i2d             
	//    5    9:dstore          4
		if(d >= d1 && d <= d2)
	//*   6   11:dload_0         
	//*   7   12:dload_2         
	//*   8   13:dcmpl           
	//*   9   14:iflt            31
	//*  10   17:dload_0         
	//*  11   18:dload           4
	//*  12   20:dcmpg           
	//*  13   21:ifgt            31
			return Short.valueOf((short)(int)d);
	//   14   24:dload_0         
	//   15   25:d2i             
	//   16   26:int2short       
	//   17   27:invokestatic    #428 <Method Short Short.valueOf(short)>
	//   18   30:areturn         
		else
			return null;
	//   19   31:aconst_null     
	//   20   32:areturn         
	}

	public static final Short toShortExactOrNull(float f)
	{
		float f1 = -32768;
	//    0    0:sipush          -32768
	//    1    3:i2f             
	//    2    4:fstore_1        
		float f2 = 32767;
	//    3    5:sipush          32767
	//    4    8:i2f             
	//    5    9:fstore_2        
		if(f >= f1 && f <= f2)
	//*   6   10:fload_0         
	//*   7   11:fload_1         
	//*   8   12:fcmpl           
	//*   9   13:iflt            29
	//*  10   16:fload_0         
	//*  11   17:fload_2         
	//*  12   18:fcmpg           
	//*  13   19:ifgt            29
			return Short.valueOf((short)(int)f);
	//   14   22:fload_0         
	//   15   23:f2i             
	//   16   24:int2short       
	//   17   25:invokestatic    #428 <Method Short Short.valueOf(short)>
	//   18   28:areturn         
		else
			return null;
	//   19   29:aconst_null     
	//   20   30:areturn         
	}

	public static final Short toShortExactOrNull(int i)
	{
		if(-32768 <= i && 32767 >= i)
	//*   0    0:sipush          -32768
	//*   1    3:iload_0         
	//*   2    4:icmple          10
	//*   3    7:goto            23
	//*   4   10:sipush          32767
	//*   5   13:iload_0         
	//*   6   14:icmplt          23
			return Short.valueOf((short)i);
	//    7   17:iload_0         
	//    8   18:int2short       
	//    9   19:invokestatic    #428 <Method Short Short.valueOf(short)>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public static final Short toShortExactOrNull(long l)
	{
		long l1 = -32768;
	//    0    0:sipush          -32768
	//    1    3:i2l             
	//    2    4:lstore_2        
		long l2 = 32767;
	//    3    5:sipush          32767
	//    4    8:i2l             
	//    5    9:lstore          4
		if(l1 <= l && l2 >= l)
	//*   6   11:lload_2         
	//*   7   12:lload_0         
	//*   8   13:lcmp            
	//*   9   14:ifle            20
	//*  10   17:goto            34
	//*  11   20:lload           4
	//*  12   22:lload_0         
	//*  13   23:lcmp            
	//*  14   24:iflt            34
			return Short.valueOf((short)(int)l);
	//   15   27:lload_0         
	//   16   28:l2i             
	//   17   29:int2short       
	//   18   30:invokestatic    #428 <Method Short Short.valueOf(short)>
	//   19   33:areturn         
		else
			return null;
	//   20   34:aconst_null     
	//   21   35:areturn         
	}

	public static final CharRange until(char c, char c1)
	{
		if(c1 <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            11
			return CharRange.Companion.getEMPTY();
	//    2    4:getstatic       #463 <Field CharRange$Companion CharRange.Companion>
	//    3    7:invokevirtual   #469 <Method CharRange CharRange$Companion.getEMPTY()>
	//    4   10:areturn         
		else
			return new CharRange(c, (char)(c1 - 1));
	//    5   11:new             #254 <Class CharRange>
	//    6   14:dup             
	//    7   15:iload_0         
	//    8   16:iload_1         
	//    9   17:iconst_1        
	//   10   18:isub            
	//   11   19:int2char        
	//   12   20:invokespecial   #472 <Method void CharRange(char, char)>
	//   13   23:areturn         
	}

	public static final IntRange until(byte byte0, byte byte1)
	{
		return new IntRange(((int) (byte0)), byte1 - 1);
	//    0    0:new             #260 <Class IntRange>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokespecial   #476 <Method void IntRange(int, int)>
	//    7   11:areturn         
	}

	public static final IntRange until(byte byte0, int i)
	{
		if(i <= 0x80000000)
	//*   0    0:iload_1         
	//*   1    1:ldc2            #454 <Int 0x80000000>
	//*   2    4:icmpgt          14
			return IntRange.Companion.getEMPTY();
	//    3    7:getstatic       #480 <Field IntRange$Companion IntRange.Companion>
	//    4   10:invokevirtual   #485 <Method IntRange IntRange$Companion.getEMPTY()>
	//    5   13:areturn         
		else
			return new IntRange(((int) (byte0)), i - 1);
	//    6   14:new             #260 <Class IntRange>
	//    7   17:dup             
	//    8   18:iload_0         
	//    9   19:iload_1         
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:invokespecial   #476 <Method void IntRange(int, int)>
	//   13   25:areturn         
	}

	public static final IntRange until(byte byte0, short word0)
	{
		return new IntRange(((int) (byte0)), word0 - 1);
	//    0    0:new             #260 <Class IntRange>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokespecial   #476 <Method void IntRange(int, int)>
	//    7   11:areturn         
	}

	public static final IntRange until(int i, byte byte0)
	{
		return new IntRange(i, byte0 - 1);
	//    0    0:new             #260 <Class IntRange>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokespecial   #476 <Method void IntRange(int, int)>
	//    7   11:areturn         
	}

	public static final IntRange until(int i, int j)
	{
		if(j <= 0x80000000)
	//*   0    0:iload_1         
	//*   1    1:ldc2            #454 <Int 0x80000000>
	//*   2    4:icmpgt          14
			return IntRange.Companion.getEMPTY();
	//    3    7:getstatic       #480 <Field IntRange$Companion IntRange.Companion>
	//    4   10:invokevirtual   #485 <Method IntRange IntRange$Companion.getEMPTY()>
	//    5   13:areturn         
		else
			return new IntRange(i, j - 1);
	//    6   14:new             #260 <Class IntRange>
	//    7   17:dup             
	//    8   18:iload_0         
	//    9   19:iload_1         
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:invokespecial   #476 <Method void IntRange(int, int)>
	//   13   25:areturn         
	}

	public static final IntRange until(int i, short word0)
	{
		return new IntRange(i, word0 - 1);
	//    0    0:new             #260 <Class IntRange>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokespecial   #476 <Method void IntRange(int, int)>
	//    7   11:areturn         
	}

	public static final IntRange until(short word0, byte byte0)
	{
		return new IntRange(((int) (word0)), byte0 - 1);
	//    0    0:new             #260 <Class IntRange>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokespecial   #476 <Method void IntRange(int, int)>
	//    7   11:areturn         
	}

	public static final IntRange until(short word0, int i)
	{
		if(i <= 0x80000000)
	//*   0    0:iload_1         
	//*   1    1:ldc2            #454 <Int 0x80000000>
	//*   2    4:icmpgt          14
			return IntRange.Companion.getEMPTY();
	//    3    7:getstatic       #480 <Field IntRange$Companion IntRange.Companion>
	//    4   10:invokevirtual   #485 <Method IntRange IntRange$Companion.getEMPTY()>
	//    5   13:areturn         
		else
			return new IntRange(((int) (word0)), i - 1);
	//    6   14:new             #260 <Class IntRange>
	//    7   17:dup             
	//    8   18:iload_0         
	//    9   19:iload_1         
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:invokespecial   #476 <Method void IntRange(int, int)>
	//   13   25:areturn         
	}

	public static final IntRange until(short word0, short word1)
	{
		return new IntRange(((int) (word0)), word1 - 1);
	//    0    0:new             #260 <Class IntRange>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:isub            
	//    6    8:invokespecial   #476 <Method void IntRange(int, int)>
	//    7   11:areturn         
	}

	public static final LongRange until(byte byte0, long l)
	{
		if(l <= 0x0L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #456 <Long 0x0L>
	//*   2    4:lcmp            
	//*   3    5:ifgt            15
			return LongRange.Companion.getEMPTY();
	//    4    8:getstatic       #496 <Field LongRange$Companion LongRange.Companion>
	//    5   11:invokevirtual   #501 <Method LongRange LongRange$Companion.getEMPTY()>
	//    6   14:areturn         
		else
			return new LongRange(byte0, l - 1L);
	//    7   15:new             #266 <Class LongRange>
	//    8   18:dup             
	//    9   19:iload_0         
	//   10   20:i2l             
	//   11   21:lload_1         
	//   12   22:lconst_1        
	//   13   23:lsub            
	//   14   24:invokespecial   #504 <Method void LongRange(long, long)>
	//   15   27:areturn         
	}

	public static final LongRange until(int i, long l)
	{
		if(l <= 0x0L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #456 <Long 0x0L>
	//*   2    4:lcmp            
	//*   3    5:ifgt            15
			return LongRange.Companion.getEMPTY();
	//    4    8:getstatic       #496 <Field LongRange$Companion LongRange.Companion>
	//    5   11:invokevirtual   #501 <Method LongRange LongRange$Companion.getEMPTY()>
	//    6   14:areturn         
		else
			return new LongRange(i, l - 1L);
	//    7   15:new             #266 <Class LongRange>
	//    8   18:dup             
	//    9   19:iload_0         
	//   10   20:i2l             
	//   11   21:lload_1         
	//   12   22:lconst_1        
	//   13   23:lsub            
	//   14   24:invokespecial   #504 <Method void LongRange(long, long)>
	//   15   27:areturn         
	}

	public static final LongRange until(long l, byte byte0)
	{
		return new LongRange(l, (long)byte0 - 1L);
	//    0    0:new             #266 <Class LongRange>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:iload_2         
	//    4    6:i2l             
	//    5    7:lconst_1        
	//    6    8:lsub            
	//    7    9:invokespecial   #504 <Method void LongRange(long, long)>
	//    8   12:areturn         
	}

	public static final LongRange until(long l, int i)
	{
		return new LongRange(l, (long)i - 1L);
	//    0    0:new             #266 <Class LongRange>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:iload_2         
	//    4    6:i2l             
	//    5    7:lconst_1        
	//    6    8:lsub            
	//    7    9:invokespecial   #504 <Method void LongRange(long, long)>
	//    8   12:areturn         
	}

	public static final LongRange until(long l, long l1)
	{
		if(l1 <= 0x0L)
	//*   0    0:lload_2         
	//*   1    1:ldc2w           #456 <Long 0x0L>
	//*   2    4:lcmp            
	//*   3    5:ifgt            15
			return LongRange.Companion.getEMPTY();
	//    4    8:getstatic       #496 <Field LongRange$Companion LongRange.Companion>
	//    5   11:invokevirtual   #501 <Method LongRange LongRange$Companion.getEMPTY()>
	//    6   14:areturn         
		else
			return new LongRange(l, l1 - 1L);
	//    7   15:new             #266 <Class LongRange>
	//    8   18:dup             
	//    9   19:lload_0         
	//   10   20:lload_2         
	//   11   21:lconst_1        
	//   12   22:lsub            
	//   13   23:invokespecial   #504 <Method void LongRange(long, long)>
	//   14   26:areturn         
	}

	public static final LongRange until(long l, short word0)
	{
		return new LongRange(l, (long)word0 - 1L);
	//    0    0:new             #266 <Class LongRange>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:iload_2         
	//    4    6:i2l             
	//    5    7:lconst_1        
	//    6    8:lsub            
	//    7    9:invokespecial   #504 <Method void LongRange(long, long)>
	//    8   12:areturn         
	}

	public static final LongRange until(short word0, long l)
	{
		if(l <= 0x0L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #456 <Long 0x0L>
	//*   2    4:lcmp            
	//*   3    5:ifgt            15
			return LongRange.Companion.getEMPTY();
	//    4    8:getstatic       #496 <Field LongRange$Companion LongRange.Companion>
	//    5   11:invokevirtual   #501 <Method LongRange LongRange$Companion.getEMPTY()>
	//    6   14:areturn         
		else
			return new LongRange(word0, l - 1L);
	//    7   15:new             #266 <Class LongRange>
	//    8   18:dup             
	//    9   19:iload_0         
	//   10   20:i2l             
	//   11   21:lload_1         
	//   12   22:lconst_1        
	//   13   23:lsub            
	//   14   24:invokespecial   #504 <Method void LongRange(long, long)>
	//   15   27:areturn         
	}
}
