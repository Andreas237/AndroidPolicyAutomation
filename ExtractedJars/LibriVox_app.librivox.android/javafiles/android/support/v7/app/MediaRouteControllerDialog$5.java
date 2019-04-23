// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog, OverlayListView

class MediaRouteControllerDialog$5
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		view = ((View) (MediaRouteControllerDialog.this));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//    2    4:astore_1        
		view.mIsGroupExpanded = ((MediaRouteControllerDialog) (view)).mIsGroupExpanded ^ true;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #24  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
	//    6   10:iconst_1        
	//    7   11:ixor            
	//    8   12:putfield        #24  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
		if(mIsGroupExpanded)
	//*   9   15:aload_0         
	//*  10   16:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//*  11   19:getfield        #24  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
	//*  12   22:ifeq            36
			mVolumeGroupList.setVisibility(0);
	//   13   25:aload_0         
	//   14   26:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//   15   29:getfield        #28  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #34  <Method void OverlayListView.setVisibility(int)>
		loadInterpolator();
	//   18   36:aload_0         
	//   19   37:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//   20   40:invokevirtual   #37  <Method void MediaRouteControllerDialog.loadInterpolator()>
		updateLayoutHeight(true);
	//   21   43:aload_0         
	//   22   44:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #41  <Method void MediaRouteControllerDialog.updateLayoutHeight(boolean)>
	//   25   51:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$5()
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
