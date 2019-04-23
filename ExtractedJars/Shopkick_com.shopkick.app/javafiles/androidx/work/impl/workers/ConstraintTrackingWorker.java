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
	//    3    3:invokespecial   #49  <Method void ListenableWorker(Context, WorkerParameters)>
		mWorkerParameters = workerparameters;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #51  <Field WorkerParameters mWorkerParameters>
	//    7   11:aload_0         
	//    8   12:new             #53  <Class Object>
	//    9   15:dup             
	//   10   16:invokespecial   #55  <Method void Object()>
	//   11   19:putfield        #57  <Field Object mLock>
		mAreConstraintsUnmet = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #59  <Field boolean mAreConstraintsUnmet>
		mFuture = SettableFuture.create();
	//   15   27:aload_0         
	//   16   28:invokestatic    #65  <Method SettableFuture SettableFuture.create()>
	//   17   31:putfield        #67  <Field SettableFuture mFuture>
	//   18   34:return          
	}

	public ListenableWorker getDelegate()
	{
		return mDelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ListenableWorker mDelegate>
	//    2    4:areturn         
	}

	public WorkDatabase getWorkDatabase()
	{
		return WorkManagerImpl.getInstance().getWorkDatabase();
	//    0    0:invokestatic    #82  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//    1    3:invokevirtual   #84  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    2    6:areturn         
	}

	public void onAllConstraintsMet(List list)
	{
	//    0    0:return          
	}

	public void onAllConstraintsNotMet(List list)
	{
		Logger.get().debug(TAG, String.format("Constraints changed for %s", new Object[] {
			list
		}), new Throwable[0]);
	//    0    0:invokestatic    #93  <Method Logger Logger.get()>
	//    1    3:getstatic       #43  <Field String TAG>
	//    2    6:ldc1            #95  <String "Constraints changed for %s">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_1         
	//    8   15:aastore         
	//    9   16:invokestatic    #101 <Method String String.format(String, Object[])>
	//   10   19:iconst_0        
	//   11   20:anewarray       Throwable[]
	//   12   23:invokevirtual   #107 <Method void Logger.debug(String, String, Throwable[])>
		synchronized(mLock)
	//*  13   26:aload_0         
	//*  14   27:getfield        #57  <Field Object mLock>
	//*  15   30:astore_1        
	//*  16   31:aload_1         
	//*  17   32:monitorenter    
		{
			mAreConstraintsUnmet = true;
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:putfield        #59  <Field boolean mAreConstraintsUnmet>
		}
	//   21   38:aload_1         
	//   22   39:monitorexit     
		return;
	//   23   40:return          
		exception;
	//   24   41:astore_2        
		list;
	//   25   42:aload_1         
		JVM INSTR monitorexit ;
	//   26   43:monitorexit     
		throw exception;
	//   27   44:aload_2         
	//   28   45:athrow          
	}

	public void onStopped()
	{
		super.onStopped();
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method void ListenableWorker.onStopped()>
		ListenableWorker listenableworker = mDelegate;
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field ListenableWorker mDelegate>
	//    4    8:astore_1        
		if(listenableworker != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			listenableworker.stop();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #113 <Method void ListenableWorker.stop()>
	//    9   17:return          
	}

	void setFutureFailed()
	{
		mFuture.set(((Object) (androidx.work.ListenableWorker.Result.failure())));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field SettableFuture mFuture>
	//    2    4:invokestatic    #120 <Method androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.failure()>
	//    3    7:invokevirtual   #124 <Method boolean SettableFuture.set(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	void setFutureRetry()
	{
		mFuture.set(((Object) (androidx.work.ListenableWorker.Result.retry())));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field SettableFuture mFuture>
	//    2    4:invokestatic    #128 <Method androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.retry()>
	//    3    7:invokevirtual   #124 <Method boolean SettableFuture.set(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	void setupAndRunConstraintTrackingWork()
	{
		Object obj;
		obj = ((Object) (getInputData().getString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method Data getInputData()>
	//    2    4:ldc1            #18  <String "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME">
	//    3    6:invokevirtual   #138 <Method String Data.getString(String)>
	//    4    9:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*   5   10:aload_1         
	//*   6   11:invokestatic    #144 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   14:ifeq            37
		{
			Logger.get().error(TAG, "No worker to delegate to.", new Throwable[0]);
	//    8   17:invokestatic    #93  <Method Logger Logger.get()>
	//    9   20:getstatic       #43  <Field String TAG>
	//   10   23:ldc1            #146 <String "No worker to delegate to.">
	//   11   25:iconst_0        
	//   12   26:anewarray       Throwable[]
	//   13   29:invokevirtual   #149 <Method void Logger.error(String, String, Throwable[])>
			setFutureFailed();
	//   14   32:aload_0         
	//   15   33:invokevirtual   #151 <Method void setFutureFailed()>
			return;
	//   16   36:return          
		}
		mDelegate = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), ((String) (obj)), mWorkerParameters);
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:invokevirtual   #155 <Method WorkerFactory getWorkerFactory()>
	//   20   42:aload_0         
	//   21   43:invokevirtual   #159 <Method Context getApplicationContext()>
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #51  <Field WorkerParameters mWorkerParameters>
	//   25   51:invokevirtual   #165 <Method ListenableWorker WorkerFactory.createWorkerWithDefaultFallback(Context, String, WorkerParameters)>
	//   26   54:putfield        #73  <Field ListenableWorker mDelegate>
		if(mDelegate == null)
	//*  27   57:aload_0         
	//*  28   58:getfield        #73  <Field ListenableWorker mDelegate>
	//*  29   61:ifnonnull       84
		{
			Logger.get().debug(TAG, "No worker to delegate to.", new Throwable[0]);
	//   30   64:invokestatic    #93  <Method Logger Logger.get()>
	//   31   67:getstatic       #43  <Field String TAG>
	//   32   70:ldc1            #146 <String "No worker to delegate to.">
	//   33   72:iconst_0        
	//   34   73:anewarray       Throwable[]
	//   35   76:invokevirtual   #107 <Method void Logger.debug(String, String, Throwable[])>
			setFutureFailed();
	//   36   79:aload_0         
	//   37   80:invokevirtual   #151 <Method void setFutureFailed()>
			return;
	//   38   83:return          
		}
		androidx.work.impl.model.WorkSpec workspec = getWorkDatabase().workSpecDao().getWorkSpec(getId().toString());
	//   39   84:aload_0         
	//   40   85:invokevirtual   #166 <Method WorkDatabase getWorkDatabase()>
	//   41   88:invokevirtual   #172 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   42   91:aload_0         
	//   43   92:invokevirtual   #176 <Method UUID getId()>
	//   44   95:invokevirtual   #182 <Method String UUID.toString()>
	//   45   98:invokeinterface #188 <Method androidx.work.impl.model.WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   46  103:astore_2        
		if(workspec == null)
	//*  47  104:aload_2         
	//*  48  105:ifnonnull       113
		{
			setFutureFailed();
	//   49  108:aload_0         
	//   50  109:invokevirtual   #151 <Method void setFutureFailed()>
			return;
	//   51  112:return          
		}
		WorkConstraintsTracker workconstraintstracker = new WorkConstraintsTracker(getApplicationContext(), ((WorkConstraintsCallback) (this)));
	//   52  113:new             #190 <Class WorkConstraintsTracker>
	//   53  116:dup             
	//   54  117:aload_0         
	//   55  118:invokevirtual   #159 <Method Context getApplicationContext()>
	//   56  121:aload_0         
	//   57  122:invokespecial   #193 <Method void WorkConstraintsTracker(Context, WorkConstraintsCallback)>
	//   58  125:astore_3        
		workconstraintstracker.replace(Collections.singletonList(((Object) (workspec))));
	//   59  126:aload_3         
	//   60  127:aload_2         
	//   61  128:invokestatic    #199 <Method List Collections.singletonList(Object)>
	//   62  131:invokevirtual   #202 <Method void WorkConstraintsTracker.replace(List)>
		if(!workconstraintstracker.areAllConstraintsMet(getId().toString()))
			break MISSING_BLOCK_LABEL_281;
	//   63  134:aload_3         
	//   64  135:aload_0         
	//   65  136:invokevirtual   #176 <Method UUID getId()>
	//   66  139:invokevirtual   #182 <Method String UUID.toString()>
	//   67  142:invokevirtual   #206 <Method boolean WorkConstraintsTracker.areAllConstraintsMet(String)>
	//   68  145:ifeq            281
		Logger.get().debug(TAG, String.format("Constraints met for delegate %s", new Object[] {
			obj
		}), new Throwable[0]);
	//   69  148:invokestatic    #93  <Method Logger Logger.get()>
	//   70  151:getstatic       #43  <Field String TAG>
	//   71  154:ldc1            #208 <String "Constraints met for delegate %s">
	//   72  156:iconst_1        
	//   73  157:anewarray       Object[]
	//   74  160:dup             
	//   75  161:iconst_0        
	//   76  162:aload_1         
	//   77  163:aastore         
	//   78  164:invokestatic    #101 <Method String String.format(String, Object[])>
	//   79  167:iconst_0        
	//   80  168:anewarray       Throwable[]
	//   81  171:invokevirtual   #107 <Method void Logger.debug(String, String, Throwable[])>
		try
		{
			final ListenableFuture innerFuture = mDelegate.startWork();
	//   82  174:aload_0         
	//   83  175:getfield        #73  <Field ListenableWorker mDelegate>
	//   84  178:invokevirtual   #212 <Method ListenableFuture ListenableWorker.startWork()>
	//   85  181:astore_2        
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
	//   86  182:aload_2         
	//   87  183:new             #10  <Class ConstraintTrackingWorker$2>
	//   88  186:dup             
	//   89  187:aload_0         
	//   90  188:aload_2         
	//   91  189:invokespecial   #215 <Method void ConstraintTrackingWorker$2(ConstraintTrackingWorker, ListenableFuture)>
	//   92  192:aload_0         
	//   93  193:invokevirtual   #219 <Method Executor getBackgroundExecutor()>
	//   94  196:invokeinterface #225 <Method void ListenableFuture.addListener(Runnable, Executor)>
			return;
	//   95  201:return          
		}
		catch(Throwable throwable)
	//*  96  202:astore_2        
		{
			Logger.get().debug(TAG, String.format("Delegated worker %s threw exception in startWork.", new Object[] {
				obj
			}), new Throwable[] {
				throwable
			});
	//   97  203:invokestatic    #93  <Method Logger Logger.get()>
	//   98  206:getstatic       #43  <Field String TAG>
	//   99  209:ldc1            #227 <String "Delegated worker %s threw exception in startWork.">
	//  100  211:iconst_1        
	//  101  212:anewarray       Object[]
	//  102  215:dup             
	//  103  216:iconst_0        
	//  104  217:aload_1         
	//  105  218:aastore         
	//  106  219:invokestatic    #101 <Method String String.format(String, Object[])>
	//  107  222:iconst_1        
	//  108  223:anewarray       Throwable[]
	//  109  226:dup             
	//  110  227:iconst_0        
	//  111  228:aload_2         
	//  112  229:aastore         
	//  113  230:invokevirtual   #107 <Method void Logger.debug(String, String, Throwable[])>
		}
		obj = mLock;
	//  114  233:aload_0         
	//  115  234:getfield        #57  <Field Object mLock>
	//  116  237:astore_1        
		obj;
	//  117  238:aload_1         
		JVM INSTR monitorenter ;
	//  118  239:monitorenter    
		if(mAreConstraintsUnmet)
	//* 119  240:aload_0         
	//* 120  241:getfield        #59  <Field boolean mAreConstraintsUnmet>
	//* 121  244:ifeq            269
		{
			Logger.get().debug(TAG, "Constraints were unmet, Retrying.", new Throwable[0]);
	//  122  247:invokestatic    #93  <Method Logger Logger.get()>
	//  123  250:getstatic       #43  <Field String TAG>
	//  124  253:ldc1            #229 <String "Constraints were unmet, Retrying.">
	//  125  255:iconst_0        
	//  126  256:anewarray       Throwable[]
	//  127  259:invokevirtual   #107 <Method void Logger.debug(String, String, Throwable[])>
			setFutureRetry();
	//  128  262:aload_0         
	//  129  263:invokevirtual   #231 <Method void setFutureRetry()>
			break MISSING_BLOCK_LABEL_273;
	//  130  266:goto            273
		}
		setFutureFailed();
	//  131  269:aload_0         
	//  132  270:invokevirtual   #151 <Method void setFutureFailed()>
		obj;
	//  133  273:aload_1         
		JVM INSTR monitorexit ;
	//  134  274:monitorexit     
		return;
	//  135  275:return          
		Exception exception;
		exception;
	//  136  276:astore_2        
		obj;
	//  137  277:aload_1         
		JVM INSTR monitorexit ;
	//  138  278:monitorexit     
		throw exception;
	//  139  279:aload_2         
	//  140  280:athrow          
		Logger.get().debug(TAG, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[] {
			obj
		}), new Throwable[0]);
	//  141  281:invokestatic    #93  <Method Logger Logger.get()>
	//  142  284:getstatic       #43  <Field String TAG>
	//  143  287:ldc1            #233 <String "Constraints not met for delegate %s. Requesting retry.">
	//  144  289:iconst_1        
	//  145  290:anewarray       Object[]
	//  146  293:dup             
	//  147  294:iconst_0        
	//  148  295:aload_1         
	//  149  296:aastore         
	//  150  297:invokestatic    #101 <Method String String.format(String, Object[])>
	//  151  300:iconst_0        
	//  152  301:anewarray       Throwable[]
	//  153  304:invokevirtual   #107 <Method void Logger.debug(String, String, Throwable[])>
		setFutureRetry();
	//  154  307:aload_0         
	//  155  308:invokevirtual   #231 <Method void setFutureRetry()>
		return;
	//  156  311:return          
	}

	public ListenableFuture startWork()
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
	//    1    1:invokevirtual   #219 <Method Executor getBackgroundExecutor()>
	//    2    4:new             #8   <Class ConstraintTrackingWorker$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #236 <Method void ConstraintTrackingWorker$1(ConstraintTrackingWorker)>
	//    6   12:invokeinterface #242 <Method void Executor.execute(Runnable)>
		return ((ListenableFuture) (mFuture));
	//    7   17:aload_0         
	//    8   18:getfield        #67  <Field SettableFuture mFuture>
	//    9   21:areturn         
	}

	public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
	private static final String TAG = Logger.tagWithPrefix("ConstraintTrkngWrkr");
	volatile boolean mAreConstraintsUnmet;
	private ListenableWorker mDelegate;
	SettableFuture mFuture;
	final Object mLock = new Object();
	private WorkerParameters mWorkerParameters;

	static 
	{
	//    0    0:ldc1            #35  <String "ConstraintTrkngWrkr">
	//    1    2:invokestatic    #41  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #43  <Field String TAG>
	//*   3    8:return          
	}
}
