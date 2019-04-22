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
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class AndroidExecutors$UIThreadExecutor>
	//    4    8:dup             
	//    5    9:aconst_null     
	//    6   10:invokespecial   #45  <Method void AndroidExecutors$UIThreadExecutor(AndroidExecutors$1)>
	//    7   13:putfield        #47  <Field Executor uiThread>
	//    8   16:return          
	}

	public static void allowCoreThreadTimeout(ThreadPoolExecutor threadpoolexecutor, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*   0    0:getstatic       #57  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          9
	//*   2    5:icmplt          13
			threadpoolexecutor.allowCoreThreadTimeOut(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #63  <Method void ThreadPoolExecutor.allowCoreThreadTimeOut(boolean)>
	//    6   13:return          
	}

	public static ExecutorService newCachedThreadPool()
	{
		ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())));
	//    0    0:new             #59  <Class ThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:getstatic       #38  <Field int CORE_POOL_SIZE>
	//    3    7:getstatic       #40  <Field int MAX_POOL_SIZE>
	//    4   10:lconst_1        
	//    5   11:getstatic       #72  <Field TimeUnit TimeUnit.SECONDS>
	//    6   14:new             #74  <Class LinkedBlockingQueue>
	//    7   17:dup             
	//    8   18:invokespecial   #75  <Method void LinkedBlockingQueue()>
	//    9   21:invokespecial   #78  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue)>
	//   10   24:astore_0        
		allowCoreThreadTimeout(threadpoolexecutor, true);
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:invokestatic    #80  <Method void allowCoreThreadTimeout(ThreadPoolExecutor, boolean)>
		return ((ExecutorService) (threadpoolexecutor));
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	public static Executor uiThread()
	{
		return INSTANCE.uiThread;
	//    0    0:getstatic       #24  <Field AndroidExecutors INSTANCE>
	//    1    3:getfield        #47  <Field Executor uiThread>
	//    2    6:areturn         
	}

	static final int CORE_POOL_SIZE;
	private static final int CPU_COUNT;
	private static final AndroidExecutors INSTANCE = new AndroidExecutors();
	static final int MAX_POOL_SIZE;
	private final Executor uiThread = new UIThreadExecutor();

	static 
	{
	//    0    0:new             #2   <Class AndroidExecutors>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void AndroidExecutors()>
	//    3    7:putstatic       #24  <Field AndroidExecutors INSTANCE>
		CPU_COUNT = Runtime.getRuntime().availableProcessors();
	//    4   10:invokestatic    #30  <Method Runtime Runtime.getRuntime()>
	//    5   13:invokevirtual   #34  <Method int Runtime.availableProcessors()>
	//    6   16:putstatic       #36  <Field int CPU_COUNT>
		int i = CPU_COUNT;
	//    7   19:getstatic       #36  <Field int CPU_COUNT>
	//    8   22:istore_0        
		CORE_POOL_SIZE = i + 1;
	//    9   23:iload_0         
	//   10   24:iconst_1        
	//   11   25:iadd            
	//   12   26:putstatic       #38  <Field int CORE_POOL_SIZE>
		MAX_POOL_SIZE = i * 2 + 1;
	//   13   29:iload_0         
	//   14   30:iconst_2        
	//   15   31:imul            
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:putstatic       #40  <Field int MAX_POOL_SIZE>
	//*  19   37:return          
	}
}
