// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaj, zzaam

class zzaaj$zzb$1 extends zzaan.zza
{

	public void zzvA()
	{
		zzaaj.zza(zzaAe.zzaAa, zzaAd);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzaaj$zzb zzaAe>
	//    2    4:getfield        #30  <Field zzaaj zzaaj$zzb.zzaAa>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field ConnectionResult zzaAd>
	//    5   11:invokestatic    #34  <Method void zzaaj.zza(zzaaj, ConnectionResult)>
	//    6   14:return          
	}

	final ConnectionResult zzaAd;
	final zzaaj.zzb zzaAe;

	zzaaj$zzb$1(zzaaj.zzb zzb1, zzaam zzaam, ConnectionResult connectionresult)
	{
		zzaAe = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzaaj$zzb zzaAe>
		zzaAd = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field ConnectionResult zzaAd>
		super(zzaam);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #25  <Method void zzaan$zza(zzaam)>
	//    9   15:return          
	}
}
