// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.installreferrer.api;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.lang.annotation.Annotation;

// Referenced classes of package com.android.installreferrer.api:
//			InstallReferrerClient, ReferrerDetails

class InstallReferrerClientImpl extends InstallReferrerClient
{
	public static interface ClientState
		extends Annotation
	{
	}


	public void endConnection()
	{
		mClientState = 3;
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:putfield        #19  <Field int mClientState>
		if(mServiceConnection != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field ServiceConnection mServiceConnection>
	//*   5    9:ifnull          35
		{
			InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
	//    6   12:ldc1            #23  <String "InstallReferrerClient">
	//    7   14:ldc1            #25  <String "Unbinding from service.">
	//    8   16:invokestatic    #31  <Method void InstallReferrerCommons.logVerbose(String, String)>
			mApplicationContext.unbindService(mServiceConnection);
	//    9   19:aload_0         
	//   10   20:getfield        #33  <Field Context mApplicationContext>
	//   11   23:aload_0         
	//   12   24:getfield        #21  <Field ServiceConnection mServiceConnection>
	//   13   27:invokevirtual   #39  <Method void Context.unbindService(ServiceConnection)>
			mServiceConnection = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #21  <Field ServiceConnection mServiceConnection>
		}
		mService = null;
	//   17   35:aload_0         
	//   18   36:aconst_null     
	//   19   37:putfield        #41  <Field IGetInstallReferrerService mService>
	//   20   40:return          
	}

	public ReferrerDetails getInstallReferrer()
		throws RemoteException
	{
		if(isReady())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #50  <Method boolean isReady()>
	//*   2    4:ifeq            63
		{
			Object obj = ((Object) (new Bundle()));
	//    3    7:new             #52  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #55  <Method void Bundle()>
	//    6   14:astore_1        
			((Bundle) (obj)).putString("package_name", mApplicationContext.getPackageName());
	//    7   15:aload_1         
	//    8   16:ldc1            #57  <String "package_name">
	//    9   18:aload_0         
	//   10   19:getfield        #33  <Field Context mApplicationContext>
	//   11   22:invokevirtual   #61  <Method String Context.getPackageName()>
	//   12   25:invokevirtual   #64  <Method void Bundle.putString(String, String)>
			try
			{
				obj = ((Object) (new ReferrerDetails(mService.getInstallReferrer(((Bundle) (obj))))));
	//   13   28:new             #66  <Class ReferrerDetails>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:getfield        #41  <Field IGetInstallReferrerService mService>
	//   17   36:aload_1         
	//   18   37:invokeinterface #71  <Method Bundle IGetInstallReferrerService.getInstallReferrer(Bundle)>
	//   19   42:invokespecial   #74  <Method void ReferrerDetails(Bundle)>
	//   20   45:astore_1        
			}
	//*  21   46:aload_1         
	//*  22   47:areturn         
			catch(RemoteException remoteexception)
	//*  23   48:astore_1        
			{
				InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
	//   24   49:ldc1            #23  <String "InstallReferrerClient">
	//   25   51:ldc1            #76  <String "RemoteException getting install referrer information">
	//   26   53:invokestatic    #79  <Method void InstallReferrerCommons.logWarn(String, String)>
				mClientState = 0;
	//   27   56:aload_0         
	//   28   57:iconst_0        
	//   29   58:putfield        #19  <Field int mClientState>
				throw remoteexception;
	//   30   61:aload_1         
	//   31   62:athrow          
			}
			return ((ReferrerDetails) (obj));
		} else
		{
			throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
	//   32   63:new             #81  <Class IllegalStateException>
	//   33   66:dup             
	//   34   67:ldc1            #83  <String "Service not connected. Please start a connection before using the service.">
	//   35   69:invokespecial   #86  <Method void IllegalStateException(String)>
	//   36   72:athrow          
		}
	}

	public boolean isReady()
	{
		return mClientState == 2 && mService != null && mServiceConnection != null;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mClientState>
	//    2    4:iconst_2        
	//    3    5:icmpne          24
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field IGetInstallReferrerService mService>
	//    6   12:ifnull          24
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field ServiceConnection mServiceConnection>
	//    9   19:ifnull          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private final Context mApplicationContext;
	private int mClientState;
	private IGetInstallReferrerService mService;
	private ServiceConnection mServiceConnection;
}
