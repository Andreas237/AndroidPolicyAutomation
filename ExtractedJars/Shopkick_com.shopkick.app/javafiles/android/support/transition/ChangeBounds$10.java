// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			ChangeBounds, ViewUtils, ViewOverlayImpl

class ChangeBounds$10 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		ViewUtils.getOverlay(((View) (val$sceneRoot))).remove(((android.graphics.drawable.Drawable) (val$drawable)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroup val$sceneRoot>
	//    2    4:invokestatic    #43  <Method ViewOverlayImpl ViewUtils.getOverlay(View)>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field BitmapDrawable val$drawable>
	//    5   11:invokeinterface #49  <Method void ViewOverlayImpl.remove(android.graphics.drawable.Drawable)>
		ViewUtils.setTransitionAlpha(val$view, val$transitionAlpha);
	//    6   16:aload_0         
	//    7   17:getfield        #29  <Field View val$view>
	//    8   20:aload_0         
	//    9   21:getfield        #31  <Field float val$transitionAlpha>
	//   10   24:invokestatic    #53  <Method void ViewUtils.setTransitionAlpha(View, float)>
	//   11   27:return          
	}

	final ChangeBounds this$0;
	final BitmapDrawable val$drawable;
	final ViewGroup val$sceneRoot;
	final float val$transitionAlpha;
	final View val$view;

	ChangeBounds$10()
	{
		this$0 = final_changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ChangeBounds this$0>
		val$sceneRoot = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field ViewGroup val$sceneRoot>
		val$drawable = bitmapdrawable;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field BitmapDrawable val$drawable>
		val$view = view1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field View val$view>
		val$transitionAlpha = F.this;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #31  <Field float val$transitionAlpha>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #34  <Method void AnimatorListenerAdapter()>
	//   17   31:return          
	}
}
