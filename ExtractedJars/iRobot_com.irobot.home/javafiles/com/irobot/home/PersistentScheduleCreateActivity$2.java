// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			PersistentScheduleCreateActivity

class PersistentScheduleCreateActivity$2
	implements android.content.DialogInterface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (ScheduleUIServiceData.create()));
	//    0    0:invokestatic    #32  <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//    1    3:astore_1        
		((ScheduleUIServiceData) (dialoginterface)).setScheduleMultipleMappingData(a);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field ScheduleMultipleMappingData a>
	//    5    9:invokevirtual   #35  <Method void ScheduleUIServiceData.setScheduleMultipleMappingData(ScheduleMultipleMappingData)>
		((ScheduleUIServiceData) (dialoginterface)).setScheduleItemIndex(b.i);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field PersistentScheduleCreateActivity b>
	//    9   17:getfield        #39  <Field int PersistentScheduleCreateActivity.i>
	//   10   20:invokevirtual   #43  <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
		PersistentScheduleCreateActivity.b(b).sendCommand(ScheduleUIServiceCommand.CreateMappingScheduleSendData, ((ScheduleUIServiceData) (dialoginterface)));
	//   11   23:aload_0         
	//   12   24:getfield        #18  <Field PersistentScheduleCreateActivity b>
	//   13   27:invokestatic    #46  <Method ScheduleUIService PersistentScheduleCreateActivity.b(PersistentScheduleCreateActivity)>
	//   14   30:getstatic       #52  <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.CreateMappingScheduleSendData>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #58  <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
	//   17   37:return          
	}

	final ScheduleMultipleMappingData a;
	final PersistentScheduleCreateActivity b;

	PersistentScheduleCreateActivity$2(PersistentScheduleCreateActivity persistentschedulecreateactivity, ScheduleMultipleMappingData schedulemultiplemappingdata)
	{
		b = persistentschedulecreateactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PersistentScheduleCreateActivity b>
		a = schedulemultiplemappingdata;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ScheduleMultipleMappingData a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
