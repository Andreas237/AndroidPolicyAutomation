// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.scheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.log.JqLog;

// Referenced classes of package com.birbit.android.jobqueue.scheduling:
//			FrameworkScheduler

public abstract class FrameworkJobSchedulerService extends JobService
{

	public FrameworkJobSchedulerService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void JobService()>
	//    2    4:return          
	}

	public static FrameworkScheduler createSchedulerFor(Context context, Class class1)
	{
		if(com/birbit/android/jobqueue/scheduling/FrameworkJobSchedulerService == class1)
	//*   0    0:ldc1            #2   <Class FrameworkJobSchedulerService>
	//*   1    2:aload_1         
	//*   2    3:if_acmpne       16
			throw new IllegalArgumentException("You must create a service that extends FrameworkJobSchedulerService");
	//    3    6:new             #16  <Class IllegalArgumentException>
	//    4    9:dup             
	//    5   10:ldc1            #18  <String "You must create a service that extends FrameworkJobSchedulerService">
	//    6   12:invokespecial   #21  <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		else
			return new FrameworkScheduler(class1);
	//    8   16:new             #23  <Class FrameworkScheduler>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #26  <Method void FrameworkScheduler(Class)>
	//   12   24:areturn         
	}

	private FrameworkScheduler getScheduler()
	{
		Scheduler scheduler = getJobManager().getScheduler();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method JobManager getJobManager()>
	//    2    4:invokevirtual   #40  <Method Scheduler JobManager.getScheduler()>
	//    3    7:astore_1        
		if(scheduler instanceof FrameworkScheduler)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #23  <Class FrameworkScheduler>
	//*   6   12:ifeq            20
		{
			return (FrameworkScheduler)scheduler;
	//    7   15:aload_1         
	//    8   16:checkcast       #23  <Class FrameworkScheduler>
	//    9   19:areturn         
		} else
		{
			JqLog.e("FrameworkJobSchedulerService has been created but the JobManager does not have a scheduler created by FrameworkJobSchedulerService.", new Object[0]);
	//   10   20:ldc1            #42  <String "FrameworkJobSchedulerService has been created but the JobManager does not have a scheduler created by FrameworkJobSchedulerService.">
	//   11   22:iconst_0        
	//   12   23:anewarray       Object[]
	//   13   26:invokestatic    #50  <Method void JqLog.e(String, Object[])>
			return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
		}
	}

	protected abstract JobManager getJobManager();

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void JobService.onCreate()>
		FrameworkScheduler frameworkscheduler = getScheduler();
	//    2    4:aload_0         
	//    3    5:invokespecial   #57  <Method FrameworkScheduler getScheduler()>
	//    4    8:astore_1        
		if(frameworkscheduler != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
		{
			frameworkscheduler.setJobService(((JobService) (this)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #61  <Method void FrameworkScheduler.setJobService(JobService)>
			return;
	//   10   18:return          
		} else
		{
			JqLog.e("FrameworkJobSchedulerService has been created but it does not have a scheduler. You must initialize JobManager before the service is created.", new Object[0]);
	//   11   19:ldc1            #63  <String "FrameworkJobSchedulerService has been created but it does not have a scheduler. You must initialize JobManager before the service is created.">
	//   12   21:iconst_0        
	//   13   22:anewarray       Object[]
	//   14   25:invokestatic    #50  <Method void JqLog.e(String, Object[])>
			return;
	//   15   28:return          
		}
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void JobService.onDestroy()>
		FrameworkScheduler frameworkscheduler = getScheduler();
	//    2    4:aload_0         
	//    3    5:invokespecial   #57  <Method FrameworkScheduler getScheduler()>
	//    4    8:astore_1        
		if(frameworkscheduler != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
		{
			frameworkscheduler.setJobService(((JobService) (null)));
	//    7   13:aload_1         
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #61  <Method void FrameworkScheduler.setJobService(JobService)>
			return;
	//   10   18:return          
		} else
		{
			JqLog.e("FrameworkJobSchedulerService is being destroyed but it does not have a scheduler :/. You must initialize JobManager before the service is created.", new Object[0]);
	//   11   19:ldc1            #68  <String "FrameworkJobSchedulerService is being destroyed but it does not have a scheduler :/. You must initialize JobManager before the service is created.">
	//   12   21:iconst_0        
	//   13   22:anewarray       Object[]
	//   14   25:invokestatic    #50  <Method void JqLog.e(String, Object[])>
			return;
	//   15   28:return          
		}
	}

	public boolean onStartJob(JobParameters jobparameters)
	{
		FrameworkScheduler frameworkscheduler = getScheduler();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method FrameworkScheduler getScheduler()>
	//    2    4:astore_2        
		if(frameworkscheduler != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			return frameworkscheduler.onStartJob(jobparameters);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #72  <Method boolean FrameworkScheduler.onStartJob(JobParameters)>
	//    8   14:ireturn         
		} else
		{
			JqLog.e("FrameworkJobSchedulerService has been triggered but it does not have a scheduler. You must initialize JobManager before the service is created.", new Object[0]);
	//    9   15:ldc1            #74  <String "FrameworkJobSchedulerService has been triggered but it does not have a scheduler. You must initialize JobManager before the service is created.">
	//   10   17:iconst_0        
	//   11   18:anewarray       Object[]
	//   12   21:invokestatic    #50  <Method void JqLog.e(String, Object[])>
			return false;
	//   13   24:iconst_0        
	//   14   25:ireturn         
		}
	}

	public boolean onStopJob(JobParameters jobparameters)
	{
		FrameworkScheduler frameworkscheduler = getScheduler();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method FrameworkScheduler getScheduler()>
	//    2    4:astore_2        
		if(frameworkscheduler != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			return frameworkscheduler.onStopJob(jobparameters);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #77  <Method boolean FrameworkScheduler.onStopJob(JobParameters)>
	//    8   14:ireturn         
		} else
		{
			JqLog.e("FrameworkJobSchedulerService has been stopped but it does not have a scheduler. You must initialize JobManager before the service is created.", new Object[0]);
	//    9   15:ldc1            #79  <String "FrameworkJobSchedulerService has been stopped but it does not have a scheduler. You must initialize JobManager before the service is created.">
	//   10   17:iconst_0        
	//   11   18:anewarray       Object[]
	//   12   21:invokestatic    #50  <Method void JqLog.e(String, Object[])>
			return false;
	//   13   24:iconst_0        
	//   14   25:ireturn         
		}
	}
}
