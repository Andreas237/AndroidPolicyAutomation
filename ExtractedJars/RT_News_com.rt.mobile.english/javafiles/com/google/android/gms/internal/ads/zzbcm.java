// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbcn, zzbbg, zzbav

public final class zzbcm
{

	static int zza(zzbcn zzbcn1, Object obj, Object obj1)
	{
		return zzbbg.zza(zzbcn1.zzdvy, 1, obj) + zzbbg.zza(zzbcn1.zzdwa, 2, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzbes zzbcn.zzdvy>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method int zzbbg.zza(zzbes, int, Object)>
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzbes zzbcn.zzdwa>
	//    7   13:iconst_2        
	//    8   14:aload_2         
	//    9   15:invokestatic    #18  <Method int zzbbg.zza(zzbes, int, Object)>
	//   10   18:iadd            
	//   11   19:ireturn         
	}

	static void zza(zzbav zzbav, zzbcn zzbcn1, Object obj, Object obj1)
		throws IOException
	{
		zzbbg.zza(zzbav, zzbcn1.zzdvy, 1, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #13  <Field zzbes zzbcn.zzdvy>
	//    3    5:iconst_1        
	//    4    6:aload_2         
	//    5    7:invokestatic    #30  <Method void zzbbg.zza(zzbav, zzbes, int, Object)>
		zzbbg.zza(zzbav, zzbcn1.zzdwa, 2, obj1);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #21  <Field zzbes zzbcn.zzdwa>
	//    9   15:iconst_2        
	//   10   16:aload_3         
	//   11   17:invokestatic    #30  <Method void zzbbg.zza(zzbav, zzbes, int, Object)>
	//   12   20:return          
	}
}
