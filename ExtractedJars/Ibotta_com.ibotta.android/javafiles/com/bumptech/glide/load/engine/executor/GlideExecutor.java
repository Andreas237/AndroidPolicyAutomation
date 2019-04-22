// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//			RuntimeCompat

public final class GlideExecutor
	implements ExecutorService
{
	private static final class DefaultThreadFactory
		implements ThreadFactory
	{

		public Thread newThread(Runnable runnable)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			StringBuilder stringbuilder = new StringBuilder();
		//    2    2:new             #36  <Class StringBuilder>
		//    3    5:dup             
		//    4    6:invokespecial   #37  <Method void StringBuilder()>
		//    5    9:astore_2        
			stringbuilder.append("glide-");
		//    6   10:aload_2         
		//    7   11:ldc1            #39  <String "glide-">
		//    8   13:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//    9   16:pop             
			stringbuilder.append(name);
		//   10   17:aload_2         
		//   11   18:aload_0         
		//   12   19:getfield        #26  <Field String name>
		//   13   22:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   14   25:pop             
			stringbuilder.append("-thread-");
		//   15   26:aload_2         
		//   16   27:ldc1            #45  <String "-thread-">
		//   17   29:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   18   32:pop             
			stringbuilder.append(threadNum);
		//   19   33:aload_2         
		//   20   34:aload_0         
		//   21   35:getfield        #47  <Field int threadNum>
		//   22   38:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
		//   23   41:pop             
			runnable = ((Runnable) (new Thread(runnable, stringbuilder.toString()) {

				public void run()
				{
					Process.setThreadPriority(9);
				//    0    0:bipush          9
				//    1    2:invokestatic    #32  <Method void Process.setThreadPriority(int)>
					if(preventNetworkOperations)
				//*   2    5:aload_0         
				//*   3    6:getfield        #18  <Field GlideExecutor$DefaultThreadFactory this$0>
				//*   4    9:getfield        #36  <Field boolean GlideExecutor$DefaultThreadFactory.preventNetworkOperations>
				//*   5   12:ifeq            34
						StrictMode.setThreadPolicy((new android.os.StrictMode.ThreadPolicy.Builder()).detectNetwork().penaltyDeath().build());
				//    6   15:new             #38  <Class android.os.StrictMode$ThreadPolicy$Builder>
				//    7   18:dup             
				//    8   19:invokespecial   #40  <Method void android.os.StrictMode$ThreadPolicy$Builder()>
				//    9   22:invokevirtual   #44  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.detectNetwork()>
				//   10   25:invokevirtual   #47  <Method android.os.StrictMode$ThreadPolicy$Builder android.os.StrictMode$ThreadPolicy$Builder.penaltyDeath()>
				//   11   28:invokevirtual   #51  <Method android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy$Builder.build()>
				//   12   31:invokestatic    #57  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
					try
					{
						super.run();
				//   13   34:aload_0         
				//   14   35:invokespecial   #59  <Method void Thread.run()>
						return;
				//   15   38:return          
					}
					catch(Throwable throwable)
				//*  16   39:astore_1        
					{
						uncaughtThrowableStrategy.handle(throwable);
				//   17   40:aload_0         
				//   18   41:getfield        #18  <Field GlideExecutor$DefaultThreadFactory this$0>
				//   19   44:getfield        #63  <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$DefaultThreadFactory.uncaughtThrowableStrategy>
				//   20   47:aload_1         
				//   21   48:invokeinterface #69  <Method void GlideExecutor$UncaughtThrowableStrategy.handle(Throwable)>
					}
				//   22   53:return          
				}

				final DefaultThreadFactory this$0;

			
			{
				this$0 = DefaultThreadFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field GlideExecutor$DefaultThreadFactory this$0>
				super(runnable, s);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #21  <Method void Thread(Runnable, String)>
			//    7   11:return          
			}
			}
));
		//   24   42:new             #11  <Class GlideExecutor$DefaultThreadFactory$1>
		//   25   45:dup             
		//   26   46:aload_0         
		//   27   47:aload_1         
		//   28   48:aload_2         
		//   29   49:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   30   52:invokespecial   #57  <Method void GlideExecutor$DefaultThreadFactory$1(GlideExecutor$DefaultThreadFactory, Runnable, String)>
		//   31   55:astore_1        
			threadNum = threadNum + 1;
		//   32   56:aload_0         
		//   33   57:aload_0         
		//   34   58:getfield        #47  <Field int threadNum>
		//   35   61:iconst_1        
		//   36   62:iadd            
		//   37   63:putfield        #47  <Field int threadNum>
			this;
		//   38   66:aload_0         
			JVM INSTR monitorexit ;
		//   39   67:monitorexit     
			return ((Thread) (runnable));
		//   40   68:aload_1         
		//   41   69:areturn         
			runnable;
		//   42   70:astore_1        
		//*  43   71:aload_0         
			throw runnable;
		//   44   72:monitorexit     
		//   45   73:aload_1         
		//   46   74:athrow          
		}

		private final String name;
		final boolean preventNetworkOperations;
		private int threadNum;
		final UncaughtThrowableStrategy uncaughtThrowableStrategy;

		DefaultThreadFactory(String s, UncaughtThrowableStrategy uncaughtthrowablestrategy, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field String name>
			uncaughtThrowableStrategy = uncaughtthrowablestrategy;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field GlideExecutor$UncaughtThrowableStrategy uncaughtThrowableStrategy>
			preventNetworkOperations = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #30  <Field boolean preventNetworkOperations>
		//   11   19:return          
		}
	}

	public static interface UncaughtThrowableStrategy
	{

		public abstract void handle(Throwable throwable);

		public static final UncaughtThrowableStrategy DEFAULT = LOG;
		public static final UncaughtThrowableStrategy IGNORE = new UncaughtThrowableStrategy() {

			public void handle(Throwable throwable)
			{
			//    0    0:return          
			}

		}
;
		public static final UncaughtThrowableStrategy LOG = new UncaughtThrowableStrategy() {

			public void handle(Throwable throwable)
			{
				if(throwable != null && Log.isLoggable("GlideExecutor", 6))
			//*   0    0:aload_1         
			//*   1    1:ifnull          23
			//*   2    4:ldc1            #18  <String "GlideExecutor">
			//*   3    6:bipush          6
			//*   4    8:invokestatic    #24  <Method boolean Log.isLoggable(String, int)>
			//*   5   11:ifeq            23
					Log.e("GlideExecutor", "Request threw uncaught throwable", throwable);
			//    6   14:ldc1            #18  <String "GlideExecutor">
			//    7   16:ldc1            #26  <String "Request threw uncaught throwable">
			//    8   18:aload_1         
			//    9   19:invokestatic    #30  <Method int Log.e(String, String, Throwable)>
			//   10   22:pop             
			//   11   23:return          
			}

		}
;
		public static final UncaughtThrowableStrategy THROW = new UncaughtThrowableStrategy() {

			public void handle(Throwable throwable)
			{
				if(throwable == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       5
					return;
			//    2    4:return          
				else
					throw new RuntimeException("Request threw uncaught throwable", throwable);
			//    3    5:new             #18  <Class RuntimeException>
			//    4    8:dup             
			//    5    9:ldc1            #20  <String "Request threw uncaught throwable">
			//    6   11:aload_1         
			//    7   12:invokespecial   #23  <Method void RuntimeException(String, Throwable)>
			//    8   15:athrow          
			}

		}
;

		/* static  */
		/* { */
		//    0    0:new             #9   <Class GlideExecutor$UncaughtThrowableStrategy$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void GlideExecutor$UncaughtThrowableStrategy$1()>
		//    3    7:putstatic       #25  <Field GlideExecutor$UncaughtThrowableStrategy IGNORE>
		//    4   10:new             #11  <Class GlideExecutor$UncaughtThrowableStrategy$2>
		//    5   13:dup             
		//    6   14:invokespecial   #26  <Method void GlideExecutor$UncaughtThrowableStrategy$2()>
		//    7   17:putstatic       #28  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
		//    8   20:new             #13  <Class GlideExecutor$UncaughtThrowableStrategy$3>
		//    9   23:dup             
		//   10   24:invokespecial   #29  <Method void GlideExecutor$UncaughtThrowableStrategy$3()>
		//   11   27:putstatic       #31  <Field GlideExecutor$UncaughtThrowableStrategy THROW>
		//   12   30:getstatic       #28  <Field GlideExecutor$UncaughtThrowableStrategy LOG>
		//   13   33:putstatic       #33  <Field GlideExecutor$UncaughtThrowableStrategy DEFAULT>
		//*  14   36:return          
		/* } */
	}


	GlideExecutor(ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		_flddelegate = executorservice;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field ExecutorService _flddelegate>
	//    5    9:return          
	}

	public static int calculateBestThreadCount()
	{
		if(bestThreadCount == 0)
	//*   0    0:getstatic       #55  <Field int bestThreadCount>
	//*   1    3:ifne            16
			bestThreadCount = Math.min(4, RuntimeCompat.availableProcessors());
	//    2    6:iconst_4        
	//    3    7:invokestatic    #60  <Method int RuntimeCompat.availableProcessors()>
	//    4   10:invokestatic    #66  <Method int Math.min(int, int)>
	//    5   13:putstatic       #55  <Field int bestThreadCount>
		return bestThreadCount;
	//    6   16:getstatic       #55  <Field int bestThreadCount>
	//    7   19:ireturn         
	}

	public static GlideExecutor newAnimationExecutor()
	{
		byte byte0;
		if(calculateBestThreadCount() >= 4)
	//*   0    0:invokestatic    #70  <Method int calculateBestThreadCount()>
	//*   1    3:iconst_4        
	//*   2    4:icmplt          12
			byte0 = 2;
	//    3    7:iconst_2        
	//    4    8:istore_0        
		else
	//*   5    9:goto            14
			byte0 = 1;
	//    6   12:iconst_1        
	//    7   13:istore_0        
		return newAnimationExecutor(((int) (byte0)), UncaughtThrowableStrategy.DEFAULT);
	//    8   14:iload_0         
	//    9   15:getstatic       #74  <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$UncaughtThrowableStrategy.DEFAULT>
	//   10   18:invokestatic    #77  <Method GlideExecutor newAnimationExecutor(int, GlideExecutor$UncaughtThrowableStrategy)>
	//   11   21:areturn         
	}

	public static GlideExecutor newAnimationExecutor(int i, UncaughtThrowableStrategy uncaughtthrowablestrategy)
	{
		return new GlideExecutor(((ExecutorService) (new ThreadPoolExecutor(0, i, KEEP_ALIVE_TIME_MS, TimeUnit.MILLISECONDS, ((java.util.concurrent.BlockingQueue) (new PriorityBlockingQueue())), ((ThreadFactory) (new DefaultThreadFactory("animation", uncaughtthrowablestrategy, true)))))));
	//    0    0:new             #2   <Class GlideExecutor>
	//    1    3:dup             
	//    2    4:new             #79  <Class ThreadPoolExecutor>
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:iload_0         
	//    6   10:getstatic       #42  <Field long KEEP_ALIVE_TIME_MS>
	//    7   13:getstatic       #82  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   16:new             #84  <Class PriorityBlockingQueue>
	//    9   19:dup             
	//   10   20:invokespecial   #85  <Method void PriorityBlockingQueue()>
	//   11   23:new             #8   <Class GlideExecutor$DefaultThreadFactory>
	//   12   26:dup             
	//   13   27:ldc1            #87  <String "animation">
	//   14   29:aload_1         
	//   15   30:iconst_1        
	//   16   31:invokespecial   #90  <Method void GlideExecutor$DefaultThreadFactory(String, GlideExecutor$UncaughtThrowableStrategy, boolean)>
	//   17   34:invokespecial   #93  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   18   37:invokespecial   #95  <Method void GlideExecutor(ExecutorService)>
	//   19   40:areturn         
	}

	public static GlideExecutor newDiskCacheExecutor()
	{
		return newDiskCacheExecutor(1, "disk-cache", UncaughtThrowableStrategy.DEFAULT);
	//    0    0:iconst_1        
	//    1    1:ldc1            #98  <String "disk-cache">
	//    2    3:getstatic       #74  <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$UncaughtThrowableStrategy.DEFAULT>
	//    3    6:invokestatic    #101 <Method GlideExecutor newDiskCacheExecutor(int, String, GlideExecutor$UncaughtThrowableStrategy)>
	//    4    9:areturn         
	}

	public static GlideExecutor newDiskCacheExecutor(int i, String s, UncaughtThrowableStrategy uncaughtthrowablestrategy)
	{
		return new GlideExecutor(((ExecutorService) (new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, ((java.util.concurrent.BlockingQueue) (new PriorityBlockingQueue())), ((ThreadFactory) (new DefaultThreadFactory(s, uncaughtthrowablestrategy, true)))))));
	//    0    0:new             #2   <Class GlideExecutor>
	//    1    3:dup             
	//    2    4:new             #79  <Class ThreadPoolExecutor>
	//    3    7:dup             
	//    4    8:iload_0         
	//    5    9:iload_0         
	//    6   10:lconst_0        
	//    7   11:getstatic       #82  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   14:new             #84  <Class PriorityBlockingQueue>
	//    9   17:dup             
	//   10   18:invokespecial   #85  <Method void PriorityBlockingQueue()>
	//   11   21:new             #8   <Class GlideExecutor$DefaultThreadFactory>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:iconst_1        
	//   16   28:invokespecial   #90  <Method void GlideExecutor$DefaultThreadFactory(String, GlideExecutor$UncaughtThrowableStrategy, boolean)>
	//   17   31:invokespecial   #93  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   18   34:invokespecial   #95  <Method void GlideExecutor(ExecutorService)>
	//   19   37:areturn         
	}

	public static GlideExecutor newSourceExecutor()
	{
		return newSourceExecutor(calculateBestThreadCount(), "source", UncaughtThrowableStrategy.DEFAULT);
	//    0    0:invokestatic    #70  <Method int calculateBestThreadCount()>
	//    1    3:ldc1            #104 <String "source">
	//    2    5:getstatic       #74  <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$UncaughtThrowableStrategy.DEFAULT>
	//    3    8:invokestatic    #106 <Method GlideExecutor newSourceExecutor(int, String, GlideExecutor$UncaughtThrowableStrategy)>
	//    4   11:areturn         
	}

	public static GlideExecutor newSourceExecutor(int i, String s, UncaughtThrowableStrategy uncaughtthrowablestrategy)
	{
		return new GlideExecutor(((ExecutorService) (new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, ((java.util.concurrent.BlockingQueue) (new PriorityBlockingQueue())), ((ThreadFactory) (new DefaultThreadFactory(s, uncaughtthrowablestrategy, false)))))));
	//    0    0:new             #2   <Class GlideExecutor>
	//    1    3:dup             
	//    2    4:new             #79  <Class ThreadPoolExecutor>
	//    3    7:dup             
	//    4    8:iload_0         
	//    5    9:iload_0         
	//    6   10:lconst_0        
	//    7   11:getstatic       #82  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   14:new             #84  <Class PriorityBlockingQueue>
	//    9   17:dup             
	//   10   18:invokespecial   #85  <Method void PriorityBlockingQueue()>
	//   11   21:new             #8   <Class GlideExecutor$DefaultThreadFactory>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:iconst_0        
	//   16   28:invokespecial   #90  <Method void GlideExecutor$DefaultThreadFactory(String, GlideExecutor$UncaughtThrowableStrategy, boolean)>
	//   17   31:invokespecial   #93  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   18   34:invokespecial   #95  <Method void GlideExecutor(ExecutorService)>
	//   19   37:areturn         
	}

	public static GlideExecutor newUnlimitedSourceExecutor()
	{
		return new GlideExecutor(((ExecutorService) (new ThreadPoolExecutor(0, 0x7fffffff, KEEP_ALIVE_TIME_MS, TimeUnit.MILLISECONDS, ((java.util.concurrent.BlockingQueue) (new SynchronousQueue())), ((ThreadFactory) (new DefaultThreadFactory("source-unlimited", UncaughtThrowableStrategy.DEFAULT, false)))))));
	//    0    0:new             #2   <Class GlideExecutor>
	//    1    3:dup             
	//    2    4:new             #79  <Class ThreadPoolExecutor>
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:ldc1            #108 <Int 0x7fffffff>
	//    6   11:getstatic       #42  <Field long KEEP_ALIVE_TIME_MS>
	//    7   14:getstatic       #82  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   17:new             #110 <Class SynchronousQueue>
	//    9   20:dup             
	//   10   21:invokespecial   #111 <Method void SynchronousQueue()>
	//   11   24:new             #8   <Class GlideExecutor$DefaultThreadFactory>
	//   12   27:dup             
	//   13   28:ldc1            #113 <String "source-unlimited">
	//   14   30:getstatic       #74  <Field GlideExecutor$UncaughtThrowableStrategy GlideExecutor$UncaughtThrowableStrategy.DEFAULT>
	//   15   33:iconst_0        
	//   16   34:invokespecial   #90  <Method void GlideExecutor$DefaultThreadFactory(String, GlideExecutor$UncaughtThrowableStrategy, boolean)>
	//   17   37:invokespecial   #93  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   18   40:invokespecial   #95  <Method void GlideExecutor(ExecutorService)>
	//   19   43:areturn         
	}

	public boolean awaitTermination(long l, TimeUnit timeunit)
		throws InterruptedException
	{
		return _flddelegate.awaitTermination(l, timeunit);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokeinterface #120 <Method boolean ExecutorService.awaitTermination(long, TimeUnit)>
	//    5   11:ireturn         
	}

	public void execute(Runnable runnable)
	{
		_flddelegate.execute(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #126 <Method void ExecutorService.execute(Runnable)>
	//    4   10:return          
	}

	public List invokeAll(Collection collection)
		throws InterruptedException
	{
		return _flddelegate.invokeAll(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #130 <Method List ExecutorService.invokeAll(Collection)>
	//    4   10:areturn         
	}

	public List invokeAll(Collection collection, long l, TimeUnit timeunit)
		throws InterruptedException
	{
		return _flddelegate.invokeAll(collection, l, timeunit);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:aload           4
	//    5    8:invokeinterface #135 <Method List ExecutorService.invokeAll(Collection, long, TimeUnit)>
	//    6   13:areturn         
	}

	public Object invokeAny(Collection collection)
		throws InterruptedException, ExecutionException
	{
		return _flddelegate.invokeAny(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #142 <Method Object ExecutorService.invokeAny(Collection)>
	//    4   10:areturn         
	}

	public Object invokeAny(Collection collection, long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		return _flddelegate.invokeAny(collection, l, timeunit);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:aload           4
	//    5    8:invokeinterface #148 <Method Object ExecutorService.invokeAny(Collection, long, TimeUnit)>
	//    6   13:areturn         
	}

	public boolean isShutdown()
	{
		return _flddelegate.isShutdown();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:invokeinterface #153 <Method boolean ExecutorService.isShutdown()>
	//    3    9:ireturn         
	}

	public boolean isTerminated()
	{
		return _flddelegate.isTerminated();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:invokeinterface #156 <Method boolean ExecutorService.isTerminated()>
	//    3    9:ireturn         
	}

	public void shutdown()
	{
		_flddelegate.shutdown();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:invokeinterface #159 <Method void ExecutorService.shutdown()>
	//    3    9:return          
	}

	public List shutdownNow()
	{
		return _flddelegate.shutdownNow();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:invokeinterface #163 <Method List ExecutorService.shutdownNow()>
	//    3    9:areturn         
	}

	public Future submit(Runnable runnable)
	{
		return _flddelegate.submit(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #168 <Method Future ExecutorService.submit(Runnable)>
	//    4   10:areturn         
	}

	public Future submit(Runnable runnable, Object obj)
	{
		return _flddelegate.submit(runnable, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #172 <Method Future ExecutorService.submit(Runnable, Object)>
	//    5   11:areturn         
	}

	public Future submit(Callable callable)
	{
		return _flddelegate.submit(callable);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method Future ExecutorService.submit(Callable)>
	//    4   10:areturn         
	}

	public String toString()
	{
		return ((Object) (_flddelegate)).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ExecutorService _flddelegate>
	//    2    4:invokevirtual   #181 <Method String Object.toString()>
	//    3    7:areturn         
	}

	private static final long KEEP_ALIVE_TIME_MS;
	private static volatile int bestThreadCount;
	private final ExecutorService _flddelegate;

	static 
	{
		KEEP_ALIVE_TIME_MS = TimeUnit.SECONDS.toMillis(10L);
	//    0    0:getstatic       #34  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:ldc2w           #35  <Long 10L>
	//    2    6:invokevirtual   #40  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #42  <Field long KEEP_ALIVE_TIME_MS>
	//*   4   12:return          
	}
}
