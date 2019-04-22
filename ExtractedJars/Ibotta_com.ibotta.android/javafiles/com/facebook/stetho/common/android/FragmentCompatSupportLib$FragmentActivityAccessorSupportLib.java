// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentActivityAccessor, FragmentCompatSupportLib

private static class FragmentCompatSupportLib$FragmentActivityAccessorSupportLib
	implements FragmentActivityAccessor
{

	public FragmentManager getFragmentManager(FragmentActivity fragmentactivity)
	{
		return fragmentactivity.getSupportFragmentManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    2    4:areturn         
	}

	public volatile Object getFragmentManager(Activity activity)
	{
		return ((Object) (getFragmentManager((FragmentActivity)activity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class FragmentActivity>
	//    3    5:invokevirtual   #30  <Method FragmentManager getFragmentManager(FragmentActivity)>
	//    4    8:areturn         
	}

	private FragmentCompatSupportLib$FragmentActivityAccessorSupportLib()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	FragmentCompatSupportLib$FragmentActivityAccessorSupportLib(FragmentCompatSupportLib._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void FragmentCompatSupportLib$FragmentActivityAccessorSupportLib()>
	//    2    4:return          
	}
}
