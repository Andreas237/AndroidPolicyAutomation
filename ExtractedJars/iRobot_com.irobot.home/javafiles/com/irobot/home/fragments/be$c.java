// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			be

private class be$c extends MissionUIServiceDataCallback
{

	public void onMissionUIServiceDataChanged(MissionUIServiceData missionuiservicedata)
	{
		if(missionuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			o.e("RobotCleanFragment", "null service data");
	//    2    4:ldc1            #24  <String "RobotCleanFragment">
	//    3    6:ldc1            #26  <String "null service data">
	//    4    8:invokestatic    #32  <Method void o.e(String, String)>
			return;
	//    5   11:return          
		}
		if(!a.isAdded())
	//*   6   12:aload_0         
	//*   7   13:getfield        #13  <Field be a>
	//*   8   16:invokevirtual   #36  <Method boolean be.isAdded()>
	//*   9   19:ifne            23
			return;
	//   10   22:return          
		Object obj = ((Object) (missionuiservicedata.getMissionDataStates()));
	//   11   23:aload_1         
	//   12   24:invokevirtual   #42  <Method ArrayList MissionUIServiceData.getMissionDataStates()>
	//   13   27:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #44  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #45  <Method void StringBuilder()>
	//   17   35:astore_3        
		stringbuilder.append("Change list: ");
	//   18   36:aload_3         
	//   19   37:ldc1            #47  <String "Change list: ">
	//   20   39:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		stringbuilder.append(((ArrayList) (obj)).toString());
	//   22   43:aload_3         
	//   23   44:aload_2         
	//   24   45:invokevirtual   #57  <Method String ArrayList.toString()>
	//   25   48:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		o.b("RobotCleanFragment", stringbuilder.toString());
	//   27   52:ldc1            #24  <String "RobotCleanFragment">
	//   28   54:aload_3         
	//   29   55:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   30   58:invokestatic    #61  <Method void o.b(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   31   61:aload_2         
	//   32   62:invokevirtual   #65  <Method Iterator ArrayList.iterator()>
	//   33   65:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   34   66:aload_2         
	//   35   67:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   36   72:ifeq            190
			MissionDataState missiondatastate = (MissionDataState)((Iterator) (obj)).next();
	//   37   75:aload_2         
	//   38   76:invokeinterface #74  <Method Object Iterator.next()>
	//   39   81:checkcast       #76  <Class MissionDataState>
	//   40   84:astore_3        
			switch(be$5.a[missiondatastate.ordinal()])
	//*  41   85:getstatic       #81  <Field int[] be$5.a>
	//*  42   88:aload_3         
	//*  43   89:invokevirtual   #85  <Method int MissionDataState.ordinal()>
	//*  44   92:iaload          
			{
	//*  45   93:tableswitch     1 4: default 124
	//	               1 176
	//	               2 159
	//	               3 145
	//	               4 127
	//*  46  124:goto            66
			case 4: // '\004'
				be.a(a, missionuiservicedata.getEvacStatusMessage(), missionuiservicedata.getEvacStatusMessageArgs());
	//   47  127:aload_0         
	//   48  128:getfield        #13  <Field be a>
	//   49  131:aload_1         
	//   50  132:invokevirtual   #88  <Method String MissionUIServiceData.getEvacStatusMessage()>
	//   51  135:aload_1         
	//   52  136:invokevirtual   #91  <Method ArrayList MissionUIServiceData.getEvacStatusMessageArgs()>
	//   53  139:invokestatic    #94  <Method void be.a(be, String, ArrayList)>
				break;

	//*  54  142:goto            66
			case 3: // '\003'
				be.a(a, missionuiservicedata.getEvacHelpContentId());
	//   55  145:aload_0         
	//   56  146:getfield        #13  <Field be a>
	//   57  149:aload_1         
	//   58  150:invokevirtual   #97  <Method String MissionUIServiceData.getEvacHelpContentId()>
	//   59  153:invokestatic    #100 <Method void be.a(be, String)>
				break;

	//*  60  156:goto            66
			case 2: // '\002'
				if(missionuiservicedata.getShowEvacDockTour())
	//*  61  159:aload_1         
	//*  62  160:invokevirtual   #103 <Method boolean MissionUIServiceData.getShowEvacDockTour()>
	//*  63  163:ifeq            66
					be.a(a);
	//   64  166:aload_0         
	//   65  167:getfield        #13  <Field be a>
	//   66  170:invokestatic    #105 <Method void be.a(be)>
				break;

	//*  67  173:goto            66
			case 1: // '\001'
				be.a(a, missionuiservicedata.getEvacDockMode());
	//   68  176:aload_0         
	//   69  177:getfield        #13  <Field be a>
	//   70  180:aload_1         
	//   71  181:invokevirtual   #109 <Method com.irobot.core.EvacuationDockMode MissionUIServiceData.getEvacDockMode()>
	//   72  184:invokestatic    #112 <Method void be.a(be, com.irobot.core.EvacuationDockMode)>
				break;
			}
		} while(true);
	//   73  187:goto            66
	//   74  190:return          
	}

	final be a;

	private be$c(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void MissionUIServiceDataCallback()>
	//    5    9:return          
	}

	be$c(be be1, be$1 be$1)
	{
		this(be1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void be$c(be)>
	//    3    5:return          
	}
}
