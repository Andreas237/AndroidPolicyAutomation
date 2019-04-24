// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			zzf, Task, OnFailureListener

class zzd
	implements zzf
{

	public zzd(Executor executor, OnFailureListener onfailurelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void Object()>
	//    6   12:putfield        #23  <Field Object zzrN>
		zzbDK = executor;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #25  <Field Executor zzbDK>
		zzbLz = onfailurelistener;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #27  <Field OnFailureListener zzbLz>
	//   13   25:return          
	}

	static Object zza(zzd zzd1)
	{
		return zzd1.zzrN;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object zzrN>
	//    2    4:areturn         
	}

	static OnFailureListener zzb(zzd zzd1)
	{
		return zzd1.zzbLz;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field OnFailureListener zzbLz>
	//    2    4:areturn         
	}

	public void cancel()
	{
		synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Object zzrN>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzbLz = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #27  <Field OnFailureListener zzbLz>
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
			if(task.isSuccessful())
				break MISSING_BLOCK_LABEL_50;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method boolean Task.isSuccessful()>
	//    2    4:ifne            50
			synchronized(zzrN)
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field Object zzrN>
	//*   5   11:astore_2        
	//*   6   12:aload_2         
	//*   7   13:monitorenter    
			{
				if(zzbLz != null)
					break label0;
	//    8   14:aload_0         
	//    9   15:getfield        #27  <Field OnFailureListener zzbLz>
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
				synchronized(zzd.zza(zzbLA))
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field zzd zzbLA>
			//*   2    4:invokestatic    #30  <Method Object zzd.zza(zzd)>
			//*   3    7:astore_1        
			//*   4    8:aload_1         
			//*   5    9:monitorenter    
				{
					if(zzd.zzb(zzbLA) != null)
			//*   6   10:aload_0         
			//*   7   11:getfield        #19  <Field zzd zzbLA>
			//*   8   14:invokestatic    #34  <Method OnFailureListener zzd.zzb(zzd)>
			//*   9   17:ifnull          39
						zzd.zzb(zzbLA).onFailure(zzbLu.getException());
			//   10   20:aload_0         
			//   11   21:getfield        #19  <Field zzd zzbLA>
			//   12   24:invokestatic    #34  <Method OnFailureListener zzd.zzb(zzd)>
			//   13   27:aload_0         
			//   14   28:getfield        #21  <Field Task zzbLu>
			//   15   31:invokevirtual   #40  <Method Exception Task.getException()>
			//   16   34:invokeinterface #46  <Method void OnFailureListener.onFailure(Exception)>
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

			final zzd zzbLA;
			final Task zzbLu;

			
			{
				zzbLA = zzd.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzd zzbLA>
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
	//   17   27:getfield        #25  <Field Executor zzbDK>
	//   18   30:new             #9   <Class zzd$1>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:invokespecial   #45  <Method void zzd$1(zzd, Task)>
	//   23   39:invokeinterface #51  <Method void Executor.execute(Runnable)>
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
	private OnFailureListener zzbLz;
	private final Object zzrN = new Object();
}
