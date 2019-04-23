// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, amp, amr, 
//			amv, aqq

public final class amq extends asi
	implements atx
{

	private amq()
	{
		super(((ash) (amp.f())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method amp amp.f()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	amq(amr amr)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void amq()>
	//    2    4:return          
	}

	public final amq a(int i)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amp.a((amp)a, 0);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amp>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #32  <Method void amp.a(amp, int)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final amq a(amv amv)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amp.a((amp)a, amv);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amp>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void amp.a(amp, amv)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final amq a(aqq aqq)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amp.a((amp)a, aqq);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amp>
	//    5   11:aload_1         
	//    6   12:invokestatic    #40  <Method void amp.a(amp, aqq)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
