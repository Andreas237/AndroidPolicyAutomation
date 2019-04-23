// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

// Referenced classes of package android.support.design.widget:
//			TabLayout

private class TabLayout$AdapterChangeListener
	implements android.support.v4.view.r
{

	public void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1)
	{
		if(viewPager == viewpager)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field TabLayout this$0>
	//*   2    4:getfield        #29  <Field ViewPager TabLayout.viewPager>
	//*   3    7:aload_1         
	//*   4    8:if_acmpne       23
			setPagerAdapter(pageradapter1, autoRefresh);
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field TabLayout this$0>
	//    7   15:aload_3         
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field boolean autoRefresh>
	//   10   20:invokevirtual   #35  <Method void TabLayout.setPagerAdapter(PagerAdapter, boolean)>
	//   11   23:return          
	}

	void setAutoRefresh(boolean flag)
	{
		autoRefresh = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field boolean autoRefresh>
	//    3    5:return          
	}

	private boolean autoRefresh;
	final TabLayout this$0;

	TabLayout$AdapterChangeListener()
	{
		this$0 = TabLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TabLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
