// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;

public interface IUiSettingsDelegate
	extends IInterface
{

	public abstract boolean isCompassEnabled()
		throws RemoteException;

	public abstract boolean isIndoorLevelPickerEnabled()
		throws RemoteException;

	public abstract boolean isMapToolbarEnabled()
		throws RemoteException;

	public abstract boolean isMyLocationButtonEnabled()
		throws RemoteException;

	public abstract boolean isRotateGesturesEnabled()
		throws RemoteException;

	public abstract boolean isScrollGesturesEnabled()
		throws RemoteException;

	public abstract boolean isTiltGesturesEnabled()
		throws RemoteException;

	public abstract boolean isZoomControlsEnabled()
		throws RemoteException;

	public abstract boolean isZoomGesturesEnabled()
		throws RemoteException;

	public abstract void setAllGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setCompassEnabled(boolean flag)
		throws RemoteException;

	public abstract void setIndoorLevelPickerEnabled(boolean flag)
		throws RemoteException;

	public abstract void setMapToolbarEnabled(boolean flag)
		throws RemoteException;

	public abstract void setMyLocationButtonEnabled(boolean flag)
		throws RemoteException;

	public abstract void setRotateGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setScrollGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setTiltGesturesEnabled(boolean flag)
		throws RemoteException;

	public abstract void setZoomControlsEnabled(boolean flag)
		throws RemoteException;

	public abstract void setZoomGesturesEnabled(boolean flag)
		throws RemoteException;
}
