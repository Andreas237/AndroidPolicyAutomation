// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			PersistentScheduleActivity

class PersistentScheduleActivity$2 extends ScheduleUIServiceDataCallback
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
	//    6   14:ifeq            252
			ScheduleViewState scheduleviewstate = (ScheduleViewState)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #40  <Method Object Iterator.next()>
	//    9   23:checkcast       #42  <Class ScheduleViewState>
	//   10   26:astore_3        
			o.a(PersistentScheduleActivity.a(a), scheduleviewstate.name());
	//   11   27:aload_0         
	//   12   28:getfield        #12  <Field PersistentScheduleActivity a>
	//   13   31:invokestatic    #45  <Method String PersistentScheduleActivity.a(PersistentScheduleActivity)>
	//   14   34:aload_3         
	//   15   35:invokevirtual   #49  <Method String ScheduleViewState.name()>
	//   16   38:invokestatic    #54  <Method void o.a(String, String)>
			switch(PersistentScheduleActivity$6.a[scheduleviewstate.ordinal()])
	//*  17   41:getstatic       #59  <Field int[] PersistentScheduleActivity$6.a>
	//*  18   44:aload_3         
	//*  19   45:invokevirtual   #63  <Method int ScheduleViewState.ordinal()>
	//*  20   48:iaload          
			{
	//*  21   49:tableswitch     1 12: default 112
	//	               1 238
	//	               2 228
	//	               3 214
	//	               4 200
	//	               5 190
	//	               6 180
	//	               7 170
	//	               8 160
	//	               9 139
	//	               10 146
	//	               11 129
	//	               12 115
	//*  22  112:goto            8
			case 12: // '\f'
				PersistentScheduleActivity.c(a, scheduleuiservicedata.getScheduleItemIndex());
	//   23  115:aload_0         
	//   24  116:getfield        #12  <Field PersistentScheduleActivity a>
	//   25  119:aload_1         
	//   26  120:invokevirtual   #66  <Method int ScheduleUIServiceData.getScheduleItemIndex()>
	//   27  123:invokestatic    #70  <Method void PersistentScheduleActivity.c(PersistentScheduleActivity, int)>
				break;

	//*  28  126:goto            8
			case 11: // '\013'
				PersistentScheduleActivity.i(a);
	//   29  129:aload_0         
	//   30  130:getfield        #12  <Field PersistentScheduleActivity a>
	//   31  133:invokestatic    #73  <Method void PersistentScheduleActivity.i(PersistentScheduleActivity)>
				break;

	//*  32  136:goto            8
			case 9: // '\t'
				PersistentScheduleActivity.h(a);
	//   33  139:aload_0         
	//   34  140:getfield        #12  <Field PersistentScheduleActivity a>
	//   35  143:invokestatic    #76  <Method void PersistentScheduleActivity.h(PersistentScheduleActivity)>
				// fall through

			case 10: // '\n'
				PersistentScheduleActivity.a(a, scheduleuiservicedata.getMappingScheduleList());
	//   36  146:aload_0         
	//   37  147:getfield        #12  <Field PersistentScheduleActivity a>
	//   38  150:aload_1         
	//   39  151:invokevirtual   #79  <Method ArrayList ScheduleUIServiceData.getMappingScheduleList()>
	//   40  154:invokestatic    #82  <Method void PersistentScheduleActivity.a(PersistentScheduleActivity, ArrayList)>
				break;

	//*  41  157:goto            8
			case 8: // '\b'
				PersistentScheduleActivity.g(a);
	//   42  160:aload_0         
	//   43  161:getfield        #12  <Field PersistentScheduleActivity a>
	//   44  164:invokestatic    #85  <Method void PersistentScheduleActivity.g(PersistentScheduleActivity)>
				break;

	//*  45  167:goto            8
			case 7: // '\007'
				PersistentScheduleActivity.f(a);
	//   46  170:aload_0         
	//   47  171:getfield        #12  <Field PersistentScheduleActivity a>
	//   48  174:invokestatic    #88  <Method void PersistentScheduleActivity.f(PersistentScheduleActivity)>
				break;

	//*  49  177:goto            8
			case 6: // '\006'
				PersistentScheduleActivity.e(a);
	//   50  180:aload_0         
	//   51  181:getfield        #12  <Field PersistentScheduleActivity a>
	//   52  184:invokestatic    #91  <Method void PersistentScheduleActivity.e(PersistentScheduleActivity)>
				break;

	//*  53  187:goto            8
			case 5: // '\005'
				PersistentScheduleActivity.d(a);
	//   54  190:aload_0         
	//   55  191:getfield        #12  <Field PersistentScheduleActivity a>
	//   56  194:invokestatic    #94  <Method void PersistentScheduleActivity.d(PersistentScheduleActivity)>
				break;

	//*  57  197:goto            8
			case 4: // '\004'
				PersistentScheduleActivity.b(a, scheduleuiservicedata.getScheduleItemIndex());
	//   58  200:aload_0         
	//   59  201:getfield        #12  <Field PersistentScheduleActivity a>
	//   60  204:aload_1         
	//   61  205:invokevirtual   #66  <Method int ScheduleUIServiceData.getScheduleItemIndex()>
	//   62  208:invokestatic    #97  <Method void PersistentScheduleActivity.b(PersistentScheduleActivity, int)>
				break;

	//*  63  211:goto            8
			case 3: // '\003'
				PersistentScheduleActivity.a(a, scheduleuiservicedata.getTimeoutTag());
	//   64  214:aload_0         
	//   65  215:getfield        #12  <Field PersistentScheduleActivity a>
	//   66  218:aload_1         
	//   67  219:invokevirtual   #100 <Method String ScheduleUIServiceData.getTimeoutTag()>
	//   68  222:invokestatic    #103 <Method void PersistentScheduleActivity.a(PersistentScheduleActivity, String)>
				break;

	//*  69  225:goto            8
			case 2: // '\002'
				PersistentScheduleActivity.c(a);
	//   70  228:aload_0         
	//   71  229:getfield        #12  <Field PersistentScheduleActivity a>
	//   72  232:invokestatic    #105 <Method void PersistentScheduleActivity.c(PersistentScheduleActivity)>
				break;

	//*  73  235:goto            8
			case 1: // '\001'
				PersistentScheduleActivity.a(a, scheduleuiservicedata.getScheduleItemIndex());
	//   74  238:aload_0         
	//   75  239:getfield        #12  <Field PersistentScheduleActivity a>
	//   76  242:aload_1         
	//   77  243:invokevirtual   #66  <Method int ScheduleUIServiceData.getScheduleItemIndex()>
	//   78  246:invokestatic    #107 <Method void PersistentScheduleActivity.a(PersistentScheduleActivity, int)>
				break;
			}
		} while(true);
	//*  79  249:goto            8
	//   80  252:return          
	}

	final PersistentScheduleActivity a;

	PersistentScheduleActivity$2(PersistentScheduleActivity persistentscheduleactivity)
	{
		a = persistentscheduleactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PersistentScheduleActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ScheduleUIServiceDataCallback()>
	//    5    9:return          
	}
}
