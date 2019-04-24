// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzni, zzna

final class zznj
	implements Callable
{

	zznj(zzni zzni1, zzna zzna1)
	{
		zzatz = zzni1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzni zzatz>
		zzaty = zzna1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field zzna zzaty>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final Object call()
	{
		return zzaty.zza(zzni.zza(zzatz));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzna zzaty>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field zzni zzatz>
	//    4    8:invokestatic    #29  <Method android.content.SharedPreferences zzni.zza(zzni)>
	//    5   11:invokevirtual   #34  <Method Object zzna.zza(android.content.SharedPreferences)>
	//    6   14:areturn         
	}

	private final zzna zzaty;
	private final zzni zzatz;
}
