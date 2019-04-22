// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import androidx.work.Logger;
import java.util.Map;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			WorkTimer

static class WorkTimer$WorkTimerRunnable
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
		istener istener;
		if((WorkTimer$WorkTimerRunnable)mWorkTimer.mTimerMap.remove(((Object) (mWorkSpecId))) == null)
			break MISSING_BLOCK_LABEL_69;
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field WorkTimer mWorkTimer>
	//    8   14:getfield        #34  <Field Map WorkTimer.mTimerMap>
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field String mWorkSpecId>
	//   11   21:invokeinterface #40  <Method Object Map.remove(Object)>
	//   12   26:checkcast       #2   <Class WorkTimer$WorkTimerRunnable>
	//   13   29:ifnull          69
		istener = (istener)mWorkTimer.mListeners.remove(((Object) (mWorkSpecId)));
	//   14   32:aload_0         
	//   15   33:getfield        #21  <Field WorkTimer mWorkTimer>
	//   16   36:getfield        #43  <Field Map WorkTimer.mListeners>
	//   17   39:aload_0         
	//   18   40:getfield        #23  <Field String mWorkSpecId>
	//   19   43:invokeinterface #40  <Method Object Map.remove(Object)>
	//   20   48:checkcast       #45  <Class WorkTimer$TimeLimitExceededListener>
	//   21   51:astore_2        
		if(istener == null)
			break MISSING_BLOCK_LABEL_94;
	//   22   52:aload_2         
	//   23   53:ifnull          94
		istener.onTimeLimitExceeded(mWorkSpecId);
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

	WorkTimer$WorkTimerRunnable(WorkTimer worktimer, String s)
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
