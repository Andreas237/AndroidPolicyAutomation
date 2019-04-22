// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.app.Fragment;
import android.app.FragmentManager;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentCompatFramework

private static class FragmentCompatFramework$FragmentAccessorFrameworkJellyBean extends FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb
{

	public FragmentManager getChildFragmentManager(Fragment fragment)
	{
		return fragment.getChildFragmentManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method FragmentManager Fragment.getChildFragmentManager()>
	//    2    4:areturn         
	}

	public volatile Object getChildFragmentManager(Object obj)
	{
		return ((Object) (getChildFragmentManager((Fragment)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Fragment>
	//    3    5:invokevirtual   #30  <Method FragmentManager getChildFragmentManager(Fragment)>
	//    4    8:areturn         
	}

	private FragmentCompatFramework$FragmentAccessorFrameworkJellyBean()
	{
		super(((FragmentCompatFramework._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void FragmentCompatFramework$FragmentAccessorFrameworkHoneycomb(FragmentCompatFramework$1)>
	//    3    5:return          
	}

	FragmentCompatFramework$FragmentAccessorFrameworkJellyBean(FragmentCompatFramework._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void FragmentCompatFramework$FragmentAccessorFrameworkJellyBean()>
	//    2    4:return          
	}
}
