// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			Ad

class Ad$1
	implements AdEventListener
{

	public void onFailedToReceiveAd(Ad ad)
	{
		a.onFailedToReceiveAd(ad);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AdEventListener a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #29  <Method void AdEventListener.onFailedToReceiveAd(Ad)>
	//    4   10:return          
	}

	public void onReceiveAd(Ad ad)
	{
		Ad.access$000(b, Long.valueOf(System.currentTimeMillis()));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Ad b>
	//    2    4:invokestatic    #36  <Method long System.currentTimeMillis()>
	//    3    7:invokestatic    #42  <Method Long Long.valueOf(long)>
	//    4   10:invokestatic    #46  <Method void Ad.access$000(Ad, Long)>
		a.onReceiveAd(ad);
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field AdEventListener a>
	//    7   17:aload_1         
	//    8   18:invokeinterface #48  <Method void AdEventListener.onReceiveAd(Ad)>
	//    9   23:return          
	}

	final AdEventListener a;
	final Ad b;

	Ad$1(Ad ad, AdEventListener adeventlistener)
	{
		b = ad;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Ad b>
		a = adeventlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AdEventListener a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
