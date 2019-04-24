// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//			Task, CancellationToken, Continuation

static final class Task$13
	implements Runnable
{

	public void run()
	{
		CancellationException cancellationexception;
		if(val$ct != null && val$ct.isCancellationRequested())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field CancellationToken val$ct>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field CancellationToken val$ct>
	//*   5   11:invokevirtual   #44  <Method boolean CancellationToken.isCancellationRequested()>
	//*   6   14:ifeq            25
		{
			val$tcs.setCancelled();
	//    7   17:aload_0         
	//    8   18:getfield        #25  <Field Task$TaskCompletionSource val$tcs>
	//    9   21:invokevirtual   #49  <Method void Task$TaskCompletionSource.setCancelled()>
			return;
	//   10   24:return          
		}
		try
		{
			Object obj = val$continuation.then(val$task);
	//   11   25:aload_0         
	//   12   26:getfield        #27  <Field Continuation val$continuation>
	//   13   29:aload_0         
	//   14   30:getfield        #29  <Field Task val$task>
	//   15   33:invokeinterface #55  <Method Object Continuation.then(Task)>
	//   16   38:astore_1        
			val$tcs.setResult(obj);
	//   17   39:aload_0         
	//   18   40:getfield        #25  <Field Task$TaskCompletionSource val$tcs>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #59  <Method void Task$TaskCompletionSource.setResult(Object)>
			return;
	//   21   47:return          
		}
	//*  22   48:astore_1        
	//*  23   49:aload_0         
	//*  24   50:getfield        #25  <Field Task$TaskCompletionSource val$tcs>
	//*  25   53:aload_1         
	//*  26   54:invokevirtual   #63  <Method void Task$TaskCompletionSource.setError(Exception)>
	//*  27   57:return          
	//*  28   58:aload_0         
	//*  29   59:getfield        #25  <Field Task$TaskCompletionSource val$tcs>
	//*  30   62:invokevirtual   #49  <Method void Task$TaskCompletionSource.setCancelled()>
	//*  31   65:return          
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
	//*  32   66:astore_1        
	//*  33   67:goto            58
	}

	final Continuation val$continuation;
	final CancellationToken val$ct;
	final Task val$task;
	final kCompletionSource val$tcs;

	Task$13(CancellationToken cancellationtoken, kCompletionSource kcompletionsource, Continuation continuation1, Task task1)
	{
		val$ct = cancellationtoken;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CancellationToken val$ct>
		val$tcs = kcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Task$TaskCompletionSource val$tcs>
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
