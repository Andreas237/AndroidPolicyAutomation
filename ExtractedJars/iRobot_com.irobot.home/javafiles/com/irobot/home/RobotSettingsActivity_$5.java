// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			RobotSettingsActivity_

class RobotSettingsActivity_$5
	implements Runnable
{

	public void run()
	{
		RobotSettingsActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RobotSettingsActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field boolean a>
	//    4    8:invokestatic    #28  <Method void RobotSettingsActivity_.a(RobotSettingsActivity_, boolean)>
	//    5   11:return          
	}

	final boolean a;
	final RobotSettingsActivity_ b;

	RobotSettingsActivity_$5(RobotSettingsActivity_ robotsettingsactivity_, boolean flag)
	{
		b = robotsettingsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RobotSettingsActivity_ b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
