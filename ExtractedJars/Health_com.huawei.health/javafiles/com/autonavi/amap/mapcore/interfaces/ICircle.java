// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.LatLng;
import java.util.List;

// Referenced classes of package com.autonavi.amap.mapcore.interfaces:
//			IOverlay

public interface ICircle
	extends IOverlay
{

	public abstract boolean contains(LatLng latlng)
		throws RemoteException;

	public abstract LatLng getCenter()
		throws RemoteException;

	public abstract int getDottedLineType();

	public abstract int getFillColor()
		throws RemoteException;

	public abstract List getHoleOptions()
		throws RemoteException;

	public abstract double getRadius()
		throws RemoteException;

	public abstract int getStrokeColor()
		throws RemoteException;

	public abstract float getStrokeWidth()
		throws RemoteException;

	public abstract void setCenter(LatLng latlng)
		throws RemoteException;

	public abstract void setDottedLineType(int i);

	public abstract void setFillColor(int i)
		throws RemoteException;

	public abstract void setHoleOptions(List list)
		throws RemoteException;

	public abstract void setRadius(double d)
		throws RemoteException;

	public abstract void setStrokeColor(int i)
		throws RemoteException;

	public abstract void setStrokeWidth(float f)
		throws RemoteException;
}
