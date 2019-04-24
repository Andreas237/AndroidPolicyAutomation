// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvo, zzuf, zztv

public final class zzvn
{

	static int zza(zzvo zzvo1, Object obj, Object obj1)
	{
		return zzuf.zza(zzvo1.zzcak, 1, obj) + zzuf.zza(zzvo1.zzcam, 2, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzxs zzvo.zzcak>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method int zzuf.zza(zzxs, int, Object)>
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzxs zzvo.zzcam>
	//    7   13:iconst_2        
	//    8   14:aload_2         
	//    9   15:invokestatic    #18  <Method int zzuf.zza(zzxs, int, Object)>
	//   10   18:iadd            
	//   11   19:ireturn         
	}

	static void zza(zztv zztv, zzvo zzvo1, Object obj, Object obj1)
	{
		zzuf.zza(zztv, zzvo1.zzcak, 1, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #13  <Field zzxs zzvo.zzcak>
	//    3    5:iconst_1        
	//    4    6:aload_2         
	//    5    7:invokestatic    #28  <Method void zzuf.zza(zztv, zzxs, int, Object)>
		zzuf.zza(zztv, zzvo1.zzcam, 2, obj1);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #21  <Field zzxs zzvo.zzcam>
	//    9   15:iconst_2        
	//   10   16:aload_3         
	//   11   17:invokestatic    #28  <Method void zzuf.zza(zztv, zzxs, int, Object)>
	//   12   20:return          
	}
}
