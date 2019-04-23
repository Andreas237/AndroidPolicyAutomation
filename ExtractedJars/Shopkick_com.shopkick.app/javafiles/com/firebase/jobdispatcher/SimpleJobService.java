// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.AsyncTask;
import android.support.v4.util.SimpleArrayMap;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobService, JobParameters

public abstract class SimpleJobService extends JobService
{
	private static class AsyncJobTask extends AsyncTask
	{

		protected transient Integer doInBackground(Void avoid[])
		{
			return Integer.valueOf(jobService.onRunJob(jobParameters));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field SimpleJobService jobService>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field JobParameters jobParameters>
		//    4    8:invokevirtual   #31  <Method int SimpleJobService.onRunJob(JobParameters)>
		//    5   11:invokestatic    #37  <Method Integer Integer.valueOf(int)>
		//    6   14:areturn         
		}

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #40  <Class Void[]>
		//    3    5:invokevirtual   #42  <Method Integer doInBackground(Void[])>
		//    4    8:areturn         
		}

		protected void onPostExecute(Integer integer)
		{
			SimpleJobService simplejobservice = jobService;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field SimpleJobService jobService>
		//    2    4:astore          4
			JobParameters jobparameters = jobParameters;
		//    3    6:aload_0         
		//    4    7:getfield        #21  <Field JobParameters jobParameters>
		//    5   10:astore          5
			int i = integer.intValue();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #48  <Method int Integer.intValue()>
		//    8   16:istore_2        
			boolean flag = true;
		//    9   17:iconst_1        
		//   10   18:istore_3        
			if(i != 1)
		//*  11   19:iload_2         
		//*  12   20:iconst_1        
		//*  13   21:icmpne          27
		//*  14   24:goto            29
				flag = false;
		//   15   27:iconst_0        
		//   16   28:istore_3        
			simplejobservice.onJobFinished(jobparameters, flag);
		//   17   29:aload           4
		//   18   31:aload           5
		//   19   33:iload_3         
		//   20   34:invokestatic    #52  <Method void SimpleJobService.access$100(SimpleJobService, JobParameters, boolean)>
		//   21   37:return          
		}

		protected volatile void onPostExecute(Object obj)
		{
			onPostExecute((Integer)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #33  <Class Integer>
		//    3    5:invokevirtual   #55  <Method void onPostExecute(Integer)>
		//    4    8:return          
		}

		private final JobParameters jobParameters;
		private final SimpleJobService jobService;

		private AsyncJobTask(SimpleJobService simplejobservice, JobParameters jobparameters)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void AsyncTask()>
			jobService = simplejobservice;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field SimpleJobService jobService>
			jobParameters = jobparameters;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field JobParameters jobParameters>
		//    8   14:return          
		}

	}


	public SimpleJobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void JobService()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class SimpleArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void SimpleArrayMap()>
	//    6   12:putfield        #21  <Field SimpleArrayMap runningJobs>
	//    7   15:return          
	}

	private void onJobFinished(JobParameters jobparameters, boolean flag)
	{
		synchronized(runningJobs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field SimpleArrayMap runningJobs>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			runningJobs.remove(((Object) (jobparameters)));
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field SimpleArrayMap runningJobs>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #32  <Method Object SimpleArrayMap.remove(Object)>
	//    9   15:pop             
		}
	//   10   16:aload_3         
	//   11   17:monitorexit     
		jobFinished(jobparameters, flag);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:invokevirtual   #35  <Method void jobFinished(JobParameters, boolean)>
		return;
	//   16   24:return          
		jobparameters;
	//   17   25:astore_1        
		simplearraymap;
	//   18   26:aload_3         
		JVM INSTR monitorexit ;
	//   19   27:monitorexit     
		throw jobparameters;
	//   20   28:aload_1         
	//   21   29:athrow          
	}

	public abstract int onRunJob(JobParameters jobparameters);

	public boolean onStartJob(JobParameters jobparameters)
	{
		AsyncJobTask asyncjobtask = new AsyncJobTask(this, jobparameters);
	//    0    0:new             #8   <Class SimpleJobService$AsyncJobTask>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #43  <Method void SimpleJobService$AsyncJobTask(SimpleJobService, JobParameters, SimpleJobService$1)>
	//    6   10:astore_3        
		synchronized(runningJobs)
	//*   7   11:aload_0         
	//*   8   12:getfield        #21  <Field SimpleArrayMap runningJobs>
	//*   9   15:astore_2        
	//*  10   16:aload_2         
	//*  11   17:monitorenter    
		{
			runningJobs.put(((Object) (jobparameters)), ((Object) (asyncjobtask)));
	//   12   18:aload_0         
	//   13   19:getfield        #21  <Field SimpleArrayMap runningJobs>
	//   14   22:aload_1         
	//   15   23:aload_3         
	//   16   24:invokevirtual   #47  <Method Object SimpleArrayMap.put(Object, Object)>
	//   17   27:pop             
		}
	//   18   28:aload_2         
	//   19   29:monitorexit     
		asyncjobtask.execute(((Object []) (new Void[0])));
	//   20   30:aload_3         
	//   21   31:iconst_0        
	//   22   32:anewarray       Void[]
	//   23   35:invokevirtual   #53  <Method AsyncTask SimpleJobService$AsyncJobTask.execute(Object[])>
	//   24   38:pop             
		return true;
	//   25   39:iconst_1        
	//   26   40:ireturn         
		jobparameters;
	//   27   41:astore_1        
		simplearraymap;
	//   28   42:aload_2         
		JVM INSTR monitorexit ;
	//   29   43:monitorexit     
		throw jobparameters;
	//   30   44:aload_1         
	//   31   45:athrow          
	}

	public boolean onStopJob(JobParameters jobparameters)
	{
		SimpleArrayMap simplearraymap = runningJobs;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SimpleArrayMap runningJobs>
	//    2    4:astore_2        
		simplearraymap;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		jobparameters = ((JobParameters) ((AsyncJobTask)runningJobs.remove(((Object) (jobparameters)))));
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field SimpleArrayMap runningJobs>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #32  <Method Object SimpleArrayMap.remove(Object)>
	//    9   15:checkcast       #8   <Class SimpleJobService$AsyncJobTask>
	//   10   18:astore_1        
		if(jobparameters == null)
			break MISSING_BLOCK_LABEL_33;
	//   11   19:aload_1         
	//   12   20:ifnull          33
		((AsyncJobTask) (jobparameters)).cancel(true);
	//   13   23:aload_1         
	//   14   24:iconst_1        
	//   15   25:invokevirtual   #59  <Method boolean SimpleJobService$AsyncJobTask.cancel(boolean)>
	//   16   28:pop             
		simplearraymap;
	//   17   29:aload_2         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return true;
	//   19   31:iconst_1        
	//   20   32:ireturn         
		simplearraymap;
	//   21   33:aload_2         
		JVM INSTR monitorexit ;
	//   22   34:monitorexit     
		return false;
	//   23   35:iconst_0        
	//   24   36:ireturn         
		jobparameters;
	//   25   37:astore_1        
		simplearraymap;
	//   26   38:aload_2         
		JVM INSTR monitorexit ;
	//   27   39:monitorexit     
		throw jobparameters;
	//   28   40:aload_1         
	//   29   41:athrow          
	}

	private final SimpleArrayMap runningJobs = new SimpleArrayMap();


/*
	static void access$100(SimpleJobService simplejobservice, JobParameters jobparameters, boolean flag)
	{
		simplejobservice.onJobFinished(jobparameters, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void onJobFinished(JobParameters, boolean)>
		return;
	//    4    6:return          
	}

*/
}
