// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.*;

public interface ICameraUpdateFactoryDelegate
	extends IInterface
{

	public abstract IObjectWrapper newCameraPosition(CameraPosition cameraposition)
		throws RemoteException;

	public abstract IObjectWrapper newLatLng(LatLng latlng)
		throws RemoteException;

	public abstract IObjectWrapper newLatLngBounds(LatLngBounds latlngbounds, int i)
		throws RemoteException;

	public abstract IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latlngbounds, int i, int j, int k)
		throws RemoteException;

	public abstract IObjectWrapper newLatLngZoom(LatLng latlng, float f)
		throws RemoteException;

	public abstract IObjectWrapper scrollBy(float f, float f1)
		throws RemoteException;

	public abstract IObjectWrapper zoomBy(float f)
		throws RemoteException;

	public abstract IObjectWrapper zoomByWithFocus(float f, int i, int j)
		throws RemoteException;

	public abstract IObjectWrapper zoomIn()
		throws RemoteException;

	public abstract IObjectWrapper zoomOut()
		throws RemoteException;

	public abstract IObjectWrapper zoomTo(float f)
		throws RemoteException;
}
