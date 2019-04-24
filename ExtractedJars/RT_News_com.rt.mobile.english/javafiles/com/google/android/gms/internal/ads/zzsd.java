// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzrm, zzru, zzrr

public final class zzsd extends zzrm
{

	public zzsd(com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onunifiednativeadloadedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzrm()>
		zzblj = onunifiednativeadloadedlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field com.google.android.gms.ads.formats.UnifiedNativeAd$OnUnifiedNativeAdLoadedListener zzblj>
	//    5    9:return          
	}

	public final void zza(zzrr zzrr)
	{
		zzblj.onUnifiedNativeAdLoaded(((com.google.android.gms.ads.formats.UnifiedNativeAd) (new zzru(zzrr))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.google.android.gms.ads.formats.UnifiedNativeAd$OnUnifiedNativeAdLoadedListener zzblj>
	//    2    4:new             #19  <Class zzru>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #21  <Method void zzru(zzrr)>
	//    6   12:invokeinterface #27  <Method void com.google.android.gms.ads.formats.UnifiedNativeAd$OnUnifiedNativeAdLoadedListener.onUnifiedNativeAdLoaded(com.google.android.gms.ads.formats.UnifiedNativeAd)>
	//    7   17:return          
	}

	private final com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zzblj;
}
