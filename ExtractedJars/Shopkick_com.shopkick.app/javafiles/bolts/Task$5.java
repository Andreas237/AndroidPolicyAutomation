// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package bolts:
//			Continuation, Task, TaskCompletionSource

static final class Task$5
	implements Continuation
{

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method Void then(Task)>
	//    3    5:areturn         
	}

	public Void then(Task task)
	{
		if(val$isAnyTaskComplete.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field AtomicBoolean val$isAnyTaskComplete>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #40  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            23
			val$firstCompleted.setResult(((Object) (task)));
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field TaskCompletionSource val$firstCompleted>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #46  <Method void TaskCompletionSource.setResult(Object)>
		else
	//*  10   20:goto            28
			task.getError();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #50  <Method Exception Task.getError()>
	//   13   27:pop             
		return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	final TaskCompletionSource val$firstCompleted;
	final AtomicBoolean val$isAnyTaskComplete;

	Task$5(AtomicBoolean atomicboolean, TaskCompletionSource taskcompletionsource)
	{
		val$isAnyTaskComplete = atomicboolean;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AtomicBoolean val$isAnyTaskComplete>
		val$firstCompleted = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field TaskCompletionSource val$firstCompleted>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
