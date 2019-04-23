// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import android.content.Context;
import io.radar.sdk.api.ApiClient;
import io.radar.sdk.internal.repository.IdentityRepository;
import io.radar.sdk.internal.repository.OptionsRepository;
import io.radar.sdk.location.LocationManager;
import io.radar.sdk.state.StateManager;
import io.radar.shadow.dagger.MembersInjector;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.sdk:
//			Radar

public final class Radar_MembersInjector
	implements MembersInjector
{

	public Radar_MembersInjector(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		contextProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Provider contextProvider>
		optionsRepositoryProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Provider optionsRepositoryProvider>
		identityRepositoryProvider = provider2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field Provider identityRepositoryProvider>
		stateManagerProvider = provider3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field Provider stateManagerProvider>
		locationManagerProvider = provider4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #35  <Field Provider locationManagerProvider>
		apiClientProvider = provider5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #37  <Field Provider apiClientProvider>
	//   20   37:return          
	}

	public static MembersInjector create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
		return ((MembersInjector) (new Radar_MembersInjector(provider, provider1, provider2, provider3, provider4, provider5)));
	//    0    0:new             #2   <Class Radar_MembersInjector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #44  <Method void Radar_MembersInjector(Provider, Provider, Provider, Provider, Provider, Provider)>
	//    9   15:areturn         
	}

	public static void injectInit$sdk_release(Radar radar, Context context, OptionsRepository optionsrepository, IdentityRepository identityrepository, StateManager statemanager, LocationManager locationmanager, ApiClient apiclient)
	{
		radar.init$sdk_release(context, optionsrepository, identityrepository, statemanager, locationmanager, apiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokevirtual   #53  <Method void Radar.init$sdk_release(Context, OptionsRepository, IdentityRepository, StateManager, LocationManager, ApiClient)>
	//    8   13:return          
	}

	public void injectMembers(Radar radar)
	{
		injectInit$sdk_release(radar, (Context)contextProvider.get(), (OptionsRepository)optionsRepositoryProvider.get(), (IdentityRepository)identityRepositoryProvider.get(), (StateManager)stateManagerProvider.get(), (LocationManager)locationManagerProvider.get(), (ApiClient)apiClientProvider.get());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field Provider contextProvider>
	//    3    5:invokeinterface #61  <Method Object Provider.get()>
	//    4   10:checkcast       #63  <Class Context>
	//    5   13:aload_0         
	//    6   14:getfield        #29  <Field Provider optionsRepositoryProvider>
	//    7   17:invokeinterface #61  <Method Object Provider.get()>
	//    8   22:checkcast       #65  <Class OptionsRepository>
	//    9   25:aload_0         
	//   10   26:getfield        #31  <Field Provider identityRepositoryProvider>
	//   11   29:invokeinterface #61  <Method Object Provider.get()>
	//   12   34:checkcast       #67  <Class IdentityRepository>
	//   13   37:aload_0         
	//   14   38:getfield        #33  <Field Provider stateManagerProvider>
	//   15   41:invokeinterface #61  <Method Object Provider.get()>
	//   16   46:checkcast       #69  <Class StateManager>
	//   17   49:aload_0         
	//   18   50:getfield        #35  <Field Provider locationManagerProvider>
	//   19   53:invokeinterface #61  <Method Object Provider.get()>
	//   20   58:checkcast       #71  <Class LocationManager>
	//   21   61:aload_0         
	//   22   62:getfield        #37  <Field Provider apiClientProvider>
	//   23   65:invokeinterface #61  <Method Object Provider.get()>
	//   24   70:checkcast       #73  <Class ApiClient>
	//   25   73:invokestatic    #75  <Method void injectInit$sdk_release(Radar, Context, OptionsRepository, IdentityRepository, StateManager, LocationManager, ApiClient)>
	//   26   76:return          
	}

	public volatile void injectMembers(Object obj)
	{
		injectMembers((Radar)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #49  <Class Radar>
	//    3    5:invokevirtual   #78  <Method void injectMembers(Radar)>
	//    4    8:return          
	}

	private final Provider apiClientProvider;
	private final Provider contextProvider;
	private final Provider identityRepositoryProvider;
	private final Provider locationManagerProvider;
	private final Provider optionsRepositoryProvider;
	private final Provider stateManagerProvider;
}
