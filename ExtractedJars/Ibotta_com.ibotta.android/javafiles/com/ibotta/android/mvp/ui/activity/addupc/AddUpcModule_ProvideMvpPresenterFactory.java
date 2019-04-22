// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			AddUpcModule, AddUpcPresenter

public final class AddUpcModule_ProvideMvpPresenterFactory
	implements Factory
{

	public AddUpcModule_ProvideMvpPresenterFactory(AddUpcModule addupcmodule, Provider provider, Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		module = addupcmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AddUpcModule module>
		mvpPresenterActionsProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Provider mvpPresenterActionsProvider>
		graphQLCallFactoryProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Provider graphQLCallFactoryProvider>
	//   11   19:return          
	}

	public static AddUpcModule_ProvideMvpPresenterFactory create(AddUpcModule addupcmodule, Provider provider, Provider provider1)
	{
		return new AddUpcModule_ProvideMvpPresenterFactory(addupcmodule, provider, provider1);
	//    0    0:new             #2   <Class AddUpcModule_ProvideMvpPresenterFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #32  <Method void AddUpcModule_ProvideMvpPresenterFactory(AddUpcModule, Provider, Provider)>
	//    6   10:areturn         
	}

	public static AddUpcPresenter provideInstance(AddUpcModule addupcmodule, Provider provider, Provider provider1)
	{
		return proxyProvideMvpPresenter(addupcmodule, (MvpPresenterActions)provider.get(), (GraphQLCallFactory)provider1.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #41  <Method Object Provider.get()>
	//    3    7:checkcast       #43  <Class MvpPresenterActions>
	//    4   10:aload_2         
	//    5   11:invokeinterface #41  <Method Object Provider.get()>
	//    6   16:checkcast       #45  <Class GraphQLCallFactory>
	//    7   19:invokestatic    #49  <Method AddUpcPresenter proxyProvideMvpPresenter(AddUpcModule, MvpPresenterActions, GraphQLCallFactory)>
	//    8   22:areturn         
	}

	public static AddUpcPresenter proxyProvideMvpPresenter(AddUpcModule addupcmodule, MvpPresenterActions mvppresenteractions, GraphQLCallFactory graphqlcallfactory)
	{
		return (AddUpcPresenter)Preconditions.checkNotNull(((Object) (addupcmodule.provideMvpPresenter(mvppresenteractions, graphqlcallfactory))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #56  <Method AddUpcPresenter AddUpcModule.provideMvpPresenter(MvpPresenterActions, GraphQLCallFactory)>
	//    4    6:ldc1            #58  <String "Cannot return null from a non-@Nullable @Provides method">
	//    5    8:invokestatic    #64  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #66  <Class AddUpcPresenter>
	//    7   14:areturn         
	}

	public AddUpcPresenter get()
	{
		return provideInstance(module, mvpPresenterActionsProvider, graphQLCallFactoryProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AddUpcModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Provider mvpPresenterActionsProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Provider graphQLCallFactoryProvider>
	//    6   12:invokestatic    #69  <Method AddUpcPresenter provideInstance(AddUpcModule, Provider, Provider)>
	//    7   15:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method AddUpcPresenter get()>
	//    2    4:areturn         
	}

	private final Provider graphQLCallFactoryProvider;
	private final AddUpcModule module;
	private final Provider mvpPresenterActionsProvider;
}
