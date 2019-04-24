// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			am

class am$1 extends HistoryUIServiceDataCallback
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
	//    6   14:ifeq            73
			HistoryDataState historydatastate = (HistoryDataState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class HistoryDataState>
	//   10   26:astore_3        
			o.a(am.c(), historydatastate.name());
	//   11   27:invokestatic    #46  <Method String am.c()>
	//   12   30:aload_3         
	//   13   31:invokevirtual   #49  <Method String HistoryDataState.name()>
	//   14   34:invokestatic    #54  <Method void o.a(String, String)>
			if(am$2.a[historydatastate.ordinal()] == 1)
	//*  15   37:getstatic       #59  <Field int[] am$2.a>
	//*  16   40:aload_3         
	//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
	//*  18   44:iaload          
	//*  19   45:iconst_1        
	//*  20   46:icmpeq          52
	//*  21   49:goto            8
				am.a(a, historyuiservicedata.getMissionHistoryDetails(a.a));
	//   22   52:aload_0         
	//   23   53:getfield        #12  <Field am a>
	//   24   56:aload_1         
	//   25   57:aload_0         
	//   26   58:getfield        #12  <Field am a>
	//   27   61:getfield        #66  <Field int am.a>
	//   28   64:invokevirtual   #70  <Method com.irobot.core.RobotMissionHistoryItem HistoryUIServiceData.getMissionHistoryDetails(int)>
	//   29   67:invokestatic    #73  <Method void am.a(am, com.irobot.core.RobotMissionHistoryItem)>
		} while(true);
	//   30   70:goto            8
	//   31   73:return          
	}

	final am a;

	am$1(am am1)
	{
		a = am1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field am a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
	//    5    9:return          
	}
}
