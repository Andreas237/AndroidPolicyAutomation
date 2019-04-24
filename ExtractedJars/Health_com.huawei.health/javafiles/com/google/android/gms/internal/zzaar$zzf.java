// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaar, zzaav

abstract class zzaar$zzf
	implements Runnable
{

	public void run()
	{
		zzaar.zzc(zzaBA).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaar zzaBA>
	//    2    4:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
	//    3    7:invokeinterface #35  <Method void Lock.lock()>
		boolean flag = Thread.interrupted();
	//    4   12:invokestatic    #41  <Method boolean Thread.interrupted()>
	//    5   15:istore_1        
		if(flag)
	//*   6   16:iload_1         
	//*   7   17:ifeq            33
		{
			zzaar.zzc(zzaBA).unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #15  <Field zzaar zzaBA>
	//   10   24:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
	//   11   27:invokeinterface #44  <Method void Lock.unlock()>
			return;
	//   12   32:return          
		}
		zzwe();
	//   13   33:aload_0         
	//   14   34:invokevirtual   #47  <Method void zzwe()>
		zzaar.zzc(zzaBA).unlock();
	//   15   37:aload_0         
	//   16   38:getfield        #15  <Field zzaar zzaBA>
	//   17   41:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
	//   18   44:invokeinterface #44  <Method void Lock.unlock()>
		return;
	//   19   49:return          
		Object obj;
		obj;
	//   20   50:astore_2        
		zzaar.zzd(zzaBA).zza(((RuntimeException) (obj)));
	//   21   51:aload_0         
	//   22   52:getfield        #15  <Field zzaar zzaBA>
	//   23   55:invokestatic    #51  <Method zzaav zzaar.zzd(zzaar)>
	//   24   58:aload_2         
	//   25   59:invokevirtual   #57  <Method void zzaav.zza(RuntimeException)>
		zzaar.zzc(zzaBA).unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #15  <Field zzaar zzaBA>
	//   28   66:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
	//   29   69:invokeinterface #44  <Method void Lock.unlock()>
		return;
	//   30   74:return          
		obj;
	//   31   75:astore_2        
		zzaar.zzc(zzaBA).unlock();
	//   32   76:aload_0         
	//   33   77:getfield        #15  <Field zzaar zzaBA>
	//   34   80:invokestatic    #30  <Method Lock zzaar.zzc(zzaar)>
	//   35   83:invokeinterface #44  <Method void Lock.unlock()>
		throw obj;
	//   36   88:aload_2         
	//   37   89:athrow          
	}

	protected abstract void zzwe();

	final zzaar zzaBA;

	private zzaar$zzf(zzaar zzaar1)
	{
		zzaBA = zzaar1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzaar zzaBA>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	zzaar$zzf(zzaar zzaar1, zzaar._cls1 _pcls1)
	{
		this(zzaar1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void zzaar$zzf(zzaar)>
	//    3    5:return          
	}
}
