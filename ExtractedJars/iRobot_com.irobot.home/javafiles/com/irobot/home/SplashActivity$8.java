// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Handler;

// Referenced classes of package com.irobot.home:
//			SplashActivity, IRobotApplication

class SplashActivity$8
	implements Runnable
{

	public void run()
	{
		a.a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SplashActivity a>
	//    2    4:getfield        #24  <Field IRobotApplication SplashActivity.a>
	//    3    7:invokevirtual   #29  <Method void IRobotApplication.b()>
		a.g();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field SplashActivity a>
	//    6   14:invokevirtual   #32  <Method void SplashActivity.g()>
		SplashActivity.b(a).postDelayed(a.e, 2000L);
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field SplashActivity a>
	//    9   21:invokestatic    #35  <Method Handler SplashActivity.b(SplashActivity)>
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field SplashActivity a>
	//   12   28:getfield        #39  <Field Runnable SplashActivity.e>
	//   13   31:ldc2w           #40  <Long 2000L>
	//   14   34:invokevirtual   #47  <Method boolean Handler.postDelayed(Runnable, long)>
	//   15   37:pop             
	//   16   38:return          
	}

	final SplashActivity a;

	SplashActivity$8(SplashActivity splashactivity)
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
