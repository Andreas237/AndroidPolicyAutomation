// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public class RoutePara
{

	public RoutePara()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int a>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field int b>
	//    8   14:return          
	}

	public int getDrivingRouteStyle()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int a>
	//    2    4:ireturn         
	}

	public String getEndName()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String f>
	//    2    4:areturn         
	}

	public LatLng getEndPoint()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field LatLng d>
	//    2    4:areturn         
	}

	public String getStartName()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String e>
	//    2    4:areturn         
	}

	public LatLng getStartPoint()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field LatLng c>
	//    2    4:areturn         
	}

	public int getTransitRouteStyle()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int b>
	//    2    4:ireturn         
	}

	public void setDrivingRouteStyle(int i)
	{
		if(i >= 0 && i < 9)
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:bipush          9
	//*   4    7:icmpge          15
			a = i;
	//    5   10:aload_0         
	//    6   11:iload_1         
	//    7   12:putfield        #19  <Field int a>
	//    8   15:return          
	}

	public void setEndName(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String f>
	//    3    5:return          
	}

	public void setEndPoint(LatLng latlng)
	{
		d = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field LatLng d>
	//    3    5:return          
	}

	public void setStartName(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String e>
	//    3    5:return          
	}

	public void setStartPoint(LatLng latlng)
	{
		c = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field LatLng c>
	//    3    5:return          
	}

	public void setTransitRouteStyle(int i)
	{
		if(i >= 0 && i < 6)
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:bipush          6
	//*   4    7:icmpge          15
			b = i;
	//    5   10:aload_0         
	//    6   11:iload_1         
	//    7   12:putfield        #21  <Field int b>
	//    8   15:return          
	}

	private int a;
	private int b;
	private LatLng c;
	private LatLng d;
	private String e;
	private String f;
}
