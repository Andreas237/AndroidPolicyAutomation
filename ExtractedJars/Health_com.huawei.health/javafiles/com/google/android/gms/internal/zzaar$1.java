// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.zze;

// Referenced classes of package com.google.android.gms.internal:
//			zzaar

class zzaar$1
	implements Runnable
{

	public void run()
	{
		zzaar.zzb(zzaBA).zzaF(zzaar.zza(zzaBA));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaar zzaBA>
	//    2    4:invokestatic    #25  <Method zze zzaar.zzb(zzaar)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field zzaar zzaBA>
	//    5   11:invokestatic    #29  <Method android.content.Context zzaar.zza(zzaar)>
	//    6   14:invokevirtual   #35  <Method void zze.zzaF(android.content.Context)>
	//    7   17:return          
	}

	final zzaar zzaBA;

	zzaar$1(zzaar zzaar1)
	{
		zzaBA = zzaar1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzaar zzaBA>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
