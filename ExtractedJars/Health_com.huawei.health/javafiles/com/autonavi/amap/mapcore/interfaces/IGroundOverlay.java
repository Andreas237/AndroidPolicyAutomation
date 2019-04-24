// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.*;

// Referenced classes of package com.autonavi.amap.mapcore.interfaces:
//			IOverlay

public interface IGroundOverlay
	extends IOverlay
{

	public abstract float getBearing()
		throws RemoteException;

	public abstract LatLngBounds getBounds()
		throws RemoteException;

	public abstract float getHeight()
		throws RemoteException;

	public abstract LatLng getPosition()
		throws RemoteException;

	public abstract float getTransparency()
		throws RemoteException;

	public abstract float getWidth()
		throws RemoteException;

	public abstract void setBearing(float f)
		throws RemoteException;

	public abstract void setDimensions(float f)
		throws RemoteException;

	public abstract void setDimensions(float f, float f1)
		throws RemoteException;

	public abstract void setImage(BitmapDescriptor bitmapdescriptor)
		throws RemoteException;

	public abstract void setPosition(LatLng latlng)
		throws RemoteException;

	public abstract void setPositionFromBounds(LatLngBounds latlngbounds)
		throws RemoteException;

	public abstract void setTransparency(float f)
		throws RemoteException;
}
