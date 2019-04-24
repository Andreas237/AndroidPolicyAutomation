// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.tip;

import android.app.NotificationManager;
import android.content.*;
import android.os.Bundle;
import com.birbit.android.jobqueue.JobManager;
import com.pactforcure.app.api.UpdateLastTipIndexJob;
import com.pactforcure.app.core.BackboneApplication;

// Referenced classes of package com.pactforcure.app.tip:
//			TipOfTheWeekStorage, TipOfTheWeekNotificationBuilder

public class TipOfTheWeekAlarmReceiver extends BroadcastReceiver
{

	public TipOfTheWeekAlarmReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		TipOfTheWeekStorage.incrementNumberOfUnseenTips();
	//    0    0:invokestatic    #16  <Method void TipOfTheWeekStorage.incrementNumberOfUnseenTips()>
		int i = intent.getExtras().getInt("TIP_INDEX");
	//    1    3:aload_2         
	//    2    4:invokevirtual   #22  <Method Bundle Intent.getExtras()>
	//    3    7:ldc1            #24  <String "TIP_INDEX">
	//    4    9:invokevirtual   #30  <Method int Bundle.getInt(String)>
	//    5   12:istore_3        
		if(i == 0)
	//*   6   13:iload_3         
	//*   7   14:ifne            18
		{
			return;
	//    8   17:return          
		} else
		{
			((NotificationManager)context.getSystemService("notification")).notify(0x4c25c70, TipOfTheWeekNotificationBuilder.build(i));
	//    9   18:aload_1         
	//   10   19:ldc1            #32  <String "notification">
	//   11   21:invokevirtual   #38  <Method Object Context.getSystemService(String)>
	//   12   24:checkcast       #40  <Class NotificationManager>
	//   13   27:ldc1            #41  <Int 0x4c25c70>
	//   14   29:iload_3         
	//   15   30:invokestatic    #47  <Method android.app.Notification TipOfTheWeekNotificationBuilder.build(int)>
	//   16   33:invokevirtual   #51  <Method void NotificationManager.notify(int, android.app.Notification)>
			BackboneApplication.get().getJobManager().addJobInBackground(((com.birbit.android.jobqueue.Job) (new UpdateLastTipIndexJob())));
	//   17   36:invokestatic    #57  <Method BackboneApplication BackboneApplication.get()>
	//   18   39:invokevirtual   #61  <Method JobManager BackboneApplication.getJobManager()>
	//   19   42:new             #63  <Class UpdateLastTipIndexJob>
	//   20   45:dup             
	//   21   46:invokespecial   #64  <Method void UpdateLastTipIndexJob()>
	//   22   49:invokevirtual   #70  <Method void JobManager.addJobInBackground(com.birbit.android.jobqueue.Job)>
			return;
	//   23   52:return          
		}
	}
}
