// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.view.ViewPager;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.view.CustomViewPager;

// Referenced classes of package com.irobot.home:
//			HistoryActivity

class HistoryActivity$2 extends android.support.design.widget.TabLayout.h
{

	public void a(android.support.design.widget.TabLayout.e e)
	{
		super.a(e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void android.support.design.widget.TabLayout$h.a(android.support.design.widget.TabLayout$e)>
		AnalyticsSubsystem.getInstance().trackHistorySummaryTabChanged();
	//    3    5:invokestatic    #28  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4    8:invokevirtual   #31  <Method void AnalyticsSubsystem.trackHistorySummaryTabChanged()>
		a.a.d(e.c());
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field HistoryActivity a>
	//    7   15:getfield        #34  <Field CustomViewPager HistoryActivity.a>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #40  <Method int android.support.design.widget.TabLayout$e.c()>
	//   10   22:invokevirtual   #46  <Method void CustomViewPager.d(int)>
	//   11   25:return          
	}

	public void b(android.support.design.widget.TabLayout.e e)
	{
		super.b(e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void android.support.design.widget.TabLayout$h.b(android.support.design.widget.TabLayout$e)>
	//    3    5:return          
	}

	public void c(android.support.design.widget.TabLayout.e e)
	{
		super.c(e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void android.support.design.widget.TabLayout$h.c(android.support.design.widget.TabLayout$e)>
	//    3    5:return          
	}

	final HistoryActivity a;

	HistoryActivity$2(HistoryActivity historyactivity, ViewPager viewpager)
	{
		a = historyactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field HistoryActivity a>
		super(viewpager);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void android.support.design.widget.TabLayout$h(ViewPager)>
	//    6   10:return          
	}
}
