// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzbz, zzbi, zzaw

final class zzbj extends zzbz
{

	zzbj(zzbi zzbi1, zzaw zzaw)
	{
		zzxv = zzbi1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzbi zzxv>
		super(zzaw);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzbz(zzaw)>
	//    6   10:return          
	}

	public final void run()
	{
		zzbi.zza(zzxv);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzbi zzxv>
	//    2    4:invokestatic    #22  <Method void zzbi.zza(zzbi)>
	//    3    7:return          
	}

	private final zzbi zzxv;
}
