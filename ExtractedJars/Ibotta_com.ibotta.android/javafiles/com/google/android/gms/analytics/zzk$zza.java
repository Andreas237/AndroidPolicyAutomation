// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.analytics:
//			zzk, zzm

final class zzk$zza extends ThreadPoolExecutor
{

	protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
	{
		return ((RunnableFuture) (new zzm(this, runnable, obj)));
	//    0    0:new             #45  <Class zzm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #48  <Method void zzm(zzk$zza, Runnable, Object)>
	//    6   10:areturn         
	}

	final zzk zzsi;

	public zzk$zza(zzk zzk1)
	{
		zzsi = zzk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzk zzsi>
		super(1, 1, 1L, TimeUnit.MINUTES, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())));
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:iconst_1        
	//    6    8:lconst_1        
	//    7    9:getstatic       #19  <Field TimeUnit TimeUnit.MINUTES>
	//    8   12:new             #21  <Class LinkedBlockingQueue>
	//    9   15:dup             
	//   10   16:invokespecial   #24  <Method void LinkedBlockingQueue()>
	//   11   19:invokespecial   #27  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue)>
		setThreadFactory(((java.util.concurrent.ThreadFactory) (new zzk$zzb(((zzl) (null))))));
	//   12   22:aload_0         
	//   13   23:new             #29  <Class zzk$zzb>
	//   14   26:dup             
	//   15   27:aconst_null     
	//   16   28:invokespecial   #32  <Method void zzk$zzb(zzl)>
	//   17   31:invokevirtual   #36  <Method void setThreadFactory(java.util.concurrent.ThreadFactory)>
		allowCoreThreadTimeOut(true);
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void allowCoreThreadTimeOut(boolean)>
	//   21   39:return          
	}
}
