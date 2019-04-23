// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			DefaultItemAnimator

class DefaultItemAnimator$6 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		if(val$deltaX != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int val$deltaX>
	//*   2    4:ifeq            15
			val$view.setTranslationX(0.0F);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field View val$view>
	//    5   11:fconst_0        
	//    6   12:invokevirtual   #41  <Method void View.setTranslationX(float)>
		if(val$deltaY != 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #27  <Field int val$deltaY>
	//*   9   19:ifeq            30
			val$view.setTranslationY(0.0F);
	//   10   22:aload_0         
	//   11   23:getfield        #25  <Field View val$view>
	//   12   26:fconst_0        
	//   13   27:invokevirtual   #44  <Method void View.setTranslationY(float)>
	//   14   30:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		val$animation.setListener(((android.animation.ner) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ViewPropertyAnimator val$animation>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #51  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		dispatchMoveFinished(val$holder);
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field DefaultItemAnimator this$0>
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field RecyclerView$ViewHolder val$holder>
	//    9   17:invokevirtual   #57  <Method void DefaultItemAnimator.dispatchMoveFinished(RecyclerView$ViewHolder)>
		mMoveAnimations.remove(((Object) (val$holder)));
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field DefaultItemAnimator this$0>
	//   12   24:getfield        #61  <Field ArrayList DefaultItemAnimator.mMoveAnimations>
	//   13   27:aload_0         
	//   14   28:getfield        #21  <Field RecyclerView$ViewHolder val$holder>
	//   15   31:invokevirtual   #67  <Method boolean ArrayList.remove(Object)>
	//   16   34:pop             
		dispatchFinishedWhenDone();
	//   17   35:aload_0         
	//   18   36:getfield        #19  <Field DefaultItemAnimator this$0>
	//   19   39:invokevirtual   #70  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
	//   20   42:return          
	}

	public void onAnimationStart(Animator animator)
	{
		dispatchMoveStarting(val$holder);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DefaultItemAnimator this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field RecyclerView$ViewHolder val$holder>
	//    4    8:invokevirtual   #74  <Method void DefaultItemAnimator.dispatchMoveStarting(RecyclerView$ViewHolder)>
	//    5   11:return          
	}

	final DefaultItemAnimator this$0;
	final ViewPropertyAnimator val$animation;
	final int val$deltaX;
	final int val$deltaY;
	final r val$holder;
	final View val$view;

	DefaultItemAnimator$6()
	{
		this$0 = final_defaultitemanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DefaultItemAnimator this$0>
		val$holder = r;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field RecyclerView$ViewHolder val$holder>
		val$deltaX = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #23  <Field int val$deltaX>
		val$view = view1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #25  <Field View val$view>
		val$deltaY = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #27  <Field int val$deltaY>
		val$animation = ViewPropertyAnimator.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #29  <Field ViewPropertyAnimator val$animation>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #32  <Method void AnimatorListenerAdapter()>
	//   20   37:return          
	}
}
