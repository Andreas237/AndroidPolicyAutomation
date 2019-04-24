// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.concurrency.internal.*;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			BackgroundPriorityRunnable

public final class ExecutorUtils
{

	private ExecutorUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	private static final void addDelayedShutdownHook(String s, ExecutorService executorservice)
	{
		addDelayedShutdownHook(s, executorservice, 2L, TimeUnit.SECONDS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #13  <Long 2L>
	//    3    5:getstatic       #27  <Field TimeUnit TimeUnit.SECONDS>
	//    4    8:invokestatic    #30  <Method void addDelayedShutdownHook(String, ExecutorService, long, TimeUnit)>
	//    5   11:return          
	}

	public static final void addDelayedShutdownHook(String s, ExecutorService executorservice, long l, TimeUnit timeunit)
	{
		Runtime.getRuntime().addShutdownHook(new Thread(((Runnable) (new BackgroundPriorityRunnable(s, executorservice, l, timeunit) {

			public void onRun()
			{
				try
				{
					Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Executing shutdown hook for ").append(serviceName).toString());
			//    0    0:invokestatic    #39  <Method Logger Fabric.getLogger()>
			//    1    3:ldc1            #41  <String "Fabric">
			//    2    5:new             #43  <Class StringBuilder>
			//    3    8:dup             
			//    4    9:invokespecial   #44  <Method void StringBuilder()>
			//    5   12:ldc1            #46  <String "Executing shutdown hook for ">
			//    6   14:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
			//    7   17:aload_0         
			//    8   18:getfield        #20  <Field String val$serviceName>
			//    9   21:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
			//   10   24:invokevirtual   #54  <Method String StringBuilder.toString()>
			//   11   27:invokeinterface #60  <Method void Logger.d(String, String)>
					service.shutdown();
			//   12   32:aload_0         
			//   13   33:getfield        #22  <Field ExecutorService val$service>
			//   14   36:invokeinterface #65  <Method void ExecutorService.shutdown()>
					if(!service.awaitTermination(terminationTimeout, timeUnit))
			//*  15   41:aload_0         
			//*  16   42:getfield        #22  <Field ExecutorService val$service>
			//*  17   45:aload_0         
			//*  18   46:getfield        #24  <Field long val$terminationTimeout>
			//*  19   49:aload_0         
			//*  20   50:getfield        #26  <Field TimeUnit val$timeUnit>
			//*  21   53:invokeinterface #69  <Method boolean ExecutorService.awaitTermination(long, TimeUnit)>
			//*  22   58:ifne            108
					{
						Fabric.getLogger().d("Fabric", (new StringBuilder()).append(serviceName).append(" did not shut down in the").append(" allocated time. Requesting immediate shutdown.").toString());
			//   23   61:invokestatic    #39  <Method Logger Fabric.getLogger()>
			//   24   64:ldc1            #41  <String "Fabric">
			//   25   66:new             #43  <Class StringBuilder>
			//   26   69:dup             
			//   27   70:invokespecial   #44  <Method void StringBuilder()>
			//   28   73:aload_0         
			//   29   74:getfield        #20  <Field String val$serviceName>
			//   30   77:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
			//   31   80:ldc1            #71  <String " did not shut down in the">
			//   32   82:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
			//   33   85:ldc1            #73  <String " allocated time. Requesting immediate shutdown.">
			//   34   87:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
			//   35   90:invokevirtual   #54  <Method String StringBuilder.toString()>
			//   36   93:invokeinterface #60  <Method void Logger.d(String, String)>
						service.shutdownNow();
			//   37   98:aload_0         
			//   38   99:getfield        #22  <Field ExecutorService val$service>
			//   39  102:invokeinterface #77  <Method java.util.List ExecutorService.shutdownNow()>
			//   40  107:pop             
					}
					return;
			//   41  108:return          
				}
				catch(InterruptedException interruptedexception)
			//*  42  109:astore_1        
				{
					Fabric.getLogger().d("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
						serviceName
					}));
			//   43  110:invokestatic    #39  <Method Logger Fabric.getLogger()>
			//   44  113:ldc1            #41  <String "Fabric">
			//   45  115:getstatic       #83  <Field Locale Locale.US>
			//   46  118:ldc1            #85  <String "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.">
			//   47  120:iconst_1        
			//   48  121:anewarray       Object[]
			//   49  124:dup             
			//   50  125:iconst_0        
			//   51  126:aload_0         
			//   52  127:getfield        #20  <Field String val$serviceName>
			//   53  130:aastore         
			//   54  131:invokestatic    #93  <Method String String.format(Locale, String, Object[])>
			//   55  134:invokeinterface #60  <Method void Logger.d(String, String)>
				}
				service.shutdownNow();
			//   56  139:aload_0         
			//   57  140:getfield        #22  <Field ExecutorService val$service>
			//   58  143:invokeinterface #77  <Method java.util.List ExecutorService.shutdownNow()>
			//   59  148:pop             
			//   60  149:return          
			}

			final ExecutorService val$service;
			final String val$serviceName;
			final long val$terminationTimeout;
			final TimeUnit val$timeUnit;

			
			{
				serviceName = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field String val$serviceName>
				service = executorservice;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ExecutorService val$service>
				terminationTimeout = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #24  <Field long val$terminationTimeout>
				timeUnit = timeunit;
			//    9   15:aload_0         
			//   10   16:aload           5
			//   11   18:putfield        #26  <Field TimeUnit val$timeUnit>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #29  <Method void BackgroundPriorityRunnable()>
			//   14   25:return          
			}
		}
)), (new StringBuilder()).append("Crashlytics Shutdown Hook for ").append(s).toString()));
	//    0    0:invokestatic    #36  <Method Runtime Runtime.getRuntime()>
	//    1    3:new             #38  <Class Thread>
	//    2    6:dup             
	//    3    7:new             #10  <Class ExecutorUtils$2>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:aload           4
	//    9   16:invokespecial   #40  <Method void ExecutorUtils$2(String, ExecutorService, long, TimeUnit)>
	//   10   19:new             #42  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #43  <Method void StringBuilder()>
	//   13   26:ldc1            #45  <String "Crashlytics Shutdown Hook for ">
	//   14   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   18   38:invokespecial   #56  <Method void Thread(Runnable, String)>
	//   19   41:invokevirtual   #60  <Method void Runtime.addShutdownHook(Thread)>
	//   20   44:return          
	}

	public static RetryThreadPoolExecutor buildRetryThreadPoolExecutor(String s, int i, RetryPolicy retrypolicy, Backoff backoff)
	{
		retrypolicy = ((RetryPolicy) (new RetryThreadPoolExecutor(i, getNamedThreadFactory(s), retrypolicy, backoff)));
	//    0    0:new             #64  <Class RetryThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokestatic    #68  <Method ThreadFactory getNamedThreadFactory(String)>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #71  <Method void RetryThreadPoolExecutor(int, ThreadFactory, RetryPolicy, Backoff)>
	//    8   14:astore_2        
		addDelayedShutdownHook(s, ((ExecutorService) (retrypolicy)));
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokestatic    #73  <Method void addDelayedShutdownHook(String, ExecutorService)>
		return ((RetryThreadPoolExecutor) (retrypolicy));
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	public static ExecutorService buildSingleThreadExecutorService(String s)
	{
		ExecutorService executorservice = Executors.newSingleThreadExecutor(getNamedThreadFactory(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method ThreadFactory getNamedThreadFactory(String)>
	//    2    4:invokestatic    #81  <Method ExecutorService Executors.newSingleThreadExecutor(ThreadFactory)>
	//    3    7:astore_1        
		addDelayedShutdownHook(s, executorservice);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #73  <Method void addDelayedShutdownHook(String, ExecutorService)>
		return executorservice;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String s)
	{
		ScheduledExecutorService scheduledexecutorservice = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method ThreadFactory getNamedThreadFactory(String)>
	//    2    4:invokestatic    #87  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor(ThreadFactory)>
	//    3    7:astore_1        
		addDelayedShutdownHook(s, ((ExecutorService) (scheduledexecutorservice)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #73  <Method void addDelayedShutdownHook(String, ExecutorService)>
		return scheduledexecutorservice;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public static final ThreadFactory getNamedThreadFactory(String s)
	{
		return new ThreadFactory(s, new AtomicLong(1L)) {

			public Thread newThread(Runnable runnable)
			{
				runnable = ((Runnable) (Executors.defaultThreadFactory().newThread(((Runnable) (((_cls1) (runnable)). new BackgroundPriorityRunnable() {

					public void onRun()
					{
						runnable.run();
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field Runnable val$runnable>
					//    2    4:invokeinterface #29  <Method void Runnable.run()>
					//    3    9:return          
					}

					final _cls1 this$0;
					final Runnable val$runnable;

			
			{
				this$0 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ExecutorUtils$1 this$0>
				runnable = Runnable.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Runnable val$runnable>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void BackgroundPriorityRunnable()>
			//    8   14:return          
			}
				}
)))));
			//    0    0:invokestatic    #35  <Method ThreadFactory Executors.defaultThreadFactory()>
			//    1    3:new             #13  <Class ExecutorUtils$1$1>
			//    2    6:dup             
			//    3    7:aload_0         
			//    4    8:aload_1         
			//    5    9:invokespecial   #38  <Method void ExecutorUtils$1$1(ExecutorUtils$1, Runnable)>
			//    6   12:invokeinterface #40  <Method Thread ThreadFactory.newThread(Runnable)>
			//    7   17:astore_1        
				((Thread) (runnable)).setName((new StringBuilder()).append(threadNameTemplate).append(count.getAndIncrement()).toString());
			//    8   18:aload_1         
			//    9   19:new             #42  <Class StringBuilder>
			//   10   22:dup             
			//   11   23:invokespecial   #43  <Method void StringBuilder()>
			//   12   26:aload_0         
			//   13   27:getfield        #21  <Field String val$threadNameTemplate>
			//   14   30:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   15   33:aload_0         
			//   16   34:getfield        #23  <Field AtomicLong val$count>
			//   17   37:invokevirtual   #53  <Method long AtomicLong.getAndIncrement()>
			//   18   40:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
			//   19   43:invokevirtual   #60  <Method String StringBuilder.toString()>
			//   20   46:invokevirtual   #66  <Method void Thread.setName(String)>
				return ((Thread) (runnable));
			//   21   49:aload_1         
			//   22   50:areturn         
			}

			final AtomicLong val$count;
			final String val$threadNameTemplate;

			
			{
				threadNameTemplate = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field String val$threadNameTemplate>
				count = atomiclong;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AtomicLong val$count>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #6   <Class ExecutorUtils$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #89  <Class AtomicLong>
	//    4    8:dup             
	//    5    9:lconst_1        
	//    6   10:invokespecial   #92  <Method void AtomicLong(long)>
	//    7   13:invokespecial   #95  <Method void ExecutorUtils$1(String, AtomicLong)>
	//    8   16:areturn         
	}

	private static final long DEFAULT_TERMINATION_TIMEOUT = 2L;
}
