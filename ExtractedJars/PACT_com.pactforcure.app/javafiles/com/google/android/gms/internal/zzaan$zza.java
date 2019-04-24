// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaan, zzaam

static abstract class zzaan$zza
{

	public final void zzc(zzaan zzaan1)
	{
		zzaan.zza(zzaan1).lock();
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method Lock zzaan.zza(zzaan)>
	//    2    4:invokeinterface #27  <Method void Lock.lock()>
		zzaam zzaam;
		zzaam zzaam1;
		zzaam = zzaan.zzb(zzaan1);
	//    3    9:aload_1         
	//    4   10:invokestatic    #31  <Method zzaam zzaan.zzb(zzaan)>
	//    5   13:astore_2        
		zzaam1 = zzaAL;
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field zzaam zzaAL>
	//    8   18:astore_3        
		if(zzaam != zzaam1)
	//*   9   19:aload_2         
	//*  10   20:aload_3         
	//*  11   21:if_acmpeq       34
		{
			zzaan.zza(zzaan1).unlock();
	//   12   24:aload_1         
	//   13   25:invokestatic    #22  <Method Lock zzaan.zza(zzaan)>
	//   14   28:invokeinterface #34  <Method void Lock.unlock()>
			return;
	//   15   33:return          
		}
		zzvA();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #37  <Method void zzvA()>
		zzaan.zza(zzaan1).unlock();
	//   18   38:aload_1         
	//   19   39:invokestatic    #22  <Method Lock zzaan.zza(zzaan)>
	//   20   42:invokeinterface #34  <Method void Lock.unlock()>
		return;
	//   21   47:return          
		Exception exception;
		exception;
	//   22   48:astore_2        
		zzaan.zza(zzaan1).unlock();
	//   23   49:aload_1         
	//   24   50:invokestatic    #22  <Method Lock zzaan.zza(zzaan)>
	//   25   53:invokeinterface #34  <Method void Lock.unlock()>
		throw exception;
	//   26   58:aload_2         
	//   27   59:athrow          
	}

	protected abstract void zzvA();

	private final zzaam zzaAL;

	protected zzaan$zza(zzaam zzaam)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzaAL = zzaam;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field zzaam zzaAL>
	//    5    9:return          
	}
}
