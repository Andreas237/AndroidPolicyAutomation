// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.di;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import io.radar.shadow.dagger.internal.Factory;
import io.radar.shadow.dagger.internal.Preconditions;
import io.radar.shadow.javax.inject.Provider;

// Referenced classes of package io.radar.sdk.di:
//			LocationModule

public final class LocationModule_LocationClientFactory
	implements Factory
{

	public LocationModule_LocationClientFactory(Provider provider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		contextProvider = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Provider contextProvider>
	//    5    9:return          
	}

	public static LocationModule_LocationClientFactory create(Provider provider)
	{
		return new LocationModule_LocationClientFactory(provider);
	//    0    0:new             #2   <Class LocationModule_LocationClientFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void LocationModule_LocationClientFactory(Provider)>
	//    4    8:areturn         
	}

	public static FusedLocationProviderClient provideInstance(Provider provider)
	{
		return proxyLocationClient((Context)provider.get());
	//    0    0:aload_0         
	//    1    1:invokeinterface #33  <Method Object Provider.get()>
	//    2    6:checkcast       #35  <Class Context>
	//    3    9:invokestatic    #39  <Method FusedLocationProviderClient proxyLocationClient(Context)>
	//    4   12:areturn         
	}

	public static FusedLocationProviderClient proxyLocationClient(Context context)
	{
		return (FusedLocationProviderClient)Preconditions.checkNotNull(((Object) (LocationModule.locationClient(context))), "Cannot return null from a non-@Nullable @Provides method");
	//    0    0:aload_0         
	//    1    1:invokestatic    #45  <Method FusedLocationProviderClient LocationModule.locationClient(Context)>
	//    2    4:ldc1            #47  <String "Cannot return null from a non-@Nullable @Provides method">
	//    3    6:invokestatic    #53  <Method Object Preconditions.checkNotNull(Object, String)>
	//    4    9:checkcast       #55  <Class FusedLocationProviderClient>
	//    5   12:areturn         
	}

	public FusedLocationProviderClient get()
	{
		return provideInstance(contextProvider);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Provider contextProvider>
	//    2    4:invokestatic    #58  <Method FusedLocationProviderClient provideInstance(Provider)>
	//    3    7:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method FusedLocationProviderClient get()>
	//    2    4:areturn         
	}

	private final Provider contextProvider;
}
