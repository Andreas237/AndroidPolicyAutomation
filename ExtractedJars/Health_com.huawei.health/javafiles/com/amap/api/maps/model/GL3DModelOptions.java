// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amap.api.maps.model:
//			LatLng, BitmapDescriptor

public class GL3DModelOptions
{

	public GL3DModelOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		c = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field List c>
		d = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #22  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #23  <Method void ArrayList()>
	//   11   23:putfield        #27  <Field List d>
	//   12   26:return          
	}

	public GL3DModelOptions angle(float f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public float getAngle()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float a>
	//    2    4:freturn         
	}

	public BitmapDescriptor getBitmapDescriptor()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BitmapDescriptor e>
	//    2    4:areturn         
	}

	public LatLng getLatLng()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field LatLng b>
	//    2    4:areturn         
	}

	public int getModelFixedLength()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int f>
	//    2    4:ireturn         
	}

	public List getTextrue()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List d>
	//    2    4:areturn         
	}

	public List getVertext()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List c>
	//    2    4:areturn         
	}

	public GL3DModelOptions position(LatLng latlng)
	{
		b = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field LatLng b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GL3DModelOptions setModelFixedLength(int i)
	{
		f = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field int f>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GL3DModelOptions textureDrawable(BitmapDescriptor bitmapdescriptor)
	{
		e = bitmapdescriptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field BitmapDescriptor e>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GL3DModelOptions vertexData(List list, List list1)
	{
		c = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field List c>
		d = list1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field List d>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private float a;
	private LatLng b;
	private List c;
	private List d;
	private BitmapDescriptor e;
	private int f;
}
