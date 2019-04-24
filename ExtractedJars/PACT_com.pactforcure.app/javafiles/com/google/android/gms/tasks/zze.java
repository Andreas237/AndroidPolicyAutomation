// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			zzf, Task, OnSuccessListener

class zze
	implements zzf
{

	public zze(Executor executor, OnSuccessListener onsuccesslistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Object()>
	//    6   12:putfield        #24  <Field Object zzrN>
		zzbDK = executor;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field Executor zzbDK>
		zzbLB = onsuccesslistener;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #28  <Field OnSuccessListener zzbLB>
	//   13   25:return          
	}

	static Object zza(zze zze1)
	{
		return zze1.zzrN;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object zzrN>
	//    2    4:areturn         
	}

	static OnSuccessListener zzb(zze zze1)
	{
		return zze1.zzbLB;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field OnSuccessListener zzbLB>
	//    2    4:areturn         
	}

	public void cancel()
	{
		synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object zzrN>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzbLB = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #28  <Field OnSuccessListener zzbLB>
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		exception;
	//   11   15:astore_2        
		obj;
	//   12   16:aload_1         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw exception;
	//   14   18:aload_2         
	//   15   19:athrow          
	}

	public void onComplete(Task task)
	{
label0:
		{
			if(!task.isSuccessful())
				break MISSING_BLOCK_LABEL_50;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method boolean Task.isSuccessful()>
	//    2    4:ifeq            50
			synchronized(zzrN)
	//*   3    7:aload_0         
	//*   4    8:getfield        #24  <Field Object zzrN>
	//*   5   11:astore_2        
	//*   6   12:aload_2         
	//*   7   13:monitorenter    
			{
				if(zzbLB != null)
					break label0;
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field OnSuccessListener zzbLB>
	//   10   18:ifnonnull       24
			}
	//   11   21:aload_2         
	//   12   22:monitorexit     
			return;
	//   13   23:return          
		}
		obj;
	//   14   24:aload_2         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		zzbDK.execute(new Runnable(task) {

			public void run()
			{
				synchronized(zze.zza(zzbLC))
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field zze zzbLC>
			//*   2    4:invokestatic    #30  <Method Object zze.zza(zze)>
			//*   3    7:astore_1        
			//*   4    8:aload_1         
			//*   5    9:monitorenter    
				{
					if(zze.zzb(zzbLC) != null)
			//*   6   10:aload_0         
			//*   7   11:getfield        #19  <Field zze zzbLC>
			//*   8   14:invokestatic    #34  <Method OnSuccessListener zze.zzb(zze)>
			//*   9   17:ifnull          39
						zze.zzb(zzbLC).onSuccess(zzbLu.getResult());
			//   10   20:aload_0         
			//   11   21:getfield        #19  <Field zze zzbLC>
			//   12   24:invokestatic    #34  <Method OnSuccessListener zze.zzb(zze)>
			//   13   27:aload_0         
			//   14   28:getfield        #21  <Field Task zzbLu>
			//   15   31:invokevirtual   #40  <Method Object Task.getResult()>
			//   16   34:invokeinterface #46  <Method void OnSuccessListener.onSuccess(Object)>
				}
			//   17   39:aload_1         
			//   18   40:monitorexit     
				return;
			//   19   41:return          
				exception;
			//   20   42:astore_2        
				obj1;
			//   21   43:aload_1         
				JVM INSTR monitorexit ;
			//   22   44:monitorexit     
				throw exception;
			//   23   45:aload_2         
			//   24   46:athrow          
			}

			final zze zzbLC;
			final Task zzbLu;

			
			{
				zzbLC = zze.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zze zzbLC>
				zzbLu = task;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Task zzbLu>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   16   26:aload_0         
	//   17   27:getfield        #26  <Field Executor zzbDK>
	//   18   30:new             #9   <Class zze$1>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:invokespecial   #48  <Method void zze$1(zze, Task)>
	//   23   39:invokeinterface #54  <Method void Executor.execute(Runnable)>
		return;
	//   24   44:return          
		task;
	//   25   45:astore_1        
		obj;
	//   26   46:aload_2         
		JVM INSTR monitorexit ;
	//   27   47:monitorexit     
		throw task;
	//   28   48:aload_1         
	//   29   49:athrow          
	//   30   50:return          
	}

	private final Executor zzbDK;
	private OnSuccessListener zzbLB;
	private final Object zzrN = new Object();
}
