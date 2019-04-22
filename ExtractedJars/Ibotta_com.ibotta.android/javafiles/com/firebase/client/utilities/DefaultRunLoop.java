// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import com.firebase.client.RunLoop;
import com.firebase.client.core.ThreadInitializer;
import java.util.concurrent.*;

public abstract class DefaultRunLoop
	implements RunLoop
{
	private class FirebaseThreadFactory
		implements ThreadFactory
	{

		public Thread newThread(Runnable runnable)
		{
			runnable = ((Runnable) (getThreadFactory().newThread(runnable)));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field DefaultRunLoop this$0>
		//    2    4:invokevirtual   #30  <Method ThreadFactory DefaultRunLoop.getThreadFactory()>
		//    3    7:aload_1         
		//    4    8:invokeinterface #32  <Method Thread ThreadFactory.newThread(Runnable)>
		//    5   13:astore_1        
			ThreadInitializer threadinitializer = getThreadInitializer();
		//    6   14:aload_0         
		//    7   15:getfield        #17  <Field DefaultRunLoop this$0>
		//    8   18:invokevirtual   #36  <Method ThreadInitializer DefaultRunLoop.getThreadInitializer()>
		//    9   21:astore_2        
			threadinitializer.setName(((Thread) (runnable)), "FirebaseWorker");
		//   10   22:aload_2         
		//   11   23:aload_1         
		//   12   24:ldc1            #38  <String "FirebaseWorker">
		//   13   26:invokeinterface #44  <Method void ThreadInitializer.setName(Thread, String)>
			threadinitializer.setDaemon(((Thread) (runnable)), true);
		//   14   31:aload_2         
		//   15   32:aload_1         
		//   16   33:iconst_1        
		//   17   34:invokeinterface #48  <Method void ThreadInitializer.setDaemon(Thread, boolean)>
			threadinitializer.setUncaughtExceptionHandler(((Thread) (runnable)), new Thread.UncaughtExceptionHandler() {

				public void uncaughtException(Thread thread, Throwable throwable)
				{
					handleException(throwable);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field DefaultRunLoop$FirebaseThreadFactory this$1>
				//    2    4:getfield        #30  <Field DefaultRunLoop DefaultRunLoop$FirebaseThreadFactory.this$0>
				//    3    7:aload_2         
				//    4    8:invokevirtual   #34  <Method void DefaultRunLoop.handleException(Throwable)>
				//    5   11:return          
				}

				final FirebaseThreadFactory this$1;

			
			{
				this$1 = FirebaseThreadFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field DefaultRunLoop$FirebaseThreadFactory this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//   18   39:aload_2         
		//   19   40:aload_1         
		//   20   41:new             #11  <Class DefaultRunLoop$FirebaseThreadFactory$1>
		//   21   44:dup             
		//   22   45:aload_0         
		//   23   46:invokespecial   #51  <Method void DefaultRunLoop$FirebaseThreadFactory$1(DefaultRunLoop$FirebaseThreadFactory)>
		//   24   49:invokeinterface #55  <Method void ThreadInitializer.setUncaughtExceptionHandler(Thread, Thread$UncaughtExceptionHandler)>
			return ((Thread) (runnable));
		//   25   54:aload_1         
		//   26   55:areturn         
		}

		final DefaultRunLoop this$0;

		private FirebaseThreadFactory()
		{
			this$0 = DefaultRunLoop.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field DefaultRunLoop this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}


	public DefaultRunLoop()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		executor = new ScheduledThreadPoolExecutor(1, ((ThreadFactory) (new FirebaseThreadFactory())));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class ScheduledThreadPoolExecutor>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:new             #12  <Class DefaultRunLoop$FirebaseThreadFactory>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #26  <Method void DefaultRunLoop$FirebaseThreadFactory(DefaultRunLoop, DefaultRunLoop$1)>
	//   11   19:invokespecial   #29  <Method void ScheduledThreadPoolExecutor(int, ThreadFactory)>
	//   12   22:putfield        #31  <Field ScheduledThreadPoolExecutor executor>
		executor.setKeepAliveTime(3L, TimeUnit.SECONDS);
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field ScheduledThreadPoolExecutor executor>
	//   15   29:ldc2w           #32  <Long 3L>
	//   16   32:getstatic       #39  <Field TimeUnit TimeUnit.SECONDS>
	//   17   35:invokevirtual   #43  <Method void ScheduledThreadPoolExecutor.setKeepAliveTime(long, TimeUnit)>
	//   18   38:return          
	}

	protected ThreadFactory getThreadFactory()
	{
		return Executors.defaultThreadFactory();
	//    0    0:invokestatic    #51  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    1    3:areturn         
	}

	protected ThreadInitializer getThreadInitializer()
	{
		return ThreadInitializer.defaultInstance;
	//    0    0:getstatic       #59  <Field ThreadInitializer ThreadInitializer.defaultInstance>
	//    1    3:areturn         
	}

	public abstract void handleException(Throwable throwable);

	public void restart()
	{
		executor.setCorePoolSize(1);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ScheduledThreadPoolExecutor executor>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #66  <Method void ScheduledThreadPoolExecutor.setCorePoolSize(int)>
	//    4    8:return          
	}

	public ScheduledFuture schedule(final Runnable runnable, long l)
	{
		return executor.schedule(new Runnable() {

			public void run()
			{
				try
				{
					runnable.run();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field Runnable val$runnable>
			//    2    4:invokeinterface #30  <Method void Runnable.run()>
					return;
			//    3    9:return          
				}
				catch(Throwable throwable)
			//*   4   10:astore_1        
				{
					handleException(throwable);
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field DefaultRunLoop this$0>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #34  <Method void DefaultRunLoop.handleException(Throwable)>
				}
			//    9   19:return          
			}

			final DefaultRunLoop this$0;
			final Runnable val$runnable;

			
			{
				this$0 = DefaultRunLoop.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DefaultRunLoop this$0>
				runnable = runnable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Runnable val$runnable>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, l, TimeUnit.MILLISECONDS);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ScheduledThreadPoolExecutor executor>
	//    2    4:new             #10  <Class DefaultRunLoop$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #71  <Method void DefaultRunLoop$2(DefaultRunLoop, Runnable)>
	//    7   13:lload_2         
	//    8   14:getstatic       #74  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    9   17:invokevirtual   #77  <Method ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
	//   10   20:areturn         
	}

	public void scheduleNow(final Runnable runnable)
	{
		executor.execute(new Runnable() {

			public void run()
			{
				try
				{
					runnable.run();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field Runnable val$runnable>
			//    2    4:invokeinterface #30  <Method void Runnable.run()>
					return;
			//    3    9:return          
				}
				catch(Throwable throwable)
			//*   4   10:astore_1        
				{
					handleException(throwable);
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field DefaultRunLoop this$0>
			//    7   15:aload_1         
			//    8   16:invokevirtual   #34  <Method void DefaultRunLoop.handleException(Throwable)>
				}
			//    9   19:return          
			}

			final DefaultRunLoop this$0;
			final Runnable val$runnable;

			
			{
				this$0 = DefaultRunLoop.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DefaultRunLoop this$0>
				runnable = runnable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Runnable val$runnable>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ScheduledThreadPoolExecutor executor>
	//    2    4:new             #8   <Class DefaultRunLoop$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #80  <Method void DefaultRunLoop$1(DefaultRunLoop, Runnable)>
	//    7   13:invokevirtual   #83  <Method void ScheduledThreadPoolExecutor.execute(Runnable)>
	//    8   16:return          
	}

	public void shutdown()
	{
		executor.setCorePoolSize(0);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ScheduledThreadPoolExecutor executor>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #66  <Method void ScheduledThreadPoolExecutor.setCorePoolSize(int)>
	//    4    8:return          
	}

	private ScheduledThreadPoolExecutor executor;
}
