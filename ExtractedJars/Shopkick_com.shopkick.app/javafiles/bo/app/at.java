// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.concurrent.*;

// Referenced classes of package bo.app:
//			dz

public final class at extends ThreadPoolExecutor
{

	public at(ThreadFactory threadfactory)
	{
		super(1, 1, 0L, a, dz.d(), threadfactory);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_1        
	//    3    3:lconst_0        
	//    4    4:getstatic       #15  <Field TimeUnit a>
	//    5    7:invokestatic    #24  <Method java.util.concurrent.BlockingQueue dz.d()>
	//    6   10:aload_1         
	//    7   11:invokespecial   #27  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
		setRejectedExecutionHandler(((java.util.concurrent.RejectedExecutionHandler) (new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy())));
	//    8   14:aload_0         
	//    9   15:new             #29  <Class java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy>
	//   10   18:dup             
	//   11   19:invokespecial   #31  <Method void java.util.concurrent.ThreadPoolExecutor$DiscardOldestPolicy()>
	//   12   22:invokevirtual   #35  <Method void setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler)>
	//   13   25:return          
	}

	private static final TimeUnit a;

	static 
	{
		a = TimeUnit.MILLISECONDS;
	//    0    0:getstatic       #13  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    1    3:putstatic       #15  <Field TimeUnit a>
	//*   2    6:return          
	}
}
