// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RobotSettingsPresenter

class RobotSettingsPresenter$1 extends HistoryUIServiceDataCallback
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
	//    6   14:ifeq            77
			HistoryDataState historydatastate = (HistoryDataState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class HistoryDataState>
	//   10   26:astore_3        
			o.a(RobotSettingsPresenter.c(), historydatastate.name());
	//   11   27:invokestatic    #46  <Method String RobotSettingsPresenter.c()>
	//   12   30:aload_3         
	//   13   31:invokevirtual   #49  <Method String HistoryDataState.name()>
	//   14   34:invokestatic    #54  <Method void o.a(String, String)>
			if(RobotSettingsPresenter$2.a[historydatastate.ordinal()] == 1 && !historyuiservicedata.getDockEvacuationLifeTimeData().isEmpty())
	//*  15   37:getstatic       #59  <Field int[] RobotSettingsPresenter$2.a>
	//*  16   40:aload_3         
	//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
	//*  18   44:iaload          
	//*  19   45:iconst_1        
	//*  20   46:icmpeq          52
	//*  21   49:goto            8
	//*  22   52:aload_1         
	//*  23   53:invokevirtual   #66  <Method ArrayList HistoryUIServiceData.getDockEvacuationLifeTimeData()>
	//*  24   56:invokevirtual   #69  <Method boolean ArrayList.isEmpty()>
	//*  25   59:ifne            8
				RobotSettingsPresenter.a(a).y();
	//   26   62:aload_0         
	//   27   63:getfield        #12  <Field RobotSettingsPresenter a>
	//   28   66:invokestatic    #72  <Method RobotSettingsPresenter$a RobotSettingsPresenter.a(RobotSettingsPresenter)>
	//   29   69:invokeinterface #77  <Method void RobotSettingsPresenter$a.y()>
		} while(true);
	//   30   74:goto            8
	//   31   77:return          
	}

	final RobotSettingsPresenter a;

	RobotSettingsPresenter$1(RobotSettingsPresenter robotsettingspresenter)
	{
		a = robotsettingspresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RobotSettingsPresenter a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
	//    5    9:return          
	}
}
