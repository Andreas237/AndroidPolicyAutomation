// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			FloatingActionButtonImpl, VisibilityAwareImageButton

class FloatingActionButtonImpl$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		animator = ((Animator) (FloatingActionButtonImpl.this));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FloatingActionButtonImpl this$0>
	//    2    4:astore_1        
		animator.animState = 0;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:putfield        #33  <Field int FloatingActionButtonImpl.animState>
		animator.currentAnimator = null;
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:putfield        #37  <Field Animator FloatingActionButtonImpl.currentAnimator>
		animator = ((Animator) (val$listener));
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
	//   11   19:astore_1        
		if(animator != null)
	//*  12   20:aload_1         
	//*  13   21:ifnull          30
			((ternalVisibilityChangedListener) (animator)).onShown();
	//   14   24:aload_1         
	//   15   25:invokeinterface #42  <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onShown()>
	//   16   30:return          
	}

	public void onAnimationStart(Animator animator)
	{
		view.internalSetVisibility(0, val$fromUser);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FloatingActionButtonImpl this$0>
	//    2    4:getfield        #47  <Field VisibilityAwareImageButton FloatingActionButtonImpl.view>
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field boolean val$fromUser>
	//    6   12:invokevirtual   #53  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
		FloatingActionButtonImpl floatingactionbuttonimpl = FloatingActionButtonImpl.this;
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field FloatingActionButtonImpl this$0>
	//    9   19:astore_2        
		floatingactionbuttonimpl.animState = 2;
	//   10   20:aload_2         
	//   11   21:iconst_2        
	//   12   22:putfield        #33  <Field int FloatingActionButtonImpl.animState>
		floatingactionbuttonimpl.currentAnimator = animator;
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:putfield        #37  <Field Animator FloatingActionButtonImpl.currentAnimator>
	//   16   30:return          
	}

	final FloatingActionButtonImpl this$0;
	final boolean val$fromUser;
	final ternalVisibilityChangedListener val$listener;

	FloatingActionButtonImpl$2()
	{
		this$0 = final_floatingactionbuttonimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FloatingActionButtonImpl this$0>
		val$fromUser = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean val$fromUser>
		val$listener = ternalVisibilityChangedListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
