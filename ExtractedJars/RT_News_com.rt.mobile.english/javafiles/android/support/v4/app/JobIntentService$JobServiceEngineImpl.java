// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.job.*;
import android.content.Intent;
import android.os.IBinder;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

static final class JobIntentService$JobServiceEngineImpl extends JobServiceEngine
	implements JobIntentService.CompatJobEngine
{
	final class WrapperWorkItem
		implements JobIntentService.GenericWorkItem
	{

		public void complete()
		{
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field JobIntentService$JobServiceEngineImpl this$0>
		//*   2    4:getfield        #31  <Field Object JobIntentService$JobServiceEngineImpl.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				if(mParams != null)
		//*   6   10:aload_0         
		//*   7   11:getfield        #20  <Field JobIntentService$JobServiceEngineImpl this$0>
		//*   8   14:getfield        #35  <Field JobParameters JobIntentService$JobServiceEngineImpl.mParams>
		//*   9   17:ifnull          34
					mParams.completeWork(mJobWork);
		//   10   20:aload_0         
		//   11   21:getfield        #20  <Field JobIntentService$JobServiceEngineImpl this$0>
		//   12   24:getfield        #35  <Field JobParameters JobIntentService$JobServiceEngineImpl.mParams>
		//   13   27:aload_0         
		//   14   28:getfield        #25  <Field JobWorkItem mJobWork>
		//   15   31:invokevirtual   #41  <Method void JobParameters.completeWork(JobWorkItem)>
			}
		//   16   34:aload_1         
		//   17   35:monitorexit     
			return;
		//   18   36:return          
			exception;
		//   19   37:astore_2        
			obj;
		//   20   38:aload_1         
			JVM INSTR monitorexit ;
		//   21   39:monitorexit     
			throw exception;
		//   22   40:aload_2         
		//   23   41:athrow          
		}

		public Intent getIntent()
		{
			return mJobWork.getIntent();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field JobWorkItem mJobWork>
		//    2    4:invokevirtual   #47  <Method Intent JobWorkItem.getIntent()>
		//    3    7:areturn         
		}

		final JobWorkItem mJobWork;
		final JobIntentService.JobServiceEngineImpl this$0;

		WrapperWorkItem(JobWorkItem jobworkitem)
		{
			this$0 = JobIntentService.JobServiceEngineImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field JobIntentService$JobServiceEngineImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			mJobWork = jobworkitem;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field JobWorkItem mJobWork>
		//    8   14:return          
		}
	}


	public IBinder compatGetBinder()
	{
		return getBinder();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method IBinder getBinder()>
	//    2    4:areturn         
	}

	public JobIntentService.GenericWorkItem dequeueWork()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(mParams != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field JobParameters mParams>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		JobWorkItem jobworkitem = mParams.dequeueWork();
	//   12   18:aload_0         
	//   13   19:getfield        #51  <Field JobParameters mParams>
	//   14   22:invokevirtual   #56  <Method JobWorkItem JobParameters.dequeueWork()>
	//   15   25:astore_2        
		obj;
	//   16   26:aload_1         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		if(jobworkitem != null)
	//*  18   28:aload_2         
	//*  19   29:ifnull          56
		{
			jobworkitem.getIntent().setExtrasClassLoader(mService.getClassLoader());
	//   20   32:aload_2         
	//   21   33:invokevirtual   #62  <Method Intent JobWorkItem.getIntent()>
	//   22   36:aload_0         
	//   23   37:getfield        #41  <Field JobIntentService mService>
	//   24   40:invokevirtual   #66  <Method ClassLoader JobIntentService.getClassLoader()>
	//   25   43:invokevirtual   #72  <Method void Intent.setExtrasClassLoader(ClassLoader)>
			return ((JobIntentService.GenericWorkItem) (new WrapperWorkItem(jobworkitem)));
	//   26   46:new             #11  <Class JobIntentService$JobServiceEngineImpl$WrapperWorkItem>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:aload_2         
	//   30   52:invokespecial   #75  <Method void JobIntentService$JobServiceEngineImpl$WrapperWorkItem(JobIntentService$JobServiceEngineImpl, JobWorkItem)>
	//   31   55:areturn         
		} else
		{
			return null;
	//   32   56:aconst_null     
	//   33   57:areturn         
		}
		exception;
	//   34   58:astore_2        
		obj;
	//   35   59:aload_1         
		JVM INSTR monitorexit ;
	//   36   60:monitorexit     
		throw exception;
	//   37   61:aload_2         
	//   38   62:athrow          
	}

	public boolean onStartJob(JobParameters jobparameters)
	{
		mParams = jobparameters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field JobParameters mParams>
		mService.ensureProcessorRunningLocked(false);
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field JobIntentService mService>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #81  <Method void JobIntentService.ensureProcessorRunningLocked(boolean)>
		return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
	}

	public boolean onStopJob(JobParameters jobparameters)
	{
		boolean flag = mService.doStopCurrentWork();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field JobIntentService mService>
	//    2    4:invokevirtual   #86  <Method boolean JobIntentService.doStopCurrentWork()>
	//    3    7:istore_2        
		synchronized(mLock)
	//*   4    8:aload_0         
	//*   5    9:getfield        #39  <Field Object mLock>
	//*   6   12:astore_1        
	//*   7   13:aload_1         
	//*   8   14:monitorenter    
		{
			mParams = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #51  <Field JobParameters mParams>
		}
	//   12   20:aload_1         
	//   13   21:monitorexit     
		return flag;
	//   14   22:iload_2         
	//   15   23:ireturn         
		exception;
	//   16   24:astore_3        
		jobparameters;
	//   17   25:aload_1         
		JVM INSTR monitorexit ;
	//   18   26:monitorexit     
		throw exception;
	//   19   27:aload_3         
	//   20   28:athrow          
	}

	static final boolean DEBUG = false;
	static final String TAG = "JobServiceEngineImpl";
	final Object mLock = new Object();
	JobParameters mParams;
	final JobIntentService mService;

	JobIntentService$JobServiceEngineImpl(JobIntentService jobintentservice)
	{
		super(((android.app.Service) (jobintentservice)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void JobServiceEngine(android.app.Service)>
	//    3    5:aload_0         
	//    4    6:new             #34  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #37  <Method void Object()>
	//    7   13:putfield        #39  <Field Object mLock>
		mService = jobintentservice;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #41  <Field JobIntentService mService>
	//   11   21:return          
	}
}
