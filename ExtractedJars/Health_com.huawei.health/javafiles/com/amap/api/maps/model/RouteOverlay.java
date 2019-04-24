// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.autonavi.ae.gmap.gloverlay.BaseRouteOverlay;
import com.autonavi.ae.gmap.gloverlay.GLRouteProperty;

public class RouteOverlay
{

	public RouteOverlay(BaseRouteOverlay baserouteoverlay)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #13  <Field BaseRouteOverlay a>
		a = baserouteoverlay;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #13  <Field BaseRouteOverlay a>
	//    8   14:return          
	}

	public void addRouteItem(int i, GLRouteProperty aglrouteproperty[], boolean flag, long l, int j)
	{
		aglrouteproperty = ((GLRouteProperty []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field BaseRouteOverlay a>
	//    2    4:astore_2        
	//    3    5:return          
	}

	public void remove()
	{
		BaseRouteOverlay baserouteoverlay = a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field BaseRouteOverlay a>
	//    2    4:astore_1        
	//    3    5:return          
	}

	public void removeRouteName()
	{
		BaseRouteOverlay baserouteoverlay = a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field BaseRouteOverlay a>
	//    2    4:astore_1        
	//    3    5:return          
	}

	BaseRouteOverlay a;
}
