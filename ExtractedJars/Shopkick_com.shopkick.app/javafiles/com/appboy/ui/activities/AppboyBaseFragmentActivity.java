// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.activities;

import android.support.v4.app.FragmentActivity;
import com.appboy.Appboy;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;

public class AppboyBaseFragmentActivity extends FragmentActivity
{

	public AppboyBaseFragmentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void FragmentActivity()>
	//    2    4:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void FragmentActivity.onPause()>
		AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(((android.app.Activity) (this)));
	//    2    4:invokestatic    #18  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #22  <Method void AppboyInAppMessageManager.unregisterInAppMessageManager(android.app.Activity)>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void FragmentActivity.onResume()>
		AppboyInAppMessageManager.getInstance().registerInAppMessageManager(((android.app.Activity) (this)));
	//    2    4:invokestatic    #18  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #28  <Method void AppboyInAppMessageManager.registerInAppMessageManager(android.app.Activity)>
	//    5   11:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void FragmentActivity.onStart()>
		Appboy.getInstance(((android.content.Context) (this))).openSession(((android.app.Activity) (this)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #39  <Method void Appboy.openSession(android.app.Activity)>
	//    6   12:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void FragmentActivity.onStop()>
		Appboy.getInstance(((android.content.Context) (this))).closeSession(((android.app.Activity) (this)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #45  <Method void Appboy.closeSession(android.app.Activity)>
	//    6   12:return          
	}
}
