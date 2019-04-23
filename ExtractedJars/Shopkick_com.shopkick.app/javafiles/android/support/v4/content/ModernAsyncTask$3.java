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
		CancellationException cancellationexception;
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
	//*   8   14:astore_1        
	//*   9   15:new             #38  <Class RuntimeException>
	//*  10   18:dup             
	//*  11   19:ldc1            #40  <String "An error occurred while executing doInBackground()">
	//*  12   21:aload_1         
	//*  13   22:invokespecial   #43  <Method void RuntimeException(String, Throwable)>
	//*  14   25:athrow          
	//*  15   26:aload_0         
	//*  16   27:getfield        #15  <Field ModernAsyncTask this$0>
	//*  17   30:aconst_null     
	//*  18   31:invokevirtual   #36  <Method void ModernAsyncTask.postResultIfNotInvoked(Object)>
	//*  19   34:return          
	//*  20   35:astore_1        
	//*  21   36:new             #38  <Class RuntimeException>
	//*  22   39:dup             
	//*  23   40:ldc1            #40  <String "An error occurred while executing doInBackground()">
	//*  24   42:aload_1         
	//*  25   43:invokevirtual   #47  <Method Throwable ExecutionException.getCause()>
	//*  26   46:invokespecial   #43  <Method void RuntimeException(String, Throwable)>
	//*  27   49:athrow          
		catch(InterruptedException interruptedexception)
	//*  28   50:astore_1        
		{
			Log.w("AsyncTask", ((Throwable) (interruptedexception)));
	//   29   51:ldc1            #49  <String "AsyncTask">
	//   30   53:aload_1         
	//   31   54:invokestatic    #55  <Method int Log.w(String, Throwable)>
	//   32   57:pop             
		}
		catch(ExecutionException executionexception)
		{
			throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
		}
	//*  33   58:return          
		// Misplaced declaration of an exception variable
		catch(CancellationException cancellationexception)
		{
			postResultIfNotInvoked(((Object) (null)));
			return;
		}
		catch(Throwable throwable)
		{
			throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
		}
	//*  34   59:astore_1        
	//*  35   60:goto            26
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
