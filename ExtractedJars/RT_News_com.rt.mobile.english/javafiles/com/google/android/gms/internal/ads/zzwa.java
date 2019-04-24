// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvz, zzvw, zzalo, zzuu

final class zzwa
	implements Runnable
{

	zzwa(zzvz zzvz1, zzuu zzuu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzbqx = zzvz1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzvz zzbqx>
		zzbqy = zzuu1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field zzuu zzbqy>
	//    8   14:return          
	}

	public final void run()
	{
		zzvz zzvz1 = zzbqx;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzvz zzbqx>
	//    2    4:astore_1        
		zzuu zzuu1 = zzbqy;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field zzuu zzbqy>
	//    5    9:astore_2        
		zzvw.zza(zzvz1.zzbqw).zze(((Object) (zzuu1)));
	//    6   10:aload_1         
	//    7   11:getfield        #27  <Field zzvw zzvz.zzbqw>
	//    8   14:invokestatic    #33  <Method zzalo zzvw.zza(zzvw)>
	//    9   17:aload_2         
	//   10   18:invokeinterface #39  <Method void zzalo.zze(Object)>
		zzuu1.destroy();
	//   11   23:aload_2         
	//   12   24:invokeinterface #44  <Method void zzuu.destroy()>
	//   13   29:return          
	}

	private final zzvz zzbqx;
	private final zzuu zzbqy;
}
