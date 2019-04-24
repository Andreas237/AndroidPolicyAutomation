// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzani, zzaof

final class zzaoh extends zzani
{

	private zzaoh(Executor executor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzani()>
		zzcwd = executor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Executor zzcwd>
	//    5    9:return          
	}

	zzaoh(Executor executor, zzaof zzaof)
	{
		this(executor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void zzaoh(Executor)>
	//    3    5:return          
	}

	public final boolean awaitTermination(long l, TimeUnit timeunit)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #21  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final void execute(Runnable runnable)
	{
		zzcwd.execute(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Executor zzcwd>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method void Executor.execute(Runnable)>
	//    4   10:return          
	}

	public final boolean isShutdown()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isTerminated()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void shutdown()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #21  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final List shutdownNow()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #21  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private final Executor zzcwd;
}
