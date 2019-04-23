// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abe, abo

final class aaz
	implements Runnable
{

	aaz(abo abo1, abe abe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = abo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field abo a>
		b = abe1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field abe b>
	//    8   14:return          
	}

	public final void run()
	{
		abo abo1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field abo a>
	//    2    4:astore_1        
		abe abe1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field abe b>
	//    5    9:astore_2        
		try
		{
			abo1.b(abe1.get());
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #33  <Method Object abe.get()>
	//    9   17:invokevirtual   #38  <Method void abo.b(Object)>
			return;
	//   10   20:return          
		}
	//*  11   21:astore_2        
	//*  12   22:aload_1         
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #41  <Method void abo.a(Throwable)>
	//*  15   27:return          
	//*  16   28:astore_2        
	//*  17   29:invokestatic    #47  <Method Thread Thread.currentThread()>
	//*  18   32:invokevirtual   #50  <Method void Thread.interrupt()>
	//*  19   35:aload_1         
	//*  20   36:aload_2         
	//*  21   37:invokevirtual   #41  <Method void abo.a(Throwable)>
	//*  22   40:return          
		catch(ExecutionException executionexception)
	//*  23   41:astore_2        
		{
			abo1.a(executionexception.getCause());
	//   24   42:aload_1         
	//   25   43:aload_2         
	//   26   44:invokevirtual   #54  <Method Throwable ExecutionException.getCause()>
	//   27   47:invokevirtual   #41  <Method void abo.a(Throwable)>
		}
		catch(InterruptedException interruptedexception)
		{
			Thread.currentThread().interrupt();
			abo1.a(((Throwable) (interruptedexception)));
			return;
		}
		catch(Exception exception)
		{
			abo1.a(((Throwable) (exception)));
			return;
		}
	//   28   50:return          
	}

	private final abo a;
	private final abe b;
}
