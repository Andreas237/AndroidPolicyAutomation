// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import android.util.Log;
import java.util.concurrent.*;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask

class AsyncTask$3 extends FutureTask
{

	protected void done()
	{
		try
		{
			AsyncTask.access$400(AsyncTask.this, get());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AsyncTask this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #30  <Method Object get()>
	//    4    8:invokestatic    #34  <Method void AsyncTask.access$400(AsyncTask, Object)>
			return;
	//    5   11:return          
		}
		catch(InterruptedException interruptedexception)
	//*   6   12:astore_1        
		{
			Log.w("AsyncTask", ((Throwable) (interruptedexception)));
	//    7   13:ldc1            #36  <String "AsyncTask">
	//    8   15:aload_1         
	//    9   16:invokestatic    #42  <Method int Log.w(String, Throwable)>
	//   10   19:pop             
			return;
	//   11   20:return          
		}
		catch(ExecutionException executionexception)
	//*  12   21:astore_1        
		{
			throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
	//   13   22:new             #44  <Class RuntimeException>
	//   14   25:dup             
	//   15   26:ldc1            #46  <String "An error occured while executing doInBackground()">
	//   16   28:aload_1         
	//   17   29:invokevirtual   #50  <Method Throwable ExecutionException.getCause()>
	//   18   32:invokespecial   #53  <Method void RuntimeException(String, Throwable)>
	//   19   35:athrow          
		}
		catch(CancellationException cancellationexception)
	//*  20   36:astore_1        
		{
			AsyncTask.access$400(AsyncTask.this, ((Object) (null)));
	//   21   37:aload_0         
	//   22   38:getfield        #15  <Field AsyncTask this$0>
	//   23   41:aconst_null     
	//   24   42:invokestatic    #34  <Method void AsyncTask.access$400(AsyncTask, Object)>
		}
	//   25   45:return          
	}

	final AsyncTask this$0;

	AsyncTask$3(Callable callable)
	{
		this$0 = AsyncTask.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AsyncTask this$0>
		super(callable);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void FutureTask(Callable)>
	//    6   10:return          
	}
}
