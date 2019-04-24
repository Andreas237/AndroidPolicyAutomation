// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbcg, zzbch, zzbcf

abstract class zzbce
{

	private zzbce()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	zzbce(zzbcf zzbcf)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zzbce()>
	//    2    4:return          
	}

	static zzbce zzady()
	{
		return zzdvq;
	//    0    0:getstatic       #17  <Field zzbce zzdvq>
	//    1    3:areturn         
	}

	static zzbce zzadz()
	{
		return zzdvr;
	//    0    0:getstatic       #22  <Field zzbce zzdvr>
	//    1    3:areturn         
	}

	abstract List zza(Object obj, long l);

	abstract void zza(Object obj, Object obj1, long l);

	abstract void zzb(Object obj, long l);

	private static final zzbce zzdvq = new zzbcg(((zzbcf) (null)));
	private static final zzbce zzdvr = new zzbch(((zzbcf) (null)));

	static 
	{
	//    0    0:new             #11  <Class zzbcg>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #15  <Method void zzbcg(zzbcf)>
	//    4    8:putstatic       #17  <Field zzbce zzdvq>
	//    5   11:new             #19  <Class zzbch>
	//    6   14:dup             
	//    7   15:aconst_null     
	//    8   16:invokespecial   #20  <Method void zzbch(zzbcf)>
	//    9   19:putstatic       #22  <Field zzbce zzdvr>
	//*  10   22:return          
	}
}
