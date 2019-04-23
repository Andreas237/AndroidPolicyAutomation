// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			bs, dj, jm, jo

public final class jn extends bs
	implements dj
{

	private jn()
	{
		super(((br) (jm.q())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method jm jm.q()>
	//    2    4:invokespecial   #17  <Method void bs(br)>
	//    3    7:return          
	}

	jn(jo jo)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void jn()>
	//    2    4:return          
	}

	public final jn a(long l)
	{
		((bs)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void bs.b()>
		jm.a((jm)a, l);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field br a>
	//    4    8:checkcast       #10  <Class jm>
	//    5   11:lload_1         
	//    6   12:invokestatic    #32  <Method void jm.a(jm, long)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final jn a(String s)
	{
		((bs)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void bs.b()>
		jm.a((jm)a, s);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field br a>
	//    4    8:checkcast       #10  <Class jm>
	//    5   11:aload_1         
	//    6   12:invokestatic    #36  <Method void jm.a(jm, String)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final jn b(long l)
	{
		((bs)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void bs.b()>
		jm.b((jm)a, l);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field br a>
	//    4    8:checkcast       #10  <Class jm>
	//    5   11:lload_1         
	//    6   12:invokestatic    #38  <Method void jm.b(jm, long)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
