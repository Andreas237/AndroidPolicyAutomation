// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$6
	implements android.view.utListener
{

	public void onGlobalLayout()
	{
		mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.utListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MediaRouteControllerDialog this$0>
	//    2    4:getfield        #30  <Field FrameLayout MediaRouteControllerDialog.mDefaultControlLayout>
	//    3    7:invokevirtual   #36  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #42  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		if(mIsGroupListAnimating)
	//*   6   14:aload_0         
	//*   7   15:getfield        #19  <Field MediaRouteControllerDialog this$0>
	//*   8   18:getfield        #45  <Field boolean MediaRouteControllerDialog.mIsGroupListAnimating>
	//*   9   21:ifeq            33
		{
			mIsGroupListAnimationPending = true;
	//   10   24:aload_0         
	//   11   25:getfield        #19  <Field MediaRouteControllerDialog this$0>
	//   12   28:iconst_1        
	//   13   29:putfield        #48  <Field boolean MediaRouteControllerDialog.mIsGroupListAnimationPending>
			return;
	//   14   32:return          
		} else
		{
			updateLayoutHeightInternal(val$animate);
	//   15   33:aload_0         
	//   16   34:getfield        #19  <Field MediaRouteControllerDialog this$0>
	//   17   37:aload_0         
	//   18   38:getfield        #21  <Field boolean val$animate>
	//   19   41:invokevirtual   #51  <Method void MediaRouteControllerDialog.updateLayoutHeightInternal(boolean)>
			return;
	//   20   44:return          
		}
	}

	final MediaRouteControllerDialog this$0;
	final boolean val$animate;

	MediaRouteControllerDialog$6()
	{
		this$0 = final_mediaroutecontrollerdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MediaRouteControllerDialog this$0>
		val$animate = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$animate>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
