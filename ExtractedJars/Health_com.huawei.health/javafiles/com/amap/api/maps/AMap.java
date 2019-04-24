// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.maps.model.AMapGestureListener;
import com.amap.api.maps.model.Arc;
import com.amap.api.maps.model.ArcOptions;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.BuildingOverlay;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.Circle;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.CrossOverlay;
import com.amap.api.maps.model.CrossOverlayOptions;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.GL3DModelOptions;
import com.amap.api.maps.model.GroundOverlay;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.IndoorBuildingInfo;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.MultiPointOverlay;
import com.amap.api.maps.model.MultiPointOverlayOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.MyTrafficStyle;
import com.amap.api.maps.model.NavigateArrow;
import com.amap.api.maps.model.NavigateArrowOptions;
import com.amap.api.maps.model.Poi;
import com.amap.api.maps.model.Polygon;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.RouteOverlay;
import com.amap.api.maps.model.Text;
import com.amap.api.maps.model.TextOptions;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amap.api.maps:
//			CameraUpdateFactory, UiSettings, Projection, CameraUpdate, 
//			InfoWindowAnimationManager, CustomRenderer, LocationSource, InfoWindowParams

public final class AMap
{
	public static interface CancelableCallback
	{

		public abstract void onCancel();

		public abstract void onFinish();
	}

	public static interface CommonInfoWindowAdapter
	{

		public abstract InfoWindowParams getInfoWindowParams(BasePointOverlay basepointoverlay);
	}

	public static interface ImageInfoWindowAdapter
		extends InfoWindowAdapter
	{

		public abstract long getInfoWindowUpdateTime();
	}

	public static interface InfoWindowAdapter
	{

		public abstract View getInfoContents(Marker marker);

		public abstract View getInfoWindow(Marker marker);
	}

	public static interface MultiPositionInfoWindowAdapter
		extends InfoWindowAdapter
	{

		public abstract View getInfoWindowClick(Marker marker);

		public abstract View getOverturnInfoWindow(Marker marker);

		public abstract View getOverturnInfoWindowClick(Marker marker);
	}

	public static interface OnCacheRemoveListener
	{

		public abstract void onRemoveCacheFinish(boolean flag);
	}

	public static interface OnCameraChangeListener
	{

		public abstract void onCameraChange(CameraPosition cameraposition);

		public abstract void onCameraChangeFinish(CameraPosition cameraposition);
	}

	public static interface OnIndoorBuildingActiveListener
	{

		public abstract void OnIndoorBuilding(IndoorBuildingInfo indoorbuildinginfo);
	}

	public static interface OnInfoWindowClickListener
	{

		public abstract void onInfoWindowClick(Marker marker);
	}

	public static interface OnMapClickListener
	{

		public abstract void onMapClick(LatLng latlng);
	}

	public static interface OnMapLoadedListener
	{

		public abstract void onMapLoaded();
	}

	public static interface OnMapLongClickListener
	{

		public abstract void onMapLongClick(LatLng latlng);
	}

	public static interface OnMapScreenShotListener
	{

		public abstract void onMapScreenShot(Bitmap bitmap);

		public abstract void onMapScreenShot(Bitmap bitmap, int i);
	}

	public static interface OnMapTouchListener
	{

		public abstract void onTouch(MotionEvent motionevent);
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

	public static interface OnMultiPointClickListener
	{

		public abstract boolean onPointClick(MultiPointItem multipointitem);
	}

	public static interface OnMyLocationChangeListener
	{

		public abstract void onMyLocationChange(Location location);
	}

	public static interface OnPOIClickListener
	{

		public abstract void onPOIClick(Poi poi);
	}

	public static interface OnPolylineClickListener
	{

		public abstract void onPolylineClick(Polyline polyline);
	}

	public static interface onMapPrintScreenListener
	{

		public abstract void onMapPrint(Drawable drawable);
	}


	protected AMap(IAMap iamap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void Object()>
		a = iamap;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #108 <Field IAMap a>
	//    5    9:return          
	}

	public static String getVersion()
	{
		return "6.3.1";
	//    0    0:ldc1            #114 <String "6.3.1">
	//    1    2:areturn         
	}

