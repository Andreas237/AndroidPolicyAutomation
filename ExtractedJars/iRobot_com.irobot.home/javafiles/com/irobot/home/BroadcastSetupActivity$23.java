// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$23
	implements Runnable
{

	public void run()
	{
		o.b(a.w, "showing current step on main thread.");
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:getfield        #25  <Field String BroadcastSetupActivity.w>
	//    3    7:ldc1            #27  <String "showing current step on main thread.">
	//    4    9:invokestatic    #33  <Method void o.b(String, String)>
		a.m();
	//    5   12:aload_0         
	//    6   13:getfield        #17  <Field BroadcastSetupActivity a>
	//    7   16:invokevirtual   #36  <Method void BroadcastSetupActivity.m()>
	//    8   19:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$23(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
