// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoe, zzaod, zzakj, zzanz

public final class zzaki
{

	public static zzanz zza(Callable callable)
	{
		return zzcrj.zza(callable);
	//    0    0:getstatic       #43  <Field zzaod zzcrj>
	//    1    3:aload_0         
	//    2    4:invokeinterface #60  <Method zzanz zzaod.zza(Callable)>
	//    3    9:areturn         
	}

	public static zzanz zzb(Runnable runnable)
	{
		return zzcrj.zze(runnable);
	//    0    0:getstatic       #43  <Field zzaod zzcrj>
	//    1    3:aload_0         
	//    2    4:invokeinterface #67  <Method zzanz zzaod.zze(Runnable)>
	//    3    9:areturn         
	}

	public static zzanz zzc(Runnable runnable)
	{
		return zzcrk.zze(runnable);
	//    0    0:getstatic       #54  <Field zzaod zzcrk>
	//    1    3:aload_0         
	//    2    4:invokeinterface #67  <Method zzanz zzaod.zze(Runnable)>
	//    3    9:areturn         
	}

	private static ThreadFactory zzct(String s)
	{
		return ((ThreadFactory) (new zzakj(s)));
	//    0    0:new             #71  <Class zzakj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #74  <Method void zzakj(String)>
	//    4    8:areturn         
	}

	public static final zzaod zzcrj;
	private static final zzaod zzcrk;

	static 
	{
		zzcrj = zzaoe.zza(((java.util.concurrent.Executor) (new ThreadPoolExecutor(2, 0x7fffffff, 10L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new SynchronousQueue())), zzct("Default")))));
	//    0    0:new             #12  <Class ThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:ldc1            #13  <Int 0x7fffffff>
	//    4    7:ldc2w           #14  <Long 10L>
	//    5   10:getstatic       #21  <Field TimeUnit TimeUnit.SECONDS>
	//    6   13:new             #23  <Class SynchronousQueue>
	//    7   16:dup             
	//    8   17:invokespecial   #26  <Method void SynchronousQueue()>
	//    9   20:ldc1            #28  <String "Default">
	//   10   22:invokestatic    #32  <Method ThreadFactory zzct(String)>
	//   11   25:invokespecial   #35  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   12   28:invokestatic    #41  <Method zzaod zzaoe.zza(java.util.concurrent.Executor)>
	//   13   31:putstatic       #43  <Field zzaod zzcrj>
		ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())), zzct("Loader"));
	//   14   34:new             #12  <Class ThreadPoolExecutor>
	//   15   37:dup             
	//   16   38:iconst_5        
	//   17   39:iconst_5        
	//   18   40:ldc2w           #14  <Long 10L>
	//   19   43:getstatic       #21  <Field TimeUnit TimeUnit.SECONDS>
	//   20   46:new             #45  <Class LinkedBlockingQueue>
	//   21   49:dup             
	//   22   50:invokespecial   #46  <Method void LinkedBlockingQueue()>
	//   23   53:ldc1            #48  <String "Loader">
	//   24   55:invokestatic    #32  <Method ThreadFactory zzct(String)>
	//   25   58:invokespecial   #35  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   26   61:astore_0        
		threadpoolexecutor.allowCoreThreadTimeOut(true);
	//   27   62:aload_0         
	//   28   63:iconst_1        
	//   29   64:invokevirtual   #52  <Method void ThreadPoolExecutor.allowCoreThreadTimeOut(boolean)>
		zzcrk = zzaoe.zza(((java.util.concurrent.Executor) (threadpoolexecutor)));
	//   30   67:aload_0         
	//   31   68:invokestatic    #41  <Method zzaod zzaoe.zza(java.util.concurrent.Executor)>
	//   32   71:putstatic       #54  <Field zzaod zzcrk>
	//*  33   74:return          
	}
}
