// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$11
	implements android.view.View.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$11(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
