// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.service.api.job.ApiJobFactory;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.api.call.ApiCallFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal:
//			PayPalConnectCollaborators, PayPalConnectModule, PayPalConnectPresenter

public final class PayPalConnectModule_ProvideMvpPresenterFactory
	implements Factory
{

	public PayPalConnectModule_ProvideMvpPresenterFactory(PayPalConnectModule paypalconnectmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		module = paypalconnectmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field PayPalConnectModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Provider mvpPresenterActionsProvider>
		appConfigProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field Provider appConfigProvider>
		apiCallFactoryProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field Provider apiCallFactoryProvider>
		apiJobFactoryProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #37  <Field Provider apiJobFactoryProvider>
		collaboratorsProvider = provider4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #39  <Field Provider collaboratorsProvider>
		cacheClearFactoryProvider = provider5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #41  <Field Provider cacheClearFactoryProvider>
	//   23   43:return          
	}

	public static PayPalConnectModule_ProvideMvpPresenterFactory create(PayPalConnectModule paypalconnectmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
		return new PayPalConnectModule_ProvideMvpPresenterFactory(paypalconnectmodule, provider, provider1, provider2, provider3, provider4, provider5);
	//    0    0:new             #2   <Class PayPalConnectModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:invokespecial   #48  <Method void PayPalConnectModule_ProvideMvpPresenterFactory(PayPalConnectModule, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   10   17:areturn         
	}

	public static PayPalConnectPresenter provideInstance(PayPalConnectModule paypalconnectmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
		return proxyProvideMvpPresenter(paypalconnectmodule, (MvpPresenterActions)provider.get(), (AppConfig)provider1.get(), (ApiCallFactory)provider2.get(), (ApiJobFactory)provider3.get(), (PayPalConnectCollaborators)provider4.get(), (CacheClearJobFactory)provider5.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #57  <Method Object Provider.get()>
	//    3    7:checkcast       #59  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #57  <Method Object Provider.get()>
	//    6   16:checkcast       #61  <Class AppConfig>
	//    7   19:aload_3         
	//    8   20:invokeinterface #57  <Method Object Provider.get()>
	//    9   25:checkcast       #63  <Class ApiCallFactory>
	//   10   28:aload           4
	//   11   30:invokeinterface #57  <Method Object Provider.get()>
	//   12   35:checkcast       #65  <Class ApiJobFactory>
	//   13   38:aload           5
	//   14   40:invokeinterface #57  <Method Object Provider.get()>
	//   15   45:checkcast       #67  <Class PayPalConnectCollaborators>
	//   16   48:aload           6
	//   17   50:invokeinterface #57  <Method Object Provider.get()>
	//   18   55:checkcast       #69  <Class CacheClearJobFactory>
	//   19   58:invokestatic    #73  <Method PayPalConnectPresenter proxyProvideMvpPresenter(PayPalConnectModule, MvpPresenterActions, AppConfig, ApiCallFactory, ApiJobFactory, PayPalConnectCollaborators, CacheClearJobFactory)>
	//   20   61:areturn         
	}

	public static PayPalConnectPresenter proxyProvideMvpPresenter(PayPalConnectModule paypalconnectmodule, MvpPresenterActions mvppresenteractions, AppConfig appconfig, ApiCallFactory apicallfactory, ApiJobFactory apijobfactory, PayPalConnectCollaborators paypalconnectcollaborators, CacheClearJobFactory cacheclearjobfactory)
	{
		return (PayPalConnectPresenter)Preconditions.checkNotNull(((Object) (paypalconnectmodule.provideMvpPresenter(mvppresenteractions, appconfig, apicallfactory, apijobfactory, paypalconnectcollaborators, cacheclearjobfactory))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokevirtual   #80  <Method PayPalConnectPresenter PayPalConnectModule.provideMvpPresenter(MvpPresenterActions, AppConfig, ApiCallFactory, ApiJobFactory, PayPalConnectCollaborators, CacheClearJobFactory)>
	//    8   13:ldc1            #82  <String "Cannot return null from a non-@Nullable @Provides method">
	//    9   15:invokestatic    #88  <Method Object Preconditions.checkNotNull(Object, String)>
	//   10   18:checkcast       #90  <Class PayPalConnectPresenter>
	//   11   21:areturn         
	}

	public PayPalConnectPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, appConfigProvider, apiCallFactoryProvider, apiJobFactoryProvider, collaboratorsProvider, cacheClearFactoryProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field PayPalConnectModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field Provider appConfigProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Provider apiCallFactoryProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Provider apiJobFactoryProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field Provider collaboratorsProvider>
	//   12   24:aload_0         
	//   13   25:getfield        #41  <Field Provider cacheClearFactoryProvider>
	//   14   28:invokestatic    #93  <Method PayPalConnectPresenter provideInstance(PayPalConnectModule, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   15   31:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method PayPalConnectPresenter get()>
	//    2    4:areturn         
	}

	private final Provider apiCallFactoryProvider;
	private final Provider apiJobFactoryProvider;
	private final Provider appConfigProvider;
	private final Provider cacheClearFactoryProvider;
	private final Provider collaboratorsProvider;
	private final PayPalConnectModule module;
	private final Provider mvpPresenterActionsProvider;
}
