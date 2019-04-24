// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			AboutDockListActivity

class AboutDockListActivity$1 extends HistoryUIServiceDataCallback
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
	//    6   14:ifeq            67
			HistoryDataState historydatastate = (HistoryDataState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class HistoryDataState>
	//   10   26:astore_3        
			o.a(AboutDockListActivity.a(a), historydatastate.name());
	//   11   27:aload_0         
	//   12   28:getfield        #12  <Field AboutDockListActivity a>
	//   13   31:invokestatic    #45  <Method String AboutDockListActivity.a(AboutDockListActivity)>
	//   14   34:aload_3         
	//   15   35:invokevirtual   #49  <Method String HistoryDataState.name()>
	//   16   38:invokestatic    #54  <Method void o.a(String, String)>
			if(AboutDockListActivity$3.a[historydatastate.ordinal()] == 1)
	//*  17   41:getstatic       #59  <Field int[] AboutDockListActivity$3.a>
	//*  18   44:aload_3         
	//*  19   45:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
	//*  20   48:iaload          
	//*  21   49:iconst_1        
	//*  22   50:icmpeq          56
	//*  23   53:goto            8
				a.a(historyuiservicedata);
	//   24   56:aload_0         
	//   25   57:getfield        #12  <Field AboutDockListActivity a>
	//   26   60:aload_1         
	//   27   61:invokevirtual   #65  <Method void AboutDockListActivity.a(HistoryUIServiceData)>
		} while(true);
	//   28   64:goto            8
	//   29   67:return          
	}

	final AboutDockListActivity a;

	AboutDockListActivity$1(AboutDockListActivity aboutdocklistactivity)
	{
		a = aboutdocklistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AboutDockListActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
	//    5    9:return          
	}
}
