// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewPager;

// Referenced classes of package android.support.design.widget:
//			TabLayout

public static class TabLayout$ViewPagerOnTabSelectedListener
	implements TabLayout.OnTabSelectedListener
{

	public void onTabReselected(TabLayout.Tab tab)
	{
	//    0    0:return          
	}

	public void onTabSelected(TabLayout.Tab tab)
	{
		viewPager.setCurrentItem(tab.getPosition());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ViewPager viewPager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method int TabLayout$Tab.getPosition()>
	//    4    8:invokevirtual   #34  <Method void ViewPager.setCurrentItem(int)>
	//    5   11:return          
	}

	public void onTabUnselected(TabLayout.Tab tab)
	{
	//    0    0:return          
	}

	private final ViewPager viewPager;

	public TabLayout$ViewPagerOnTabSelectedListener(ViewPager viewpager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		viewPager = viewpager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ViewPager viewPager>
	//    5    9:return          
	}
}
