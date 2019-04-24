// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;

import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adListeners.b;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.nativead:
//			StartAppNativeAd

private class StartAppNativeAd$a
	implements AdEventListener
{

	public AdEventListener a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AdEventListener b>
	//    2    4:areturn         
	}

	public void onFailedToReceiveAd(Ad ad)
	{
		g.a("StartAppNativeAd", 3, "NativeAd Failed to load");
	//    0    0:ldc1            #32  <String "StartAppNativeAd">
	//    1    2:iconst_3        
	//    2    3:ldc1            #34  <String "NativeAd Failed to load">
	//    3    5:invokestatic    #39  <Method void g.a(String, int, String)>
		a.setErrorMessage(ad.getErrorMessage());
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field StartAppNativeAd a>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #45  <Method String Ad.getErrorMessage()>
	//    8   16:invokevirtual   #49  <Method void StartAppNativeAd.setErrorMessage(String)>
		if(b != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #21  <Field AdEventListener b>
	//*  11   23:ifnull          44
		{
			b.onFailedToReceiveAd(((Ad) (a)));
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field AdEventListener b>
	//   14   30:aload_0         
	//   15   31:getfield        #16  <Field StartAppNativeAd a>
	//   16   34:invokeinterface #51  <Method void AdEventListener.onFailedToReceiveAd(Ad)>
			b = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #21  <Field AdEventListener b>
		}
		a.isLoading = false;
	//   20   44:aload_0         
	//   21   45:getfield        #16  <Field StartAppNativeAd a>
	//   22   48:iconst_0        
	//   23   49:putfield        #55  <Field boolean StartAppNativeAd.isLoading>
		a.initNativeAdList();
	//   24   52:aload_0         
	//   25   53:getfield        #16  <Field StartAppNativeAd a>
	//   26   56:invokevirtual   #58  <Method void StartAppNativeAd.initNativeAdList()>
	//   27   59:return          
	}

	public void onReceiveAd(Ad ad)
	{
		g.a("StartAppNativeAd", 3, "NativeAd Received");
	//    0    0:ldc1            #32  <String "StartAppNativeAd">
	//    1    2:iconst_3        
	//    2    3:ldc1            #61  <String "NativeAd Received">
	//    3    5:invokestatic    #39  <Method void g.a(String, int, String)>
		a.initNativeAdList();
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field StartAppNativeAd a>
	//    6   12:invokevirtual   #58  <Method void StartAppNativeAd.initNativeAdList()>
	//    7   15:return          
	}

	final StartAppNativeAd a;
	private AdEventListener b;

	public StartAppNativeAd$a(StartAppNativeAd startappnativead, AdEventListener adeventlistener)
	{
		a = startappnativead;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field StartAppNativeAd a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field AdEventListener b>
		b = ((AdEventListener) (new b(adeventlistener)));
	//    8   14:aload_0         
	//    9   15:new             #23  <Class b>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #26  <Method void b(AdEventListener)>
	//   13   23:putfield        #21  <Field AdEventListener b>
	//   14   26:return          
	}
}
