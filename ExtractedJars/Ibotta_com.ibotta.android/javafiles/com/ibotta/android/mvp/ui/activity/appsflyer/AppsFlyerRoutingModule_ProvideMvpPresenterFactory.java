// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.appsflyer;

import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.state.app.pojo.AppsFlyerState;
import com.ibotta.android.state.user.auth.AuthManager;
import com.ibotta.android.util.AppHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.appsflyer:
//			AppsFlyerRoutingModule, AppsFlyerRoutingPresenter

public final class AppsFlyerRoutingModule_ProvideMvpPresenterFactory
	implements Factory
{

	public AppsFlyerRoutingModule_ProvideMvpPresenterFactory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mvpPresenterActionsProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Provider mvpPresenterActionsProvider>
		appHelperProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Provider appHelperProvider>
		authManagerProvider = provider2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Provider authManagerProvider>
		appsFlyerStateProvider = provider3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field Provider appsFlyerStateProvider>
	//   14   25:return          
	}

	public static AppsFlyerRoutingModule_ProvideMvpPresenterFactory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
	{
		return new AppsFlyerRoutingModule_ProvideMvpPresenterFactory(provider, provider1, provider2, provider3);
	//    0    0:new             #2   <Class AppsFlyerRoutingModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #36  <Method void AppsFlyerRoutingModule_ProvideMvpPresenterFactory(Provider, Provider, Provider, Provider)>
	//    7   11:areturn         
	}

	public static AppsFlyerRoutingPresenter provideInstance(Provider provider, Provider provider1, Provider provider2, Provider provider3)
	{
		return proxyProvideMvpPresenter((MvpPresenterActions)provider.get(), (AppHelper)provider1.get(), (AuthManager)provider2.get(), (AppsFlyerState)provider3.get());
	//    0    0:aload_0         
	//    1    1:invokeinterface #45  <Method Object Provider.get()>
	//    2    6:checkcast       #47  <Class MvpPresenterActions>
	//    3    9:aload_1         
	//    4   10:invokeinterface #45  <Method Object Provider.get()>
	//    5   15:checkcast       #49  <Class AppHelper>
	//    6   18:aload_2         
	//    7   19:invokeinterface #45  <Method Object Provider.get()>
	//    8   24:checkcast       #51  <Class AuthManager>
	//    9   27:aload_3         
	//   10   28:invokeinterface #45  <Method Object Provider.get()>
	//   11   33:checkcast       #53  <Class AppsFlyerState>
	//   12   36:invokestatic    #57  <Method AppsFlyerRoutingPresenter proxyProvideMvpPresenter(MvpPresenterActions, AppHelper, AuthManager, AppsFlyerState)>
	//   13   39:areturn         
	}

	public static AppsFlyerRoutingPresenter proxyProvideMvpPresenter(MvpPresenterActions mvppresenteractions, AppHelper apphelper, AuthManager authmanager, AppsFlyerState appsflyerstate)
	{
		return (AppsFlyerRoutingPresenter)Preconditions.checkNotNull(((Object) (AppsFlyerRoutingModule.provideMvpPresenter(mvppresenteractions, apphelper, authmanager, appsflyerstate))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #63  <Method AppsFlyerRoutingPresenter AppsFlyerRoutingModule.provideMvpPresenter(MvpPresenterActions, AppHelper, AuthManager, AppsFlyerState)>
	//    5    7:ldc1            #65  <String "Cannot return null from a non-@Nullable @Provides method">
	//    6    9:invokestatic    #71  <Method Object Preconditions.checkNotNull(Object, String)>
	//    7   12:checkcast       #73  <Class AppsFlyerRoutingPresenter>
	//    8   15:areturn         
	}

	public AppsFlyerRoutingPresenter get()
	{
		return provideInstance(mvpPresenterActionsProvider, appHelperProvider, authManagerProvider, appsFlyerStateProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Provider mvpPresenterActionsProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Provider appHelperProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Provider authManagerProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field Provider appsFlyerStateProvider>
	//    8   16:invokestatic    #76  <Method AppsFlyerRoutingPresenter provideInstance(Provider, Provider, Provider, Provider)>
	//    9   19:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method AppsFlyerRoutingPresenter get()>
	//    2    4:areturn         
	}

	private final Provider appHelperProvider;
	private final Provider appsFlyerStateProvider;
	private final Provider authManagerProvider;
	private final Provider mvpPresenterActionsProvider;
}
