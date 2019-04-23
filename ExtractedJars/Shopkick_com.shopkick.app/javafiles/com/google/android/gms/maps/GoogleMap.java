// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;

// Referenced classes of package com.google.android.gms.maps:
//			CameraUpdate, Projection, UiSettings, zzg, 
//			zzl, zzt, zzx, zzw, 
//			zzv, zzu, zzo, zzn, 
//			zza, zzd, zzf, zze, 
//			zzy, zzk, zzz, zzb, 
//			zzc, zzi, zzh, zzj, 
//			zzs, zzp, zzq, zzr, 
//			LocationSource

public final class GoogleMap
{
	public static interface CancelableCallback
	{

		public abstract void onCancel();

		public abstract void onFinish();
	}

	public static interface InfoWindowAdapter
	{

		public abstract View getInfoContents(Marker marker);

		public abstract View getInfoWindow(Marker marker);
	}

	public static interface OnCameraChangeListener
	{

		public abstract void onCameraChange(CameraPosition cameraposition);
	}

	public static interface OnCameraIdleListener
	{

		public abstract void onCameraIdle();
	}

	public static interface OnCameraMoveCanceledListener
	{

		public abstract void onCameraMoveCanceled();
	}

	public static interface OnCameraMoveListener
	{

		public abstract void onCameraMove();
	}

	public static interface OnCameraMoveStartedListener
	{

		public abstract void onCameraMoveStarted(int i);

		public static final int REASON_API_ANIMATION = 2;
		public static final int REASON_DEVELOPER_ANIMATION = 3;
		public static final int REASON_GESTURE = 1;
	}

	public static interface OnCircleClickListener
	{

		public abstract void onCircleClick(Circle circle);
	}

	public static interface OnGroundOverlayClickListener
	{

		public abstract void onGroundOverlayClick(GroundOverlay groundoverlay);
	}

	public static interface OnIndoorStateChangeListener
	{

		public abstract void onIndoorBuildingFocused();

		public abstract void onIndoorLevelActivated(IndoorBuilding indoorbuilding);
	}

	public static interface OnInfoWindowClickListener
	{

		public abstract void onInfoWindowClick(Marker marker);
	}

	public static interface OnInfoWindowCloseListener
	{

		public abstract void onInfoWindowClose(Marker marker);
	}

	public static interface OnInfoWindowLongClickListener
	{

		public abstract void onInfoWindowLongClick(Marker marker);
	}

	public static interface OnMapClickListener
	{

		public abstract void onMapClick(LatLng latlng);
	}

	public static interface OnMapLoadedCallback
	{

		public abstract void onMapLoaded();
	}

	public static interface OnMapLongClickListener
	{

		public abstract void onMapLongClick(LatLng latlng);
	}

	public static interface OnMarkerClickListener
	{

		public abstract boolean onMarkerClick(Marker marker);
	}

	public static interface OnMarkerDragListener
	{

		public abstract void onMarkerDrag(Marker marker);

		public abstract void onMarkerDragEnd(Marker marker);

		public abstract void onMarkerDragStart(Marker marker);
	}

	public static interface OnMyLocationButtonClickListener
	{

		public abstract boolean onMyLocationButtonClick();
	}

	public static interface OnMyLocationChangeListener
	{

		public abstract void onMyLocationChange(Location location);
	}

	public static interface OnMyLocationClickListener
	{

		public abstract void onMyLocationClick(Location location);
	}

	public static interface OnPoiClickListener
	{

		public abstract void onPoiClick(PointOfInterest pointofinterest);
	}

	public static interface OnPolygonClickListener
	{

		public abstract void onPolygonClick(Polygon polygon);
	}

	public static interface OnPolylineClickListener
	{

		public abstract void onPolylineClick(Polyline polyline);
	}

	public static interface SnapshotReadyCallback
	{

		public abstract void onSnapshotReady(Bitmap bitmap);
	}

	private static final class zza extends zzd
	{

		public final void onCancel()
		{
			zzai.onCancel();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field GoogleMap$CancelableCallback zzai>
		//    2    4:invokeinterface #22  <Method void GoogleMap$CancelableCallback.onCancel()>
		//    3    9:return          
		}

		public final void onFinish()
		{
			zzai.onFinish();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field GoogleMap$CancelableCallback zzai>
		//    2    4:invokeinterface #25  <Method void GoogleMap$CancelableCallback.onFinish()>
		//    3    9:return          
		}

		private final CancelableCallback zzai;

		zza(CancelableCallback cancelablecallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void zzd()>
			zzai = cancelablecallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field GoogleMap$CancelableCallback zzai>
		//    5    9:return          
		}
	}


