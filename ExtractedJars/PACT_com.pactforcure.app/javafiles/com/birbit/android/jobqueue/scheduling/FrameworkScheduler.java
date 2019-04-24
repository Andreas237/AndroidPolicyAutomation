// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.scheduling;

import android.app.job.*;
import android.content.*;
import android.os.PersistableBundle;
import com.birbit.android.jobqueue.log.JqLog;
import java.util.UUID;

// Referenced classes of package com.birbit.android.jobqueue.scheduling:
//			Scheduler, SchedulerConstraint

class FrameworkScheduler extends Scheduler
{

	FrameworkScheduler(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Scheduler()>
		serviceImpl = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field Class serviceImpl>
	//    5    9:return          
	}

	static SchedulerConstraint fromBundle(PersistableBundle persistablebundle)
		throws Exception
	{
		SchedulerConstraint schedulerconstraint = new SchedulerConstraint(persistablebundle.getString("uuid"));
	//    0    0:new             #51  <Class SchedulerConstraint>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #23  <String "uuid">
	//    4    7:invokevirtual   #57  <Method String PersistableBundle.getString(String)>
	//    5   10:invokespecial   #60  <Method void SchedulerConstraint(String)>
	//    6   13:astore_1        
		if(schedulerconstraint.getUuid() == null)
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #64  <Method String SchedulerConstraint.getUuid()>
	//*   9   18:ifnonnull       31
			schedulerconstraint.setUuid(UUID.randomUUID().toString());
	//   10   21:aload_1         
	//   11   22:invokestatic    #70  <Method UUID UUID.randomUUID()>
	//   12   25:invokevirtual   #73  <Method String UUID.toString()>
	//   13   28:invokevirtual   #76  <Method void SchedulerConstraint.setUuid(String)>
		schedulerconstraint.setNetworkStatus(persistablebundle.getInt("networkStatus", 0));
	//   14   31:aload_1         
	//   15   32:aload_0         
	//   16   33:ldc1            #20  <String "networkStatus">
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #80  <Method int PersistableBundle.getInt(String, int)>
	//   19   39:invokevirtual   #84  <Method void SchedulerConstraint.setNetworkStatus(int)>
		schedulerconstraint.setDelayInMs(persistablebundle.getLong("delay", 0L));
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:ldc1            #14  <String "delay">
	//   23   46:lconst_0        
	//   24   47:invokevirtual   #88  <Method long PersistableBundle.getLong(String, long)>
	//   25   50:invokevirtual   #92  <Method void SchedulerConstraint.setDelayInMs(long)>
		if(persistablebundle.containsKey("keyDeadline"))
	//*  26   53:aload_0         
	//*  27   54:ldc1            #11  <String "keyDeadline">
	//*  28   56:invokevirtual   #96  <Method boolean PersistableBundle.containsKey(String)>
	//*  29   59:ifeq            78
			schedulerconstraint.setOverrideDeadlineInMs(Long.valueOf(persistablebundle.getLong("keyDeadline", 0xffffffffL)));
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:ldc1            #11  <String "keyDeadline">
	//   33   66:ldc2w           #97  <Long 0xffffffffL>
	//   34   69:invokevirtual   #88  <Method long PersistableBundle.getLong(String, long)>
	//   35   72:invokestatic    #104 <Method Long Long.valueOf(long)>
	//   36   75:invokevirtual   #108 <Method void SchedulerConstraint.setOverrideDeadlineInMs(Long)>
		return schedulerconstraint;
	//   37   78:aload_1         
	//   38   79:areturn         
	}

