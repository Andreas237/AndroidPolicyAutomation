// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.p.a;

// Referenced classes of package com.irobot.home:
//			ShowLogcatActivity

class ShowLogcatActivity$1
	implements android.content.ckListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.s.a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ShowLogcatActivity a>
	//    2    4:getfield        #26  <Field a ShowLogcatActivity.s>
	//    3    7:invokevirtual   #30  <Method void a.a()>
	//    4   10:return          
	}

	final ShowLogcatActivity a;

	ShowLogcatActivity$1(ShowLogcatActivity showlogcatactivity)
	{
		a = showlogcatactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ShowLogcatActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
