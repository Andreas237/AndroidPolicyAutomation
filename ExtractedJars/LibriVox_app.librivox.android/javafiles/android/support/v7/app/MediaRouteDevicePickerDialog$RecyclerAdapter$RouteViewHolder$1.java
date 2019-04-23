// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;

class MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		val$route.select();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
	//    2    4:invokevirtual   #27  <Method void android.support.v7.media.MediaRouter$RouteInfo.select()>
	//    3    7:return          
	}

	final MediaRouteDevicePickerDialog.RecyclerAdapter.RouteViewHolder this$2;
	final android.support.v7.media.MediaRouter.RouteInfo val$route;

	MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder$1()
	{
		this$2 = final_routeviewholder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaRouteDevicePickerDialog$RecyclerAdapter$RouteViewHolder this$2>
		val$route = android.support.v7.media.MediaRouter.RouteInfo.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}
}
