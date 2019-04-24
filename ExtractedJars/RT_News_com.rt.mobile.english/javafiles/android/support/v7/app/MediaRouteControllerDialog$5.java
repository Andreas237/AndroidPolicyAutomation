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
		mIsGroupExpanded = mIsGroupExpanded ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//    4    8:getfield        #27  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:putfield        #27  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
		if(mIsGroupExpanded)
	//*   8   16:aload_0         
	//*   9   17:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//*  10   20:getfield        #27  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
	//*  11   23:ifeq            37
			mVolumeGroupList.setVisibility(0);
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//   14   30:getfield        #31  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #37  <Method void OverlayListView.setVisibility(int)>
		loadInterpolator();
	//   17   37:aload_0         
	//   18   38:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//   19   41:invokevirtual   #40  <Method void MediaRouteControllerDialog.loadInterpolator()>
		updateLayoutHeight(true);
	//   20   44:aload_0         
	//   21   45:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//   22   48:iconst_1        
	//   23   49:invokevirtual   #44  <Method void MediaRouteControllerDialog.updateLayoutHeight(boolean)>
	//   24   52:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$5()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
