// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout;

import com.ibotta.android.account.withdraw.CashOutReducer;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.util.Formatting;
import com.ibotta.android.util.Validation;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout:
//			CashOutModule, CashOutPresenter

public final class CashOutModule_ProvideMvpPresenterFactory
	implements Factory
{

	public CashOutModule_ProvideMvpPresenterFactory(CashOutModule cashoutmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		module = cashoutmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field CashOutModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Provider mvpPresenterActionsProvider>
		userStateProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field Provider userStateProvider>
		validationProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field Provider validationProvider>
		formattingProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #37  <Field Provider formattingProvider>
		cacheClearFactoryProvider = provider4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #39  <Field Provider cacheClearFactoryProvider>
		cashOutReducerProvider = provider5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #41  <Field Provider cashOutReducerProvider>
	//   23   43:return          
	}

	public static CashOutModule_ProvideMvpPresenterFactory create(CashOutModule cashoutmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
		return new CashOutModule_ProvideMvpPresenterFactory(cashoutmodule, provider, provider1, provider2, provider3, provider4, provider5);
	//    0    0:new             #2   <Class CashOutModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:invokespecial   #48  <Method void CashOutModule_ProvideMvpPresenterFactory(CashOutModule, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   10   17:areturn         
	}

	public static CashOutPresenter provideInstance(CashOutModule cashoutmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
		return proxyProvideMvpPresenter(cashoutmodule, (MvpPresenterActions)provider.get(), (UserState)provider1.get(), (Validation)provider2.get(), (Formatting)provider3.get(), (CacheClearJobFactory)provider4.get(), (CashOutReducer)provider5.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #57  <Method Object Provider.get()>
	//    3    7:checkcast       #59  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #57  <Method Object Provider.get()>
	//    6   16:checkcast       #61  <Class UserState>
	//    7   19:aload_3         
	//    8   20:invokeinterface #57  <Method Object Provider.get()>
	//    9   25:checkcast       #63  <Class Validation>
	//   10   28:aload           4
	//   11   30:invokeinterface #57  <Method Object Provider.get()>
	//   12   35:checkcast       #65  <Class Formatting>
	//   13   38:aload           5
	//   14   40:invokeinterface #57  <Method Object Provider.get()>
	//   15   45:checkcast       #67  <Class CacheClearJobFactory>
	//   16   48:aload           6
	//   17   50:invokeinterface #57  <Method Object Provider.get()>
	//   18   55:checkcast       #69  <Class CashOutReducer>
	//   19   58:invokestatic    #73  <Method CashOutPresenter proxyProvideMvpPresenter(CashOutModule, MvpPresenterActions, UserState, Validation, Formatting, CacheClearJobFactory, CashOutReducer)>
	//   20   61:areturn         
	}

	public static CashOutPresenter proxyProvideMvpPresenter(CashOutModule cashoutmodule, MvpPresenterActions mvppresenteractions, UserState userstate, Validation validation, Formatting formatting, CacheClearJobFactory cacheclearjobfactory, CashOutReducer cashoutreducer)
	{
		return (CashOutPresenter)Preconditions.checkNotNull(((Object) (cashoutmodule.provideMvpPresenter(mvppresenteractions, userstate, validation, formatting, cacheclearjobfactory, cashoutreducer))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokevirtual   #80  <Method CashOutPresenter CashOutModule.provideMvpPresenter(MvpPresenterActions, UserState, Validation, Formatting, CacheClearJobFactory, CashOutReducer)>
	//    8   13:ldc1            #82  <String "Cannot return null from a non-@Nullable @Provides method">
	//    9   15:invokestatic    #88  <Method Object Preconditions.checkNotNull(Object, String)>
	//   10   18:checkcast       #90  <Class CashOutPresenter>
	//   11   21:areturn         
	}

	public CashOutPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, userStateProvider, validationProvider, formattingProvider, cacheClearFactoryProvider, cashOutReducerProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field CashOutModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field Provider userStateProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Provider validationProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Provider formattingProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field Provider cacheClearFactoryProvider>
	//   12   24:aload_0         
	//   13   25:getfield        #41  <Field Provider cashOutReducerProvider>
	//   14   28:invokestatic    #93  <Method CashOutPresenter provideInstance(CashOutModule, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   15   31:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method CashOutPresenter get()>
	//    2    4:areturn         
	}

	private final Provider cacheClearFactoryProvider;
	private final Provider cashOutReducerProvider;
	private final Provider formattingProvider;
	private final CashOutModule module;
	private final Provider mvpPresenterActionsProvider;
	private final Provider userStateProvider;
	private final Provider validationProvider;
}
