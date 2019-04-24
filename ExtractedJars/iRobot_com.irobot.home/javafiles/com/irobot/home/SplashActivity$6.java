// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.irobot.core.AnalyticsSubsystem;

// Referenced classes of package com.irobot.home:
//			SplashActivity

class SplashActivity$6
	implements android.content.nClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.trackNewAppVersionAvailableUpdateClicked(b);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnalyticsSubsystem a>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field String b>
	//    4    8:invokevirtual   #39  <Method void AnalyticsSubsystem.trackNewAppVersionAvailableUpdateClicked(String)>
		dialoginterface = ((DialogInterface) (new Intent("android.intent.action.VIEW", Uri.parse(c))));
	//    5   11:new             #41  <Class Intent>
	//    6   14:dup             
	//    7   15:ldc1            #43  <String "android.intent.action.VIEW">
	//    8   17:aload_0         
	//    9   18:getfield        #27  <Field String c>
	//   10   21:invokestatic    #49  <Method Uri Uri.parse(String)>
	//   11   24:invokespecial   #52  <Method void Intent(String, Uri)>
	//   12   27:astore_1        
		d.startActivity(((Intent) (dialoginterface)));
	//   13   28:aload_0         
	//   14   29:getfield        #21  <Field SplashActivity d>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #56  <Method void SplashActivity.startActivity(Intent)>
	//   17   36:return          
	}

	final AnalyticsSubsystem a;
	final String b;
	final String c;
	final SplashActivity d;

	SplashActivity$6(SplashActivity splashactivity, AnalyticsSubsystem analyticssubsystem, String s, String s1)
	{
		d = splashactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field SplashActivity d>
		a = analyticssubsystem;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AnalyticsSubsystem a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String b>
		c = s1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field String c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
