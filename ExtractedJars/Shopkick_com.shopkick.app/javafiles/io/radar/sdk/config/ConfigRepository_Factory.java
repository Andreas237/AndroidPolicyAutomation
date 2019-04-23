// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.config;

import android.content.Context;
import io.radar.shadow.dagger.internal.Factory;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.sdk.config:
//			ConfigRepository

public final class ConfigRepository_Factory
	implements Factory
{

	public ConfigRepository_Factory(Provider provider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		contextProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Provider contextProvider>
	//    5    9:return          
	}

	public static ConfigRepository_Factory create(Provider provider)
	{
		return new ConfigRepository_Factory(provider);
	//    0    0:new             #2   <Class ConfigRepository_Factory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void ConfigRepository_Factory(Provider)>
	//    4    8:areturn         
	}

	public static ConfigRepository newConfigRepository(Context context)
	{
		return new ConfigRepository(context);
	//    0    0:new             #29  <Class ConfigRepository>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #32  <Method void ConfigRepository(Context)>
	//    4    8:areturn         
	}

	public static ConfigRepository provideInstance(Provider provider)
	{
		return new ConfigRepository((Context)provider.get());
	//    0    0:new             #29  <Class ConfigRepository>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #40  <Method Object Provider.get()>
	//    4   10:checkcast       #42  <Class Context>
	//    5   13:invokespecial   #32  <Method void ConfigRepository(Context)>
	//    6   16:areturn         
	}

	public ConfigRepository get()
	{
		return provideInstance(contextProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Provider contextProvider>
	//    2    4:invokestatic    #46  <Method ConfigRepository provideInstance(Provider)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method ConfigRepository get()>
	//    2    4:areturn         
	}

	private final Provider contextProvider;
}
