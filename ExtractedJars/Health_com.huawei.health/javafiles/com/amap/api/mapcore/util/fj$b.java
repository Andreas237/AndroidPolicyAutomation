// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			fj

class fj$b
{

	fj$b a(int i, int j, String s)
	{
		if(!a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method boolean a()>
	//*   2    4:ifne            43
		{
			fj$b fj$b2 = c.a(i, j, s);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field fj$b c>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #45  <Method fj$b a(int, int, String)>
	//    9   17:astore          5
			fj$b fj$b1 = fj$b2;
	//   10   19:aload           5
	//   11   21:astore          4
			if(fj$b2 == null)
	//*  12   23:aload           5
	//*  13   25:ifnonnull       40
				fj$b1 = d.a(i, j, s);
	//   14   28:aload_0         
	//   15   29:getfield        #38  <Field fj$b d>
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:aload_3         
	//   19   35:invokevirtual   #45  <Method fj$b a(int, int, String)>
	//   20   38:astore          4
			return fj$b1;
	//   21   40:aload           4
	//   22   42:areturn         
		}
		if(a != null)
	//*  23   43:aload_0         
	//*  24   44:getfield        #47  <Field String a>
	//*  25   47:ifnull          52
			return null;
	//   26   50:aconst_null     
	//   27   51:areturn         
		fj$a fj$a1 = b(i, j);
	//   28   52:aload_0         
	//   29   53:iload_1         
	//   30   54:iload_2         
	//   31   55:invokevirtual   #50  <Method fj$a b(int, int)>
	//   32   58:astore          4
		switch(fj$1.a[fj$a1.ordinal()])
	//*  33   60:getstatic       #55  <Field int[] fj$1.a>
	//*  34   63:aload           4
	//*  35   65:invokevirtual   #61  <Method int fj$a.ordinal()>
	//*  36   68:iaload          
		{
	//*  37   69:tableswitch     1 3: default 96
	//	               1 99
	//	               2 101
	//	               3 108
	//*  38   96:goto            114
		case 1: // '\001'
			return null;
	//   39   99:aconst_null     
	//   40  100:areturn         

		case 2: // '\002'
			a = s;
	//   41  101:aload_0         
	//   42  102:aload_3         
	//   43  103:putfield        #47  <Field String a>
			return this;
	//   44  106:aload_0         
	//   45  107:areturn         

		case 3: // '\003'
			a(i, j);
	//   46  108:aload_0         
	//   47  109:iload_1         
	//   48  110:iload_2         
	//   49  111:invokevirtual   #64  <Method void a(int, int)>
			break;
		}
		return c.a(i, j, s);
	//   50  114:aload_0         
	//   51  115:getfield        #36  <Field fj$b c>
	//   52  118:iload_1         
	//   53  119:iload_2         
	//   54  120:aload_3         
	//   55  121:invokevirtual   #45  <Method fj$b a(int, int, String)>
	//   56  124:areturn         
	}

	void a(int i, int j)
	{
		int k = b.c - i;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field fj$c b>
	//    2    4:getfield        #69  <Field int fj$c.c>
	//    3    7:iload_1         
	//    4    8:isub            
	//    5    9:istore_3        
		int l = b.d - j;
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field fj$c b>
	//    8   14:getfield        #71  <Field int fj$c.d>
	//    9   17:iload_2         
	//   10   18:isub            
	//   11   19:istore          4
		if(!e && k < 0)
	//*  12   21:getstatic       #27  <Field boolean e>
	//*  13   24:ifne            39
	//*  14   27:iload_3         
	//*  15   28:ifge            39
			throw new AssertionError();
	//   16   31:new             #73  <Class AssertionError>
	//   17   34:dup             
	//   18   35:invokespecial   #74  <Method void AssertionError()>
	//   19   38:athrow          
		if(!e && l < 0)
	//*  20   39:getstatic       #27  <Field boolean e>
	//*  21   42:ifne            58
	//*  22   45:iload           4
	//*  23   47:ifge            58
			throw new AssertionError();
	//   24   50:new             #73  <Class AssertionError>
	//   25   53:dup             
	//   26   54:invokespecial   #74  <Method void AssertionError()>
	//   27   57:athrow          
		fj$c fj$c1;
		fj$c fj$c2;
		if(k > l)
	//*  28   58:iload_3         
	//*  29   59:iload           4
	//*  30   61:icmple          137
		{
			fj$c2 = new fj$c(b.a, b.b, i, b.d);
	//   31   64:new             #66  <Class fj$c>
	//   32   67:dup             
	//   33   68:aload_0         
	//   34   69:getfield        #40  <Field fj$c b>
	//   35   72:getfield        #76  <Field int fj$c.a>
	//   36   75:aload_0         
	//   37   76:getfield        #40  <Field fj$c b>
	//   38   79:getfield        #78  <Field int fj$c.b>
	//   39   82:iload_1         
	//   40   83:aload_0         
	//   41   84:getfield        #40  <Field fj$c b>
	//   42   87:getfield        #71  <Field int fj$c.d>
	//   43   90:invokespecial   #81  <Method void fj$c(int, int, int, int)>
	//   44   93:astore          6
			fj$c1 = new fj$c(fj$c2.a + i, b.b, b.c - i, b.d);
	//   45   95:new             #66  <Class fj$c>
	//   46   98:dup             
	//   47   99:aload           6
	//   48  101:getfield        #76  <Field int fj$c.a>
	//   49  104:iload_1         
	//   50  105:iadd            
	//   51  106:aload_0         
	//   52  107:getfield        #40  <Field fj$c b>
	//   53  110:getfield        #78  <Field int fj$c.b>
	//   54  113:aload_0         
	//   55  114:getfield        #40  <Field fj$c b>
	//   56  117:getfield        #69  <Field int fj$c.c>
	//   57  120:iload_1         
	//   58  121:isub            
	//   59  122:aload_0         
	//   60  123:getfield        #40  <Field fj$c b>
	//   61  126:getfield        #71  <Field int fj$c.d>
	//   62  129:invokespecial   #81  <Method void fj$c(int, int, int, int)>
	//   63  132:astore          5
		} else
	//*  64  134:goto            207
		{
			fj$c2 = new fj$c(b.a, b.b, b.c, j);
	//   65  137:new             #66  <Class fj$c>
	//   66  140:dup             
	//   67  141:aload_0         
	//   68  142:getfield        #40  <Field fj$c b>
	//   69  145:getfield        #76  <Field int fj$c.a>
	//   70  148:aload_0         
	//   71  149:getfield        #40  <Field fj$c b>
	//   72  152:getfield        #78  <Field int fj$c.b>
	//   73  155:aload_0         
	//   74  156:getfield        #40  <Field fj$c b>
	//   75  159:getfield        #69  <Field int fj$c.c>
	//   76  162:iload_2         
	//   77  163:invokespecial   #81  <Method void fj$c(int, int, int, int)>
	//   78  166:astore          6
			fj$c1 = new fj$c(b.a, fj$c2.b + j, b.c, b.d - j);
	//   79  168:new             #66  <Class fj$c>
	//   80  171:dup             
	//   81  172:aload_0         
	//   82  173:getfield        #40  <Field fj$c b>
	//   83  176:getfield        #76  <Field int fj$c.a>
	//   84  179:aload           6
	//   85  181:getfield        #78  <Field int fj$c.b>
	//   86  184:iload_2         
	//   87  185:iadd            
	//   88  186:aload_0         
	//   89  187:getfield        #40  <Field fj$c b>
	//   90  190:getfield        #69  <Field int fj$c.c>
	//   91  193:aload_0         
	//   92  194:getfield        #40  <Field fj$c b>
	//   93  197:getfield        #71  <Field int fj$c.d>
	//   94  200:iload_2         
	//   95  201:isub            
	//   96  202:invokespecial   #81  <Method void fj$c(int, int, int, int)>
	//   97  205:astore          5
		}
		c = new fj$b(f, fj$c2);
	//   98  207:aload_0         
	//   99  208:new             #2   <Class fj$b>
	//  100  211:dup             
	//  101  212:aload_0         
	//  102  213:getfield        #32  <Field fj f>
	//  103  216:aload           6
	//  104  218:invokespecial   #83  <Method void fj$b(fj, fj$c)>
	//  105  221:putfield        #36  <Field fj$b c>
		d = new fj$b(f, fj$c1);
	//  106  224:aload_0         
	//  107  225:new             #2   <Class fj$b>
	//  108  228:dup             
	//  109  229:aload_0         
	//  110  230:getfield        #32  <Field fj f>
	//  111  233:aload           5
	//  112  235:invokespecial   #83  <Method void fj$b(fj, fj$c)>
	//  113  238:putfield        #38  <Field fj$b d>
	//  114  241:return          
	}

	boolean a()
	{
		return c == null;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field fj$b c>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	boolean a(String s)
	{
		if(a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method boolean a()>
	//*   2    4:ifeq            27
			if(s.equals(((Object) (a))))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #47  <Field String a>
	//*   6   12:invokevirtual   #90  <Method boolean String.equals(Object)>
	//*   7   15:ifeq            25
			{
				a = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #47  <Field String a>
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
			} else
			{
				return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
			}
		boolean flag1 = c.a(s);
	//   15   27:aload_0         
	//   16   28:getfield        #36  <Field fj$b c>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #92  <Method boolean a(String)>
	//   19   35:istore_3        
		boolean flag = flag1;
	//   20   36:iload_3         
	//   21   37:istore_2        
		if(!flag1)
	//*  22   38:iload_3         
	//*  23   39:ifne            51
			flag = d.a(s);
	//   24   42:aload_0         
	//   25   43:getfield        #38  <Field fj$b d>
	//   26   46:aload_1         
	//   27   47:invokevirtual   #92  <Method boolean a(String)>
	//   28   50:istore_2        
		if(flag && !c.b() && !d.b())
	//*  29   51:iload_2         
	//*  30   52:ifeq            85
	//*  31   55:aload_0         
	//*  32   56:getfield        #36  <Field fj$b c>
	//*  33   59:invokevirtual   #94  <Method boolean b()>
	//*  34   62:ifne            85
	//*  35   65:aload_0         
	//*  36   66:getfield        #38  <Field fj$b d>
	//*  37   69:invokevirtual   #94  <Method boolean b()>
	//*  38   72:ifne            85
		{
			c = null;
	//   39   75:aload_0         
	//   40   76:aconst_null     
	//   41   77:putfield        #36  <Field fj$b c>
			d = null;
	//   42   80:aload_0         
	//   43   81:aconst_null     
	//   44   82:putfield        #38  <Field fj$b d>
		}
		return flag;
	//   45   85:iload_2         
	//   46   86:ireturn         
	}

	fj$a b(int i, int j)
	{
		if(i <= b.c && j <= b.d)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #40  <Field fj$c b>
	//*   3    5:getfield        #69  <Field int fj$c.c>
	//*   4    8:icmpgt          52
	//*   5   11:iload_2         
	//*   6   12:aload_0         
	//*   7   13:getfield        #40  <Field fj$c b>
	//*   8   16:getfield        #71  <Field int fj$c.d>
	//*   9   19:icmpgt          52
		{
			if(i == b.c && j == b.d)
	//*  10   22:iload_1         
	//*  11   23:aload_0         
	//*  12   24:getfield        #40  <Field fj$c b>
	//*  13   27:getfield        #69  <Field int fj$c.c>
	//*  14   30:icmpne          48
	//*  15   33:iload_2         
	//*  16   34:aload_0         
	//*  17   35:getfield        #40  <Field fj$c b>
	//*  18   38:getfield        #71  <Field int fj$c.d>
	//*  19   41:icmpne          48
				return fj$a.b;
	//   20   44:getstatic       #97  <Field fj$a fj$a.b>
	//   21   47:areturn         
			else
				return fj$a.c;
	//   22   48:getstatic       #99  <Field fj$a fj$a.c>
	//   23   51:areturn         
		} else
		{
			return fj$a.a;
	//   24   52:getstatic       #101 <Field fj$a fj$a.a>
	//   25   55:areturn         
		}
	}

	boolean b()
	{
		return a != null || !a();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String a>
	//    2    4:ifnonnull       14
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method boolean a()>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	static final boolean e;
	String a;
	fj$c b;
	fj$b c;
	fj$b d;
	final fj f;

	static 
	{
		boolean flag;
		if(!((Class) (com/amap/api/mapcore/util/fj)).desiredAssertionStatus())
	//*   0    0:ldc1            #6   <Class fj>
	//*   1    2:invokevirtual   #25  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		e = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #27  <Field boolean e>
	//*  10   19:return          
	}

	fj$b(fj fj1, fj$c fj$c1)
	{
		f = fj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field fj f>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void Object()>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #36  <Field fj$b c>
		d = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #38  <Field fj$b d>
		b = fj$c1;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #40  <Field fj$c b>
	//   14   24:return          
	}
}
