// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home.fragments:
//			aq

class aq$1 extends HistoryUIServiceDataCallback
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
	//    6   14:ifeq            93
			HistoryDataState historydatastate = (HistoryDataState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class HistoryDataState>
	//   10   26:astore_3        
			o.a(aq.b(), historydatastate.name());
	//   11   27:invokestatic    #46  <Method String aq.b()>
	//   12   30:aload_3         
	//   13   31:invokevirtual   #49  <Method String HistoryDataState.name()>
	//   14   34:invokestatic    #54  <Method void o.a(String, String)>
			switch(aq$3.a[historydatastate.ordinal()])
	//*  15   37:getstatic       #59  <Field int[] aq$3.a>
	//*  16   40:aload_3         
	//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
	//*  18   44:iaload          
			{
	//*  19   45:tableswitch     1 2: default 68
	//	               1 82
	//	               2 71
	//*  20   68:goto            8
			case 2: // '\002'
				aq.b(a, historyuiservicedata);
	//   21   71:aload_0         
	//   22   72:getfield        #12  <Field aq a>
	//   23   75:aload_1         
	//   24   76:invokestatic    #66  <Method void aq.b(aq, HistoryUIServiceData)>
				break;

	//*  25   79:goto            8
			case 1: // '\001'
				aq.a(a, historyuiservicedata);
	//   26   82:aload_0         
	//   27   83:getfield        #12  <Field aq a>
	//   28   86:aload_1         
	//   29   87:invokestatic    #68  <Method void aq.a(aq, HistoryUIServiceData)>
				break;
			}
		} while(true);
	//*  30   90:goto            8
	//   31   93:return          
	}

	final aq a;

	aq$1(aq aq1)
	{
		a = aq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field aq a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
	//    5    9:return          
	}
}
