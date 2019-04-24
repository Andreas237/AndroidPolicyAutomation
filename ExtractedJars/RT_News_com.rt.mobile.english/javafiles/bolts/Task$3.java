// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//			Task, CancellationToken

static final class Task$3
	implements Runnable
{

	public void run()
	{
		CancellationException cancellationexception;
		if(val$ct != null && val$ct.isCancellationRequested())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field CancellationToken val$ct>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #21  <Field CancellationToken val$ct>
	//*   5   11:invokevirtual   #40  <Method boolean CancellationToken.isCancellationRequested()>
	//*   6   14:ifeq            25
		{
			val$tcs.setCancelled();
	//    7   17:aload_0         
	//    8   18:getfield        #23  <Field Task$TaskCompletionSource val$tcs>
	//    9   21:invokevirtual   #45  <Method void Task$TaskCompletionSource.setCancelled()>
			return;
	//   10   24:return          
		}
		try
		{
			val$tcs.setResult(val$callable.call());
	//   11   25:aload_0         
	//   12   26:getfield        #23  <Field Task$TaskCompletionSource val$tcs>
	//   13   29:aload_0         
	//   14   30:getfield        #25  <Field Callable val$callable>
	//   15   33:invokeinterface #50  <Method Object Callable.call()>
	//   16   38:invokevirtual   #54  <Method void Task$TaskCompletionSource.setResult(Object)>
			return;
	//   17   41:return          
		}
	//*  18   42:astore_1        
	//*  19   43:aload_0         
	//*  20   44:getfield        #23  <Field Task$TaskCompletionSource val$tcs>
	//*  21   47:aload_1         
	//*  22   48:invokevirtual   #58  <Method void Task$TaskCompletionSource.setError(Exception)>
	//*  23   51:return          
	//*  24   52:aload_0         
	//*  25   53:getfield        #23  <Field Task$TaskCompletionSource val$tcs>
	//*  26   56:invokevirtual   #45  <Method void Task$TaskCompletionSource.setCancelled()>
	//*  27   59:return          
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
	//*  28   60:astore_1        
	//*  29   61:goto            52
	}

	final Callable val$callable;
	final CancellationToken val$ct;
	final skCompletionSource val$tcs;

	Task$3(CancellationToken cancellationtoken, skCompletionSource skcompletionsource, Callable callable1)
	{
		val$ct = cancellationtoken;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CancellationToken val$ct>
		val$tcs = skcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Task$TaskCompletionSource val$tcs>
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
