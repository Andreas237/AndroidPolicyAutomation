// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.activities;

import android.support.v4.app.FragmentActivity;
import com.appboy.Appboy;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.background.ApplicationStateMonitor;
import com.newrelic.agent.android.tracing.Trace;

public class AppboyBaseFragmentActivity extends FragmentActivity
	implements TraceFieldInterface
{

	public AppboyBaseFragmentActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void FragmentActivity()>
	//    2    4:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void FragmentActivity.onPause()>
		AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(((android.app.Activity) (this)));
	//    2    4:invokestatic    #23  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #27  <Method void AppboyInAppMessageManager.unregisterInAppMessageManager(android.app.Activity)>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void FragmentActivity.onResume()>
		AppboyInAppMessageManager.getInstance().registerInAppMessageManager(((android.app.Activity) (this)));
	//    2    4:invokestatic    #23  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #33  <Method void AppboyInAppMessageManager.registerInAppMessageManager(android.app.Activity)>
	//    5   11:return          
	}

	public void onStart()
	{
		ApplicationStateMonitor.getInstance().activityStarted();
	//    0    0:invokestatic    #39  <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    1    3:invokevirtual   #42  <Method void ApplicationStateMonitor.activityStarted()>
		super.onStart();
	//    2    6:aload_0         
	//    3    7:invokespecial   #44  <Method void FragmentActivity.onStart()>
		Appboy.getInstance(((android.content.Context) (this))).openSession(((android.app.Activity) (this)));
	//    4   10:aload_0         
	//    5   11:invokestatic    #49  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #52  <Method void Appboy.openSession(android.app.Activity)>
	//    8   18:return          
	}

	public void onStop()
	{
		ApplicationStateMonitor.getInstance().activityStopped();
	//    0    0:invokestatic    #39  <Method ApplicationStateMonitor ApplicationStateMonitor.getInstance()>
	//    1    3:invokevirtual   #56  <Method void ApplicationStateMonitor.activityStopped()>
		super.onStop();
	//    2    6:aload_0         
	//    3    7:invokespecial   #58  <Method void FragmentActivity.onStop()>
		Appboy.getInstance(((android.content.Context) (this))).closeSession(((android.app.Activity) (this)));
	//    4   10:aload_0         
	//    5   11:invokestatic    #49  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #61  <Method void Appboy.closeSession(android.app.Activity)>
	//    8   18:return          
	}

	public Trace _nr_trace;
}
