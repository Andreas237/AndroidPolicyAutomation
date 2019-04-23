// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.support.v4.app.Fragment;

// Referenced classes of package android.arch.lifecycle:
//			LifecycleDispatcher

public static class LifecycleDispatcher$DestructionReportFragment extends Fragment
{

	protected void dispatch(Lifecycle.Event event)
	{
		LifecycleDispatcher.access$100(getParentFragment(), event);
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

	public LifecycleDispatcher$DestructionReportFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Fragment()>
	//    2    4:return          
	}
}
