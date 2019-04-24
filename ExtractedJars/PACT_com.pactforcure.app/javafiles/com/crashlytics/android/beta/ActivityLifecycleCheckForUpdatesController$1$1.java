// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import android.app.Activity;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.crashlytics.android.beta:
//			ActivityLifecycleCheckForUpdatesController

class ActivityLifecycleCheckForUpdatesController$1$1
	implements Runnable
{

	public void run()
	{
		checkForUpdates();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityLifecycleCheckForUpdatesController$1 this$1>
	//    2    4:getfield        #26  <Field ActivityLifecycleCheckForUpdatesController ActivityLifecycleCheckForUpdatesController$1.this$0>
	//    3    7:invokevirtual   #31  <Method void ActivityLifecycleCheckForUpdatesController.checkForUpdates()>
	//    4   10:return          
	}

	final ActivityLifecycleCheckForUpdatesController._cls1 this$1;

	ActivityLifecycleCheckForUpdatesController$1$1()
	{
		this$1 = ActivityLifecycleCheckForUpdatesController._cls1.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ActivityLifecycleCheckForUpdatesController$1 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/crashlytics/android/beta/ActivityLifecycleCheckForUpdatesController$1

/* anonymous class */
	class ActivityLifecycleCheckForUpdatesController._cls1 extends io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
	{

		public void onActivityStarted(Activity activity)
		{
			if(signalExternallyReady())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field ActivityLifecycleCheckForUpdatesController this$0>
		//*   2    4:invokevirtual   #24  <Method boolean ActivityLifecycleCheckForUpdatesController.signalExternallyReady()>
		//*   3    7:ifeq            31
				ActivityLifecycleCheckForUpdatesController.access$000(ActivityLifecycleCheckForUpdatesController.this).submit(((Runnable) (new ActivityLifecycleCheckForUpdatesController._cls1._cls1())));
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

}
