// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// Referenced classes of package bolts:
//			Continuation, Task, CancellationToken, Capture

class Task$8
	implements Continuation
{

	public Task then(Task task)
		throws Exception
	{
		if(val$ct != null && val$ct.isCancellationRequested())
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field CancellationToken val$ct>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #30  <Field CancellationToken val$ct>
	//*   5   11:invokevirtual   #52  <Method boolean CancellationToken.isCancellationRequested()>
	//*   6   14:ifeq            21
			return Task.cancelled();
	//    7   17:invokestatic    #56  <Method Task Task.cancelled()>
	//    8   20:areturn         
		if(((Boolean)val$predicate.call()).booleanValue())
	//*   9   21:aload_0         
	//*  10   22:getfield        #32  <Field Callable val$predicate>
	//*  11   25:invokeinterface #62  <Method Object Callable.call()>
	//*  12   30:checkcast       #64  <Class Boolean>
	//*  13   33:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
	//*  14   36:ifeq            72
			return Task.forResult(((Object) (null))).onSuccessTask(val$continuation, val$executor).onSuccessTask((Continuation)val$predicateContinuation.get(), val$executor);
	//   15   39:aconst_null     
	//   16   40:invokestatic    #71  <Method Task Task.forResult(Object)>
	//   17   43:aload_0         
	//   18   44:getfield        #34  <Field Continuation val$continuation>
	//   19   47:aload_0         
	//   20   48:getfield        #36  <Field Executor val$executor>
	//   21   51:invokevirtual   #75  <Method Task Task.onSuccessTask(Continuation, Executor)>
	//   22   54:aload_0         
	//   23   55:getfield        #38  <Field Capture val$predicateContinuation>
	//   24   58:invokevirtual   #80  <Method Object Capture.get()>
	//   25   61:checkcast       #7   <Class Continuation>
	//   26   64:aload_0         
	//   27   65:getfield        #36  <Field Executor val$executor>
	//   28   68:invokevirtual   #75  <Method Task Task.onSuccessTask(Continuation, Executor)>
	//   29   71:areturn         
		else
			return Task.forResult(((Object) (null)));
	//   30   72:aconst_null     
	//   31   73:invokestatic    #71  <Method Task Task.forResult(Object)>
	//   32   76:areturn         
	}

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #86  <Method Task then(Task)>
	//    3    5:areturn         
	}

	final Task this$0;
	final Continuation val$continuation;
	final CancellationToken val$ct;
	final Executor val$executor;
	final Callable val$predicate;
	final Capture val$predicateContinuation;

	Task$8()
	{
		this$0 = final_task;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field Task this$0>
		val$ct = cancellationtoken;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field CancellationToken val$ct>
		val$predicate = callable;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field Callable val$predicate>
		val$continuation = continuation1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field Continuation val$continuation>
		val$executor = executor1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field Executor val$executor>
		val$predicateContinuation = Capture.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #38  <Field Capture val$predicateContinuation>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #41  <Method void Object()>
	//   20   37:return          
	}
}
