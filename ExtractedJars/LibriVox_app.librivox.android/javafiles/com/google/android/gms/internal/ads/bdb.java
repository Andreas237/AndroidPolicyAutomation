// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf, bji, bdi, bjb, 
//			bmh, bme, biz, bmf, 
//			bdl, bdn

final class bdb
{

	public bdb(bdl abdl[], bdn abdn[], long l1, bmf bmf1, bdi bdi1, bjb bjb1, 
			Object obj, int i1, int j1, boolean flag, long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		n = abdl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field bdl[] n>
		o = abdn;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field bdn[] o>
		e = l1;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #48  <Field long e>
		p = bmf1;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #50  <Field bmf p>
		q = bdi1;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #52  <Field bdi q>
		r = bjb1;
	//   17   31:aload_0         
	//   18   32:aload           7
	//   19   34:putfield        #54  <Field bjb r>
		b = bnf.a(obj);
	//   20   37:aload_0         
	//   21   38:aload           8
	//   22   40:invokestatic    #59  <Method Object bnf.a(Object)>
	//   23   43:putfield        #61  <Field Object b>
		c = i1;
	//   24   46:aload_0         
	//   25   47:iload           9
	//   26   49:putfield        #63  <Field int c>
		f = j1;
	//   27   52:aload_0         
	//   28   53:iload           10
	//   29   55:putfield        #65  <Field int f>
		h = flag;
	//   30   58:aload_0         
	//   31   59:iload           11
	//   32   61:putfield        #67  <Field boolean h>
		g = l2;
	//   33   64:aload_0         
	//   34   65:lload           12
	//   35   67:putfield        #69  <Field long g>
		d = new bji[abdl.length];
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:arraylength     
	//   39   73:anewarray       bji[]
	//   40   76:putfield        #73  <Field bji[] d>
		m = new boolean[abdl.length];
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:arraylength     
	//   44   82:newarray        boolean[]
	//   45   84:putfield        #75  <Field boolean[] m>
		a = bjb1.a(j1, bdi1.d());
	//   46   87:aload_0         
	//   47   88:aload           7
	//   48   90:iload           10
	//   49   92:aload           6
	//   50   94:invokeinterface #80  <Method bmj bdi.d()>
	//   51   99:invokeinterface #85  <Method biz bjb.a(int, bmj)>
	//   52  104:putfield        #87  <Field biz a>
	//   53  107:return          
	}

	public final long a()
	{
		return e - g;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long e>
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field long g>
	//    4    8:lsub            
	//    5    9:lreturn         
	}

	public final long a(long l1, boolean flag)
	{
		return a(l1, false, new boolean[n.length]);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:getfield        #44  <Field bdl[] n>
	//    5    7:arraylength     
	//    6    8:newarray        boolean[]
	//    7   10:invokevirtual   #93  <Method long a(long, boolean, boolean[])>
	//    8   13:lreturn         
	}

