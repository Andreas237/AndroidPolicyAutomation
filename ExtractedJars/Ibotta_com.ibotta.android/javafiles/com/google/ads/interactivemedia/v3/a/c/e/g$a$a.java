// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c.e;


// Referenced classes of package com.google.ads.interactivemedia.v3.a.c.e:
//			g

private static final class g$a$a
{

	private boolean a(g$a$a g$a$a1)
	{
		boolean flag;
label0:
		{
			flag = a;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean a>
	//    2    4:istore          4
			boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          5
			if(flag)
	//*   5    9:iload           4
	//*   6   11:ifeq            278
			{
				flag = flag1;
	//    7   14:iload           5
	//    8   16:istore          4
				if(!g$a$a1.a)
					break label0;
	//    9   18:aload_1         
	//   10   19:getfield        #37  <Field boolean a>
	//   11   22:ifeq            281
				flag = flag1;
	//   12   25:iload           5
	//   13   27:istore          4
				if(f != g$a$a1.f)
					break label0;
	//   14   29:aload_0         
	//   15   30:getfield        #39  <Field int f>
	//   16   33:aload_1         
	//   17   34:getfield        #39  <Field int f>
	//   18   37:icmpne          281
				flag = flag1;
	//   19   40:iload           5
	//   20   42:istore          4
				if(g != g$a$a1.g)
					break label0;
	//   21   44:aload_0         
	//   22   45:getfield        #41  <Field int g>
	//   23   48:aload_1         
	//   24   49:getfield        #41  <Field int g>
	//   25   52:icmpne          281
				flag = flag1;
	//   26   55:iload           5
	//   27   57:istore          4
				if(h != g$a$a1.h)
					break label0;
	//   28   59:aload_0         
	//   29   60:getfield        #43  <Field boolean h>
	//   30   63:aload_1         
	//   31   64:getfield        #43  <Field boolean h>
	//   32   67:icmpne          281
				if(i && g$a$a1.i)
	//*  33   70:aload_0         
	//*  34   71:getfield        #45  <Field boolean i>
	//*  35   74:ifeq            99
	//*  36   77:aload_1         
	//*  37   78:getfield        #45  <Field boolean i>
	//*  38   81:ifeq            99
				{
					flag = flag1;
	//   39   84:iload           5
	//   40   86:istore          4
					if(j != g$a$a1.j)
						break label0;
	//   41   88:aload_0         
	//   42   89:getfield        #47  <Field boolean j>
	//   43   92:aload_1         
	//   44   93:getfield        #47  <Field boolean j>
	//   45   96:icmpne          281
				}
				int i1 = d;
	//   46   99:aload_0         
	//   47  100:getfield        #49  <Field int d>
	//   48  103:istore_2        
				int j1 = g$a$a1.d;
	//   49  104:aload_1         
	//   50  105:getfield        #49  <Field int d>
	//   51  108:istore_3        
				if(i1 != j1)
	//*  52  109:iload_2         
	//*  53  110:iload_3         
	//*  54  111:icmpeq          130
				{
					flag = flag1;
	//   55  114:iload           5
	//   56  116:istore          4
					if(i1 == 0)
						break label0;
	//   57  118:iload_2         
	//   58  119:ifeq            281
					flag = flag1;
	//   59  122:iload           5
	//   60  124:istore          4
					if(j1 == 0)
						break label0;
	//   61  126:iload_3         
	//   62  127:ifeq            281
				}
				if(c.h == 0 && g$a$a1.c.h == 0)
	//*  63  130:aload_0         
	//*  64  131:getfield        #51  <Field com.google.ads.interactivemedia.v3.a.f.k$b c>
	//*  65  134:getfield        #55  <Field int com.google.ads.interactivemedia.v3.a.f.k$b.h>
	//*  66  137:ifne            180
	//*  67  140:aload_1         
	//*  68  141:getfield        #51  <Field com.google.ads.interactivemedia.v3.a.f.k$b c>
	//*  69  144:getfield        #55  <Field int com.google.ads.interactivemedia.v3.a.f.k$b.h>
	//*  70  147:ifne            180
				{
					flag = flag1;
	//   71  150:iload           5
	//   72  152:istore          4
					if(m != g$a$a1.m)
						break label0;
	//   73  154:aload_0         
	//   74  155:getfield        #57  <Field int m>
	//   75  158:aload_1         
	//   76  159:getfield        #57  <Field int m>
	//   77  162:icmpne          281
					flag = flag1;
	//   78  165:iload           5
	//   79  167:istore          4
					if(n != g$a$a1.n)
						break label0;
	//   80  169:aload_0         
	//   81  170:getfield        #59  <Field int n>
	//   82  173:aload_1         
	//   83  174:getfield        #59  <Field int n>
	//   84  177:icmpne          281
				}
				if(c.h == 1 && g$a$a1.c.h == 1)
	//*  85  180:aload_0         
	//*  86  181:getfield        #51  <Field com.google.ads.interactivemedia.v3.a.f.k$b c>
	//*  87  184:getfield        #55  <Field int com.google.ads.interactivemedia.v3.a.f.k$b.h>
	//*  88  187:iconst_1        
	//*  89  188:icmpne          232
	//*  90  191:aload_1         
	//*  91  192:getfield        #51  <Field com.google.ads.interactivemedia.v3.a.f.k$b c>
	//*  92  195:getfield        #55  <Field int com.google.ads.interactivemedia.v3.a.f.k$b.h>
	//*  93  198:iconst_1        
	//*  94  199:icmpne          232
				{
					flag = flag1;
	//   95  202:iload           5
	//   96  204:istore          4
					if(o != g$a$a1.o)
						break label0;
	//   97  206:aload_0         
	//   98  207:getfield        #61  <Field int o>
	//   99  210:aload_1         
	//  100  211:getfield        #61  <Field int o>
	//  101  214:icmpne          281
					flag = flag1;
	//  102  217:iload           5
	//  103  219:istore          4
					if(p != g$a$a1.p)
						break label0;
	//  104  221:aload_0         
	//  105  222:getfield        #63  <Field int p>
	//  106  225:aload_1         
	//  107  226:getfield        #63  <Field int p>
	//  108  229:icmpne          281
				}
				boolean flag2 = k;
	//  109  232:aload_0         
	//  110  233:getfield        #65  <Field boolean k>
	//  111  236:istore          6
				boolean flag3 = g$a$a1.k;
	//  112  238:aload_1         
	//  113  239:getfield        #65  <Field boolean k>
	//  114  242:istore          7
				flag = flag1;
	//  115  244:iload           5
	//  116  246:istore          4
				if(flag2 != flag3)
					break label0;
	//  117  248:iload           6
	//  118  250:iload           7
	//  119  252:icmpne          281
				if(flag2 && flag3 && l != g$a$a1.l)
	//* 120  255:iload           6
	//* 121  257:ifeq            278
	//* 122  260:iload           7
	//* 123  262:ifeq            278
	//* 124  265:aload_0         
	//* 125  266:getfield        #67  <Field int l>
	//* 126  269:aload_1         
	//* 127  270:getfield        #67  <Field int l>
	//* 128  273:icmpeq          278
					return true;
	//  129  276:iconst_1        
	//  130  277:ireturn         
			}
			flag = false;
	//  131  278:iconst_0        
	//  132  279:istore          4
		}
		return flag;
	//  133  281:iload           4
	//  134  283:ireturn         
	}

