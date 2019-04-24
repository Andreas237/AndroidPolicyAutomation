// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzl

final class zzl$2
	implements c
{

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzaFT.onConnectionFailed(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzaFT>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method void com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
	//    4   10:return          
	}

	final com.google.android.gms.common.api.ApiClient.OnConnectionFailedListener zzaFT;

	zzl$2(com.google.android.gms.common.api.ApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzaFT = onconnectionfailedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzaFT>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
