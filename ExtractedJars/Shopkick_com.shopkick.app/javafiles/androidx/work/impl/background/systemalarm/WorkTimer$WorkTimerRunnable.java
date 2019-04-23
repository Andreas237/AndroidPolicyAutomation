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
	//    1    1:getfield        #24  <Field WorkTimer mWorkTimer>
	//    2    4:getfield        #33  <Field Object WorkTimer.mLock>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		istener istener;
		if((WorkTimer$WorkTimerRunnable)mWorkTimer.mTimerMap.remove(((Object) (mWorkSpecId))) == null)
			break MISSING_BLOCK_LABEL_69;
	//    6   10:aload_0         
	//    7   11:getfield        #24  <Field WorkTimer mWorkTimer>
	//    8   14:getfield        #37  <Field Map WorkTimer.mTimerMap>
	//    9   17:aload_0         
	//   10   18:getfield        #26  <Field String mWorkSpecId>
	//   11   21:invokeinterface #43  <Method Object Map.remove(Object)>
	//   12   26:checkcast       #2   <Class WorkTimer$WorkTimerRunnable>
	//   13   29:ifnull          69
		istener = (istener)mWorkTimer.mListeners.remove(((Object) (mWorkSpecId)));
	//   14   32:aload_0         
	//   15   33:getfield        #24  <Field WorkTimer mWorkTimer>
	//   16   36:getfield        #46  <Field Map WorkTimer.mListeners>
	//   17   39:aload_0         
	//   18   40:getfield        #26  <Field String mWorkSpecId>
	//   19   43:invokeinterface #43  <Method Object Map.remove(Object)>
	//   20   48:checkcast       #48  <Class WorkTimer$TimeLimitExceededListener>
	//   21   51:astore_2        
		if(istener == null)
			break MISSING_BLOCK_LABEL_97;
	//   22   52:aload_2         
	//   23   53:ifnull          97
		istener.onTimeLimitExceeded(mWorkSpecId);
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

	WorkTimer$WorkTimerRunnable(WorkTimer worktimer, String s)
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
