// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import com.ibotta.android.account.withdraw.WithdrawReducer;
import com.ibotta.android.api.auth.PostAuthWorkJobFactory;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.tracking.braze.BrazeTracking;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.card.GiftCardHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawModule, WithdrawPresenter

public final class WithdrawModule_ProvideMvpPresenterFactory
	implements Factory
{

	public WithdrawModule_ProvideMvpPresenterFactory(WithdrawModule withdrawmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
			Provider provider6, Provider provider7, Provider provider8)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		module = withdrawmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field WithdrawModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field Provider mvpPresenterActionsProvider>
		formattingProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field Provider formattingProvider>
		giftCardHelperProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #41  <Field Provider giftCardHelperProvider>
		userStateProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #43  <Field Provider userStateProvider>
		appConfigProvider = provider4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #45  <Field Provider appConfigProvider>
		brazeTrackingProvider = provider5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #47  <Field Provider brazeTrackingProvider>
		postAuthWorkJobFactoryProvider = provider6;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #49  <Field Provider postAuthWorkJobFactoryProvider>
		cacheClearFactoryProvider = provider7;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #51  <Field Provider cacheClearFactoryProvider>
		withdrawReducerProvider = provider8;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #53  <Field Provider withdrawReducerProvider>
	//   32   61:return          
	}

	public static WithdrawModule_ProvideMvpPresenterFactory create(WithdrawModule withdrawmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
			Provider provider7, Provider provider8)
	{
		return new WithdrawModule_ProvideMvpPresenterFactory(withdrawmodule, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
	//    0    0:new             #2   <Class WithdrawModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:aload           8
	//   11   18:aload           9
	//   12   20:invokespecial   #60  <Method void WithdrawModule_ProvideMvpPresenterFactory(WithdrawModule, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   13   23:areturn         
	}

	public static WithdrawPresenter provideInstance(WithdrawModule withdrawmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
			Provider provider7, Provider provider8)
	{
		return proxyProvideMvpPresenter(withdrawmodule, (MvpPresenterActions)provider.get(), (Formatting)provider1.get(), (GiftCardHelper)provider2.get(), (UserState)provider3.get(), (AppConfig)provider4.get(), (BrazeTracking)provider5.get(), (PostAuthWorkJobFactory)provider6.get(), (CacheClearJobFactory)provider7.get(), (WithdrawReducer)provider8.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #69  <Method Object Provider.get()>
	//    3    7:checkcast       #71  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #69  <Method Object Provider.get()>
	//    6   16:checkcast       #73  <Class Formatting>
	//    7   19:aload_3         
	//    8   20:invokeinterface #69  <Method Object Provider.get()>
	//    9   25:checkcast       #75  <Class GiftCardHelper>
	//   10   28:aload           4
	//   11   30:invokeinterface #69  <Method Object Provider.get()>
	//   12   35:checkcast       #77  <Class UserState>
	//   13   38:aload           5
	//   14   40:invokeinterface #69  <Method Object Provider.get()>
	//   15   45:checkcast       #79  <Class AppConfig>
	//   16   48:aload           6
	//   17   50:invokeinterface #69  <Method Object Provider.get()>
	//   18   55:checkcast       #81  <Class BrazeTracking>
	//   19   58:aload           7
	//   20   60:invokeinterface #69  <Method Object Provider.get()>
	//   21   65:checkcast       #83  <Class PostAuthWorkJobFactory>
	//   22   68:aload           8
	//   23   70:invokeinterface #69  <Method Object Provider.get()>
	//   24   75:checkcast       #85  <Class CacheClearJobFactory>
	//   25   78:aload           9
	//   26   80:invokeinterface #69  <Method Object Provider.get()>
	//   27   85:checkcast       #87  <Class WithdrawReducer>
	//   28   88:invokestatic    #91  <Method WithdrawPresenter proxyProvideMvpPresenter(WithdrawModule, MvpPresenterActions, Formatting, GiftCardHelper, UserState, AppConfig, BrazeTracking, PostAuthWorkJobFactory, CacheClearJobFactory, WithdrawReducer)>
	//   29   91:areturn         
	}

	public static WithdrawPresenter proxyProvideMvpPresenter(WithdrawModule withdrawmodule, MvpPresenterActions mvppresenteractions, Formatting formatting, GiftCardHelper giftcardhelper, UserState userstate, AppConfig appconfig, BrazeTracking brazetracking, PostAuthWorkJobFactory postauthworkjobfactory, 
			CacheClearJobFactory cacheclearjobfactory, WithdrawReducer withdrawreducer)
	{
		return (WithdrawPresenter)Preconditions.checkNotNull(((Object) (withdrawmodule.provideMvpPresenter(mvppresenteractions, formatting, giftcardhelper, userstate, appconfig, brazetracking, postauthworkjobfactory, cacheclearjobfactory, withdrawreducer))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:aload           9
	//   10   16:invokevirtual   #98  <Method WithdrawPresenter WithdrawModule.provideMvpPresenter(MvpPresenterActions, Formatting, GiftCardHelper, UserState, AppConfig, BrazeTracking, PostAuthWorkJobFactory, CacheClearJobFactory, WithdrawReducer)>
	//   11   19:ldc1            #100 <String "Cannot return null from a non-@Nullable @Provides method">
	//   12   21:invokestatic    #106 <Method Object Preconditions.checkNotNull(Object, String)>
	//   13   24:checkcast       #108 <Class WithdrawPresenter>
	//   14   27:areturn         
	}

	public WithdrawPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, formattingProvider, giftCardHelperProvider, userStateProvider, appConfigProvider, brazeTrackingProvider, postAuthWorkJobFactoryProvider, cacheClearFactoryProvider, withdrawReducerProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field WithdrawModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field Provider formattingProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field Provider giftCardHelperProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field Provider userStateProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #45  <Field Provider appConfigProvider>
	//   12   24:aload_0         
	//   13   25:getfield        #47  <Field Provider brazeTrackingProvider>
	//   14   28:aload_0         
	//   15   29:getfield        #49  <Field Provider postAuthWorkJobFactoryProvider>
	//   16   32:aload_0         
	//   17   33:getfield        #51  <Field Provider cacheClearFactoryProvider>
	//   18   36:aload_0         
	//   19   37:getfield        #53  <Field Provider withdrawReducerProvider>
	//   20   40:invokestatic    #111 <Method WithdrawPresenter provideInstance(WithdrawModule, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   21   43:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method WithdrawPresenter get()>
	//    2    4:areturn         
	}

	private final Provider appConfigProvider;
	private final Provider brazeTrackingProvider;
	private final Provider cacheClearFactoryProvider;
	private final Provider formattingProvider;
	private final Provider giftCardHelperProvider;
	private final WithdrawModule module;
	private final Provider mvpPresenterActionsProvider;
	private final Provider postAuthWorkJobFactoryProvider;
	private final Provider userStateProvider;
	private final Provider withdrawReducerProvider;
}
