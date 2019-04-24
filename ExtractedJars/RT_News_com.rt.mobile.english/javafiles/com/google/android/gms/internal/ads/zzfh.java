// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaom, zzff, zzet

final class zzfh
	implements zzaom
{

	zzfh(zzff zzff1)
	{
		zzaga = zzff1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzff zzaga>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzff.zza(zzaga).zzb(((zzfo) (zzaga)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzff zzaga>
	//    2    4:invokestatic    #23  <Method zzet zzff.zza(zzff)>
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field zzff zzaga>
	//    5   11:invokevirtual   #29  <Method void zzet.zzb(zzfo)>
	//    6   14:return          
	}

	private final zzff zzaga;
}
