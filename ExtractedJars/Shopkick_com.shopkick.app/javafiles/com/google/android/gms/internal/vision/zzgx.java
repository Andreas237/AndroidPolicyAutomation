// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzgy, zzfp, zzfe

public final class zzgx
{

	static int zza(zzgy zzgy1, Object obj, Object obj1)
	{
		return zzfp.zza(zzgy1.zzyv, 1, obj) + zzfp.zza(zzgy1.zzyx, 2, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzjd zzgy.zzyv>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method int zzfp.zza(zzjd, int, Object)>
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzjd zzgy.zzyx>
	//    7   13:iconst_2        
	//    8   14:aload_2         
	//    9   15:invokestatic    #18  <Method int zzfp.zza(zzjd, int, Object)>
	//   10   18:iadd            
	//   11   19:ireturn         
	}

	static void zza(zzfe zzfe, zzgy zzgy1, Object obj, Object obj1)
		throws IOException
	{
		zzfp.zza(zzfe, zzgy1.zzyv, 1, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #13  <Field zzjd zzgy.zzyv>
	//    3    5:iconst_1        
	//    4    6:aload_2         
	//    5    7:invokestatic    #30  <Method void zzfp.zza(zzfe, zzjd, int, Object)>
		zzfp.zza(zzfe, zzgy1.zzyx, 2, obj1);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #21  <Field zzjd zzgy.zzyx>
	//    9   15:iconst_2        
	//   10   16:aload_3         
	//   11   17:invokestatic    #30  <Method void zzfp.zza(zzfe, zzjd, int, Object)>
	//   12   20:return          
	}
}
