// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asi, atx, aok, aom, 
//			anj

public final class aol extends asi
	implements atx
{

	private aol()
	{
		super(((ash) (aok.c())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method aok aok.c()>
	//    2    4:invokespecial   #17  <Method void asi(ash)>
	//    3    7:return          
	}

	aol(aom aom)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void aol()>
	//    2    4:return          
	}

	public final aol a(anj anj)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		aok.a((aok)a, anj);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class aok>
	//    5   11:aload_1         
	//    6   12:invokestatic    #32  <Method void aok.a(aok, anj)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final aol a(String s)
	{
		((asi)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void asi.b()>
		aok.a((aok)a, s);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ash a>
	//    4    8:checkcast       #10  <Class aok>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void aok.a(aok, String)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
