// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;


// Referenced classes of package com.google.android.gms.internal.icing:
//			bq, da, r, z

public final class s extends bq
	implements da
{

	private s()
	{
		super(((bp) (r.b())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method r r.b()>
	//    2    4:invokespecial   #17  <Method void bq(bp)>
	//    3    7:return          
	}

	s(z z)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void s()>
	//    2    4:return          
	}

	public final s a(int i)
	{
		((bq)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method void bq.b()>
		r.a((r)a, i);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field bp a>
	//    4    8:checkcast       #10  <Class r>
	//    5   11:iload_1         
	//    6   12:invokestatic    #31  <Method void r.a(r, int)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final s a(String s1)
	{
		((bq)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method void bq.b()>
		r.a((r)a, s1);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field bp a>
	//    4    8:checkcast       #10  <Class r>
	//    5   11:aload_1         
	//    6   12:invokestatic    #35  <Method void r.a(r, String)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final s b(String s1)
	{
		((bq)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method void bq.b()>
		r.b((r)a, s1);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field bp a>
	//    4    8:checkcast       #10  <Class r>
	//    5   11:aload_1         
	//    6   12:invokestatic    #37  <Method void r.b(r, String)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
