// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbc;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzace

final class zzacj
	implements zzv
{

	zzacj(zzace zzace1)
	{
		zzcbi = zzace1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzace zzcbi>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
		zzace.zza(zzcbi).zzdu();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzace zzcbi>
	//    2    4:invokestatic    #24  <Method zzbc zzace.zza(zzace)>
	//    3    7:invokevirtual   #29  <Method void zzbc.zzdu()>
	//    4   10:return          
	}

	private final zzace zzcbi;
}
