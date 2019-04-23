// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, alh, alj, 
//			aqq

public final class ali extends asi
	implements atx
{

	private ali()
	{
		super(((ash) (alh.d())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method alh alh.d()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	ali(alj alj)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ali()>
	//    2    4:return          
	}

	public final ali a(int i)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		alh.a((alh)a, 0);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class alh>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #32  <Method void alh.a(alh, int)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final ali a(aqq aqq)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		alh.a((alh)a, aqq);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class alh>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void alh.a(alh, aqq)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
