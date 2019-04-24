// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public abstract class BasePointOverlay
{

	public BasePointOverlay()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void destroy();

	public abstract String getId();

	public abstract Object getObject();

	public abstract LatLng getPosition();

	public abstract float getRotateAngle();

	public abstract String getSnippet();

	public abstract String getTitle();

	public abstract boolean isVisible();

	public abstract void remove();

	public abstract void setAnimation(Animation animation);

	public abstract void setGeoPoint(IPoint ipoint);

	public abstract void setObject(Object obj);

	public abstract void setPosition(LatLng latlng);

	public abstract void setRotateAngle(float f);

	public abstract void setSnippet(String s);

	public abstract void setTitle(String s);

	public abstract void setVisible(boolean flag);

	public abstract void showInfoWindow();

	public abstract boolean startAnimation();
}
