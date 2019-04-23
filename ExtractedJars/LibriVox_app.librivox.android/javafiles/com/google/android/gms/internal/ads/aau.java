// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abe, aao, abo

final class aau
	implements Runnable
{

	aau(abo abo1, aao aao1, abe abe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = abo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field abo a>
		b = aao1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field aao b>
		c = abe1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field abe c>
	//   11   19:return          
	}

	public final void run()
	{
		CancellationException cancellationexception;
		abo abo1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field abo a>
	//    2    4:astore_3        
		aao aao1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field aao b>
	//    5    9:astore_1        
		abe abe1 = c;
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field abe c>
	//    8   14:astore_2        
		try
		{
			abo1.b(aao1.a(abe1.get()));
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokeinterface #39  <Method Object abe.get()>
	//   13   23:invokeinterface #44  <Method Object aao.a(Object)>
	//   14   28:invokevirtual   #49  <Method void abo.b(Object)>
			return;
	//   15   31:return          
		}
	//*  16   32:astore_1        
	//*  17   33:aload_3         
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #52  <Method void abo.a(Throwable)>
	//*  20   38:return          
	//*  21   39:astore_1        
	//*  22   40:invokestatic    #58  <Method Thread Thread.currentThread()>
	//*  23   43:invokevirtual   #61  <Method void Thread.interrupt()>
	//*  24   46:aload_3         
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #52  <Method void abo.a(Throwable)>
	//*  27   51:return          
	//*  28   52:astore_1        
	//*  29   53:aload_1         
	//*  30   54:invokevirtual   #65  <Method Throwable ExecutionException.getCause()>
	//*  31   57:astore_2        
	//*  32   58:aload_2         
	//*  33   59:ifnonnull       65
	//*  34   62:goto            67
	//*  35   65:aload_2         
	//*  36   66:astore_1        
	//*  37   67:aload_3         
	//*  38   68:aload_1         
	//*  39   69:invokevirtual   #52  <Method void abo.a(Throwable)>
	//*  40   72:return          
	//*  41   73:aload_3         
	//*  42   74:iconst_1        
	//*  43   75:invokevirtual   #69  <Method boolean abo.cancel(boolean)>
	//*  44   78:pop             
	//*  45   79:return          
		// Misplaced declaration of an exception variable
		catch(CancellationException cancellationexception)
		{
			abo1.cancel(true);
		}
		catch(Object obj)
		{
			Throwable throwable = ((ExecutionException) (obj)).getCause();
			if(throwable != null)
				obj = ((Object) (throwable));
			abo1.a(((Throwable) (obj)));
			return;
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
	//*  46   80:astore_1        
	//*  47   81:goto            73
	}

	private final abo a;
	private final aao b;
	private final abe c;
}
