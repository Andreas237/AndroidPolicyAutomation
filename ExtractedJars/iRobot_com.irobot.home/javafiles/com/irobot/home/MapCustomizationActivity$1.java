// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$1 extends ScheduleUIServiceDataCallback
{

	public void onScheduleUIServiceDataChanged(ScheduleUIServiceData scheduleuiservicedata)
	{
		Iterator iterator = scheduleuiservicedata.getDataStates().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method ArrayList ScheduleUIServiceData.getDataStates()>
	//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            66
			ScheduleDataState scheduledatastate = (ScheduleDataState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class ScheduleDataState>
	//   10   26:astore_3        
			o.a(MapCustomizationActivity.t(), scheduledatastate.name());
	//   11   27:invokestatic    #46  <Method String MapCustomizationActivity.t()>
	//   12   30:aload_3         
	//   13   31:invokevirtual   #49  <Method String ScheduleDataState.name()>
	//   14   34:invokestatic    #54  <Method void o.a(String, String)>
			if(.b[scheduledatastate.ordinal()] == 1)
	//*  15   37:getstatic       #60  <Field int[] MapCustomizationActivity$28.b>
	//*  16   40:aload_3         
	//*  17   41:invokevirtual   #64  <Method int ScheduleDataState.ordinal()>
	//*  18   44:iaload          
	//*  19   45:iconst_1        
	//*  20   46:icmpeq          52
	//*  21   49:goto            8
				MapCustomizationActivity.c(a, scheduleuiservicedata.getCheckIfSchedulesContainsMapId());
	//   22   52:aload_0         
	//   23   53:getfield        #12  <Field MapCustomizationActivity a>
	//   24   56:aload_1         
	//   25   57:invokevirtual   #67  <Method boolean ScheduleUIServiceData.getCheckIfSchedulesContainsMapId()>
	//   26   60:invokestatic    #71  <Method void MapCustomizationActivity.c(MapCustomizationActivity, boolean)>
		} while(true);
	//   27   63:goto            8
	//   28   66:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$1(MapCustomizationActivity mapcustomizationactivity)
	{
		a = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MapCustomizationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ScheduleUIServiceDataCallback()>
	//    5    9:return          
	}
}
