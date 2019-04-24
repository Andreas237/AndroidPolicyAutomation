// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public class PoiPara
{

	public PoiPara()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public LatLng getCenter()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LatLng a>
	//    2    4:areturn         
	}

	public String getKeywords()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String b>
	//    2    4:areturn         
	}

	public void setCenter(LatLng latlng)
	{
		a = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LatLng a>
	//    3    5:return          
	}

	public void setKeywords(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String b>
	//    3    5:return          
	}

	private LatLng a;
	private String b;
}
