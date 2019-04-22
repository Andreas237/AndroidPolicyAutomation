// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms;

import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.api.helper.card.GiftCardHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms:
//			GiftCardTermsModule, GiftCardTermsPresenter

public final class GiftCardTermsModule_ProvideMvpPresenterFactory
	implements Factory
{

	public GiftCardTermsModule_ProvideMvpPresenterFactory(GiftCardTermsModule giftcardtermsmodule, Provider provider, Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		module = giftcardtermsmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field GiftCardTermsModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Provider mvpPresenterActionsProvider>
		giftCardHelperProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Provider giftCardHelperProvider>
	//   11   19:return          
	}

	public static GiftCardTermsModule_ProvideMvpPresenterFactory create(GiftCardTermsModule giftcardtermsmodule, Provider provider, Provider provider1)
	{
		return new GiftCardTermsModule_ProvideMvpPresenterFactory(giftcardtermsmodule, provider, provider1);
	//    0    0:new             #2   <Class GiftCardTermsModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #32  <Method void GiftCardTermsModule_ProvideMvpPresenterFactory(GiftCardTermsModule, Provider, Provider)>
	//    6   10:areturn         
	}

	public static GiftCardTermsPresenter provideInstance(GiftCardTermsModule giftcardtermsmodule, Provider provider, Provider provider1)
	{
		return proxyProvideMvpPresenter(giftcardtermsmodule, (MvpPresenterActions)provider.get(), (GiftCardHelper)provider1.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #41  <Method Object Provider.get()>
	//    3    7:checkcast       #43  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #41  <Method Object Provider.get()>
	//    6   16:checkcast       #45  <Class GiftCardHelper>
	//    7   19:invokestatic    #49  <Method GiftCardTermsPresenter proxyProvideMvpPresenter(GiftCardTermsModule, MvpPresenterActions, GiftCardHelper)>
	//    8   22:areturn         
	}

	public static GiftCardTermsPresenter proxyProvideMvpPresenter(GiftCardTermsModule giftcardtermsmodule, MvpPresenterActions mvppresenteractions, GiftCardHelper giftcardhelper)
	{
		return (GiftCardTermsPresenter)Preconditions.checkNotNull(((Object) (giftcardtermsmodule.provideMvpPresenter(mvppresenteractions, giftcardhelper))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #56  <Method GiftCardTermsPresenter GiftCardTermsModule.provideMvpPresenter(MvpPresenterActions, GiftCardHelper)>
	//    4    6:ldc1            #58  <String "Cannot return null from a non-@Nullable @Provides method">
	//    5    8:invokestatic    #64  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #66  <Class GiftCardTermsPresenter>
	//    7   14:areturn         
	}

	public GiftCardTermsPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, giftCardHelperProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GiftCardTermsModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Provider giftCardHelperProvider>
	//    6   12:invokestatic    #69  <Method GiftCardTermsPresenter provideInstance(GiftCardTermsModule, Provider, Provider)>
	//    7   15:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method GiftCardTermsPresenter get()>
	//    2    4:areturn         
	}

	private final Provider giftCardHelperProvider;
	private final GiftCardTermsModule module;
	private final Provider mvpPresenterActionsProvider;
}
