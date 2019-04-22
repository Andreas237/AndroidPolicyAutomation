// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ads.zzane;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//			CustomEventBannerListener, CustomEventAdapter

static final class CustomEventAdapter$zza
	implements CustomEventBannerListener
{

	public final void onAdClicked()
	{
		zzane.zzck("Custom event adapter called onAdClicked.");
	//    0    0:ldc1            #27  <String "Custom event adapter called onAdClicked.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhi.onAdClicked(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #38  <Method void MediationBannerListener.onAdClicked(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    7   18:return          
	}

	public final void onAdClosed()
	{
		zzane.zzck("Custom event adapter called onAdClosed.");
	//    0    0:ldc1            #41  <String "Custom event adapter called onAdClosed.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhi.onAdClosed(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #43  <Method void MediationBannerListener.onAdClosed(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    7   18:return          
	}

	public final void onAdFailedToLoad(int i)
	{
		zzane.zzck("Custom event adapter called onAdFailedToLoad.");
	//    0    0:ldc1            #47  <String "Custom event adapter called onAdFailedToLoad.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhi.onAdFailedToLoad(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzdgh)), i);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:iload_1         
	//    7   14:invokeinterface #50  <Method void MediationBannerListener.onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter, int)>
	//    8   19:return          
	}

	public final void onAdLeftApplication()
	{
		zzane.zzck("Custom event adapter called onAdLeftApplication.");
	//    0    0:ldc1            #53  <String "Custom event adapter called onAdLeftApplication.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhi.onAdLeftApplication(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #55  <Method void MediationBannerListener.onAdLeftApplication(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    7   18:return          
	}

	public final void onAdLoaded(View view)
	{
		zzane.zzck("Custom event adapter called onAdLoaded.");
	//    0    0:ldc1            #59  <String "Custom event adapter called onAdLoaded.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		CustomEventAdapter.zza(zzdgh, view);
	//    2    5:aload_0         
	//    3    6:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    4    9:aload_1         
	//    5   10:invokestatic    #62  <Method void CustomEventAdapter.zza(CustomEventAdapter, View)>
		zzhi.onAdLoaded(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzdgh)));
	//    6   13:aload_0         
	//    7   14:getfield        #23  <Field MediationBannerListener zzhi>
	//    8   17:aload_0         
	//    9   18:getfield        #21  <Field CustomEventAdapter zzdgh>
	//   10   21:invokeinterface #64  <Method void MediationBannerListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//   11   26:return          
	}

	public final void onAdOpened()
	{
		zzane.zzck("Custom event adapter called onAdOpened.");
	//    0    0:ldc1            #67  <String "Custom event adapter called onAdOpened.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhi.onAdOpened(((com.google.android.gms.ads.mediation.MediationBannerAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #69  <Method void MediationBannerListener.onAdOpened(com.google.android.gms.ads.mediation.MediationBannerAdapter)>
	//    7   18:return          
	}

	private final CustomEventAdapter zzdgh;
	private final MediationBannerListener zzhi;

	public CustomEventAdapter$zza(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzdgh = customeventadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field CustomEventAdapter zzdgh>
		zzhi = mediationbannerlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field MediationBannerListener zzhi>
	//    8   14:return          
	}
}
