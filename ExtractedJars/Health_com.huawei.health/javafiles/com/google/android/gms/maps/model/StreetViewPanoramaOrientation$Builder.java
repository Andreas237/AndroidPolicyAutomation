// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//			StreetViewPanoramaOrientation

public static final class StreetViewPanoramaOrientation$Builder
{

	public StreetViewPanoramaOrientation$Builder bearing(float f)
	{
		bearing = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #19  <Field float bearing>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public StreetViewPanoramaOrientation build()
	{
		return new StreetViewPanoramaOrientation(tilt, bearing);
	//    0    0:new             #6   <Class StreetViewPanoramaOrientation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field float tilt>
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field float bearing>
	//    6   12:invokespecial   #28  <Method void StreetViewPanoramaOrientation(float, float)>
	//    7   15:areturn         
	}

	public StreetViewPanoramaOrientation$Builder tilt(float f)
	{
		tilt = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #22  <Field float tilt>
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
		bearing = streetviewpanoramaorientation.bearing;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #18  <Field float StreetViewPanoramaOrientation.bearing>
	//    5    9:putfield        #19  <Field float bearing>
		tilt = streetviewpanoramaorientation.tilt;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #21  <Field float StreetViewPanoramaOrientation.tilt>
	//    9   17:putfield        #22  <Field float tilt>
	//   10   20:return          
	}
}
