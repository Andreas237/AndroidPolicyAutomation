// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			asu, awf, asm, aqq, 
//			aty, arh

public final class avg
{

	private avg()
	{
		this(0, new int[8], new Object[8], true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:bipush          8
	//    3    4:newarray        int[]
	//    4    6:bipush          8
	//    5    8:anewarray       Object[]
	//    6   11:iconst_1        
	//    7   12:invokespecial   #21  <Method void avg(int, int[], Object[], boolean)>
	//    8   15:return          
	}

	private avg(int i, int ai[], Object aobj[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		e = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #28  <Field int e>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #30  <Field int b>
		c = ai;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #32  <Field int[] c>
		d = aobj;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #34  <Field Object[] d>
		f = flag;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #36  <Field boolean f>
	//   17   30:return          
	}

	public static avg a()
	{
		return a;
	//    0    0:getstatic       #23  <Field avg a>
	//    1    3:areturn         
	}

	static avg a(avg avg1, avg avg2)
	{
		int i = avg1.b + avg2.b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int b>
	//    2    4:aload_1         
	//    3    5:getfield        #30  <Field int b>
	//    4    8:iadd            
	//    5    9:istore_2        
		int ai[] = Arrays.copyOf(avg1.c, i);
	//    6   10:aload_0         
	//    7   11:getfield        #32  <Field int[] c>
	//    8   14:iload_2         
	//    9   15:invokestatic    #44  <Method int[] Arrays.copyOf(int[], int)>
	//   10   18:astore_3        
		System.arraycopy(((Object) (avg2.c)), 0, ((Object) (ai)), avg1.b, avg2.b);
	//   11   19:aload_1         
	//   12   20:getfield        #32  <Field int[] c>
	//   13   23:iconst_0        
	//   14   24:aload_3         
	//   15   25:aload_0         
	//   16   26:getfield        #30  <Field int b>
	//   17   29:aload_1         
	//   18   30:getfield        #30  <Field int b>
	//   19   33:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		Object aobj[] = Arrays.copyOf(avg1.d, i);
	//   20   36:aload_0         
	//   21   37:getfield        #34  <Field Object[] d>
	//   22   40:iload_2         
	//   23   41:invokestatic    #53  <Method Object[] Arrays.copyOf(Object[], int)>
	//   24   44:astore          4
		System.arraycopy(((Object) (avg2.d)), 0, ((Object) (aobj)), avg1.b, avg2.b);
	//   25   46:aload_1         
	//   26   47:getfield        #34  <Field Object[] d>
	//   27   50:iconst_0        
	//   28   51:aload           4
	//   29   53:aload_0         
	//   30   54:getfield        #30  <Field int b>
	//   31   57:aload_1         
	//   32   58:getfield        #30  <Field int b>
	//   33   61:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		return new avg(i, ai, aobj, true);
	//   34   64:new             #2   <Class avg>
	//   35   67:dup             
	//   36   68:iload_2         
	//   37   69:aload_3         
	//   38   70:aload           4
	//   39   72:iconst_1        
	//   40   73:invokespecial   #21  <Method void avg(int, int[], Object[], boolean)>
	//   41   76:areturn         
	}

	private static void a(int i, Object obj, awf awf1)
	{
		int j = i >>> 3;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iushr           
	//    3    3:istore_3        
		i &= 7;
	//    4    4:iload_0         
	//    5    5:bipush          7
	//    6    7:iand            
	//    7    8:istore_0        
		if(i != 5)
	//*   8    9:iload_0         
	//*   9   10:iconst_5        
	//*  10   11:icmpeq          155
		{
			switch(i)
	//*  11   14:iload_0         
			{
	//*  12   15:tableswitch     0 3: default 44
	//	               0 140
	//	               1 125
	//	               2 113
	//	               3 55
			default:
				throw new RuntimeException(((Throwable) (asu.f())));
	//   13   44:new             #56  <Class RuntimeException>
	//   14   47:dup             
	//   15   48:invokestatic    #61  <Method asv asu.f()>
	//   16   51:invokespecial   #64  <Method void RuntimeException(Throwable)>
	//   17   54:athrow          

			case 3: // '\003'
				if(awf1.a() == asm.j)
	//*  18   55:aload_2         
	//*  19   56:invokeinterface #69  <Method int awf.a()>
	//*  20   61:getstatic       #74  <Field int asm.j>
	//*  21   64:icmpne          90
				{
					awf1.a(j);
	//   22   67:aload_2         
	//   23   68:iload_3         
	//   24   69:invokeinterface #77  <Method void awf.a(int)>
					((avg)obj).b(awf1);
	//   25   74:aload_1         
	//   26   75:checkcast       #2   <Class avg>
	//   27   78:aload_2         
	//   28   79:invokevirtual   #80  <Method void b(awf)>
					awf1.b(j);
	//   29   82:aload_2         
	//   30   83:iload_3         
	//   31   84:invokeinterface #82  <Method void awf.b(int)>
					return;
	//   32   89:return          
				} else
				{
					awf1.b(j);
	//   33   90:aload_2         
	//   34   91:iload_3         
	//   35   92:invokeinterface #82  <Method void awf.b(int)>
					((avg)obj).b(awf1);
	//   36   97:aload_1         
	//   37   98:checkcast       #2   <Class avg>
	//   38  101:aload_2         
	//   39  102:invokevirtual   #80  <Method void b(awf)>
					awf1.a(j);
	//   40  105:aload_2         
	//   41  106:iload_3         
	//   42  107:invokeinterface #77  <Method void awf.a(int)>
					return;
	//   43  112:return          
				}

			case 2: // '\002'
				awf1.a(j, (aqq)obj);
	//   44  113:aload_2         
	//   45  114:iload_3         
	//   46  115:aload_1         
	//   47  116:checkcast       #84  <Class aqq>
	//   48  119:invokeinterface #87  <Method void awf.a(int, aqq)>
				return;
	//   49  124:return          

			case 1: // '\001'
				awf1.d(j, ((Long)obj).longValue());
	//   50  125:aload_2         
	//   51  126:iload_3         
	//   52  127:aload_1         
	//   53  128:checkcast       #89  <Class Long>
	//   54  131:invokevirtual   #93  <Method long Long.longValue()>
	//   55  134:invokeinterface #96  <Method void awf.d(int, long)>
				return;
	//   56  139:return          

			case 0: // '\0'
				awf1.a(j, ((Long)obj).longValue());
	//   57  140:aload_2         
	//   58  141:iload_3         
	//   59  142:aload_1         
	//   60  143:checkcast       #89  <Class Long>
	//   61  146:invokevirtual   #93  <Method long Long.longValue()>
	//   62  149:invokeinterface #98  <Method void awf.a(int, long)>
				return;
	//   63  154:return          
			}
		} else
		{
			awf1.d(j, ((Integer)obj).intValue());
	//   64  155:aload_2         
	//   65  156:iload_3         
	//   66  157:aload_1         
	//   67  158:checkcast       #100 <Class Integer>
	//   68  161:invokevirtual   #103 <Method int Integer.intValue()>
	//   69  164:invokeinterface #106 <Method void awf.d(int, int)>
			return;
	//   70  169:return          
		}
	}

	static avg b()
	{
		return new avg();
	//    0    0:new             #2   <Class avg>
	//    1    3:dup             
	//    2    4:invokespecial   #107 <Method void avg()>
	//    3    7:areturn         
	}

	final void a(int i, Object obj)
	{
		if(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean f>
	//*   2    4:ifeq            98
		{
			int j = b;
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field int b>
	//    5   11:istore_3        
			if(j == c.length)
	//*   6   12:iload_3         
	//*   7   13:aload_0         
	//*   8   14:getfield        #32  <Field int[] c>
	//*   9   17:arraylength     
	//*  10   18:icmpne          67
			{
				if(j < 4)
	//*  11   21:iload_3         
	//*  12   22:iconst_4        
	//*  13   23:icmpge          32
					j = 8;
	//   14   26:bipush          8
	//   15   28:istore_3        
				else
	//*  16   29:goto            36
					j >>= 1;
	//   17   32:iload_3         
	//   18   33:iconst_1        
	//   19   34:ishr            
	//   20   35:istore_3        
				j = b + j;
	//   21   36:aload_0         
	//   22   37:getfield        #30  <Field int b>
	//   23   40:iload_3         
	//   24   41:iadd            
	//   25   42:istore_3        
				c = Arrays.copyOf(c, j);
	//   26   43:aload_0         
	//   27   44:aload_0         
	//   28   45:getfield        #32  <Field int[] c>
	//   29   48:iload_3         
	//   30   49:invokestatic    #44  <Method int[] Arrays.copyOf(int[], int)>
	//   31   52:putfield        #32  <Field int[] c>
				d = Arrays.copyOf(d, j);
	//   32   55:aload_0         
	//   33   56:aload_0         
	//   34   57:getfield        #34  <Field Object[] d>
	//   35   60:iload_3         
	//   36   61:invokestatic    #53  <Method Object[] Arrays.copyOf(Object[], int)>
	//   37   64:putfield        #34  <Field Object[] d>
			}
			int ai[] = c;
	//   38   67:aload_0         
	//   39   68:getfield        #32  <Field int[] c>
	//   40   71:astore          4
			j = b;
	//   41   73:aload_0         
	//   42   74:getfield        #30  <Field int b>
	//   43   77:istore_3        
			ai[j] = i;
	//   44   78:aload           4
	//   45   80:iload_3         
	//   46   81:iload_1         
	//   47   82:iastore         
			d[j] = obj;
	//   48   83:aload_0         
	//   49   84:getfield        #34  <Field Object[] d>
	//   50   87:iload_3         
	//   51   88:aload_2         
	//   52   89:aastore         
			b = j + 1;
	//   53   90:aload_0         
	//   54   91:iload_3         
	//   55   92:iconst_1        
	//   56   93:iadd            
	//   57   94:putfield        #30  <Field int b>
			return;
	//   58   97:return          
		} else
		{
			throw new UnsupportedOperationException();
	//   59   98:new             #110 <Class UnsupportedOperationException>
	//   60  101:dup             
	//   61  102:invokespecial   #111 <Method void UnsupportedOperationException()>
	//   62  105:athrow          
		}
	}

	final void a(awf awf1)
	{
		if(awf1.a() == asm.k)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #69  <Method int awf.a()>
	//*   2    6:getstatic       #114 <Field int asm.k>
	//*   3    9:icmpne          51
		{
			for(int i = b - 1; i >= 0; i--)
	//*   4   12:aload_0         
	//*   5   13:getfield        #30  <Field int b>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_2        
	//*   9   19:iload_2         
	//*  10   20:iflt            50
				awf1.a(c[i] >>> 3, d[i]);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field int[] c>
	//   14   28:iload_2         
	//   15   29:iaload          
	//   16   30:iconst_3        
	//   17   31:iushr           
	//   18   32:aload_0         
	//   19   33:getfield        #34  <Field Object[] d>
	//   20   36:iload_2         
	//   21   37:aaload          
	//   22   38:invokeinterface #116 <Method void awf.a(int, Object)>

	//   23   43:iload_2         
	//   24   44:iconst_1        
	//   25   45:isub            
	//   26   46:istore_2        
	//*  27   47:goto            19
			return;
	//   28   50:return          
		}
		for(int j = 0; j < b; j++)
	//*  29   51:iconst_0        
	//*  30   52:istore_2        
	//*  31   53:iload_2         
	//*  32   54:aload_0         
	//*  33   55:getfield        #30  <Field int b>
	//*  34   58:icmpge          88
			awf1.a(c[j] >>> 3, d[j]);
	//   35   61:aload_1         
	//   36   62:aload_0         
	//   37   63:getfield        #32  <Field int[] c>
	//   38   66:iload_2         
	//   39   67:iaload          
	//   40   68:iconst_3        
	//   41   69:iushr           
	//   42   70:aload_0         
	//   43   71:getfield        #34  <Field Object[] d>
	//   44   74:iload_2         
	//   45   75:aaload          
	//   46   76:invokeinterface #116 <Method void awf.a(int, Object)>

	//   47   81:iload_2         
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:istore_2        
	//*  51   85:goto            53
	//   52   88:return          
	}

	final void a(StringBuilder stringbuilder, int i)
	{
		for(int j = 0; j < b; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field int b>
	//*   5    7:icmpge          39
			aty.a(stringbuilder, i, String.valueOf(c[j] >>> 3), d[j]);
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #32  <Field int[] c>
	//   10   16:iload_3         
	//   11   17:iaload          
	//   12   18:iconst_3        
	//   13   19:iushr           
	//   14   20:invokestatic    #123 <Method String String.valueOf(int)>
	//   15   23:aload_0         
	//   16   24:getfield        #34  <Field Object[] d>
	//   17   27:iload_3         
	//   18   28:aaload          
	//   19   29:invokestatic    #128 <Method void aty.a(StringBuilder, int, String, Object)>

	//   20   32:iload_3         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_3        
	//*  24   36:goto            2
	//   25   39:return          
	}

	public final void b(awf awf1)
	{
		if(b == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field int b>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(awf1.a() == asm.j)
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #69  <Method int awf.a()>
	//*   6   14:getstatic       #74  <Field int asm.j>
	//*   7   17:icmpne          54
		{
			for(int i = 0; i < b; i++)
	//*   8   20:iconst_0        
	//*   9   21:istore_2        
	//*  10   22:iload_2         
	//*  11   23:aload_0         
	//*  12   24:getfield        #30  <Field int b>
	//*  13   27:icmpge          53
				a(c[i], d[i], awf1);
	//   14   30:aload_0         
	//   15   31:getfield        #32  <Field int[] c>
	//   16   34:iload_2         
	//   17   35:iaload          
	//   18   36:aload_0         
	//   19   37:getfield        #34  <Field Object[] d>
	//   20   40:iload_2         
	//   21   41:aaload          
	//   22   42:aload_1         
	//   23   43:invokestatic    #130 <Method void a(int, Object, awf)>

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
	//*  28   50:goto            22
			return;
	//   29   53:return          
		}
		for(int j = b - 1; j >= 0; j--)
	//*  30   54:aload_0         
	//*  31   55:getfield        #30  <Field int b>
	//*  32   58:iconst_1        
	//*  33   59:isub            
	//*  34   60:istore_2        
	//*  35   61:iload_2         
	//*  36   62:iflt            88
			a(c[j], d[j], awf1);
	//   37   65:aload_0         
	//   38   66:getfield        #32  <Field int[] c>
	//   39   69:iload_2         
	//   40   70:iaload          
	//   41   71:aload_0         
	//   42   72:getfield        #34  <Field Object[] d>
	//   43   75:iload_2         
	//   44   76:aaload          
	//   45   77:aload_1         
	//   46   78:invokestatic    #130 <Method void a(int, Object, awf)>

	//   47   81:iload_2         
	//   48   82:iconst_1        
	//   49   83:isub            
	//   50   84:istore_2        
	//*  51   85:goto            61
	//   52   88:return          
	}

	public final void c()
	{
		f = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #36  <Field boolean f>
	//    3    5:return          
	}

	public final int d()
	{
		int i = e;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int e>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_1        
		int j = 0;
	//   10   14:iconst_0        
	//   11   15:istore_2        
		for(; i < b; i++)
	//*  12   16:iload_1         
	//*  13   17:aload_0         
	//*  14   18:getfield        #30  <Field int b>
	//*  15   21:icmpge          54
			j += arh.d(c[i] >>> 3, (aqq)d[i]);
	//   16   24:iload_2         
	//   17   25:aload_0         
	//   18   26:getfield        #32  <Field int[] c>
	//   19   29:iload_1         
	//   20   30:iaload          
	//   21   31:iconst_3        
	//   22   32:iushr           
	//   23   33:aload_0         
	//   24   34:getfield        #34  <Field Object[] d>
	//   25   37:iload_1         
	//   26   38:aaload          
	//   27   39:checkcast       #84  <Class aqq>
	//   28   42:invokestatic    #135 <Method int arh.d(int, aqq)>
	//   29   45:iadd            
	//   30   46:istore_2        

	//   31   47:iload_1         
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:istore_1        
	//*  35   51:goto            16
		e = j;
	//   36   54:aload_0         
	//   37   55:iload_2         
	//   38   56:putfield        #28  <Field int e>
		return j;
	//   39   59:iload_2         
	//   40   60:ireturn         
	}

	public final int e()
	{
		int i = e;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int e>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int j = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		i = 0;
	//   10   14:iconst_0        
	//   11   15:istore_1        
		for(; j < b; j++)
	//*  12   16:iload_2         
	//*  13   17:aload_0         
	//*  14   18:getfield        #30  <Field int b>
	//*  15   21:icmpge          209
		{
			int l = c[j];
	//   16   24:aload_0         
	//   17   25:getfield        #32  <Field int[] c>
	//   18   28:iload_2         
	//   19   29:iaload          
	//   20   30:istore          4
			int k = l >>> 3;
	//   21   32:iload           4
	//   22   34:iconst_3        
	//   23   35:iushr           
	//   24   36:istore_3        
			l &= 7;
	//   25   37:iload           4
	//   26   39:bipush          7
	//   27   41:iand            
	//   28   42:istore          4
			if(l != 5)
	//*  29   44:iload           4
	//*  30   46:iconst_5        
	//*  31   47:icmpeq          183
				switch(l)
	//*  32   50:iload           4
				{
	//*  33   52:tableswitch     0 3: default 84
	//	               0 161
	//	               1 139
	//	               2 120
	//	               3 95
				default:
					throw new IllegalStateException(((Throwable) (asu.f())));
	//   34   84:new             #137 <Class IllegalStateException>
	//   35   87:dup             
	//   36   88:invokestatic    #61  <Method asv asu.f()>
	//   37   91:invokespecial   #138 <Method void IllegalStateException(Throwable)>
	//   38   94:athrow          

				case 3: // '\003'
					i += (arh.e(k) << 1) + ((avg)d[j]).e();
	//   39   95:iload_1         
	//   40   96:iload_3         
	//   41   97:invokestatic    #141 <Method int arh.e(int)>
	//   42  100:iconst_1        
	//   43  101:ishl            
	//   44  102:aload_0         
	//   45  103:getfield        #34  <Field Object[] d>
	//   46  106:iload_2         
	//   47  107:aaload          
	//   48  108:checkcast       #2   <Class avg>
	//   49  111:invokevirtual   #143 <Method int e()>
	//   50  114:iadd            
	//   51  115:iadd            
	//   52  116:istore_1        
					break;

	//*  53  117:goto            202
				case 2: // '\002'
					i += arh.c(k, (aqq)d[j]);
	//   54  120:iload_1         
	//   55  121:iload_3         
	//   56  122:aload_0         
	//   57  123:getfield        #34  <Field Object[] d>
	//   58  126:iload_2         
	//   59  127:aaload          
	//   60  128:checkcast       #84  <Class aqq>
	//   61  131:invokestatic    #145 <Method int arh.c(int, aqq)>
	//   62  134:iadd            
	//   63  135:istore_1        
					break;

	//*  64  136:goto            202
				case 1: // '\001'
					i += arh.g(k, ((Long)d[j]).longValue());
	//   65  139:iload_1         
	//   66  140:iload_3         
	//   67  141:aload_0         
	//   68  142:getfield        #34  <Field Object[] d>
	//   69  145:iload_2         
	//   70  146:aaload          
	//   71  147:checkcast       #89  <Class Long>
	//   72  150:invokevirtual   #93  <Method long Long.longValue()>
	//   73  153:invokestatic    #149 <Method int arh.g(int, long)>
	//   74  156:iadd            
	//   75  157:istore_1        
					break;

	//*  76  158:goto            202
				case 0: // '\0'
					i += arh.e(k, ((Long)d[j]).longValue());
	//   77  161:iload_1         
	//   78  162:iload_3         
	//   79  163:aload_0         
	//   80  164:getfield        #34  <Field Object[] d>
	//   81  167:iload_2         
	//   82  168:aaload          
	//   83  169:checkcast       #89  <Class Long>
	//   84  172:invokevirtual   #93  <Method long Long.longValue()>
	//   85  175:invokestatic    #151 <Method int arh.e(int, long)>
	//   86  178:iadd            
	//   87  179:istore_1        
					break;
				}
			else
	//*  88  180:goto            202
				i += arh.i(k, ((Integer)d[j]).intValue());
	//   89  183:iload_1         
	//   90  184:iload_3         
	//   91  185:aload_0         
	//   92  186:getfield        #34  <Field Object[] d>
	//   93  189:iload_2         
	//   94  190:aaload          
	//   95  191:checkcast       #100 <Class Integer>
	//   96  194:invokevirtual   #103 <Method int Integer.intValue()>
	//   97  197:invokestatic    #155 <Method int arh.i(int, int)>
	//   98  200:iadd            
	//   99  201:istore_1        
		}

	//  100  202:iload_2         
	//  101  203:iconst_1        
	//  102  204:iadd            
	//  103  205:istore_2        
	//* 104  206:goto            16
		e = i;
	//  105  209:aload_0         
	//  106  210:iload_1         
	//  107  211:putfield        #28  <Field int e>
		return i;
	//  108  214:iload_1         
	//  109  215:ireturn         
	}

	public final boolean equals(Object obj)
	{
label0:
		{
			int i;
label1:
			{
				if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
					return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
				if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
					return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
				if(!(obj instanceof avg))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class avg>
	//*  11   17:ifne            22
					return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
				obj = ((Object) ((avg)obj));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class avg>
	//   16   26:astore_1        
				int j = b;
	//   17   27:aload_0         
	//   18   28:getfield        #30  <Field int b>
	//   19   31:istore_3        
				if(j != ((avg) (obj)).b)
					break label0;
	//   20   32:iload_3         
	//   21   33:aload_1         
	//   22   34:getfield        #30  <Field int b>
	//   23   37:icmpne          146
				int ai[] = c;
	//   24   40:aload_0         
	//   25   41:getfield        #32  <Field int[] c>
	//   26   44:astore          4
				int ai1[] = ((avg) (obj)).c;
	//   27   46:aload_1         
	//   28   47:getfield        #32  <Field int[] c>
	//   29   50:astore          5
				i = 0;
	//   30   52:iconst_0        
	//   31   53:istore_2        
				do
				{
					if(i >= j)
						break;
	//   32   54:iload_2         
	//   33   55:iload_3         
	//   34   56:icmpge          82
					if(ai[i] != ai1[i])
	//*  35   59:aload           4
	//*  36   61:iload_2         
	//*  37   62:iaload          
	//*  38   63:aload           5
	//*  39   65:iload_2         
	//*  40   66:iaload          
	//*  41   67:icmpeq          75
					{
						i = 0;
	//   42   70:iconst_0        
	//   43   71:istore_2        
						break label1;
	//   44   72:goto            84
					}
					i++;
	//   45   75:iload_2         
	//   46   76:iconst_1        
	//   47   77:iadd            
	//   48   78:istore_2        
				} while(true);
	//   49   79:goto            54
				i = 1;
	//   50   82:iconst_1        
	//   51   83:istore_2        
			}
label2:
			{
				if(i == 0)
					break label0;
	//   52   84:iload_2         
	//   53   85:ifeq            146
				Object aobj[] = d;
	//   54   88:aload_0         
	//   55   89:getfield        #34  <Field Object[] d>
	//   56   92:astore          4
				obj = ((Object) (((avg) (obj)).d));
	//   57   94:aload_1         
	//   58   95:getfield        #34  <Field Object[] d>
	//   59   98:astore_1        
				int k = b;
	//   60   99:aload_0         
	//   61  100:getfield        #30  <Field int b>
	//   62  103:istore_3        
				i = 0;
	//   63  104:iconst_0        
	//   64  105:istore_2        
				do
				{
					if(i >= k)
						break;
	//   65  106:iload_2         
	//   66  107:iload_3         
	//   67  108:icmpge          136
					if(!aobj[i].equals(((Object) (obj[i]))))
	//*  68  111:aload           4
	//*  69  113:iload_2         
	//*  70  114:aaload          
	//*  71  115:aload_1         
	//*  72  116:iload_2         
	//*  73  117:aaload          
	//*  74  118:invokevirtual   #159 <Method boolean Object.equals(Object)>
	//*  75  121:ifne            129
					{
						i = 0;
	//   76  124:iconst_0        
	//   77  125:istore_2        
						break label2;
	//   78  126:goto            138
					}
					i++;
	//   79  129:iload_2         
	//   80  130:iconst_1        
	//   81  131:iadd            
	//   82  132:istore_2        
				} while(true);
	//   83  133:goto            106
				i = 1;
	//   84  136:iconst_1        
	//   85  137:istore_2        
			}
			return i != 0;
	//   86  138:iload_2         
	//   87  139:ifne            144
	//   88  142:iconst_0        
	//   89  143:ireturn         
	//   90  144:iconst_1        
	//   91  145:ireturn         
		}
		return false;
	//   92  146:iconst_0        
	//   93  147:ireturn         
	}

	public final int hashCode()
	{
		int i1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int b>
	//    2    4:istore          5
		int ai[] = c;
	//    3    6:aload_0         
	//    4    7:getfield        #32  <Field int[] c>
	//    5   10:astore          7
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          4
		int l = 17;
	//    8   15:bipush          17
	//    9   17:istore_3        
		int j = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		int i = 17;
	//   12   20:bipush          17
	//   13   22:istore_1        
		for(; j < i1; j++)
	//*  14   23:iload_2         
	//*  15   24:iload           5
	//*  16   26:icmpge          46
			i = i * 31 + ai[j];
	//   17   29:iload_1         
	//   18   30:bipush          31
	//   19   32:imul            
	//   20   33:aload           7
	//   21   35:iload_2         
	//   22   36:iaload          
	//   23   37:iadd            
	//   24   38:istore_1        

	//   25   39:iload_2         
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:istore_2        
	//*  29   43:goto            23
		ai = ((int []) (d));
	//   30   46:aload_0         
	//   31   47:getfield        #34  <Field Object[] d>
	//   32   50:astore          7
		int j1 = b;
	//   33   52:aload_0         
	//   34   53:getfield        #30  <Field int b>
	//   35   56:istore          6
		for(int k = ((int) (flag)); k < j1; k++)
	//*  36   58:iload           4
	//*  37   60:istore_2        
	//*  38   61:iload_2         
	//*  39   62:iload           6
	//*  40   64:icmpge          87
			l = l * 31 + ai[k].hashCode();
	//   41   67:iload_3         
	//   42   68:bipush          31
	//   43   70:imul            
	//   44   71:aload           7
	//   45   73:iload_2         
	//   46   74:aaload          
	//   47   75:invokevirtual   #162 <Method int Object.hashCode()>
	//   48   78:iadd            
	//   49   79:istore_3        

	//   50   80:iload_2         
	//   51   81:iconst_1        
	//   52   82:iadd            
	//   53   83:istore_2        
	//*  54   84:goto            61
		return ((i1 + 527) * 31 + i) * 31 + l;
	//   55   87:iload           5
	//   56   89:sipush          527
	//   57   92:iadd            
	//   58   93:bipush          31
	//   59   95:imul            
	//   60   96:iload_1         
	//   61   97:iadd            
	//   62   98:bipush          31
	//   63  100:imul            
	//   64  101:iload_3         
	//   65  102:iadd            
	//   66  103:ireturn         
	}

	private static final avg a = new avg(0, new int[0], new Object[0], false);
	private int b;
	private int c[];
	private Object d[];
	private int e;
	private boolean f;

	static 
	{
	//    0    0:new             #2   <Class avg>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:newarray        int[]
	//    5    8:iconst_0        
	//    6    9:anewarray       Object[]
	//    7   12:iconst_0        
	//    8   13:invokespecial   #21  <Method void avg(int, int[], Object[], boolean)>
	//    9   16:putstatic       #23  <Field avg a>
	//*  10   19:return          
	}
}
