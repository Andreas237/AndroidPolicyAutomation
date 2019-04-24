// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaom, zzvs, zzvw

final class zzvv
	implements zzaom
{

	zzvv(zzvs zzvs1)
	{
		zzbqs = zzvs1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzvs zzbqs>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzvs.zza(zzbqs).zzma();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzvs zzbqs>
	//    2    4:invokestatic    #23  <Method zzvw zzvs.zza(zzvs)>
	//    3    7:invokevirtual   #28  <Method void zzvw.zzma()>
	//    4   10:return          
	}

	private final zzvs zzbqs;
}
