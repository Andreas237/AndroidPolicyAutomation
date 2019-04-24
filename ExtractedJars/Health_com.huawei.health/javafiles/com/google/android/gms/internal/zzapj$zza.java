// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapj

static class zzapj$zza extends zzapt$zza
{

	public void zza(BleDevicesResult bledevicesresult)
	{
		zzaGN.setResult(((Object) (bledevicesresult)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaad$zzb zzaGN>
	//    2    4:aload_1         
	//    3    5:invokeinterface #30  <Method void zzaad$zzb.setResult(Object)>
	//    4   10:return          
	}

	private final zzaad$zzb zzaGN;

	private zzapj$zza(zzaad$zzb zzaad$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzapt$zza()>
		zzaGN = zzaad$zzb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
	//    5    9:return          
	}

	zzapj$zza(zzaad$zzb zzaad$zzb1, zzapj._cls1 _pcls1)
	{
		this(zzaad$zzb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void zzapj$zza(zzaad$zzb)>
	//    3    5:return          
	}
}
