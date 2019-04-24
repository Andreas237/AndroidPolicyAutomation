// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaod, zzaoc, zzanz

public abstract class zzani extends AbstractExecutorService
	implements zzaod
{

	public zzani()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractExecutorService()>
	//    2    4:return          
	}

	protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
	{
		return ((RunnableFuture) (new zzaoc(runnable, obj)));
	//    0    0:new             #16  <Class zzaoc>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #19  <Method void zzaoc(Runnable, Object)>
	//    5    9:areturn         
	}

	protected final RunnableFuture newTaskFor(Callable callable)
	{
		return ((RunnableFuture) (new zzaoc(callable)));
	//    0    0:new             #16  <Class zzaoc>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #25  <Method void zzaoc(Callable)>
	//    4    8:areturn         
	}

	public Future submit(Runnable runnable)
	{
		return ((Future) (zze(runnable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method zzanz zze(Runnable)>
	//    3    5:areturn         
	}

	public Future submit(Runnable runnable, Object obj)
	{
		return ((Future) ((zzanz)super.submit(runnable, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method Future AbstractExecutorService.submit(Runnable, Object)>
	//    4    6:checkcast       #38  <Class zzanz>
	//    5    9:areturn         
	}

	public Future submit(Callable callable)
	{
		return ((Future) (zza(callable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method zzanz zza(Callable)>
	//    3    5:areturn         
	}

	public final zzanz zza(Callable callable)
		throws RejectedExecutionException
	{
		return (zzanz)super.submit(callable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method Future AbstractExecutorService.submit(Callable)>
	//    3    5:checkcast       #38  <Class zzanz>
	//    4    8:areturn         
	}

	public final zzanz zze(Runnable runnable)
		throws RejectedExecutionException
	{
		return (zzanz)super.submit(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method Future AbstractExecutorService.submit(Runnable)>
	//    3    5:checkcast       #38  <Class zzanz>
	//    4    8:areturn         
	}
}
