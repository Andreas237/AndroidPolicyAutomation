// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ActivityTracker

class ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1
	implements android.app.Application.ActivityLifecycleCallbacks
{

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		ActivityTracker.AutomaticTracker.AutomaticTrackerICSAndBeyond.access$100(ActivityTracker.AutomaticTracker.AutomaticTrackerICSAndBeyond.this).add(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond this$0>
	//    2    4:invokestatic    #30  <Method ActivityTracker ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond.access$100(ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #34  <Method void ActivityTracker.add(Activity)>
	//    5   11:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
		ActivityTracker.AutomaticTracker.AutomaticTrackerICSAndBeyond.access$100(ActivityTracker.AutomaticTracker.AutomaticTrackerICSAndBeyond.this).remove(activity);
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

	final ActivityTracker.AutomaticTracker.AutomaticTrackerICSAndBeyond this$0;

	ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond$1()
	{
		this$0 = ActivityTracker.AutomaticTracker.AutomaticTrackerICSAndBeyond.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ActivityTracker$AutomaticTracker$AutomaticTrackerICSAndBeyond this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
