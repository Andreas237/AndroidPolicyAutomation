// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Service;
import android.app.job.*;
import android.content.*;
import android.os.*;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service
{
	final class CommandProcessor extends AsyncTask
	{

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #22  <Class Void[]>
		//    3    5:invokevirtual   #25  <Method Void doInBackground(Void[])>
		//    4    8:areturn         
		}

		protected transient Void doInBackground(Void avoid[])
		{
			do
			{
				avoid = ((Void []) (dequeueWork()));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field JobIntentService this$0>
		//    2    4:invokevirtual   #29  <Method JobIntentService$GenericWorkItem JobIntentService.dequeueWork()>
		//    3    7:astore_1        
				if(avoid != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          34
				{
					onHandleWork(((GenericWorkItem) (avoid)).getIntent());
		//    6   12:aload_0         
		//    7   13:getfield        #14  <Field JobIntentService this$0>
		//    8   16:aload_1         
		//    9   17:invokeinterface #35  <Method Intent JobIntentService$GenericWorkItem.getIntent()>
		//   10   22:invokevirtual   #39  <Method void JobIntentService.onHandleWork(Intent)>
					((GenericWorkItem) (avoid)).complete();
		//   11   25:aload_1         
		//   12   26:invokeinterface #42  <Method void JobIntentService$GenericWorkItem.complete()>
				} else
		//*  13   31:goto            0
				{
					return null;
		//   14   34:aconst_null     
		//   15   35:areturn         
				}
			} while(true);
		}

		protected volatile void onCancelled(Object obj)
		{
			onCancelled((Void)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #46  <Class Void>
		//    3    5:invokevirtual   #49  <Method void onCancelled(Void)>
		//    4    8:return          
		}

		protected void onCancelled(Void void1)
		{
			processorFinished();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field JobIntentService this$0>
		//    2    4:invokevirtual   #52  <Method void JobIntentService.processorFinished()>
		//    3    7:return          
		}

		protected volatile void onPostExecute(Object obj)
		{
			onPostExecute((Void)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #46  <Class Void>
		//    3    5:invokevirtual   #55  <Method void onPostExecute(Void)>
		//    4    8:return          
		}

		protected void onPostExecute(Void void1)
		{
			processorFinished();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field JobIntentService this$0>
		//    2    4:invokevirtual   #52  <Method void JobIntentService.processorFinished()>
		//    3    7:return          
		}

		final JobIntentService this$0;

		CommandProcessor()
		{
			this$0 = JobIntentService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field JobIntentService this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void AsyncTask()>
		//    5    9:return          
		}
	}

	static interface CompatJobEngine
	{

		public abstract IBinder compatGetBinder();

		public abstract GenericWorkItem dequeueWork();
	}

	static final class CompatWorkEnqueuer extends WorkEnqueuer
	{

		void enqueueWork(Intent intent)
		{
			intent = new Intent(intent);
		//    0    0:new             #76  <Class Intent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #78  <Method void Intent(Intent)>
		//    4    8:astore_1        
			intent.setComponent(mComponentName);
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #82  <Field ComponentName mComponentName>
		//    8   14:invokevirtual   #86  <Method Intent Intent.setComponent(ComponentName)>
		//    9   17:pop             
			if(mContext.startService(intent) == null)
				break MISSING_BLOCK_LABEL_68;
		//   10   18:aload_0         
		//   11   19:getfield        #27  <Field Context mContext>
		//   12   22:aload_1         
		//   13   23:invokevirtual   #90  <Method ComponentName Context.startService(Intent)>
		//   14   26:ifnull          68
			this;
		//   15   29:aload_0         
			JVM INSTR monitorenter ;
		//   16   30:monitorenter    
			if(!mLaunchingService)
		//*  17   31:aload_0         
		//*  18   32:getfield        #92  <Field boolean mLaunchingService>
		//*  19   35:ifne            60
			{
				mLaunchingService = true;
		//   20   38:aload_0         
		//   21   39:iconst_1        
		//   22   40:putfield        #92  <Field boolean mLaunchingService>
				if(!mServiceProcessing)
		//*  23   43:aload_0         
		//*  24   44:getfield        #94  <Field boolean mServiceProcessing>
		//*  25   47:ifne            60
					mLaunchWakeLock.acquire(60000L);
		//   26   50:aload_0         
		//   27   51:getfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
		//   28   54:ldc2w           #95  <Long 60000L>
		//   29   57:invokevirtual   #100 <Method void android.os.PowerManager$WakeLock.acquire(long)>
			}
			this;
		//   30   60:aload_0         
			JVM INSTR monitorexit ;
		//   31   61:monitorexit     
			return;
		//   32   62:return          
			intent;
		//   33   63:astore_1        
			this;
		//   34   64:aload_0         
			JVM INSTR monitorexit ;
		//   35   65:monitorexit     
			throw intent;
		//   36   66:aload_1         
		//   37   67:athrow          
		//   38   68:return          
		}

		public void serviceProcessingFinished()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(mServiceProcessing)
		//*   2    2:aload_0         
		//*   3    3:getfield        #94  <Field boolean mServiceProcessing>
		//*   4    6:ifeq            38
			{
				if(mLaunchingService)
		//*   5    9:aload_0         
		//*   6   10:getfield        #92  <Field boolean mLaunchingService>
		//*   7   13:ifeq            26
					mLaunchWakeLock.acquire(60000L);
		//    8   16:aload_0         
		//    9   17:getfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
		//   10   20:ldc2w           #95  <Long 60000L>
		//   11   23:invokevirtual   #100 <Method void android.os.PowerManager$WakeLock.acquire(long)>
				mServiceProcessing = false;
		//   12   26:aload_0         
		//   13   27:iconst_0        
		//   14   28:putfield        #94  <Field boolean mServiceProcessing>
				mRunWakeLock.release();
		//   15   31:aload_0         
		//   16   32:getfield        #71  <Field android.os.PowerManager$WakeLock mRunWakeLock>
		//   17   35:invokevirtual   #104 <Method void android.os.PowerManager$WakeLock.release()>
			}
			this;
		//   18   38:aload_0         
			JVM INSTR monitorexit ;
		//   19   39:monitorexit     
			return;
		//   20   40:return          
			Exception exception;
			exception;
		//   21   41:astore_1        
			this;
		//   22   42:aload_0         
			JVM INSTR monitorexit ;
		//   23   43:monitorexit     
			throw exception;
		//   24   44:aload_1         
		//   25   45:athrow          
		}

		public void serviceProcessingStarted()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(!mServiceProcessing)
		//*   2    2:aload_0         
		//*   3    3:getfield        #94  <Field boolean mServiceProcessing>
		//*   4    6:ifne            31
			{
				mServiceProcessing = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #94  <Field boolean mServiceProcessing>
				mRunWakeLock.acquire(0x927c0L);
		//    8   14:aload_0         
		//    9   15:getfield        #71  <Field android.os.PowerManager$WakeLock mRunWakeLock>
		//   10   18:ldc2w           #106 <Long 0x927c0L>
		//   11   21:invokevirtual   #100 <Method void android.os.PowerManager$WakeLock.acquire(long)>
				mLaunchWakeLock.release();
		//   12   24:aload_0         
		//   13   25:getfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
		//   14   28:invokevirtual   #104 <Method void android.os.PowerManager$WakeLock.release()>
			}
			this;
		//   15   31:aload_0         
			JVM INSTR monitorexit ;
		//   16   32:monitorexit     
			return;
		//   17   33:return          
			Exception exception;
			exception;
		//   18   34:astore_1        
			this;
		//   19   35:aload_0         
			JVM INSTR monitorexit ;
		//   20   36:monitorexit     
			throw exception;
		//   21   37:aload_1         
		//   22   38:athrow          
		}

		public void serviceStartReceived()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			mLaunchingService = false;
		//    2    2:aload_0         
		//    3    3:iconst_0        
		//    4    4:putfield        #92  <Field boolean mLaunchingService>
			this;
		//    5    7:aload_0         
			JVM INSTR monitorexit ;
		//    6    8:monitorexit     
			return;
		//    7    9:return          
			Exception exception;
			exception;
		//    8   10:astore_1        
			this;
		//    9   11:aload_0         
			JVM INSTR monitorexit ;
		//   10   12:monitorexit     
			throw exception;
		//   11   13:aload_1         
		//   12   14:athrow          
		}

		private final Context mContext;
		private final android.os.PowerManager.WakeLock mLaunchWakeLock;
		boolean mLaunchingService;
		private final android.os.PowerManager.WakeLock mRunWakeLock;
		boolean mServiceProcessing;

		CompatWorkEnqueuer(Context context, ComponentName componentname)
		{
			super(context, componentname);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void JobIntentService$WorkEnqueuer(Context, ComponentName)>
			mContext = context.getApplicationContext();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #25  <Method Context Context.getApplicationContext()>
		//    7   11:putfield        #27  <Field Context mContext>
			context = ((Context) ((PowerManager)context.getSystemService("power")));
		//    8   14:aload_1         
		//    9   15:ldc1            #29  <String "power">
		//   10   17:invokevirtual   #33  <Method Object Context.getSystemService(String)>
		//   11   20:checkcast       #35  <Class PowerManager>
		//   12   23:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
		//   13   24:new             #37  <Class StringBuilder>
		//   14   27:dup             
		//   15   28:invokespecial   #40  <Method void StringBuilder()>
		//   16   31:astore_3        
			stringbuilder.append(componentname.getClassName());
		//   17   32:aload_3         
		//   18   33:aload_2         
		//   19   34:invokevirtual   #46  <Method String ComponentName.getClassName()>
		//   20   37:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   21   40:pop             
			stringbuilder.append(":launch");
		//   22   41:aload_3         
		//   23   42:ldc1            #52  <String ":launch">
		//   24   44:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   25   47:pop             
			mLaunchWakeLock = ((PowerManager) (context)).newWakeLock(1, stringbuilder.toString());
		//   26   48:aload_0         
		//   27   49:aload_1         
		//   28   50:iconst_1        
		//   29   51:aload_3         
		//   30   52:invokevirtual   #55  <Method String StringBuilder.toString()>
		//   31   55:invokevirtual   #59  <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
		//   32   58:putfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
			mLaunchWakeLock.setReferenceCounted(false);
		//   33   61:aload_0         
		//   34   62:getfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
		//   35   65:iconst_0        
		//   36   66:invokevirtual   #67  <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
			stringbuilder = new StringBuilder();
		//   37   69:new             #37  <Class StringBuilder>
		//   38   72:dup             
		//   39   73:invokespecial   #40  <Method void StringBuilder()>
		//   40   76:astore_3        
			stringbuilder.append(componentname.getClassName());
		//   41   77:aload_3         
		//   42   78:aload_2         
		//   43   79:invokevirtual   #46  <Method String ComponentName.getClassName()>
		//   44   82:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   45   85:pop             
			stringbuilder.append(":run");
		//   46   86:aload_3         
		//   47   87:ldc1            #69  <String ":run">
		//   48   89:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   49   92:pop             
			mRunWakeLock = ((PowerManager) (context)).newWakeLock(1, stringbuilder.toString());
		//   50   93:aload_0         
		//   51   94:aload_1         
		//   52   95:iconst_1        
		//   53   96:aload_3         
		//   54   97:invokevirtual   #55  <Method String StringBuilder.toString()>
		//   55  100:invokevirtual   #59  <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
		//   56  103:putfield        #71  <Field android.os.PowerManager$WakeLock mRunWakeLock>
			mRunWakeLock.setReferenceCounted(false);
		//   57  106:aload_0         
		//   58  107:getfield        #71  <Field android.os.PowerManager$WakeLock mRunWakeLock>
		//   59  110:iconst_0        
		//   60  111:invokevirtual   #67  <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
		//   61  114:return          
		}
	}

	final class CompatWorkItem
		implements GenericWorkItem
	{

		public void complete()
		{
			stopSelf(mStartId);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field JobIntentService this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field int mStartId>
		//    4    8:invokevirtual   #32  <Method void JobIntentService.stopSelf(int)>
		//    5   11:return          
		}

		public Intent getIntent()
		{
			return mIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Intent mIntent>
		//    2    4:areturn         
		}

		final Intent mIntent;
		final int mStartId;
		final JobIntentService this$0;

		CompatWorkItem(Intent intent, int i)
		{
			this$0 = JobIntentService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field JobIntentService this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mIntent = intent;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Intent mIntent>
			mStartId = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field int mStartId>
		//   11   19:return          
		}
	}

	static interface GenericWorkItem
	{

		public abstract void complete();

		public abstract Intent getIntent();
	}

	static final class JobServiceEngineImpl extends JobServiceEngine
		implements CompatJobEngine
	{

		public IBinder compatGetBinder()
		{
			return getBinder();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #47  <Method IBinder getBinder()>
		//    2    4:areturn         
		}

		public GenericWorkItem dequeueWork()
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
				return ((GenericWorkItem) (new WrapperWorkItem(jobworkitem)));
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

		JobServiceEngineImpl(JobIntentService jobintentservice)
		{
			super(((Service) (jobintentservice)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #32  <Method void JobServiceEngine(Service)>
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

	final class JobServiceEngineImpl.WrapperWorkItem
		implements GenericWorkItem
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
		final JobServiceEngineImpl this$0;

		JobServiceEngineImpl.WrapperWorkItem(JobWorkItem jobworkitem)
		{
			this$0 = JobServiceEngineImpl.this;
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

	static final class JobWorkEnqueuer extends WorkEnqueuer
	{

		void enqueueWork(Intent intent)
		{
			mJobScheduler.enqueue(mJobInfo, new JobWorkItem(intent));
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field JobScheduler mJobScheduler>
		//    2    4:aload_0         
		//    3    5:getfield        #42  <Field JobInfo mJobInfo>
		//    4    8:new             #63  <Class JobWorkItem>
		//    5   11:dup             
		//    6   12:aload_1         
		//    7   13:invokespecial   #65  <Method void JobWorkItem(Intent)>
		//    8   16:invokevirtual   #69  <Method int JobScheduler.enqueue(JobInfo, JobWorkItem)>
		//    9   19:pop             
		//   10   20:return          
		}

		private final JobInfo mJobInfo;
		private final JobScheduler mJobScheduler;

		JobWorkEnqueuer(Context context, ComponentName componentname, int i)
		{
			super(context, componentname);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void JobIntentService$WorkEnqueuer(Context, ComponentName)>
			ensureJobId(i);
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:invokevirtual   #23  <Method void ensureJobId(int)>
			mJobInfo = (new android.app.job.JobInfo.Builder(i, mComponentName)).setOverrideDeadline(0L).build();
		//    7   11:aload_0         
		//    8   12:new             #25  <Class android.app.job.JobInfo$Builder>
		//    9   15:dup             
		//   10   16:iload_3         
		//   11   17:aload_0         
		//   12   18:getfield        #29  <Field ComponentName mComponentName>
		//   13   21:invokespecial   #32  <Method void android.app.job.JobInfo$Builder(int, ComponentName)>
		//   14   24:lconst_0        
		//   15   25:invokevirtual   #36  <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setOverrideDeadline(long)>
		//   16   28:invokevirtual   #40  <Method JobInfo android.app.job.JobInfo$Builder.build()>
		//   17   31:putfield        #42  <Field JobInfo mJobInfo>
			mJobScheduler = (JobScheduler)context.getApplicationContext().getSystemService("jobscheduler");
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #48  <Method Context Context.getApplicationContext()>
		//   21   39:ldc1            #50  <String "jobscheduler">
		//   22   41:invokevirtual   #54  <Method Object Context.getSystemService(String)>
		//   23   44:checkcast       #56  <Class JobScheduler>
		//   24   47:putfield        #58  <Field JobScheduler mJobScheduler>
		//   25   50:return          
		}
	}

	static abstract class WorkEnqueuer
	{

		abstract void enqueueWork(Intent intent);

		void ensureJobId(int i)
		{
			if(!mHasJobId)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean mHasJobId>
		//*   2    4:ifne            18
			{
				mHasJobId = true;
		//    3    7:aload_0         
		//    4    8:iconst_1        
		//    5    9:putfield        #27  <Field boolean mHasJobId>
				mJobId = i;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:putfield        #29  <Field int mJobId>
				return;
		//    9   17:return          
			}
			if(mJobId != i)
		//*  10   18:aload_0         
		//*  11   19:getfield        #29  <Field int mJobId>
		//*  12   22:iload_1         
		//*  13   23:icmpeq          75
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   14   26:new             #31  <Class StringBuilder>
		//   15   29:dup             
		//   16   30:invokespecial   #32  <Method void StringBuilder()>
		//   17   33:astore_2        
				stringbuilder.append("Given job ID ");
		//   18   34:aload_2         
		//   19   35:ldc1            #34  <String "Given job ID ">
		//   20   37:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   21   40:pop             
				stringbuilder.append(i);
		//   22   41:aload_2         
		//   23   42:iload_1         
		//   24   43:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   25   46:pop             
				stringbuilder.append(" is different than previous ");
		//   26   47:aload_2         
		//   27   48:ldc1            #43  <String " is different than previous ">
		//   28   50:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   29   53:pop             
				stringbuilder.append(mJobId);
		//   30   54:aload_2         
		//   31   55:aload_0         
		//   32   56:getfield        #29  <Field int mJobId>
		//   33   59:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   34   62:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
		//   35   63:new             #45  <Class IllegalArgumentException>
		//   36   66:dup             
		//   37   67:aload_2         
		//   38   68:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   39   71:invokespecial   #52  <Method void IllegalArgumentException(String)>
		//   40   74:athrow          
			} else
			{
				return;
		//   41   75:return          
			}
		}

		public void serviceProcessingFinished()
		{
		//    0    0:return          
		}

		public void serviceProcessingStarted()
		{
		//    0    0:return          
		}

		public void serviceStartReceived()
		{
		//    0    0:return          
		}

		final ComponentName mComponentName;
		boolean mHasJobId;
		int mJobId;

		WorkEnqueuer(Context context, ComponentName componentname)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mComponentName = componentname;
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:putfield        #20  <Field ComponentName mComponentName>
		//    5    9:return          
		}
	}


	public JobIntentService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Service()>
		mInterruptIfStopped = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #73  <Field boolean mInterruptIfStopped>
		mStopped = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #75  <Field boolean mStopped>
		mDestroyed = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #77  <Field boolean mDestroyed>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  11   19:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   22:bipush          26
	//*  13   24:icmplt          33
		{
			mCompatQueue = null;
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:putfield        #85  <Field ArrayList mCompatQueue>
			return;
	//   17   32:return          
		} else
		{
			mCompatQueue = new ArrayList();
	//   18   33:aload_0         
	//   19   34:new             #87  <Class ArrayList>
	//   20   37:dup             
	//   21   38:invokespecial   #88  <Method void ArrayList()>
	//   22   41:putfield        #85  <Field ArrayList mCompatQueue>
			return;
	//   23   44:return          
		}
	}

	public static void enqueueWork(Context context, ComponentName componentname, int i, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("work must not be null");
	//    2    4:new             #93  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #95  <String "work must not be null">
	//    5   10:invokespecial   #98  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		synchronized(sLock)
	//*   7   14:getstatic       #64  <Field Object sLock>
	//*   8   17:astore          4
	//*   9   19:aload           4
	//*  10   21:monitorenter    
		{
			context = ((Context) (getWorkEnqueuer(context, componentname, true, i)));
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:iconst_1        
	//   14   25:iload_2         
	//   15   26:invokestatic    #102 <Method JobIntentService$WorkEnqueuer getWorkEnqueuer(Context, ComponentName, boolean, int)>
	//   16   29:astore_0        
			((WorkEnqueuer) (context)).ensureJobId(i);
	//   17   30:aload_0         
	//   18   31:iload_2         
	//   19   32:invokevirtual   #106 <Method void JobIntentService$WorkEnqueuer.ensureJobId(int)>
			((WorkEnqueuer) (context)).enqueueWork(intent);
	//   20   35:aload_0         
	//   21   36:aload_3         
	//   22   37:invokevirtual   #109 <Method void JobIntentService$WorkEnqueuer.enqueueWork(Intent)>
		}
	//   23   40:aload           4
	//   24   42:monitorexit     
		return;
	//   25   43:return          
		context;
	//   26   44:astore_0        
		obj;
	//   27   45:aload           4
		JVM INSTR monitorexit ;
	//   28   47:monitorexit     
		throw context;
	//   29   48:aload_0         
	//   30   49:athrow          
	}

	public static void enqueueWork(Context context, Class class1, int i, Intent intent)
	{
		enqueueWork(context, new ComponentName(context, class1), i, intent);
	//    0    0:aload_0         
	//    1    1:new             #113 <Class ComponentName>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #116 <Method void ComponentName(Context, Class)>
	//    6   10:iload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #118 <Method void enqueueWork(Context, ComponentName, int, Intent)>
	//    9   15:return          
	}

	static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentname, boolean flag, int i)
	{
		WorkEnqueuer workenqueuer = (WorkEnqueuer)sClassWorkEnqueuer.get(((Object) (componentname)));
	//    0    0:getstatic       #69  <Field HashMap sClassWorkEnqueuer>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #122 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #30  <Class JobIntentService$WorkEnqueuer>
	//    4   10:astore          5
		Object obj = ((Object) (workenqueuer));
	//    5   12:aload           5
	//    6   14:astore          4
		if(workenqueuer == null)
	//*   7   16:aload           5
	//*   8   18:ifnonnull       79
		{
			if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   9   21:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   24:bipush          26
	//*  11   26:icmplt          57
			{
				if(!flag)
	//*  12   29:iload_2         
	//*  13   30:ifne            43
					throw new IllegalArgumentException("Can't be here without a job id");
	//   14   33:new             #93  <Class IllegalArgumentException>
	//   15   36:dup             
	//   16   37:ldc1            #124 <String "Can't be here without a job id">
	//   17   39:invokespecial   #98  <Method void IllegalArgumentException(String)>
	//   18   42:athrow          
				context = ((Context) (new JobWorkEnqueuer(context, componentname, i)));
	//   19   43:new             #27  <Class JobIntentService$JobWorkEnqueuer>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:iload_3         
	//   24   50:invokespecial   #127 <Method void JobIntentService$JobWorkEnqueuer(Context, ComponentName, int)>
	//   25   53:astore_0        
			} else
	//*  26   54:goto            67
			{
				context = ((Context) (new CompatWorkEnqueuer(context, componentname)));
	//   27   57:new             #12  <Class JobIntentService$CompatWorkEnqueuer>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:invokespecial   #130 <Method void JobIntentService$CompatWorkEnqueuer(Context, ComponentName)>
	//   32   66:astore_0        
			}
			sClassWorkEnqueuer.put(((Object) (componentname)), ((Object) (context)));
	//   33   67:getstatic       #69  <Field HashMap sClassWorkEnqueuer>
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
	//   37   75:pop             
			obj = ((Object) (context));
	//   38   76:aload_0         
	//   39   77:astore          4
		}
		return ((WorkEnqueuer) (obj));
	//   40   79:aload           4
	//   41   81:areturn         
	}

	GenericWorkItem dequeueWork()
	{
		if(mJobImpl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field JobIntentService$CompatJobEngine mJobImpl>
	//*   2    4:ifnull          17
			return mJobImpl.dequeueWork();
	//    3    7:aload_0         
	//    4    8:getfield        #138 <Field JobIntentService$CompatJobEngine mJobImpl>
	//    5   11:invokeinterface #140 <Method JobIntentService$GenericWorkItem JobIntentService$CompatJobEngine.dequeueWork()>
	//    6   16:areturn         
		ArrayList arraylist = mCompatQueue;
	//    7   17:aload_0         
	//    8   18:getfield        #85  <Field ArrayList mCompatQueue>
	//    9   21:astore_1        
		arraylist;
	//   10   22:aload_1         
		JVM INSTR monitorenter ;
	//   11   23:monitorenter    
		GenericWorkItem genericworkitem;
		if(mCompatQueue.size() <= 0)
			break MISSING_BLOCK_LABEL_50;
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field ArrayList mCompatQueue>
	//   14   28:invokevirtual   #144 <Method int ArrayList.size()>
	//   15   31:ifle            50
		genericworkitem = (GenericWorkItem)mCompatQueue.remove(0);
	//   16   34:aload_0         
	//   17   35:getfield        #85  <Field ArrayList mCompatQueue>
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #148 <Method Object ArrayList.remove(int)>
	//   20   42:checkcast       #18  <Class JobIntentService$GenericWorkItem>
	//   21   45:astore_2        
	//*  22   46:aload_1         
	//*  23   47:monitorexit     
		return genericworkitem;
	//   24   48:aload_2         
	//   25   49:areturn         
		arraylist;
	//   26   50:aload_1         
		JVM INSTR monitorexit ;
	//   27   51:monitorexit     
		return null;
	//   28   52:aconst_null     
	//   29   53:areturn         
		Exception exception;
		exception;
	//   30   54:astore_2        
		arraylist;
	//   31   55:aload_1         
		JVM INSTR monitorexit ;
	//   32   56:monitorexit     
		throw exception;
	//   33   57:aload_2         
	//   34   58:athrow          
	}

	boolean doStopCurrentWork()
	{
		if(mCurProcessor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field JobIntentService$CommandProcessor mCurProcessor>
	//*   2    4:ifnull          19
			mCurProcessor.cancel(mInterruptIfStopped);
	//    3    7:aload_0         
	//    4    8:getfield        #152 <Field JobIntentService$CommandProcessor mCurProcessor>
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field boolean mInterruptIfStopped>
	//    7   15:invokevirtual   #156 <Method boolean JobIntentService$CommandProcessor.cancel(boolean)>
	//    8   18:pop             
		mStopped = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #75  <Field boolean mStopped>
		return onStopCurrentWork();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #159 <Method boolean onStopCurrentWork()>
	//   14   28:ireturn         
	}

	void ensureProcessorRunningLocked(boolean flag)
	{
		if(mCurProcessor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field JobIntentService$CommandProcessor mCurProcessor>
	//*   2    4:ifnonnull       52
		{
			mCurProcessor = new CommandProcessor();
	//    3    7:aload_0         
	//    4    8:new             #6   <Class JobIntentService$CommandProcessor>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #164 <Method void JobIntentService$CommandProcessor(JobIntentService)>
	//    8   16:putfield        #152 <Field JobIntentService$CommandProcessor mCurProcessor>
			if(mCompatWorkEnqueuer != null && flag)
	//*   9   19:aload_0         
	//*  10   20:getfield        #166 <Field JobIntentService$WorkEnqueuer mCompatWorkEnqueuer>
	//*  11   23:ifnull          37
	//*  12   26:iload_1         
	//*  13   27:ifeq            37
				mCompatWorkEnqueuer.serviceProcessingStarted();
	//   14   30:aload_0         
	//   15   31:getfield        #166 <Field JobIntentService$WorkEnqueuer mCompatWorkEnqueuer>
	//   16   34:invokevirtual   #169 <Method void JobIntentService$WorkEnqueuer.serviceProcessingStarted()>
			mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (new Void[0])));
	//   17   37:aload_0         
	//   18   38:getfield        #152 <Field JobIntentService$CommandProcessor mCurProcessor>
	//   19   41:getstatic       #175 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   20   44:iconst_0        
	//   21   45:anewarray       Void[]
	//   22   48:invokevirtual   #181 <Method AsyncTask JobIntentService$CommandProcessor.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   23   51:pop             
		}
	//   24   52:return          
	}

	public boolean isStopped()
	{
		return mStopped;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean mStopped>
	//    2    4:ireturn         
	}

	public IBinder onBind(Intent intent)
	{
		if(mJobImpl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field JobIntentService$CompatJobEngine mJobImpl>
	//*   2    4:ifnull          17
			return mJobImpl.compatGetBinder();
	//    3    7:aload_0         
	//    4    8:getfield        #138 <Field JobIntentService$CompatJobEngine mJobImpl>
	//    5   11:invokeinterface #188 <Method IBinder JobIntentService$CompatJobEngine.compatGetBinder()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #191 <Method void Service.onCreate()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          30
		{
			mJobImpl = ((CompatJobEngine) (new JobServiceEngineImpl(this)));
	//    5   12:aload_0         
	//    6   13:new             #21  <Class JobIntentService$JobServiceEngineImpl>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #192 <Method void JobIntentService$JobServiceEngineImpl(JobIntentService)>
	//   10   21:putfield        #138 <Field JobIntentService$CompatJobEngine mJobImpl>
			mCompatWorkEnqueuer = null;
	//   11   24:aload_0         
	//   12   25:aconst_null     
	//   13   26:putfield        #166 <Field JobIntentService$WorkEnqueuer mCompatWorkEnqueuer>
			return;
	//   14   29:return          
		} else
		{
			mJobImpl = null;
	//   15   30:aload_0         
	//   16   31:aconst_null     
	//   17   32:putfield        #138 <Field JobIntentService$CompatJobEngine mJobImpl>
			mCompatWorkEnqueuer = getWorkEnqueuer(((Context) (this)), new ComponentName(((Context) (this)), ((Object)this).getClass()), false, 0);
	//   18   35:aload_0         
	//   19   36:aload_0         
	//   20   37:new             #113 <Class ComponentName>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:aload_0         
	//   24   43:invokevirtual   #196 <Method Class Object.getClass()>
	//   25   46:invokespecial   #116 <Method void ComponentName(Context, Class)>
	//   26   49:iconst_0        
	//   27   50:iconst_0        
	//   28   51:invokestatic    #102 <Method JobIntentService$WorkEnqueuer getWorkEnqueuer(Context, ComponentName, boolean, int)>
	//   29   54:putfield        #166 <Field JobIntentService$WorkEnqueuer mCompatWorkEnqueuer>
			return;
	//   30   57:return          
		}
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method void Service.onDestroy()>
		if(mCompatQueue != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #85  <Field ArrayList mCompatQueue>
	//*   4    8:ifnull          38
		{
			synchronized(mCompatQueue)
	//*   5   11:aload_0         
	//*   6   12:getfield        #85  <Field ArrayList mCompatQueue>
	//*   7   15:astore_1        
	//*   8   16:aload_1         
	//*   9   17:monitorenter    
			{
				mDestroyed = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #77  <Field boolean mDestroyed>
				mCompatWorkEnqueuer.serviceProcessingFinished();
	//   13   23:aload_0         
	//   14   24:getfield        #166 <Field JobIntentService$WorkEnqueuer mCompatWorkEnqueuer>
	//   15   27:invokevirtual   #202 <Method void JobIntentService$WorkEnqueuer.serviceProcessingFinished()>
			}
	//   16   30:aload_1         
	//   17   31:monitorexit     
			return;
	//   18   32:return          
		} else
	//*  19   33:astore_2        
	//*  20   34:aload_1         
	//*  21   35:monitorexit     
	//*  22   36:aload_2         
	//*  23   37:athrow          
		{
			return;
	//   24   38:return          
		}
		exception;
		arraylist;
		JVM INSTR monitorexit ;
		throw exception;
	}

	protected abstract void onHandleWork(Intent intent);

	public int onStartCommand(Intent intent, int i, int j)
	{
		if(mCompatQueue == null)
			break MISSING_BLOCK_LABEL_76;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ArrayList mCompatQueue>
	//    2    4:ifnull          76
		mCompatWorkEnqueuer.serviceStartReceived();
	//    3    7:aload_0         
	//    4    8:getfield        #166 <Field JobIntentService$WorkEnqueuer mCompatWorkEnqueuer>
	//    5   11:invokevirtual   #209 <Method void JobIntentService$WorkEnqueuer.serviceStartReceived()>
		ArrayList arraylist = mCompatQueue;
	//    6   14:aload_0         
	//    7   15:getfield        #85  <Field ArrayList mCompatQueue>
	//    8   18:astore          4
		arraylist;
	//    9   20:aload           4
		JVM INSTR monitorenter ;
	//   10   22:monitorenter    
		ArrayList arraylist1 = mCompatQueue;
	//   11   23:aload_0         
	//   12   24:getfield        #85  <Field ArrayList mCompatQueue>
	//   13   27:astore          5
		if(intent != null)
	//*  14   29:aload_1         
	//*  15   30:ifnull          36
			break MISSING_BLOCK_LABEL_44;
	//   16   33:goto            44
		intent = new Intent();
	//   17   36:new             #211 <Class Intent>
	//   18   39:dup             
	//   19   40:invokespecial   #212 <Method void Intent()>
	//   20   43:astore_1        
		arraylist1.add(((Object) (new CompatWorkItem(intent, j))));
	//   21   44:aload           5
	//   22   46:new             #15  <Class JobIntentService$CompatWorkItem>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:iload_3         
	//   27   53:invokespecial   #215 <Method void JobIntentService$CompatWorkItem(JobIntentService, Intent, int)>
	//   28   56:invokevirtual   #219 <Method boolean ArrayList.add(Object)>
	//   29   59:pop             
		ensureProcessorRunningLocked(true);
	//   30   60:aload_0         
	//   31   61:iconst_1        
	//   32   62:invokevirtual   #221 <Method void ensureProcessorRunningLocked(boolean)>
		arraylist;
	//   33   65:aload           4
		JVM INSTR monitorexit ;
	//   34   67:monitorexit     
		return 3;
	//   35   68:iconst_3        
	//   36   69:ireturn         
		intent;
	//   37   70:astore_1        
		arraylist;
	//   38   71:aload           4
		JVM INSTR monitorexit ;
	//   39   73:monitorexit     
		throw intent;
	//   40   74:aload_1         
	//   41   75:athrow          
		return 2;
	//   42   76:iconst_2        
	//   43   77:ireturn         
	}

	public boolean onStopCurrentWork()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void processorFinished()
	{
		if(mCompatQueue == null)
			break MISSING_BLOCK_LABEL_66;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ArrayList mCompatQueue>
	//    2    4:ifnull          66
		ArrayList arraylist = mCompatQueue;
	//    3    7:aload_0         
	//    4    8:getfield        #85  <Field ArrayList mCompatQueue>
	//    5   11:astore_1        
		arraylist;
	//    6   12:aload_1         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		mCurProcessor = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #152 <Field JobIntentService$CommandProcessor mCurProcessor>
		if(mCompatQueue != null && mCompatQueue.size() > 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #85  <Field ArrayList mCompatQueue>
	//*  13   23:ifnull          44
	//*  14   26:aload_0         
	//*  15   27:getfield        #85  <Field ArrayList mCompatQueue>
	//*  16   30:invokevirtual   #144 <Method int ArrayList.size()>
	//*  17   33:ifle            44
		{
			ensureProcessorRunningLocked(false);
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #221 <Method void ensureProcessorRunningLocked(boolean)>
			break MISSING_BLOCK_LABEL_58;
	//   21   41:goto            58
		}
		if(!mDestroyed)
	//*  22   44:aload_0         
	//*  23   45:getfield        #77  <Field boolean mDestroyed>
	//*  24   48:ifne            58
			mCompatWorkEnqueuer.serviceProcessingFinished();
	//   25   51:aload_0         
	//   26   52:getfield        #166 <Field JobIntentService$WorkEnqueuer mCompatWorkEnqueuer>
	//   27   55:invokevirtual   #202 <Method void JobIntentService$WorkEnqueuer.serviceProcessingFinished()>
		arraylist;
	//   28   58:aload_1         
		JVM INSTR monitorexit ;
	//   29   59:monitorexit     
		return;
	//   30   60:return          
		Exception exception;
		exception;
	//   31   61:astore_2        
		arraylist;
	//   32   62:aload_1         
		JVM INSTR monitorexit ;
	//   33   63:monitorexit     
		throw exception;
	//   34   64:aload_2         
	//   35   65:athrow          
	//   36   66:return          
	}

	public void setInterruptIfStopped(boolean flag)
	{
		mInterruptIfStopped = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean mInterruptIfStopped>
	//    3    5:return          
	}

	static final boolean DEBUG = false;
	static final String TAG = "JobIntentService";
	static final HashMap sClassWorkEnqueuer = new HashMap();
	static final Object sLock = new Object();
	final ArrayList mCompatQueue;
	WorkEnqueuer mCompatWorkEnqueuer;
	CommandProcessor mCurProcessor;
	boolean mDestroyed;
	boolean mInterruptIfStopped;
	CompatJobEngine mJobImpl;
	boolean mStopped;

	static 
	{
	//    0    0:new             #59  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void Object()>
	//    3    7:putstatic       #64  <Field Object sLock>
	//    4   10:new             #66  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #67  <Method void HashMap()>
	//    7   17:putstatic       #69  <Field HashMap sClassWorkEnqueuer>
	//*   8   20:return          
	}
}
