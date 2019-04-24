// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zznx, zznv

public final class zznq
{

	public static transient boolean zza(zznx zznx1, zznv zznv, String as[])
	{
		if(zznx1 != null && zznv != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            18
			return zznx1.zza(zznv, as);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #13  <Method boolean zznx.zza(zznv, String[])>
	//    9   17:ireturn         
		else
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public static zznv zzb(zznx zznx1)
	{
		if(zznx1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return zznx1.zzjj();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #21  <Method zznv zznx.zzjj()>
	//    6   10:areturn         
	}
}
