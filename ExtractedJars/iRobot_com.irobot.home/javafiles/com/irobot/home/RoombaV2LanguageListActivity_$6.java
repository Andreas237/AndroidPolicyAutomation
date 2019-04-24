// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.model.RobotLanguage;

// Referenced classes of package com.irobot.home:
//			RoombaV2LanguageListActivity_

class RoombaV2LanguageListActivity_$6
	implements Runnable
{

	public void run()
	{
		RoombaV2LanguageListActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field RoombaV2LanguageListActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field RobotLanguage a>
	//    4    8:invokestatic    #27  <Method void RoombaV2LanguageListActivity_.a(RoombaV2LanguageListActivity_, RobotLanguage)>
	//    5   11:return          
	}

	final RobotLanguage a;
	final RoombaV2LanguageListActivity_ b;

	RoombaV2LanguageListActivity_$6(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, RobotLanguage robotlanguage)
	{
		b = roombav2languagelistactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RoombaV2LanguageListActivity_ b>
		a = robotlanguage;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field RobotLanguage a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
