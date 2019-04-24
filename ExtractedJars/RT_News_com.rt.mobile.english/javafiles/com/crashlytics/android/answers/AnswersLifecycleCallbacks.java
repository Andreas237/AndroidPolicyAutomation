// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionAnalyticsManager, BackgroundManager

class AnswersLifecycleCallbacks extends io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
{

	public AnswersLifecycleCallbacks(SessionAnalyticsManager sessionanalyticsmanager, BackgroundManager backgroundmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void io.fabric.sdk.android.ActivityLifecycleManager$Callbacks()>
		analyticsManager = sessionanalyticsmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SessionAnalyticsManager analyticsManager>
		backgroundManager = backgroundmanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field BackgroundManager backgroundManager>
	//    8   14:return          
	}

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityPaused(Activity activity)
	{
		analyticsManager.onLifecycle(activity, SessionEvent.Type.PAUSE);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SessionAnalyticsManager analyticsManager>
	//    2    4:aload_1         
	//    3    5:getstatic       #29  <Field SessionEvent$Type SessionEvent$Type.PAUSE>
	//    4    8:invokevirtual   #35  <Method void SessionAnalyticsManager.onLifecycle(Activity, SessionEvent$Type)>
		backgroundManager.onActivityPaused();
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field BackgroundManager backgroundManager>
	//    7   15:invokevirtual   #39  <Method void BackgroundManager.onActivityPaused()>
	//    8   18:return          
	}

	public void onActivityResumed(Activity activity)
	{
		analyticsManager.onLifecycle(activity, SessionEvent.Type.RESUME);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SessionAnalyticsManager analyticsManager>
	//    2    4:aload_1         
	//    3    5:getstatic       #43  <Field SessionEvent$Type SessionEvent$Type.RESUME>
	//    4    8:invokevirtual   #35  <Method void SessionAnalyticsManager.onLifecycle(Activity, SessionEvent$Type)>
		backgroundManager.onActivityResumed();
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field BackgroundManager backgroundManager>
	//    7   15:invokevirtual   #45  <Method void BackgroundManager.onActivityResumed()>
	//    8   18:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityStarted(Activity activity)
	{
		analyticsManager.onLifecycle(activity, SessionEvent.Type.START);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SessionAnalyticsManager analyticsManager>
	//    2    4:aload_1         
	//    3    5:getstatic       #50  <Field SessionEvent$Type SessionEvent$Type.START>
	//    4    8:invokevirtual   #35  <Method void SessionAnalyticsManager.onLifecycle(Activity, SessionEvent$Type)>
	//    5   11:return          
	}

	public void onActivityStopped(Activity activity)
	{
		analyticsManager.onLifecycle(activity, SessionEvent.Type.STOP);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SessionAnalyticsManager analyticsManager>
	//    2    4:aload_1         
	//    3    5:getstatic       #54  <Field SessionEvent$Type SessionEvent$Type.STOP>
	//    4    8:invokevirtual   #35  <Method void SessionAnalyticsManager.onLifecycle(Activity, SessionEvent$Type)>
	//    5   11:return          
	}

	private final SessionAnalyticsManager analyticsManager;
	private final BackgroundManager backgroundManager;
}
