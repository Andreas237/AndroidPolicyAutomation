// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			PersistentScheduleActivity

class PersistentScheduleActivity$1
	implements com.irobot.home.b.z.a
{

	public void a(int i)
	{
		String s = PersistentScheduleActivity.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field PersistentScheduleActivity a>
	//    2    4:invokestatic    #22  <Method String PersistentScheduleActivity.a(PersistentScheduleActivity)>
	//    3    7:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #24  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #25  <Method void StringBuilder()>
	//    7   15:astore_3        
		stringbuilder.append("Tapped schedule at index ");
	//    8   16:aload_3         
	//    9   17:ldc1            #27  <String "Tapped schedule at index ">
	//   10   19:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(i);
	//   12   23:aload_3         
	//   13   24:iload_1         
	//   14   25:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   15   28:pop             
		o.a(s, stringbuilder.toString());
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   19   34:invokestatic    #43  <Method void o.a(String, String)>
		a.b(i);
	//   20   37:aload_0         
	//   21   38:getfield        #14  <Field PersistentScheduleActivity a>
	//   22   41:iload_1         
	//   23   42:invokevirtual   #46  <Method void PersistentScheduleActivity.b(int)>
	//   24   45:return          
	}

	public void a(int i, boolean flag)
	{
		String s = PersistentScheduleActivity.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field PersistentScheduleActivity a>
	//    2    4:invokestatic    #22  <Method String PersistentScheduleActivity.a(PersistentScheduleActivity)>
	//    3    7:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #24  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #25  <Method void StringBuilder()>
	//    7   15:astore          4
		stringbuilder.append("Switched schedule at index ");
	//    8   17:aload           4
	//    9   19:ldc1            #49  <String "Switched schedule at index ">
	//   10   21:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(i);
	//   12   25:aload           4
	//   13   27:iload_1         
	//   14   28:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
	//   15   31:pop             
		stringbuilder.append(" to state ");
	//   16   32:aload           4
	//   17   34:ldc1            #51  <String " to state ">
	//   18   36:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(flag);
	//   20   40:aload           4
	//   21   42:iload_2         
	//   22   43:invokevirtual   #54  <Method StringBuilder StringBuilder.append(boolean)>
	//   23   46:pop             
		o.a(s, stringbuilder.toString());
	//   24   47:aload_3         
	//   25   48:aload           4
	//   26   50:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   27   53:invokestatic    #43  <Method void o.a(String, String)>
		if(PersistentScheduleActivity.b(a) != null)
	//*  28   56:aload_0         
	//*  29   57:getfield        #14  <Field PersistentScheduleActivity a>
	//*  30   60:invokestatic    #57  <Method ScheduleUIService PersistentScheduleActivity.b(PersistentScheduleActivity)>
	//*  31   63:ifnull          94
		{
			ScheduleUIServiceData scheduleuiservicedata = ScheduleUIServiceData.create();
	//   32   66:invokestatic    #63  <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//   33   69:astore_3        
			scheduleuiservicedata.setMappingScheduleItemSwitchEnabled(flag);
	//   34   70:aload_3         
	//   35   71:iload_2         
	//   36   72:invokevirtual   #67  <Method void ScheduleUIServiceData.setMappingScheduleItemSwitchEnabled(boolean)>
			scheduleuiservicedata.setScheduleItemIndex(i);
	//   37   75:aload_3         
	//   38   76:iload_1         
	//   39   77:invokevirtual   #70  <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
			PersistentScheduleActivity.b(a).sendCommand(ScheduleUIServiceCommand.MappingScheduleItemToggled, scheduleuiservicedata);
	//   40   80:aload_0         
	//   41   81:getfield        #14  <Field PersistentScheduleActivity a>
	//   42   84:invokestatic    #57  <Method ScheduleUIService PersistentScheduleActivity.b(PersistentScheduleActivity)>
	//   43   87:getstatic       #76  <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.MappingScheduleItemToggled>
	//   44   90:aload_3         
	//   45   91:invokevirtual   #82  <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
		}
	//   46   94:return          
	}

	final PersistentScheduleActivity a;

	PersistentScheduleActivity$1(PersistentScheduleActivity persistentscheduleactivity)
	{
		a = persistentscheduleactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field PersistentScheduleActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
