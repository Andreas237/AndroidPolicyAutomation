// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.listener;


public interface AMapWidgetListener
{

	public abstract void invalidateCompassView();

	public abstract void invalidateScaleView();

	public abstract void invalidateZoomController(float f);

	public abstract void setFrontViewVisibility(boolean flag);
}
