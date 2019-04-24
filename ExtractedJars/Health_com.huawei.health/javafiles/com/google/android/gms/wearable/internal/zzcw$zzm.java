// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;


// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcw, zzbp, zzcr

static final class zzcw$zzm extends zzcw$zzb
{

	public void zza(zzbp zzbp1)
	{
		zzaa(((Object) (new zzah$zzc(zzcr.zzik(zzbp1.statusCode), zzbp1.zzbyd))));
	//    0    0:aload_0         
	//    1    1:new             #19  <Class zzah$zzc>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:getfield        #25  <Field int zzbp.statusCode>
	//    5    9:invokestatic    #31  <Method com.google.android.gms.common.api.Status zzcr.zzik(int)>
	//    6   12:aload_1         
	//    7   13:getfield        #35  <Field android.os.ParcelFileDescriptor zzbp.zzbyd>
	//    8   16:invokespecial   #38  <Method void zzah$zzc(com.google.android.gms.common.api.Status, android.os.ParcelFileDescriptor)>
	//    9   19:invokevirtual   #42  <Method void zzaa(Object)>
	//   10   22:return          
	}

	public zzcw$zzm(com.google.android.gms.internal. )
	{
		super();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
	//    3    5:return          
	}
}
