// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.*;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

class RobotCleanActivity$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent.getAction().equalsIgnoreCase("com.irobot.homeintent.action.CLOUD_ENV_WARNING"))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #24  <Method String Intent.getAction()>
	//*   2    4:ldc1            #26  <String "com.irobot.homeintent.action.CLOUD_ENV_WARNING">
	//*   3    6:invokevirtual   #32  <Method boolean String.equalsIgnoreCase(String)>
	//*   4    9:ifeq            35
		{
			context = ((Context) (intent.getStringExtra("com.irobot.homeintent.extra.APP_CLOUD_ENV")));
	//    5   12:aload_2         
	//    6   13:ldc1            #34  <String "com.irobot.homeintent.extra.APP_CLOUD_ENV">
	//    7   15:invokevirtual   #38  <Method String Intent.getStringExtra(String)>
	//    8   18:astore_1        
			intent = ((Intent) (intent.getStringExtra("com.irobot.homeintent.extra.ASSET_CLOUD_ENV")));
	//    9   19:aload_2         
	//   10   20:ldc1            #40  <String "com.irobot.homeintent.extra.ASSET_CLOUD_ENV">
	//   11   22:invokevirtual   #38  <Method String Intent.getStringExtra(String)>
	//   12   25:astore_2        
			a.a(((String) (context)), ((String) (intent)));
	//   13   26:aload_0         
	//   14   27:getfield        #12  <Field RobotCleanActivity a>
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:invokevirtual   #43  <Method void RobotCleanActivity.a(String, String)>
		}
	//   18   35:return          
	}

	final RobotCleanActivity a;

	RobotCleanActivity$1(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
