// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzf;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzalo, zzuu

final class zzwo
	implements zzalo
{

	zzwo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final void zze(Object obj)
	{
		obj = ((Object) ((zzuu)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #16  <Class zzuu>
	//    2    4:astore_1        
		((zzuu) (obj)).zza("/log", zzf.zzblu);
	//    3    5:aload_1         
	//    4    6:ldc1            #18  <String "/log">
	//    5    8:getstatic       #24  <Field com.google.android.gms.ads.internal.gmsg.zzv zzf.zzblu>
	//    6   11:invokeinterface #28  <Method void zzuu.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
		((zzuu) (obj)).zza("/result", ((com.google.android.gms.ads.internal.gmsg.zzv) (zzf.zzbmc)));
	//    7   16:aload_1         
	//    8   17:ldc1            #30  <String "/result">
	//    9   19:getstatic       #34  <Field com.google.android.gms.ads.internal.gmsg.zzaf zzf.zzbmc>
	//   10   22:invokeinterface #28  <Method void zzuu.zza(String, com.google.android.gms.ads.internal.gmsg.zzv)>
	//   11   27:return          
	}
}
