// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;

import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.splash:
//			h, c

class h$3
	implements AdEventListener
{

	public void onFailedToReceiveAd(Ad ad)
	{
		if(a.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field h a>
	//*   2    4:getfield        #24  <Field h$a h.f>
	//*   3    7:ifnull          20
			a.b.b();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field h a>
	//    6   14:getfield        #28  <Field c h.b>
	//    7   17:invokevirtual   #32  <Method void c.b()>
	//    8   20:return          
	}

	public void onReceiveAd(Ad ad)
	{
		g.a("Splash", 4, "Splash ad received");
	//    0    0:ldc1            #35  <String "Splash">
	//    1    2:iconst_4        
	//    2    3:ldc1            #37  <String "Splash ad received">
	//    3    5:invokestatic    #42  <Method void g.a(String, int, String)>
		a.b.a(a.g);
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field h a>
	//    6   12:getfield        #28  <Field c h.b>
	//    7   15:aload_0         
	//    8   16:getfield        #14  <Field h a>
	//    9   19:getfield        #46  <Field Runnable com.startapp.android.publish.ads.splash.h.g>
	//   10   22:invokevirtual   #49  <Method void c.a(Runnable)>
	//   11   25:return          
	}

	final h a;

	h$3(h h1)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
