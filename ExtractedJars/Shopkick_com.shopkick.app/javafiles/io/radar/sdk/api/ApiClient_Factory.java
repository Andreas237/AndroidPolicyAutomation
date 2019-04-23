// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.content.Context;
import io.radar.sdk.internal.repository.IdentityRepository;
import io.radar.sdk.internal.repository.OptionsRepository;
import io.radar.shadow.dagger.internal.Factory;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.sdk.api:
//			ApiClient, ApiClientRepository, ApiService

public final class ApiClient_Factory
	implements Factory
{

	public ApiClient_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		contextProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Provider contextProvider>
		identityRepositoryProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Provider identityRepositoryProvider>
		optionsRepositoryProvider = provider2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Provider optionsRepositoryProvider>
		repositoryProvider = provider3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field Provider repositoryProvider>
		apiServiceProvider = provider4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field Provider apiServiceProvider>
	//   17   31:return          
	}

	public static ApiClient_Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
		return new ApiClient_Factory(provider, provider1, provider2, provider3, provider4);
	//    0    0:new             #2   <Class ApiClient_Factory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #40  <Method void ApiClient_Factory(Provider, Provider, Provider, Provider, Provider)>
	//    8   13:areturn         
	}

	public static ApiClient newApiClient(Context context, IdentityRepository identityrepository, OptionsRepository optionsrepository, ApiClientRepository apiclientrepository, ApiService apiservice)
	{
		return new ApiClient(context, identityrepository, optionsrepository, apiclientrepository, apiservice);
	//    0    0:new             #45  <Class ApiClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #48  <Method void ApiClient(Context, IdentityRepository, OptionsRepository, ApiClientRepository, ApiService)>
	//    8   13:areturn         
	}

	public static ApiClient provideInstance(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
		return new ApiClient((Context)provider.get(), (IdentityRepository)provider1.get(), (OptionsRepository)provider2.get(), (ApiClientRepository)provider3.get(), (ApiService)provider4.get());
	//    0    0:new             #45  <Class ApiClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #56  <Method Object Provider.get()>
	//    4   10:checkcast       #58  <Class Context>
	//    5   13:aload_1         
	//    6   14:invokeinterface #56  <Method Object Provider.get()>
	//    7   19:checkcast       #60  <Class IdentityRepository>
	//    8   22:aload_2         
	//    9   23:invokeinterface #56  <Method Object Provider.get()>
	//   10   28:checkcast       #62  <Class OptionsRepository>
	//   11   31:aload_3         
	//   12   32:invokeinterface #56  <Method Object Provider.get()>
	//   13   37:checkcast       #64  <Class ApiClientRepository>
	//   14   40:aload           4
	//   15   42:invokeinterface #56  <Method Object Provider.get()>
	//   16   47:checkcast       #66  <Class ApiService>
	//   17   50:invokespecial   #48  <Method void ApiClient(Context, IdentityRepository, OptionsRepository, ApiClientRepository, ApiService)>
	//   18   53:areturn         
	}

	public ApiClient get()
	{
		return provideInstance(contextProvider, identityRepositoryProvider, optionsRepositoryProvider, repositoryProvider, apiServiceProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Provider contextProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Provider identityRepositoryProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Provider optionsRepositoryProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field Provider repositoryProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field Provider apiServiceProvider>
	//   10   20:invokestatic    #70  <Method ApiClient provideInstance(Provider, Provider, Provider, Provider, Provider)>
	//   11   23:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method ApiClient get()>
	//    2    4:areturn         
	}

	private final Provider apiServiceProvider;
	private final Provider contextProvider;
	private final Provider identityRepositoryProvider;
	private final Provider optionsRepositoryProvider;
	private final Provider repositoryProvider;
}
