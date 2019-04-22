// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.os.Bundle;
import android.support.v4.app.*;

// Referenced classes of package android.arch.lifecycle:
//			LifecycleDispatcher, LifecycleRegistryOwner

static class LifecycleDispatcher$FragmentCallback extends android.support.v4.app.backs
{

	public void onFragmentCreated(FragmentManager fragmentmanager, Fragment fragment, Bundle bundle)
	{
		LifecycleDispatcher.access$100(fragment, Lifecycle.Event.ON_CREATE);
	//    0    0:aload_2         
	//    1    1:getstatic       #21  <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
	//    2    4:invokestatic    #25  <Method void LifecycleDispatcher.access$100(Fragment, Lifecycle$Event)>
		if(!(fragment instanceof LifecycleRegistryOwner))
	//*   3    7:aload_2         
	//*   4    8:instanceof      #27  <Class LifecycleRegistryOwner>
	//*   5   11:ifne            15
			return;
	//    6   14:return          
		if(fragment.getChildFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null)
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #33  <Method FragmentManager Fragment.getChildFragmentManager()>
	//*   9   19:ldc1            #35  <String "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag">
	//*  10   21:invokevirtual   #41  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//*  11   24:ifnonnull       50
			fragment.getChildFragmentManager().beginTransaction().add(((Fragment) (new Fragment())), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
	//   12   27:aload_2         
	//   13   28:invokevirtual   #33  <Method FragmentManager Fragment.getChildFragmentManager()>
	//   14   31:invokevirtual   #45  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   15   34:new             #47  <Class LifecycleDispatcher$DestructionReportFragment>
	//   16   37:dup             
	//   17   38:invokespecial   #48  <Method void LifecycleDispatcher$DestructionReportFragment()>
	//   18   41:ldc1            #35  <String "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag">
	//   19   43:invokevirtual   #54  <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   20   46:invokevirtual   #58  <Method int FragmentTransaction.commit()>
	//   21   49:pop             
	//   22   50:return          
	}

	public void onFragmentResumed(FragmentManager fragmentmanager, Fragment fragment)
	{
		LifecycleDispatcher.access$100(fragment, Lifecycle.Event.ON_RESUME);
	//    0    0:aload_2         
	//    1    1:getstatic       #63  <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
	//    2    4:invokestatic    #25  <Method void LifecycleDispatcher.access$100(Fragment, Lifecycle$Event)>
	//    3    7:return          
	}

	public void onFragmentStarted(FragmentManager fragmentmanager, Fragment fragment)
	{
		LifecycleDispatcher.access$100(fragment, Lifecycle.Event.ON_START);
	//    0    0:aload_2         
	//    1    1:getstatic       #67  <Field Lifecycle$Event Lifecycle$Event.ON_START>
	//    2    4:invokestatic    #25  <Method void LifecycleDispatcher.access$100(Fragment, Lifecycle$Event)>
	//    3    7:return          
	}

	LifecycleDispatcher$FragmentCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks()>
	//    2    4:return          
	}
}
