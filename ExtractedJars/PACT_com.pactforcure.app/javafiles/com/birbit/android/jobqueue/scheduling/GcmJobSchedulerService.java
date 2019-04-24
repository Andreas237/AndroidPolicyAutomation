// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.scheduling;

import android.content.Context;
import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.log.JqLog;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.TaskParams;

// Referenced classes of package com.birbit.android.jobqueue.scheduling:
//			GcmScheduler

public abstract class GcmJobSchedulerService extends GcmTaskService
{

	public GcmJobSchedulerService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void GcmTaskService()>
	//    2    4:return          
	}

	public static GcmScheduler createSchedulerFor(Context context, Class class1)
	{
		if(com/birbit/android/jobqueue/scheduling/GcmJobSchedulerService == class1)
	//*   0    0:ldc1            #2   <Class GcmJobSchedulerService>
	//*   1    2:aload_1         
	//*   2    3:if_acmpne       16
			throw new IllegalArgumentException("You must create a service that extends GcmJobSchedulerService");
	//    3    6:new             #13  <Class IllegalArgumentException>
	//    4    9:dup             
	//    5   10:ldc1            #15  <String "You must create a service that extends GcmJobSchedulerService">
	//    6   12:invokespecial   #18  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return new GcmScheduler(context.getApplicationContext(), class1);
	//    8   16:new             #20  <Class GcmScheduler>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokevirtual   #26  <Method Context Context.getApplicationContext()>
	//   12   24:aload_1         
	//   13   25:invokespecial   #29  <Method void GcmScheduler(Context, Class)>
	//   14   28:areturn         
	}

	protected abstract JobManager getJobManager();

	protected GcmScheduler getScheduler()
	{
		Scheduler scheduler = getJobManager().getScheduler();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method JobManager getJobManager()>
	//    2    4:invokevirtual   #44  <Method Scheduler JobManager.getScheduler()>
	//    3    7:astore_1        
		if(scheduler instanceof GcmScheduler)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #20  <Class GcmScheduler>
	//*   6   12:ifeq            20
		{
			return (GcmScheduler)scheduler;
	//    7   15:aload_1         
	//    8   16:checkcast       #20  <Class GcmScheduler>
	//    9   19:areturn         
		} else
		{
			JqLog.e("GcmJobSchedulerService has been created but the JobManager does not have a scheduler created by GcmJobSchedulerService.", new Object[0]);
	//   10   20:ldc1            #46  <String "GcmJobSchedulerService has been created but the JobManager does not have a scheduler created by GcmJobSchedulerService.">
	//   11   22:iconst_0        
	//   12   23:anewarray       Object[]
	//   13   26:invokestatic    #54  <Method void JqLog.e(String, Object[])>
			return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
		}
	}

	public int onRunTask(TaskParams taskparams)
	{
		GcmScheduler gcmscheduler = getScheduler();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method GcmScheduler getScheduler()>
	//    2    4:astore_2        
		if(gcmscheduler != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			return gcmscheduler.onStartJob(taskparams);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #62  <Method int GcmScheduler.onStartJob(TaskParams)>
	//    8   14:ireturn         
		} else
		{
			JqLog.e("RunTask on GcmJobSchedulerService has been called but it does not have a scheduler. Make sure you've initialized JobManager before the service might be created.", new Object[0]);
	//    9   15:ldc1            #64  <String "RunTask on GcmJobSchedulerService has been called but it does not have a scheduler. Make sure you've initialized JobManager before the service might be created.">
	//   10   17:iconst_0        
	//   11   18:anewarray       Object[]
	//   12   21:invokestatic    #54  <Method void JqLog.e(String, Object[])>
			return 2;
	//   13   24:iconst_2        
	//   14   25:ireturn         
		}
	}
}
