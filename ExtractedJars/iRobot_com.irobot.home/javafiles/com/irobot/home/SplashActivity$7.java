// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.AnalyticsSubsystem;

// Referenced classes of package com.irobot.home:
//			SplashActivity

class SplashActivity$7
	implements android.content.nClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.trackNewAppVersionAvailableSkipClicked(b);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnalyticsSubsystem a>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field String b>
	//    4    8:invokevirtual   #36  <Method void AnalyticsSubsystem.trackNewAppVersionAvailableSkipClicked(String)>
		SplashActivity.a(c, true);
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field SplashActivity c>
	//    7   15:iconst_1        
	//    8   16:invokestatic    #39  <Method boolean SplashActivity.a(SplashActivity, boolean)>
	//    9   19:pop             
		SplashActivity.c(c);
	//   10   20:aload_0         
	//   11   21:getfield        #20  <Field SplashActivity c>
	//   12   24:invokestatic    #42  <Method void SplashActivity.c(SplashActivity)>
	//   13   27:return          
	}

	final AnalyticsSubsystem a;
	final String b;
	final SplashActivity c;

	SplashActivity$7(SplashActivity splashactivity, AnalyticsSubsystem analyticssubsystem, String s)
	{
		c = splashactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field SplashActivity c>
		a = analyticssubsystem;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field AnalyticsSubsystem a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
