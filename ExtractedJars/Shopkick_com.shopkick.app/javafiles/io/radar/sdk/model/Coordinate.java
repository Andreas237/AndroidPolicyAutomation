// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;


public final class Coordinate
{

	public Coordinate(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		latitude = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #31  <Field double latitude>
		longitude = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #33  <Field double longitude>
	//    8   14:return          
	}

	public final double getLatitude()
	{
		return latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field double latitude>
	//    2    4:dreturn         
	}

	public final double getLongitude()
	{
		return longitude;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field double longitude>
	//    2    4:dreturn         
	}

	private final double latitude;
	private final double longitude;
}
