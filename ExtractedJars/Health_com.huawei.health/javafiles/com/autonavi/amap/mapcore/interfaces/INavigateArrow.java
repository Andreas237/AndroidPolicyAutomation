// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.autonavi.amap.mapcore.interfaces:
//			IOverlay

public interface INavigateArrow
	extends IOverlay
{

	public abstract List getPoints()
		throws RemoteException;

	public abstract int getSideColor()
		throws RemoteException;

	public abstract int getTopColor()
		throws RemoteException;

	public abstract float getWidth()
		throws RemoteException;

	public abstract void setPoints(List list)
		throws RemoteException;

	public abstract void setSideColor(int i)
		throws RemoteException;

	public abstract void setTopColor(int i)
		throws RemoteException;

	public abstract void setWidth(float f)
		throws RemoteException;
}
