// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import com.amap.api.maps.model.*;

public interface IProjection
{

	public abstract TileProjection fromBoundsToTile(LatLngBounds latlngbounds, int i, int j)
		throws RemoteException;

	public abstract LatLng fromScreenLocation(Point point)
		throws RemoteException;

	public abstract AMapCameraInfo getCameraInfo();

	public abstract LatLngBounds getMapBounds(LatLng latlng, float f)
		throws RemoteException;

	public abstract VisibleRegion getVisibleRegion()
		throws RemoteException;

	public abstract float toMapLenWithWin(int i)
		throws RemoteException;

	public abstract PointF toMapLocation(LatLng latlng)
		throws RemoteException;

	public abstract Point toScreenLocation(LatLng latlng)
		throws RemoteException;
}
