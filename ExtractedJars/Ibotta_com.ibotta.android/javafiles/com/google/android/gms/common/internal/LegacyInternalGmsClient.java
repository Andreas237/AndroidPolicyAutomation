// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			GmsClient, GmsClientEventManager, BaseGmsClient, ClientSettings

public abstract class LegacyInternalGmsClient extends GmsClient
{

	public LegacyInternalGmsClient(Context context, int i, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, context.getMainLooper(), i, clientsettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #16  <Method android.os.Looper Context.getMainLooper()>
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #19  <Method void GmsClient(Context, android.os.Looper, int, ClientSettings)>
		zzie = new GmsClientEventManager(context.getMainLooper(), ((GmsClientEventManager.GmsClientEventState) (this)));
	//    7   11:aload_0         
	//    8   12:new             #21  <Class GmsClientEventManager>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokevirtual   #16  <Method android.os.Looper Context.getMainLooper()>
	//   12   20:aload_0         
	//   13   21:invokespecial   #24  <Method void GmsClientEventManager(android.os.Looper, GmsClientEventManager$GmsClientEventState)>
	//   14   24:putfield        #26  <Field GmsClientEventManager zzie>
		zzie.registerConnectionCallbacks(connectioncallbacks);
	//   15   27:aload_0         
	//   16   28:getfield        #26  <Field GmsClientEventManager zzie>
	//   17   31:aload           4
	//   18   33:invokevirtual   #30  <Method void GmsClientEventManager.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
		zzie.registerConnectionFailedListener(onconnectionfailedlistener);
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field GmsClientEventManager zzie>
	//   21   40:aload           5
	//   22   42:invokevirtual   #34  <Method void GmsClientEventManager.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   23   45:return          
	}

	public void checkAvailabilityAndConnect()
	{
		zzie.enableCallbacks();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GmsClientEventManager zzie>
	//    2    4:invokevirtual   #40  <Method void GmsClientEventManager.enableCallbacks()>
		super.checkAvailabilityAndConnect();
	//    3    7:aload_0         
	//    4    8:invokespecial   #42  <Method void GmsClient.checkAvailabilityAndConnect()>
	//    5   11:return          
	}

	public void disconnect()
	{
		zzie.disableCallbacks();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GmsClientEventManager zzie>
	//    2    4:invokevirtual   #46  <Method void GmsClientEventManager.disableCallbacks()>
		super.disconnect();
	//    3    7:aload_0         
	//    4    8:invokespecial   #48  <Method void GmsClient.disconnect()>
	//    5   11:return          
	}

	public int getMinApkVersion()
	{
		return super.getMinApkVersion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method int GmsClient.getMinApkVersion()>
	//    2    4:ireturn         
	}

	public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		return zzie.isConnectionCallbacksRegistered(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method boolean GmsClientEventManager.isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:ireturn         
	}

	public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return zzie.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method boolean GmsClientEventManager.isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:ireturn         
	}

	public void onConnectedLocked(IInterface iinterface)
	{
		super.onConnectedLocked(iinterface);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void GmsClient.onConnectedLocked(IInterface)>
		zzie.onConnectionSuccess(((BaseGmsClient)this).getConnectionHint());
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field GmsClientEventManager zzie>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #71  <Method android.os.Bundle BaseGmsClient.getConnectionHint()>
	//    7   13:invokevirtual   #75  <Method void GmsClientEventManager.onConnectionSuccess(android.os.Bundle)>
	//    8   16:return          
	}

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		super.onConnectionFailed(connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void GmsClient.onConnectionFailed(ConnectionResult)>
		zzie.onConnectionFailure(connectionresult);
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field GmsClientEventManager zzie>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #85  <Method void GmsClientEventManager.onConnectionFailure(ConnectionResult)>
	//    7   13:return          
	}

	public void onConnectionSuspended(int i)
	{
		super.onConnectionSuspended(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #89  <Method void GmsClient.onConnectionSuspended(int)>
		zzie.onUnintentionalDisconnection(i);
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field GmsClientEventManager zzie>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #92  <Method void GmsClientEventManager.onUnintentionalDisconnection(int)>
	//    7   13:return          
	}

	public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zzie.registerConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method void GmsClientEventManager.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzie.registerConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void GmsClientEventManager.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		zzie.unregisterConnectionCallbacks(connectioncallbacks);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method void GmsClientEventManager.unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    4    8:return          
	}

	public void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzie.unregisterConnectionFailedListener(onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GmsClientEventManager zzie>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #98  <Method void GmsClientEventManager.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    4    8:return          
	}

	private final GmsClientEventManager zzie;
}
