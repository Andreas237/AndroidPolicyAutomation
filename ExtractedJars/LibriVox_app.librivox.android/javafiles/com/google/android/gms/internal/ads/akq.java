// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, akp, akr, 
//			akv, aqq

public final class akq extends asi
	implements atx
{

	private akq()
	{
		super(((ash) (akp.f())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method akp akp.f()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	akq(akr akr)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void akq()>
	//    2    4:return          
	}

	public final akq a(int i)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		akp.a((akp)a, 0);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class akp>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #32  <Method void akp.a(akp, int)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final akq a(akv akv)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		akp.a((akp)a, akv);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class akp>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void akp.a(akp, akv)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final akq a(aqq aqq)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		akp.a((akp)a, aqq);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class akp>
	//    5   11:aload_1         
	//    6   12:invokestatic    #40  <Method void akp.a(akp, aqq)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
