// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//			Task, CancellationToken, TaskCompletionSource

static final class Task$4
	implements Runnable
{

	public void run()
	{
		CancellationException cancellationexception;
		CancellationToken cancellationtoken = val$ct;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CancellationToken val$ct>
	//    2    4:astore_1        
		if(cancellationtoken != null && cancellationtoken.isCancellationRequested())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #40  <Method boolean CancellationToken.isCancellationRequested()>
	//*   7   13:ifeq            24
		{
			val$tcs.setCancelled();
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field TaskCompletionSource val$tcs>
	//   10   20:invokevirtual   #45  <Method void TaskCompletionSource.setCancelled()>
			return;
	//   11   23:return          
		}
		try
		{
			val$tcs.setResult(val$callable.call());
	//   12   24:aload_0         
	//   13   25:getfield        #23  <Field TaskCompletionSource val$tcs>
	//   14   28:aload_0         
	//   15   29:getfield        #25  <Field Callable val$callable>
	//   16   32:invokeinterface #50  <Method Object Callable.call()>
	//   17   37:invokevirtual   #54  <Method void TaskCompletionSource.setResult(Object)>
			return;
	//   18   40:return          
		}
	//*  19   41:astore_1        
	//*  20   42:aload_0         
	//*  21   43:getfield        #23  <Field TaskCompletionSource val$tcs>
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #58  <Method void TaskCompletionSource.setError(Exception)>
	//*  24   50:return          
	//*  25   51:aload_0         
	//*  26   52:getfield        #23  <Field TaskCompletionSource val$tcs>
	//*  27   55:invokevirtual   #45  <Method void TaskCompletionSource.setCancelled()>
	//*  28   58:return          
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
	//*  29   59:astore_1        
	//*  30   60:goto            51
	}

	final Callable val$callable;
	final CancellationToken val$ct;
	final TaskCompletionSource val$tcs;

	Task$4(CancellationToken cancellationtoken, TaskCompletionSource taskcompletionsource, Callable callable1)
	{
		val$ct = cancellationtoken;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CancellationToken val$ct>
		val$tcs = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field TaskCompletionSource val$tcs>
		val$callable = callable1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Callable val$callable>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
