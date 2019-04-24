// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzus

final class zzut
	implements Runnable
{

	zzut(zzus zzus1, zzv zzv1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbpo = zzus1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzus zzbpo>
		zzbpp = zzv1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzv zzbpp>
		zzbpq = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field Map zzbpq>
	//   11   19:return          
	}

	public final void run()
	{
		zzus zzus1 = zzbpo;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzus zzbpo>
	//    2    4:astore_1        
		zzv zzv1 = zzbpp;
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field zzv zzbpp>
	//    5    9:astore_2        
		Map map = zzbpq;
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field Map zzbpq>
	//    8   14:astore_3        
		zzv1.zza(zzus1.getReference(), map);
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #31  <Method Object zzus.getReference()>
	//   12   20:aload_3         
	//   13   21:invokeinterface #37  <Method void zzv.zza(Object, Map)>
	//   14   26:return          
	}

	private final zzus zzbpo;
	private final zzv zzbpp;
	private final Map zzbpq;
}
