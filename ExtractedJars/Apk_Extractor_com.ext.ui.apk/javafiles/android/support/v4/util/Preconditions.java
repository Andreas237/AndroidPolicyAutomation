// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import android.text.TextUtils;
import java.util.*;

public class Preconditions
{

	public Preconditions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void checkArgument(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			throw new IllegalArgumentException();
	//    2    4:new             #17  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #18  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public static void checkArgument(boolean flag, Object obj)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            16
			throw new IllegalArgumentException(String.valueOf(obj));
	//    2    4:new             #17  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #25  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return;
	//    8   16:return          
	}

	public static float checkArgumentFinite(float f, String s)
	{
		if(Float.isNaN(f))
	//*   0    0:fload_0         
	//*   1    1:invokestatic    #36  <Method boolean Float.isNaN(float)>
	//*   2    4:ifeq            34
			throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must not be NaN").toString());
	//    3    7:new             #17  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:new             #38  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #39  <Method void StringBuilder()>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc1            #45  <String " must not be NaN">
	//   11   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   13   30:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   14   33:athrow          
		if(Float.isInfinite(f))
	//*  15   34:fload_0         
	//*  16   35:invokestatic    #52  <Method boolean Float.isInfinite(float)>
	//*  17   38:ifeq            68
			throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must not be infinite").toString());
	//   18   41:new             #17  <Class IllegalArgumentException>
	//   19   44:dup             
	//   20   45:new             #38  <Class StringBuilder>
	//   21   48:dup             
	//   22   49:invokespecial   #39  <Method void StringBuilder()>
	//   23   52:aload_1         
	//   24   53:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:ldc1            #54  <String " must not be infinite">
	//   26   58:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   27   61:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   28   64:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   29   67:athrow          
		else
			return f;
	//   30   68:fload_0         
	//   31   69:freturn         
	}

