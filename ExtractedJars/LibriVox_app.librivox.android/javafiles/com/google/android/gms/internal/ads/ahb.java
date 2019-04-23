// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwf

public final class ahb
{

	private ahb(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		c = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int c>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int b>
		a = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field int a>
	//   11   19:return          
	}

	public static ahb a()
	{
		return new ahb(0, 0, 0);
	//    0    0:new             #2   <Class ahb>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokespecial   #24  <Method void ahb(int, int, int)>
	//    6   10:areturn         
	}

	public static ahb a(int i, int j)
	{
		return new ahb(1, i, j);
	//    0    0:new             #2   <Class ahb>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #24  <Method void ahb(int, int, int)>
	//    6   10:areturn         
	}

	public static ahb a(zzwf zzwf1)
	{
		if(zzwf1.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean zzwf.d>
	//*   2    4:ifeq            18
			return new ahb(3, 0, 0);
	//    3    7:new             #2   <Class ahb>
	//    4   10:dup             
	//    5   11:iconst_3        
	//    6   12:iconst_0        
	//    7   13:iconst_0        
	//    8   14:invokespecial   #24  <Method void ahb(int, int, int)>
	//    9   17:areturn         
		if(zzwf1.i)
	//*  10   18:aload_0         
	//*  11   19:getfield        #35  <Field boolean zzwf.i>
	//*  12   22:ifeq            36
			return new ahb(2, 0, 0);
	//   13   25:new             #2   <Class ahb>
	//   14   28:dup             
	//   15   29:iconst_2        
	//   16   30:iconst_0        
	//   17   31:iconst_0        
	//   18   32:invokespecial   #24  <Method void ahb(int, int, int)>
	//   19   35:areturn         
		if(zzwf1.h)
	//*  20   36:aload_0         
	//*  21   37:getfield        #38  <Field boolean zzwf.h>
	//*  22   40:ifeq            47
			return a();
	//   23   43:invokestatic    #40  <Method ahb a()>
	//   24   46:areturn         
		else
			return a(zzwf1.f, zzwf1.c);
	//   25   47:aload_0         
	//   26   48:getfield        #43  <Field int zzwf.f>
	//   27   51:aload_0         
	//   28   52:getfield        #44  <Field int zzwf.c>
	//   29   55:invokestatic    #46  <Method ahb a(int, int)>
	//   30   58:areturn         
	}

	public static ahb b()
	{
		return new ahb(4, 0, 0);
	//    0    0:new             #2   <Class ahb>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokespecial   #24  <Method void ahb(int, int, int)>
	//    6   10:areturn         
	}

	public static ahb c()
	{
		return new ahb(5, 0, 0);
	//    0    0:new             #2   <Class ahb>
	//    1    3:dup             
	//    2    4:iconst_5        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokespecial   #24  <Method void ahb(int, int, int)>
	//    6   10:areturn         
	}

	public final boolean d()
	{
		return c == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int c>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean e()
	{
		return c == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int c>
	//    2    4:iconst_3        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean f()
	{
		return c == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int c>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final boolean g()
	{
		return c == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int c>
	//    2    4:iconst_4        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean h()
	{
		return c == 5;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int c>
	//    2    4:iconst_5        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final int a;
	public final int b;
	private final int c;
}
