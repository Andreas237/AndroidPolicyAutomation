// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.util.Log;
import java.util.concurrent.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			ed

class ed$3 extends FutureTask
{

	protected void done()
	{
		try
		{
			ed.b(a, ed.b(a).get());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ed a>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field ed a>
	//    4    8:invokestatic    #30  <Method FutureTask ed.b(ed)>
	//    5   11:invokevirtual   #34  <Method Object FutureTask.get()>
	//    6   14:invokestatic    #37  <Method void ed.b(ed, Object)>
			return;
	//    7   17:return          
		}
		catch(InterruptedException interruptedexception)
	//*   8   18:astore_1        
		{
			Log.w("AbstractAsyncTask", ((Throwable) (interruptedexception)));
	//    9   19:ldc1            #39  <String "AbstractAsyncTask">
	//   10   21:aload_1         
	//   11   22:invokestatic    #45  <Method int Log.w(String, Throwable)>
	//   12   25:pop             
			return;
	//   13   26:return          
		}
		catch(ExecutionException executionexception)
	//*  14   27:astore_1        
		{
			throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
	//   15   28:new             #47  <Class RuntimeException>
	//   16   31:dup             
	//   17   32:ldc1            #49  <String "An error occured while executing doInBackground()">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #53  <Method Throwable ExecutionException.getCause()>
	//   20   38:invokespecial   #56  <Method void RuntimeException(String, Throwable)>
	//   21   41:athrow          
		}
		catch(CancellationException cancellationexception)
	//*  22   42:astore_1        
		{
			ed.b(a, ((Object) (null)));
	//   23   43:aload_0         
	//   24   44:getfield        #15  <Field ed a>
	//   25   47:aconst_null     
	//   26   48:invokestatic    #37  <Method void ed.b(ed, Object)>
		}
	//   27   51:return          
	}

	final ed a;

	ed$3(ed ed1, Callable callable)
	{
		a = ed1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ed a>
		super(callable);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void FutureTask(Callable)>
	//    6   10:return          
	}
}
