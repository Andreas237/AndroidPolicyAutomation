// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$6
	implements com.irobot.home.fragments.bw.a
{

	public void a(int i)
	{
		BroadcastSetupActivity.a(a, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:iload_1         
	//    3    5:invokestatic    #25  <Method int BroadcastSetupActivity.a(BroadcastSetupActivity, int)>
	//    4    8:pop             
		BroadcastSetupActivity.g(a, false);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
	//    7   13:iconst_0        
	//    8   14:invokestatic    #29  <Method boolean BroadcastSetupActivity.g(BroadcastSetupActivity, boolean)>
	//    9   17:pop             
		a.x = 10;
	//   10   18:aload_0         
	//   11   19:getfield        #17  <Field BroadcastSetupActivity a>
	//   12   22:bipush          10
	//   13   24:putfield        #33  <Field int BroadcastSetupActivity.x>
		BroadcastSetupActivity.m(a);
	//   14   27:aload_0         
	//   15   28:getfield        #17  <Field BroadcastSetupActivity a>
	//   16   31:invokestatic    #36  <Method void BroadcastSetupActivity.m(BroadcastSetupActivity)>
	//   17   34:return          
	}

	public void a(String s)
	{
		BroadcastSetupActivity.h(a, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #40  <Method boolean BroadcastSetupActivity.h(BroadcastSetupActivity, boolean)>
	//    4    8:pop             
		BroadcastSetupActivity.d(a, s);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
	//    7   13:aload_1         
	//    8   14:invokestatic    #44  <Method String BroadcastSetupActivity.d(BroadcastSetupActivity, String)>
	//    9   17:pop             
		BroadcastSetupActivity.n(a);
	//   10   18:aload_0         
	//   11   19:getfield        #17  <Field BroadcastSetupActivity a>
	//   12   22:invokestatic    #47  <Method void BroadcastSetupActivity.n(BroadcastSetupActivity)>
	//   13   25:return          
	}

	public void b(String s)
	{
	//    0    0:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$6(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
