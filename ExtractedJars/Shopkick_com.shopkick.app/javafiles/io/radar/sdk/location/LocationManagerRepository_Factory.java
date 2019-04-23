// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.location;

import android.content.Context;
import io.radar.shadow.dagger.internal.Factory;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.sdk.location:
//			LocationManagerRepository

public final class LocationManagerRepository_Factory
	implements Factory
{

	public LocationManagerRepository_Factory(Provider provider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		contextProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Provider contextProvider>
	//    5    9:return          
	}

	public static LocationManagerRepository_Factory create(Provider provider)
	{
		return new LocationManagerRepository_Factory(provider);
	//    0    0:new             #2   <Class LocationManagerRepository_Factory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void LocationManagerRepository_Factory(Provider)>
	//    4    8:areturn         
	}

	public static LocationManagerRepository newLocationManagerRepository(Context context)
	{
		return new LocationManagerRepository(context);
	//    0    0:new             #29  <Class LocationManagerRepository>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #32  <Method void LocationManagerRepository(Context)>
	//    4    8:areturn         
	}

	public static LocationManagerRepository provideInstance(Provider provider)
	{
		return new LocationManagerRepository((Context)provider.get());
	//    0    0:new             #29  <Class LocationManagerRepository>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #40  <Method Object Provider.get()>
	//    4   10:checkcast       #42  <Class Context>
	//    5   13:invokespecial   #32  <Method void LocationManagerRepository(Context)>
	//    6   16:areturn         
	}

	public LocationManagerRepository get()
	{
		return provideInstance(contextProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Provider contextProvider>
	//    2    4:invokestatic    #46  <Method LocationManagerRepository provideInstance(Provider)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method LocationManagerRepository get()>
	//    2    4:areturn         
	}

	private final Provider contextProvider;
}
