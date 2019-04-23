// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abj, abi, xf, abe

public final class xe
{

	public static abe a(Runnable runnable)
	{
		return a.a(runnable);
	//    0    0:getstatic       #43  <Field abi a>
	//    1    3:aload_0         
	//    2    4:invokeinterface #69  <Method abe abi.a(Runnable)>
	//    3    9:areturn         
	}

	public static abe a(Callable callable)
	{
		return a.a(callable);
	//    0    0:getstatic       #43  <Field abi a>
	//    1    3:aload_0         
	//    2    4:invokeinterface #72  <Method abe abi.a(Callable)>
	//    3    9:areturn         
	}

	private static ThreadFactory a(String s)
	{
		return ((ThreadFactory) (new xf(s)));
	//    0    0:new             #74  <Class xf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #77  <Method void xf(String)>
	//    4    8:areturn         
	}

	public static final abi a;
	public static final abi b;
	public static final ScheduledExecutorService c = new ScheduledThreadPoolExecutor(3, a("Schedule"));

	static 
	{
		a = abj.a(((java.util.concurrent.Executor) (new ThreadPoolExecutor(2, 0x7fffffff, 10L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new SynchronousQueue())), a("Default")))));
	//    0    0:new             #14  <Class ThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:ldc1            #15  <Int 0x7fffffff>
	//    4    7:ldc2w           #16  <Long 10L>
	//    5   10:getstatic       #23  <Field TimeUnit TimeUnit.SECONDS>
	//    6   13:new             #25  <Class SynchronousQueue>
	//    7   16:dup             
	//    8   17:invokespecial   #28  <Method void SynchronousQueue()>
	//    9   20:ldc1            #30  <String "Default">
	//   10   22:invokestatic    #33  <Method ThreadFactory a(String)>
	//   11   25:invokespecial   #36  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   12   28:invokestatic    #41  <Method abi abj.a(java.util.concurrent.Executor)>
	//   13   31:putstatic       #43  <Field abi a>
		ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())), a("Loader"));
	//   14   34:new             #14  <Class ThreadPoolExecutor>
	//   15   37:dup             
	//   16   38:iconst_5        
	//   17   39:iconst_5        
	//   18   40:ldc2w           #16  <Long 10L>
	//   19   43:getstatic       #23  <Field TimeUnit TimeUnit.SECONDS>
	//   20   46:new             #45  <Class LinkedBlockingQueue>
	//   21   49:dup             
	//   22   50:invokespecial   #46  <Method void LinkedBlockingQueue()>
	//   23   53:ldc1            #48  <String "Loader">
	//   24   55:invokestatic    #33  <Method ThreadFactory a(String)>
	//   25   58:invokespecial   #36  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   26   61:astore_0        
		threadpoolexecutor.allowCoreThreadTimeOut(true);
	//   27   62:aload_0         
	//   28   63:iconst_1        
	//   29   64:invokevirtual   #52  <Method void ThreadPoolExecutor.allowCoreThreadTimeOut(boolean)>
		b = abj.a(((java.util.concurrent.Executor) (threadpoolexecutor)));
	//   30   67:aload_0         
	//   31   68:invokestatic    #41  <Method abi abj.a(java.util.concurrent.Executor)>
	//   32   71:putstatic       #54  <Field abi b>
	//   33   74:new             #56  <Class ScheduledThreadPoolExecutor>
	//   34   77:dup             
	//   35   78:iconst_3        
	//   36   79:ldc1            #58  <String "Schedule">
	//   37   81:invokestatic    #33  <Method ThreadFactory a(String)>
	//   38   84:invokespecial   #61  <Method void ScheduledThreadPoolExecutor(int, ThreadFactory)>
	//   39   87:putstatic       #63  <Field ScheduledExecutorService c>
	//*  40   90:return          
	}
}
