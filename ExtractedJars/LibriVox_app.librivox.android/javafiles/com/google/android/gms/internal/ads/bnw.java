// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmp, bnx, bml, bdj, 
//			bnf

public final class bnw
{

	public static float a(float f1, float f2, float f3)
	{
		return Math.max(0.1F, Math.min(f1, 8F));
	//    0    0:ldc2            #359 <Float 0.1F>
	//    1    3:fload_0         
	//    2    4:ldc2            #360 <Float 8F>
	//    3    7:invokestatic    #366 <Method float Math.min(float, float)>
	//    4   10:invokestatic    #369 <Method float Math.max(float, float)>
	//    5   13:freturn         
	}

	public static int a(int j)
	{
		if(j != 8)
	//*   0    0:iload_0         
	//*   1    1:bipush          8
	//*   2    3:icmpeq          36
		{
			if(j != 16)
	//*   3    6:iload_0         
	//*   4    7:bipush          16
	//*   5    9:icmpeq          34
			{
				if(j != 24)
	//*   6   12:iload_0         
	//*   7   13:bipush          24
	//*   8   15:icmpeq          30
					return j == 32 ? 0x40000000 : 0;
	//    9   18:iload_0         
	//   10   19:bipush          32
	//   11   21:icmpeq          26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:ldc2            #371 <Int 0x40000000>
	//   15   29:ireturn         
				else
					return 0x80000000;
	//   16   30:ldc2            #372 <Int 0x80000000>
	//   17   33:ireturn         
			} else
			{
				return 2;
	//   18   34:iconst_2        
	//   19   35:ireturn         
			}
		} else
		{
			return 3;
	//   20   36:iconst_3        
	//   21   37:ireturn         
		}
	}

	public static int a(int j, int k)
	{
		return ((j + k) - 1) / k;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iadd            
	//    3    3:iconst_1        
	//    4    4:isub            
	//    5    5:iload_1         
	//    6    6:idiv            
	//    7    7:ireturn         
	}

	public static int a(int j, int k, int l)
	{
		return Math.max(k, Math.min(j, l));
	//    0    0:iload_1         
	//    1    1:iload_0         
	//    2    2:iload_2         
	//    3    3:invokestatic    #376 <Method int Math.min(int, int)>
	//    4    6:invokestatic    #378 <Method int Math.max(int, int)>
	//    5    9:ireturn         
	}

