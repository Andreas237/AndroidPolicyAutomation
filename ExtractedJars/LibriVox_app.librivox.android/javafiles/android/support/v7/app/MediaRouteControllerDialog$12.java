// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.animation.Animation;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$12
	implements android.view.animation.Animation.AnimationListener
{

	public void onAnimationEnd(Animation animation)
	{
		finishAnimation(true);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #24  <Method void MediaRouteControllerDialog.finishAnimation(boolean)>
	//    4    8:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
	//    0    0:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$12()
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
