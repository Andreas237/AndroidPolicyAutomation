// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.identity.zze;

final class zza extends com.google.android.gms.common.api.Api.AbstractClientBuilder
{

	zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void com.google.android.gms.common.api.Api$AbstractClientBuilder()>
	//    2    4:return          
	}

	public final com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		Address.AddressOptions addressoptions = (Address.AddressOptions)obj;
	//    0    0:aload           4
	//    1    2:checkcast       #14  <Class Address$AddressOptions>
	//    2    5:astore          7
		Preconditions.checkArgument(context instanceof Activity, "An Activity must be used for Address APIs");
	//    3    7:aload_1         
	//    4    8:instanceof      #16  <Class Activity>
	//    5   11:ldc1            #18  <String "An Activity must be used for Address APIs">
	//    6   13:invokestatic    #24  <Method void Preconditions.checkArgument(boolean, Object)>
		obj = ((Object) (addressoptions));
	//    7   16:aload           7
	//    8   18:astore          4
		if(addressoptions == null)
	//*   9   20:aload           7
	//*  10   22:ifnonnull       34
			obj = ((Object) (new Address.AddressOptions()));
	//   11   25:new             #14  <Class Address$AddressOptions>
	//   12   28:dup             
	//   13   29:invokespecial   #25  <Method void Address$AddressOptions()>
	//   14   32:astore          4
		return ((com.google.android.gms.common.api.Api.Client) (new zze((Activity)context, looper, clientsettings, ((Address.AddressOptions) (obj)).theme, connectioncallbacks, onconnectionfailedlistener)));
	//   15   34:new             #27  <Class zze>
	//   16   37:dup             
	//   17   38:aload_1         
	//   18   39:checkcast       #16  <Class Activity>
	//   19   42:aload_2         
	//   20   43:aload_3         
	//   21   44:aload           4
	//   22   46:getfield        #31  <Field int Address$AddressOptions.theme>
	//   23   49:aload           5
	//   24   51:aload           6
	//   25   53:invokespecial   #34  <Method void zze(Activity, Looper, ClientSettings, int, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   26   56:areturn         
	}
}
