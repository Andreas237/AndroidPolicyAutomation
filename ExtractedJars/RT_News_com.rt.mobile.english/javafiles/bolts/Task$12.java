// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			Continuation, Task, CancellationToken

class Task$12
	implements Continuation
{

	public Task then(Task task)
	{
		if(val$ct != null && val$ct.isCancellationRequested())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field CancellationToken val$ct>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #24  <Field CancellationToken val$ct>
	//*   5   11:invokevirtual   #38  <Method boolean CancellationToken.isCancellationRequested()>
	//*   6   14:ifeq            21
			return Task.cancelled();
	//    7   17:invokestatic    #42  <Method Task Task.cancelled()>
	//    8   20:areturn         
		if(task.isFaulted())
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #45  <Method boolean Task.isFaulted()>
	//*  11   25:ifeq            36
			return Task.forError(task.getError());
	//   12   28:aload_1         
	//   13   29:invokevirtual   #49  <Method Exception Task.getError()>
	//   14   32:invokestatic    #53  <Method Task Task.forError(Exception)>
	//   15   35:areturn         
		if(task.isCancelled())
	//*  16   36:aload_1         
	//*  17   37:invokevirtual   #56  <Method boolean Task.isCancelled()>
	//*  18   40:ifeq            47
			return Task.cancelled();
	//   19   43:invokestatic    #42  <Method Task Task.cancelled()>
	//   20   46:areturn         
		else
			return task.continueWithTask(val$continuation);
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:getfield        #26  <Field Continuation val$continuation>
	//   24   52:invokevirtual   #60  <Method Task Task.continueWithTask(Continuation)>
	//   25   55:areturn         
	}

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method Task then(Task)>
	//    3    5:areturn         
	}

	final Task this$0;
	final Continuation val$continuation;
	final CancellationToken val$ct;

	Task$12()
	{
		this$0 = final_task;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Task this$0>
		val$ct = cancellationtoken;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field CancellationToken val$ct>
		val$continuation = Continuation.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field Continuation val$continuation>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
