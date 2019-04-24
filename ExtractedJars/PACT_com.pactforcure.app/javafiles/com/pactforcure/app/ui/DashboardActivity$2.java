// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.support.design.widget.TabLayout;

// Referenced classes of package com.pactforcure.app.ui:
//			DashboardActivity

class DashboardActivity$2
	implements android.support.v4.view.geListener
{

	public void onPageScrollStateChanged(int i)
	{
	//    0    0:return          
	}

	public void onPageScrolled(int i, float f, int j)
	{
	//    0    0:return          
	}

	public void onPageSelected(int i)
	{
		val$tabLayout.getTabAt(i).select();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field TabLayout val$tabLayout>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #36  <Method android.support.design.widget.TabLayout$Tab TabLayout.getTabAt(int)>
	//    4    8:invokevirtual   #41  <Method void android.support.design.widget.TabLayout$Tab.select()>
	//    5   11:return          
	}

	final DashboardActivity this$0;
	final TabLayout val$tabLayout;

	DashboardActivity$2()
	{
		this$0 = final_dashboardactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DashboardActivity this$0>
		val$tabLayout = TabLayout.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TabLayout val$tabLayout>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
