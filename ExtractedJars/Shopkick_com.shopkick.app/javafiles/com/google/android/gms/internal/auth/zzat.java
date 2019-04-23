// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;

// Referenced classes of package com.google.android.gms.internal.auth:
//			zzaj, zzaw, zzas

final class zzat extends zzaj
{

	zzat(zzas zzas1)
	{
		zzcf = zzas1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzas zzcf>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzaj()>
	//    5    9:return          
	}

	public final void zza(ProxyResponse proxyresponse)
	{
		zzcf.setResult(((com.google.android.gms.common.api.Result) (new zzaw(proxyresponse))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzas zzcf>
	//    2    4:new             #18  <Class zzaw>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #20  <Method void zzaw(ProxyResponse)>
	//    6   12:invokevirtual   #26  <Method void zzas.setResult(com.google.android.gms.common.api.Result)>
	//    7   15:return          
	}

	private final zzas zzcf;
}
