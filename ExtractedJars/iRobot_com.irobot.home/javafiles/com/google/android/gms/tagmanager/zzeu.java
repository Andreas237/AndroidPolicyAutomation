// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzev, zzer, zzes, zzal

final class zzeu
	implements zzev
{

	zzeu(zzes zzes1)
	{
		zzbey = zzes1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzes zzbey>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final zzer zza(zzal zzal)
	{
		return new zzer(zzes.zza(zzbey), zzes.zzb(zzbey), zzal);
	//    0    0:new             #20  <Class zzer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field zzes zzbey>
	//    4    8:invokestatic    #25  <Method android.content.Context zzes.zza(zzes)>
	//    5   11:aload_0         
	//    6   12:getfield        #12  <Field zzes zzbey>
	//    7   15:invokestatic    #29  <Method String zzes.zzb(zzes)>
	//    8   18:aload_1         
	//    9   19:invokespecial   #32  <Method void zzer(android.content.Context, String, zzal)>
	//   10   22:areturn         
	}

	private final zzes zzbey;
}
