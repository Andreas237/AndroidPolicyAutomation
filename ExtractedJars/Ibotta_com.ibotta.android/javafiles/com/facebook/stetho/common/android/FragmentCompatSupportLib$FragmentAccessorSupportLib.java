// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;

// Referenced classes of package com.facebook.stetho.common.android:
//			FragmentAccessor, FragmentCompatSupportLib

private static class FragmentCompatSupportLib$FragmentAccessorSupportLib
	implements FragmentAccessor
{

	public FragmentManager getChildFragmentManager(Fragment fragment)
	{
		return fragment.getChildFragmentManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method FragmentManager Fragment.getChildFragmentManager()>
	//    2    4:areturn         
	}

	public volatile Object getChildFragmentManager(Object obj)
	{
		return ((Object) (getChildFragmentManager((Fragment)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Fragment>
	//    3    5:invokevirtual   #29  <Method FragmentManager getChildFragmentManager(Fragment)>
	//    4    8:areturn         
	}

	public FragmentManager getFragmentManager(Fragment fragment)
	{
		return fragment.getFragmentManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method FragmentManager Fragment.getFragmentManager()>
	//    2    4:areturn         
	}

	public volatile Object getFragmentManager(Object obj)
	{
		return ((Object) (getFragmentManager((Fragment)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Fragment>
	//    3    5:invokevirtual   #34  <Method FragmentManager getFragmentManager(Fragment)>
	//    4    8:areturn         
	}

	public int getId(Fragment fragment)
	{
		return fragment.getId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method int Fragment.getId()>
	//    2    4:ireturn         
	}

	public volatile int getId(Object obj)
	{
		return getId((Fragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Fragment>
	//    3    5:invokevirtual   #42  <Method int getId(Fragment)>
	//    4    8:ireturn         
	}

	public Resources getResources(Fragment fragment)
	{
		return fragment.getResources();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method Resources Fragment.getResources()>
	//    2    4:areturn         
	}

	public volatile Resources getResources(Object obj)
	{
		return getResources((Fragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Fragment>
	//    3    5:invokevirtual   #50  <Method Resources getResources(Fragment)>
	//    4    8:areturn         
	}

	public String getTag(Fragment fragment)
	{
		return fragment.getTag();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #55  <Method String Fragment.getTag()>
	//    2    4:areturn         
	}

	public volatile String getTag(Object obj)
	{
		return getTag((Fragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Fragment>
	//    3    5:invokevirtual   #58  <Method String getTag(Fragment)>
	//    4    8:areturn         
	}

	public View getView(Fragment fragment)
	{
		return fragment.getView();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method View Fragment.getView()>
	//    2    4:areturn         
	}

	public volatile View getView(Object obj)
	{
		return getView((Fragment)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class Fragment>
	//    3    5:invokevirtual   #66  <Method View getView(Fragment)>
	//    4    8:areturn         
	}

	private FragmentCompatSupportLib$FragmentAccessorSupportLib()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	FragmentCompatSupportLib$FragmentAccessorSupportLib(FragmentCompatSupportLib._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void FragmentCompatSupportLib$FragmentAccessorSupportLib()>
	//    2    4:return          
	}
}
