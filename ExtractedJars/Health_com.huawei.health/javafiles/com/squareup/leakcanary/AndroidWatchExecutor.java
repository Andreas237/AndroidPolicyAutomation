// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.os.*;

// Referenced classes of package com.squareup.leakcanary:
//			WatchExecutor, Retryable

public final class AndroidWatchExecutor
	implements WatchExecutor
{

	public AndroidWatchExecutor(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #29  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #32  <Method void Handler(Looper)>
	//    7   15:putfield        #34  <Field Handler mainHandler>
		HandlerThread handlerthread = new HandlerThread("LeakCanary-Heap-Dump");
	//    8   18:new             #36  <Class HandlerThread>
	//    9   21:dup             
	//   10   22:ldc1            #10  <String "LeakCanary-Heap-Dump">
	//   11   24:invokespecial   #39  <Method void HandlerThread(String)>
	//   12   27:astore_3        
		handlerthread.start();
	//   13   28:aload_3         
	//   14   29:invokevirtual   #42  <Method void HandlerThread.start()>
		backgroundHandler = new Handler(handlerthread.getLooper());
	//   15   32:aload_0         
	//   16   33:new             #23  <Class Handler>
	//   17   36:dup             
	//   18   37:aload_3         
	//   19   38:invokevirtual   #45  <Method Looper HandlerThread.getLooper()>
	//   20   41:invokespecial   #32  <Method void Handler(Looper)>
	//   21   44:putfield        #47  <Field Handler backgroundHandler>
		initialDelayMillis = l;
	//   22   47:aload_0         
	//   23   48:lload_1         
	//   24   49:putfield        #49  <Field long initialDelayMillis>
		maxBackoffFactor = 0xffffffffL / l;
	//   25   52:aload_0         
	//   26   53:ldc2w           #50  <Long 0xffffffffL>
	//   27   56:lload_1         
	//   28   57:ldiv            
	//   29   58:putfield        #53  <Field long maxBackoffFactor>
	//   30   61:return          
	}

	public void execute(Retryable retryable)
	{
		if(Looper.getMainLooper().getThread() == Thread.currentThread())
	//*   0    0:invokestatic    #29  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #60  <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #65  <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpne       19
		{
			waitForIdle(retryable, 0);
	//    4   12:aload_0         
	//    5   13:aload_1         
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #69  <Method void waitForIdle(Retryable, int)>
			return;
	//    8   18:return          
		} else
		{
			postWaitForIdle(retryable, 0);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #72  <Method void postWaitForIdle(Retryable, int)>
			return;
	//   13   25:return          
		}
	}

	void postToBackgroundWithDelay(Retryable retryable, int i)
	{
		long l = (long)Math.min(Math.pow(2D, i), maxBackoffFactor);
	//    0    0:ldc2w           #74  <Double 2D>
	//    1    3:iload_2         
	//    2    4:i2d             
	//    3    5:invokestatic    #81  <Method double Math.pow(double, double)>
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field long maxBackoffFactor>
	//    6   12:l2d             
	//    7   13:invokestatic    #84  <Method double Math.min(double, double)>
	//    8   16:d2l             
	//    9   17:lstore_3        
		long l1 = initialDelayMillis;
	//   10   18:aload_0         
	//   11   19:getfield        #49  <Field long initialDelayMillis>
	//   12   22:lstore          5
		backgroundHandler.postDelayed(((Runnable) (new _cls3(retryable, i))), l1 * l);
	//   13   24:aload_0         
	//   14   25:getfield        #47  <Field Handler backgroundHandler>
	//   15   28:new             #86  <Class AndroidWatchExecutor$3>
	//   16   31:dup             
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:iload_2         
	//   20   35:invokespecial   #89  <Method void AndroidWatchExecutor$3(AndroidWatchExecutor, Retryable, int)>
	//   21   38:lload           5
	//   22   40:lload_3         
	//   23   41:lmul            
	//   24   42:invokevirtual   #93  <Method boolean Handler.postDelayed(Runnable, long)>
	//   25   45:pop             
	//   26   46:return          
	}

	void postWaitForIdle(Retryable retryable, int i)
	{
		mainHandler.post(((Runnable) (new _cls1(retryable, i))));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Handler mainHandler>
	//    2    4:new             #95  <Class AndroidWatchExecutor$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #96  <Method void AndroidWatchExecutor$1(AndroidWatchExecutor, Retryable, int)>
	//    8   14:invokevirtual   #100 <Method boolean Handler.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	void waitForIdle(Retryable retryable, int i)
	{
		Looper.myQueue().addIdleHandler(((android.os.MessageQueue.IdleHandler) (new _cls2(retryable, i))));
	//    0    0:invokestatic    #104 <Method MessageQueue Looper.myQueue()>
	//    1    3:new             #106 <Class AndroidWatchExecutor$2>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #107 <Method void AndroidWatchExecutor$2(AndroidWatchExecutor, Retryable, int)>
	//    7   13:invokevirtual   #113 <Method void MessageQueue.addIdleHandler(android.os.MessageQueue$IdleHandler)>
	//    8   16:return          
	}

	static final String LEAK_CANARY_THREAD_NAME = "LeakCanary-Heap-Dump";
	private final Handler backgroundHandler;
	private final long initialDelayMillis;
	private final Handler mainHandler = new Handler(Looper.getMainLooper());
	private final long maxBackoffFactor;

	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls2 {}

}
