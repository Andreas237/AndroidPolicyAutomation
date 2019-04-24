// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.location.Location;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.maps.*;
import com.amap.api.maps.model.*;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.gloverlay.BaseMapOverlay;
import com.autonavi.ae.gmap.gloverlay.GLTextureProperty;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.MapConfig;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public interface IAMap
{

	public abstract Arc addArc(ArcOptions arcoptions)
		throws RemoteException;

	public abstract BuildingOverlay addBuildingOverlay();

	public abstract Circle addCircle(CircleOptions circleoptions)
		throws RemoteException;

	public abstract CrossOverlay addCrossVector(CrossOverlayOptions crossoverlayoptions);

	public abstract GL3DModel addGLModel(GL3DModelOptions gl3dmodeloptions);

	public abstract GroundOverlay addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
		throws RemoteException;

	public abstract Marker addMarker(MarkerOptions markeroptions)
		throws RemoteException;

	public abstract ArrayList addMarkers(ArrayList arraylist, boolean flag)
		throws RemoteException;

	public abstract MultiPointOverlay addMultiPointOverlay(MultiPointOverlayOptions multipointoverlayoptions)
		throws RemoteException;

	public abstract RouteOverlay addNaviRouteOverlay();

	public abstract NavigateArrow addNavigateArrow(NavigateArrowOptions navigatearrowoptions)
		throws RemoteException;

	public abstract void addOverlayTexture(int i, GLTextureProperty gltextureproperty);

	public abstract Polygon addPolygon(PolygonOptions polygonoptions)
		throws RemoteException;

	public abstract Polyline addPolyline(PolylineOptions polylineoptions)
		throws RemoteException;

	public abstract Text addText(TextOptions textoptions)
		throws RemoteException;

	public abstract TileOverlay addTileOverlay(TileOverlayOptions tileoverlayoptions)
		throws RemoteException;

	public abstract void animateCamera(CameraUpdate cameraupdate)
		throws RemoteException;

	public abstract void animateCameraWithCallback(CameraUpdate cameraupdate, com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
		throws RemoteException;

	public abstract void animateCameraWithDurationAndCallback(CameraUpdate cameraupdate, long l, com.amap.api.maps.AMap.CancelableCallback cancelablecallback)
		throws RemoteException;

	public abstract Pair calculateZoomToSpanLevel(int i, int j, int k, int l, LatLng latlng, LatLng latlng1);

	public abstract boolean canStopMapRender();

	public abstract void changeSurface(GL10 gl10, int i, int j);

	public abstract void checkMapState(GLMapState glmapstate);

	public abstract void clear()
		throws RemoteException;

	public abstract void clear(boolean flag)
		throws RemoteException;

	public abstract long createGLOverlay(int i);

	public abstract void createSurface(GL10 gl10, EGLConfig eglconfig);

	public abstract void destroy();

	public abstract void destroySurface(int i);

	public abstract void drawFrame(GL10 gl10);

	public abstract Projection getAMapProjection()
		throws RemoteException;

	public abstract UiSettings getAMapUiSettings()
		throws RemoteException;

	public abstract AMapCameraInfo getCamerInfo();

	public abstract float getCameraAngle();

	public abstract CameraPosition getCameraPosition()
		throws RemoteException;

	public abstract long getGlOverlayMgrPtr();

	public abstract InfoWindowAnimationManager getInfoWindowAnimationManager();

	public abstract void getLatLngRect(DPoint adpoint[]);

	public abstract Handler getMainHandler();

	public abstract MapConfig getMapConfig();

	public abstract String getMapContentApprovalNumber();

	public abstract int getMapHeight();

	public abstract void getMapPrintScreen(com.amap.api.maps.AMap.onMapPrintScreenListener onmapprintscreenlistener);

	public abstract List getMapScreenMarkers()
		throws RemoteException;

	public abstract void getMapScreenShot(com.amap.api.maps.AMap.OnMapScreenShotListener onmapscreenshotlistener);

	public abstract int getMapTextZIndex()
		throws RemoteException;

	public abstract int getMapType()
		throws RemoteException;

	public abstract int getMapWidth();

	public abstract float getMaxZoomLevel();

	public abstract float getMinZoomLevel();

	public abstract Location getMyLocation()
		throws RemoteException;

	public abstract MyLocationStyle getMyLocationStyle()
		throws RemoteException;

	public abstract float[] getProjectionMatrix();

	public abstract int getRenderMode();

	public abstract String getSatelliteImageApprovalNumber();

	public abstract float getScalePerPixel()
		throws RemoteException;

	public abstract float getSkyHeight();

	public abstract View getView()
		throws RemoteException;

	public abstract float[] getViewMatrix();

	public abstract float getZoomToSpanLevel(LatLng latlng, LatLng latlng1);

	public abstract boolean isIndoorEnabled()
		throws RemoteException;

	public abstract boolean isMaploaded();

	public abstract boolean isMyLocationEnabled()
		throws RemoteException;

	public abstract boolean isTrafficEnabled()
		throws RemoteException;

	public abstract void moveCamera(CameraUpdate cameraupdate)
		throws RemoteException;

	public abstract void onActivityPause();

	public abstract void onActivityResume();

	public abstract void onChangeFinish();

	public abstract void onFling();

	public abstract void onIndoorBuildingActivity(int i, byte abyte0[]);

	public abstract boolean onTouchEvent(MotionEvent motionevent);

	public abstract void queueEvent(Runnable runnable);

	public abstract void reloadMap();

	public abstract void removeGLOverlay(BaseMapOverlay basemapoverlay);

	public abstract void removecache()
		throws RemoteException;

	public abstract void removecache(com.amap.api.maps.AMap.OnCacheRemoveListener oncacheremovelistener)
		throws RemoteException;

	public abstract void renderSurface(GL10 gl10);

	public abstract void requestRender();

	public abstract void resetMinMaxZoomPreference();

	public abstract void resetRenderTime();

	public abstract void set3DBuildingEnabled(boolean flag)
		throws RemoteException;

	public abstract void setAMapGestureListener(AMapGestureListener amapgesturelistener);

	public abstract void setCenterToPixel(int i, int j)
		throws RemoteException;

	public abstract void setCustomMapStyleID(String s);

	public abstract void setCustomMapStylePath(String s);

	public abstract void setCustomRenderer(CustomRenderer customrenderer)
		throws RemoteException;

	public abstract void setCustomTextureResourcePath(String s);

	public abstract void setIndoorBuildingInfo(IndoorBuildingInfo indoorbuildinginfo)
		throws RemoteException;

	public abstract void setIndoorEnabled(boolean flag)
		throws RemoteException;

	public abstract void setInfoWindowAdapter(com.amap.api.maps.AMap.CommonInfoWindowAdapter commoninfowindowadapter)
		throws RemoteException;

	public abstract void setInfoWindowAdapter(com.amap.api.maps.AMap.InfoWindowAdapter infowindowadapter)
		throws RemoteException;

	public abstract void setLoadOfflineData(boolean flag)
		throws RemoteException;

	public abstract void setLocationSource(LocationSource locationsource)
		throws RemoteException;

	public abstract void setMapCustomEnable(boolean flag);

	public abstract void setMapLanguage(String s);

	public abstract void setMapStatusLimits(LatLngBounds latlngbounds);

	public abstract void setMapTextEnable(boolean flag)
		throws RemoteException;

	public abstract void setMapTextZIndex(int i)
		throws RemoteException;

	public abstract void setMapType(int i)
		throws RemoteException;

	public abstract void setMaskLayerParams(int i, int j, int k, int l, int i1, long l1);

	public abstract void setMaxZoomLevel(float f);

	public abstract void setMinZoomLevel(float f);

	public abstract void setMyLocationEnabled(boolean flag)
		throws RemoteException;

	public abstract void setMyLocationRotateAngle(float f)
		throws RemoteException;

	public abstract void setMyLocationStyle(MyLocationStyle mylocationstyle)
		throws RemoteException;

	public abstract void setMyLocationType(int i)
		throws RemoteException;

	public abstract void setMyTrafficStyle(MyTrafficStyle mytrafficstyle)
		throws RemoteException;

	public abstract void setOnCameraChangeListener(com.amap.api.maps.AMap.OnCameraChangeListener oncamerachangelistener)
		throws RemoteException;

	public abstract void setOnIndoorBuildingActiveListener(com.amap.api.maps.AMap.OnIndoorBuildingActiveListener onindoorbuildingactivelistener)
		throws RemoteException;

	public abstract void setOnInfoWindowClickListener(com.amap.api.maps.AMap.OnInfoWindowClickListener oninfowindowclicklistener)
		throws RemoteException;

	public abstract void setOnMapClickListener(com.amap.api.maps.AMap.OnMapClickListener onmapclicklistener)
		throws RemoteException;

	public abstract void setOnMapLongClickListener(com.amap.api.maps.AMap.OnMapLongClickListener onmaplongclicklistener)
		throws RemoteException;

	public abstract void setOnMapTouchListener(com.amap.api.maps.AMap.OnMapTouchListener onmaptouchlistener)
		throws RemoteException;

	public abstract void setOnMaploadedListener(com.amap.api.maps.AMap.OnMapLoadedListener onmaploadedlistener)
		throws RemoteException;

	public abstract void setOnMarkerClickListener(com.amap.api.maps.AMap.OnMarkerClickListener onmarkerclicklistener)
		throws RemoteException;

	public abstract void setOnMarkerDragListener(com.amap.api.maps.AMap.OnMarkerDragListener onmarkerdraglistener)
		throws RemoteException;

	public abstract void setOnMultiPointClickListener(com.amap.api.maps.AMap.OnMultiPointClickListener onmultipointclicklistener);

	public abstract void setOnMyLocationChangeListener(com.amap.api.maps.AMap.OnMyLocationChangeListener onmylocationchangelistener)
		throws RemoteException;

	public abstract void setOnPOIClickListener(com.amap.api.maps.AMap.OnPOIClickListener onpoiclicklistener)
		throws RemoteException;

	public abstract void setOnPolylineClickListener(com.amap.api.maps.AMap.OnPolylineClickListener onpolylineclicklistener)
		throws RemoteException;

	public abstract void setRenderFps(int i);

	public abstract void setRenderMode(int i);

	public abstract void setRunLowFrame(boolean flag);

	public abstract void setTrafficEnabled(boolean flag)
		throws RemoteException;

	public abstract void setVisibilityEx(int i);

	public abstract void setZOrderOnTop(boolean flag)
		throws RemoteException;

	public abstract void setZoomScaleParam(float f);

	public abstract void stopAnimation()
		throws RemoteException;
}