	public final Arc addArc(ArcOptions arcoptions)
	{
		try
		{
			arcoptions = ((ArcOptions) (a.addArc(arcoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #123 <Method Arc IAMap.addArc(ArcOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(ArcOptions arcoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (arcoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((Arc) (arcoptions));
	}

	public final BuildingOverlay addBuildingOverlay()
	{
		BuildingOverlay buildingoverlay;
		try
		{
			buildingoverlay = a.addBuildingOverlay();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #130 <Method BuildingOverlay IAMap.addBuildingOverlay()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return buildingoverlay;
	}

	public final Circle addCircle(CircleOptions circleoptions)
	{
		try
		{
			circleoptions = ((CircleOptions) (a.addCircle(circleoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #134 <Method Circle IAMap.addCircle(CircleOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(CircleOptions circleoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (circleoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((Circle) (circleoptions));
	}

	public CrossOverlay addCrossOverlay(CrossOverlayOptions crossoverlayoptions)
	{
		try
		{
			crossoverlayoptions = ((CrossOverlayOptions) (a.addCrossVector(crossoverlayoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #139 <Method CrossOverlay IAMap.addCrossVector(CrossOverlayOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(CrossOverlayOptions crossoverlayoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (crossoverlayoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((CrossOverlay) (crossoverlayoptions));
	}

	public GL3DModel addGL3DModel(GL3DModelOptions gl3dmodeloptions)
	{
		try
		{
			gl3dmodeloptions = ((GL3DModelOptions) (a.addGLModel(gl3dmodeloptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #144 <Method GL3DModel IAMap.addGLModel(GL3DModelOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(GL3DModelOptions gl3dmodeloptions)
	//*   7   13:astore_1        
		{
			((Throwable) (gl3dmodeloptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((GL3DModel) (gl3dmodeloptions));
	}

	public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
	{
		try
		{
			groundoverlayoptions = ((GroundOverlayOptions) (a.addGroundOverlay(groundoverlayoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #148 <Method GroundOverlay IAMap.addGroundOverlay(GroundOverlayOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(GroundOverlayOptions groundoverlayoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (groundoverlayoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((GroundOverlay) (groundoverlayoptions));
	}

	public final Marker addMarker(MarkerOptions markeroptions)
	{
		try
		{
			markeroptions = ((MarkerOptions) (a.addMarker(markeroptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #152 <Method Marker IAMap.addMarker(MarkerOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(MarkerOptions markeroptions)
	//*   7   13:astore_1        
		{
			((Throwable) (markeroptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((Marker) (markeroptions));
	}

	public final ArrayList addMarkers(ArrayList arraylist, boolean flag)
	{
		try
		{
			arraylist = a.addMarkers(arraylist, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #156 <Method ArrayList IAMap.addMarkers(ArrayList, boolean)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(ArrayList arraylist)
	//*   8   14:astore_1        
		{
			((Throwable) (arraylist)).printStackTrace();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		}
		return arraylist;
	}

	public MultiPointOverlay addMultiPointOverlay(MultiPointOverlayOptions multipointoverlayoptions)
	{
		try
		{
			multipointoverlayoptions = ((MultiPointOverlayOptions) (a.addMultiPointOverlay(multipointoverlayoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #162 <Method MultiPointOverlay IAMap.addMultiPointOverlay(MultiPointOverlayOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(MultiPointOverlayOptions multipointoverlayoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (multipointoverlayoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((MultiPointOverlay) (multipointoverlayoptions));
	}

	public final NavigateArrow addNavigateArrow(NavigateArrowOptions navigatearrowoptions)
	{
		try
		{
			navigatearrowoptions = ((NavigateArrowOptions) (a.addNavigateArrow(navigatearrowoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #166 <Method NavigateArrow IAMap.addNavigateArrow(NavigateArrowOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(NavigateArrowOptions navigatearrowoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (navigatearrowoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((NavigateArrow) (navigatearrowoptions));
	}

	public final Polygon addPolygon(PolygonOptions polygonoptions)
	{
		try
		{
			polygonoptions = ((PolygonOptions) (a.addPolygon(polygonoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #170 <Method Polygon IAMap.addPolygon(PolygonOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(PolygonOptions polygonoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (polygonoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((Polygon) (polygonoptions));
	}

	public final Polyline addPolyline(PolylineOptions polylineoptions)
	{
		try
		{
			polylineoptions = ((PolylineOptions) (a.addPolyline(polylineoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #174 <Method Polyline IAMap.addPolyline(PolylineOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(PolylineOptions polylineoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (polylineoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((Polyline) (polylineoptions));
	}

	public RouteOverlay addRouteOverlay()
	{
		return a.addNaviRouteOverlay();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #179 <Method RouteOverlay IAMap.addNaviRouteOverlay()>
	//    3    9:areturn         
	}

	public final Text addText(TextOptions textoptions)
	{
		try
		{
			textoptions = ((TextOptions) (a.addText(textoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #183 <Method Text IAMap.addText(TextOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(TextOptions textoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (textoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((Text) (textoptions));
	}

	public final TileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
	{
		try
		{
			tileoverlayoptions = ((TileOverlayOptions) (a.addTileOverlay(tileoverlayoptions)));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #187 <Method TileOverlay IAMap.addTileOverlay(TileOverlayOptions)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(TileOverlayOptions tileoverlayoptions)
	//*   7   13:astore_1        
		{
			((Throwable) (tileoverlayoptions)).printStackTrace();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		return ((TileOverlay) (tileoverlayoptions));
	}

	public final void animateCamera(CameraUpdate cameraupdate)
	{
		try
		{
			a.animateCamera(cameraupdate);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #191 <Method void IAMap.animateCamera(CameraUpdate)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*   5   11:astore_1        
		{
			((Throwable) (cameraupdate)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void animateCamera(CameraUpdate cameraupdate, long l, CancelableCallback cancelablecallback)
	{
		if(l > 0L)
			break MISSING_BLOCK_LABEL_14;
	//    0    0:lload_2         
	//    1    1:lconst_0        
	//    2    2:lcmp            
	//    3    3:ifgt            14
		Log.w("AMap", "durationMs must be positive");
	//    4    6:ldc1            #194 <String "AMap">
	//    5    8:ldc1            #196 <String "durationMs must be positive">
	//    6   10:invokestatic    #202 <Method int Log.w(String, String)>
	//    7   13:pop             
		a.animateCameraWithDurationAndCallback(cameraupdate, l, cancelablecallback);
	//    8   14:aload_0         
	//    9   15:getfield        #108 <Field IAMap a>
	//   10   18:aload_1         
	//   11   19:lload_2         
	//   12   20:aload           4
	//   13   22:invokeinterface #205 <Method void IAMap.animateCameraWithDurationAndCallback(CameraUpdate, long, AMap$CancelableCallback)>
		return;
	//   14   27:return          
		cameraupdate;
	//   15   28:astore_1        
		((Throwable) (cameraupdate)).printStackTrace();
	//   16   29:aload_1         
	//   17   30:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		return;
	//   18   33:return          
	}

	public final void animateCamera(CameraUpdate cameraupdate, CancelableCallback cancelablecallback)
	{
		try
		{
			a.animateCameraWithCallback(cameraupdate, cancelablecallback);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #209 <Method void IAMap.animateCameraWithCallback(CameraUpdate, AMap$CancelableCallback)>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*   6   12:astore_1        
		{
			((Throwable) (cameraupdate)).printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    9   17:return          
	}

	public Pair calculateZoomToSpanLevel(int i, int j, int k, int l, LatLng latlng, LatLng latlng1)
	{
		return a.calculateZoomToSpanLevel(i, j, k, l, latlng, latlng1);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokeinterface #213 <Method Pair IAMap.calculateZoomToSpanLevel(int, int, int, int, LatLng, LatLng)>
	//    9   18:areturn         
	}

	public final void clear()
	{
		try
		{
			a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #217 <Method void IAMap.clear()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public final void clear(boolean flag)
	{
		try
		{
			a.clear(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #220 <Method void IAMap.clear(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final CameraPosition getCameraPosition()
	{
		CameraPosition cameraposition;
		try
		{
			cameraposition = a.getCameraPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #224 <Method CameraPosition IAMap.getCameraPosition()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return cameraposition;
	}

	public final InfoWindowAnimationManager getInfoWindowAnimationManager()
	{
		return a.getInfoWindowAnimationManager();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #228 <Method InfoWindowAnimationManager IAMap.getInfoWindowAnimationManager()>
	//    3    9:areturn         
	}

	public String getMapContentApprovalNumber()
	{
		String s;
		try
		{
			s = a.getMapContentApprovalNumber();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #231 <Method String IAMap.getMapContentApprovalNumber()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return s;
	}

	public void getMapPrintScreen(onMapPrintScreenListener onmapprintscreenlistener)
	{
		a.getMapPrintScreen(onmapprintscreenlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #235 <Method void IAMap.getMapPrintScreen(AMap$onMapPrintScreenListener)>
	//    4   10:return          
	}

	public final List getMapScreenMarkers()
	{
		List list;
		try
		{
			list = a.getMapScreenMarkers();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #239 <Method List IAMap.getMapScreenMarkers()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return list;
	}

	public void getMapScreenShot(OnMapScreenShotListener onmapscreenshotlistener)
	{
		a.getMapScreenShot(onmapscreenshotlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #244 <Method void IAMap.getMapScreenShot(AMap$OnMapScreenShotListener)>
	//    4   10:return          
	}

	public final int getMapTextZIndex()
	{
		int i;
		try
		{
			i = a.getMapTextZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #248 <Method int IAMap.getMapTextZIndex()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public final int getMapType()
	{
		int i;
		try
		{
			i = a.getMapType();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #251 <Method int IAMap.getMapType()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return 1;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		}
		return i;
	}

	public final float getMaxZoomLevel()
	{
		return a.getMaxZoomLevel();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #255 <Method float IAMap.getMaxZoomLevel()>
	//    3    9:freturn         
	}

	public final float getMinZoomLevel()
	{
		return a.getMinZoomLevel();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #258 <Method float IAMap.getMinZoomLevel()>
	//    3    9:freturn         
	}

	public final Location getMyLocation()
	{
		Location location;
		try
		{
			location = a.getMyLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #262 <Method Location IAMap.getMyLocation()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return location;
	}

	public final MyLocationStyle getMyLocationStyle()
	{
		MyLocationStyle mylocationstyle;
		try
		{
			mylocationstyle = a.getMyLocationStyle();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #266 <Method MyLocationStyle IAMap.getMyLocationStyle()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return mylocationstyle;
	}

	public MyTrafficStyle getMyTrafficStyle()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field MyTrafficStyle d>
	//    2    4:areturn         
	}

	public void getP20MapCenter(IPoint ipoint)
	{
		IPoint ipoint1;
		ipoint1 = ipoint;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(ipoint != null)
			break MISSING_BLOCK_LABEL_14;
	//    2    2:aload_1         
	//    3    3:ifnonnull       14
		ipoint1 = new IPoint();
	//    4    6:new             #274 <Class IPoint>
	//    5    9:dup             
	//    6   10:invokespecial   #275 <Method void IPoint()>
	//    7   13:astore_2        
		ipoint1.x = a.getMapConfig().getSX();
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #108 <Field IAMap a>
	//   11   19:invokeinterface #279 <Method MapConfig IAMap.getMapConfig()>
	//   12   24:invokevirtual   #284 <Method int MapConfig.getSX()>
	//   13   27:putfield        #287 <Field int IPoint.x>
		ipoint1.y = a.getMapConfig().getSY();
	//   14   30:aload_2         
	//   15   31:aload_0         
	//   16   32:getfield        #108 <Field IAMap a>
	//   17   35:invokeinterface #279 <Method MapConfig IAMap.getMapConfig()>
	//   18   40:invokevirtual   #290 <Method int MapConfig.getSY()>
	//   19   43:putfield        #293 <Field int IPoint.y>
		return;
	//   20   46:return          
		ipoint;
	//   21   47:astore_1        
		((Throwable) (ipoint)).printStackTrace();
	//   22   48:aload_1         
	//   23   49:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		return;
	//   24   52:return          
	}

	public final Projection getProjection()
	{
		Projection projection;
		try
		{
			if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #297 <Field Projection c>
	//*   2    4:ifnonnull       20
				c = a.getAMapProjection();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #108 <Field IAMap a>
	//    6   12:invokeinterface #300 <Method Projection IAMap.getAMapProjection()>
	//    7   17:putfield        #297 <Field Projection c>
			projection = c;
	//    8   20:aload_0         
	//    9   21:getfield        #297 <Field Projection c>
	//   10   24:astore_1        
		}
	//*  11   25:aload_1         
	//*  12   26:areturn         
		catch(Throwable throwable)
	//*  13   27:astore_1        
		{
			throwable.printStackTrace();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		}
		return projection;
	}

	public float[] getProjectionMatrix()
	{
		return a.getProjectionMatrix();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #304 <Method float[] IAMap.getProjectionMatrix()>
	//    3    9:areturn         
	}

	public String getSatelliteImageApprovalNumber()
	{
		String s;
		try
		{
			s = a.getSatelliteImageApprovalNumber();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #307 <Method String IAMap.getSatelliteImageApprovalNumber()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return s;
	}

	public float getScalePerPixel()
	{
		float f;
		try
		{
			f = a.getScalePerPixel();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #310 <Method float IAMap.getScalePerPixel()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
		}
		return f;
	}

	public final UiSettings getUiSettings()
	{
		UiSettings uisettings;
		try
		{
			if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #314 <Field UiSettings b>
	//*   2    4:ifnonnull       20
				b = a.getAMapUiSettings();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #108 <Field IAMap a>
	//    6   12:invokeinterface #317 <Method UiSettings IAMap.getAMapUiSettings()>
	//    7   17:putfield        #314 <Field UiSettings b>
			uisettings = b;
	//    8   20:aload_0         
	//    9   21:getfield        #314 <Field UiSettings b>
	//   10   24:astore_1        
		}
	//*  11   25:aload_1         
	//*  12   26:areturn         
		catch(Throwable throwable)
	//*  13   27:astore_1        
		{
			throwable.printStackTrace();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		}
		return uisettings;
	}

	public float[] getViewMatrix()
	{
		return a.getViewMatrix();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #320 <Method float[] IAMap.getViewMatrix()>
	//    3    9:areturn         
	}

	public float getZoomToSpanLevel(LatLng latlng, LatLng latlng1)
	{
		return a.getZoomToSpanLevel(latlng, latlng1);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #324 <Method float IAMap.getZoomToSpanLevel(LatLng, LatLng)>
	//    5   11:freturn         
	}

	public final boolean isMyLocationEnabled()
	{
		boolean flag;
		try
		{
			flag = a.isMyLocationEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #328 <Method boolean IAMap.isMyLocationEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return flag;
	}

	public final boolean isTrafficEnabled()
	{
		boolean flag;
		try
		{
			flag = a.isTrafficEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #331 <Method boolean IAMap.isTrafficEnabled()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return flag;
	}

	public final void moveCamera(CameraUpdate cameraupdate)
	{
		try
		{
			a.moveCamera(cameraupdate);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #334 <Method void IAMap.moveCamera(CameraUpdate)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(CameraUpdate cameraupdate)
	//*   5   11:astore_1        
		{
			((Throwable) (cameraupdate)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void reloadMap()
	{
		a.reloadMap();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #337 <Method void IAMap.reloadMap()>
	//    3    9:return          
	}

	public void removecache()
	{
		try
		{
			a.removecache();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #340 <Method void IAMap.removecache()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public void removecache(OnCacheRemoveListener oncacheremovelistener)
	{
		try
		{
			a.removecache(oncacheremovelistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #343 <Method void IAMap.removecache(AMap$OnCacheRemoveListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnCacheRemoveListener oncacheremovelistener)
	//*   5   11:astore_1        
		{
			((Throwable) (oncacheremovelistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void resetMinMaxZoomPreference()
	{
		a.resetMinMaxZoomPreference();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #346 <Method void IAMap.resetMinMaxZoomPreference()>
	//    3    9:return          
	}

	public void runOnDrawFrame()
	{
		a.setRunLowFrame(false);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #350 <Method void IAMap.setRunLowFrame(boolean)>
	//    4   10:return          
	}

	public void setAMapGestureListener(AMapGestureListener amapgesturelistener)
	{
		a.setAMapGestureListener(amapgesturelistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #354 <Method void IAMap.setAMapGestureListener(AMapGestureListener)>
	//    4   10:return          
	}

	public final void setCommonInfoWindowAdapter(CommonInfoWindowAdapter commoninfowindowadapter)
	{
		try
		{
			a.setInfoWindowAdapter(commoninfowindowadapter);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #359 <Method void IAMap.setInfoWindowAdapter(AMap$CommonInfoWindowAdapter)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(CommonInfoWindowAdapter commoninfowindowadapter)
	//*   5   11:astore_1        
		{
			((Throwable) (commoninfowindowadapter)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setCustomMapStyleID(String s)
	{
		a.setCustomMapStyleID(s);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #363 <Method void IAMap.setCustomMapStyleID(String)>
	//    4   10:return          
	}

	public void setCustomMapStylePath(String s)
	{
		a.setCustomMapStylePath(s);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #366 <Method void IAMap.setCustomMapStylePath(String)>
	//    4   10:return          
	}

	public void setCustomRenderer(CustomRenderer customrenderer)
	{
		try
		{
			a.setCustomRenderer(customrenderer);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #370 <Method void IAMap.setCustomRenderer(CustomRenderer)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(CustomRenderer customrenderer)
	//*   5   11:astore_1        
		{
			((Throwable) (customrenderer)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setCustomTextureResourcePath(String s)
	{
		a.setCustomTextureResourcePath(s);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #373 <Method void IAMap.setCustomTextureResourcePath(String)>
	//    4   10:return          
	}

	public void setIndoorBuildingInfo(IndoorBuildingInfo indoorbuildinginfo)
	{
		try
		{
			a.setIndoorBuildingInfo(indoorbuildinginfo);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #377 <Method void IAMap.setIndoorBuildingInfo(IndoorBuildingInfo)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(IndoorBuildingInfo indoorbuildinginfo)
	//*   5   11:astore_1        
		{
			((Throwable) (indoorbuildinginfo)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setInfoWindowAdapter(InfoWindowAdapter infowindowadapter)
	{
		try
		{
			a.setInfoWindowAdapter(infowindowadapter);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #380 <Method void IAMap.setInfoWindowAdapter(AMap$InfoWindowAdapter)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(InfoWindowAdapter infowindowadapter)
	//*   5   11:astore_1        
		{
			((Throwable) (infowindowadapter)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setLoadOfflineData(boolean flag)
	{
		try
		{
			a.setLoadOfflineData(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #383 <Method void IAMap.setLoadOfflineData(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setLocationSource(LocationSource locationsource)
	{
		try
		{
			a.setLocationSource(locationsource);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #387 <Method void IAMap.setLocationSource(LocationSource)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LocationSource locationsource)
	//*   5   11:astore_1        
		{
			((Throwable) (locationsource)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setMapCustomEnable(boolean flag)
	{
		a.setMapCustomEnable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #390 <Method void IAMap.setMapCustomEnable(boolean)>
	//    4   10:return          
	}

	public void setMapLanguage(String s)
	{
		try
		{
			a.setMapLanguage(s);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #393 <Method void IAMap.setMapLanguage(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setMapStatusLimits(LatLngBounds latlngbounds)
	{
		try
		{
			a.setMapStatusLimits(latlngbounds);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #397 <Method void IAMap.setMapStatusLimits(LatLngBounds)>
			moveCamera(CameraUpdateFactory.newLatLngBounds(latlngbounds, 0));
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #403 <Method CameraUpdate CameraUpdateFactory.newLatLngBounds(LatLngBounds, int)>
	//    8   16:invokevirtual   #404 <Method void moveCamera(CameraUpdate)>
			return;
	//    9   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLngBounds latlngbounds)
	//*  10   20:astore_1        
		{
			((Throwable) (latlngbounds)).printStackTrace();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   13   25:return          
	}

	public final void setMapTextZIndex(int i)
	{
		try
		{
			a.setMapTextZIndex(i);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #408 <Method void IAMap.setMapTextZIndex(int)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setMapType(int i)
	{
		try
		{
			a.setMapType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #411 <Method void IAMap.setMapType(int)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setMaskLayerParams(int i, int j, int k, int l, int i1, long l1)
	{
		a.setMaskLayerParams(i, j, k, l, i1, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:lload           6
	//    8   13:invokeinterface #415 <Method void IAMap.setMaskLayerParams(int, int, int, int, int, long)>
	//    9   18:return          
	}

	public void setMaxZoomLevel(float f)
	{
		a.setMaxZoomLevel(f);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #419 <Method void IAMap.setMaxZoomLevel(float)>
	//    4   10:return          
	}

	public void setMinZoomLevel(float f)
	{
		a.setMinZoomLevel(f);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #422 <Method void IAMap.setMinZoomLevel(float)>
	//    4   10:return          
	}

	public final void setMyLocationEnabled(boolean flag)
	{
		try
		{
			a.setMyLocationEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #425 <Method void IAMap.setMyLocationEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setMyLocationRotateAngle(float f)
	{
		try
		{
			a.setMyLocationRotateAngle(f);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #428 <Method void IAMap.setMyLocationRotateAngle(float)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setMyLocationStyle(MyLocationStyle mylocationstyle)
	{
		try
		{
			a.setMyLocationStyle(mylocationstyle);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #432 <Method void IAMap.setMyLocationStyle(MyLocationStyle)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(MyLocationStyle mylocationstyle)
	//*   5   11:astore_1        
		{
			((Throwable) (mylocationstyle)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setMyLocationType(int i)
	{
		try
		{
			a.setMyLocationType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #435 <Method void IAMap.setMyLocationType(int)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setMyTrafficStyle(MyTrafficStyle mytrafficstyle)
	{
		try
		{
			d = mytrafficstyle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #270 <Field MyTrafficStyle d>
			a.setMyTrafficStyle(mytrafficstyle);
	//    3    5:aload_0         
	//    4    6:getfield        #108 <Field IAMap a>
	//    5    9:aload_1         
	//    6   10:invokeinterface #439 <Method void IAMap.setMyTrafficStyle(MyTrafficStyle)>
			return;
	//    7   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(MyTrafficStyle mytrafficstyle)
	//*   8   16:astore_1        
		{
			((Throwable) (mytrafficstyle)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//   11   21:return          
	}

	public final void setOnCameraChangeListener(OnCameraChangeListener oncamerachangelistener)
	{
		try
		{
			a.setOnCameraChangeListener(oncamerachangelistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #443 <Method void IAMap.setOnCameraChangeListener(AMap$OnCameraChangeListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnCameraChangeListener oncamerachangelistener)
	//*   5   11:astore_1        
		{
			((Throwable) (oncamerachangelistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnIndoorBuildingActiveListener(OnIndoorBuildingActiveListener onindoorbuildingactivelistener)
	{
		try
		{
			a.setOnIndoorBuildingActiveListener(onindoorbuildingactivelistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #447 <Method void IAMap.setOnIndoorBuildingActiveListener(AMap$OnIndoorBuildingActiveListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnIndoorBuildingActiveListener onindoorbuildingactivelistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onindoorbuildingactivelistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnInfoWindowClickListener(OnInfoWindowClickListener oninfowindowclicklistener)
	{
		try
		{
			a.setOnInfoWindowClickListener(oninfowindowclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #451 <Method void IAMap.setOnInfoWindowClickListener(AMap$OnInfoWindowClickListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnInfoWindowClickListener oninfowindowclicklistener)
	//*   5   11:astore_1        
		{
			((Throwable) (oninfowindowclicklistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnMapClickListener(OnMapClickListener onmapclicklistener)
	{
		try
		{
			a.setOnMapClickListener(onmapclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #455 <Method void IAMap.setOnMapClickListener(AMap$OnMapClickListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMapClickListener onmapclicklistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onmapclicklistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnMapLoadedListener(OnMapLoadedListener onmaploadedlistener)
	{
		try
		{
			a.setOnMaploadedListener(onmaploadedlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #460 <Method void IAMap.setOnMaploadedListener(AMap$OnMapLoadedListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMapLoadedListener onmaploadedlistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onmaploadedlistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnMapLongClickListener(OnMapLongClickListener onmaplongclicklistener)
	{
		try
		{
			a.setOnMapLongClickListener(onmaplongclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #464 <Method void IAMap.setOnMapLongClickListener(AMap$OnMapLongClickListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMapLongClickListener onmaplongclicklistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onmaplongclicklistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnMapTouchListener(OnMapTouchListener onmaptouchlistener)
	{
		try
		{
			a.setOnMapTouchListener(onmaptouchlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #468 <Method void IAMap.setOnMapTouchListener(AMap$OnMapTouchListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMapTouchListener onmaptouchlistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onmaptouchlistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnMarkerClickListener(OnMarkerClickListener onmarkerclicklistener)
	{
		try
		{
			a.setOnMarkerClickListener(onmarkerclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #472 <Method void IAMap.setOnMarkerClickListener(AMap$OnMarkerClickListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMarkerClickListener onmarkerclicklistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onmarkerclicklistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnMarkerDragListener(OnMarkerDragListener onmarkerdraglistener)
	{
		try
		{
			a.setOnMarkerDragListener(onmarkerdraglistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #476 <Method void IAMap.setOnMarkerDragListener(AMap$OnMarkerDragListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMarkerDragListener onmarkerdraglistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onmarkerdraglistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setOnMultiPointClickListener(OnMultiPointClickListener onmultipointclicklistener)
	{
		try
		{
			a.setOnMultiPointClickListener(onmultipointclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #480 <Method void IAMap.setOnMultiPointClickListener(AMap$OnMultiPointClickListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMultiPointClickListener onmultipointclicklistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onmultipointclicklistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onmylocationchangelistener)
	{
		try
		{
			a.setOnMyLocationChangeListener(onmylocationchangelistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #484 <Method void IAMap.setOnMyLocationChangeListener(AMap$OnMyLocationChangeListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnMyLocationChangeListener onmylocationchangelistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onmylocationchangelistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnPOIClickListener(OnPOIClickListener onpoiclicklistener)
	{
		try
		{
			a.setOnPOIClickListener(onpoiclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #488 <Method void IAMap.setOnPOIClickListener(AMap$OnPOIClickListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnPOIClickListener onpoiclicklistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onpoiclicklistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void setOnPolylineClickListener(OnPolylineClickListener onpolylineclicklistener)
	{
		try
		{
			a.setOnPolylineClickListener(onpolylineclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #492 <Method void IAMap.setOnPolylineClickListener(AMap$OnPolylineClickListener)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(OnPolylineClickListener onpolylineclicklistener)
	//*   5   11:astore_1        
		{
			((Throwable) (onpolylineclicklistener)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setPointToCenter(int i, int j)
	{
		try
		{
			a.setCenterToPixel(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #497 <Method void IAMap.setCenterToPixel(int, int)>
			return;
	//    5   11:return          
		}
		catch(Throwable throwable)
	//*   6   12:astore_3        
		{
			throwable.printStackTrace();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    9   17:return          
	}

	public void setRenderFps(int i)
	{
		a.setRenderFps(i);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #500 <Method void IAMap.setRenderFps(int)>
	//    4   10:return          
	}

	public void setRenderMode(int i)
	{
		a.setRenderMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #503 <Method void IAMap.setRenderMode(int)>
	//    4   10:return          
	}

	public void setTrafficEnabled(boolean flag)
	{
		try
		{
			a.setTrafficEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #506 <Method void IAMap.setTrafficEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void showBuildings(boolean flag)
	{
		try
		{
			a.set3DBuildingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #510 <Method void IAMap.set3DBuildingEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void showIndoorMap(boolean flag)
	{
		try
		{
			a.setIndoorEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #514 <Method void IAMap.setIndoorEnabled(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void showMapText(boolean flag)
	{
		try
		{
			a.setMapTextEnable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #518 <Method void IAMap.setMapTextEnable(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public final void stopAnimation()
	{
		try
		{
			a.stopAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field IAMap a>
	//    2    4:invokeinterface #521 <Method void IAMap.stopAnimation()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #126 <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public static final String CHINESE = "zh_cn";
	public static final String ENGLISH = "en";
	public static final int LOCATION_TYPE_LOCATE = 1;
	public static final int LOCATION_TYPE_MAP_FOLLOW = 2;
	public static final int LOCATION_TYPE_MAP_ROTATE = 3;
	public static final int MAP_TYPE_BUS = 5;
	public static final int MAP_TYPE_NAVI = 4;
	public static final int MAP_TYPE_NIGHT = 3;
	public static final int MAP_TYPE_NORMAL = 1;
	public static final int MAP_TYPE_SATELLITE = 2;
	public static final int MASK_LAYER_NONE = -1;
	public static final int MASK_LAYER_UNDER_LINE = 1;
	public static final int MASK_LAYER_UNDER_MARKER = 0;
	private final IAMap a;
	private UiSettings b;
	private Projection c;
	private MyTrafficStyle d;
}
