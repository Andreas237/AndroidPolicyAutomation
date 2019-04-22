// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.content.res.Resources;
import com.ibotta.android.account.bonus.QuestToolbarReducer;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.util.Formatting;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusDetailModule

public final class BonusDetailModule_ProvideQuestToolbarReducerFactory
	implements Factory
{

	public BonusDetailModule_ProvideQuestToolbarReducerFactory(Provider provider, Provider provider1, Provider provider2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		appConfigProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Provider appConfigProvider>
		formattingProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Provider formattingProvider>
		resourcesProvider = provider2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Provider resourcesProvider>
	//   11   19:return          
	}

	public static BonusDetailModule_ProvideQuestToolbarReducerFactory create(Provider provider, Provider provider1, Provider provider2)
	{
		return new BonusDetailModule_ProvideQuestToolbarReducerFactory(provider, provider1, provider2);
	//    0    0:new             #2   <Class BonusDetailModule_ProvideQuestToolbarReducerFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #32  <Method void BonusDetailModule_ProvideQuestToolbarReducerFactory(Provider, Provider, Provider)>
	//    6   10:areturn         
	}

	public static QuestToolbarReducer provideInstance(Provider provider, Provider provider1, Provider provider2)
	{
		return proxyProvideQuestToolbarReducer((AppConfig)provider.get(), (Formatting)provider1.get(), (Resources)provider2.get());
	//    0    0:aload_0         
	//    1    1:invokeinterface #41  <Method Object Provider.get()>
	//    2    6:checkcast       #43  <Class AppConfig>
	//    3    9:aload_1         
	//    4   10:invokeinterface #41  <Method Object Provider.get()>
	//    5   15:checkcast       #45  <Class Formatting>
	//    6   18:aload_2         
	//    7   19:invokeinterface #41  <Method Object Provider.get()>
	//    8   24:checkcast       #47  <Class Resources>
	//    9   27:invokestatic    #51  <Method QuestToolbarReducer proxyProvideQuestToolbarReducer(AppConfig, Formatting, Resources)>
	//   10   30:areturn         
	}

	public static QuestToolbarReducer proxyProvideQuestToolbarReducer(AppConfig appconfig, Formatting formatting, Resources resources)
	{
		return (QuestToolbarReducer)Preconditions.checkNotNull(((Object) (BonusDetailModule.provideQuestToolbarReducer(appconfig, formatting, resources))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #57  <Method QuestToolbarReducer BonusDetailModule.provideQuestToolbarReducer(AppConfig, Formatting, Resources)>
	//    4    6:ldc1            #59  <String "Cannot return null from a non-@Nullable @Provides method">
	//    5    8:invokestatic    #65  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #67  <Class QuestToolbarReducer>
	//    7   14:areturn         
	}

	public QuestToolbarReducer get()
	{
		return provideInstance(appConfigProvider, formattingProvider, resourcesProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Provider appConfigProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Provider formattingProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Provider resourcesProvider>
	//    6   12:invokestatic    #70  <Method QuestToolbarReducer provideInstance(Provider, Provider, Provider)>
	//    7   15:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method QuestToolbarReducer get()>
	//    2    4:areturn         
	}

	private final Provider appConfigProvider;
	private final Provider formattingProvider;
	private final Provider resourcesProvider;
}
