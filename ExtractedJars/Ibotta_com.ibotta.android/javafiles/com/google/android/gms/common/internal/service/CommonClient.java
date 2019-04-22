// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

// Referenced classes of package com.google.android.gms.common.internal.service:
//			ICommonService

public class CommonClient extends GmsClient
{

	public CommonClient(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 39, clientsettings, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          39
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:aload           5
	//    7   10:invokespecial   #14  <Method void GmsClient(Context, Looper, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   13:return          
	}

	protected volatile IInterface createServiceInterface(IBinder ibinder)
	{
		return ((IInterface) (createServiceInterface(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method ICommonService createServiceInterface(IBinder)>
	//    3    5:areturn         
	}

	protected ICommonService createServiceInterface(IBinder ibinder)
	{
		return ICommonService.Stub.asInterface(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method ICommonService ICommonService$Stub.asInterface(IBinder)>
	//    2    4:areturn         
	}

	public int getMinApkVersion()
	{
		return super.getMinApkVersion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method int GmsClient.getMinApkVersion()>
	//    2    4:ireturn         
	}

	protected String getServiceDescriptor()
	{
		return "com.google.android.gms.common.internal.service.ICommonService";
	//    0    0:ldc1            #33  <String "com.google.android.gms.common.internal.service.ICommonService">
	//    1    2:areturn         
	}

	public String getStartServiceAction()
	{
		return "com.google.android.gms.common.service.START";
	//    0    0:ldc1            #9   <String "com.google.android.gms.common.service.START">
	//    1    2:areturn         
	}

	public static final String START_SERVICE_ACTION = "com.google.android.gms.common.service.START";
}
