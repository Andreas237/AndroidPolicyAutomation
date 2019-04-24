// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity

private class RobotCleanActivity$CleanActivityAssetGenericEventHandler extends PMIAssetEventHandler
{

	void a()
	{
	//    0    0:return          
	}

	void b()
	{
	//    0    0:return          
	}

	public void onPMIAssetEvent(PMIAssetEvent pmiassetevent)
	{
		if(pmiassetevent.id().equals("batPct") && pmiassetevent.assetId().equals(((Object) (j.k().getId()))))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #30  <Method String PMIAssetEvent.id()>
	//*   2    4:ldc1            #32  <String "batPct">
	//*   3    6:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            50
	//*   5   12:aload_1         
	//*   6   13:invokevirtual   #41  <Method String PMIAssetEvent.assetId()>
	//*   7   16:invokestatic    #47  <Method AssetId j.k()>
	//*   8   19:invokevirtual   #52  <Method String AssetId.getId()>
	//*   9   22:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*  10   25:ifeq            50
		{
			RobotCleanActivity.a(a, ((int) (pmiassetevent.int16Value("batPct", (short)0))));
	//   11   28:aload_0         
	//   12   29:getfield        #13  <Field RobotCleanActivity a>
	//   13   32:aload_1         
	//   14   33:ldc1            #32  <String "batPct">
	//   15   35:iconst_0        
	//   16   36:invokevirtual   #56  <Method short PMIAssetEvent.int16Value(String, short)>
	//   17   39:invokestatic    #59  <Method int RobotCleanActivity.a(RobotCleanActivity, int)>
	//   18   42:pop             
			RobotCleanActivity.b(a);
	//   19   43:aload_0         
	//   20   44:getfield        #13  <Field RobotCleanActivity a>
	//   21   47:invokestatic    #61  <Method void RobotCleanActivity.b(RobotCleanActivity)>
		}
	//   22   50:return          
	}

	final RobotCleanActivity a;

	private RobotCleanActivity$CleanActivityAssetGenericEventHandler(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void PMIAssetEventHandler()>
	//    5    9:return          
	}

	RobotCleanActivity$CleanActivityAssetGenericEventHandler(RobotCleanActivity robotcleanactivity, RobotCleanActivity._cls1 _pcls1)
	{
		this(robotcleanactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void RobotCleanActivity$CleanActivityAssetGenericEventHandler(RobotCleanActivity)>
	//    3    5:return          
	}
}
