// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.RobotPadCategoryEvent;

// Referenced classes of package com.irobot.home:
//			BraavaCleanActivity_

class BraavaCleanActivity_$12
	implements Runnable
{

	public void run()
	{
		BraavaCleanActivity_.b(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BraavaCleanActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field RobotPadCategoryEvent a>
	//    4    8:invokestatic    #28  <Method void BraavaCleanActivity_.b(BraavaCleanActivity_, RobotPadCategoryEvent)>
	//    5   11:return          
	}

	final RobotPadCategoryEvent a;
	final BraavaCleanActivity_ b;

	BraavaCleanActivity_$12(BraavaCleanActivity_ braavacleanactivity_, RobotPadCategoryEvent robotpadcategoryevent)
	{
		b = braavacleanactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaCleanActivity_ b>
		a = robotpadcategoryevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field RobotPadCategoryEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
