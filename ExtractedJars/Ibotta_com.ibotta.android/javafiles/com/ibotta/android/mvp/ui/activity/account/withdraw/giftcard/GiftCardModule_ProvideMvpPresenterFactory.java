// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.user.UserState;
import com.ibotta.api.helper.card.GiftCardHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard:
//			GiftCardModule, GiftCardPresenter

public final class GiftCardModule_ProvideMvpPresenterFactory
	implements Factory
{

	public GiftCardModule_ProvideMvpPresenterFactory(GiftCardModule giftcardmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		module = giftcardmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field GiftCardModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Provider mvpPresenterActionsProvider>
		userStateProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field Provider userStateProvider>
		giftCardHelperProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field Provider giftCardHelperProvider>
		cacheClearFactoryProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field Provider cacheClearFactoryProvider>
	//   17   31:return          
	}

	public static GiftCardModule_ProvideMvpPresenterFactory create(GiftCardModule giftcardmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3)
	{
		return new GiftCardModule_ProvideMvpPresenterFactory(giftcardmodule, provider, provider1, provider2, provider3);
	//    0    0:new             #2   <Class GiftCardModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #40  <Method void GiftCardModule_ProvideMvpPresenterFactory(GiftCardModule, Provider, Provider, Provider, Provider)>
	//    8   13:areturn         
	}

	public static GiftCardPresenter provideInstance(GiftCardModule giftcardmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3)
	{
		return proxyProvideMvpPresenter(giftcardmodule, (MvpPresenterActions)provider.get(), (UserState)provider1.get(), (GiftCardHelper)provider2.get(), (CacheClearJobFactory)provider3.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #49  <Method Object Provider.get()>
	//    3    7:checkcast       #51  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #49  <Method Object Provider.get()>
	//    6   16:checkcast       #53  <Class UserState>
	//    7   19:aload_3         
	//    8   20:invokeinterface #49  <Method Object Provider.get()>
	//    9   25:checkcast       #55  <Class GiftCardHelper>
	//   10   28:aload           4
	//   11   30:invokeinterface #49  <Method Object Provider.get()>
	//   12   35:checkcast       #57  <Class CacheClearJobFactory>
	//   13   38:invokestatic    #61  <Method GiftCardPresenter proxyProvideMvpPresenter(GiftCardModule, MvpPresenterActions, UserState, GiftCardHelper, CacheClearJobFactory)>
	//   14   41:areturn         
	}

	public static GiftCardPresenter proxyProvideMvpPresenter(GiftCardModule giftcardmodule, MvpPresenterActions mvppresenteractions, UserState userstate, GiftCardHelper giftcardhelper, CacheClearJobFactory cacheclearjobfactory)
	{
		return (GiftCardPresenter)Preconditions.checkNotNull(((Object) (giftcardmodule.provideMvpPresenter(mvppresenteractions, userstate, giftcardhelper, cacheclearjobfactory))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #68  <Method GiftCardPresenter GiftCardModule.provideMvpPresenter(MvpPresenterActions, UserState, GiftCardHelper, CacheClearJobFactory)>
	//    6    9:ldc1            #70  <String "Cannot return null from a non-@Nullable @Provides method">
	//    7   11:invokestatic    #76  <Method Object Preconditions.checkNotNull(Object, String)>
	//    8   14:checkcast       #78  <Class GiftCardPresenter>
	//    9   17:areturn         
	}

	public GiftCardPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, userStateProvider, giftCardHelperProvider, cacheClearFactoryProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field GiftCardModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Provider userStateProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field Provider giftCardHelperProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field Provider cacheClearFactoryProvider>
	//   10   20:invokestatic    #81  <Method GiftCardPresenter provideInstance(GiftCardModule, Provider, Provider, Provider, Provider)>
	//   11   23:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method GiftCardPresenter get()>
	//    2    4:areturn         
	}

	private final Provider cacheClearFactoryProvider;
	private final Provider giftCardHelperProvider;
	private final GiftCardModule module;
	private final Provider mvpPresenterActionsProvider;
	private final Provider userStateProvider;
}