	public final long a(long l1, boolean flag, boolean aflag[])
	{
		bme bme1 = l.b;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field bmh l>
	//    2    4:getfield        #100 <Field bme bmh.b>
	//    3    7:astore          8
		int i1 = 0;
	//    4    9:iconst_0        
	//    5   10:istore          5
		do
		{
			int j1 = bme1.a;
	//    6   12:aload           8
	//    7   14:getfield        #104 <Field int bme.a>
	//    8   17:istore          6
			boolean flag1 = true;
	//    9   19:iconst_1        
	//   10   20:istore          7
			if(i1 >= j1)
				break;
	//   11   22:iload           5
	//   12   24:iload           6
	//   13   26:icmpge          77
			boolean aflag1[] = m;
	//   14   29:aload_0         
	//   15   30:getfield        #75  <Field boolean[] m>
	//   16   33:astore          9
			if(flag || !l.a(s, i1))
	//*  17   35:iload_3         
	//*  18   36:ifne            58
	//*  19   39:aload_0         
	//*  20   40:getfield        #95  <Field bmh l>
	//*  21   43:aload_0         
	//*  22   44:getfield        #106 <Field bmh s>
	//*  23   47:iload           5
	//*  24   49:invokevirtual   #109 <Method boolean bmh.a(bmh, int)>
	//*  25   52:ifeq            58
	//*  26   55:goto            61
				flag1 = false;
	//   27   58:iconst_0        
	//   28   59:istore          7
			aflag1[i1] = flag1;
	//   29   61:aload           9
	//   30   63:iload           5
	//   31   65:iload           7
	//   32   67:bastore         
			i1++;
	//   33   68:iload           5
	//   34   70:iconst_1        
	//   35   71:iadd            
	//   36   72:istore          5
		} while(true);
	//   37   74:goto            12
		l1 = a.a(bme1.a(), m, d, aflag, l1);
	//   38   77:aload_0         
	//   39   78:getfield        #87  <Field biz a>
	//   40   81:aload           8
	//   41   83:invokevirtual   #112 <Method bmc[] bme.a()>
	//   42   86:aload_0         
	//   43   87:getfield        #75  <Field boolean[] m>
	//   44   90:aload_0         
	//   45   91:getfield        #73  <Field bji[] d>
	//   46   94:aload           4
	//   47   96:lload_1         
	//   48   97:invokeinterface #117 <Method long biz.a(bmc[], boolean[], bji[], boolean[], long)>
	//   49  102:lstore_1        
		s = l;
	//   50  103:aload_0         
	//   51  104:aload_0         
	//   52  105:getfield        #95  <Field bmh l>
	//   53  108:putfield        #106 <Field bmh s>
		j = false;
	//   54  111:aload_0         
	//   55  112:iconst_0        
	//   56  113:putfield        #119 <Field boolean j>
		i1 = 0;
	//   57  116:iconst_0        
	//   58  117:istore          5
		do
		{
			aflag = ((boolean []) (d));
	//   59  119:aload_0         
	//   60  120:getfield        #73  <Field bji[] d>
	//   61  123:astore          4
			if(i1 < aflag.length)
	//*  62  125:iload           5
	//*  63  127:aload           4
	//*  64  129:arraylength     
	//*  65  130:icmpge          200
			{
				if(aflag[i1] != null)
	//*  66  133:aload           4
	//*  67  135:iload           5
	//*  68  137:aaload          
	//*  69  138:ifnull          170
				{
					if(bme1.a(i1) != null)
	//*  70  141:aload           8
	//*  71  143:iload           5
	//*  72  145:invokevirtual   #122 <Method bmc bme.a(int)>
	//*  73  148:ifnull          156
						flag = true;
	//   74  151:iconst_1        
	//   75  152:istore_3        
					else
	//*  76  153:goto            158
						flag = false;
	//   77  156:iconst_0        
	//   78  157:istore_3        
					bnf.b(flag);
	//   79  158:iload_3         
	//   80  159:invokestatic    #125 <Method void bnf.b(boolean)>
					j = true;
	//   81  162:aload_0         
	//   82  163:iconst_1        
	//   83  164:putfield        #119 <Field boolean j>
				} else
	//*  84  167:goto            191
				{
					if(bme1.a(i1) == null)
	//*  85  170:aload           8
	//*  86  172:iload           5
	//*  87  174:invokevirtual   #122 <Method bmc bme.a(int)>
	//*  88  177:ifnonnull       185
						flag = true;
	//   89  180:iconst_1        
	//   90  181:istore_3        
					else
	//*  91  182:goto            187
						flag = false;
	//   92  185:iconst_0        
	//   93  186:istore_3        
					bnf.b(flag);
	//   94  187:iload_3         
	//   95  188:invokestatic    #125 <Method void bnf.b(boolean)>
				}
				i1++;
	//   96  191:iload           5
	//   97  193:iconst_1        
	//   98  194:iadd            
	//   99  195:istore          5
			} else
	//* 100  197:goto            119
			{
				q.a(n, l.a, bme1);
	//  101  200:aload_0         
	//  102  201:getfield        #52  <Field bdi q>
	//  103  204:aload_0         
	//  104  205:getfield        #44  <Field bdl[] n>
	//  105  208:aload_0         
	//  106  209:getfield        #95  <Field bmh l>
	//  107  212:getfield        #128 <Field bjo bmh.a>
	//  108  215:aload           8
	//  109  217:invokeinterface #131 <Method void bdi.a(bdl[], bjo, bme)>
				return l1;
	//  110  222:lload_1         
	//  111  223:lreturn         
			}
		} while(true);
	}

