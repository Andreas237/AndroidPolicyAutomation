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
	//    1    1:invokespecial   #64  <Method void Object()>
		mFuture = SettableFuture.create();
	//    2    4:aload_0         
	//    3    5:invokestatic    #70  <Method SettableFuture SettableFuture.create()>
	//    4    8:putfield        #72  <Field SettableFuture mFuture>
		mInnerFuture = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #74  <Field ListenableFuture mInnerFuture>
		mAppContext = builder.mAppContext;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #76  <Field Context WorkerWrapper$Builder.mAppContext>
	//   11   21:putfield        #77  <Field Context mAppContext>
		mWorkTaskExecutor = builder.mWorkTaskExecutor;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #79  <Field TaskExecutor WorkerWrapper$Builder.mWorkTaskExecutor>
	//   15   29:putfield        #80  <Field TaskExecutor mWorkTaskExecutor>
		mWorkSpecId = builder.mWorkSpecId;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:getfield        #82  <Field String WorkerWrapper$Builder.mWorkSpecId>
	//   19   37:putfield        #83  <Field String mWorkSpecId>
		mSchedulers = builder.mSchedulers;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #85  <Field List WorkerWrapper$Builder.mSchedulers>
	//   23   45:putfield        #86  <Field List mSchedulers>
		mRuntimeExtras = builder.mRuntimeExtras;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #88  <Field androidx.work.WorkerParameters$RuntimeExtras WorkerWrapper$Builder.mRuntimeExtras>
	//   27   53:putfield        #89  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
		mWorker = builder.mWorker;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #91  <Field ListenableWorker WorkerWrapper$Builder.mWorker>
	//   31   61:putfield        #92  <Field ListenableWorker mWorker>
		mConfiguration = builder.mConfiguration;
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getfield        #94  <Field Configuration WorkerWrapper$Builder.mConfiguration>
	//   35   69:putfield        #95  <Field Configuration mConfiguration>
		mWorkDatabase = builder.mWorkDatabase;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:getfield        #97  <Field WorkDatabase WorkerWrapper$Builder.mWorkDatabase>
	//   39   77:putfield        #98  <Field WorkDatabase mWorkDatabase>
		mWorkSpecDao = mWorkDatabase.workSpecDao();
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   43   85:invokevirtual   #104 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   44   88:putfield        #106 <Field WorkSpecDao mWorkSpecDao>
		mDependencyDao = mWorkDatabase.dependencyDao();
	//   45   91:aload_0         
	//   46   92:aload_0         
	//   47   93:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   48   96:invokevirtual   #110 <Method DependencyDao WorkDatabase.dependencyDao()>
	//   49   99:putfield        #112 <Field DependencyDao mDependencyDao>
		mWorkTagDao = mWorkDatabase.workTagDao();
	//   50  102:aload_0         
	//   51  103:aload_0         
	//   52  104:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   53  107:invokevirtual   #116 <Method WorkTagDao WorkDatabase.workTagDao()>
	//   54  110:putfield        #118 <Field WorkTagDao mWorkTagDao>
	//   55  113:return          
	}

	private void assertBackgroundExecutorThread()
	{
		if(mWorkTaskExecutor.getBackgroundExecutorThread() == Thread.currentThread())
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field TaskExecutor mWorkTaskExecutor>
	//*   2    4:invokeinterface #126 <Method Thread TaskExecutor.getBackgroundExecutorThread()>
	//*   3    9:invokestatic    #131 <Method Thread Thread.currentThread()>
	//*   4   12:if_acmpne       16
			return;
	//    5   15:return          
		else
			throw new IllegalStateException("Needs to be executed on the Background executor thread.");
	//    6   16:new             #133 <Class IllegalStateException>
	//    7   19:dup             
	//    8   20:ldc1            #135 <String "Needs to be executed on the Background executor thread.">
	//    9   22:invokespecial   #138 <Method void IllegalStateException(String)>
	//   10   25:athrow          
	}

	private String createWorkDescription(List list)
	{
		StringBuilder stringbuilder = new StringBuilder("Work [ id=");
	//    0    0:new             #142 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #144 <String "Work [ id=">
	//    3    6:invokespecial   #145 <Method void StringBuilder(String)>
	//    4    9:astore_3        
		stringbuilder.append(mWorkSpecId);
	//    5   10:aload_3         
	//    6   11:aload_0         
	//    7   12:getfield        #83  <Field String mWorkSpecId>
	//    8   15:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(", tags={ ");
	//   10   19:aload_3         
	//   11   20:ldc1            #151 <String ", tags={ ">
	//   12   22:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		list = ((List) (list.iterator()));
	//   14   26:aload_1         
	//   15   27:invokeinterface #157 <Method Iterator List.iterator()>
	//   16   32:astore_1        
		boolean flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_2        
		String s;
		for(; ((Iterator) (list)).hasNext(); stringbuilder.append(s))
	//*  19   35:aload_1         
	//*  20   36:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//*  21   41:ifeq            81
		{
			s = (String)((Iterator) (list)).next();
	//   22   44:aload_1         
	//   23   45:invokeinterface #167 <Method Object Iterator.next()>
	//   24   50:checkcast       #169 <Class String>
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
	//   32   65:ldc1            #171 <String ", ">
	//   33   67:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
		}

	//   35   71:aload_3         
	//   36   72:aload           4
	//   37   74:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   38   77:pop             
	//*  39   78:goto            35
		stringbuilder.append(" } ]");
	//   40   81:aload_3         
	//   41   82:ldc1            #173 <String " } ]">
	//   42   84:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		return stringbuilder.toString();
	//   44   88:aload_3         
	//   45   89:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   46   92:areturn         
	}

	private void handleResult(androidx.work.ListenableWorker.Result result)
	{
		static class _cls3
		{

			static final int $SwitchMap$androidx$work$ListenableWorker$Result[];

			static 
			{
				$SwitchMap$androidx$work$ListenableWorker$Result = new int[androidx.work.ListenableWorker.Result.values().length];
			//    0    0:invokestatic    #18  <Method androidx.work.ListenableWorker$Result[] androidx.work.ListenableWorker$Result.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$androidx$work$ListenableWorker$Result>
				try
				{
					$SwitchMap$androidx$work$ListenableWorker$Result[androidx.work.ListenableWorker.Result.SUCCESS.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$androidx$work$ListenableWorker$Result>
			//    5   12:getstatic       #24  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.SUCCESS>
			//    6   15:invokevirtual   #28  <Method int androidx.work.ListenableWorker$Result.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$androidx$work$ListenableWorker$Result>
			//*  10   23:getstatic       #31  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.RETRY>
			//*  11   26:invokevirtual   #28  <Method int androidx.work.ListenableWorker$Result.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$androidx$work$ListenableWorker$Result>
			//*  15   34:getstatic       #34  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.FAILURE>
			//*  16   37:invokevirtual   #28  <Method int androidx.work.ListenableWorker$Result.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$androidx$work$ListenableWorker$Result[androidx.work.ListenableWorker.Result.RETRY.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$androidx$work$ListenableWorker$Result[androidx.work.ListenableWorker.Result.FAILURE.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls3..SwitchMap.androidx.work.ListenableWorker.Result[result.ordinal()])
	//*   0    0:getstatic       #185 <Field int[] WorkerWrapper$3.$SwitchMap$androidx$work$ListenableWorker$Result>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #191 <Method int androidx.work.ListenableWorker$Result.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 102
	//	               2 72
		default:
			Logger.info("WorkerWrapper", String.format("Worker result FAILURE for %s", new Object[] {
				mWorkDescription
			}), new Throwable[0]);
	//    5   32:ldc1            #193 <String "WorkerWrapper">
	//    6   34:ldc1            #195 <String "Worker result FAILURE for %s">
	//    7   36:iconst_1        
	//    8   37:anewarray       Object[]
	//    9   40:dup             
	//   10   41:iconst_0        
	//   11   42:aload_0         
	//   12   43:getfield        #197 <Field String mWorkDescription>
	//   13   46:aastore         
	//   14   47:invokestatic    #201 <Method String String.format(String, Object[])>
	//   15   50:iconst_0        
	//   16   51:anewarray       Throwable[]
	//   17   54:invokestatic    #209 <Method void Logger.info(String, String, Throwable[])>
			if(mWorkSpec.isPeriodic())
	//*  18   57:aload_0         
	//*  19   58:getfield        #211 <Field WorkSpec mWorkSpec>
	//*  20   61:invokevirtual   #216 <Method boolean WorkSpec.isPeriodic()>
	//*  21   64:ifeq            147
			{
				resetPeriodicAndResolve();
	//   22   67:aload_0         
	//   23   68:invokespecial   #219 <Method void resetPeriodicAndResolve()>
				return;
	//   24   71:return          
			} else
	//*  25   72:ldc1            #193 <String "WorkerWrapper">
	//*  26   74:ldc1            #221 <String "Worker result RETRY for %s">
	//*  27   76:iconst_1        
	//*  28   77:anewarray       Object[]
	//*  29   80:dup             
	//*  30   81:iconst_0        
	//*  31   82:aload_0         
	//*  32   83:getfield        #197 <Field String mWorkDescription>
	//*  33   86:aastore         
	//*  34   87:invokestatic    #201 <Method String String.format(String, Object[])>
	//*  35   90:iconst_0        
	//*  36   91:anewarray       Throwable[]
	//*  37   94:invokestatic    #209 <Method void Logger.info(String, String, Throwable[])>
	//*  38   97:aload_0         
	//*  39   98:invokespecial   #224 <Method void rescheduleAndResolve()>
	//*  40  101:return          
	//*  41  102:ldc1            #193 <String "WorkerWrapper">
	//*  42  104:ldc1            #226 <String "Worker result SUCCESS for %s">
	//*  43  106:iconst_1        
	//*  44  107:anewarray       Object[]
	//*  45  110:dup             
	//*  46  111:iconst_0        
	//*  47  112:aload_0         
	//*  48  113:getfield        #197 <Field String mWorkDescription>
	//*  49  116:aastore         
	//*  50  117:invokestatic    #201 <Method String String.format(String, Object[])>
	//*  51  120:iconst_0        
	//*  52  121:anewarray       Throwable[]
	//*  53  124:invokestatic    #209 <Method void Logger.info(String, String, Throwable[])>
	//*  54  127:aload_0         
	//*  55  128:getfield        #211 <Field WorkSpec mWorkSpec>
	//*  56  131:invokevirtual   #216 <Method boolean WorkSpec.isPeriodic()>
	//*  57  134:ifeq            142
	//*  58  137:aload_0         
	//*  59  138:invokespecial   #219 <Method void resetPeriodicAndResolve()>
	//*  60  141:return          
	//*  61  142:aload_0         
	//*  62  143:invokespecial   #229 <Method void setSucceededAndResolve()>
	//*  63  146:return          
			{
				setFailedAndResolve();
	//   64  147:aload_0         
	//   65  148:invokespecial   #232 <Method void setFailedAndResolve()>
				return;
	//   66  151:return          
			}

		case 2: // '\002'
			Logger.info("WorkerWrapper", String.format("Worker result RETRY for %s", new Object[] {
				mWorkDescription
			}), new Throwable[0]);
			rescheduleAndResolve();
			return;

		case 1: // '\001'
			Logger.info("WorkerWrapper", String.format("Worker result SUCCESS for %s", new Object[] {
				mWorkDescription
			}), new Throwable[0]);
			break;
		}
		if(mWorkSpec.isPeriodic())
		{
			resetPeriodicAndResolve();
			return;
		} else
		{
			setSucceededAndResolve();
			return;
		}
	}

	private void recursivelyFailWorkAndDependents(String s)
	{
		for(Iterator iterator = mDependencyDao.getDependentWorkIds(s).iterator(); iterator.hasNext(); recursivelyFailWorkAndDependents((String)iterator.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field DependencyDao mDependencyDao>
	//    2    4:aload_1         
	//    3    5:invokeinterface #239 <Method List DependencyDao.getDependentWorkIds(String)>
	//    4   10:invokeinterface #157 <Method Iterator List.iterator()>
	//    5   15:astore_2        
	//    6   16:aload_2         
	//    7   17:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            41
	//    9   25:aload_0         
	//   10   26:aload_2         
	//   11   27:invokeinterface #167 <Method Object Iterator.next()>
	//   12   32:checkcast       #169 <Class String>
	//   13   35:invokespecial   #241 <Method void recursivelyFailWorkAndDependents(String)>
	//*  14   38:goto            16
		if(mWorkSpecDao.getState(s) != State.CANCELLED)
	//*  15   41:aload_0         
	//*  16   42:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//*  17   45:aload_1         
	//*  18   46:invokeinterface #247 <Method State WorkSpecDao.getState(String)>
	//*  19   51:getstatic       #253 <Field State State.CANCELLED>
	//*  20   54:if_acmpeq       78
			mWorkSpecDao.setState(State.FAILED, new String[] {
				s
			});
	//   21   57:aload_0         
	//   22   58:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   23   61:getstatic       #256 <Field State State.FAILED>
	//   24   64:iconst_1        
	//   25   65:anewarray       String[]
	//   26   68:dup             
	//   27   69:iconst_0        
	//   28   70:aload_1         
	//   29   71:aastore         
	//   30   72:invokeinterface #260 <Method int WorkSpecDao.setState(State, String[])>
	//   31   77:pop             
	//   32   78:return          
	}

	private void rescheduleAndResolve()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #263 <Method void WorkDatabase.beginTransaction()>
		mWorkSpecDao.setState(State.ENQUEUED, new String[] {
			mWorkSpecId
		});
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//    5   11:getstatic       #266 <Field State State.ENQUEUED>
	//    6   14:iconst_1        
	//    7   15:anewarray       String[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #83  <Field String mWorkSpecId>
	//   12   24:aastore         
	//   13   25:invokeinterface #260 <Method int WorkSpecDao.setState(State, String[])>
	//   14   30:pop             
		mWorkSpecDao.setPeriodStartTime(mWorkSpecId, System.currentTimeMillis());
	//   15   31:aload_0         
	//   16   32:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   17   35:aload_0         
	//   18   36:getfield        #83  <Field String mWorkSpecId>
	//   19   39:invokestatic    #272 <Method long System.currentTimeMillis()>
	//   20   42:invokeinterface #276 <Method void WorkSpecDao.setPeriodStartTime(String, long)>
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  21   47:getstatic       #282 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   50:bipush          23
	//*  23   52:icmpge          72
			mWorkSpecDao.markWorkSpecScheduled(mWorkSpecId, -1L);
	//   24   55:aload_0         
	//   25   56:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   26   59:aload_0         
	//   27   60:getfield        #83  <Field String mWorkSpecId>
	//   28   63:ldc2w           #283 <Long -1L>
	//   29   66:invokeinterface #288 <Method int WorkSpecDao.markWorkSpecScheduled(String, long)>
	//   30   71:pop             
		mWorkDatabase.setTransactionSuccessful();
	//   31   72:aload_0         
	//   32   73:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   33   76:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   34   79:aload_0         
	//   35   80:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   36   83:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		resolve(true);
	//   37   86:aload_0         
	//   38   87:iconst_1        
	//   39   88:invokespecial   #298 <Method void resolve(boolean)>
		return;
	//   40   91:return          
		Exception exception;
		exception;
	//   41   92:astore_1        
		mWorkDatabase.endTransaction();
	//   42   93:aload_0         
	//   43   94:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   44   97:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		resolve(true);
	//   45  100:aload_0         
	//   46  101:iconst_1        
	//   47  102:invokespecial   #298 <Method void resolve(boolean)>
		throw exception;
	//   48  105:aload_1         
	//   49  106:athrow          
	}

	private void resetPeriodicAndResolve()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #263 <Method void WorkDatabase.beginTransaction()>
		long l = mWorkSpec.periodStartTime;
	//    3    7:aload_0         
	//    4    8:getfield        #211 <Field WorkSpec mWorkSpec>
	//    5   11:getfield        #302 <Field long WorkSpec.periodStartTime>
	//    6   14:lstore_1        
		long l1 = mWorkSpec.intervalDuration;
	//    7   15:aload_0         
	//    8   16:getfield        #211 <Field WorkSpec mWorkSpec>
	//    9   19:getfield        #305 <Field long WorkSpec.intervalDuration>
	//   10   22:lstore_3        
		mWorkSpecDao.setPeriodStartTime(mWorkSpecId, l + l1);
	//   11   23:aload_0         
	//   12   24:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   13   27:aload_0         
	//   14   28:getfield        #83  <Field String mWorkSpecId>
	//   15   31:lload_1         
	//   16   32:lload_3         
	//   17   33:ladd            
	//   18   34:invokeinterface #276 <Method void WorkSpecDao.setPeriodStartTime(String, long)>
		mWorkSpecDao.setState(State.ENQUEUED, new String[] {
			mWorkSpecId
		});
	//   19   39:aload_0         
	//   20   40:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   21   43:getstatic       #266 <Field State State.ENQUEUED>
	//   22   46:iconst_1        
	//   23   47:anewarray       String[]
	//   24   50:dup             
	//   25   51:iconst_0        
	//   26   52:aload_0         
	//   27   53:getfield        #83  <Field String mWorkSpecId>
	//   28   56:aastore         
	//   29   57:invokeinterface #260 <Method int WorkSpecDao.setState(State, String[])>
	//   30   62:pop             
		mWorkSpecDao.resetWorkSpecRunAttemptCount(mWorkSpecId);
	//   31   63:aload_0         
	//   32   64:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   33   67:aload_0         
	//   34   68:getfield        #83  <Field String mWorkSpecId>
	//   35   71:invokeinterface #309 <Method int WorkSpecDao.resetWorkSpecRunAttemptCount(String)>
	//   36   76:pop             
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  37   77:getstatic       #282 <Field int android.os.Build$VERSION.SDK_INT>
	//*  38   80:bipush          23
	//*  39   82:icmpge          102
			mWorkSpecDao.markWorkSpecScheduled(mWorkSpecId, -1L);
	//   40   85:aload_0         
	//   41   86:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   42   89:aload_0         
	//   43   90:getfield        #83  <Field String mWorkSpecId>
	//   44   93:ldc2w           #283 <Long -1L>
	//   45   96:invokeinterface #288 <Method int WorkSpecDao.markWorkSpecScheduled(String, long)>
	//   46  101:pop             
		mWorkDatabase.setTransactionSuccessful();
	//   47  102:aload_0         
	//   48  103:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   49  106:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   50  109:aload_0         
	//   51  110:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   52  113:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   53  116:aload_0         
	//   54  117:iconst_0        
	//   55  118:invokespecial   #298 <Method void resolve(boolean)>
		return;
	//   56  121:return          
		Exception exception;
		exception;
	//   57  122:astore          5
		mWorkDatabase.endTransaction();
	//   58  124:aload_0         
	//   59  125:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   60  128:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   61  131:aload_0         
	//   62  132:iconst_0        
	//   63  133:invokespecial   #298 <Method void resolve(boolean)>
		throw exception;
	//   64  136:aload           5
	//   65  138:athrow          
	}

	private void resolve(boolean flag)
	{
		List list;
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #263 <Method void WorkDatabase.beginTransaction()>
		list = mWorkDatabase.workSpecDao().getAllUnfinishedWork();
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//    5   11:invokevirtual   #104 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    6   14:invokeinterface #313 <Method List WorkSpecDao.getAllUnfinishedWork()>
	//    7   19:astore_3        
		if(list == null) goto _L2; else goto _L1
	//    8   20:aload_3         
	//    9   21:ifnull          93
_L1:
		boolean flag1;
		Exception exception;
		if(!list.isEmpty())
	//*  10   24:aload_3         
	//*  11   25:invokeinterface #316 <Method boolean List.isEmpty()>
	//*  12   30:ifeq            88
	//*  13   33:goto            93
	//*  14   36:iload_2         
	//*  15   37:ifeq            51
	//*  16   40:aload_0         
	//*  17   41:getfield        #77  <Field Context mAppContext>
	//*  18   44:ldc2            #318 <Class RescheduleReceiver>
	//*  19   47:iconst_0        
	//*  20   48:invokestatic    #324 <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
	//*  21   51:aload_0         
	//*  22   52:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//*  23   55:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
	//*  24   58:aload_0         
	//*  25   59:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//*  26   62:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
	//*  27   65:aload_0         
	//*  28   66:getfield        #72  <Field SettableFuture mFuture>
	//*  29   69:iload_1         
	//*  30   70:invokestatic    #330 <Method Boolean Boolean.valueOf(boolean)>
	//*  31   73:invokevirtual   #334 <Method boolean SettableFuture.set(Object)>
	//*  32   76:pop             
	//*  33   77:return          
	//*  34   78:astore_3        
	//*  35   79:aload_0         
	//*  36   80:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//*  37   83:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
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
		State state = mWorkSpecDao.getState(mWorkSpecId);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field String mWorkSpecId>
	//    4    8:invokeinterface #247 <Method State WorkSpecDao.getState(String)>
	//    5   13:astore_1        
		if(state == State.RUNNING)
	//*   6   14:aload_1         
	//*   7   15:getstatic       #338 <Field State State.RUNNING>
	//*   8   18:if_acmpne       53
		{
			Logger.debug("WorkerWrapper", String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[] {
				mWorkSpecId
			}), new Throwable[0]);
	//    9   21:ldc1            #193 <String "WorkerWrapper">
	//   10   23:ldc2            #340 <String "Status for %s is RUNNING;not doing any work and rescheduling for later execution">
	//   11   26:iconst_1        
	//   12   27:anewarray       Object[]
	//   13   30:dup             
	//   14   31:iconst_0        
	//   15   32:aload_0         
	//   16   33:getfield        #83  <Field String mWorkSpecId>
	//   17   36:aastore         
	//   18   37:invokestatic    #201 <Method String String.format(String, Object[])>
	//   19   40:iconst_0        
	//   20   41:anewarray       Throwable[]
	//   21   44:invokestatic    #343 <Method void Logger.debug(String, String, Throwable[])>
			resolve(true);
	//   22   47:aload_0         
	//   23   48:iconst_1        
	//   24   49:invokespecial   #298 <Method void resolve(boolean)>
			return;
	//   25   52:return          
		} else
		{
			Logger.debug("WorkerWrapper", String.format("Status for %s is %s; not doing any work", new Object[] {
				mWorkSpecId, state
			}), new Throwable[0]);
	//   26   53:ldc1            #193 <String "WorkerWrapper">
	//   27   55:ldc2            #345 <String "Status for %s is %s; not doing any work">
	//   28   58:iconst_2        
	//   29   59:anewarray       Object[]
	//   30   62:dup             
	//   31   63:iconst_0        
	//   32   64:aload_0         
	//   33   65:getfield        #83  <Field String mWorkSpecId>
	//   34   68:aastore         
	//   35   69:dup             
	//   36   70:iconst_1        
	//   37   71:aload_1         
	//   38   72:aastore         
	//   39   73:invokestatic    #201 <Method String String.format(String, Object[])>
	//   40   76:iconst_0        
	//   41   77:anewarray       Throwable[]
	//   42   80:invokestatic    #343 <Method void Logger.debug(String, String, Throwable[])>
			resolve(false);
	//   43   83:aload_0         
	//   44   84:iconst_0        
	//   45   85:invokespecial   #298 <Method void resolve(boolean)>
			return;
	//   46   88:return          
		}
	}

	private void runWorker()
	{
		if(tryCheckForInterruptionAndResolve())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #349 <Method boolean tryCheckForInterruptionAndResolve()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mWorkDatabase.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//    6   12:invokevirtual   #263 <Method void WorkDatabase.beginTransaction()>
		mWorkSpec = mWorkSpecDao.getWorkSpec(mWorkSpecId);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   10   20:aload_0         
	//   11   21:getfield        #83  <Field String mWorkSpecId>
	//   12   24:invokeinterface #353 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   13   29:putfield        #211 <Field WorkSpec mWorkSpec>
		if(mWorkSpec != null)
			break MISSING_BLOCK_LABEL_78;
	//   14   32:aload_0         
	//   15   33:getfield        #211 <Field WorkSpec mWorkSpec>
	//   16   36:ifnonnull       78
		Logger.error("WorkerWrapper", String.format("Didn't find WorkSpec for id %s", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//   17   39:ldc1            #193 <String "WorkerWrapper">
	//   18   41:ldc2            #355 <String "Didn't find WorkSpec for id %s">
	//   19   44:iconst_1        
	//   20   45:anewarray       Object[]
	//   21   48:dup             
	//   22   49:iconst_0        
	//   23   50:aload_0         
	//   24   51:getfield        #83  <Field String mWorkSpecId>
	//   25   54:aastore         
	//   26   55:invokestatic    #201 <Method String String.format(String, Object[])>
	//   27   58:iconst_0        
	//   28   59:anewarray       Throwable[]
	//   29   62:invokestatic    #358 <Method void Logger.error(String, String, Throwable[])>
		resolve(false);
	//   30   65:aload_0         
	//   31   66:iconst_0        
	//   32   67:invokespecial   #298 <Method void resolve(boolean)>
		mWorkDatabase.endTransaction();
	//   33   70:aload_0         
	//   34   71:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   35   74:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		return;
	//   36   77:return          
		if(mWorkSpec.state == State.ENQUEUED)
			break MISSING_BLOCK_LABEL_110;
	//   37   78:aload_0         
	//   38   79:getfield        #211 <Field WorkSpec mWorkSpec>
	//   39   82:getfield        #361 <Field State WorkSpec.state>
	//   40   85:getstatic       #266 <Field State State.ENQUEUED>
	//   41   88:if_acmpeq       110
		resolveIncorrectStatus();
	//   42   91:aload_0         
	//   43   92:invokespecial   #363 <Method void resolveIncorrectStatus()>
		mWorkDatabase.setTransactionSuccessful();
	//   44   95:aload_0         
	//   45   96:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   46   99:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   47  102:aload_0         
	//   48  103:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   49  106:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		return;
	//   50  109:return          
		mWorkDatabase.setTransactionSuccessful();
	//   51  110:aload_0         
	//   52  111:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   53  114:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   54  117:aload_0         
	//   55  118:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   56  121:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		Object obj;
		if(mWorkSpec.isPeriodic())
	//*  57  124:aload_0         
	//*  58  125:getfield        #211 <Field WorkSpec mWorkSpec>
	//*  59  128:invokevirtual   #216 <Method boolean WorkSpec.isPeriodic()>
	//*  60  131:ifeq            145
		{
			obj = ((Object) (mWorkSpec.input));
	//   61  134:aload_0         
	//   62  135:getfield        #211 <Field WorkSpec mWorkSpec>
	//   63  138:getfield        #367 <Field Data WorkSpec.input>
	//   64  141:astore_1        
		} else
	//*  65  142:goto            242
		{
			obj = ((Object) (InputMerger.fromClassName(mWorkSpec.inputMergerClassName)));
	//   66  145:aload_0         
	//   67  146:getfield        #211 <Field WorkSpec mWorkSpec>
	//   68  149:getfield        #370 <Field String WorkSpec.inputMergerClassName>
	//   69  152:invokestatic    #376 <Method InputMerger InputMerger.fromClassName(String)>
	//   70  155:astore_1        
			if(obj == null)
	//*  71  156:aload_1         
	//*  72  157:ifnonnull       194
			{
				Logger.error("WorkerWrapper", String.format("Could not create Input Merger %s", new Object[] {
					mWorkSpec.inputMergerClassName
				}), new Throwable[0]);
	//   73  160:ldc1            #193 <String "WorkerWrapper">
	//   74  162:ldc2            #378 <String "Could not create Input Merger %s">
	//   75  165:iconst_1        
	//   76  166:anewarray       Object[]
	//   77  169:dup             
	//   78  170:iconst_0        
	//   79  171:aload_0         
	//   80  172:getfield        #211 <Field WorkSpec mWorkSpec>
	//   81  175:getfield        #370 <Field String WorkSpec.inputMergerClassName>
	//   82  178:aastore         
	//   83  179:invokestatic    #201 <Method String String.format(String, Object[])>
	//   84  182:iconst_0        
	//   85  183:anewarray       Throwable[]
	//   86  186:invokestatic    #358 <Method void Logger.error(String, String, Throwable[])>
				setFailedAndResolve();
	//   87  189:aload_0         
	//   88  190:invokespecial   #232 <Method void setFailedAndResolve()>
				return;
	//   89  193:return          
			}
			ArrayList arraylist = new ArrayList();
	//   90  194:new             #380 <Class ArrayList>
	//   91  197:dup             
	//   92  198:invokespecial   #381 <Method void ArrayList()>
	//   93  201:astore_2        
			((List) (arraylist)).add(((Object) (mWorkSpec.input)));
	//   94  202:aload_2         
	//   95  203:aload_0         
	//   96  204:getfield        #211 <Field WorkSpec mWorkSpec>
	//   97  207:getfield        #367 <Field Data WorkSpec.input>
	//   98  210:invokeinterface #384 <Method boolean List.add(Object)>
	//   99  215:pop             
			((List) (arraylist)).addAll(((java.util.Collection) (mWorkSpecDao.getInputsFromPrerequisites(mWorkSpecId))));
	//  100  216:aload_2         
	//  101  217:aload_0         
	//  102  218:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//  103  221:aload_0         
	//  104  222:getfield        #83  <Field String mWorkSpecId>
	//  105  225:invokeinterface #387 <Method List WorkSpecDao.getInputsFromPrerequisites(String)>
	//  106  230:invokeinterface #391 <Method boolean List.addAll(java.util.Collection)>
	//  107  235:pop             
			obj = ((Object) (((InputMerger) (obj)).merge(((List) (arraylist)))));
	//  108  236:aload_1         
	//  109  237:aload_2         
	//  110  238:invokevirtual   #395 <Method Data InputMerger.merge(List)>
	//  111  241:astore_1        
		}
		obj = ((Object) (new WorkerParameters(UUID.fromString(mWorkSpecId), ((Data) (obj)), ((java.util.Collection) (mTags)), mRuntimeExtras, mWorkSpec.runAttemptCount, mConfiguration.getExecutor(), mWorkTaskExecutor, mConfiguration.getWorkerFactory())));
	//  112  242:new             #397 <Class WorkerParameters>
	//  113  245:dup             
	//  114  246:aload_0         
	//  115  247:getfield        #83  <Field String mWorkSpecId>
	//  116  250:invokestatic    #403 <Method UUID UUID.fromString(String)>
	//  117  253:aload_1         
	//  118  254:aload_0         
	//  119  255:getfield        #405 <Field List mTags>
	//  120  258:aload_0         
	//  121  259:getfield        #89  <Field androidx.work.WorkerParameters$RuntimeExtras mRuntimeExtras>
	//  122  262:aload_0         
	//  123  263:getfield        #211 <Field WorkSpec mWorkSpec>
	//  124  266:getfield        #408 <Field int WorkSpec.runAttemptCount>
	//  125  269:aload_0         
	//  126  270:getfield        #95  <Field Configuration mConfiguration>
	//  127  273:invokevirtual   #414 <Method Executor Configuration.getExecutor()>
	//  128  276:aload_0         
	//  129  277:getfield        #80  <Field TaskExecutor mWorkTaskExecutor>
	//  130  280:aload_0         
	//  131  281:getfield        #95  <Field Configuration mConfiguration>
	//  132  284:invokevirtual   #418 <Method WorkerFactory Configuration.getWorkerFactory()>
	//  133  287:invokespecial   #421 <Method void WorkerParameters(UUID, Data, java.util.Collection, androidx.work.WorkerParameters$RuntimeExtras, int, Executor, TaskExecutor, WorkerFactory)>
	//  134  290:astore_1        
		if(mWorker == null)
	//* 135  291:aload_0         
	//* 136  292:getfield        #92  <Field ListenableWorker mWorker>
	//* 137  295:ifnonnull       324
			mWorker = mConfiguration.getWorkerFactory().createWorkerWithDefaultFallback(mAppContext, mWorkSpec.workerClassName, ((WorkerParameters) (obj)));
	//  138  298:aload_0         
	//  139  299:aload_0         
	//  140  300:getfield        #95  <Field Configuration mConfiguration>
	//  141  303:invokevirtual   #418 <Method WorkerFactory Configuration.getWorkerFactory()>
	//  142  306:aload_0         
	//  143  307:getfield        #77  <Field Context mAppContext>
	//  144  310:aload_0         
	//  145  311:getfield        #211 <Field WorkSpec mWorkSpec>
	//  146  314:getfield        #424 <Field String WorkSpec.workerClassName>
	//  147  317:aload_1         
	//  148  318:invokevirtual   #430 <Method ListenableWorker WorkerFactory.createWorkerWithDefaultFallback(Context, String, WorkerParameters)>
	//  149  321:putfield        #92  <Field ListenableWorker mWorker>
		obj = ((Object) (mWorker));
	//  150  324:aload_0         
	//  151  325:getfield        #92  <Field ListenableWorker mWorker>
	//  152  328:astore_1        
		if(obj == null)
	//* 153  329:aload_1         
	//* 154  330:ifnonnull       367
		{
			Logger.error("WorkerWrapper", String.format("Could not create Worker %s", new Object[] {
				mWorkSpec.workerClassName
			}), new Throwable[0]);
	//  155  333:ldc1            #193 <String "WorkerWrapper">
	//  156  335:ldc2            #432 <String "Could not create Worker %s">
	//  157  338:iconst_1        
	//  158  339:anewarray       Object[]
	//  159  342:dup             
	//  160  343:iconst_0        
	//  161  344:aload_0         
	//  162  345:getfield        #211 <Field WorkSpec mWorkSpec>
	//  163  348:getfield        #424 <Field String WorkSpec.workerClassName>
	//  164  351:aastore         
	//  165  352:invokestatic    #201 <Method String String.format(String, Object[])>
	//  166  355:iconst_0        
	//  167  356:anewarray       Throwable[]
	//  168  359:invokestatic    #358 <Method void Logger.error(String, String, Throwable[])>
			setFailedAndResolve();
	//  169  362:aload_0         
	//  170  363:invokespecial   #232 <Method void setFailedAndResolve()>
			return;
	//  171  366:return          
		}
		if(((ListenableWorker) (obj)).isUsed())
	//* 172  367:aload_1         
	//* 173  368:invokevirtual   #437 <Method boolean ListenableWorker.isUsed()>
	//* 174  371:ifeq            408
		{
			Logger.error("WorkerWrapper", String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[] {
				mWorkSpec.workerClassName
			}), new Throwable[0]);
	//  175  374:ldc1            #193 <String "WorkerWrapper">
	//  176  376:ldc2            #439 <String "Received an already-used Worker %s; WorkerFactory should return new instances">
	//  177  379:iconst_1        
	//  178  380:anewarray       Object[]
	//  179  383:dup             
	//  180  384:iconst_0        
	//  181  385:aload_0         
	//  182  386:getfield        #211 <Field WorkSpec mWorkSpec>
	//  183  389:getfield        #424 <Field String WorkSpec.workerClassName>
	//  184  392:aastore         
	//  185  393:invokestatic    #201 <Method String String.format(String, Object[])>
	//  186  396:iconst_0        
	//  187  397:anewarray       Throwable[]
	//  188  400:invokestatic    #358 <Method void Logger.error(String, String, Throwable[])>
			setFailedAndResolve();
	//  189  403:aload_0         
	//  190  404:invokespecial   #232 <Method void setFailedAndResolve()>
			return;
	//  191  407:return          
		}
		mWorker.setUsed();
	//  192  408:aload_0         
	//  193  409:getfield        #92  <Field ListenableWorker mWorker>
	//  194  412:invokevirtual   #442 <Method void ListenableWorker.setUsed()>
		if(trySetRunning())
	//* 195  415:aload_0         
	//* 196  416:invokespecial   #445 <Method boolean trySetRunning()>
	//* 197  419:ifeq            484
		{
			if(tryCheckForInterruptionAndResolve())
	//* 198  422:aload_0         
	//* 199  423:invokespecial   #349 <Method boolean tryCheckForInterruptionAndResolve()>
	//* 200  426:ifeq            430
			{
				return;
	//  201  429:return          
			} else
			{
				final SettableFuture future = SettableFuture.create();
	//  202  430:invokestatic    #70  <Method SettableFuture SettableFuture.create()>
	//  203  433:astore_1        
				mWorkTaskExecutor.getMainThreadExecutor().execute(new Runnable() {

					public void run()
					{
						try
						{
							mInnerFuture = mWorker.onStartWork();
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field WorkerWrapper this$0>
					//    2    4:aload_0         
					//    3    5:getfield        #19  <Field WorkerWrapper this$0>
					//    4    8:getfield        #31  <Field ListenableWorker WorkerWrapper.mWorker>
					//    5   11:invokevirtual   #37  <Method ListenableFuture ListenableWorker.onStartWork()>
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
	//  204  434:aload_0         
	//  205  435:getfield        #80  <Field TaskExecutor mWorkTaskExecutor>
	//  206  438:invokeinterface #448 <Method Executor TaskExecutor.getMainThreadExecutor()>
	//  207  443:new             #8   <Class WorkerWrapper$1>
	//  208  446:dup             
	//  209  447:aload_0         
	//  210  448:aload_1         
	//  211  449:invokespecial   #451 <Method void WorkerWrapper$1(WorkerWrapper, SettableFuture)>
	//  212  452:invokeinterface #457 <Method void Executor.execute(Runnable)>
				future.addListener(new Runnable() {

					public void run()
					{
						mPayload = (androidx.work.ListenableWorker.Payload)future.get();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field WorkerWrapper this$0>
					//    2    4:aload_0         
					//    3    5:getfield        #23  <Field SettableFuture val$future>
					//    4    8:invokevirtual   #41  <Method Object SettableFuture.get()>
					//    5   11:checkcast       #43  <Class androidx.work.ListenableWorker$Payload>
					//    6   14:putfield        #47  <Field androidx.work.ListenableWorker$Payload WorkerWrapper.mPayload>
_L2:
						onWorkFinished();
					//    7   17:aload_0         
					//    8   18:getfield        #21  <Field WorkerWrapper this$0>
					//    9   21:invokevirtual   #50  <Method void WorkerWrapper.onWorkFinished()>
						return;
					//   10   24:return          
						Object obj1;
						obj1;
					//   11   25:astore_1        
						break; /* Loop/switch isn't completed */
					//   12   26:goto            90
						obj1;
					//   13   29:astore_1        
						break MISSING_BLOCK_LABEL_38;
					//   14   30:goto            38
						obj1;
					//   15   33:astore_1        
						break MISSING_BLOCK_LABEL_38;
					//   16   34:goto            38
						obj1;
					//   17   37:astore_1        
						Logger.error("WorkerWrapper", String.format("%s failed because it threw an exception/error", new Object[] {
							workDescription
						}), new Throwable[] {
							obj1
						});
					//   18   38:ldc1            #52  <String "WorkerWrapper">
					//   19   40:ldc1            #54  <String "%s failed because it threw an exception/error">
					//   20   42:iconst_1        
					//   21   43:anewarray       Object[]
					//   22   46:dup             
					//   23   47:iconst_0        
					//   24   48:aload_0         
					//   25   49:getfield        #25  <Field String val$workDescription>
					//   26   52:aastore         
					//   27   53:invokestatic    #60  <Method String String.format(String, Object[])>
					//   28   56:iconst_1        
					//   29   57:anewarray       Throwable[]
					//   30   60:dup             
					//   31   61:iconst_0        
					//   32   62:aload_1         
					//   33   63:aastore         
					//   34   64:invokestatic    #68  <Method void Logger.error(String, String, Throwable[])>
						mPayload = new androidx.work.ListenableWorker.Payload(androidx.work.ListenableWorker.Result.FAILURE, Data.EMPTY);
					//   35   67:aload_0         
					//   36   68:getfield        #21  <Field WorkerWrapper this$0>
					//   37   71:new             #43  <Class androidx.work.ListenableWorker$Payload>
					//   38   74:dup             
					//   39   75:getstatic       #74  <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.FAILURE>
					//   40   78:getstatic       #80  <Field Data Data.EMPTY>
					//   41   81:invokespecial   #83  <Method void androidx.work.ListenableWorker$Payload(androidx.work.ListenableWorker$Result, Data)>
					//   42   84:putfield        #47  <Field androidx.work.ListenableWorker$Payload WorkerWrapper.mPayload>
						if(true) goto _L2; else goto _L1
					//   43   87:goto            17
_L1:
						onWorkFinished();
					//   44   90:aload_0         
					//   45   91:getfield        #21  <Field WorkerWrapper this$0>
					//   46   94:invokevirtual   #50  <Method void WorkerWrapper.onWorkFinished()>
						throw obj1;
					//   47   97:aload_1         
					//   48   98:athrow          
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
	//  213  457:aload_1         
	//  214  458:new             #10  <Class WorkerWrapper$2>
	//  215  461:dup             
	//  216  462:aload_0         
	//  217  463:aload_1         
	//  218  464:aload_0         
	//  219  465:getfield        #197 <Field String mWorkDescription>
	//  220  468:invokespecial   #460 <Method void WorkerWrapper$2(WorkerWrapper, SettableFuture, String)>
	//  221  471:aload_0         
	//  222  472:getfield        #80  <Field TaskExecutor mWorkTaskExecutor>
	//  223  475:invokeinterface #463 <Method Executor TaskExecutor.getBackgroundExecutor()>
	//  224  480:invokevirtual   #467 <Method void SettableFuture.addListener(Runnable, Executor)>
				return;
	//  225  483:return          
			}
		} else
		{
			resolveIncorrectStatus();
	//  226  484:aload_0         
	//  227  485:invokespecial   #363 <Method void resolveIncorrectStatus()>
			return;
	//  228  488:return          
		}
		Exception exception;
		exception;
	//  229  489:astore_1        
		mWorkDatabase.endTransaction();
	//  230  490:aload_0         
	//  231  491:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//  232  494:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		throw exception;
	//  233  497:aload_1         
	//  234  498:athrow          
	}

	private void setFailedAndResolve()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #263 <Method void WorkDatabase.beginTransaction()>
		recursivelyFailWorkAndDependents(mWorkSpecId);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #83  <Field String mWorkSpecId>
	//    6   12:invokespecial   #241 <Method void recursivelyFailWorkAndDependents(String)>
		if(mPayload != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #469 <Field androidx.work.ListenableWorker$Payload mPayload>
	//*   9   19:ifnull          44
		{
			Data data = mPayload.getOutputData();
	//   10   22:aload_0         
	//   11   23:getfield        #469 <Field androidx.work.ListenableWorker$Payload mPayload>
	//   12   26:invokevirtual   #475 <Method Data androidx.work.ListenableWorker$Payload.getOutputData()>
	//   13   29:astore_1        
			mWorkSpecDao.setOutput(mWorkSpecId, data);
	//   14   30:aload_0         
	//   15   31:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   16   34:aload_0         
	//   17   35:getfield        #83  <Field String mWorkSpecId>
	//   18   38:aload_1         
	//   19   39:invokeinterface #479 <Method void WorkSpecDao.setOutput(String, Data)>
		}
		mWorkDatabase.setTransactionSuccessful();
	//   20   44:aload_0         
	//   21   45:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   22   48:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   23   51:aload_0         
	//   24   52:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   25   55:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:invokespecial   #298 <Method void resolve(boolean)>
		return;
	//   29   63:return          
		Exception exception;
		exception;
	//   30   64:astore_1        
		mWorkDatabase.endTransaction();
	//   31   65:aload_0         
	//   32   66:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   33   69:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   34   72:aload_0         
	//   35   73:iconst_0        
	//   36   74:invokespecial   #298 <Method void resolve(boolean)>
		throw exception;
	//   37   77:aload_1         
	//   38   78:athrow          
	}

	private void setSucceededAndResolve()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #263 <Method void WorkDatabase.beginTransaction()>
		mWorkSpecDao.setState(State.SUCCEEDED, new String[] {
			mWorkSpecId
		});
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//    5   11:getstatic       #482 <Field State State.SUCCEEDED>
	//    6   14:iconst_1        
	//    7   15:anewarray       String[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #83  <Field String mWorkSpecId>
	//   12   24:aastore         
	//   13   25:invokeinterface #260 <Method int WorkSpecDao.setState(State, String[])>
	//   14   30:pop             
		Object obj = ((Object) (mPayload.getOutputData()));
	//   15   31:aload_0         
	//   16   32:getfield        #469 <Field androidx.work.ListenableWorker$Payload mPayload>
	//   17   35:invokevirtual   #475 <Method Data androidx.work.ListenableWorker$Payload.getOutputData()>
	//   18   38:astore_3        
		mWorkSpecDao.setOutput(mWorkSpecId, ((Data) (obj)));
	//   19   39:aload_0         
	//   20   40:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   21   43:aload_0         
	//   22   44:getfield        #83  <Field String mWorkSpecId>
	//   23   47:aload_3         
	//   24   48:invokeinterface #479 <Method void WorkSpecDao.setOutput(String, Data)>
		long l = System.currentTimeMillis();
	//   25   53:invokestatic    #272 <Method long System.currentTimeMillis()>
	//   26   56:lstore_1        
		obj = ((Object) (mDependencyDao.getDependentWorkIds(mWorkSpecId).iterator()));
	//   27   57:aload_0         
	//   28   58:getfield        #112 <Field DependencyDao mDependencyDao>
	//   29   61:aload_0         
	//   30   62:getfield        #83  <Field String mWorkSpecId>
	//   31   65:invokeinterface #239 <Method List DependencyDao.getDependentWorkIds(String)>
	//   32   70:invokeinterface #157 <Method Iterator List.iterator()>
	//   33   75:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   34   76:aload_3         
	//   35   77:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//   36   82:ifeq            171
			String s = (String)((Iterator) (obj)).next();
	//   37   85:aload_3         
	//   38   86:invokeinterface #167 <Method Object Iterator.next()>
	//   39   91:checkcast       #169 <Class String>
	//   40   94:astore          4
			if(mDependencyDao.hasCompletedAllPrerequisites(s))
	//*  41   96:aload_0         
	//*  42   97:getfield        #112 <Field DependencyDao mDependencyDao>
	//*  43  100:aload           4
	//*  44  102:invokeinterface #486 <Method boolean DependencyDao.hasCompletedAllPrerequisites(String)>
	//*  45  107:ifeq            76
			{
				Logger.info("WorkerWrapper", String.format("Setting status to enqueued for %s", new Object[] {
					s
				}), new Throwable[0]);
	//   46  110:ldc1            #193 <String "WorkerWrapper">
	//   47  112:ldc2            #488 <String "Setting status to enqueued for %s">
	//   48  115:iconst_1        
	//   49  116:anewarray       Object[]
	//   50  119:dup             
	//   51  120:iconst_0        
	//   52  121:aload           4
	//   53  123:aastore         
	//   54  124:invokestatic    #201 <Method String String.format(String, Object[])>
	//   55  127:iconst_0        
	//   56  128:anewarray       Throwable[]
	//   57  131:invokestatic    #209 <Method void Logger.info(String, String, Throwable[])>
				mWorkSpecDao.setState(State.ENQUEUED, new String[] {
					s
				});
	//   58  134:aload_0         
	//   59  135:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   60  138:getstatic       #266 <Field State State.ENQUEUED>
	//   61  141:iconst_1        
	//   62  142:anewarray       String[]
	//   63  145:dup             
	//   64  146:iconst_0        
	//   65  147:aload           4
	//   66  149:aastore         
	//   67  150:invokeinterface #260 <Method int WorkSpecDao.setState(State, String[])>
	//   68  155:pop             
				mWorkSpecDao.setPeriodStartTime(s, l);
	//   69  156:aload_0         
	//   70  157:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   71  160:aload           4
	//   72  162:lload_1         
	//   73  163:invokeinterface #276 <Method void WorkSpecDao.setPeriodStartTime(String, long)>
			}
		} while(true);
	//   74  168:goto            76
		mWorkDatabase.setTransactionSuccessful();
	//   75  171:aload_0         
	//   76  172:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   77  175:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   78  178:aload_0         
	//   79  179:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   80  182:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   81  185:aload_0         
	//   82  186:iconst_0        
	//   83  187:invokespecial   #298 <Method void resolve(boolean)>
		return;
	//   84  190:return          
		Exception exception;
		exception;
	//   85  191:astore_3        
		mWorkDatabase.endTransaction();
	//   86  192:aload_0         
	//   87  193:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   88  196:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		resolve(false);
	//   89  199:aload_0         
	//   90  200:iconst_0        
	//   91  201:invokespecial   #298 <Method void resolve(boolean)>
		throw exception;
	//   92  204:aload_3         
	//   93  205:athrow          
	}

	private boolean tryCheckForInterruptionAndResolve()
	{
		if(mInterrupted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #490 <Field boolean mInterrupted>
	//*   2    4:ifeq            70
		{
			Logger.info("WorkerWrapper", String.format("Work interrupted for %s", new Object[] {
				mWorkDescription
			}), new Throwable[0]);
	//    3    7:ldc1            #193 <String "WorkerWrapper">
	//    4    9:ldc2            #492 <String "Work interrupted for %s">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_0         
	//   10   19:getfield        #197 <Field String mWorkDescription>
	//   11   22:aastore         
	//   12   23:invokestatic    #201 <Method String String.format(String, Object[])>
	//   13   26:iconst_0        
	//   14   27:anewarray       Throwable[]
	//   15   30:invokestatic    #209 <Method void Logger.info(String, String, Throwable[])>
			State state = mWorkSpecDao.getState(mWorkSpecId);
	//   16   33:aload_0         
	//   17   34:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   18   37:aload_0         
	//   19   38:getfield        #83  <Field String mWorkSpecId>
	//   20   41:invokeinterface #247 <Method State WorkSpecDao.getState(String)>
	//   21   46:astore_1        
			if(state == null)
	//*  22   47:aload_1         
	//*  23   48:ifnonnull       58
			{
				resolve(false);
	//   24   51:aload_0         
	//   25   52:iconst_0        
	//   26   53:invokespecial   #298 <Method void resolve(boolean)>
				return true;
	//   27   56:iconst_1        
	//   28   57:ireturn         
			} else
			{
				resolve(state.isFinished() ^ true);
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #495 <Method boolean State.isFinished()>
	//   32   63:iconst_1        
	//   33   64:ixor            
	//   34   65:invokespecial   #298 <Method void resolve(boolean)>
				return true;
	//   35   68:iconst_1        
	//   36   69:ireturn         
			}
		} else
		{
			return false;
	//   37   70:iconst_0        
	//   38   71:ireturn         
		}
	}

	private boolean trySetRunning()
	{
		mWorkDatabase.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//    2    4:invokevirtual   #263 <Method void WorkDatabase.beginTransaction()>
		State state;
		State state1;
		state = mWorkSpecDao.getState(mWorkSpecId);
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//    5   11:aload_0         
	//    6   12:getfield        #83  <Field String mWorkSpecId>
	//    7   15:invokeinterface #247 <Method State WorkSpecDao.getState(String)>
	//    8   20:astore_2        
		state1 = State.ENQUEUED;
	//    9   21:getstatic       #266 <Field State State.ENQUEUED>
	//   10   24:astore_3        
		boolean flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
		if(state != state1) goto _L2; else goto _L1
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:if_acmpne       99
_L1:
		mWorkSpecDao.setState(State.RUNNING, new String[] {
			mWorkSpecId
		});
	//   16   32:aload_0         
	//   17   33:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   18   36:getstatic       #338 <Field State State.RUNNING>
	//   19   39:iconst_1        
	//   20   40:anewarray       String[]
	//   21   43:dup             
	//   22   44:iconst_0        
	//   23   45:aload_0         
	//   24   46:getfield        #83  <Field String mWorkSpecId>
	//   25   49:aastore         
	//   26   50:invokeinterface #260 <Method int WorkSpecDao.setState(State, String[])>
	//   27   55:pop             
		mWorkSpecDao.incrementWorkSpecRunAttemptCount(mWorkSpecId);
	//   28   56:aload_0         
	//   29   57:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   30   60:aload_0         
	//   31   61:getfield        #83  <Field String mWorkSpecId>
	//   32   64:invokeinterface #498 <Method int WorkSpecDao.incrementWorkSpecRunAttemptCount(String)>
	//   33   69:pop             
	//*  34   70:goto            73
_L4:
		mWorkDatabase.setTransactionSuccessful();
	//   35   73:aload_0         
	//   36   74:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   37   77:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   38   80:aload_0         
	//   39   81:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   40   84:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		return flag;
	//   41   87:iload_1         
	//   42   88:ireturn         
		Exception exception;
		exception;
	//   43   89:astore_2        
		mWorkDatabase.endTransaction();
	//   44   90:aload_0         
	//   45   91:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   46   94:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
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
	//    1    1:getfield        #72  <Field SettableFuture mFuture>
	//    2    4:areturn         
	}

	public void interrupt(boolean flag)
	{
		mInterrupted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #490 <Field boolean mInterrupted>
		tryCheckForInterruptionAndResolve();
	//    3    5:aload_0         
	//    4    6:invokespecial   #349 <Method boolean tryCheckForInterruptionAndResolve()>
	//    5    9:pop             
		Object obj = ((Object) (mInnerFuture));
	//    6   10:aload_0         
	//    7   11:getfield        #74  <Field ListenableFuture mInnerFuture>
	//    8   14:astore_2        
		if(obj != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          27
			((ListenableFuture) (obj)).cancel(true);
	//   11   19:aload_2         
	//   12   20:iconst_1        
	//   13   21:invokeinterface #509 <Method boolean ListenableFuture.cancel(boolean)>
	//   14   26:pop             
		obj = ((Object) (mWorker));
	//   15   27:aload_0         
	//   16   28:getfield        #92  <Field ListenableWorker mWorker>
	//   17   31:astore_2        
		if(obj != null)
	//*  18   32:aload_2         
	//*  19   33:ifnull          41
			((ListenableWorker) (obj)).stop(flag);
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:invokevirtual   #512 <Method void ListenableWorker.stop(boolean)>
	//   23   41:return          
	}

	void onWorkFinished()
	{
		boolean flag;
		boolean flag1;
		assertBackgroundExecutorThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #515 <Method void assertBackgroundExecutorThread()>
		boolean flag2 = tryCheckForInterruptionAndResolve();
	//    2    4:aload_0         
	//    3    5:invokespecial   #349 <Method boolean tryCheckForInterruptionAndResolve()>
	//    4    8:istore_3        
		flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		flag1 = false;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		if(flag2)
			break MISSING_BLOCK_LABEL_138;
	//    9   13:iload_3         
	//   10   14:ifne            138
		State state;
		mWorkDatabase.beginTransaction();
	//   11   17:aload_0         
	//   12   18:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   13   21:invokevirtual   #263 <Method void WorkDatabase.beginTransaction()>
		state = mWorkSpecDao.getState(mWorkSpecId);
	//   14   24:aload_0         
	//   15   25:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   16   28:aload_0         
	//   17   29:getfield        #83  <Field String mWorkSpecId>
	//   18   32:invokeinterface #247 <Method State WorkSpecDao.getState(String)>
	//   19   37:astore          4
		if(state != null)
			break MISSING_BLOCK_LABEL_54;
	//   20   39:aload           4
	//   21   41:ifnonnull       54
		resolve(false);
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:invokespecial   #298 <Method void resolve(boolean)>
		flag = true;
	//   25   49:iconst_1        
	//   26   50:istore_1        
		break MISSING_BLOCK_LABEL_109;
	//   27   51:goto            109
		if(state == State.RUNNING)
	//*  28   54:aload           4
	//*  29   56:getstatic       #338 <Field State State.RUNNING>
	//*  30   59:if_acmpne       93
		{
			handleResult(mPayload.getResult());
	//   31   62:aload_0         
	//   32   63:aload_0         
	//   33   64:getfield        #469 <Field androidx.work.ListenableWorker$Payload mPayload>
	//   34   67:invokevirtual   #519 <Method androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Payload.getResult()>
	//   35   70:invokespecial   #521 <Method void handleResult(androidx.work.ListenableWorker$Result)>
			flag = mWorkSpecDao.getState(mWorkSpecId).isFinished();
	//   36   73:aload_0         
	//   37   74:getfield        #106 <Field WorkSpecDao mWorkSpecDao>
	//   38   77:aload_0         
	//   39   78:getfield        #83  <Field String mWorkSpecId>
	//   40   81:invokeinterface #247 <Method State WorkSpecDao.getState(String)>
	//   41   86:invokevirtual   #495 <Method boolean State.isFinished()>
	//   42   89:istore_1        
			break MISSING_BLOCK_LABEL_109;
	//   43   90:goto            109
		}
		flag = flag1;
	//   44   93:iload_2         
	//   45   94:istore_1        
		if(state.isFinished())
			break MISSING_BLOCK_LABEL_109;
	//   46   95:aload           4
	//   47   97:invokevirtual   #495 <Method boolean State.isFinished()>
	//   48  100:ifne            109
		rescheduleAndResolve();
	//   49  103:aload_0         
	//   50  104:invokespecial   #224 <Method void rescheduleAndResolve()>
		flag = flag1;
	//   51  107:iload_2         
	//   52  108:istore_1        
		mWorkDatabase.setTransactionSuccessful();
	//   53  109:aload_0         
	//   54  110:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   55  113:invokevirtual   #291 <Method void WorkDatabase.setTransactionSuccessful()>
		mWorkDatabase.endTransaction();
	//   56  116:aload_0         
	//   57  117:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   58  120:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		break MISSING_BLOCK_LABEL_138;
	//   59  123:goto            138
		Exception exception;
		exception;
	//   60  126:astore          4
		mWorkDatabase.endTransaction();
	//   61  128:aload_0         
	//   62  129:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   63  132:invokevirtual   #294 <Method void WorkDatabase.endTransaction()>
		throw exception;
	//   64  135:aload           4
	//   65  137:athrow          
		Object obj = ((Object) (mSchedulers));
	//   66  138:aload_0         
	//   67  139:getfield        #86  <Field List mSchedulers>
	//   68  142:astore          4
		if(obj != null)
	//*  69  144:aload           4
	//*  70  146:ifnull          209
		{
			if(flag)
	//*  71  149:iload_1         
	//*  72  150:ifeq            194
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Scheduler)((Iterator) (obj)).next()).cancel(mWorkSpecId));
	//   73  153:aload           4
	//   74  155:invokeinterface #157 <Method Iterator List.iterator()>
	//   75  160:astore          4
	//   76  162:aload           4
	//   77  164:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//   78  169:ifeq            194
	//   79  172:aload           4
	//   80  174:invokeinterface #167 <Method Object Iterator.next()>
	//   81  179:checkcast       #523 <Class Scheduler>
	//   82  182:aload_0         
	//   83  183:getfield        #83  <Field String mWorkSpecId>
	//   84  186:invokeinterface #525 <Method void Scheduler.cancel(String)>
	//*  85  191:goto            162
			Schedulers.schedule(mConfiguration, mWorkDatabase, mSchedulers);
	//   86  194:aload_0         
	//   87  195:getfield        #95  <Field Configuration mConfiguration>
	//   88  198:aload_0         
	//   89  199:getfield        #98  <Field WorkDatabase mWorkDatabase>
	//   90  202:aload_0         
	//   91  203:getfield        #86  <Field List mSchedulers>
	//   92  206:invokestatic    #531 <Method void Schedulers.schedule(Configuration, WorkDatabase, List)>
		}
		return;
	//   93  209:return          
	}

	public void run()
	{
		mTags = mWorkTagDao.getTagsForWorkSpecId(mWorkSpecId);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #118 <Field WorkTagDao mWorkTagDao>
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field String mWorkSpecId>
	//    5    9:invokeinterface #538 <Method List WorkTagDao.getTagsForWorkSpecId(String)>
	//    6   14:putfield        #405 <Field List mTags>
		mWorkDescription = createWorkDescription(mTags);
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #405 <Field List mTags>
	//   11   23:invokespecial   #540 <Method String createWorkDescription(List)>
	//   12   26:putfield        #197 <Field String mWorkDescription>
		runWorker();
	//   13   29:aload_0         
	//   14   30:invokespecial   #542 <Method void runWorker()>
	//   15   33:return          
	}

	private Context mAppContext;
	private Configuration mConfiguration;
	private DependencyDao mDependencyDao;
	private SettableFuture mFuture;
	ListenableFuture mInnerFuture;
	private volatile boolean mInterrupted;
	androidx.work.ListenableWorker.Payload mPayload;
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
}
