// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbd, zzbc

abstract class zzbe
{

	protected zzbe(zzbc zzbc)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzjg = zzbc;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field zzbc zzjg>
	//    5    9:return          
	}

	protected abstract void zzaq();

	public final void zzc(zzbd zzbd1)
	{
		zzbd.zza(zzbd1).lock();
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Lock zzbd.zza(zzbd)>
	//    2    4:invokeinterface #28  <Method void Lock.lock()>
		zzbc zzbc;
		zzbc zzbc1;
		zzbc = zzbd.zzb(zzbd1);
	//    3    9:aload_1         
	//    4   10:invokestatic    #32  <Method zzbc zzbd.zzb(zzbd)>
	//    5   13:astore_2        
		zzbc1 = zzjg;
	//    6   14:aload_0         
	//    7   15:getfield        #13  <Field zzbc zzjg>
	//    8   18:astore_3        
		if(zzbc == zzbc1) goto _L2; else goto _L1
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:if_acmpeq       34
_L1:
		zzbd.zza(zzbd1).unlock();
	//   12   24:aload_1         
	//   13   25:invokestatic    #23  <Method Lock zzbd.zza(zzbd)>
	//   14   28:invokeinterface #35  <Method void Lock.unlock()>
		return;
	//   15   33:return          
_L2:
		zzaq();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #37  <Method void zzaq()>
		if(true) goto _L1; else goto _L3
	//   18   38:goto            24
_L3:
		Exception exception;
		exception;
	//   19   41:astore_2        
		zzbd.zza(zzbd1).unlock();
	//   20   42:aload_1         
	//   21   43:invokestatic    #23  <Method Lock zzbd.zza(zzbd)>
	//   22   46:invokeinterface #35  <Method void Lock.unlock()>
		throw exception;
	//   23   51:aload_2         
	//   24   52:athrow          
	}

	private final zzbc zzjg;
}
