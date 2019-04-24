// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.MissionSubsystem;
import com.irobot.core.MissionUIServiceCommand;

// Referenced classes of package com.irobot.home:
//			BugReportActivity

class BugReportActivity$1
	implements Runnable
{

	public void run()
	{
		BugReportActivity.a(a).sendServiceCommand(MissionUIServiceCommand.DisableLogStream, ((com.irobot.core.MissionUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field BugReportActivity a>
	//    2    4:invokestatic    #22  <Method MissionSubsystem BugReportActivity.a(BugReportActivity)>
	//    3    7:getstatic       #28  <Field MissionUIServiceCommand MissionUIServiceCommand.DisableLogStream>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #34  <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, com.irobot.core.MissionUIServiceData)>
	//    6   14:return          
	}

	final BugReportActivity a;

	BugReportActivity$1(BugReportActivity bugreportactivity)
	{
		a = bugreportactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BugReportActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
