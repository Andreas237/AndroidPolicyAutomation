// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

final class JobIntentService$JobServiceEngineImpl$WrapperWorkItem
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

	JobIntentService$JobServiceEngineImpl$WrapperWorkItem(JobWorkItem jobworkitem)
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
