// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanz, zzaoa

final class zzanx
	implements zzanz
{

	zzanx(Throwable throwable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		cause = throwable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Throwable cause>
	//    5    9:aload_0         
	//    6   10:new             #21  <Class zzaoa>
	//    7   13:dup             
	//    8   14:invokespecial   #22  <Method void zzaoa()>
	//    9   17:putfield        #24  <Field zzaoa zzcvt>
		zzcvt.zzsm();
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field zzaoa zzcvt>
	//   12   24:invokevirtual   #27  <Method void zzaoa.zzsm()>
	//   13   27:return          
	}

	public final boolean cancel(boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Object get()
		throws ExecutionException
	{
		throw new ExecutionException(cause);
	//    0    0:new             #34  <Class ExecutionException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Throwable cause>
	//    4    8:invokespecial   #36  <Method void ExecutionException(Throwable)>
	//    5   11:athrow          
	}

	public final Object get(long l, TimeUnit timeunit)
		throws ExecutionException
	{
		throw new ExecutionException(cause);
	//    0    0:new             #34  <Class ExecutionException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Throwable cause>
	//    4    8:invokespecial   #36  <Method void ExecutionException(Throwable)>
	//    5   11:athrow          
	}

	public final boolean isCancelled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isDone()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void zza(Runnable runnable, Executor executor)
	{
		zzcvt.zza(runnable, executor);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzaoa zzcvt>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #48  <Method void zzaoa.zza(Runnable, Executor)>
	//    5    9:return          
	}

	private final Throwable cause;
	private final zzaoa zzcvt = new zzaoa();
}
