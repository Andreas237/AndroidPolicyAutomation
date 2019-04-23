// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.auth:
//			zzap, zzat, zzan, zzar

final class zzas extends zzap
{

	zzas(zzar zzar, GoogleApiClient googleapiclient, ProxyRequest proxyrequest)
	{
		zzce = proxyrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field ProxyRequest zzce>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zzap(GoogleApiClient)>
	//    6   10:return          
	}

	protected final void zza(Context context, zzan zzan1)
		throws RemoteException
	{
		zzan1.zza(((zzal) (new zzat(this))), zzce);
	//    0    0:aload_2         
	//    1    1:new             #20  <Class zzat>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void zzat(zzas)>
	//    5    9:aload_0         
	//    6   10:getfield        #10  <Field ProxyRequest zzce>
	//    7   13:invokeinterface #28  <Method void zzan.zza(zzal, ProxyRequest)>
	//    8   18:return          
	}

	private final ProxyRequest zzce;
}
