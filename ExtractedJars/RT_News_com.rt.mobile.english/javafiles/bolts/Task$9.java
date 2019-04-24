// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.Executor;

// Referenced classes of package bolts:
//			Continuation, Task, CancellationToken

class Task$9
	implements Continuation
{

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method Void then(Task)>
	//    3    5:areturn         
	}

	public Void then(Task task)
	{
		Task.access$100(val$tcs, val$continuation, task, val$executor, val$ct);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Task$TaskCompletionSource val$tcs>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Continuation val$continuation>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Executor val$executor>
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field CancellationToken val$ct>
	//    9   17:invokestatic    #50  <Method void Task.access$100(Task$TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	final Task this$0;
	final Continuation val$continuation;
	final CancellationToken val$ct;
	final Executor val$executor;
	final skCompletionSource val$tcs;

	Task$9()
	{
		this$0 = final_task;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Task this$0>
		val$tcs = skcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field Task$TaskCompletionSource val$tcs>
		val$continuation = continuation1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field Continuation val$continuation>
		val$executor = executor1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field Executor val$executor>
		val$ct = CancellationToken.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field CancellationToken val$ct>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}
