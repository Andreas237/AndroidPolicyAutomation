// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;

// Referenced classes of package com.irobot.home:
//			BraavaAboutRobotActivity

class BraavaAboutRobotActivity$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		BraavaAboutRobotActivity.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BraavaAboutRobotActivity b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String a>
	//    4    8:invokestatic    #28  <Method void BraavaAboutRobotActivity.a(BraavaAboutRobotActivity, String)>
	//    5   11:return          
	}

	final String a;
	final BraavaAboutRobotActivity b;

	BraavaAboutRobotActivity$2(BraavaAboutRobotActivity braavaaboutrobotactivity, String s)
	{
		b = braavaaboutrobotactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaAboutRobotActivity b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
