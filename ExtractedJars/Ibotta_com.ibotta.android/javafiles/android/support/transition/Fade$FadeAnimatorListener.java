// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ViewCompat;
import android.view.View;

// Referenced classes of package android.support.transition:
//			Fade, ViewUtils

private static class Fade$FadeAnimatorListener extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		ViewUtils.setTransitionAlpha(mView, 1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field View mView>
	//    2    4:fconst_1        
	//    3    5:invokestatic    #29  <Method void ViewUtils.setTransitionAlpha(View, float)>
		if(mLayerTypeChanged)
	//*   4    8:aload_0         
	//*   5    9:getfield        #18  <Field boolean mLayerTypeChanged>
	//*   6   12:ifeq            24
			mView.setLayerType(0, ((android.graphics.Paint) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field View mView>
	//    9   19:iconst_0        
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #35  <Method void View.setLayerType(int, android.graphics.Paint)>
	//   12   24:return          
	}

	public void onAnimationStart(Animator animator)
	{
		if(ViewCompat.hasOverlappingRendering(mView) && mView.getLayerType() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field View mView>
	//*   2    4:invokestatic    #42  <Method boolean ViewCompat.hasOverlappingRendering(View)>
	//*   3    7:ifeq            34
	//*   4   10:aload_0         
	//*   5   11:getfield        #20  <Field View mView>
	//*   6   14:invokevirtual   #46  <Method int View.getLayerType()>
	//*   7   17:ifne            34
		{
			mLayerTypeChanged = true;
	//    8   20:aload_0         
	//    9   21:iconst_1        
	//   10   22:putfield        #18  <Field boolean mLayerTypeChanged>
			mView.setLayerType(2, ((android.graphics.Paint) (null)));
	//   11   25:aload_0         
	//   12   26:getfield        #20  <Field View mView>
	//   13   29:iconst_2        
	//   14   30:aconst_null     
	//   15   31:invokevirtual   #35  <Method void View.setLayerType(int, android.graphics.Paint)>
		}
	//   16   34:return          
	}

	private boolean mLayerTypeChanged;
	private final View mView;

	Fade$FadeAnimatorListener(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void AnimatorListenerAdapter()>
		mLayerTypeChanged = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean mLayerTypeChanged>
		mView = view;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field View mView>
	//    8   14:return          
	}
}
