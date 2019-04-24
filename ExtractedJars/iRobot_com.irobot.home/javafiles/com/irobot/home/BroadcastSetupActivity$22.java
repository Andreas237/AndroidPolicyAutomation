// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$22
	implements Runnable
{

	public void run()
	{
		o.e(b.w, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BroadcastSetupActivity b>
	//    2    4:getfield        #28  <Field String BroadcastSetupActivity.w>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field String a>
	//    5   11:invokestatic    #34  <Method void o.e(String, String)>
		b.m();
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field BroadcastSetupActivity b>
	//    8   18:invokevirtual   #37  <Method void BroadcastSetupActivity.m()>
	//    9   21:return          
	}

	final String a;
	final BroadcastSetupActivity b;

	BroadcastSetupActivity$22(BroadcastSetupActivity broadcastsetupactivity, String s)
	{
		b = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BroadcastSetupActivity b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
