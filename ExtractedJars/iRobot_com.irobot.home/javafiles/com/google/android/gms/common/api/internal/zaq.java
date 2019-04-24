// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zar

public final class zaq
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

	public zaq(Api api, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mApi = api;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Api mApi>
		zaeb = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field boolean zaeb>
	//    8   14:return          
	}

	private final void zav()
	{
		Preconditions.checkNotNull(((Object) (zaec)), "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field zar zaec>
	//    2    4:ldc1            #32  <String "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.">
	//    3    6:invokestatic    #38  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
	//    5   10:return          
	}

	public final void onConnected(Bundle bundle)
	{
		zav();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void zav()>
		zaec.onConnected(bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field zar zaec>
	//    4    8:aload_1         
	//    5    9:invokeinterface #46  <Method void zar.onConnected(Bundle)>
	//    6   14:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		zav();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void zav()>
		zaec.zaa(connectionresult, mApi, zaeb);
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field zar zaec>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field Api mApi>
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field boolean zaeb>
	//    9   17:invokeinterface #52  <Method void zar.zaa(ConnectionResult, Api, boolean)>
	//   10   22:return          
	}

	public final void onConnectionSuspended(int i)
	{
		zav();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void zav()>
		zaec.onConnectionSuspended(i);
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field zar zaec>
	//    4    8:iload_1         
	//    5    9:invokeinterface #56  <Method void zar.onConnectionSuspended(int)>
	//    6   14:return          
	}

	public final void zaa(zar zar1)
	{
		zaec = zar1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field zar zaec>
	//    3    5:return          
	}

	public final Api mApi;
	private final boolean zaeb;
	private zar zaec;
}
