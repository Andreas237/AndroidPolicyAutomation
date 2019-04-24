// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;


public interface ITileOverlay
{

	public abstract void clearTileCache();

	public abstract void destroy(boolean flag);

	public abstract boolean equalsRemote(ITileOverlay itileoverlay);

	public abstract String getId();

	public abstract float getZIndex();

	public abstract int hashCodeRemote();

	public abstract boolean isVisible();

	public abstract void remove();

	public abstract void setVisible(boolean flag);

	public abstract void setZIndex(float f);
}
