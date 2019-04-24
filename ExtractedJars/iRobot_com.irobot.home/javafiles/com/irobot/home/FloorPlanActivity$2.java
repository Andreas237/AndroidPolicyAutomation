// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			FloorPlanActivity, RobotCleanActivity_

class FloorPlanActivity$2
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		((a)RobotCleanActivity_.a(((android.content.Context) (a))).g(0x4000000)).a();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field FloorPlanActivity a>
	//    2    4:invokestatic    #27  <Method RobotCleanActivity_$a RobotCleanActivity_.a(android.content.Context)>
	//    3    7:ldc1            #28  <Int 0x4000000>
	//    4    9:invokevirtual   #34  <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
	//    5   12:checkcast       #30  <Class RobotCleanActivity_$a>
	//    6   15:invokevirtual   #37  <Method org.androidannotations.api.a.e RobotCleanActivity_$a.a()>
	//    7   18:pop             
	//    8   19:return          
	}

	final FloorPlanActivity a;

	FloorPlanActivity$2(FloorPlanActivity floorplanactivity)
	{
		a = floorplanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field FloorPlanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
