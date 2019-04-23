// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.*;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.util.Locale;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobParameters, IJobCallback, GooglePlayReceiver, JobCoder

public abstract class JobService extends Service
{
	private static final class JobCallback
	{

		void sendResult(int i)
		{
			try
			{
				remoteCallback.jobFinished(GooglePlayReceiver.getJobCoder().encode(job, new Bundle()), i);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field IJobCallback remoteCallback>
		//    2    4:invokestatic    #34  <Method JobCoder GooglePlayReceiver.getJobCoder()>
		//    3    7:aload_0         
		//    4    8:getfield        #18  <Field JobParameters job>
		//    5   11:new             #36  <Class Bundle>
		//    6   14:dup             
		//    7   15:invokespecial   #37  <Method void Bundle()>
		//    8   18:invokevirtual   #43  <Method Bundle JobCoder.encode(JobParameters, Bundle)>
		//    9   21:iload_1         
		//   10   22:invokeinterface #49  <Method void IJobCallback.jobFinished(Bundle, int)>
				return;
		//   11   27:return          
			}
			catch(RemoteException remoteexception)
		//*  12   28:astore_2        
			{
				Log.e("FJD.JobService", "Failed to send result to driver", ((Throwable) (remoteexception)));
		//   13   29:ldc1            #51  <String "FJD.JobService">
		//   14   31:ldc1            #53  <String "Failed to send result to driver">
		//   15   33:aload_2         
		//   16   34:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
		//   17   37:pop             
			}
		//   18   38:return          
		}

		final JobParameters job;
		final IJobCallback remoteCallback;

		private JobCallback(JobParameters jobparameters, IJobCallback ijobcallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			job = jobparameters;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field JobParameters job>
			remoteCallback = ijobcallback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field IJobCallback remoteCallback>
		//    8   14:return          
		}

	}

	public static interface JobResult
		extends Annotation
	{
	}


