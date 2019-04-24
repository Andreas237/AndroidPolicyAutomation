// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			NotificationSettingsActivity_

class NotificationSettingsActivity_$1
	implements Runnable
{

	public void run()
	{
		NotificationSettingsActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field NotificationSettingsActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ArrayList a>
	//    4    8:invokestatic    #27  <Method void NotificationSettingsActivity_.a(NotificationSettingsActivity_, ArrayList)>
	//    5   11:return          
	}

	final ArrayList a;
	final NotificationSettingsActivity_ b;

	NotificationSettingsActivity_$1(NotificationSettingsActivity_ notificationsettingsactivity_, ArrayList arraylist)
	{
		b = notificationsettingsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field NotificationSettingsActivity_ b>
		a = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ArrayList a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
