// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzzv

final class zzzx
	implements Runnable
{

	zzzx(zzzv zzzv1, AdOverlayInfoParcel adoverlayinfoparcel)
	{
		zzbvr = zzzv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzzv zzbvr>
		zzzc = adoverlayinfoparcel;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field AdOverlayInfoParcel zzzc>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzbv.zzei();
	//    0    0:invokestatic    #27  <Method zzl zzbv.zzei()>
	//    1    3:pop             
		zzl.zza(((android.content.Context) (zzzv.zzb(zzbvr))), zzzc, true);
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field zzzv zzbvr>
	//    4    8:invokestatic    #33  <Method android.app.Activity zzzv.zzb(zzzv)>
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field AdOverlayInfoParcel zzzc>
	//    7   15:iconst_1        
	//    8   16:invokestatic    #39  <Method void zzl.zza(android.content.Context, AdOverlayInfoParcel, boolean)>
	//    9   19:return          
	}

	private final zzzv zzbvr;
	private final AdOverlayInfoParcel zzzc;
}
