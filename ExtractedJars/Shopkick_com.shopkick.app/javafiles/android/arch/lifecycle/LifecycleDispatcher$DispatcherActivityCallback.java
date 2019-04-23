// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

// Referenced classes of package android.arch.lifecycle:
//			EmptyActivityLifecycleCallbacks, LifecycleDispatcher, ReportFragment

static class LifecycleDispatcher$DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks
{

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		if(activity instanceof FragmentActivity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class FragmentActivity>
	//*   2    4:ifeq            22
			((FragmentActivity)activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(((android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks) (mFragmentCallback)), true);
	//    3    7:aload_1         
	//    4    8:checkcast       #24  <Class FragmentActivity>
	//    5   11:invokevirtual   #28  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field LifecycleDispatcher$FragmentCallback mFragmentCallback>
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #34  <Method void FragmentManager.registerFragmentLifecycleCallbacks(android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks, boolean)>
		ReportFragment.injectIfNeededIn(activity);
	//   10   22:aload_1         
	//   11   23:invokestatic    #40  <Method void ReportFragment.injectIfNeededIn(Activity)>
	//   12   26:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		if(activity instanceof FragmentActivity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class FragmentActivity>
	//*   2    4:ifeq            17
			LifecycleDispatcher.access$000((FragmentActivity)activity, Lifecycle.State.CREATED);
	//    3    7:aload_1         
	//    4    8:checkcast       #24  <Class FragmentActivity>
	//    5   11:getstatic       #47  <Field Lifecycle$State Lifecycle$State.CREATED>
	//    6   14:invokestatic    #51  <Method void LifecycleDispatcher.access$000(FragmentActivity, Lifecycle$State)>
	//    7   17:return          
	}

	public void onActivityStopped(Activity activity)
	{
		if(activity instanceof FragmentActivity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class FragmentActivity>
	//*   2    4:ifeq            17
			LifecycleDispatcher.access$000((FragmentActivity)activity, Lifecycle.State.CREATED);
	//    3    7:aload_1         
	//    4    8:checkcast       #24  <Class FragmentActivity>
	//    5   11:getstatic       #47  <Field Lifecycle$State Lifecycle$State.CREATED>
	//    6   14:invokestatic    #51  <Method void LifecycleDispatcher.access$000(FragmentActivity, Lifecycle$State)>
	//    7   17:return          
	}

	private final LifecycleDispatcher.FragmentCallback mFragmentCallback = new LifecycleDispatcher.FragmentCallback();

	LifecycleDispatcher$DispatcherActivityCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void EmptyActivityLifecycleCallbacks()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class LifecycleDispatcher$FragmentCallback>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void LifecycleDispatcher$FragmentCallback()>
	//    6   12:putfield        #19  <Field LifecycleDispatcher$FragmentCallback mFragmentCallback>
	//    7   15:return          
	}
}
