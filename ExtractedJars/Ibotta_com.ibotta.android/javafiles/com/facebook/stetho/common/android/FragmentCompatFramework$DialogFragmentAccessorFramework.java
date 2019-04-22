// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.*;
import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.facebook.stetho.common.android:
//			DialogFragmentAccessor, FragmentCompatFramework, FragmentAccessor

private static class FragmentCompatFramework$DialogFragmentAccessorFramework
	implements DialogFragmentAccessor
{

	public FragmentManager getChildFragmentManager(Fragment fragment)
	{
		return (FragmentManager)mFragmentAccessor.getChildFragmentManager(((Object) (fragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method Object FragmentAccessor.getChildFragmentManager(Object)>
	//    4   10:checkcast       #33  <Class FragmentManager>
	//    5   13:areturn         
	}

	public volatile Object getChildFragmentManager(Object obj)
	{
		return ((Object) (getChildFragmentManager((Fragment)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Fragment>
	//    3    5:invokevirtual   #38  <Method FragmentManager getChildFragmentManager(Fragment)>
	//    4    8:areturn         
	}

	public Dialog getDialog(DialogFragment dialogfragment)
	{
		return dialogfragment.getDialog();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method Dialog DialogFragment.getDialog()>
	//    2    4:areturn         
	}

	public volatile Dialog getDialog(Object obj)
	{
		return getDialog((DialogFragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class DialogFragment>
	//    3    5:invokevirtual   #48  <Method Dialog getDialog(DialogFragment)>
	//    4    8:areturn         
	}

	public FragmentManager getFragmentManager(Fragment fragment)
	{
		return (FragmentManager)mFragmentAccessor.getFragmentManager(((Object) (fragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #51  <Method Object FragmentAccessor.getFragmentManager(Object)>
	//    4   10:checkcast       #33  <Class FragmentManager>
	//    5   13:areturn         
	}

	public volatile Object getFragmentManager(Object obj)
	{
		return ((Object) (getFragmentManager((Fragment)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Fragment>
	//    3    5:invokevirtual   #53  <Method FragmentManager getFragmentManager(Fragment)>
	//    4    8:areturn         
	}

	public int getId(Fragment fragment)
	{
		return mFragmentAccessor.getId(((Object) (fragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #58  <Method int FragmentAccessor.getId(Object)>
	//    4   10:ireturn         
	}

	public volatile int getId(Object obj)
	{
		return getId((Fragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Fragment>
	//    3    5:invokevirtual   #60  <Method int getId(Fragment)>
	//    4    8:ireturn         
	}

	public Resources getResources(Fragment fragment)
	{
		return mFragmentAccessor.getResources(((Object) (fragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #65  <Method Resources FragmentAccessor.getResources(Object)>
	//    4   10:areturn         
	}

	public volatile Resources getResources(Object obj)
	{
		return getResources((Fragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Fragment>
	//    3    5:invokevirtual   #67  <Method Resources getResources(Fragment)>
	//    4    8:areturn         
	}

	public String getTag(Fragment fragment)
	{
		return mFragmentAccessor.getTag(((Object) (fragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #72  <Method String FragmentAccessor.getTag(Object)>
	//    4   10:areturn         
	}

	public volatile String getTag(Object obj)
	{
		return getTag((Fragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Fragment>
	//    3    5:invokevirtual   #74  <Method String getTag(Fragment)>
	//    4    8:areturn         
	}

	public View getView(Fragment fragment)
	{
		return mFragmentAccessor.getView(((Object) (fragment)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FragmentAccessor mFragmentAccessor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #79  <Method View FragmentAccessor.getView(Object)>
	//    4   10:areturn         
	}

	public volatile View getView(Object obj)
	{
		return getView((Fragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class Fragment>
	//    3    5:invokevirtual   #81  <Method View getView(Fragment)>
	//    4    8:areturn         
	}

	private final FragmentAccessor mFragmentAccessor;

	public FragmentCompatFramework$DialogFragmentAccessorFramework(FragmentAccessor fragmentaccessor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mFragmentAccessor = fragmentaccessor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field FragmentAccessor mFragmentAccessor>
	//    5    9:return          
	}
}
