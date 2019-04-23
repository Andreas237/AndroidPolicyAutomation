// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.content.res.Resources;
import androidx.work.*;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.Preferences;
import androidx.work.impl.utils.PruneWorkRunnable;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package androidx.work.impl:
//			WorkManagerLiveDataTracker, WorkDatabase, Processor, WorkContinuationImpl, 
//			Scheduler, Schedulers

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
	//    5    5:invokevirtual   #61  <Method Resources Context.getResources()>
	//    6    8:getstatic       #66  <Field int androidx.work.R$bool.workmanager_test_configuration>
	//    7   11:invokevirtual   #72  <Method boolean Resources.getBoolean(int)>
	//    8   14:invokespecial   #75  <Method void WorkManagerImpl(Context, Configuration, TaskExecutor, boolean)>
	//    9   17:return          
	}

	public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskexecutor, WorkDatabase workdatabase, List list, Processor processor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void WorkManager()>
		mLiveDataTracker = new WorkManagerLiveDataTracker();
	//    2    4:aload_0         
	//    3    5:new             #81  <Class WorkManagerLiveDataTracker>
	//    4    8:dup             
	//    5    9:invokespecial   #82  <Method void WorkManagerLiveDataTracker()>
	//    6   12:putfield        #84  <Field WorkManagerLiveDataTracker mLiveDataTracker>
		internalInit(context, configuration, taskexecutor, workdatabase, list, processor);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:aload           4
	//   12   21:aload           5
	//   13   23:aload           6
	//   14   25:invokespecial   #87  <Method void internalInit(Context, Configuration, TaskExecutor, WorkDatabase, List, Processor)>
	//   15   28:return          
	}

	public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskexecutor, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void WorkManager()>
		mLiveDataTracker = new WorkManagerLiveDataTracker();
	//    2    4:aload_0         
	//    3    5:new             #81  <Class WorkManagerLiveDataTracker>
	//    4    8:dup             
	//    5    9:invokespecial   #82  <Method void WorkManagerLiveDataTracker()>
	//    6   12:putfield        #84  <Field WorkManagerLiveDataTracker mLiveDataTracker>
		Object obj = ((Object) (context.getApplicationContext()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #93  <Method Context Context.getApplicationContext()>
	//    9   19:astore          6
		WorkDatabase workdatabase = WorkDatabase.create(((Context) (obj)), flag);
	//   10   21:aload           6
	//   11   23:iload           4
	//   12   25:invokestatic    #99  <Method WorkDatabase WorkDatabase.create(Context, boolean)>
	//   13   28:astore          5
		Logger.setLogger(((Logger) (new androidx.work.Logger.LogcatLogger(configuration.getMinimumLoggingLevel()))));
	//   14   30:new             #101 <Class androidx.work.Logger$LogcatLogger>
	//   15   33:dup             
	//   16   34:aload_2         
	//   17   35:invokevirtual   #107 <Method int Configuration.getMinimumLoggingLevel()>
	//   18   38:invokespecial   #110 <Method void androidx.work.Logger$LogcatLogger(int)>
	//   19   41:invokestatic    #116 <Method void Logger.setLogger(Logger)>
		obj = ((Object) (createSchedulers(((Context) (obj)))));
	//   20   44:aload_0         
	//   21   45:aload           6
	//   22   47:invokevirtual   #120 <Method List createSchedulers(Context)>
	//   23   50:astore          6
		internalInit(context, configuration, taskexecutor, workdatabase, ((List) (obj)), new Processor(context, configuration, taskexecutor, workdatabase, ((List) (obj))));
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:aload_2         
	//   27   55:aload_3         
	//   28   56:aload           5
	//   29   58:aload           6
	//   30   60:new             #122 <Class Processor>
	//   31   63:dup             
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:aload_3         
	//   35   67:aload           5
	//   36   69:aload           6
	//   37   71:invokespecial   #125 <Method void Processor(Context, Configuration, TaskExecutor, WorkDatabase, List)>
	//   38   74:invokespecial   #87  <Method void internalInit(Context, Configuration, TaskExecutor, WorkDatabase, List, Processor)>
	//   39   77:return          
	}

	private WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(String s, ExistingPeriodicWorkPolicy existingperiodicworkpolicy, PeriodicWorkRequest periodicworkrequest)
	{
		if(existingperiodicworkpolicy == ExistingPeriodicWorkPolicy.KEEP)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #133 <Field ExistingPeriodicWorkPolicy ExistingPeriodicWorkPolicy.KEEP>
	//*   2    4:if_acmpne       14
			existingperiodicworkpolicy = ((ExistingPeriodicWorkPolicy) (ExistingWorkPolicy.KEEP));
	//    3    7:getstatic       #138 <Field ExistingWorkPolicy ExistingWorkPolicy.KEEP>
	//    4   10:astore_2        
		else
	//*   5   11:goto            18
			existingperiodicworkpolicy = ((ExistingPeriodicWorkPolicy) (ExistingWorkPolicy.REPLACE));
	//    6   14:getstatic       #141 <Field ExistingWorkPolicy ExistingWorkPolicy.REPLACE>
	//    7   17:astore_2        
		return new WorkContinuationImpl(this, s, ((ExistingWorkPolicy) (existingperiodicworkpolicy)), Collections.singletonList(((Object) (periodicworkrequest))));
	//    8   18:new             #143 <Class WorkContinuationImpl>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokestatic    #149 <Method List Collections.singletonList(Object)>
	//   15   29:invokespecial   #152 <Method void WorkContinuationImpl(WorkManagerImpl, String, ExistingWorkPolicy, List)>
	//   16   32:areturn         
	}

	public static WorkManagerImpl getInstance()
	{
label0:
		{
			WorkManagerImpl workmanagerimpl;
			synchronized(sLock)
	//*   0    0:getstatic       #52  <Field Object sLock>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
			{
				if(sDelegatedInstance == null)
					break label0;
	//    4    6:getstatic       #157 <Field WorkManagerImpl sDelegatedInstance>
	//    5    9:ifnull          20
				workmanagerimpl = sDelegatedInstance;
	//    6   12:getstatic       #157 <Field WorkManagerImpl sDelegatedInstance>
	//    7   15:astore_1        
			}
	//    8   16:aload_0         
	//    9   17:monitorexit     
			return workmanagerimpl;
	//   10   18:aload_1         
	//   11   19:areturn         
		}
		WorkManagerImpl workmanagerimpl1 = sDefaultInstance;
	//   12   20:getstatic       #159 <Field WorkManagerImpl sDefaultInstance>
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
		Object obj = sLock;
	//    0    0:getstatic       #52  <Field Object sLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(sDelegatedInstance == null || sDefaultInstance == null)
	//*   4    6:getstatic       #157 <Field WorkManagerImpl sDelegatedInstance>
	//*   5    9:ifnull          31
	//*   6   12:getstatic       #159 <Field WorkManagerImpl sDefaultInstance>
	//*   7   15:ifnonnull       21
			break MISSING_BLOCK_LABEL_31;
	//    8   18:goto            31
		throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
	//    9   21:new             #163 <Class IllegalStateException>
	//   10   24:dup             
	//   11   25:ldc1            #165 <String "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.">
	//   12   27:invokespecial   #168 <Method void IllegalStateException(String)>
	//   13   30:athrow          
		if(sDelegatedInstance == null)
	//*  14   31:getstatic       #157 <Field WorkManagerImpl sDelegatedInstance>
	//*  15   34:ifnonnull       73
		{
			context = context.getApplicationContext();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #93  <Method Context Context.getApplicationContext()>
	//   18   41:astore_0        
			if(sDefaultInstance == null)
	//*  19   42:getstatic       #159 <Field WorkManagerImpl sDefaultInstance>
	//*  20   45:ifnonnull       67
				sDefaultInstance = new WorkManagerImpl(context, configuration, ((TaskExecutor) (new WorkManagerTaskExecutor())));
	//   21   48:new             #2   <Class WorkManagerImpl>
	//   22   51:dup             
	//   23   52:aload_0         
	//   24   53:aload_1         
	//   25   54:new             #170 <Class WorkManagerTaskExecutor>
	//   26   57:dup             
	//   27   58:invokespecial   #171 <Method void WorkManagerTaskExecutor()>
	//   28   61:invokespecial   #173 <Method void WorkManagerImpl(Context, Configuration, TaskExecutor)>
	//   29   64:putstatic       #159 <Field WorkManagerImpl sDefaultInstance>
			sDelegatedInstance = sDefaultInstance;
	//   30   67:getstatic       #159 <Field WorkManagerImpl sDefaultInstance>
	//   31   70:putstatic       #157 <Field WorkManagerImpl sDelegatedInstance>
		}
		obj;
	//   32   73:aload_2         
		JVM INSTR monitorexit ;
	//   33   74:monitorexit     
		return;
	//   34   75:return          
		context;
	//   35   76:astore_0        
		obj;
	//   36   77:aload_2         
		JVM INSTR monitorexit ;
	//   37   78:monitorexit     
		throw context;
	//   38   79:aload_0         
	//   39   80:athrow          
	}

	private void internalInit(Context context, Configuration configuration, TaskExecutor taskexecutor, WorkDatabase workdatabase, List list, Processor processor)
	{
		context = context.getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #93  <Method Context Context.getApplicationContext()>
	//    2    4:astore_1        
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #175 <Field Context mContext>
		mConfiguration = configuration;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #177 <Field Configuration mConfiguration>
		mWorkTaskExecutor = taskexecutor;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #179 <Field TaskExecutor mWorkTaskExecutor>
		mWorkDatabase = workdatabase;
	//   12   20:aload_0         
	//   13   21:aload           4
	//   14   23:putfield        #181 <Field WorkDatabase mWorkDatabase>
		mSchedulers = list;
	//   15   26:aload_0         
	//   16   27:aload           5
	//   17   29:putfield        #183 <Field List mSchedulers>
		mProcessor = processor;
	//   18   32:aload_0         
	//   19   33:aload           6
	//   20   35:putfield        #185 <Field Processor mProcessor>
		mPreferences = new Preferences(mContext);
	//   21   38:aload_0         
	//   22   39:new             #187 <Class Preferences>
	//   23   42:dup             
	//   24   43:aload_0         
	//   25   44:getfield        #175 <Field Context mContext>
	//   26   47:invokespecial   #190 <Method void Preferences(Context)>
	//   27   50:putfield        #192 <Field Preferences mPreferences>
		mForceStopRunnableCompleted = false;
	//   28   53:aload_0         
	//   29   54:iconst_0        
	//   30   55:putfield        #194 <Field boolean mForceStopRunnableCompleted>
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (new ForceStopRunnable(context, this))));
	//   31   58:aload_0         
	//   32   59:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//   33   62:new             #196 <Class ForceStopRunnable>
	//   34   65:dup             
	//   35   66:aload_1         
	//   36   67:aload_0         
	//   37   68:invokespecial   #199 <Method void ForceStopRunnable(Context, WorkManagerImpl)>
	//   38   71:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
	//   39   76:return          
	}

	public static void setDelegate(WorkManagerImpl workmanagerimpl)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #52  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			sDelegatedInstance = workmanagerimpl;
	//    4    6:aload_0         
	//    5    7:putstatic       #157 <Field WorkManagerImpl sDelegatedInstance>
		}
	//    6   10:aload_1         
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		workmanagerimpl;
	//    9   13:astore_0        
		obj;
	//   10   14:aload_1         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		throw workmanagerimpl;
	//   12   16:aload_0         
	//   13   17:athrow          
	}

	public WorkContinuation beginUniqueWork(String s, ExistingWorkPolicy existingworkpolicy, List list)
	{
		if(!list.isEmpty())
	//*   0    0:aload_3         
	//*   1    1:invokeinterface #215 <Method boolean List.isEmpty()>
	//*   2    6:ifne            21
			return ((WorkContinuation) (new WorkContinuationImpl(this, s, existingworkpolicy, list)));
	//    3    9:new             #143 <Class WorkContinuationImpl>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:invokespecial   #152 <Method void WorkContinuationImpl(WorkManagerImpl, String, ExistingWorkPolicy, List)>
	//   10   20:areturn         
		else
			throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
	//   11   21:new             #217 <Class IllegalArgumentException>
	//   12   24:dup             
	//   13   25:ldc1            #219 <String "beginUniqueWork needs at least one OneTimeWorkRequest.">
	//   14   27:invokespecial   #220 <Method void IllegalArgumentException(String)>
	//   15   30:athrow          
	}

	public WorkContinuation beginWith(List list)
	{
		if(!list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #215 <Method boolean List.isEmpty()>
	//*   2    6:ifne            19
			return ((WorkContinuation) (new WorkContinuationImpl(this, list)));
	//    3    9:new             #143 <Class WorkContinuationImpl>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokespecial   #226 <Method void WorkContinuationImpl(WorkManagerImpl, List)>
	//    8   18:areturn         
		else
			throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
	//    9   19:new             #217 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #228 <String "beginWith needs at least one OneTimeWorkRequest.">
	//   12   25:invokespecial   #220 <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
	}

	public Operation cancelAllWork()
	{
		CancelWorkRunnable cancelworkrunnable = CancelWorkRunnable.forAll(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #237 <Method CancelWorkRunnable CancelWorkRunnable.forAll(WorkManagerImpl)>
	//    2    4:astore_1        
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (cancelworkrunnable)));
	//    3    5:aload_0         
	//    4    6:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    5    9:aload_1         
	//    6   10:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return cancelworkrunnable.getOperation();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #240 <Method Operation CancelWorkRunnable.getOperation()>
	//    9   19:areturn         
	}

	public Operation cancelAllWorkByTag(String s)
	{
		s = ((String) (CancelWorkRunnable.forTag(s, this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #246 <Method CancelWorkRunnable CancelWorkRunnable.forTag(String, WorkManagerImpl)>
	//    3    5:astore_1        
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    6   10:aload_1         
	//    7   11:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return ((CancelWorkRunnable) (s)).getOperation();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #240 <Method Operation CancelWorkRunnable.getOperation()>
	//   10   20:areturn         
	}

	public Operation cancelUniqueWork(String s)
	{
		s = ((String) (CancelWorkRunnable.forName(s, this, true)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #251 <Method CancelWorkRunnable CancelWorkRunnable.forName(String, WorkManagerImpl, boolean)>
	//    4    6:astore_1        
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    7   11:aload_1         
	//    8   12:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return ((CancelWorkRunnable) (s)).getOperation();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #240 <Method Operation CancelWorkRunnable.getOperation()>
	//   11   21:areturn         
	}

	public Operation cancelWorkById(UUID uuid)
	{
		uuid = ((UUID) (CancelWorkRunnable.forId(uuid, this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #257 <Method CancelWorkRunnable CancelWorkRunnable.forId(UUID, WorkManagerImpl)>
	//    3    5:astore_1        
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (uuid)));
	//    4    6:aload_0         
	//    5    7:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    6   10:aload_1         
	//    7   11:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return ((CancelWorkRunnable) (uuid)).getOperation();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #240 <Method Operation CancelWorkRunnable.getOperation()>
	//   10   20:areturn         
	}

	public List createSchedulers(Context context)
	{
		return Arrays.asList(((Object []) (new Scheduler[] {
			Schedulers.createBestAvailableBackgroundScheduler(context, this), new GreedyScheduler(context, this)
		})));
	//    0    0:iconst_2        
	//    1    1:anewarray       Scheduler[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokestatic    #265 <Method Scheduler Schedulers.createBestAvailableBackgroundScheduler(Context, WorkManagerImpl)>
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:new             #267 <Class GreedyScheduler>
	//   11   17:dup             
	//   12   18:aload_1         
	//   13   19:aload_0         
	//   14   20:invokespecial   #268 <Method void GreedyScheduler(Context, WorkManagerImpl)>
	//   15   23:aastore         
	//   16   24:invokestatic    #274 <Method List Arrays.asList(Object[])>
	//   17   27:areturn         
	}

	public Operation enqueue(List list)
	{
		if(!list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #215 <Method boolean List.isEmpty()>
	//*   2    6:ifne            22
			return (new WorkContinuationImpl(this, list)).enqueue();
	//    3    9:new             #143 <Class WorkContinuationImpl>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokespecial   #226 <Method void WorkContinuationImpl(WorkManagerImpl, List)>
	//    8   18:invokevirtual   #279 <Method Operation WorkContinuationImpl.enqueue()>
	//    9   21:areturn         
		else
			throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
	//   10   22:new             #217 <Class IllegalArgumentException>
	//   11   25:dup             
	//   12   26:ldc2            #281 <String "enqueue needs at least one WorkRequest.">
	//   13   29:invokespecial   #220 <Method void IllegalArgumentException(String)>
	//   14   32:athrow          
	}

	public Operation enqueueUniquePeriodicWork(String s, ExistingPeriodicWorkPolicy existingperiodicworkpolicy, PeriodicWorkRequest periodicworkrequest)
	{
		return createWorkContinuationForUniquePeriodicWork(s, existingperiodicworkpolicy, periodicworkrequest).enqueue();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #286 <Method WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(String, ExistingPeriodicWorkPolicy, PeriodicWorkRequest)>
	//    5    7:invokevirtual   #279 <Method Operation WorkContinuationImpl.enqueue()>
	//    6   10:areturn         
	}

	public Operation enqueueUniqueWork(String s, ExistingWorkPolicy existingworkpolicy, List list)
	{
		return (new WorkContinuationImpl(this, s, existingworkpolicy, list)).enqueue();
	//    0    0:new             #143 <Class WorkContinuationImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #152 <Method void WorkContinuationImpl(WorkManagerImpl, String, ExistingWorkPolicy, List)>
	//    7   11:invokevirtual   #279 <Method Operation WorkContinuationImpl.enqueue()>
	//    8   14:areturn         
	}

	public Context getApplicationContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field Context mContext>
	//    2    4:areturn         
	}

	public Configuration getConfiguration()
	{
		return mConfiguration;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field Configuration mConfiguration>
	//    2    4:areturn         
	}

	public ListenableFuture getLastCancelAllTimeMillis()
	{
		final SettableFuture future = SettableFuture.create();
	//    0    0:invokestatic    #298 <Method SettableFuture SettableFuture.create()>
	//    1    3:astore_1        
		final Preferences preferences = mPreferences;
	//    2    4:aload_0         
	//    3    5:getfield        #192 <Field Preferences mPreferences>
	//    4    8:astore_2        
		mWorkTaskExecutor.executeOnBackgroundThread(new Runnable() {

			public void run()
			{
				try
				{
					future.set(((Object) (Long.valueOf(preferences.getLastCancelAllTimeMillis()))));
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field SettableFuture val$future>
			//    2    4:aload_0         
			//    3    5:getfield        #25  <Field Preferences val$preferences>
			//    4    8:invokevirtual   #37  <Method long Preferences.getLastCancelAllTimeMillis()>
			//    5   11:invokestatic    #43  <Method Long Long.valueOf(long)>
			//    6   14:invokevirtual   #49  <Method boolean SettableFuture.set(Object)>
			//    7   17:pop             
					return;
			//    8   18:return          
				}
				catch(Throwable throwable)
			//*   9   19:astore_1        
				{
					future.setException(throwable);
			//   10   20:aload_0         
			//   11   21:getfield        #23  <Field SettableFuture val$future>
			//   12   24:aload_1         
			//   13   25:invokevirtual   #53  <Method boolean SettableFuture.setException(Throwable)>
			//   14   28:pop             
				}
			//   15   29:return          
			}

			final WorkManagerImpl this$0;
			final SettableFuture val$future;
			final Preferences val$preferences;

			
			{
				this$0 = WorkManagerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field WorkManagerImpl this$0>
				future = settablefuture;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field SettableFuture val$future>
				preferences = preferences1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Preferences val$preferences>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    5    9:aload_0         
	//    6   10:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    7   13:new             #6   <Class WorkManagerImpl$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #301 <Method void WorkManagerImpl$1(WorkManagerImpl, SettableFuture, Preferences)>
	//   13   23:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return ((ListenableFuture) (future));
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public LiveData getLastCancelAllTimeMillisLiveData()
	{
		return mPreferences.getLastCancelAllTimeMillisLiveData();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field Preferences mPreferences>
	//    2    4:invokevirtual   #306 <Method LiveData Preferences.getLastCancelAllTimeMillisLiveData()>
	//    3    7:areturn         
	}

	public Preferences getPreferences()
	{
		return mPreferences;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field Preferences mPreferences>
	//    2    4:areturn         
	}

	public Processor getProcessor()
	{
		return mProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field Processor mProcessor>
	//    2    4:areturn         
	}

	public List getSchedulers()
	{
		return mSchedulers;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field List mSchedulers>
	//    2    4:areturn         
	}

	public WorkDatabase getWorkDatabase()
	{
		return mWorkDatabase;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field WorkDatabase mWorkDatabase>
	//    2    4:areturn         
	}

	public ListenableFuture getWorkInfoById(UUID uuid)
	{
		uuid = ((UUID) (StatusRunnable.forUUID(this, uuid)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #324 <Method StatusRunnable StatusRunnable.forUUID(WorkManagerImpl, UUID)>
	//    3    5:astore_1        
		mWorkTaskExecutor.getBackgroundExecutor().execute(((Runnable) (uuid)));
	//    4    6:aload_0         
	//    5    7:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    6   10:invokeinterface #328 <Method Executor TaskExecutor.getBackgroundExecutor()>
	//    7   15:aload_1         
	//    8   16:invokeinterface #333 <Method void Executor.execute(Runnable)>
		return ((StatusRunnable) (uuid)).getFuture();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #336 <Method ListenableFuture StatusRunnable.getFuture()>
	//   11   25:areturn         
	}

	public LiveData getWorkInfoByIdLiveData(UUID uuid)
	{
		uuid = ((UUID) (LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(((Object) (uuid.toString())))), new Function() {

			public WorkInfo apply(List list)
			{
				if(list != null && list.size() > 0)
			//*   0    0:aload_1         
			//*   1    1:ifnull          27
			//*   2    4:aload_1         
			//*   3    5:invokeinterface #30  <Method int List.size()>
			//*   4   10:ifle            27
					return ((androidx.work.impl.model.WorkSpec.WorkInfoPojo)list.get(0)).toWorkInfo();
			//    5   13:aload_1         
			//    6   14:iconst_0        
			//    7   15:invokeinterface #34  <Method Object List.get(int)>
			//    8   20:checkcast       #36  <Class androidx.work.impl.model.WorkSpec$WorkInfoPojo>
			//    9   23:invokevirtual   #40  <Method WorkInfo androidx.work.impl.model.WorkSpec$WorkInfoPojo.toWorkInfo()>
			//   10   26:areturn         
				else
					return null;
			//   11   27:aconst_null     
			//   12   28:areturn         
			}

			public volatile Object apply(Object obj)
			{
				return ((Object) (apply((List)obj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class List>
			//    3    5:invokevirtual   #45  <Method WorkInfo apply(List)>
			//    4    8:areturn         
			}

			final WorkManagerImpl this$0;

			
			{
				this$0 = WorkManagerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field WorkManagerImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
, mWorkTaskExecutor)));
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #343 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #349 <Method String UUID.toString()>
	//    5   11:invokestatic    #149 <Method List Collections.singletonList(Object)>
	//    6   14:invokeinterface #355 <Method LiveData WorkSpecDao.getWorkStatusPojoLiveDataForIds(List)>
	//    7   19:new             #8   <Class WorkManagerImpl$2>
	//    8   22:dup             
	//    9   23:aload_0         
	//   10   24:invokespecial   #357 <Method void WorkManagerImpl$2(WorkManagerImpl)>
	//   11   27:aload_0         
	//   12   28:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//   13   31:invokestatic    #363 <Method LiveData LiveDataUtils.dedupedMappedLiveDataFor(LiveData, Function, TaskExecutor)>
	//   14   34:astore_1        
		return mLiveDataTracker.track(((LiveData) (uuid)));
	//   15   35:aload_0         
	//   16   36:getfield        #84  <Field WorkManagerLiveDataTracker mLiveDataTracker>
	//   17   39:aload_1         
	//   18   40:invokevirtual   #367 <Method LiveData WorkManagerLiveDataTracker.track(LiveData)>
	//   19   43:areturn         
	}

	LiveData getWorkInfosById(List list)
	{
		list = ((List) (LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(list), WorkSpec.WORK_INFO_MAPPER, mWorkTaskExecutor)));
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #343 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #355 <Method LiveData WorkSpecDao.getWorkStatusPojoLiveDataForIds(List)>
	//    5   13:getstatic       #375 <Field Function WorkSpec.WORK_INFO_MAPPER>
	//    6   16:aload_0         
	//    7   17:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    8   20:invokestatic    #363 <Method LiveData LiveDataUtils.dedupedMappedLiveDataFor(LiveData, Function, TaskExecutor)>
	//    9   23:astore_1        
		return mLiveDataTracker.track(((LiveData) (list)));
	//   10   24:aload_0         
	//   11   25:getfield        #84  <Field WorkManagerLiveDataTracker mLiveDataTracker>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #367 <Method LiveData WorkManagerLiveDataTracker.track(LiveData)>
	//   14   32:areturn         
	}

	public ListenableFuture getWorkInfosByTag(String s)
	{
		s = ((String) (StatusRunnable.forTag(this, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #381 <Method StatusRunnable StatusRunnable.forTag(WorkManagerImpl, String)>
	//    3    5:astore_1        
		mWorkTaskExecutor.getBackgroundExecutor().execute(((Runnable) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    6   10:invokeinterface #328 <Method Executor TaskExecutor.getBackgroundExecutor()>
	//    7   15:aload_1         
	//    8   16:invokeinterface #333 <Method void Executor.execute(Runnable)>
		return ((StatusRunnable) (s)).getFuture();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #336 <Method ListenableFuture StatusRunnable.getFuture()>
	//   11   25:areturn         
	}

	public LiveData getWorkInfosByTagLiveData(String s)
	{
		s = ((String) (LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForTag(s), WorkSpec.WORK_INFO_MAPPER, mWorkTaskExecutor)));
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #343 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #387 <Method LiveData WorkSpecDao.getWorkStatusPojoLiveDataForTag(String)>
	//    5   13:getstatic       #375 <Field Function WorkSpec.WORK_INFO_MAPPER>
	//    6   16:aload_0         
	//    7   17:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    8   20:invokestatic    #363 <Method LiveData LiveDataUtils.dedupedMappedLiveDataFor(LiveData, Function, TaskExecutor)>
	//    9   23:astore_1        
		return mLiveDataTracker.track(((LiveData) (s)));
	//   10   24:aload_0         
	//   11   25:getfield        #84  <Field WorkManagerLiveDataTracker mLiveDataTracker>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #367 <Method LiveData WorkManagerLiveDataTracker.track(LiveData)>
	//   14   32:areturn         
	}

	public ListenableFuture getWorkInfosForUniqueWork(String s)
	{
		s = ((String) (StatusRunnable.forUniqueWork(this, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #392 <Method StatusRunnable StatusRunnable.forUniqueWork(WorkManagerImpl, String)>
	//    3    5:astore_1        
		mWorkTaskExecutor.getBackgroundExecutor().execute(((Runnable) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    6   10:invokeinterface #328 <Method Executor TaskExecutor.getBackgroundExecutor()>
	//    7   15:aload_1         
	//    8   16:invokeinterface #333 <Method void Executor.execute(Runnable)>
		return ((StatusRunnable) (s)).getFuture();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #336 <Method ListenableFuture StatusRunnable.getFuture()>
	//   11   25:areturn         
	}

	public LiveData getWorkInfosForUniqueWorkLiveData(String s)
	{
		s = ((String) (LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForName(s), WorkSpec.WORK_INFO_MAPPER, mWorkTaskExecutor)));
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #343 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #396 <Method LiveData WorkSpecDao.getWorkStatusPojoLiveDataForName(String)>
	//    5   13:getstatic       #375 <Field Function WorkSpec.WORK_INFO_MAPPER>
	//    6   16:aload_0         
	//    7   17:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    8   20:invokestatic    #363 <Method LiveData LiveDataUtils.dedupedMappedLiveDataFor(LiveData, Function, TaskExecutor)>
	//    9   23:astore_1        
		return mLiveDataTracker.track(((LiveData) (s)));
	//   10   24:aload_0         
	//   11   25:getfield        #84  <Field WorkManagerLiveDataTracker mLiveDataTracker>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #367 <Method LiveData WorkManagerLiveDataTracker.track(LiveData)>
	//   14   32:areturn         
	}

	public TaskExecutor getWorkTaskExecutor()
	{
		return mWorkTaskExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    2    4:areturn         
	}

	public void onForceStopRunnableCompleted()
	{
		synchronized(sLock)
	//*   0    0:getstatic       #52  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			mForceStopRunnableCompleted = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #194 <Field boolean mForceStopRunnableCompleted>
			if(mRescheduleReceiverResult != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #401 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
	//*   9   15:ifnull          30
			{
				mRescheduleReceiverResult.finish();
	//   10   18:aload_0         
	//   11   19:getfield        #401 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
	//   12   22:invokevirtual   #406 <Method void android.content.BroadcastReceiver$PendingResult.finish()>
				mRescheduleReceiverResult = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #401 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
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

	public Operation pruneWork()
	{
		PruneWorkRunnable pruneworkrunnable = new PruneWorkRunnable(this);
	//    0    0:new             #409 <Class PruneWorkRunnable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #410 <Method void PruneWorkRunnable(WorkManagerImpl)>
	//    4    8:astore_1        
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (pruneworkrunnable)));
	//    5    9:aload_0         
	//    6   10:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    7   13:aload_1         
	//    8   14:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return pruneworkrunnable.getOperation();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #411 <Method Operation PruneWorkRunnable.getOperation()>
	//   11   23:areturn         
	}

	public void rescheduleEligibleWork()
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #417 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          15
			SystemJobScheduler.jobSchedulerCancelAll(getApplicationContext());
	//    3    8:aload_0         
	//    4    9:invokevirtual   #418 <Method Context getApplicationContext()>
	//    5   12:invokestatic    #423 <Method void SystemJobScheduler.jobSchedulerCancelAll(Context)>
		getWorkDatabase().workSpecDao().resetScheduledState();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #425 <Method WorkDatabase getWorkDatabase()>
	//    8   19:invokevirtual   #343 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    9   22:invokeinterface #428 <Method int WorkSpecDao.resetScheduledState()>
	//   10   27:pop             
		Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
	//   11   28:aload_0         
	//   12   29:invokevirtual   #430 <Method Configuration getConfiguration()>
	//   13   32:aload_0         
	//   14   33:invokevirtual   #425 <Method WorkDatabase getWorkDatabase()>
	//   15   36:aload_0         
	//   16   37:invokevirtual   #432 <Method List getSchedulers()>
	//   17   40:invokestatic    #436 <Method void Schedulers.schedule(Configuration, WorkDatabase, List)>
	//   18   43:return          
	}

	public void setReschedulePendingResult(android.content.BroadcastReceiver.PendingResult pendingresult)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #52  <Field Object sLock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			mRescheduleReceiverResult = pendingresult;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #401 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
			if(mForceStopRunnableCompleted)
	//*   7   11:aload_0         
	//*   8   12:getfield        #194 <Field boolean mForceStopRunnableCompleted>
	//*   9   15:ifeq            30
			{
				mRescheduleReceiverResult.finish();
	//   10   18:aload_0         
	//   11   19:getfield        #401 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
	//   12   22:invokevirtual   #406 <Method void android.content.BroadcastReceiver$PendingResult.finish()>
				mRescheduleReceiverResult = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #401 <Field android.content.BroadcastReceiver$PendingResult mRescheduleReceiverResult>
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

	public ListenableFuture startWork(String s)
	{
		return startWork(s, ((androidx.work.WorkerParameters.RuntimeExtras) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #442 <Method ListenableFuture startWork(String, androidx.work.WorkerParameters$RuntimeExtras)>
	//    4    6:areturn         
	}

	public ListenableFuture startWork(String s, androidx.work.WorkerParameters.RuntimeExtras runtimeextras)
	{
		s = ((String) (new StartWorkRunnable(this, s, runtimeextras)));
	//    0    0:new             #445 <Class StartWorkRunnable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #448 <Method void StartWorkRunnable(WorkManagerImpl, String, androidx.work.WorkerParameters$RuntimeExtras)>
	//    6   10:astore_1        
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (s)));
	//    7   11:aload_0         
	//    8   12:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    9   15:aload_1         
	//   10   16:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		return ((StartWorkRunnable) (s)).getEnqueuedFuture();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #451 <Method ListenableFuture StartWorkRunnable.getEnqueuedFuture()>
	//   13   25:areturn         
	}

	public void stopWork(String s)
	{
		mWorkTaskExecutor.executeOnBackgroundThread(((Runnable) (new StopWorkRunnable(this, s))));
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field TaskExecutor mWorkTaskExecutor>
	//    2    4:new             #455 <Class StopWorkRunnable>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #458 <Method void StopWorkRunnable(WorkManagerImpl, String)>
	//    7   13:invokeinterface #205 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
	//    8   18:return          
	}

	public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
	public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
	private static WorkManagerImpl sDefaultInstance;
	private static WorkManagerImpl sDelegatedInstance;
	private static final Object sLock = new Object();
	private Configuration mConfiguration;
	private Context mContext;
	private boolean mForceStopRunnableCompleted;
	private final WorkManagerLiveDataTracker mLiveDataTracker;
	private Preferences mPreferences;
	private Processor mProcessor;
	private android.content.BroadcastReceiver.PendingResult mRescheduleReceiverResult;
	private List mSchedulers;
	private WorkDatabase mWorkDatabase;
	private TaskExecutor mWorkTaskExecutor;

	static 
	{
	//    0    0:new             #47  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void Object()>
	//    3    7:putstatic       #52  <Field Object sLock>
	//*   4   10:return          
	}
}
