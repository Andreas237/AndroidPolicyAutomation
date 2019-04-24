// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;

public interface IOverlay
{

	public abstract void destroy();

	public abstract boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException;

	public abstract String getId()
		throws RemoteException;

	public abstract float getZIndex()
		throws RemoteException;

	public abstract int hashCodeRemote()
		throws RemoteException;

	public abstract boolean isAboveMaskLayer();

	public abstract boolean isVisible()
		throws RemoteException;

	public abstract void remove()
		throws RemoteException;

	public abstract void setAboveMaskLayer(boolean flag);

	public abstract void setVisible(boolean flag)
		throws RemoteException;

	public abstract void setZIndex(float f)
		throws RemoteException;
}
