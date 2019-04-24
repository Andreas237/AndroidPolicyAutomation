// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast:
//			ApplicationMetadata

final class zzm
	implements Cast.ApplicationConnectionResult
{

	zzm(Cast.zza zza, Status status)
	{
		zzal = status;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field Status zzal>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final ApplicationMetadata getApplicationMetadata()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final String getApplicationStatus()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final String getSessionId()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Status getStatus()
	{
		return zzal;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Status zzal>
	//    2    4:areturn         
	}

	public final boolean getWasLaunched()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private final Status zzal;
}
