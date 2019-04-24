// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanl, zzajm

final class zzann
	implements zzanl
{

	zzann(String s)
	{
		zzcvi = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field String zzcvi>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zzb(Throwable throwable)
	{
		zzbv.zzeo().zza(throwable, zzcvi);
	//    0    0:invokestatic    #24  <Method zzajm zzbv.zzeo()>
	//    1    3:aload_1         
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field String zzcvi>
	//    4    8:invokevirtual   #30  <Method void zzajm.zza(Throwable, String)>
	//    5   11:return          
	}

	public final void zzh(Object obj)
	{
	//    0    0:return          
	}

	private final String zzcvi;
}
