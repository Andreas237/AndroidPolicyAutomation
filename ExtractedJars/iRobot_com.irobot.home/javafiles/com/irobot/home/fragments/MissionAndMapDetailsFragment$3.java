// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;

// Referenced classes of package com.irobot.home.fragments:
//			MissionAndMapDetailsFragment

class MissionAndMapDetailsFragment$3
	implements Runnable
{

	public void run()
	{
		a.f.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MissionAndMapDetailsFragment a>
	//    2    4:getfield        #26  <Field View MissionAndMapDetailsFragment.f>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #32  <Method void View.setVisibility(int)>
	//    5   11:return          
	}

	final MissionAndMapDetailsFragment a;

	MissionAndMapDetailsFragment$3(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		a = missionandmapdetailsfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MissionAndMapDetailsFragment a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
