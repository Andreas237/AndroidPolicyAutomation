// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.animation.Animation;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog, OverlayListView

class MediaRouteControllerDialog$9
	implements android.view.animation.Animation.AnimationListener
{

	public void onAnimationEnd(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
		mVolumeGroupList.startAnimationAll();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//    2    4:getfield        #26  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
	//    3    7:invokevirtual   #31  <Method void OverlayListView.startAnimationAll()>
		mVolumeGroupList.postDelayed(mGroupListFadeInAnimation, mGroupListAnimationDurationMs);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//    6   14:getfield        #26  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//    9   21:getfield        #35  <Field Runnable MediaRouteControllerDialog.mGroupListFadeInAnimation>
	//   10   24:aload_0         
	//   11   25:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//   12   28:getfield        #39  <Field int MediaRouteControllerDialog.mGroupListAnimationDurationMs>
	//   13   31:i2l             
	//   14   32:invokevirtual   #43  <Method boolean OverlayListView.postDelayed(Runnable, long)>
	//   15   35:pop             
	//   16   36:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$9()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
