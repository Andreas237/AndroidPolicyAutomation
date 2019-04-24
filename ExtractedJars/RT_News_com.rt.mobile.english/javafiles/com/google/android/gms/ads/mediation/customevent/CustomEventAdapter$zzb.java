// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.zzane;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//			CustomEventInterstitialListener, CustomEventAdapter

final class CustomEventAdapter$zzb
	implements CustomEventInterstitialListener
{

	public final void onAdClicked()
	{
		zzane.zzck("Custom event adapter called onAdClicked.");
	//    0    0:ldc1            #30  <String "Custom event adapter called onAdClicked.">
	//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
		zzhj.onAdClicked(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
	//    4    9:aload_0         
	//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #41  <Method void MediationInterstitialListener.onAdClicked(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    7   18:return          
	}

	public final void onAdClosed()
	{
		zzane.zzck("Custom event adapter called onAdClosed.");
	//    0    0:ldc1            #44  <String "Custom event adapter called onAdClosed.">
	//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
		zzhj.onAdClosed(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
	//    4    9:aload_0         
	//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #46  <Method void MediationInterstitialListener.onAdClosed(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    7   18:return          
	}

	public final void onAdFailedToLoad(int i)
	{
		zzane.zzck("Custom event adapter called onFailedToReceiveAd.");
	//    0    0:ldc1            #50  <String "Custom event adapter called onFailedToReceiveAd.">
	//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
		zzhj.onAdFailedToLoad(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzdgh)), i);
	//    2    5:aload_0         
	//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
	//    4    9:aload_0         
	//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
	//    6   13:iload_1         
	//    7   14:invokeinterface #53  <Method void MediationInterstitialListener.onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationInterstitialAdapter, int)>
	//    8   19:return          
	}

	public final void onAdLeftApplication()
	{
		zzane.zzck("Custom event adapter called onAdLeftApplication.");
	//    0    0:ldc1            #56  <String "Custom event adapter called onAdLeftApplication.">
	//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
		zzhj.onAdLeftApplication(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
	//    4    9:aload_0         
	//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #58  <Method void MediationInterstitialListener.onAdLeftApplication(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    7   18:return          
	}

	public final void onAdLoaded()
	{
		zzane.zzck("Custom event adapter called onReceivedAd.");
	//    0    0:ldc1            #61  <String "Custom event adapter called onReceivedAd.">
	//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
		zzhj.onAdLoaded(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzdgi)));
	//    2    5:aload_0         
	//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
	//    4    9:aload_0         
	//    5   10:getfield        #19  <Field CustomEventAdapter zzdgi>
	//    6   13:invokeinterface #63  <Method void MediationInterstitialListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    7   18:return          
	}

	public final void onAdOpened()
	{
		zzane.zzck("Custom event adapter called onAdOpened.");
	//    0    0:ldc1            #66  <String "Custom event adapter called onAdOpened.">
	//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
		zzhj.onAdOpened(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
	//    4    9:aload_0         
	//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #68  <Method void MediationInterstitialListener.onAdOpened(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    7   18:return          
	}

	private final CustomEventAdapter zzdgh;
	private final CustomEventAdapter zzdgi;
	private final MediationInterstitialListener zzhj;

	public CustomEventAdapter$zzb(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
	{
		zzdgi = customeventadapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CustomEventAdapter zzdgi>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		zzdgh = customeventadapter1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field CustomEventAdapter zzdgh>
		zzhj = mediationinterstitiallistener;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field MediationInterstitialListener zzhj>
	//   11   19:return          
	}
}
