// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$20
	implements android.content.tener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		BroadcastSetupActivity.h(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:invokestatic    #25  <Method void BroadcastSetupActivity.h(BroadcastSetupActivity)>
		a.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field BroadcastSetupActivity a>
	//    5   11:invokevirtual   #28  <Method void BroadcastSetupActivity.finish()>
	//    6   14:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$20(BroadcastSetupActivity broadcastsetupactivity)
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
