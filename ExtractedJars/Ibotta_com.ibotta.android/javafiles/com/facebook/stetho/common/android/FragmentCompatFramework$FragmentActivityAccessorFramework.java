// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.Activity;
import android.app.FragmentManager;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentActivityAccessor, FragmentCompatFramework

private static class FragmentCompatFramework$FragmentActivityAccessorFramework
	implements FragmentActivityAccessor
{

	public FragmentManager getFragmentManager(Activity activity)
	{
		return activity.getFragmentManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method FragmentManager Activity.getFragmentManager()>
	//    2    4:areturn         
	}

	public volatile Object getFragmentManager(Activity activity)
	{
		return ((Object) (getFragmentManager(activity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method FragmentManager getFragmentManager(Activity)>
	//    3    5:areturn         
	}

	private FragmentCompatFramework$FragmentActivityAccessorFramework()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	FragmentCompatFramework$FragmentActivityAccessorFramework(FragmentCompatFramework._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void FragmentCompatFramework$FragmentActivityAccessorFramework()>
	//    2    4:return          
	}
}
