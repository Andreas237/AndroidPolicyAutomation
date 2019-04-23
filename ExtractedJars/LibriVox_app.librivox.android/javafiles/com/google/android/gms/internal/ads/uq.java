// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			uz, uv, uo, up, 
//			ur, zzawd

public final class uq extends uz
{

	public uq(up up1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void uz()>
		c = up1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field up c>
	//    5    9:return          
	}

	public final void a(Bundle bundle)
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field uv d>
	//*   2    4:ifnull          17
			d.a(bundle);
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field uv d>
	//    5   11:aload_1         
	//    6   12:invokeinterface #28  <Method void com.google.android.gms.internal.ads.uv.a(Bundle)>
	//    7   17:return          
	}

	public final void a(a a1)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field uo a>
	//*   2    4:ifnull          16
			a.g();
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field uo a>
	//    5   11:invokeinterface #36  <Method void uo.g()>
	//    6   16:return          
	}

	public final void a(a a1, int i)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field uo a>
	//*   2    4:ifnull          17
			a.a(i);
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field uo a>
	//    5   11:iload_2         
	//    6   12:invokeinterface #40  <Method void com.google.android.gms.internal.ads.uo.a(int)>
	//    7   17:return          
	}

	public final void a(a a1, zzawd zzawd)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field up c>
	//*   2    4:ifnull          17
			c.a(zzawd);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field up c>
	//    5   11:aload_2         
	//    6   12:invokeinterface #46  <Method void com.google.android.gms.internal.ads.up.a(zzawd)>
	//    7   17:return          
	}

	public final void a(uo uo1)
	{
		a = uo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field uo a>
	//    3    5:return          
	}

	public final void a(ur ur1)
	{
		b = ur1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field ur b>
	//    3    5:return          
	}

	public final void a(uv uv1)
	{
		d = uv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field uv d>
	//    3    5:return          
	}

	public final void b(a a1)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field ur b>
	//*   2    4:ifnull          26
			b.a(com.google.android.gms.c.d.a(a1).getClass().getName());
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field ur b>
	//    5   11:aload_1         
	//    6   12:invokestatic    #56  <Method Object d.a(a)>
	//    7   15:invokevirtual   #62  <Method Class Object.getClass()>
	//    8   18:invokevirtual   #68  <Method String Class.getName()>
	//    9   21:invokeinterface #73  <Method void com.google.android.gms.internal.ads.ur.a(String)>
	//   10   26:return          
	}

	public final void b(a a1, int i)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field ur b>
	//*   2    4:ifnull          27
			b.a(com.google.android.gms.c.d.a(a1).getClass().getName(), i);
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field ur b>
	//    5   11:aload_1         
	//    6   12:invokestatic    #56  <Method Object d.a(a)>
	//    7   15:invokevirtual   #62  <Method Class Object.getClass()>
	//    8   18:invokevirtual   #68  <Method String Class.getName()>
	//    9   21:iload_2         
	//   10   22:invokeinterface #76  <Method void com.google.android.gms.internal.ads.ur.a(String, int)>
	//   11   27:return          
	}

	public final void c(a a1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field up c>
	//*   2    4:ifnull          16
			c.l_();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field up c>
	//    5   11:invokeinterface #79  <Method void up.l_()>
	//    6   16:return          
	}

	public final void d(a a1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field up c>
	//*   2    4:ifnull          16
			c.b();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field up c>
	//    5   11:invokeinterface #81  <Method void up.b()>
	//    6   16:return          
	}

	public final void e(a a1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field up c>
	//*   2    4:ifnull          16
			c.c();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field up c>
	//    5   11:invokeinterface #84  <Method void up.c()>
	//    6   16:return          
	}

	public final void f(a a1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field up c>
	//*   2    4:ifnull          16
			c.n_();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field up c>
	//    5   11:invokeinterface #88  <Method void up.n_()>
	//    6   16:return          
	}

	public final void g(a a1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field up c>
	//*   2    4:ifnull          16
			c.o_();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field up c>
	//    5   11:invokeinterface #91  <Method void up.o_()>
	//    6   16:return          
	}

	public final void h(a a1)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field up c>
	//*   2    4:ifnull          16
			c.m_();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field up c>
	//    5   11:invokeinterface #95  <Method void up.m_()>
	//    6   16:return          
	}

	private volatile uo a;
	private volatile ur b;
	private volatile up c;
	private volatile uv d;
}