	public GoogleMap(IGoogleMapDelegate igooglemapdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void Object()>
		zzg = (IGoogleMapDelegate)Preconditions.checkNotNull(((Object) (igooglemapdelegate)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #108 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #110 <Class IGoogleMapDelegate>
	//    6   12:putfield        #112 <Field IGoogleMapDelegate zzg>
	//    7   15:return          
	}

	public final Circle addCircle(CircleOptions circleoptions)
	{
		try
		{
			circleoptions = ((CircleOptions) (new Circle(zzg.addCircle(circleoptions))));
	//    0    0:new             #119 <Class Circle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aload_1         
	//    5    9:invokeinterface #122 <Method com.google.android.gms.internal.maps.zzh IGoogleMapDelegate.addCircle(CircleOptions)>
	//    6   14:invokespecial   #125 <Method void Circle(com.google.android.gms.internal.maps.zzh)>
	//    7   17:astore_1        
		}
	//*   8   18:aload_1         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(CircleOptions circleoptions)
	//*  10   20:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (circleoptions)));
	//   11   21:new             #127 <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return ((Circle) (circleoptions));
	}

	public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
	{
		try
		{
			groundoverlayoptions = ((GroundOverlayOptions) (zzg.addGroundOverlay(groundoverlayoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:aload_1         
	//    3    5:invokeinterface #135 <Method com.google.android.gms.internal.maps.zzk IGoogleMapDelegate.addGroundOverlay(GroundOverlayOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
	//*   7   15:new             #137 <Class GroundOverlay>
	//*   8   18:dup             
	//*   9   19:aload_1         
	//*  10   20:invokespecial   #140 <Method void GroundOverlay(com.google.android.gms.internal.maps.zzk)>
	//*  11   23:astore_1        
	//*  12   24:aload_1         
	//*  13   25:areturn         
	//*  14   26:aconst_null     
	//*  15   27:areturn         
		// Misplaced declaration of an exception variable
		catch(GroundOverlayOptions groundoverlayoptions)
	//*  16   28:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (groundoverlayoptions)));
	//   17   29:new             #127 <Class RuntimeRemoteException>
	//   18   32:dup             
	//   19   33:aload_1         
	//   20   34:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   37:athrow          
		}
		if(groundoverlayoptions == null)
			break MISSING_BLOCK_LABEL_26;
		groundoverlayoptions = ((GroundOverlayOptions) (new GroundOverlay(((com.google.android.gms.internal.maps.zzk) (groundoverlayoptions)))));
		return ((GroundOverlay) (groundoverlayoptions));
		return null;
	}

	public final Marker addMarker(MarkerOptions markeroptions)
	{
		try
		{
			markeroptions = ((MarkerOptions) (zzg.addMarker(markeroptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:aload_1         
	//    3    5:invokeinterface #145 <Method com.google.android.gms.internal.maps.zzt IGoogleMapDelegate.addMarker(MarkerOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
	//*   7   15:new             #147 <Class Marker>
	//*   8   18:dup             
	//*   9   19:aload_1         
	//*  10   20:invokespecial   #150 <Method void Marker(com.google.android.gms.internal.maps.zzt)>
	//*  11   23:astore_1        
	//*  12   24:aload_1         
	//*  13   25:areturn         
	//*  14   26:aconst_null     
	//*  15   27:areturn         
		// Misplaced declaration of an exception variable
		catch(MarkerOptions markeroptions)
	//*  16   28:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (markeroptions)));
	//   17   29:new             #127 <Class RuntimeRemoteException>
	//   18   32:dup             
	//   19   33:aload_1         
	//   20   34:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   37:athrow          
		}
		if(markeroptions == null)
			break MISSING_BLOCK_LABEL_26;
		markeroptions = ((MarkerOptions) (new Marker(((com.google.android.gms.internal.maps.zzt) (markeroptions)))));
		return ((Marker) (markeroptions));
		return null;
	}

	public final Polygon addPolygon(PolygonOptions polygonoptions)
	{
		try
		{
			polygonoptions = ((PolygonOptions) (new Polygon(zzg.addPolygon(polygonoptions))));
	//    0    0:new             #154 <Class Polygon>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aload_1         
	//    5    9:invokeinterface #157 <Method com.google.android.gms.internal.maps.zzw IGoogleMapDelegate.addPolygon(PolygonOptions)>
	//    6   14:invokespecial   #160 <Method void Polygon(com.google.android.gms.internal.maps.zzw)>
	//    7   17:astore_1        
		}
	//*   8   18:aload_1         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(PolygonOptions polygonoptions)
	//*  10   20:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (polygonoptions)));
	//   11   21:new             #127 <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return ((Polygon) (polygonoptions));
	}

	public final Polyline addPolyline(PolylineOptions polylineoptions)
	{
		try
		{
			polylineoptions = ((PolylineOptions) (new Polyline(zzg.addPolyline(polylineoptions))));
	//    0    0:new             #164 <Class Polyline>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aload_1         
	//    5    9:invokeinterface #167 <Method com.google.android.gms.internal.maps.zzz IGoogleMapDelegate.addPolyline(PolylineOptions)>
	//    6   14:invokespecial   #170 <Method void Polyline(com.google.android.gms.internal.maps.zzz)>
	//    7   17:astore_1        
		}
	//*   8   18:aload_1         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(PolylineOptions polylineoptions)
	//*  10   20:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (polylineoptions)));
	//   11   21:new             #127 <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return ((Polyline) (polylineoptions));
	}

	public final TileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
	{
		try
		{
			tileoverlayoptions = ((TileOverlayOptions) (zzg.addTileOverlay(tileoverlayoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:aload_1         
	//    3    5:invokeinterface #175 <Method com.google.android.gms.internal.maps.zzac IGoogleMapDelegate.addTileOverlay(TileOverlayOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
	//*   7   15:new             #177 <Class TileOverlay>
	//*   8   18:dup             
	//*   9   19:aload_1         
	//*  10   20:invokespecial   #180 <Method void TileOverlay(com.google.android.gms.internal.maps.zzac)>
	//*  11   23:astore_1        
	//*  12   24:aload_1         
	//*  13   25:areturn         
	//*  14   26:aconst_null     
	//*  15   27:areturn         
		// Misplaced declaration of an exception variable
		catch(TileOverlayOptions tileoverlayoptions)
	//*  16   28:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (tileoverlayoptions)));
	//   17   29:new             #127 <Class RuntimeRemoteException>
	//   18   32:dup             
	//   19   33:aload_1         
	//   20   34:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   37:athrow          
		}
		if(tileoverlayoptions == null)
			break MISSING_BLOCK_LABEL_26;
		tileoverlayoptions = ((TileOverlayOptions) (new TileOverlay(((com.google.android.gms.internal.maps.zzac) (tileoverlayoptions)))));
		return ((TileOverlay) (tileoverlayoptions));
		return null;
	}

	public final void animateCamera(CameraUpdate cameraupdate)
	{
		try
		{
			zzg.animateCamera(cameraupdate.zza());
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #187 <Method com.google.android.gms.dynamic.IObjectWrapper CameraUpdate.zza()>
	//    4    8:invokeinterface #190 <Method void IGoogleMapDelegate.animateCamera(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*   6   14:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraupdate)));
	//    7   15:new             #127 <Class RuntimeRemoteException>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   23:athrow          
		}
	}

	public final void animateCamera(CameraUpdate cameraupdate, int i, CancelableCallback cancelablecallback)
	{
		IGoogleMapDelegate igooglemapdelegate;
		com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper;
		try
		{
			igooglemapdelegate = zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:astore          4
			iobjectwrapper = cameraupdate.zza();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #187 <Method com.google.android.gms.dynamic.IObjectWrapper CameraUpdate.zza()>
	//    5   10:astore          5
		}
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       21
	//*   8   16:aconst_null     
	//*   9   17:astore_1        
	//*  10   18:goto            30
	//*  11   21:new             #81  <Class GoogleMap$zza>
	//*  12   24:dup             
	//*  13   25:aload_3         
	//*  14   26:invokespecial   #194 <Method void GoogleMap$zza(GoogleMap$CancelableCallback)>
	//*  15   29:astore_1        
	//*  16   30:aload           4
	//*  17   32:aload           5
	//*  18   34:iload_2         
	//*  19   35:aload_1         
	//*  20   36:invokeinterface #198 <Method void IGoogleMapDelegate.animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.IObjectWrapper, int, com.google.android.gms.maps.internal.zzc)>
	//*  21   41:return          
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*  22   42:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraupdate)));
	//   23   43:new             #127 <Class RuntimeRemoteException>
	//   24   46:dup             
	//   25   47:aload_1         
	//   26   48:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   27   51:athrow          
		}
		if(cancelablecallback == null)
		{
			cameraupdate = null;
			break MISSING_BLOCK_LABEL_30;
		}
		cameraupdate = ((CameraUpdate) (new zza(cancelablecallback)));
		igooglemapdelegate.animateCameraWithDurationAndCallback(iobjectwrapper, i, ((com.google.android.gms.maps.internal.zzc) (cameraupdate)));
		return;
	}

	public final void animateCamera(CameraUpdate cameraupdate, CancelableCallback cancelablecallback)
	{
		IGoogleMapDelegate igooglemapdelegate;
		com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper;
		try
		{
			igooglemapdelegate = zzg;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:astore_3        
			iobjectwrapper = cameraupdate.zza();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #187 <Method com.google.android.gms.dynamic.IObjectWrapper CameraUpdate.zza()>
	//    5    9:astore          4
		}
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       20
	//*   8   15:aconst_null     
	//*   9   16:astore_1        
	//*  10   17:goto            29
	//*  11   20:new             #81  <Class GoogleMap$zza>
	//*  12   23:dup             
	//*  13   24:aload_2         
	//*  14   25:invokespecial   #194 <Method void GoogleMap$zza(GoogleMap$CancelableCallback)>
	//*  15   28:astore_1        
	//*  16   29:aload_3         
	//*  17   30:aload           4
	//*  18   32:aload_1         
	//*  19   33:invokeinterface #203 <Method void IGoogleMapDelegate.animateCameraWithCallback(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.maps.internal.zzc)>
	//*  20   38:return          
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*  21   39:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraupdate)));
	//   22   40:new             #127 <Class RuntimeRemoteException>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   26   48:athrow          
		}
		if(cancelablecallback == null)
		{
			cameraupdate = null;
			break MISSING_BLOCK_LABEL_29;
		}
		cameraupdate = ((CameraUpdate) (new zza(cancelablecallback)));
		igooglemapdelegate.animateCameraWithCallback(iobjectwrapper, ((com.google.android.gms.maps.internal.zzc) (cameraupdate)));
		return;
	}

	public final void clear()
	{
		try
		{
			zzg.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #206 <Method void IGoogleMapDelegate.clear()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #127 <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final CameraPosition getCameraPosition()
	{
		CameraPosition cameraposition;
		try
		{
			cameraposition = zzg.getCameraPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #210 <Method CameraPosition IGoogleMapDelegate.getCameraPosition()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return cameraposition;
	}

	public final IndoorBuilding getFocusedBuilding()
	{
		Object obj;
		try
		{
			obj = ((Object) (zzg.getFocusedBuilding()));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #215 <Method com.google.android.gms.internal.maps.zzn IGoogleMapDelegate.getFocusedBuilding()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:ifnull          25
	//*   6   14:new             #217 <Class IndoorBuilding>
	//*   7   17:dup             
	//*   8   18:aload_1         
	//*   9   19:invokespecial   #220 <Method void IndoorBuilding(com.google.android.gms.internal.maps.zzn)>
	//*  10   22:astore_1        
	//*  11   23:aload_1         
	//*  12   24:areturn         
	//*  13   25:aconst_null     
	//*  14   26:areturn         
		catch(RemoteException remoteexception)
	//*  15   27:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   16   28:new             #127 <Class RuntimeRemoteException>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   20   36:athrow          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_25;
		obj = ((Object) (new IndoorBuilding(((com.google.android.gms.internal.maps.zzn) (obj)))));
		return ((IndoorBuilding) (obj));
		return null;
	}

	public final int getMapType()
	{
		int i;
		try
		{
			i = zzg.getMapType();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #224 <Method int IGoogleMapDelegate.getMapType()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public final float getMaxZoomLevel()
	{
		float f;
		try
		{
			f = zzg.getMaxZoomLevel();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #228 <Method float IGoogleMapDelegate.getMaxZoomLevel()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final float getMinZoomLevel()
	{
		float f;
		try
		{
			f = zzg.getMinZoomLevel();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #231 <Method float IGoogleMapDelegate.getMinZoomLevel()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final Location getMyLocation()
	{
		Location location;
		try
		{
			location = zzg.getMyLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #236 <Method Location IGoogleMapDelegate.getMyLocation()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return location;
	}

	public final Projection getProjection()
	{
		Projection projection;
		try
		{
			projection = new Projection(zzg.getProjection());
	//    0    0:new             #241 <Class Projection>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:invokeinterface #244 <Method com.google.android.gms.maps.internal.IProjectionDelegate IGoogleMapDelegate.getProjection()>
	//    5   13:invokespecial   #247 <Method void Projection(com.google.android.gms.maps.internal.IProjectionDelegate)>
	//    6   16:astore_1        
		}
	//*   7   17:aload_1         
	//*   8   18:areturn         
		catch(RemoteException remoteexception)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   10   20:new             #127 <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return projection;
	}

	public final UiSettings getUiSettings()
	{
		UiSettings uisettings;
		try
		{
			if(zzh == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #251 <Field UiSettings zzh>
	//*   2    4:ifnonnull       27
				zzh = new UiSettings(zzg.getUiSettings());
	//    3    7:aload_0         
	//    4    8:new             #253 <Class UiSettings>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    8   16:invokeinterface #256 <Method com.google.android.gms.maps.internal.IUiSettingsDelegate IGoogleMapDelegate.getUiSettings()>
	//    9   21:invokespecial   #259 <Method void UiSettings(com.google.android.gms.maps.internal.IUiSettingsDelegate)>
	//   10   24:putfield        #251 <Field UiSettings zzh>
			uisettings = zzh;
	//   11   27:aload_0         
	//   12   28:getfield        #251 <Field UiSettings zzh>
	//   13   31:astore_1        
		}
	//*  14   32:aload_1         
	//*  15   33:areturn         
		catch(RemoteException remoteexception)
	//*  16   34:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
		}
		return uisettings;
	}

	public final boolean isBuildingsEnabled()
	{
		boolean flag;
		try
		{
			flag = zzg.isBuildingsEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #263 <Method boolean IGoogleMapDelegate.isBuildingsEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isIndoorEnabled()
	{
		boolean flag;
		try
		{
			flag = zzg.isIndoorEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #266 <Method boolean IGoogleMapDelegate.isIndoorEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isMyLocationEnabled()
	{
		boolean flag;
		try
		{
			flag = zzg.isMyLocationEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #269 <Method boolean IGoogleMapDelegate.isMyLocationEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isTrafficEnabled()
	{
		boolean flag;
		try
		{
			flag = zzg.isTrafficEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #272 <Method boolean IGoogleMapDelegate.isTrafficEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #127 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final void moveCamera(CameraUpdate cameraupdate)
	{
		try
		{
			zzg.moveCamera(cameraupdate.zza());
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #187 <Method com.google.android.gms.dynamic.IObjectWrapper CameraUpdate.zza()>
	//    4    8:invokeinterface #275 <Method void IGoogleMapDelegate.moveCamera(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*   6   14:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraupdate)));
	//    7   15:new             #127 <Class RuntimeRemoteException>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   11   23:athrow          
		}
	}

	public final void resetMinMaxZoomPreference()
	{
		try
		{
			zzg.resetMinMaxZoomPreference();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #278 <Method void IGoogleMapDelegate.resetMinMaxZoomPreference()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #127 <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final void setBuildingsEnabled(boolean flag)
	{
		try
		{
			zzg.setBuildingsEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:iload_1         
	//    3    5:invokeinterface #282 <Method void IGoogleMapDelegate.setBuildingsEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #127 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setContentDescription(String s)
	{
		try
		{
			zzg.setContentDescription(s);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:aload_1         
	//    3    5:invokeinterface #286 <Method void IGoogleMapDelegate.setContentDescription(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
	//    6   12:new             #127 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final boolean setIndoorEnabled(boolean flag)
	{
		try
		{
			flag = zzg.setIndoorEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:iload_1         
	//    3    5:invokeinterface #290 <Method boolean IGoogleMapDelegate.setIndoorEnabled(boolean)>
	//    4   10:istore_1        
		}
	//*   5   11:iload_1         
	//*   6   12:ireturn         
		catch(RemoteException remoteexception)
	//*   7   13:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    8   14:new             #127 <Class RuntimeRemoteException>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   12   22:athrow          
		}
		return flag;
	}

	public final void setInfoWindowAdapter(InfoWindowAdapter infowindowadapter)
	{
		if(infowindowadapter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setInfoWindowAdapter(((com.google.android.gms.maps.internal.zzh) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #295 <Method void IGoogleMapDelegate.setInfoWindowAdapter(com.google.android.gms.maps.internal.zzh)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #297 <Class zzg>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #300 <Method void zzg(GoogleMap, GoogleMap$InfoWindowAdapter)>
	//*  14   28:invokeinterface #295 <Method void IGoogleMapDelegate.setInfoWindowAdapter(com.google.android.gms.maps.internal.zzh)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(InfoWindowAdapter infowindowadapter)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (infowindowadapter)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setInfoWindowAdapter(((com.google.android.gms.maps.internal.zzh) (new zzg(this, infowindowadapter))));
		return;
	}

	public final void setLatLngBoundsForCameraTarget(LatLngBounds latlngbounds)
	{
		try
		{
			zzg.setLatLngBoundsForCameraTarget(latlngbounds);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:aload_1         
	//    3    5:invokeinterface #304 <Method void IGoogleMapDelegate.setLatLngBoundsForCameraTarget(LatLngBounds)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLngBounds latlngbounds)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlngbounds)));
	//    6   12:new             #127 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setLocationSource(LocationSource locationsource)
	{
		if(locationsource == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setLocationSource(((com.google.android.gms.maps.internal.ILocationSourceDelegate) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #309 <Method void IGoogleMapDelegate.setLocationSource(com.google.android.gms.maps.internal.ILocationSourceDelegate)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #311 <Class zzl>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #314 <Method void zzl(GoogleMap, LocationSource)>
	//*  14   28:invokeinterface #309 <Method void IGoogleMapDelegate.setLocationSource(com.google.android.gms.maps.internal.ILocationSourceDelegate)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(LocationSource locationsource)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (locationsource)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setLocationSource(((com.google.android.gms.maps.internal.ILocationSourceDelegate) (new zzl(this, locationsource))));
		return;
	}

	public final boolean setMapStyle(MapStyleOptions mapstyleoptions)
	{
		boolean flag;
		try
		{
			flag = zzg.setMapStyle(mapstyleoptions);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:aload_1         
	//    3    5:invokeinterface #319 <Method boolean IGoogleMapDelegate.setMapStyle(MapStyleOptions)>
	//    4   10:istore_2        
		}
	//*   5   11:iload_2         
	//*   6   12:ireturn         
		// Misplaced declaration of an exception variable
		catch(MapStyleOptions mapstyleoptions)
	//*   7   13:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (mapstyleoptions)));
	//    8   14:new             #127 <Class RuntimeRemoteException>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   12   22:athrow          
		}
		return flag;
	}

	public final void setMapType(int i)
	{
		try
		{
			zzg.setMapType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:iload_1         
	//    3    5:invokeinterface #324 <Method void IGoogleMapDelegate.setMapType(int)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #127 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setMaxZoomPreference(float f)
	{
		try
		{
			zzg.setMaxZoomPreference(f);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:fload_1         
	//    3    5:invokeinterface #328 <Method void IGoogleMapDelegate.setMaxZoomPreference(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #127 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setMinZoomPreference(float f)
	{
		try
		{
			zzg.setMinZoomPreference(f);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:fload_1         
	//    3    5:invokeinterface #331 <Method void IGoogleMapDelegate.setMinZoomPreference(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #127 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setMyLocationEnabled(boolean flag)
	{
		try
		{
			zzg.setMyLocationEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:iload_1         
	//    3    5:invokeinterface #338 <Method void IGoogleMapDelegate.setMyLocationEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #127 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setOnCameraChangeListener(OnCameraChangeListener oncamerachangelistener)
	{
		if(oncamerachangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnCameraChangeListener(((com.google.android.gms.maps.internal.zzl) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #344 <Method void IGoogleMapDelegate.setOnCameraChangeListener(com.google.android.gms.maps.internal.zzl)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #346 <Class zzt>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #349 <Method void zzt(GoogleMap, GoogleMap$OnCameraChangeListener)>
	//*  14   28:invokeinterface #344 <Method void IGoogleMapDelegate.setOnCameraChangeListener(com.google.android.gms.maps.internal.zzl)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraChangeListener oncamerachangelistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncamerachangelistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnCameraChangeListener(((com.google.android.gms.maps.internal.zzl) (new zzt(this, oncamerachangelistener))));
		return;
	}

	public final void setOnCameraIdleListener(OnCameraIdleListener oncameraidlelistener)
	{
		if(oncameraidlelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnCameraIdleListener(((com.google.android.gms.maps.internal.zzn) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #354 <Method void IGoogleMapDelegate.setOnCameraIdleListener(com.google.android.gms.maps.internal.zzn)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #356 <Class zzx>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #359 <Method void zzx(GoogleMap, GoogleMap$OnCameraIdleListener)>
	//*  14   28:invokeinterface #354 <Method void IGoogleMapDelegate.setOnCameraIdleListener(com.google.android.gms.maps.internal.zzn)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraIdleListener oncameraidlelistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncameraidlelistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnCameraIdleListener(((com.google.android.gms.maps.internal.zzn) (new zzx(this, oncameraidlelistener))));
		return;
	}

	public final void setOnCameraMoveCanceledListener(OnCameraMoveCanceledListener oncameramovecanceledlistener)
	{
		if(oncameramovecanceledlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnCameraMoveCanceledListener(((com.google.android.gms.maps.internal.zzp) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #364 <Method void IGoogleMapDelegate.setOnCameraMoveCanceledListener(com.google.android.gms.maps.internal.zzp)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #366 <Class zzw>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #369 <Method void zzw(GoogleMap, GoogleMap$OnCameraMoveCanceledListener)>
	//*  14   28:invokeinterface #364 <Method void IGoogleMapDelegate.setOnCameraMoveCanceledListener(com.google.android.gms.maps.internal.zzp)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraMoveCanceledListener oncameramovecanceledlistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncameramovecanceledlistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnCameraMoveCanceledListener(((com.google.android.gms.maps.internal.zzp) (new zzw(this, oncameramovecanceledlistener))));
		return;
	}

	public final void setOnCameraMoveListener(OnCameraMoveListener oncameramovelistener)
	{
		if(oncameramovelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnCameraMoveListener(((com.google.android.gms.maps.internal.zzr) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #374 <Method void IGoogleMapDelegate.setOnCameraMoveListener(com.google.android.gms.maps.internal.zzr)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #376 <Class zzv>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #379 <Method void zzv(GoogleMap, GoogleMap$OnCameraMoveListener)>
	//*  14   28:invokeinterface #374 <Method void IGoogleMapDelegate.setOnCameraMoveListener(com.google.android.gms.maps.internal.zzr)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraMoveListener oncameramovelistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncameramovelistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnCameraMoveListener(((com.google.android.gms.maps.internal.zzr) (new zzv(this, oncameramovelistener))));
		return;
	}

	public final void setOnCameraMoveStartedListener(OnCameraMoveStartedListener oncameramovestartedlistener)
	{
		if(oncameramovestartedlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnCameraMoveStartedListener(((com.google.android.gms.maps.internal.zzt) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #384 <Method void IGoogleMapDelegate.setOnCameraMoveStartedListener(com.google.android.gms.maps.internal.zzt)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #386 <Class zzu>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #389 <Method void zzu(GoogleMap, GoogleMap$OnCameraMoveStartedListener)>
	//*  14   28:invokeinterface #384 <Method void IGoogleMapDelegate.setOnCameraMoveStartedListener(com.google.android.gms.maps.internal.zzt)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraMoveStartedListener oncameramovestartedlistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncameramovestartedlistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnCameraMoveStartedListener(((com.google.android.gms.maps.internal.zzt) (new zzu(this, oncameramovestartedlistener))));
		return;
	}

	public final void setOnCircleClickListener(OnCircleClickListener oncircleclicklistener)
	{
		if(oncircleclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnCircleClickListener(((com.google.android.gms.maps.internal.zzv) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #394 <Method void IGoogleMapDelegate.setOnCircleClickListener(com.google.android.gms.maps.internal.zzv)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #396 <Class zzo>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #399 <Method void zzo(GoogleMap, GoogleMap$OnCircleClickListener)>
	//*  14   28:invokeinterface #394 <Method void IGoogleMapDelegate.setOnCircleClickListener(com.google.android.gms.maps.internal.zzv)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnCircleClickListener oncircleclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncircleclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnCircleClickListener(((com.google.android.gms.maps.internal.zzv) (new zzo(this, oncircleclicklistener))));
		return;
	}

	public final void setOnGroundOverlayClickListener(OnGroundOverlayClickListener ongroundoverlayclicklistener)
	{
		if(ongroundoverlayclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnGroundOverlayClickListener(((com.google.android.gms.maps.internal.zzx) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #404 <Method void IGoogleMapDelegate.setOnGroundOverlayClickListener(com.google.android.gms.maps.internal.zzx)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #406 <Class zzn>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #409 <Method void zzn(GoogleMap, GoogleMap$OnGroundOverlayClickListener)>
	//*  14   28:invokeinterface #404 <Method void IGoogleMapDelegate.setOnGroundOverlayClickListener(com.google.android.gms.maps.internal.zzx)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnGroundOverlayClickListener ongroundoverlayclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (ongroundoverlayclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnGroundOverlayClickListener(((com.google.android.gms.maps.internal.zzx) (new zzn(this, ongroundoverlayclicklistener))));
		return;
	}

	public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onindoorstatechangelistener)
	{
		if(onindoorstatechangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnIndoorStateChangeListener(((com.google.android.gms.maps.internal.zzz) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #414 <Method void IGoogleMapDelegate.setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzz)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #416 <Class zza>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #419 <Method void zza(GoogleMap, GoogleMap$OnIndoorStateChangeListener)>
	//*  14   28:invokeinterface #414 <Method void IGoogleMapDelegate.setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzz)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnIndoorStateChangeListener onindoorstatechangelistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onindoorstatechangelistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnIndoorStateChangeListener(((com.google.android.gms.maps.internal.zzz) (new com.google.android.gms.maps.zza(this, onindoorstatechangelistener))));
		return;
	}

	public final void setOnInfoWindowClickListener(OnInfoWindowClickListener oninfowindowclicklistener)
	{
		if(oninfowindowclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnInfoWindowClickListener(((com.google.android.gms.maps.internal.zzab) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #424 <Method void IGoogleMapDelegate.setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzab)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #426 <Class com.google.android.gms.maps.zzd>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #429 <Method void com.google.android.gms.maps.zzd(GoogleMap, GoogleMap$OnInfoWindowClickListener)>
	//*  14   28:invokeinterface #424 <Method void IGoogleMapDelegate.setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzab)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnInfoWindowClickListener oninfowindowclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oninfowindowclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnInfoWindowClickListener(((com.google.android.gms.maps.internal.zzab) (new com.google.android.gms.maps.zzd(this, oninfowindowclicklistener))));
		return;
	}

	public final void setOnInfoWindowCloseListener(OnInfoWindowCloseListener oninfowindowcloselistener)
	{
		if(oninfowindowcloselistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnInfoWindowCloseListener(((com.google.android.gms.maps.internal.zzad) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #434 <Method void IGoogleMapDelegate.setOnInfoWindowCloseListener(com.google.android.gms.maps.internal.zzad)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #436 <Class zzf>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #439 <Method void zzf(GoogleMap, GoogleMap$OnInfoWindowCloseListener)>
	//*  14   28:invokeinterface #434 <Method void IGoogleMapDelegate.setOnInfoWindowCloseListener(com.google.android.gms.maps.internal.zzad)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnInfoWindowCloseListener oninfowindowcloselistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oninfowindowcloselistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnInfoWindowCloseListener(((com.google.android.gms.maps.internal.zzad) (new zzf(this, oninfowindowcloselistener))));
		return;
	}

	public final void setOnInfoWindowLongClickListener(OnInfoWindowLongClickListener oninfowindowlongclicklistener)
	{
		if(oninfowindowlongclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnInfoWindowLongClickListener(((com.google.android.gms.maps.internal.zzaf) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #444 <Method void IGoogleMapDelegate.setOnInfoWindowLongClickListener(com.google.android.gms.maps.internal.zzaf)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #446 <Class zze>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #449 <Method void zze(GoogleMap, GoogleMap$OnInfoWindowLongClickListener)>
	//*  14   28:invokeinterface #444 <Method void IGoogleMapDelegate.setOnInfoWindowLongClickListener(com.google.android.gms.maps.internal.zzaf)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnInfoWindowLongClickListener oninfowindowlongclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oninfowindowlongclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnInfoWindowLongClickListener(((com.google.android.gms.maps.internal.zzaf) (new zze(this, oninfowindowlongclicklistener))));
		return;
	}

	public final void setOnMapClickListener(OnMapClickListener onmapclicklistener)
	{
		if(onmapclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnMapClickListener(((com.google.android.gms.maps.internal.zzaj) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #454 <Method void IGoogleMapDelegate.setOnMapClickListener(com.google.android.gms.maps.internal.zzaj)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #456 <Class zzy>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #459 <Method void zzy(GoogleMap, GoogleMap$OnMapClickListener)>
	//*  14   28:invokeinterface #454 <Method void IGoogleMapDelegate.setOnMapClickListener(com.google.android.gms.maps.internal.zzaj)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnMapClickListener onmapclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmapclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnMapClickListener(((com.google.android.gms.maps.internal.zzaj) (new zzy(this, onmapclicklistener))));
		return;
	}

	public final void setOnMapLoadedCallback(OnMapLoadedCallback onmaploadedcallback)
	{
		if(onmaploadedcallback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnMapLoadedCallback(((com.google.android.gms.maps.internal.zzal) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #464 <Method void IGoogleMapDelegate.setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzal)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #466 <Class zzk>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #469 <Method void zzk(GoogleMap, GoogleMap$OnMapLoadedCallback)>
	//*  14   28:invokeinterface #464 <Method void IGoogleMapDelegate.setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzal)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnMapLoadedCallback onmaploadedcallback)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmaploadedcallback)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnMapLoadedCallback(((com.google.android.gms.maps.internal.zzal) (new zzk(this, onmaploadedcallback))));
		return;
	}

	public final void setOnMapLongClickListener(OnMapLongClickListener onmaplongclicklistener)
	{
		if(onmaplongclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnMapLongClickListener(((com.google.android.gms.maps.internal.zzan) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #474 <Method void IGoogleMapDelegate.setOnMapLongClickListener(com.google.android.gms.maps.internal.zzan)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #476 <Class zzz>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #479 <Method void zzz(GoogleMap, GoogleMap$OnMapLongClickListener)>
	//*  14   28:invokeinterface #474 <Method void IGoogleMapDelegate.setOnMapLongClickListener(com.google.android.gms.maps.internal.zzan)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnMapLongClickListener onmaplongclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmaplongclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnMapLongClickListener(((com.google.android.gms.maps.internal.zzan) (new zzz(this, onmaplongclicklistener))));
		return;
	}

	public final void setOnMarkerClickListener(OnMarkerClickListener onmarkerclicklistener)
	{
		if(onmarkerclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnMarkerClickListener(((com.google.android.gms.maps.internal.zzar) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #484 <Method void IGoogleMapDelegate.setOnMarkerClickListener(com.google.android.gms.maps.internal.zzar)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #486 <Class zzb>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #489 <Method void zzb(GoogleMap, GoogleMap$OnMarkerClickListener)>
	//*  14   28:invokeinterface #484 <Method void IGoogleMapDelegate.setOnMarkerClickListener(com.google.android.gms.maps.internal.zzar)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnMarkerClickListener onmarkerclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmarkerclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnMarkerClickListener(((com.google.android.gms.maps.internal.zzar) (new zzb(this, onmarkerclicklistener))));
		return;
	}

	public final void setOnMarkerDragListener(OnMarkerDragListener onmarkerdraglistener)
	{
		if(onmarkerdraglistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnMarkerDragListener(((com.google.android.gms.maps.internal.zzat) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #494 <Method void IGoogleMapDelegate.setOnMarkerDragListener(com.google.android.gms.maps.internal.zzat)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #496 <Class zzc>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #499 <Method void zzc(GoogleMap, GoogleMap$OnMarkerDragListener)>
	//*  14   28:invokeinterface #494 <Method void IGoogleMapDelegate.setOnMarkerDragListener(com.google.android.gms.maps.internal.zzat)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnMarkerDragListener onmarkerdraglistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmarkerdraglistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnMarkerDragListener(((com.google.android.gms.maps.internal.zzat) (new zzc(this, onmarkerdraglistener))));
		return;
	}

	public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
	{
		if(onmylocationbuttonclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnMyLocationButtonClickListener(((com.google.android.gms.maps.internal.zzav) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #504 <Method void IGoogleMapDelegate.setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzav)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #506 <Class zzi>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #509 <Method void zzi(GoogleMap, GoogleMap$OnMyLocationButtonClickListener)>
	//*  14   28:invokeinterface #504 <Method void IGoogleMapDelegate.setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzav)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmylocationbuttonclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnMyLocationButtonClickListener(((com.google.android.gms.maps.internal.zzav) (new zzi(this, onmylocationbuttonclicklistener))));
		return;
	}

	public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onmylocationchangelistener)
	{
		if(onmylocationchangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnMyLocationChangeListener(((com.google.android.gms.maps.internal.zzax) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #514 <Method void IGoogleMapDelegate.setOnMyLocationChangeListener(com.google.android.gms.maps.internal.zzax)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #516 <Class zzh>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #519 <Method void zzh(GoogleMap, GoogleMap$OnMyLocationChangeListener)>
	//*  14   28:invokeinterface #514 <Method void IGoogleMapDelegate.setOnMyLocationChangeListener(com.google.android.gms.maps.internal.zzax)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnMyLocationChangeListener onmylocationchangelistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmylocationchangelistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnMyLocationChangeListener(((com.google.android.gms.maps.internal.zzax) (new zzh(this, onmylocationchangelistener))));
		return;
	}

	public final void setOnMyLocationClickListener(OnMyLocationClickListener onmylocationclicklistener)
	{
		if(onmylocationclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnMyLocationClickListener(((com.google.android.gms.maps.internal.zzaz) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #524 <Method void IGoogleMapDelegate.setOnMyLocationClickListener(com.google.android.gms.maps.internal.zzaz)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #526 <Class zzj>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #529 <Method void zzj(GoogleMap, GoogleMap$OnMyLocationClickListener)>
	//*  14   28:invokeinterface #524 <Method void IGoogleMapDelegate.setOnMyLocationClickListener(com.google.android.gms.maps.internal.zzaz)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnMyLocationClickListener onmylocationclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmylocationclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnMyLocationClickListener(((com.google.android.gms.maps.internal.zzaz) (new zzj(this, onmylocationclicklistener))));
		return;
	}

	public final void setOnPoiClickListener(OnPoiClickListener onpoiclicklistener)
	{
		if(onpoiclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnPoiClickListener(((com.google.android.gms.maps.internal.zzbb) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #534 <Method void IGoogleMapDelegate.setOnPoiClickListener(com.google.android.gms.maps.internal.zzbb)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #536 <Class zzs>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #539 <Method void zzs(GoogleMap, GoogleMap$OnPoiClickListener)>
	//*  14   28:invokeinterface #534 <Method void IGoogleMapDelegate.setOnPoiClickListener(com.google.android.gms.maps.internal.zzbb)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnPoiClickListener onpoiclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onpoiclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnPoiClickListener(((com.google.android.gms.maps.internal.zzbb) (new zzs(this, onpoiclicklistener))));
		return;
	}

	public final void setOnPolygonClickListener(OnPolygonClickListener onpolygonclicklistener)
	{
		if(onpolygonclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnPolygonClickListener(((com.google.android.gms.maps.internal.zzbd) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #544 <Method void IGoogleMapDelegate.setOnPolygonClickListener(com.google.android.gms.maps.internal.zzbd)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #546 <Class zzp>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #549 <Method void zzp(GoogleMap, GoogleMap$OnPolygonClickListener)>
	//*  14   28:invokeinterface #544 <Method void IGoogleMapDelegate.setOnPolygonClickListener(com.google.android.gms.maps.internal.zzbd)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnPolygonClickListener onpolygonclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onpolygonclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnPolygonClickListener(((com.google.android.gms.maps.internal.zzbd) (new zzp(this, onpolygonclicklistener))));
		return;
	}

	public final void setOnPolylineClickListener(OnPolylineClickListener onpolylineclicklistener)
	{
		if(onpolylineclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			try
			{
				zzg.setOnPolylineClickListener(((com.google.android.gms.maps.internal.zzbf) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #554 <Method void IGoogleMapDelegate.setOnPolylineClickListener(com.google.android.gms.maps.internal.zzbf)>
				return;
	//    6   14:return          
			}
	//*   7   15:aload_0         
	//*   8   16:getfield        #112 <Field IGoogleMapDelegate zzg>
	//*   9   19:new             #556 <Class zzq>
	//*  10   22:dup             
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokespecial   #559 <Method void zzq(GoogleMap, GoogleMap$OnPolylineClickListener)>
	//*  14   28:invokeinterface #554 <Method void IGoogleMapDelegate.setOnPolylineClickListener(com.google.android.gms.maps.internal.zzbf)>
	//*  15   33:return          
			// Misplaced declaration of an exception variable
			catch(OnPolylineClickListener onpolylineclicklistener)
	//*  16   34:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onpolylineclicklistener)));
	//   17   35:new             #127 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
			}
		zzg.setOnPolylineClickListener(((com.google.android.gms.maps.internal.zzbf) (new zzq(this, onpolylineclicklistener))));
		return;
	}

	public final void setPadding(int i, int j, int k, int l)
	{
		try
		{
			zzg.setPadding(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokeinterface #563 <Method void IGoogleMapDelegate.setPadding(int, int, int, int)>
			return;
	//    7   14:return          
		}
		catch(RemoteException remoteexception)
	//*   8   15:astore          5
		{
			throw new RuntimeRemoteException(remoteexception);
	//    9   17:new             #127 <Class RuntimeRemoteException>
	//   10   20:dup             
	//   11   21:aload           5
	//   12   23:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   13   26:athrow          
		}
	}

	public final void setTrafficEnabled(boolean flag)
	{
		try
		{
			zzg.setTrafficEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:iload_1         
	//    3    5:invokeinterface #566 <Method void IGoogleMapDelegate.setTrafficEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #127 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void snapshot(SnapshotReadyCallback snapshotreadycallback)
	{
		snapshot(snapshotreadycallback, ((Bitmap) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #571 <Method void snapshot(GoogleMap$SnapshotReadyCallback, Bitmap)>
	//    4    6:return          
	}

	public final void snapshot(SnapshotReadyCallback snapshotreadycallback, Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			bitmap = ((Bitmap) (ObjectWrapper.wrap(((Object) (bitmap)))));
	//    2    4:aload_2         
	//    3    5:invokestatic    #577 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			bitmap = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		bitmap = ((Bitmap) ((ObjectWrapper)bitmap));
	//    8   14:aload_2         
	//    9   15:checkcast       #573 <Class ObjectWrapper>
	//   10   18:astore_2        
		try
		{
			zzg.snapshot(((com.google.android.gms.maps.internal.zzbs) (new zzr(this, snapshotreadycallback))), ((com.google.android.gms.dynamic.IObjectWrapper) (bitmap)));
	//   11   19:aload_0         
	//   12   20:getfield        #112 <Field IGoogleMapDelegate zzg>
	//   13   23:new             #579 <Class zzr>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #582 <Method void zzr(GoogleMap, GoogleMap$SnapshotReadyCallback)>
	//   18   32:aload_2         
	//   19   33:invokeinterface #585 <Method void IGoogleMapDelegate.snapshot(com.google.android.gms.maps.internal.zzbs, com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//   20   38:return          
		}
		// Misplaced declaration of an exception variable
		catch(SnapshotReadyCallback snapshotreadycallback)
	//*  21   39:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (snapshotreadycallback)));
	//   22   40:new             #127 <Class RuntimeRemoteException>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//   26   48:athrow          
		}
	}

	public final void stopAnimation()
	{
		try
		{
			zzg.stopAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field IGoogleMapDelegate zzg>
	//    2    4:invokeinterface #588 <Method void IGoogleMapDelegate.stopAnimation()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #127 <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #130 <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public static final int MAP_TYPE_HYBRID = 4;
	public static final int MAP_TYPE_NONE = 0;
	public static final int MAP_TYPE_NORMAL = 1;
	public static final int MAP_TYPE_SATELLITE = 2;
	public static final int MAP_TYPE_TERRAIN = 3;
	private final IGoogleMapDelegate zzg;
	private UiSettings zzh;
}
