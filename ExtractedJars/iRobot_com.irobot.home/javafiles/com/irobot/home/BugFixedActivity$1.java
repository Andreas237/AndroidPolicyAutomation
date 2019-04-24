// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			BugFixedActivity, SelectRobotTypeActivity_

class BugFixedActivity$1
	implements android.view.r
{

	public void onClick(View view)
	{
		AnalyticsSubsystem.getInstance().trackReAddRobotPressedAfterBlidHealing();
	//    0    0:invokestatic    #28  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokevirtual   #31  <Method void AnalyticsSubsystem.trackReAddRobotPressedAfterBlidHealing()>
		view = ((View) (new Intent(((android.content.Context) (a)), com/irobot/home/SelectRobotTypeActivity_)));
	//    2    6:new             #33  <Class Intent>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field BugFixedActivity a>
	//    6   14:ldc1            #35  <Class SelectRobotTypeActivity_>
	//    7   16:invokespecial   #38  <Method void Intent(android.content.Context, Class)>
	//    8   19:astore_1        
		j.a(((android.app.Activity) (a)), ((Intent) (view)));
	//    9   20:aload_0         
	//   10   21:getfield        #17  <Field BugFixedActivity a>
	//   11   24:aload_1         
	//   12   25:invokestatic    #43  <Method void j.a(android.app.Activity, Intent)>
	//   13   28:return          
	}

	final BugFixedActivity a;

	BugFixedActivity$1(BugFixedActivity bugfixedactivity)
	{
		a = bugfixedactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BugFixedActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
