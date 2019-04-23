// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, amy, anb, 
//			ana, aqq

public final class amz extends asi
	implements atx
{

	private amz()
	{
		super(((ash) (amy.f())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method amy amy.f()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	amz(anb anb)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void amz()>
	//    2    4:return          
	}

	public final amz a(ana ana)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amy.a((amy)a, ana);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amy>
	//    5   11:aload_1         
	//    6   12:invokestatic    #32  <Method void amy.a(amy, ana)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final amz a(aqq aqq)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amy.a((amy)a, aqq);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amy>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void amy.a(amy, aqq)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final amz a(String s)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		amy.a((amy)a, s);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class amy>
	//    5   11:aload_1         
	//    6   12:invokestatic    #40  <Method void amy.a(amy, String)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
