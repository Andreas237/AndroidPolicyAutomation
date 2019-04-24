// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			zzf, OnCompleteListener, Task

class zzc
	implements zzf
{

	public zzc(Executor executor, OnCompleteListener oncompletelistener)
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
		zzbNu = oncompletelistener;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #28  <Field OnCompleteListener zzbNu>
	//   13   25:return          
	}

	static Object zza(zzc zzc1)
	{
		return zzc1.zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object zzrJ>
	//    2    4:areturn         
	}

	static OnCompleteListener zzb(zzc zzc1)
	{
		return zzc1.zzbNu;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field OnCompleteListener zzbNu>
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
		zzbNu = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #28  <Field OnCompleteListener zzbNu>
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
		Object obj = zzrJ;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object zzrJ>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		OnCompleteListener oncompletelistener = zzbNu;
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field OnCompleteListener zzbNu>
	//    7   11:astore_3        
		if(oncompletelistener != null)
			break MISSING_BLOCK_LABEL_19;
	//    8   12:aload_3         
	//    9   13:ifnonnull       19
		obj;
	//   10   16:aload_2         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		  goto _L1
	//*  15   21:goto            29
		task;
	//   16   24:astore_1        
	//*  17   25:aload_2         
		throw task;
	//   18   26:monitorexit     
	//   19   27:aload_1         
	//   20   28:athrow          
_L1:
		zzbFM.execute(new Runnable(task) {

			public void run()
			{
				Object obj1 = zzc.zza(zzbNv);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field zzc zzbNv>
			//    2    4:invokestatic    #30  <Method Object zzc.zza(zzc)>
			//    3    7:astore_1        
				obj1;
			//    4    8:aload_1         
				JVM INSTR monitorenter ;
			//    5    9:monitorenter    
				if(zzc.zzb(zzbNv) != null)
			//*   6   10:aload_0         
			//*   7   11:getfield        #19  <Field zzc zzbNv>
			//*   8   14:invokestatic    #34  <Method OnCompleteListener zzc.zzb(zzc)>
			//*   9   17:ifnull          36
					zzc.zzb(zzbNv).onComplete(zzbNr);
			//   10   20:aload_0         
			//   11   21:getfield        #19  <Field zzc zzbNv>
			//   12   24:invokestatic    #34  <Method OnCompleteListener zzc.zzb(zzc)>
			//   13   27:aload_0         
			//   14   28:getfield        #21  <Field Task zzbNr>
			//   15   31:invokeinterface #37  <Method void OnCompleteListener.onComplete(Task)>
				obj1;
			//   16   36:aload_1         
				JVM INSTR monitorexit ;
			//   17   37:monitorexit     
				return;
			//   18   38:return          
				Exception exception;
				exception;
			//   19   39:astore_2        
			//*  20   40:aload_1         
				throw exception;
			//   21   41:monitorexit     
			//   22   42:aload_2         
			//   23   43:athrow          
			}

			final Task zzbNr;
			final zzc zzbNv;

			
			{
				zzbNv = zzc.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzc zzbNv>
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
	//   21   29:aload_0         
	//   22   30:getfield        #26  <Field Executor zzbFM>
	//   23   33:new             #9   <Class zzc$1>
	//   24   36:dup             
	//   25   37:aload_0         
	//   26   38:aload_1         
	//   27   39:invokespecial   #42  <Method void zzc$1(zzc, Task)>
	//   28   42:invokeinterface #48  <Method void Executor.execute(Runnable)>
		return;
	//   29   47:return          
	}

	private final Executor zzbFM;
	private OnCompleteListener zzbNu;
	private final Object zzrJ = new Object();
}
