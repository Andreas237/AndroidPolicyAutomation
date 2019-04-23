// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.content.Context;
import androidx.work.*;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package androidx.work.impl:
//			WorkDatabase, Scheduler, Schedulers

public class WorkerWrapper
	implements Runnable
{
	public static class Builder
	{

		public WorkerWrapper build()
		{
			return new WorkerWrapper(this);
		//    0    0:new             #6   <Class WorkerWrapper>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #63  <Method void WorkerWrapper(WorkerWrapper$Builder)>
		//    4    8:areturn         
		}

		public Builder withRuntimeExtras(androidx.work.WorkerParameters.RuntimeExtras runtimeextras)
		{
			if(runtimeextras != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          9
				mRuntimeExtras = runtimeextras;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #40  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder withSchedulers(List list)
		{
			mSchedulers = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #69  <Field List mSchedulers>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder withWorker(ListenableWorker listenableworker)
		{
			mWorker = listenableworker;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #76  <Field ListenableWorker mWorker>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		Context mAppContext;
		Configuration mConfiguration;
		androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
		List mSchedulers;
		WorkDatabase mWorkDatabase;
		String mWorkSpecId;
		TaskExecutor mWorkTaskExecutor;
		ListenableWorker mWorker;

		public Builder(Context context, Configuration configuration, TaskExecutor taskexecutor, WorkDatabase workdatabase, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			mRuntimeExtras = new androidx.work.WorkerParameters.RuntimeExtras();
		//    2    4:aload_0         
		//    3    5:new             #37  <Class androidx.work.WorkerParameters$RuntimeExtras>
		//    4    8:dup             
		//    5    9:invokespecial   #38  <Method void androidx.work.WorkerParameters$RuntimeExtras()>
		//    6   12:putfield        #40  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
			mAppContext = context.getApplicationContext();
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #46  <Method Context Context.getApplicationContext()>
		//   10   20:putfield        #48  <Field Context mAppContext>
			mWorkTaskExecutor = taskexecutor;
		//   11   23:aload_0         
		//   12   24:aload_3         
		//   13   25:putfield        #50  <Field TaskExecutor mWorkTaskExecutor>
			mConfiguration = configuration;
		//   14   28:aload_0         
		//   15   29:aload_2         
		//   16   30:putfield        #52  <Field Configuration mConfiguration>
			mWorkDatabase = workdatabase;
		//   17   33:aload_0         
		//   18   34:aload           4
		//   19   36:putfield        #54  <Field WorkDatabase mWorkDatabase>
			mWorkSpecId = s;
		//   20   39:aload_0         
		//   21   40:aload           5
		//   22   42:putfield        #56  <Field String mWorkSpecId>
		//   23   45:return          
		}
	}


	WorkerWrapper(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
		mResult = androidx.work.ListenableWorker.Result.failure();
	//    2    4:aload_0         
	//    3    5:invokestatic    #81  <Method androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.failure()>
	//    4    8:putfield        #83  <Field androidx.work.ListenableWorker$Result mResult>
		mFuture = SettableFuture.create();
	//    5   11:aload_0         
	//    6   12:invokestatic    #89  <Method SettableFuture SettableFuture.create()>
	//    7   15:putfield        #91  <Field SettableFuture mFuture>
		mInnerFuture = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #93  <Field ListenableFuture mInnerFuture>
		mAppContext = builder.mAppContext;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #95  <Field Context WorkerWrapper$Builder.mAppContext>
	//   14   28:putfield        #96  <Field Context mAppContext>
		mWorkTaskExecutor = builder.mWorkTaskExecutor;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #98  <Field TaskExecutor WorkerWrapper$Builder.mWorkTaskExecutor>
	//   18   36:putfield        #99  <Field TaskExecutor mWorkTaskExecutor>
		mWorkSpecId = builder.mWorkSpecId;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #101 <Field String WorkerWrapper$Builder.mWorkSpecId>
	//   22   44:putfield        #102 <Field String mWorkSpecId>
		mSchedulers = builder.mSchedulers;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #104 <Field List WorkerWrapper$Builder.mSchedulers>
	//   26   52:putfield        #105 <Field List mSchedulers>
		mRuntimeExtras = builder.mRuntimeExtras;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:getfield        #107 <Field androidx.work.WorkerParameters$RuntimeExtras WorkerWrapper$Builder.mRuntimeExtras>
	//   30   60:putfield        #108 <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
		mWorker = builder.mWorker;
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getfield        #110 <Field ListenableWorker WorkerWrapper$Builder.mWorker>
	//   34   68:putfield        #111 <Field ListenableWorker mWorker>
		mConfiguration = builder.mConfiguration;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:getfield        #113 <Field Configuration WorkerWrapper$Builder.mConfiguration>
	//   38   76:putfield        #114 <Field Configuration mConfiguration>
		mWorkDatabase = builder.mWorkDatabase;
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:getfield        #116 <Field WorkDatabase WorkerWrapper$Builder.mWorkDatabase>
	//   42   84:putfield        #117 <Field WorkDatabase mWorkDatabase>
		mWorkSpecDao = mWorkDatabase.workSpecDao();
	//   43   87:aload_0         
	//   44   88:aload_0         
	//   45   89:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   46   92:invokevirtual   #123 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   47   95:putfield        #125 <Field WorkSpecDao mWorkSpecDao>
		mDependencyDao = mWorkDatabase.dependencyDao();
	//   48   98:aload_0         
	//   49   99:aload_0         
	//   50  100:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   51  103:invokevirtual   #129 <Method DependencyDao WorkDatabase.dependencyDao()>
	//   52  106:putfield        #131 <Field DependencyDao mDependencyDao>
		mWorkTagDao = mWorkDatabase.workTagDao();
	//   53  109:aload_0         
	//   54  110:aload_0         
	//   55  111:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   56  114:invokevirtual   #135 <Method WorkTagDao WorkDatabase.workTagDao()>
	//   57  117:putfield        #137 <Field WorkTagDao mWorkTagDao>
	//   58  120:return          
	}

	private void assertBackgroundExecutorThread()
	{
		if(mWorkTaskExecutor.getBackgroundExecutorThread() == Thread.currentThread())
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field TaskExecutor mWorkTaskExecutor>
	//*   2    4:invokeinterface #150 <Method Thread TaskExecutor.getBackgroundExecutorThread()>
	//*   3    9:invokestatic    #155 <Method Thread Thread.currentThread()>
	//*   4   12:if_acmpne       16
			return;
	//    5   15:return          
		else
			throw new IllegalStateException("Needs to be executed on the Background executor thread.");
	//    6   16:new             #157 <Class IllegalStateException>
	//    7   19:dup             
	//    8   20:ldc1            #159 <String "Needs to be executed on the Background executor thread.">
	//    9   22:invokespecial   #162 <Method void IllegalStateException(String)>
	//   10   25:athrow          
	}

	private String createWorkDescription(List list)
	{
		StringBuilder stringbuilder = new StringBuilder("Work [ id=");
	//    0    0:new             #166 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #168 <String "Work [ id=">
	//    3    6:invokespecial   #169 <Method void StringBuilder(String)>
	//    4    9:astore_3        
		stringbuilder.append(mWorkSpecId);
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:getfield        #102 <Field String mWorkSpecId>
	//    8   15:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(", tags={ ");
	//   10   19:aload_3         
	//   11   20:ldc1            #175 <String ", tags={ ">
	//   12   22:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		list = ((List) (list.iterator()));
	//   14   26:aload_1         
	//   15   27:invokeinterface #181 <Method Iterator List.iterator()>
	//   16   32:astore_1        
		boolean flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_2        
		String s;
		for(; ((Iterator) (list)).hasNext(); stringbuilder.append(s))
	//*  19   35:aload_1         
	//*  20   36:invokeinterface #187 <Method boolean Iterator.hasNext()>
	//*  21   41:ifeq            81
		{
			s = (String)((Iterator) (list)).next();
	//   22   44:aload_1         
	//   23   45:invokeinterface #191 <Method Object Iterator.next()>
	//   24   50:checkcast       #193 <Class String>
	//   25   53:astore          4
			if(flag)
	//*  26   55:iload_2         
	//*  27   56:ifeq            64
				flag = false;
	//   28   59:iconst_0        
	//   29   60:istore_2        
			else
	//*  30   61:goto            71
				stringbuilder.append(", ");
	//   31   64:aload_3         
	//   32   65:ldc1            #195 <String ", ">
	//   33   67:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
		}

	//   35   71:aload_3         
	//   36   72:aload           4
	//   37   74:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
	//*  39   78:goto            35
		stringbuilder.append(" } ]");
	//   40   81:aload_3         
	//   41   82:ldc1            #197 <String " } ]">
	//   42   84:invokevirtual   #173 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		return stringbuilder.toString();
	//   44   88:aload_3         
	//   45   89:invokevirtual   #200 <Method String StringBuilder.toString()>
	//   46   92:areturn         
	}

	private void handleResult(androidx.work.ListenableWorker.Result result)
	{
		if(result instanceof androidx.work.ListenableWorker.Result.Success)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #206 <Class androidx.work.ListenableWorker$Result$Success>
	//*   2    4:ifeq            56
		{
			Logger.get().info(TAG, String.format("Worker result SUCCESS for %s", new Object[] {
				mWorkDescription
			}), new Throwable[0]);
	//    3    7:invokestatic    #210 <Method Logger Logger.get()>
	//    4   10:getstatic       #70  <Field String TAG>
	//    5   13:ldc1            #212 <String "Worker result SUCCESS for %s">
	//    6   15:iconst_1        
	//    7   16:anewarray       Object[]
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:aload_0         
	//   11   22:getfield        #214 <Field String mWorkDescription>
	//   12   25:aastore         
	//   13   26:invokestatic    #218 <Method String String.format(String, Object[])>
	//   14   29:iconst_0        
	//   15   30:anewarray       Throwable[]
	//   16   33:invokevirtual   #224 <Method void Logger.info(String, String, Throwable[])>
			if(mWorkSpec.isPeriodic())
	//*  17   36:aload_0         
	//*  18   37:getfield        #143 <Field WorkSpec mWorkSpec>
	//*  19   40:invokevirtual   #229 <Method boolean WorkSpec.isPeriodic()>
	//*  20   43:ifeq            51
			{
				resetPeriodicAndResolve();
	//   21   46:aload_0         
	//   22   47:invokespecial   #232 <Method void resetPeriodicAndResolve()>
				return;
	//   23   50:return          
			} else
			{
				setSucceededAndResolve();
	//   24   51:aload_0         
	//   25   52:invokespecial   #235 <Method void setSucceededAndResolve()>
				return;
	//   26   55:return          
			}
		}
		if(result instanceof androidx.work.ListenableWorker.Result.Retry)
	//*  27   56:aload_1         
	//*  28   57:instanceof      #237 <Class androidx.work.ListenableWorker$Result$Retry>
	//*  29   60:ifeq            97
		{
			Logger.get().info(TAG, String.format("Worker result RETRY for %s", new Object[] {
				mWorkDescription
			}), new Throwable[0]);
	//   30   63:invokestatic    #210 <Method Logger Logger.get()>
	//   31   66:getstatic       #70  <Field String TAG>
	//   32   69:ldc1            #239 <String "Worker result RETRY for %s">
	//   33   71:iconst_1        
	//   34   72:anewarray       Object[]
	//   35   75:dup             
	//   36   76:iconst_0        
	//   37   77:aload_0         
	//   38   78:getfield        #214 <Field String mWorkDescription>
	//   39   81:aastore         
	//   40   82:invokestatic    #218 <Method String String.format(String, Object[])>
	//   41   85:iconst_0        
	//   42   86:anewarray       Throwable[]
	//   43   89:invokevirtual   #224 <Method void Logger.info(String, String, Throwable[])>
			rescheduleAndResolve();
	//   44   92:aload_0         
	//   45   93:invokespecial   #242 <Method void rescheduleAndResolve()>
			return;
	//   46   96:return          
		}
		Logger.get().info(TAG, String.format("Worker result FAILURE for %s", new Object[] {
			mWorkDescription
		}), new Throwable[0]);
	//   47   97:invokestatic    #210 <Method Logger Logger.get()>
	//   48  100:getstatic       #70  <Field String TAG>
	//   49  103:ldc1            #244 <String "Worker result FAILURE for %s">
	//   50  105:iconst_1        
	//   51  106:anewarray       Object[]
	//   52  109:dup             
	//   53  110:iconst_0        
	//   54  111:aload_0         
	//   55  112:getfield        #214 <Field String mWorkDescription>
	//   56  115:aastore         
	//   57  116:invokestatic    #218 <Method String String.format(String, Object[])>
	//   58  119:iconst_0        
	//   59  120:anewarray       Throwable[]
	//   60  123:invokevirtual   #224 <Method void Logger.info(String, String, Throwable[])>
		if(mWorkSpec.isPeriodic())
	//*  61  126:aload_0         
	//*  62  127:getfield        #143 <Field WorkSpec mWorkSpec>
	//*  63  130:invokevirtual   #229 <Method boolean WorkSpec.isPeriodic()>
	//*  64  133:ifeq            141
		{
			resetPeriodicAndResolve();
	//   65  136:aload_0         
	//   66  137:invokespecial   #232 <Method void resetPeriodicAndResolve()>
			return;
	//   67  140:return          
		} else
		{
			setFailedAndResolve();
	//   68  141:aload_0         
	//   69  142:invokespecial   #247 <Method void setFailedAndResolve()>
			return;
	//   70  145:return          
		}
	}

	private void recursivelyFailWorkAndDependents(String s)
	{
		for(Iterator iterator = mDependencyDao.getDependentWorkIds(s).iterator(); iterator.hasNext(); recursivelyFailWorkAndDependents((String)iterator.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field DependencyDao mDependencyDao>
	//    2    4:aload_1         
	//    3    5:invokeinterface #254 <Method List DependencyDao.getDependentWorkIds(String)>
	//    4   10:invokeinterface #181 <Method Iterator List.iterator()>
	//    5   15:astore_2        
	//    6   16:aload_2         
	//    7   17:invokeinterface #187 <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            41
	//    9   25:aload_0         
	//   10   26:aload_2         
	//   11   27:invokeinterface #191 <Method Object Iterator.next()>
	//   12   32:checkcast       #193 <Class String>
	//   13   35:invokespecial   #256 <Method void recursivelyFailWorkAndDependents(String)>
	//*  14   38:goto            16
		if(mWorkSpecDao.getState(s) != androidx.work.WorkInfo.State.CANCELLED)
	//*  15   41:aload_0         
	//*  16   42:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//*  17   45:aload_1         
	//*  18   46:invokeinterface #262 <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//*  19   51:getstatic       #268 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.CANCELLED>
	//*  20   54:if_acmpeq       78
			mWorkSpecDao.setState(androidx.work.WorkInfo.State.FAILED, new String[] {
				s
			});
	//   21   57:aload_0         
	//   22   58:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   23   61:getstatic       #271 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.FAILED>
	//   24   64:iconst_1        
	//   25   65:anewarray       String[]
	//   26   68:dup             
	//   27   69:iconst_0        
	//   28   70:aload_1         
	//   29   71:aastore         
	//   30   72:invokeinterface #275 <Method int WorkSpecDao.setState(androidx.work.WorkInfo$State, String[])>
	//   31   77:pop             
	//   32   78:return          
	}

	private void rescheduleAndResolve()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #278 <Method void WorkDatabase.beginTransaction()>
		mWorkSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, new String[] {
			mWorkSpecId
		});
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//    5   11:getstatic       #281 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//    6   14:iconst_1        
	//    7   15:anewarray       String[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #102 <Field String mWorkSpecId>
	//   12   24:aastore         
	//   13   25:invokeinterface #275 <Method int WorkSpecDao.setState(androidx.work.WorkInfo$State, String[])>
	//   14   30:pop             
		mWorkSpecDao.setPeriodStartTime(mWorkSpecId, System.currentTimeMillis());
	//   15   31:aload_0         
	//   16   32:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   17   35:aload_0         
	//   18   36:getfield        #102 <Field String mWorkSpecId>
	//   19   39:invokestatic    #287 <Method long System.currentTimeMillis()>
	//   20   42:invokeinterface #291 <Method void WorkSpecDao.setPeriodStartTime(String, long)>
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  21   47:getstatic       #297 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   50:bipush          23
	//*  23   52:icmpge          72
			mWorkSpecDao.markWorkSpecScheduled(mWorkSpecId, -1L);
	//   24   55:aload_0         
	//   25   56:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   26   59:aload_0         
	//   27   60:getfield        #102 <Field String mWorkSpecId>
	//   28   63:ldc2w           #298 <Long -1L>
	//   29   66:invokeinterface #303 <Method int WorkSpecDao.markWorkSpecScheduled(String, long)>
	//   30   71:pop             
		mWorkDatabase.setTransactionSuccessful();
	//   31   72:aload_0         
	//   32   73:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   33   76:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   34   79:aload_0         
	//   35   80:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   36   83:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		resolve(true);
	//   37   86:aload_0         
	//   38   87:iconst_1        
	//   39   88:invokespecial   #313 <Method void resolve(boolean)>
		return;
	//   40   91:return          
		Exception exception;
		exception;
	//   41   92:astore_1        
		mWorkDatabase.endTransaction();
	//   42   93:aload_0         
	//   43   94:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   44   97:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		resolve(true);
	//   45  100:aload_0         
	//   46  101:iconst_1        
	//   47  102:invokespecial   #313 <Method void resolve(boolean)>
		throw exception;
	//   48  105:aload_1         
	//   49  106:athrow          
	}

	private void resetPeriodicAndResolve()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #278 <Method void WorkDatabase.beginTransaction()>
		long l = mWorkSpec.periodStartTime;
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field WorkSpec mWorkSpec>
	//    5   11:getfield        #317 <Field long WorkSpec.periodStartTime>
	//    6   14:lstore_1        
		l = Math.max(System.currentTimeMillis(), l + mWorkSpec.intervalDuration);
	//    7   15:invokestatic    #287 <Method long System.currentTimeMillis()>
	//    8   18:lload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #143 <Field WorkSpec mWorkSpec>
	//   11   23:getfield        #320 <Field long WorkSpec.intervalDuration>
	//   12   26:ladd            
	//   13   27:invokestatic    #326 <Method long Math.max(long, long)>
	//   14   30:lstore_1        
		mWorkSpecDao.setPeriodStartTime(mWorkSpecId, l);
	//   15   31:aload_0         
	//   16   32:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   17   35:aload_0         
	//   18   36:getfield        #102 <Field String mWorkSpecId>
	//   19   39:lload_1         
	//   20   40:invokeinterface #291 <Method void WorkSpecDao.setPeriodStartTime(String, long)>
		mWorkSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, new String[] {
			mWorkSpecId
		});
	//   21   45:aload_0         
	//   22   46:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   23   49:getstatic       #281 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   24   52:iconst_1        
	//   25   53:anewarray       String[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:aload_0         
	//   29   59:getfield        #102 <Field String mWorkSpecId>
	//   30   62:aastore         
	//   31   63:invokeinterface #275 <Method int WorkSpecDao.setState(androidx.work.WorkInfo$State, String[])>
	//   32   68:pop             
		mWorkSpecDao.resetWorkSpecRunAttemptCount(mWorkSpecId);
	//   33   69:aload_0         
	//   34   70:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   35   73:aload_0         
	//   36   74:getfield        #102 <Field String mWorkSpecId>
	//   37   77:invokeinterface #330 <Method int WorkSpecDao.resetWorkSpecRunAttemptCount(String)>
	//   38   82:pop             
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  39   83:getstatic       #297 <Field int android.os.Build$VERSION.SDK_INT>
	//*  40   86:bipush          23
	//*  41   88:icmpge          108
			mWorkSpecDao.markWorkSpecScheduled(mWorkSpecId, -1L);
	//   42   91:aload_0         
	//   43   92:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   44   95:aload_0         
	//   45   96:getfield        #102 <Field String mWorkSpecId>
	//   46   99:ldc2w           #298 <Long -1L>
	//   47  102:invokeinterface #303 <Method int WorkSpecDao.markWorkSpecScheduled(String, long)>
	//   48  107:pop             
		mWorkDatabase.setTransactionSuccessful();
	//   49  108:aload_0         
	//   50  109:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   51  112:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   52  115:aload_0         
	//   53  116:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   54  119:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   55  122:aload_0         
	//   56  123:iconst_0        
	//   57  124:invokespecial   #313 <Method void resolve(boolean)>
		return;
	//   58  127:return          
		Exception exception;
		exception;
	//   59  128:astore_3        
		mWorkDatabase.endTransaction();
	//   60  129:aload_0         
	//   61  130:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   62  133:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   63  136:aload_0         
	//   64  137:iconst_0        
	//   65  138:invokespecial   #313 <Method void resolve(boolean)>
		throw exception;
	//   66  141:aload_3         
	//   67  142:athrow          
	}

	private void resolve(boolean flag)
	{
		List list;
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #278 <Method void WorkDatabase.beginTransaction()>
		list = mWorkDatabase.workSpecDao().getAllUnfinishedWork();
	//    3    7:aload_0         
	//    4    8:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//    5   11:invokevirtual   #123 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    6   14:invokeinterface #334 <Method List WorkSpecDao.getAllUnfinishedWork()>
	//    7   19:astore_3        
		if(list == null) goto _L2; else goto _L1
	//    8   20:aload_3         
	//    9   21:ifnull          93
_L1:
		boolean flag1;
		Exception exception;
		if(!list.isEmpty())
	//*  10   24:aload_3         
	//*  11   25:invokeinterface #337 <Method boolean List.isEmpty()>
	//*  12   30:ifeq            88
	//*  13   33:goto            93
	//*  14   36:iload_2         
	//*  15   37:ifeq            51
	//*  16   40:aload_0         
	//*  17   41:getfield        #96  <Field Context mAppContext>
	//*  18   44:ldc2            #339 <Class RescheduleReceiver>
	//*  19   47:iconst_0        
	//*  20   48:invokestatic    #345 <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
	//*  21   51:aload_0         
	//*  22   52:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//*  23   55:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
	//*  24   58:aload_0         
	//*  25   59:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//*  26   62:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
	//*  27   65:aload_0         
	//*  28   66:getfield        #91  <Field SettableFuture mFuture>
	//*  29   69:iload_1         
	//*  30   70:invokestatic    #351 <Method Boolean Boolean.valueOf(boolean)>
	//*  31   73:invokevirtual   #355 <Method boolean SettableFuture.set(Object)>
	//*  32   76:pop             
	//*  33   77:return          
	//*  34   78:astore_3        
	//*  35   79:aload_0         
	//*  36   80:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//*  37   83:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
	//*  38   86:aload_3         
	//*  39   87:athrow          
		{
			flag1 = false;
	//   40   88:iconst_0        
	//   41   89:istore_2        
			continue; /* Loop/switch isn't completed */
	//   42   90:goto            36
		}
		  goto _L2
_L4:
		if(!flag1)
			break MISSING_BLOCK_LABEL_51;
		PackageManagerHelper.setComponentEnabled(mAppContext, androidx/work/impl/background/systemalarm/RescheduleReceiver, false);
		mWorkDatabase.setTransactionSuccessful();
		mWorkDatabase.endTransaction();
		mFuture.set(((Object) (Boolean.valueOf(flag))));
		return;
		exception;
		mWorkDatabase.endTransaction();
		throw exception;
_L2:
		flag1 = true;
	//   43   93:iconst_1        
	//   44   94:istore_2        
		if(true) goto _L4; else goto _L3
	//   45   95:goto            36
_L3:
	}

	private void resolveIncorrectStatus()
	{
		androidx.work.WorkInfo.State state = mWorkSpecDao.getState(mWorkSpecId);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//    2    4:aload_0         
	//    3    5:getfield        #102 <Field String mWorkSpecId>
	//    4    8:invokeinterface #262 <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//    5   13:astore_1        
		if(state == androidx.work.WorkInfo.State.RUNNING)
	//*   6   14:aload_1         
	//*   7   15:getstatic       #359 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.RUNNING>
	//*   8   18:if_acmpne       57
		{
			Logger.get().debug(TAG, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[] {
				mWorkSpecId
			}), new Throwable[0]);
	//    9   21:invokestatic    #210 <Method Logger Logger.get()>
	//   10   24:getstatic       #70  <Field String TAG>
	//   11   27:ldc2            #361 <String "Status for %s is RUNNING;not doing any work and rescheduling for later execution">
	//   12   30:iconst_1        
	//   13   31:anewarray       Object[]
	//   14   34:dup             
	//   15   35:iconst_0        
	//   16   36:aload_0         
	//   17   37:getfield        #102 <Field String mWorkSpecId>
	//   18   40:aastore         
	//   19   41:invokestatic    #218 <Method String String.format(String, Object[])>
	//   20   44:iconst_0        
	//   21   45:anewarray       Throwable[]
	//   22   48:invokevirtual   #364 <Method void Logger.debug(String, String, Throwable[])>
			resolve(true);
	//   23   51:aload_0         
	//   24   52:iconst_1        
	//   25   53:invokespecial   #313 <Method void resolve(boolean)>
			return;
	//   26   56:return          
		} else
		{
			Logger.get().debug(TAG, String.format("Status for %s is %s; not doing any work", new Object[] {
				mWorkSpecId, state
			}), new Throwable[0]);
	//   27   57:invokestatic    #210 <Method Logger Logger.get()>
	//   28   60:getstatic       #70  <Field String TAG>
	//   29   63:ldc2            #366 <String "Status for %s is %s; not doing any work">
	//   30   66:iconst_2        
	//   31   67:anewarray       Object[]
	//   32   70:dup             
	//   33   71:iconst_0        
	//   34   72:aload_0         
	//   35   73:getfield        #102 <Field String mWorkSpecId>
	//   36   76:aastore         
	//   37   77:dup             
	//   38   78:iconst_1        
	//   39   79:aload_1         
	//   40   80:aastore         
	//   41   81:invokestatic    #218 <Method String String.format(String, Object[])>
	//   42   84:iconst_0        
	//   43   85:anewarray       Throwable[]
	//   44   88:invokevirtual   #364 <Method void Logger.debug(String, String, Throwable[])>
			resolve(false);
	//   45   91:aload_0         
	//   46   92:iconst_0        
	//   47   93:invokespecial   #313 <Method void resolve(boolean)>
			return;
	//   48   96:return          
		}
	}

	private void runWorker()
	{
		if(tryCheckForInterruptionAndResolve())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #370 <Method boolean tryCheckForInterruptionAndResolve()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mWorkDatabase.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//    6   12:invokevirtual   #278 <Method void WorkDatabase.beginTransaction()>
		mWorkSpec = mWorkSpecDao.getWorkSpec(mWorkSpecId);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   10   20:aload_0         
	//   11   21:getfield        #102 <Field String mWorkSpecId>
	//   12   24:invokeinterface #374 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   13   29:putfield        #143 <Field WorkSpec mWorkSpec>
		if(mWorkSpec != null)
			break MISSING_BLOCK_LABEL_82;
	//   14   32:aload_0         
	//   15   33:getfield        #143 <Field WorkSpec mWorkSpec>
	//   16   36:ifnonnull       82
		Logger.get().error(TAG, String.format("Didn't find WorkSpec for id %s", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//   17   39:invokestatic    #210 <Method Logger Logger.get()>
	//   18   42:getstatic       #70  <Field String TAG>
	//   19   45:ldc2            #376 <String "Didn't find WorkSpec for id %s">
	//   20   48:iconst_1        
	//   21   49:anewarray       Object[]
	//   22   52:dup             
	//   23   53:iconst_0        
	//   24   54:aload_0         
	//   25   55:getfield        #102 <Field String mWorkSpecId>
	//   26   58:aastore         
	//   27   59:invokestatic    #218 <Method String String.format(String, Object[])>
	//   28   62:iconst_0        
	//   29   63:anewarray       Throwable[]
	//   30   66:invokevirtual   #379 <Method void Logger.error(String, String, Throwable[])>
		resolve(false);
	//   31   69:aload_0         
	//   32   70:iconst_0        
	//   33   71:invokespecial   #313 <Method void resolve(boolean)>
		mWorkDatabase.endTransaction();
	//   34   74:aload_0         
	//   35   75:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   36   78:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		return;
	//   37   81:return          
		if(mWorkSpec.state == androidx.work.WorkInfo.State.ENQUEUED)
			break MISSING_BLOCK_LABEL_114;
	//   38   82:aload_0         
	//   39   83:getfield        #143 <Field WorkSpec mWorkSpec>
	//   40   86:getfield        #382 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//   41   89:getstatic       #281 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   42   92:if_acmpeq       114
		resolveIncorrectStatus();
	//   43   95:aload_0         
	//   44   96:invokespecial   #384 <Method void resolveIncorrectStatus()>
		mWorkDatabase.setTransactionSuccessful();
	//   45   99:aload_0         
	//   46  100:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   47  103:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   48  106:aload_0         
	//   49  107:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   50  110:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		return;
	//   51  113:return          
		if(!mWorkSpec.isPeriodic() || System.currentTimeMillis() >= mWorkSpec.calculateNextRunTime())
			break MISSING_BLOCK_LABEL_151;
	//   52  114:aload_0         
	//   53  115:getfield        #143 <Field WorkSpec mWorkSpec>
	//   54  118:invokevirtual   #229 <Method boolean WorkSpec.isPeriodic()>
	//   55  121:ifeq            151
	//   56  124:invokestatic    #287 <Method long System.currentTimeMillis()>
	//   57  127:aload_0         
	//   58  128:getfield        #143 <Field WorkSpec mWorkSpec>
	//   59  131:invokevirtual   #387 <Method long WorkSpec.calculateNextRunTime()>
	//   60  134:lcmp            
	//   61  135:ifge            151
		resolve(false);
	//   62  138:aload_0         
	//   63  139:iconst_0        
	//   64  140:invokespecial   #313 <Method void resolve(boolean)>
		mWorkDatabase.endTransaction();
	//   65  143:aload_0         
	//   66  144:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   67  147:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		return;
	//   68  150:return          
		mWorkDatabase.setTransactionSuccessful();
	//   69  151:aload_0         
	//   70  152:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   71  155:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   72  158:aload_0         
	//   73  159:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   74  162:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		Object obj;
		if(mWorkSpec.isPeriodic())
	//*  75  165:aload_0         
	//*  76  166:getfield        #143 <Field WorkSpec mWorkSpec>
	//*  77  169:invokevirtual   #229 <Method boolean WorkSpec.isPeriodic()>
	//*  78  172:ifeq            186
		{
			obj = ((Object) (mWorkSpec.input));
	//   79  175:aload_0         
	//   80  176:getfield        #143 <Field WorkSpec mWorkSpec>
	//   81  179:getfield        #391 <Field androidx.work.Data WorkSpec.input>
	//   82  182:astore_1        
		} else
	//*  83  183:goto            287
		{
			obj = ((Object) (InputMerger.fromClassName(mWorkSpec.inputMergerClassName)));
	//   84  186:aload_0         
	//   85  187:getfield        #143 <Field WorkSpec mWorkSpec>
	//   86  190:getfield        #394 <Field String WorkSpec.inputMergerClassName>
	//   87  193:invokestatic    #400 <Method InputMerger InputMerger.fromClassName(String)>
	//   88  196:astore_1        
			if(obj == null)
	//*  89  197:aload_1         
	//*  90  198:ifnonnull       239
			{
				Logger.get().error(TAG, String.format("Could not create Input Merger %s", new Object[] {
					mWorkSpec.inputMergerClassName
				}), new Throwable[0]);
	//   91  201:invokestatic    #210 <Method Logger Logger.get()>
	//   92  204:getstatic       #70  <Field String TAG>
	//   93  207:ldc2            #402 <String "Could not create Input Merger %s">
	//   94  210:iconst_1        
	//   95  211:anewarray       Object[]
	//   96  214:dup             
	//   97  215:iconst_0        
	//   98  216:aload_0         
	//   99  217:getfield        #143 <Field WorkSpec mWorkSpec>
	//  100  220:getfield        #394 <Field String WorkSpec.inputMergerClassName>
	//  101  223:aastore         
	//  102  224:invokestatic    #218 <Method String String.format(String, Object[])>
	//  103  227:iconst_0        
	//  104  228:anewarray       Throwable[]
	//  105  231:invokevirtual   #379 <Method void Logger.error(String, String, Throwable[])>
				setFailedAndResolve();
	//  106  234:aload_0         
	//  107  235:invokespecial   #247 <Method void setFailedAndResolve()>
				return;
	//  108  238:return          
			}
			ArrayList arraylist = new ArrayList();
	//  109  239:new             #404 <Class ArrayList>
	//  110  242:dup             
	//  111  243:invokespecial   #405 <Method void ArrayList()>
	//  112  246:astore_2        
			((List) (arraylist)).add(((Object) (mWorkSpec.input)));
	//  113  247:aload_2         
	//  114  248:aload_0         
	//  115  249:getfield        #143 <Field WorkSpec mWorkSpec>
	//  116  252:getfield        #391 <Field androidx.work.Data WorkSpec.input>
	//  117  255:invokeinterface #408 <Method boolean List.add(Object)>
	//  118  260:pop             
			((List) (arraylist)).addAll(((java.util.Collection) (mWorkSpecDao.getInputsFromPrerequisites(mWorkSpecId))));
	//  119  261:aload_2         
	//  120  262:aload_0         
	//  121  263:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//  122  266:aload_0         
	//  123  267:getfield        #102 <Field String mWorkSpecId>
	//  124  270:invokeinterface #411 <Method List WorkSpecDao.getInputsFromPrerequisites(String)>
	//  125  275:invokeinterface #415 <Method boolean List.addAll(java.util.Collection)>
	//  126  280:pop             
			obj = ((Object) (((InputMerger) (obj)).merge(((List) (arraylist)))));
	//  127  281:aload_1         
	//  128  282:aload_2         
	//  129  283:invokevirtual   #419 <Method androidx.work.Data InputMerger.merge(List)>
	//  130  286:astore_1        
		}
		obj = ((Object) (new WorkerParameters(UUID.fromString(mWorkSpecId), ((androidx.work.Data) (obj)), ((java.util.Collection) (mTags)), mRuntimeExtras, mWorkSpec.runAttemptCount, mConfiguration.getExecutor(), mWorkTaskExecutor, mConfiguration.getWorkerFactory())));
	//  131  287:new             #421 <Class WorkerParameters>
	//  132  290:dup             
	//  133  291:aload_0         
	//  134  292:getfield        #102 <Field String mWorkSpecId>
	//  135  295:invokestatic    #427 <Method UUID UUID.fromString(String)>
	//  136  298:aload_1         
	//  137  299:aload_0         
	//  138  300:getfield        #429 <Field List mTags>
	//  139  303:aload_0         
	//  140  304:getfield        #108 <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
	//  141  307:aload_0         
	//  142  308:getfield        #143 <Field WorkSpec mWorkSpec>
	//  143  311:getfield        #432 <Field int WorkSpec.runAttemptCount>
	//  144  314:aload_0         
	//  145  315:getfield        #114 <Field Configuration mConfiguration>
	//  146  318:invokevirtual   #438 <Method Executor Configuration.getExecutor()>
	//  147  321:aload_0         
	//  148  322:getfield        #99  <Field TaskExecutor mWorkTaskExecutor>
	//  149  325:aload_0         
	//  150  326:getfield        #114 <Field Configuration mConfiguration>
	//  151  329:invokevirtual   #442 <Method WorkerFactory Configuration.getWorkerFactory()>
	//  152  332:invokespecial   #445 <Method void WorkerParameters(UUID, androidx.work.Data, java.util.Collection, androidx.work.WorkerParameters$RuntimeExtras, int, Executor, TaskExecutor, WorkerFactory)>
	//  153  335:astore_1        
		if(mWorker == null)
	//* 154  336:aload_0         
	//* 155  337:getfield        #111 <Field ListenableWorker mWorker>
	//* 156  340:ifnonnull       369
			mWorker = mConfiguration.getWorkerFactory().createWorkerWithDefaultFallback(mAppContext, mWorkSpec.workerClassName, ((WorkerParameters) (obj)));
	//  157  343:aload_0         
	//  158  344:aload_0         
	//  159  345:getfield        #114 <Field Configuration mConfiguration>
	//  160  348:invokevirtual   #442 <Method WorkerFactory Configuration.getWorkerFactory()>
	//  161  351:aload_0         
	//  162  352:getfield        #96  <Field Context mAppContext>
	//  163  355:aload_0         
	//  164  356:getfield        #143 <Field WorkSpec mWorkSpec>
	//  165  359:getfield        #448 <Field String WorkSpec.workerClassName>
	//  166  362:aload_1         
	//  167  363:invokevirtual   #454 <Method ListenableWorker WorkerFactory.createWorkerWithDefaultFallback(Context, String, WorkerParameters)>
	//  168  366:putfield        #111 <Field ListenableWorker mWorker>
		obj = ((Object) (mWorker));
	//  169  369:aload_0         
	//  170  370:getfield        #111 <Field ListenableWorker mWorker>
	//  171  373:astore_1        
		if(obj == null)
	//* 172  374:aload_1         
	//* 173  375:ifnonnull       416
		{
			Logger.get().error(TAG, String.format("Could not create Worker %s", new Object[] {
				mWorkSpec.workerClassName
			}), new Throwable[0]);
	//  174  378:invokestatic    #210 <Method Logger Logger.get()>
	//  175  381:getstatic       #70  <Field String TAG>
	//  176  384:ldc2            #456 <String "Could not create Worker %s">
	//  177  387:iconst_1        
	//  178  388:anewarray       Object[]
	//  179  391:dup             
	//  180  392:iconst_0        
	//  181  393:aload_0         
	//  182  394:getfield        #143 <Field WorkSpec mWorkSpec>
	//  183  397:getfield        #448 <Field String WorkSpec.workerClassName>
	//  184  400:aastore         
	//  185  401:invokestatic    #218 <Method String String.format(String, Object[])>
	//  186  404:iconst_0        
	//  187  405:anewarray       Throwable[]
	//  188  408:invokevirtual   #379 <Method void Logger.error(String, String, Throwable[])>
			setFailedAndResolve();
	//  189  411:aload_0         
	//  190  412:invokespecial   #247 <Method void setFailedAndResolve()>
			return;
	//  191  415:return          
		}
		if(((ListenableWorker) (obj)).isUsed())
	//* 192  416:aload_1         
	//* 193  417:invokevirtual   #461 <Method boolean ListenableWorker.isUsed()>
	//* 194  420:ifeq            461
		{
			Logger.get().error(TAG, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[] {
				mWorkSpec.workerClassName
			}), new Throwable[0]);
	//  195  423:invokestatic    #210 <Method Logger Logger.get()>
	//  196  426:getstatic       #70  <Field String TAG>
	//  197  429:ldc2            #463 <String "Received an already-used Worker %s; WorkerFactory should return new instances">
	//  198  432:iconst_1        
	//  199  433:anewarray       Object[]
	//  200  436:dup             
	//  201  437:iconst_0        
	//  202  438:aload_0         
	//  203  439:getfield        #143 <Field WorkSpec mWorkSpec>
	//  204  442:getfield        #448 <Field String WorkSpec.workerClassName>
	//  205  445:aastore         
	//  206  446:invokestatic    #218 <Method String String.format(String, Object[])>
	//  207  449:iconst_0        
	//  208  450:anewarray       Throwable[]
	//  209  453:invokevirtual   #379 <Method void Logger.error(String, String, Throwable[])>
			setFailedAndResolve();
	//  210  456:aload_0         
	//  211  457:invokespecial   #247 <Method void setFailedAndResolve()>
			return;
	//  212  460:return          
		}
		mWorker.setUsed();
	//  213  461:aload_0         
	//  214  462:getfield        #111 <Field ListenableWorker mWorker>
	//  215  465:invokevirtual   #466 <Method void ListenableWorker.setUsed()>
		if(trySetRunning())
	//* 216  468:aload_0         
	//* 217  469:invokespecial   #469 <Method boolean trySetRunning()>
	//* 218  472:ifeq            537
		{
			if(tryCheckForInterruptionAndResolve())
	//* 219  475:aload_0         
	//* 220  476:invokespecial   #370 <Method boolean tryCheckForInterruptionAndResolve()>
	//* 221  479:ifeq            483
			{
				return;
	//  222  482:return          
			} else
			{
				final SettableFuture future = SettableFuture.create();
	//  223  483:invokestatic    #89  <Method SettableFuture SettableFuture.create()>
	//  224  486:astore_1        
				mWorkTaskExecutor.getMainThreadExecutor().execute(new Runnable() {

					public void run()
					{
						try
						{
							mInnerFuture = mWorker.startWork();
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field WorkerWrapper this$0>
					//    2    4:aload_0         
					//    3    5:getfield        #19  <Field WorkerWrapper this$0>
					//    4    8:getfield        #31  <Field ListenableWorker WorkerWrapper.mWorker>
					//    5   11:invokevirtual   #37  <Method ListenableFuture ListenableWorker.startWork()>
					//    6   14:putfield        #41  <Field ListenableFuture WorkerWrapper.mInnerFuture>
							future.setFuture(mInnerFuture);
					//    7   17:aload_0         
					//    8   18:getfield        #21  <Field SettableFuture val$future>
					//    9   21:aload_0         
					//   10   22:getfield        #19  <Field WorkerWrapper this$0>
					//   11   25:getfield        #41  <Field ListenableFuture WorkerWrapper.mInnerFuture>
					//   12   28:invokevirtual   #47  <Method boolean SettableFuture.setFuture(ListenableFuture)>
					//   13   31:pop             
							return;
					//   14   32:return          
						}
						catch(Throwable throwable)
					//*  15   33:astore_1        
						{
							future.setException(throwable);
					//   16   34:aload_0         
					//   17   35:getfield        #21  <Field SettableFuture val$future>
					//   18   38:aload_1         
					//   19   39:invokevirtual   #51  <Method boolean SettableFuture.setException(Throwable)>
					//   20   42:pop             
						}
					//   21   43:return          
					}

					final WorkerWrapper this$0;
					final SettableFuture val$future;

			
			{
				this$0 = WorkerWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field WorkerWrapper this$0>
				future = settablefuture;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SettableFuture val$future>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//  225  487:aload_0         
	//  226  488:getfield        #99  <Field TaskExecutor mWorkTaskExecutor>
	//  227  491:invokeinterface #472 <Method Executor TaskExecutor.getMainThreadExecutor()>
	//  228  496:new             #8   <Class WorkerWrapper$1>
	//  229  499:dup             
	//  230  500:aload_0         
	//  231  501:aload_1         
	//  232  502:invokespecial   #475 <Method void WorkerWrapper$1(WorkerWrapper, SettableFuture)>
	//  233  505:invokeinterface #481 <Method void Executor.execute(Runnable)>
				future.addListener(new Runnable() {

					public void run()
					{
						androidx.work.ListenableWorker.Result result = (androidx.work.ListenableWorker.Result)future.get();
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field SettableFuture val$future>
					//    2    4:invokevirtual   #44  <Method Object SettableFuture.get()>
					//    3    7:checkcast       #46  <Class androidx.work.ListenableWorker$Result>
					//    4   10:astore_1        
						if(result != null)
							break MISSING_BLOCK_LABEL_53;
					//    5   11:aload_1         
					//    6   12:ifnonnull       53
						Logger.get().error(WorkerWrapper.TAG, String.format("%s returned a null result. Treating it as a failure.", new Object[] {
							mWorkSpec.workerClassName
						}), new Throwable[0]);
					//    7   15:invokestatic    #51  <Method Logger Logger.get()>
					//    8   18:invokestatic    #55  <Method String WorkerWrapper.access$000()>
					//    9   21:ldc1            #57  <String "%s returned a null result. Treating it as a failure.">
					//   10   23:iconst_1        
					//   11   24:anewarray       Object[]
					//   12   27:dup             
					//   13   28:iconst_0        
					//   14   29:aload_0         
					//   15   30:getfield        #21  <Field WorkerWrapper this$0>
					//   16   33:invokestatic    #61  <Method WorkSpec WorkerWrapper.access$100(WorkerWrapper)>
					//   17   36:getfield        #66  <Field String WorkSpec.workerClassName>
					//   18   39:aastore         
					//   19   40:invokestatic    #72  <Method String String.format(String, Object[])>
					//   20   43:iconst_0        
					//   21   44:anewarray       Throwable[]
					//   22   47:invokevirtual   #78  <Method void Logger.error(String, String, Throwable[])>
						break MISSING_BLOCK_LABEL_61;
					//   23   50:goto            61
						mResult = result;
					//   24   53:aload_0         
					//   25   54:getfield        #21  <Field WorkerWrapper this$0>
					//   26   57:aload_1         
					//   27   58:putfield        #82  <Field androidx.work.ListenableWorker$Result WorkerWrapper.mResult>
_L2:
						onWorkFinished();
					//   28   61:aload_0         
					//   29   62:getfield        #21  <Field WorkerWrapper this$0>
					//   30   65:invokevirtual   #85  <Method void WorkerWrapper.onWorkFinished()>
						return;
					//   31   68:return          
						Object obj1;
						obj1;
					//   32   69:astore_1        
						break; /* Loop/switch isn't completed */
					//   33   70:goto            151
						obj1;
					//   34   73:astore_1        
						break MISSING_BLOCK_LABEL_78;
					//   35   74:goto            78
						obj1;
					//   36   77:astore_1        
						Logger.get().error(WorkerWrapper.TAG, String.format("%s failed because it threw an exception/error", new Object[] {
							workDescription
						}), new Throwable[] {
							obj1
						});
					//   37   78:invokestatic    #51  <Method Logger Logger.get()>
					//   38   81:invokestatic    #55  <Method String WorkerWrapper.access$000()>
					//   39   84:ldc1            #87  <String "%s failed because it threw an exception/error">
					//   40   86:iconst_1        
					//   41   87:anewarray       Object[]
					//   42   90:dup             
					//   43   91:iconst_0        
					//   44   92:aload_0         
					//   45   93:getfield        #25  <Field String val$workDescription>
					//   46   96:aastore         
					//   47   97:invokestatic    #72  <Method String String.format(String, Object[])>
					//   48  100:iconst_1        
					//   49  101:anewarray       Throwable[]
					//   50  104:dup             
					//   51  105:iconst_0        
					//   52  106:aload_1         
					//   53  107:aastore         
					//   54  108:invokevirtual   #78  <Method void Logger.error(String, String, Throwable[])>
						continue; /* Loop/switch isn't completed */
					//   55  111:goto            61
						obj1;
					//   56  114:astore_1        
						Logger.get().info(WorkerWrapper.TAG, String.format("%s was cancelled", new Object[] {
							workDescription
						}), new Throwable[] {
							obj1
						});
					//   57  115:invokestatic    #51  <Method Logger Logger.get()>
					//   58  118:invokestatic    #55  <Method String WorkerWrapper.access$000()>
					//   59  121:ldc1            #89  <String "%s was cancelled">
					//   60  123:iconst_1        
					//   61  124:anewarray       Object[]
					//   62  127:dup             
					//   63  128:iconst_0        
					//   64  129:aload_0         
					//   65  130:getfield        #25  <Field String val$workDescription>
					//   66  133:aastore         
					//   67  134:invokestatic    #72  <Method String String.format(String, Object[])>
					//   68  137:iconst_1        
					//   69  138:anewarray       Throwable[]
					//   70  141:dup             
					//   71  142:iconst_0        
					//   72  143:aload_1         
					//   73  144:aastore         
					//   74  145:invokevirtual   #92  <Method void Logger.info(String, String, Throwable[])>
						if(true) goto _L2; else goto _L1
					//   75  148:goto            61
_L1:
						onWorkFinished();
					//   76  151:aload_0         
					//   77  152:getfield        #21  <Field WorkerWrapper this$0>
					//   78  155:invokevirtual   #85  <Method void WorkerWrapper.onWorkFinished()>
						throw obj1;
					//   79  158:aload_1         
					//   80  159:athrow          
					}

					final WorkerWrapper this$0;
					final SettableFuture val$future;
					final String val$workDescription;

			
			{
				this$0 = WorkerWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field WorkerWrapper this$0>
				future = settablefuture;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field SettableFuture val$future>
				workDescription = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$workDescription>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
				}
, mWorkTaskExecutor.getBackgroundExecutor());
	//  234  510:aload_1         
	//  235  511:new             #10  <Class WorkerWrapper$2>
	//  236  514:dup             
	//  237  515:aload_0         
	//  238  516:aload_1         
	//  239  517:aload_0         
	//  240  518:getfield        #214 <Field String mWorkDescription>
	//  241  521:invokespecial   #484 <Method void WorkerWrapper$2(WorkerWrapper, SettableFuture, String)>
	//  242  524:aload_0         
	//  243  525:getfield        #99  <Field TaskExecutor mWorkTaskExecutor>
	//  244  528:invokeinterface #487 <Method Executor TaskExecutor.getBackgroundExecutor()>
	//  245  533:invokevirtual   #491 <Method void SettableFuture.addListener(Runnable, Executor)>
				return;
	//  246  536:return          
			}
		} else
		{
			resolveIncorrectStatus();
	//  247  537:aload_0         
	//  248  538:invokespecial   #384 <Method void resolveIncorrectStatus()>
			return;
	//  249  541:return          
		}
		Exception exception;
		exception;
	//  250  542:astore_1        
		mWorkDatabase.endTransaction();
	//  251  543:aload_0         
	//  252  544:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//  253  547:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		throw exception;
	//  254  550:aload_1         
	//  255  551:athrow          
	}

	private void setFailedAndResolve()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #278 <Method void WorkDatabase.beginTransaction()>
		recursivelyFailWorkAndDependents(mWorkSpecId);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #102 <Field String mWorkSpecId>
	//    6   12:invokespecial   #256 <Method void recursivelyFailWorkAndDependents(String)>
		androidx.work.Data data = ((androidx.work.ListenableWorker.Result.Failure)mResult).getOutputData();
	//    7   15:aload_0         
	//    8   16:getfield        #83  <Field androidx.work.ListenableWorker$Result mResult>
	//    9   19:checkcast       #493 <Class androidx.work.ListenableWorker$Result$Failure>
	//   10   22:invokevirtual   #497 <Method androidx.work.Data androidx.work.ListenableWorker$Result$Failure.getOutputData()>
	//   11   25:astore_1        
		mWorkSpecDao.setOutput(mWorkSpecId, data);
	//   12   26:aload_0         
	//   13   27:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   14   30:aload_0         
	//   15   31:getfield        #102 <Field String mWorkSpecId>
	//   16   34:aload_1         
	//   17   35:invokeinterface #501 <Method void WorkSpecDao.setOutput(String, androidx.work.Data)>
		mWorkDatabase.setTransactionSuccessful();
	//   18   40:aload_0         
	//   19   41:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   20   44:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   21   47:aload_0         
	//   22   48:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   23   51:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   24   54:aload_0         
	//   25   55:iconst_0        
	//   26   56:invokespecial   #313 <Method void resolve(boolean)>
		return;
	//   27   59:return          
		Exception exception;
		exception;
	//   28   60:astore_1        
		mWorkDatabase.endTransaction();
	//   29   61:aload_0         
	//   30   62:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   31   65:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   32   68:aload_0         
	//   33   69:iconst_0        
	//   34   70:invokespecial   #313 <Method void resolve(boolean)>
		throw exception;
	//   35   73:aload_1         
	//   36   74:athrow          
	}

	private void setSucceededAndResolve()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #278 <Method void WorkDatabase.beginTransaction()>
		mWorkSpecDao.setState(androidx.work.WorkInfo.State.SUCCEEDED, new String[] {
			mWorkSpecId
		});
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//    5   11:getstatic       #504 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.SUCCEEDED>
	//    6   14:iconst_1        
	//    7   15:anewarray       String[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #102 <Field String mWorkSpecId>
	//   12   24:aastore         
	//   13   25:invokeinterface #275 <Method int WorkSpecDao.setState(androidx.work.WorkInfo$State, String[])>
	//   14   30:pop             
		Object obj = ((Object) (((androidx.work.ListenableWorker.Result.Success)mResult).getOutputData()));
	//   15   31:aload_0         
	//   16   32:getfield        #83  <Field androidx.work.ListenableWorker$Result mResult>
	//   17   35:checkcast       #206 <Class androidx.work.ListenableWorker$Result$Success>
	//   18   38:invokevirtual   #505 <Method androidx.work.Data androidx.work.ListenableWorker$Result$Success.getOutputData()>
	//   19   41:astore_3        
		mWorkSpecDao.setOutput(mWorkSpecId, ((androidx.work.Data) (obj)));
	//   20   42:aload_0         
	//   21   43:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   22   46:aload_0         
	//   23   47:getfield        #102 <Field String mWorkSpecId>
	//   24   50:aload_3         
	//   25   51:invokeinterface #501 <Method void WorkSpecDao.setOutput(String, androidx.work.Data)>
		long l = System.currentTimeMillis();
	//   26   56:invokestatic    #287 <Method long System.currentTimeMillis()>
	//   27   59:lstore_1        
		obj = ((Object) (mDependencyDao.getDependentWorkIds(mWorkSpecId).iterator()));
	//   28   60:aload_0         
	//   29   61:getfield        #131 <Field DependencyDao mDependencyDao>
	//   30   64:aload_0         
	//   31   65:getfield        #102 <Field String mWorkSpecId>
	//   32   68:invokeinterface #254 <Method List DependencyDao.getDependentWorkIds(String)>
	//   33   73:invokeinterface #181 <Method Iterator List.iterator()>
	//   34   78:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   35   79:aload_3         
	//   36   80:invokeinterface #187 <Method boolean Iterator.hasNext()>
	//   37   85:ifeq            195
			String s = (String)((Iterator) (obj)).next();
	//   38   88:aload_3         
	//   39   89:invokeinterface #191 <Method Object Iterator.next()>
	//   40   94:checkcast       #193 <Class String>
	//   41   97:astore          4
			if(mWorkSpecDao.getState(s) == androidx.work.WorkInfo.State.BLOCKED && mDependencyDao.hasCompletedAllPrerequisites(s))
	//*  42   99:aload_0         
	//*  43  100:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//*  44  103:aload           4
	//*  45  105:invokeinterface #262 <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//*  46  110:getstatic       #508 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.BLOCKED>
	//*  47  113:if_acmpne       79
	//*  48  116:aload_0         
	//*  49  117:getfield        #131 <Field DependencyDao mDependencyDao>
	//*  50  120:aload           4
	//*  51  122:invokeinterface #512 <Method boolean DependencyDao.hasCompletedAllPrerequisites(String)>
	//*  52  127:ifeq            79
			{
				Logger.get().info(TAG, String.format("Setting status to enqueued for %s", new Object[] {
					s
				}), new Throwable[0]);
	//   53  130:invokestatic    #210 <Method Logger Logger.get()>
	//   54  133:getstatic       #70  <Field String TAG>
	//   55  136:ldc2            #514 <String "Setting status to enqueued for %s">
	//   56  139:iconst_1        
	//   57  140:anewarray       Object[]
	//   58  143:dup             
	//   59  144:iconst_0        
	//   60  145:aload           4
	//   61  147:aastore         
	//   62  148:invokestatic    #218 <Method String String.format(String, Object[])>
	//   63  151:iconst_0        
	//   64  152:anewarray       Throwable[]
	//   65  155:invokevirtual   #224 <Method void Logger.info(String, String, Throwable[])>
				mWorkSpecDao.setState(androidx.work.WorkInfo.State.ENQUEUED, new String[] {
					s
				});
	//   66  158:aload_0         
	//   67  159:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   68  162:getstatic       #281 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   69  165:iconst_1        
	//   70  166:anewarray       String[]
	//   71  169:dup             
	//   72  170:iconst_0        
	//   73  171:aload           4
	//   74  173:aastore         
	//   75  174:invokeinterface #275 <Method int WorkSpecDao.setState(androidx.work.WorkInfo$State, String[])>
	//   76  179:pop             
				mWorkSpecDao.setPeriodStartTime(s, l);
	//   77  180:aload_0         
	//   78  181:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   79  184:aload           4
	//   80  186:lload_1         
	//   81  187:invokeinterface #291 <Method void WorkSpecDao.setPeriodStartTime(String, long)>
			}
		} while(true);
	//   82  192:goto            79
		mWorkDatabase.setTransactionSuccessful();
	//   83  195:aload_0         
	//   84  196:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   85  199:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   86  202:aload_0         
	//   87  203:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   88  206:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   89  209:aload_0         
	//   90  210:iconst_0        
	//   91  211:invokespecial   #313 <Method void resolve(boolean)>
		return;
	//   92  214:return          
		Exception exception;
		exception;
	//   93  215:astore_3        
		mWorkDatabase.endTransaction();
	//   94  216:aload_0         
	//   95  217:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   96  220:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   97  223:aload_0         
	//   98  224:iconst_0        
	//   99  225:invokespecial   #313 <Method void resolve(boolean)>
		throw exception;
	//  100  228:aload_3         
	//  101  229:athrow          
	}

	private boolean tryCheckForInterruptionAndResolve()
	{
		if(mInterrupted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #516 <Field boolean mInterrupted>
	//*   2    4:ifeq            74
		{
			Logger.get().debug(TAG, String.format("Work interrupted for %s", new Object[] {
				mWorkDescription
			}), new Throwable[0]);
	//    3    7:invokestatic    #210 <Method Logger Logger.get()>
	//    4   10:getstatic       #70  <Field String TAG>
	//    5   13:ldc2            #518 <String "Work interrupted for %s">
	//    6   16:iconst_1        
	//    7   17:anewarray       Object[]
	//    8   20:dup             
	//    9   21:iconst_0        
	//   10   22:aload_0         
	//   11   23:getfield        #214 <Field String mWorkDescription>
	//   12   26:aastore         
	//   13   27:invokestatic    #218 <Method String String.format(String, Object[])>
	//   14   30:iconst_0        
	//   15   31:anewarray       Throwable[]
	//   16   34:invokevirtual   #364 <Method void Logger.debug(String, String, Throwable[])>
			androidx.work.WorkInfo.State state = mWorkSpecDao.getState(mWorkSpecId);
	//   17   37:aload_0         
	//   18   38:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   19   41:aload_0         
	//   20   42:getfield        #102 <Field String mWorkSpecId>
	//   21   45:invokeinterface #262 <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//   22   50:astore_1        
			if(state == null)
	//*  23   51:aload_1         
	//*  24   52:ifnonnull       62
			{
				resolve(false);
	//   25   55:aload_0         
	//   26   56:iconst_0        
	//   27   57:invokespecial   #313 <Method void resolve(boolean)>
				return true;
	//   28   60:iconst_1        
	//   29   61:ireturn         
			} else
			{
				resolve(state.isFinished() ^ true);
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:invokevirtual   #521 <Method boolean androidx.work.WorkInfo$State.isFinished()>
	//   33   67:iconst_1        
	//   34   68:ixor            
	//   35   69:invokespecial   #313 <Method void resolve(boolean)>
				return true;
	//   36   72:iconst_1        
	//   37   73:ireturn         
			}
		} else
		{
			return false;
	//   38   74:iconst_0        
	//   39   75:ireturn         
		}
	}

	private boolean trySetRunning()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #278 <Method void WorkDatabase.beginTransaction()>
		androidx.work.WorkInfo.State state;
		androidx.work.WorkInfo.State state1;
		state = mWorkSpecDao.getState(mWorkSpecId);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//    5   11:aload_0         
	//    6   12:getfield        #102 <Field String mWorkSpecId>
	//    7   15:invokeinterface #262 <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//    8   20:astore_2        
		state1 = androidx.work.WorkInfo.State.ENQUEUED;
	//    9   21:getstatic       #281 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   10   24:astore_3        
		boolean flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
		if(state != state1) goto _L2; else goto _L1
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:if_acmpne       99
_L1:
		mWorkSpecDao.setState(androidx.work.WorkInfo.State.RUNNING, new String[] {
			mWorkSpecId
		});
	//   16   32:aload_0         
	//   17   33:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   18   36:getstatic       #359 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.RUNNING>
	//   19   39:iconst_1        
	//   20   40:anewarray       String[]
	//   21   43:dup             
	//   22   44:iconst_0        
	//   23   45:aload_0         
	//   24   46:getfield        #102 <Field String mWorkSpecId>
	//   25   49:aastore         
	//   26   50:invokeinterface #275 <Method int WorkSpecDao.setState(androidx.work.WorkInfo$State, String[])>
	//   27   55:pop             
		mWorkSpecDao.incrementWorkSpecRunAttemptCount(mWorkSpecId);
	//   28   56:aload_0         
	//   29   57:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   30   60:aload_0         
	//   31   61:getfield        #102 <Field String mWorkSpecId>
	//   32   64:invokeinterface #524 <Method int WorkSpecDao.incrementWorkSpecRunAttemptCount(String)>
	//   33   69:pop             
	//*  34   70:goto            73
_L4:
		mWorkDatabase.setTransactionSuccessful();
	//   35   73:aload_0         
	//   36   74:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   37   77:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   38   80:aload_0         
	//   39   81:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   40   84:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		return flag;
	//   41   87:iload_1         
	//   42   88:ireturn         
		Exception exception;
		exception;
	//   43   89:astore_2        
		mWorkDatabase.endTransaction();
	//   44   90:aload_0         
	//   45   91:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   46   94:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		throw exception;
	//   47   97:aload_2         
	//   48   98:athrow          
_L2:
		flag = false;
	//   49   99:iconst_0        
	//   50  100:istore_1        
		if(true) goto _L4; else goto _L3
	//   51  101:goto            73
_L3:
	}

	public ListenableFuture getFuture()
	{
		return ((ListenableFuture) (mFuture));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field SettableFuture mFuture>
	//    2    4:areturn         
	}

	public void interrupt(boolean flag)
	{
		mInterrupted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #516 <Field boolean mInterrupted>
		tryCheckForInterruptionAndResolve();
	//    3    5:aload_0         
	//    4    6:invokespecial   #370 <Method boolean tryCheckForInterruptionAndResolve()>
	//    5    9:pop             
		Object obj = ((Object) (mInnerFuture));
	//    6   10:aload_0         
	//    7   11:getfield        #93  <Field ListenableFuture mInnerFuture>
	//    8   14:astore_2        
		if(obj != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          27
			((ListenableFuture) (obj)).cancel(true);
	//   11   19:aload_2         
	//   12   20:iconst_1        
	//   13   21:invokeinterface #535 <Method boolean ListenableFuture.cancel(boolean)>
	//   14   26:pop             
		obj = ((Object) (mWorker));
	//   15   27:aload_0         
	//   16   28:getfield        #111 <Field ListenableWorker mWorker>
	//   17   31:astore_2        
		if(obj != null)
	//*  18   32:aload_2         
	//*  19   33:ifnull          40
			((ListenableWorker) (obj)).stop();
	//   20   36:aload_2         
	//   21   37:invokevirtual   #538 <Method void ListenableWorker.stop()>
	//   22   40:return          
	}

	void onWorkFinished()
	{
		boolean flag;
		boolean flag1;
		assertBackgroundExecutorThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #541 <Method void assertBackgroundExecutorThread()>
		boolean flag2 = tryCheckForInterruptionAndResolve();
	//    2    4:aload_0         
	//    3    5:invokespecial   #370 <Method boolean tryCheckForInterruptionAndResolve()>
	//    4    8:istore_3        
		flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		flag1 = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		if(flag2)
			break MISSING_BLOCK_LABEL_135;
	//    9   13:iload_3         
	//   10   14:ifne            135
		androidx.work.WorkInfo.State state;
		mWorkDatabase.beginTransaction();
	//   11   17:aload_0         
	//   12   18:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   13   21:invokevirtual   #278 <Method void WorkDatabase.beginTransaction()>
		state = mWorkSpecDao.getState(mWorkSpecId);
	//   14   24:aload_0         
	//   15   25:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   16   28:aload_0         
	//   17   29:getfield        #102 <Field String mWorkSpecId>
	//   18   32:invokeinterface #262 <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//   19   37:astore          4
		if(state != null)
			break MISSING_BLOCK_LABEL_54;
	//   20   39:aload           4
	//   21   41:ifnonnull       54
		resolve(false);
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:invokespecial   #313 <Method void resolve(boolean)>
		flag = true;
	//   25   49:iconst_1        
	//   26   50:istore_1        
		break MISSING_BLOCK_LABEL_106;
	//   27   51:goto            106
		if(state == androidx.work.WorkInfo.State.RUNNING)
	//*  28   54:aload           4
	//*  29   56:getstatic       #359 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.RUNNING>
	//*  30   59:if_acmpne       90
		{
			handleResult(mResult);
	//   31   62:aload_0         
	//   32   63:aload_0         
	//   33   64:getfield        #83  <Field androidx.work.ListenableWorker$Result mResult>
	//   34   67:invokespecial   #543 <Method void handleResult(androidx.work.ListenableWorker$Result)>
			flag = mWorkSpecDao.getState(mWorkSpecId).isFinished();
	//   35   70:aload_0         
	//   36   71:getfield        #125 <Field WorkSpecDao mWorkSpecDao>
	//   37   74:aload_0         
	//   38   75:getfield        #102 <Field String mWorkSpecId>
	//   39   78:invokeinterface #262 <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//   40   83:invokevirtual   #521 <Method boolean androidx.work.WorkInfo$State.isFinished()>
	//   41   86:istore_1        
			break MISSING_BLOCK_LABEL_106;
	//   42   87:goto            106
		}
		flag = flag1;
	//   43   90:iload_2         
	//   44   91:istore_1        
		if(state.isFinished())
			break MISSING_BLOCK_LABEL_106;
	//   45   92:aload           4
	//   46   94:invokevirtual   #521 <Method boolean androidx.work.WorkInfo$State.isFinished()>
	//   47   97:ifne            106
		rescheduleAndResolve();
	//   48  100:aload_0         
	//   49  101:invokespecial   #242 <Method void rescheduleAndResolve()>
		flag = flag1;
	//   50  104:iload_2         
	//   51  105:istore_1        
		mWorkDatabase.setTransactionSuccessful();
	//   52  106:aload_0         
	//   53  107:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   54  110:invokevirtual   #306 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   55  113:aload_0         
	//   56  114:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   57  117:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		break MISSING_BLOCK_LABEL_135;
	//   58  120:goto            135
		Exception exception;
		exception;
	//   59  123:astore          4
		mWorkDatabase.endTransaction();
	//   60  125:aload_0         
	//   61  126:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   62  129:invokevirtual   #309 <Method void WorkDatabase.endTransaction()>
		throw exception;
	//   63  132:aload           4
	//   64  134:athrow          
		Object obj = ((Object) (mSchedulers));
	//   65  135:aload_0         
	//   66  136:getfield        #105 <Field List mSchedulers>
	//   67  139:astore          4
		if(obj != null)
	//*  68  141:aload           4
	//*  69  143:ifnull          206
		{
			if(flag)
	//*  70  146:iload_1         
	//*  71  147:ifeq            191
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Scheduler)((Iterator) (obj)).next()).cancel(mWorkSpecId));
	//   72  150:aload           4
	//   73  152:invokeinterface #181 <Method Iterator List.iterator()>
	//   74  157:astore          4
	//   75  159:aload           4
	//   76  161:invokeinterface #187 <Method boolean Iterator.hasNext()>
	//   77  166:ifeq            191
	//   78  169:aload           4
	//   79  171:invokeinterface #191 <Method Object Iterator.next()>
	//   80  176:checkcast       #545 <Class Scheduler>
	//   81  179:aload_0         
	//   82  180:getfield        #102 <Field String mWorkSpecId>
	//   83  183:invokeinterface #547 <Method void Scheduler.cancel(String)>
	//*  84  188:goto            159
			Schedulers.schedule(mConfiguration, mWorkDatabase, mSchedulers);
	//   85  191:aload_0         
	//   86  192:getfield        #114 <Field Configuration mConfiguration>
	//   87  195:aload_0         
	//   88  196:getfield        #117 <Field WorkDatabase mWorkDatabase>
	//   89  199:aload_0         
	//   90  200:getfield        #105 <Field List mSchedulers>
	//   91  203:invokestatic    #553 <Method void Schedulers.schedule(Configuration, WorkDatabase, List)>
		}
		return;
	//   92  206:return          
	}

	public void run()
	{
		mTags = mWorkTagDao.getTagsForWorkSpecId(mWorkSpecId);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #137 <Field WorkTagDao mWorkTagDao>
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field String mWorkSpecId>
	//    5    9:invokeinterface #560 <Method List WorkTagDao.getTagsForWorkSpecId(String)>
	//    6   14:putfield        #429 <Field List mTags>
		mWorkDescription = createWorkDescription(mTags);
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #429 <Field List mTags>
	//   11   23:invokespecial   #562 <Method String createWorkDescription(List)>
	//   12   26:putfield        #214 <Field String mWorkDescription>
		runWorker();
	//   13   29:aload_0         
	//   14   30:invokespecial   #564 <Method void runWorker()>
	//   15   33:return          
	}

	private static final String TAG = Logger.tagWithPrefix("WorkerWrapper");
	private Context mAppContext;
	private Configuration mConfiguration;
	private DependencyDao mDependencyDao;
	private SettableFuture mFuture;
	ListenableFuture mInnerFuture;
	private volatile boolean mInterrupted;
	androidx.work.ListenableWorker.Result mResult;
	private androidx.work.WorkerParameters.RuntimeExtras mRuntimeExtras;
	private List mSchedulers;
	private List mTags;
	private WorkDatabase mWorkDatabase;
	private String mWorkDescription;
	private WorkSpec mWorkSpec;
	private WorkSpecDao mWorkSpecDao;
	private String mWorkSpecId;
	private WorkTagDao mWorkTagDao;
	private TaskExecutor mWorkTaskExecutor;
	ListenableWorker mWorker;

	static 
	{
	//    0    0:ldc1            #62  <String "WorkerWrapper">
	//    1    2:invokestatic    #68  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #70  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #70  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static WorkSpec access$100(WorkerWrapper workerwrapper)
	{
		return workerwrapper.mWorkSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field WorkSpec mWorkSpec>
	//    2    4:areturn         
	}

*/
}