	private SharedPreferences getPreferences(Context context)
	{
		com/birbit/android/jobqueue/scheduling/FrameworkScheduler;
	//    0    0:ldc1            #2   <Class FrameworkScheduler>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(preferences == null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #113 <Field SharedPreferences preferences>
	//*   4    7:ifnonnull       21
			preferences = context.getSharedPreferences("jobqueue_fw_scheduler", 0);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:ldc1            #115 <String "jobqueue_fw_scheduler">
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #121 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   10   18:putfield        #113 <Field SharedPreferences preferences>
		context = ((Context) (preferences));
	//   11   21:aload_0         
	//   12   22:getfield        #113 <Field SharedPreferences preferences>
	//   13   25:astore_1        
		com/birbit/android/jobqueue/scheduling/FrameworkScheduler;
	//   14   26:ldc1            #2   <Class FrameworkScheduler>
		JVM INSTR monitorexit ;
	//   15   28:monitorexit     
		return ((SharedPreferences) (context));
	//   16   29:aload_1         
	//   17   30:areturn         
		context;
	//   18   31:astore_1        
		com/birbit/android/jobqueue/scheduling/FrameworkScheduler;
	//   19   32:ldc1            #2   <Class FrameworkScheduler>
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		throw context;
	//   21   35:aload_1         
	//   22   36:athrow          
	}

	static PersistableBundle toPersistentBundle(SchedulerConstraint schedulerconstraint)
	{
		PersistableBundle persistablebundle = new PersistableBundle();
	//    0    0:new             #53  <Class PersistableBundle>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void PersistableBundle()>
	//    3    7:astore_1        
		persistablebundle.putString("uuid", schedulerconstraint.getUuid());
	//    4    8:aload_1         
	//    5    9:ldc1            #23  <String "uuid">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #64  <Method String SchedulerConstraint.getUuid()>
	//    8   15:invokevirtual   #128 <Method void PersistableBundle.putString(String, String)>
		persistablebundle.putInt("networkStatus", schedulerconstraint.getNetworkStatus());
	//    9   18:aload_1         
	//   10   19:ldc1            #20  <String "networkStatus">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #132 <Method int SchedulerConstraint.getNetworkStatus()>
	//   13   25:invokevirtual   #136 <Method void PersistableBundle.putInt(String, int)>
		persistablebundle.putLong("delay", schedulerconstraint.getDelayInMs());
	//   14   28:aload_1         
	//   15   29:ldc1            #14  <String "delay">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #140 <Method long SchedulerConstraint.getDelayInMs()>
	//   18   35:invokevirtual   #144 <Method void PersistableBundle.putLong(String, long)>
		schedulerconstraint = ((SchedulerConstraint) (schedulerconstraint.getOverrideDeadlineInMs()));
	//   19   38:aload_0         
	//   20   39:invokevirtual   #148 <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//   21   42:astore_0        
		if(schedulerconstraint != null)
	//*  22   43:aload_0         
	//*  23   44:ifnull          57
			persistablebundle.putLong("keyDeadline", ((Long) (schedulerconstraint)).longValue());
	//   24   47:aload_1         
	//   25   48:ldc1            #11  <String "keyDeadline">
	//   26   50:aload_0         
	//   27   51:invokevirtual   #151 <Method long Long.longValue()>
	//   28   54:invokevirtual   #144 <Method void PersistableBundle.putLong(String, long)>
		return persistablebundle;
	//   29   57:aload_1         
	//   30   58:areturn         
	}

	public void cancelAll()
	{
		JqLog.d("[FW Scheduler] cancel all", new Object[0]);
	//    0    0:ldc1            #154 <String "[FW Scheduler] cancel all">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #162 <Method void JqLog.d(String, Object[])>
		getJobScheduler().cancelAll();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #166 <Method JobScheduler getJobScheduler()>
	//    6   13:invokevirtual   #170 <Method void JobScheduler.cancelAll()>
	//    7   16:return          
	}

