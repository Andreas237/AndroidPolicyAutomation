// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.state;

import android.content.Context;
import io.radar.shadow.dagger.internal.Factory;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.sdk.state:
//			StateManager, StateManagerRepository

public final class StateManager_Factory
	implements Factory
{

	public StateManager_Factory(Provider provider, Provider provider1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		contextProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Provider contextProvider>
		stateManagerRepositoryProvider = provider1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Provider stateManagerRepositoryProvider>
	//    8   14:return          
	}

	public static StateManager_Factory create(Provider provider, Provider provider1)
	{
		return new StateManager_Factory(provider, provider1);
	//    0    0:new             #2   <Class StateManager_Factory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #28  <Method void StateManager_Factory(Provider, Provider)>
	//    5    9:areturn         
	}

	public static StateManager newStateManager(Context context, StateManagerRepository statemanagerrepository)
	{
		return new StateManager(context, statemanagerrepository);
	//    0    0:new             #33  <Class StateManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #36  <Method void StateManager(Context, StateManagerRepository)>
	//    5    9:areturn         
	}

	public static StateManager provideInstance(Provider provider, Provider provider1)
	{
		return new StateManager((Context)provider.get(), (StateManagerRepository)provider1.get());
	//    0    0:new             #33  <Class StateManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #44  <Method Object Provider.get()>
	//    4   10:checkcast       #46  <Class Context>
	//    5   13:aload_1         
	//    6   14:invokeinterface #44  <Method Object Provider.get()>
	//    7   19:checkcast       #48  <Class StateManagerRepository>
	//    8   22:invokespecial   #36  <Method void StateManager(Context, StateManagerRepository)>
	//    9   25:areturn         
	}

	public StateManager get()
	{
		return provideInstance(contextProvider, stateManagerRepositoryProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Provider contextProvider>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Provider stateManagerRepositoryProvider>
	//    4    8:invokestatic    #52  <Method StateManager provideInstance(Provider, Provider)>
	//    5   11:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method StateManager get()>
	//    2    4:areturn         
	}

	private final Provider contextProvider;
	private final Provider stateManagerRepositoryProvider;
}
