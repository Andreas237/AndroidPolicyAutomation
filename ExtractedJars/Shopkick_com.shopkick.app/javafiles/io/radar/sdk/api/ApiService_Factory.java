// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.content.Context;
import io.radar.sdk.config.ConfigRepository;
import io.radar.sdk.internal.repository.IdentityRepository;
import io.radar.sdk.internal.repository.OptionsRepository;
import io.radar.sdk.util.DeviceHelper;
import io.radar.sdk.util.IntegrationHelper;
import io.radar.shadow.dagger.internal.Factory;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.sdk.api:
//			ApiService, ApiClientRepository

public final class ApiService_Factory
	implements Factory
{

	public ApiService_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		contextProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Provider contextProvider>
		identityRepositoryProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Provider identityRepositoryProvider>
		optionsRepositoryProvider = provider2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field Provider optionsRepositoryProvider>
		apiRepositoryProvider = provider3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field Provider apiRepositoryProvider>
		configRepositoryProvider = provider4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #37  <Field Provider configRepositoryProvider>
		integrationHelperProvider = provider5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #39  <Field Provider integrationHelperProvider>
		deviceHelperProvider = provider6;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #41  <Field Provider deviceHelperProvider>
	//   23   43:return          
	}

	public static ApiService_Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
	{
		return new ApiService_Factory(provider, provider1, provider2, provider3, provider4, provider5, provider6);
	//    0    0:new             #2   <Class ApiService_Factory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:invokespecial   #48  <Method void ApiService_Factory(Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   10   17:areturn         
	}

	public static ApiService newApiService(Context context, IdentityRepository identityrepository, OptionsRepository optionsrepository, ApiClientRepository apiclientrepository, ConfigRepository configrepository, IntegrationHelper integrationhelper, DeviceHelper devicehelper)
	{
		return new ApiService(context, identityrepository, optionsrepository, apiclientrepository, configrepository, integrationhelper, devicehelper);
	//    0    0:new             #53  <Class ApiService>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:invokespecial   #56  <Method void ApiService(Context, IdentityRepository, OptionsRepository, ApiClientRepository, ConfigRepository, IntegrationHelper, DeviceHelper)>
	//   10   17:areturn         
	}

	public static ApiService provideInstance(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
	{
		return new ApiService((Context)provider.get(), (IdentityRepository)provider1.get(), (OptionsRepository)provider2.get(), (ApiClientRepository)provider3.get(), (ConfigRepository)provider4.get(), (IntegrationHelper)provider5.get(), (DeviceHelper)provider6.get());
	//    0    0:new             #53  <Class ApiService>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #64  <Method Object Provider.get()>
	//    4   10:checkcast       #66  <Class Context>
	//    5   13:aload_1         
	//    6   14:invokeinterface #64  <Method Object Provider.get()>
	//    7   19:checkcast       #68  <Class IdentityRepository>
	//    8   22:aload_2         
	//    9   23:invokeinterface #64  <Method Object Provider.get()>
	//   10   28:checkcast       #70  <Class OptionsRepository>
	//   11   31:aload_3         
	//   12   32:invokeinterface #64  <Method Object Provider.get()>
	//   13   37:checkcast       #72  <Class ApiClientRepository>
	//   14   40:aload           4
	//   15   42:invokeinterface #64  <Method Object Provider.get()>
	//   16   47:checkcast       #74  <Class ConfigRepository>
	//   17   50:aload           5
	//   18   52:invokeinterface #64  <Method Object Provider.get()>
	//   19   57:checkcast       #76  <Class IntegrationHelper>
	//   20   60:aload           6
	//   21   62:invokeinterface #64  <Method Object Provider.get()>
	//   22   67:checkcast       #78  <Class DeviceHelper>
	//   23   70:invokespecial   #56  <Method void ApiService(Context, IdentityRepository, OptionsRepository, ApiClientRepository, ConfigRepository, IntegrationHelper, DeviceHelper)>
	//   24   73:areturn         
	}

	public ApiService get()
	{
		return provideInstance(contextProvider, identityRepositoryProvider, optionsRepositoryProvider, apiRepositoryProvider, configRepositoryProvider, integrationHelperProvider, deviceHelperProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Provider contextProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Provider identityRepositoryProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field Provider optionsRepositoryProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Provider apiRepositoryProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Provider configRepositoryProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field Provider integrationHelperProvider>
	//   12   24:aload_0         
	//   13   25:getfield        #41  <Field Provider deviceHelperProvider>
	//   14   28:invokestatic    #82  <Method ApiService provideInstance(Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   15   31:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method ApiService get()>
	//    2    4:areturn         
	}

	private final Provider apiRepositoryProvider;
	private final Provider configRepositoryProvider;
	private final Provider contextProvider;
	private final Provider deviceHelperProvider;
	private final Provider identityRepositoryProvider;
	private final Provider integrationHelperProvider;
	private final Provider optionsRepositoryProvider;
}
