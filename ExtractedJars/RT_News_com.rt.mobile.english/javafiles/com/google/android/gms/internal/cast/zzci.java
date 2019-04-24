// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcl

final class zzci extends com.google.android.gms.common.api.Api.AbstractClientBuilder
{

	zzci()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void com.google.android.gms.common.api.Api$AbstractClientBuilder()>
	//    2    4:return          
	}

	public final com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return ((com.google.android.gms.common.api.Api.Client) (new zzcl(context, looper, clientsettings, connectioncallbacks, onconnectionfailedlistener)));
	//    0    0:new             #14  <Class zzcl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           5
	//    6    9:aload           6
	//    7   11:invokespecial   #17  <Method void zzcl(Context, Looper, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   14:areturn         
	}
}
