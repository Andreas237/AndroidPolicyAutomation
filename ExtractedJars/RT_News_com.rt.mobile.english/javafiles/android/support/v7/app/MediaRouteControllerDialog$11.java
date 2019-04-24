// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog, OverlayListView

class MediaRouteControllerDialog$11
	implements android.view.tListener
{

	public void onGlobalLayout()
	{
		mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.tListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//    2    4:getfield        #25  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
	//    3    7:invokevirtual   #31  <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		startGroupListFadeInAnimationInternal();
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//    8   18:invokevirtual   #40  <Method void MediaRouteControllerDialog.startGroupListFadeInAnimationInternal()>
	//    9   21:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$11()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
