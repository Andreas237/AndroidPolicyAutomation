// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;


// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcw, zzav, zzcr

static final class zzcw$zzg extends zzcw$zzb
{

	public void zza(zzav zzav1)
	{
		zzaa(((Object) (new zzn.zze(zzcr.zzik(zzav1.statusCode), ((com.google.android.gms.wearable.CapabilityInfo) (new zzn.zzc(((com.google.android.gms.wearable.CapabilityInfo) (zzav1.zzbUu)))))))));
	//    0    0:aload_0         
	//    1    1:new             #19  <Class zzn$zze>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:getfield        #25  <Field int zzav.statusCode>
	//    5    9:invokestatic    #31  <Method com.google.android.gms.common.api.Status zzcr.zzik(int)>
	//    6   12:new             #33  <Class zzn$zzc>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:getfield        #37  <Field zzo zzav.zzbUu>
	//   10   20:invokespecial   #40  <Method void zzn$zzc(com.google.android.gms.wearable.CapabilityInfo)>
	//   11   23:invokespecial   #43  <Method void zzn$zze(com.google.android.gms.common.api.Status, com.google.android.gms.wearable.CapabilityInfo)>
	//   12   26:invokevirtual   #47  <Method void zzaa(Object)>
	//   13   29:return          
	}

	public zzcw$zzg(com.google.android.gms.internal. )
	{
		super();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
	//    3    5:return          
	}
}
