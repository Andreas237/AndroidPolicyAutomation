// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, amc, ame, 
//			amf, aqq

public final class amd extends asi
	implements atx
{

	private amd()
	{
		super(((ash) (amc.e())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method amc amc.e()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	amd(ame ame)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void amd()>
	//    2    4:return          
	}

	public final amd a(int i)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amc.a((amc)a, 0);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amc>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #32  <Method void amc.a(amc, int)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final amd a(amf amf)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amc.a((amc)a, amf);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amc>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void amc.a(amc, amf)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final amd a(aqq aqq)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amc.a((amc)a, aqq);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amc>
	//    5   11:aload_1         
	//    6   12:invokestatic    #40  <Method void amc.a(amc, aqq)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
