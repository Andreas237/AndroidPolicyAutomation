// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuw

final class zzvd
	implements zzv
{

	public zzvd(zzuw zzuw, zzv zzv1)
	{
		zzbpu = zzuw;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzuw zzbpu>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		zzbpw = zzv1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzv zzbpw>
	//    8   14:return          
	}

	static zzv zza(zzvd zzvd1)
	{
		return zzvd1.zzbpw;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzv zzbpw>
	//    2    4:areturn         
	}

	public final void zza(Object obj, Map map)
	{
		zzbpw.zza(((Object) (zzbpu)), map);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzv zzbpw>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field zzuw zzbpu>
	//    4    8:aload_2         
	//    5    9:invokeinterface #29  <Method void zzv.zza(Object, Map)>
	//    6   14:return          
	}

	private final zzuw zzbpu;
	private final zzv zzbpw;
}
