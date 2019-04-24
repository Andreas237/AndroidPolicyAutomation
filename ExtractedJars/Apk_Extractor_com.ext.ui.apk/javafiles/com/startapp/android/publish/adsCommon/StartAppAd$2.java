// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.*;
import com.startapp.android.publish.ads.splash.SplashHideListener;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.common.b;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			StartAppAd

static final class StartAppAd$2 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		i.a(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Activity a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #30  <Method void i.a(Activity, boolean)>
		if(b != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #19  <Field SplashHideListener b>
	//*   6   12:ifnull          24
			b.splashHidden();
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field SplashHideListener b>
	//    9   19:invokeinterface #35  <Method void SplashHideListener.splashHidden()>
		com.startapp.common.b.a(((Context) (a))).a(((BroadcastReceiver) (this)));
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field Activity a>
	//   12   28:invokestatic    #40  <Method b b.a(Context)>
	//   13   31:aload_0         
	//   14   32:invokevirtual   #43  <Method void b.a(BroadcastReceiver)>
	//   15   35:return          
	}

	final Activity a;
	final SplashHideListener b;

	StartAppAd$2(Activity activity, SplashHideListener splashhidelistener)
	{
		a = activity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Activity a>
		b = splashhidelistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field SplashHideListener b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void BroadcastReceiver()>
	//    8   14:return          
	}
}
