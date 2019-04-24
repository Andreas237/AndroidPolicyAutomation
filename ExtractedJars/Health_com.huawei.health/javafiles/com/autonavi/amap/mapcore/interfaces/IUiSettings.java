// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;

public interface IUiSettings
{

	public abstract float getLogoMarginRate(int i)
		throws RemoteException;

	public abstract int getLogoPosition()
		throws RemoteException;

	public abstract int getZoomPosition()
		throws RemoteException;

	public abstract boolean isCompassEnabled()
		throws RemoteException;

	public abstract boolean isGestureScaleByMapCenter()
		throws RemoteException;

	public abstract boolean isIndoorSwitchEnabled()
		throws RemoteException;

	public abstract boolean isLogoEnable();

	public abstract boolean isMyLocationButtonEnabled()
		throws RemoteException;

	public abstract boolean isRotateGesturesEnabled()
		throws RemoteException;

	public abstract boolean isScaleControlsEnabled()
		throws RemoteException;

	public abstract boolean isScrollGesturesEnabled()
		throws RemoteException;

	public abstract boolean isTiltGesturesEnabled()
		throws RemoteException;

	public abstract boolean isZoomControlsEnabled()
		throws RemoteException;

	public abstract boolean isZoomGesturesEnabled()
		throws RemoteException;

	public abstract boolean isZoomInByScreenCenter()
		throws RemoteException;

	public abstract void setAllGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setCompassEnabled(boolean flag)
		throws RemoteException;

	public abstract void setGestureScaleByMapCenter(boolean flag)
		throws RemoteException;

	public abstract void setIndoorSwitchEnabled(boolean flag)
		throws RemoteException;

	public abstract void setLogoBottomMargin(int i)
		throws RemoteException;

	public abstract void setLogoEnable(boolean flag);

	public abstract void setLogoLeftMargin(int i)
		throws RemoteException;

	public abstract void setLogoMarginRate(int i, float f)
		throws RemoteException;

	public abstract void setLogoPosition(int i)
		throws RemoteException;

	public abstract void setMyLocationButtonEnabled(boolean flag)
		throws RemoteException;

	public abstract void setRotateGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setScaleControlsEnabled(boolean flag)
		throws RemoteException;

	public abstract void setScrollGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setTiltGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setZoomControlsEnabled(boolean flag)
		throws RemoteException;

	public abstract void setZoomGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setZoomInByScreenCenter(boolean flag)
		throws RemoteException;

	public abstract void setZoomPosition(int i)
		throws RemoteException;
}
