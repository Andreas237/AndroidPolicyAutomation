// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.core.executor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package android.arch.core.executor:
//			TaskExecutor

public class DefaultTaskExecutor extends TaskExecutor
{

	public DefaultTaskExecutor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void TaskExecutor()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Object()>
	//    6   12:putfield        #24  <Field Object mLock>
		mDiskIO = Executors.newFixedThreadPool(2);
	//    7   15:aload_0         
	//    8   16:iconst_2        
	//    9   17:invokestatic    #30  <Method ExecutorService Executors.newFixedThreadPool(int)>
	//   10   20:putfield        #32  <Field ExecutorService mDiskIO>
	//   11   23:return          
	}

	public void executeOnDiskIO(Runnable runnable)
	{
		mDiskIO.execute(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ExecutorService mDiskIO>
	//    2    4:aload_1         
	//    3    5:invokeinterface #40  <Method void ExecutorService.execute(Runnable)>
	//    4   10:return          
	}

	public boolean isMainThread()
	{
		return Looper.getMainLooper().getThread() == Thread.currentThread();
	//    0    0:invokestatic    #48  <Method Looper Looper.getMainLooper()>
	//    1    3:invokevirtual   #52  <Method Thread Looper.getThread()>
	//    2    6:invokestatic    #57  <Method Thread Thread.currentThread()>
	//    3    9:if_acmpne       14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public void postToMainThread(Runnable runnable)
	{
		if(mMainHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field Handler mMainHandler>
	//*   2    4:ifnonnull       45
			synchronized(mLock)
	//*   3    7:aload_0         
	//*   4    8:getfield        #24  <Field Object mLock>
	//*   5   11:astore_2        
	//*   6   12:aload_2         
	//*   7   13:monitorenter    
			{
				if(mMainHandler == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #60  <Field Handler mMainHandler>
	//*  10   18:ifnonnull       35
					mMainHandler = new Handler(Looper.getMainLooper());
	//   11   21:aload_0         
	//   12   22:new             #62  <Class Handler>
	//   13   25:dup             
	//   14   26:invokestatic    #48  <Method Looper Looper.getMainLooper()>
	//   15   29:invokespecial   #65  <Method void Handler(Looper)>
	//   16   32:putfield        #60  <Field Handler mMainHandler>
			}
	//   17   35:aload_2         
	//   18   36:monitorexit     
		break MISSING_BLOCK_LABEL_45;
	//   19   37:goto            45
		runnable;
	//   20   40:astore_1        
		obj;
	//   21   41:aload_2         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		throw runnable;
	//   23   43:aload_1         
	//   24   44:athrow          
		mMainHandler.post(runnable);
	//   25   45:aload_0         
	//   26   46:getfield        #60  <Field Handler mMainHandler>
	//   27   49:aload_1         
	//   28   50:invokevirtual   #69  <Method boolean Handler.post(Runnable)>
	//   29   53:pop             
		return;
	//   30   54:return          
	}

	private ExecutorService mDiskIO;
	private final Object mLock = new Object();
	private volatile Handler mMainHandler;
}
