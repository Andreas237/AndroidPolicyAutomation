// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewPager;

// Referenced classes of package android.support.design.widget:
//			TabLayout

public static class TabLayout$h
	implements TabLayout$b
{

	public void a(TabLayout$e tablayout$e)
	{
		a.setCurrentItem(tablayout$e.c());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ViewPager a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method int TabLayout$e.c()>
	//    4    8:invokevirtual   #32  <Method void ViewPager.setCurrentItem(int)>
	//    5   11:return          
	}

	public void b(TabLayout$e tablayout$e)
	{
	//    0    0:return          
	}

	public void c(TabLayout$e tablayout$e)
	{
	//    0    0:return          
	}

	private final ViewPager a;

	public TabLayout$h(ViewPager viewpager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = viewpager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ViewPager a>
	//    5    9:return          
	}
}
