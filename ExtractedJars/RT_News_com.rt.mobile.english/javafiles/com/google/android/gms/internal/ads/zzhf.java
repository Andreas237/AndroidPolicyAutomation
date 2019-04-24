// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgj, zzhd

final class zzhf
	implements zzgj
{

	zzhf(zzhd zzhd1)
	{
		zzajt = zzhd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzhd zzajt>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zzh(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
		{
			zzhd.zzb(zzajt);
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field zzhd zzajt>
	//    4    8:invokestatic    #23  <Method void zzhd.zzb(zzhd)>
			return;
	//    5   11:return          
		} else
		{
			zzhd.zza(zzajt);
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field zzhd zzajt>
	//    8   16:invokestatic    #26  <Method void zzhd.zza(zzhd)>
			return;
	//    9   19:return          
		}
	}

	private final zzhd zzajt;
}
