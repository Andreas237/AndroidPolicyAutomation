// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//			CameraPosition, LatLng

public static final class CameraPosition$Builder
{

	public final CameraPosition$Builder bearing(float f)
	{
		bearing = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #31  <Field float bearing>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CameraPosition build()
	{
		return new CameraPosition(target, zoom, tilt, bearing);
	//    0    0:new             #6   <Class CameraPosition>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field LatLng target>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field float zoom>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field float tilt>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field float bearing>
	//   10   20:invokespecial   #37  <Method void CameraPosition(LatLng, float, float, float)>
	//   11   23:areturn         
	}

	public final CameraPosition$Builder target(LatLng latlng)
	{
		target = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field LatLng target>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CameraPosition$Builder tilt(float f)
	{
		tilt = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #28  <Field float tilt>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final CameraPosition$Builder zoom(float f)
	{
		zoom = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #25  <Field float zoom>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private float bearing;
	private LatLng target;
	private float tilt;
	private float zoom;

	public CameraPosition$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public CameraPosition$Builder(CameraPosition cameraposition)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		target = cameraposition.target;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #21  <Field LatLng CameraPosition.target>
	//    5    9:putfield        #22  <Field LatLng target>
		zoom = cameraposition.zoom;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #24  <Field float CameraPosition.zoom>
	//    9   17:putfield        #25  <Field float zoom>
		tilt = cameraposition.tilt;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #27  <Field float CameraPosition.tilt>
	//   13   25:putfield        #28  <Field float tilt>
		bearing = cameraposition.bearing;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #30  <Field float CameraPosition.bearing>
	//   17   33:putfield        #31  <Field float bearing>
	//   18   36:return          
	}
}
