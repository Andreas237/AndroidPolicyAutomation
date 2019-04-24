// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.ViewTreeObserver;
import java.util.Map;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog, OverlayListView

class MediaRouteControllerDialog$8
	implements android.view.utListener
{

	public void onGlobalLayout()
	{
		mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.utListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaRouteControllerDialog this$0>
	//    2    4:getfield        #33  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
	//    3    7:invokevirtual   #39  <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #45  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		animateGroupListItemsInternal(val$previousRouteBoundMap, val$previousRouteBitmapMap);
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field MediaRouteControllerDialog this$0>
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field Map val$previousRouteBoundMap>
	//   10   22:aload_0         
	//   11   23:getfield        #24  <Field Map val$previousRouteBitmapMap>
	//   12   26:invokevirtual   #48  <Method void MediaRouteControllerDialog.animateGroupListItemsInternal(Map, Map)>
	//   13   29:return          
	}

	final MediaRouteControllerDialog this$0;
	final Map val$previousRouteBitmapMap;
	final Map val$previousRouteBoundMap;

	MediaRouteControllerDialog$8()
	{
		this$0 = final_mediaroutecontrollerdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediaRouteControllerDialog this$0>
		val$previousRouteBoundMap = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Map val$previousRouteBoundMap>
		val$previousRouteBitmapMap = Map.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field Map val$previousRouteBitmapMap>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
