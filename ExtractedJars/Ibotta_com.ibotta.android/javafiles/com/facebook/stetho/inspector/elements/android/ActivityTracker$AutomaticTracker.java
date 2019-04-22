// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ActivityTracker

private static abstract class ActivityTracker$AutomaticTracker
{
	private static class AutomaticTrackerICSAndBeyond extends ActivityTracker.AutomaticTracker
	{

		public void register()
		{
			mApplication.registerActivityLifecycleCallbacks(mLifecycleCallbacks);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Application mApplication>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field android.app.Application$ActivityLifecycleCallbacks mLifecycleCallbacks>
		//    4    8:invokevirtual   #44  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
		//    5   11:return          
		}

		public void unregister()
		{
			mApplication.unregisterActivityLifecycleCallbacks(mLifecycleCallbacks);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Application mApplication>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field android.app.Application$ActivityLifecycleCallbacks mLifecycleCallbacks>
		//    4    8:invokevirtual   #48  <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
		//    5   11:return          
		}

		private final Application mApplication;
		private final android.app.Application.ActivityLifecycleCallbacks mLifecycleCallbacks = new _cls1();
		private final ActivityTracker mTracker;


/*
		static ActivityTracker access$100(AutomaticTrackerICSAndBeyond automatictrackericsandbeyond)
		{
			return automatictrackericsandbeyond.mTracker;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field ActivityTracker mTracker>
		//    2    4:areturn         
		}

*/

		public AutomaticTrackerICSAndBeyond(Application application, ActivityTracker activitytracker)
		{
			super(((ActivityTracker._cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #24  <Method void ActivityTracker$AutomaticTracker(ActivityTracker$1)>
		//    3    5:aload_0         
		//    4    6:new             #10  <Class ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokespecial   #27  <Method void ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1(ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond)>
		//    8   14:putfield        #29  <Field android.app.Application$ActivityLifecycleCallbacks mLifecycleCallbacks>
			mApplication = application;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:putfield        #31  <Field Application mApplication>
			mTracker = activitytracker;
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:putfield        #33  <Field ActivityTracker mTracker>
		//   15   27:return          
		}
	}


	public static ActivityTracker$AutomaticTracker newInstanceIfPossible(Application application, ActivityTracker activitytracker)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          18
			return ((ActivityTracker$AutomaticTracker) (new AutomaticTrackerICSAndBeyond(application, activitytracker)));
	//    3    8:new             #9   <Class ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #31  <Method void ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond(Application, ActivityTracker)>
	//    8   17:areturn         
		else
			return null;
	//    9   18:aconst_null     
	//   10   19:areturn         
	}

	public abstract void register();

	public abstract void unregister();

	private ActivityTracker$AutomaticTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	ActivityTracker$AutomaticTracker(ActivityTracker._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ActivityTracker$AutomaticTracker()>
	//    2    4:return          
	}

	// Unreferenced inner class com/facebook/stetho/inspector/elements/android/ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1

/* anonymous class */
	class AutomaticTrackerICSAndBeyond._cls1
		implements android.app.Application.ActivityLifecycleCallbacks
	{

		public void onActivityCreated(Activity activity, Bundle bundle)
		{
			mTracker.add(activity);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond this$0>
		//    2    4:invokestatic    #30  <Method ActivityTracker ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond.access$100(ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #34  <Method void ActivityTracker.add(Activity)>
		//    5   11:return          
		}

		public void onActivityDestroyed(Activity activity)
		{
			mTracker.remove(activity);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond this$0>
		//    2    4:invokestatic    #30  <Method ActivityTracker ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond.access$100(ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond)>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #38  <Method void ActivityTracker.remove(Activity)>
		//    5   11:return          
		}

		public void onActivityPaused(Activity activity)
		{
		//    0    0:return          
		}

		public void onActivityResumed(Activity activity)
		{
		//    0    0:return          
		}

		public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onActivityStarted(Activity activity)
		{
		//    0    0:return          
		}

		public void onActivityStopped(Activity activity)
		{
		//    0    0:return          
		}

		final AutomaticTrackerICSAndBeyond this$0;

			
			{
				this$0 = AutomaticTrackerICSAndBeyond.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
	}

}
