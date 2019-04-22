// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

import android.content.res.Resources;
import com.ibotta.android.account.withdraw.LinkCashAccountReducer;
import com.ibotta.android.title.TitleBarReducer;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount:
//			LinkCashAccountModule

public final class LinkCashAccountModule_ProvideLinkCashAccountReducerFactory
	implements Factory
{

	public LinkCashAccountModule_ProvideLinkCashAccountReducerFactory(Provider provider, Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		titleBarReducerProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Provider titleBarReducerProvider>
		resourcesProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Provider resourcesProvider>
	//    8   14:return          
	}

	public static LinkCashAccountModule_ProvideLinkCashAccountReducerFactory create(Provider provider, Provider provider1)
	{
		return new LinkCashAccountModule_ProvideLinkCashAccountReducerFactory(provider, provider1);
	//    0    0:new             #2   <Class LinkCashAccountModule_ProvideLinkCashAccountReducerFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #28  <Method void LinkCashAccountModule_ProvideLinkCashAccountReducerFactory(Provider, Provider)>
	//    5    9:areturn         
	}

	public static LinkCashAccountReducer provideInstance(Provider provider, Provider provider1)
	{
		return proxyProvideLinkCashAccountReducer((TitleBarReducer)provider.get(), (Resources)provider1.get());
	//    0    0:aload_0         
	//    1    1:invokeinterface #37  <Method Object Provider.get()>
	//    2    6:checkcast       #39  <Class TitleBarReducer>
	//    3    9:aload_1         
	//    4   10:invokeinterface #37  <Method Object Provider.get()>
	//    5   15:checkcast       #41  <Class Resources>
	//    6   18:invokestatic    #45  <Method LinkCashAccountReducer proxyProvideLinkCashAccountReducer(TitleBarReducer, Resources)>
	//    7   21:areturn         
	}

	public static LinkCashAccountReducer proxyProvideLinkCashAccountReducer(TitleBarReducer titlebarreducer, Resources resources)
	{
		return (LinkCashAccountReducer)Preconditions.checkNotNull(((Object) (LinkCashAccountModule.provideLinkCashAccountReducer(titlebarreducer, resources))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #51  <Method LinkCashAccountReducer LinkCashAccountModule.provideLinkCashAccountReducer(TitleBarReducer, Resources)>
	//    3    5:ldc1            #53  <String "Cannot return null from a non-@Nullable @Provides method">
	//    4    7:invokestatic    #59  <Method Object Preconditions.checkNotNull(Object, String)>
	//    5   10:checkcast       #61  <Class LinkCashAccountReducer>
	//    6   13:areturn         
	}

	public LinkCashAccountReducer get()
	{
		return provideInstance(titleBarReducerProvider, resourcesProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Provider titleBarReducerProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Provider resourcesProvider>
	//    4    8:invokestatic    #64  <Method LinkCashAccountReducer provideInstance(Provider, Provider)>
	//    5   11:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method LinkCashAccountReducer get()>
	//    2    4:areturn         
	}

	private final Provider resourcesProvider;
	private final Provider titleBarReducerProvider;
}