	public JobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #59  <Class SimpleArrayMap>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #62  <Method void SimpleArrayMap(int)>
	//    7   13:putfield        #64  <Field SimpleArrayMap runningJobs>
	//    8   16:aload_0         
	//    9   17:new             #6   <Class JobService$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #67  <Method void JobService$1(JobService)>
	//   13   25:putfield        #69  <Field IRemoteJobService$Stub binder>
	//   14   28:return          
	}

	protected final void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #75  <Method void Service.dump(FileDescriptor, PrintWriter, String[])>
	//    5    7:return          
	}

	public final void jobFinished(JobParameters jobparameters, boolean flag)
	{
		if(jobparameters == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			Log.e("FJD.JobService", "jobFinished called with a null JobParameters");
	//    2    4:ldc1            #31  <String "FJD.JobService">
	//    3    6:ldc1            #80  <String "jobFinished called with a null JobParameters">
	//    4    8:invokestatic    #86  <Method int Log.e(String, String)>
	//    5   11:pop             
			return;
	//    6   12:return          
		}
		SimpleArrayMap simplearraymap = runningJobs;
	//    7   13:aload_0         
	//    8   14:getfield        #64  <Field SimpleArrayMap runningJobs>
	//    9   17:astore          4
		simplearraymap;
	//   10   19:aload           4
		JVM INSTR monitorenter ;
	//   11   21:monitorenter    
		jobparameters = ((JobParameters) ((JobCallback)runningJobs.remove(((Object) (jobparameters.getTag())))));
	//   12   22:aload_0         
	//   13   23:getfield        #64  <Field SimpleArrayMap runningJobs>
	//   14   26:aload_1         
	//   15   27:invokeinterface #92  <Method String JobParameters.getTag()>
	//   16   32:invokevirtual   #96  <Method Object SimpleArrayMap.remove(Object)>
	//   17   35:checkcast       #12  <Class JobService$JobCallback>
	//   18   38:astore_1        
		if(jobparameters == null)
			break MISSING_BLOCK_LABEL_57;
	//   19   39:aload_1         
	//   20   40:ifnull          57
		int i;
		if(flag)
	//*  21   43:iload_2         
	//*  22   44:ifeq            67
			i = 1;
	//   23   47:iconst_1        
	//   24   48:istore_3        
		else
	//*  25   49:goto            52
	//*  26   52:aload_1         
	//*  27   53:iload_3         
	//*  28   54:invokevirtual   #99  <Method void JobService$JobCallback.sendResult(int)>
	//*  29   57:aload           4
	//*  30   59:monitorexit     
	//*  31   60:return          
	//*  32   61:astore_1        
	//*  33   62:aload           4
	//*  34   64:monitorexit     
	//*  35   65:aload_1         
	//*  36   66:athrow          
			i = 0;
	//   37   67:iconst_0        
	//   38   68:istore_3        
		((JobCallback) (jobparameters)).sendResult(i);
		simplearraymap;
		JVM INSTR monitorexit ;
		return;
		jobparameters;
		simplearraymap;
		JVM INSTR monitorexit ;
		throw jobparameters;
	//*  39   69:goto            52
	}

	public final IBinder onBind(Intent intent)
	{
		return ((IBinder) (binder));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field IRemoteJobService$Stub binder>
	//    2    4:areturn         
	}

	public final void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method void Service.onConfigurationChanged(Configuration)>
	//    3    5:return          
	}

	public final void onRebind(Intent intent)
	{
		super.onRebind(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #112 <Method void Service.onRebind(Intent)>
	//    3    5:return          
	}

	public final void onStart(Intent intent, int i)
	{
	//    0    0:return          
	}

	public final int onStartCommand(Intent intent, int i, int j)
	{
		stopSelf(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #119 <Method void stopSelf(int)>
		return 2;
	//    3    5:iconst_2        
	//    4    6:ireturn         
	}

	public abstract boolean onStartJob(JobParameters jobparameters);

	public abstract boolean onStopJob(JobParameters jobparameters);

	public final void onTaskRemoved(Intent intent)
	{
		super.onTaskRemoved(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method void Service.onTaskRemoved(Intent)>
	//    3    5:return          
	}

	public final boolean onUnbind(Intent intent)
	{
		SimpleArrayMap simplearraymap = runningJobs;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field SimpleArrayMap runningJobs>
	//    2    4:astore          4
		simplearraymap;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i = runningJobs.size() - 1;
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field SimpleArrayMap runningJobs>
	//    7   13:invokevirtual   #132 <Method int SimpleArrayMap.size()>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:istore_2        
_L2:
		if(i < 0)
			break MISSING_BLOCK_LABEL_74;
	//   11   19:iload_2         
	//   12   20:iflt            74
		JobCallback jobcallback = (JobCallback)runningJobs.remove(runningJobs.keyAt(i));
	//   13   23:aload_0         
	//   14   24:getfield        #64  <Field SimpleArrayMap runningJobs>
	//   15   27:aload_0         
	//   16   28:getfield        #64  <Field SimpleArrayMap runningJobs>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #136 <Method Object SimpleArrayMap.keyAt(int)>
	//   19   35:invokevirtual   #96  <Method Object SimpleArrayMap.remove(Object)>
	//   20   38:checkcast       #12  <Class JobService$JobCallback>
	//   21   41:astore          5
		if(jobcallback == null)
			break MISSING_BLOCK_LABEL_94;
	//   22   43:aload           5
	//   23   45:ifnull          94
		int j;
		if(onStopJob(jobcallback.job))
	//*  24   48:aload_0         
	//*  25   49:aload           5
	//*  26   51:getfield        #140 <Field JobParameters JobService$JobCallback.job>
	//*  27   54:invokevirtual   #142 <Method boolean onStopJob(JobParameters)>
	//*  28   57:ifeq            89
			j = 1;
	//   29   60:iconst_1        
	//   30   61:istore_3        
		else
	//*  31   62:goto            65
	//*  32   65:aload           5
	//*  33   67:iload_3         
	//*  34   68:invokevirtual   #99  <Method void JobService$JobCallback.sendResult(int)>
	//*  35   71:goto            94
	//*  36   74:aload           4
	//*  37   76:monitorexit     
	//*  38   77:aload_0         
	//*  39   78:aload_1         
	//*  40   79:invokespecial   #144 <Method boolean Service.onUnbind(Intent)>
	//*  41   82:ireturn         
	//*  42   83:astore_1        
	//*  43   84:aload           4
	//*  44   86:monitorexit     
	//*  45   87:aload_1         
	//*  46   88:athrow          
			j = 2;
	//   47   89:iconst_2        
	//   48   90:istore_3        
		jobcallback.sendResult(j);
		break MISSING_BLOCK_LABEL_94;
		simplearraymap;
		JVM INSTR monitorexit ;
		return super.onUnbind(intent);
		intent;
		simplearraymap;
		JVM INSTR monitorexit ;
		throw intent;
	//*  49   91:goto            65
		i--;
	//   50   94:iload_2         
	//   51   95:iconst_1        
	//   52   96:isub            
	//   53   97:istore_2        
		if(true) goto _L2; else goto _L1
	//   54   98:goto            19
_L1:
	}

	void start(final JobParameters job, IJobCallback ijobcallback)
	{
label0:
		{
			synchronized(runningJobs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field SimpleArrayMap runningJobs>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(!runningJobs.containsKey(((Object) (job.getTag()))))
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #64  <Field SimpleArrayMap runningJobs>
	//    7   11:aload_1         
	//    8   12:invokeinterface #92  <Method String JobParameters.getTag()>
	//    9   17:invokevirtual   #150 <Method boolean SimpleArrayMap.containsKey(Object)>
	//   10   20:ifeq            53
				Log.w("FJD.JobService", String.format(Locale.US, "Job with tag = %s was already running.", new Object[] {
					job.getTag()
				}));
	//   11   23:ldc1            #31  <String "FJD.JobService">
	//   12   25:getstatic       #156 <Field Locale Locale.US>
	//   13   28:ldc1            #158 <String "Job with tag = %s was already running.">
	//   14   30:iconst_1        
	//   15   31:anewarray       Object[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:invokeinterface #92  <Method String JobParameters.getTag()>
	//   20   42:aastore         
	//   21   43:invokestatic    #166 <Method String String.format(Locale, String, Object[])>
	//   22   46:invokestatic    #169 <Method int Log.w(String, String)>
	//   23   49:pop             
			}
	//   24   50:aload_3         
	//   25   51:monitorexit     
			return;
	//   26   52:return          
		}
		runningJobs.put(((Object) (job.getTag())), ((Object) (new JobCallback(job, ijobcallback))));
	//   27   53:aload_0         
	//   28   54:getfield        #64  <Field SimpleArrayMap runningJobs>
	//   29   57:aload_1         
	//   30   58:invokeinterface #92  <Method String JobParameters.getTag()>
	//   31   63:new             #12  <Class JobService$JobCallback>
	//   32   66:dup             
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:aconst_null     
	//   36   70:invokespecial   #172 <Method void JobService$JobCallback(JobParameters, IJobCallback, JobService$1)>
	//   37   73:invokevirtual   #176 <Method Object SimpleArrayMap.put(Object, Object)>
	//   38   76:pop             
		mainHandler.post(new Runnable() {

			public void run()
			{
				SimpleArrayMap simplearraymap1 = runningJobs;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field JobService this$0>
			//    2    4:invokestatic    #30  <Method SimpleArrayMap JobService.access$100(JobService)>
			//    3    7:astore_1        
				simplearraymap1;
			//    4    8:aload_1         
				JVM INSTR monitorenter ;
			//    5    9:monitorenter    
				JobCallback jobcallback;
				if(onStartJob(job))
					break MISSING_BLOCK_LABEL_56;
			//    6   10:aload_0         
			//    7   11:getfield        #19  <Field JobService this$0>
			//    8   14:aload_0         
			//    9   15:getfield        #21  <Field JobParameters val$job>
			//   10   18:invokevirtual   #34  <Method boolean JobService.onStartJob(JobParameters)>
			//   11   21:ifne            56
				jobcallback = (JobCallback)runningJobs.remove(((Object) (job.getTag())));
			//   12   24:aload_0         
			//   13   25:getfield        #19  <Field JobService this$0>
			//   14   28:invokestatic    #30  <Method SimpleArrayMap JobService.access$100(JobService)>
			//   15   31:aload_0         
			//   16   32:getfield        #21  <Field JobParameters val$job>
			//   17   35:invokeinterface #40  <Method String JobParameters.getTag()>
			//   18   40:invokevirtual   #46  <Method Object SimpleArrayMap.remove(Object)>
			//   19   43:checkcast       #48  <Class JobService$JobCallback>
			//   20   46:astore_2        
				if(jobcallback == null)
					break MISSING_BLOCK_LABEL_56;
			//   21   47:aload_2         
			//   22   48:ifnull          56
				jobcallback.sendResult(0);
			//   23   51:aload_2         
			//   24   52:iconst_0        
			//   25   53:invokevirtual   #52  <Method void JobService$JobCallback.sendResult(int)>
				simplearraymap1;
			//   26   56:aload_1         
				JVM INSTR monitorexit ;
			//   27   57:monitorexit     
				return;
			//   28   58:return          
				Exception exception;
				exception;
			//   29   59:astore_2        
				simplearraymap1;
			//   30   60:aload_1         
				JVM INSTR monitorexit ;
			//   31   61:monitorexit     
				throw exception;
			//   32   62:aload_2         
			//   33   63:athrow          
			}

			final JobService this$0;
			final JobParameters val$job;

			
			{
				this$0 = JobService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field JobService this$0>
				job = jobparameters;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field JobParameters val$job>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   39   77:getstatic       #54  <Field Handler mainHandler>
	//   40   80:new             #8   <Class JobService$2>
	//   41   83:dup             
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokespecial   #179 <Method void JobService$2(JobService, JobParameters)>
	//   45   89:invokevirtual   #183 <Method boolean Handler.post(Runnable)>
	//   46   92:pop             
		simplearraymap;
	//   47   93:aload_3         
		JVM INSTR monitorexit ;
	//   48   94:monitorexit     
		return;
	//   49   95:return          
		job;
	//   50   96:astore_1        
		simplearraymap;
	//   51   97:aload_3         
		JVM INSTR monitorexit ;
	//   52   98:monitorexit     
		throw job;
	//   53   99:aload_1         
	//   54  100:athrow          
	}

	void stop(final JobParameters job, final boolean needToSendResult)
	{
		SimpleArrayMap simplearraymap = runningJobs;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field SimpleArrayMap runningJobs>
	//    2    4:astore_3        
		simplearraymap;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		final JobCallback jobCallback = (JobCallback)runningJobs.remove(((Object) (job.getTag())));
	//    5    7:aload_0         
	//    6    8:getfield        #64  <Field SimpleArrayMap runningJobs>
	//    7   11:aload_1         
	//    8   12:invokeinterface #92  <Method String JobParameters.getTag()>
	//    9   17:invokevirtual   #96  <Method Object SimpleArrayMap.remove(Object)>
	//   10   20:checkcast       #12  <Class JobService$JobCallback>
	//   11   23:astore          4
		if(jobCallback != null)
			break MISSING_BLOCK_LABEL_50;
	//   12   25:aload           4
	//   13   27:ifnonnull       50
		if(Log.isLoggable("FJD.JobService", 3))
	//*  14   30:ldc1            #31  <String "FJD.JobService">
	//*  15   32:iconst_3        
	//*  16   33:invokestatic    #188 <Method boolean Log.isLoggable(String, int)>
	//*  17   36:ifeq            47
			Log.d("FJD.JobService", "Provided job has already been executed.");
	//   18   39:ldc1            #31  <String "FJD.JobService">
	//   19   41:ldc1            #190 <String "Provided job has already been executed.">
	//   20   43:invokestatic    #193 <Method int Log.d(String, String)>
	//   21   46:pop             
		simplearraymap;
	//   22   47:aload_3         
		JVM INSTR monitorexit ;
	//   23   48:monitorexit     
		return;
	//   24   49:return          
		mainHandler.post(new Runnable() {

			public void run()
			{
				throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
			//    0    0:new             #36  <Class RuntimeException>
			//    1    3:dup             
			//    2    4:ldc1            #38  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
			//    3    6:invokespecial   #43  <Method void Runtime(String)>
			//    4    9:athrow          
			}

			final JobService this$0;
			final JobParameters val$job;
			final JobCallback val$jobCallback;
			final boolean val$needToSendResult;

			
			{
				this$0 = JobService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field JobService this$0>
				job = jobparameters;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field JobParameters val$job>
				needToSendResult = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field boolean val$needToSendResult>
				jobCallback = jobcallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field JobService$JobCallback val$jobCallback>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   25   50:getstatic       #54  <Field Handler mainHandler>
	//   26   53:new             #10  <Class JobService$3>
	//   27   56:dup             
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:iload_2         
	//   31   60:aload           4
	//   32   62:invokespecial   #196 <Method void JobService$3(JobService, JobParameters, boolean, JobService$JobCallback)>
	//   33   65:invokevirtual   #183 <Method boolean Handler.post(Runnable)>
	//   34   68:pop             
		simplearraymap;
	//   35   69:aload_3         
		JVM INSTR monitorexit ;
	//   36   70:monitorexit     
		return;
	//   37   71:return          
		job;
	//   38   72:astore_1        
		simplearraymap;
	//   39   73:aload_3         
		JVM INSTR monitorexit ;
	//   40   74:monitorexit     
		throw job;
	//   41   75:aload_1         
	//   42   76:athrow          
	}

	static final String ACTION_EXECUTE = "com.firebase.jobdispatcher.ACTION_EXECUTE";
	public static final int RESULT_FAIL_NORETRY = 2;
	public static final int RESULT_FAIL_RETRY = 1;
	public static final int RESULT_SUCCESS = 0;
	static final String TAG = "FJD.JobService";
	private static final Handler mainHandler = new Handler(Looper.getMainLooper());
	private final IRemoteJobService.Stub binder = new IRemoteJobService.Stub() {

		public void start(Bundle bundle, IJobCallback ijobcallback)
		{
			bundle = ((Bundle) (GooglePlayReceiver.getJobCoder().decode(bundle)));
		//    0    0:invokestatic    #24  <Method JobCoder GooglePlayReceiver.getJobCoder()>
		//    1    3:aload_1         
		//    2    4:invokevirtual   #30  <Method JobInvocation$Builder JobCoder.decode(Bundle)>
		//    3    7:astore_1        
			if(bundle == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       21
			{
				Log.wtf("FJD.JobService", "start: unknown invocation provided");
		//    6   12:ldc1            #32  <String "FJD.JobService">
		//    7   14:ldc1            #34  <String "start: unknown invocation provided">
		//    8   16:invokestatic    #40  <Method int Log.wtf(String, String)>
		//    9   19:pop             
				return;
		//   10   20:return          
			} else
			{
				JobService.this.start(((JobParameters) (((JobInvocation.Builder) (bundle)).build())), ijobcallback);
		//   11   21:aload_0         
		//   12   22:getfield        #12  <Field JobService this$0>
		//   13   25:aload_1         
		//   14   26:invokevirtual   #46  <Method JobInvocation JobInvocation$Builder.build()>
		//   15   29:aload_2         
		//   16   30:invokevirtual   #49  <Method void JobService.start(JobParameters, IJobCallback)>
				return;
		//   17   33:return          
			}
		}

		public void stop(Bundle bundle, boolean flag)
		{
			bundle = ((Bundle) (GooglePlayReceiver.getJobCoder().decode(bundle)));
		//    0    0:invokestatic    #24  <Method JobCoder GooglePlayReceiver.getJobCoder()>
		//    1    3:aload_1         
		//    2    4:invokevirtual   #30  <Method JobInvocation$Builder JobCoder.decode(Bundle)>
		//    3    7:astore_1        
			if(bundle == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       21
			{
				Log.wtf("FJD.JobService", "stop: unknown invocation provided");
		//    6   12:ldc1            #32  <String "FJD.JobService">
		//    7   14:ldc1            #53  <String "stop: unknown invocation provided">
		//    8   16:invokestatic    #40  <Method int Log.wtf(String, String)>
		//    9   19:pop             
				return;
		//   10   20:return          
			} else
			{
				JobService.this.stop(((JobParameters) (((JobInvocation.Builder) (bundle)).build())), flag);
		//   11   21:aload_0         
		//   12   22:getfield        #12  <Field JobService this$0>
		//   13   25:aload_1         
		//   14   26:invokevirtual   #46  <Method JobInvocation JobInvocation$Builder.build()>
		//   15   29:iload_2         
		//   16   30:invokevirtual   #56  <Method void JobService.stop(JobParameters, boolean)>
				return;
		//   17   33:return          
			}
		}

		final JobService this$0;

			
			{
				this$0 = JobService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field JobService this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void IRemoteJobService$Stub()>
			//    5    9:return          
			}
	}
;
	private final SimpleArrayMap runningJobs = new SimpleArrayMap(1);

	static 
	{
	//    0    0:new             #42  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #48  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #52  <Method void Handler(Looper)>
	//    4   10:putstatic       #54  <Field Handler mainHandler>
	//*   5   13:return          
	}


/*
	static SimpleArrayMap access$100(JobService jobservice)
	{
		return jobservice.runningJobs;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field SimpleArrayMap runningJobs>
	//    2    4:areturn         
	}

*/
}
