// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.*;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

public class RobotCleanActivity$NewToAppReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		o.c("ModelChanges", intent.getAction());
	//    0    0:ldc1            #21  <String "ModelChanges">
	//    1    2:aload_2         
	//    2    3:invokevirtual   #27  <Method String Intent.getAction()>
	//    3    6:invokestatic    #33  <Method void o.c(String, String)>
		if("com.irobot.home.MODEL_CHANGED".equals(((Object) (intent.getAction()))))
	//*   4    9:ldc1            #35  <String "com.irobot.home.MODEL_CHANGED">
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #27  <Method String Intent.getAction()>
	//*   7   15:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*   8   18:ifeq            28
			a.K();
	//    9   21:aload_0         
	//   10   22:getfield        #13  <Field RobotCleanActivity a>
	//   11   25:invokevirtual   #44  <Method void RobotCleanActivity.K()>
	//   12   28:return          
	}

	final RobotCleanActivity a;

	public RobotCleanActivity$NewToAppReceiver(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
