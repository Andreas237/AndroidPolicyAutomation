// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//			StreetViewPanoramaCamera, StreetViewPanoramaOrientation

public static final class StreetViewPanoramaCamera$Builder
{

	public StreetViewPanoramaCamera$Builder bearing(float f)
	{
		bearing = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #23  <Field float bearing>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public StreetViewPanoramaCamera build()
	{
		return new StreetViewPanoramaCamera(zoom, tilt, bearing);
	//    0    0:new             #6   <Class StreetViewPanoramaCamera>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field float zoom>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field float tilt>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field float bearing>
	//    8   16:invokespecial   #32  <Method void StreetViewPanoramaCamera(float, float, float)>
	//    9   19:areturn         
	}

	public StreetViewPanoramaCamera$Builder orientation(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		tilt = streetviewpanoramaorientation.tilt;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #37  <Field float StreetViewPanoramaOrientation.tilt>
	//    3    5:putfield        #26  <Field float tilt>
		bearing = streetviewpanoramaorientation.bearing;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #38  <Field float StreetViewPanoramaOrientation.bearing>
	//    7   13:putfield        #23  <Field float bearing>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public StreetViewPanoramaCamera$Builder tilt(float f)
	{
		tilt = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #26  <Field float tilt>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public StreetViewPanoramaCamera$Builder zoom(float f)
	{
		zoom = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #20  <Field float zoom>
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
		zoom = streetviewpanoramacamera.zoom;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #19  <Field float StreetViewPanoramaCamera.zoom>
	//    5    9:putfield        #20  <Field float zoom>
		bearing = streetviewpanoramacamera.bearing;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #22  <Field float StreetViewPanoramaCamera.bearing>
	//    9   17:putfield        #23  <Field float bearing>
		tilt = streetviewpanoramacamera.tilt;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #25  <Field float StreetViewPanoramaCamera.tilt>
	//   13   25:putfield        #26  <Field float tilt>
	//   14   28:return          
	}
}
