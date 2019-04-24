// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.MediaRouter;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybeanMr1

static class MediaRouterJellybeanMr1$CallbackProxy extends MediaRouterJellybean.CallbackProxy
{

	public void onRoutePresentationDisplayChanged(MediaRouter mediarouter, android.media.MediaRouter.RouteInfo routeinfo)
	{
		((MediaRouterJellybeanMr1.Callback)mCallback).onRoutePresentationDisplayChanged(((Object) (routeinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaRouterJellybean$Callback mCallback>
	//    2    4:checkcast       #24  <Class MediaRouterJellybeanMr1$Callback>
	//    3    7:aload_2         
	//    4    8:invokeinterface #27  <Method void MediaRouterJellybeanMr1$Callback.onRoutePresentationDisplayChanged(Object)>
	//    5   13:return          
	}

	public MediaRouterJellybeanMr1$CallbackProxy(MediaRouterJellybeanMr1.Callback callback)
	{
		super(((MediaRouterJellybean.Callback) (callback)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void MediaRouterJellybean$CallbackProxy(MediaRouterJellybean$Callback)>
	//    3    5:return          
	}
}
