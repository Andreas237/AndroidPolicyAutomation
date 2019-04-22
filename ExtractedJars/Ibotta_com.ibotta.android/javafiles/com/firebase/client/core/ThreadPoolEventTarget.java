// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.EventTarget;
import java.util.concurrent.*;

// Referenced classes of package com.firebase.client.core:
//			ThreadInitializer

class ThreadPoolEventTarget
	implements EventTarget
{

	public ThreadPoolEventTarget(final ThreadFactory wrappedFactory, final ThreadInitializer threadInitializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		LinkedBlockingQueue linkedblockingqueue = new LinkedBlockingQueue();
	//    2    4:new             #17  <Class LinkedBlockingQueue>
	//    3    7:dup             
	//    4    8:invokespecial   #18  <Method void LinkedBlockingQueue()>
	//    5   11:astore_3        
		executor = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (linkedblockingqueue)), new ThreadFactory() {

			public Thread newThread(Runnable runnable)
			{
				runnable = ((Runnable) (wrappedFactory.newThread(runnable)));
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field ThreadFactory val$wrappedFactory>
			//    2    4:aload_1         
			//    3    5:invokeinterface #32  <Method Thread ThreadFactory.newThread(Runnable)>
			//    4   10:astore_1        
				threadInitializer.setName(((Thread) (runnable)), "FirebaseEventTarget");
			//    5   11:aload_0         
			//    6   12:getfield        #24  <Field ThreadInitializer val$threadInitializer>
			//    7   15:aload_1         
			//    8   16:ldc1            #34  <String "FirebaseEventTarget">
			//    9   18:invokeinterface #40  <Method void ThreadInitializer.setName(Thread, String)>
				threadInitializer.setDaemon(((Thread) (runnable)), true);
			//   10   23:aload_0         
			//   11   24:getfield        #24  <Field ThreadInitializer val$threadInitializer>
			//   12   27:aload_1         
			//   13   28:iconst_1        
			//   14   29:invokeinterface #44  <Method void ThreadInitializer.setDaemon(Thread, boolean)>
				return ((Thread) (runnable));
			//   15   34:aload_1         
			//   16   35:areturn         
			}

			final ThreadPoolEventTarget this$0;
			final ThreadInitializer val$threadInitializer;
			final ThreadFactory val$wrappedFactory;

			
			{
				this$0 = ThreadPoolEventTarget.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ThreadPoolEventTarget this$0>
				wrappedFactory = threadfactory;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ThreadFactory val$wrappedFactory>
				threadInitializer = threadinitializer;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field ThreadInitializer val$threadInitializer>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    6   12:aload_0         
	//    7   13:new             #20  <Class ThreadPoolExecutor>
	//    8   16:dup             
	//    9   17:iconst_1        
	//   10   18:iconst_1        
	//   11   19:ldc2w           #21  <Long 3L>
	//   12   22:getstatic       #28  <Field TimeUnit TimeUnit.SECONDS>
	//   13   25:aload_3         
	//   14   26:new             #8   <Class ThreadPoolEventTarget$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokespecial   #31  <Method void ThreadPoolEventTarget$1(ThreadPoolEventTarget, ThreadFactory, ThreadInitializer)>
	//   20   36:invokespecial   #34  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   21   39:putfield        #36  <Field ThreadPoolExecutor executor>
	//   22   42:return          
	}

	public void postEvent(Runnable runnable)
	{
		executor.execute(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ThreadPoolExecutor executor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method void ThreadPoolExecutor.execute(Runnable)>
	//    4    8:return          
	}

	public void restart()
	{
		executor.setCorePoolSize(1);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ThreadPoolExecutor executor>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #47  <Method void ThreadPoolExecutor.setCorePoolSize(int)>
	//    4    8:return          
	}

	public void shutdown()
	{
		executor.setCorePoolSize(0);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ThreadPoolExecutor executor>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #47  <Method void ThreadPoolExecutor.setCorePoolSize(int)>
	//    4    8:return          
	}

	private final ThreadPoolExecutor executor;
}
