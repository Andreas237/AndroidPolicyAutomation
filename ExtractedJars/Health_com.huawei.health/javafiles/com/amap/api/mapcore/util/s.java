// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.*;
import android.location.Location;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.amap.api.maps.model.*;
import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.message.AbstractGestureMapMessage;

// Referenced classes of package com.amap.api.mapcore.util:
//			ab, k, v, dr, 
//			ds

public interface s
	extends IAMap
{

	public abstract float a(int i1);

	public abstract int a(EAMapPlatformGestureInfo eamapplatformgestureinfo);

	public abstract int a(IMarkerAction imarkeraction, Rect rect);

	public abstract ab a(BitmapDescriptor bitmapdescriptor);

	public abstract LatLngBounds a(LatLng latlng, float f1, float f2, float f3);

	public abstract GLMapEngine a();

	public abstract void a(double d1, double d2, FPoint fpoint);

	public abstract void a(double d1, double d2, IPoint ipoint);

	public abstract void a(float f1, float f2, IPoint ipoint);

	public abstract void a(int i1, float f1);

	public abstract void a(int i1, int j1);

	public abstract void a(int i1, int j1, PointF pointf);

	public abstract void a(int i1, int j1, DPoint dpoint);

	public abstract void a(int i1, int j1, FPoint fpoint);

	public abstract void a(int i1, int j1, IPoint ipoint);

	public abstract void a(int i1, MotionEvent motionevent);

	public abstract void a(int i1, IPoint ipoint);

	public abstract void a(int i1, AbstractGestureMapMessage abstractgesturemapmessage);

	public abstract void a(Location location)
		throws RemoteException;

	public abstract void a(ab ab);

	public abstract void a(k k1)
		throws RemoteException;

	public abstract void a(AMapWidgetListener amapwidgetlistener);

	public abstract void a(AbstractCameraUpdateMessage abstractcameraupdatemessage)
		throws RemoteException;

	public abstract void a(boolean flag);

	public abstract void a(boolean flag, boolean flag1);

	public abstract void a(boolean flag, byte abyte0[]);

	public abstract boolean a(String s1)
		throws RemoteException;

	public abstract void b();

	public abstract void b(double d1, double d2, IPoint ipoint);

	public abstract void b(int i1, int j1);

	public abstract void b(int i1, int j1, DPoint dpoint);

	public abstract void b(AbstractCameraUpdateMessage abstractcameraupdatemessage)
		throws RemoteException;

	public abstract void b(boolean flag);

	public abstract boolean b(int i1, MotionEvent motionevent);

	public abstract boolean b(String s1);

	public abstract GLMapState c();

	public abstract void c(int i1);

	public abstract void c(String s1);

	public abstract void c(boolean flag);

	public abstract boolean c(int i1, MotionEvent motionevent);

	public abstract int d();

	public abstract String d(String s1);

	public abstract void d(boolean flag);

	public abstract boolean d(int i1);

	public abstract int e();

	public abstract void e(boolean flag);

	public abstract boolean e(int i1);

	public abstract int f(int i1);

	public abstract void f();

	public abstract float g();

	public abstract void g(int i1);

	public abstract float h(int i1);

	public abstract v h();

	public abstract void h(boolean flag);

	public abstract void i();

	public abstract void i(int i1);

	public abstract void i(boolean flag);

	public abstract void j();

	public abstract void j(int i1);

	public abstract void k(int i1);

	public abstract boolean k();

	public abstract float l(int i1);

	public abstract Point l();

	public abstract View m();

	public abstract float n(int i1);

	public abstract boolean n();

	public abstract float o(int i1);

	public abstract int o();

	public abstract void r();

	public abstract dr t(int i1);

	public abstract float u();

	public abstract float u(int i1);

	public abstract Context w();

	public abstract float[] x();

	public abstract ds y();
}
