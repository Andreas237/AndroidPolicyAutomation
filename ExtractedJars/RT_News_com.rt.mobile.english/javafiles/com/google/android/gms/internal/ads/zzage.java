// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaga, zzagc

final class zzage
{

	public zzage(zzagc zzagc, zzaga zzaga)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #19  <Method Clock zzbv.zzer()>
	//    4    8:invokeinterface #25  <Method long Clock.currentTimeMillis()>
	//    5   13:putfield        #27  <Field long zzckl>
		zzckm = zzaga;
	//    6   16:aload_0         
	//    7   17:aload_2         
	//    8   18:putfield        #29  <Field zzaga zzckm>
	//    9   21:return          
	}

	public final long zzckl = zzbv.zzer().currentTimeMillis();
	public final zzaga zzckm;
}
