// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.ResolvedMissionStatusEvent;

// Referenced classes of package com.irobot.home:
//			BraavaSpotCleanActivity_

class BraavaSpotCleanActivity_$2
	implements Runnable
{

	public void run()
	{
		BraavaSpotCleanActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BraavaSpotCleanActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field ResolvedMissionStatusEvent a>
	//    4    8:invokestatic    #28  <Method void BraavaSpotCleanActivity_.a(BraavaSpotCleanActivity_, ResolvedMissionStatusEvent)>
	//    5   11:return          
	}

	final ResolvedMissionStatusEvent a;
	final BraavaSpotCleanActivity_ b;

	BraavaSpotCleanActivity_$2(BraavaSpotCleanActivity_ braavaspotcleanactivity_, ResolvedMissionStatusEvent resolvedmissionstatusevent)
	{
		b = braavaspotcleanactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaSpotCleanActivity_ b>
		a = resolvedmissionstatusevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ResolvedMissionStatusEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
