// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ads.zzjd;

// Referenced classes of package com.google.ads.mediation:
//			AbstractAdViewAdapter

static final class AbstractAdViewAdapter$zzd extends AdListener
	implements AppEventListener, zzjd
{

	public final void onAdClicked()
	{
		zzhi.onAdClicked(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #32  <Method void MediationBannerListener.onAdClicked(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    5   13:return          
	}

	public final void onAdClosed()
	{
		zzhi.onAdClosed(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #35  <Method void MediationBannerListener.onAdClosed(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    5   13:return          
	}

	public final void onAdFailedToLoad(int i)
	{
		zzhi.onAdFailedToLoad(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzhh)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
	//    4    8:iload_1         
	//    5    9:invokeinterface #40  <Method void MediationBannerListener.onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter, int)>
	//    6   14:return          
	}

	public final void onAdLeftApplication()
	{
		zzhi.onAdLeftApplication(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #43  <Method void MediationBannerListener.onAdLeftApplication(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    5   13:return          
	}

	public final void onAdLoaded()
	{
		zzhi.onAdLoaded(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #46  <Method void MediationBannerListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    5   13:return          
	}

	public final void onAdOpened()
	{
		zzhi.onAdOpened(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #49  <Method void MediationBannerListener.onAdOpened(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    5   13:return          
	}

	public final void onAppEvent(String s, String s1)
	{
		zzhi.zza(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzhh)), s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #55  <Method void MediationBannerListener.zza(com.google.android.gms.ads.mediation.MediationBannerAdapter, String, String)>
	//    7   15:return          
	}

	private final AbstractAdViewAdapter zzhh;
	private final MediationBannerListener zzhi;

	public AbstractAdViewAdapter$zzd(AbstractAdViewAdapter abstractadviewadapter, MediationBannerListener mediationbannerlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AdListener()>
		zzhh = abstractadviewadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field AbstractAdViewAdapter zzhh>
		zzhi = mediationbannerlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field MediationBannerListener zzhi>
	//    8   14:return          
	}
}
