// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl

private static class FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		mView.setLayerType(0, ((android.graphics.Paint) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field View mView>
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #25  <Method void View.setLayerType(int, android.graphics.Paint)>
		animator.removeListener(((android.animation.Animator.AnimatorListener) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #31  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
	//    8   14:return          
	}

	public void onAnimationStart(Animator animator)
	{
		mView.setLayerType(2, ((android.graphics.Paint) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field View mView>
	//    2    4:iconst_2        
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #25  <Method void View.setLayerType(int, android.graphics.Paint)>
	//    5    9:return          
	}

	View mView;

	FragmentManagerImpl$AnimatorOnHWLayerIfNeededListener(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AnimatorListenerAdapter()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field View mView>
	//    5    9:return          
	}
}
