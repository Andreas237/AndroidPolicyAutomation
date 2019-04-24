// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.util.Log;
import java.util.concurrent.*;

// Referenced classes of package android.support.v4.content:
//			ModernAsyncTask

class ModernAsyncTask$3 extends FutureTask
{

	protected void done()
	{
		try
		{
			Object obj = get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Object get()>
	//    2    4:astore_1        
			postResultIfNotInvoked(obj);
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field ModernAsyncTask this$0>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #36  <Method void ModernAsyncTask.postResultIfNotInvoked(Object)>
			return;
	//    7   13:return          
		}
		catch(InterruptedException interruptedexception)
	//*   8   14:astore_1        
		{
			Log.w("AsyncTask", ((Throwable) (interruptedexception)));
	//    9   15:ldc1            #38  <String "AsyncTask">
	//   10   17:aload_1         
	//   11   18:invokestatic    #44  <Method int Log.w(String, Throwable)>
	//   12   21:pop             
			return;
	//   13   22:return          
		}
		catch(ExecutionException executionexception)
	//*  14   23:astore_1        
		{
			throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
	//   15   24:new             #46  <Class RuntimeException>
	//   16   27:dup             
	//   17   28:ldc1            #48  <String "An error occurred while executing doInBackground()">
	//   18   30:aload_1         
	//   19   31:invokevirtual   #52  <Method Throwable ExecutionException.getCause()>
	//   20   34:invokespecial   #55  <Method void RuntimeException(String, Throwable)>
	//   21   37:athrow          
		}
		catch(CancellationException cancellationexception)
	//*  22   38:astore_1        
		{
			postResultIfNotInvoked(((Object) (null)));
	//   23   39:aload_0         
	//   24   40:getfield        #15  <Field ModernAsyncTask this$0>
	//   25   43:aconst_null     
	//   26   44:invokevirtual   #36  <Method void ModernAsyncTask.postResultIfNotInvoked(Object)>
		}
	//*  27   47:return          
		catch(Throwable throwable)
	//*  28   48:astore_1        
		{
			throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
	//   29   49:new             #46  <Class RuntimeException>
	//   30   52:dup             
	//   31   53:ldc1            #48  <String "An error occurred while executing doInBackground()">
	//   32   55:aload_1         
	//   33   56:invokespecial   #55  <Method void RuntimeException(String, Throwable)>
	//   34   59:athrow          
		}
	}

	final ModernAsyncTask this$0;

	ModernAsyncTask$3(Callable callable)
	{
		this$0 = ModernAsyncTask.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ModernAsyncTask this$0>
		super(callable);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void FutureTask(Callable)>
	//    6   10:return          
	}
}
