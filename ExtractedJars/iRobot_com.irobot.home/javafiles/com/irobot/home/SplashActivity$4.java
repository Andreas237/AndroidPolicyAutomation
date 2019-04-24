// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			SplashActivity, IRobotApplication

class SplashActivity$4
	implements android.content.nDismissListener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		a.a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SplashActivity a>
	//    2    4:getfield        #25  <Field IRobotApplication SplashActivity.a>
	//    3    7:invokevirtual   #30  <Method void IRobotApplication.b()>
		SplashActivity.c(a);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field SplashActivity a>
	//    6   14:invokestatic    #33  <Method void SplashActivity.c(SplashActivity)>
	//    7   17:return          
	}

	final SplashActivity a;

	SplashActivity$4(SplashActivity splashactivity)
	{
		a = splashactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SplashActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
