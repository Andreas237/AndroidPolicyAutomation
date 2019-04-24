// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcw, zzbl, zzcr

static final class zzcw$zzj extends zzcw$zzb
{

	public void zza(zzbl zzbl1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #19  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ArrayList()>
	//    3    7:astore_2        
		((List) (arraylist)).addAll(((java.util.Collection) (zzbl1.zzbUB)));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:getfield        #28  <Field List zzbl.zzbUB>
	//    7   13:invokeinterface #34  <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		zzaa(((Object) (new zzcb$zza(zzcr.zzik(zzbl1.statusCode), ((List) (arraylist))))));
	//    9   19:aload_0         
	//   10   20:new             #36  <Class zzcb$zza>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:getfield        #40  <Field int zzbl.statusCode>
	//   14   28:invokestatic    #46  <Method com.google.android.gms.common.api.Status zzcr.zzik(int)>
	//   15   31:aload_2         
	//   16   32:invokespecial   #49  <Method void zzcb$zza(com.google.android.gms.common.api.Status, List)>
	//   17   35:invokevirtual   #53  <Method void zzaa(Object)>
	//   18   38:return          
	}

	public zzcw$zzj(com.google.android.gms.internal. )
	{
		super();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
	//    3    5:return          
	}
}
