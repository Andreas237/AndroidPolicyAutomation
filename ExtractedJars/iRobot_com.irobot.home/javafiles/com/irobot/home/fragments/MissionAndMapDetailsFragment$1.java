// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			MissionAndMapDetailsFragment

class MissionAndMapDetailsFragment$1 extends HistoryUIServiceDataCallback
{

	public void onHistoryUIServiceDataChanged(HistoryUIServiceData historyuiservicedata)
	{
		Iterator iterator = historyuiservicedata.getDataStates().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method ArrayList HistoryUIServiceData.getDataStates()>
	//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            118
			HistoryDataState historydatastate = (HistoryDataState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class HistoryDataState>
	//   10   26:astore_3        
			o.a(MissionAndMapDetailsFragment.h(), historydatastate.name());
	//   11   27:invokestatic    #46  <Method String MissionAndMapDetailsFragment.h()>
	//   12   30:aload_3         
	//   13   31:invokevirtual   #49  <Method String HistoryDataState.name()>
	//   14   34:invokestatic    #54  <Method void o.a(String, String)>
			switch(MissionAndMapDetailsFragment$7.a[historydatastate.ordinal()])
	//*  15   37:getstatic       #59  <Field int[] MissionAndMapDetailsFragment$7.a>
	//*  16   40:aload_3         
	//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
	//*  18   44:iaload          
			{
	//*  19   45:tableswitch     1 3: default 72
	//	               1 97
	//	               2 86
	//	               3 75
	//*  20   72:goto            8
			case 3: // '\003'
				a.b(historyuiservicedata);
	//   21   75:aload_0         
	//   22   76:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   23   79:aload_1         
	//   24   80:invokevirtual   #66  <Method void MissionAndMapDetailsFragment.b(HistoryUIServiceData)>
				break;

	//*  25   83:goto            8
			case 2: // '\002'
				a.a(historyuiservicedata);
	//   26   86:aload_0         
	//   27   87:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   28   90:aload_1         
	//   29   91:invokevirtual   #68  <Method void MissionAndMapDetailsFragment.a(HistoryUIServiceData)>
				break;

	//*  30   94:goto            8
			case 1: // '\001'
				a.a(historyuiservicedata.getMissionHistoryDetails(a.C));
	//   31   97:aload_0         
	//   32   98:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   33  101:aload_1         
	//   34  102:aload_0         
	//   35  103:getfield        #12  <Field MissionAndMapDetailsFragment a>
	//   36  106:getfield        #72  <Field int MissionAndMapDetailsFragment.C>
	//   37  109:invokevirtual   #76  <Method com.irobot.core.RobotMissionHistoryItem HistoryUIServiceData.getMissionHistoryDetails(int)>
	//   38  112:invokevirtual   #79  <Method void MissionAndMapDetailsFragment.a(com.irobot.core.RobotMissionHistoryItem)>
				break;
			}
		} while(true);
	//*  39  115:goto            8
	//   40  118:return          
	}

	final MissionAndMapDetailsFragment a;

	MissionAndMapDetailsFragment$1(MissionAndMapDetailsFragment missionandmapdetailsfragment)
	{
		a = missionandmapdetailsfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MissionAndMapDetailsFragment a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
	//    5    9:return          
	}
}
