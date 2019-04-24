// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.MissionStatusAction;
import com.irobot.home.fragments.be;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

class RobotCleanActivity$7
	implements Runnable
{

	public void run()
	{
		RobotCleanActivity.a(a, MissionStatusAction.TimedOut);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RobotCleanActivity a>
	//    2    4:getstatic       #28  <Field MissionStatusAction MissionStatusAction.TimedOut>
	//    3    7:invokestatic    #31  <Method void RobotCleanActivity.a(RobotCleanActivity, MissionStatusAction)>
		RobotCleanActivity.d(a).B();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field RobotCleanActivity a>
	//    6   14:invokestatic    #35  <Method be RobotCleanActivity.d(RobotCleanActivity)>
	//    7   17:invokevirtual   #40  <Method void be.B()>
		RobotCleanActivity.c(a, false);
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field RobotCleanActivity a>
	//   10   24:iconst_0        
	//   11   25:invokestatic    #44  <Method boolean RobotCleanActivity.c(RobotCleanActivity, boolean)>
	//   12   28:pop             
	//   13   29:return          
	}

	final RobotCleanActivity a;

	RobotCleanActivity$7(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
