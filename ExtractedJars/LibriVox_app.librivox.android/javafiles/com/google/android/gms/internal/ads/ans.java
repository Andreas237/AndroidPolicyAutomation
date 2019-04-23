// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, anr, anv, 
//			ant

public final class ans extends asi
	implements atx
{

	private ans()
	{
		super(((ash) (anr.b())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method anr anr.b()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	ans(anv anv)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ans()>
	//    2    4:return          
	}

	public final ans a(int i)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method void asi.b()>
		anr.a((anr)a, i);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field ash a>
	//    4    8:checkcast       #10  <Class anr>
	//    5   11:iload_1         
	//    6   12:invokestatic    #31  <Method void anr.a(anr, int)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final ans a(ant ant)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method void asi.b()>
		anr.a((anr)a, ant);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field ash a>
	//    4    8:checkcast       #10  <Class anr>
	//    5   11:aload_1         
	//    6   12:invokestatic    #35  <Method void anr.a(anr, ant)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
