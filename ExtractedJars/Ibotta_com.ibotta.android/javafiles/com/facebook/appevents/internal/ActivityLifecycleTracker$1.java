// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.appevents.internal:
//			ActivityLifecycleTracker, AppEventUtility

static final class ActivityLifecycleTracker$1
	implements android.app.leCallbacks
{

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityCreated");
	//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
	//    2    6:ldc1            #29  <String "onActivityCreated">
	//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
		AppEventUtility.assertIsMainThread();
	//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
		ActivityLifecycleTracker.onActivityCreated(activity);
	//    5   14:aload_1         
	//    6   15:invokestatic    #43  <Method void ActivityLifecycleTracker.onActivityCreated(Activity)>
	//    7   18:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
		Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityDestroyed");
	//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
	//    2    6:ldc1            #45  <String "onActivityDestroyed">
	//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
	//    4   11:return          
	}

	public void onActivityPaused(Activity activity)
	{
		Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityPaused");
	//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
	//    2    6:ldc1            #47  <String "onActivityPaused">
	//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
		AppEventUtility.assertIsMainThread();
	//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
		ActivityLifecycleTracker.access$100(activity);
	//    5   14:aload_1         
	//    6   15:invokestatic    #50  <Method void ActivityLifecycleTracker.access$100(Activity)>
	//    7   18:return          
	}

	public void onActivityResumed(Activity activity)
	{
		Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityResumed");
	//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
	//    2    6:ldc1            #52  <String "onActivityResumed">
	//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
		AppEventUtility.assertIsMainThread();
	//    4   11:invokestatic    #40  <Method void AppEventUtility.assertIsMainThread()>
		ActivityLifecycleTracker.onActivityResumed(activity);
	//    5   14:aload_1         
	//    6   15:invokestatic    #54  <Method void ActivityLifecycleTracker.onActivityResumed(Activity)>
	//    7   18:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivitySaveInstanceState");
	//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
	//    2    6:ldc1            #56  <String "onActivitySaveInstanceState">
	//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
	//    4   11:return          
	}

	public void onActivityStarted(Activity activity)
	{
		Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityStarted");
	//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
	//    2    6:ldc1            #58  <String "onActivityStarted">
	//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
	//    4   11:return          
	}

	public void onActivityStopped(Activity activity)
	{
		Logger.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.access$000(), "onActivityStopped");
	//    0    0:getstatic       #24  <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:invokestatic    #28  <Method String ActivityLifecycleTracker.access$000()>
	//    2    6:ldc1            #60  <String "onActivityStopped">
	//    3    8:invokestatic    #35  <Method void Logger.log(LoggingBehavior, String, String)>
		AppEventsLogger.onContextStop();
	//    4   11:invokestatic    #65  <Method void AppEventsLogger.onContextStop()>
	//    5   14:return          
	}

	ActivityLifecycleTracker$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
