// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.model:
//			RadarGeofenceGeometry, Coordinate

public final class RadarCircleGeometry extends RadarGeofenceGeometry
{

	public RadarCircleGeometry(Coordinate coordinate, double d)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (coordinate)), "center");
	//    0    0:aload_1         
	//    1    1:ldc1            #31  <String "center">
	//    2    3:invokestatic    #37  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:invokespecial   #40  <Method void RadarGeofenceGeometry(kotlin.jvm.internal.DefaultConstructorMarker)>
		center = coordinate;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #42  <Field Coordinate center>
		radius = d;
	//    9   16:aload_0         
	//   10   17:dload_2         
	//   11   18:putfield        #44  <Field double radius>
	//   12   21:return          
	}

	public final Coordinate getCenter()
	{
		return center;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Coordinate center>
	//    2    4:areturn         
	}

	public final double getRadius()
	{
		return radius;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field double radius>
	//    2    4:dreturn         
	}

	private final Coordinate center;
	private final double radius;
}
