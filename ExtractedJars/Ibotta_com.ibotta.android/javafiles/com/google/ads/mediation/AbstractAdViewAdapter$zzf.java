// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.formats.*;
import com.google.android.gms.ads.mediation.MediationNativeListener;

// Referenced classes of package com.google.ads.mediation:
//			AbstractAdViewAdapter

static final class AbstractAdViewAdapter$zzf extends AdListener
	implements com.google.android.gms.ads.formats.stallAdLoadedListener, com.google.android.gms.ads.formats.dLoadedListener, com.google.android.gms.ads.formats.ustomClickListener, com.google.android.gms.ads.formats.ustomTemplateAdLoadedListener, com.google.android.gms.ads.formats.ativeAdLoadedListener
{

	public final void onAdClicked()
	{
		zzhk.onAdClicked(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #38  <Method void MediationNativeListener.onAdClicked(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    5   13:return          
	}

	public final void onAdClosed()
	{
		zzhk.onAdClosed(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #41  <Method void MediationNativeListener.onAdClosed(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    5   13:return          
	}

	public final void onAdFailedToLoad(int i)
	{
		zzhk.onAdFailedToLoad(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:iload_1         
	//    5    9:invokeinterface #46  <Method void MediationNativeListener.onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter, int)>
	//    6   14:return          
	}

	public final void onAdImpression()
	{
		zzhk.onAdImpression(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #49  <Method void MediationNativeListener.onAdImpression(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    5   13:return          
	}

	public final void onAdLeftApplication()
	{
		zzhk.onAdLeftApplication(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #52  <Method void MediationNativeListener.onAdLeftApplication(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    5   13:return          
	}

	public final void onAdLoaded()
	{
	//    0    0:return          
	}

	public final void onAdOpened()
	{
		zzhk.onAdOpened(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #56  <Method void MediationNativeListener.onAdOpened(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    5   13:return          
	}

	public final void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
	{
		zzhk.onAdLoaded(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)), ((com.google.android.gms.ads.mediation.NativeAdMapper) (new AbstractAdViewAdapter$zza(nativeappinstallad))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:new             #60  <Class AbstractAdViewAdapter$zza>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #62  <Method void AbstractAdViewAdapter$zza(NativeAppInstallAd)>
	//    8   16:invokeinterface #65  <Method void MediationNativeListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.mediation.NativeAdMapper)>
	//    9   21:return          
	}

	public final void onContentAdLoaded(NativeContentAd nativecontentad)
	{
		zzhk.onAdLoaded(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)), ((com.google.android.gms.ads.mediation.NativeAdMapper) (new AbstractAdViewAdapter$zzb(nativecontentad))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:new             #69  <Class AbstractAdViewAdapter$zzb>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #71  <Method void AbstractAdViewAdapter$zzb(NativeContentAd)>
	//    8   16:invokeinterface #65  <Method void MediationNativeListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.mediation.NativeAdMapper)>
	//    9   21:return          
	}

	public final void onCustomClick(NativeCustomTemplateAd nativecustomtemplatead, String s)
	{
		zzhk.zza(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)), nativecustomtemplatead, s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #77  <Method void MediationNativeListener.zza(com.google.android.gms.ads.mediation.MediationNativeAdapter, NativeCustomTemplateAd, String)>
	//    7   15:return          
	}

	public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativecustomtemplatead)
	{
		zzhk.zza(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)), nativecustomtemplatead);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:aload_1         
	//    5    9:invokeinterface #82  <Method void MediationNativeListener.zza(com.google.android.gms.ads.mediation.MediationNativeAdapter, NativeCustomTemplateAd)>
	//    6   14:return          
	}

	public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiednativead)
	{
		zzhk.onAdLoaded(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzhh)), ((com.google.android.gms.ads.mediation.UnifiedNativeAdMapper) (new AbstractAdViewAdapter$zzc(unifiednativead))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
	//    4    8:new             #86  <Class AbstractAdViewAdapter$zzc>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #88  <Method void AbstractAdViewAdapter$zzc(UnifiedNativeAd)>
	//    8   16:invokeinterface #91  <Method void MediationNativeListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.ads.mediation.UnifiedNativeAdMapper)>
	//    9   21:return          
	}

	private final AbstractAdViewAdapter zzhh;
	private final MediationNativeListener zzhk;

	public AbstractAdViewAdapter$zzf(AbstractAdViewAdapter abstractadviewadapter, MediationNativeListener mediationnativelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AdListener()>
		zzhh = abstractadviewadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field AbstractAdViewAdapter zzhh>
		zzhk = mediationnativelistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field MediationNativeListener zzhk>
	//    8   14:return          
	}
}
