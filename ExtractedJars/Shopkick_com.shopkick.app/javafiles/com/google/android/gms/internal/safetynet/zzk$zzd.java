// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzf, zzk, zzu, zzg

static abstract class zzk$zzd extends zzf
{

	protected Result createFailedResult(Status status)
	{
		return ((Result) (new zzk$zzg(status, ((com.google.android.gms.safetynet.zzd) (null)))));
	//    0    0:new             #26  <Class zzk$zzg>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void zzk$zzg(Status, com.google.android.gms.safetynet.zzd)>
	//    5    9:areturn         
	}

	protected final zzg zzaf = new zzu(this);

	public zzk$zzd(GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void zzf(GoogleApiClient)>
	//    3    5:aload_0         
	//    4    6:new             #16  <Class zzu>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void zzu(zzk$zzd)>
	//    8   14:putfield        #21  <Field zzg zzaf>
	//    9   17:return          
	}
}
