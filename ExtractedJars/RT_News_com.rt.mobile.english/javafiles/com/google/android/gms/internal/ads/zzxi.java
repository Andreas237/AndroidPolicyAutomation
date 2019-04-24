// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxh, zzxb, zzxe

final class zzxi
	implements Callable
{

	zzxi(zzxh zzxh1, zzxb zzxb1)
	{
		zzbuk = zzxh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzxh zzbuk>
		zzbuj = zzxb1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field zzxb zzbuj>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	private final zzxe zzmn()
		throws Exception
	{
		Object obj = zzxh.zza(zzbuk);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzxh zzbuk>
	//    2    4:invokestatic    #31  <Method Object zzxh.zza(zzxh)>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(zzxh.zzb(zzbuk))
	//*   6   10:aload_0         
	//*   7   11:getfield        #15  <Field zzxh zzbuk>
	//*   8   14:invokestatic    #35  <Method boolean zzxh.zzb(zzxh)>
	//*   9   17:ifeq            24
	//*  10   20:aload_1         
	//*  11   21:monitorexit     
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		obj;
	//   14   24:aload_1         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return zzbuj.zza(zzxh.zzc(zzbuk), zzxh.zzd(zzbuk));
	//   16   26:aload_0         
	//   17   27:getfield        #17  <Field zzxb zzbuj>
	//   18   30:aload_0         
	//   19   31:getfield        #15  <Field zzxh zzbuk>
	//   20   34:invokestatic    #39  <Method long zzxh.zzc(zzxh)>
	//   21   37:aload_0         
	//   22   38:getfield        #15  <Field zzxh zzbuk>
	//   23   41:invokestatic    #42  <Method long zzxh.zzd(zzxh)>
	//   24   44:invokevirtual   #47  <Method zzxe zzxb.zza(long, long)>
	//   25   47:areturn         
		Exception exception;
		exception;
	//   26   48:astore_2        
		obj;
	//   27   49:aload_1         
		JVM INSTR monitorexit ;
	//   28   50:monitorexit     
		throw exception;
	//   29   51:aload_2         
	//   30   52:athrow          
	}

	public final Object call()
		throws Exception
	{
		return ((Object) (zzmn()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method zzxe zzmn()>
	//    2    4:areturn         
	}

	private final zzxb zzbuj;
	private final zzxh zzbuk;
}
