// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.arch.lifecycle:
//			LifecycleRegistryOwner, LifecycleRegistry, EmptyActivityLifecycleCallbacks, ReportFragment

class LifecycleDispatcher
{
	public static class DestructionReportFragment extends Fragment
	{

		protected void dispatch(Lifecycle.Event event)
		{
			LifecycleDispatcher.dispatchIfLifecycleOwner(getParentFragment(), event);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #18  <Method Fragment getParentFragment()>
		//    2    4:aload_1         
		//    3    5:invokestatic    #22  <Method void LifecycleDispatcher.access$100(Fragment, Lifecycle$Event)>
		//    4    8:return          
		}

		public void onDestroy()
		{
			super.onDestroy();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Fragment.onDestroy()>
			dispatch(Lifecycle.Event.ON_DESTROY);
		//    2    4:aload_0         
		//    3    5:getstatic       #31  <Field Lifecycle$Event Lifecycle$Event.ON_DESTROY>
		//    4    8:invokevirtual   #33  <Method void dispatch(Lifecycle$Event)>
		//    5   11:return          
		}

		public void onPause()
		{
			super.onPause();
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Fragment.onPause()>
			dispatch(Lifecycle.Event.ON_PAUSE);
		//    2    4:aload_0         
		//    3    5:getstatic       #39  <Field Lifecycle$Event Lifecycle$Event.ON_PAUSE>
		//    4    8:invokevirtual   #33  <Method void dispatch(Lifecycle$Event)>
		//    5   11:return          
		}

		public void onStop()
		{
			super.onStop();
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Fragment.onStop()>
			dispatch(Lifecycle.Event.ON_STOP);
		//    2    4:aload_0         
		//    3    5:getstatic       #45  <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
		//    4    8:invokevirtual   #33  <Method void dispatch(Lifecycle$Event)>
		//    5   11:return          
		}

