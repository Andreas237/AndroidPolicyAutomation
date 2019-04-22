// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			w, t, f, p, 
//			q, s

public abstract class u extends w
{

	public transient u(t at[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void w()>
		a = new t.a[at.length];
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:anewarray       t.a[]
	//    6   10:putfield        #24  <Field t$a[] a>
		for(int i = 0; i < at.length; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:icmpge          42
			a[i] = at[i].a();
	//   13   21:aload_0         
	//   14   22:getfield        #24  <Field t$a[] a>
	//   15   25:iload_2         
	//   16   26:aload_1         
	//   17   27:iload_2         
	//   18   28:aaload          
	//   19   29:invokeinterface #29  <Method t$a t.a()>
	//   20   34:aastore         

	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_2        
	//*  25   39:goto            15
	//   26   42:return          
	}

	private void a(t.a a1)
		throws f
	{
		try
		{
			a1.b();
	//    0    0:aload_1         
	//    1    1:invokeinterface #37  <Method void t$a.b()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(t.a a1)
	//*   3    7:astore_1        
		{
			throw new f(((Throwable) (a1)));
	//    4    8:new             #33  <Class f>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #40  <Method void f(Throwable)>
	//    8   16:athrow          
		}
	}

	private long b(long l)
		throws f
	{
		long l1 = d.b(e);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field t$a d>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int e>
	//    4    8:invokeinterface #49  <Method long t$a.b(int)>
	//    5   13:lstore_3        
		if(l1 != 0x0L)
	//*   6   14:lload_3         
	//*   7   15:ldc2w           #50  <Long 0x0L>
	//*   8   18:lcmp            
	//*   9   19:ifeq            29
		{
			a(l1);
	//   10   22:aload_0         
	//   11   23:lload_3         
	//   12   24:invokevirtual   #54  <Method void a(long)>
			return l1;
	//   13   27:lload_3         
	//   14   28:lreturn         
		} else
		{
			return l;
	//   15   29:lload_1         
	//   16   30:lreturn         
		}
	}

	protected final int a(long l, q q1, s s1)
	{
		return d.a(e, l, q1, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field t$a d>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int e>
	//    4    8:lload_1         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokeinterface #58  <Method int t$a.a(int, long, q, s)>
	//    8   17:ireturn         
	}

	protected void a(int i, long l, boolean flag)
		throws f
	{
		l = e(l);
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:invokevirtual   #61  <Method long e(long)>
	//    3    5:lstore_2        
		d = a[b[i]];
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field t$a[] a>
	//    7   11:aload_0         
	//    8   12:getfield        #63  <Field int[] b>
	//    9   15:iload_1         
	//   10   16:iaload          
	//   11   17:aaload          
	//   12   18:putfield        #44  <Field t$a d>
		e = c[i];
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #65  <Field int[] c>
	//   16   26:iload_1         
	//   17   27:iaload          
	//   18   28:putfield        #46  <Field int e>
		d.a(e, l);
	//   19   31:aload_0         
	//   20   32:getfield        #44  <Field t$a d>
	//   21   35:aload_0         
	//   22   36:getfield        #46  <Field int e>
	//   23   39:lload_2         
	//   24   40:invokeinterface #68  <Method void t$a.a(int, long)>
		a(l);
	//   25   45:aload_0         
	//   26   46:lload_2         
	//   27   47:invokevirtual   #54  <Method void a(long)>
	//   28   50:return          
	}

	protected abstract void a(long l)
		throws f;

	protected abstract void a(long l, long l1, boolean flag)
		throws f;

	protected abstract boolean a(p p1)
		throws n.b;

	protected final p b(int i)
	{
		return a[b[i]].a(c[i]);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field t$a[] a>
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field int[] b>
	//    4    8:iload_1         
	//    5    9:iaload          
	//    6   10:aaload          
	//    7   11:aload_0         
	//    8   12:getfield        #65  <Field int[] c>
	//    9   15:iload_1         
	//   10   16:iaload          
	//   11   17:invokeinterface #75  <Method p t$a.a(int)>
	//   12   22:areturn         
	}

	protected final void b(long l, long l1)
		throws f
	{
		l = e(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #61  <Method long e(long)>
	//    3    5:lstore_1        
		boolean flag = d.b(e, l);
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field t$a d>
	//    6   10:aload_0         
	//    7   11:getfield        #46  <Field int e>
	//    8   14:lload_1         
	//    9   15:invokeinterface #79  <Method boolean t$a.b(int, long)>
	//   10   20:istore          5
		a(b(l), l1, flag);
	//   11   22:aload_0         
	//   12   23:aload_0         
	//   13   24:lload_1         
	//   14   25:invokespecial   #81  <Method long b(long)>
	//   15   28:lload_3         
	//   16   29:iload           5
	//   17   31:invokevirtual   #83  <Method void a(long, long, boolean)>
	//   18   34:return          
	}

	protected final boolean c(long l)
		throws f
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = true;
	//    2    2:iconst_1        
	//    3    3:istore          4
		do
		{
			t.a aa[] = a;
	//    4    5:aload_0         
	//    5    6:getfield        #24  <Field t$a[] a>
	//    6    9:astore          12
			if(i >= aa.length)
				break;
	//    7   11:iload_3         
	//    8   12:aload           12
	//    9   14:arraylength     
	//   10   15:icmpge          40
			flag &= aa[i].a(l);
	//   11   18:iload           4
	//   12   20:aload           12
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:lload_1         
	//   16   25:invokeinterface #86  <Method boolean t$a.a(long)>
	//   17   30:iand            
	//   18   31:istore          4
			i++;
	//   19   33:iload_3         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_3        
		} while(true);
	//   23   37:goto            5
		if(!flag)
	//*  24   40:iload           4
	//*  25   42:ifne            47
			return false;
	//   26   45:iconst_0        
	//   27   46:ireturn         
		i = 0;
	//   28   47:iconst_0        
	//   29   48:istore_3        
		int j = 0;
	//   30   49:iconst_0        
	//   31   50:istore          4
		t.a aa1[];
		do
		{
			aa1 = a;
	//   32   52:aload_0         
	//   33   53:getfield        #24  <Field t$a[] a>
	//   34   56:astore          14
			if(i >= aa1.length)
				break;
	//   35   58:iload_3         
	//   36   59:aload           14
	//   37   61:arraylength     
	//   38   62:icmpge          86
			j += aa1[i].c();
	//   39   65:iload           4
	//   40   67:aload           14
	//   41   69:iload_3         
	//   42   70:aaload          
	//   43   71:invokeinterface #89  <Method int t$a.c()>
	//   44   76:iadd            
	//   45   77:istore          4
			i++;
	//   46   79:iload_3         
	//   47   80:iconst_1        
	//   48   81:iadd            
	//   49   82:istore_3        
		} while(true);
	//   50   83:goto            52
		Object obj = ((Object) (new int[j]));
	//   51   86:iload           4
	//   52   88:newarray        int[]
	//   53   90:astore          12
		int ai[] = new int[j];
	//   54   92:iload           4
	//   55   94:newarray        int[]
	//   56   96:astore          13
		int j1 = aa1.length;
	//   57   98:aload           14
	//   58  100:arraylength     
	//   59  101:istore          7
		l = 0L;
	//   60  103:lconst_0        
	//   61  104:lstore_1        
		j = 0;
	//   62  105:iconst_0        
	//   63  106:istore          4
		i = 0;
	//   64  108:iconst_0        
	//   65  109:istore_3        
		for(; j < j1; j++)
	//*  66  110:iload           4
	//*  67  112:iload           7
	//*  68  114:icmpge          289
		{
			t.a a1 = a[j];
	//   69  117:aload_0         
	//   70  118:getfield        #24  <Field t$a[] a>
	//   71  121:iload           4
	//   72  123:aaload          
	//   73  124:astore          14
			int k1 = a1.c();
	//   74  126:aload           14
	//   75  128:invokeinterface #89  <Method int t$a.c()>
	//   76  133:istore          8
			int k = 0;
	//   77  135:iconst_0        
	//   78  136:istore          5
			while(k < k1) 
	//*  79  138:iload           5
	//*  80  140:iload           8
	//*  81  142:icmpge          280
			{
				p p1 = a1.a(k);
	//   82  145:aload           14
	//   83  147:iload           5
	//   84  149:invokeinterface #75  <Method p t$a.a(int)>
	//   85  154:astore          15
				int i1;
				long l1;
				boolean flag1;
				try
				{
					flag1 = a(p1);
	//   86  156:aload_0         
	//   87  157:aload           15
	//   88  159:invokevirtual   #91  <Method boolean a(p)>
	//   89  162:istore          11
				}
	//*  90  164:lload_1         
	//*  91  165:lstore          9
	//*  92  167:iload_3         
	//*  93  168:istore          6
	//*  94  170:iload           11
	//*  95  172:ifeq            253
	//*  96  175:aload           12
	//*  97  177:iload_3         
	//*  98  178:iload           4
	//*  99  180:iastore         
	//* 100  181:aload           13
	//* 101  183:iload_3         
	//* 102  184:iload           5
	//* 103  186:iastore         
	//* 104  187:iload_3         
	//* 105  188:iconst_1        
	//* 106  189:iadd            
	//* 107  190:istore          6
	//* 108  192:lload_1         
	//* 109  193:ldc2w           #92  <Long -1L>
	//* 110  196:lcmp            
	//* 111  197:ifne            206
	//* 112  200:lload_1         
	//* 113  201:lstore          9
	//* 114  203:goto            253
	//* 115  206:aload           15
	//* 116  208:getfield        #97  <Field long p.e>
	//* 117  211:lstore          9
	//* 118  213:lload           9
	//* 119  215:ldc2w           #92  <Long -1L>
	//* 120  218:lcmp            
	//* 121  219:ifne            230
	//* 122  222:ldc2w           #92  <Long -1L>
	//* 123  225:lstore          9
	//* 124  227:goto            253
	//* 125  230:lload           9
	//* 126  232:ldc2w           #98  <Long -2L>
	//* 127  235:lcmp            
	//* 128  236:ifne            245
	//* 129  239:lload_1         
	//* 130  240:lstore          9
	//* 131  242:goto            253
	//* 132  245:lload_1         
	//* 133  246:lload           9
	//* 134  248:invokestatic    #105 <Method long Math.max(long, long)>
	//* 135  251:lstore          9
	//* 136  253:iload           5
	//* 137  255:iconst_1        
	//* 138  256:iadd            
	//* 139  257:istore          5
	//* 140  259:lload           9
	//* 141  261:lstore_1        
	//* 142  262:iload           6
	//* 143  264:istore_3        
	//* 144  265:goto            138
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//* 145  268:astore          12
				{
					throw new f(((Throwable) (obj)));
	//  146  270:new             #33  <Class f>
	//  147  273:dup             
	//  148  274:aload           12
	//  149  276:invokespecial   #40  <Method void f(Throwable)>
	//  150  279:athrow          
				}
				l1 = l;
				i1 = i;
				if(flag1)
				{
					obj[i] = j;
					ai[i] = k;
					i1 = i + 1;
					if(l == -1L)
					{
						l1 = l;
					} else
					{
						l1 = p1.e;
						if(l1 == -1L)
							l1 = -1L;
						else
						if(l1 == -2L)
							l1 = l;
						else
							l1 = Math.max(l, l1);
					}
				}
				k++;
				l = l1;
				i = i1;
			}
		}

	//  151  280:iload           4
	//  152  282:iconst_1        
	//  153  283:iadd            
	//  154  284:istore          4
	//* 155  286:goto            110
		f = l;
	//  156  289:aload_0         
	//  157  290:lload_1         
	//  158  291:putfield        #107 <Field long f>
		b = Arrays.copyOf(((int []) (obj)), i);
	//  159  294:aload_0         
	//  160  295:aload           12
	//  161  297:iload_3         
	//  162  298:invokestatic    #113 <Method int[] Arrays.copyOf(int[], int)>
	//  163  301:putfield        #63  <Field int[] b>
		c = Arrays.copyOf(ai, i);
	//  164  304:aload_0         
	//  165  305:aload           13
	//  166  307:iload_3         
	//  167  308:invokestatic    #113 <Method int[] Arrays.copyOf(int[], int)>
	//  168  311:putfield        #65  <Field int[] c>
		return true;
	//  169  314:iconst_1        
	//  170  315:ireturn         
	}

	protected void d(long l)
		throws f
	{
		l = e(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #61  <Method long e(long)>
	//    3    5:lstore_1        
		d.b(l);
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field t$a d>
	//    6   10:lload_1         
	//    7   11:invokeinterface #115 <Method void t$a.b(long)>
		b(l);
	//    8   16:aload_0         
	//    9   17:lload_1         
	//   10   18:invokespecial   #81  <Method long b(long)>
	//   11   21:pop2            
	//   12   22:return          
	}

	protected long e(long l)
	{
		return l;
	//    0    0:lload_1         
	//    1    1:lreturn         
	}

	protected void g()
		throws f
	{
		d.c(e);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field t$a d>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int e>
	//    4    8:invokeinterface #119 <Method void t$a.c(int)>
		d = null;
	//    5   13:aload_0         
	//    6   14:aconst_null     
	//    7   15:putfield        #44  <Field t$a d>
	//    8   18:return          
	}

	protected long q()
	{
		return d.d();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field t$a d>
	//    2    4:invokeinterface #123 <Method long t$a.d()>
	//    3    9:lreturn         
	}

	protected long r()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field long f>
	//    2    4:lreturn         
	}

	protected void s()
		throws f
	{
		t.a a1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field t$a d>
	//    2    4:astore_3        
		if(a1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
		{
			a(a1);
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokespecial   #127 <Method void a(t$a)>
			return;
	//    8   14:return          
		}
		int j = a.length;
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field t$a[] a>
	//   11   19:arraylength     
	//   12   20:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   21:iconst_0        
	//*  14   22:istore_1        
	//*  15   23:iload_1         
	//*  16   24:iload_2         
	//*  17   25:icmpge          45
			a(a[i]);
	//   18   28:aload_0         
	//   19   29:aload_0         
	//   20   30:getfield        #24  <Field t$a[] a>
	//   21   33:iload_1         
	//   22   34:aaload          
	//   23   35:invokespecial   #127 <Method void a(t$a)>

	//   24   38:iload_1         
	//   25   39:iconst_1        
	//   26   40:iadd            
	//   27   41:istore_1        
	//*  28   42:goto            23
	//   29   45:return          
	}

	protected void t()
		throws f
	{
		int j = a.length;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field t$a[] a>
	//    2    4:arraylength     
	//    3    5:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:iload_2         
	//*   8   10:icmpge          31
			a[i].e();
	//    9   13:aload_0         
	//   10   14:getfield        #24  <Field t$a[] a>
	//   11   17:iload_1         
	//   12   18:aaload          
	//   13   19:invokeinterface #130 <Method void t$a.e()>

	//   14   24:iload_1         
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:istore_1        
	//*  18   28:goto            8
	//   19   31:return          
	}

	protected final int u()
	{
		return c.length;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int[] c>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	private final t.a a[];
	private int b[];
	private int c[];
	private t.a d;
	private int e;
	private long f;
}
