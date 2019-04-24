// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabh, zzabm, zzajh

final class zzabj
	implements Runnable
{

	zzabj(zzabh zzabh1, zzajh zzajh)
	{
		zzbzk = zzabh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzabh zzbzk>
		zzaam = zzajh;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzajh zzaam>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		synchronized(zzbzk.mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field zzabh zzbzk>
	//*   2    4:getfield        #27  <Field Object zzabh.mLock>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			zzabh zzabh1 = zzbzk;
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field zzabh zzbzk>
	//    8   14:astore_2        
			zzajh zzajh = zzaam;
	//    9   15:aload_0         
	//   10   16:getfield        #16  <Field zzajh zzaam>
	//   11   19:astore_3        
			zzabh1.zzbzd.zzb(zzajh);
	//   12   20:aload_2         
	//   13   21:getfield        #31  <Field zzabm zzabh.zzbzd>
	//   14   24:aload_3         
	//   15   25:invokeinterface #37  <Method void zzabm.zzb(zzajh)>
		}
	//   16   30:aload_1         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		exception;
	//   19   33:astore_2        
		obj;
	//   20   34:aload_1         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw exception;
	//   22   36:aload_2         
	//   23   37:athrow          
	}

	private final zzajh zzaam;
	private final zzabh zzbzk;
}