	public static float checkArgumentInRange(float f, float f1, float f2, String s)
	{
		if(Float.isNaN(f))
	//*   0    0:fload_0         
	//*   1    1:invokestatic    #36  <Method boolean Float.isNaN(float)>
	//*   2    4:ifeq            34
			throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must not be NaN").toString());
	//    3    7:new             #17  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:new             #38  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #39  <Method void StringBuilder()>
	//    8   18:aload_3         
	//    9   19:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc1            #45  <String " must not be NaN">
	//   11   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   13   30:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   14   33:athrow          
		if(f < f1)
	//*  15   34:fload_0         
	//*  16   35:fload_1         
	//*  17   36:fcmpg           
	//*  18   37:ifge            78
			throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[] {
				s, Float.valueOf(f1), Float.valueOf(f2)
			}));
	//   19   40:new             #17  <Class IllegalArgumentException>
	//   20   43:dup             
	//   21   44:getstatic       #62  <Field Locale Locale.US>
	//   22   47:ldc1            #64  <String "%s is out of range of [%f, %f] (too low)">
	//   23   49:iconst_3        
	//   24   50:anewarray       Object[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:aload_3         
	//   28   56:aastore         
	//   29   57:dup             
	//   30   58:iconst_1        
	//   31   59:fload_1         
	//   32   60:invokestatic    #67  <Method Float Float.valueOf(float)>
	//   33   63:aastore         
	//   34   64:dup             
	//   35   65:iconst_2        
	//   36   66:fload_2         
	//   37   67:invokestatic    #67  <Method Float Float.valueOf(float)>
	//   38   70:aastore         
	//   39   71:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   40   74:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   41   77:athrow          
		if(f > f2)
	//*  42   78:fload_0         
	//*  43   79:fload_2         
	//*  44   80:fcmpl           
	//*  45   81:ifle            122
			throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[] {
				s, Float.valueOf(f1), Float.valueOf(f2)
			}));
	//   46   84:new             #17  <Class IllegalArgumentException>
	//   47   87:dup             
	//   48   88:getstatic       #62  <Field Locale Locale.US>
	//   49   91:ldc1            #73  <String "%s is out of range of [%f, %f] (too high)">
	//   50   93:iconst_3        
	//   51   94:anewarray       Object[]
	//   52   97:dup             
	//   53   98:iconst_0        
	//   54   99:aload_3         
	//   55  100:aastore         
	//   56  101:dup             
	//   57  102:iconst_1        
	//   58  103:fload_1         
	//   59  104:invokestatic    #67  <Method Float Float.valueOf(float)>
	//   60  107:aastore         
	//   61  108:dup             
	//   62  109:iconst_2        
	//   63  110:fload_2         
	//   64  111:invokestatic    #67  <Method Float Float.valueOf(float)>
	//   65  114:aastore         
	//   66  115:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   67  118:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   68  121:athrow          
		else
			return f;
	//   69  122:fload_0         
	//   70  123:freturn         
	}

	public static int checkArgumentInRange(int i, int j, int k, String s)
	{
		if(i < j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          43
			throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[] {
				s, Integer.valueOf(j), Integer.valueOf(k)
			}));
	//    3    5:new             #17  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:getstatic       #62  <Field Locale Locale.US>
	//    6   12:ldc1            #76  <String "%s is out of range of [%d, %d] (too low)">
	//    7   14:iconst_3        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_3         
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_1        
	//   15   24:iload_1         
	//   16   25:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_2        
	//   20   31:iload_2         
	//   21   32:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   22   35:aastore         
	//   23   36:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   24   39:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   25   42:athrow          
		if(i > k)
	//*  26   43:iload_0         
	//*  27   44:iload_2         
	//*  28   45:icmple          86
			throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[] {
				s, Integer.valueOf(j), Integer.valueOf(k)
			}));
	//   29   48:new             #17  <Class IllegalArgumentException>
	//   30   51:dup             
	//   31   52:getstatic       #62  <Field Locale Locale.US>
	//   32   55:ldc1            #83  <String "%s is out of range of [%d, %d] (too high)">
	//   33   57:iconst_3        
	//   34   58:anewarray       Object[]
	//   35   61:dup             
	//   36   62:iconst_0        
	//   37   63:aload_3         
	//   38   64:aastore         
	//   39   65:dup             
	//   40   66:iconst_1        
	//   41   67:iload_1         
	//   42   68:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   43   71:aastore         
	//   44   72:dup             
	//   45   73:iconst_2        
	//   46   74:iload_2         
	//   47   75:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   48   78:aastore         
	//   49   79:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   50   82:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   51   85:athrow          
		else
			return i;
	//   52   86:iload_0         
	//   53   87:ireturn         
	}

	public static long checkArgumentInRange(long l, long l1, long l2, String s)
	{
		if(l < l1)
	//*   0    0:lload_0         
	//*   1    1:lload_2         
	//*   2    2:lcmp            
	//*   3    3:ifge            46
			throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[] {
				s, Long.valueOf(l1), Long.valueOf(l2)
			}));
	//    4    6:new             #17  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:getstatic       #62  <Field Locale Locale.US>
	//    7   13:ldc1            #76  <String "%s is out of range of [%d, %d] (too low)">
	//    8   15:iconst_3        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:aload           6
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:lload_2         
	//   17   27:invokestatic    #89  <Method Long Long.valueOf(long)>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_2        
	//   21   33:lload           4
	//   22   35:invokestatic    #89  <Method Long Long.valueOf(long)>
	//   23   38:aastore         
	//   24   39:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   25   42:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   26   45:athrow          
		if(l > l2)
	//*  27   46:lload_0         
	//*  28   47:lload           4
	//*  29   49:lcmp            
	//*  30   50:ifle            93
			throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[] {
				s, Long.valueOf(l1), Long.valueOf(l2)
			}));
	//   31   53:new             #17  <Class IllegalArgumentException>
	//   32   56:dup             
	//   33   57:getstatic       #62  <Field Locale Locale.US>
	//   34   60:ldc1            #83  <String "%s is out of range of [%d, %d] (too high)">
	//   35   62:iconst_3        
	//   36   63:anewarray       Object[]
	//   37   66:dup             
	//   38   67:iconst_0        
	//   39   68:aload           6
	//   40   70:aastore         
	//   41   71:dup             
	//   42   72:iconst_1        
	//   43   73:lload_2         
	//   44   74:invokestatic    #89  <Method Long Long.valueOf(long)>
	//   45   77:aastore         
	//   46   78:dup             
	//   47   79:iconst_2        
	//   48   80:lload           4
	//   49   82:invokestatic    #89  <Method Long Long.valueOf(long)>
	//   50   85:aastore         
	//   51   86:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   52   89:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   53   92:athrow          
		else
			return l;
	//   54   93:lload_0         
	//   55   94:lreturn         
	}

	public static int checkArgumentNonnegative(int i)
	{
		if(i < 0)
	//*   0    0:iload_0         
	//*   1    1:ifge            12
			throw new IllegalArgumentException();
	//    2    4:new             #17  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #18  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		else
			return i;
	//    6   12:iload_0         
	//    7   13:ireturn         
	}

	public static int checkArgumentNonnegative(int i, String s)
	{
		if(i < 0)
	//*   0    0:iload_0         
	//*   1    1:ifge            13
			throw new IllegalArgumentException(s);
	//    2    4:new             #17  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    6   12:athrow          
		else
			return i;
	//    7   13:iload_0         
	//    8   14:ireturn         
	}

	public static long checkArgumentNonnegative(long l)
	{
		if(l < 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            14
			throw new IllegalArgumentException();
	//    4    6:new             #17  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:invokespecial   #18  <Method void IllegalArgumentException()>
	//    7   13:athrow          
		else
			return l;
	//    8   14:lload_0         
	//    9   15:lreturn         
	}

	public static long checkArgumentNonnegative(long l, String s)
	{
		if(l < 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            15
			throw new IllegalArgumentException(s);
	//    4    6:new             #17  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    8   14:athrow          
		else
			return l;
	//    9   15:lload_0         
	//   10   16:lreturn         
	}

	public static int checkArgumentPositive(int i, String s)
	{
		if(i <= 0)
	//*   0    0:iload_0         
	//*   1    1:ifgt            13
			throw new IllegalArgumentException(s);
	//    2    4:new             #17  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    6   12:athrow          
		else
			return i;
	//    7   13:iload_0         
	//    8   14:ireturn         
	}

	public static float[] checkArrayElementsInRange(float af[], float f, float f1, String s)
	{
		checkNotNull(((Object) (af)), ((Object) ((new StringBuilder()).append(s).append(" must not be null").toString())));
	//    0    0:aload_0         
	//    1    1:new             #38  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #39  <Method void StringBuilder()>
	//    4    8:aload_3         
	//    5    9:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    6   12:ldc1            #104 <String " must not be null">
	//    7   14:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:invokevirtual   #49  <Method String StringBuilder.toString()>
	//    9   20:invokestatic    #108 <Method Object checkNotNull(Object, Object)>
	//   10   23:pop             
		for(int i = 0; i < af.length; i++)
	//*  11   24:iconst_0        
	//*  12   25:istore          5
	//*  13   27:iload           5
	//*  14   29:aload_0         
	//*  15   30:arraylength     
	//*  16   31:icmpge          200
		{
			float f2 = af[i];
	//   17   34:aload_0         
	//   18   35:iload           5
	//   19   37:faload          
	//   20   38:fstore          4
			if(Float.isNaN(f2))
	//*  21   40:fload           4
	//*  22   42:invokestatic    #36  <Method boolean Float.isNaN(float)>
	//*  23   45:ifeq            85
				throw new IllegalArgumentException((new StringBuilder()).append(s).append("[").append(i).append("] must not be NaN").toString());
	//   24   48:new             #17  <Class IllegalArgumentException>
	//   25   51:dup             
	//   26   52:new             #38  <Class StringBuilder>
	//   27   55:dup             
	//   28   56:invokespecial   #39  <Method void StringBuilder()>
	//   29   59:aload_3         
	//   30   60:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:ldc1            #110 <String "[">
	//   32   65:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:iload           5
	//   34   70:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//   35   73:ldc1            #115 <String "] must not be NaN">
	//   36   75:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   37   78:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   38   81:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   39   84:athrow          
			if(f2 < f)
	//*  40   85:fload           4
	//*  41   87:fload_1         
	//*  42   88:fcmpg           
	//*  43   89:ifge            138
				throw new IllegalArgumentException(String.format(Locale.US, "%s[%d] is out of range of [%f, %f] (too low)", new Object[] {
					s, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f1)
				}));
	//   44   92:new             #17  <Class IllegalArgumentException>
	//   45   95:dup             
	//   46   96:getstatic       #62  <Field Locale Locale.US>
	//   47   99:ldc1            #117 <String "%s[%d] is out of range of [%f, %f] (too low)">
	//   48  101:iconst_4        
	//   49  102:anewarray       Object[]
	//   50  105:dup             
	//   51  106:iconst_0        
	//   52  107:aload_3         
	//   53  108:aastore         
	//   54  109:dup             
	//   55  110:iconst_1        
	//   56  111:iload           5
	//   57  113:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   58  116:aastore         
	//   59  117:dup             
	//   60  118:iconst_2        
	//   61  119:fload_1         
	//   62  120:invokestatic    #67  <Method Float Float.valueOf(float)>
	//   63  123:aastore         
	//   64  124:dup             
	//   65  125:iconst_3        
	//   66  126:fload_2         
	//   67  127:invokestatic    #67  <Method Float Float.valueOf(float)>
	//   68  130:aastore         
	//   69  131:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   70  134:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   71  137:athrow          
			if(f2 > f1)
	//*  72  138:fload           4
	//*  73  140:fload_2         
	//*  74  141:fcmpl           
	//*  75  142:ifle            191
				throw new IllegalArgumentException(String.format(Locale.US, "%s[%d] is out of range of [%f, %f] (too high)", new Object[] {
					s, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f1)
				}));
	//   76  145:new             #17  <Class IllegalArgumentException>
	//   77  148:dup             
	//   78  149:getstatic       #62  <Field Locale Locale.US>
	//   79  152:ldc1            #119 <String "%s[%d] is out of range of [%f, %f] (too high)">
	//   80  154:iconst_4        
	//   81  155:anewarray       Object[]
	//   82  158:dup             
	//   83  159:iconst_0        
	//   84  160:aload_3         
	//   85  161:aastore         
	//   86  162:dup             
	//   87  163:iconst_1        
	//   88  164:iload           5
	//   89  166:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   90  169:aastore         
	//   91  170:dup             
	//   92  171:iconst_2        
	//   93  172:fload_1         
	//   94  173:invokestatic    #67  <Method Float Float.valueOf(float)>
	//   95  176:aastore         
	//   96  177:dup             
	//   97  178:iconst_3        
	//   98  179:fload_2         
	//   99  180:invokestatic    #67  <Method Float Float.valueOf(float)>
	//  100  183:aastore         
	//  101  184:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//  102  187:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//  103  190:athrow          
		}

	//  104  191:iload           5
	//  105  193:iconst_1        
	//  106  194:iadd            
	//  107  195:istore          5
	//* 108  197:goto            27
		return af;
	//  109  200:aload_0         
	//  110  201:areturn         
	}

	public static Object[] checkArrayElementsNotNull(Object aobj[], String s)
	{
		if(aobj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       31
			throw new NullPointerException((new StringBuilder()).append(s).append(" must not be null").toString());
	//    2    4:new             #123 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:new             #38  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #39  <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #104 <String " must not be null">
	//   10   21:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #124 <Method void NullPointerException(String)>
	//   13   30:athrow          
		for(int i = 0; i < aobj.length; i++)
	//*  14   31:iconst_0        
	//*  15   32:istore_2        
	//*  16   33:iload_2         
	//*  17   34:aload_0         
	//*  18   35:arraylength     
	//*  19   36:icmpge          83
			if(aobj[i] == null)
	//*  20   39:aload_0         
	//*  21   40:iload_2         
	//*  22   41:aaload          
	//*  23   42:ifnonnull       76
				throw new NullPointerException(String.format(Locale.US, "%s[%d] must not be null", new Object[] {
					s, Integer.valueOf(i)
				}));
	//   24   45:new             #123 <Class NullPointerException>
	//   25   48:dup             
	//   26   49:getstatic       #62  <Field Locale Locale.US>
	//   27   52:ldc1            #126 <String "%s[%d] must not be null">
	//   28   54:iconst_2        
	//   29   55:anewarray       Object[]
	//   30   58:dup             
	//   31   59:iconst_0        
	//   32   60:aload_1         
	//   33   61:aastore         
	//   34   62:dup             
	//   35   63:iconst_1        
	//   36   64:iload_2         
	//   37   65:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   38   68:aastore         
	//   39   69:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   40   72:invokespecial   #124 <Method void NullPointerException(String)>
	//   41   75:athrow          

	//   42   76:iload_2         
	//   43   77:iconst_1        
	//   44   78:iadd            
	//   45   79:istore_2        
	//*  46   80:goto            33
		return aobj;
	//   47   83:aload_0         
	//   48   84:areturn         
	}

	public static Collection checkCollectionElementsNotNull(Collection collection, String s)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       31
			throw new NullPointerException((new StringBuilder()).append(s).append(" must not be null").toString());
	//    2    4:new             #123 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:new             #38  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #39  <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #104 <String " must not be null">
	//   10   21:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #124 <Method void NullPointerException(String)>
	//   13   30:athrow          
		long l = 0L;
	//   14   31:lconst_0        
	//   15   32:lstore_2        
		for(Iterator iterator = collection.iterator(); iterator.hasNext();)
	//*  16   33:aload_0         
	//*  17   34:invokeinterface #137 <Method Iterator Collection.iterator()>
	//*  18   39:astore          4
	//*  19   41:aload           4
	//*  20   43:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  21   48:ifeq            99
		{
			if(iterator.next() == null)
	//*  22   51:aload           4
	//*  23   53:invokeinterface #147 <Method Object Iterator.next()>
	//*  24   58:ifnonnull       92
				throw new NullPointerException(String.format(Locale.US, "%s[%d] must not be null", new Object[] {
					s, Long.valueOf(l)
				}));
	//   25   61:new             #123 <Class NullPointerException>
	//   26   64:dup             
	//   27   65:getstatic       #62  <Field Locale Locale.US>
	//   28   68:ldc1            #126 <String "%s[%d] must not be null">
	//   29   70:iconst_2        
	//   30   71:anewarray       Object[]
	//   31   74:dup             
	//   32   75:iconst_0        
	//   33   76:aload_1         
	//   34   77:aastore         
	//   35   78:dup             
	//   36   79:iconst_1        
	//   37   80:lload_2         
	//   38   81:invokestatic    #89  <Method Long Long.valueOf(long)>
	//   39   84:aastore         
	//   40   85:invokestatic    #71  <Method String String.format(Locale, String, Object[])>
	//   41   88:invokespecial   #124 <Method void NullPointerException(String)>
	//   42   91:athrow          
			l++;
	//   43   92:lload_2         
	//   44   93:lconst_1        
	//   45   94:ladd            
	//   46   95:lstore_2        
		}

	//*  47   96:goto            41
		return collection;
	//   48   99:aload_0         
	//   49  100:areturn         
	}

	public static Collection checkCollectionNotEmpty(Collection collection, String s)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       31
			throw new NullPointerException((new StringBuilder()).append(s).append(" must not be null").toString());
	//    2    4:new             #123 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:new             #38  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #39  <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #104 <String " must not be null">
	//   10   21:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #124 <Method void NullPointerException(String)>
	//   13   30:athrow          
		if(collection.isEmpty())
	//*  14   31:aload_0         
	//*  15   32:invokeinterface #152 <Method boolean Collection.isEmpty()>
	//*  16   37:ifeq            67
			throw new IllegalArgumentException((new StringBuilder()).append(s).append(" is empty").toString());
	//   17   40:new             #17  <Class IllegalArgumentException>
	//   18   43:dup             
	//   19   44:new             #38  <Class StringBuilder>
	//   20   47:dup             
	//   21   48:invokespecial   #39  <Method void StringBuilder()>
	//   22   51:aload_1         
	//   23   52:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   24   55:ldc1            #154 <String " is empty">
	//   25   57:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   26   60:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   27   63:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   28   66:athrow          
		else
			return collection;
	//   29   67:aload_0         
	//   30   68:areturn         
	}

	public static int checkFlagsArgument(int i, int j)
	{
		if((i & j) != i)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:iand            
	//*   3    3:iload_0         
	//*   4    4:icmpeq          54
			throw new IllegalArgumentException((new StringBuilder()).append("Requested flags 0x").append(Integer.toHexString(i)).append(", but only 0x").append(Integer.toHexString(j)).append(" are allowed").toString());
	//    5    7:new             #17  <Class IllegalArgumentException>
	//    6   10:dup             
	//    7   11:new             #38  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #39  <Method void StringBuilder()>
	//   10   18:ldc1            #159 <String "Requested flags 0x">
	//   11   20:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:iload_0         
	//   13   24:invokestatic    #163 <Method String Integer.toHexString(int)>
	//   14   27:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:ldc1            #165 <String ", but only 0x">
	//   16   32:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:iload_1         
	//   18   36:invokestatic    #163 <Method String Integer.toHexString(int)>
	//   19   39:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:ldc1            #167 <String " are allowed">
	//   21   44:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   23   50:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   24   53:athrow          
		else
			return i;
	//   25   54:iload_0         
	//   26   55:ireturn         
	}

	public static Object checkNotNull(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #123 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #169 <Method void NullPointerException()>
	//    5   11:athrow          
		else
			return obj;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public static Object checkNotNull(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       16
			throw new NullPointerException(String.valueOf(obj1));
	//    2    4:new             #123 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokestatic    #25  <Method String String.valueOf(Object)>
	//    6   12:invokespecial   #124 <Method void NullPointerException(String)>
	//    7   15:athrow          
		else
			return obj;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public static void checkState(boolean flag)
	{
		checkState(flag, ((String) (null)));
	//    0    0:iload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #175 <Method void checkState(boolean, String)>
	//    3    5:return          
	}

	public static void checkState(boolean flag, String s)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            13
			throw new IllegalStateException(s);
	//    2    4:new             #177 <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #178 <Method void IllegalStateException(String)>
	//    6   12:athrow          
		else
			return;
	//    7   13:return          
	}

	public static CharSequence checkStringNotEmpty(CharSequence charsequence)
	{
		if(TextUtils.isEmpty(charsequence))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #185 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            15
			throw new IllegalArgumentException();
	//    3    7:new             #17  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:invokespecial   #18  <Method void IllegalArgumentException()>
	//    6   14:athrow          
		else
			return charsequence;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public static CharSequence checkStringNotEmpty(CharSequence charsequence, Object obj)
	{
		if(TextUtils.isEmpty(charsequence))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #185 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            19
			throw new IllegalArgumentException(String.valueOf(obj));
	//    3    7:new             #17  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokestatic    #25  <Method String String.valueOf(Object)>
	//    7   15:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		else
			return charsequence;
	//    9   19:aload_0         
	//   10   20:areturn         
	}
}
