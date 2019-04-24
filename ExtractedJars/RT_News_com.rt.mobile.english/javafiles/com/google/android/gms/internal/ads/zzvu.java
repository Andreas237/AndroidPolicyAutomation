// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzakb, zzvs, zzvw

final class zzvu
	implements zzaoo
{

	zzvu(zzvs zzvs1)
	{
		zzbqs = zzvs1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzvs zzbqs>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zze(Object obj)
	{
		zzakb.v("Releasing engine reference.");
	//    0    0:ldc1            #21  <String "Releasing engine reference.">
	//    1    2:invokestatic    #27  <Method void zzakb.v(String)>
		zzvs.zza(zzbqs).zzma();
	//    2    5:aload_0         
	//    3    6:getfield        #13  <Field zzvs zzbqs>
	//    4    9:invokestatic    #33  <Method zzvw zzvs.zza(zzvs)>
	//    5   12:invokevirtual   #38  <Method void zzvw.zzma()>
	//    6   15:return          
	}

	private final zzvs zzbqs;
}
