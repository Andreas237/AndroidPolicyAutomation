// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// Referenced classes of package bolts:
//			Continuation, Task, CancellationToken, Capture

class Task$9
	implements Continuation
{

	public Task then(Task task)
		throws Exception
	{
		task = ((Task) (val$ct));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CancellationToken val$ct>
	//    2    4:astore_1        
		if(task != null && ((CancellationToken) (task)).isCancellationRequested())
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #52  <Method boolean CancellationToken.isCancellationRequested()>
	//*   7   13:ifeq            20
			return Task.cancelled();
	//    8   16:invokestatic    #56  <Method Task Task.cancelled()>
	//    9   19:areturn         
		if(((Boolean)val$predicate.call()).booleanValue())
	//*  10   20:aload_0         
	//*  11   21:getfield        #32  <Field Callable val$predicate>
	//*  12   24:invokeinterface #62  <Method Object Callable.call()>
	//*  13   29:checkcast       #64  <Class Boolean>
	//*  14   32:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
	//*  15   35:ifeq            71
			return Task.forResult(((Object) (null))).onSuccessTask(val$continuation, val$executor).onSuccessTask((Continuation)val$predicateContinuation.get(), val$executor);
	//   16   38:aconst_null     
	//   17   39:invokestatic    #71  <Method Task Task.forResult(Object)>
	//   18   42:aload_0         
	//   19   43:getfield        #34  <Field Continuation val$continuation>
	//   20   46:aload_0         
	//   21   47:getfield        #36  <Field Executor val$executor>
	//   22   50:invokevirtual   #75  <Method Task Task.onSuccessTask(Continuation, Executor)>
	//   23   53:aload_0         
	//   24   54:getfield        #38  <Field Capture val$predicateContinuation>
	//   25   57:invokevirtual   #80  <Method Object Capture.get()>
	//   26   60:checkcast       #7   <Class Continuation>
	//   27   63:aload_0         
	//   28   64:getfield        #36  <Field Executor val$executor>
	//   29   67:invokevirtual   #75  <Method Task Task.onSuccessTask(Continuation, Executor)>
	//   30   70:areturn         
		else
			return Task.forResult(((Object) (null)));
	//   31   71:aconst_null     
	//   32   72:invokestatic    #71  <Method Task Task.forResult(Object)>
	//   33   75:areturn         
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

	Task$9()
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
