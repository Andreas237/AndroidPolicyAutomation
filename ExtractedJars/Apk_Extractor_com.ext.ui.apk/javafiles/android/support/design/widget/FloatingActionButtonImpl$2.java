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
		mAnimState = 0;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FloatingActionButtonImpl this$0>
	//    2    4:iconst_0        
	//    3    5:putfield        #33  <Field int FloatingActionButtonImpl.mAnimState>
		if(val$listener != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #23  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
	//*   6   12:ifnull          24
			val$listener.onShown();
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
	//    9   19:invokeinterface #38  <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onShown()>
	//   10   24:return          
	}

	public void onAnimationStart(Animator animator)
	{
		mView.internalSetVisibility(0, val$fromUser);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FloatingActionButtonImpl this$0>
	//    2    4:getfield        #43  <Field VisibilityAwareImageButton FloatingActionButtonImpl.mView>
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field boolean val$fromUser>
	//    6   12:invokevirtual   #49  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
	//    7   15:return          
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
