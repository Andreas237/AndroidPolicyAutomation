// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;

public interface IMarkerAction
{

	public abstract float getAlpha();

	public abstract int getDisplayLevel();

	public abstract MarkerOptions getOptions();

	public abstract boolean isClickable();

	public abstract boolean isInfoWindowAutoOverturn();

	public abstract boolean isInfoWindowEnable();

	public abstract void setAlpha(float f);

	public abstract void setAutoOverturnInfoWindow(boolean flag);

	public abstract void setClickable(boolean flag);

	public abstract void setDisplayLevel(int i);

	public abstract void setFixingPointEnable(boolean flag);

	public abstract void setInfoWindowEnable(boolean flag);

	public abstract void setMarkerOptions(MarkerOptions markeroptions);

	public abstract void setPositionNotUpdate(LatLng latlng);

	public abstract void setRotateAngleNotUpdate(float f);

	public abstract void setSnippet(String s);

	public abstract void setTitle(String s);
}
