// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$9
	implements android.content.stener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		j.a(((android.app.Activity) (a)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MissionDetailsActivity a>
	//    2    4:invokestatic    #27  <Method void j.a(android.app.Activity)>
	//    3    7:return          
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$9(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
