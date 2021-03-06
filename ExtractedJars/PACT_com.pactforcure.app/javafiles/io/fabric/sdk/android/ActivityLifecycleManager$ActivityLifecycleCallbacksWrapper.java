// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.*;

// Referenced classes of package io.fabric.sdk.android:
//			ActivityLifecycleManager

private static class ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper
{

	private void clearCallbacks()
	{
		android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks;
		for(Iterator iterator = registeredCallbacks.iterator(); iterator.hasNext(); application.unregisterActivityLifecycleCallbacks(activitylifecyclecallbacks))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Set registeredCallbacks>
	//*   2    4:invokeinterface #47  <Method Iterator Set.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            40
			activitylifecyclecallbacks = (android.app.Application.ActivityLifecycleCallbacks)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #57  <Method Object Iterator.next()>
	//    9   25:checkcast       #59  <Class android.app.Application$ActivityLifecycleCallbacks>
	//   10   28:astore_2        

	//   11   29:aload_0         
	//   12   30:getfield        #26  <Field Application application>
	//   13   33:aload_2         
	//   14   34:invokevirtual   #65  <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//*  15   37:goto            10
	//   16   40:return          
	}

	private boolean registerLifecycleCallbacks(final ActivityLifecycleManager.Callbacks callbacks)
	{
		if(application != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Application application>
	//*   2    4:ifnull          38
		{
			callbacks = ((ActivityLifecycleManager.Callbacks) (new android.app.Application.ActivityLifecycleCallbacks() {

				public void onActivityCreated(Activity activity, Bundle bundle)
				{
					callbacks.onActivityCreated(activity, bundle);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #34  <Method void ActivityLifecycleManager$Callbacks.onActivityCreated(Activity, Bundle)>
				//    5    9:return          
				}

				public void onActivityDestroyed(Activity activity)
				{
					callbacks.onActivityDestroyed(activity);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #38  <Method void ActivityLifecycleManager$Callbacks.onActivityDestroyed(Activity)>
				//    4    8:return          
				}

				public void onActivityPaused(Activity activity)
				{
					callbacks.onActivityPaused(activity);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #41  <Method void ActivityLifecycleManager$Callbacks.onActivityPaused(Activity)>
				//    4    8:return          
				}

				public void onActivityResumed(Activity activity)
				{
					callbacks.onActivityResumed(activity);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #44  <Method void ActivityLifecycleManager$Callbacks.onActivityResumed(Activity)>
				//    4    8:return          
				}

				public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
				{
					callbacks.onActivitySaveInstanceState(activity, bundle);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #47  <Method void ActivityLifecycleManager$Callbacks.onActivitySaveInstanceState(Activity, Bundle)>
				//    5    9:return          
				}

				public void onActivityStarted(Activity activity)
				{
					callbacks.onActivityStarted(activity);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #50  <Method void ActivityLifecycleManager$Callbacks.onActivityStarted(Activity)>
				//    4    8:return          
				}

				public void onActivityStopped(Activity activity)
				{
					callbacks.onActivityStopped(activity);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #53  <Method void ActivityLifecycleManager$Callbacks.onActivityStopped(Activity)>
				//    4    8:return          
				}

				final ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper this$0;
				final ActivityLifecycleManager.Callbacks val$callbacks;

			
			{
				this$0 = ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper this$0>
				callbacks = callbacks1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ActivityLifecycleManager$Callbacks val$callbacks>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//    3    7:new             #9   <Class ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #69  <Method void ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper$1(ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper, ActivityLifecycleManager$Callbacks)>
	//    8   16:astore_1        
			application.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (callbacks)));
	//    9   17:aload_0         
	//   10   18:getfield        #26  <Field Application application>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #72  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			registeredCallbacks.add(((Object) (callbacks)));
	//   13   25:aload_0         
	//   14   26:getfield        #24  <Field Set registeredCallbacks>
	//   15   29:aload_1         
	//   16   30:invokeinterface #76  <Method boolean Set.add(Object)>
	//   17   35:pop             
			return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		} else
		{
			return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
		}
	}

	private final Application application;
	private final Set registeredCallbacks = new HashSet();


/*
	static boolean access$000(ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper activitylifecyclemanager$activitylifecyclecallbackswrapper, ActivityLifecycleManager.Callbacks callbacks)
	{
		return activitylifecyclemanager$activitylifecyclecallbackswrapper.registerLifecycleCallbacks(callbacks);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method boolean registerLifecycleCallbacks(ActivityLifecycleManager$Callbacks)>
	//    3    5:ireturn         
	}

*/


/*
	static void access$100(ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper activitylifecyclemanager$activitylifecyclecallbackswrapper)
	{
		activitylifecyclemanager$activitylifecyclecallbackswrapper.clearCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void clearCallbacks()>
		return;
	//    2    4:return          
	}

*/

	ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper(Application application1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void HashSet()>
	//    6   12:putfield        #24  <Field Set registeredCallbacks>
		application = application1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field Application application>
	//   10   20:return          
	}
}
