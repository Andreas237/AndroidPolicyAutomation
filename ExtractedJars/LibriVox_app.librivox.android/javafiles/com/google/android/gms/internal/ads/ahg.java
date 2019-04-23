// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.m;

// Referenced classes of package com.google.android.gms.internal.ads:
//			afn

final class ahg
	implements m
{

	public ahg(afn afn1, m m1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = afn1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field afn a>
		b = m1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field m b>
	//    8   14:return          
	}

	public final void d()
	{
	//    0    0:return          
	}

	public final void f()
	{
	//    0    0:return          
	}

	public final void g()
	{
		b.g();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field m b>
	//    2    4:invokeinterface #25  <Method void m.g()>
		a.p();
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field afn a>
	//    5   13:invokeinterface #30  <Method void afn.p()>
	//    6   18:return          
	}

	public final void p_()
	{
		b.p_();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field m b>
	//    2    4:invokeinterface #33  <Method void m.p_()>
		a.o();
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field afn a>
	//    5   13:invokeinterface #36  <Method void afn.o()>
	//    6   18:return          
	}

	private afn a;
	private m b;
}
