// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import androidx.work.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

class WorkTimer
{
	static interface TimeLimitExceededListener
	{

		public abstract void onTimeLimitExceeded(String s);
	}

	static class WorkTimerRunnable
		implements Runnable
	{

		public void run()
		{
			Object obj = mWorkTimer.mLock;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WorkTimer mWorkTimer>
		//    2    4:getfield        #33  <Field Object WorkTimer.mLock>
		//    3    7:astore_1        
			obj;
		//    4    8:aload_1         
			JVM INSTR monitorenter ;
		//    5    9:monitorenter    
			TimeLimitExceededListener timelimitexceededlistener;
			if((WorkTimerRunnable)mWorkTimer.mTimerMap.remove(((Object) (mWorkSpecId))) == null)
				break MISSING_BLOCK_LABEL_69;
		//    6   10:aload_0         
		//    7   11:getfield        #24  <Field WorkTimer mWorkTimer>
		//    8   14:getfield        #37  <Field Map WorkTimer.mTimerMap>
		//    9   17:aload_0         
		//   10   18:getfield        #26  <Field String mWorkSpecId>
		//   11   21:invokeinterface #43  <Method Object Map.remove(Object)>
		//   12   26:checkcast       #2   <Class WorkTimer$WorkTimerRunnable>
		//   13   29:ifnull          69
			timelimitexceededlistener = (TimeLimitExceededListener)mWorkTimer.mListeners.remove(((Object) (mWorkSpecId)));
		//   14   32:aload_0         
		//   15   33:getfield        #24  <Field WorkTimer mWorkTimer>
		//   16   36:getfield        #46  <Field Map WorkTimer.mListeners>
		//   17   39:aload_0         
		//   18   40:getfield        #26  <Field String mWorkSpecId>
		//   19   43:invokeinterface #43  <Method Object Map.remove(Object)>
		//   20   48:checkcast       #48  <Class WorkTimer$TimeLimitExceededListener>
		//   21   51:astore_2        
			if(timelimitexceededlistener == null)
				break MISSING_BLOCK_LABEL_97;
		//   22   52:aload_2         
		//   23   53:ifnull          97
			timelimitexceededlistener.onTimeLimitExceeded(mWorkSpecId);
		//   24   56:aload_2         
		//   25   57:aload_0         
		//   26   58:getfield        #26  <Field String mWorkSpecId>
		//   27   61:invokeinterface #52  <Method void WorkTimer$TimeLimitExceededListener.onTimeLimitExceeded(String)>
			break MISSING_BLOCK_LABEL_97;
		//   28   66:goto            97
			Logger.get().debug("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[] {
				mWorkSpecId
			}), new Throwable[0]);
		//   29   69:invokestatic    #58  <Method Logger Logger.get()>
		//   30   72:ldc1            #13  <String "WrkTimerRunnable">
		//   31   74:ldc1            #60  <String "Timer with %s is already marked as complete.">
		//   32   76:iconst_1        
		//   33   77:anewarray       Object[]
		//   34   80:dup             
		//   35   81:iconst_0        
		//   36   82:aload_0         
		//   37   83:getfield        #26  <Field String mWorkSpecId>
		//   38   86:aastore         
		//   39   87:invokestatic    #66  <Method String String.format(String, Object[])>
		//   40   90:iconst_0        
		//   41   91:anewarray       Throwable[]
		//   42   94:invokevirtual   #72  <Method void Logger.debug(String, String, Throwable[])>
			obj;
		//   43   97:aload_1         
			JVM INSTR monitorexit ;
		//   44   98:monitorexit     
			return;
		//   45   99:return          
			Exception exception;
			exception;
		//   46  100:astore_2        
			obj;
		//   47  101:aload_1         
			JVM INSTR monitorexit ;
		//   48  102:monitorexit     
			throw exception;
		//   49  103:aload_2         
		//   50  104:athrow          
		}

		static final String TAG = "WrkTimerRunnable";
		private final String mWorkSpecId;
		private final WorkTimer mWorkTimer;

		WorkTimerRunnable(WorkTimer worktimer, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mWorkTimer = worktimer;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field WorkTimer mWorkTimer>
			mWorkSpecId = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field String mWorkSpecId>
		//    8   14:return          
		}
	}


	WorkTimer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class WorkTimer$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #48  <Method void WorkTimer$1(WorkTimer)>
	//    7   13:putfield        #50  <Field ThreadFactory mBackgroundThreadFactory>
	//    8   16:aload_0         
	//    9   17:new             #52  <Class HashMap>
	//   10   20:dup             
	//   11   21:invokespecial   #53  <Method void HashMap()>
	//   12   24:putfield        #55  <Field Map mTimerMap>
	//   13   27:aload_0         
	//   14   28:new             #52  <Class HashMap>
	//   15   31:dup             
	//   16   32:invokespecial   #53  <Method void HashMap()>
	//   17   35:putfield        #57  <Field Map mListeners>
	//   18   38:aload_0         
	//   19   39:new             #4   <Class Object>
	//   20   42:dup             
	//   21   43:invokespecial   #45  <Method void Object()>
	//   22   46:putfield        #59  <Field Object mLock>
		mExecutorService = Executors.newSingleThreadScheduledExecutor(mBackgroundThreadFactory);
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #50  <Field ThreadFactory mBackgroundThreadFactory>
	//   26   54:invokestatic    #65  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor(ThreadFactory)>
	//   27   57:putfield        #67  <Field ScheduledExecutorService mExecutorService>
	//   28   60:return          
	}

	Map getListeners()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map = mListeners;
	//    2    2:aload_0         
	//    3    3:getfield        #57  <Field Map mListeners>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return map;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	Map getTimerMap()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map = mTimerMap;
	//    2    2:aload_0         
	//    3    3:getfield        #55  <Field Map mTimerMap>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return map;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	void startTimer(String s, long l, TimeLimitExceededListener timelimitexceededlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object mLock>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
		{
			Logger.get().debug(TAG, String.format("Starting timer for %s", new Object[] {
				s
			}), new Throwable[0]);
	//    5    9:invokestatic    #82  <Method Logger Logger.get()>
	//    6   12:getstatic       #41  <Field String TAG>
	//    7   15:ldc1            #84  <String "Starting timer for %s">
	//    8   17:iconst_1        
	//    9   18:anewarray       Object[]
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:aload_1         
	//   13   24:aastore         
	//   14   25:invokestatic    #90  <Method String String.format(String, Object[])>
	//   15   28:iconst_0        
	//   16   29:anewarray       Throwable[]
	//   17   32:invokevirtual   #96  <Method void Logger.debug(String, String, Throwable[])>
			stopTimer(s);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:invokevirtual   #100 <Method void stopTimer(String)>
			WorkTimerRunnable worktimerrunnable = new WorkTimerRunnable(this, s);
	//   21   40:new             #11  <Class WorkTimer$WorkTimerRunnable>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:invokespecial   #103 <Method void WorkTimer$WorkTimerRunnable(WorkTimer, String)>
	//   26   49:astore          6
			mTimerMap.put(((Object) (s)), ((Object) (worktimerrunnable)));
	//   27   51:aload_0         
	//   28   52:getfield        #55  <Field Map mTimerMap>
	//   29   55:aload_1         
	//   30   56:aload           6
	//   31   58:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//   32   63:pop             
			mListeners.put(((Object) (s)), ((Object) (timelimitexceededlistener)));
	//   33   64:aload_0         
	//   34   65:getfield        #57  <Field Map mListeners>
	//   35   68:aload_1         
	//   36   69:aload           4
	//   37   71:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//   38   76:pop             
			mExecutorService.schedule(((Runnable) (worktimerrunnable)), l, TimeUnit.MILLISECONDS);
	//   39   77:aload_0         
	//   40   78:getfield        #67  <Field ScheduledExecutorService mExecutorService>
	//   41   81:aload           6
	//   42   83:lload_2         
	//   43   84:getstatic       #115 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   44   87:invokeinterface #121 <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   45   92:pop             
		}
	//   46   93:aload           5
	//   47   95:monitorexit     
		return;
	//   48   96:return          
		s;
	//   49   97:astore_1        
		obj;
	//   50   98:aload           5
		JVM INSTR monitorexit ;
	//   51  100:monitorexit     
		throw s;
	//   52  101:aload_1         
	//   53  102:athrow          
	}

	void stopTimer(String s)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if((WorkTimerRunnable)mTimerMap.remove(((Object) (s))) != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #55  <Field Map mTimerMap>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #126 <Method Object Map.remove(Object)>
	//*   9   17:checkcast       #11  <Class WorkTimer$WorkTimerRunnable>
	//*  10   20:ifnull          60
			{
				Logger.get().debug(TAG, String.format("Stopping timer for %s", new Object[] {
					s
				}), new Throwable[0]);
	//   11   23:invokestatic    #82  <Method Logger Logger.get()>
	//   12   26:getstatic       #41  <Field String TAG>
	//   13   29:ldc1            #128 <String "Stopping timer for %s">
	//   14   31:iconst_1        
	//   15   32:anewarray       Object[]
	//   16   35:dup             
	//   17   36:iconst_0        
	//   18   37:aload_1         
	//   19   38:aastore         
	//   20   39:invokestatic    #90  <Method String String.format(String, Object[])>
	//   21   42:iconst_0        
	//   22   43:anewarray       Throwable[]
	//   23   46:invokevirtual   #96  <Method void Logger.debug(String, String, Throwable[])>
				mListeners.remove(((Object) (s)));
	//   24   49:aload_0         
	//   25   50:getfield        #57  <Field Map mListeners>
	//   26   53:aload_1         
	//   27   54:invokeinterface #126 <Method Object Map.remove(Object)>
	//   28   59:pop             
			}
		}
	//   29   60:aload_2         
	//   30   61:monitorexit     
		return;
	//   31   62:return          
		s;
	//   32   63:astore_1        
		obj;
	//   33   64:aload_2         
		JVM INSTR monitorexit ;
	//   34   65:monitorexit     
		throw s;
	//   35   66:aload_1         
	//   36   67:athrow          
	}

	private static final String TAG = Logger.tagWithPrefix("WorkTimer");
	private final ThreadFactory mBackgroundThreadFactory = new ThreadFactory() {

		public Thread newThread(Runnable runnable)
		{
			runnable = ((Runnable) (Executors.defaultThreadFactory().newThread(runnable)));
		//    0    0:invokestatic    #31  <Method ThreadFactory Executors.defaultThreadFactory()>
		//    1    3:aload_1         
		//    2    4:invokeinterface #33  <Method Thread ThreadFactory.newThread(Runnable)>
		//    3    9:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
		//    4   10:new             #35  <Class StringBuilder>
		//    5   13:dup             
		//    6   14:invokespecial   #36  <Method void StringBuilder()>
		//    7   17:astore_2        
			stringbuilder.append("WorkManager-WorkTimer-thread-");
		//    8   18:aload_2         
		//    9   19:ldc1            #38  <String "WorkManager-WorkTimer-thread-">
		//   10   21:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
			stringbuilder.append(mThreadsCreated);
		//   12   25:aload_2         
		//   13   26:aload_0         
		//   14   27:getfield        #21  <Field int mThreadsCreated>
		//   15   30:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
		//   16   33:pop             
			((Thread) (runnable)).setName(stringbuilder.toString());
		//   17   34:aload_1         
		//   18   35:aload_2         
		//   19   36:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   20   39:invokevirtual   #55  <Method void Thread.setName(String)>
			mThreadsCreated = mThreadsCreated + 1;
		//   21   42:aload_0         
		//   22   43:aload_0         
		//   23   44:getfield        #21  <Field int mThreadsCreated>
		//   24   47:iconst_1        
		//   25   48:iadd            
		//   26   49:putfield        #21  <Field int mThreadsCreated>
			return ((Thread) (runnable));
		//   27   52:aload_1         
		//   28   53:areturn         
		}

		private int mThreadsCreated;
		final WorkTimer this$0;

			
			{
				this$0 = WorkTimer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WorkTimer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
				mThreadsCreated = 0;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #21  <Field int mThreadsCreated>
			//    8   14:return          
			}
	}
;
	private final ScheduledExecutorService mExecutorService;
	final Map mListeners = new HashMap();
	final Object mLock = new Object();
	final Map mTimerMap = new HashMap();

	static 
	{
	//    0    0:ldc1            #33  <String "WorkTimer">
	//    1    2:invokestatic    #39  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #41  <Field String TAG>
	//*   3    8:return          
	}
}
