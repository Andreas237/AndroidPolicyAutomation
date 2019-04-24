// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			SplashActivity

class SplashActivity$3
	implements Runnable
{

	public void run()
	{
		if(a.d == null || !a.d.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field SplashActivity a>
	//*   2    4:getfield        #23  <Field AlertDialog SplashActivity.d>
	//*   3    7:ifnull          23
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field SplashActivity a>
	//*   6   14:getfield        #23  <Field AlertDialog SplashActivity.d>
	//*   7   17:invokevirtual   #29  <Method boolean AlertDialog.isShowing()>
	//*   8   20:ifne            40
		{
			SplashActivity.a(a, true);
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field SplashActivity a>
	//   11   27:iconst_1        
	//   12   28:invokestatic    #32  <Method boolean SplashActivity.a(SplashActivity, boolean)>
	//   13   31:pop             
			o.d(SplashActivity.h(), "App version check request timed out. Skipping...");
	//   14   32:invokestatic    #36  <Method String SplashActivity.h()>
	//   15   35:ldc1            #38  <String "App version check request timed out. Skipping...">
	//   16   37:invokestatic    #43  <Method void o.d(String, String)>
		}
	//   17   40:return          
	}

	final SplashActivity a;

	SplashActivity$3(SplashActivity splashactivity)
	{
		a = splashactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SplashActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
