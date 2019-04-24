// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RoombaAddRobotSetupActivity

class RoombaAddRobotSetupActivity$1 extends AddRobotUIServiceDataCallback
{

	public void onAddRobotUIServiceDataChanged(AddRobotUIServiceData addrobotuiservicedata)
	{
		if(addrobotuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		AddRobotServiceDataState addrobotservicedatastate;
		for(Iterator iterator = addrobotuiservicedata.getDataStateChangelist().iterator(); iterator.hasNext(); RoombaAddRobotSetupActivity.a(a, addrobotservicedatastate, addrobotuiservicedata))
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #24  <Method ArrayList AddRobotUIServiceData.getDataStateChangelist()>
	//*   5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            44
			addrobotservicedatastate = (AddRobotServiceDataState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class AddRobotServiceDataState>
	//   13   31:astore_3        

	//   14   32:aload_0         
	//   15   33:getfield        #12  <Field RoombaAddRobotSetupActivity a>
	//   16   36:aload_3         
	//   17   37:aload_1         
	//   18   38:invokestatic    #45  <Method void RoombaAddRobotSetupActivity.a(RoombaAddRobotSetupActivity, AddRobotServiceDataState, AddRobotUIServiceData)>
	//*  19   41:goto            13
	//   20   44:return          
	}

	final RoombaAddRobotSetupActivity a;

	RoombaAddRobotSetupActivity$1(RoombaAddRobotSetupActivity roombaaddrobotsetupactivity)
	{
		a = roombaaddrobotsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RoombaAddRobotSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AddRobotUIServiceDataCallback()>
	//    5    9:return          
	}
}
