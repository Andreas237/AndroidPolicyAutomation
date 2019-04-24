// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzoe, zznz, zzoa

public final class zzog extends zzoe
{

	public zzog(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzoe()>
		zzasz = oncustomrenderedadloadedlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field OnCustomRenderedAdLoadedListener zzasz>
	//    5    9:return          
	}

	public final void zza(zzoa zzoa)
	{
		zzasz.onCustomRenderedAdLoaded(((com.google.android.gms.ads.doubleclick.CustomRenderedAd) (new zznz(zzoa))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field OnCustomRenderedAdLoadedListener zzasz>
	//    2    4:new             #19  <Class zznz>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #21  <Method void zznz(zzoa)>
	//    6   12:invokeinterface #27  <Method void OnCustomRenderedAdLoadedListener.onCustomRenderedAdLoaded(com.google.android.gms.ads.doubleclick.CustomRenderedAd)>
	//    7   17:return          
	}

	private final OnCustomRenderedAdLoadedListener zzasz;
}
