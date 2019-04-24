// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$14
	implements android.content.tener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		BroadcastSetupActivity.j(a, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BroadcastSetupActivity a>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #26  <Method boolean BroadcastSetupActivity.j(BroadcastSetupActivity, boolean)>
	//    4    8:pop             
		a.i();
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field BroadcastSetupActivity a>
	//    7   13:invokevirtual   #29  <Method void BroadcastSetupActivity.i()>
	//    8   16:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$14(BroadcastSetupActivity broadcastsetupactivity)
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
