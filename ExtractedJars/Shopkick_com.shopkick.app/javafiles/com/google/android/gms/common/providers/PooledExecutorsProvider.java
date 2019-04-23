// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.providers;

import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.gms.common.providers:
//			zza

public class PooledExecutorsProvider
{
	public static interface PooledExecutorFactory
	{

		public abstract ScheduledExecutorService newSingleThreadScheduledExecutor();
	}


	private PooledExecutorsProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static PooledExecutorFactory getInstance()
	{
		com/google/android/gms/common/providers/PooledExecutorsProvider;
	//    0    0:ldc1            #2   <Class PooledExecutorsProvider>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		PooledExecutorFactory pooledexecutorfactory;
		if(zzey == null)
	//*   2    3:getstatic       #19  <Field PooledExecutorsProvider$PooledExecutorFactory zzey>
	//*   3    6:ifnonnull       19
			zzey = ((PooledExecutorFactory) (new zza()));
	//    4    9:new             #21  <Class zza>
	//    5   12:dup             
	//    6   13:invokespecial   #22  <Method void zza()>
	//    7   16:putstatic       #19  <Field PooledExecutorsProvider$PooledExecutorFactory zzey>
		pooledexecutorfactory = zzey;
	//    8   19:getstatic       #19  <Field PooledExecutorsProvider$PooledExecutorFactory zzey>
	//    9   22:astore_0        
		com/google/android/gms/common/providers/PooledExecutorsProvider;
	//   10   23:ldc1            #2   <Class PooledExecutorsProvider>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return pooledexecutorfactory;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class PooledExecutorsProvider>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	private static PooledExecutorFactory zzey;
}
