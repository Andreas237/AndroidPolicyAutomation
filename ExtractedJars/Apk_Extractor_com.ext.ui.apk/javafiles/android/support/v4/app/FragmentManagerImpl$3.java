// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl, Fragment

class FragmentManagerImpl$3 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		if(val$container != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ViewGroup val$container>
	//*   2    4:ifnull          18
			val$container.endViewTransition(val$viewToAnimate);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field ViewGroup val$container>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field View val$viewToAnimate>
	//    7   15:invokevirtual   #39  <Method void ViewGroup.endViewTransition(View)>
		if(val$fragment.getAnimator() != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #27  <Field Fragment val$fragment>
	//*  10   22:invokevirtual   #45  <Method Animator Fragment.getAnimator()>
	//*  11   25:ifnull          57
		{
			val$fragment.setAnimator(((Animator) (null)));
	//   12   28:aload_0         
	//   13   29:getfield        #27  <Field Fragment val$fragment>
	//   14   32:aconst_null     
	//   15   33:invokevirtual   #48  <Method void Fragment.setAnimator(Animator)>
			moveToState(val$fragment, val$fragment.getStateAfterAnimating(), 0, 0, false);
	//   16   36:aload_0         
	//   17   37:getfield        #21  <Field FragmentManagerImpl this$0>
	//   18   40:aload_0         
	//   19   41:getfield        #27  <Field Fragment val$fragment>
	//   20   44:aload_0         
	//   21   45:getfield        #27  <Field Fragment val$fragment>
	//   22   48:invokevirtual   #52  <Method int Fragment.getStateAfterAnimating()>
	//   23   51:iconst_0        
	//   24   52:iconst_0        
	//   25   53:iconst_0        
	//   26   54:invokevirtual   #56  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
		}
	//   27   57:return          
	}

	final FragmentManagerImpl this$0;
	final ViewGroup val$container;
	final Fragment val$fragment;
	final View val$viewToAnimate;

	FragmentManagerImpl$3()
	{
		this$0 = final_fragmentmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field FragmentManagerImpl this$0>
		val$container = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ViewGroup val$container>
		val$viewToAnimate = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field View val$viewToAnimate>
		val$fragment = Fragment.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field Fragment val$fragment>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
