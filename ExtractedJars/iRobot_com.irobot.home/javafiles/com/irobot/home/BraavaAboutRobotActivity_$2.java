// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AssetSoftwareVersionEvent;

// Referenced classes of package com.irobot.home:
//			BraavaAboutRobotActivity_

class BraavaAboutRobotActivity_$2
	implements Runnable
{

	public void run()
	{
		BraavaAboutRobotActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BraavaAboutRobotActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AssetSoftwareVersionEvent a>
	//    4    8:invokestatic    #28  <Method void BraavaAboutRobotActivity_.a(BraavaAboutRobotActivity_, AssetSoftwareVersionEvent)>
	//    5   11:return          
	}

	final AssetSoftwareVersionEvent a;
	final BraavaAboutRobotActivity_ b;

	BraavaAboutRobotActivity_$2(BraavaAboutRobotActivity_ braavaaboutrobotactivity_, AssetSoftwareVersionEvent assetsoftwareversionevent)
	{
		b = braavaaboutrobotactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaAboutRobotActivity_ b>
		a = assetsoftwareversionevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AssetSoftwareVersionEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
