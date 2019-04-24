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
	//    6   12:putfield        #24  <Field Object zzrN>
		zzbDK = executor;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field Executor zzbDK>
		zzbLx = oncompletelistener;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #28  <Field OnCompleteListener zzbLx>
	//   13   25:return          
	}

	static Object zza(zzc zzc1)
	{
		return zzc1.zzrN;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object zzrN>
	//    2    4:areturn         
	}

	static OnCompleteListener zzb(zzc zzc1)
	{
		return zzc1.zzbLx;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field OnCompleteListener zzbLx>
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
			zzbLx = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #28  <Field OnCompleteListener zzbLx>
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
			synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object zzrN>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzbLx != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field OnCompleteListener zzbLx>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		obj;
	//   11   17:aload_2         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		zzbDK.execute(new Runnable(task) {

			public void run()
			{
				synchronized(zzc.zza(zzbLy))
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field zzc zzbLy>
			//*   2    4:invokestatic    #30  <Method Object zzc.zza(zzc)>
			//*   3    7:astore_1        
			//*   4    8:aload_1         
			//*   5    9:monitorenter    
				{
					if(zzc.zzb(zzbLy) != null)
			//*   6   10:aload_0         
			//*   7   11:getfield        #19  <Field zzc zzbLy>
			//*   8   14:invokestatic    #34  <Method OnCompleteListener zzc.zzb(zzc)>
			//*   9   17:ifnull          36
						zzc.zzb(zzbLy).onComplete(zzbLu);
			//   10   20:aload_0         
			//   11   21:getfield        #19  <Field zzc zzbLy>
			//   12   24:invokestatic    #34  <Method OnCompleteListener zzc.zzb(zzc)>
			//   13   27:aload_0         
			//   14   28:getfield        #21  <Field Task zzbLu>
			//   15   31:invokeinterface #37  <Method void OnCompleteListener.onComplete(Task)>
				}
			//   16   36:aload_1         
			//   17   37:monitorexit     
				return;
			//   18   38:return          
				exception;
			//   19   39:astore_2        
				obj1;
			//   20   40:aload_1         
				JVM INSTR monitorexit ;
			//   21   41:monitorexit     
				throw exception;
			//   22   42:aload_2         
			//   23   43:athrow          
			}

			final Task zzbLu;
			final zzc zzbLy;

			
			{
				zzbLy = zzc.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field zzc zzbLy>
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
	//   13   19:aload_0         
	//   14   20:getfield        #26  <Field Executor zzbDK>
	//   15   23:new             #9   <Class zzc$1>
	//   16   26:dup             
	//   17   27:aload_0         
	//   18   28:aload_1         
	//   19   29:invokespecial   #42  <Method void zzc$1(zzc, Task)>
	//   20   32:invokeinterface #48  <Method void Executor.execute(Runnable)>
		return;
	//   21   37:return          
		task;
	//   22   38:astore_1        
		obj;
	//   23   39:aload_2         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		throw task;
	//   25   41:aload_1         
	//   26   42:athrow          
	}

	private final Executor zzbDK;
	private OnCompleteListener zzbLx;
	private final Object zzrN = new Object();
}
