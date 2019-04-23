// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;

// Referenced classes of package android.support.v7.app:
//			MediaRouteDevicePickerDialog

final class MediaRouteDevicePickerDialog$MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
{

	public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoutes();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteDevicePickerDialog.refreshRoutes()>
	//    3    7:return          
	}

	public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoutes();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteDevicePickerDialog.refreshRoutes()>
	//    3    7:return          
	}

	public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		refreshRoutes();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
	//    2    4:invokevirtual   #21  <Method void MediaRouteDevicePickerDialog.refreshRoutes()>
	//    3    7:return          
	}

	public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteDevicePickerDialog this$0>
	//    2    4:invokevirtual   #27  <Method void MediaRouteDevicePickerDialog.dismiss()>
	//    3    7:return          
	}

	final MediaRouteDevicePickerDialog this$0;

	MediaRouteDevicePickerDialog$MediaRouterCallback()
	{
		this$0 = MediaRouteDevicePickerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field MediaRouteDevicePickerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void android.support.v7.media.MediaRouter$Callback()>
	//    5    9:return          
	}
}
