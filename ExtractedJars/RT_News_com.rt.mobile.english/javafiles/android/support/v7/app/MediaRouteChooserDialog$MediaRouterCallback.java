// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;

// Referenced classes of package android.support.v7.app:
//			MediaRouteChooserDialog

private final class MediaRouteChooserDialog$MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
{

	public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoutes();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteChooserDialog this$0>
	//    2    4:invokevirtual   #22  <Method void MediaRouteChooserDialog.refreshRoutes()>
	//    3    7:return          
	}

	public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoutes();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteChooserDialog this$0>
	//    2    4:invokevirtual   #22  <Method void MediaRouteChooserDialog.refreshRoutes()>
	//    3    7:return          
	}

	public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoutes();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteChooserDialog this$0>
	//    2    4:invokevirtual   #22  <Method void MediaRouteChooserDialog.refreshRoutes()>
	//    3    7:return          
	}

	public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteChooserDialog this$0>
	//    2    4:invokevirtual   #28  <Method void MediaRouteChooserDialog.dismiss()>
	//    3    7:return          
	}

	final MediaRouteChooserDialog this$0;

	MediaRouteChooserDialog$MediaRouterCallback()
	{
		this$0 = MediaRouteChooserDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field MediaRouteChooserDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.support.v7.media.MediaRouter$Callback()>
	//    5    9:return          
	}
}
