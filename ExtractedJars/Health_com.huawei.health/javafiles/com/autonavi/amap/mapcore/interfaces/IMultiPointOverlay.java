// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.MultiPointItem;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import java.util.List;

public interface IMultiPointOverlay
{

	public abstract void addItem(MultiPointItem multipointitem);

	public abstract void addItems(List list);

	public abstract void destroy(boolean flag);

	public abstract void draw(MapConfig mapconfig, float af[], float af1[]);

	public abstract String getId()
		throws RemoteException;

	public abstract MultiPointItem onClick(IPoint ipoint);

	public abstract void remove(boolean flag);

	public abstract void setAnchor(float f, float f1);

	public abstract void setVisible(boolean flag);
}
