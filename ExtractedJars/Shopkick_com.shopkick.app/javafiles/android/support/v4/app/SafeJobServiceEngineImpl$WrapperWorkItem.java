// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

// Referenced classes of package android.support.v4.app:
//			SafeJobServiceEngineImpl

final class SafeJobServiceEngineImpl$WrapperWorkItem
	implements JobIntentService.GenericWorkItem
{

	public void complete()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SafeJobServiceEngineImpl this$0>
	//    2    4:getfield        #30  <Field Object SafeJobServiceEngineImpl.mLock>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		JobParameters jobparameters = mParams;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field SafeJobServiceEngineImpl this$0>
	//    8   14:getfield        #34  <Field JobParameters SafeJobServiceEngineImpl.mParams>
	//    9   17:astore_2        
		if(jobparameters == null)
			break MISSING_BLOCK_LABEL_44;
	//   10   18:aload_2         
	//   11   19:ifnull          44
		mParams.completeWork(mJobWork);
	//   12   22:aload_0         
	//   13   23:getfield        #17  <Field SafeJobServiceEngineImpl this$0>
	//   14   26:getfield        #34  <Field JobParameters SafeJobServiceEngineImpl.mParams>
	//   15   29:aload_0         
	//   16   30:getfield        #22  <Field JobWorkItem mJobWork>
	//   17   33:invokevirtual   #40  <Method void JobParameters.completeWork(JobWorkItem)>
		break MISSING_BLOCK_LABEL_44;
	//   18   36:goto            44
		Object obj1;
		obj1;
	//   19   39:astore_2        
		((SecurityException) (obj1)).printStackTrace();
	//   20   40:aload_2         
	//   21   41:invokevirtual   #43  <Method void SecurityException.printStackTrace()>
		obj;
	//   22   44:aload_1         
		JVM INSTR monitorexit ;
	//   23   45:monitorexit     
		return;
	//   24   46:return          
		obj1;
	//   25   47:astore_2        
		obj;
	//   26   48:aload_1         
		JVM INSTR monitorexit ;
	//   27   49:monitorexit     
		throw obj1;
	//   28   50:aload_2         
	//   29   51:athrow          
	}

	public Intent getIntent()
	{
		return mJobWork.getIntent();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field JobWorkItem mJobWork>
	//    2    4:invokevirtual   #49  <Method Intent JobWorkItem.getIntent()>
	//    3    7:areturn         
	}

	final JobWorkItem mJobWork;
	final SafeJobServiceEngineImpl this$0;

	SafeJobServiceEngineImpl$WrapperWorkItem(JobWorkItem jobworkitem)
	{
		this$0 = SafeJobServiceEngineImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SafeJobServiceEngineImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		mJobWork = jobworkitem;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field JobWorkItem mJobWork>
	//    8   14:return          
	}
}
