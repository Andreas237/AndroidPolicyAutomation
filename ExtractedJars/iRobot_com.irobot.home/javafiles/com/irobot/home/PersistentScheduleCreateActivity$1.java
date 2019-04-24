// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			PersistentScheduleCreateActivity

class PersistentScheduleCreateActivity$1 extends ScheduleUIServiceDataCallback
{

	public void onScheduleUIServiceDataChanged(ScheduleUIServiceData scheduleuiservicedata)
	{
		if(!a.isFinishing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//*   2    4:invokevirtual   #22  <Method boolean PersistentScheduleCreateActivity.isFinishing()>
	//*   3    7:ifne            208
		{
			if(a.isDestroyed())
	//*   4   10:aload_0         
	//*   5   11:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//*   6   14:invokevirtual   #25  <Method boolean PersistentScheduleCreateActivity.isDestroyed()>
	//*   7   17:ifeq            21
				return;
	//    8   20:return          
			Iterator iterator = scheduleuiservicedata.getViewStates().iterator();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #31  <Method ArrayList ScheduleUIServiceData.getViewStates()>
	//   11   25:invokevirtual   #37  <Method Iterator ArrayList.iterator()>
	//   12   28:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   13   29:aload_2         
	//   14   30:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            208
				ScheduleViewState scheduleviewstate = (ScheduleViewState)iterator.next();
	//   16   38:aload_2         
	//   17   39:invokeinterface #46  <Method Object Iterator.next()>
	//   18   44:checkcast       #48  <Class ScheduleViewState>
	//   19   47:astore_3        
				o.a("PScheduleCreateActivity", scheduleviewstate.name());
	//   20   48:ldc1            #50  <String "PScheduleCreateActivity">
	//   21   50:aload_3         
	//   22   51:invokevirtual   #54  <Method String ScheduleViewState.name()>
	//   23   54:invokestatic    #59  <Method void o.a(String, String)>
				switch(PersistentScheduleCreateActivity$3.a[scheduleviewstate.ordinal()])
	//*  24   57:getstatic       #64  <Field int[] PersistentScheduleCreateActivity$3.a>
	//*  25   60:aload_3         
	//*  26   61:invokevirtual   #68  <Method int ScheduleViewState.ordinal()>
	//*  27   64:iaload          
				{
	//*  28   65:tableswitch     1 9: default 116
	//	               1 198
	//	               2 188
	//	               3 177
	//	               4 29
	//	               5 167
	//	               6 153
	//	               7 143
	//	               8 133
	//	               9 119
	//*  29  116:goto            29
				case 9: // '\t'
					a.a(scheduleuiservicedata.getScheduleMultipleMappingData());
	//   30  119:aload_0         
	//   31  120:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//   32  123:aload_1         
	//   33  124:invokevirtual   #72  <Method com.irobot.core.ScheduleMultipleMappingData ScheduleUIServiceData.getScheduleMultipleMappingData()>
	//   34  127:invokevirtual   #75  <Method void PersistentScheduleCreateActivity.a(com.irobot.core.ScheduleMultipleMappingData)>
					break;

	//*  35  130:goto            29
				case 8: // '\b'
					a.n();
	//   36  133:aload_0         
	//   37  134:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//   38  137:invokevirtual   #78  <Method void PersistentScheduleCreateActivity.n()>
					break;

	//*  39  140:goto            29
				case 7: // '\007'
					a.m();
	//   40  143:aload_0         
	//   41  144:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//   42  147:invokevirtual   #81  <Method void PersistentScheduleCreateActivity.m()>
					break;

	//*  43  150:goto            29
				case 6: // '\006'
					a.a(scheduleuiservicedata.getTimeoutTag());
	//   44  153:aload_0         
	//   45  154:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//   46  157:aload_1         
	//   47  158:invokevirtual   #84  <Method String ScheduleUIServiceData.getTimeoutTag()>
	//   48  161:invokevirtual   #87  <Method void PersistentScheduleCreateActivity.a(String)>
					break;

	//*  49  164:goto            29
				case 5: // '\005'
					a.k();
	//   50  167:aload_0         
	//   51  168:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//   52  171:invokevirtual   #90  <Method void PersistentScheduleCreateActivity.k()>
					break;

	//*  53  174:goto            29
				case 3: // '\003'
					PersistentScheduleCreateActivity.a(a, scheduleuiservicedata);
	//   54  177:aload_0         
	//   55  178:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//   56  181:aload_1         
	//   57  182:invokestatic    #93  <Method void PersistentScheduleCreateActivity.a(PersistentScheduleCreateActivity, ScheduleUIServiceData)>
					break;

	//*  58  185:goto            29
				case 2: // '\002'
					a.l();
	//   59  188:aload_0         
	//   60  189:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//   61  192:invokevirtual   #96  <Method void PersistentScheduleCreateActivity.l()>
					break;

	//*  62  195:goto            29
				case 1: // '\001'
					PersistentScheduleCreateActivity.a(a);
	//   63  198:aload_0         
	//   64  199:getfield        #12  <Field PersistentScheduleCreateActivity a>
	//   65  202:invokestatic    #98  <Method void PersistentScheduleCreateActivity.a(PersistentScheduleCreateActivity)>
					break;
				}
			} while(true);
	//   66  205:goto            29
		}
	//   67  208:return          
	}

	final PersistentScheduleCreateActivity a;

	PersistentScheduleCreateActivity$1(PersistentScheduleCreateActivity persistentschedulecreateactivity)
	{
		a = persistentschedulecreateactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PersistentScheduleCreateActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ScheduleUIServiceDataCallback()>
	//    5    9:return          
	}
}
