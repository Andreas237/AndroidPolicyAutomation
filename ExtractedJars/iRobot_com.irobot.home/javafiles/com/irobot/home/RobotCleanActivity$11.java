// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity, DeveloperActivity_

class RobotCleanActivity$11
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		DeveloperActivity_.a(((android.content.Context) (a))).a();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field RobotCleanActivity a>
	//    2    4:invokestatic    #27  <Method DeveloperActivity_$a DeveloperActivity_.a(android.content.Context)>
	//    3    7:invokevirtual   #32  <Method org.androidannotations.api.a.e DeveloperActivity_$a.a()>
	//    4   10:pop             
	//    5   11:return          
	}

	final RobotCleanActivity a;

	RobotCleanActivity$11(RobotCleanActivity robotcleanactivity)
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
