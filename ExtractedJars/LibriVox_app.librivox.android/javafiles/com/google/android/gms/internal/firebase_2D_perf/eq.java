// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			dd, et, ep, gq, 
//			gt, hl, gd, dc

public class eq extends dd
{

	protected eq(ep ep1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void dd()>
		b = ep1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ep b>
		a = (ep)ep1.a(et.d, ((Object) (null)), ((Object) (null)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #22  <Field int et.d>
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #27  <Method Object ep.a(int, Object, Object)>
	//   11   19:checkcast       #24  <Class ep>
	//   12   22:putfield        #29  <Field ep a>
		c = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #31  <Field boolean c>
	//   16   30:return          
	}

	private static void a(ep ep1, ep ep2)
	{
		gq.a().a(((Object) (ep1))).b(((Object) (ep1)), ((Object) (ep2)));
	//    0    0:invokestatic    #38  <Method gq gq.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #41  <Method gt gq.a(Object)>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokeinterface #46  <Method void gt.b(Object, Object)>
	//    6   14:return          
	}

	public final gd E()
	{
		return ((gd) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ep b>
	//    2    4:areturn         
	}

	protected final dd a(dc dc)
	{
		return ((dd) (a((ep)dc)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class ep>
	//    3    5:invokevirtual   #52  <Method eq a(ep)>
	//    4    8:areturn         
	}

	public final eq a(ep ep1)
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method void h()>
		a(a, ep1);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ep a>
	//    4    8:aload_1         
	//    5    9:invokestatic    #57  <Method void a(ep, ep)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public Object clone()
	{
		eq eq1 = (eq)((ep)b).a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ep b>
	//    2    4:checkcast       #24  <Class ep>
	//    3    7:getstatic       #62  <Field int et.e>
	//    4   10:aconst_null     
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #27  <Method Object ep.a(int, Object, Object)>
	//    7   15:checkcast       #2   <Class eq>
	//    8   18:astore_1        
		eq1.a((ep)k());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #65  <Method gd k()>
	//   12   24:checkcast       #24  <Class ep>
	//   13   27:invokevirtual   #52  <Method eq a(ep)>
	//   14   30:pop             
		return ((Object) (eq1));
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public final dd g()
	{
		return ((dd) ((eq)((dd)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method Object dd.clone()>
	//    2    4:checkcast       #2   <Class eq>
	//    3    7:areturn         
	}

	protected final void h()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            41
		{
			ep ep1 = (ep)a.a(et.d, ((Object) (null)), ((Object) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field ep a>
	//    5   11:getstatic       #22  <Field int et.d>
	//    6   14:aconst_null     
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #27  <Method Object ep.a(int, Object, Object)>
	//    9   19:checkcast       #24  <Class ep>
	//   10   22:astore_1        
			a(ep1, a);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field ep a>
	//   14   28:invokestatic    #57  <Method void a(ep, ep)>
			a = ep1;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #29  <Field ep a>
			c = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #31  <Field boolean c>
		}
	//   21   41:return          
	}

	public ep i()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            12
		{
			return a;
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field ep a>
	//    5   11:areturn         
		} else
		{
			ep ep1 = a;
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field ep a>
	//    8   16:astore_1        
			gq.a().a(((Object) (ep1))).c(((Object) (ep1)));
	//    9   17:invokestatic    #38  <Method gq gq.a()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #41  <Method gt gq.a(Object)>
	//   12   24:aload_1         
	//   13   25:invokeinterface #74  <Method void gt.c(Object)>
			c = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #31  <Field boolean c>
			return a;
	//   17   35:aload_0         
	//   18   36:getfield        #29  <Field ep a>
	//   19   39:areturn         
		}
	}

	public final ep j()
	{
		ep ep2 = (ep)k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method gd k()>
	//    2    4:checkcast       #24  <Class ep>
	//    3    7:astore          6
		boolean flag2 = Boolean.TRUE.booleanValue();
	//    4    9:getstatic       #81  <Field Boolean Boolean.TRUE>
	//    5   12:invokevirtual   #85  <Method boolean Boolean.booleanValue()>
	//    6   15:istore          4
		byte byte0 = ((Byte)ep2.a(et.a, ((Object) (null)), ((Object) (null)))).byteValue();
	//    7   17:aload           6
	//    8   19:getstatic       #87  <Field int et.a>
	//    9   22:aconst_null     
	//   10   23:aconst_null     
	//   11   24:invokevirtual   #27  <Method Object ep.a(int, Object, Object)>
	//   12   27:checkcast       #89  <Class Byte>
	//   13   30:invokevirtual   #93  <Method byte Byte.byteValue()>
	//   14   33:istore_1        
		boolean flag = true;
	//   15   34:iconst_1        
	//   16   35:istore_2        
		if(byte0 != 1)
	//*  17   36:iload_1         
	//*  18   37:iconst_1        
	//*  19   38:icmpne          44
	//*  20   41:goto            106
			if(byte0 == 0)
	//*  21   44:iload_1         
	//*  22   45:ifne            53
			{
				flag = false;
	//   23   48:iconst_0        
	//   24   49:istore_2        
			} else
	//*  25   50:goto            106
			{
				boolean flag1 = gq.a().a(((Object) (ep2))).d(((Object) (ep2)));
	//   26   53:invokestatic    #38  <Method gq gq.a()>
	//   27   56:aload           6
	//   28   58:invokevirtual   #41  <Method gt gq.a(Object)>
	//   29   61:aload           6
	//   30   63:invokeinterface #96  <Method boolean gt.d(Object)>
	//   31   68:istore_3        
				flag = flag1;
	//   32   69:iload_3         
	//   33   70:istore_2        
				if(flag2)
	//*  34   71:iload           4
	//*  35   73:ifeq            106
				{
					int i1 = et.b;
	//   36   76:getstatic       #98  <Field int et.b>
	//   37   79:istore_1        
					ep ep1;
					if(flag1)
	//*  38   80:iload_3         
	//*  39   81:ifeq            91
						ep1 = ep2;
	//   40   84:aload           6
	//   41   86:astore          5
					else
	//*  42   88:goto            94
						ep1 = null;
	//   43   91:aconst_null     
	//   44   92:astore          5
					ep2.a(i1, ((Object) (ep1)), ((Object) (null)));
	//   45   94:aload           6
	//   46   96:iload_1         
	//   47   97:aload           5
	//   48   99:aconst_null     
	//   49  100:invokevirtual   #27  <Method Object ep.a(int, Object, Object)>
	//   50  103:pop             
					flag = flag1;
	//   51  104:iload_3         
	//   52  105:istore_2        
				}
			}
		if(flag)
	//*  53  106:iload_2         
	//*  54  107:ifeq            113
			return ep2;
	//   55  110:aload           6
	//   56  112:areturn         
		else
			throw new hl(((gd) (ep2)));
	//   57  113:new             #100 <Class hl>
	//   58  116:dup             
	//   59  117:aload           6
	//   60  119:invokespecial   #103 <Method void hl(gd)>
	//   61  122:athrow          
	}

	public gd k()
	{
		return ((gd) (i()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method ep i()>
	//    2    4:areturn         
	}

	public gd l()
	{
		return ((gd) (j()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method ep j()>
	//    2    4:areturn         
	}

	public final boolean y()
	{
		return ep.a(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ep a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #112 <Method boolean ep.a(ep, boolean)>
	//    4    8:ireturn         
	}

	protected ep a;
	private final ep b;
	private boolean c;
}
