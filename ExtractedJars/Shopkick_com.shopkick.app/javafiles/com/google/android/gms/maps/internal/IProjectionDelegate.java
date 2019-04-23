// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public interface IProjectionDelegate
	extends IInterface
{

	public abstract LatLng fromScreenLocation(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract VisibleRegion getVisibleRegion()
		throws RemoteException;

	public abstract IObjectWrapper toScreenLocation(LatLng latlng)
		throws RemoteException;
}
