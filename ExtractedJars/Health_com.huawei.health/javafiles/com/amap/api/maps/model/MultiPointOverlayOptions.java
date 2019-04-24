// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


// Referenced classes of package com.amap.api.maps.model:
//			BitmapDescriptor

public class MultiPointOverlayOptions
{

	public MultiPointOverlayOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		b = 0.5F;
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <Float 0.5F>
	//    4    7:putfield        #16  <Field float b>
		c = 0.5F;
	//    5   10:aload_0         
	//    6   11:ldc1            #14  <Float 0.5F>
	//    7   13:putfield        #18  <Field float c>
	//    8   16:return          
	}

	public MultiPointOverlayOptions anchor(float f, float f1)
	{
		b = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #16  <Field float b>
		c = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #18  <Field float c>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public float getAnchorU()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float b>
	//    2    4:freturn         
	}

	public float getAnchorV()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field float c>
	//    2    4:freturn         
	}

	public BitmapDescriptor getIcon()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field BitmapDescriptor a>
	//    2    4:areturn         
	}

	public MultiPointOverlayOptions icon(BitmapDescriptor bitmapdescriptor)
	{
		a = bitmapdescriptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field BitmapDescriptor a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private BitmapDescriptor a;
	private float b;
	private float c;
}
