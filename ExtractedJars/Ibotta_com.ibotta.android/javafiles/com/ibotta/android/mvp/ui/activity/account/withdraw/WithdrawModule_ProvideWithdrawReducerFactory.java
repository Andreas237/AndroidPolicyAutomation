// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import com.ibotta.android.account.withdraw.WithdrawReducer;
import com.ibotta.android.title.TitleBarReducer;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawModule

public final class WithdrawModule_ProvideWithdrawReducerFactory
	implements Factory
{

	public WithdrawModule_ProvideWithdrawReducerFactory(Provider provider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		titleBarReducerProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Provider titleBarReducerProvider>
	//    5    9:return          
	}

	public static WithdrawModule_ProvideWithdrawReducerFactory create(Provider provider)
	{
		return new WithdrawModule_ProvideWithdrawReducerFactory(provider);
	//    0    0:new             #2   <Class WithdrawModule_ProvideWithdrawReducerFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void WithdrawModule_ProvideWithdrawReducerFactory(Provider)>
	//    4    8:areturn         
	}

	public static WithdrawReducer provideInstance(Provider provider)
	{
		return proxyProvideWithdrawReducer((TitleBarReducer)provider.get());
	//    0    0:aload_0         
	//    1    1:invokeinterface #33  <Method Object Provider.get()>
	//    2    6:checkcast       #35  <Class TitleBarReducer>
	//    3    9:invokestatic    #39  <Method WithdrawReducer proxyProvideWithdrawReducer(TitleBarReducer)>
	//    4   12:areturn         
	}

	public static WithdrawReducer proxyProvideWithdrawReducer(TitleBarReducer titlebarreducer)
	{
		return (WithdrawReducer)Preconditions.checkNotNull(((Object) (WithdrawModule.provideWithdrawReducer(titlebarreducer))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:invokestatic    #45  <Method WithdrawReducer WithdrawModule.provideWithdrawReducer(TitleBarReducer)>
	//    2    4:ldc1            #47  <String "Cannot return null from a non-@Nullable @Provides method">
	//    3    6:invokestatic    #53  <Method Object Preconditions.checkNotNull(Object, String)>
	//    4    9:checkcast       #55  <Class WithdrawReducer>
	//    5   12:areturn         
	}

	public WithdrawReducer get()
	{
		return provideInstance(titleBarReducerProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Provider titleBarReducerProvider>
	//    2    4:invokestatic    #58  <Method WithdrawReducer provideInstance(Provider)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method WithdrawReducer get()>
	//    2    4:areturn         
	}

	private final Provider titleBarReducerProvider;
}
