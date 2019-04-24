// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.*;
import com.google.android.gms.internal.ads.zzane;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//			CustomEventBanner, CustomEventInterstitial, CustomEventNative, CustomEventBannerListener, 
//			CustomEventInterstitialListener, CustomEventNativeListener

public final class CustomEventAdapter
	implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{
	static final class zza
		implements CustomEventBannerListener
	{

		public final void onAdClicked()
		{
			zzane.zzck("Custom event adapter called onAdClicked.");
		//    0    0:ldc1            #27  <String "Custom event adapter called onAdClicked.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhi.onAdClicked(((MediationBannerAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #38  <Method void MediationBannerListener.onAdClicked(MediationBannerAdapter)>
		//    7   18:return          
		}

		public final void onAdClosed()
		{
			zzane.zzck("Custom event adapter called onAdClosed.");
		//    0    0:ldc1            #41  <String "Custom event adapter called onAdClosed.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhi.onAdClosed(((MediationBannerAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #43  <Method void MediationBannerListener.onAdClosed(MediationBannerAdapter)>
		//    7   18:return          
		}

		public final void onAdFailedToLoad(int i)
		{
			zzane.zzck("Custom event adapter called onAdFailedToLoad.");
		//    0    0:ldc1            #47  <String "Custom event adapter called onAdFailedToLoad.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhi.onAdFailedToLoad(((MediationBannerAdapter) (zzdgh)), i);
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:iload_1         
		//    7   14:invokeinterface #50  <Method void MediationBannerListener.onAdFailedToLoad(MediationBannerAdapter, int)>
		//    8   19:return          
		}

		public final void onAdLeftApplication()
		{
			zzane.zzck("Custom event adapter called onAdLeftApplication.");
		//    0    0:ldc1            #53  <String "Custom event adapter called onAdLeftApplication.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhi.onAdLeftApplication(((MediationBannerAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #55  <Method void MediationBannerListener.onAdLeftApplication(MediationBannerAdapter)>
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
			zzhi.onAdLoaded(((MediationBannerAdapter) (zzdgh)));
		//    6   13:aload_0         
		//    7   14:getfield        #23  <Field MediationBannerListener zzhi>
		//    8   17:aload_0         
		//    9   18:getfield        #21  <Field CustomEventAdapter zzdgh>
		//   10   21:invokeinterface #64  <Method void MediationBannerListener.onAdLoaded(MediationBannerAdapter)>
		//   11   26:return          
		}

		public final void onAdOpened()
		{
			zzane.zzck("Custom event adapter called onAdOpened.");
		//    0    0:ldc1            #67  <String "Custom event adapter called onAdOpened.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhi.onAdOpened(((MediationBannerAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationBannerListener zzhi>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #69  <Method void MediationBannerListener.onAdOpened(MediationBannerAdapter)>
		//    7   18:return          
		}

		private final CustomEventAdapter zzdgh;
		private final MediationBannerListener zzhi;

		public zza(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
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

	final class zzb
		implements CustomEventInterstitialListener
	{

		public final void onAdClicked()
		{
			zzane.zzck("Custom event adapter called onAdClicked.");
		//    0    0:ldc1            #30  <String "Custom event adapter called onAdClicked.">
		//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
			zzhj.onAdClicked(((MediationInterstitialAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
		//    4    9:aload_0         
		//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #41  <Method void MediationInterstitialListener.onAdClicked(MediationInterstitialAdapter)>
		//    7   18:return          
		}

		public final void onAdClosed()
		{
			zzane.zzck("Custom event adapter called onAdClosed.");
		//    0    0:ldc1            #44  <String "Custom event adapter called onAdClosed.">
		//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
			zzhj.onAdClosed(((MediationInterstitialAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
		//    4    9:aload_0         
		//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #46  <Method void MediationInterstitialListener.onAdClosed(MediationInterstitialAdapter)>
		//    7   18:return          
		}

		public final void onAdFailedToLoad(int i)
		{
			zzane.zzck("Custom event adapter called onFailedToReceiveAd.");
		//    0    0:ldc1            #50  <String "Custom event adapter called onFailedToReceiveAd.">
		//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
			zzhj.onAdFailedToLoad(((MediationInterstitialAdapter) (zzdgh)), i);
		//    2    5:aload_0         
		//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
		//    4    9:aload_0         
		//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
		//    6   13:iload_1         
		//    7   14:invokeinterface #53  <Method void MediationInterstitialListener.onAdFailedToLoad(MediationInterstitialAdapter, int)>
		//    8   19:return          
		}

		public final void onAdLeftApplication()
		{
			zzane.zzck("Custom event adapter called onAdLeftApplication.");
		//    0    0:ldc1            #56  <String "Custom event adapter called onAdLeftApplication.">
		//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
			zzhj.onAdLeftApplication(((MediationInterstitialAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
		//    4    9:aload_0         
		//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #58  <Method void MediationInterstitialListener.onAdLeftApplication(MediationInterstitialAdapter)>
		//    7   18:return          
		}

		public final void onAdLoaded()
		{
			zzane.zzck("Custom event adapter called onReceivedAd.");
		//    0    0:ldc1            #61  <String "Custom event adapter called onReceivedAd.">
		//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
			zzhj.onAdLoaded(((MediationInterstitialAdapter) (zzdgi)));
		//    2    5:aload_0         
		//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
		//    4    9:aload_0         
		//    5   10:getfield        #19  <Field CustomEventAdapter zzdgi>
		//    6   13:invokeinterface #63  <Method void MediationInterstitialListener.onAdLoaded(MediationInterstitialAdapter)>
		//    7   18:return          
		}

		public final void onAdOpened()
		{
			zzane.zzck("Custom event adapter called onAdOpened.");
		//    0    0:ldc1            #66  <String "Custom event adapter called onAdOpened.">
		//    1    2:invokestatic    #36  <Method void zzane.zzck(String)>
			zzhj.onAdOpened(((MediationInterstitialAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #26  <Field MediationInterstitialListener zzhj>
		//    4    9:aload_0         
		//    5   10:getfield        #24  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #68  <Method void MediationInterstitialListener.onAdOpened(MediationInterstitialAdapter)>
		//    7   18:return          
		}

		private final CustomEventAdapter zzdgh;
		private final CustomEventAdapter zzdgi;
		private final MediationInterstitialListener zzhj;

		public zzb(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
		{
			zzdgi = CustomEventAdapter.this;
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

	static final class zzc
		implements CustomEventNativeListener
	{

		public final void onAdClicked()
		{
			zzane.zzck("Custom event adapter called onAdClicked.");
		//    0    0:ldc1            #27  <String "Custom event adapter called onAdClicked.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhk.onAdClicked(((MediationNativeAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #38  <Method void MediationNativeListener.onAdClicked(MediationNativeAdapter)>
		//    7   18:return          
		}

		public final void onAdClosed()
		{
			zzane.zzck("Custom event adapter called onAdClosed.");
		//    0    0:ldc1            #41  <String "Custom event adapter called onAdClosed.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhk.onAdClosed(((MediationNativeAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #43  <Method void MediationNativeListener.onAdClosed(MediationNativeAdapter)>
		//    7   18:return          
		}

		public final void onAdFailedToLoad(int i)
		{
			zzane.zzck("Custom event adapter called onAdFailedToLoad.");
		//    0    0:ldc1            #47  <String "Custom event adapter called onAdFailedToLoad.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhk.onAdFailedToLoad(((MediationNativeAdapter) (zzdgh)), i);
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:iload_1         
		//    7   14:invokeinterface #50  <Method void MediationNativeListener.onAdFailedToLoad(MediationNativeAdapter, int)>
		//    8   19:return          
		}

		public final void onAdImpression()
		{
			zzane.zzck("Custom event adapter called onAdImpression.");
		//    0    0:ldc1            #53  <String "Custom event adapter called onAdImpression.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhk.onAdImpression(((MediationNativeAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #55  <Method void MediationNativeListener.onAdImpression(MediationNativeAdapter)>
		//    7   18:return          
		}

		public final void onAdLeftApplication()
		{
			zzane.zzck("Custom event adapter called onAdLeftApplication.");
		//    0    0:ldc1            #58  <String "Custom event adapter called onAdLeftApplication.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhk.onAdLeftApplication(((MediationNativeAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #60  <Method void MediationNativeListener.onAdLeftApplication(MediationNativeAdapter)>
		//    7   18:return          
		}

		public final void onAdLoaded(NativeAdMapper nativeadmapper)
		{
			zzane.zzck("Custom event adapter called onAdLoaded.");
		//    0    0:ldc1            #64  <String "Custom event adapter called onAdLoaded.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhk.onAdLoaded(((MediationNativeAdapter) (zzdgh)), nativeadmapper);
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:aload_1         
		//    7   14:invokeinterface #67  <Method void MediationNativeListener.onAdLoaded(MediationNativeAdapter, NativeAdMapper)>
		//    8   19:return          
		}

		public final void onAdLoaded(UnifiedNativeAdMapper unifiednativeadmapper)
		{
			zzane.zzck("Custom event adapter called onAdLoaded.");
		//    0    0:ldc1            #64  <String "Custom event adapter called onAdLoaded.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhk.onAdLoaded(((MediationNativeAdapter) (zzdgh)), unifiednativeadmapper);
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:aload_1         
		//    7   14:invokeinterface #71  <Method void MediationNativeListener.onAdLoaded(MediationNativeAdapter, UnifiedNativeAdMapper)>
		//    8   19:return          
		}

		public final void onAdOpened()
		{
			zzane.zzck("Custom event adapter called onAdOpened.");
		//    0    0:ldc1            #74  <String "Custom event adapter called onAdOpened.">
		//    1    2:invokestatic    #33  <Method void zzane.zzck(String)>
			zzhk.onAdOpened(((MediationNativeAdapter) (zzdgh)));
		//    2    5:aload_0         
		//    3    6:getfield        #23  <Field MediationNativeListener zzhk>
		//    4    9:aload_0         
		//    5   10:getfield        #21  <Field CustomEventAdapter zzdgh>
		//    6   13:invokeinterface #76  <Method void MediationNativeListener.onAdOpened(MediationNativeAdapter)>
		//    7   18:return          
		}

		private final CustomEventAdapter zzdgh;
		private final MediationNativeListener zzhk;

		public zzc(CustomEventAdapter customeventadapter, MediationNativeListener mediationnativelistener)
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


	public CustomEventAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	private final void zza(View view)
	{
		zzhq = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field View zzhq>
	//    3    5:return          
	}

	static void zza(CustomEventAdapter customeventadapter, View view)
	{
		customeventadapter.zza(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void zza(View)>
	//    3    5:return          
	}

	private static Object zzi(String s)
	{
		Object obj;
		try
		{
			obj = Class.forName(s).newInstance();
	//    0    0:aload_0         
	//    1    1:invokestatic    #51  <Method Class Class.forName(String)>
	//    2    4:invokevirtual   #55  <Method Object Class.newInstance()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(Throwable throwable)
	//*   6   10:astore_1        
		{
			String s1 = throwable.getMessage();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #59  <Method String Throwable.getMessage()>
	//    9   15:astore_1        
			StringBuilder stringbuilder = new StringBuilder(46 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//   10   16:new             #61  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:bipush          46
	//   13   22:aload_0         
	//   14   23:invokestatic    #67  <Method String String.valueOf(Object)>
	//   15   26:invokevirtual   #71  <Method int String.length()>
	//   16   29:iadd            
	//   17   30:aload_1         
	//   18   31:invokestatic    #67  <Method String String.valueOf(Object)>
	//   19   34:invokevirtual   #71  <Method int String.length()>
	//   20   37:iadd            
	//   21   38:invokespecial   #74  <Method void StringBuilder(int)>
	//   22   41:astore_2        
			stringbuilder.append("Could not instantiate custom event adapter: ");
	//   23   42:aload_2         
	//   24   43:ldc1            #76  <String "Could not instantiate custom event adapter: ">
	//   25   45:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			stringbuilder.append(s);
	//   27   49:aload_2         
	//   28   50:aload_0         
	//   29   51:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
			stringbuilder.append(". ");
	//   31   55:aload_2         
	//   32   56:ldc1            #82  <String ". ">
	//   33   58:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
			stringbuilder.append(s1);
	//   35   62:aload_2         
	//   36   63:aload_1         
	//   37   64:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   38   67:pop             
			zzane.zzdk(stringbuilder.toString());
	//   39   68:aload_2         
	//   40   69:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   41   72:invokestatic    #91  <Method void zzane.zzdk(String)>
			return ((Object) (null));
	//   42   75:aconst_null     
	//   43   76:areturn         
		}
		return obj;
	}

	public final View getBannerView()
	{
		return zzhq;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field View zzhq>
	//    2    4:areturn         
	}

	public final void onDestroy()
	{
		if(zzdge != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field CustomEventBanner zzdge>
	//*   2    4:ifnull          16
			zzdge.onDestroy();
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field CustomEventBanner zzdge>
	//    5   11:invokeinterface #102 <Method void CustomEventBanner.onDestroy()>
		if(zzdgf != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//*   8   20:ifnull          32
			zzdgf.onDestroy();
	//    9   23:aload_0         
	//   10   24:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//   11   27:invokeinterface #107 <Method void CustomEventInterstitial.onDestroy()>
		if(zzdgg != null)
	//*  12   32:aload_0         
	//*  13   33:getfield        #109 <Field CustomEventNative zzdgg>
	//*  14   36:ifnull          48
			zzdgg.onDestroy();
	//   15   39:aload_0         
	//   16   40:getfield        #109 <Field CustomEventNative zzdgg>
	//   17   43:invokeinterface #112 <Method void CustomEventNative.onDestroy()>
	//   18   48:return          
	}

	public final void onPause()
	{
		if(zzdge != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field CustomEventBanner zzdge>
	//*   2    4:ifnull          16
			zzdge.onPause();
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field CustomEventBanner zzdge>
	//    5   11:invokeinterface #115 <Method void CustomEventBanner.onPause()>
		if(zzdgf != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//*   8   20:ifnull          32
			zzdgf.onPause();
	//    9   23:aload_0         
	//   10   24:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//   11   27:invokeinterface #116 <Method void CustomEventInterstitial.onPause()>
		if(zzdgg != null)
	//*  12   32:aload_0         
	//*  13   33:getfield        #109 <Field CustomEventNative zzdgg>
	//*  14   36:ifnull          48
			zzdgg.onPause();
	//   15   39:aload_0         
	//   16   40:getfield        #109 <Field CustomEventNative zzdgg>
	//   17   43:invokeinterface #117 <Method void CustomEventNative.onPause()>
	//   18   48:return          
	}

	public final void onResume()
	{
		if(zzdge != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field CustomEventBanner zzdge>
	//*   2    4:ifnull          16
			zzdge.onResume();
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field CustomEventBanner zzdge>
	//    5   11:invokeinterface #120 <Method void CustomEventBanner.onResume()>
		if(zzdgf != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//*   8   20:ifnull          32
			zzdgf.onResume();
	//    9   23:aload_0         
	//   10   24:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//   11   27:invokeinterface #121 <Method void CustomEventInterstitial.onResume()>
		if(zzdgg != null)
	//*  12   32:aload_0         
	//*  13   33:getfield        #109 <Field CustomEventNative zzdgg>
	//*  14   36:ifnull          48
			zzdgg.onResume();
	//   15   39:aload_0         
	//   16   40:getfield        #109 <Field CustomEventNative zzdgg>
	//   17   43:invokeinterface #122 <Method void CustomEventNative.onResume()>
	//   18   48:return          
	}

	public final void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
	{
		zzdge = (CustomEventBanner)zzi(bundle.getString("class_name"));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:ldc1            #126 <String "class_name">
	//    3    4:invokevirtual   #132 <Method String Bundle.getString(String)>
	//    4    7:invokestatic    #134 <Method Object zzi(String)>
	//    5   10:checkcast       #100 <Class CustomEventBanner>
	//    6   13:putfield        #98  <Field CustomEventBanner zzdge>
		if(zzdge == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #98  <Field CustomEventBanner zzdge>
	//*   9   20:ifnonnull       32
		{
			mediationbannerlistener.onAdFailedToLoad(((MediationBannerAdapter) (this)), 0);
	//   10   23:aload_2         
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:invokeinterface #140 <Method void MediationBannerListener.onAdFailedToLoad(MediationBannerAdapter, int)>
			return;
	//   14   31:return          
		}
		if(bundle1 == null)
	//*  15   32:aload           6
	//*  16   34:ifnonnull       43
			bundle1 = null;
	//   17   37:aconst_null     
	//   18   38:astore          6
		else
	//*  19   40:goto            59
			bundle1 = bundle1.getBundle(bundle.getString("class_name"));
	//   20   43:aload           6
	//   21   45:aload_3         
	//   22   46:ldc1            #126 <String "class_name">
	//   23   48:invokevirtual   #132 <Method String Bundle.getString(String)>
	//   24   51:invokevirtual   #144 <Method Bundle Bundle.getBundle(String)>
	//   25   54:astore          6
	//*  26   56:goto            40
		zzdge.requestBannerAd(context, ((CustomEventBannerListener) (new zza(this, mediationbannerlistener))), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
	//   27   59:aload_0         
	//   28   60:getfield        #98  <Field CustomEventBanner zzdge>
	//   29   63:aload_1         
	//   30   64:new             #12  <Class CustomEventAdapter$zza>
	//   31   67:dup             
	//   32   68:aload_0         
	//   33   69:aload_2         
	//   34   70:invokespecial   #147 <Method void CustomEventAdapter$zza(CustomEventAdapter, MediationBannerListener)>
	//   35   73:aload_3         
	//   36   74:ldc1            #149 <String "parameter">
	//   37   76:invokevirtual   #132 <Method String Bundle.getString(String)>
	//   38   79:aload           4
	//   39   81:aload           5
	//   40   83:aload           6
	//   41   85:invokeinterface #152 <Method void CustomEventBanner.requestBannerAd(Context, CustomEventBannerListener, String, AdSize, MediationAdRequest, Bundle)>
	//   42   90:return          
	}

	public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
	{
		zzdgf = (CustomEventInterstitial)zzi(bundle.getString("class_name"));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:ldc1            #126 <String "class_name">
	//    3    4:invokevirtual   #132 <Method String Bundle.getString(String)>
	//    4    7:invokestatic    #134 <Method Object zzi(String)>
	//    5   10:checkcast       #106 <Class CustomEventInterstitial>
	//    6   13:putfield        #104 <Field CustomEventInterstitial zzdgf>
		if(zzdgf == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//*   9   20:ifnonnull       32
		{
			mediationinterstitiallistener.onAdFailedToLoad(((MediationInterstitialAdapter) (this)), 0);
	//   10   23:aload_2         
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:invokeinterface #159 <Method void MediationInterstitialListener.onAdFailedToLoad(MediationInterstitialAdapter, int)>
			return;
	//   14   31:return          
		}
		if(bundle1 == null)
	//*  15   32:aload           5
	//*  16   34:ifnonnull       43
			bundle1 = null;
	//   17   37:aconst_null     
	//   18   38:astore          5
		else
	//*  19   40:goto            59
			bundle1 = bundle1.getBundle(bundle.getString("class_name"));
	//   20   43:aload           5
	//   21   45:aload_3         
	//   22   46:ldc1            #126 <String "class_name">
	//   23   48:invokevirtual   #132 <Method String Bundle.getString(String)>
	//   24   51:invokevirtual   #144 <Method Bundle Bundle.getBundle(String)>
	//   25   54:astore          5
	//*  26   56:goto            40
		zzdgf.requestInterstitialAd(context, ((CustomEventInterstitialListener) (new zzb(this, mediationinterstitiallistener))), bundle.getString("parameter"), mediationadrequest, bundle1);
	//   27   59:aload_0         
	//   28   60:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//   29   63:aload_1         
	//   30   64:new             #15  <Class CustomEventAdapter$zzb>
	//   31   67:dup             
	//   32   68:aload_0         
	//   33   69:aload_0         
	//   34   70:aload_2         
	//   35   71:invokespecial   #162 <Method void CustomEventAdapter$zzb(CustomEventAdapter, CustomEventAdapter, MediationInterstitialListener)>
	//   36   74:aload_3         
	//   37   75:ldc1            #149 <String "parameter">
	//   38   77:invokevirtual   #132 <Method String Bundle.getString(String)>
	//   39   80:aload           4
	//   40   82:aload           5
	//   41   84:invokeinterface #165 <Method void CustomEventInterstitial.requestInterstitialAd(Context, CustomEventInterstitialListener, String, MediationAdRequest, Bundle)>
	//   42   89:return          
	}

	public final void requestNativeAd(Context context, MediationNativeListener mediationnativelistener, Bundle bundle, NativeMediationAdRequest nativemediationadrequest, Bundle bundle1)
	{
		zzdgg = (CustomEventNative)zzi(bundle.getString("class_name"));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:ldc1            #126 <String "class_name">
	//    3    4:invokevirtual   #132 <Method String Bundle.getString(String)>
	//    4    7:invokestatic    #134 <Method Object zzi(String)>
	//    5   10:checkcast       #111 <Class CustomEventNative>
	//    6   13:putfield        #109 <Field CustomEventNative zzdgg>
		if(zzdgg == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #109 <Field CustomEventNative zzdgg>
	//*   9   20:ifnonnull       32
		{
			mediationnativelistener.onAdFailedToLoad(((MediationNativeAdapter) (this)), 0);
	//   10   23:aload_2         
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:invokeinterface #172 <Method void MediationNativeListener.onAdFailedToLoad(MediationNativeAdapter, int)>
			return;
	//   14   31:return          
		}
		if(bundle1 == null)
	//*  15   32:aload           5
	//*  16   34:ifnonnull       43
			bundle1 = null;
	//   17   37:aconst_null     
	//   18   38:astore          5
		else
	//*  19   40:goto            59
			bundle1 = bundle1.getBundle(bundle.getString("class_name"));
	//   20   43:aload           5
	//   21   45:aload_3         
	//   22   46:ldc1            #126 <String "class_name">
	//   23   48:invokevirtual   #132 <Method String Bundle.getString(String)>
	//   24   51:invokevirtual   #144 <Method Bundle Bundle.getBundle(String)>
	//   25   54:astore          5
	//*  26   56:goto            40
		zzdgg.requestNativeAd(context, ((CustomEventNativeListener) (new zzc(this, mediationnativelistener))), bundle.getString("parameter"), nativemediationadrequest, bundle1);
	//   27   59:aload_0         
	//   28   60:getfield        #109 <Field CustomEventNative zzdgg>
	//   29   63:aload_1         
	//   30   64:new             #18  <Class CustomEventAdapter$zzc>
	//   31   67:dup             
	//   32   68:aload_0         
	//   33   69:aload_2         
	//   34   70:invokespecial   #175 <Method void CustomEventAdapter$zzc(CustomEventAdapter, MediationNativeListener)>
	//   35   73:aload_3         
	//   36   74:ldc1            #149 <String "parameter">
	//   37   76:invokevirtual   #132 <Method String Bundle.getString(String)>
	//   38   79:aload           4
	//   39   81:aload           5
	//   40   83:invokeinterface #178 <Method void CustomEventNative.requestNativeAd(Context, CustomEventNativeListener, String, NativeMediationAdRequest, Bundle)>
	//   41   88:return          
	}

	public final void showInterstitial()
	{
		zzdgf.showInterstitial();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field CustomEventInterstitial zzdgf>
	//    2    4:invokeinterface #181 <Method void CustomEventInterstitial.showInterstitial()>
	//    3    9:return          
	}

	private CustomEventBanner zzdge;
	private CustomEventInterstitial zzdgf;
	private CustomEventNative zzdgg;
	private View zzhq;
}
