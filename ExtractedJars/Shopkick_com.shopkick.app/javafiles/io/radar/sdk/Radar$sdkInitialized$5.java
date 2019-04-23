// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import io.radar.sdk.location.LocationManager;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

// Referenced classes of package io.radar.sdk:
//			Radar

final class Radar$sdkInitialized$5 extends MutablePropertyReference0
{

	public Object get()
	{
		return ((Object) (Radar.access$getLocationManager$p((Radar)receiver)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object receiver>
	//    2    4:checkcast       #27  <Class Radar>
	//    3    7:invokestatic    #31  <Method LocationManager Radar.access$getLocationManager$p(Radar)>
	//    4   10:areturn         
	}

	public String getName()
	{
		return "locationManager";
	//    0    0:ldc1            #36  <String "locationManager">
	//    1    2:areturn         
	}

	public KDeclarationContainer getOwner()
	{
		return ((KDeclarationContainer) (Reflection.getOrCreateKotlinClass(io/radar/sdk/Radar)));
	//    0    0:ldc1            #27  <Class Radar>
	//    1    2:invokestatic    #44  <Method kotlin.reflect.KClass Reflection.getOrCreateKotlinClass(Class)>
	//    2    5:areturn         
	}

	public String getSignature()
	{
		return "getLocationManager()Lio/radar/sdk/location/LocationManager;";
	//    0    0:ldc1            #47  <String "getLocationManager()Lio/radar/sdk/location/LocationManager;">
	//    1    2:areturn         
	}

	public void set(Object obj)
	{
		Radar.access$setLocationManager$p((Radar)receiver, (LocationManager)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object receiver>
	//    2    4:checkcast       #27  <Class Radar>
	//    3    7:aload_1         
	//    4    8:checkcast       #50  <Class LocationManager>
	//    5   11:invokestatic    #54  <Method void Radar.access$setLocationManager$p(Radar, LocationManager)>
	//    6   14:return          
	}

	Radar$sdkInitialized$5(Radar radar)
	{
		super(((Object) (radar)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void MutablePropertyReference0(Object)>
	//    3    5:return          
	}
}
