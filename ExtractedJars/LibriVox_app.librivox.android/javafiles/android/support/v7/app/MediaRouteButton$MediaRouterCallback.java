// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;

// Referenced classes of package android.support.v7.app:
//			MediaRouteButton

final class MediaRouteButton$MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
{

	public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
	{
		refreshRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
	//    3    7:return          
	}

	public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
	{
		refreshRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
	//    3    7:return          
	}

	public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
	{
		refreshRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
	//    3    7:return          
	}

	public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
	//    3    7:return          
	}

	public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
	//    3    7:return          
	}

	public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
	//    3    7:return          
	}

	public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
	//    3    7:return          
	}

	public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteButton this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteButton.refreshRoute()>
	//    3    7:return          
	}

	final MediaRouteButton this$0;

	MediaRouteButton$MediaRouterCallback()
	{
		this$0 = MediaRouteButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field MediaRouteButton this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void android.support.v7.media.MediaRouter$Callback()>
	//    5    9:return          
	}
}
