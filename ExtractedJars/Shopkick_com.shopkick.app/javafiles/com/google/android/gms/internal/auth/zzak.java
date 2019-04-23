// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.*;
import android.text.TextUtils;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal.auth:
//			zzan, zzao

public final class zzak extends GmsClient
{

	public zzak(Context context, Looper looper, ClientSettings clientsettings, AuthProxyOptions authproxyoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 16, clientsettings, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          16
	//    4    5:aload_3         
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #12  <Method void GmsClient(Context, Looper, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		if(authproxyoptions == null)
	//*   8   13:aload           4
	//*   9   15:ifnonnull       30
		{
			zzbv = new Bundle();
	//   10   18:aload_0         
	//   11   19:new             #14  <Class Bundle>
	//   12   22:dup             
	//   13   23:invokespecial   #17  <Method void Bundle()>
	//   14   26:putfield        #19  <Field Bundle zzbv>
			return;
	//   15   29:return          
		} else
		{
			throw new NoSuchMethodError();
	//   16   30:new             #21  <Class NoSuchMethodError>
	//   17   33:dup             
	//   18   34:invokespecial   #22  <Method void NoSuchMethodError()>
	//   19   37:athrow          
		}
	}

	protected final IInterface createServiceInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
	//    4    6:aload_1         
	//    5    7:ldc1            #27  <String "com.google.android.gms.auth.api.internal.IAuthService">
	//    6    9:invokeinterface #33  <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zzan)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #35  <Class zzan>
	//*  10   19:ifeq            27
			return ((IInterface) ((zzan)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #35  <Class zzan>
	//   13   26:areturn         
		else
			return ((IInterface) (new zzao(ibinder)));
	//   14   27:new             #37  <Class zzao>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #40  <Method void zzao(IBinder)>
	//   18   35:areturn         
	}

	protected final Bundle getGetServiceRequestExtraArgs()
	{
		return zzbv;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Bundle zzbv>
	//    2    4:areturn         
	}

	public final int getMinApkVersion()
	{
		return 0xbdfcb8;
	//    0    0:ldc1            #45  <Int 0xbdfcb8>
	//    1    2:ireturn         
	}

	protected final String getServiceDescriptor()
	{
		return "com.google.android.gms.auth.api.internal.IAuthService";
	//    0    0:ldc1            #27  <String "com.google.android.gms.auth.api.internal.IAuthService">
	//    1    2:areturn         
	}

	protected final String getStartServiceAction()
	{
		return "com.google.android.gms.auth.service.START";
	//    0    0:ldc1            #50  <String "com.google.android.gms.auth.service.START">
	//    1    2:areturn         
	}

	public final boolean requiresSignIn()
	{
		ClientSettings clientsettings = getClientSettings();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method ClientSettings getClientSettings()>
	//    2    4:astore_1        
		return !TextUtils.isEmpty(((CharSequence) (clientsettings.getAccountName()))) && !clientsettings.getApplicableScopes(AuthProxy.API).isEmpty();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #61  <Method String ClientSettings.getAccountName()>
	//    5    9:invokestatic    #67  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    6   12:ifne            32
	//    7   15:aload_1         
	//    8   16:getstatic       #73  <Field com.google.android.gms.common.api.Api AuthProxy.API>
	//    9   19:invokevirtual   #77  <Method Set ClientSettings.getApplicableScopes(com.google.android.gms.common.api.Api)>
	//   10   22:invokeinterface #81  <Method boolean Set.isEmpty()>
	//   11   27:ifne            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	private final Bundle zzbv;
}
