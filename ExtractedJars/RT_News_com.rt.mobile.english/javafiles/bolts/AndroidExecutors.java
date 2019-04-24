// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.*;

final class AndroidExecutors
{
	private static class UIThreadExecutor
		implements Executor
	{

		public void execute(Runnable runnable)
		{
			(new Handler(Looper.getMainLooper())).post(runnable);
		//    0    0:new             #20  <Class Handler>
		//    1    3:dup             
		//    2    4:invokestatic    #26  <Method Looper Looper.getMainLooper()>
		//    3    7:invokespecial   #29  <Method void Handler(Looper)>
		//    4   10:aload_1         
		//    5   11:invokevirtual   #33  <Method boolean Handler.post(Runnable)>
		//    6   14:pop             
		//    7   15:return          
		}

		private UIThreadExecutor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	private AndroidExecutors()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class AndroidExecutors$UIThreadExecutor>
	//    4    8:dup             
	//    5    9:aconst_null     
	//    6   10:invokespecial   #49  <Method void AndroidExecutors$UIThreadExecutor(AndroidExecutors$1)>
	//    7   13:putfield        #51  <Field Executor uiThread>
	//    8   16:return          
	}

	public static void allowCoreThreadTimeout(ThreadPoolExecutor threadpoolexecutor, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*   0    0:getstatic       #61  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          9
	//*   2    5:icmplt          13
			threadpoolexecutor.allowCoreThreadTimeOut(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #67  <Method void ThreadPoolExecutor.allowCoreThreadTimeOut(boolean)>
	//    6   13:return          
	}

	public static ExecutorService newCachedThreadPool()
	{
		ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())));
	//    0    0:new             #63  <Class ThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:getstatic       #42  <Field int CORE_POOL_SIZE>
	//    3    7:getstatic       #44  <Field int MAX_POOL_SIZE>
	//    4   10:lconst_1        
	//    5   11:getstatic       #76  <Field TimeUnit TimeUnit.SECONDS>
	//    6   14:new             #78  <Class LinkedBlockingQueue>
	//    7   17:dup             
	//    8   18:invokespecial   #79  <Method void LinkedBlockingQueue()>
	//    9   21:invokespecial   #82  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue)>
	//   10   24:astore_0        
		allowCoreThreadTimeout(threadpoolexecutor, true);
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:invokestatic    #84  <Method void allowCoreThreadTimeout(ThreadPoolExecutor, boolean)>
		return ((ExecutorService) (threadpoolexecutor));
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	public static ExecutorService newCachedThreadPool(ThreadFactory threadfactory)
	{
		threadfactory = ((ThreadFactory) (new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())), threadfactory)));
	//    0    0:new             #63  <Class ThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:getstatic       #42  <Field int CORE_POOL_SIZE>
	//    3    7:getstatic       #44  <Field int MAX_POOL_SIZE>
	//    4   10:lconst_1        
	//    5   11:getstatic       #76  <Field TimeUnit TimeUnit.SECONDS>
	//    6   14:new             #78  <Class LinkedBlockingQueue>
	//    7   17:dup             
	//    8   18:invokespecial   #79  <Method void LinkedBlockingQueue()>
	//    9   21:aload_0         
	//   10   22:invokespecial   #88  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   11   25:astore_0        
		allowCoreThreadTimeout(((ThreadPoolExecutor) (threadfactory)), true);
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:invokestatic    #84  <Method void allowCoreThreadTimeout(ThreadPoolExecutor, boolean)>
		return ((ExecutorService) (threadfactory));
	//   15   31:aload_0         
	//   16   32:areturn         
	}

	public static Executor uiThread()
	{
		return INSTANCE.uiThread;
	//    0    0:getstatic       #28  <Field AndroidExecutors INSTANCE>
	//    1    3:getfield        #51  <Field Executor uiThread>
	//    2    6:areturn         
	}

	static final int CORE_POOL_SIZE;
	private static final int CPU_COUNT;
	private static final AndroidExecutors INSTANCE = new AndroidExecutors();
	static final long KEEP_ALIVE_TIME = 1L;
	static final int MAX_POOL_SIZE;
	private final Executor uiThread = new UIThreadExecutor();

	static 
	{
	//    0    0:new             #2   <Class AndroidExecutors>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void AndroidExecutors()>
	//    3    7:putstatic       #28  <Field AndroidExecutors INSTANCE>
		CPU_COUNT = Runtime.getRuntime().availableProcessors();
	//    4   10:invokestatic    #34  <Method Runtime Runtime.getRuntime()>
	//    5   13:invokevirtual   #38  <Method int Runtime.availableProcessors()>
	//    6   16:putstatic       #40  <Field int CPU_COUNT>
		CORE_POOL_SIZE = CPU_COUNT + 1;
	//    7   19:getstatic       #40  <Field int CPU_COUNT>
	//    8   22:iconst_1        
	//    9   23:iadd            
	//   10   24:putstatic       #42  <Field int CORE_POOL_SIZE>
		MAX_POOL_SIZE = CPU_COUNT * 2 + 1;
	//   11   27:getstatic       #40  <Field int CPU_COUNT>
	//   12   30:iconst_2        
	//   13   31:imul            
	//   14   32:iconst_1        
	//   15   33:iadd            
	//   16   34:putstatic       #44  <Field int MAX_POOL_SIZE>
	//*  17   37:return          
	}
}
