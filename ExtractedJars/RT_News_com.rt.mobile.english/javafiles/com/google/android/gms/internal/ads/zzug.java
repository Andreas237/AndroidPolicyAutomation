// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzasx, zzasu, zzus, zzuf

final class zzug
	implements zzasx
{

	zzug(zzuf zzuf)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzbpk = zzuf;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzuf zzbpk>
	//    5    9:return          
	}

	public final boolean zza(zzasu zzasu1)
	{
		return ((zzus) (zzbpk)).zzf(zzasu1.uri);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzuf zzbpk>
	//    2    4:aload_1         
	//    3    5:getfield        #24  <Field android.net.Uri zzasu.uri>
	//    4    8:invokevirtual   #30  <Method boolean zzus.zzf(android.net.Uri)>
	//    5   11:ireturn         
	}

	private final zzuf zzbpk;
}
