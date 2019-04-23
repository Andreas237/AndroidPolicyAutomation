// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;

import android.location.Location;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class RadarState
{

	private RadarState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public RadarState(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void RadarState()>
	//    2    4:return          
	}

	public abstract Location getLocation();
}
