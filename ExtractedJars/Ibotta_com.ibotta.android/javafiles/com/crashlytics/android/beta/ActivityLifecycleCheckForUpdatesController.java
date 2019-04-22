// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import android.app.Activity;
import io.fabric.sdk.android.ActivityLifecycleManager;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.crashlytics.android.beta:
//			AbstractCheckForUpdatesController

class ActivityLifecycleCheckForUpdatesController extends AbstractCheckForUpdatesController
{

	public ActivityLifecycleCheckForUpdatesController(ActivityLifecycleManager activitylifecyclemanager, ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractCheckForUpdatesController()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class ActivityLifecycleCheckForUpdatesController$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #23  <Method void ActivityLifecycleCheckForUpdatesController$1(ActivityLifecycleCheckForUpdatesController)>
	//    7   13:putfield        #25  <Field io.fabric.sdk.android.ActivityLifecycleManager$Callbacks callbacks>
		executorService = executorservice;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #27  <Field ExecutorService executorService>
		activitylifecyclemanager.registerCallbacks(callbacks);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field io.fabric.sdk.android.ActivityLifecycleManager$Callbacks callbacks>
	//   14   26:invokevirtual   #33  <Method boolean ActivityLifecycleManager.registerCallbacks(io.fabric.sdk.android.ActivityLifecycleManager$Callbacks)>
	//   15   29:pop             
	//   16   30:return          
	}

	public boolean isActivityLifecycleTriggered()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final io.fabric.sdk.android.ActivityLifecycleManager.Callbacks callbacks = new io.fabric.sdk.android.ActivityLifecycleManager.Callbacks() {

		public void onActivityStarted(Activity activity)
		{
			if(signalExternallyReady())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field ActivityLifecycleCheckForUpdatesController this$0>
		//*   2    4:invokevirtual   #24  <Method boolean ActivityLifecycleCheckForUpdatesController.signalExternallyReady()>
		//*   3    7:ifeq            31
				executorService.submit(new Runnable() {

					public void run()
					{
						checkForUpdates();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ActivityLifecycleCheckForUpdatesController$1 this$1>
					//    2    4:getfield        #26  <Field ActivityLifecycleCheckForUpdatesController ActivityLifecycleCheckForUpdatesController$1.this$0>
					//    3    7:invokevirtual   #31  <Method void ActivityLifecycleCheckForUpdatesController.checkForUpdates()>
					//    4   10:return          
					}

					final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ActivityLifecycleCheckForUpdatesController$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field ActivityLifecycleCheckForUpdatesController this$0>
		//    6   14:invokestatic    #28  <Method ExecutorService ActivityLifecycleCheckForUpdatesController.access$000(ActivityLifecycleCheckForUpdatesController)>
		//    7   17:new             #8   <Class ActivityLifecycleCheckForUpdatesController$1$1>
		//    8   20:dup             
		//    9   21:aload_0         
		//   10   22:invokespecial   #31  <Method void ActivityLifecycleCheckForUpdatesController$1$1(ActivityLifecycleCheckForUpdatesController$1)>
		//   11   25:invokeinterface #37  <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
		//   12   30:pop             
		//   13   31:return          
		}

		final ActivityLifecycleCheckForUpdatesController this$0;

			
			{
				this$0 = ActivityLifecycleCheckForUpdatesController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityLifecycleCheckForUpdatesController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void io.fabric.sdk.android.ActivityLifecycleManager$Callbacks()>
			//    5    9:return          
			}
	}
;
	private final ExecutorService executorService;


/*
	static ExecutorService access$000(ActivityLifecycleCheckForUpdatesController activitylifecyclecheckforupdatescontroller)
	{
		return activitylifecyclecheckforupdatescontroller.executorService;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ExecutorService executorService>
	//    2    4:areturn         
	}

*/
}
