// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.*;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzbh, zzbj, zzbl, zzbn

public interface IStreetViewPanoramaDelegate
	extends IInterface
{

	public abstract void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
		throws RemoteException;

	public abstract void enablePanning(boolean flag)
		throws RemoteException;

	public abstract void enableStreetNames(boolean flag)
		throws RemoteException;

	public abstract void enableUserNavigation(boolean flag)
		throws RemoteException;

	public abstract void enableZoom(boolean flag)
		throws RemoteException;

	public abstract StreetViewPanoramaCamera getPanoramaCamera()
		throws RemoteException;

	public abstract StreetViewPanoramaLocation getStreetViewPanoramaLocation()
		throws RemoteException;

	public abstract boolean isPanningGesturesEnabled()
		throws RemoteException;

	public abstract boolean isStreetNamesEnabled()
		throws RemoteException;

	public abstract boolean isUserNavigationEnabled()
		throws RemoteException;

	public abstract boolean isZoomGesturesEnabled()
		throws RemoteException;

	public abstract IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
		throws RemoteException;

	public abstract StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void setOnStreetViewPanoramaCameraChangeListener(zzbh zzbh)
		throws RemoteException;

	public abstract void setOnStreetViewPanoramaChangeListener(zzbj zzbj)
		throws RemoteException;

	public abstract void setOnStreetViewPanoramaClickListener(zzbl zzbl)
		throws RemoteException;

	public abstract void setOnStreetViewPanoramaLongClickListener(zzbn zzbn)
		throws RemoteException;

	public abstract void setPosition(LatLng latlng)
		throws RemoteException;

	public abstract void setPositionWithID(String s)
		throws RemoteException;

	public abstract void setPositionWithRadius(LatLng latlng, int i)
		throws RemoteException;

	public abstract void setPositionWithRadiusAndSource(LatLng latlng, int i, StreetViewSource streetviewsource)
		throws RemoteException;

	public abstract void setPositionWithSource(LatLng latlng, StreetViewSource streetviewsource)
		throws RemoteException;
}
