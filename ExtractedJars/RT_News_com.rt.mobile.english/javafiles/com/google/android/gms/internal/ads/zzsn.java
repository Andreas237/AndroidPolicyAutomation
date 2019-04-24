// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoj, zzsm

final class zzsn extends zzaoj
{

	zzsn(zzsm zzsm1)
	{
		zzbnn = zzsm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field zzsm zzbnn>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #14  <Method void zzaoj()>
	//    5    9:return          
	}

	public final boolean cancel(boolean flag)
	{
		zzsm.zza(zzbnn);
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field zzsm zzbnn>
	//    2    4:invokestatic    #22  <Method void zzsm.zza(zzsm)>
		return super.cancel(flag);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #24  <Method boolean zzaoj.cancel(boolean)>
	//    6   12:ireturn         
	}

	private final zzsm zzbnn;
}
