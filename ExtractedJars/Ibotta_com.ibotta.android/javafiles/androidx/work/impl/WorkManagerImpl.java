// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.content.Context;
import android.content.res.Resources;
import androidx.work.*;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.Preferences;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package androidx.work.impl:
//			WorkDatabase, Processor, WorkContinuationImpl, Scheduler, 
//			Schedulers

public class WorkManagerImpl extends WorkManager
{

	public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskexecutor)
	{
		this(context, configuration, taskexecutor, context.getResources().getBoolean(androidx.work.R.bool.workmanager_test_configuration));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload_1         
	//    5    5:invokevirtual   #50  <Method Resources Context.getResources()>
	//    6    8:getstatic       #56  <Field int androidx.work.R$bool.workmanager_test_configuration>
	//    7   11:invokevirtual   #62  <Method boolean Resources.getBoolean(int)>
	//    8   14:invokespecial   #65  <Method void WorkManagerImpl(Context, Configuration, TaskExecutor, boolean)>
	//    9   17:return          
	}

	public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskexecutor, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void WorkManager()>
		context = context.getApplicationContext();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method Context Context.getApplicationContext()>
	//    4    8:astore_1        
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #74  <Field Context mContext>
		mConfiguration = configuration;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #76  <Field Configuration mConfiguration>
		mWorkDatabase = WorkDatabase.create(context, flag);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:iload           4
	//   14   23:invokestatic    #82  <Method WorkDatabase WorkDatabase.create(Context, boolean)>
	//   15   26:putfield        #84  <Field WorkDatabase mWorkDatabase>
		mWorkTaskExecutor = taskexecutor;
	//   16   29:aload_0         
	//   17   30:aload_3         
	//   18   31:putfield        #86  <Field TaskExecutor mWorkTaskExecutor>
		mProcessor = new Processor(context, mConfiguration, mWorkTaskExecutor, mWorkDatabase, getSchedulers());
	//   19   34:aload_0         
	//   20   35:new             #88  <Class Processor>
	//   21   38:dup             
	//   22   39:aload_1         
	//   23   40:aload_0         
	//   24   41:getfield        #76  <Field Configuration mConfiguration>
	//   25   44:aload_0         
	//   26   45:getfield        #86  <Field TaskExecutor mWorkTaskExecutor>
	//   27   48:aload_0         
	//   28   49:getfield        #84  <Field WorkDatabase mWorkDatabase>
	//   29   52:aload_0         
	//   30   53:invokevirtual   #92  <Method List getSchedulers()>
	//   31   56:invokespecial   #95  <Method void Processor(Context, Configuration, TaskExecutor, WorkDatabase, List)>
	//   32   59:putfield        #97  <Field Processor mProcessor>
		mPreferences = new Preferences(mContext);
	//   33   62:aload_0         
	//   34   63:new             #99  <Class Preferences>
	//   35   66:dup             
	//   36   67:aload_0         
	//   37   68:getfield        #74  <Field Context mContext>
	//   38   71:invokespecial   #102 <Method void Preferences(Context)>
	//   39   74:putfield        #104 <Field Preferences mPreferences>
		mForceStopRunnableCompleted = false;
	//   40   77:aload_0         
	//   41   78:iconst_0        
	//   42   79:putfield        #106 <Field boolean mForceStopRunnableCompleted>
		Logger.setMinimumLoggingLevel(mConfiguration.getMinimumLoggingLevel());
	//   43   82:aload_0         
	//   44   83:getfield        #76  <Field Configuration mConfiguration>
	//   45   86:invokevirtual   #112 <Method int Configuration.getMinimumLoggingLevel()>
	//   46   89:invokestatic    #118 <Method void Logger.setMinimumLoggingLevel(int)>
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (new ForceStopRunnable(context, this))));
	//   47   92:aload_0         
	//   48   93:getfield        #86  <Field TaskExecutor mWorkTaskExecutor>
	//   49   96:new             #120 <Class ForceStopRunnable>
	//   50   99:dup             
	//   51  100:aload_1         
	//   52  101:aload_0         
	//   53  102:invokespecial   #123 <Method void ForceStopRunnable(Context, WorkManagerImpl)>
	//   54  105:invokeinterface #129 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
	//   55  110:return          
	}

	public static WorkManagerImpl getInstance()
	{
label0:
		{
			WorkManagerImpl workmanagerimpl;
			synchronized(sLock)
	//*   0    0:getstatic       #41  <Field Object sLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
			{
				if(sDelegatedInstance == null)
					break label0;
	//    4    6:getstatic       #134 <Field WorkManagerImpl sDelegatedInstance>
	//    5    9:ifnull          20
				workmanagerimpl = sDelegatedInstance;
	//    6   12:getstatic       #134 <Field WorkManagerImpl sDelegatedInstance>
	//    7   15:astore_1        
			}
	//    8   16:aload_0         
	//    9   17:monitorexit     
			return workmanagerimpl;
	//   10   18:aload_1         
	//   11   19:areturn         
		}
		WorkManagerImpl workmanagerimpl1 = sDefaultInstance;
	//   12   20:getstatic       #136 <Field WorkManagerImpl sDefaultInstance>
	//   13   23:astore_1        
		obj;
	//   14   24:aload_0         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return workmanagerimpl1;
	//   16   26:aload_1         
	//   17   27:areturn         
		exception;
	//   18   28:astore_1        
		obj;
	//   19   29:aload_0         
		JVM INSTR monitorexit ;
	//   20   30:monitorexit     
		throw exception;
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	public static void initialize(Context context, Configuration configuration)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #41  <Field Object sLock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(sDelegatedInstance == null)
	//*   4    6:getstatic       #134 <Field WorkManagerImpl sDelegatedInstance>
	//*   5    9:ifnonnull       48
			{
				context = context.getApplicationContext();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #72  <Method Context Context.getApplicationContext()>
	//    8   16:astore_0        
				if(sDefaultInstance == null)
	//*   9   17:getstatic       #136 <Field WorkManagerImpl sDefaultInstance>
	//*  10   20:ifnonnull       42
					sDefaultInstance = new WorkManagerImpl(context, configuration, ((TaskExecutor) (new WorkManagerTaskExecutor())));
	//   11   23:new             #2   <Class WorkManagerImpl>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:new             #140 <Class WorkManagerTaskExecutor>
	//   16   32:dup             
	//   17   33:invokespecial   #141 <Method void WorkManagerTaskExecutor()>
	//   18   36:invokespecial   #143 <Method void WorkManagerImpl(Context, Configuration, TaskExecutor)>
	//   19   39:putstatic       #136 <Field WorkManagerImpl sDefaultInstance>
				sDelegatedInstance = sDefaultInstance;
	//   20   42:getstatic       #136 <Field WorkManagerImpl sDefaultInstance>
	//   21   45:putstatic       #134 <Field WorkManagerImpl sDelegatedInstance>
			}
		}
	//   22   48:aload_2         
	//   23   49:monitorexit     
		return;
	//   24   50:return          
		context;
	//   25   51:astore_0        
		obj;
	//   26   52:aload_2         
		JVM INSTR monitorexit ;
	//   27   53:monitorexit     
		throw context;
	//   28   54:aload_0         
	//   29   55:athrow          
	}

	public WorkContinuation beginUniqueWork(String s, ExistingWorkPolicy existingworkpolicy, List list)
	{
		if(!list.isEmpty())
	//*   0    0:aload_3         
	//*   1    1:invokeinterface #151 <Method boolean List.isEmpty()>
	//*   2    6:ifne            21
			return ((WorkContinuation) (new WorkContinuationImpl(this, s, existingworkpolicy, list)));
	//    3    9:new             #153 <Class WorkContinuationImpl>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:invokespecial   #156 <Method void WorkContinuationImpl(WorkManagerImpl, String, ExistingWorkPolicy, List)>
	//   10   20:areturn         
		else
			throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
	//   11   21:new             #158 <Class IllegalArgumentException>
	//   12   24:dup             
	//   13   25:ldc1            #160 <String "beginUniqueWork needs at least one OneTimeWorkRequest.">
	//   14   27:invokespecial   #163 <Method void IllegalArgumentException(String)>
	//   15   30:athrow          
	}

	public ListenableFuture cancelAllWorkByTag(String s)
	{
		s = ((String) (CancelWorkRunnable.forTag(s, this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #173 <Method CancelWorkRunnable CancelWorkRunnable.forTag(String, WorkManagerImpl)>
	//    3    5:astore_1        
		getWorkTaskExecutor().executeOnBackgroundThread(((Runnable) (s)));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #177 <Method TaskExecutor getWorkTaskExecutor()>
	//    6   10:aload_1         
	//    7   11:invokeinterface #129 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return ((CancelWorkRunnable) (s)).getFuture();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #181 <Method ListenableFuture CancelWorkRunnable.getFuture()>
	//   10   20:areturn         
	}

	public ListenableFuture enqueue(List list)
	{
		if(!list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #151 <Method boolean List.isEmpty()>
	//*   2    6:ifne            22
			return (new WorkContinuationImpl(this, list)).enqueue();
	//    3    9:new             #153 <Class WorkContinuationImpl>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokespecial   #187 <Method void WorkContinuationImpl(WorkManagerImpl, List)>
	//    8   18:invokevirtual   #189 <Method ListenableFuture WorkContinuationImpl.enqueue()>
	//    9   21:areturn         
		else
			throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
	//   10   22:new             #158 <Class IllegalArgumentException>
	//   11   25:dup             
	//   12   26:ldc1            #191 <String "enqueue needs at least one WorkRequest.">
	//   13   28:invokespecial   #163 <Method void IllegalArgumentException(String)>
	//   14   31:athrow          
	}

	public Context getApplicationContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Context mContext>
	//    2    4:areturn         
	}

	public Configuration getConfiguration()
	{
		return mConfiguration;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Configuration mConfiguration>
	//    2    4:areturn         
	}

	public Preferences getPreferences()
	{
		return mPreferences;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Preferences mPreferences>
	//    2    4:areturn         
	}

	public Processor getProcessor()
	{
		return mProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Processor mProcessor>
	//    2    4:areturn         
	}

	public List getSchedulers()
	{
		if(mSchedulers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field List mSchedulers>
	//*   2    4:ifnonnull       44
			mSchedulers = Arrays.asList(((Object []) (new Scheduler[] {
				Schedulers.createBestAvailableBackgroundScheduler(mContext, this), new GreedyScheduler(mContext, this)
			})));
	//    3    7:aload_0         
	//    4    8:iconst_2        
	//    5    9:anewarray       Scheduler[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_0         
	//    9   15:getfield        #74  <Field Context mContext>
	//   10   18:aload_0         
	//   11   19:invokestatic    #208 <Method Scheduler Schedulers.createBestAvailableBackgroundScheduler(Context, WorkManagerImpl)>
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_1        
	//   15   25:new             #210 <Class GreedyScheduler>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:getfield        #74  <Field Context mContext>
	//   19   33:aload_0         
	//   20   34:invokespecial   #211 <Method void GreedyScheduler(Context, WorkManagerImpl)>
	//   21   37:aastore         
	//   22   38:invokestatic    #217 <Method List Arrays.asList(Object[])>
	//   23   41:putfield        #200 <Field List mSchedulers>
		return mSchedulers;
	//   24   44:aload_0         
	//   25   45:getfield        #200 <Field List mSchedulers>
	//   26   48:areturn         
	}

	public WorkDatabase getWorkDatabase()
	{
		return mWorkDatabase;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field WorkDatabase mWorkDatabase>
	//    2    4:areturn         
	}

	public TaskExecutor getWorkTaskExecutor()
	{
		return mWorkTaskExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field TaskExecutor mWorkTaskExecutor>
	//    2    4:areturn         
	}

	public void onForceStopRunnableCompleted()
	{
		synchronized(sLock)
	//*   0    0:getstatic       #41  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			mForceStopRunnableCompleted = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #106 <Field boolean mForceStopRunnableCompleted>
			if(mRescheduleReceiverResult != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #223 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
	//*   9   15:ifnull          30
			{
				mRescheduleReceiverResult.finish();
	//   10   18:aload_0         
	//   11   19:getfield        #223 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
	//   12   22:invokevirtual   #228 <Method void android.content.BroadcastReceiver$PendingResult.finish()>
				mRescheduleReceiverResult = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #223 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
			}
		}
	//   16   30:aload_1         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		exception;
	//   19   33:astore_2        
		obj;
	//   20   34:aload_1         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw exception;
	//   22   36:aload_2         
	//   23   37:athrow          
	}

	public void rescheduleEligibleWork()
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #236 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          15
			SystemJobScheduler.jobSchedulerCancelAll(getApplicationContext());
	//    3    8:aload_0         
	//    4    9:invokevirtual   #237 <Method Context getApplicationContext()>
	//    5   12:invokestatic    #242 <Method void SystemJobScheduler.jobSchedulerCancelAll(Context)>
		getWorkDatabase().workSpecDao().resetScheduledState();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #244 <Method WorkDatabase getWorkDatabase()>
	//    8   19:invokevirtual   #248 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    9   22:invokeinterface #253 <Method int WorkSpecDao.resetScheduledState()>
	//   10   27:pop             
		Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
	//   11   28:aload_0         
	//   12   29:invokevirtual   #255 <Method Configuration getConfiguration()>
	//   13   32:aload_0         
	//   14   33:invokevirtual   #244 <Method WorkDatabase getWorkDatabase()>
	//   15   36:aload_0         
	//   16   37:invokevirtual   #92  <Method List getSchedulers()>
	//   17   40:invokestatic    #259 <Method void Schedulers.schedule(Configuration, WorkDatabase, List)>
	//   18   43:return          
	}

	public void setReschedulePendingResult(android.content.BroadcastReceiver.PendingResult pendingresult)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #41  <Field Object sLock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			mRescheduleReceiverResult = pendingresult;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #223 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
			if(mForceStopRunnableCompleted)
	//*   7   11:aload_0         
	//*   8   12:getfield        #106 <Field boolean mForceStopRunnableCompleted>
	//*   9   15:ifeq            30
			{
				mRescheduleReceiverResult.finish();
	//   10   18:aload_0         
	//   11   19:getfield        #223 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
	//   12   22:invokevirtual   #228 <Method void android.content.BroadcastReceiver$PendingResult.finish()>
				mRescheduleReceiverResult = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #223 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
			}
		}
	//   16   30:aload_2         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		pendingresult;
	//   19   33:astore_1        
		obj;
	//   20   34:aload_2         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw pendingresult;
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	public void startWork(String s)
	{
		startWork(s, ((androidx.work.WorkerParameters.RuntimeExtras) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #265 <Method void startWork(String, androidx.work.WorkerParameters$RuntimeExtras)>
	//    4    6:return          
	}

	public void startWork(String s, androidx.work.WorkerParameters.RuntimeExtras runtimeextras)
	{
		getWorkTaskExecutor().executeOnBackgroundThread(((Runnable) (new StartWorkRunnable(this, s, runtimeextras))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method TaskExecutor getWorkTaskExecutor()>
	//    2    4:new             #267 <Class StartWorkRunnable>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #270 <Method void StartWorkRunnable(WorkManagerImpl, String, androidx.work.WorkerParameters$RuntimeExtras)>
	//    8   14:invokeinterface #129 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
	//    9   19:return          
	}

	public void stopWork(String s)
	{
		getWorkTaskExecutor().executeOnBackgroundThread(((Runnable) (new StopWorkRunnable(this, s))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method TaskExecutor getWorkTaskExecutor()>
	//    2    4:new             #273 <Class StopWorkRunnable>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #276 <Method void StopWorkRunnable(WorkManagerImpl, String)>
	//    7   13:invokeinterface #129 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
	//    8   18:return          
	}

	private static WorkManagerImpl sDefaultInstance;
	private static WorkManagerImpl sDelegatedInstance;
	private static final Object sLock = new Object();
	private Configuration mConfiguration;
	private Context mContext;
	private boolean mForceStopRunnableCompleted;
	private Preferences mPreferences;
	private Processor mProcessor;
	private android.content.BroadcastReceiver.PendingResult mRescheduleReceiverResult;
	private List mSchedulers;
	private WorkDatabase mWorkDatabase;
	private TaskExecutor mWorkTaskExecutor;

	static 
	{
	//    0    0:new             #36  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void Object()>
	//    3    7:putstatic       #41  <Field Object sLock>
	//*   4   10:return          
	}
}
