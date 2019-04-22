// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.features.variant.account.TeamworkVariant;
import com.ibotta.android.features.variant.pwi.PwiVariant;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.tracking.Tracker;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountTracking, AccountModule, AccountPresenter

public final class AccountModule_ProvideMvpPresenterFactory
	implements Factory
{

	public AccountModule_ProvideMvpPresenterFactory(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		module = accountmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field AccountModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Provider mvpPresenterActionsProvider>
		userStateProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field Provider userStateProvider>
		trackerProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field Provider trackerProvider>
		accountTrackingProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #37  <Field Provider accountTrackingProvider>
		pwiVariantProvider = provider4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #39  <Field Provider pwiVariantProvider>
		teamworkVariantProvider = provider5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #41  <Field Provider teamworkVariantProvider>
	//   23   43:return          
	}

	public static AccountModule_ProvideMvpPresenterFactory create(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
		return new AccountModule_ProvideMvpPresenterFactory(accountmodule, provider, provider1, provider2, provider3, provider4, provider5);
	//    0    0:new             #2   <Class AccountModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:invokespecial   #48  <Method void AccountModule_ProvideMvpPresenterFactory(AccountModule, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   10   17:areturn         
	}

	public static AccountPresenter provideInstance(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
	{
		return proxyProvideMvpPresenter(accountmodule, (MvpPresenterActions)provider.get(), (UserState)provider1.get(), (Tracker)provider2.get(), (AccountTracking)provider3.get(), (PwiVariant)provider4.get(), (TeamworkVariant)provider5.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #57  <Method Object Provider.get()>
	//    3    7:checkcast       #59  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #57  <Method Object Provider.get()>
	//    6   16:checkcast       #61  <Class UserState>
	//    7   19:aload_3         
	//    8   20:invokeinterface #57  <Method Object Provider.get()>
	//    9   25:checkcast       #63  <Class Tracker>
	//   10   28:aload           4
	//   11   30:invokeinterface #57  <Method Object Provider.get()>
	//   12   35:checkcast       #65  <Class AccountTracking>
	//   13   38:aload           5
	//   14   40:invokeinterface #57  <Method Object Provider.get()>
	//   15   45:checkcast       #67  <Class PwiVariant>
	//   16   48:aload           6
	//   17   50:invokeinterface #57  <Method Object Provider.get()>
	//   18   55:checkcast       #69  <Class TeamworkVariant>
	//   19   58:invokestatic    #73  <Method AccountPresenter proxyProvideMvpPresenter(AccountModule, MvpPresenterActions, UserState, Tracker, AccountTracking, PwiVariant, TeamworkVariant)>
	//   20   61:areturn         
	}

	public static AccountPresenter proxyProvideMvpPresenter(AccountModule accountmodule, MvpPresenterActions mvppresenteractions, UserState userstate, Tracker tracker, AccountTracking accounttracking, PwiVariant pwivariant, TeamworkVariant teamworkvariant)
	{
		return (AccountPresenter)Preconditions.checkNotNull(((Object) (accountmodule.provideMvpPresenter(mvppresenteractions, userstate, tracker, accounttracking, pwivariant, teamworkvariant))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokevirtual   #80  <Method AccountPresenter AccountModule.provideMvpPresenter(MvpPresenterActions, UserState, Tracker, AccountTracking, PwiVariant, TeamworkVariant)>
	//    8   13:ldc1            #82  <String "Cannot return null from a non-@Nullable @Provides method">
	//    9   15:invokestatic    #88  <Method Object Preconditions.checkNotNull(Object, String)>
	//   10   18:checkcast       #90  <Class AccountPresenter>
	//   11   21:areturn         
	}

	public AccountPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, userStateProvider, trackerProvider, accountTrackingProvider, pwiVariantProvider, teamworkVariantProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AccountModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field Provider userStateProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Provider trackerProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Provider accountTrackingProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field Provider pwiVariantProvider>
	//   12   24:aload_0         
	//   13   25:getfield        #41  <Field Provider teamworkVariantProvider>
	//   14   28:invokestatic    #93  <Method AccountPresenter provideInstance(AccountModule, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   15   31:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method AccountPresenter get()>
	//    2    4:areturn         
	}

	private final Provider accountTrackingProvider;
	private final AccountModule module;
	private final Provider mvpPresenterActionsProvider;
	private final Provider pwiVariantProvider;
	private final Provider teamworkVariantProvider;
	private final Provider trackerProvider;
	private final Provider userStateProvider;
}
