// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.maps.model:
//			StreetViewPanoramaCamera, StreetViewPanoramaOrientation

public static final class StreetViewPanoramaCamera$Builder
{

	public final StreetViewPanoramaCamera$Builder bearing(float f)
	{
		bearing = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float bearing>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final StreetViewPanoramaCamera build()
	{
		return new StreetViewPanoramaCamera(zoom, tilt, bearing);
	//    0    0:new             #6   <Class StreetViewPanoramaCamera>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field float zoom>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field float tilt>
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field float bearing>
	//    8   16:invokespecial   #42  <Method void StreetViewPanoramaCamera(float, float, float)>
	//    9   19:areturn         
	}

	public final StreetViewPanoramaCamera$Builder orientation(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		Preconditions.checkNotNull(((Object) (streetviewpanoramaorientation)), "StreetViewPanoramaOrientation");
	//    0    0:aload_1         
	//    1    1:ldc1            #46  <String "StreetViewPanoramaOrientation">
	//    2    3:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		tilt = streetviewpanoramaorientation.tilt;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:getfield        #49  <Field float StreetViewPanoramaOrientation.tilt>
	//    7   12:putfield        #35  <Field float tilt>
		bearing = streetviewpanoramaorientation.bearing;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #50  <Field float StreetViewPanoramaOrientation.bearing>
	//   11   20:putfield        #32  <Field float bearing>
		return this;
	//   12   23:aload_0         
	//   13   24:areturn         
	}

	public final StreetViewPanoramaCamera$Builder tilt(float f)
	{
		tilt = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #35  <Field float tilt>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final StreetViewPanoramaCamera$Builder zoom(float f)
	{
		zoom = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #29  <Field float zoom>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public float bearing;
	public float tilt;
	public float zoom;

	public StreetViewPanoramaCamera$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public StreetViewPanoramaCamera$Builder(StreetViewPanoramaCamera streetviewpanoramacamera)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		Preconditions.checkNotNull(((Object) (streetviewpanoramacamera)), "StreetViewPanoramaCamera");
	//    2    4:aload_1         
	//    3    5:ldc1            #20  <String "StreetViewPanoramaCamera">
	//    4    7:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		zoom = streetviewpanoramacamera.zoom;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:getfield        #28  <Field float StreetViewPanoramaCamera.zoom>
	//    9   16:putfield        #29  <Field float zoom>
		bearing = streetviewpanoramacamera.bearing;
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:getfield        #31  <Field float StreetViewPanoramaCamera.bearing>
	//   13   24:putfield        #32  <Field float bearing>
		tilt = streetviewpanoramacamera.tilt;
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:getfield        #34  <Field float StreetViewPanoramaCamera.tilt>
	//   17   32:putfield        #35  <Field float tilt>
	//   18   35:return          
	}
}
