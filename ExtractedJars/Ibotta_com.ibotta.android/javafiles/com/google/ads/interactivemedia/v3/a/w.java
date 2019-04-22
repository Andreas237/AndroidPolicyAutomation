// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import com.google.ads.interactivemedia.v3.a.f.b;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			f, j, p

public abstract class w
	implements g.a
{

	public w()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	protected void a(int i, long l, boolean flag)
		throws f
	{
	//    0    0:return          
	}

	public void a(int i, Object obj)
		throws f
	{
	//    0    0:return          
	}

	protected j b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected abstract p b(int i);

	final void b(int i, long l, boolean flag)
		throws f
	{
		int j = a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int a>
	//    2    4:istore          5
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		if(j != 1)
	//*   5    9:iload           5
	//*   6   11:iconst_1        
	//*   7   12:icmpne          18
	//*   8   15:goto            21
			flag1 = false;
	//    9   18:iconst_0        
	//   10   19:istore          6
		com.google.ads.interactivemedia.v3.a.f.b.b(flag1);
	//   11   21:iload           6
	//   12   23:invokestatic    #28  <Method void b.b(boolean)>
		a = 2;
	//   13   26:aload_0         
	//   14   27:iconst_2        
	//   15   28:putfield        #23  <Field int a>
		a(i, l, flag);
	//   16   31:aload_0         
	//   17   32:iload_1         
	//   18   33:lload_2         
	//   19   34:iload           4
	//   20   36:invokevirtual   #30  <Method void a(int, long, boolean)>
	//   21   39:return          
	}

	protected abstract void b(long l, long l1)
		throws f;

	protected void c()
		throws f
	{
	//    0    0:return          
	}

	protected abstract boolean c(long l)
		throws f;

	protected void d()
		throws f
	{
	//    0    0:return          
	}

	protected abstract void d(long l)
		throws f;

	protected abstract boolean e();

	final int f(long l)
		throws f
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #41  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #48  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	protected abstract boolean f();

	protected void g()
		throws f
	{
	//    0    0:return          
	}

	protected abstract long q();

	protected abstract long r();

	protected abstract void s()
		throws f;

	protected void t()
		throws f
	{
	//    0    0:return          
	}

	protected abstract int u();

	protected final int v()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int a>
	//    2    4:ireturn         
	}

	final void w()
		throws f
	{
		boolean flag;
		if(a == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int a>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		com.google.ads.interactivemedia.v3.a.f.b.b(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #28  <Method void b.b(boolean)>
		a = 3;
	//   11   19:aload_0         
	//   12   20:iconst_3        
	//   13   21:putfield        #23  <Field int a>
		c();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #60  <Method void c()>
	//   16   28:return          
	}

	final void x()
		throws f
	{
		boolean flag;
		if(a == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int a>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		com.google.ads.interactivemedia.v3.a.f.b.b(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #28  <Method void b.b(boolean)>
		a = 2;
	//   11   19:aload_0         
	//   12   20:iconst_2        
	//   13   21:putfield        #23  <Field int a>
		d();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #63  <Method void d()>
	//   16   28:return          
	}

	final void y()
		throws f
	{
		boolean flag;
		if(a == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int a>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		com.google.ads.interactivemedia.v3.a.f.b.b(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #28  <Method void b.b(boolean)>
		a = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #23  <Field int a>
		g();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #66  <Method void g()>
	//   16   28:return          
	}

	final void z()
		throws f
	{
		int i = a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int a>
	//    2    4:istore_1        
		boolean flag;
		if(i != 2 && i != 3 && i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          25
	//*   6   10:iload_1         
	//*   7   11:iconst_3        
	//*   8   12:icmpeq          25
	//*   9   15:iload_1         
	//*  10   16:iconst_m1       
	//*  11   17:icmpeq          25
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore_2        
		else
	//*  14   22:goto            27
			flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_2        
		com.google.ads.interactivemedia.v3.a.f.b.b(flag);
	//   17   27:iload_2         
	//   18   28:invokestatic    #28  <Method void b.b(boolean)>
		a = -1;
	//   19   31:aload_0         
	//   20   32:iconst_m1       
	//   21   33:putfield        #23  <Field int a>
		t();
	//   22   36:aload_0         
	//   23   37:invokevirtual   #69  <Method void t()>
	//   24   40:return          
	}

	private int a;
}
