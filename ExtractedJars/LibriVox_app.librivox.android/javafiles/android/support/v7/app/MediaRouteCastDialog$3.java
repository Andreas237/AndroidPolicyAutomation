// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			MediaRouteCastDialog

class MediaRouteCastDialog$3
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(mRoute.isSelected())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field MediaRouteCastDialog this$0>
	//*   2    4:getfield        #24  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
	//*   3    7:invokevirtual   #30  <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
	//*   4   10:ifeq            24
			mRouter.unselect(2);
	//    5   13:aload_0         
	//    6   14:getfield        #12  <Field MediaRouteCastDialog this$0>
	//    7   17:getfield        #34  <Field MediaRouter MediaRouteCastDialog.mRouter>
	//    8   20:iconst_2        
	//    9   21:invokevirtual   #40  <Method void MediaRouter.unselect(int)>
		dismiss();
	//   10   24:aload_0         
	//   11   25:getfield        #12  <Field MediaRouteCastDialog this$0>
	//   12   28:invokevirtual   #43  <Method void MediaRouteCastDialog.dismiss()>
	//   13   31:return          
	}

	final MediaRouteCastDialog this$0;

	MediaRouteCastDialog$3()
	{
		this$0 = MediaRouteCastDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaRouteCastDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
