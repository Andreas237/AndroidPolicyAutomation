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
		mCancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #32  <Field boolean mCancelled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		mAnimState = 0;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    2    4:iconst_0        
	//    3    5:putfield        #37  <Field int FloatingActionButtonImpl.mAnimState>
		if(!mCancelled)
	//*   4    8:aload_0         
	//*   5    9:getfield        #32  <Field boolean mCancelled>
	//*   6   12:ifne            63
		{
			animator = ((Animator) (mView));
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    9   19:getfield        #41  <Field VisibilityAwareImageButton FloatingActionButtonImpl.mView>
	//   10   22:astore_1        
			byte byte0;
			if(val$fromUser)
	//*  11   23:aload_0         
	//*  12   24:getfield        #22  <Field boolean val$fromUser>
	//*  13   27:ifeq            36
				byte0 = 8;
	//   14   30:bipush          8
	//   15   32:istore_2        
			else
	//*  16   33:goto            38
				byte0 = 4;
	//   17   36:iconst_4        
	//   18   37:istore_2        
			((VisibilityAwareImageButton) (animator)).internalSetVisibility(((int) (byte0)), val$fromUser);
	//   19   38:aload_1         
	//   20   39:iload_2         
	//   21   40:aload_0         
	//   22   41:getfield        #22  <Field boolean val$fromUser>
	//   23   44:invokevirtual   #47  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
			if(val$listener != null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #24  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
	//*  26   51:ifnull          63
				val$listener.onHidden();
	//   27   54:aload_0         
	//   28   55:getfield        #24  <Field FloatingActionButtonImpl$InternalVisibilityChangedListener val$listener>
	//   29   58:invokeinterface #52  <Method void FloatingActionButtonImpl$InternalVisibilityChangedListener.onHidden()>
		}
	//   30   63:return          
	}

	public void onAnimationStart(Animator animator)
	{
		mView.internalSetVisibility(0, val$fromUser);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    2    4:getfield        #41  <Field VisibilityAwareImageButton FloatingActionButtonImpl.mView>
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field boolean val$fromUser>
	//    6   12:invokevirtual   #47  <Method void VisibilityAwareImageButton.internalSetVisibility(int, boolean)>
		mCancelled = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #32  <Field boolean mCancelled>
	//   10   20:return          
	}

	private boolean mCancelled;
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
