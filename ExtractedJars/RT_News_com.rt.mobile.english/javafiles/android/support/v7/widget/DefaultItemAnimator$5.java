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

class DefaultItemAnimator$5 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		val$view.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field View val$view>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #39  <Method void View.setAlpha(float)>
	//    4    8:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		val$animation.setListener(((android.animation.ner) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ViewPropertyAnimator val$animation>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #46  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		dispatchAddFinished(val$holder);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field DefaultItemAnimator this$0>
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
	//    9   17:invokevirtual   #49  <Method void DefaultItemAnimator.dispatchAddFinished(RecyclerView$ViewHolder)>
		mAddAnimations.remove(((Object) (val$holder)));
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field DefaultItemAnimator this$0>
	//   12   24:getfield        #53  <Field ArrayList DefaultItemAnimator.mAddAnimations>
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
	//   15   31:invokevirtual   #59  <Method boolean ArrayList.remove(Object)>
	//   16   34:pop             
		dispatchFinishedWhenDone();
	//   17   35:aload_0         
	//   18   36:getfield        #21  <Field DefaultItemAnimator this$0>
	//   19   39:invokevirtual   #62  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
	//   20   42:return          
	}

	public void onAnimationStart(Animator animator)
	{
		dispatchAddStarting(val$holder);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DefaultItemAnimator this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field RecyclerView$ViewHolder val$holder>
	//    4    8:invokevirtual   #66  <Method void DefaultItemAnimator.dispatchAddStarting(RecyclerView$ViewHolder)>
	//    5   11:return          
	}

	final DefaultItemAnimator this$0;
	final ViewPropertyAnimator val$animation;
	final r val$holder;
	final View val$view;

	DefaultItemAnimator$5()
	{
		this$0 = final_defaultitemanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DefaultItemAnimator this$0>
		val$holder = r;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field RecyclerView$ViewHolder val$holder>
		val$view = view1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field View val$view>
		val$animation = ViewPropertyAnimator.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field ViewPropertyAnimator val$animation>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
