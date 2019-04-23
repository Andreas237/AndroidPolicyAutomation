// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//			Task, CancellationToken, TaskCompletionSource, Continuation

static final class Task$14
	implements Runnable
{

	public void run()
	{
		CancellationException cancellationexception;
		CancellationToken cancellationtoken = val$ct;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CancellationToken val$ct>
	//    2    4:astore_1        
		if(cancellationtoken != null && cancellationtoken.isCancellationRequested())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #44  <Method boolean CancellationToken.isCancellationRequested()>
	//*   7   13:ifeq            24
		{
			val$tcs.setCancelled();
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field TaskCompletionSource val$tcs>
	//   10   20:invokevirtual   #49  <Method void TaskCompletionSource.setCancelled()>
			return;
	//   11   23:return          
		}
		try
		{
			Object obj = val$continuation.then(val$task);
	//   12   24:aload_0         
	//   13   25:getfield        #27  <Field Continuation val$continuation>
	//   14   28:aload_0         
	//   15   29:getfield        #29  <Field Task val$task>
	//   16   32:invokeinterface #55  <Method Object Continuation.then(Task)>
	//   17   37:astore_1        
			val$tcs.setResult(obj);
	//   18   38:aload_0         
	//   19   39:getfield        #25  <Field TaskCompletionSource val$tcs>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #59  <Method void TaskCompletionSource.setResult(Object)>
			return;
	//   22   46:return          
		}
	//*  23   47:astore_1        
	//*  24   48:aload_0         
	//*  25   49:getfield        #25  <Field TaskCompletionSource val$tcs>
	//*  26   52:aload_1         
	//*  27   53:invokevirtual   #63  <Method void TaskCompletionSource.setError(Exception)>
	//*  28   56:return          
	//*  29   57:aload_0         
	//*  30   58:getfield        #25  <Field TaskCompletionSource val$tcs>
	//*  31   61:invokevirtual   #49  <Method void TaskCompletionSource.setCancelled()>
	//*  32   64:return          
		// Misplaced declaration of an exception variable
		catch(CancellationException cancellationexception)
		{
			val$tcs.setCancelled();
		}
		catch(Exception exception)
		{
			val$tcs.setError(exception);
			return;
		}
	//*  33   65:astore_1        
	//*  34   66:goto            57
	}

	final Continuation val$continuation;
	final CancellationToken val$ct;
	final Task val$task;
	final TaskCompletionSource val$tcs;

	Task$14(CancellationToken cancellationtoken, TaskCompletionSource taskcompletionsource, Continuation continuation1, Task task1)
	{
		val$ct = cancellationtoken;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CancellationToken val$ct>
		val$tcs = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field TaskCompletionSource val$tcs>
		val$continuation = continuation1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Continuation val$continuation>
		val$task = task1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field Task val$task>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
