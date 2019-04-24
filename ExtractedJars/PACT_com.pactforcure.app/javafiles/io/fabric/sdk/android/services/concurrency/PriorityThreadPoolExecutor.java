// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.*;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			DependencyPriorityBlockingQueue, Task, PriorityTask, PriorityFutureTask

public class PriorityThreadPoolExecutor extends ThreadPoolExecutor
{
	protected static final class PriorityThreadFactory
		implements ThreadFactory
	{

		public Thread newThread(Runnable runnable)
		{
			runnable = ((Runnable) (new Thread(runnable)));
		//    0    0:new             #23  <Class Thread>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #26  <Method void Thread(Runnable)>
		//    4    8:astore_1        
			((Thread) (runnable)).setPriority(threadPriority);
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #18  <Field int threadPriority>
		//    8   14:invokevirtual   #29  <Method void Thread.setPriority(int)>
			((Thread) (runnable)).setName("Queue");
		//    9   17:aload_1         
		//   10   18:ldc1            #31  <String "Queue">
		//   11   20:invokevirtual   #35  <Method void Thread.setName(String)>
			return ((Thread) (runnable));
		//   12   23:aload_1         
		//   13   24:areturn         
		}

		private final int threadPriority;

		public PriorityThreadFactory(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			threadPriority = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int threadPriority>
		//    5    9:return          
		}
	}


	PriorityThreadPoolExecutor(int i, int j, long l, TimeUnit timeunit, DependencyPriorityBlockingQueue dependencypriorityblockingqueue, ThreadFactory threadfactory)
	{
		super(i, j, l, timeunit, ((BlockingQueue) (dependencypriorityblockingqueue)), threadfactory);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:aload           6
	//    6    8:aload           7
	//    7   10:invokespecial   #39  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue, ThreadFactory)>
		prestartAllCoreThreads();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #42  <Method int prestartAllCoreThreads()>
	//   10   17:pop             
	//   11   18:return          
	}

	public static PriorityThreadPoolExecutor create()
	{
		return create(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE);
	//    0    0:getstatic       #31  <Field int CORE_POOL_SIZE>
	//    1    3:getstatic       #33  <Field int MAXIMUM_POOL_SIZE>
	//    2    6:invokestatic    #49  <Method PriorityThreadPoolExecutor create(int, int)>
	//    3    9:areturn         
	}

	public static PriorityThreadPoolExecutor create(int i)
	{
		return create(i, i);
	//    0    0:iload_0         
	//    1    1:iload_0         
	//    2    2:invokestatic    #49  <Method PriorityThreadPoolExecutor create(int, int)>
	//    3    5:areturn         
	}

	public static PriorityThreadPoolExecutor create(int i, int j)
	{
		return new PriorityThreadPoolExecutor(i, j, 1L, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), ((ThreadFactory) (new PriorityThreadFactory(10))));
	//    0    0:new             #2   <Class PriorityThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:lconst_1        
	//    5    7:getstatic       #56  <Field TimeUnit TimeUnit.SECONDS>
	//    6   10:new             #58  <Class DependencyPriorityBlockingQueue>
	//    7   13:dup             
	//    8   14:invokespecial   #60  <Method void DependencyPriorityBlockingQueue()>
	//    9   17:new             #6   <Class PriorityThreadPoolExecutor$PriorityThreadFactory>
	//   10   20:dup             
	//   11   21:bipush          10
	//   12   23:invokespecial   #63  <Method void PriorityThreadPoolExecutor$PriorityThreadFactory(int)>
	//   13   26:invokespecial   #65  <Method void PriorityThreadPoolExecutor(int, int, long, TimeUnit, DependencyPriorityBlockingQueue, ThreadFactory)>
	//   14   29:areturn         
	}

	protected void afterExecute(Runnable runnable, Throwable throwable)
	{
		Task task = (Task)runnable;
	//    0    0:aload_1         
	//    1    1:checkcast       #70  <Class Task>
	//    2    4:astore_3        
		task.setFinished(true);
	//    3    5:aload_3         
	//    4    6:iconst_1        
	//    5    7:invokeinterface #74  <Method void Task.setFinished(boolean)>
		task.setError(throwable);
	//    6   12:aload_3         
	//    7   13:aload_2         
	//    8   14:invokeinterface #78  <Method void Task.setError(Throwable)>
		getQueue().recycleBlockedQueue();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #82  <Method DependencyPriorityBlockingQueue getQueue()>
	//   11   23:invokevirtual   #85  <Method void DependencyPriorityBlockingQueue.recycleBlockedQueue()>
		super.afterExecute(runnable, throwable);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokespecial   #87  <Method void ThreadPoolExecutor.afterExecute(Runnable, Throwable)>
	//   16   32:return          
	}

	public void execute(Runnable runnable)
	{
		if(PriorityTask.isProperDelegate(((Object) (runnable))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #98  <Method boolean PriorityTask.isProperDelegate(Object)>
	//*   2    4:ifeq            13
		{
			super.execute(runnable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #100 <Method void ThreadPoolExecutor.execute(Runnable)>
			return;
	//    6   12:return          
		} else
		{
			super.execute(((Runnable) (newTaskFor(runnable, ((Object) (null))))));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #104 <Method RunnableFuture newTaskFor(Runnable, Object)>
	//   12   20:invokespecial   #100 <Method void ThreadPoolExecutor.execute(Runnable)>
			return;
	//   13   23:return          
		}
	}

	public DependencyPriorityBlockingQueue getQueue()
	{
		return (DependencyPriorityBlockingQueue)super.getQueue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method BlockingQueue ThreadPoolExecutor.getQueue()>
	//    2    4:checkcast       #58  <Class DependencyPriorityBlockingQueue>
	//    3    7:areturn         
	}

	public volatile BlockingQueue getQueue()
	{
		return ((BlockingQueue) (getQueue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method DependencyPriorityBlockingQueue getQueue()>
	//    2    4:areturn         
	}

	protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
	{
		return ((RunnableFuture) (new PriorityFutureTask(runnable, obj)));
	//    0    0:new             #110 <Class PriorityFutureTask>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #113 <Method void PriorityFutureTask(Runnable, Object)>
	//    5    9:areturn         
	}

	protected RunnableFuture newTaskFor(Callable callable)
	{
		return ((RunnableFuture) (new PriorityFutureTask(callable)));
	//    0    0:new             #110 <Class PriorityFutureTask>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #118 <Method void PriorityFutureTask(Callable)>
	//    4    8:areturn         
	}

	private static final int CORE_POOL_SIZE;
	private static final int CPU_COUNT;
	private static final long KEEP_ALIVE = 1L;
	private static final int MAXIMUM_POOL_SIZE;

	static 
	{
		CPU_COUNT = Runtime.getRuntime().availableProcessors();
	//    0    0:invokestatic    #23  <Method Runtime Runtime.getRuntime()>
	//    1    3:invokevirtual   #27  <Method int Runtime.availableProcessors()>
	//    2    6:putstatic       #29  <Field int CPU_COUNT>
		CORE_POOL_SIZE = CPU_COUNT + 1;
	//    3    9:getstatic       #29  <Field int CPU_COUNT>
	//    4   12:iconst_1        
	//    5   13:iadd            
	//    6   14:putstatic       #31  <Field int CORE_POOL_SIZE>
		MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
	//    7   17:getstatic       #29  <Field int CPU_COUNT>
	//    8   20:iconst_2        
	//    9   21:imul            
	//   10   22:iconst_1        
	//   11   23:iadd            
	//   12   24:putstatic       #33  <Field int MAXIMUM_POOL_SIZE>
	//*  13   27:return          
	}
}
