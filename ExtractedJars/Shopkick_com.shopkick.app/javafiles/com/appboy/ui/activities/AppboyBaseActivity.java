// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.activities;

import android.app.Activity;
import com.appboy.Appboy;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;

public class AppboyBaseActivity extends Activity
{

	public AppboyBaseActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Activity()>
	//    2    4:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Activity.onPause()>
		AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(((Activity) (this)));
	//    2    4:invokestatic    #18  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #22  <Method void AppboyInAppMessageManager.unregisterInAppMessageManager(Activity)>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Activity.onResume()>
		AppboyInAppMessageManager.getInstance().registerInAppMessageManager(((Activity) (this)));
	//    2    4:invokestatic    #18  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #28  <Method void AppboyInAppMessageManager.registerInAppMessageManager(Activity)>
	//    5   11:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Activity.onStart()>
		Appboy.getInstance(((android.content.Context) (this))).openSession(((Activity) (this)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #39  <Method void Appboy.openSession(Activity)>
	//    6   12:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Activity.onStop()>
		Appboy.getInstance(((android.content.Context) (this))).closeSession(((Activity) (this)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #45  <Method void Appboy.closeSession(Activity)>
	//    6   12:return          
	}
}
