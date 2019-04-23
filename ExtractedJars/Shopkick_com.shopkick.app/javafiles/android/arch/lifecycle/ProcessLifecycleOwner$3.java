// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package android.arch.lifecycle:
//			EmptyActivityLifecycleCallbacks, ProcessLifecycleOwner, ReportFragment

class ProcessLifecycleOwner$3 extends EmptyActivityLifecycleCallbacks
{

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		ReportFragment.get(activity).setProcessListener(ProcessLifecycleOwner.access$200(ProcessLifecycleOwner.this));
	//    0    0:aload_1         
	//    1    1:invokestatic    #27  <Method ReportFragment ReportFragment.get(Activity)>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field ProcessLifecycleOwner this$0>
	//    4    8:invokestatic    #31  <Method ReportFragment$ActivityInitializationListener ProcessLifecycleOwner.access$200(ProcessLifecycleOwner)>
	//    5   11:invokevirtual   #35  <Method void ReportFragment.setProcessListener(ReportFragment$ActivityInitializationListener)>
	//    6   14:return          
	}

	public void onActivityPaused(Activity activity)
	{
		activityPaused();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ProcessLifecycleOwner this$0>
	//    2    4:invokevirtual   #40  <Method void ProcessLifecycleOwner.activityPaused()>
	//    3    7:return          
	}

	public void onActivityStopped(Activity activity)
	{
		activityStopped();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ProcessLifecycleOwner this$0>
	//    2    4:invokevirtual   #44  <Method void ProcessLifecycleOwner.activityStopped()>
	//    3    7:return          
	}

	final ProcessLifecycleOwner this$0;

	ProcessLifecycleOwner$3()
	{
		this$0 = ProcessLifecycleOwner.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ProcessLifecycleOwner this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void EmptyActivityLifecycleCallbacks()>
	//    5    9:return          
	}
}
