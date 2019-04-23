// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.*;
import com.google.android.gms.maps.model.*;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzc, zzap, IProjectionDelegate, IUiSettingsDelegate, 
//			zzh, ILocationSourceDelegate, zzl, zzn, 
//			zzp, zzr, zzt, zzv, 
//			zzx, zzz, zzab, zzad, 
//			zzaf, zzaj, zzal, zzan, 
//			zzar, zzat, zzav, zzax, 
//			zzaz, zzbb, zzbd, zzbf, 
//			zzbs

public interface IGoogleMapDelegate
	extends IInterface
{

	public abstract zzh addCircle(CircleOptions circleoptions)
		throws RemoteException;

	public abstract zzk addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
		throws RemoteException;

	public abstract zzt addMarker(MarkerOptions markeroptions)
		throws RemoteException;

	public abstract zzw addPolygon(PolygonOptions polygonoptions)
		throws RemoteException;

	public abstract zzz addPolyline(PolylineOptions polylineoptions)
		throws RemoteException;

	public abstract zzac addTileOverlay(TileOverlayOptions tileoverlayoptions)
		throws RemoteException;

	public abstract void animateCamera(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void animateCameraWithCallback(IObjectWrapper iobjectwrapper, zzc zzc)
		throws RemoteException;

	public abstract void animateCameraWithDurationAndCallback(IObjectWrapper iobjectwrapper, int i, zzc zzc)
		throws RemoteException;

	public abstract void clear()
		throws RemoteException;

	public abstract CameraPosition getCameraPosition()
		throws RemoteException;

	public abstract zzn getFocusedBuilding()
		throws RemoteException;

	public abstract void getMapAsync(zzap zzap)
		throws RemoteException;

	public abstract int getMapType()
		throws RemoteException;

	public abstract float getMaxZoomLevel()
		throws RemoteException;

	public abstract float getMinZoomLevel()
		throws RemoteException;

	public abstract Location getMyLocation()
		throws RemoteException;

	public abstract IProjectionDelegate getProjection()
		throws RemoteException;

	public abstract IUiSettingsDelegate getUiSettings()
		throws RemoteException;

	public abstract boolean isBuildingsEnabled()
		throws RemoteException;

	public abstract boolean isIndoorEnabled()
		throws RemoteException;

	public abstract boolean isMyLocationEnabled()
		throws RemoteException;

	public abstract boolean isTrafficEnabled()
		throws RemoteException;

	public abstract void moveCamera(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void onCreate(Bundle bundle)
		throws RemoteException;

	public abstract void onDestroy()
		throws RemoteException;

	public abstract void onEnterAmbient(Bundle bundle)
		throws RemoteException;

	public abstract void onExitAmbient()
		throws RemoteException;

	public abstract void onLowMemory()
		throws RemoteException;

	public abstract void onPause()
		throws RemoteException;

	public abstract void onResume()
		throws RemoteException;

	public abstract void onSaveInstanceState(Bundle bundle)
		throws RemoteException;

	public abstract void onStart()
		throws RemoteException;

	public abstract void onStop()
		throws RemoteException;

	public abstract void resetMinMaxZoomPreference()
		throws RemoteException;

	public abstract void setBuildingsEnabled(boolean flag)
		throws RemoteException;

	public abstract void setContentDescription(String s)
		throws RemoteException;

	public abstract boolean setIndoorEnabled(boolean flag)
		throws RemoteException;

	public abstract void setInfoWindowAdapter(com.google.android.gms.maps.internal.zzh zzh)
		throws RemoteException;

	public abstract void setLatLngBoundsForCameraTarget(LatLngBounds latlngbounds)
		throws RemoteException;

	public abstract void setLocationSource(ILocationSourceDelegate ilocationsourcedelegate)
		throws RemoteException;

	public abstract boolean setMapStyle(MapStyleOptions mapstyleoptions)
		throws RemoteException;

	public abstract void setMapType(int i)
		throws RemoteException;

	public abstract void setMaxZoomPreference(float f)
		throws RemoteException;

	public abstract void setMinZoomPreference(float f)
		throws RemoteException;

	public abstract void setMyLocationEnabled(boolean flag)
		throws RemoteException;

	public abstract void setOnCameraChangeListener(zzl zzl)
		throws RemoteException;

	public abstract void setOnCameraIdleListener(com.google.android.gms.maps.internal.zzn zzn)
		throws RemoteException;

	public abstract void setOnCameraMoveCanceledListener(zzp zzp)
		throws RemoteException;

	public abstract void setOnCameraMoveListener(zzr zzr)
		throws RemoteException;

	public abstract void setOnCameraMoveStartedListener(com.google.android.gms.maps.internal.zzt zzt)
		throws RemoteException;

	public abstract void setOnCircleClickListener(zzv zzv)
		throws RemoteException;

	public abstract void setOnGroundOverlayClickListener(zzx zzx)
		throws RemoteException;

	public abstract void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzz zzz)
		throws RemoteException;

	public abstract void setOnInfoWindowClickListener(zzab zzab)
		throws RemoteException;

	public abstract void setOnInfoWindowCloseListener(zzad zzad)
		throws RemoteException;

	public abstract void setOnInfoWindowLongClickListener(zzaf zzaf)
		throws RemoteException;

	public abstract void setOnMapClickListener(zzaj zzaj)
		throws RemoteException;

	public abstract void setOnMapLoadedCallback(zzal zzal)
		throws RemoteException;

	public abstract void setOnMapLongClickListener(zzan zzan)
		throws RemoteException;

	public abstract void setOnMarkerClickListener(zzar zzar)
		throws RemoteException;

	public abstract void setOnMarkerDragListener(zzat zzat)
		throws RemoteException;

	public abstract void setOnMyLocationButtonClickListener(zzav zzav)
		throws RemoteException;

	public abstract void setOnMyLocationChangeListener(zzax zzax)
		throws RemoteException;

	public abstract void setOnMyLocationClickListener(zzaz zzaz)
		throws RemoteException;

	public abstract void setOnPoiClickListener(zzbb zzbb)
		throws RemoteException;

	public abstract void setOnPolygonClickListener(zzbd zzbd)
		throws RemoteException;

	public abstract void setOnPolylineClickListener(zzbf zzbf)
		throws RemoteException;

	public abstract void setPadding(int i, int j, int k, int l)
		throws RemoteException;

	public abstract void setTrafficEnabled(boolean flag)
		throws RemoteException;

	public abstract void setWatermarkEnabled(boolean flag)
		throws RemoteException;

	public abstract void snapshot(zzbs zzbs, IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void snapshotForTest(zzbs zzbs)
		throws RemoteException;

	public abstract void stopAnimation()
		throws RemoteException;

	public abstract boolean useViewLifecycleWhenInFragment()
		throws RemoteException;
}
