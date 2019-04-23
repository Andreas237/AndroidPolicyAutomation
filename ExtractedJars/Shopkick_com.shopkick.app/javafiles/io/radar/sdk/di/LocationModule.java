// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.di;

import android.content.Context;
import com.google.android.gms.location.*;
import kotlin.jvm.internal.Intrinsics;

public final class LocationModule
{

	private LocationModule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	public static final GeofencingClient geofencingClient(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "context">
	//    2    3:invokestatic    #47  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		context = ((Context) (LocationServices.getGeofencingClient(context)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #52  <Method GeofencingClient LocationServices.getGeofencingClient(Context)>
	//    5   10:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "LocationServices.getGeofencingClient(context)");
	//    6   11:aload_0         
	//    7   12:ldc1            #54  <String "LocationServices.getGeofencingClient(context)">
	//    8   14:invokestatic    #57  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((GeofencingClient) (context));
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public static final FusedLocationProviderClient locationClient(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "context">
	//    2    3:invokestatic    #47  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		context = ((Context) (LocationServices.getFusedLocationProviderClient(context)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #64  <Method FusedLocationProviderClient LocationServices.getFusedLocationProviderClient(Context)>
	//    5   10:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "LocationServices.getFuse\u2026onProviderClient(context)");
	//    6   11:aload_0         
	//    7   12:ldc1            #66  <String "LocationServices.getFuse\u2026onProviderClient(context)">
	//    8   14:invokestatic    #57  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((FusedLocationProviderClient) (context));
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public static final LocationModule INSTANCE = new LocationModule();

	static 
	{
	//    0    0:new             #2   <Class LocationModule>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void LocationModule()>
	//    3    7:putstatic       #33  <Field LocationModule INSTANCE>
	//*   4   10:return          
	}
}
