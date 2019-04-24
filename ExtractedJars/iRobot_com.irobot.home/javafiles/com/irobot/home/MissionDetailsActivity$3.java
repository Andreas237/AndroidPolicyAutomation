// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.RadioGroup;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$3
	implements android.widget.eListener
{

	public void onCheckedChanged(RadioGroup radiogroup, int i)
	{
		MissionDetailsActivity.b(a, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MissionDetailsActivity a>
	//    2    4:iload_2         
	//    3    5:invokestatic    #26  <Method int MissionDetailsActivity.b(MissionDetailsActivity, int)>
	//    4    8:pop             
	//    5    9:return          
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$3(MissionDetailsActivity missiondetailsactivity)
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
