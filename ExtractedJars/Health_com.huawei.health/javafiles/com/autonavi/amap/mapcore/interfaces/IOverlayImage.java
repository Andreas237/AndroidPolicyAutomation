// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.LatLng;

public interface IOverlayImage
{

	public abstract void destroy(boolean flag);

	public abstract boolean equalsRemote(IOverlayImage ioverlayimage)
		throws RemoteException;

	public abstract float getAnchorU();

	public abstract float getAnchorV();

	public abstract String getId()
		throws RemoteException;

	public abstract Object getObject();

	public abstract LatLng getPosition()
		throws RemoteException;

	public abstract float getRotateAngle();

	public abstract float getZIndex();

	public abstract int hashCodeRemote();

	public abstract boolean isVisible()
		throws RemoteException;

	public abstract boolean remove()
		throws RemoteException;

	public abstract void setAnchor(float f, float f1)
		throws RemoteException;

	public abstract void setObject(Object obj);

	public abstract void setPosition(LatLng latlng)
		throws RemoteException;

	public abstract void setRotateAngle(float f)
		throws RemoteException;

	public abstract void setVisible(boolean flag)
		throws RemoteException;

	public abstract void setZIndex(float f);
}
