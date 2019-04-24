// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;

// Referenced classes of package com.autonavi.amap.mapcore.interfaces:
//			IOverlay

public interface IArc
	extends IOverlay
{

	public abstract int getStrokeColor()
		throws RemoteException;

	public abstract float getStrokeWidth()
		throws RemoteException;

	public abstract void setStrokeColor(int i)
		throws RemoteException;

	public abstract void setStrokeWidth(float f)
		throws RemoteException;
}
