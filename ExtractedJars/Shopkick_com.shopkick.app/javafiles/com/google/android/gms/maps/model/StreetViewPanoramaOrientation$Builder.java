// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.maps.model:
//			StreetViewPanoramaOrientation

public static final class StreetViewPanoramaOrientation$Builder
{

	public final StreetViewPanoramaOrientation$Builder bearing(float f)
	{
		bearing = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #28  <Field float bearing>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final StreetViewPanoramaOrientation build()
	{
		return new StreetViewPanoramaOrientation(tilt, bearing);
	//    0    0:new             #6   <Class StreetViewPanoramaOrientation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field float tilt>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field float bearing>
	//    6   12:invokespecial   #38  <Method void StreetViewPanoramaOrientation(float, float)>
	//    7   15:areturn         
	}

	public final StreetViewPanoramaOrientation$Builder tilt(float f)
	{
		tilt = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #31  <Field float tilt>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public float bearing;
	public float tilt;

	public StreetViewPanoramaOrientation$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public StreetViewPanoramaOrientation$Builder(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		Preconditions.checkNotNull(((Object) (streetviewpanoramaorientation)), "StreetViewPanoramaOrientation");
	//    2    4:aload_1         
	//    3    5:ldc1            #19  <String "StreetViewPanoramaOrientation">
	//    4    7:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		bearing = streetviewpanoramaorientation.bearing;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:getfield        #27  <Field float StreetViewPanoramaOrientation.bearing>
	//    9   16:putfield        #28  <Field float bearing>
		tilt = streetviewpanoramaorientation.tilt;
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:getfield        #30  <Field float StreetViewPanoramaOrientation.tilt>
	//   13   24:putfield        #31  <Field float tilt>
	//   14   27:return          
	}
}
