// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AccountLoggedOutEvent;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity_

class RobotCleanActivity_$8
	implements Runnable
{

	public void run()
	{
		RobotCleanActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RobotCleanActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AccountLoggedOutEvent a>
	//    4    8:invokestatic    #28  <Method void RobotCleanActivity_.a(RobotCleanActivity_, AccountLoggedOutEvent)>
	//    5   11:return          
	}

	final AccountLoggedOutEvent a;
	final RobotCleanActivity_ b;

	RobotCleanActivity_$8(RobotCleanActivity_ robotcleanactivity_, AccountLoggedOutEvent accountloggedoutevent)
	{
		b = robotcleanactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RobotCleanActivity_ b>
		a = accountloggedoutevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AccountLoggedOutEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
