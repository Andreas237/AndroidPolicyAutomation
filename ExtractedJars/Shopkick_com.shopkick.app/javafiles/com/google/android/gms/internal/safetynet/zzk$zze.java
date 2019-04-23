// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzf, zzk, zzv, zzg

static abstract class zzk$zze extends zzf
{

	protected Result createFailedResult(Status status)
	{
		return ((Result) (new zzk$zzh(status, ((com.google.android.gms.safetynet.zzf) (null)))));
	//    0    0:new             #26  <Class zzk$zzh>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void zzk$zzh(Status, com.google.android.gms.safetynet.zzf)>
	//    5    9:areturn         
	}

	protected zzg zzaf;

	public zzk$zze(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void zzf(GoogleApiClient)>
		zzaf = ((zzg) (new zzv(this)));
	//    3    5:aload_0         
	//    4    6:new             #16  <Class zzv>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void zzv(zzk$zze)>
	//    8   14:putfield        #21  <Field zzg zzaf>
	//    9   17:return          
	}
}
