// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			aq

class aq$2
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) (j.j().a()));
	//    0    0:invokestatic    #27  <Method a j.j()>
	//    1    3:invokevirtual   #32  <Method com.irobot.core.AssetInfo a.a()>
	//    2    6:astore_1        
		AnalyticsSubsystem.getInstance().trackLifetimeHistoryInfoButtonPressed(((com.irobot.core.AssetInfo) (view)));
	//    3    7:invokestatic    #38  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #42  <Method void AnalyticsSubsystem.trackLifetimeHistoryInfoButtonPressed(com.irobot.core.AssetInfo)>
		com.irobot.home.fragments.aq.a(a);
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field aq a>
	//    8   18:invokestatic    #44  <Method void com.irobot.home.fragments.aq.a(aq)>
	//    9   21:return          
	}

	final aq a;

	aq$2(aq aq1)
	{
		a = aq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field aq a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
