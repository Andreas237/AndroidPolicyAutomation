// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzp;
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
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.zzb;
import com.google.android.gms.maps.model.internal.zzc;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzg;

// Referenced classes of package com.google.android.gms.maps:
//			CameraUpdate, Projection, UiSettings, LocationSource

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

	static final class zza extends com.google.android.gms.maps.internal.zzb.zza
	{

		public void onCancel()
		{
			zzbnX.onCancel();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field GoogleMap$CancelableCallback zzbnX>
		//    2    4:invokeinterface #22  <Method void GoogleMap$CancelableCallback.onCancel()>
		//    3    9:return          
		}

		public void onFinish()
		{
			zzbnX.onFinish();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field GoogleMap$CancelableCallback zzbnX>
		//    2    4:invokeinterface #25  <Method void GoogleMap$CancelableCallback.onFinish()>
		//    3    9:return          
		}

		private final CancelableCallback zzbnX;

		zza(CancelableCallback cancelablecallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void com.google.android.gms.maps.internal.zzb$zza()>
			zzbnX = cancelablecallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field GoogleMap$CancelableCallback zzbnX>
		//    5    9:return          
		}
	}


	protected GoogleMap(IGoogleMapDelegate igooglemapdelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #149 <Method void Object()>
		zzbnw = (IGoogleMapDelegate)zzac.zzw(((Object) (igooglemapdelegate)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #155 <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #157 <Class IGoogleMapDelegate>
	//    6   12:putfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    7   15:return          
	}

	public final Circle addCircle(CircleOptions circleoptions)
	{
		try
		{
			circleoptions = ((CircleOptions) (new Circle(zzbnw.addCircle(circleoptions))));
	//    0    0:new             #166 <Class Circle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aload_1         
	//    5    9:invokeinterface #169 <Method zzb IGoogleMapDelegate.addCircle(CircleOptions)>
	//    6   14:invokespecial   #172 <Method void Circle(zzb)>
	//    7   17:astore_1        
		}
	//*   8   18:aload_1         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(CircleOptions circleoptions)
	//*  10   20:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (circleoptions)));
	//   11   21:new             #174 <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return ((Circle) (circleoptions));
	}

	public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
	{
		try
		{
			groundoverlayoptions = ((GroundOverlayOptions) (zzbnw.addGroundOverlay(groundoverlayoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #182 <Method zzc IGoogleMapDelegate.addGroundOverlay(GroundOverlayOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
	//*   7   15:new             #184 <Class GroundOverlay>
	//*   8   18:dup             
	//*   9   19:aload_1         
	//*  10   20:invokespecial   #187 <Method void GroundOverlay(zzc)>
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
	//   17   29:new             #174 <Class RuntimeRemoteException>
	//   18   32:dup             
	//   19   33:aload_1         
	//   20   34:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   37:athrow          
		}
		if(groundoverlayoptions == null)
			break MISSING_BLOCK_LABEL_26;
		groundoverlayoptions = ((GroundOverlayOptions) (new GroundOverlay(((zzc) (groundoverlayoptions)))));
		return ((GroundOverlay) (groundoverlayoptions));
		return null;
	}

	public final Marker addMarker(MarkerOptions markeroptions)
	{
		try
		{
			markeroptions = ((MarkerOptions) (zzbnw.addMarker(markeroptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #192 <Method zzf IGoogleMapDelegate.addMarker(MarkerOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
	//*   7   15:new             #194 <Class Marker>
	//*   8   18:dup             
	//*   9   19:aload_1         
	//*  10   20:invokespecial   #197 <Method void Marker(zzf)>
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
	//   17   29:new             #174 <Class RuntimeRemoteException>
	//   18   32:dup             
	//   19   33:aload_1         
	//   20   34:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   37:athrow          
		}
		if(markeroptions == null)
			break MISSING_BLOCK_LABEL_26;
		markeroptions = ((MarkerOptions) (new Marker(((zzf) (markeroptions)))));
		return ((Marker) (markeroptions));
		return null;
	}

	public final Polygon addPolygon(PolygonOptions polygonoptions)
	{
		try
		{
			polygonoptions = ((PolygonOptions) (new Polygon(zzbnw.addPolygon(polygonoptions))));
	//    0    0:new             #201 <Class Polygon>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aload_1         
	//    5    9:invokeinterface #204 <Method zzg IGoogleMapDelegate.addPolygon(PolygonOptions)>
	//    6   14:invokespecial   #207 <Method void Polygon(zzg)>
	//    7   17:astore_1        
		}
	//*   8   18:aload_1         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(PolygonOptions polygonoptions)
	//*  10   20:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (polygonoptions)));
	//   11   21:new             #174 <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return ((Polygon) (polygonoptions));
	}

	public final Polyline addPolyline(PolylineOptions polylineoptions)
	{
		try
		{
			polylineoptions = ((PolylineOptions) (new Polyline(zzbnw.addPolyline(polylineoptions))));
	//    0    0:new             #211 <Class Polyline>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aload_1         
	//    5    9:invokeinterface #214 <Method IPolylineDelegate IGoogleMapDelegate.addPolyline(PolylineOptions)>
	//    6   14:invokespecial   #217 <Method void Polyline(IPolylineDelegate)>
	//    7   17:astore_1        
		}
	//*   8   18:aload_1         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(PolylineOptions polylineoptions)
	//*  10   20:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (polylineoptions)));
	//   11   21:new             #174 <Class RuntimeRemoteException>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   15   29:athrow          
		}
		return ((Polyline) (polylineoptions));
	}

	public final TileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
	{
		try
		{
			tileoverlayoptions = ((TileOverlayOptions) (zzbnw.addTileOverlay(tileoverlayoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #222 <Method com.google.android.gms.maps.model.internal.zzh IGoogleMapDelegate.addTileOverlay(TileOverlayOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
	//*   7   15:new             #224 <Class TileOverlay>
	//*   8   18:dup             
	//*   9   19:aload_1         
	//*  10   20:invokespecial   #227 <Method void TileOverlay(com.google.android.gms.maps.model.internal.zzh)>
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
	//   17   29:new             #174 <Class RuntimeRemoteException>
	//   18   32:dup             
	//   19   33:aload_1         
	//   20   34:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   37:athrow          
		}
		if(tileoverlayoptions == null)
			break MISSING_BLOCK_LABEL_26;
		tileoverlayoptions = ((TileOverlayOptions) (new TileOverlay(((com.google.android.gms.maps.model.internal.zzh) (tileoverlayoptions)))));
		return ((TileOverlay) (tileoverlayoptions));
		return null;
	}

	public final void animateCamera(CameraUpdate cameraupdate)
	{
		try
		{
			zzbnw.animateCamera(cameraupdate.zzJm());
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #235 <Method IObjectWrapper CameraUpdate.zzJm()>
	//    4    8:invokeinterface #238 <Method void IGoogleMapDelegate.animateCamera(IObjectWrapper)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*   6   14:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraupdate)));
	//    7   15:new             #174 <Class RuntimeRemoteException>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   23:athrow          
		}
	}

	public final void animateCamera(CameraUpdate cameraupdate, int i, CancelableCallback cancelablecallback)
	{
		IGoogleMapDelegate igooglemapdelegate;
		IObjectWrapper iobjectwrapper;
		try
		{
			igooglemapdelegate = zzbnw;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:astore          4
			iobjectwrapper = cameraupdate.zzJm();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #235 <Method IObjectWrapper CameraUpdate.zzJm()>
	//    5   10:astore          5
		}
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       21
	//*   8   16:aconst_null     
	//*   9   17:astore_1        
	//*  10   18:goto            30
	//*  11   21:new             #128 <Class GoogleMap$zza>
	//*  12   24:dup             
	//*  13   25:aload_3         
	//*  14   26:invokespecial   #242 <Method void GoogleMap$zza(GoogleMap$CancelableCallback)>
	//*  15   29:astore_1        
	//*  16   30:aload           4
	//*  17   32:aload           5
	//*  18   34:iload_2         
	//*  19   35:aload_1         
	//*  20   36:invokeinterface #246 <Method void IGoogleMapDelegate.animateCameraWithDurationAndCallback(IObjectWrapper, int, com.google.android.gms.maps.internal.zzb)>
	//*  21   41:return          
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*  22   42:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraupdate)));
	//   23   43:new             #174 <Class RuntimeRemoteException>
	//   24   46:dup             
	//   25   47:aload_1         
	//   26   48:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   27   51:athrow          
		}
		if(cancelablecallback == null)
		{
			cameraupdate = null;
			break MISSING_BLOCK_LABEL_30;
		}
		cameraupdate = ((CameraUpdate) (new zza(cancelablecallback)));
		igooglemapdelegate.animateCameraWithDurationAndCallback(iobjectwrapper, i, ((com.google.android.gms.maps.internal.zzb) (cameraupdate)));
		return;
	}

	public final void animateCamera(CameraUpdate cameraupdate, CancelableCallback cancelablecallback)
	{
		IGoogleMapDelegate igooglemapdelegate;
		IObjectWrapper iobjectwrapper;
		try
		{
			igooglemapdelegate = zzbnw;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:astore_3        
			iobjectwrapper = cameraupdate.zzJm();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #235 <Method IObjectWrapper CameraUpdate.zzJm()>
	//    5    9:astore          4
		}
	//*   6   11:aload_2         
	//*   7   12:ifnonnull       20
	//*   8   15:aconst_null     
	//*   9   16:astore_1        
	//*  10   17:goto            29
	//*  11   20:new             #128 <Class GoogleMap$zza>
	//*  12   23:dup             
	//*  13   24:aload_2         
	//*  14   25:invokespecial   #242 <Method void GoogleMap$zza(GoogleMap$CancelableCallback)>
	//*  15   28:astore_1        
	//*  16   29:aload_3         
	//*  17   30:aload           4
	//*  18   32:aload_1         
	//*  19   33:invokeinterface #251 <Method void IGoogleMapDelegate.animateCameraWithCallback(IObjectWrapper, com.google.android.gms.maps.internal.zzb)>
	//*  20   38:return          
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*  21   39:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraupdate)));
	//   22   40:new             #174 <Class RuntimeRemoteException>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   26   48:athrow          
		}
		if(cancelablecallback == null)
		{
			cameraupdate = null;
			break MISSING_BLOCK_LABEL_29;
		}
		cameraupdate = ((CameraUpdate) (new zza(cancelablecallback)));
		igooglemapdelegate.animateCameraWithCallback(iobjectwrapper, ((com.google.android.gms.maps.internal.zzb) (cameraupdate)));
		return;
	}

	public final void clear()
	{
		try
		{
			zzbnw.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #254 <Method void IGoogleMapDelegate.clear()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #174 <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final CameraPosition getCameraPosition()
	{
		CameraPosition cameraposition;
		try
		{
			cameraposition = zzbnw.getCameraPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #258 <Method CameraPosition IGoogleMapDelegate.getCameraPosition()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return cameraposition;
	}

	public IndoorBuilding getFocusedBuilding()
	{
		Object obj;
		try
		{
			obj = ((Object) (zzbnw.getFocusedBuilding()));
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #263 <Method com.google.android.gms.maps.model.internal.zzd IGoogleMapDelegate.getFocusedBuilding()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:ifnull          25
	//*   6   14:new             #265 <Class IndoorBuilding>
	//*   7   17:dup             
	//*   8   18:aload_1         
	//*   9   19:invokespecial   #268 <Method void IndoorBuilding(com.google.android.gms.maps.model.internal.zzd)>
	//*  10   22:astore_1        
	//*  11   23:aload_1         
	//*  12   24:areturn         
	//*  13   25:aconst_null     
	//*  14   26:areturn         
		catch(RemoteException remoteexception)
	//*  15   27:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   16   28:new             #174 <Class RuntimeRemoteException>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   20   36:athrow          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_25;
		obj = ((Object) (new IndoorBuilding(((com.google.android.gms.maps.model.internal.zzd) (obj)))));
		return ((IndoorBuilding) (obj));
		return null;
	}

	public final int getMapType()
	{
		int i;
		try
		{
			i = zzbnw.getMapType();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #272 <Method int IGoogleMapDelegate.getMapType()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public final float getMaxZoomLevel()
	{
		float f;
		try
		{
			f = zzbnw.getMaxZoomLevel();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #276 <Method float IGoogleMapDelegate.getMaxZoomLevel()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final float getMinZoomLevel()
	{
		float f;
		try
		{
			f = zzbnw.getMinZoomLevel();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #279 <Method float IGoogleMapDelegate.getMinZoomLevel()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return f;
	}

	public final Location getMyLocation()
	{
		Location location;
		try
		{
			location = zzbnw.getMyLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #284 <Method Location IGoogleMapDelegate.getMyLocation()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return location;
	}

	public final Projection getProjection()
	{
		Projection projection;
		try
		{
			projection = new Projection(zzbnw.getProjection());
	//    0    0:new             #289 <Class Projection>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:invokeinterface #292 <Method com.google.android.gms.maps.internal.IProjectionDelegate IGoogleMapDelegate.getProjection()>
	//    5   13:invokespecial   #295 <Method void Projection(com.google.android.gms.maps.internal.IProjectionDelegate)>
	//    6   16:astore_1        
		}
	//*   7   17:aload_1         
	//*   8   18:areturn         
		catch(RemoteException remoteexception)
	//*   9   19:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   10   20:new             #174 <Class RuntimeRemoteException>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   14   28:athrow          
		}
		return projection;
	}

	public final UiSettings getUiSettings()
	{
		UiSettings uisettings;
		try
		{
			if(zzbnx == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #299 <Field UiSettings zzbnx>
	//*   2    4:ifnonnull       27
				zzbnx = new UiSettings(zzbnw.getUiSettings());
	//    3    7:aload_0         
	//    4    8:new             #301 <Class UiSettings>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    8   16:invokeinterface #304 <Method com.google.android.gms.maps.internal.IUiSettingsDelegate IGoogleMapDelegate.getUiSettings()>
	//    9   21:invokespecial   #307 <Method void UiSettings(com.google.android.gms.maps.internal.IUiSettingsDelegate)>
	//   10   24:putfield        #299 <Field UiSettings zzbnx>
			uisettings = zzbnx;
	//   11   27:aload_0         
	//   12   28:getfield        #299 <Field UiSettings zzbnx>
	//   13   31:astore_1        
		}
	//*  14   32:aload_1         
	//*  15   33:areturn         
		catch(RemoteException remoteexception)
	//*  16   34:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   17   35:new             #174 <Class RuntimeRemoteException>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   43:athrow          
		}
		return uisettings;
	}

	public final boolean isBuildingsEnabled()
	{
		boolean flag;
		try
		{
			flag = zzbnw.isBuildingsEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #311 <Method boolean IGoogleMapDelegate.isBuildingsEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isIndoorEnabled()
	{
		boolean flag;
		try
		{
			flag = zzbnw.isIndoorEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #314 <Method boolean IGoogleMapDelegate.isIndoorEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isMyLocationEnabled()
	{
		boolean flag;
		try
		{
			flag = zzbnw.isMyLocationEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #317 <Method boolean IGoogleMapDelegate.isMyLocationEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final boolean isTrafficEnabled()
	{
		boolean flag;
		try
		{
			flag = zzbnw.isTrafficEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #320 <Method boolean IGoogleMapDelegate.isTrafficEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #174 <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	public final void moveCamera(CameraUpdate cameraupdate)
	{
		try
		{
			zzbnw.moveCamera(cameraupdate.zzJm());
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #235 <Method IObjectWrapper CameraUpdate.zzJm()>
	//    4    8:invokeinterface #323 <Method void IGoogleMapDelegate.moveCamera(IObjectWrapper)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*   6   14:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (cameraupdate)));
	//    7   15:new             #174 <Class RuntimeRemoteException>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   11   23:athrow          
		}
	}

	public void resetMinMaxZoomPreference()
	{
		try
		{
			zzbnw.resetMinMaxZoomPreference();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #326 <Method void IGoogleMapDelegate.resetMinMaxZoomPreference()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #174 <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final void setBuildingsEnabled(boolean flag)
	{
		try
		{
			zzbnw.setBuildingsEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:iload_1         
	//    3    5:invokeinterface #330 <Method void IGoogleMapDelegate.setBuildingsEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #174 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setContentDescription(String s)
	{
		try
		{
			zzbnw.setContentDescription(s);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #334 <Method void IGoogleMapDelegate.setContentDescription(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (s)));
	//    6   12:new             #174 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final boolean setIndoorEnabled(boolean flag)
	{
		try
		{
			flag = zzbnw.setIndoorEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:iload_1         
	//    3    5:invokeinterface #338 <Method boolean IGoogleMapDelegate.setIndoorEnabled(boolean)>
	//    4   10:istore_1        
		}
	//*   5   11:iload_1         
	//*   6   12:ireturn         
		catch(RemoteException remoteexception)
	//*   7   13:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    8   14:new             #174 <Class RuntimeRemoteException>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   12   22:athrow          
		}
		return flag;
	}

	public final void setInfoWindowAdapter(InfoWindowAdapter infowindowadapter)
	{
		if(infowindowadapter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setInfoWindowAdapter(((com.google.android.gms.maps.internal.zzd) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #343 <Method void IGoogleMapDelegate.setInfoWindowAdapter(com.google.android.gms.maps.internal.zzd)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #50  <Class GoogleMap$7>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #346 <Method void GoogleMap$7(GoogleMap, GoogleMap$InfoWindowAdapter)>
	//*  14   30:invokeinterface #343 <Method void IGoogleMapDelegate.setInfoWindowAdapter(com.google.android.gms.maps.internal.zzd)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(InfoWindowAdapter infowindowadapter)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (infowindowadapter)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setInfoWindowAdapter(((com.google.android.gms.maps.internal.zzd) (new com.google.android.gms.maps.internal.zzd.zza(infowindowadapter) {

			public IObjectWrapper zzh(zzf zzf)
			{
				return zzd.zzA(((Object) (zzbnE.getInfoWindow(new Marker(zzf)))));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$InfoWindowAdapter zzbnE>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #26  <Method void Marker(zzf)>
			//    6   12:invokeinterface #32  <Method View GoogleMap$InfoWindowAdapter.getInfoWindow(Marker)>
			//    7   17:invokestatic    #38  <Method IObjectWrapper zzd.zzA(Object)>
			//    8   20:areturn         
			}

			public IObjectWrapper zzi(zzf zzf)
			{
				return zzd.zzA(((Object) (zzbnE.getInfoContents(new Marker(zzf)))));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$InfoWindowAdapter zzbnE>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #26  <Method void Marker(zzf)>
			//    6   12:invokeinterface #42  <Method View GoogleMap$InfoWindowAdapter.getInfoContents(Marker)>
			//    7   17:invokestatic    #38  <Method IObjectWrapper zzd.zzA(Object)>
			//    8   20:areturn         
			}

			final InfoWindowAdapter zzbnE;

			
			{
				zzbnE = infowindowadapter;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$InfoWindowAdapter zzbnE>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzd$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public void setLatLngBoundsForCameraTarget(LatLngBounds latlngbounds)
	{
		try
		{
			zzbnw.setLatLngBoundsForCameraTarget(latlngbounds);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #350 <Method void IGoogleMapDelegate.setLatLngBoundsForCameraTarget(LatLngBounds)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLngBounds latlngbounds)
	//*   5   11:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (latlngbounds)));
	//    6   12:new             #174 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setLocationSource(LocationSource locationsource)
	{
		if(locationsource == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setLocationSource(((com.google.android.gms.maps.internal.ILocationSourceDelegate) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #355 <Method void IGoogleMapDelegate.setLocationSource(com.google.android.gms.maps.internal.ILocationSourceDelegate)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #12  <Class GoogleMap$12>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #358 <Method void GoogleMap$12(GoogleMap, LocationSource)>
	//*  14   30:invokeinterface #355 <Method void IGoogleMapDelegate.setLocationSource(com.google.android.gms.maps.internal.ILocationSourceDelegate)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(LocationSource locationsource)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (locationsource)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setLocationSource(((com.google.android.gms.maps.internal.ILocationSourceDelegate) (new com.google.android.gms.maps.internal.ILocationSourceDelegate.zza(locationsource) {

			public void activate(zzp zzp)
			{
				zzbnJ.activate(new LocationSource.OnLocationChangedListener(this, zzp) {

					public void onLocationChanged(Location location)
					{
						try
						{
							zzbnK.zze(location);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field zzp zzbnK>
					//    2    4:aload_1         
					//    3    5:invokeinterface #30  <Method void zzp.zze(Location)>
							return;
					//    4   10:return          
						}
						// Misplaced declaration of an exception variable
						catch(Location location)
					//*   5   11:astore_1        
						{
							throw new RuntimeRemoteException(((RemoteException) (location)));
					//    6   12:new             #32  <Class RuntimeRemoteException>
					//    7   15:dup             
					//    8   16:aload_1         
					//    9   17:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
					//   10   20:athrow          
						}
					}

					final zzp zzbnK;

			
			{
				zzbnK = zzp1;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #17  <Field zzp zzbnK>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LocationSource zzbnJ>
			//    2    4:new             #11  <Class GoogleMap$12$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:aload_1         
			//    6   10:invokespecial   #26  <Method void GoogleMap$12$1(GoogleMap$12, zzp)>
			//    7   13:invokeinterface #31  <Method void LocationSource.activate(LocationSource$OnLocationChangedListener)>
			//    8   18:return          
			}

			public void deactivate()
			{
				zzbnJ.deactivate();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LocationSource zzbnJ>
			//    2    4:invokeinterface #34  <Method void LocationSource.deactivate()>
			//    3    9:return          
			}

			final LocationSource zzbnJ;

			
			{
				zzbnJ = locationsource;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #17  <Field LocationSource zzbnJ>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void com.google.android.gms.maps.internal.ILocationSourceDelegate$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public boolean setMapStyle(MapStyleOptions mapstyleoptions)
	{
		boolean flag;
		try
		{
			flag = zzbnw.setMapStyle(mapstyleoptions);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:aload_1         
	//    3    5:invokeinterface #362 <Method boolean IGoogleMapDelegate.setMapStyle(MapStyleOptions)>
	//    4   10:istore_2        
		}
	//*   5   11:iload_2         
	//*   6   12:ireturn         
		// Misplaced declaration of an exception variable
		catch(MapStyleOptions mapstyleoptions)
	//*   7   13:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (mapstyleoptions)));
	//    8   14:new             #174 <Class RuntimeRemoteException>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   12   22:athrow          
		}
		return flag;
	}

	public final void setMapType(int i)
	{
		try
		{
			zzbnw.setMapType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:iload_1         
	//    3    5:invokeinterface #366 <Method void IGoogleMapDelegate.setMapType(int)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #174 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setMaxZoomPreference(float f)
	{
		try
		{
			zzbnw.setMaxZoomPreference(f);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:fload_1         
	//    3    5:invokeinterface #370 <Method void IGoogleMapDelegate.setMaxZoomPreference(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #174 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public void setMinZoomPreference(float f)
	{
		try
		{
			zzbnw.setMinZoomPreference(f);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:fload_1         
	//    3    5:invokeinterface #373 <Method void IGoogleMapDelegate.setMinZoomPreference(float)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #174 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setMyLocationEnabled(boolean flag)
	{
		try
		{
			zzbnw.setMyLocationEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:iload_1         
	//    3    5:invokeinterface #380 <Method void IGoogleMapDelegate.setMyLocationEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #174 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void setOnCameraChangeListener(OnCameraChangeListener oncamerachangelistener)
	{
		if(oncamerachangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnCameraChangeListener(((com.google.android.gms.maps.internal.zze) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #386 <Method void IGoogleMapDelegate.setOnCameraChangeListener(com.google.android.gms.maps.internal.zze)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #26  <Class GoogleMap$18>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #389 <Method void GoogleMap$18(GoogleMap, GoogleMap$OnCameraChangeListener)>
	//*  14   30:invokeinterface #386 <Method void IGoogleMapDelegate.setOnCameraChangeListener(com.google.android.gms.maps.internal.zze)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraChangeListener oncamerachangelistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncamerachangelistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnCameraChangeListener(((com.google.android.gms.maps.internal.zze) (new com.google.android.gms.maps.internal.zze.zza(oncamerachangelistener) {

			public void onCameraChange(CameraPosition cameraposition)
			{
				zzbnQ.onCameraChange(cameraposition);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnCameraChangeListener zzbnQ>
			//    2    4:aload_1         
			//    3    5:invokeinterface #25  <Method void GoogleMap$OnCameraChangeListener.onCameraChange(CameraPosition)>
			//    4   10:return          
			}

			final OnCameraChangeListener zzbnQ;

			
			{
				zzbnQ = oncamerachangelistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnCameraChangeListener zzbnQ>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zze$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnCameraIdleListener(OnCameraIdleListener oncameraidlelistener)
	{
		if(oncameraidlelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnCameraIdleListener(((com.google.android.gms.maps.internal.zzf) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #394 <Method void IGoogleMapDelegate.setOnCameraIdleListener(com.google.android.gms.maps.internal.zzf)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #36  <Class GoogleMap$22>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #397 <Method void GoogleMap$22(GoogleMap, GoogleMap$OnCameraIdleListener)>
	//*  14   30:invokeinterface #394 <Method void IGoogleMapDelegate.setOnCameraIdleListener(com.google.android.gms.maps.internal.zzf)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraIdleListener oncameraidlelistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncameraidlelistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnCameraIdleListener(((com.google.android.gms.maps.internal.zzf) (new com.google.android.gms.maps.internal.zzf.zza(oncameraidlelistener) {

			public void onCameraIdle()
			{
				zzbnU.onCameraIdle();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnCameraIdleListener zzbnU>
			//    2    4:invokeinterface #24  <Method void GoogleMap$OnCameraIdleListener.onCameraIdle()>
			//    3    9:return          
			}

			final OnCameraIdleListener zzbnU;

			
			{
				zzbnU = oncameraidlelistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnCameraIdleListener zzbnU>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzf$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnCameraMoveCanceledListener(OnCameraMoveCanceledListener oncameramovecanceledlistener)
	{
		if(oncameramovecanceledlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnCameraMoveCanceledListener(((com.google.android.gms.maps.internal.zzg) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #402 <Method void IGoogleMapDelegate.setOnCameraMoveCanceledListener(com.google.android.gms.maps.internal.zzg)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #34  <Class GoogleMap$21>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #405 <Method void GoogleMap$21(GoogleMap, GoogleMap$OnCameraMoveCanceledListener)>
	//*  14   30:invokeinterface #402 <Method void IGoogleMapDelegate.setOnCameraMoveCanceledListener(com.google.android.gms.maps.internal.zzg)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraMoveCanceledListener oncameramovecanceledlistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncameramovecanceledlistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnCameraMoveCanceledListener(((com.google.android.gms.maps.internal.zzg) (new com.google.android.gms.maps.internal.zzg.zza(oncameramovecanceledlistener) {

			public void onCameraMoveCanceled()
			{
				zzbnT.onCameraMoveCanceled();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnCameraMoveCanceledListener zzbnT>
			//    2    4:invokeinterface #24  <Method void GoogleMap$OnCameraMoveCanceledListener.onCameraMoveCanceled()>
			//    3    9:return          
			}

			final OnCameraMoveCanceledListener zzbnT;

			
			{
				zzbnT = oncameramovecanceledlistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnCameraMoveCanceledListener zzbnT>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzg$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnCameraMoveListener(OnCameraMoveListener oncameramovelistener)
	{
		if(oncameramovelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnCameraMoveListener(((com.google.android.gms.maps.internal.zzh) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #410 <Method void IGoogleMapDelegate.setOnCameraMoveListener(com.google.android.gms.maps.internal.zzh)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #32  <Class GoogleMap$20>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #413 <Method void GoogleMap$20(GoogleMap, GoogleMap$OnCameraMoveListener)>
	//*  14   30:invokeinterface #410 <Method void IGoogleMapDelegate.setOnCameraMoveListener(com.google.android.gms.maps.internal.zzh)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraMoveListener oncameramovelistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncameramovelistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnCameraMoveListener(((com.google.android.gms.maps.internal.zzh) (new com.google.android.gms.maps.internal.zzh.zza(oncameramovelistener) {

			public void onCameraMove()
			{
				zzbnS.onCameraMove();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnCameraMoveListener zzbnS>
			//    2    4:invokeinterface #24  <Method void GoogleMap$OnCameraMoveListener.onCameraMove()>
			//    3    9:return          
			}

			final OnCameraMoveListener zzbnS;

			
			{
				zzbnS = oncameramovelistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnCameraMoveListener zzbnS>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzh$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnCameraMoveStartedListener(OnCameraMoveStartedListener oncameramovestartedlistener)
	{
		if(oncameramovestartedlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnCameraMoveStartedListener(((com.google.android.gms.maps.internal.zzi) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #418 <Method void IGoogleMapDelegate.setOnCameraMoveStartedListener(com.google.android.gms.maps.internal.zzi)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #28  <Class GoogleMap$19>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #421 <Method void GoogleMap$19(GoogleMap, GoogleMap$OnCameraMoveStartedListener)>
	//*  14   30:invokeinterface #418 <Method void IGoogleMapDelegate.setOnCameraMoveStartedListener(com.google.android.gms.maps.internal.zzi)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnCameraMoveStartedListener oncameramovestartedlistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncameramovestartedlistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnCameraMoveStartedListener(((com.google.android.gms.maps.internal.zzi) (new com.google.android.gms.maps.internal.zzi.zza(oncameramovestartedlistener) {

			public void onCameraMoveStarted(int i)
			{
				zzbnR.onCameraMoveStarted(i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnCameraMoveStartedListener zzbnR>
			//    2    4:iload_1         
			//    3    5:invokeinterface #25  <Method void GoogleMap$OnCameraMoveStartedListener.onCameraMoveStarted(int)>
			//    4   10:return          
			}

			final OnCameraMoveStartedListener zzbnR;

			
			{
				zzbnR = oncameramovestartedlistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnCameraMoveStartedListener zzbnR>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzi$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnCircleClickListener(OnCircleClickListener oncircleclicklistener)
	{
		if(oncircleclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnCircleClickListener(((com.google.android.gms.maps.internal.zzj) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #426 <Method void IGoogleMapDelegate.setOnCircleClickListener(com.google.android.gms.maps.internal.zzj)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #16  <Class GoogleMap$13>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #429 <Method void GoogleMap$13(GoogleMap, GoogleMap$OnCircleClickListener)>
	//*  14   30:invokeinterface #426 <Method void IGoogleMapDelegate.setOnCircleClickListener(com.google.android.gms.maps.internal.zzj)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnCircleClickListener oncircleclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oncircleclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnCircleClickListener(((com.google.android.gms.maps.internal.zzj) (new com.google.android.gms.maps.internal.zzj.zza(oncircleclicklistener) {

			public void zza(zzb zzb)
			{
				zzbnL.onCircleClick(new Circle(zzb));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnCircleClickListener zzbnL>
			//    2    4:new             #23  <Class Circle>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Circle(zzb)>
			//    6   12:invokeinterface #31  <Method void GoogleMap$OnCircleClickListener.onCircleClick(Circle)>
			//    7   17:return          
			}

			final OnCircleClickListener zzbnL;

			
			{
				zzbnL = oncircleclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnCircleClickListener zzbnL>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzj$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnGroundOverlayClickListener(OnGroundOverlayClickListener ongroundoverlayclicklistener)
	{
		if(ongroundoverlayclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnGroundOverlayClickListener(((com.google.android.gms.maps.internal.zzk) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #434 <Method void IGoogleMapDelegate.setOnGroundOverlayClickListener(com.google.android.gms.maps.internal.zzk)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #10  <Class GoogleMap$11>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #437 <Method void GoogleMap$11(GoogleMap, GoogleMap$OnGroundOverlayClickListener)>
	//*  14   30:invokeinterface #434 <Method void IGoogleMapDelegate.setOnGroundOverlayClickListener(com.google.android.gms.maps.internal.zzk)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnGroundOverlayClickListener ongroundoverlayclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (ongroundoverlayclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnGroundOverlayClickListener(((com.google.android.gms.maps.internal.zzk) (new com.google.android.gms.maps.internal.zzk.zza(ongroundoverlayclicklistener) {

			public void zza(zzc zzc)
			{
				zzbnI.onGroundOverlayClick(new GroundOverlay(zzc));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnGroundOverlayClickListener zzbnI>
			//    2    4:new             #23  <Class GroundOverlay>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void GroundOverlay(zzc)>
			//    6   12:invokeinterface #31  <Method void GoogleMap$OnGroundOverlayClickListener.onGroundOverlayClick(GroundOverlay)>
			//    7   17:return          
			}

			final OnGroundOverlayClickListener zzbnI;

			
			{
				zzbnI = ongroundoverlayclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnGroundOverlayClickListener zzbnI>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzk$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onindoorstatechangelistener)
	{
		if(onindoorstatechangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnIndoorStateChangeListener(((com.google.android.gms.maps.internal.zzl) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #442 <Method void IGoogleMapDelegate.setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzl)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #6   <Class GoogleMap$1>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #445 <Method void GoogleMap$1(GoogleMap, GoogleMap$OnIndoorStateChangeListener)>
	//*  14   30:invokeinterface #442 <Method void IGoogleMapDelegate.setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzl)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnIndoorStateChangeListener onindoorstatechangelistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onindoorstatechangelistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnIndoorStateChangeListener(((com.google.android.gms.maps.internal.zzl) (new com.google.android.gms.maps.internal.zzl.zza(onindoorstatechangelistener) {

			public void onIndoorBuildingFocused()
			{
				zzbny.onIndoorBuildingFocused();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnIndoorStateChangeListener zzbny>
			//    2    4:invokeinterface #24  <Method void GoogleMap$OnIndoorStateChangeListener.onIndoorBuildingFocused()>
			//    3    9:return          
			}

			public void zza(com.google.android.gms.maps.model.internal.zzd zzd1)
			{
				zzbny.onIndoorLevelActivated(new IndoorBuilding(zzd1));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnIndoorStateChangeListener zzbny>
			//    2    4:new             #28  <Class IndoorBuilding>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #30  <Method void IndoorBuilding(com.google.android.gms.maps.model.internal.zzd)>
			//    6   12:invokeinterface #34  <Method void GoogleMap$OnIndoorStateChangeListener.onIndoorLevelActivated(IndoorBuilding)>
			//    7   17:return          
			}

			final OnIndoorStateChangeListener zzbny;

			
			{
				zzbny = onindoorstatechangelistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnIndoorStateChangeListener zzbny>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzl$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnInfoWindowClickListener(OnInfoWindowClickListener oninfowindowclicklistener)
	{
		if(oninfowindowclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnInfoWindowClickListener(((com.google.android.gms.maps.internal.zzm) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #450 <Method void IGoogleMapDelegate.setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzm)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #44  <Class GoogleMap$4>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #453 <Method void GoogleMap$4(GoogleMap, GoogleMap$OnInfoWindowClickListener)>
	//*  14   30:invokeinterface #450 <Method void IGoogleMapDelegate.setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzm)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnInfoWindowClickListener oninfowindowclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oninfowindowclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnInfoWindowClickListener(((com.google.android.gms.maps.internal.zzm) (new com.google.android.gms.maps.internal.zzm.zza(oninfowindowclicklistener) {

			public void zze(zzf zzf)
			{
				zzbnB.onInfoWindowClick(new Marker(zzf));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnInfoWindowClickListener zzbnB>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Marker(zzf)>
			//    6   12:invokeinterface #31  <Method void GoogleMap$OnInfoWindowClickListener.onInfoWindowClick(Marker)>
			//    7   17:return          
			}

			final OnInfoWindowClickListener zzbnB;

			
			{
				zzbnB = oninfowindowclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnInfoWindowClickListener zzbnB>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzm$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnInfoWindowCloseListener(OnInfoWindowCloseListener oninfowindowcloselistener)
	{
		if(oninfowindowcloselistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnInfoWindowCloseListener(((com.google.android.gms.maps.internal.zzn) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #458 <Method void IGoogleMapDelegate.setOnInfoWindowCloseListener(com.google.android.gms.maps.internal.zzn)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #48  <Class GoogleMap$6>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #461 <Method void GoogleMap$6(GoogleMap, GoogleMap$OnInfoWindowCloseListener)>
	//*  14   30:invokeinterface #458 <Method void IGoogleMapDelegate.setOnInfoWindowCloseListener(com.google.android.gms.maps.internal.zzn)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnInfoWindowCloseListener oninfowindowcloselistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oninfowindowcloselistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnInfoWindowCloseListener(((com.google.android.gms.maps.internal.zzn) (new com.google.android.gms.maps.internal.zzn.zza(oninfowindowcloselistener) {

			public void zzg(zzf zzf)
			{
				zzbnD.onInfoWindowClose(new Marker(zzf));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnInfoWindowCloseListener zzbnD>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Marker(zzf)>
			//    6   12:invokeinterface #31  <Method void GoogleMap$OnInfoWindowCloseListener.onInfoWindowClose(Marker)>
			//    7   17:return          
			}

			final OnInfoWindowCloseListener zzbnD;

			
			{
				zzbnD = oninfowindowcloselistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnInfoWindowCloseListener zzbnD>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzn$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnInfoWindowLongClickListener(OnInfoWindowLongClickListener oninfowindowlongclicklistener)
	{
		if(oninfowindowlongclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnInfoWindowLongClickListener(((com.google.android.gms.maps.internal.zzo) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #466 <Method void IGoogleMapDelegate.setOnInfoWindowLongClickListener(com.google.android.gms.maps.internal.zzo)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #46  <Class GoogleMap$5>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #469 <Method void GoogleMap$5(GoogleMap, GoogleMap$OnInfoWindowLongClickListener)>
	//*  14   30:invokeinterface #466 <Method void IGoogleMapDelegate.setOnInfoWindowLongClickListener(com.google.android.gms.maps.internal.zzo)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnInfoWindowLongClickListener oninfowindowlongclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (oninfowindowlongclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnInfoWindowLongClickListener(((com.google.android.gms.maps.internal.zzo) (new com.google.android.gms.maps.internal.zzo.zza(oninfowindowlongclicklistener) {

			public void zzf(zzf zzf1)
			{
				zzbnC.onInfoWindowLongClick(new Marker(zzf1));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnInfoWindowLongClickListener zzbnC>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Marker(zzf)>
			//    6   12:invokeinterface #31  <Method void GoogleMap$OnInfoWindowLongClickListener.onInfoWindowLongClick(Marker)>
			//    7   17:return          
			}

			final OnInfoWindowLongClickListener zzbnC;

			
			{
				zzbnC = oninfowindowlongclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnInfoWindowLongClickListener zzbnC>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzo$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnMapClickListener(OnMapClickListener onmapclicklistener)
	{
		if(onmapclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnMapClickListener(((com.google.android.gms.maps.internal.zzq) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #474 <Method void IGoogleMapDelegate.setOnMapClickListener(com.google.android.gms.maps.internal.zzq)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #38  <Class GoogleMap$23>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #477 <Method void GoogleMap$23(GoogleMap, GoogleMap$OnMapClickListener)>
	//*  14   30:invokeinterface #474 <Method void IGoogleMapDelegate.setOnMapClickListener(com.google.android.gms.maps.internal.zzq)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnMapClickListener onmapclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmapclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnMapClickListener(((com.google.android.gms.maps.internal.zzq) (new com.google.android.gms.maps.internal.zzq.zza(onmapclicklistener) {

			public void onMapClick(LatLng latlng)
			{
				zzbnV.onMapClick(latlng);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMapClickListener zzbnV>
			//    2    4:aload_1         
			//    3    5:invokeinterface #25  <Method void GoogleMap$OnMapClickListener.onMapClick(LatLng)>
			//    4   10:return          
			}

			final OnMapClickListener zzbnV;

			
			{
				zzbnV = onmapclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnMapClickListener zzbnV>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzq$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public void setOnMapLoadedCallback(OnMapLoadedCallback onmaploadedcallback)
	{
		if(onmaploadedcallback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnMapLoadedCallback(((com.google.android.gms.maps.internal.zzr) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #482 <Method void IGoogleMapDelegate.setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzr)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #8   <Class GoogleMap$10>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #485 <Method void GoogleMap$10(GoogleMap, GoogleMap$OnMapLoadedCallback)>
	//*  14   30:invokeinterface #482 <Method void IGoogleMapDelegate.setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzr)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnMapLoadedCallback onmaploadedcallback)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmaploadedcallback)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnMapLoadedCallback(((com.google.android.gms.maps.internal.zzr) (new com.google.android.gms.maps.internal.zzr.zza(onmaploadedcallback) {

			public void onMapLoaded()
				throws RemoteException
			{
				zzbnH.onMapLoaded();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMapLoadedCallback zzbnH>
			//    2    4:invokeinterface #26  <Method void GoogleMap$OnMapLoadedCallback.onMapLoaded()>
			//    3    9:return          
			}

			final OnMapLoadedCallback zzbnH;

			
			{
				zzbnH = onmaploadedcallback;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnMapLoadedCallback zzbnH>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzr$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnMapLongClickListener(OnMapLongClickListener onmaplongclicklistener)
	{
		if(onmaplongclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnMapLongClickListener(((com.google.android.gms.maps.internal.zzs) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #490 <Method void IGoogleMapDelegate.setOnMapLongClickListener(com.google.android.gms.maps.internal.zzs)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #40  <Class GoogleMap$24>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #493 <Method void GoogleMap$24(GoogleMap, GoogleMap$OnMapLongClickListener)>
	//*  14   30:invokeinterface #490 <Method void IGoogleMapDelegate.setOnMapLongClickListener(com.google.android.gms.maps.internal.zzs)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnMapLongClickListener onmaplongclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmaplongclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnMapLongClickListener(((com.google.android.gms.maps.internal.zzs) (new com.google.android.gms.maps.internal.zzs.zza(onmaplongclicklistener) {

			public void onMapLongClick(LatLng latlng)
			{
				zzbnW.onMapLongClick(latlng);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMapLongClickListener zzbnW>
			//    2    4:aload_1         
			//    3    5:invokeinterface #25  <Method void GoogleMap$OnMapLongClickListener.onMapLongClick(LatLng)>
			//    4   10:return          
			}

			final OnMapLongClickListener zzbnW;

			
			{
				zzbnW = onmaplongclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnMapLongClickListener zzbnW>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzs$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnMarkerClickListener(OnMarkerClickListener onmarkerclicklistener)
	{
		if(onmarkerclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnMarkerClickListener(((com.google.android.gms.maps.internal.zzu) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #498 <Method void IGoogleMapDelegate.setOnMarkerClickListener(com.google.android.gms.maps.internal.zzu)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #30  <Class GoogleMap$2>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #501 <Method void GoogleMap$2(GoogleMap, GoogleMap$OnMarkerClickListener)>
	//*  14   30:invokeinterface #498 <Method void IGoogleMapDelegate.setOnMarkerClickListener(com.google.android.gms.maps.internal.zzu)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnMarkerClickListener onmarkerclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmarkerclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnMarkerClickListener(((com.google.android.gms.maps.internal.zzu) (new com.google.android.gms.maps.internal.zzu.zza(onmarkerclicklistener) {

			public boolean zza(zzf zzf)
			{
				return zzbnz.onMarkerClick(new Marker(zzf));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMarkerClickListener zzbnz>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #26  <Method void Marker(zzf)>
			//    6   12:invokeinterface #32  <Method boolean GoogleMap$OnMarkerClickListener.onMarkerClick(Marker)>
			//    7   17:ireturn         
			}

			final OnMarkerClickListener zzbnz;

			
			{
				zzbnz = onmarkerclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnMarkerClickListener zzbnz>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzu$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnMarkerDragListener(OnMarkerDragListener onmarkerdraglistener)
	{
		if(onmarkerdraglistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnMarkerDragListener(((com.google.android.gms.maps.internal.zzv) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #506 <Method void IGoogleMapDelegate.setOnMarkerDragListener(com.google.android.gms.maps.internal.zzv)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #42  <Class GoogleMap$3>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #509 <Method void GoogleMap$3(GoogleMap, GoogleMap$OnMarkerDragListener)>
	//*  14   30:invokeinterface #506 <Method void IGoogleMapDelegate.setOnMarkerDragListener(com.google.android.gms.maps.internal.zzv)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnMarkerDragListener onmarkerdraglistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmarkerdraglistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnMarkerDragListener(((com.google.android.gms.maps.internal.zzv) (new com.google.android.gms.maps.internal.zzv.zza(onmarkerdraglistener) {

			public void zzb(zzf zzf)
			{
				zzbnA.onMarkerDragStart(new Marker(zzf));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMarkerDragListener zzbnA>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Marker(zzf)>
			//    6   12:invokeinterface #31  <Method void GoogleMap$OnMarkerDragListener.onMarkerDragStart(Marker)>
			//    7   17:return          
			}

			public void zzc(zzf zzf)
			{
				zzbnA.onMarkerDragEnd(new Marker(zzf));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMarkerDragListener zzbnA>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Marker(zzf)>
			//    6   12:invokeinterface #35  <Method void GoogleMap$OnMarkerDragListener.onMarkerDragEnd(Marker)>
			//    7   17:return          
			}

			public void zzd(zzf zzf)
			{
				zzbnA.onMarkerDrag(new Marker(zzf));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMarkerDragListener zzbnA>
			//    2    4:new             #23  <Class Marker>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Marker(zzf)>
			//    6   12:invokeinterface #39  <Method void GoogleMap$OnMarkerDragListener.onMarkerDrag(Marker)>
			//    7   17:return          
			}

			final OnMarkerDragListener zzbnA;

			
			{
				zzbnA = onmarkerdraglistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnMarkerDragListener zzbnA>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzv$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
	{
		if(onmylocationbuttonclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnMyLocationButtonClickListener(((com.google.android.gms.maps.internal.zzw) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #514 <Method void IGoogleMapDelegate.setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzw)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #54  <Class GoogleMap$9>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #517 <Method void GoogleMap$9(GoogleMap, GoogleMap$OnMyLocationButtonClickListener)>
	//*  14   30:invokeinterface #514 <Method void IGoogleMapDelegate.setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzw)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnMyLocationButtonClickListener onmylocationbuttonclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmylocationbuttonclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnMyLocationButtonClickListener(((com.google.android.gms.maps.internal.zzw) (new com.google.android.gms.maps.internal.zzw.zza(onmylocationbuttonclicklistener) {

			public boolean onMyLocationButtonClick()
				throws RemoteException
			{
				return zzbnG.onMyLocationButtonClick();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMyLocationButtonClickListener zzbnG>
			//    2    4:invokeinterface #27  <Method boolean GoogleMap$OnMyLocationButtonClickListener.onMyLocationButtonClick()>
			//    3    9:ireturn         
			}

			final OnMyLocationButtonClickListener zzbnG;

			
			{
				zzbnG = onmylocationbuttonclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnMyLocationButtonClickListener zzbnG>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzw$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onmylocationchangelistener)
	{
		if(onmylocationchangelistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnMyLocationChangeListener(((com.google.android.gms.maps.internal.zzx) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #522 <Method void IGoogleMapDelegate.setOnMyLocationChangeListener(com.google.android.gms.maps.internal.zzx)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #52  <Class GoogleMap$8>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #525 <Method void GoogleMap$8(GoogleMap, GoogleMap$OnMyLocationChangeListener)>
	//*  14   30:invokeinterface #522 <Method void IGoogleMapDelegate.setOnMyLocationChangeListener(com.google.android.gms.maps.internal.zzx)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnMyLocationChangeListener onmylocationchangelistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onmylocationchangelistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnMyLocationChangeListener(((com.google.android.gms.maps.internal.zzx) (new com.google.android.gms.maps.internal.zzx.zza(onmylocationchangelistener) {

			public void zzG(IObjectWrapper iobjectwrapper)
			{
				zzbnF.onMyLocationChange((Location)zzd.zzF(iobjectwrapper));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnMyLocationChangeListener zzbnF>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method Object zzd.zzF(IObjectWrapper)>
			//    4    8:checkcast       #29  <Class Location>
			//    5   11:invokeinterface #35  <Method void GoogleMap$OnMyLocationChangeListener.onMyLocationChange(Location)>
			//    6   16:return          
			}

			final OnMyLocationChangeListener zzbnF;

			
			{
				zzbnF = onmylocationchangelistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnMyLocationChangeListener zzbnF>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzx$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnPoiClickListener(OnPoiClickListener onpoiclicklistener)
	{
		if(onpoiclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnPoiClickListener(((com.google.android.gms.maps.internal.zzy) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #530 <Method void IGoogleMapDelegate.setOnPoiClickListener(com.google.android.gms.maps.internal.zzy)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #24  <Class GoogleMap$17>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #533 <Method void GoogleMap$17(GoogleMap, GoogleMap$OnPoiClickListener)>
	//*  14   30:invokeinterface #530 <Method void IGoogleMapDelegate.setOnPoiClickListener(com.google.android.gms.maps.internal.zzy)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnPoiClickListener onpoiclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onpoiclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnPoiClickListener(((com.google.android.gms.maps.internal.zzy) (new com.google.android.gms.maps.internal.zzy.zza(onpoiclicklistener) {

			public void zza(PointOfInterest pointofinterest)
				throws RemoteException
			{
				zzbnP.onPoiClick(pointofinterest);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnPoiClickListener zzbnP>
			//    2    4:aload_1         
			//    3    5:invokeinterface #28  <Method void GoogleMap$OnPoiClickListener.onPoiClick(PointOfInterest)>
			//    4   10:return          
			}

			final OnPoiClickListener zzbnP;

			
			{
				zzbnP = onpoiclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnPoiClickListener zzbnP>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzy$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnPolygonClickListener(OnPolygonClickListener onpolygonclicklistener)
	{
		if(onpolygonclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnPolygonClickListener(((com.google.android.gms.maps.internal.zzz) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #538 <Method void IGoogleMapDelegate.setOnPolygonClickListener(com.google.android.gms.maps.internal.zzz)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #18  <Class GoogleMap$14>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #541 <Method void GoogleMap$14(GoogleMap, GoogleMap$OnPolygonClickListener)>
	//*  14   30:invokeinterface #538 <Method void IGoogleMapDelegate.setOnPolygonClickListener(com.google.android.gms.maps.internal.zzz)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnPolygonClickListener onpolygonclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onpolygonclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnPolygonClickListener(((com.google.android.gms.maps.internal.zzz) (new com.google.android.gms.maps.internal.zzz.zza(onpolygonclicklistener) {

			public void zza(zzg zzg)
			{
				zzbnM.onPolygonClick(new Polygon(zzg));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnPolygonClickListener zzbnM>
			//    2    4:new             #23  <Class Polygon>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Polygon(zzg)>
			//    6   12:invokeinterface #31  <Method void GoogleMap$OnPolygonClickListener.onPolygonClick(Polygon)>
			//    7   17:return          
			}

			final OnPolygonClickListener zzbnM;

			
			{
				zzbnM = onpolygonclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnPolygonClickListener zzbnM>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzz$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setOnPolylineClickListener(OnPolylineClickListener onpolylineclicklistener)
	{
		if(onpolylineclicklistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       17
		{
			try
			{
				zzbnw.setOnPolylineClickListener(((com.google.android.gms.maps.internal.zzaa) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #546 <Method void IGoogleMapDelegate.setOnPolylineClickListener(com.google.android.gms.maps.internal.zzaa)>
			}
	//*   6   14:goto            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//*   9   21:new             #20  <Class GoogleMap$15>
	//*  10   24:dup             
	//*  11   25:aload_0         
	//*  12   26:aload_1         
	//*  13   27:invokespecial   #549 <Method void GoogleMap$15(GoogleMap, GoogleMap$OnPolylineClickListener)>
	//*  14   30:invokeinterface #546 <Method void IGoogleMapDelegate.setOnPolylineClickListener(com.google.android.gms.maps.internal.zzaa)>
	//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(OnPolylineClickListener onpolylineclicklistener)
	//*  16   36:astore_1        
			{
				throw new RuntimeRemoteException(((RemoteException) (onpolylineclicklistener)));
	//   17   37:new             #174 <Class RuntimeRemoteException>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   21   45:athrow          
			}
			break MISSING_BLOCK_LABEL_35;
		}
		zzbnw.setOnPolylineClickListener(((com.google.android.gms.maps.internal.zzaa) (new com.google.android.gms.maps.internal.zzaa.zza(onpolylineclicklistener) {

			public void zza(IPolylineDelegate ipolylinedelegate)
			{
				zzbnN.onPolylineClick(new Polyline(ipolylinedelegate));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GoogleMap$OnPolylineClickListener zzbnN>
			//    2    4:new             #23  <Class Polyline>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #25  <Method void Polyline(IPolylineDelegate)>
			//    6   12:invokeinterface #31  <Method void GoogleMap$OnPolylineClickListener.onPolylineClick(Polyline)>
			//    7   17:return          
			}

			final OnPolylineClickListener zzbnN;

			
			{
				zzbnN = onpolylineclicklistener;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$OnPolylineClickListener zzbnN>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzaa$zza()>
			//    5    9:return          
			}
		}
)));
	}

	public final void setPadding(int i, int j, int k, int l)
	{
		try
		{
			zzbnw.setPadding(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokeinterface #553 <Method void IGoogleMapDelegate.setPadding(int, int, int, int)>
			return;
	//    7   14:return          
		}
		catch(RemoteException remoteexception)
	//*   8   15:astore          5
		{
			throw new RuntimeRemoteException(remoteexception);
	//    9   17:new             #174 <Class RuntimeRemoteException>
	//   10   20:dup             
	//   11   21:aload           5
	//   12   23:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   13   26:athrow          
		}
	}

	public final void setTrafficEnabled(boolean flag)
	{
		try
		{
			zzbnw.setTrafficEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:iload_1         
	//    3    5:invokeinterface #556 <Method void IGoogleMapDelegate.setTrafficEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(RemoteException remoteexception)
	//*   5   11:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    6   12:new             #174 <Class RuntimeRemoteException>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   10   20:athrow          
		}
	}

	public final void snapshot(SnapshotReadyCallback snapshotreadycallback)
	{
		snapshot(snapshotreadycallback, ((Bitmap) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #561 <Method void snapshot(GoogleMap$SnapshotReadyCallback, Bitmap)>
	//    4    6:return          
	}

	public final void snapshot(SnapshotReadyCallback snapshotreadycallback, Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			bitmap = ((Bitmap) (zzd.zzA(((Object) (bitmap)))));
	//    2    4:aload_2         
	//    3    5:invokestatic    #567 <Method IObjectWrapper zzd.zzA(Object)>
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			bitmap = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		bitmap = ((Bitmap) ((zzd)bitmap));
	//    8   14:aload_2         
	//    9   15:checkcast       #563 <Class zzd>
	//   10   18:astore_2        
		try
		{
			zzbnw.snapshot(((com.google.android.gms.maps.internal.zzag) (new com.google.android.gms.maps.internal.zzag.zza(snapshotreadycallback) {

				public void onSnapshotReady(Bitmap bitmap1)
					throws RemoteException
				{
					zzbnO.onSnapshotReady(bitmap1);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field GoogleMap$SnapshotReadyCallback zzbnO>
				//    2    4:aload_1         
				//    3    5:invokeinterface #27  <Method void GoogleMap$SnapshotReadyCallback.onSnapshotReady(Bitmap)>
				//    4   10:return          
				}

				public void zzH(IObjectWrapper iobjectwrapper)
					throws RemoteException
				{
					zzbnO.onSnapshotReady((Bitmap)zzd.zzF(iobjectwrapper));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field GoogleMap$SnapshotReadyCallback zzbnO>
				//    2    4:aload_1         
				//    3    5:invokestatic    #36  <Method Object zzd.zzF(IObjectWrapper)>
				//    4    8:checkcast       #38  <Class Bitmap>
				//    5   11:invokeinterface #27  <Method void GoogleMap$SnapshotReadyCallback.onSnapshotReady(Bitmap)>
				//    6   16:return          
				}

				final SnapshotReadyCallback zzbnO;

			
			{
				zzbnO = snapshotreadycallback;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field GoogleMap$SnapshotReadyCallback zzbnO>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzag$zza()>
			//    5    9:return          
			}
			}
)), ((IObjectWrapper) (bitmap)));
	//   11   19:aload_0         
	//   12   20:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//   13   23:new             #22  <Class GoogleMap$16>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #570 <Method void GoogleMap$16(GoogleMap, GoogleMap$SnapshotReadyCallback)>
	//   18   32:aload_2         
	//   19   33:invokeinterface #573 <Method void IGoogleMapDelegate.snapshot(com.google.android.gms.maps.internal.zzag, IObjectWrapper)>
			return;
	//   20   38:return          
		}
		// Misplaced declaration of an exception variable
		catch(SnapshotReadyCallback snapshotreadycallback)
	//*  21   39:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (snapshotreadycallback)));
	//   22   40:new             #174 <Class RuntimeRemoteException>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//   26   48:athrow          
		}
	}

	public final void stopAnimation()
	{
		try
		{
			zzbnw.stopAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field IGoogleMapDelegate zzbnw>
	//    2    4:invokeinterface #576 <Method void IGoogleMapDelegate.stopAnimation()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #174 <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #177 <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public static final int MAP_TYPE_HYBRID = 4;
	public static final int MAP_TYPE_NONE = 0;
	public static final int MAP_TYPE_NORMAL = 1;
	public static final int MAP_TYPE_SATELLITE = 2;
	public static final int MAP_TYPE_TERRAIN = 3;
	private final IGoogleMapDelegate zzbnw;
	private UiSettings zzbnx;
}
