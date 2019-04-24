// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$d
	implements android.support.v4.view.AdapterChangeListener
{

	void e(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean e>
	//    3    5:return          
	}

	public void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1)
	{
		if(a.mViewPager == viewpager)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field TabLayout a>
	//*   2    4:getfield        #32  <Field ViewPager TabLayout.mViewPager>
	//*   3    7:aload_1         
	//*   4    8:if_acmpne       23
			a.setPagerAdapter(pageradapter1, e);
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field TabLayout a>
	//    7   15:aload_3         
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field boolean e>
	//   10   20:invokevirtual   #36  <Method void TabLayout.setPagerAdapter(PagerAdapter, boolean)>
	//   11   23:return          
	}

	final TabLayout a;
	private boolean e;

	TabLayout$d(TabLayout tablayout)
	{
		a = tablayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TabLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
