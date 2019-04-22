// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient, GmsClientSupervisor, Preconditions, ClientSettings, 
//			zzf, zzg

public abstract class GmsClient extends BaseGmsClient
	implements com.google.android.gms.common.api.Api.Client, GmsClientEventManager.GmsClientEventState
{

	protected GmsClient(Context context, Handler handler, int i, ClientSettings clientsettings)
	{
		this(context, handler, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientsettings, ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (null)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokestatic    #25  <Method GmsClientSupervisor GmsClientSupervisor.getInstance(Context)>
	//    5    7:invokestatic    #30  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:aconst_null     
	//   10   15:invokespecial   #33  <Method void GmsClient(Context, Handler, GmsClientSupervisor, GoogleApiAvailability, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   11   18:return          
	}

	protected GmsClient(Context context, Handler handler, GmsClientSupervisor gmsclientsupervisor, GoogleApiAvailability googleapiavailability, int i, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
			com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, handler, gmsclientsupervisor, ((com.google.android.gms.common.GoogleApiAvailabilityLight) (googleapiavailability)), i, zza(connectioncallbacks), zza(onconnectionfailedlistener));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           7
	//    7   10:invokestatic    #39  <Method BaseGmsClient$BaseConnectionCallbacks zza(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    8   13:aload           8
	//    9   15:invokestatic    #42  <Method BaseGmsClient$BaseOnConnectionFailedListener zza(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   10   18:invokespecial   #45  <Method void BaseGmsClient(Context, Handler, GmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight, int, BaseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener)>
		zzgf = (ClientSettings)Preconditions.checkNotNull(((Object) (clientsettings)));
	//   11   21:aload_0         
	//   12   22:aload           6
	//   13   24:invokestatic    #51  <Method Object Preconditions.checkNotNull(Object)>
	//   14   27:checkcast       #53  <Class ClientSettings>
	//   15   30:putfield        #55  <Field ClientSettings zzgf>
		zzs = clientsettings.getAccount();
	//   16   33:aload_0         
	//   17   34:aload           6
	//   18   36:invokevirtual   #59  <Method Account ClientSettings.getAccount()>
	//   19   39:putfield        #61  <Field Account zzs>
		mScopes = zza(clientsettings.getAllRequestedScopes());
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:aload           6
	//   23   46:invokevirtual   #65  <Method Set ClientSettings.getAllRequestedScopes()>
	//   24   49:invokespecial   #68  <Method Set zza(Set)>
	//   25   52:putfield        #70  <Field Set mScopes>
	//   26   55:return          
	}

	protected GmsClient(Context context, Looper looper, int i, ClientSettings clientsettings)
	{
		this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientsettings, ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) (null)), ((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokestatic    #25  <Method GmsClientSupervisor GmsClientSupervisor.getInstance(Context)>
	//    5    7:invokestatic    #30  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:aconst_null     
	//   10   15:invokespecial   #74  <Method void GmsClient(Context, Looper, GmsClientSupervisor, GoogleApiAvailability, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   11   18:return          
	}

	protected GmsClient(Context context, Looper looper, int i, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientsettings, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)Preconditions.checkNotNull(((Object) (connectioncallbacks))), (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)Preconditions.checkNotNull(((Object) (onconnectionfailedlistener))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokestatic    #25  <Method GmsClientSupervisor GmsClientSupervisor.getInstance(Context)>
	//    5    7:invokestatic    #30  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:invokestatic    #51  <Method Object Preconditions.checkNotNull(Object)>
	//   10   18:checkcast       #77  <Class com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks>
	//   11   21:aload           6
	//   12   23:invokestatic    #51  <Method Object Preconditions.checkNotNull(Object)>
	//   13   26:checkcast       #79  <Class com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener>
	//   14   29:invokespecial   #74  <Method void GmsClient(Context, Looper, GmsClientSupervisor, GoogleApiAvailability, int, ClientSettings, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   15   32:return          
	}

	protected GmsClient(Context context, Looper looper, GmsClientSupervisor gmsclientsupervisor, GoogleApiAvailability googleapiavailability, int i, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
			com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		super(context, looper, gmsclientsupervisor, ((com.google.android.gms.common.GoogleApiAvailabilityLight) (googleapiavailability)), i, zza(connectioncallbacks), zza(onconnectionfailedlistener), clientsettings.getRealClientClassName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           7
	//    7   10:invokestatic    #39  <Method BaseGmsClient$BaseConnectionCallbacks zza(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    8   13:aload           8
	//    9   15:invokestatic    #42  <Method BaseGmsClient$BaseOnConnectionFailedListener zza(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   10   18:aload           6
	//   11   20:invokevirtual   #83  <Method String ClientSettings.getRealClientClassName()>
	//   12   23:invokespecial   #86  <Method void BaseGmsClient(Context, Looper, GmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight, int, BaseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener, String)>
		zzgf = clientsettings;
	//   13   26:aload_0         
	//   14   27:aload           6
	//   15   29:putfield        #55  <Field ClientSettings zzgf>
		zzs = clientsettings.getAccount();
	//   16   32:aload_0         
	//   17   33:aload           6
	//   18   35:invokevirtual   #59  <Method Account ClientSettings.getAccount()>
	//   19   38:putfield        #61  <Field Account zzs>
		mScopes = zza(clientsettings.getAllRequestedScopes());
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:aload           6
	//   23   45:invokevirtual   #65  <Method Set ClientSettings.getAllRequestedScopes()>
	//   24   48:invokespecial   #68  <Method Set zza(Set)>
	//   25   51:putfield        #70  <Field Set mScopes>
	//   26   54:return          
	}

	private static BaseGmsClient.BaseConnectionCallbacks zza(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		if(connectioncallbacks == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((BaseGmsClient.BaseConnectionCallbacks) (new zzf(connectioncallbacks)));
	//    4    6:new             #89  <Class zzf>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #92  <Method void zzf(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks)>
	//    8   14:areturn         
	}

	private static BaseGmsClient.BaseOnConnectionFailedListener zza(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		if(onconnectionfailedlistener == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((BaseGmsClient.BaseOnConnectionFailedListener) (new zzg(onconnectionfailedlistener)));
	//    4    6:new             #94  <Class zzg>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #97  <Method void zzg(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   14:areturn         
	}

	private final Set zza(Set set)
	{
		Set set1 = validateScopes(set);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method Set validateScopes(Set)>
	//    3    5:astore_2        
		for(Iterator iterator = set1.iterator(); iterator.hasNext();)
	//*   4    6:aload_2         
	//*   5    7:invokeinterface #107 <Method Iterator Set.iterator()>
	//*   6   12:astore_3        
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            53
			if(!set.contains(((Object) ((Scope)iterator.next()))))
	//*  10   22:aload_1         
	//*  11   23:aload_3         
	//*  12   24:invokeinterface #117 <Method Object Iterator.next()>
	//*  13   29:checkcast       #119 <Class Scope>
	//*  14   32:invokeinterface #123 <Method boolean Set.contains(Object)>
	//*  15   37:ifeq            43
	//*  16   40:goto            13
				throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
	//   17   43:new             #125 <Class IllegalStateException>
	//   18   46:dup             
	//   19   47:ldc1            #127 <String "Expanding scopes is not permitted, use implied scopes instead">
	//   20   49:invokespecial   #130 <Method void IllegalStateException(String)>
	//   21   52:athrow          

		return set1;
	//   22   53:aload_2         
	//   23   54:areturn         
	}

	public final Account getAccount()
	{
		return zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Account zzs>
	//    2    4:areturn         
	}

	protected final ClientSettings getClientSettings()
	{
		return zzgf;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ClientSettings zzgf>
	//    2    4:areturn         
	}

	public int getMinApkVersion()
	{
		return super.getMinApkVersion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method int BaseGmsClient.getMinApkVersion()>
	//    2    4:ireturn         
	}

	public Feature[] getRequiredFeatures()
	{
		return new Feature[0];
	//    0    0:iconst_0        
	//    1    1:anewarray       Feature[]
	//    2    4:areturn         
	}

	protected final Set getScopes()
	{
		return mScopes;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Set mScopes>
	//    2    4:areturn         
	}

	protected Set validateScopes(Set set)
	{
		return set;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	private final Set mScopes;
	private final ClientSettings zzgf;
	private final Account zzs;
}
