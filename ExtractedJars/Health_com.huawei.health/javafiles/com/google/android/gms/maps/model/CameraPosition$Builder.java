// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//			CameraPosition, LatLng

public static final class CameraPosition$Builder
{

	public CameraPosition$Builder bearing(float f)
	{
		zzbpd = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #39  <Field float zzbpd>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CameraPosition build()
	{
		return new CameraPosition(zzbpa, zzbpb, zzbpc, zzbpd);
	//    0    0:new             #6   <Class CameraPosition>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field LatLng zzbpa>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field float zzbpb>
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field float zzbpc>
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field float zzbpd>
	//   10   20:invokespecial   #45  <Method void CameraPosition(LatLng, float, float, float)>
	//   11   23:areturn         
	}

	public CameraPosition$Builder target(LatLng latlng)
	{
		zzbpa = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field LatLng zzbpa>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CameraPosition$Builder tilt(float f)
	{
		zzbpc = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #34  <Field float zzbpc>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CameraPosition$Builder zoom(float f)
	{
		zzbpb = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #29  <Field float zzbpb>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private LatLng zzbpa;
	private float zzbpb;
	private float zzbpc;
	private float zzbpd;

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
		zzbpa = cameraposition.target;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #22  <Field LatLng CameraPosition.target>
	//    5    9:putfield        #24  <Field LatLng zzbpa>
		zzbpb = cameraposition.zoom;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #27  <Field float CameraPosition.zoom>
	//    9   17:putfield        #29  <Field float zzbpb>
		zzbpc = cameraposition.tilt;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #32  <Field float CameraPosition.tilt>
	//   13   25:putfield        #34  <Field float zzbpc>
		zzbpd = cameraposition.bearing;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #37  <Field float CameraPosition.bearing>
	//   17   33:putfield        #39  <Field float zzbpd>
	//   18   36:return          
	}
}
