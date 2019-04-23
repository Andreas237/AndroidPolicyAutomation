// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.model:
//			RadarGeofenceGeometry, Coordinate

public final class RadarPolygonGeometry extends RadarGeofenceGeometry
{

	public RadarPolygonGeometry(Coordinate acoordinate[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (acoordinate)), "coordinates");
	//    0    0:aload_1         
	//    1    1:ldc1            #28  <String "coordinates">
	//    2    3:invokestatic    #34  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:invokespecial   #37  <Method void RadarGeofenceGeometry(kotlin.jvm.internal.DefaultConstructorMarker)>
		coordinates = acoordinate;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #39  <Field Coordinate[] coordinates>
	//    9   16:return          
	}

	public final Coordinate[] getCoordinates()
	{
		return coordinates;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Coordinate[] coordinates>
	//    2    4:areturn         
	}

	private final Coordinate coordinates[];
}
