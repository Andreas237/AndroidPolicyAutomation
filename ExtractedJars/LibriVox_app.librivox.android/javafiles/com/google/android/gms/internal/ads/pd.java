// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ov, abo, wx

final class pd
	implements Runnable
{

	pd(AtomicInteger atomicinteger, int i, abo abo1, List list)
	{
		a = atomicinteger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AtomicInteger a>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int b>
		c = abo1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field abo c>
		d = list;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field List d>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #27  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		if(a.incrementAndGet() < b)
			break MISSING_BLOCK_LABEL_40;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AtomicInteger a>
	//    2    4:invokevirtual   #39  <Method int AtomicInteger.incrementAndGet()>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field int b>
	//    5   11:icmplt          40
		c.b(((Object) (ov.a(d))));
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field abo c>
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field List d>
	//   10   22:invokestatic    #44  <Method List ov.a(List)>
	//   11   25:invokevirtual   #49  <Method void abo.b(Object)>
		return;
	//   12   28:return          
		Object obj;
		obj;
	//   13   29:astore_1        
		break MISSING_BLOCK_LABEL_34;
	//   14   30:goto            34
		obj;
	//   15   33:astore_1        
		wx.c("Unable to convert list of futures to a future of list", ((Throwable) (obj)));
	//   16   34:ldc1            #51  <String "Unable to convert list of futures to a future of list">
	//   17   36:aload_1         
	//   18   37:invokestatic    #56  <Method void wx.c(String, Throwable)>
	//   19   40:return          
	}

	private final AtomicInteger a;
	private final int b;
	private final abo c;
	private final List d;
}
