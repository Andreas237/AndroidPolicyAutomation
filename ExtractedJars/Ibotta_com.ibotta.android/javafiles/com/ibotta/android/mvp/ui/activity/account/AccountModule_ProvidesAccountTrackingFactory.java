// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.tracking.EventContextProvider;
import com.ibotta.android.tracking.proprietary.TrackingQueue;
import com.ibotta.android.util.AppHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountModule, AccountTracking

public final class AccountModule_ProvidesAccountTrackingFactory
	implements Factory
{

	public AccountModule_ProvidesAccountTrackingFactory(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		module = accountmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field AccountModule module>
		appHelperProvider = provider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Provider appHelperProvider>
		eventContextProvider = provider1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Provider eventContextProvider>
		trackingQueueProvider = provider2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field Provider trackingQueueProvider>
	//   14   25:return          
	}

	public static AccountModule_ProvidesAccountTrackingFactory create(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2)
	{
		return new AccountModule_ProvidesAccountTrackingFactory(accountmodule, provider, provider1, provider2);
	//    0    0:new             #2   <Class AccountModule_ProvidesAccountTrackingFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #36  <Method void AccountModule_ProvidesAccountTrackingFactory(AccountModule, Provider, Provider, Provider)>
	//    7   11:areturn         
	}

	public static AccountTracking provideInstance(AccountModule accountmodule, Provider provider, Provider provider1, Provider provider2)
	{
		return proxyProvidesAccountTracking(accountmodule, (AppHelper)provider.get(), (EventContextProvider)provider1.get(), (TrackingQueue)provider2.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #45  <Method Object Provider.get()>
	//    3    7:checkcast       #47  <Class AppHelper>
	//    4   10:aload_2         
	//    5   11:invokeinterface #45  <Method Object Provider.get()>
	//    6   16:checkcast       #49  <Class EventContextProvider>
	//    7   19:aload_3         
	//    8   20:invokeinterface #45  <Method Object Provider.get()>
	//    9   25:checkcast       #51  <Class TrackingQueue>
	//   10   28:invokestatic    #55  <Method AccountTracking proxyProvidesAccountTracking(AccountModule, AppHelper, EventContextProvider, TrackingQueue)>
	//   11   31:areturn         
	}

	public static AccountTracking proxyProvidesAccountTracking(AccountModule accountmodule, AppHelper apphelper, EventContextProvider eventcontextprovider, TrackingQueue trackingqueue)
	{
		return (AccountTracking)Preconditions.checkNotNull(((Object) (accountmodule.providesAccountTracking(apphelper, eventcontextprovider, trackingqueue))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #62  <Method AccountTracking AccountModule.providesAccountTracking(AppHelper, EventContextProvider, TrackingQueue)>
	//    5    7:ldc1            #64  <String "Cannot return null from a non-@Nullable @Provides method">
	//    6    9:invokestatic    #70  <Method Object Preconditions.checkNotNull(Object, String)>
	//    7   12:checkcast       #72  <Class AccountTracking>
	//    8   15:areturn         
	}

	public AccountTracking get()
	{
		return provideInstance(module, appHelperProvider, eventContextProvider, trackingQueueProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AccountModule module>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Provider appHelperProvider>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Provider eventContextProvider>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field Provider trackingQueueProvider>
	//    8   16:invokestatic    #75  <Method AccountTracking provideInstance(AccountModule, Provider, Provider, Provider)>
	//    9   19:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method AccountTracking get()>
	//    2    4:areturn         
	}

	private final Provider appHelperProvider;
	private final Provider eventContextProvider;
	private final AccountModule module;
	private final Provider trackingQueueProvider;
}