	static boolean a(g$a$a g$a$a1, g$a$a g$a$a2)
	{
		return g$a$a1.a(g$a$a2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method boolean a(g$a$a)>
	//    3    5:ireturn         
	}

	public void a()
	{
		b = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #72  <Field boolean b>
		a = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #37  <Field boolean a>
	//    6   10:return          
	}

	public void a(int i1)
	{
		e = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #75  <Field int e>
		b = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #72  <Field boolean b>
	//    6   10:return          
	}

	public void a(com.google.ads.interactivemedia.v3.a.f.k.b b1, int i1, int j1, int k1, int l1, boolean flag, boolean flag1, 
			boolean flag2, boolean flag3, int i2, int j2, int k2, int l2, int i3)
	{
		c = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field com.google.ads.interactivemedia.v3.a.f.k$b c>
		d = i1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #49  <Field int d>
		e = j1;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #75  <Field int e>
		f = k1;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #39  <Field int f>
		g = l1;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #41  <Field int g>
		h = flag;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #43  <Field boolean h>
		i = flag1;
	//   18   33:aload_0         
	//   19   34:iload           7
	//   20   36:putfield        #45  <Field boolean i>
		j = flag2;
	//   21   39:aload_0         
	//   22   40:iload           8
	//   23   42:putfield        #47  <Field boolean j>
		k = flag3;
	//   24   45:aload_0         
	//   25   46:iload           9
	//   26   48:putfield        #65  <Field boolean k>
		l = i2;
	//   27   51:aload_0         
	//   28   52:iload           10
	//   29   54:putfield        #67  <Field int l>
		m = j2;
	//   30   57:aload_0         
	//   31   58:iload           11
	//   32   60:putfield        #57  <Field int m>
		n = k2;
	//   33   63:aload_0         
	//   34   64:iload           12
	//   35   66:putfield        #59  <Field int n>
		o = l2;
	//   36   69:aload_0         
	//   37   70:iload           13
	//   38   72:putfield        #61  <Field int o>
		p = i3;
	//   39   75:aload_0         
	//   40   76:iload           14
	//   41   78:putfield        #63  <Field int p>
		a = true;
	//   42   81:aload_0         
	//   43   82:iconst_1        
	//   44   83:putfield        #37  <Field boolean a>
		b = true;
	//   45   86:aload_0         
	//   46   87:iconst_1        
	//   47   88:putfield        #72  <Field boolean b>
	//   48   91:return          
	}

	public boolean b()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean b>
	//*   2    4:ifeq            25
		{
			int i1 = e;
	//    3    7:aload_0         
	//    4    8:getfield        #75  <Field int e>
	//    5   11:istore_1        
			if(i1 == 7 || i1 == 2)
	//*   6   12:iload_1         
	//*   7   13:bipush          7
	//*   8   15:icmpeq          23
	//*   9   18:iload_1         
	//*  10   19:iconst_2        
	//*  11   20:icmpne          25
				return true;
	//   12   23:iconst_1        
	//   13   24:ireturn         
		}
		return false;
	//   14   25:iconst_0        
	//   15   26:ireturn         
	}

	private boolean a;
	private boolean b;
	private com.google.ads.interactivemedia.v3.a.f.k.b c;
	private int d;
	private int e;
	private int f;
	private int g;
	private boolean h;
	private boolean i;
	private boolean j;
	private boolean k;
	private int l;
	private int m;
	private int n;
	private int o;
	private int p;

	private g$a$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	g$a$a(g._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void g$a$a()>
	//    2    4:return          
	}
}
