// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import java.util.Set;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$10
	implements OnAnimationEndListener
{

	public void onAnimationEnd()
	{
		mGroupMemberRoutesAnimatingWithBitmap.remove(((Object) (val$route)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MediaRouteControllerDialog this$0>
	//    2    4:getfield        #27  <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAnimatingWithBitmap>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
	//    5   11:invokeinterface #33  <Method boolean Set.remove(Object)>
	//    6   16:pop             
		mVolumeGroupAdapter.notifyDataSetChanged();
	//    7   17:aload_0         
	//    8   18:getfield        #14  <Field MediaRouteControllerDialog this$0>
	//    9   21:getfield        #37  <Field MediaRouteControllerDialog$VolumeGroupAdapter MediaRouteControllerDialog.mVolumeGroupAdapter>
	//   10   24:invokevirtual   #42  <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
	//   11   27:return          
	}

	final MediaRouteControllerDialog this$0;
	final android.support.v7.media.MediaRouter.RouteInfo val$route;

	MediaRouteControllerDialog$10()
	{
		this$0 = final_mediaroutecontrollerdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaRouteControllerDialog this$0>
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
