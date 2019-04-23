// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzf, zzk, zzs, zzg

static abstract class zzk$zzb extends zzf
{

	protected Result createFailedResult(Status status)
	{
		return ((Result) (new zzk$zza(status, ((com.google.android.gms.safetynet.zza) (null)))));
	//    0    0:new             #26  <Class zzk$zza>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void zzk$zza(Status, com.google.android.gms.safetynet.zza)>
	//    5    9:areturn         
	}

	protected zzg zzaf;

	public zzk$zzb(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void zzf(GoogleApiClient)>
		zzaf = ((zzg) (new zzs(this)));
	//    3    5:aload_0         
	//    4    6:new             #16  <Class zzs>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void zzs(zzk$zzb)>
	//    8   14:putfield        #21  <Field zzg zzaf>
	//    9   17:return          
	}
}
