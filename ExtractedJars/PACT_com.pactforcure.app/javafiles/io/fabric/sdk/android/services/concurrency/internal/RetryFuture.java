// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.concurrency.internal:
//			AbstractFuture, RetryState, RetryPolicy, Backoff, 
//			RetryThreadPoolExecutor

class RetryFuture extends AbstractFuture
	implements Runnable
{

	RetryFuture(Callable callable, RetryState retrystate, RetryThreadPoolExecutor retrythreadpoolexecutor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractFuture()>
		task = callable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Callable task>
		retryState = retrystate;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field RetryState retryState>
		executor = retrythreadpoolexecutor;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field RetryThreadPoolExecutor executor>
	//   11   19:aload_0         
	//   12   20:new             #30  <Class AtomicReference>
	//   13   23:dup             
	//   14   24:invokespecial   #31  <Method void AtomicReference()>
	//   15   27:putfield        #33  <Field AtomicReference runner>
	//   16   30:return          
	}

	private Backoff getBackoff()
	{
		return retryState.getBackoff();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RetryState retryState>
	//    2    4:invokevirtual   #42  <Method Backoff RetryState.getBackoff()>
	//    3    7:areturn         
	}

	private int getRetryCount()
	{
		return retryState.getRetryCount();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RetryState retryState>
	//    2    4:invokevirtual   #46  <Method int RetryState.getRetryCount()>
	//    3    7:ireturn         
	}

	private RetryPolicy getRetryPolicy()
	{
		return retryState.getRetryPolicy();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RetryState retryState>
	//    2    4:invokevirtual   #50  <Method RetryPolicy RetryState.getRetryPolicy()>
	//    3    7:areturn         
	}

	protected void interruptTask()
	{
		Thread thread = (Thread)runner.getAndSet(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AtomicReference runner>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #55  <Method Object AtomicReference.getAndSet(Object)>
	//    4    8:checkcast       #57  <Class Thread>
	//    5   11:astore_1        
		if(thread != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          20
			thread.interrupt();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #60  <Method void Thread.interrupt()>
	//   10   20:return          
	}

	public void run()
	{
		if(isDone() || !runner.compareAndSet(((Object) (null)), ((Object) (Thread.currentThread()))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #67  <Method boolean isDone()>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field AtomicReference runner>
	//*   5   11:aconst_null     
	//*   6   12:invokestatic    #71  <Method Thread Thread.currentThread()>
	//*   7   15:invokevirtual   #75  <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//*   8   18:ifne            22
			return;
	//    9   21:return          
		set(task.call());
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #24  <Field Callable task>
	//   13   27:invokeinterface #81  <Method Object Callable.call()>
	//   14   32:invokevirtual   #85  <Method boolean set(Object)>
	//   15   35:pop             
		runner.getAndSet(((Object) (null)));
	//   16   36:aload_0         
	//   17   37:getfield        #33  <Field AtomicReference runner>
	//   18   40:aconst_null     
	//   19   41:invokevirtual   #55  <Method Object AtomicReference.getAndSet(Object)>
	//   20   44:pop             
		return;
	//   21   45:return          
		Object obj;
		obj;
	//   22   46:astore_3        
		if(!getRetryPolicy().shouldRetry(getRetryCount(), ((Throwable) (obj)))) goto _L2; else goto _L1
	//   23   47:aload_0         
	//   24   48:invokespecial   #86  <Method RetryPolicy getRetryPolicy()>
	//   25   51:aload_0         
	//   26   52:invokespecial   #87  <Method int getRetryCount()>
	//   27   55:aload_3         
	//   28   56:invokeinterface #93  <Method boolean RetryPolicy.shouldRetry(int, Throwable)>
	//   29   61:ifeq            112
_L1:
		long l = getBackoff().getDelayMillis(getRetryCount());
	//   30   64:aload_0         
	//   31   65:invokespecial   #94  <Method Backoff getBackoff()>
	//   32   68:aload_0         
	//   33   69:invokespecial   #87  <Method int getRetryCount()>
	//   34   72:invokeinterface #100 <Method long Backoff.getDelayMillis(int)>
	//   35   77:lstore_1        
		retryState = retryState.nextRetryState();
	//   36   78:aload_0         
	//   37   79:aload_0         
	//   38   80:getfield        #26  <Field RetryState retryState>
	//   39   83:invokevirtual   #104 <Method RetryState RetryState.nextRetryState()>
	//   40   86:putfield        #26  <Field RetryState retryState>
		executor.schedule(((Runnable) (this)), l, TimeUnit.MILLISECONDS);
	//   41   89:aload_0         
	//   42   90:getfield        #28  <Field RetryThreadPoolExecutor executor>
	//   43   93:aload_0         
	//   44   94:lload_1         
	//   45   95:getstatic       #110 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   46   98:invokevirtual   #116 <Method java.util.concurrent.ScheduledFuture RetryThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
	//   47  101:pop             
_L4:
		runner.getAndSet(((Object) (null)));
	//   48  102:aload_0         
	//   49  103:getfield        #33  <Field AtomicReference runner>
	//   50  106:aconst_null     
	//   51  107:invokevirtual   #55  <Method Object AtomicReference.getAndSet(Object)>
	//   52  110:pop             
		return;
	//   53  111:return          
_L2:
		setException(((Throwable) (obj)));
	//   54  112:aload_0         
	//   55  113:aload_3         
	//   56  114:invokevirtual   #120 <Method boolean setException(Throwable)>
	//   57  117:pop             
		if(true) goto _L4; else goto _L3
	//   58  118:goto            102
_L3:
		obj;
	//   59  121:astore_3        
		runner.getAndSet(((Object) (null)));
	//   60  122:aload_0         
	//   61  123:getfield        #33  <Field AtomicReference runner>
	//   62  126:aconst_null     
	//   63  127:invokevirtual   #55  <Method Object AtomicReference.getAndSet(Object)>
	//   64  130:pop             
		throw obj;
	//   65  131:aload_3         
	//   66  132:athrow          
	}

	private final RetryThreadPoolExecutor executor;
	RetryState retryState;
	private final AtomicReference runner = new AtomicReference();
	private final Callable task;
}
