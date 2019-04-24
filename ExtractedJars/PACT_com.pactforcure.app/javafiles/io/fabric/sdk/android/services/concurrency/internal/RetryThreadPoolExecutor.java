// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.*;

// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//			RetryFuture, RetryState, Backoff, RetryPolicy

public class RetryThreadPoolExecutor extends ScheduledThreadPoolExecutor
{

	public RetryThreadPoolExecutor(int i, RetryPolicy retrypolicy, Backoff backoff1)
	{
		this(i, Executors.defaultThreadFactory(), retrypolicy, backoff1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #16  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #19  <Method void RetryThreadPoolExecutor(int, ThreadFactory, RetryPolicy, Backoff)>
	//    6   10:return          
	}

	public RetryThreadPoolExecutor(int i, ThreadFactory threadfactory, RetryPolicy retrypolicy, Backoff backoff1)
	{
		super(i, threadfactory);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void ScheduledThreadPoolExecutor(int, ThreadFactory)>
		if(retrypolicy == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       20
			throw new NullPointerException("retry policy must not be null");
	//    6   10:new             #25  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:ldc1            #27  <String "retry policy must not be null">
	//    9   16:invokespecial   #30  <Method void NullPointerException(String)>
	//   10   19:athrow          
		if(backoff1 == null)
	//*  11   20:aload           4
	//*  12   22:ifnonnull       35
		{
			throw new NullPointerException("backoff must not be null");
	//   13   25:new             #25  <Class NullPointerException>
	//   14   28:dup             
	//   15   29:ldc1            #32  <String "backoff must not be null">
	//   16   31:invokespecial   #30  <Method void NullPointerException(String)>
	//   17   34:athrow          
		} else
		{
			retryPolicy = retrypolicy;
	//   18   35:aload_0         
	//   19   36:aload_3         
	//   20   37:putfield        #34  <Field RetryPolicy retryPolicy>
			backoff = backoff1;
	//   21   40:aload_0         
	//   22   41:aload           4
	//   23   43:putfield        #36  <Field Backoff backoff>
			return;
	//   24   46:return          
		}
	}

	private Future scheduleWithRetryInternal(Callable callable)
	{
		if(callable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			throw new NullPointerException();
	//    2    4:new             #25  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #41  <Method void NullPointerException()>
	//    5   11:athrow          
		} else
		{
			callable = ((Callable) (new RetryFuture(callable, new RetryState(backoff, retryPolicy), this)));
	//    6   12:new             #43  <Class RetryFuture>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:new             #45  <Class RetryState>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #36  <Field Backoff backoff>
	//   13   25:aload_0         
	//   14   26:getfield        #34  <Field RetryPolicy retryPolicy>
	//   15   29:invokespecial   #48  <Method void RetryState(Backoff, RetryPolicy)>
	//   16   32:aload_0         
	//   17   33:invokespecial   #51  <Method void RetryFuture(Callable, RetryState, RetryThreadPoolExecutor)>
	//   18   36:astore_1        
			execute(((Runnable) (callable)));
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #55  <Method void execute(Runnable)>
			return ((Future) (callable));
	//   22   42:aload_1         
	//   23   43:areturn         
		}
	}

	public Backoff getBackoff()
	{
		return backoff;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Backoff backoff>
	//    2    4:areturn         
	}

	public RetryPolicy getRetryPolicy()
	{
		return retryPolicy;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field RetryPolicy retryPolicy>
	//    2    4:areturn         
	}

	public Future scheduleWithRetry(Runnable runnable)
	{
		return scheduleWithRetryInternal(Executors.callable(runnable));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #67  <Method Callable Executors.callable(Runnable)>
	//    3    5:invokespecial   #69  <Method Future scheduleWithRetryInternal(Callable)>
	//    4    8:areturn         
	}

	public Future scheduleWithRetry(Runnable runnable, Object obj)
	{
		return scheduleWithRetryInternal(Executors.callable(runnable, obj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #74  <Method Callable Executors.callable(Runnable, Object)>
	//    4    6:invokespecial   #69  <Method Future scheduleWithRetryInternal(Callable)>
	//    5    9:areturn         
	}

	public Future scheduleWithRetry(Callable callable)
	{
		return scheduleWithRetryInternal(callable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method Future scheduleWithRetryInternal(Callable)>
	//    3    5:areturn         
	}

	private final Backoff backoff;
	private final RetryPolicy retryPolicy;
}
