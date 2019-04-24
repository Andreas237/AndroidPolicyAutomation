// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.model.WifiConfig;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$15
	implements com.irobot.home.fragments.c.a
{

	public void a(WifiConfig wificonfig, boolean flag)
	{
		a.J = wificonfig;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:aload_1         
	//    3    5:putfield        #26  <Field WifiConfig BroadcastSetupActivity.J>
		BroadcastSetupActivity.k(a, flag);
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field BroadcastSetupActivity a>
	//    6   12:iload_2         
	//    7   13:invokestatic    #30  <Method boolean BroadcastSetupActivity.k(BroadcastSetupActivity, boolean)>
	//    8   16:pop             
		BroadcastSetupActivity.f(a, false);
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field BroadcastSetupActivity a>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #33  <Method boolean BroadcastSetupActivity.f(BroadcastSetupActivity, boolean)>
	//   13   25:pop             
		a.x = 4;
	//   14   26:aload_0         
	//   15   27:getfield        #17  <Field BroadcastSetupActivity a>
	//   16   30:iconst_4        
	//   17   31:putfield        #37  <Field int BroadcastSetupActivity.x>
		a.m();
	//   18   34:aload_0         
	//   19   35:getfield        #17  <Field BroadcastSetupActivity a>
	//   20   38:invokevirtual   #40  <Method void BroadcastSetupActivity.m()>
	//   21   41:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$15(BroadcastSetupActivity broadcastsetupactivity)
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
