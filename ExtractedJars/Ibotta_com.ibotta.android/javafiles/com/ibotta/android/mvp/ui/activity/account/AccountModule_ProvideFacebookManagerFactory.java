// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.api.auth.PostAuthWorkJobFactory;
import com.ibotta.android.security.DeviceSecurity;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.social.facebook.FacebookManager;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.api.call.ApiCallFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountModule

public final class AccountModule_ProvideFacebookManagerFactory
	implements Factory
{

	public AccountModule_ProvideFacebookManagerFactory(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
			Provider provider6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		module = accountmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field AccountModule module>
		deviceSecurityProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field Provider deviceSecurityProvider>
		postAuthWorkJobFactoryProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field Provider postAuthWorkJobFactoryProvider>
		apiCallFactoryProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #37  <Field Provider apiCallFactoryProvider>
		apiWorkSubmitterProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #39  <Field Provider apiWorkSubmitterProvider>
		userStateProvider = provider4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #41  <Field Provider userStateProvider>
		authManagerProvider = provider5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #43  <Field Provider authManagerProvider>
		cacheClearFactoryProvider = provider6;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #45  <Field Provider cacheClearFactoryProvider>
	//   26   49:return          
	}

	public static AccountModule_ProvideFacebookManagerFactory create(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
	{
		return new AccountModule_ProvideFacebookManagerFactory(accountmodule, provider, provider1, provider2, provider3, provider4, provider5, provider6);
	//    0    0:new             #2   <Class AccountModule_ProvideFacebookManagerFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:invokespecial   #52  <Method void AccountModule_ProvideFacebookManagerFactory(AccountModule, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   11   19:areturn         
	}

	public static FacebookManager provideInstance(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
	{
		return proxyProvideFacebookManager(accountmodule, (DeviceSecurity)provider.get(), (PostAuthWorkJobFactory)provider1.get(), (ApiCallFactory)provider2.get(), (ApiWorkSubmitter)provider3.get(), (UserState)provider4.get(), (AuthManager)provider5.get(), (CacheClearJobFactory)provider6.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #61  <Method Object Provider.get()>
	//    3    7:checkcast       #63  <Class DeviceSecurity>
	//    4   10:aload_2         
	//    5   11:invokeinterface #61  <Method Object Provider.get()>
	//    6   16:checkcast       #65  <Class PostAuthWorkJobFactory>
	//    7   19:aload_3         
	//    8   20:invokeinterface #61  <Method Object Provider.get()>
	//    9   25:checkcast       #67  <Class ApiCallFactory>
	//   10   28:aload           4
	//   11   30:invokeinterface #61  <Method Object Provider.get()>
	//   12   35:checkcast       #69  <Class ApiWorkSubmitter>
	//   13   38:aload           5
	//   14   40:invokeinterface #61  <Method Object Provider.get()>
	//   15   45:checkcast       #71  <Class UserState>
	//   16   48:aload           6
	//   17   50:invokeinterface #61  <Method Object Provider.get()>
	//   18   55:checkcast       #73  <Class AuthManager>
	//   19   58:aload           7
	//   20   60:invokeinterface #61  <Method Object Provider.get()>
	//   21   65:checkcast       #75  <Class CacheClearJobFactory>
	//   22   68:invokestatic    #79  <Method FacebookManager proxyProvideFacebookManager(AccountModule, DeviceSecurity, PostAuthWorkJobFactory, ApiCallFactory, ApiWorkSubmitter, UserState, AuthManager, CacheClearJobFactory)>
	//   23   71:areturn         
	}

	public static FacebookManager proxyProvideFacebookManager(AccountModule accountmodule, DeviceSecurity devicesecurity, PostAuthWorkJobFactory postauthworkjobfactory, ApiCallFactory apicallfactory, ApiWorkSubmitter apiworksubmitter, UserState userstate, AuthManager authmanager, CacheClearJobFactory cacheclearjobfactory)
	{
		return (FacebookManager)Preconditions.checkNotNull(((Object) (accountmodule.provideFacebookManager(devicesecurity, postauthworkjobfactory, apicallfactory, apiworksubmitter, userstate, authmanager, cacheclearjobfactory))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokevirtual   #86  <Method FacebookManager AccountModule.provideFacebookManager(DeviceSecurity, PostAuthWorkJobFactory, ApiCallFactory, ApiWorkSubmitter, UserState, AuthManager, CacheClearJobFactory)>
	//    9   15:ldc1            #88  <String "Cannot return null from a non-@Nullable @Provides method">
	//   10   17:invokestatic    #94  <Method Object Preconditions.checkNotNull(Object, String)>
	//   11   20:checkcast       #96  <Class FacebookManager>
	//   12   23:areturn         
	}

	public FacebookManager get()
	{
		return provideInstance(module, deviceSecurityProvider, postAuthWorkJobFactoryProvider, apiCallFactoryProvider, apiWorkSubmitterProvider, userStateProvider, authManagerProvider, cacheClearFactoryProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AccountModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field Provider deviceSecurityProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field Provider postAuthWorkJobFactoryProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field Provider apiCallFactoryProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field Provider apiWorkSubmitterProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field Provider userStateProvider>
	//   12   24:aload_0         
	//   13   25:getfield        #43  <Field Provider authManagerProvider>
	//   14   28:aload_0         
	//   15   29:getfield        #45  <Field Provider cacheClearFactoryProvider>
	//   16   32:invokestatic    #99  <Method FacebookManager provideInstance(AccountModule, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   17   35:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method FacebookManager get()>
	//    2    4:areturn         
	}

	private final Provider apiCallFactoryProvider;
	private final Provider apiWorkSubmitterProvider;
	private final Provider authManagerProvider;
	private final Provider cacheClearFactoryProvider;
	private final Provider deviceSecurityProvider;
	private final AccountModule module;
	private final Provider postAuthWorkJobFactoryProvider;
	private final Provider userStateProvider;
}
