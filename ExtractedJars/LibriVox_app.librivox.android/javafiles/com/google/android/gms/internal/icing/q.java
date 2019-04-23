// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;


// Referenced classes of package com.google.android.gms.internal.icing:
//			bq, da, p, z

public final class q extends bq
	implements da
{

	private q()
	{
		super(((bp) (p.b())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method p p.b()>
	//    2    4:invokespecial   #17  <Method void bq(bp)>
	//    3    7:return          
	}

	q(z z)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void q()>
	//    2    4:return          
	}

	public final q a(Iterable iterable)
	{
		((bq)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method void bq.b()>
		p.a((p)a, iterable);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field bp a>
	//    4    8:checkcast       #10  <Class p>
	//    5   11:aload_1         
	//    6   12:invokestatic    #31  <Method void p.a(p, Iterable)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
