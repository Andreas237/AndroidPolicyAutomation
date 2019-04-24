// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			ScheduleTableViewActivity

class ScheduleTableViewActivity$1 extends ScheduleUIServiceDataCallback
{

	public void onScheduleUIServiceDataChanged(ScheduleUIServiceData scheduleuiservicedata)
	{
		Iterator iterator = scheduleuiservicedata.getViewStates().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method ArrayList ScheduleUIServiceData.getViewStates()>
	//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            125
			ScheduleViewState scheduleviewstate = (ScheduleViewState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class ScheduleViewState>
	//   10   26:astore_3        
			o.a(ScheduleTableViewActivity.h(), scheduleviewstate.name());
	//   11   27:invokestatic    #46  <Method String ScheduleTableViewActivity.h()>
	//   12   30:aload_3         
	//   13   31:invokevirtual   #49  <Method String ScheduleViewState.name()>
	//   14   34:invokestatic    #54  <Method void o.a(String, String)>
			switch(ScheduleTableViewActivity$2.a[scheduleviewstate.ordinal()])
	//*  15   37:getstatic       #59  <Field int[] ScheduleTableViewActivity$2.a>
	//*  16   40:aload_3         
	//*  17   41:invokevirtual   #63  <Method int ScheduleViewState.ordinal()>
	//*  18   44:iaload          
			{
	//*  19   45:tableswitch     1 4: default 76
	//	               1 114
	//	               2 104
	//	               3 93
	//	               4 79
	//*  20   76:goto            8
			case 4: // '\004'
				a.g(scheduleuiservicedata.getScheduleItemIndex());
	//   21   79:aload_0         
	//   22   80:getfield        #12  <Field ScheduleTableViewActivity a>
	//   23   83:aload_1         
	//   24   84:invokevirtual   #66  <Method int ScheduleUIServiceData.getScheduleItemIndex()>
	//   25   87:invokevirtual   #70  <Method void ScheduleTableViewActivity.g(int)>
				break;

	//*  26   90:goto            8
			case 3: // '\003'
				ScheduleTableViewActivity.a(a, true);
	//   27   93:aload_0         
	//   28   94:getfield        #12  <Field ScheduleTableViewActivity a>
	//   29   97:iconst_1        
	//   30   98:invokestatic    #73  <Method void ScheduleTableViewActivity.a(ScheduleTableViewActivity, boolean)>
				break;

	//*  31  101:goto            8
			case 2: // '\002'
				a.g();
	//   32  104:aload_0         
	//   33  105:getfield        #12  <Field ScheduleTableViewActivity a>
	//   34  108:invokevirtual   #75  <Method void ScheduleTableViewActivity.g()>
				break;

	//*  35  111:goto            8
			case 1: // '\001'
				a.a(scheduleuiservicedata);
	//   36  114:aload_0         
	//   37  115:getfield        #12  <Field ScheduleTableViewActivity a>
	//   38  118:aload_1         
	//   39  119:invokevirtual   #77  <Method void ScheduleTableViewActivity.a(ScheduleUIServiceData)>
				break;
			}
		} while(true);
	//*  40  122:goto            8
	//   41  125:return          
	}

	final ScheduleTableViewActivity a;

	ScheduleTableViewActivity$1(ScheduleTableViewActivity scheduletableviewactivity)
	{
		a = scheduletableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ScheduleTableViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ScheduleUIServiceDataCallback()>
	//    5    9:return          
	}
}
