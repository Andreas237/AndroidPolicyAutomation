// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			GmsClient, ClientSettings

public class SimpleClientAdapter extends GmsClient
{

	public SimpleClientAdapter(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ClientSettings clientsettings, com.google.android.gms.common.api.Api.SimpleClient simpleclient)
	{
		super(context, looper, i, clientsettings, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           6
	//    5    6:aload           4
	//    6    8:aload           5
	//    7   10:invokespecial   #13  <Method void GmsClient(Context, Looper, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		zzva = simpleclient;
	//    8   13:aload_0         
	//    9   14:aload           7
	//   10   16:putfield        #15  <Field com.google.android.gms.common.api.Api$SimpleClient zzva>
	//   11   19:return          
	}

	protected IInterface createServiceInterface(IBinder ibinder)
	{
		return zzva.createServiceInterface(ibinder);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.gms.common.api.Api$SimpleClient zzva>
	//    2    4:aload_1         
	//    3    5:invokeinterface #24  <Method IInterface com.google.android.gms.common.api.Api$SimpleClient.createServiceInterface(IBinder)>
	//    4   10:areturn         
	}

	public com.google.android.gms.common.api.Api.SimpleClient getClient()
	{
		return zzva;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.gms.common.api.Api$SimpleClient zzva>
	//    2    4:areturn         
	}

	public int getMinApkVersion()
	{
		return super.getMinApkVersion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method int GmsClient.getMinApkVersion()>
	//    2    4:ireturn         
	}

	protected String getServiceDescriptor()
	{
		return zzva.getServiceDescriptor();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.gms.common.api.Api$SimpleClient zzva>
	//    2    4:invokeinterface #36  <Method String com.google.android.gms.common.api.Api$SimpleClient.getServiceDescriptor()>
	//    3    9:areturn         
	}

	protected String getStartServiceAction()
	{
		return zzva.getStartServiceAction();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.gms.common.api.Api$SimpleClient zzva>
	//    2    4:invokeinterface #39  <Method String com.google.android.gms.common.api.Api$SimpleClient.getStartServiceAction()>
	//    3    9:areturn         
	}

	protected void onSetConnectState(int i, IInterface iinterface)
	{
		zzva.setState(i, iinterface);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.gms.common.api.Api$SimpleClient zzva>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #44  <Method void com.google.android.gms.common.api.Api$SimpleClient.setState(int, IInterface)>
	//    5   11:return          
	}

	private final com.google.android.gms.common.api.Api.SimpleClient zzva;
}
