// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			FloatingActionButtonImpl, VisibilityAwareImageButton

class FloatingActionButtonImpl$1 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		cancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #32  <Field boolean cancelled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		animator = ((Animator) (FloatingActionButtonImpl.this));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    2    4:astore_1        
		animator.animState = 0;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:putfield        #37  <Field int FloatingActionButtonImpl.animState>
		animator.currentAnimator = null;
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:putfield        #41  <Field Animator FloatingActionButtonImpl.currentAnimator>
		if(!cancelled)
	//*   9   15:aload_0         
	//*  10   16:getfield        #32  <Field boolean cancelled>
	//*  11   19:ifne            66
		{
			animator = ((Animator) (((FloatingActionButtonImpl) (animator)).view));
	//   12   22:aload_1         
	//   13   23:getfield        #45  <Field VisibilityAwareImageButton FloatingActionButtonImpl.view>
	//   14   26:astore_1        
			byte byte0;
			if(val$fromUser)
	//*  15   27:aload_0         
	//*  16   28:getfield        #22  <Field boolean val$fromUser>
	//*  17   31:ifeq            40
				byte0 = 8;
	//   18   34:bipush          8
	//   19   36:istore_2        
			else
	//*  20   37:goto            42
				byte0 = 4;
	//   21   40:iconst_4        
	//   22   41:istore_2        
			((VisibilityAwareImageButton) (animator)).internalSetVisibility(((int) (byte0)), val$fromUser);
	//   23   42:aload_1         
	//   24   43:iload_2         
	//   25   44:aload_0         
	//   26   45:getfield        #22  <Field boolean val$fromUser>
	//   27   48:invokevirtual   #51  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
			animator = ((Animator) (val$listener));
	//   28   51:aload_0         
	//   29   52:getfield        #24  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
	//   30   55:astore_1        
			if(animator != null)
	//*  31   56:aload_1         
	//*  32   57:ifnull          66
				((ternalVisibilityChangedListener) (animator)).onHidden();
	//   33   60:aload_1         
	//   34   61:invokeinterface #56  <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onHidden()>
		}
	//   35   66:return          
	}

	public void onAnimationStart(Animator animator)
	{
		view.internalSetVisibility(0, val$fromUser);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    2    4:getfield        #45  <Field VisibilityAwareImageButton FloatingActionButtonImpl.view>
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field boolean val$fromUser>
	//    6   12:invokevirtual   #51  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
		FloatingActionButtonImpl floatingactionbuttonimpl = FloatingActionButtonImpl.this;
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    9   19:astore_2        
		floatingactionbuttonimpl.animState = 1;
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:putfield        #37  <Field int FloatingActionButtonImpl.animState>
		floatingactionbuttonimpl.currentAnimator = animator;
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:putfield        #41  <Field Animator FloatingActionButtonImpl.currentAnimator>
		cancelled = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #32  <Field boolean cancelled>
	//   19   35:return          
	}

	private boolean cancelled;
	final FloatingActionButtonImpl this$0;
	final boolean val$fromUser;
	final ternalVisibilityChangedListener val$listener;

	FloatingActionButtonImpl$1()
	{
		this$0 = final_floatingactionbuttonimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field FloatingActionButtonImpl this$0>
		val$fromUser = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field boolean val$fromUser>
		val$listener = ternalVisibilityChangedListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
