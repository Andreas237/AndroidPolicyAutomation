// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abo

final class bsa
	implements Runnable
{

	bsa(abo abo1, Future future)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = abo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field abo a>
		b = future;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Future b>
	//    8   14:return          
	}

	public final void run()
	{
		abo abo1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field abo a>
	//    2    4:astore_1        
		Future future = b;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field Future b>
	//    5    9:astore_2        
		if(abo1.isCancelled())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #27  <Method boolean abo.isCancelled()>
	//*   8   14:ifeq            25
			future.cancel(true);
	//    9   17:aload_2         
	//   10   18:iconst_1        
	//   11   19:invokeinterface #33  <Method boolean Future.cancel(boolean)>
	//   12   24:pop             
	//   13   25:return          
	}

	private final abo a;
	private final Future b;
}
