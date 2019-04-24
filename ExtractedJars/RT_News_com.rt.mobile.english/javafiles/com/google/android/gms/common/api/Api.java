// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.*;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;

public final class Api
{
	public static abstract class AbstractClientBuilder extends BaseClientBuilder
	{

		public abstract Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener);

		public AbstractClientBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Api$BaseClientBuilder()>
		//    2    4:return          
		}
	}

	public static interface AnyClient
	{
	}

	public static class AnyClientKey
	{

		public AnyClientKey()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface ApiOptions
	{
	}

	public static interface ApiOptions.HasAccountOptions
		extends ApiOptions.HasOptions, ApiOptions.NotRequiredOptions
	{

		public abstract Account getAccount();
	}

	public static interface ApiOptions.HasGoogleSignInAccountOptions
		extends ApiOptions.HasOptions
	{

		public abstract GoogleSignInAccount getGoogleSignInAccount();
	}

	public static interface ApiOptions.HasOptions
		extends ApiOptions
	{
	}

	public static final class ApiOptions.NoOptions
		implements ApiOptions.NotRequiredOptions
	{

		private ApiOptions.NoOptions()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface ApiOptions.NotRequiredOptions
		extends ApiOptions
	{
	}

	public static interface ApiOptions.Optional
		extends ApiOptions.HasOptions, ApiOptions.NotRequiredOptions
	{
	}

	public static class BaseClientBuilder
	{

		public List getImpliedScopes(Object obj)
		{
			return Collections.emptyList();
		//    0    0:invokestatic    #30  <Method List Collections.emptyList()>
		//    1    3:areturn         
		}

		public int getPriority()
		{
			return 0x7fffffff;
		//    0    0:ldc1            #15  <Int 0x7fffffff>
		//    1    2:ireturn         
		}

		public static final int API_PRIORITY_GAMES = 1;
		public static final int API_PRIORITY_OTHER = 0x7fffffff;
		public static final int API_PRIORITY_PLUS = 2;

		public BaseClientBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface Client
		extends AnyClient
	{

		public abstract void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks);

		public abstract void disconnect();

		public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

		public abstract Feature[] getAvailableFeatures();

		public abstract String getEndpointPackageName();

		public abstract int getMinApkVersion();

		public abstract void getRemoteService(IAccountAccessor iaccountaccessor, Set set);

		public abstract IBinder getServiceBrokerBinder();

		public abstract Intent getSignInIntent();

		public abstract boolean isConnected();

		public abstract boolean isConnecting();

		public abstract void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signoutcallbacks);

		public abstract boolean providesSignIn();

		public abstract boolean requiresGooglePlayServices();

		public abstract boolean requiresSignIn();
	}

	public static final class ClientKey extends AnyClientKey
	{

		public ClientKey()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Api$AnyClientKey()>
		//    2    4:return          
		}
	}

	public static interface SimpleClient
		extends AnyClient
	{

		public abstract IInterface createServiceInterface(IBinder ibinder);

		public abstract String getServiceDescriptor();

		public abstract String getStartServiceAction();

		public abstract void setState(int i, IInterface iinterface);
	}

	public static class zza extends BaseClientBuilder
	{
	}

	public static final class zzb extends AnyClientKey
	{
	}


	public Api(String s, AbstractClientBuilder abstractclientbuilder, ClientKey clientkey)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
		Preconditions.checkNotNull(((Object) (abstractclientbuilder)), "Cannot construct an Api with a null ClientBuilder");
	//    2    4:aload_2         
	//    3    5:ldc1            #74  <String "Cannot construct an Api with a null ClientBuilder">
	//    4    7:invokestatic    #80  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkNotNull(((Object) (clientkey)), "Cannot construct an Api with a null ClientKey");
	//    6   11:aload_3         
	//    7   12:ldc1            #82  <String "Cannot construct an Api with a null ClientKey">
	//    8   14:invokestatic    #80  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   17:pop             
		mName = s;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #84  <Field String mName>
		zzby = abstractclientbuilder;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #86  <Field Api$AbstractClientBuilder zzby>
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #88  <Field Api$zza zzbz>
		zzca = clientkey;
	//   19   33:aload_0         
	//   20   34:aload_3         
	//   21   35:putfield        #90  <Field Api$ClientKey zzca>
	//   22   38:aload_0         
	//   23   39:aconst_null     
	//   24   40:putfield        #92  <Field Api$zzb zzcb>
	//   25   43:return          
	}

	public final AnyClientKey getClientKey()
	{
		if(zzca != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field Api$ClientKey zzca>
	//*   2    4:ifnull          12
			return ((AnyClientKey) (zzca));
	//    3    7:aload_0         
	//    4    8:getfield        #90  <Field Api$ClientKey zzca>
	//    5   11:areturn         
		else
			throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
	//    6   12:new             #99  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #101 <String "This API was constructed with null client keys. This should not be possible.">
	//    9   18:invokespecial   #104 <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public final String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String mName>
	//    2    4:areturn         
	}

	public final BaseClientBuilder zzj()
	{
		return ((BaseClientBuilder) (zzby));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Api$AbstractClientBuilder zzby>
	//    2    4:areturn         
	}

	public final AbstractClientBuilder zzk()
	{
		boolean flag;
		if(zzby != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Api$AbstractClientBuilder zzby>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Preconditions.checkState(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
	//    8   14:iload_1         
	//    9   15:ldc1            #114 <String "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder">
	//   10   17:invokestatic    #118 <Method void Preconditions.checkState(boolean, Object)>
		return zzby;
	//   11   20:aload_0         
	//   12   21:getfield        #86  <Field Api$AbstractClientBuilder zzby>
	//   13   24:areturn         
	}

	private final String mName;
	private final AbstractClientBuilder zzby;
	private final zza zzbz = null;
	private final ClientKey zzca;
	private final zzb zzcb = null;
}
