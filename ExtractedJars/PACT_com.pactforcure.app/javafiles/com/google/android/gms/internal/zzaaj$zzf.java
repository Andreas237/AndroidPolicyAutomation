// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaj, zzaan

private abstract class zzaaj$zzf
	implements Runnable
{

	public void run()
	{
		zzaaj.zzc(zzaAa).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaaj zzaAa>
	//    2    4:invokestatic    #30  <Method Lock zzaaj.zzc(zzaaj)>
	//    3    7:invokeinterface #35  <Method void Lock.lock()>
		boolean flag = Thread.interrupted();
	//    4   12:invokestatic    #41  <Method boolean Thread.interrupted()>
	//    5   15:istore_1        
		if(flag)
	//*   6   16:iload_1         
	//*   7   17:ifeq            33
		{
			zzaaj.zzc(zzaAa).unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #15  <Field zzaaj zzaAa>
	//   10   24:invokestatic    #30  <Method Lock zzaaj.zzc(zzaaj)>
	//   11   27:invokeinterface #44  <Method void Lock.unlock()>
			return;
	//   12   32:return          
		}
		zzvA();
	//   13   33:aload_0         
	//   14   34:invokevirtual   #47  <Method void zzvA()>
		zzaaj.zzc(zzaAa).unlock();
	//   15   37:aload_0         
	//   16   38:getfield        #15  <Field zzaaj zzaAa>
	//   17   41:invokestatic    #30  <Method Lock zzaaj.zzc(zzaaj)>
	//   18   44:invokeinterface #44  <Method void Lock.unlock()>
		return;
	//   19   49:return          
		Object obj;
		obj;
	//   20   50:astore_2        
		zzaaj.zzd(zzaAa).zza(((RuntimeException) (obj)));
	//   21   51:aload_0         
	//   22   52:getfield        #15  <Field zzaaj zzaAa>
	//   23   55:invokestatic    #51  <Method zzaan zzaaj.zzd(zzaaj)>
	//   24   58:aload_2         
	//   25   59:invokevirtual   #57  <Method void zzaan.zza(RuntimeException)>
		zzaaj.zzc(zzaAa).unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #15  <Field zzaaj zzaAa>
	//   28   66:invokestatic    #30  <Method Lock zzaaj.zzc(zzaaj)>
	//   29   69:invokeinterface #44  <Method void Lock.unlock()>
		return;
	//   30   74:return          
		obj;
	//   31   75:astore_2        
		zzaaj.zzc(zzaAa).unlock();
	//   32   76:aload_0         
	//   33   77:getfield        #15  <Field zzaaj zzaAa>
	//   34   80:invokestatic    #30  <Method Lock zzaaj.zzc(zzaaj)>
	//   35   83:invokeinterface #44  <Method void Lock.unlock()>
		throw obj;
	//   36   88:aload_2         
	//   37   89:athrow          
	}

	protected abstract void zzvA();

	final zzaaj zzaAa;

	private zzaaj$zzf(zzaaj zzaaj1)
	{
		zzaAa = zzaaj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzaaj zzaAa>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	zzaaj$zzf(zzaaj zzaaj1, zzaaj._cls1 _pcls1)
	{
		this(zzaaj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void zzaaj$zzf(zzaaj)>
	//    3    5:return          
	}
}
