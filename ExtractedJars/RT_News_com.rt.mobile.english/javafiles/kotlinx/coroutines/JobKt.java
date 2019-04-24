// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

// Referenced classes of package kotlinx.coroutines:
//			JobKt__JobKt, JobKt__FutureKt, DisposableHandle, Job, 
//			CancellableContinuation

public final class JobKt
{

	public static final DisposableHandle DisposableHandle(Function0 function0)
	{
		return JobKt__JobKt.DisposableHandle(function0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method DisposableHandle JobKt__JobKt.DisposableHandle(Function0)>
	//    2    4:areturn         
	}

	public static final Job Job(Job job)
	{
		return JobKt__JobKt.Job(job);
	//    0    0:aload_0         
	//    1    1:invokestatic    #33  <Method Job JobKt__JobKt.Job(Job)>
	//    2    4:areturn         
	}

	public static Job Job$default(Job job, int i, Object obj)
	{
		return JobKt__JobKt.Job$default(job, i, obj);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #37  <Method Job JobKt__JobKt.Job$default(Job, int, Object)>
	//    4    6:areturn         
	}

	public static final void cancel(CoroutineContext coroutinecontext)
	{
		JobKt__JobKt.cancel(coroutinecontext);
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method void JobKt__JobKt.cancel(CoroutineContext)>
	//    2    4:return          
	}

	public static final boolean cancel(CoroutineContext coroutinecontext)
	{
		return JobKt__JobKt.cancel(coroutinecontext);
	//    0    0:aload_0         
	//    1    1:invokestatic    #52  <Method boolean JobKt__JobKt.cancel(CoroutineContext)>
	//    2    4:ireturn         
	}

	public static final boolean cancel(CoroutineContext coroutinecontext, Throwable throwable)
	{
		return JobKt__JobKt.cancel(coroutinecontext, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #64  <Method boolean JobKt__JobKt.cancel(CoroutineContext, Throwable)>
	//    3    5:ireturn         
	}

	public static boolean cancel$default(CoroutineContext coroutinecontext, Throwable throwable, int i, Object obj)
	{
		return JobKt__JobKt.cancel$default(coroutinecontext, throwable, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #68  <Method boolean JobKt__JobKt.cancel$default(CoroutineContext, Throwable, int, Object)>
	//    5    7:ireturn         
	}

	public static final Object cancelAndJoin(Job job, Continuation continuation)
	{
		return JobKt__JobKt.cancelAndJoin(job, continuation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #72  <Method Object JobKt__JobKt.cancelAndJoin(Job, Continuation)>
	//    3    5:areturn         
	}

	public static final void cancelChildren(CoroutineContext coroutinecontext)
	{
		JobKt__JobKt.cancelChildren(coroutinecontext);
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method void JobKt__JobKt.cancelChildren(CoroutineContext)>
	//    2    4:return          
	}

	public static final void cancelChildren(CoroutineContext coroutinecontext, Throwable throwable)
	{
		JobKt__JobKt.cancelChildren(coroutinecontext, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #81  <Method void JobKt__JobKt.cancelChildren(CoroutineContext, Throwable)>
	//    3    5:return          
	}

	public static final void cancelChildren(Job job)
	{
		JobKt__JobKt.cancelChildren(job);
	//    0    0:aload_0         
	//    1    1:invokestatic    #84  <Method void JobKt__JobKt.cancelChildren(Job)>
	//    2    4:return          
	}

	public static final void cancelChildren(Job job, Throwable throwable)
	{
		JobKt__JobKt.cancelChildren(job, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #87  <Method void JobKt__JobKt.cancelChildren(Job, Throwable)>
	//    3    5:return          
	}

	public static void cancelChildren$default(CoroutineContext coroutinecontext, Throwable throwable, int i, Object obj)
	{
		JobKt__JobKt.cancelChildren$default(coroutinecontext, throwable, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #91  <Method void JobKt__JobKt.cancelChildren$default(CoroutineContext, Throwable, int, Object)>
	//    5    7:return          
	}

	public static void cancelChildren$default(Job job, Throwable throwable, int i, Object obj)
	{
		JobKt__JobKt.cancelChildren$default(job, throwable, i, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #94  <Method void JobKt__JobKt.cancelChildren$default(Job, Throwable, int, Object)>
	//    5    7:return          
	}

	public static final void cancelFutureOnCancellation(CancellableContinuation cancellablecontinuation, Future future)
	{
		JobKt__FutureKt.cancelFutureOnCancellation(cancellablecontinuation, future);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #99  <Method void JobKt__FutureKt.cancelFutureOnCancellation(CancellableContinuation, Future)>
	//    3    5:return          
	}

	public static final DisposableHandle cancelFutureOnCompletion(Job job, Future future)
	{
		return JobKt__FutureKt.cancelFutureOnCompletion(job, future);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #104 <Method DisposableHandle JobKt__FutureKt.cancelFutureOnCompletion(Job, Future)>
	//    3    5:areturn         
	}

	public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposablehandle)
	{
		return JobKt__JobKt.disposeOnCompletion(job, disposablehandle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #109 <Method DisposableHandle JobKt__JobKt.disposeOnCompletion(Job, DisposableHandle)>
	//    3    5:areturn         
	}

	public static final boolean isActive(CoroutineContext coroutinecontext)
	{
		return JobKt__JobKt.isActive(coroutinecontext);
	//    0    0:aload_0         
	//    1    1:invokestatic    #112 <Method boolean JobKt__JobKt.isActive(CoroutineContext)>
	//    2    4:ireturn         
	}
}
