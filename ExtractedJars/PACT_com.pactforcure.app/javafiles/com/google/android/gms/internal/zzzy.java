// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.internal:
//			zzzz

public class zzzy
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

	public zzzy(Api api, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzawb = api;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Api zzawb>
		zzazb = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int zzazb>
	//    8   14:return          
	}

	private void zzvi()
	{
		zzac.zzb(((Object) (zzazc)), "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field zzzz zzazc>
	//    2    4:ldc1            #32  <String "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.">
	//    3    6:invokestatic    #38  <Method Object zzac.zzb(Object, Object)>
	//    4    9:pop             
	//    5   10:return          
	}

	public void onConnected(Bundle bundle)
	{
		zzvi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void zzvi()>
		zzazc.onConnected(bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field zzzz zzazc>
	//    4    8:aload_1         
	//    5    9:invokeinterface #47  <Method void zzzz.onConnected(Bundle)>
	//    6   14:return          
	}

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzvi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void zzvi()>
		zzazc.zza(connectionresult, zzawb, zzazb);
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field zzzz zzazc>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field Api zzawb>
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field int zzazb>
	//    9   17:invokeinterface #55  <Method void zzzz.zza(ConnectionResult, Api, int)>
	//   10   22:return          
	}

	public void onConnectionSuspended(int i)
	{
		zzvi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void zzvi()>
		zzazc.onConnectionSuspended(i);
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field zzzz zzazc>
	//    4    8:iload_1         
	//    5    9:invokeinterface #59  <Method void zzzz.onConnectionSuspended(int)>
	//    6   14:return          
	}

	public void zza(zzzz zzzz1)
	{
		zzazc = zzzz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field zzzz zzazc>
	//    3    5:return          
	}

	public final Api zzawb;
	private final int zzazb;
	private zzzz zzazc;
}
