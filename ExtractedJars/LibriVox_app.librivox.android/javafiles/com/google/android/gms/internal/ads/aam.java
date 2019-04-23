// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abi, abe, abh

public abstract class aam extends AbstractExecutorService
	implements abi
{

	public aam()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractExecutorService()>
	//    2    4:return          
	}

	public final abe a(Runnable runnable)
	{
		return (abe)super.submit(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method Future AbstractExecutorService.submit(Runnable)>
	//    3    5:checkcast       #20  <Class abe>
	//    4    8:areturn         
	}

	public final abe a(Callable callable)
	{
		return (abe)super.submit(callable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method Future AbstractExecutorService.submit(Callable)>
	//    3    5:checkcast       #20  <Class abe>
	//    4    8:areturn         
	}

	protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
	{
		return ((RunnableFuture) (new abh(runnable, obj)));
	//    0    0:new             #28  <Class abh>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #31  <Method void abh(Runnable, Object)>
	//    5    9:areturn         
	}

	protected final RunnableFuture newTaskFor(Callable callable)
	{
		return ((RunnableFuture) (new abh(callable)));
	//    0    0:new             #28  <Class abh>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #35  <Method void abh(Callable)>
	//    4    8:areturn         
	}

	public Future submit(Runnable runnable)
	{
		return ((Future) (a(runnable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #37  <Method abe a(Runnable)>
	//    3    5:areturn         
	}

	public Future submit(Runnable runnable, Object obj)
	{
		return ((Future) ((abe)super.submit(runnable, obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #41  <Method Future AbstractExecutorService.submit(Runnable, Object)>
	//    4    6:checkcast       #20  <Class abe>
	//    5    9:areturn         
	}

	public Future submit(Callable callable)
	{
		return ((Future) (a(callable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method abe a(Callable)>
	//    3    5:areturn         
	}
}
