// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.fragments.ac;

// Referenced classes of package com.irobot.home:
//			BaseCleanActivity

class BaseCleanActivity$2
	implements android.support.v4.widget.DrawerLayout.c
{

	public void onDrawerClosed(View view)
	{
	//    0    0:return          
	}

	public void onDrawerOpened(View view)
	{
		if(a.g(0x800003))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field DrawerLayout a>
	//*   2    4:ldc1            #28  <Int 0x800003>
	//*   3    6:invokevirtual   #34  <Method boolean DrawerLayout.g(int)>
	//*   4    9:ifeq            18
			AnalyticsSubsystem.getInstance().trackSideMenuView();
	//    5   12:invokestatic    #40  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   15:invokevirtual   #43  <Method void AnalyticsSubsystem.trackSideMenuView()>
		if(a.g(0x800005) && b.i != null)
	//*   7   18:aload_0         
	//*   8   19:getfield        #21  <Field DrawerLayout a>
	//*   9   22:ldc1            #44  <Int 0x800005>
	//*  10   24:invokevirtual   #34  <Method boolean DrawerLayout.g(int)>
	//*  11   27:ifeq            50
	//*  12   30:aload_0         
	//*  13   31:getfield        #19  <Field BaseCleanActivity b>
	//*  14   34:getfield        #48  <Field ac BaseCleanActivity.i>
	//*  15   37:ifnull          50
			b.i.d();
	//   16   40:aload_0         
	//   17   41:getfield        #19  <Field BaseCleanActivity b>
	//   18   44:getfield        #48  <Field ac BaseCleanActivity.i>
	//   19   47:invokevirtual   #53  <Method void ac.d()>
	//   20   50:return          
	}

	public void onDrawerSlide(View view, float f)
	{
	//    0    0:return          
	}

	public void onDrawerStateChanged(int i)
	{
	//    0    0:return          
	}

	final DrawerLayout a;
	final BaseCleanActivity b;

	BaseCleanActivity$2(BaseCleanActivity basecleanactivity, DrawerLayout drawerlayout)
	{
		b = basecleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseCleanActivity b>
		a = drawerlayout;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field DrawerLayout a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
