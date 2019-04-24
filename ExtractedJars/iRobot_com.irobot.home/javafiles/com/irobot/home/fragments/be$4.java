// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.MissionSubsystem;
import com.irobot.core.MissionUIServiceCommand;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$4
	implements com.irobot.home.m.b.a
{

	public void a(boolean flag)
	{
		be.b(a, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field be a>
	//    2    4:iload_1         
	//    3    5:invokestatic    #25  <Method boolean be.b(be, boolean)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void b(boolean flag)
	{
		be.d(a).sendServiceCommand(MissionUIServiceCommand.EvacDockTourSeen, ((com.irobot.core.MissionUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field be a>
	//    2    4:invokestatic    #29  <Method MissionSubsystem be.d(be)>
	//    3    7:getstatic       #35  <Field MissionUIServiceCommand MissionUIServiceCommand.EvacDockTourSeen>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #41  <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, com.irobot.core.MissionUIServiceData)>
		be.d(a).sendServiceCommand(MissionUIServiceCommand.EvacDockQueryStatus, ((com.irobot.core.MissionUIServiceData) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field be a>
	//    8   18:invokestatic    #29  <Method MissionSubsystem be.d(be)>
	//    9   21:getstatic       #44  <Field MissionUIServiceCommand MissionUIServiceCommand.EvacDockQueryStatus>
	//   10   24:aconst_null     
	//   11   25:invokevirtual   #41  <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, com.irobot.core.MissionUIServiceData)>
	//   12   28:return          
	}

	final be a;

	be$4(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
