// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abe, aap

final class aat
	implements Runnable
{

	aat(aap aap1, abe abe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = aap1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field aap a>
		b = abe1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field abe b>
	//    8   14:return          
	}

	public final void run()
	{
		Object obj;
		aap aap1;
		aap1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field aap a>
	//    2    4:astore_2        
		obj = ((Object) (b));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field abe b>
	//    5    9:astore_1        
		aap1.a(((abe) (obj)).get());
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokeinterface #33  <Method Object abe.get()>
	//    9   17:invokeinterface #38  <Method void aap.a(Object)>
		return;
	//   10   22:return          
		Object obj1;
		obj1;
	//   11   23:astore_1        
		break MISSING_BLOCK_LABEL_43;
	//   12   24:goto            43
		obj1;
	//   13   27:astore_1        
		Thread.currentThread().interrupt();
	//   14   28:invokestatic    #44  <Method Thread Thread.currentThread()>
	//   15   31:invokevirtual   #47  <Method void Thread.interrupt()>
		break MISSING_BLOCK_LABEL_43;
	//   16   34:goto            43
		obj1;
	//   17   37:astore_1        
		obj1 = ((Object) (((ExecutionException) (obj1)).getCause()));
	//   18   38:aload_1         
	//   19   39:invokevirtual   #51  <Method Throwable ExecutionException.getCause()>
	//   20   42:astore_1        
		aap1.a(((Throwable) (obj1)));
	//   21   43:aload_2         
	//   22   44:aload_1         
	//   23   45:invokeinterface #54  <Method void aap.a(Throwable)>
		return;
	//   24   50:return          
	}

	private final aap a;
	private final abe b;
}
