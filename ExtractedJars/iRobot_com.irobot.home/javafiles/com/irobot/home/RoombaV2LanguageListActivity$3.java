// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.CommandTierAgent;

// Referenced classes of package com.irobot.home:
//			RoombaV2LanguageListActivity

class RoombaV2LanguageListActivity$3
	implements Runnable
{

	public void run()
	{
		RoombaV2LanguageListActivity.a(b, true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity b>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #28  <Method boolean RoombaV2LanguageListActivity.a(RoombaV2LanguageListActivity, boolean)>
	//    4    8:pop             
		a.disconnect();
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field CommandTierAgent a>
	//    7   13:invokevirtual   #33  <Method void CommandTierAgent.disconnect()>
	//    8   16:return          
	}

	final CommandTierAgent a;
	final RoombaV2LanguageListActivity b;

	RoombaV2LanguageListActivity$3(RoombaV2LanguageListActivity roombav2languagelistactivity, CommandTierAgent commandtieragent)
	{
		b = roombav2languagelistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity b>
		a = commandtieragent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CommandTierAgent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
