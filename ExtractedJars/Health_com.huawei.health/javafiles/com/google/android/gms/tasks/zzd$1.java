// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			zzd, Task, OnFailureListener

class zzd$1
	implements Runnable
{

	public void run()
	{
		Object obj = zzd.zza(zzbNx);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzd zzbNx>
	//    2    4:invokestatic    #30  <Method Object zzd.zza(zzd)>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(zzd.zzb(zzbNx) != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #19  <Field zzd zzbNx>
	//*   8   14:invokestatic    #34  <Method OnFailureListener zzd.zzb(zzd)>
	//*   9   17:ifnull          39
			zzd.zzb(zzbNx).onFailure(zzbNr.getException());
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field zzd zzbNx>
	//   12   24:invokestatic    #34  <Method OnFailureListener zzd.zzb(zzd)>
	//   13   27:aload_0         
	//   14   28:getfield        #21  <Field Task zzbNr>
	//   15   31:invokevirtual   #40  <Method Exception Task.getException()>
	//   16   34:invokeinterface #46  <Method void OnFailureListener.onFailure(Exception)>
		obj;
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
	final zzd zzbNx;

	zzd$1(zzd zzd1, Task task)
	{
		zzbNx = zzd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzd zzbNx>
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
