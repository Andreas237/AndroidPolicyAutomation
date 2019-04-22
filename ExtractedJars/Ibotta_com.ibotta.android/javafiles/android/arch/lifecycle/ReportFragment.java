// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.*;
import android.os.Bundle;

// Referenced classes of package android.arch.lifecycle:
//			LifecycleRegistryOwner, LifecycleRegistry, LifecycleOwner

public class ReportFragment extends Fragment
{
	static interface ActivityInitializationListener
	{

		public abstract void onCreate();

		public abstract void onResume();

		public abstract void onStart();
	}


	public ReportFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Fragment()>
	//    2    4:return          
	}

	private void dispatch(Lifecycle.Event event)
	{
		Object obj = ((Object) (getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Activity getActivity()>
	//    2    4:astore_2        
		if(obj instanceof LifecycleRegistryOwner)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #26  <Class LifecycleRegistryOwner>
	//*   5    9:ifeq            26
		{
			((LifecycleRegistryOwner)obj).getLifecycle().handleLifecycleEvent(event);
	//    6   12:aload_2         
	//    7   13:checkcast       #26  <Class LifecycleRegistryOwner>
	//    8   16:invokeinterface #30  <Method LifecycleRegistry LifecycleRegistryOwner.getLifecycle()>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #35  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
			return;
	//   11   25:return          
		}
		if(obj instanceof LifecycleOwner)
	//*  12   26:aload_2         
	//*  13   27:instanceof      #37  <Class LifecycleOwner>
	//*  14   30:ifeq            58
		{
			obj = ((Object) (((LifecycleOwner)obj).getLifecycle()));
	//   15   33:aload_2         
	//   16   34:checkcast       #37  <Class LifecycleOwner>
	//   17   37:invokeinterface #40  <Method Lifecycle LifecycleOwner.getLifecycle()>
	//   18   42:astore_2        
			if(obj instanceof LifecycleRegistry)
	//*  19   43:aload_2         
	//*  20   44:instanceof      #32  <Class LifecycleRegistry>
	//*  21   47:ifeq            58
				((LifecycleRegistry)obj).handleLifecycleEvent(event);
	//   22   50:aload_2         
	//   23   51:checkcast       #32  <Class LifecycleRegistry>
	//   24   54:aload_1         
	//   25   55:invokevirtual   #35  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
		}
	//   26   58:return          
	}

	private void dispatchCreate(ActivityInitializationListener activityinitializationlistener)
	{
		if(activityinitializationlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			activityinitializationlistener.onCreate();
	//    2    4:aload_1         
	//    3    5:invokeinterface #45  <Method void ReportFragment$ActivityInitializationListener.onCreate()>
	//    4   10:return          
	}

	private void dispatchResume(ActivityInitializationListener activityinitializationlistener)
	{
		if(activityinitializationlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			activityinitializationlistener.onResume();
	//    2    4:aload_1         
	//    3    5:invokeinterface #49  <Method void ReportFragment$ActivityInitializationListener.onResume()>
	//    4   10:return          
	}

	private void dispatchStart(ActivityInitializationListener activityinitializationlistener)
	{
		if(activityinitializationlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			activityinitializationlistener.onStart();
	//    2    4:aload_1         
	//    3    5:invokeinterface #53  <Method void ReportFragment$ActivityInitializationListener.onStart()>
	//    4   10:return          
	}

	static ReportFragment get(Activity activity)
	{
		return (ReportFragment)activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method FragmentManager Activity.getFragmentManager()>
	//    2    4:ldc1            #63  <String "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag">
	//    3    6:invokevirtual   #69  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    4    9:checkcast       #2   <Class ReportFragment>
	//    5   12:areturn         
	}

	public static void injectIfNeededIn(Activity activity)
	{
		activity = ((Activity) (activity.getFragmentManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method FragmentManager Activity.getFragmentManager()>
	//    2    4:astore_0        
		if(((FragmentManager) (activity)).findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null)
	//*   3    5:aload_0         
	//*   4    6:ldc1            #63  <String "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag">
	//*   5    8:invokevirtual   #69  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//*   6   11:ifnonnull       39
		{
			((FragmentManager) (activity)).beginTransaction().add(((Fragment) (new ReportFragment())), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #75  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    9   18:new             #2   <Class ReportFragment>
	//   10   21:dup             
	//   11   22:invokespecial   #76  <Method void ReportFragment()>
	//   12   25:ldc1            #63  <String "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag">
	//   13   27:invokevirtual   #82  <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   14   30:invokevirtual   #86  <Method int FragmentTransaction.commit()>
	//   15   33:pop             
			((FragmentManager) (activity)).executePendingTransactions();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #90  <Method boolean FragmentManager.executePendingTransactions()>
	//   18   38:pop             
		}
	//   19   39:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method void Fragment.onActivityCreated(Bundle)>
		dispatchCreate(mProcessListener);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #96  <Field ReportFragment$ActivityInitializationListener mProcessListener>
	//    6   10:invokespecial   #98  <Method void dispatchCreate(ReportFragment$ActivityInitializationListener)>
		dispatch(Lifecycle.Event.ON_CREATE);
	//    7   13:aload_0         
	//    8   14:getstatic       #104 <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
	//    9   17:invokespecial   #106 <Method void dispatch(Lifecycle$Event)>
	//   10   20:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void Fragment.onDestroy()>
		dispatch(Lifecycle.Event.ON_DESTROY);
	//    2    4:aload_0         
	//    3    5:getstatic       #112 <Field Lifecycle$Event Lifecycle$Event.ON_DESTROY>
	//    4    8:invokespecial   #106 <Method void dispatch(Lifecycle$Event)>
		mProcessListener = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #96  <Field ReportFragment$ActivityInitializationListener mProcessListener>
	//    8   16:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method void Fragment.onPause()>
		dispatch(Lifecycle.Event.ON_PAUSE);
	//    2    4:aload_0         
	//    3    5:getstatic       #118 <Field Lifecycle$Event Lifecycle$Event.ON_PAUSE>
	//    4    8:invokespecial   #106 <Method void dispatch(Lifecycle$Event)>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void Fragment.onResume()>
		dispatchResume(mProcessListener);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field ReportFragment$ActivityInitializationListener mProcessListener>
	//    5    9:invokespecial   #121 <Method void dispatchResume(ReportFragment$ActivityInitializationListener)>
		dispatch(Lifecycle.Event.ON_RESUME);
	//    6   12:aload_0         
	//    7   13:getstatic       #124 <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
	//    8   16:invokespecial   #106 <Method void dispatch(Lifecycle$Event)>
	//    9   19:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Fragment.onStart()>
		dispatchStart(mProcessListener);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field ReportFragment$ActivityInitializationListener mProcessListener>
	//    5    9:invokespecial   #127 <Method void dispatchStart(ReportFragment$ActivityInitializationListener)>
		dispatch(Lifecycle.Event.ON_START);
	//    6   12:aload_0         
	//    7   13:getstatic       #130 <Field Lifecycle$Event Lifecycle$Event.ON_START>
	//    8   16:invokespecial   #106 <Method void dispatch(Lifecycle$Event)>
	//    9   19:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void Fragment.onStop()>
		dispatch(Lifecycle.Event.ON_STOP);
	//    2    4:aload_0         
	//    3    5:getstatic       #136 <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
	//    4    8:invokespecial   #106 <Method void dispatch(Lifecycle$Event)>
	//    5   11:return          
	}

	void setProcessListener(ActivityInitializationListener activityinitializationlistener)
	{
		mProcessListener = activityinitializationlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field ReportFragment$ActivityInitializationListener mProcessListener>
	//    3    5:return          
	}

	private ActivityInitializationListener mProcessListener;
}
