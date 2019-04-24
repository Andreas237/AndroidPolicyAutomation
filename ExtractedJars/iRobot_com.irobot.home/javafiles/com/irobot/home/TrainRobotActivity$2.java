// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.CommandType;
import com.irobot.core.MissionSubsystem;

// Referenced classes of package com.irobot.home:
//			TrainRobotActivity

class TrainRobotActivity$2
	implements android.content.ckListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(TrainRobotActivity.a(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field TrainRobotActivity a>
	//*   2    4:invokestatic    #25  <Method MissionSubsystem TrainRobotActivity.a(TrainRobotActivity)>
	//*   3    7:ifnull          23
			TrainRobotActivity.a(a).sendCommand(CommandType.STOP);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field TrainRobotActivity a>
	//    6   14:invokestatic    #25  <Method MissionSubsystem TrainRobotActivity.a(TrainRobotActivity)>
	//    7   17:getstatic       #31  <Field CommandType CommandType.STOP>
	//    8   20:invokevirtual   #37  <Method void MissionSubsystem.sendCommand(CommandType)>
	//    9   23:return          
	}

	final TrainRobotActivity a;

	TrainRobotActivity$2(TrainRobotActivity trainrobotactivity)
	{
		a = trainrobotactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TrainRobotActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
