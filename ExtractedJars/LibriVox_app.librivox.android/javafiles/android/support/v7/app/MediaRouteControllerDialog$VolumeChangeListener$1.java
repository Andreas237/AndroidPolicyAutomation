// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$VolumeChangeListener$1
	implements Runnable
{

	public void run()
	{
		if(mRouteInVolumeSliderTouched != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
	//*   2    4:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
	//*   3    7:getfield        #29  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
	//*   4   10:ifnull          57
		{
			mRouteInVolumeSliderTouched = null;
	//    5   13:aload_0         
	//    6   14:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
	//    7   17:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
	//    8   20:aconst_null     
	//    9   21:putfield        #29  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
			if(mHasPendingUpdate)
	//*  10   24:aload_0         
	//*  11   25:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
	//*  12   28:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
	//*  13   31:getfield        #33  <Field boolean MediaRouteControllerDialog.mHasPendingUpdate>
	//*  14   34:ifeq            57
				update(mPendingUpdateAnimationNeeded);
	//   15   37:aload_0         
	//   16   38:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
	//   17   41:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
	//   18   44:aload_0         
	//   19   45:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
	//   20   48:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
	//   21   51:getfield        #36  <Field boolean MediaRouteControllerDialog.mPendingUpdateAnimationNeeded>
	//   22   54:invokevirtual   #40  <Method void MediaRouteControllerDialog.update(boolean)>
		}
	//   23   57:return          
	}

	final MediaRouteControllerDialog.VolumeChangeListener this$1;

	MediaRouteControllerDialog$VolumeChangeListener$1()
	{
		this$1 = MediaRouteControllerDialog.VolumeChangeListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
