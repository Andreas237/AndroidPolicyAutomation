// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpp, zzpd

final class zzpq
	implements Runnable
{

	zzpq(zzpp zzpp1, zzpd zzpd)
	{
		zzbkj = zzpp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzpp zzbkj>
		zzbki = zzpd;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzpd zzbki>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzpp.zza(zzbkj, zzbki);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzpp zzbkj>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field zzpd zzbki>
	//    4    8:invokestatic    #26  <Method void zzpp.zza(zzpp, zzpd)>
	//    5   11:return          
	}

	private final zzpd zzbki;
	private final zzpp zzbkj;
}
