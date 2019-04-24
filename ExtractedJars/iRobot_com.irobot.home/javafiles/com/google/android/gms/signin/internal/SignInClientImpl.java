// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.*;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

// Referenced classes of package com.google.android.gms.signin.internal:
//			zaf, zag, zah, zaj, 
//			zad

public class SignInClientImpl extends GmsClient
	implements zad
{

	private SignInClientImpl(Context context, Looper looper, boolean flag, ClientSettings clientsettings, Bundle bundle, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, 44, clientsettings, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          44
	//    4    5:aload           4
	//    5    7:aload           6
	//    6    9:aload           7
	//    7   11:invokespecial   #21  <Method void GmsClient(Context, Looper, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		zary = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #23  <Field boolean zary>
		zaes = clientsettings;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #25  <Field ClientSettings zaes>
		zarz = bundle;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #27  <Field Bundle zarz>
		zaod = clientsettings.getClientSessionId();
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:invokevirtual   #33  <Method Integer ClientSettings.getClientSessionId()>
	//   20   37:putfield        #35  <Field Integer zaod>
	//   21   40:return          
	}

	public SignInClientImpl(Context context, Looper looper, boolean flag, ClientSettings clientsettings, SignInOptions signinoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		this(context, looper, true, clientsettings, createBundleFromClientSettings(clientsettings), connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:aload           4
	//    5    6:aload           4
	//    6    8:invokestatic    #41  <Method Bundle createBundleFromClientSettings(ClientSettings)>
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:invokespecial   #43  <Method void SignInClientImpl(Context, Looper, boolean, ClientSettings, Bundle, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   10   18:return          
	}

	public static Bundle createBundleFromClientSettings(ClientSettings clientsettings)
	{
		SignInOptions signinoptions = clientsettings.getSignInOptions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method SignInOptions ClientSettings.getSignInOptions()>
	//    2    4:astore_1        
		Integer integer = clientsettings.getClientSessionId();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #33  <Method Integer ClientSettings.getClientSessionId()>
	//    5    9:astore_2        
		Bundle bundle = new Bundle();
	//    6   10:new             #49  <Class Bundle>
	//    7   13:dup             
	//    8   14:invokespecial   #52  <Method void Bundle()>
	//    9   17:astore_3        
		bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", ((android.os.Parcelable) (clientsettings.getAccount())));
	//   10   18:aload_3         
	//   11   19:ldc1            #54  <String "com.google.android.gms.signin.internal.clientRequestedAccount">
	//   12   21:aload_0         
	//   13   22:invokevirtual   #58  <Method Account ClientSettings.getAccount()>
	//   14   25:invokevirtual   #62  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(integer != null)
	//*  15   28:aload_2         
	//*  16   29:ifnull          42
			bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
	//   17   32:aload_3         
	//   18   33:ldc1            #64  <String "com.google.android.gms.common.internal.ClientSettings.sessionId">
	//   19   35:aload_2         
	//   20   36:invokevirtual   #70  <Method int Integer.intValue()>
	//   21   39:invokevirtual   #74  <Method void Bundle.putInt(String, int)>
		if(signinoptions != null)
	//*  22   42:aload_1         
	//*  23   43:ifnull          153
		{
			bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", signinoptions.isOfflineAccessRequested());
	//   24   46:aload_3         
	//   25   47:ldc1            #76  <String "com.google.android.gms.signin.internal.offlineAccessRequested">
	//   26   49:aload_1         
	//   27   50:invokevirtual   #82  <Method boolean SignInOptions.isOfflineAccessRequested()>
	//   28   53:invokevirtual   #86  <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", signinoptions.isIdTokenRequested());
	//   29   56:aload_3         
	//   30   57:ldc1            #88  <String "com.google.android.gms.signin.internal.idTokenRequested">
	//   31   59:aload_1         
	//   32   60:invokevirtual   #91  <Method boolean SignInOptions.isIdTokenRequested()>
	//   33   63:invokevirtual   #86  <Method void Bundle.putBoolean(String, boolean)>
			bundle.putString("com.google.android.gms.signin.internal.serverClientId", signinoptions.getServerClientId());
	//   34   66:aload_3         
	//   35   67:ldc1            #93  <String "com.google.android.gms.signin.internal.serverClientId">
	//   36   69:aload_1         
	//   37   70:invokevirtual   #97  <Method String SignInOptions.getServerClientId()>
	//   38   73:invokevirtual   #101 <Method void Bundle.putString(String, String)>
			bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
	//   39   76:aload_3         
	//   40   77:ldc1            #103 <String "com.google.android.gms.signin.internal.usePromptModeForAuthCode">
	//   41   79:iconst_1        
	//   42   80:invokevirtual   #86  <Method void Bundle.putBoolean(String, boolean)>
			bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", signinoptions.isForceCodeForRefreshToken());
	//   43   83:aload_3         
	//   44   84:ldc1            #105 <String "com.google.android.gms.signin.internal.forceCodeForRefreshToken">
	//   45   86:aload_1         
	//   46   87:invokevirtual   #108 <Method boolean SignInOptions.isForceCodeForRefreshToken()>
	//   47   90:invokevirtual   #86  <Method void Bundle.putBoolean(String, boolean)>
			bundle.putString("com.google.android.gms.signin.internal.hostedDomain", signinoptions.getHostedDomain());
	//   48   93:aload_3         
	//   49   94:ldc1            #110 <String "com.google.android.gms.signin.internal.hostedDomain">
	//   50   96:aload_1         
	//   51   97:invokevirtual   #113 <Method String SignInOptions.getHostedDomain()>
	//   52  100:invokevirtual   #101 <Method void Bundle.putString(String, String)>
			bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", signinoptions.waitForAccessTokenRefresh());
	//   53  103:aload_3         
	//   54  104:ldc1            #115 <String "com.google.android.gms.signin.internal.waitForAccessTokenRefresh">
	//   55  106:aload_1         
	//   56  107:invokevirtual   #118 <Method boolean SignInOptions.waitForAccessTokenRefresh()>
	//   57  110:invokevirtual   #86  <Method void Bundle.putBoolean(String, boolean)>
			if(signinoptions.getAuthApiSignInModuleVersion() != null)
	//*  58  113:aload_1         
	//*  59  114:invokevirtual   #122 <Method Long SignInOptions.getAuthApiSignInModuleVersion()>
	//*  60  117:ifnull          133
				bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", signinoptions.getAuthApiSignInModuleVersion().longValue());
	//   61  120:aload_3         
	//   62  121:ldc1            #124 <String "com.google.android.gms.signin.internal.authApiSignInModuleVersion">
	//   63  123:aload_1         
	//   64  124:invokevirtual   #122 <Method Long SignInOptions.getAuthApiSignInModuleVersion()>
	//   65  127:invokevirtual   #130 <Method long Long.longValue()>
	//   66  130:invokevirtual   #134 <Method void Bundle.putLong(String, long)>
			if(signinoptions.getRealClientLibraryVersion() != null)
	//*  67  133:aload_1         
	//*  68  134:invokevirtual   #137 <Method Long SignInOptions.getRealClientLibraryVersion()>
	//*  69  137:ifnull          153
				bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", signinoptions.getRealClientLibraryVersion().longValue());
	//   70  140:aload_3         
	//   71  141:ldc1            #139 <String "com.google.android.gms.signin.internal.realClientLibraryVersion">
	//   72  143:aload_1         
	//   73  144:invokevirtual   #137 <Method Long SignInOptions.getRealClientLibraryVersion()>
	//   74  147:invokevirtual   #130 <Method long Long.longValue()>
	//   75  150:invokevirtual   #134 <Method void Bundle.putLong(String, long)>
		}
		return bundle;
	//   76  153:aload_3         
	//   77  154:areturn         
	}

	public final void connect()
	{
		connect(((com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) (new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter(((com.google.android.gms.common.internal.BaseGmsClient) (this))))));
	//    0    0:aload_0         
	//    1    1:new             #143 <Class com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #146 <Method void com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter(com.google.android.gms.common.internal.BaseGmsClient)>
	//    5    9:invokevirtual   #149 <Method void connect(com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks)>
	//    6   12:return          
	}

	protected IInterface createServiceInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
	//    4    6:aload_1         
	//    5    7:ldc1            #153 <String "com.google.android.gms.signin.internal.ISignInService">
	//    6    9:invokeinterface #159 <Method IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_2        
		if(iinterface instanceof zaf)
	//*   8   15:aload_2         
	//*   9   16:instanceof      #161 <Class zaf>
	//*  10   19:ifeq            27
			return ((IInterface) ((zaf)iinterface));
	//   11   22:aload_2         
	//   12   23:checkcast       #161 <Class zaf>
	//   13   26:areturn         
		else
			return ((IInterface) (new zag(ibinder)));
	//   14   27:new             #163 <Class zag>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #166 <Method void zag(IBinder)>
	//   18   35:areturn         
	}

	protected Bundle getGetServiceRequestExtraArgs()
	{
		String s = zaes.getRealClientPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ClientSettings zaes>
	//    2    4:invokevirtual   #171 <Method String ClientSettings.getRealClientPackageName()>
	//    3    7:astore_1        
		if(!getContext().getPackageName().equals(((Object) (s))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #175 <Method Context getContext()>
	//*   6   12:invokevirtual   #180 <Method String Context.getPackageName()>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #186 <Method boolean String.equals(Object)>
	//*   9   19:ifne            38
			zarz.putString("com.google.android.gms.signin.internal.realClientPackageName", zaes.getRealClientPackageName());
	//   10   22:aload_0         
	//   11   23:getfield        #27  <Field Bundle zarz>
	//   12   26:ldc1            #188 <String "com.google.android.gms.signin.internal.realClientPackageName">
	//   13   28:aload_0         
	//   14   29:getfield        #25  <Field ClientSettings zaes>
	//   15   32:invokevirtual   #171 <Method String ClientSettings.getRealClientPackageName()>
	//   16   35:invokevirtual   #101 <Method void Bundle.putString(String, String)>
		return zarz;
	//   17   38:aload_0         
	//   18   39:getfield        #27  <Field Bundle zarz>
	//   19   42:areturn         
	}

	public int getMinApkVersion()
	{
		return 0xbdfcb8;
	//    0    0:ldc1            #190 <Int 0xbdfcb8>
	//    1    2:ireturn         
	}

	protected String getServiceDescriptor()
	{
		return "com.google.android.gms.signin.internal.ISignInService";
	//    0    0:ldc1            #153 <String "com.google.android.gms.signin.internal.ISignInService">
	//    1    2:areturn         
	}

	protected String getStartServiceAction()
	{
		return "com.google.android.gms.signin.service.START";
	//    0    0:ldc1            #194 <String "com.google.android.gms.signin.service.START">
	//    1    2:areturn         
	}

	public boolean requiresSignIn()
	{
		return zary;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean zary>
	//    2    4:ireturn         
	}

	public final void zaa(IAccountAccessor iaccountaccessor, boolean flag)
	{
		try
		{
			((zaf)getService()).zaa(iaccountaccessor, zaod.intValue(), flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #203 <Method IInterface getService()>
	//    2    4:checkcast       #161 <Class zaf>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field Integer zaod>
	//    6   12:invokevirtual   #70  <Method int Integer.intValue()>
	//    7   15:iload_2         
	//    8   16:invokeinterface #206 <Method void zaf.zaa(IAccountAccessor, int, boolean)>
			return;
	//    9   21:return          
		}
	//*  10   22:ldc1            #208 <String "SignInClientImpl">
	//*  11   24:ldc1            #210 <String "Remote service probably died when saveDefaultAccount is called">
	//*  12   26:invokestatic    #216 <Method int Log.w(String, String)>
	//*  13   29:pop             
	//*  14   30:return          
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor)
		{
			Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
		}
	//*  15   31:astore_1        
	//*  16   32:goto            22
	}

	public final void zaa(com.google.android.gms.signin.internal.zad zad1)
	{
		Preconditions.checkNotNull(((Object) (zad1)), "Expecting a valid ISignInCallbacks");
	//    0    0:aload_1         
	//    1    1:ldc1            #219 <String "Expecting a valid ISignInCallbacks">
	//    2    3:invokestatic    #225 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Object obj;
		Account account;
		try
		{
			account = zaes.getAccountOrDefault();
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field ClientSettings zaes>
	//    6   11:invokevirtual   #228 <Method Account ClientSettings.getAccountOrDefault()>
	//    7   14:astore_3        
		}
	//*   8   15:aconst_null     
	//*   9   16:astore_2        
	//*  10   17:ldc1            #230 <String "<<default account>>">
	//*  11   19:aload_3         
	//*  12   20:getfield        #236 <Field String Account.name>
	//*  13   23:invokevirtual   #186 <Method boolean String.equals(Object)>
	//*  14   26:ifeq            40
	//*  15   29:aload_0         
	//*  16   30:invokevirtual   #175 <Method Context getContext()>
	//*  17   33:invokestatic    #242 <Method Storage Storage.getInstance(Context)>
	//*  18   36:invokevirtual   #246 <Method com.google.android.gms.auth.api.signin.GoogleSignInAccount Storage.getSavedDefaultGoogleSignInAccount()>
	//*  19   39:astore_2        
	//*  20   40:new             #248 <Class ResolveAccountRequest>
	//*  21   43:dup             
	//*  22   44:aload_3         
	//*  23   45:aload_0         
	//*  24   46:getfield        #35  <Field Integer zaod>
	//*  25   49:invokevirtual   #70  <Method int Integer.intValue()>
	//*  26   52:aload_2         
	//*  27   53:invokespecial   #251 <Method void ResolveAccountRequest(Account, int, com.google.android.gms.auth.api.signin.GoogleSignInAccount)>
	//*  28   56:astore_2        
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #203 <Method IInterface getService()>
	//*  31   61:checkcast       #161 <Class zaf>
	//*  32   64:new             #253 <Class zah>
	//*  33   67:dup             
	//*  34   68:aload_2         
	//*  35   69:invokespecial   #256 <Method void zah(ResolveAccountRequest)>
	//*  36   72:aload_1         
	//*  37   73:invokeinterface #259 <Method void zaf.zaa(zah, com.google.android.gms.signin.internal.zad)>
	//*  38   78:return          
		catch(RemoteException remoteexception)
	//*  39   79:astore_2        
		{
			Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
	//   40   80:ldc1            #208 <String "SignInClientImpl">
	//   41   82:ldc2            #261 <String "Remote service probably died when signIn is called">
	//   42   85:invokestatic    #216 <Method int Log.w(String, String)>
	//   43   88:pop             
			try
			{
				zad1.zab(new zaj(8));
	//   44   89:aload_1         
	//   45   90:new             #263 <Class zaj>
	//   46   93:dup             
	//   47   94:bipush          8
	//   48   96:invokespecial   #266 <Method void zaj(int)>
	//   49   99:invokeinterface #272 <Method void zad.zab(zaj)>
				return;
	//   50  104:return          
			}
	//*  51  105:ldc1            #208 <String "SignInClientImpl">
	//*  52  107:ldc2            #274 <String "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.">
	//*  53  110:aload_2         
	//*  54  111:invokestatic    #278 <Method int Log.wtf(String, String, Throwable)>
	//*  55  114:pop             
	//*  56  115:return          
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.signin.internal.zad zad1)
			{
				Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", ((Throwable) (remoteexception)));
			}
			return;
		}
		obj = null;
		if("<<default account>>".equals(((Object) (account.name))))
			obj = ((Object) (Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount()));
		obj = ((Object) (new ResolveAccountRequest(account, zaod.intValue(), ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) (obj)))));
		((zaf)getService()).zaa(new zah(((ResolveAccountRequest) (obj))), zad1);
		return;
	//*  57  116:astore_1        
	//*  58  117:goto            105
	}

	public final void zacv()
	{
		RemoteException remoteexception;
		try
		{
			((zaf)getService()).zam(zaod.intValue());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #203 <Method IInterface getService()>
	//    2    4:checkcast       #161 <Class zaf>
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Integer zaod>
	//    5   11:invokevirtual   #70  <Method int Integer.intValue()>
	//    6   14:invokeinterface #282 <Method void zaf.zam(int)>
			return;
	//    7   19:return          
		}
	//*   8   20:ldc1            #208 <String "SignInClientImpl">
	//*   9   22:ldc2            #284 <String "Remote service probably died when clearAccountFromSessionStore is called">
	//*  10   25:invokestatic    #216 <Method int Log.w(String, String)>
	//*  11   28:pop             
	//*  12   29:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
		}
	//*  13   30:astore_1        
	//*  14   31:goto            20
	}

	private final ClientSettings zaes;
	private Integer zaod;
	private final boolean zary;
	private final Bundle zarz;
}
