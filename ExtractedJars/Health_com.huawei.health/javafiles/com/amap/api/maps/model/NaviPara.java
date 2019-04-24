// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public class NaviPara
{

	public NaviPara()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		a = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #33  <Field int a>
	//    5    9:return          
	}

	public int getNaviStyle()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int a>
	//    2    4:ireturn         
	}

	public LatLng getTargetPoint()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field LatLng b>
	//    2    4:areturn         
	}

	public void setNaviStyle(int i)
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
	//    7   12:putfield        #33  <Field int a>
	//    8   15:return          
	}

	public void setTargetPoint(LatLng latlng)
	{
		b = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field LatLng b>
	//    3    5:return          
	}

	public static final int DRIVING_AVOID_CONGESTION = 4;
	public static final int DRIVING_DEFAULT = 0;
	public static final int DRIVING_NO_HIGHWAY = 3;
	public static final int DRIVING_NO_HIGHWAY_AVOID_CONGESTION = 6;
	public static final int DRIVING_NO_HIGHWAY_AVOID_SHORT_MONEY = 5;
	public static final int DRIVING_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 8;
	public static final int DRIVING_SAVE_MONEY = 1;
	public static final int DRIVING_SAVE_MONEY_AVOID_CONGESTION = 7;
	public static final int DRIVING_SHORT_DISTANCE = 2;
	private int a;
	private LatLng b;
}
