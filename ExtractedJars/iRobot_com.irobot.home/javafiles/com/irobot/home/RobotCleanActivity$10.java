// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

class RobotCleanActivity$10
	implements android.content.issListener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		RobotCleanActivity.a(a, ((android.app.AlertDialog) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field RobotCleanActivity a>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #25  <Method android.app.AlertDialog RobotCleanActivity.a(RobotCleanActivity, android.app.AlertDialog)>
	//    4    8:pop             
	//    5    9:return          
	}

	final RobotCleanActivity a;

	RobotCleanActivity$10(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