		public DestructionReportFragment()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Fragment()>
		//    2    4:return          
		}
	}

	static class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks
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
				LifecycleDispatcher.markState((FragmentActivity)activity, Lifecycle.State.CREATED);
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
				LifecycleDispatcher.markState((FragmentActivity)activity, Lifecycle.State.CREATED);
		//    3    7:aload_1         
		//    4    8:checkcast       #24  <Class FragmentActivity>
		//    5   11:getstatic       #47  <Field Lifecycle$State Lifecycle$State.CREATED>
		//    6   14:invokestatic    #51  <Method void LifecycleDispatcher.access$000(FragmentActivity, Lifecycle$State)>
		//    7   17:return          
		}

		private final FragmentCallback mFragmentCallback = new FragmentCallback();

		DispatcherActivityCallback()
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

	static class FragmentCallback extends android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
	{

		public void onFragmentCreated(FragmentManager fragmentmanager, Fragment fragment, Bundle bundle)
		{
			LifecycleDispatcher.dispatchIfLifecycleOwner(fragment, Lifecycle.Event.ON_CREATE);
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
				fragment.getChildFragmentManager().beginTransaction().add(((Fragment) (new DestructionReportFragment())), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
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
			LifecycleDispatcher.dispatchIfLifecycleOwner(fragment, Lifecycle.Event.ON_RESUME);
		//    0    0:aload_2         
		//    1    1:getstatic       #63  <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
		//    2    4:invokestatic    #25  <Method void LifecycleDispatcher.access$100(Fragment, Lifecycle$Event)>
		//    3    7:return          
		}

		public void onFragmentStarted(FragmentManager fragmentmanager, Fragment fragment)
		{
			LifecycleDispatcher.dispatchIfLifecycleOwner(fragment, Lifecycle.Event.ON_START);
		//    0    0:aload_2         
		//    1    1:getstatic       #67  <Field Lifecycle$Event Lifecycle$Event.ON_START>
		//    2    4:invokestatic    #25  <Method void LifecycleDispatcher.access$100(Fragment, Lifecycle$Event)>
		//    3    7:return          
		}

		FragmentCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks()>
		//    2    4:return          
		}
	}


	LifecycleDispatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	private static void dispatchIfLifecycleOwner(Fragment fragment, Lifecycle.Event event)
	{
		if(fragment instanceof LifecycleRegistryOwner)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #44  <Class LifecycleRegistryOwner>
	//*   2    4:ifeq            20
			((LifecycleRegistryOwner)fragment).getLifecycle().handleLifecycleEvent(event);
	//    3    7:aload_0         
	//    4    8:checkcast       #44  <Class LifecycleRegistryOwner>
	//    5   11:invokeinterface #48  <Method LifecycleRegistry LifecycleRegistryOwner.getLifecycle()>
	//    6   16:aload_1         
	//    7   17:invokevirtual   #54  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
	//    8   20:return          
	}

	static void init(Context context)
	{
		if(sInitialized.getAndSet(true))
	//*   0    0:getstatic       #29  <Field AtomicBoolean sInitialized>
	//*   1    3:iconst_1        
	//*   2    4:invokevirtual   #60  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (new DispatcherActivityCallback())));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #66  <Method Context Context.getApplicationContext()>
	//    7   15:checkcast       #68  <Class Application>
	//    8   18:new             #9   <Class LifecycleDispatcher$DispatcherActivityCallback>
	//    9   21:dup             
	//   10   22:invokespecial   #69  <Method void LifecycleDispatcher$DispatcherActivityCallback()>
	//   11   25:invokevirtual   #73  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			return;
	//   12   28:return          
		}
	}

	private static void markState(FragmentActivity fragmentactivity, Lifecycle.State state)
	{
		markStateIn(((Object) (fragmentactivity)), state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #77  <Method void markStateIn(Object, Lifecycle$State)>
		markState(fragmentactivity.getSupportFragmentManager(), state);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #83  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    5    9:aload_1         
	//    6   10:invokestatic    #86  <Method void markState(FragmentManager, Lifecycle$State)>
	//    7   13:return          
	}

	private static void markState(FragmentManager fragmentmanager, Lifecycle.State state)
	{
		fragmentmanager = ((FragmentManager) (fragmentmanager.getFragments()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method java.util.List FragmentManager.getFragments()>
	//    2    4:astore_0        
		if(fragmentmanager == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		fragmentmanager = ((FragmentManager) (((Collection) (fragmentmanager)).iterator()));
	//    6   10:aload_0         
	//    7   11:invokeinterface #98  <Method Iterator Collection.iterator()>
	//    8   16:astore_0        
		do
		{
			if(!((Iterator) (fragmentmanager)).hasNext())
				break;
	//    9   17:aload_0         
	//   10   18:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            66
			Fragment fragment = (Fragment)((Iterator) (fragmentmanager)).next();
	//   12   26:aload_0         
	//   13   27:invokeinterface #108 <Method Object Iterator.next()>
	//   14   32:checkcast       #110 <Class Fragment>
	//   15   35:astore_2        
			if(fragment != null)
	//*  16   36:aload_2         
	//*  17   37:ifnonnull       43
	//*  18   40:goto            17
			{
				markStateIn(((Object) (fragment)), state);
	//   19   43:aload_2         
	//   20   44:aload_1         
	//   21   45:invokestatic    #77  <Method void markStateIn(Object, Lifecycle$State)>
				if(fragment.isAdded())
	//*  22   48:aload_2         
	//*  23   49:invokevirtual   #113 <Method boolean Fragment.isAdded()>
	//*  24   52:ifeq            17
					markState(fragment.getChildFragmentManager(), state);
	//   25   55:aload_2         
	//   26   56:invokevirtual   #116 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   27   59:aload_1         
	//   28   60:invokestatic    #86  <Method void markState(FragmentManager, Lifecycle$State)>
			}
		} while(true);
	//   29   63:goto            17
	//   30   66:return          
	}

	private static void markStateIn(Object obj, Lifecycle.State state)
	{
		if(obj instanceof LifecycleRegistryOwner)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #44  <Class LifecycleRegistryOwner>
	//*   2    4:ifeq            20
			((LifecycleRegistryOwner)obj).getLifecycle().markState(state);
	//    3    7:aload_0         
	//    4    8:checkcast       #44  <Class LifecycleRegistryOwner>
	//    5   11:invokeinterface #48  <Method LifecycleRegistry LifecycleRegistryOwner.getLifecycle()>
	//    6   16:aload_1         
	//    7   17:invokevirtual   #119 <Method void LifecycleRegistry.markState(Lifecycle$State)>
	//    8   20:return          
	}

	private static final String REPORT_FRAGMENT_TAG = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag";
	private static AtomicBoolean sInitialized = new AtomicBoolean(false);

	static 
	{
	//    0    0:new             #23  <Class AtomicBoolean>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #27  <Method void AtomicBoolean(boolean)>
	//    4    8:putstatic       #29  <Field AtomicBoolean sInitialized>
	//*   5   11:return          
	}


/*
	static void access$000(FragmentActivity fragmentactivity, Lifecycle.State state)
	{
		markState(fragmentactivity, state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #37  <Method void markState(FragmentActivity, Lifecycle$State)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$100(Fragment fragment, Lifecycle.Event event)
	{
		dispatchIfLifecycleOwner(fragment, event);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #42  <Method void dispatchIfLifecycleOwner(Fragment, Lifecycle$Event)>
		return;
	//    3    5:return          
	}

*/
}
