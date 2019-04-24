// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import com.irobot.core.PersistentMapIdentifier;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity, IRobotApplication, MapCustomizationActivity_

class MissionDetailsActivity$10
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		b.a.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MissionDetailsActivity b>
	//    2    4:getfield        #29  <Field IRobotApplication MissionDetailsActivity.a>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field PersistentMapIdentifier a>
	//    5   11:invokevirtual   #34  <Method void IRobotApplication.a(PersistentMapIdentifier)>
		MapCustomizationActivity_.a(((android.content.Context) (b))).a();
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field MissionDetailsActivity b>
	//    8   18:invokestatic    #39  <Method MapCustomizationActivity_$a MapCustomizationActivity_.a(android.content.Context)>
	//    9   21:invokevirtual   #44  <Method org.androidannotations.api.a.e MapCustomizationActivity_$a.a()>
	//   10   24:pop             
	//   11   25:return          
	}

	final PersistentMapIdentifier a;
	final MissionDetailsActivity b;

	MissionDetailsActivity$10(MissionDetailsActivity missiondetailsactivity, PersistentMapIdentifier persistentmapidentifier)
	{
		b = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MissionDetailsActivity b>
		a = persistentmapidentifier;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field PersistentMapIdentifier a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
