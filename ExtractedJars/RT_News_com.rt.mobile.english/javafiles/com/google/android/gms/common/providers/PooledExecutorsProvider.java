// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.providers;

import android.util.Log;
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
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static PooledExecutorFactory createDefaultFactory()
	{
		return ((PooledExecutorFactory) (new zza()));
	//    0    0:new             #18  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void zza()>
	//    3    7:areturn         
	}

	public static PooledExecutorFactory getInstance()
	{
		com/google/android/gms/common/providers/PooledExecutorsProvider;
	//    0    0:ldc1            #2   <Class PooledExecutorsProvider>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		PooledExecutorFactory pooledexecutorfactory;
		if(zzvs == null)
	//*   2    3:getstatic       #22  <Field PooledExecutorsProvider$PooledExecutorFactory zzvs>
	//*   3    6:ifnonnull       15
			zzvs = createDefaultFactory();
	//    4    9:invokestatic    #24  <Method PooledExecutorsProvider$PooledExecutorFactory createDefaultFactory()>
	//    5   12:putstatic       #22  <Field PooledExecutorsProvider$PooledExecutorFactory zzvs>
		pooledexecutorfactory = zzvs;
	//    6   15:getstatic       #22  <Field PooledExecutorsProvider$PooledExecutorFactory zzvs>
	//    7   18:astore_0        
		com/google/android/gms/common/providers/PooledExecutorsProvider;
	//    8   19:ldc1            #2   <Class PooledExecutorsProvider>
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
		return pooledexecutorfactory;
	//   10   22:aload_0         
	//   11   23:areturn         
		Exception exception;
		exception;
	//   12   24:astore_0        
	//*  13   25:ldc1            #2   <Class PooledExecutorsProvider>
		throw exception;
	//   14   27:monitorexit     
	//   15   28:aload_0         
	//   16   29:athrow          
	}

	public static void setInstance(PooledExecutorFactory pooledexecutorfactory)
	{
		com/google/android/gms/common/providers/PooledExecutorsProvider;
	//    0    0:ldc1            #2   <Class PooledExecutorsProvider>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzvs != null)
	//*   2    3:getstatic       #22  <Field PooledExecutorsProvider$PooledExecutorFactory zzvs>
	//*   3    6:ifnull          17
			Log.e("PooledExecutorsProvider", "setInstance called when instance was already set.");
	//    4    9:ldc1            #28  <String "PooledExecutorsProvider">
	//    5   11:ldc1            #30  <String "setInstance called when instance was already set.">
	//    6   13:invokestatic    #36  <Method int Log.e(String, String)>
	//    7   16:pop             
		zzvs = pooledexecutorfactory;
	//    8   17:aload_0         
	//    9   18:putstatic       #22  <Field PooledExecutorsProvider$PooledExecutorFactory zzvs>
		com/google/android/gms/common/providers/PooledExecutorsProvider;
	//   10   21:ldc1            #2   <Class PooledExecutorsProvider>
		JVM INSTR monitorexit ;
	//   11   23:monitorexit     
		return;
	//   12   24:return          
		pooledexecutorfactory;
	//   13   25:astore_0        
	//*  14   26:ldc1            #2   <Class PooledExecutorsProvider>
		throw pooledexecutorfactory;
	//   15   28:monitorexit     
	//   16   29:aload_0         
	//   17   30:athrow          
	}

	private static PooledExecutorFactory zzvs;
}
