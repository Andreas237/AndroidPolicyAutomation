// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.account.bonus.BonusPickerReducer;
import com.ibotta.android.title.TitleBarReducer;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusesPickerModule

public final class BonusesPickerModule_ProvideBonusPickerReducerFactory
	implements Factory
{

	public BonusesPickerModule_ProvideBonusPickerReducerFactory(Provider provider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		titleBarReducerProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Provider titleBarReducerProvider>
	//    5    9:return          
	}

	public static BonusesPickerModule_ProvideBonusPickerReducerFactory create(Provider provider)
	{
		return new BonusesPickerModule_ProvideBonusPickerReducerFactory(provider);
	//    0    0:new             #2   <Class BonusesPickerModule_ProvideBonusPickerReducerFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void BonusesPickerModule_ProvideBonusPickerReducerFactory(Provider)>
	//    4    8:areturn         
	}

	public static BonusPickerReducer provideInstance(Provider provider)
	{
		return proxyProvideBonusPickerReducer((TitleBarReducer)provider.get());
	//    0    0:aload_0         
	//    1    1:invokeinterface #33  <Method Object Provider.get()>
	//    2    6:checkcast       #35  <Class TitleBarReducer>
	//    3    9:invokestatic    #39  <Method BonusPickerReducer proxyProvideBonusPickerReducer(TitleBarReducer)>
	//    4   12:areturn         
	}

	public static BonusPickerReducer proxyProvideBonusPickerReducer(TitleBarReducer titlebarreducer)
	{
		return (BonusPickerReducer)Preconditions.checkNotNull(((Object) (BonusesPickerModule.provideBonusPickerReducer(titlebarreducer))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:invokestatic    #45  <Method BonusPickerReducer BonusesPickerModule.provideBonusPickerReducer(TitleBarReducer)>
	//    2    4:ldc1            #47  <String "Cannot return null from a non-@Nullable @Provides method">
	//    3    6:invokestatic    #53  <Method Object Preconditions.checkNotNull(Object, String)>
	//    4    9:checkcast       #55  <Class BonusPickerReducer>
	//    5   12:areturn         
	}

	public BonusPickerReducer get()
	{
		return provideInstance(titleBarReducerProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Provider titleBarReducerProvider>
	//    2    4:invokestatic    #58  <Method BonusPickerReducer provideInstance(Provider)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method BonusPickerReducer get()>
	//    2    4:areturn         
	}

	private final Provider titleBarReducerProvider;
}
