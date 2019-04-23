// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zza;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzk

static final class zzk$zza
	implements com.google.android.gms.safetynet.tApi.zza
{

	public final String getJwsResult()
	{
		zza zza1 = zzae;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zza zzae>
	//    2    4:astore_1        
		if(zza1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return zza1.getJwsResult();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #29  <Method String zza.getJwsResult()>
	//    9   15:areturn         
	}

	public final Status getStatus()
	{
		return zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Status zzad>
	//    2    4:areturn         
	}

	private final Status zzad;
	private final zza zzae;

	public zzk$zza(Status status, zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzad = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Status zzad>
		zzae = zza1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field zza zzae>
	//    8   14:return          
	}
}
