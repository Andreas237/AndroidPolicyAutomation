// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			zzc, OnCompleteListener, Task

class zzc$1
	implements Runnable
{

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
		obj;
	//   20   40:aload_1         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		throw exception;
	//   22   42:aload_2         
	//   23   43:athrow          
	}

	final Task zzbLu;
	final zzc zzbLy;

	zzc$1(zzc zzc1, Task task)
	{
		zzbLy = zzc1;
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
