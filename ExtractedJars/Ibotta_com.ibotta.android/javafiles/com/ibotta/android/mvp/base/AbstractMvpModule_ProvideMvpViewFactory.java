// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

// Referenced classes of package com.ibotta.android.mvp.base:
//			AbstractMvpModule, MvpView

public final class AbstractMvpModule_ProvideMvpViewFactory
	implements Factory
{

	public AbstractMvpModule_ProvideMvpViewFactory(AbstractMvpModule abstractmvpmodule)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		module = abstractmvpmodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field AbstractMvpModule module>
	//    5    9:return          
	}

	public static AbstractMvpModule_ProvideMvpViewFactory create(AbstractMvpModule abstractmvpmodule)
	{
		return new AbstractMvpModule_ProvideMvpViewFactory(abstractmvpmodule);
	//    0    0:new             #2   <Class AbstractMvpModule_ProvideMvpViewFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void AbstractMvpModule_ProvideMvpViewFactory(AbstractMvpModule)>
	//    4    8:areturn         
	}

	public static MvpView provideInstance(AbstractMvpModule abstractmvpmodule)
	{
		return proxyProvideMvpView(abstractmvpmodule);
	//    0    0:aload_0         
	//    1    1:invokestatic    #30  <Method MvpView proxyProvideMvpView(AbstractMvpModule)>
	//    2    4:areturn         
	}

	public static MvpView proxyProvideMvpView(AbstractMvpModule abstractmvpmodule)
	{
		return (MvpView)Preconditions.checkNotNull(((Object) (abstractmvpmodule.provideMvpView())), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method MvpView AbstractMvpModule.provideMvpView()>
	//    2    4:ldc1            #39  <String "Cannot return null from a non-@Nullable @Provides method">
	//    3    6:invokestatic    #45  <Method Object Preconditions.checkNotNull(Object, String)>
	//    4    9:checkcast       #47  <Class MvpView>
	//    5   12:areturn         
	}

	public MvpView get()
	{
		return provideInstance(module);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AbstractMvpModule module>
	//    2    4:invokestatic    #50  <Method MvpView provideInstance(AbstractMvpModule)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method MvpView get()>
	//    2    4:areturn         
	}

	private final AbstractMvpModule module;
}
