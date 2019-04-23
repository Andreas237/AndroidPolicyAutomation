// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			eu, gi, aw, az, 
//			au

public final class ax extends eu
	implements gi
{

	private ax()
	{
		super(((et) (aw.c())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method aw aw.c()>
	//    2    4:invokespecial   #17  <Method void eu(et)>
	//    3    7:return          
	}

	ax(az az)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ax()>
	//    2    4:return          
	}

	public final ax a(au au)
	{
		((eu)this).b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method void eu.b()>
		aw.a((aw)a, au);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field et a>
	//    4    8:checkcast       #10  <Class aw>
	//    5   11:aload_1         
	//    6   12:invokestatic    #32  <Method void aw.a(aw, au)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}
}
