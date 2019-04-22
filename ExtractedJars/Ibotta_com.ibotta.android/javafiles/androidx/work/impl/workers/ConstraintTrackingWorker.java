// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.*;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;
import java.util.concurrent.Executor;

public class ConstraintTrackingWorker extends ListenableWorker
	implements WorkConstraintsCallback
{

	public ConstraintTrackingWorker(Context context, WorkerParameters workerparameters)
	{
		super(context, workerparameters);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void ListenableWorker(Context, WorkerParameters)>
		mWorkerParameters = workerparameters;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #33  <Field WorkerParameters mWorkerParameters>
	//    7   11:aload_0         
	//    8   12:new             #35  <Class Object>
	//    9   15:dup             
	//   10   16:invokespecial   #38  <Method void Object()>
	//   11   19:putfield        #40  <Field Object mLock>
		mAreConstraintsUnmet = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #42  <Field boolean mAreConstraintsUnmet>
		mFuture = SettableFuture.create();
	//   15   27:aload_0         
	//   16   28:invokestatic    #48  <Method SettableFuture SettableFuture.create()>
	//   17   31:putfield        #50  <Field SettableFuture mFuture>
	//   18   34:return          
	}

	public WorkDatabase getWorkDatabase()
	{
		return WorkManagerImpl.getInstance().getWorkDatabase();
	//    0    0:invokestatic    #61  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//    1    3:invokevirtual   #63  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    2    6:areturn         
	}

	public void onAllConstraintsMet(List list)
	{
	//    0    0:return          
	}

	public void onAllConstraintsNotMet(List list)
	{
		Logger.debug("ConstraintTrkngWrkr", String.format("Constraints changed for %s", new Object[] {
			list
		}), new Throwable[0]);
	//    0    0:ldc1            #71  <String "ConstraintTrkngWrkr">
	//    1    2:ldc1            #73  <String "Constraints changed for %s">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokestatic    #79  <Method String String.format(String, Object[])>
	//    9   15:iconst_0        
	//   10   16:anewarray       Throwable[]
	//   11   19:invokestatic    #87  <Method void Logger.debug(String, String, Throwable[])>
		synchronized(mLock)
	//*  12   22:aload_0         
	//*  13   23:getfield        #40  <Field Object mLock>
	//*  14   26:astore_1        
	//*  15   27:aload_1         
	//*  16   28:monitorenter    
		{
			mAreConstraintsUnmet = true;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #42  <Field boolean mAreConstraintsUnmet>
		}
	//   20   34:aload_1         
	//   21   35:monitorexit     
		return;
	//   22   36:return          
		exception;
	//   23   37:astore_2        
		list;
	//   24   38:aload_1         
		JVM INSTR monitorexit ;
	//   25   39:monitorexit     
		throw exception;
	//   26   40:aload_2         
	//   27   41:athrow          
	}

	public ListenableFuture onStartWork()
	{
		getBackgroundExecutor().execute(new Runnable() {

			public void run()
			{
				setupAndRunConstraintTrackingWork();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ConstraintTrackingWorker this$0>
			//    2    4:invokevirtual   #25  <Method void ConstraintTrackingWorker.setupAndRunConstraintTrackingWork()>
			//    3    7:return          
			}

			final ConstraintTrackingWorker this$0;

			
			{
				this$0 = ConstraintTrackingWorker.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ConstraintTrackingWorker this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method Executor getBackgroundExecutor()>
	//    2    4:new             #8   <Class ConstraintTrackingWorker$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #96  <Method void ConstraintTrackingWorker$1(ConstraintTrackingWorker)>
	//    6   12:invokeinterface #102 <Method void Executor.execute(Runnable)>
		return ((ListenableFuture) (mFuture));
	//    7   17:aload_0         
	//    8   18:getfield        #50  <Field SettableFuture mFuture>
	//    9   21:areturn         
	}

	public void onStopped(boolean flag)
	{
		super.onStopped(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #107 <Method void ListenableWorker.onStopped(boolean)>
		ListenableWorker listenableworker = mDelegate;
	//    3    5:aload_0         
	//    4    6:getfield        #109 <Field ListenableWorker mDelegate>
	//    5    9:astore_2        
		if(listenableworker != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			listenableworker.stop(flag);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #112 <Method void ListenableWorker.stop(boolean)>
	//   11   19:return          
	}

	void setFutureFailed()
	{
		mFuture.set(((Object) (new androidx.work.ListenableWorker.Payload(androidx.work.ListenableWorker.Result.FAILURE, Data.EMPTY))));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field SettableFuture mFuture>
	//    2    4:new             #115 <Class androidx.work.ListenableWorker$Payload>
	//    3    7:dup             
	//    4    8:getstatic       #121 <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.FAILURE>
	//    5   11:getstatic       #127 <Field Data Data.EMPTY>
	//    6   14:invokespecial   #130 <Method void androidx.work.ListenableWorker$Payload(androidx.work.ListenableWorker$Result, Data)>
	//    7   17:invokevirtual   #134 <Method boolean SettableFuture.set(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	void setFutureRetry()
	{
		mFuture.set(((Object) (new androidx.work.ListenableWorker.Payload(androidx.work.ListenableWorker.Result.RETRY, Data.EMPTY))));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field SettableFuture mFuture>
	//    2    4:new             #115 <Class androidx.work.ListenableWorker$Payload>
	//    3    7:dup             
	//    4    8:getstatic       #138 <Field androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.RETRY>
	//    5   11:getstatic       #127 <Field Data Data.EMPTY>
	//    6   14:invokespecial   #130 <Method void androidx.work.ListenableWorker$Payload(androidx.work.ListenableWorker$Result, Data)>
	//    7   17:invokevirtual   #134 <Method boolean SettableFuture.set(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	void setupAndRunConstraintTrackingWork()
	{
		Object obj;
		obj = ((Object) (getInputData().getString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method Data getInputData()>
	//    2    4:ldc1            #145 <String "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME">
	//    3    6:invokevirtual   #149 <Method String Data.getString(String)>
	//    4    9:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #155 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   14:ifeq            33
		{
			Logger.error("ConstraintTrkngWrkr", "No worker to delegate to.", new Throwable[0]);
	//    8   17:ldc1            #71  <String "ConstraintTrkngWrkr">
	//    9   19:ldc1            #157 <String "No worker to delegate to.">
	//   10   21:iconst_0        
	//   11   22:anewarray       Throwable[]
	//   12   25:invokestatic    #160 <Method void Logger.error(String, String, Throwable[])>
			setFutureFailed();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #162 <Method void setFutureFailed()>
			return;
	//   15   32:return          
		}
		mDelegate = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), ((String) (obj)), mWorkerParameters);
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:invokevirtual   #166 <Method WorkerFactory getWorkerFactory()>
	//   19   38:aload_0         
	//   20   39:invokevirtual   #170 <Method Context getApplicationContext()>
	//   21   42:aload_1         
	//   22   43:aload_0         
	//   23   44:getfield        #33  <Field WorkerParameters mWorkerParameters>
	//   24   47:invokevirtual   #176 <Method ListenableWorker WorkerFactory.createWorkerWithDefaultFallback(Context, String, WorkerParameters)>
	//   25   50:putfield        #109 <Field ListenableWorker mDelegate>
		if(mDelegate == null)
	//*  26   53:aload_0         
	//*  27   54:getfield        #109 <Field ListenableWorker mDelegate>
	//*  28   57:ifnonnull       76
		{
			Logger.debug("ConstraintTrkngWrkr", "No worker to delegate to.", new Throwable[0]);
	//   29   60:ldc1            #71  <String "ConstraintTrkngWrkr">
	//   30   62:ldc1            #157 <String "No worker to delegate to.">
	//   31   64:iconst_0        
	//   32   65:anewarray       Throwable[]
	//   33   68:invokestatic    #87  <Method void Logger.debug(String, String, Throwable[])>
			setFutureFailed();
	//   34   71:aload_0         
	//   35   72:invokevirtual   #162 <Method void setFutureFailed()>
			return;
	//   36   75:return          
		}
		androidx.work.impl.model.WorkSpec workspec = getWorkDatabase().workSpecDao().getWorkSpec(getId().toString());
	//   37   76:aload_0         
	//   38   77:invokevirtual   #177 <Method WorkDatabase getWorkDatabase()>
	//   39   80:invokevirtual   #183 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   40   83:aload_0         
	//   41   84:invokevirtual   #187 <Method UUID getId()>
	//   42   87:invokevirtual   #193 <Method String UUID.toString()>
	//   43   90:invokeinterface #199 <Method androidx.work.impl.model.WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   44   95:astore_2        
		if(workspec == null)
	//*  45   96:aload_2         
	//*  46   97:ifnonnull       105
		{
			setFutureFailed();
	//   47  100:aload_0         
	//   48  101:invokevirtual   #162 <Method void setFutureFailed()>
			return;
	//   49  104:return          
		}
		WorkConstraintsTracker workconstraintstracker = new WorkConstraintsTracker(getApplicationContext(), ((WorkConstraintsCallback) (this)));
	//   50  105:new             #201 <Class WorkConstraintsTracker>
	//   51  108:dup             
	//   52  109:aload_0         
	//   53  110:invokevirtual   #170 <Method Context getApplicationContext()>
	//   54  113:aload_0         
	//   55  114:invokespecial   #204 <Method void WorkConstraintsTracker(Context, WorkConstraintsCallback)>
	//   56  117:astore_3        
		workconstraintstracker.replace(Collections.singletonList(((Object) (workspec))));
	//   57  118:aload_3         
	//   58  119:aload_2         
	//   59  120:invokestatic    #210 <Method List Collections.singletonList(Object)>
	//   60  123:invokevirtual   #213 <Method void WorkConstraintsTracker.replace(List)>
		if(!workconstraintstracker.areAllConstraintsMet(getId().toString()))
			break MISSING_BLOCK_LABEL_261;
	//   61  126:aload_3         
	//   62  127:aload_0         
	//   63  128:invokevirtual   #187 <Method UUID getId()>
	//   64  131:invokevirtual   #193 <Method String UUID.toString()>
	//   65  134:invokevirtual   #217 <Method boolean WorkConstraintsTracker.areAllConstraintsMet(String)>
	//   66  137:ifeq            261
		Logger.debug("ConstraintTrkngWrkr", String.format("Constraints met for delegate %s", new Object[] {
			obj
		}), new Throwable[0]);
	//   67  140:ldc1            #71  <String "ConstraintTrkngWrkr">
	//   68  142:ldc1            #219 <String "Constraints met for delegate %s">
	//   69  144:iconst_1        
	//   70  145:anewarray       Object[]
	//   71  148:dup             
	//   72  149:iconst_0        
	//   73  150:aload_1         
	//   74  151:aastore         
	//   75  152:invokestatic    #79  <Method String String.format(String, Object[])>
	//   76  155:iconst_0        
	//   77  156:anewarray       Throwable[]
	//   78  159:invokestatic    #87  <Method void Logger.debug(String, String, Throwable[])>
		try
		{
			final ListenableFuture innerFuture = mDelegate.onStartWork();
	//   79  162:aload_0         
	//   80  163:getfield        #109 <Field ListenableWorker mDelegate>
	//   81  166:invokevirtual   #221 <Method ListenableFuture ListenableWorker.onStartWork()>
	//   82  169:astore_2        
			innerFuture.addListener(new Runnable() {

				public void run()
				{
					Object obj1 = mLock;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ConstraintTrackingWorker this$0>
				//    2    4:getfield        #29  <Field Object ConstraintTrackingWorker.mLock>
				//    3    7:astore_1        
					obj1;
				//    4    8:aload_1         
					JVM INSTR monitorenter ;
				//    5    9:monitorenter    
					if(mAreConstraintsUnmet)
				//*   6   10:aload_0         
				//*   7   11:getfield        #19  <Field ConstraintTrackingWorker this$0>
				//*   8   14:getfield        #33  <Field boolean ConstraintTrackingWorker.mAreConstraintsUnmet>
				//*   9   17:ifeq            30
					{
						setFutureRetry();
				//   10   20:aload_0         
				//   11   21:getfield        #19  <Field ConstraintTrackingWorker this$0>
				//   12   24:invokevirtual   #36  <Method void ConstraintTrackingWorker.setFutureRetry()>
						break MISSING_BLOCK_LABEL_45;
				//   13   27:goto            45
					}
					mFuture.setFuture(innerFuture);
				//   14   30:aload_0         
				//   15   31:getfield        #19  <Field ConstraintTrackingWorker this$0>
				//   16   34:getfield        #40  <Field SettableFuture ConstraintTrackingWorker.mFuture>
				//   17   37:aload_0         
				//   18   38:getfield        #21  <Field ListenableFuture val$innerFuture>
				//   19   41:invokevirtual   #46  <Method boolean SettableFuture.setFuture(ListenableFuture)>
				//   20   44:pop             
					obj1;
				//   21   45:aload_1         
					JVM INSTR monitorexit ;
				//   22   46:monitorexit     
					return;
				//   23   47:return          
					Exception exception1;
					exception1;
				//   24   48:astore_2        
					obj1;
				//   25   49:aload_1         
					JVM INSTR monitorexit ;
				//   26   50:monitorexit     
					throw exception1;
				//   27   51:aload_2         
				//   28   52:athrow          
				}

				final ConstraintTrackingWorker this$0;
				final ListenableFuture val$innerFuture;

			
			{
				this$0 = ConstraintTrackingWorker.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ConstraintTrackingWorker this$0>
				innerFuture = listenablefuture;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ListenableFuture val$innerFuture>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
, getBackgroundExecutor());
	//   83  170:aload_2         
	//   84  171:new             #10  <Class ConstraintTrackingWorker$2>
	//   85  174:dup             
	//   86  175:aload_0         
	//   87  176:aload_2         
	//   88  177:invokespecial   #224 <Method void ConstraintTrackingWorker$2(ConstraintTrackingWorker, ListenableFuture)>
	//   89  180:aload_0         
	//   90  181:invokevirtual   #93  <Method Executor getBackgroundExecutor()>
	//   91  184:invokeinterface #230 <Method void ListenableFuture.addListener(Runnable, Executor)>
			return;
	//   92  189:return          
		}
		catch(Throwable throwable)
	//*  93  190:astore_2        
		{
			Logger.debug("ConstraintTrkngWrkr", String.format("Delegated worker %s threw exception in onStartWork.", new Object[] {
				obj
			}), new Throwable[] {
				throwable
			});
	//   94  191:ldc1            #71  <String "ConstraintTrkngWrkr">
	//   95  193:ldc1            #232 <String "Delegated worker %s threw exception in onStartWork.">
	//   96  195:iconst_1        
	//   97  196:anewarray       Object[]
	//   98  199:dup             
	//   99  200:iconst_0        
	//  100  201:aload_1         
	//  101  202:aastore         
	//  102  203:invokestatic    #79  <Method String String.format(String, Object[])>
	//  103  206:iconst_1        
	//  104  207:anewarray       Throwable[]
	//  105  210:dup             
	//  106  211:iconst_0        
	//  107  212:aload_2         
	//  108  213:aastore         
	//  109  214:invokestatic    #87  <Method void Logger.debug(String, String, Throwable[])>
		}
		obj = mLock;
	//  110  217:aload_0         
	//  111  218:getfield        #40  <Field Object mLock>
	//  112  221:astore_1        
		obj;
	//  113  222:aload_1         
		JVM INSTR monitorenter ;
	//  114  223:monitorenter    
		if(mAreConstraintsUnmet)
	//* 115  224:aload_0         
	//* 116  225:getfield        #42  <Field boolean mAreConstraintsUnmet>
	//* 117  228:ifeq            249
		{
			Logger.debug("ConstraintTrkngWrkr", "Constraints were unmet, Retrying.", new Throwable[0]);
	//  118  231:ldc1            #71  <String "ConstraintTrkngWrkr">
	//  119  233:ldc1            #234 <String "Constraints were unmet, Retrying.">
	//  120  235:iconst_0        
	//  121  236:anewarray       Throwable[]
	//  122  239:invokestatic    #87  <Method void Logger.debug(String, String, Throwable[])>
			setFutureRetry();
	//  123  242:aload_0         
	//  124  243:invokevirtual   #236 <Method void setFutureRetry()>
			break MISSING_BLOCK_LABEL_253;
	//  125  246:goto            253
		}
		setFutureFailed();
	//  126  249:aload_0         
	//  127  250:invokevirtual   #162 <Method void setFutureFailed()>
		obj;
	//  128  253:aload_1         
		JVM INSTR monitorexit ;
	//  129  254:monitorexit     
		return;
	//  130  255:return          
		Exception exception;
		exception;
	//  131  256:astore_2        
		obj;
	//  132  257:aload_1         
		JVM INSTR monitorexit ;
	//  133  258:monitorexit     
		throw exception;
	//  134  259:aload_2         
	//  135  260:athrow          
		Logger.debug("ConstraintTrkngWrkr", String.format("Constraints not met for delegate %s. Requesting retry.", new Object[] {
			obj
		}), new Throwable[0]);
	//  136  261:ldc1            #71  <String "ConstraintTrkngWrkr">
	//  137  263:ldc1            #238 <String "Constraints not met for delegate %s. Requesting retry.">
	//  138  265:iconst_1        
	//  139  266:anewarray       Object[]
	//  140  269:dup             
	//  141  270:iconst_0        
	//  142  271:aload_1         
	//  143  272:aastore         
	//  144  273:invokestatic    #79  <Method String String.format(String, Object[])>
	//  145  276:iconst_0        
	//  146  277:anewarray       Throwable[]
	//  147  280:invokestatic    #87  <Method void Logger.debug(String, String, Throwable[])>
		setFutureRetry();
	//  148  283:aload_0         
	//  149  284:invokevirtual   #236 <Method void setFutureRetry()>
		return;
	//  150  287:return          
	}

	volatile boolean mAreConstraintsUnmet;
	private ListenableWorker mDelegate;
	SettableFuture mFuture;
	final Object mLock = new Object();
	private WorkerParameters mWorkerParameters;
}
