// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.appsflyer;

import android.content.*;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.appsflyer:
//			AppsFlyerRoutingActivity

class AppsFlyerRoutingActivity$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		AppsFlyerRoutingActivity.access$000(AppsFlyerRoutingActivity.this, intent);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field AppsFlyerRoutingActivity this$0>
	//    2    4:aload_2         
	//    3    5:invokestatic    #23  <Method void AppsFlyerRoutingActivity.access$000(AppsFlyerRoutingActivity, Intent)>
	//    4    8:return          
	}

	final AppsFlyerRoutingActivity this$0;

	AppsFlyerRoutingActivity$1()
	{
		this$0 = AppsFlyerRoutingActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AppsFlyerRoutingActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
