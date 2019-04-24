// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzl

final class zzl$1
	implements b
{

	public void onConnected(Bundle bundle)
	{
		zzaEu.onConnected(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks zzaEu>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method void com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks.onConnected(Bundle)>
	//    4   10:return          
	}

	public void onConnectionSuspended(int i)
	{
		zzaEu.onConnectionSuspended(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks zzaEu>
	//    2    4:iload_1         
	//    3    5:invokeinterface #33  <Method void com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks.onConnectionSuspended(int)>
	//    4   10:return          
	}

	final com.google.android.gms.common.api.ApiClient.ConnectionCallbacks zzaEu;

	zzl$1(com.google.android.gms.common.api.ApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zzaEu = connectioncallbacks;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks zzaEu>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
