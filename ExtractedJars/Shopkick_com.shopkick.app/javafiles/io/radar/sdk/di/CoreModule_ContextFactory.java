// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.di;

import android.content.Context;
import io.radar.shadow.dagger.internal.Factory;
import io.radar.shadow.dagger.internal.Preconditions;

// Referenced classes of package io.radar.sdk.di:
//			CoreModule

public final class CoreModule_ContextFactory
	implements Factory
{

	public CoreModule_ContextFactory(CoreModule coremodule)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		module = coremodule;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field CoreModule module>
	//    5    9:return          
	}

	public static CoreModule_ContextFactory create(CoreModule coremodule)
	{
		return new CoreModule_ContextFactory(coremodule);
	//    0    0:new             #2   <Class CoreModule_ContextFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #21  <Method void CoreModule_ContextFactory(CoreModule)>
	//    4    8:areturn         
	}

	public static Context provideInstance(CoreModule coremodule)
	{
		return proxyContext(coremodule);
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method Context proxyContext(CoreModule)>
	//    2    4:areturn         
	}

	public static Context proxyContext(CoreModule coremodule)
	{
		return (Context)Preconditions.checkNotNull(((Object) (coremodule.context())), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method Context CoreModule.context()>
	//    2    4:ldc1            #34  <String "Cannot return null from a non-@Nullable @Provides method">
	//    3    6:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object, String)>
	//    4    9:checkcast       #42  <Class Context>
	//    5   12:areturn         
	}

	public Context get()
	{
		return provideInstance(module);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CoreModule module>
	//    2    4:invokestatic    #45  <Method Context provideInstance(CoreModule)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method Context get()>
	//    2    4:areturn         
	}

	private final CoreModule module;
}
