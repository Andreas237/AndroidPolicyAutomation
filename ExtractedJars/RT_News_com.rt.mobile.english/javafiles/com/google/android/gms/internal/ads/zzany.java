// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanz, zzaoa

final class zzany
	implements zzanz
{

	zzany(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Object value>
	//    5    9:aload_0         
	//    6   10:new             #22  <Class zzaoa>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void zzaoa()>
	//    9   17:putfield        #25  <Field zzaoa zzcvt>
		zzcvt.zzsm();
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field zzaoa zzcvt>
	//   12   24:invokevirtual   #28  <Method void zzaoa.zzsm()>
	//   13   27:return          
	}

	public final boolean cancel(boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Object get()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object value>
	//    2    4:areturn         
	}

	public final Object get(long l, TimeUnit timeunit)
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object value>
	//    2    4:areturn         
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
	//    1    1:getfield        #25  <Field zzaoa zzcvt>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #45  <Method void zzaoa.zza(Runnable, Executor)>
	//    5    9:return          
	}

	private final Object value;
	private final zzaoa zzcvt = new zzaoa();
}
