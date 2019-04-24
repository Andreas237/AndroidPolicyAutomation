// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.*;
import com.google.android.gms.internal.ads.zzane;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//			CustomEventNativeListener, CustomEventAdapter

static final class CustomEventAdapter$zzc
	implements CustomEventNativeListener
{

	public final void onAdClicked()
	{
		zzane.zzck("Custom event adapter called onAdClicked.");
	//    0    0:ldc1            #27  <String "Custom event adapter called onAdClicked.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhk.onAdClicked(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #38  <Method void MediationNativeListener.onAdClicked(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    7   18:return          
	}

	public final void onAdClosed()
	{
		zzane.zzck("Custom event adapter called onAdClosed.");
	//    0    0:ldc1            #41  <String "Custom event adapter called onAdClosed.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhk.onAdClosed(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #43  <Method void MediationNativeListener.onAdClosed(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    7   18:return          
	}

	public final void onAdFailedToLoad(int i)
	{
		zzane.zzck("Custom event adapter called onAdFailedToLoad.");
	//    0    0:ldc1            #47  <String "Custom event adapter called onAdFailedToLoad.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhk.onAdFailedToLoad(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzdgh)), i);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:iload_1         
	//    7   14:invokeinterface #50  <Method void MediationNativeListener.onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter, int)>
	//    8   19:return          
	}

	public final void onAdImpression()
	{
		zzane.zzck("Custom event adapter called onAdImpression.");
	//    0    0:ldc1            #53  <String "Custom event adapter called onAdImpression.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhk.onAdImpression(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #55  <Method void MediationNativeListener.onAdImpression(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    7   18:return          
	}

	public final void onAdLeftApplication()
	{
		zzane.zzck("Custom event adapter called onAdLeftApplication.");
	//    0    0:ldc1            #58  <String "Custom event adapter called onAdLeftApplication.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhk.onAdLeftApplication(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #60  <Method void MediationNativeListener.onAdLeftApplication(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    7   18:return          
	}

	public final void onAdLoaded(NativeAdMapper nativeadmapper)
	{
		zzane.zzck("Custom event adapter called onAdLoaded.");
	//    0    0:ldc1            #64  <String "Custom event adapter called onAdLoaded.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhk.onAdLoaded(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzdgh)), nativeadmapper);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:aload_1         
	//    7   14:invokeinterface #67  <Method void MediationNativeListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter, NativeAdMapper)>
	//    8   19:return          
	}

	public final void onAdLoaded(UnifiedNativeAdMapper unifiednativeadmapper)
	{
		zzane.zzck("Custom event adapter called onAdLoaded.");
	//    0    0:ldc1            #64  <String "Custom event adapter called onAdLoaded.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhk.onAdLoaded(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzdgh)), unifiednativeadmapper);
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:aload_1         
	//    7   14:invokeinterface #71  <Method void MediationNativeListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter, UnifiedNativeAdMapper)>
	//    8   19:return          
	}

	public final void onAdOpened()
	{
		zzane.zzck("Custom event adapter called onAdOpened.");
	//    0    0:ldc1            #74  <String "Custom event adapter called onAdOpened.">
	//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
		zzhk.onAdOpened(((com.google.android.gms.ads.mediation.MediationNativeAdapter) (zzdgh)));
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
	//    6   13:invokeinterface #76  <Method void MediationNativeListener.onAdOpened(com.google.android.gms.ads.mediation.MediationNativeAdapter)>
	//    7   18:return          
	}

	private final CustomEventAdapter zzdgh;
	private final MediationNativeListener zzhk;

	public CustomEventAdapter$zzc(CustomEventAdapter customeventadapter, MediationNativeListener mediationnativelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzdgh = customeventadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field CustomEventAdapter zzdgh>
		zzhk = mediationnativelistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field MediationNativeListener zzhk>
	//    8   14:return          
	}
}
