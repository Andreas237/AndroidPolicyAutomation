// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

import com.ibotta.android.account.withdraw.LinkCashAccountReducer;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.util.Validation;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount:
//			LinkCashAccountModule, LinkCashAccountPresenter

public final class LinkCashAccountModule_ProvideMvpPresenterFactory
	implements Factory
{

	public LinkCashAccountModule_ProvideMvpPresenterFactory(LinkCashAccountModule linkcashaccountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		module = linkcashaccountmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field LinkCashAccountModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Provider mvpPresenterActionsProvider>
		userStateProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field Provider userStateProvider>
		validationProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field Provider validationProvider>
		cacheClearFactoryProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #35  <Field Provider cacheClearFactoryProvider>
		linkCashAccountReducerProvider = provider4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #37  <Field Provider linkCashAccountReducerProvider>
	//   20   37:return          
	}

	public static LinkCashAccountModule_ProvideMvpPresenterFactory create(LinkCashAccountModule linkcashaccountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
		return new LinkCashAccountModule_ProvideMvpPresenterFactory(linkcashaccountmodule, provider, provider1, provider2, provider3, provider4);
	//    0    0:new             #2   <Class LinkCashAccountModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #44  <Method void LinkCashAccountModule_ProvideMvpPresenterFactory(LinkCashAccountModule, Provider, Provider, Provider, Provider, Provider)>
	//    9   15:areturn         
	}

	public static LinkCashAccountPresenter provideInstance(LinkCashAccountModule linkcashaccountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
	{
		return proxyProvideMvpPresenter(linkcashaccountmodule, (MvpPresenterActions)provider.get(), (UserState)provider1.get(), (Validation)provider2.get(), (CacheClearJobFactory)provider3.get(), (LinkCashAccountReducer)provider4.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #53  <Method Object Provider.get()>
	//    3    7:checkcast       #55  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #53  <Method Object Provider.get()>
	//    6   16:checkcast       #57  <Class UserState>
	//    7   19:aload_3         
	//    8   20:invokeinterface #53  <Method Object Provider.get()>
	//    9   25:checkcast       #59  <Class Validation>
	//   10   28:aload           4
	//   11   30:invokeinterface #53  <Method Object Provider.get()>
	//   12   35:checkcast       #61  <Class CacheClearJobFactory>
	//   13   38:aload           5
	//   14   40:invokeinterface #53  <Method Object Provider.get()>
	//   15   45:checkcast       #63  <Class LinkCashAccountReducer>
	//   16   48:invokestatic    #67  <Method LinkCashAccountPresenter proxyProvideMvpPresenter(LinkCashAccountModule, MvpPresenterActions, UserState, Validation, CacheClearJobFactory, LinkCashAccountReducer)>
	//   17   51:areturn         
	}

	public static LinkCashAccountPresenter proxyProvideMvpPresenter(LinkCashAccountModule linkcashaccountmodule, MvpPresenterActions mvppresenteractions, UserState userstate, Validation validation, CacheClearJobFactory cacheclearjobfactory, LinkCashAccountReducer linkcashaccountreducer)
	{
		return (LinkCashAccountPresenter)Preconditions.checkNotNull(((Object) (linkcashaccountmodule.provideMvpPresenter(mvppresenteractions, userstate, validation, cacheclearjobfactory, linkcashaccountreducer))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #74  <Method LinkCashAccountPresenter LinkCashAccountModule.provideMvpPresenter(MvpPresenterActions, UserState, Validation, CacheClearJobFactory, LinkCashAccountReducer)>
	//    7   11:ldc1            #76  <String "Cannot return null from a non-@Nullable @Provides method">
	//    8   13:invokestatic    #82  <Method Object Preconditions.checkNotNull(Object, String)>
	//    9   16:checkcast       #84  <Class LinkCashAccountPresenter>
	//   10   19:areturn         
	}

	public LinkCashAccountPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, userStateProvider, validationProvider, cacheClearFactoryProvider, linkCashAccountReducerProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LinkCashAccountModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field Provider userStateProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field Provider validationProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field Provider cacheClearFactoryProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #37  <Field Provider linkCashAccountReducerProvider>
	//   12   24:invokestatic    #87  <Method LinkCashAccountPresenter provideInstance(LinkCashAccountModule, Provider, Provider, Provider, Provider, Provider)>
	//   13   27:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method LinkCashAccountPresenter get()>
	//    2    4:areturn         
	}

	private final Provider cacheClearFactoryProvider;
	private final Provider linkCashAccountReducerProvider;
	private final LinkCashAccountModule module;
	private final Provider mvpPresenterActionsProvider;
	private final Provider userStateProvider;
	private final Provider validationProvider;
}
