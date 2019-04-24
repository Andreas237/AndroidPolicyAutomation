// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaai

class zzaai$1
	implements Runnable
{

	public void run()
	{
		zzaai.zza(zzaAI).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaai zzaAI>
	//    2    4:invokestatic    #25  <Method Lock zzaai.zza(zzaai)>
	//    3    7:invokeinterface #30  <Method void Lock.lock()>
		zzaai.zzb(zzaAI);
	//    4   12:aload_0         
	//    5   13:getfield        #17  <Field zzaai zzaAI>
	//    6   16:invokestatic    #33  <Method void zzaai.zzb(zzaai)>
		zzaai.zza(zzaAI).unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #17  <Field zzaai zzaAI>
	//    9   23:invokestatic    #25  <Method Lock zzaai.zza(zzaai)>
	//   10   26:invokeinterface #36  <Method void Lock.unlock()>
		return;
	//   11   31:return          
		Exception exception;
		exception;
	//   12   32:astore_1        
		zzaai.zza(zzaAI).unlock();
	//   13   33:aload_0         
	//   14   34:getfield        #17  <Field zzaai zzaAI>
	//   15   37:invokestatic    #25  <Method Lock zzaai.zza(zzaai)>
	//   16   40:invokeinterface #36  <Method void Lock.unlock()>
		throw exception;
	//   17   45:aload_1         
	//   18   46:athrow          
	}

	final zzaai zzaAI;

	zzaai$1(zzaai zzaai1)
	{
		zzaAI = zzaai1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzaai zzaAI>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
