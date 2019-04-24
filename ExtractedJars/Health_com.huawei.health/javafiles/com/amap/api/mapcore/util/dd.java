// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.RemoteException;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IOverlay;

public interface dd
	extends IOverlay
{

	public abstract void a(MapConfig mapconfig)
		throws RemoteException;

	public abstract boolean a();

	public abstract boolean c();
}