	int createId()
	{
		com/birbit/android/jobqueue/scheduling/FrameworkScheduler;
	//    0    0:ldc1            #2   <Class FrameworkScheduler>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		int i;
		SharedPreferences sharedpreferences = getPreferences(getApplicationContext());
	//    2    3:aload_0         
	//    3    4:aload_0         
	//    4    5:invokevirtual   #177 <Method Context getApplicationContext()>
	//    5    8:invokespecial   #179 <Method SharedPreferences getPreferences(Context)>
	//    6   11:astore_2        
		i = sharedpreferences.getInt("id", 0) + 1;
	//    7   12:aload_2         
	//    8   13:ldc1            #17  <String "id">
	//    9   15:iconst_0        
	//   10   16:invokeinterface #182 <Method int SharedPreferences.getInt(String, int)>
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:istore_1        
		sharedpreferences.edit().putInt("id", i).commit();
	//   14   24:aload_2         
	//   15   25:invokeinterface #186 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   16   30:ldc1            #17  <String "id">
	//   17   32:iload_1         
	//   18   33:invokeinterface #191 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   19   38:invokeinterface #195 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   20   43:pop             
		com/birbit/android/jobqueue/scheduling/FrameworkScheduler;
	//   21   44:ldc1            #2   <Class FrameworkScheduler>
		JVM INSTR monitorexit ;
	//   22   46:monitorexit     
		return i;
	//   23   47:iload_1         
	//   24   48:ireturn         
		Exception exception;
		exception;
	//   25   49:astore_2        
		com/birbit/android/jobqueue/scheduling/FrameworkScheduler;
	//   26   50:ldc1            #2   <Class FrameworkScheduler>
		JVM INSTR monitorexit ;
	//   27   52:monitorexit     
		throw exception;
	//   28   53:aload_2         
	//   29   54:athrow          
	}

