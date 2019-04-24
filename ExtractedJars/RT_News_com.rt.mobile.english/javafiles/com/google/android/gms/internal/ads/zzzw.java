// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzane, zzzv

final class zzzw
	implements zzn
{

	zzzw(zzzv zzzv1)
	{
		zzbvr = zzzv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzzv zzbvr>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onPause()
	{
		zzane.zzck("AdMobCustomTabsAdapter overlay is paused.");
	//    0    0:ldc1            #19  <String "AdMobCustomTabsAdapter overlay is paused.">
	//    1    2:invokestatic    #25  <Method void zzane.zzck(String)>
	//    2    5:return          
	}

	public final void onResume()
	{
		zzane.zzck("AdMobCustomTabsAdapter overlay is resumed.");
	//    0    0:ldc1            #28  <String "AdMobCustomTabsAdapter overlay is resumed.">
	//    1    2:invokestatic    #25  <Method void zzane.zzck(String)>
	//    2    5:return          
	}

	public final void zzcb()
	{
		zzane.zzck("AdMobCustomTabsAdapter overlay is closed.");
	//    0    0:ldc1            #31  <String "AdMobCustomTabsAdapter overlay is closed.">
	//    1    2:invokestatic    #25  <Method void zzane.zzck(String)>
		zzzv.zza(zzbvr).onAdClosed(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzbvr)));
	//    2    5:aload_0         
	//    3    6:getfield        #12  <Field zzzv zzbvr>
	//    4    9:invokestatic    #37  <Method MediationInterstitialListener zzzv.zza(zzzv)>
	//    5   12:aload_0         
	//    6   13:getfield        #12  <Field zzzv zzbvr>
	//    7   16:invokeinterface #43  <Method void MediationInterstitialListener.onAdClosed(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    8   21:return          
	}

	public final void zzcc()
	{
		zzane.zzck("Opening AdMobCustomTabsAdapter overlay.");
	//    0    0:ldc1            #46  <String "Opening AdMobCustomTabsAdapter overlay.">
	//    1    2:invokestatic    #25  <Method void zzane.zzck(String)>
		zzzv.zza(zzbvr).onAdOpened(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzbvr)));
	//    2    5:aload_0         
	//    3    6:getfield        #12  <Field zzzv zzbvr>
	//    4    9:invokestatic    #37  <Method MediationInterstitialListener zzzv.zza(zzzv)>
	//    5   12:aload_0         
	//    6   13:getfield        #12  <Field zzzv zzbvr>
	//    7   16:invokeinterface #49  <Method void MediationInterstitialListener.onAdOpened(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    8   21:return          
	}

	private final zzzv zzbvr;
}
