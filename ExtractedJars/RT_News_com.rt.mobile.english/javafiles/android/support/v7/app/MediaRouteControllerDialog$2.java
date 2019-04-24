// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//    2    4:invokevirtual   #26  <Method void MediaRouteControllerDialog.dismiss()>
	//    3    7:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$2()
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
