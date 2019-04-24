// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabo, zzabm, zzajh

final class zzabp
	implements Runnable
{

	zzabp(zzabo zzabo1, zzajh zzajh)
	{
		zzbzm = zzabo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzabo zzbzm>
		zzbzl = zzajh;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzajh zzbzl>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzabo.zza(zzbzm).zzb(zzbzl);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzabo zzbzm>
	//    2    4:invokestatic    #27  <Method zzabm zzabo.zza(zzabo)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field zzajh zzbzl>
	//    5   11:invokeinterface #33  <Method void zzabm.zzb(zzajh)>
	//    6   16:return          
	}

	private final zzajh zzbzl;
	private final zzabo zzbzm;
}
