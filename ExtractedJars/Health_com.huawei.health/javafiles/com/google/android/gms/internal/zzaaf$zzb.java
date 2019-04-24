// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzaaf

final class zzaaf$zzb
{

	protected void finalize()
		throws Throwable
	{
		zzaaf.zzd(zzaaf.zza(zzaAt));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzaaf zzaAt>
	//    2    4:invokestatic    #27  <Method com.google.android.gms.common.api.Result zzaaf.zza(zzaaf)>
	//    3    7:invokestatic    #31  <Method void zzaaf.zzd(com.google.android.gms.common.api.Result)>
		super.finalize();
	//    4   10:aload_0         
	//    5   11:invokespecial   #33  <Method void Object.finalize()>
	//    6   14:return          
	}

	final zzaaf zzaAt;

	private zzaaf$zzb(zzaaf zzaaf1)
	{
		zzaAt = zzaaf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzaaf zzaAt>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	zzaaf$zzb(zzaaf zzaaf1, zzaaf._cls1 _pcls1)
	{
		this(zzaaf1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void zzaaf$zzb(zzaaf)>
	//    3    5:return          
	}
}