	ComponentName getComponentName()
	{
		if(componentName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field ComponentName componentName>
	//*   2    4:ifnonnull       32
			componentName = new ComponentName(getApplicationContext().getPackageName(), serviceImpl.getCanonicalName());
	//    3    7:aload_0         
	//    4    8:new             #202 <Class ComponentName>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #177 <Method Context getApplicationContext()>
	//    8   16:invokevirtual   #205 <Method String Context.getPackageName()>
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field Class serviceImpl>
	//   11   23:invokevirtual   #210 <Method String Class.getCanonicalName()>
	//   12   26:invokespecial   #212 <Method void ComponentName(String, String)>
	//   13   29:putfield        #200 <Field ComponentName componentName>
		return componentName;
	//   14   32:aload_0         
	//   15   33:getfield        #200 <Field ComponentName componentName>
	//   16   36:areturn         
	}

	JobScheduler getJobScheduler()
	{
		if(jobScheduler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field JobScheduler jobScheduler>
	//*   2    4:ifnonnull       23
			jobScheduler = (JobScheduler)getApplicationContext().getSystemService("jobscheduler");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #177 <Method Context getApplicationContext()>
	//    6   12:ldc1            #216 <String "jobscheduler">
	//    7   14:invokevirtual   #220 <Method Object Context.getSystemService(String)>
	//    8   17:checkcast       #168 <Class JobScheduler>
	//    9   20:putfield        #214 <Field JobScheduler jobScheduler>
		return jobScheduler;
	//   10   23:aload_0         
	//   11   24:getfield        #214 <Field JobScheduler jobScheduler>
	//   12   27:areturn         
	}

	public void onFinished(SchedulerConstraint schedulerconstraint, boolean flag)
	{
		JqLog.d("[FW Scheduler] on finished job %s. reschedule:%s", new Object[] {
			schedulerconstraint, Boolean.valueOf(flag)
		});
	//    0    0:ldc1            #224 <String "[FW Scheduler] on finished job %s. reschedule:%s">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_1         
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:iload_2         
	//   10   13:invokestatic    #229 <Method Boolean Boolean.valueOf(boolean)>
	//   11   16:aastore         
	//   12   17:invokestatic    #162 <Method void JqLog.d(String, Object[])>
		JobService jobservice = jobService;
	//   13   20:aload_0         
	//   14   21:getfield        #231 <Field JobService jobService>
	//   15   24:astore_3        
		if(jobservice == null)
	//*  16   25:aload_3         
	//*  17   26:ifnonnull       39
		{
			JqLog.e("[FW Scheduler] scheduler onFinished is called but i don't have a job service", new Object[0]);
	//   18   29:ldc1            #233 <String "[FW Scheduler] scheduler onFinished is called but i don't have a job service">
	//   19   31:iconst_0        
	//   20   32:anewarray       Object[]
	//   21   35:invokestatic    #236 <Method void JqLog.e(String, Object[])>
			return;
	//   22   38:return          
		}
		schedulerconstraint = ((SchedulerConstraint) (schedulerconstraint.getData()));
	//   23   39:aload_1         
	//   24   40:invokevirtual   #240 <Method Object SchedulerConstraint.getData()>
	//   25   43:astore_1        
		if(schedulerconstraint instanceof JobParameters)
	//*  26   44:aload_1         
	//*  27   45:instanceof      #242 <Class JobParameters>
	//*  28   48:ifeq            61
		{
			jobservice.jobFinished((JobParameters)schedulerconstraint, flag);
	//   29   51:aload_3         
	//   30   52:aload_1         
	//   31   53:checkcast       #242 <Class JobParameters>
	//   32   56:iload_2         
	//   33   57:invokevirtual   #248 <Method void JobService.jobFinished(JobParameters, boolean)>
			return;
	//   34   60:return          
		} else
		{
			JqLog.e("[FW Scheduler] cannot obtain the job parameters", new Object[0]);
	//   35   61:ldc1            #250 <String "[FW Scheduler] cannot obtain the job parameters">
	//   36   63:iconst_0        
	//   37   64:anewarray       Object[]
	//   38   67:invokestatic    #236 <Method void JqLog.e(String, Object[])>
			return;
	//   39   70:return          
		}
	}

	boolean onStartJob(JobParameters jobparameters)
	{
		SchedulerConstraint schedulerconstraint;
		try
		{
			schedulerconstraint = fromBundle(jobparameters.getExtras());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #256 <Method PersistableBundle JobParameters.getExtras()>
	//    2    4:invokestatic    #258 <Method SchedulerConstraint fromBundle(PersistableBundle)>
	//    3    7:astore_2        
		}
	//*   4    8:ldc2            #260 <String "[FW Scheduler] start job %s %d">
	//*   5   11:iconst_2        
	//*   6   12:anewarray       Object[]
	//*   7   15:dup             
	//*   8   16:iconst_0        
	//*   9   17:aload_2         
	//*  10   18:aastore         
	//*  11   19:dup             
	//*  12   20:iconst_1        
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #263 <Method int JobParameters.getJobId()>
	//*  15   25:invokestatic    #268 <Method Integer Integer.valueOf(int)>
	//*  16   28:aastore         
	//*  17   29:invokestatic    #162 <Method void JqLog.d(String, Object[])>
	//*  18   32:aload_2         
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #272 <Method void SchedulerConstraint.setData(Object)>
	//*  21   37:aload_0         
	//*  22   38:aload_2         
	//*  23   39:invokevirtual   #276 <Method boolean start(SchedulerConstraint)>
	//*  24   42:ireturn         
		// Misplaced declaration of an exception variable
		catch(JobParameters jobparameters)
	//*  25   43:astore_1        
		{
			JqLog.e(((Throwable) (jobparameters)), "bad bundle from framework job scheduler start callback.", new Object[0]);
	//   26   44:aload_1         
	//   27   45:ldc2            #278 <String "bad bundle from framework job scheduler start callback.">
	//   28   48:iconst_0        
	//   29   49:anewarray       Object[]
	//   30   52:invokestatic    #281 <Method void JqLog.e(Throwable, String, Object[])>
			return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
		}
		JqLog.d("[FW Scheduler] start job %s %d", new Object[] {
			schedulerconstraint, Integer.valueOf(jobparameters.getJobId())
		});
		schedulerconstraint.setData(((Object) (jobparameters)));
		return start(schedulerconstraint);
	}

	boolean onStopJob(JobParameters jobparameters)
	{
		try
		{
			jobparameters = ((JobParameters) (fromBundle(jobparameters.getExtras())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #256 <Method PersistableBundle JobParameters.getExtras()>
	//    2    4:invokestatic    #258 <Method SchedulerConstraint fromBundle(PersistableBundle)>
	//    3    7:astore_1        
		}
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #285 <Method boolean stop(SchedulerConstraint)>
	//*   7   13:ireturn         
		// Misplaced declaration of an exception variable
		catch(JobParameters jobparameters)
	//*   8   14:astore_1        
		{
			JqLog.e(((Throwable) (jobparameters)), "bad bundle from job scheduler stop callback", new Object[0]);
	//    9   15:aload_1         
	//   10   16:ldc2            #287 <String "bad bundle from job scheduler stop callback">
	//   11   19:iconst_0        
	//   12   20:anewarray       Object[]
	//   13   23:invokestatic    #281 <Method void JqLog.e(Throwable, String, Object[])>
			return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
		}
		return stop(((SchedulerConstraint) (jobparameters)));
	}

	public void request(SchedulerConstraint schedulerconstraint)
	{
		int i;
		JobScheduler jobscheduler;
		android.app.job.JobInfo.Builder builder;
		jobscheduler = getJobScheduler();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #166 <Method JobScheduler getJobScheduler()>
	//    2    4:astore          5
		i = createId();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #291 <Method int createId()>
	//    5   10:istore_2        
		builder = (new android.app.job.JobInfo.Builder(i, getComponentName())).setExtras(toPersistentBundle(schedulerconstraint)).setPersisted(true);
	//    6   11:new             #293 <Class android.app.job.JobInfo$Builder>
	//    7   14:dup             
	//    8   15:iload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #295 <Method ComponentName getComponentName()>
	//   11   20:invokespecial   #298 <Method void android.app.job.JobInfo$Builder(int, ComponentName)>
	//   12   23:aload_1         
	//   13   24:invokestatic    #300 <Method PersistableBundle toPersistentBundle(SchedulerConstraint)>
	//   14   27:invokevirtual   #304 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setExtras(PersistableBundle)>
	//   15   30:iconst_1        
	//   16   31:invokevirtual   #308 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setPersisted(boolean)>
	//   17   34:astore          6
		schedulerconstraint.getNetworkStatus();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #132 <Method int SchedulerConstraint.getNetworkStatus()>
		JVM INSTR tableswitch 1 2: default 64
	//	               1 178
	//	               2 168;
	//   20   40:tableswitch     1 2: default 64
	//	               1 178
	//	               2 168
		   goto _L1 _L2 _L3
_L2:
		break MISSING_BLOCK_LABEL_178;
_L1:
		builder.setRequiredNetworkType(0);
	//   21   64:aload           6
	//   22   66:iconst_0        
	//   23   67:invokevirtual   #312 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiredNetworkType(int)>
	//   24   70:pop             
		builder.setRequiresDeviceIdle(true);
	//   25   71:aload           6
	//   26   73:iconst_1        
	//   27   74:invokevirtual   #315 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiresDeviceIdle(boolean)>
	//   28   77:pop             
_L4:
		if(schedulerconstraint.getDelayInMs() > 0L)
	//*  29   78:aload_1         
	//*  30   79:invokevirtual   #140 <Method long SchedulerConstraint.getDelayInMs()>
	//*  31   82:lconst_0        
	//*  32   83:lcmp            
	//*  33   84:ifle            97
			builder.setMinimumLatency(schedulerconstraint.getDelayInMs());
	//   34   87:aload           6
	//   35   89:aload_1         
	//   36   90:invokevirtual   #140 <Method long SchedulerConstraint.getDelayInMs()>
	//   37   93:invokevirtual   #319 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setMinimumLatency(long)>
	//   38   96:pop             
		if(schedulerconstraint.getOverrideDeadlineInMs() != null)
	//*  39   97:aload_1         
	//*  40   98:invokevirtual   #148 <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//*  41  101:ifnull          117
			builder.setOverrideDeadline(schedulerconstraint.getOverrideDeadlineInMs().longValue());
	//   42  104:aload           6
	//   43  106:aload_1         
	//   44  107:invokevirtual   #148 <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//   45  110:invokevirtual   #151 <Method long Long.longValue()>
	//   46  113:invokevirtual   #322 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setOverrideDeadline(long)>
	//   47  116:pop             
		int j = jobscheduler.schedule(builder.build());
	//   48  117:aload           5
	//   49  119:aload           6
	//   50  121:invokevirtual   #326 <Method android.app.job.JobInfo android.app.job.JobInfo$Builder.build()>
	//   51  124:invokevirtual   #330 <Method int JobScheduler.schedule(android.app.job.JobInfo)>
	//   52  127:istore_3        
		boolean flag;
		if(j > 0)
	//*  53  128:iload_3         
	//*  54  129:ifle            188
			flag = true;
	//   55  132:iconst_1        
	//   56  133:istore          4
		else
	//*  57  135:ldc2            #332 <String "[FW Scheduler] scheduled a framework job. Success? %s id: %d created id: %d">
	//*  58  138:iconst_3        
	//*  59  139:anewarray       Object[]
	//*  60  142:dup             
	//*  61  143:iconst_0        
	//*  62  144:iload           4
	//*  63  146:invokestatic    #229 <Method Boolean Boolean.valueOf(boolean)>
	//*  64  149:aastore         
	//*  65  150:dup             
	//*  66  151:iconst_1        
	//*  67  152:iload_3         
	//*  68  153:invokestatic    #268 <Method Integer Integer.valueOf(int)>
	//*  69  156:aastore         
	//*  70  157:dup             
	//*  71  158:iconst_2        
	//*  72  159:iload_2         
	//*  73  160:invokestatic    #268 <Method Integer Integer.valueOf(int)>
	//*  74  163:aastore         
	//*  75  164:invokestatic    #162 <Method void JqLog.d(String, Object[])>
	//*  76  167:return          
	//*  77  168:aload           6
	//*  78  170:iconst_2        
	//*  79  171:invokevirtual   #312 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiredNetworkType(int)>
	//*  80  174:pop             
	//*  81  175:goto            78
	//*  82  178:aload           6
	//*  83  180:iconst_1        
	//*  84  181:invokevirtual   #312 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiredNetworkType(int)>
	//*  85  184:pop             
	//*  86  185:goto            78
			flag = false;
	//   87  188:iconst_0        
	//   88  189:istore          4
		JqLog.d("[FW Scheduler] scheduled a framework job. Success? %s id: %d created id: %d", new Object[] {
			Boolean.valueOf(flag), Integer.valueOf(j), Integer.valueOf(i)
		});
		return;
_L3:
		builder.setRequiredNetworkType(2);
		  goto _L4
		builder.setRequiredNetworkType(1);
		  goto _L4
	//*  89  191:goto            135
	}

	void setJobService(JobService jobservice)
	{
		jobService = jobservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #231 <Field JobService jobService>
	//    3    5:return          
	}

	private static final String KEY_DEADLINE = "keyDeadline";
	private static final String KEY_DELAY = "delay";
	static final String KEY_ID = "id";
	private static final String KEY_NETWORK_STATUS = "networkStatus";
	private static final String KEY_UUID = "uuid";
	private ComponentName componentName;
	private JobScheduler jobScheduler;
	private JobService jobService;
	private SharedPreferences preferences;
	final Class serviceImpl;
}
