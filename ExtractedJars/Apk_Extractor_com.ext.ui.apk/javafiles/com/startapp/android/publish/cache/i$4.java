// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import com.startapp.android.publish.ads.b.c;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.cache:
//			i

static final class i$4
	implements com.startapp.android.publish.adsCommon.Utils.i$a
{

	public void a()
	{
		a.onReceiveAd(((com.startapp.android.publish.adsCommon.Ad) (b)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AdEventListener a>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field c b>
	//    4    8:invokeinterface #30  <Method void AdEventListener.onReceiveAd(com.startapp.android.publish.adsCommon.Ad)>
	//    5   13:return          
	}

	public void a(String s)
	{
		g.a("DiskAdCacheManager", 3, (new StringBuilder()).append("Html Cache failed: ").append(s).toString());
	//    0    0:ldc1            #33  <String "DiskAdCacheManager">
	//    1    2:iconst_3        
	//    2    3:new             #35  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #36  <Method void StringBuilder()>
	//    5   10:ldc1            #38  <String "Html Cache failed: ">
	//    6   12:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   10   22:invokestatic    #51  <Method void g.a(String, int, String)>
		a.onFailedToReceiveAd(((com.startapp.android.publish.adsCommon.Ad) (b)));
	//   11   25:aload_0         
	//   12   26:getfield        #18  <Field AdEventListener a>
	//   13   29:aload_0         
	//   14   30:getfield        #20  <Field c b>
	//   15   33:invokeinterface #54  <Method void AdEventListener.onFailedToReceiveAd(com.startapp.android.publish.adsCommon.Ad)>
	//   16   38:return          
	}

	final AdEventListener a;
	final c b;

	i$4(AdEventListener adeventlistener, c c)
	{
		a = adeventlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AdEventListener a>
		b = c;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field c b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
