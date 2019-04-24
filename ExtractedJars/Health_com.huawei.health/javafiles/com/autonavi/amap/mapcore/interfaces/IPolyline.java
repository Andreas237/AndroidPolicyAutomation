// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.*;
import java.util.List;

// Referenced classes of package com.autonavi.amap.mapcore.interfaces:
//			IOverlay

public interface IPolyline
	extends IOverlay
{

	public abstract int getColor()
		throws RemoteException;

	public abstract LatLng getNearestLatLng(LatLng latlng);

	public abstract PolylineOptions getOptions();

	public abstract List getPoints()
		throws RemoteException;

	public abstract float getWidth()
		throws RemoteException;

	public abstract boolean isDottedLine();

	public abstract boolean isGeodesic();

	public abstract void setColor(int i)
		throws RemoteException;

	public abstract void setCustemTextureIndex(List list);

	public abstract void setCustomTexture(BitmapDescriptor bitmapdescriptor);

	public abstract void setDottedLine(boolean flag);

	public abstract void setGeodesic(boolean flag)
		throws RemoteException;

	public abstract void setOptions(PolylineOptions polylineoptions);

	public abstract void setPoints(List list)
		throws RemoteException;

	public abstract void setTransparency(float f);

	public abstract void setWidth(float f)
		throws RemoteException;
}
