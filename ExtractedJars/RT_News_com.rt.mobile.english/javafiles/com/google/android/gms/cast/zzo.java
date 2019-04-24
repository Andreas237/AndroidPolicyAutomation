// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.cast.zzea;

final class zzo extends com.google.android.gms.common.api.Api.AbstractClientBuilder
{

	zzo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void com.google.android.gms.common.api.Api$AbstractClientBuilder()>
	//    2    4:return          
	}

	public final com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		obj = ((Object) ((CastRemoteDisplay.CastRemoteDisplayOptions)obj));
	//    0    0:aload           4
	//    1    2:checkcast       #14  <Class CastRemoteDisplay$CastRemoteDisplayOptions>
	//    2    5:astore          4
		Bundle bundle = new Bundle();
	//    3    7:new             #16  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #17  <Method void Bundle()>
	//    6   14:astore          7
		bundle.putInt("configuration", ((CastRemoteDisplay.CastRemoteDisplayOptions) (obj)).zzbb);
	//    7   16:aload           7
	//    8   18:ldc1            #19  <String "configuration">
	//    9   20:aload           4
	//   10   22:getfield        #23  <Field int CastRemoteDisplay$CastRemoteDisplayOptions.zzbb>
	//   11   25:invokevirtual   #27  <Method void Bundle.putInt(String, int)>
		return ((com.google.android.gms.common.api.Api.Client) (new zzea(context, looper, clientsettings, ((CastRemoteDisplay.CastRemoteDisplayOptions) (obj)).zzai, bundle, ((CastRemoteDisplay.CastRemoteDisplayOptions) (obj)).zzba, connectioncallbacks, onconnectionfailedlistener)));
	//   12   28:new             #29  <Class zzea>
	//   13   31:dup             
	//   14   32:aload_1         
	//   15   33:aload_2         
	//   16   34:aload_3         
	//   17   35:aload           4
	//   18   37:getfield        #33  <Field CastDevice CastRemoteDisplay$CastRemoteDisplayOptions.zzai>
	//   19   40:aload           7
	//   20   42:aload           4
	//   21   44:getfield        #37  <Field CastRemoteDisplay$CastRemoteDisplaySessionCallbacks CastRemoteDisplay$CastRemoteDisplayOptions.zzba>
	//   22   47:aload           5
	//   23   49:aload           6
	//   24   51:invokespecial   #40  <Method void zzea(Context, Looper, ClientSettings, CastDevice, Bundle, CastRemoteDisplay$CastRemoteDisplaySessionCallbacks, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   25   54:areturn         
	}
}
