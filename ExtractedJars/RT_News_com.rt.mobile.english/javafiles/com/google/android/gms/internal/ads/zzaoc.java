// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanz, zzaoa

final class zzaoc extends FutureTask
	implements zzanz
{

	zzaoc(Runnable runnable, Object obj)
	{
		super(runnable, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void FutureTask(Runnable, Object)>
		zzcvt = new zzaoa();
	//    4    6:aload_0         
	//    5    7:new             #17  <Class zzaoa>
	//    6   10:dup             
	//    7   11:invokespecial   #20  <Method void zzaoa()>
	//    8   14:putfield        #22  <Field zzaoa zzcvt>
	//    9   17:return          
	}

	zzaoc(Callable callable)
	{
		super(callable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void FutureTask(Callable)>
		zzcvt = new zzaoa();
	//    3    5:aload_0         
	//    4    6:new             #17  <Class zzaoa>
	//    5    9:dup             
	//    6   10:invokespecial   #20  <Method void zzaoa()>
	//    7   13:putfield        #22  <Field zzaoa zzcvt>
	//    8   16:return          
	}

	protected final void done()
	{
		zzcvt.zzsm();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaoa zzcvt>
	//    2    4:invokevirtual   #34  <Method void zzaoa.zzsm()>
	//    3    7:return          
	}

	public final void zza(Runnable runnable, Executor executor)
	{
		zzcvt.zza(runnable, executor);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzaoa zzcvt>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method void zzaoa.zza(Runnable, Executor)>
	//    5    9:return          
	}

	private final zzaoa zzcvt;
}
