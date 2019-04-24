// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybean

public static interface MediaRouterJellybean$Callback
{

	public abstract void onRouteAdded(Object obj);

	public abstract void onRouteChanged(Object obj);

	public abstract void onRouteGrouped(Object obj, Object obj1, int i);

	public abstract void onRouteRemoved(Object obj);

	public abstract void onRouteSelected(int i, Object obj);

	public abstract void onRouteUngrouped(Object obj, Object obj1);

	public abstract void onRouteUnselected(int i, Object obj);

	public abstract void onRouteVolumeChanged(Object obj);
}