	public static int a(long al[], long l, boolean flag, boolean flag1)
	{
		int k = Arrays.binarySearch(al, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #385 <Method int Arrays.binarySearch(long[], long)>
	//    3    5:istore          6
		int j = k;
	//    4    7:iload           6
	//    5    9:istore          5
		if(k < 0)
	//*   6   11:iload           6
	//*   7   13:ifge            26
		{
			j = -(k + 2);
	//    8   16:iload           6
	//    9   18:iconst_2        
	//   10   19:iadd            
	//   11   20:ineg            
	//   12   21:istore          5
		} else
	//*  13   23:goto            56
		{
			do
			{
				k = j - 1;
	//   14   26:iload           5
	//   15   28:iconst_1        
	//   16   29:isub            
	//   17   30:istore          6
				if(k < 0)
					break;
	//   18   32:iload           6
	//   19   34:iflt            50
				j = k;
	//   20   37:iload           6
	//   21   39:istore          5
			} while(al[k] == l);
	//   22   41:aload_0         
	//   23   42:iload           6
	//   24   44:laload          
	//   25   45:lload_1         
	//   26   46:lcmp            
	//   27   47:ifeq            26
			j = k + 1;
	//   28   50:iload           6
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore          5
		}
		k = j;
	//   32   56:iload           5
	//   33   58:istore          6
		if(flag1)
	//*  34   60:iload           4
	//*  35   62:ifeq            73
			k = Math.max(0, j);
	//   36   65:iconst_0        
	//   37   66:iload           5
	//   38   68:invokestatic    #378 <Method int Math.max(int, int)>
	//   39   71:istore          6
		return k;
	//   40   73:iload           6
	//   41   75:ireturn         
	}

	public static long a(long l, long l1)
	{
		return ((l + l1) - 1L) / l1;
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:ladd            
	//    3    3:lconst_1        
	//    4    4:lsub            
	//    5    5:lload_2         
	//    6    6:ldiv            
	//    7    7:lreturn         
	}

	public static long a(long l, long l1, long l2)
	{
		if(l2 >= l1 && l2 % l1 == 0L)
	//*   0    0:lload           4
	//*   1    2:lload_2         
	//*   2    3:lcmp            
	//*   3    4:iflt            23
	//*   4    7:lload           4
	//*   5    9:lload_2         
	//*   6   10:lrem            
	//*   7   11:lconst_0        
	//*   8   12:lcmp            
	//*   9   13:ifne            23
			return l / (l2 / l1);
	//   10   16:lload_0         
	//   11   17:lload           4
	//   12   19:lload_2         
	//   13   20:ldiv            
	//   14   21:ldiv            
	//   15   22:lreturn         
		if(l2 < l1 && l1 % l2 == 0L)
	//*  16   23:lload           4
	//*  17   25:lload_2         
	//*  18   26:lcmp            
	//*  19   27:ifge            46
	//*  20   30:lload_2         
	//*  21   31:lload           4
	//*  22   33:lrem            
	//*  23   34:lconst_0        
	//*  24   35:lcmp            
	//*  25   36:ifne            46
		{
			return l * (l1 / l2);
	//   26   39:lload_0         
	//   27   40:lload_2         
	//   28   41:lload           4
	//   29   43:ldiv            
	//   30   44:lmul            
	//   31   45:lreturn         
		} else
		{
			double d1 = l1;
	//   32   46:lload_2         
	//   33   47:l2d             
	//   34   48:dstore          6
			double d2 = l2;
	//   35   50:lload           4
	//   36   52:l2d             
	//   37   53:dstore          8
			Double.isNaN(d1);
	//   38   55:dload           6
	//   39   57:invokestatic    #393 <Method boolean Double.isNaN(double)>
	//   40   60:pop             
			Double.isNaN(d2);
	//   41   61:dload           8
	//   42   63:invokestatic    #393 <Method boolean Double.isNaN(double)>
	//   43   66:pop             
			d1 /= d2;
	//   44   67:dload           6
	//   45   69:dload           8
	//   46   71:ddiv            
	//   47   72:dstore          6
			d2 = l;
	//   48   74:lload_0         
	//   49   75:l2d             
	//   50   76:dstore          8
			Double.isNaN(d2);
	//   51   78:dload           8
	//   52   80:invokestatic    #393 <Method boolean Double.isNaN(double)>
	//   53   83:pop             
			return (long)(d2 * d1);
	//   54   84:dload           8
	//   55   86:dload           6
	//   56   88:dmul            
	//   57   89:d2l             
	//   58   90:lreturn         
		}
	}

	public static bmp a(bmp bmp1, int j)
	{
		if(j == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return bmp1;
	//    2    4:aload_0         
	//    3    5:areturn         
		long l;
		if(bmp1.e == -1L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #399 <Field long bmp.e>
	//*   6   10:ldc2w           #400 <Long -1L>
	//*   7   13:lcmp            
	//*   8   14:ifne            24
			l = -1L;
	//    9   17:ldc2w           #400 <Long -1L>
	//   10   20:lstore_2        
		else
	//*  11   21:goto            32
			l = bmp1.e - (long)j;
	//   12   24:aload_0         
	//   13   25:getfield        #399 <Field long bmp.e>
	//   14   28:iload_1         
	//   15   29:i2l             
	//   16   30:lsub            
	//   17   31:lstore_2        
		return new bmp(bmp1.a, bmp1.d + (long)j, l, bmp1.f, bmp1.g);
	//   18   32:new             #396 <Class bmp>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:getfield        #404 <Field android.net.Uri bmp.a>
	//   22   40:aload_0         
	//   23   41:getfield        #406 <Field long bmp.d>
	//   24   44:iload_1         
	//   25   45:i2l             
	//   26   46:ladd            
	//   27   47:lload_2         
	//   28   48:aload_0         
	//   29   49:getfield        #408 <Field String bmp.f>
	//   30   52:aload_0         
	//   31   53:getfield        #410 <Field int bmp.g>
	//   32   56:invokespecial   #413 <Method void bmp(android.net.Uri, long, long, String, int)>
	//   33   59:areturn         
	}

	public static String a(Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #416 <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int j = 0; j < aobj.length; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          52
		{
			stringbuilder.append(aobj[j].getClass().getSimpleName());
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:aaload          
	//   14   20:invokevirtual   #420 <Method Class Object.getClass()>
	//   15   23:invokevirtual   #425 <Method String Class.getSimpleName()>
	//   16   26:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   17   29:pop             
			if(j < aobj.length - 1)
	//*  18   30:iload_1         
	//*  19   31:aload_0         
	//*  20   32:arraylength     
	//*  21   33:iconst_1        
	//*  22   34:isub            
	//*  23   35:icmpge          45
				stringbuilder.append(", ");
	//   24   38:aload_2         
	//   25   39:ldc1            #72  <String ", ">
	//   26   41:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   27   44:pop             
		}

	//   28   45:iload_1         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_1        
	//*  32   49:goto            10
		return stringbuilder.toString();
	//   33   52:aload_2         
	//   34   53:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   35   56:areturn         
	}

	public static ExecutorService a(String s)
	{
		return Executors.newSingleThreadExecutor(((java.util.concurrent.ThreadFactory) (new bnx(s))));
	//    0    0:new             #428 <Class bnx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #431 <Method void bnx(String)>
	//    4    8:invokestatic    #437 <Method ExecutorService Executors.newSingleThreadExecutor(java.util.concurrent.ThreadFactory)>
	//    5   11:areturn         
	}

	public static void a(bml bml1)
	{
		if(bml1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			try
			{
				bml1.a();
	//    2    4:aload_0         
	//    3    5:invokeinterface #444 <Method void bml.a()>
				return;
	//    4   10:return          
			}
	//*   5   11:return          
	//*   6   12:return          
			// Misplaced declaration of an exception variable
			catch(bml bml1)
	//*   7   13:astore_0        
			{
				return;
	//    8   14:return          
			}
		else
			return;
	}

	public static void a(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_0         
	//    1    1:invokeinterface #450 <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
	//*   3    7:return          
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   4    8:astore_0        
		{
			return;
	//    5    9:return          
		}
	}

	public static void a(long al[], long l, long l1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          10
		boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          11
		int j = 0;
	//    4    6:iconst_0        
	//    5    7:istore          9
		if(l1 >= 0xf4240L && l1 % 0xf4240L == 0L)
	//*   6    9:lload_3         
	//*   7   10:ldc2w           #452 <Long 0xf4240L>
	//*   8   13:lcmp            
	//*   9   14:iflt            60
	//*  10   17:lload_3         
	//*  11   18:ldc2w           #452 <Long 0xf4240L>
	//*  12   21:lrem            
	//*  13   22:lconst_0        
	//*  14   23:lcmp            
	//*  15   24:ifne            60
		{
			l = l1 / 0xf4240L;
	//   16   27:lload_3         
	//   17   28:ldc2w           #452 <Long 0xf4240L>
	//   18   31:ldiv            
	//   19   32:lstore_1        
			for(; j < al.length; j++)
	//*  20   33:iload           9
	//*  21   35:aload_0         
	//*  22   36:arraylength     
	//*  23   37:icmpge          59
				al[j] = al[j] / l;
	//   24   40:aload_0         
	//   25   41:iload           9
	//   26   43:aload_0         
	//   27   44:iload           9
	//   28   46:laload          
	//   29   47:lload_1         
	//   30   48:ldiv            
	//   31   49:lastore         

	//   32   50:iload           9
	//   33   52:iconst_1        
	//   34   53:iadd            
	//   35   54:istore          9
	//*  36   56:goto            33
			return;
	//   37   59:return          
		}
		if(l1 < 0xf4240L && 0xf4240L % l1 == 0L)
	//*  38   60:lload_3         
	//*  39   61:ldc2w           #452 <Long 0xf4240L>
	//*  40   64:lcmp            
	//*  41   65:ifge            115
	//*  42   68:ldc2w           #452 <Long 0xf4240L>
	//*  43   71:lload_3         
	//*  44   72:lrem            
	//*  45   73:lconst_0        
	//*  46   74:lcmp            
	//*  47   75:ifne            115
		{
			l = 0xf4240L / l1;
	//   48   78:ldc2w           #452 <Long 0xf4240L>
	//   49   81:lload_3         
	//   50   82:ldiv            
	//   51   83:lstore_1        
			for(int k = ((int) (flag)); k < al.length; k++)
	//*  52   84:iload           10
	//*  53   86:istore          9
	//*  54   88:iload           9
	//*  55   90:aload_0         
	//*  56   91:arraylength     
	//*  57   92:icmpge          114
				al[k] = al[k] * l;
	//   58   95:aload_0         
	//   59   96:iload           9
	//   60   98:aload_0         
	//   61   99:iload           9
	//   62  101:laload          
	//   63  102:lload_1         
	//   64  103:lmul            
	//   65  104:lastore         

	//   66  105:iload           9
	//   67  107:iconst_1        
	//   68  108:iadd            
	//   69  109:istore          9
	//*  70  111:goto            88
			return;
	//   71  114:return          
		}
		double d1 = l1;
	//   72  115:lload_3         
	//   73  116:l2d             
	//   74  117:dstore          5
		Double.isNaN(d1);
	//   75  119:dload           5
	//   76  121:invokestatic    #393 <Method boolean Double.isNaN(double)>
	//   77  124:pop             
		d1 = 1000000D / d1;
	//   78  125:ldc2w           #454 <Double 1000000D>
	//   79  128:dload           5
	//   80  130:ddiv            
	//   81  131:dstore          5
		for(int i1 = ((int) (flag1)); i1 < al.length; i1++)
	//*  82  133:iload           11
	//*  83  135:istore          9
	//*  84  137:iload           9
	//*  85  139:aload_0         
	//*  86  140:arraylength     
	//*  87  141:icmpge          176
		{
			double d2 = al[i1];
	//   88  144:aload_0         
	//   89  145:iload           9
	//   90  147:laload          
	//   91  148:l2d             
	//   92  149:dstore          7
			Double.isNaN(d2);
	//   93  151:dload           7
	//   94  153:invokestatic    #393 <Method boolean Double.isNaN(double)>
	//   95  156:pop             
			al[i1] = (long)(d2 * d1);
	//   96  157:aload_0         
	//   97  158:iload           9
	//   98  160:dload           7
	//   99  162:dload           5
	//  100  164:dmul            
	//  101  165:d2l             
	//  102  166:lastore         
		}

	//  103  167:iload           9
	//  104  169:iconst_1        
	//  105  170:iadd            
	//  106  171:istore          9
	//* 107  173:goto            137
	//  108  176:return          
	}

	public static boolean a(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return obj1 == null;
	//    2    4:aload_1         
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
		else
			return obj.equals(obj1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #460 <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public static int b(int j)
	{
		switch(j)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 60
	//	               1 56
	//	               2 52
	//	               3 48
	//	               4 44
		default:
			throw new IllegalStateException();
	//    2   36:new             #462 <Class IllegalStateException>
	//    3   39:dup             
	//    4   40:invokespecial   #463 <Method void IllegalStateException()>
	//    5   43:athrow          

		case 4: // '\004'
			return 0x20000;
	//    6   44:ldc2            #464 <Int 0x20000>
	//    7   47:ireturn         

		case 3: // '\003'
			return 0x20000;
	//    8   48:ldc2            #464 <Int 0x20000>
	//    9   51:ireturn         

		case 2: // '\002'
			return 0xc80000;
	//   10   52:ldc2            #465 <Int 0xc80000>
	//   11   55:ireturn         

		case 1: // '\001'
			return 0x360000;
	//   12   56:ldc2            #466 <Int 0x360000>
	//   13   59:ireturn         

		case 0: // '\0'
			return 0x1000000;
	//   14   60:ldc2            #467 <Int 0x1000000>
	//   15   63:ireturn         
		}
	}

	public static int b(int j, int k)
	{
		if(j != 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc2            #372 <Int 0x80000000>
	//*   2    4:icmpeq          54
		{
			if(j != 0x40000000)
	//*   3    7:iload_0         
	//*   4    8:ldc2            #371 <Int 0x40000000>
	//*   5   11:icmpeq          50
				switch(j)
	//*   6   14:iload_0         
				{
	//*   7   15:tableswitch     2 3: default 36
	//	               2 46
	//	               3 44
				default:
					throw new IllegalArgumentException();
	//    8   36:new             #469 <Class IllegalArgumentException>
	//    9   39:dup             
	//   10   40:invokespecial   #470 <Method void IllegalArgumentException()>
	//   11   43:athrow          

				case 3: // '\003'
					return k;
	//   12   44:iload_1         
	//   13   45:ireturn         

				case 2: // '\002'
					return k << 1;
	//   14   46:iload_1         
	//   15   47:iconst_1        
	//   16   48:ishl            
	//   17   49:ireturn         
				}
			else
				return k << 2;
	//   18   50:iload_1         
	//   19   51:iconst_2        
	//   20   52:ishl            
	//   21   53:ireturn         
		} else
		{
			return k * 3;
	//   22   54:iload_1         
	//   23   55:iconst_3        
	//   24   56:imul            
	//   25   57:ireturn         
		}
	}

	public static int b(long al[], long l, boolean flag, boolean flag1)
	{
		int k = Arrays.binarySearch(al, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #385 <Method int Arrays.binarySearch(long[], long)>
	//    3    5:istore          6
		int j = k;
	//    4    7:iload           6
	//    5    9:istore          5
		if(k < 0)
	//*   6   11:iload           6
	//*   7   13:ifge            25
		{
			j = ~k;
	//    8   16:iload           6
	//    9   18:iconst_m1       
	//   10   19:ixor            
	//   11   20:istore          5
		} else
	//*  12   22:goto            68
		{
			int i1;
			do
			{
				i1 = j + 1;
	//   13   25:iload           5
	//   14   27:iconst_1        
	//   15   28:iadd            
	//   16   29:istore          6
				if(i1 >= al.length)
					break;
	//   17   31:iload           6
	//   18   33:aload_0         
	//   19   34:arraylength     
	//   20   35:icmpge          51
				j = i1;
	//   21   38:iload           6
	//   22   40:istore          5
			} while(al[i1] == l);
	//   23   42:aload_0         
	//   24   43:iload           6
	//   25   45:laload          
	//   26   46:lload_1         
	//   27   47:lcmp            
	//   28   48:ifeq            25
			if(flag)
	//*  29   51:iload_3         
	//*  30   52:ifeq            64
				j = i1 - 1;
	//   31   55:iload           6
	//   32   57:iconst_1        
	//   33   58:isub            
	//   34   59:istore          5
			else
	//*  35   61:goto            68
				j = i1;
	//   36   64:iload           6
	//   37   66:istore          5
		}
		if(flag1)
	//*  38   68:iload           4
	//*  39   70:ifeq            83
			return Math.min(al.length - 1, j);
	//   40   73:aload_0         
	//   41   74:arraylength     
	//   42   75:iconst_1        
	//   43   76:isub            
	//   44   77:iload           5
	//   45   79:invokestatic    #376 <Method int Math.min(int, int)>
	//   46   82:ireturn         
		else
			return j;
	//   47   83:iload           5
	//   48   85:ireturn         
	}

	public static String b(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return (new Locale(s)).getLanguage();
	//    4    6:new             #473 <Class Locale>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #474 <Method void Locale(String)>
	//    8   14:invokevirtual   #477 <Method String Locale.getLanguage()>
	//    9   17:areturn         
	}

	public static byte[] c(String s)
	{
		return s.getBytes(Charset.defaultCharset());
	//    0    0:aload_0         
	//    1    1:invokestatic    #484 <Method Charset Charset.defaultCharset()>
	//    2    4:invokevirtual   #488 <Method byte[] String.getBytes(Charset)>
	//    3    7:areturn         
	}

	public static long d(String s)
	{
		Matcher matcher = g.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #95  <Field Pattern g>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #493 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          18
		if(matcher.matches())
	//*   4    9:aload           18
	//*   5   11:invokevirtual   #499 <Method boolean Matcher.matches()>
	//*   6   14:ifeq            224
		{
			boolean flag = TextUtils.isEmpty(((CharSequence) (matcher.group(1))));
	//    7   17:aload           18
	//    8   19:iconst_1        
	//    9   20:invokevirtual   #503 <Method String Matcher.group(int)>
	//   10   23:invokestatic    #509 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   11   26:istore          13
			s = matcher.group(3);
	//   12   28:aload           18
	//   13   30:iconst_3        
	//   14   31:invokevirtual   #503 <Method String Matcher.group(int)>
	//   15   34:astore_0        
			double d6 = 0.0D;
	//   16   35:dconst_0        
	//   17   36:dstore          11
			double d1;
			if(s != null)
	//*  18   38:aload_0         
	//*  19   39:ifnull          54
				d1 = Double.parseDouble(s) * 31556908D;
	//   20   42:aload_0         
	//   21   43:invokestatic    #513 <Method double Double.parseDouble(String)>
	//   22   46:ldc2w           #514 <Double 31556908D>
	//   23   49:dmul            
	//   24   50:dstore_1        
			else
	//*  25   51:goto            56
				d1 = 0.0D;
	//   26   54:dconst_0        
	//   27   55:dstore_1        
			s = matcher.group(5);
	//   28   56:aload           18
	//   29   58:iconst_5        
	//   30   59:invokevirtual   #503 <Method String Matcher.group(int)>
	//   31   62:astore_0        
			double d2;
			if(s != null)
	//*  32   63:aload_0         
	//*  33   64:ifnull          79
				d2 = Double.parseDouble(s) * 2629739D;
	//   34   67:aload_0         
	//   35   68:invokestatic    #513 <Method double Double.parseDouble(String)>
	//   36   71:ldc2w           #516 <Double 2629739D>
	//   37   74:dmul            
	//   38   75:dstore_3        
			else
	//*  39   76:goto            81
				d2 = 0.0D;
	//   40   79:dconst_0        
	//   41   80:dstore_3        
			s = matcher.group(7);
	//   42   81:aload           18
	//   43   83:bipush          7
	//   44   85:invokevirtual   #503 <Method String Matcher.group(int)>
	//   45   88:astore_0        
			double d3;
			if(s != null)
	//*  46   89:aload_0         
	//*  47   90:ifnull          106
				d3 = Double.parseDouble(s) * 86400D;
	//   48   93:aload_0         
	//   49   94:invokestatic    #513 <Method double Double.parseDouble(String)>
	//   50   97:ldc2w           #518 <Double 86400D>
	//   51  100:dmul            
	//   52  101:dstore          5
			else
	//*  53  103:goto            109
				d3 = 0.0D;
	//   54  106:dconst_0        
	//   55  107:dstore          5
			s = matcher.group(10);
	//   56  109:aload           18
	//   57  111:bipush          10
	//   58  113:invokevirtual   #503 <Method String Matcher.group(int)>
	//   59  116:astore_0        
			double d4;
			if(s != null)
	//*  60  117:aload_0         
	//*  61  118:ifnull          134
				d4 = 3600D * Double.parseDouble(s);
	//   62  121:ldc2w           #520 <Double 3600D>
	//   63  124:aload_0         
	//   64  125:invokestatic    #513 <Method double Double.parseDouble(String)>
	//   65  128:dmul            
	//   66  129:dstore          7
			else
	//*  67  131:goto            137
				d4 = 0.0D;
	//   68  134:dconst_0        
	//   69  135:dstore          7
			s = matcher.group(12);
	//   70  137:aload           18
	//   71  139:bipush          12
	//   72  141:invokevirtual   #503 <Method String Matcher.group(int)>
	//   73  144:astore_0        
			double d5;
			if(s != null)
	//*  74  145:aload_0         
	//*  75  146:ifnull          162
				d5 = Double.parseDouble(s) * 60D;
	//   76  149:aload_0         
	//   77  150:invokestatic    #513 <Method double Double.parseDouble(String)>
	//   78  153:ldc2w           #522 <Double 60D>
	//   79  156:dmul            
	//   80  157:dstore          9
			else
	//*  81  159:goto            165
				d5 = 0.0D;
	//   82  162:dconst_0        
	//   83  163:dstore          9
			s = matcher.group(14);
	//   84  165:aload           18
	//   85  167:bipush          14
	//   86  169:invokevirtual   #503 <Method String Matcher.group(int)>
	//   87  172:astore_0        
			if(s != null)
	//*  88  173:aload_0         
	//*  89  174:ifnull          183
				d6 = Double.parseDouble(s);
	//   90  177:aload_0         
	//   91  178:invokestatic    #513 <Method double Double.parseDouble(String)>
	//   92  181:dstore          11
			long l1 = (long)((d1 + d2 + d3 + d4 + d5 + d6) * 1000D);
	//   93  183:dload_1         
	//   94  184:dload_3         
	//   95  185:dadd            
	//   96  186:dload           5
	//   97  188:dadd            
	//   98  189:dload           7
	//   99  191:dadd            
	//  100  192:dload           9
	//  101  194:dadd            
	//  102  195:dload           11
	//  103  197:dadd            
	//  104  198:ldc2w           #524 <Double 1000D>
	//  105  201:dmul            
	//  106  202:d2l             
	//  107  203:lstore          16
			long l = l1;
	//  108  205:lload           16
	//  109  207:lstore          14
			if(true ^ flag)
	//* 110  209:iconst_1        
	//* 111  210:iload           13
	//* 112  212:ixor            
	//* 113  213:ifeq            221
				l = -l1;
	//  114  216:lload           16
	//  115  218:lneg            
	//  116  219:lstore          14
			return l;
	//  117  221:lload           14
	//  118  223:lreturn         
		} else
		{
			return (long)(Double.parseDouble(s) * 3600D * 1000D);
	//  119  224:aload_0         
	//  120  225:invokestatic    #513 <Method double Double.parseDouble(String)>
	//  121  228:ldc2w           #520 <Double 3600D>
	//  122  231:dmul            
	//  123  232:ldc2w           #524 <Double 1000D>
	//  124  235:dmul            
	//  125  236:d2l             
	//  126  237:lreturn         
		}
	}

	public static long e(String s)
	{
		Matcher matcher = f.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #91  <Field Pattern f>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #493 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore          8
		if(!matcher.matches())
	//*   4    9:aload           8
	//*   5   11:invokevirtual   #499 <Method boolean Matcher.matches()>
	//*   6   14:ifne            60
		{
			s = String.valueOf(((Object) (s)));
	//    7   17:aload_0         
	//    8   18:invokestatic    #58  <Method String String.valueOf(Object)>
	//    9   21:astore_0        
			if(s.length() != 0)
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #62  <Method int String.length()>
	//*  12   26:ifeq            40
				s = "Invalid date/time format: ".concat(s);
	//   13   29:ldc2            #527 <String "Invalid date/time format: ">
	//   14   32:aload_0         
	//   15   33:invokevirtual   #530 <Method String String.concat(String)>
	//   16   36:astore_0        
			else
	//*  17   37:goto            51
				s = new String("Invalid date/time format: ");
	//   18   40:new             #29  <Class String>
	//   19   43:dup             
	//   20   44:ldc2            #527 <String "Invalid date/time format: ">
	//   21   47:invokespecial   #531 <Method void String(String)>
	//   22   50:astore_0        
			throw new bdj(s);
	//   23   51:new             #533 <Class bdj>
	//   24   54:dup             
	//   25   55:aload_0         
	//   26   56:invokespecial   #534 <Method void bdj(String)>
	//   27   59:athrow          
		}
		s = matcher.group(9);
	//   28   60:aload           8
	//   29   62:bipush          9
	//   30   64:invokevirtual   #503 <Method String Matcher.group(int)>
	//   31   67:astore_0        
		int j = 0;
	//   32   68:iconst_0        
	//   33   69:istore_1        
		if(s != null && !matcher.group(9).equalsIgnoreCase("Z"))
	//*  34   70:aload_0         
	//*  35   71:ifnonnull       77
	//*  36   74:goto            142
	//*  37   77:aload           8
	//*  38   79:bipush          9
	//*  39   81:invokevirtual   #503 <Method String Matcher.group(int)>
	//*  40   84:ldc2            #536 <String "Z">
	//*  41   87:invokevirtual   #540 <Method boolean String.equalsIgnoreCase(String)>
	//*  42   90:ifeq            96
	//*  43   93:goto            142
		{
			int k = Integer.parseInt(matcher.group(12)) * 60 + Integer.parseInt(matcher.group(13));
	//   44   96:aload           8
	//   45   98:bipush          12
	//   46  100:invokevirtual   #503 <Method String Matcher.group(int)>
	//   47  103:invokestatic    #546 <Method int Integer.parseInt(String)>
	//   48  106:bipush          60
	//   49  108:imul            
	//   50  109:aload           8
	//   51  111:bipush          13
	//   52  113:invokevirtual   #503 <Method String Matcher.group(int)>
	//   53  116:invokestatic    #546 <Method int Integer.parseInt(String)>
	//   54  119:iadd            
	//   55  120:istore_2        
			j = k;
	//   56  121:iload_2         
	//   57  122:istore_1        
			if(matcher.group(11).equals("-"))
	//*  58  123:aload           8
	//*  59  125:bipush          11
	//*  60  127:invokevirtual   #503 <Method String Matcher.group(int)>
	//*  61  130:ldc2            #548 <String "-">
	//*  62  133:invokevirtual   #549 <Method boolean String.equals(Object)>
	//*  63  136:ifeq            142
				j = -k;
	//   64  139:iload_2         
	//   65  140:ineg            
	//   66  141:istore_1        
		}
		GregorianCalendar gregoriancalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
	//   67  142:new             #551 <Class GregorianCalendar>
	//   68  145:dup             
	//   69  146:ldc2            #553 <String "GMT">
	//   70  149:invokestatic    #559 <Method TimeZone TimeZone.getTimeZone(String)>
	//   71  152:invokespecial   #562 <Method void GregorianCalendar(TimeZone)>
	//   72  155:astore          7
		((Calendar) (gregoriancalendar)).clear();
	//   73  157:aload           7
	//   74  159:invokevirtual   #567 <Method void Calendar.clear()>
		((Calendar) (gregoriancalendar)).set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
	//   75  162:aload           7
	//   76  164:aload           8
	//   77  166:iconst_1        
	//   78  167:invokevirtual   #503 <Method String Matcher.group(int)>
	//   79  170:invokestatic    #546 <Method int Integer.parseInt(String)>
	//   80  173:aload           8
	//   81  175:iconst_2        
	//   82  176:invokevirtual   #503 <Method String Matcher.group(int)>
	//   83  179:invokestatic    #546 <Method int Integer.parseInt(String)>
	//   84  182:iconst_1        
	//   85  183:isub            
	//   86  184:aload           8
	//   87  186:iconst_3        
	//   88  187:invokevirtual   #503 <Method String Matcher.group(int)>
	//   89  190:invokestatic    #546 <Method int Integer.parseInt(String)>
	//   90  193:aload           8
	//   91  195:iconst_4        
	//   92  196:invokevirtual   #503 <Method String Matcher.group(int)>
	//   93  199:invokestatic    #546 <Method int Integer.parseInt(String)>
	//   94  202:aload           8
	//   95  204:iconst_5        
	//   96  205:invokevirtual   #503 <Method String Matcher.group(int)>
	//   97  208:invokestatic    #546 <Method int Integer.parseInt(String)>
	//   98  211:aload           8
	//   99  213:bipush          6
	//  100  215:invokevirtual   #503 <Method String Matcher.group(int)>
	//  101  218:invokestatic    #546 <Method int Integer.parseInt(String)>
	//  102  221:invokevirtual   #571 <Method void Calendar.set(int, int, int, int, int, int)>
		if(!TextUtils.isEmpty(((CharSequence) (matcher.group(8)))))
	//* 103  224:aload           8
	//* 104  226:bipush          8
	//* 105  228:invokevirtual   #503 <Method String Matcher.group(int)>
	//* 106  231:invokestatic    #509 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 107  234:ifne            299
		{
			s = String.valueOf(((Object) (matcher.group(8))));
	//  108  237:aload           8
	//  109  239:bipush          8
	//  110  241:invokevirtual   #503 <Method String Matcher.group(int)>
	//  111  244:invokestatic    #58  <Method String String.valueOf(Object)>
	//  112  247:astore_0        
			if(s.length() != 0)
	//* 113  248:aload_0         
	//* 114  249:invokevirtual   #62  <Method int String.length()>
	//* 115  252:ifeq            266
				s = "0.".concat(s);
	//  116  255:ldc2            #573 <String "0.">
	//  117  258:aload_0         
	//  118  259:invokevirtual   #530 <Method String String.concat(String)>
	//  119  262:astore_0        
			else
	//* 120  263:goto            277
				s = new String("0.");
	//  121  266:new             #29  <Class String>
	//  122  269:dup             
	//  123  270:ldc2            #573 <String "0.">
	//  124  273:invokespecial   #531 <Method void String(String)>
	//  125  276:astore_0        
			((Calendar) (gregoriancalendar)).set(14, (new BigDecimal(s)).movePointRight(3).intValue());
	//  126  277:aload           7
	//  127  279:bipush          14
	//  128  281:new             #575 <Class BigDecimal>
	//  129  284:dup             
	//  130  285:aload_0         
	//  131  286:invokespecial   #576 <Method void BigDecimal(String)>
	//  132  289:iconst_3        
	//  133  290:invokevirtual   #580 <Method BigDecimal BigDecimal.movePointRight(int)>
	//  134  293:invokevirtual   #583 <Method int BigDecimal.intValue()>
	//  135  296:invokevirtual   #586 <Method void Calendar.set(int, int)>
		}
		long l1 = ((Calendar) (gregoriancalendar)).getTimeInMillis();
	//  136  299:aload           7
	//  137  301:invokevirtual   #590 <Method long Calendar.getTimeInMillis()>
	//  138  304:lstore          5
		long l = l1;
	//  139  306:lload           5
	//  140  308:lstore_3        
		if(j != 0)
	//* 141  309:iload_1         
	//* 142  310:ifeq            323
			l = l1 - (long)(j * 60000);
	//  143  313:lload           5
	//  144  315:iload_1         
	//  145  316:ldc2            #591 <Int 60000>
	//  146  319:imul            
	//  147  320:i2l             
	//  148  321:lsub            
	//  149  322:lstore_3        
		return l;
	//  150  323:lload_3         
	//  151  324:lreturn         
	}

	public static int f(String s)
	{
		int l = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int String.length()>
	//    2    4:istore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		boolean flag;
		if(l <= 4)
	//*   5    7:iload_3         
	//*   6    8:iconst_4        
	//*   7    9:icmpgt          18
			flag = true;
	//    8   12:iconst_1        
	//    9   13:istore          4
		else
	//*  10   15:goto            21
			flag = false;
	//   11   18:iconst_0        
	//   12   19:istore          4
		bnf.a(flag);
	//   13   21:iload           4
	//   14   23:invokestatic    #596 <Method void bnf.a(boolean)>
		int k = 0;
	//   15   26:iconst_0        
	//   16   27:istore_2        
		for(; j < l; j++)
	//*  17   28:iload_1         
	//*  18   29:iload_3         
	//*  19   30:icmpge          51
			k = k << 8 | s.charAt(j);
	//   20   33:iload_2         
	//   21   34:bipush          8
	//   22   36:ishl            
	//   23   37:aload_0         
	//   24   38:iload_1         
	//   25   39:invokevirtual   #33  <Method char String.charAt(int)>
	//   26   42:ior             
	//   27   43:istore_2        

	//   28   44:iload_1         
	//   29   45:iconst_1        
	//   30   46:iadd            
	//   31   47:istore_1        
	//*  32   48:goto            28
		return k;
	//   33   51:iload_2         
	//   34   52:ireturn         
	}

	public static byte[] g(String s)
	{
		byte abyte0[] = new byte[s.length() / 2];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int String.length()>
	//    2    4:iconst_2        
	//    3    5:idiv            
	//    4    6:newarray        byte[]
	//    5    8:astore_3        
		for(int j = 0; j < abyte0.length; j++)
	//*   6    9:iconst_0        
	//*   7   10:istore_1        
	//*   8   11:iload_1         
	//*   9   12:aload_3         
	//*  10   13:arraylength     
	//*  11   14:icmpge          57
		{
			int k = j << 1;
	//   12   17:iload_1         
	//   13   18:iconst_1        
	//   14   19:ishl            
	//   15   20:istore_2        
			abyte0[j] = (byte)((Character.digit(s.charAt(k), 16) << 4) + Character.digit(s.charAt(k + 1), 16));
	//   16   21:aload_3         
	//   17   22:iload_1         
	//   18   23:aload_0         
	//   19   24:iload_2         
	//   20   25:invokevirtual   #33  <Method char String.charAt(int)>
	//   21   28:bipush          16
	//   22   30:invokestatic    #602 <Method int Character.digit(char, int)>
	//   23   33:iconst_4        
	//   24   34:ishl            
	//   25   35:aload_0         
	//   26   36:iload_2         
	//   27   37:iconst_1        
	//   28   38:iadd            
	//   29   39:invokevirtual   #33  <Method char String.charAt(int)>
	//   30   42:bipush          16
	//   31   44:invokestatic    #602 <Method int Character.digit(char, int)>
	//   32   47:iadd            
	//   33   48:int2byte        
	//   34   49:bastore         
		}

	//   35   50:iload_1         
	//   36   51:iconst_1        
	//   37   52:iadd            
	//   38   53:istore_1        
	//*  39   54:goto            11
		return abyte0;
	//   40   57:aload_3         
	//   41   58:areturn         
	}

	public static final int a;
	public static final String b;
	public static final String c;
	public static final String d;
	public static final String e;
	private static final Pattern f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
	private static final Pattern g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
	private static final Pattern h = Pattern.compile("%([A-Fa-f0-9]{2})");
	private static final int i[] = {
		0, 0x4c11db7, 0x9823b6e, 0xd4326d9, 0x130476dc, 0x17c56b6b, 0x1a864db2, 0x1e475005, 0x2608edb8, 0x22c9f00f, 
		0x2f8ad6d6, 0x2b4bcb61, 0x350c9b64, 0x31cd86d3, 0x3c8ea00a, 0x384fbdbd, 0x4c11db70, 0x48d0c6c7, 0x4593e01e, 0x4152fda9, 
		0x5f15adac, 0x5bd4b01b, 0x569796c2, 0x52568b75, 0x6a1936c8, 0x6ed82b7f, 0x639b0da6, 0x675a1011, 0x791d4014, 0x7ddc5da3, 
		0x709f7b7a, 0x745e66cd, 0x9823b6e0, 0x9ce2ab57, 0x91a18d8e, 0x95609039, 0x8b27c03c, 0x8fe6dd8b, 0x82a5fb52, 0x8664e6e5, 
		0xbe2b5b58, 0xbaea46ef, 0xb7a96036, 0xb3687d81, 0xad2f2d84, 0xa9ee3033, 0xa4ad16ea, 0xa06c0b5d, 0xd4326d90, 0xd0f37027, 
		0xddb056fe, 0xd9714b49, 0xc7361b4c, 0xc3f706fb, 0xceb42022, 0xca753d95, 0xf23a8028, 0xf6fb9d9f, 0xfbb8bb46, 0xff79a6f1, 
		0xe13ef6f4, 0xe5ffeb43, 0xe8bccd9a, 0xec7dd02d, 0x34867077, 0x30476dc0, 0x3d044b19, 0x39c556ae, 0x278206ab, 0x23431b1c, 
		0x2e003dc5, 0x2ac12072, 0x128e9dcf, 0x164f8078, 0x1b0ca6a1, 0x1fcdbb16, 0x18aeb13, 0x54bf6a4, 0x808d07d, 0xcc9cdca, 
		0x7897ab07, 0x7c56b6b0, 0x71159069, 0x75d48dde, 0x6b93dddb, 0x6f52c06c, 0x6211e6b5, 0x66d0fb02, 0x5e9f46bf, 0x5a5e5b08, 
		0x571d7dd1, 0x53dc6066, 0x4d9b3063, 0x495a2dd4, 0x44190b0d, 0x40d816ba, 0xaca5c697, 0xa864db20, 0xa527fdf9, 0xa1e6e04e, 
		0xbfa1b04b, 0xbb60adfc, 0xb6238b25, 0xb2e29692, 0x8aad2b2f, 0x8e6c3698, 0x832f1041, 0x87ee0df6, 0x99a95df3, 0x9d684044, 
		0x902b669d, 0x94ea7b2a, 0xe0b41de7, 0xe4750050, 0xe9362689, 0xedf73b3e, 0xf3b06b3b, 0xf771768c, 0xfa325055, 0xfef34de2, 
		0xc6bcf05f, 0xc27dede8, 0xcf3ecb31, 0xcbffd686, 0xd5b88683, 0xd1799b34, 0xdc3abded, 0xd8fba05a, 0x690ce0ee, 0x6dcdfd59, 
		0x608edb80, 0x644fc637, 0x7a089632, 0x7ec98b85, 0x738aad5c, 0x774bb0eb, 0x4f040d56, 0x4bc510e1, 0x46863638, 0x42472b8f, 
		0x5c007b8a, 0x58c1663d, 0x558240e4, 0x51435d53, 0x251d3b9e, 0x21dc2629, 0x2c9f00f0, 0x285e1d47, 0x36194d42, 0x32d850f5, 
		0x3f9b762c, 0x3b5a6b9b, 0x315d626, 0x7d4cb91, 0xa97ed48, 0xe56f0ff, 0x1011a0fa, 0x14d0bd4d, 0x19939b94, 0x1d528623, 
		0xf12f560e, 0xf5ee4bb9, 0xf8ad6d60, 0xfc6c70d7, 0xe22b20d2, 0xe6ea3d65, 0xeba91bbc, 0xef68060b, 0xd727bbb6, 0xd3e6a601, 
		0xdea580d8, 0xda649d6f, 0xc423cd6a, 0xc0e2d0dd, 0xcda1f604, 0xc960ebb3, 0xbd3e8d7e, 0xb9ff90c9, 0xb4bcb610, 0xb07daba7, 
		0xae3afba2, 0xaafbe615, 0xa7b8c0cc, 0xa379dd7b, 0x9b3660c6, 0x9ff77d71, 0x92b45ba8, 0x9675461f, 0x8832161a, 0x8cf30bad, 
		0x81b02d74, 0x857130c3, 0x5d8a9099, 0x594b8d2e, 0x5408abf7, 0x50c9b640, 0x4e8ee645, 0x4a4ffbf2, 0x470cdd2b, 0x43cdc09c, 
		0x7b827d21, 0x7f436096, 0x7200464f, 0x76c15bf8, 0x68860bfd, 0x6c47164a, 0x61043093, 0x65c52d24, 0x119b4be9, 0x155a565e, 
		0x18197087, 0x1cd86d30, 0x29f3d35, 0x65e2082, 0xb1d065b, 0xfdc1bec, 0x3793a651, 0x3352bbe6, 0x3e119d3f, 0x3ad08088, 
		0x2497d08d, 0x2056cd3a, 0x2d15ebe3, 0x29d4f654, 0xc5a92679, 0xc1683bce, 0xcc2b1d17, 0xc8ea00a0, 0xd6ad50a5, 0xd26c4d12, 
		0xdf2f6bcb, 0xdbee767c, 0xe3a1cbc1, 0xe760d676, 0xea23f0af, 0xeee2ed18, 0xf0a5bd1d, 0xf464a0aa, 0xf9278673, 0xfde69bc4, 
		0x89b8fd09, 0x8d79e0be, 0x803ac667, 0x84fbdbd0, 0x9abc8bd5, 0x9e7d9662, 0x933eb0bb, 0x97ffad0c, 0xafb010b1, 0xab710d06, 
		0xa6322bdf, 0xa2f33668, 0xbcb4666d, 0xb8757bda, 0xb5365d03, 0xb1f740b4
	};

	static 
	{
		int j;
		if(android.os.Build.VERSION.SDK_INT == 25 && android.os.Build.VERSION.CODENAME.charAt(0) == 'O')
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmpne          26
	//*   3    8:getstatic       #27  <Field String android.os.Build$VERSION.CODENAME>
	//*   4   11:iconst_0        
	//*   5   12:invokevirtual   #33  <Method char String.charAt(int)>
	//*   6   15:bipush          79
	//*   7   17:icmpne          26
			j = 26;
	//    8   20:bipush          26
	//    9   22:istore_0        
		else
	//*  10   23:goto            30
			j = android.os.Build.VERSION.SDK_INT;
	//   11   26:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//   12   29:istore_0        
		a = j;
	//   13   30:iload_0         
	//   14   31:putstatic       #35  <Field int a>
		b = Build.DEVICE;
	//   15   34:getstatic       #40  <Field String Build.DEVICE>
	//   16   37:putstatic       #42  <Field String b>
		c = Build.MANUFACTURER;
	//   17   40:getstatic       #45  <Field String Build.MANUFACTURER>
	//   18   43:putstatic       #47  <Field String c>
		d = Build.MODEL;
	//   19   46:getstatic       #50  <Field String Build.MODEL>
	//   20   49:putstatic       #52  <Field String d>
		String s = b;
	//   21   52:getstatic       #42  <Field String b>
	//   22   55:astore_1        
		String s1 = d;
	//   23   56:getstatic       #52  <Field String d>
	//   24   59:astore_2        
		String s2 = c;
	//   25   60:getstatic       #47  <Field String c>
	//   26   63:astore_3        
		j = a;
	//   27   64:getstatic       #35  <Field int a>
	//   28   67:istore_0        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 17 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   29   68:new             #54  <Class StringBuilder>
	//   30   71:dup             
	//   31   72:aload_1         
	//   32   73:invokestatic    #58  <Method String String.valueOf(Object)>
	//   33   76:invokevirtual   #62  <Method int String.length()>
	//   34   79:bipush          17
	//   35   81:iadd            
	//   36   82:aload_2         
	//   37   83:invokestatic    #58  <Method String String.valueOf(Object)>
	//   38   86:invokevirtual   #62  <Method int String.length()>
	//   39   89:iadd            
	//   40   90:aload_3         
	//   41   91:invokestatic    #58  <Method String String.valueOf(Object)>
	//   42   94:invokevirtual   #62  <Method int String.length()>
	//   43   97:iadd            
	//   44   98:invokespecial   #66  <Method void StringBuilder(int)>
	//   45  101:astore          4
		stringbuilder.append(s);
	//   46  103:aload           4
	//   47  105:aload_1         
	//   48  106:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   49  109:pop             
		stringbuilder.append(", ");
	//   50  110:aload           4
	//   51  112:ldc1            #72  <String ", ">
	//   52  114:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   53  117:pop             
		stringbuilder.append(s1);
	//   54  118:aload           4
	//   55  120:aload_2         
	//   56  121:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   57  124:pop             
		stringbuilder.append(", ");
	//   58  125:aload           4
	//   59  127:ldc1            #72  <String ", ">
	//   60  129:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   61  132:pop             
		stringbuilder.append(s2);
	//   62  133:aload           4
	//   63  135:aload_3         
	//   64  136:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   65  139:pop             
		stringbuilder.append(", ");
	//   66  140:aload           4
	//   67  142:ldc1            #72  <String ", ">
	//   68  144:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   69  147:pop             
		stringbuilder.append(j);
	//   70  148:aload           4
	//   71  150:iload_0         
	//   72  151:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   73  154:pop             
		e = stringbuilder.toString();
	//   74  155:aload           4
	//   75  157:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   76  160:putstatic       #81  <Field String e>
	//   77  163:ldc1            #83  <String "(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?">
	//   78  165:invokestatic    #89  <Method Pattern Pattern.compile(String)>
	//   79  168:putstatic       #91  <Field Pattern f>
	//   80  171:ldc1            #93  <String "^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$">
	//   81  173:invokestatic    #89  <Method Pattern Pattern.compile(String)>
	//   82  176:putstatic       #95  <Field Pattern g>
	//   83  179:ldc1            #97  <String "%([A-Fa-f0-9]{2})">
	//   84  181:invokestatic    #89  <Method Pattern Pattern.compile(String)>
	//   85  184:putstatic       #99  <Field Pattern h>
	//   86  187:sipush          256
	//   87  190:newarray        int[]
	//   88  192:dup             
	//   89  193:iconst_0        
	//   90  194:iconst_0        
	//   91  195:iastore         
	//   92  196:dup             
	//   93  197:iconst_1        
	//   94  198:ldc1            #100 <Int 0x4c11db7>
	//   95  200:iastore         
	//   96  201:dup             
	//   97  202:iconst_2        
	//   98  203:ldc1            #101 <Int 0x9823b6e>
	//   99  205:iastore         
	//  100  206:dup             
	//  101  207:iconst_3        
	//  102  208:ldc1            #102 <Int 0xd4326d9>
	//  103  210:iastore         
	//  104  211:dup             
	//  105  212:iconst_4        
	//  106  213:ldc1            #103 <Int 0x130476dc>
	//  107  215:iastore         
	//  108  216:dup             
	//  109  217:iconst_5        
	//  110  218:ldc1            #104 <Int 0x17c56b6b>
	//  111  220:iastore         
	//  112  221:dup             
	//  113  222:bipush          6
	//  114  224:ldc1            #105 <Int 0x1a864db2>
	//  115  226:iastore         
	//  116  227:dup             
	//  117  228:bipush          7
	//  118  230:ldc1            #106 <Int 0x1e475005>
	//  119  232:iastore         
	//  120  233:dup             
	//  121  234:bipush          8
	//  122  236:ldc1            #107 <Int 0x2608edb8>
	//  123  238:iastore         
	//  124  239:dup             
	//  125  240:bipush          9
	//  126  242:ldc1            #108 <Int 0x22c9f00f>
	//  127  244:iastore         
	//  128  245:dup             
	//  129  246:bipush          10
	//  130  248:ldc1            #109 <Int 0x2f8ad6d6>
	//  131  250:iastore         
	//  132  251:dup             
	//  133  252:bipush          11
	//  134  254:ldc1            #110 <Int 0x2b4bcb61>
	//  135  256:iastore         
	//  136  257:dup             
	//  137  258:bipush          12
	//  138  260:ldc1            #111 <Int 0x350c9b64>
	//  139  262:iastore         
	//  140  263:dup             
	//  141  264:bipush          13
	//  142  266:ldc1            #112 <Int 0x31cd86d3>
	//  143  268:iastore         
	//  144  269:dup             
	//  145  270:bipush          14
	//  146  272:ldc1            #113 <Int 0x3c8ea00a>
	//  147  274:iastore         
	//  148  275:dup             
	//  149  276:bipush          15
	//  150  278:ldc1            #114 <Int 0x384fbdbd>
	//  151  280:iastore         
	//  152  281:dup             
	//  153  282:bipush          16
	//  154  284:ldc1            #115 <Int 0x4c11db70>
	//  155  286:iastore         
	//  156  287:dup             
	//  157  288:bipush          17
	//  158  290:ldc1            #116 <Int 0x48d0c6c7>
	//  159  292:iastore         
	//  160  293:dup             
	//  161  294:bipush          18
	//  162  296:ldc1            #117 <Int 0x4593e01e>
	//  163  298:iastore         
	//  164  299:dup             
	//  165  300:bipush          19
	//  166  302:ldc1            #118 <Int 0x4152fda9>
	//  167  304:iastore         
	//  168  305:dup             
	//  169  306:bipush          20
	//  170  308:ldc1            #119 <Int 0x5f15adac>
	//  171  310:iastore         
	//  172  311:dup             
	//  173  312:bipush          21
	//  174  314:ldc1            #120 <Int 0x5bd4b01b>
	//  175  316:iastore         
	//  176  317:dup             
	//  177  318:bipush          22
	//  178  320:ldc1            #121 <Int 0x569796c2>
	//  179  322:iastore         
	//  180  323:dup             
	//  181  324:bipush          23
	//  182  326:ldc1            #122 <Int 0x52568b75>
	//  183  328:iastore         
	//  184  329:dup             
	//  185  330:bipush          24
	//  186  332:ldc1            #123 <Int 0x6a1936c8>
	//  187  334:iastore         
	//  188  335:dup             
	//  189  336:bipush          25
	//  190  338:ldc1            #124 <Int 0x6ed82b7f>
	//  191  340:iastore         
	//  192  341:dup             
	//  193  342:bipush          26
	//  194  344:ldc1            #125 <Int 0x639b0da6>
	//  195  346:iastore         
	//  196  347:dup             
	//  197  348:bipush          27
	//  198  350:ldc1            #126 <Int 0x675a1011>
	//  199  352:iastore         
	//  200  353:dup             
	//  201  354:bipush          28
	//  202  356:ldc1            #127 <Int 0x791d4014>
	//  203  358:iastore         
	//  204  359:dup             
	//  205  360:bipush          29
	//  206  362:ldc1            #128 <Int 0x7ddc5da3>
	//  207  364:iastore         
	//  208  365:dup             
	//  209  366:bipush          30
	//  210  368:ldc1            #129 <Int 0x709f7b7a>
	//  211  370:iastore         
	//  212  371:dup             
	//  213  372:bipush          31
	//  214  374:ldc1            #130 <Int 0x745e66cd>
	//  215  376:iastore         
	//  216  377:dup             
	//  217  378:bipush          32
	//  218  380:ldc1            #131 <Int 0x9823b6e0>
	//  219  382:iastore         
	//  220  383:dup             
	//  221  384:bipush          33
	//  222  386:ldc1            #132 <Int 0x9ce2ab57>
	//  223  388:iastore         
	//  224  389:dup             
	//  225  390:bipush          34
	//  226  392:ldc1            #133 <Int 0x91a18d8e>
	//  227  394:iastore         
	//  228  395:dup             
	//  229  396:bipush          35
	//  230  398:ldc1            #134 <Int 0x95609039>
	//  231  400:iastore         
	//  232  401:dup             
	//  233  402:bipush          36
	//  234  404:ldc1            #135 <Int 0x8b27c03c>
	//  235  406:iastore         
	//  236  407:dup             
	//  237  408:bipush          37
	//  238  410:ldc1            #136 <Int 0x8fe6dd8b>
	//  239  412:iastore         
	//  240  413:dup             
	//  241  414:bipush          38
	//  242  416:ldc1            #137 <Int 0x82a5fb52>
	//  243  418:iastore         
	//  244  419:dup             
	//  245  420:bipush          39
	//  246  422:ldc1            #138 <Int 0x8664e6e5>
	//  247  424:iastore         
	//  248  425:dup             
	//  249  426:bipush          40
	//  250  428:ldc1            #139 <Int 0xbe2b5b58>
	//  251  430:iastore         
	//  252  431:dup             
	//  253  432:bipush          41
	//  254  434:ldc1            #140 <Int 0xbaea46ef>
	//  255  436:iastore         
	//  256  437:dup             
	//  257  438:bipush          42
	//  258  440:ldc1            #141 <Int 0xb7a96036>
	//  259  442:iastore         
	//  260  443:dup             
	//  261  444:bipush          43
	//  262  446:ldc1            #142 <Int 0xb3687d81>
	//  263  448:iastore         
	//  264  449:dup             
	//  265  450:bipush          44
	//  266  452:ldc1            #143 <Int 0xad2f2d84>
	//  267  454:iastore         
	//  268  455:dup             
	//  269  456:bipush          45
	//  270  458:ldc1            #144 <Int 0xa9ee3033>
	//  271  460:iastore         
	//  272  461:dup             
	//  273  462:bipush          46
	//  274  464:ldc1            #145 <Int 0xa4ad16ea>
	//  275  466:iastore         
	//  276  467:dup             
	//  277  468:bipush          47
	//  278  470:ldc1            #146 <Int 0xa06c0b5d>
	//  279  472:iastore         
	//  280  473:dup             
	//  281  474:bipush          48
	//  282  476:ldc1            #147 <Int 0xd4326d90>
	//  283  478:iastore         
	//  284  479:dup             
	//  285  480:bipush          49
	//  286  482:ldc1            #148 <Int 0xd0f37027>
	//  287  484:iastore         
	//  288  485:dup             
	//  289  486:bipush          50
	//  290  488:ldc1            #149 <Int 0xddb056fe>
	//  291  490:iastore         
	//  292  491:dup             
	//  293  492:bipush          51
	//  294  494:ldc1            #150 <Int 0xd9714b49>
	//  295  496:iastore         
	//  296  497:dup             
	//  297  498:bipush          52
	//  298  500:ldc1            #151 <Int 0xc7361b4c>
	//  299  502:iastore         
	//  300  503:dup             
	//  301  504:bipush          53
	//  302  506:ldc1            #152 <Int 0xc3f706fb>
	//  303  508:iastore         
	//  304  509:dup             
	//  305  510:bipush          54
	//  306  512:ldc1            #153 <Int 0xceb42022>
	//  307  514:iastore         
	//  308  515:dup             
	//  309  516:bipush          55
	//  310  518:ldc1            #154 <Int 0xca753d95>
	//  311  520:iastore         
	//  312  521:dup             
	//  313  522:bipush          56
	//  314  524:ldc1            #155 <Int 0xf23a8028>
	//  315  526:iastore         
	//  316  527:dup             
	//  317  528:bipush          57
	//  318  530:ldc1            #156 <Int 0xf6fb9d9f>
	//  319  532:iastore         
	//  320  533:dup             
	//  321  534:bipush          58
	//  322  536:ldc1            #157 <Int 0xfbb8bb46>
	//  323  538:iastore         
	//  324  539:dup             
	//  325  540:bipush          59
	//  326  542:ldc1            #158 <Int 0xff79a6f1>
	//  327  544:iastore         
	//  328  545:dup             
	//  329  546:bipush          60
	//  330  548:ldc1            #159 <Int 0xe13ef6f4>
	//  331  550:iastore         
	//  332  551:dup             
	//  333  552:bipush          61
	//  334  554:ldc1            #160 <Int 0xe5ffeb43>
	//  335  556:iastore         
	//  336  557:dup             
	//  337  558:bipush          62
	//  338  560:ldc1            #161 <Int 0xe8bccd9a>
	//  339  562:iastore         
	//  340  563:dup             
	//  341  564:bipush          63
	//  342  566:ldc1            #162 <Int 0xec7dd02d>
	//  343  568:iastore         
	//  344  569:dup             
	//  345  570:bipush          64
	//  346  572:ldc1            #163 <Int 0x34867077>
	//  347  574:iastore         
	//  348  575:dup             
	//  349  576:bipush          65
	//  350  578:ldc1            #164 <Int 0x30476dc0>
	//  351  580:iastore         
	//  352  581:dup             
	//  353  582:bipush          66
	//  354  584:ldc1            #165 <Int 0x3d044b19>
	//  355  586:iastore         
	//  356  587:dup             
	//  357  588:bipush          67
	//  358  590:ldc1            #166 <Int 0x39c556ae>
	//  359  592:iastore         
	//  360  593:dup             
	//  361  594:bipush          68
	//  362  596:ldc1            #167 <Int 0x278206ab>
	//  363  598:iastore         
	//  364  599:dup             
	//  365  600:bipush          69
	//  366  602:ldc1            #168 <Int 0x23431b1c>
	//  367  604:iastore         
	//  368  605:dup             
	//  369  606:bipush          70
	//  370  608:ldc1            #169 <Int 0x2e003dc5>
	//  371  610:iastore         
	//  372  611:dup             
	//  373  612:bipush          71
	//  374  614:ldc1            #170 <Int 0x2ac12072>
	//  375  616:iastore         
	//  376  617:dup             
	//  377  618:bipush          72
	//  378  620:ldc1            #171 <Int 0x128e9dcf>
	//  379  622:iastore         
	//  380  623:dup             
	//  381  624:bipush          73
	//  382  626:ldc1            #172 <Int 0x164f8078>
	//  383  628:iastore         
	//  384  629:dup             
	//  385  630:bipush          74
	//  386  632:ldc1            #173 <Int 0x1b0ca6a1>
	//  387  634:iastore         
	//  388  635:dup             
	//  389  636:bipush          75
	//  390  638:ldc1            #174 <Int 0x1fcdbb16>
	//  391  640:iastore         
	//  392  641:dup             
	//  393  642:bipush          76
	//  394  644:ldc1            #175 <Int 0x18aeb13>
	//  395  646:iastore         
	//  396  647:dup             
	//  397  648:bipush          77
	//  398  650:ldc1            #176 <Int 0x54bf6a4>
	//  399  652:iastore         
	//  400  653:dup             
	//  401  654:bipush          78
	//  402  656:ldc1            #177 <Int 0x808d07d>
	//  403  658:iastore         
	//  404  659:dup             
	//  405  660:bipush          79
	//  406  662:ldc1            #178 <Int 0xcc9cdca>
	//  407  664:iastore         
	//  408  665:dup             
	//  409  666:bipush          80
	//  410  668:ldc1            #179 <Int 0x7897ab07>
	//  411  670:iastore         
	//  412  671:dup             
	//  413  672:bipush          81
	//  414  674:ldc1            #180 <Int 0x7c56b6b0>
	//  415  676:iastore         
	//  416  677:dup             
	//  417  678:bipush          82
	//  418  680:ldc1            #181 <Int 0x71159069>
	//  419  682:iastore         
	//  420  683:dup             
	//  421  684:bipush          83
	//  422  686:ldc1            #182 <Int 0x75d48dde>
	//  423  688:iastore         
	//  424  689:dup             
	//  425  690:bipush          84
	//  426  692:ldc1            #183 <Int 0x6b93dddb>
	//  427  694:iastore         
	//  428  695:dup             
	//  429  696:bipush          85
	//  430  698:ldc1            #184 <Int 0x6f52c06c>
	//  431  700:iastore         
	//  432  701:dup             
	//  433  702:bipush          86
	//  434  704:ldc1            #185 <Int 0x6211e6b5>
	//  435  706:iastore         
	//  436  707:dup             
	//  437  708:bipush          87
	//  438  710:ldc1            #186 <Int 0x66d0fb02>
	//  439  712:iastore         
	//  440  713:dup             
	//  441  714:bipush          88
	//  442  716:ldc1            #187 <Int 0x5e9f46bf>
	//  443  718:iastore         
	//  444  719:dup             
	//  445  720:bipush          89
	//  446  722:ldc1            #188 <Int 0x5a5e5b08>
	//  447  724:iastore         
	//  448  725:dup             
	//  449  726:bipush          90
	//  450  728:ldc1            #189 <Int 0x571d7dd1>
	//  451  730:iastore         
	//  452  731:dup             
	//  453  732:bipush          91
	//  454  734:ldc1            #190 <Int 0x53dc6066>
	//  455  736:iastore         
	//  456  737:dup             
	//  457  738:bipush          92
	//  458  740:ldc1            #191 <Int 0x4d9b3063>
	//  459  742:iastore         
	//  460  743:dup             
	//  461  744:bipush          93
	//  462  746:ldc1            #192 <Int 0x495a2dd4>
	//  463  748:iastore         
	//  464  749:dup             
	//  465  750:bipush          94
	//  466  752:ldc1            #193 <Int 0x44190b0d>
	//  467  754:iastore         
	//  468  755:dup             
	//  469  756:bipush          95
	//  470  758:ldc1            #194 <Int 0x40d816ba>
	//  471  760:iastore         
	//  472  761:dup             
	//  473  762:bipush          96
	//  474  764:ldc1            #195 <Int 0xaca5c697>
	//  475  766:iastore         
	//  476  767:dup             
	//  477  768:bipush          97
	//  478  770:ldc1            #196 <Int 0xa864db20>
	//  479  772:iastore         
	//  480  773:dup             
	//  481  774:bipush          98
	//  482  776:ldc1            #197 <Int 0xa527fdf9>
	//  483  778:iastore         
	//  484  779:dup             
	//  485  780:bipush          99
	//  486  782:ldc1            #198 <Int 0xa1e6e04e>
	//  487  784:iastore         
	//  488  785:dup             
	//  489  786:bipush          100
	//  490  788:ldc1            #199 <Int 0xbfa1b04b>
	//  491  790:iastore         
	//  492  791:dup             
	//  493  792:bipush          101
	//  494  794:ldc1            #200 <Int 0xbb60adfc>
	//  495  796:iastore         
	//  496  797:dup             
	//  497  798:bipush          102
	//  498  800:ldc1            #201 <Int 0xb6238b25>
	//  499  802:iastore         
	//  500  803:dup             
	//  501  804:bipush          103
	//  502  806:ldc1            #202 <Int 0xb2e29692>
	//  503  808:iastore         
	//  504  809:dup             
	//  505  810:bipush          104
	//  506  812:ldc1            #203 <Int 0x8aad2b2f>
	//  507  814:iastore         
	//  508  815:dup             
	//  509  816:bipush          105
	//  510  818:ldc1            #204 <Int 0x8e6c3698>
	//  511  820:iastore         
	//  512  821:dup             
	//  513  822:bipush          106
	//  514  824:ldc1            #205 <Int 0x832f1041>
	//  515  826:iastore         
	//  516  827:dup             
	//  517  828:bipush          107
	//  518  830:ldc1            #206 <Int 0x87ee0df6>
	//  519  832:iastore         
	//  520  833:dup             
	//  521  834:bipush          108
	//  522  836:ldc1            #207 <Int 0x99a95df3>
	//  523  838:iastore         
	//  524  839:dup             
	//  525  840:bipush          109
	//  526  842:ldc1            #208 <Int 0x9d684044>
	//  527  844:iastore         
	//  528  845:dup             
	//  529  846:bipush          110
	//  530  848:ldc1            #209 <Int 0x902b669d>
	//  531  850:iastore         
	//  532  851:dup             
	//  533  852:bipush          111
	//  534  854:ldc1            #210 <Int 0x94ea7b2a>
	//  535  856:iastore         
	//  536  857:dup             
	//  537  858:bipush          112
	//  538  860:ldc1            #211 <Int 0xe0b41de7>
	//  539  862:iastore         
	//  540  863:dup             
	//  541  864:bipush          113
	//  542  866:ldc1            #212 <Int 0xe4750050>
	//  543  868:iastore         
	//  544  869:dup             
	//  545  870:bipush          114
	//  546  872:ldc1            #213 <Int 0xe9362689>
	//  547  874:iastore         
	//  548  875:dup             
	//  549  876:bipush          115
	//  550  878:ldc1            #214 <Int 0xedf73b3e>
	//  551  880:iastore         
	//  552  881:dup             
	//  553  882:bipush          116
	//  554  884:ldc1            #215 <Int 0xf3b06b3b>
	//  555  886:iastore         
	//  556  887:dup             
	//  557  888:bipush          117
	//  558  890:ldc1            #216 <Int 0xf771768c>
	//  559  892:iastore         
	//  560  893:dup             
	//  561  894:bipush          118
	//  562  896:ldc1            #217 <Int 0xfa325055>
	//  563  898:iastore         
	//  564  899:dup             
	//  565  900:bipush          119
	//  566  902:ldc1            #218 <Int 0xfef34de2>
	//  567  904:iastore         
	//  568  905:dup             
	//  569  906:bipush          120
	//  570  908:ldc1            #219 <Int 0xc6bcf05f>
	//  571  910:iastore         
	//  572  911:dup             
	//  573  912:bipush          121
	//  574  914:ldc1            #220 <Int 0xc27dede8>
	//  575  916:iastore         
	//  576  917:dup             
	//  577  918:bipush          122
	//  578  920:ldc1            #221 <Int 0xcf3ecb31>
	//  579  922:iastore         
	//  580  923:dup             
	//  581  924:bipush          123
	//  582  926:ldc1            #222 <Int 0xcbffd686>
	//  583  928:iastore         
	//  584  929:dup             
	//  585  930:bipush          124
	//  586  932:ldc1            #223 <Int 0xd5b88683>
	//  587  934:iastore         
	//  588  935:dup             
	//  589  936:bipush          125
	//  590  938:ldc1            #224 <Int 0xd1799b34>
	//  591  940:iastore         
	//  592  941:dup             
	//  593  942:bipush          126
	//  594  944:ldc1            #225 <Int 0xdc3abded>
	//  595  946:iastore         
	//  596  947:dup             
	//  597  948:bipush          127
	//  598  950:ldc1            #226 <Int 0xd8fba05a>
	//  599  952:iastore         
	//  600  953:dup             
	//  601  954:sipush          128
	//  602  957:ldc1            #227 <Int 0x690ce0ee>
	//  603  959:iastore         
	//  604  960:dup             
	//  605  961:sipush          129
	//  606  964:ldc1            #228 <Int 0x6dcdfd59>
	//  607  966:iastore         
	//  608  967:dup             
	//  609  968:sipush          130
	//  610  971:ldc1            #229 <Int 0x608edb80>
	//  611  973:iastore         
	//  612  974:dup             
	//  613  975:sipush          131
	//  614  978:ldc1            #230 <Int 0x644fc637>
	//  615  980:iastore         
	//  616  981:dup             
	//  617  982:sipush          132
	//  618  985:ldc1            #231 <Int 0x7a089632>
	//  619  987:iastore         
	//  620  988:dup             
	//  621  989:sipush          133
	//  622  992:ldc1            #232 <Int 0x7ec98b85>
	//  623  994:iastore         
	//  624  995:dup             
	//  625  996:sipush          134
	//  626  999:ldc1            #233 <Int 0x738aad5c>
	//  627 1001:iastore         
	//  628 1002:dup             
	//  629 1003:sipush          135
	//  630 1006:ldc1            #234 <Int 0x774bb0eb>
	//  631 1008:iastore         
	//  632 1009:dup             
	//  633 1010:sipush          136
	//  634 1013:ldc1            #235 <Int 0x4f040d56>
	//  635 1015:iastore         
	//  636 1016:dup             
	//  637 1017:sipush          137
	//  638 1020:ldc1            #236 <Int 0x4bc510e1>
	//  639 1022:iastore         
	//  640 1023:dup             
	//  641 1024:sipush          138
	//  642 1027:ldc1            #237 <Int 0x46863638>
	//  643 1029:iastore         
	//  644 1030:dup             
	//  645 1031:sipush          139
	//  646 1034:ldc1            #238 <Int 0x42472b8f>
	//  647 1036:iastore         
	//  648 1037:dup             
	//  649 1038:sipush          140
	//  650 1041:ldc1            #239 <Int 0x5c007b8a>
	//  651 1043:iastore         
	//  652 1044:dup             
	//  653 1045:sipush          141
	//  654 1048:ldc1            #240 <Int 0x58c1663d>
	//  655 1050:iastore         
	//  656 1051:dup             
	//  657 1052:sipush          142
	//  658 1055:ldc1            #241 <Int 0x558240e4>
	//  659 1057:iastore         
	//  660 1058:dup             
	//  661 1059:sipush          143
	//  662 1062:ldc1            #242 <Int 0x51435d53>
	//  663 1064:iastore         
	//  664 1065:dup             
	//  665 1066:sipush          144
	//  666 1069:ldc1            #243 <Int 0x251d3b9e>
	//  667 1071:iastore         
	//  668 1072:dup             
	//  669 1073:sipush          145
	//  670 1076:ldc1            #244 <Int 0x21dc2629>
	//  671 1078:iastore         
	//  672 1079:dup             
	//  673 1080:sipush          146
	//  674 1083:ldc1            #245 <Int 0x2c9f00f0>
	//  675 1085:iastore         
	//  676 1086:dup             
	//  677 1087:sipush          147
	//  678 1090:ldc1            #246 <Int 0x285e1d47>
	//  679 1092:iastore         
	//  680 1093:dup             
	//  681 1094:sipush          148
	//  682 1097:ldc1            #247 <Int 0x36194d42>
	//  683 1099:iastore         
	//  684 1100:dup             
	//  685 1101:sipush          149
	//  686 1104:ldc1            #248 <Int 0x32d850f5>
	//  687 1106:iastore         
	//  688 1107:dup             
	//  689 1108:sipush          150
	//  690 1111:ldc1            #249 <Int 0x3f9b762c>
	//  691 1113:iastore         
	//  692 1114:dup             
	//  693 1115:sipush          151
	//  694 1118:ldc1            #250 <Int 0x3b5a6b9b>
	//  695 1120:iastore         
	//  696 1121:dup             
	//  697 1122:sipush          152
	//  698 1125:ldc1            #251 <Int 0x315d626>
	//  699 1127:iastore         
	//  700 1128:dup             
	//  701 1129:sipush          153
	//  702 1132:ldc1            #252 <Int 0x7d4cb91>
	//  703 1134:iastore         
	//  704 1135:dup             
	//  705 1136:sipush          154
	//  706 1139:ldc1            #253 <Int 0xa97ed48>
	//  707 1141:iastore         
	//  708 1142:dup             
	//  709 1143:sipush          155
	//  710 1146:ldc1            #254 <Int 0xe56f0ff>
	//  711 1148:iastore         
	//  712 1149:dup             
	//  713 1150:sipush          156
	//  714 1153:ldc1            #255 <Int 0x1011a0fa>
	//  715 1155:iastore         
	//  716 1156:dup             
	//  717 1157:sipush          157
	//  718 1160:ldc2            #256 <Int 0x14d0bd4d>
	//  719 1163:iastore         
	//  720 1164:dup             
	//  721 1165:sipush          158
	//  722 1168:ldc2            #257 <Int 0x19939b94>
	//  723 1171:iastore         
	//  724 1172:dup             
	//  725 1173:sipush          159
	//  726 1176:ldc2            #258 <Int 0x1d528623>
	//  727 1179:iastore         
	//  728 1180:dup             
	//  729 1181:sipush          160
	//  730 1184:ldc2            #259 <Int 0xf12f560e>
	//  731 1187:iastore         
	//  732 1188:dup             
	//  733 1189:sipush          161
	//  734 1192:ldc2            #260 <Int 0xf5ee4bb9>
	//  735 1195:iastore         
	//  736 1196:dup             
	//  737 1197:sipush          162
	//  738 1200:ldc2            #261 <Int 0xf8ad6d60>
	//  739 1203:iastore         
	//  740 1204:dup             
	//  741 1205:sipush          163
	//  742 1208:ldc2            #262 <Int 0xfc6c70d7>
	//  743 1211:iastore         
	//  744 1212:dup             
	//  745 1213:sipush          164
	//  746 1216:ldc2            #263 <Int 0xe22b20d2>
	//  747 1219:iastore         
	//  748 1220:dup             
	//  749 1221:sipush          165
	//  750 1224:ldc2            #264 <Int 0xe6ea3d65>
	//  751 1227:iastore         
	//  752 1228:dup             
	//  753 1229:sipush          166
	//  754 1232:ldc2            #265 <Int 0xeba91bbc>
	//  755 1235:iastore         
	//  756 1236:dup             
	//  757 1237:sipush          167
	//  758 1240:ldc2            #266 <Int 0xef68060b>
	//  759 1243:iastore         
	//  760 1244:dup             
	//  761 1245:sipush          168
	//  762 1248:ldc2            #267 <Int 0xd727bbb6>
	//  763 1251:iastore         
	//  764 1252:dup             
	//  765 1253:sipush          169
	//  766 1256:ldc2            #268 <Int 0xd3e6a601>
	//  767 1259:iastore         
	//  768 1260:dup             
	//  769 1261:sipush          170
	//  770 1264:ldc2            #269 <Int 0xdea580d8>
	//  771 1267:iastore         
	//  772 1268:dup             
	//  773 1269:sipush          171
	//  774 1272:ldc2            #270 <Int 0xda649d6f>
	//  775 1275:iastore         
	//  776 1276:dup             
	//  777 1277:sipush          172
	//  778 1280:ldc2            #271 <Int 0xc423cd6a>
	//  779 1283:iastore         
	//  780 1284:dup             
	//  781 1285:sipush          173
	//  782 1288:ldc2            #272 <Int 0xc0e2d0dd>
	//  783 1291:iastore         
	//  784 1292:dup             
	//  785 1293:sipush          174
	//  786 1296:ldc2            #273 <Int 0xcda1f604>
	//  787 1299:iastore         
	//  788 1300:dup             
	//  789 1301:sipush          175
	//  790 1304:ldc2            #274 <Int 0xc960ebb3>
	//  791 1307:iastore         
	//  792 1308:dup             
	//  793 1309:sipush          176
	//  794 1312:ldc2            #275 <Int 0xbd3e8d7e>
	//  795 1315:iastore         
	//  796 1316:dup             
	//  797 1317:sipush          177
	//  798 1320:ldc2            #276 <Int 0xb9ff90c9>
	//  799 1323:iastore         
	//  800 1324:dup             
	//  801 1325:sipush          178
	//  802 1328:ldc2            #277 <Int 0xb4bcb610>
	//  803 1331:iastore         
	//  804 1332:dup             
	//  805 1333:sipush          179
	//  806 1336:ldc2            #278 <Int 0xb07daba7>
	//  807 1339:iastore         
	//  808 1340:dup             
	//  809 1341:sipush          180
	//  810 1344:ldc2            #279 <Int 0xae3afba2>
	//  811 1347:iastore         
	//  812 1348:dup             
	//  813 1349:sipush          181
	//  814 1352:ldc2            #280 <Int 0xaafbe615>
	//  815 1355:iastore         
	//  816 1356:dup             
	//  817 1357:sipush          182
	//  818 1360:ldc2            #281 <Int 0xa7b8c0cc>
	//  819 1363:iastore         
	//  820 1364:dup             
	//  821 1365:sipush          183
	//  822 1368:ldc2            #282 <Int 0xa379dd7b>
	//  823 1371:iastore         
	//  824 1372:dup             
	//  825 1373:sipush          184
	//  826 1376:ldc2            #283 <Int 0x9b3660c6>
	//  827 1379:iastore         
	//  828 1380:dup             
	//  829 1381:sipush          185
	//  830 1384:ldc2            #284 <Int 0x9ff77d71>
	//  831 1387:iastore         
	//  832 1388:dup             
	//  833 1389:sipush          186
	//  834 1392:ldc2            #285 <Int 0x92b45ba8>
	//  835 1395:iastore         
	//  836 1396:dup             
	//  837 1397:sipush          187
	//  838 1400:ldc2            #286 <Int 0x9675461f>
	//  839 1403:iastore         
	//  840 1404:dup             
	//  841 1405:sipush          188
	//  842 1408:ldc2            #287 <Int 0x8832161a>
	//  843 1411:iastore         
	//  844 1412:dup             
	//  845 1413:sipush          189
	//  846 1416:ldc2            #288 <Int 0x8cf30bad>
	//  847 1419:iastore         
	//  848 1420:dup             
	//  849 1421:sipush          190
	//  850 1424:ldc2            #289 <Int 0x81b02d74>
	//  851 1427:iastore         
	//  852 1428:dup             
	//  853 1429:sipush          191
	//  854 1432:ldc2            #290 <Int 0x857130c3>
	//  855 1435:iastore         
	//  856 1436:dup             
	//  857 1437:sipush          192
	//  858 1440:ldc2            #291 <Int 0x5d8a9099>
	//  859 1443:iastore         
	//  860 1444:dup             
	//  861 1445:sipush          193
	//  862 1448:ldc2            #292 <Int 0x594b8d2e>
	//  863 1451:iastore         
	//  864 1452:dup             
	//  865 1453:sipush          194
	//  866 1456:ldc2            #293 <Int 0x5408abf7>
	//  867 1459:iastore         
	//  868 1460:dup             
	//  869 1461:sipush          195
	//  870 1464:ldc2            #294 <Int 0x50c9b640>
	//  871 1467:iastore         
	//  872 1468:dup             
	//  873 1469:sipush          196
	//  874 1472:ldc2            #295 <Int 0x4e8ee645>
	//  875 1475:iastore         
	//  876 1476:dup             
	//  877 1477:sipush          197
	//  878 1480:ldc2            #296 <Int 0x4a4ffbf2>
	//  879 1483:iastore         
	//  880 1484:dup             
	//  881 1485:sipush          198
	//  882 1488:ldc2            #297 <Int 0x470cdd2b>
	//  883 1491:iastore         
	//  884 1492:dup             
	//  885 1493:sipush          199
	//  886 1496:ldc2            #298 <Int 0x43cdc09c>
	//  887 1499:iastore         
	//  888 1500:dup             
	//  889 1501:sipush          200
	//  890 1504:ldc2            #299 <Int 0x7b827d21>
	//  891 1507:iastore         
	//  892 1508:dup             
	//  893 1509:sipush          201
	//  894 1512:ldc2            #300 <Int 0x7f436096>
	//  895 1515:iastore         
	//  896 1516:dup             
	//  897 1517:sipush          202
	//  898 1520:ldc2            #301 <Int 0x7200464f>
	//  899 1523:iastore         
	//  900 1524:dup             
	//  901 1525:sipush          203
	//  902 1528:ldc2            #302 <Int 0x76c15bf8>
	//  903 1531:iastore         
	//  904 1532:dup             
	//  905 1533:sipush          204
	//  906 1536:ldc2            #303 <Int 0x68860bfd>
	//  907 1539:iastore         
	//  908 1540:dup             
	//  909 1541:sipush          205
	//  910 1544:ldc2            #304 <Int 0x6c47164a>
	//  911 1547:iastore         
	//  912 1548:dup             
	//  913 1549:sipush          206
	//  914 1552:ldc2            #305 <Int 0x61043093>
	//  915 1555:iastore         
	//  916 1556:dup             
	//  917 1557:sipush          207
	//  918 1560:ldc2            #306 <Int 0x65c52d24>
	//  919 1563:iastore         
	//  920 1564:dup             
	//  921 1565:sipush          208
	//  922 1568:ldc2            #307 <Int 0x119b4be9>
	//  923 1571:iastore         
	//  924 1572:dup             
	//  925 1573:sipush          209
	//  926 1576:ldc2            #308 <Int 0x155a565e>
	//  927 1579:iastore         
	//  928 1580:dup             
	//  929 1581:sipush          210
	//  930 1584:ldc2            #309 <Int 0x18197087>
	//  931 1587:iastore         
	//  932 1588:dup             
	//  933 1589:sipush          211
	//  934 1592:ldc2            #310 <Int 0x1cd86d30>
	//  935 1595:iastore         
	//  936 1596:dup             
	//  937 1597:sipush          212
	//  938 1600:ldc2            #311 <Int 0x29f3d35>
	//  939 1603:iastore         
	//  940 1604:dup             
	//  941 1605:sipush          213
	//  942 1608:ldc2            #312 <Int 0x65e2082>
	//  943 1611:iastore         
	//  944 1612:dup             
	//  945 1613:sipush          214
	//  946 1616:ldc2            #313 <Int 0xb1d065b>
	//  947 1619:iastore         
	//  948 1620:dup             
	//  949 1621:sipush          215
	//  950 1624:ldc2            #314 <Int 0xfdc1bec>
	//  951 1627:iastore         
	//  952 1628:dup             
	//  953 1629:sipush          216
	//  954 1632:ldc2            #315 <Int 0x3793a651>
	//  955 1635:iastore         
	//  956 1636:dup             
	//  957 1637:sipush          217
	//  958 1640:ldc2            #316 <Int 0x3352bbe6>
	//  959 1643:iastore         
	//  960 1644:dup             
	//  961 1645:sipush          218
	//  962 1648:ldc2            #317 <Int 0x3e119d3f>
	//  963 1651:iastore         
	//  964 1652:dup             
	//  965 1653:sipush          219
	//  966 1656:ldc2            #318 <Int 0x3ad08088>
	//  967 1659:iastore         
	//  968 1660:dup             
	//  969 1661:sipush          220
	//  970 1664:ldc2            #319 <Int 0x2497d08d>
	//  971 1667:iastore         
	//  972 1668:dup             
	//  973 1669:sipush          221
	//  974 1672:ldc2            #320 <Int 0x2056cd3a>
	//  975 1675:iastore         
	//  976 1676:dup             
	//  977 1677:sipush          222
	//  978 1680:ldc2            #321 <Int 0x2d15ebe3>
	//  979 1683:iastore         
	//  980 1684:dup             
	//  981 1685:sipush          223
	//  982 1688:ldc2            #322 <Int 0x29d4f654>
	//  983 1691:iastore         
	//  984 1692:dup             
	//  985 1693:sipush          224
	//  986 1696:ldc2            #323 <Int 0xc5a92679>
	//  987 1699:iastore         
	//  988 1700:dup             
	//  989 1701:sipush          225
	//  990 1704:ldc2            #324 <Int 0xc1683bce>
	//  991 1707:iastore         
	//  992 1708:dup             
	//  993 1709:sipush          226
	//  994 1712:ldc2            #325 <Int 0xcc2b1d17>
	//  995 1715:iastore         
	//  996 1716:dup             
	//  997 1717:sipush          227
	//  998 1720:ldc2            #326 <Int 0xc8ea00a0>
	//  999 1723:iastore         
	// 1000 1724:dup             
	// 1001 1725:sipush          228
	// 1002 1728:ldc2            #327 <Int 0xd6ad50a5>
	// 1003 1731:iastore         
	// 1004 1732:dup             
	// 1005 1733:sipush          229
	// 1006 1736:ldc2            #328 <Int 0xd26c4d12>
	// 1007 1739:iastore         
	// 1008 1740:dup             
	// 1009 1741:sipush          230
	// 1010 1744:ldc2            #329 <Int 0xdf2f6bcb>
	// 1011 1747:iastore         
	// 1012 1748:dup             
	// 1013 1749:sipush          231
	// 1014 1752:ldc2            #330 <Int 0xdbee767c>
	// 1015 1755:iastore         
	// 1016 1756:dup             
	// 1017 1757:sipush          232
	// 1018 1760:ldc2            #331 <Int 0xe3a1cbc1>
	// 1019 1763:iastore         
	// 1020 1764:dup             
	// 1021 1765:sipush          233
	// 1022 1768:ldc2            #332 <Int 0xe760d676>
	// 1023 1771:iastore         
	// 1024 1772:dup             
	// 1025 1773:sipush          234
	// 1026 1776:ldc2            #333 <Int 0xea23f0af>
	// 1027 1779:iastore         
	// 1028 1780:dup             
	// 1029 1781:sipush          235
	// 1030 1784:ldc2            #334 <Int 0xeee2ed18>
	// 1031 1787:iastore         
	// 1032 1788:dup             
	// 1033 1789:sipush          236
	// 1034 1792:ldc2            #335 <Int 0xf0a5bd1d>
	// 1035 1795:iastore         
	// 1036 1796:dup             
	// 1037 1797:sipush          237
	// 1038 1800:ldc2            #336 <Int 0xf464a0aa>
	// 1039 1803:iastore         
	// 1040 1804:dup             
	// 1041 1805:sipush          238
	// 1042 1808:ldc2            #337 <Int 0xf9278673>
	// 1043 1811:iastore         
	// 1044 1812:dup             
	// 1045 1813:sipush          239
	// 1046 1816:ldc2            #338 <Int 0xfde69bc4>
	// 1047 1819:iastore         
	// 1048 1820:dup             
	// 1049 1821:sipush          240
	// 1050 1824:ldc2            #339 <Int 0x89b8fd09>
	// 1051 1827:iastore         
	// 1052 1828:dup             
	// 1053 1829:sipush          241
	// 1054 1832:ldc2            #340 <Int 0x8d79e0be>
	// 1055 1835:iastore         
	// 1056 1836:dup             
	// 1057 1837:sipush          242
	// 1058 1840:ldc2            #341 <Int 0x803ac667>
	// 1059 1843:iastore         
	// 1060 1844:dup             
	// 1061 1845:sipush          243
	// 1062 1848:ldc2            #342 <Int 0x84fbdbd0>
	// 1063 1851:iastore         
	// 1064 1852:dup             
	// 1065 1853:sipush          244
	// 1066 1856:ldc2            #343 <Int 0x9abc8bd5>
	// 1067 1859:iastore         
	// 1068 1860:dup             
	// 1069 1861:sipush          245
	// 1070 1864:ldc2            #344 <Int 0x9e7d9662>
	// 1071 1867:iastore         
	// 1072 1868:dup             
	// 1073 1869:sipush          246
	// 1074 1872:ldc2            #345 <Int 0x933eb0bb>
	// 1075 1875:iastore         
	// 1076 1876:dup             
	// 1077 1877:sipush          247
	// 1078 1880:ldc2            #346 <Int 0x97ffad0c>
	// 1079 1883:iastore         
	// 1080 1884:dup             
	// 1081 1885:sipush          248
	// 1082 1888:ldc2            #347 <Int 0xafb010b1>
	// 1083 1891:iastore         
	// 1084 1892:dup             
	// 1085 1893:sipush          249
	// 1086 1896:ldc2            #348 <Int 0xab710d06>
	// 1087 1899:iastore         
	// 1088 1900:dup             
	// 1089 1901:sipush          250
	// 1090 1904:ldc2            #349 <Int 0xa6322bdf>
	// 1091 1907:iastore         
	// 1092 1908:dup             
	// 1093 1909:sipush          251
	// 1094 1912:ldc2            #350 <Int 0xa2f33668>
	// 1095 1915:iastore         
	// 1096 1916:dup             
	// 1097 1917:sipush          252
	// 1098 1920:ldc2            #351 <Int 0xbcb4666d>
	// 1099 1923:iastore         
	// 1100 1924:dup             
	// 1101 1925:sipush          253
	// 1102 1928:ldc2            #352 <Int 0xb8757bda>
	// 1103 1931:iastore         
	// 1104 1932:dup             
	// 1105 1933:sipush          254
	// 1106 1936:ldc2            #353 <Int 0xb5365d03>
	// 1107 1939:iastore         
	// 1108 1940:dup             
	// 1109 1941:sipush          255
	// 1110 1944:ldc2            #354 <Int 0xb1f740b4>
	// 1111 1947:iastore         
	// 1112 1948:putstatic       #356 <Field int[] i>
	//*1113 1951:return          
	}
}
