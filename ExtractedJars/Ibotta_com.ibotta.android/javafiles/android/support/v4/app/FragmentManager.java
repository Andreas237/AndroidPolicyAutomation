// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			FragmentTransaction, Fragment

public abstract class FragmentManager
{
	public static interface BackStackEntry
	{

		public abstract CharSequence getBreadCrumbShortTitle();

		public abstract int getBreadCrumbShortTitleRes();

		public abstract CharSequence getBreadCrumbTitle();

		public abstract int getBreadCrumbTitleRes();

		public abstract int getId();

		public abstract String getName();
	}

	public static abstract class FragmentLifecycleCallbacks
	{

		public void onFragmentActivityCreated(FragmentManager fragmentmanager, Fragment fragment, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onFragmentAttached(FragmentManager fragmentmanager, Fragment fragment, Context context)
		{
		//    0    0:return          
		}

		public void onFragmentCreated(FragmentManager fragmentmanager, Fragment fragment, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onFragmentDestroyed(FragmentManager fragmentmanager, Fragment fragment)
		{
		//    0    0:return          
		}

		public void onFragmentDetached(FragmentManager fragmentmanager, Fragment fragment)
		{
		//    0    0:return          
		}

		public void onFragmentPaused(FragmentManager fragmentmanager, Fragment fragment)
		{
		//    0    0:return          
		}

		public void onFragmentPreAttached(FragmentManager fragmentmanager, Fragment fragment, Context context)
		{
		//    0    0:return          
		}

		public void onFragmentPreCreated(FragmentManager fragmentmanager, Fragment fragment, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onFragmentResumed(FragmentManager fragmentmanager, Fragment fragment)
		{
		//    0    0:return          
		}

		public void onFragmentSaveInstanceState(FragmentManager fragmentmanager, Fragment fragment, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onFragmentStarted(FragmentManager fragmentmanager, Fragment fragment)
		{
		//    0    0:return          
		}

		public void onFragmentStopped(FragmentManager fragmentmanager, Fragment fragment)
		{
		//    0    0:return          
		}

		public void onFragmentViewCreated(FragmentManager fragmentmanager, Fragment fragment, View view, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onFragmentViewDestroyed(FragmentManager fragmentmanager, Fragment fragment)
		{
		//    0    0:return          
		}

		public FragmentLifecycleCallbacks()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface OnBackStackChangedListener
	{

		public abstract void onBackStackChanged();
	}


	public FragmentManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public abstract FragmentTransaction beginTransaction();

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public abstract boolean executePendingTransactions();

	public abstract Fragment findFragmentByTag(String s);

	public abstract List getFragments();

	public abstract boolean isStateSaved();

	public abstract void popBackStack(int i, int j);

	public abstract boolean popBackStackImmediate();

	public abstract void registerFragmentLifecycleCallbacks(FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag);
}
