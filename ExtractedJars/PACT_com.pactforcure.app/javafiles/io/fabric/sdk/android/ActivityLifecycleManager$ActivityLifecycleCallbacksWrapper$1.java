// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package io.fabric.sdk.android:
//			ActivityLifecycleManager

class ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper$1
	implements android.app.Application.ActivityLifecycleCallbacks
{

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		val$callbacks.onActivityCreated(activity, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #34  <Method void ActivityLifecycleManager$Callbacks.onActivityCreated(Activity, Bundle)>
	//    5    9:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
		val$callbacks.onActivityDestroyed(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method void ActivityLifecycleManager$Callbacks.onActivityDestroyed(Activity)>
	//    4    8:return          
	}

	public void onActivityPaused(Activity activity)
	{
		val$callbacks.onActivityPaused(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method void ActivityLifecycleManager$Callbacks.onActivityPaused(Activity)>
	//    4    8:return          
	}

	public void onActivityResumed(Activity activity)
	{
		val$callbacks.onActivityResumed(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #44  <Method void ActivityLifecycleManager$Callbacks.onActivityResumed(Activity)>
	//    4    8:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		val$callbacks.onActivitySaveInstanceState(activity, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #47  <Method void ActivityLifecycleManager$Callbacks.onActivitySaveInstanceState(Activity, Bundle)>
	//    5    9:return          
	}

	public void onActivityStarted(Activity activity)
	{
		val$callbacks.onActivityStarted(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method void ActivityLifecycleManager$Callbacks.onActivityStarted(Activity)>
	//    4    8:return          
	}

	public void onActivityStopped(Activity activity)
	{
		val$callbacks.onActivityStopped(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method void ActivityLifecycleManager$Callbacks.onActivityStopped(Activity)>
	//    4    8:return          
	}

	final ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper this$0;
	final ActivityLifecycleManager.Callbacks val$callbacks;

	ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper$1()
	{
		this$0 = final_activitylifecyclecallbackswrapper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper this$0>
		val$callbacks = ActivityLifecycleManager.Callbacks.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
