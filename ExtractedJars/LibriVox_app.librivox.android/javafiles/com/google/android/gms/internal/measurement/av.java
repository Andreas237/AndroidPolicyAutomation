// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			eu, gi, au, az

public final class av extends eu
	implements gi
{

	private av()
	{
		super(((et) (au.b())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method au au.b()>
	//    2    4:invokespecial   #17  <Method void eu(et)>
	//    3    7:return          
	}

	av(az az)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void av()>
	//    2    4:return          
	}

	public final av a(long l)
	{
		((eu)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method void eu.b()>
		au.a((au)a, l);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field et a>
	//    4    8:checkcast       #10  <Class au>
	//    5   11:lload_1         
	//    6   12:invokestatic    #31  <Method void au.a(au, long)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public final av a(String s)
	{
		((eu)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method void eu.b()>
		au.a((au)a, s);
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field et a>
	//    4    8:checkcast       #10  <Class au>
	//    5   11:aload_1         
	//    6   12:invokestatic    #35  <Method void au.a(au, String)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
