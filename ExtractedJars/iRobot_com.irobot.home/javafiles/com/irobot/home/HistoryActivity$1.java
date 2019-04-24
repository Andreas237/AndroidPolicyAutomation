// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			HistoryActivity

class HistoryActivity$1 extends HistoryUIServiceDataCallback
{

	public void onHistoryUIServiceDataChanged(HistoryUIServiceData historyuiservicedata)
	{
		if(historyuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			o.b(HistoryActivity.f(), "null service data");
	//    2    4:invokestatic    #22  <Method String HistoryActivity.f()>
	//    3    7:ldc1            #24  <String "null service data">
	//    4    9:invokestatic    #30  <Method void o.b(String, String)>
			return;
	//    5   12:return          
		}
		Iterator iterator = historyuiservicedata.getDataStates().iterator();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #36  <Method ArrayList HistoryUIServiceData.getDataStates()>
	//    8   17:invokevirtual   #42  <Method Iterator ArrayList.iterator()>
	//    9   20:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   21:aload_2         
	//   11   22:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   12   27:ifeq            79
			HistoryDataState historydatastate = (HistoryDataState)iterator.next();
	//   13   30:aload_2         
	//   14   31:invokeinterface #52  <Method Object Iterator.next()>
	//   15   36:checkcast       #54  <Class HistoryDataState>
	//   16   39:astore_3        
			o.a(HistoryActivity.f(), historydatastate.name());
	//   17   40:invokestatic    #22  <Method String HistoryActivity.f()>
	//   18   43:aload_3         
	//   19   44:invokevirtual   #57  <Method String HistoryDataState.name()>
	//   20   47:invokestatic    #59  <Method void o.a(String, String)>
			if(HistoryActivity$3.a[historydatastate.ordinal()] == 1)
	//*  21   50:getstatic       #64  <Field int[] HistoryActivity$3.a>
	//*  22   53:aload_3         
	//*  23   54:invokevirtual   #68  <Method int HistoryDataState.ordinal()>
	//*  24   57:iaload          
	//*  25   58:iconst_1        
	//*  26   59:icmpeq          65
	//*  27   62:goto            21
				HistoryActivity.a(a, historyuiservicedata.getRobotMissionHistoryList());
	//   28   65:aload_0         
	//   29   66:getfield        #12  <Field HistoryActivity a>
	//   30   69:aload_1         
	//   31   70:invokevirtual   #71  <Method ArrayList HistoryUIServiceData.getRobotMissionHistoryList()>
	//   32   73:invokestatic    #74  <Method void HistoryActivity.a(HistoryActivity, ArrayList)>
		} while(true);
	//   33   76:goto            21
	//   34   79:return          
	}

	final HistoryActivity a;

	HistoryActivity$1(HistoryActivity historyactivity)
	{
		a = historyactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field HistoryActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
	//    5    9:return          
	}
}
