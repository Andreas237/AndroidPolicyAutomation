// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzfb, zzet

final class zzfd
	implements zzv
{

	zzfd(zzfb zzfb1)
	{
		zzafv = zzfb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzfb zzafv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
		zzfb.zza(zzafv).zza(((zzfo) (zzafv)), map);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzfb zzafv>
	//    2    4:invokestatic    #24  <Method zzet zzfb.zza(zzfb)>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field zzfb zzafv>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #29  <Method void zzet.zza(zzfo, Map)>
	//    7   15:return          
	}

	private final zzfb zzafv;
}
