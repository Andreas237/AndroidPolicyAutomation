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

class DefaultItemAnimator$8 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		val$newViewAnimation.setListener(((android.animation.ner) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ViewPropertyAnimator val$newViewAnimation>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #34  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		val$newView.setAlpha(1.0F);
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field View val$newView>
	//    7   13:fconst_1        
	//    8   14:invokevirtual   #40  <Method void View.setAlpha(float)>
		val$newView.setTranslationX(0.0F);
	//    9   17:aload_0         
	//   10   18:getfield        #22  <Field View val$newView>
	//   11   21:fconst_0        
	//   12   22:invokevirtual   #43  <Method void View.setTranslationX(float)>
		val$newView.setTranslationY(0.0F);
	//   13   25:aload_0         
	//   14   26:getfield        #22  <Field View val$newView>
	//   15   29:fconst_0        
	//   16   30:invokevirtual   #46  <Method void View.setTranslationY(float)>
		dispatchChangeFinished(val$changeInfo.newHolder, false);
	//   17   33:aload_0         
	//   18   34:getfield        #16  <Field DefaultItemAnimator this$0>
	//   19   37:aload_0         
	//   20   38:getfield        #18  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
	//   21   41:getfield        #52  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #58  <Method void DefaultItemAnimator.dispatchChangeFinished(RecyclerView$ViewHolder, boolean)>
		mChangeAnimations.remove(((Object) (val$changeInfo.newHolder)));
	//   24   48:aload_0         
	//   25   49:getfield        #16  <Field DefaultItemAnimator this$0>
	//   26   52:getfield        #62  <Field ArrayList DefaultItemAnimator.mChangeAnimations>
	//   27   55:aload_0         
	//   28   56:getfield        #18  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
	//   29   59:getfield        #52  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//   30   62:invokevirtual   #68  <Method boolean ArrayList.remove(Object)>
	//   31   65:pop             
		dispatchFinishedWhenDone();
	//   32   66:aload_0         
	//   33   67:getfield        #16  <Field DefaultItemAnimator this$0>
	//   34   70:invokevirtual   #71  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
	//   35   73:return          
	}

	public void onAnimationStart(Animator animator)
	{
		dispatchChangeStarting(val$changeInfo.newHolder, false);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DefaultItemAnimator this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
	//    4    8:getfield        #52  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.newHolder>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #75  <Method void DefaultItemAnimator.dispatchChangeStarting(RecyclerView$ViewHolder, boolean)>
	//    7   15:return          
	}

	final DefaultItemAnimator this$0;
	final angeInfo val$changeInfo;
	final View val$newView;
	final ViewPropertyAnimator val$newViewAnimation;

	DefaultItemAnimator$8()
	{
		this$0 = final_defaultitemanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DefaultItemAnimator this$0>
		val$changeInfo = angeinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
		val$newViewAnimation = viewpropertyanimator;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field ViewPropertyAnimator val$newViewAnimation>
		val$newView = View.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #22  <Field View val$newView>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #25  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
