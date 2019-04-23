// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zzf;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzk

static final class zzk$zzh
	implements com.google.android.gms.safetynet.tApi.RecaptchaTokenResult
{

	public final Status getStatus()
	{
		return zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Status zzad>
	//    2    4:areturn         
	}

	public final String getTokenResult()
	{
		zzf zzf1 = zzam;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzf zzam>
	//    2    4:astore_1        
		if(zzf1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return zzf1.getTokenResult();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #31  <Method String zzf.getTokenResult()>
	//    9   15:areturn         
	}

	private final Status zzad;
	private final zzf zzam;

	public zzk$zzh(Status status, zzf zzf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzad = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Status zzad>
		zzam = zzf1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field zzf zzam>
	//    8   14:return          
	}
}
