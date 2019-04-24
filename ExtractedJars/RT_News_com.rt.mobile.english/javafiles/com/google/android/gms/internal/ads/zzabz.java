// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabv, zzos

final class zzabz
	implements zzv
{

	zzabz(zzabv zzabv1, zzos zzos)
	{
		zzcal = zzabv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzabv zzcal>
		zzcam = zzos;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field zzos zzcam>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void zza(Object obj, Map map)
	{
		obj = ((Object) ((String)map.get("asset")));
	//    0    0:aload_2         
	//    1    1:ldc1            #25  <String "asset">
	//    2    3:invokeinterface #31  <Method Object Map.get(Object)>
	//    3    8:checkcast       #33  <Class String>
	//    4   11:astore_1        
		zzabv.zza(zzcal, ((zzqs) (zzcam)), ((String) (obj)));
	//    5   12:aload_0         
	//    6   13:getfield        #15  <Field zzabv zzcal>
	//    7   16:aload_0         
	//    8   17:getfield        #17  <Field zzos zzcam>
	//    9   20:aload_1         
	//   10   21:invokestatic    #38  <Method void zzabv.zza(zzabv, zzqs, String)>
	//   11   24:return          
	}

	private final zzabv zzcal;
	private final zzos zzcam;
}
