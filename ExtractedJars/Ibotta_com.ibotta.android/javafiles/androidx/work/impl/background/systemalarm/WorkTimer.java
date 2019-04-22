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
		//    1    1:getfield        #21  <Field WorkTimer mWorkTimer>
		//    2    4:getfield        #30  <Field Object WorkTimer.mLock>
		//    3    7:astore_1        
			obj;
		//    4    8:aload_1         
			JVM INSTR monitorenter ;
		//    5    9:monitorenter    
			TimeLimitExceededListener timelimitexceededlistener;
			if((WorkTimerRunnable)mWorkTimer.mTimerMap.remove(((Object) (mWorkSpecId))) == null)
				break MISSING_BLOCK_LABEL_69;
		//    6   10:aload_0         
		//    7   11:getfield        #21  <Field WorkTimer mWorkTimer>
		//    8   14:getfield        #34  <Field Map WorkTimer.mTimerMap>
		//    9   17:aload_0         
		//   10   18:getfield        #23  <Field String mWorkSpecId>
		//   11   21:invokeinterface #40  <Method Object Map.remove(Object)>
		//   12   26:checkcast       #2   <Class WorkTimer$WorkTimerRunnable>
		//   13   29:ifnull          69
			timelimitexceededlistener = (TimeLimitExceededListener)mWorkTimer.mListeners.remove(((Object) (mWorkSpecId)));
		//   14   32:aload_0         
		//   15   33:getfield        #21  <Field WorkTimer mWorkTimer>
		//   16   36:getfield        #43  <Field Map WorkTimer.mListeners>
		//   17   39:aload_0         
		//   18   40:getfield        #23  <Field String mWorkSpecId>
		//   19   43:invokeinterface #40  <Method Object Map.remove(Object)>
		//   20   48:checkcast       #45  <Class WorkTimer$TimeLimitExceededListener>
		//   21   51:astore_2        
			if(timelimitexceededlistener == null)
				break MISSING_BLOCK_LABEL_94;
		//   22   52:aload_2         
		//   23   53:ifnull          94
			timelimitexceededlistener.onTimeLimitExceeded(mWorkSpecId);
		//   24   56:aload_2         
		//   25   57:aload_0         
		//   26   58:getfield        #23  <Field String mWorkSpecId>
		//   27   61:invokeinterface #49  <Method void WorkTimer$TimeLimitExceededListener.onTimeLimitExceeded(String)>
			break MISSING_BLOCK_LABEL_94;
		//   28   66:goto            94
			Logger.debug("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[] {
				mWorkSpecId
			}), new Throwable[0]);
		//   29   69:ldc1            #51  <String "WrkTimerRunnable">
		//   30   71:ldc1            #53  <String "Timer with %s is already marked as complete.">
		//   31   73:iconst_1        
		//   32   74:anewarray       Object[]
		//   33   77:dup             
		//   34   78:iconst_0        
		//   35   79:aload_0         
		//   36   80:getfield        #23  <Field String mWorkSpecId>
		//   37   83:aastore         
		//   38   84:invokestatic    #59  <Method String String.format(String, Object[])>
		//   39   87:iconst_0        
		//   40   88:anewarray       Throwable[]
		//   41   91:invokestatic    #67  <Method void Logger.debug(String, String, Throwable[])>
			obj;
		//   42   94:aload_1         
			JVM INSTR monitorexit ;
		//   43   95:monitorexit     
			return;
		//   44   96:return          
			Exception exception;
			exception;
		//   45   97:astore_2        
			obj;
		//   46   98:aload_1         
			JVM INSTR monitorexit ;
		//   47   99:monitorexit     
			throw exception;
		//   48  100:aload_2         
		//   49  101:athrow          
		}

		private final String mWorkSpecId;
		private final WorkTimer mWorkTimer;

		WorkTimerRunnable(WorkTimer worktimer, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mWorkTimer = worktimer;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field WorkTimer mWorkTimer>
			mWorkSpecId = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field String mWorkSpecId>
		//    8   14:return          
		}
	}


	WorkTimer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void HashMap()>
	//    6   12:putfield        #32  <Field Map mTimerMap>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void HashMap()>
	//   11   23:putfield        #34  <Field Map mListeners>
	//   12   26:aload_0         
	//   13   27:new             #4   <Class Object>
	//   14   30:dup             
	//   15   31:invokespecial   #27  <Method void Object()>
	//   16   34:putfield        #36  <Field Object mLock>
	//   17   37:aload_0         
	//   18   38:invokestatic    #42  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor()>
	//   19   41:putfield        #44  <Field ScheduledExecutorService mExecutorService>
	//   20   44:return          
	}

	void startTimer(String s, long l, TimeLimitExceededListener timelimitexceededlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object mLock>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
		{
			Logger.debug("WorkTimer", String.format("Starting timer for %s", new Object[] {
				s
			}), new Throwable[0]);
	//    5    9:ldc1            #50  <String "WorkTimer">
	//    6   11:ldc1            #52  <String "Starting timer for %s">
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:aload_1         
	//   12   20:aastore         
	//   13   21:invokestatic    #58  <Method String String.format(String, Object[])>
	//   14   24:iconst_0        
	//   15   25:anewarray       Throwable[]
	//   16   28:invokestatic    #66  <Method void Logger.debug(String, String, Throwable[])>
			stopTimer(s);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #70  <Method void stopTimer(String)>
			WorkTimerRunnable worktimerrunnable = new WorkTimerRunnable(this, s);
	//   20   36:new             #9   <Class WorkTimer$WorkTimerRunnable>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokespecial   #73  <Method void WorkTimer$WorkTimerRunnable(WorkTimer, String)>
	//   25   45:astore          6
			mTimerMap.put(((Object) (s)), ((Object) (worktimerrunnable)));
	//   26   47:aload_0         
	//   27   48:getfield        #32  <Field Map mTimerMap>
	//   28   51:aload_1         
	//   29   52:aload           6
	//   30   54:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   31   59:pop             
			mListeners.put(((Object) (s)), ((Object) (timelimitexceededlistener)));
	//   32   60:aload_0         
	//   33   61:getfield        #34  <Field Map mListeners>
	//   34   64:aload_1         
	//   35   65:aload           4
	//   36   67:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   37   72:pop             
			mExecutorService.schedule(((Runnable) (worktimerrunnable)), l, TimeUnit.MILLISECONDS);
	//   38   73:aload_0         
	//   39   74:getfield        #44  <Field ScheduledExecutorService mExecutorService>
	//   40   77:aload           6
	//   41   79:lload_2         
	//   42   80:getstatic       #85  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   43   83:invokeinterface #91  <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   44   88:pop             
		}
	//   45   89:aload           5
	//   46   91:monitorexit     
		return;
	//   47   92:return          
		s;
	//   48   93:astore_1        
		obj;
	//   49   94:aload           5
		JVM INSTR monitorexit ;
	//   50   96:monitorexit     
		throw s;
	//   51   97:aload_1         
	//   52   98:athrow          
	}

	void stopTimer(String s)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if((WorkTimerRunnable)mTimerMap.remove(((Object) (s))) != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #32  <Field Map mTimerMap>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #96  <Method Object Map.remove(Object)>
	//*   9   17:checkcast       #9   <Class WorkTimer$WorkTimerRunnable>
	//*  10   20:ifnull          56
			{
				Logger.debug("WorkTimer", String.format("Stopping timer for %s", new Object[] {
					s
				}), new Throwable[0]);
	//   11   23:ldc1            #50  <String "WorkTimer">
	//   12   25:ldc1            #98  <String "Stopping timer for %s">
	//   13   27:iconst_1        
	//   14   28:anewarray       Object[]
	//   15   31:dup             
	//   16   32:iconst_0        
	//   17   33:aload_1         
	//   18   34:aastore         
	//   19   35:invokestatic    #58  <Method String String.format(String, Object[])>
	//   20   38:iconst_0        
	//   21   39:anewarray       Throwable[]
	//   22   42:invokestatic    #66  <Method void Logger.debug(String, String, Throwable[])>
				mListeners.remove(((Object) (s)));
	//   23   45:aload_0         
	//   24   46:getfield        #34  <Field Map mListeners>
	//   25   49:aload_1         
	//   26   50:invokeinterface #96  <Method Object Map.remove(Object)>
	//   27   55:pop             
			}
		}
	//   28   56:aload_2         
	//   29   57:monitorexit     
		return;
	//   30   58:return          
		s;
	//   31   59:astore_1        
		obj;
	//   32   60:aload_2         
		JVM INSTR monitorexit ;
	//   33   61:monitorexit     
		throw s;
	//   34   62:aload_1         
	//   35   63:athrow          
	}

	private final ScheduledExecutorService mExecutorService = Executors.newSingleThreadScheduledExecutor();
	final Map mListeners = new HashMap();
	final Object mLock = new Object();
	final Map mTimerMap = new HashMap();
}
