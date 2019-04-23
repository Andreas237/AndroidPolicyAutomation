// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.job.*;
import android.content.Intent;
import android.os.IBinder;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

public class SafeJobServiceEngineImpl extends JobServiceEngine
	implements JobIntentService.CompatJobEngine
{
	final class WrapperWorkItem
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

		WrapperWorkItem(JobWorkItem jobworkitem)
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


	SafeJobServiceEngineImpl(JobIntentService jobintentservice)
	{
		super(((android.app.Service) (jobintentservice)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void JobServiceEngine(android.app.Service)>
	//    3    5:aload_0         
	//    4    6:new             #32  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #35  <Method void Object()>
	//    7   13:putfield        #37  <Field Object mLock>
		mService = jobintentservice;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #39  <Field JobIntentService mService>
	//   11   21:return          
	}

	public IBinder compatGetBinder()
	{
		return getBinder();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method IBinder getBinder()>
	//    2    4:areturn         
	}

	public JobIntentService.GenericWorkItem dequeueWork()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mParams != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field JobParameters mParams>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		Object obj;
		try
		{
			obj = ((Object) (mParams.dequeueWork()));
	//   12   18:aload_0         
	//   13   19:getfield        #51  <Field JobParameters mParams>
	//   14   22:invokevirtual   #56  <Method JobWorkItem JobParameters.dequeueWork()>
	//   15   25:astore_1        
			break MISSING_BLOCK_LABEL_36;
	//   16   26:goto            36
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   17   29:astore_1        
		((SecurityException) (obj)).printStackTrace();
	//   18   30:aload_1         
	//   19   31:invokevirtual   #59  <Method void SecurityException.printStackTrace()>
		obj = null;
	//   20   34:aconst_null     
	//   21   35:astore_1        
		obj1;
	//   22   36:aload_2         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		if(obj != null)
	//*  24   38:aload_1         
	//*  25   39:ifnull          66
		{
			((JobWorkItem) (obj)).getIntent().setExtrasClassLoader(mService.getClassLoader());
	//   26   42:aload_1         
	//   27   43:invokevirtual   #65  <Method Intent JobWorkItem.getIntent()>
	//   28   46:aload_0         
	//   29   47:getfield        #39  <Field JobIntentService mService>
	//   30   50:invokevirtual   #71  <Method ClassLoader JobIntentService.getClassLoader()>
	//   31   53:invokevirtual   #77  <Method void Intent.setExtrasClassLoader(ClassLoader)>
			return ((JobIntentService.GenericWorkItem) (new WrapperWorkItem(((JobWorkItem) (obj)))));
	//   32   56:new             #8   <Class SafeJobServiceEngineImpl$WrapperWorkItem>
	//   33   59:dup             
	//   34   60:aload_0         
	//   35   61:aload_1         
	//   36   62:invokespecial   #80  <Method void SafeJobServiceEngineImpl$WrapperWorkItem(SafeJobServiceEngineImpl, JobWorkItem)>
	//   37   65:areturn         
		} else
		{
			return null;
	//   38   66:aconst_null     
	//   39   67:areturn         
		}
		exception;
	//   40   68:astore_1        
		obj1;
	//   41   69:aload_2         
		JVM INSTR monitorexit ;
	//   42   70:monitorexit     
		throw exception;
	//   43   71:aload_1         
	//   44   72:athrow          
	}

	public boolean onStartJob(JobParameters jobparameters)
	{
		mParams = jobparameters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field JobParameters mParams>
		mService.ensureProcessorRunningLocked(false);
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field JobIntentService mService>
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #86  <Method void JobIntentService.ensureProcessorRunningLocked(boolean)>
		return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
	}

	public boolean onStopJob(JobParameters jobparameters)
	{
		boolean flag = mService.doStopCurrentWork();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JobIntentService mService>
	//    2    4:invokevirtual   #91  <Method boolean JobIntentService.doStopCurrentWork()>
	//    3    7:istore_2        
		synchronized(mLock)
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field Object mLock>
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
}