	public final void a(int i1, boolean flag)
	{
		f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field int f>
		h = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #67  <Field boolean h>
	//    6   10:return          
	}

	public final boolean b()
	{
		return i && (!j || a.f() == 0x0L);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field boolean i>
	//    2    4:ifeq            32
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field boolean j>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #87  <Field biz a>
	//    8   18:invokeinterface #137 <Method long biz.f()>
	//    9   23:ldc2w           #138 <Long 0x0L>
	//   10   26:lcmp            
	//   11   27:ifne            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public final boolean c()
	{
		int i1;
		bmh bmh1;
label0:
		{
			bmh1 = p.a(o, a.d());
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field bmf p>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field bdn[] o>
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field biz a>
	//    6   12:invokeinterface #142 <Method bjo biz.d()>
	//    7   17:invokevirtual   #147 <Method bmh bmf.a(bdn[], bjo)>
	//    8   20:astore_2        
			bmh bmh2 = s;
	//    9   21:aload_0         
	//   10   22:getfield        #106 <Field bmh s>
	//   11   25:astore_3        
			if(bmh2 == null)
	//*  12   26:aload_3         
	//*  13   27:ifnonnull       35
			{
				i1 = 0;
	//   14   30:iconst_0        
	//   15   31:istore_1        
				break label0;
	//   16   32:goto            71
			}
			i1 = 0;
	//   17   35:iconst_0        
	//   18   36:istore_1        
			do
			{
				if(i1 >= bmh1.b.a)
					break;
	//   19   37:iload_1         
	//   20   38:aload_2         
	//   21   39:getfield        #100 <Field bme bmh.b>
	//   22   42:getfield        #104 <Field int bme.a>
	//   23   45:icmpge          69
				if(!bmh1.a(bmh2, i1))
	//*  24   48:aload_2         
	//*  25   49:aload_3         
	//*  26   50:iload_1         
	//*  27   51:invokevirtual   #109 <Method boolean bmh.a(bmh, int)>
	//*  28   54:ifne            62
				{
					i1 = 0;
	//   29   57:iconst_0        
	//   30   58:istore_1        
					break label0;
	//   31   59:goto            71
				}
				i1++;
	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
			} while(true);
	//   36   66:goto            37
			i1 = 1;
	//   37   69:iconst_1        
	//   38   70:istore_1        
		}
		if(i1 != 0)
	//*  39   71:iload_1         
	//*  40   72:ifeq            77
		{
			return false;
	//   41   75:iconst_0        
	//   42   76:ireturn         
		} else
		{
			l = bmh1;
	//   43   77:aload_0         
	//   44   78:aload_2         
	//   45   79:putfield        #95  <Field bmh l>
			return true;
	//   46   82:iconst_1        
	//   47   83:ireturn         
		}
	}

	public final void d()
	{
		try
		{
			r.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field bjb r>
	//    2    4:aload_0         
	//    3    5:getfield        #87  <Field biz a>
	//    4    8:invokeinterface #152 <Method void bjb.a(biz)>
			return;
	//    5   13:return          
		}
		catch(RuntimeException runtimeexception)
	//*   6   14:astore_1        
		{
			Log.e("ExoPlayerImplInternal", "Period release failed.", ((Throwable) (runtimeexception)));
	//    7   15:ldc1            #154 <String "ExoPlayerImplInternal">
	//    8   17:ldc1            #156 <String "Period release failed.">
	//    9   19:aload_1         
	//   10   20:invokestatic    #161 <Method int Log.e(String, String, Throwable)>
	//   11   23:pop             
		}
	//   12   24:return          
	}

	public final biz a;
	public final Object b;
	public final int c;
	public final bji d[];
	public final long e;
	public int f;
	public long g;
	public boolean h;
	public boolean i;
	public boolean j;
	public bdb k;
	public bmh l;
	private final boolean m[];
	private final bdl n[];
	private final bdn o[];
	private final bmf p;
	private final bdi q;
	private final bjb r;
	private bmh s;
}
