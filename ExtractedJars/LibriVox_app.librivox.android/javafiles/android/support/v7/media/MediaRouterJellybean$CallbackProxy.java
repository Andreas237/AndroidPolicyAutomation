// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.MediaRouter;

class MediaRouterJellybean$CallbackProxy extends android.media.MediaRouter.Callback
{

	public void onRouteAdded(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
	{
		mCallback.onRouteAdded(((Object) (routeinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:aload_2         
	//    3    5:invokeinterface #21  <Method void MediaRouterJellybean$Callback.onRouteAdded(Object)>
	//    4   10:return          
	}

	public void onRouteChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
	{
		mCallback.onRouteChanged(((Object) (routeinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:aload_2         
	//    3    5:invokeinterface #24  <Method void MediaRouterJellybean$Callback.onRouteChanged(Object)>
	//    4   10:return          
	}

	public void onRouteGrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup, int i)
	{
		mCallback.onRouteGrouped(((Object) (routeinfo)), ((Object) (routegroup)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:iload           4
	//    5    8:invokeinterface #29  <Method void MediaRouterJellybean$Callback.onRouteGrouped(Object, Object, int)>
	//    6   13:return          
	}

	public void onRouteRemoved(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
	{
		mCallback.onRouteRemoved(((Object) (routeinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:aload_2         
	//    3    5:invokeinterface #32  <Method void MediaRouterJellybean$Callback.onRouteRemoved(Object)>
	//    4   10:return          
	}

	public void onRouteSelected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
	{
		mCallback.onRouteSelected(i, ((Object) (routeinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:invokeinterface #37  <Method void MediaRouterJellybean$Callback.onRouteSelected(int, Object)>
	//    5   11:return          
	}

	public void onRouteUngrouped(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo, android.media.MediaRouter.RouteGroup routegroup)
	{
		mCallback.onRouteUngrouped(((Object) (routeinfo)), ((Object) (routegroup)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokeinterface #42  <Method void MediaRouterJellybean$Callback.onRouteUngrouped(Object, Object)>
	//    5   11:return          
	}

	public void onRouteUnselected(MediaRouter mediarouter, int i, android.media.MediaRouter.RouteInfo routeinfo)
	{
		mCallback.onRouteUnselected(i, ((Object) (routeinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:iload_2         
	//    3    5:aload_3         
	//    4    6:invokeinterface #45  <Method void MediaRouterJellybean$Callback.onRouteUnselected(int, Object)>
	//    5   11:return          
	}

	public void onRouteVolumeChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
	{
		mCallback.onRouteVolumeChanged(((Object) (routeinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:aload_2         
	//    3    5:invokeinterface #48  <Method void MediaRouterJellybean$Callback.onRouteVolumeChanged(Object)>
	//    4   10:return          
	}

	protected final MediaRouterJellybean.Callback mCallback;

	public MediaRouterJellybean$CallbackProxy(MediaRouterJellybean.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void android.media.MediaRouter$Callback()>
		mCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field MediaRouterJellybean$Callback mCallback>
	//    5    9:return          
	}
}
