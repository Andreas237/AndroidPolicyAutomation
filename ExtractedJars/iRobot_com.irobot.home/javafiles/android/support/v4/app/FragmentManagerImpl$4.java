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

class FragmentManagerImpl$4 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		val$container.endViewTransition(val$animatingView);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ViewGroup val$container>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field View val$animatingView>
	//    4    8:invokevirtual   #39  <Method void ViewGroup.endViewTransition(View)>
		animator.removeListener(((android.animation.ner) (this)));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #45  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
		if(val$fragment.mView != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #27  <Field Fragment val$fragment>
	//*  10   20:getfield        #50  <Field View Fragment.mView>
	//*  11   23:ifnull          38
			val$fragment.mView.setVisibility(8);
	//   12   26:aload_0         
	//   13   27:getfield        #27  <Field Fragment val$fragment>
	//   14   30:getfield        #50  <Field View Fragment.mView>
	//   15   33:bipush          8
	//   16   35:invokevirtual   #56  <Method void View.setVisibility(int)>
	//   17   38:return          
	}

	final FragmentManagerImpl this$0;
	final View val$animatingView;
	final ViewGroup val$container;
	final Fragment val$fragment;

	FragmentManagerImpl$4()
	{
		this$0 = final_fragmentmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field FragmentManagerImpl this$0>
		val$container = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ViewGroup val$container>
		val$animatingView = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field View val$animatingView>
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
