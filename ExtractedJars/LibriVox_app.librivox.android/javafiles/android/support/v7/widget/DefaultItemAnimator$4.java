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

class DefaultItemAnimator$4 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		val$animation.setListener(((android.animation.ner) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ViewPropertyAnimator val$animation>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #34  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		val$view.setAlpha(1.0F);
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field View val$view>
	//    7   13:fconst_1        
	//    8   14:invokevirtual   #40  <Method void View.setAlpha(float)>
		dispatchRemoveFinished(val$holder);
	//    9   17:aload_0         
	//   10   18:getfield        #16  <Field DefaultItemAnimator this$0>
	//   11   21:aload_0         
	//   12   22:getfield        #18  <Field RecyclerView$ViewHolder val$holder>
	//   13   25:invokevirtual   #46  <Method void DefaultItemAnimator.dispatchRemoveFinished(RecyclerView$ViewHolder)>
		mRemoveAnimations.remove(((Object) (val$holder)));
	//   14   28:aload_0         
	//   15   29:getfield        #16  <Field DefaultItemAnimator this$0>
	//   16   32:getfield        #50  <Field ArrayList DefaultItemAnimator.mRemoveAnimations>
	//   17   35:aload_0         
	//   18   36:getfield        #18  <Field RecyclerView$ViewHolder val$holder>
	//   19   39:invokevirtual   #56  <Method boolean ArrayList.remove(Object)>
	//   20   42:pop             
		dispatchFinishedWhenDone();
	//   21   43:aload_0         
	//   22   44:getfield        #16  <Field DefaultItemAnimator this$0>
	//   23   47:invokevirtual   #59  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
	//   24   50:return          
	}

	public void onAnimationStart(Animator animator)
	{
		dispatchRemoveStarting(val$holder);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DefaultItemAnimator this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field RecyclerView$ViewHolder val$holder>
	//    4    8:invokevirtual   #63  <Method void DefaultItemAnimator.dispatchRemoveStarting(RecyclerView$ViewHolder)>
	//    5   11:return          
	}

	final DefaultItemAnimator this$0;
	final ViewPropertyAnimator val$animation;
	final r val$holder;
	final View val$view;

	DefaultItemAnimator$4()
	{
		this$0 = final_defaultitemanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DefaultItemAnimator this$0>
		val$holder = r;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field RecyclerView$ViewHolder val$holder>
		val$animation = viewpropertyanimator;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field ViewPropertyAnimator val$animation>
		val$view = View.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #22  <Field View val$view>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #25  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
