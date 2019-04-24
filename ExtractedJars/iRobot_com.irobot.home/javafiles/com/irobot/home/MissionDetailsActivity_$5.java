// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.graphics.Bitmap;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity_

class MissionDetailsActivity_$5
	implements Runnable
{

	public void run()
	{
		MissionDetailsActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MissionDetailsActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Bitmap a>
	//    4    8:invokestatic    #27  <Method void MissionDetailsActivity_.a(MissionDetailsActivity_, Bitmap)>
	//    5   11:return          
	}

	final Bitmap a;
	final MissionDetailsActivity_ b;

	MissionDetailsActivity_$5(MissionDetailsActivity_ missiondetailsactivity_, Bitmap bitmap)
	{
		b = missiondetailsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MissionDetailsActivity_ b>
		a = bitmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Bitmap a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
