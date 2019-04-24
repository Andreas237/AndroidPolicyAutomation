// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.model.Robot;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity, OnDemandOtaActivity_

class BroadcastSetupActivity$17
	implements Runnable
{

	public void run()
	{
		OnDemandOtaActivity_.a(((android.content.Context) (a))).a(a.H.s().getId()).a(OnDemandOTAEntryType.RequestOnDemandOTA).a(OnDemandOTAPathType.Provisioning).a(true).a();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BroadcastSetupActivity a>
	//    2    4:invokestatic    #26  <Method OnDemandOtaActivity_$a OnDemandOtaActivity_.a(android.content.Context)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field BroadcastSetupActivity a>
	//    5   11:getfield        #30  <Field Robot BroadcastSetupActivity.H>
	//    6   14:invokevirtual   #36  <Method AssetId Robot.s()>
	//    7   17:invokevirtual   #42  <Method String AssetId.getId()>
	//    8   20:invokevirtual   #47  <Method OnDemandOtaActivity_$a OnDemandOtaActivity_$a.a(String)>
	//    9   23:getstatic       #53  <Field OnDemandOTAEntryType OnDemandOTAEntryType.RequestOnDemandOTA>
	//   10   26:invokevirtual   #56  <Method OnDemandOtaActivity_$a OnDemandOtaActivity_$a.a(OnDemandOTAEntryType)>
	//   11   29:getstatic       #62  <Field OnDemandOTAPathType OnDemandOTAPathType.Provisioning>
	//   12   32:invokevirtual   #65  <Method OnDemandOtaActivity_$a OnDemandOtaActivity_$a.a(OnDemandOTAPathType)>
	//   13   35:iconst_1        
	//   14   36:invokevirtual   #68  <Method OnDemandOtaActivity_$a OnDemandOtaActivity_$a.a(boolean)>
	//   15   39:invokevirtual   #71  <Method org.androidannotations.api.a.e OnDemandOtaActivity_$a.a()>
	//   16   42:pop             
		a.finish();
	//   17   43:aload_0         
	//   18   44:getfield        #16  <Field BroadcastSetupActivity a>
	//   19   47:invokevirtual   #74  <Method void BroadcastSetupActivity.finish()>
	//   20   50:return          
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$17(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
