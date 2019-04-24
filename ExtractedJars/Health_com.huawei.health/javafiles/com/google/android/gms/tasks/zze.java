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
	//    6   12:putfield        #24  <Field Object zzrJ>
		zzbFM = executor;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field Executor zzbFM>
		zzbNy = onsuccesslistener;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #28  <Field OnSuccessListener zzbNy>
	//   13   25:return          
	}

	static Object zza(zze zze1)
	{
		return zze1.zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object zzrJ>
	//    2    4:areturn         
	}

	static OnSuccessListener zzb(zze zze1)
	{
		return zze1.zzbNy;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field OnSuccessListener zzbNy>
	//    2    4:areturn         
	}

	public void cancel()
	{
		Object obj = zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object zzrJ>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzbNy = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #28  <Field OnSuccessListener zzbNy>
		obj;
	//    8   12:aload_1         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		Exception exception;
		exception;
	//   11   15:astore_2        
	//*  12   16:aload_1         
		throw exception;
	//   13   17:monitorexit     
	//   14   18:aload_2         
	//   15   19:athrow          
	}

	public void onComplete(Task task)
	{
		if(!task.isSuccessful())
			break MISSING_BLOCK_LABEL_54;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method boolean Task.isSuccessful()>
	//    2    4:ifeq            54
		Object obj = zzrJ;
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field Object zzrJ>
	//    5   11:astore_2        
		obj;
	//    6   12:aload_2         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		OnSuccessListener onsuccesslistener = zzbNy;
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field OnSuccessListener zzbNy>
	//   10   18:astore_3        
		if(onsuccesslistener != null)
			break MISSING_BLOCK_LABEL_26;
	//   11   19:aload_3         
	//   12   20:ifnonnull       26
		obj;
	//   13   23:aload_2         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		  goto _L1
	//*  18   28:goto            36
		task;
	//   19   31:astore_1        
	//*  20   32:aload_2         
		throw task;
	//   21   33:monitorexit     
	//   22   34:aload_1         
	//   23   35:athrow          
_L1:
		zzbFM.execute(new Runnable(task) {

			public void run()
			{
				Object obj1 = zze.zza(zzbNz);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field zze zzbNz>
			//    2    4:invokestatic    #30  <Method Object zze.zza(zze)>
			//    3    7:astore_1        
				obj1;
			//    4    8:aload_1         
				JVM INSTR monitorenter ;
			//    5    9:monitorenter    
				if(zze.zzb(zzbNz) != null)
			//*   6   10:aload_0         
			//*   7   11:getfield        #19  <Field zze zzbNz>
			//*   8   14:invokestatic    #34  <Method OnSuccessListener zze.zzb(zze)>
			//*   9   17:ifnull          39
					zze.zzb(zzbNz).onSuccess(zzbNr.getResult());
			//   10   20:aload_0         
			//   11   21:getfield        #19  <Field zze zzbNz>
			//   12   24:invokestatic    #34  <Method OnSuccessListener zze.zzb(zze)>
			//   13   27:aload_0         
			//   14   28:getfield        #21  <Field Task zzbNr>
			//   15   31:invokevirtual   #40  <Method Object Task.getResult()>
			//   16   34:invokeinterface #46  <Method void OnSuccessListener.onSuccess(Object)>
				obj1;
			//   17   39:aload_1         
				JVM INSTR monitorexit ;
			//   18   40:monitorexit     
				return;
			//   19   41:return          
				Exception exception;
				exception;
			//   20   42:astore_2        
			//*  21   43:aload_1         
				throw exception;
			//   22   44:monitorexit     
			//   23   45:aload_2         
			//   24   46:athrow          
			}

			final Task zzbNr;
			final zze zzbNz;

			
			{
				zzbNz = zze.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zze zzbNz>
				zzbNr = task;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Task zzbNr>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   24   36:aload_0         
	//   25   37:getfield        #26  <Field Executor zzbFM>
	//   26   40:new             #9   <Class zze$1>
	//   27   43:dup             
	//   28   44:aload_0         
	//   29   45:aload_1         
	//   30   46:invokespecial   #48  <Method void zze$1(zze, Task)>
	//   31   49:invokeinterface #54  <Method void Executor.execute(Runnable)>
	//   32   54:return          
	}

	private final Executor zzbFM;
	private OnSuccessListener zzbNy;
	private final Object zzrJ = new Object();
}
