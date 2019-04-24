// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//			MediaRouteActionProvider

private static final class MediaRouteActionProvider$MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
{

	private void refreshRoute(MediaRouter mediarouter)
	{
		MediaRouteActionProvider mediarouteactionprovider = (MediaRouteActionProvider)mProviderWeak.get();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field WeakReference mProviderWeak>
	//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaRouteActionProvider>
	//    4   10:astore_2        
		if(mediarouteactionprovider != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          20
		{
			mediarouteactionprovider.refreshRoute();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #31  <Method void MediaRouteActionProvider.refreshRoute()>
			return;
	//    9   19:return          
		} else
		{
			mediarouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (this)));
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #37  <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
			return;
	//   13   25:return          
		}
	}

	public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
	{
		refreshRoute(mediarouter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
	//    3    5:return          
	}

	public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
	{
		refreshRoute(mediarouter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
	//    3    5:return          
	}

	public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
	{
		refreshRoute(mediarouter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
	//    3    5:return          
	}

	public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoute(mediarouter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
	//    3    5:return          
	}

	public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoute(mediarouter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
	//    3    5:return          
	}

	public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoute(mediarouter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
	//    3    5:return          
	}

	private final WeakReference mProviderWeak;

	public MediaRouteActionProvider$MediaRouterCallback(MediaRouteActionProvider mediarouteactionprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void android.support.v7.media.MediaRouter$Callback()>
		mProviderWeak = new WeakReference(((Object) (mediarouteactionprovider)));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
	//    7   13:putfield        #22  <Field WeakReference mProviderWeak>
	//    8   16:return          
	}
}
