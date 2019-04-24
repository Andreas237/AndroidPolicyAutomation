// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity_

class BroadcastSetupActivity_$7
	implements Runnable
{

	public void run()
	{
		BroadcastSetupActivity_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field BroadcastSetupActivity_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a a>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field boolean b>
	//    6   12:invokestatic    #31  <Method void BroadcastSetupActivity_.a(BroadcastSetupActivity_, com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a, boolean)>
	//    7   15:return          
	}

	final com.irobot.home.fragments.ent.a.a a;
	final boolean b;
	final BroadcastSetupActivity_ c;

	BroadcastSetupActivity_$7(BroadcastSetupActivity_ broadcastsetupactivity_, com.irobot.home.fragments.ent.a.a a1, boolean flag)
	{
		c = broadcastsetupactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field BroadcastSetupActivity_ c>
		a = a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field com.irobot.home.fragments.CheckRemoteConnectionFragment$a$a a>
		b = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field boolean b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
