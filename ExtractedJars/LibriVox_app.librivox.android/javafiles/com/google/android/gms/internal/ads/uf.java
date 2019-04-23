// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ub, ud, tp

public final class uf extends ub
{

	public uf(d d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ub()>
		a = d1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field d a>
	//    5    9:return          
	}

	public final void a()
	{
		d d1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field d a>
	//    2    4:astore_1        
		if(d1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			d1.a();
	//    5    9:aload_1         
	//    6   10:invokeinterface #19  <Method void d.a()>
	//    7   15:return          
	}

	public final void a(int i)
	{
		d d1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field d a>
	//    2    4:astore_2        
		if(d1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			d1.a(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #22  <Method void d.a(int)>
	//    8   16:return          
	}

	public final void a(tp tp)
	{
		d d1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field d a>
	//    2    4:astore_2        
		if(d1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
			d1.a(((com.google.android.gms.ads.reward.b) (new ud(tp))));
	//    5    9:aload_2         
	//    6   10:new             #25  <Class ud>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #27  <Method void ud(tp)>
	//   10   18:invokeinterface #30  <Method void d.a(com.google.android.gms.ads.reward.b)>
	//   11   23:return          
	}

	public final void b()
	{
		d d1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field d a>
	//    2    4:astore_1        
		if(d1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			d1.b();
	//    5    9:aload_1         
	//    6   10:invokeinterface #33  <Method void d.b()>
	//    7   15:return          
	}

	public final void c()
	{
		d d1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field d a>
	//    2    4:astore_1        
		if(d1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			d1.c();
	//    5    9:aload_1         
	//    6   10:invokeinterface #36  <Method void d.c()>
	//    7   15:return          
	}

	public final void d()
	{
		d d1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field d a>
	//    2    4:astore_1        
		if(d1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			d1.d();
	//    5    9:aload_1         
	//    6   10:invokeinterface #39  <Method void d.d()>
	//    7   15:return          
	}

	public final void e()
	{
		d d1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field d a>
	//    2    4:astore_1        
		if(d1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			d1.e();
	//    5    9:aload_1         
	//    6   10:invokeinterface #42  <Method void d.e()>
	//    7   15:return          
	}

	public final void f()
	{
		d d1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field d a>
	//    2    4:astore_1        
		if(d1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			d1.f();
	//    5    9:aload_1         
	//    6   10:invokeinterface #45  <Method void d.f()>
	//    7   15:return          
	}

	private d a;
}
