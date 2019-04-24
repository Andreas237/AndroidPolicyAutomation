// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			ag

class ag$1
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		j.a(b.getActivity(), a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ag b>
	//    2    4:invokevirtual   #30  <Method android.app.Activity ag.getActivity()>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field String a>
	//    5   11:invokestatic    #35  <Method void j.a(android.app.Activity, String)>
		AnalyticsSubsystem.getInstance().trackStoreView();
	//    6   14:invokestatic    #41  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    7   17:invokevirtual   #44  <Method void AnalyticsSubsystem.trackStoreView()>
	//    8   20:return          
	}

	final String a;
	final ag b;

	ag$1(ag ag1, String s)
	{
		b = ag1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ag b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
