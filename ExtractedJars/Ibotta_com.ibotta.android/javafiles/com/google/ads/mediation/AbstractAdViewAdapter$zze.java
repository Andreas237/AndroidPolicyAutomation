// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.zzjd;

// Referenced classes of package com.google.ads.mediation:
//			AbstractAdViewAdapter

static final class AbstractAdViewAdapter$zze extends AdListener
	implements zzjd
{

	public final void onAdClicked()
	{
		zzhj.onAdClicked(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #30  <Method void MediationInterstitialListener.onAdClicked(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    5   13:return          
	}

	public final void onAdClosed()
	{
		zzhj.onAdClosed(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #33  <Method void MediationInterstitialListener.onAdClosed(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    5   13:return          
	}

	public final void onAdFailedToLoad(int i)
	{
		zzhj.onAdFailedToLoad(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
	//    4    8:iload_1         
	//    5    9:invokeinterface #38  <Method void MediationInterstitialListener.onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationInterstitialAdapter, int)>
	//    6   14:return          
	}

	public final void onAdLeftApplication()
	{
		zzhj.onAdLeftApplication(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #41  <Method void MediationInterstitialListener.onAdLeftApplication(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    5   13:return          
	}

	public final void onAdLoaded()
	{
		zzhj.onAdLoaded(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #44  <Method void MediationInterstitialListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    5   13:return          
	}

	public final void onAdOpened()
	{
		zzhj.onAdOpened(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
	//    4    8:invokeinterface #47  <Method void MediationInterstitialListener.onAdOpened(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    5   13:return          
	}

	private final AbstractAdViewAdapter zzhh;
	private final MediationInterstitialListener zzhj;

	public AbstractAdViewAdapter$zze(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AdListener()>
		zzhh = abstractadviewadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AbstractAdViewAdapter zzhh>
		zzhj = mediationinterstitiallistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field MediationInterstitialListener zzhj>
	//    8   14:return          
	}
}
