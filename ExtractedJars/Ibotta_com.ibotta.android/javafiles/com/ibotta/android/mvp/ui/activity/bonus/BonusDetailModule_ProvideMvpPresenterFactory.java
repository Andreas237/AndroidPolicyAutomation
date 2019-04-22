// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.account.bonus.BonusDetailReducer;
import com.ibotta.android.features.variant.retailers.LoadRetailersVariant;
import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.api.helper.bonus.BonusHelper;
import com.ibotta.api.helper.offer.OfferHelper;
import com.ibotta.api.helper.retailer.RetailerHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusDetailModule, BonusDetailPresenter

public final class BonusDetailModule_ProvideMvpPresenterFactory
	implements Factory
{

	public BonusDetailModule_ProvideMvpPresenterFactory(BonusDetailModule bonusdetailmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
			Provider provider6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		module = bonusdetailmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field BonusDetailModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field Provider mvpPresenterActionsProvider>
		retailerHelperProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field Provider retailerHelperProvider>
		offerHelperProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #37  <Field Provider offerHelperProvider>
		bonusHelperProvider = provider3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #39  <Field Provider bonusHelperProvider>
		graphQLCallFactoryProvider = provider4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #41  <Field Provider graphQLCallFactoryProvider>
		loadRetailersVariantProvider = provider5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #43  <Field Provider loadRetailersVariantProvider>
		bonusDetailReducerProvider = provider6;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #45  <Field Provider bonusDetailReducerProvider>
	//   26   49:return          
	}

	public static BonusDetailModule_ProvideMvpPresenterFactory create(BonusDetailModule bonusdetailmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
	{
		return new BonusDetailModule_ProvideMvpPresenterFactory(bonusdetailmodule, provider, provider1, provider2, provider3, provider4, provider5, provider6);
	//    0    0:new             #2   <Class BonusDetailModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:invokespecial   #52  <Method void BonusDetailModule_ProvideMvpPresenterFactory(BonusDetailModule, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   11   19:areturn         
	}

	public static BonusDetailPresenter provideInstance(BonusDetailModule bonusdetailmodule, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
	{
		return proxyProvideMvpPresenter(bonusdetailmodule, (MvpPresenterActions)provider.get(), (RetailerHelper)provider1.get(), (OfferHelper)provider2.get(), (BonusHelper)provider3.get(), (GraphQLCallFactory)provider4.get(), (LoadRetailersVariant)provider5.get(), (BonusDetailReducer)provider6.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #61  <Method Object Provider.get()>
	//    3    7:checkcast       #63  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #61  <Method Object Provider.get()>
	//    6   16:checkcast       #65  <Class RetailerHelper>
	//    7   19:aload_3         
	//    8   20:invokeinterface #61  <Method Object Provider.get()>
	//    9   25:checkcast       #67  <Class OfferHelper>
	//   10   28:aload           4
	//   11   30:invokeinterface #61  <Method Object Provider.get()>
	//   12   35:checkcast       #69  <Class BonusHelper>
	//   13   38:aload           5
	//   14   40:invokeinterface #61  <Method Object Provider.get()>
	//   15   45:checkcast       #71  <Class GraphQLCallFactory>
	//   16   48:aload           6
	//   17   50:invokeinterface #61  <Method Object Provider.get()>
	//   18   55:checkcast       #73  <Class LoadRetailersVariant>
	//   19   58:aload           7
	//   20   60:invokeinterface #61  <Method Object Provider.get()>
	//   21   65:checkcast       #75  <Class BonusDetailReducer>
	//   22   68:invokestatic    #79  <Method BonusDetailPresenter proxyProvideMvpPresenter(BonusDetailModule, MvpPresenterActions, RetailerHelper, OfferHelper, BonusHelper, GraphQLCallFactory, LoadRetailersVariant, BonusDetailReducer)>
	//   23   71:areturn         
	}

	public static BonusDetailPresenter proxyProvideMvpPresenter(BonusDetailModule bonusdetailmodule, MvpPresenterActions mvppresenteractions, RetailerHelper retailerhelper, OfferHelper offerhelper, BonusHelper bonushelper, GraphQLCallFactory graphqlcallfactory, LoadRetailersVariant loadretailersvariant, BonusDetailReducer bonusdetailreducer)
	{
		return (BonusDetailPresenter)Preconditions.checkNotNull(((Object) (bonusdetailmodule.provideMvpPresenter(mvppresenteractions, retailerhelper, offerhelper, bonushelper, graphqlcallfactory, loadretailersvariant, bonusdetailreducer))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokevirtual   #86  <Method BonusDetailPresenter BonusDetailModule.provideMvpPresenter(MvpPresenterActions, RetailerHelper, OfferHelper, BonusHelper, GraphQLCallFactory, LoadRetailersVariant, BonusDetailReducer)>
	//    9   15:ldc1            #88  <String "Cannot return null from a non-@Nullable @Provides method">
	//   10   17:invokestatic    #94  <Method Object Preconditions.checkNotNull(Object, String)>
	//   11   20:checkcast       #96  <Class BonusDetailPresenter>
	//   12   23:areturn         
	}

	public BonusDetailPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, retailerHelperProvider, offerHelperProvider, bonusHelperProvider, graphQLCallFactoryProvider, loadRetailersVariantProvider, bonusDetailReducerProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field BonusDetailModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field Provider retailerHelperProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field Provider offerHelperProvider>
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field Provider bonusHelperProvider>
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field Provider graphQLCallFactoryProvider>
	//   12   24:aload_0         
	//   13   25:getfield        #43  <Field Provider loadRetailersVariantProvider>
	//   14   28:aload_0         
	//   15   29:getfield        #45  <Field Provider bonusDetailReducerProvider>
	//   16   32:invokestatic    #99  <Method BonusDetailPresenter provideInstance(BonusDetailModule, Provider, Provider, Provider, Provider, Provider, Provider, Provider)>
	//   17   35:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method BonusDetailPresenter get()>
	//    2    4:areturn         
	}

	private final Provider bonusDetailReducerProvider;
	private final Provider bonusHelperProvider;
	private final Provider graphQLCallFactoryProvider;
	private final Provider loadRetailersVariantProvider;
	private final BonusDetailModule module;
	private final Provider mvpPresenterActionsProvider;
	private final Provider offerHelperProvider;
	private final Provider retailerHelperProvider;
}
