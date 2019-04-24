// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


public interface AMapGestureListener
{

	public abstract void onDoubleTap(float f, float f1);

	public abstract void onDown(float f, float f1);

	public abstract void onFling(float f, float f1);

	public abstract void onLongPress(float f, float f1);

	public abstract void onMapStable();

	public abstract void onScroll(float f, float f1);

	public abstract void onSingleTap(float f, float f1);

	public abstract void onUp(float f, float f1);
}
