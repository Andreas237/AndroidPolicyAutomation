// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.account.bonus.BonusPickerReducer;
import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerRowCreator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusesPickerModule

public final class BonusesPickerModule_ProvideBonusPickerRowCreatorFactory
	implements Factory
{

	public BonusesPickerModule_ProvideBonusPickerRowCreatorFactory(BonusesPickerModule bonusespickermodule, Provider provider, Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		module = bonusespickermodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field BonusesPickerModule module>
		graphQLCallFactoryProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Provider graphQLCallFactoryProvider>
		bonusPickerReducerProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Provider bonusPickerReducerProvider>
	//   11   19:return          
	}

	public static BonusesPickerModule_ProvideBonusPickerRowCreatorFactory create(BonusesPickerModule bonusespickermodule, Provider provider, Provider provider1)
	{
		return new BonusesPickerModule_ProvideBonusPickerRowCreatorFactory(bonusespickermodule, provider, provider1);
	//    0    0:new             #2   <Class BonusesPickerModule_ProvideBonusPickerRowCreatorFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #32  <Method void BonusesPickerModule_ProvideBonusPickerRowCreatorFactory(BonusesPickerModule, Provider, Provider)>
	//    6   10:areturn         
	}

	public static BonusPickerRowCreator provideInstance(BonusesPickerModule bonusespickermodule, Provider provider, Provider provider1)
	{
		return proxyProvideBonusPickerRowCreator(bonusespickermodule, (GraphQLCallFactory)provider.get(), (BonusPickerReducer)provider1.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #41  <Method Object Provider.get()>
	//    3    7:checkcast       #43  <Class GraphQLCallFactory>
	//    4   10:aload_2         
	//    5   11:invokeinterface #41  <Method Object Provider.get()>
	//    6   16:checkcast       #45  <Class BonusPickerReducer>
	//    7   19:invokestatic    #49  <Method BonusPickerRowCreator proxyProvideBonusPickerRowCreator(BonusesPickerModule, GraphQLCallFactory, BonusPickerReducer)>
	//    8   22:areturn         
	}

	public static BonusPickerRowCreator proxyProvideBonusPickerRowCreator(BonusesPickerModule bonusespickermodule, GraphQLCallFactory graphqlcallfactory, BonusPickerReducer bonuspickerreducer)
	{
		return (BonusPickerRowCreator)Preconditions.checkNotNull(((Object) (bonusespickermodule.provideBonusPickerRowCreator(graphqlcallfactory, bonuspickerreducer))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #56  <Method BonusPickerRowCreator BonusesPickerModule.provideBonusPickerRowCreator(GraphQLCallFactory, BonusPickerReducer)>
	//    4    6:ldc1            #58  <String "Cannot return null from a non-@Nullable @Provides method">
	//    5    8:invokestatic    #64  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #66  <Class BonusPickerRowCreator>
	//    7   14:areturn         
	}

	public BonusPickerRowCreator get()
	{
		return provideInstance(module, graphQLCallFactoryProvider, bonusPickerReducerProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BonusesPickerModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Provider graphQLCallFactoryProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Provider bonusPickerReducerProvider>
	//    6   12:invokestatic    #69  <Method BonusPickerRowCreator provideInstance(BonusesPickerModule, Provider, Provider)>
	//    7   15:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method BonusPickerRowCreator get()>
	//    2    4:areturn         
	}

	private final Provider bonusPickerReducerProvider;
	private final Provider graphQLCallFactoryProvider;
	private final BonusesPickerModule module;
}
