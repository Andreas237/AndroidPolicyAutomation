// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			PriorityThreadPoolExecutor

protected static final class PriorityThreadPoolExecutor$PriorityThreadFactory
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (new Thread(runnable)));
	//    0    0:new             #23  <Class Thread>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #26  <Method void Thread(Runnable)>
	//    4    8:astore_1        
		((Thread) (runnable)).setPriority(threadPriority);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field int threadPriority>
	//    8   14:invokevirtual   #29  <Method void Thread.setPriority(int)>
		((Thread) (runnable)).setName("Queue");
	//    9   17:aload_1         
	//   10   18:ldc1            #31  <String "Queue">
	//   11   20:invokevirtual   #35  <Method void Thread.setName(String)>
		return ((Thread) (runnable));
	//   12   23:aload_1         
	//   13   24:areturn         
	}

	private final int threadPriority;

	public PriorityThreadPoolExecutor$PriorityThreadFactory(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		threadPriority = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int threadPriority>
	//    5    9:return          
	}
}
