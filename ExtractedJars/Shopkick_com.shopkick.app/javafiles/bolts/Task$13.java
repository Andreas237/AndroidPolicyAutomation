// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			Continuation, Task, CancellationToken

class Task$13
	implements Continuation
{

	public Task then(Task task)
	{
		CancellationToken cancellationtoken = val$ct;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field CancellationToken val$ct>
	//    2    4:astore_2        
		if(cancellationtoken != null && cancellationtoken.isCancellationRequested())
	//*   3    5:aload_2         
	//*   4    6:ifnull          20
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #38  <Method boolean CancellationToken.isCancellationRequested()>
	//*   7   13:ifeq            20
			return Task.cancelled();
	//    8   16:invokestatic    #42  <Method Task Task.cancelled()>
	//    9   19:areturn         
		if(task.isFaulted())
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #45  <Method boolean Task.isFaulted()>
	//*  12   24:ifeq            35
			return Task.forError(task.getError());
	//   13   27:aload_1         
	//   14   28:invokevirtual   #49  <Method Exception Task.getError()>
	//   15   31:invokestatic    #53  <Method Task Task.forError(Exception)>
	//   16   34:areturn         
		if(task.isCancelled())
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #56  <Method boolean Task.isCancelled()>
	//*  19   39:ifeq            46
			return Task.cancelled();
	//   20   42:invokestatic    #42  <Method Task Task.cancelled()>
	//   21   45:areturn         
		else
			return task.continueWithTask(val$continuation);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #26  <Field Continuation val$continuation>
	//   25   51:invokevirtual   #60  <Method Task Task.continueWithTask(Continuation)>
	//   26   54:areturn         
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

	Task$13()
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
