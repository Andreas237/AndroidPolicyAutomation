// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase_messaging;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.firebase_messaging:
//			zza, zzc

final class zzd
	implements zza
{

	private zzd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	zzd(zzc zzc)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzd()>
	//    2    4:return          
	}

	public final ExecutorService zza(ThreadFactory threadfactory, int i)
	{
		threadfactory = ((ThreadFactory) (new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())), threadfactory)));
	//    0    0:new             #17  <Class ThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iconst_1        
	//    4    6:ldc2w           #18  <Long 60L>
	//    5    9:getstatic       #25  <Field TimeUnit TimeUnit.SECONDS>
	//    6   12:new             #27  <Class LinkedBlockingQueue>
	//    7   15:dup             
	//    8   16:invokespecial   #28  <Method void LinkedBlockingQueue()>
	//    9   19:aload_1         
	//   10   20:invokespecial   #31  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   11   23:astore_1        
		((ThreadPoolExecutor) (threadfactory)).allowCoreThreadTimeOut(true);
	//   12   24:aload_1         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #35  <Method void ThreadPoolExecutor.allowCoreThreadTimeOut(boolean)>
		return Executors.unconfigurableExecutorService(((ExecutorService) (threadfactory)));
	//   15   29:aload_1         
	//   16   30:invokestatic    #41  <Method ExecutorService Executors.unconfigurableExecutorService(ExecutorService)>
	//   17   33:areturn         
	}

	public final ScheduledExecutorService zza(int i, ThreadFactory threadfactory, int j)
	{
		return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadfactory));
	//    0    0:iconst_1        
	//    1    1:aload_2         
	//    2    2:invokestatic    #46  <Method ScheduledExecutorService Executors.newScheduledThreadPool(int, ThreadFactory)>
	//    3    5:invokestatic    #50  <Method ScheduledExecutorService Executors.unconfigurableScheduledExecutorService(ScheduledExecutorService)>
	//    4    8:areturn         
	}
}
