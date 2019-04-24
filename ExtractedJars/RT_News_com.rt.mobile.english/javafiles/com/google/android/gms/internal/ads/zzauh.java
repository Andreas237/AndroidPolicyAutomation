// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaxr, zzaup, zzbbo

public final class zzauh
{

	private zzauh(zzaxr zzaxr1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzdhi = zzaxr1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field zzaxr zzdhi>
	//    5    9:return          
	}

	static final zzauh zza(zzaxr zzaxr1)
		throws GeneralSecurityException
	{
		if(zzaxr1 != null && zzaxr1.zzzm() > 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          23
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #24  <Method int zzaxr.zzzm()>
	//*   4    8:ifgt            14
	//*   5   11:goto            23
			return new zzauh(zzaxr1);
	//    6   14:new             #2   <Class zzauh>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #26  <Method void zzauh(zzaxr)>
	//   10   22:areturn         
		else
			throw new GeneralSecurityException("empty keyset");
	//   11   23:new             #18  <Class GeneralSecurityException>
	//   12   26:dup             
	//   13   27:ldc1            #28  <String "empty keyset">
	//   14   29:invokespecial   #31  <Method void GeneralSecurityException(String)>
	//   15   32:athrow          
	}

	public final String toString()
	{
		return ((zzbbo) (zzaup.zzb(zzdhi))).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzaxr zzdhi>
	//    2    4:invokestatic    #40  <Method zzaxt zzaup.zzb(zzaxr)>
	//    3    7:invokevirtual   #44  <Method String zzbbo.toString()>
	//    4   10:areturn         
	}

	final zzaxr zzwg()
	{
		return zzdhi;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zzaxr zzdhi>
	//    2    4:areturn         
	}

	private zzaxr zzdhi;
}
