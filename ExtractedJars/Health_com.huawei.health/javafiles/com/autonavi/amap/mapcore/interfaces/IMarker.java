// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import android.os.RemoteException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;
import java.util.ArrayList;

// Referenced classes of package com.autonavi.amap.mapcore.interfaces:
//			IOverlayImage, IMarkerAction

public interface IMarker
	extends IOverlayImage
{

	public abstract IPoint getGeoPoint();

	public abstract IMarkerAction getIMarkerAction();

	public abstract ArrayList getIcons()
		throws RemoteException;

	public abstract int getPeriod()
		throws RemoteException;

	public abstract String getSnippet()
		throws RemoteException;

	public abstract String getTitle()
		throws RemoteException;

	public abstract void hideInfoWindow()
		throws RemoteException;

	public abstract boolean isDraggable();

	public abstract boolean isFlat();

	public abstract boolean isInfoWindowShown();

	public abstract boolean isPerspective()
		throws RemoteException;

	public abstract boolean isRemoved();

	public abstract void set2Top()
		throws RemoteException;

	public abstract void setAnimation(Animation animation);

	public abstract void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener animationlistener);

	public abstract void setBelowMaskLayer(boolean flag);

	public abstract void setDraggable(boolean flag)
		throws RemoteException;

	public abstract void setFlat(boolean flag)
		throws RemoteException;

	public abstract void setGeoPoint(IPoint ipoint);

	public abstract void setIcon(BitmapDescriptor bitmapdescriptor)
		throws RemoteException;

	public abstract void setIcons(ArrayList arraylist)
		throws RemoteException;

	public abstract void setPeriod(int i)
		throws RemoteException;

	public abstract void setPerspective(boolean flag)
		throws RemoteException;

	public abstract void setPositionByPixels(int i, int j);

	public abstract void setSnippet(String s)
		throws RemoteException;

	public abstract void setTitle(String s)
		throws RemoteException;

	public abstract void showInfoWindow()
		throws RemoteException;

	public abstract boolean startAnimation();
}
