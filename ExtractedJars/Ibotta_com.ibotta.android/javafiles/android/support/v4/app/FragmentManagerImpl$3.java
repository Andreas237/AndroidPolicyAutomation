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
		val$container.endViewTransition(val$viewToAnimate);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ViewGroup val$container>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field View val$viewToAnimate>
	//    4    8:invokevirtual   #39  <Method void ViewGroup.endViewTransition(View)>
		animator = val$fragment.getAnimator();
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field Fragment val$fragment>
	//    7   15:invokevirtual   #45  <Method Animator Fragment.getAnimator()>
	//    8   18:astore_1        
		val$fragment.setAnimator(((Animator) (null)));
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field Fragment val$fragment>
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #48  <Method void Fragment.setAnimator(Animator)>
		if(animator != null && val$container.indexOfChild(val$viewToAnimate) < 0)
	//*  13   27:aload_1         
	//*  14   28:ifnull          67
	//*  15   31:aload_0         
	//*  16   32:getfield        #23  <Field ViewGroup val$container>
	//*  17   35:aload_0         
	//*  18   36:getfield        #25  <Field View val$viewToAnimate>
	//*  19   39:invokevirtual   #52  <Method int ViewGroup.indexOfChild(View)>
	//*  20   42:ifge            67
		{
			animator = ((Animator) (FragmentManagerImpl.this));
	//   21   45:aload_0         
	//   22   46:getfield        #21  <Field FragmentManagerImpl this$0>
	//   23   49:astore_1        
			Fragment fragment1 = val$fragment;
	//   24   50:aload_0         
	//   25   51:getfield        #27  <Field Fragment val$fragment>
	//   26   54:astore_2        
			((FragmentManagerImpl) (animator)).moveToState(fragment1, fragment1.getStateAfterAnimating(), 0, 0, false);
	//   27   55:aload_1         
	//   28   56:aload_2         
	//   29   57:aload_2         
	//   30   58:invokevirtual   #56  <Method int Fragment.getStateAfterAnimating()>
	//   31   61:iconst_0        
	//   32   62:iconst_0        
	//   33   63:iconst_0        
	//   34   64:invokevirtual   #60  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
		}
	//   35   67:return          
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
