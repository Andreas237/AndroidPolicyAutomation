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

class DefaultItemAnimator$7 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		val$oldViewAnim.setListener(((android.animation.ner) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewPropertyAnimator val$oldViewAnim>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #39  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		val$view.setAlpha(1.0F);
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field View val$view>
	//    7   13:fconst_1        
	//    8   14:invokevirtual   #45  <Method void View.setAlpha(float)>
		val$view.setTranslationX(0.0F);
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field View val$view>
	//   11   21:fconst_0        
	//   12   22:invokevirtual   #48  <Method void View.setTranslationX(float)>
		val$view.setTranslationY(0.0F);
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field View val$view>
	//   15   29:fconst_0        
	//   16   30:invokevirtual   #51  <Method void View.setTranslationY(float)>
		dispatchChangeFinished(val$changeInfo.oldHolder, true);
	//   17   33:aload_0         
	//   18   34:getfield        #21  <Field DefaultItemAnimator this$0>
	//   19   37:aload_0         
	//   20   38:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
	//   21   41:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #61  <Method void DefaultItemAnimator.dispatchChangeFinished(RecyclerView$ViewHolder, boolean)>
		mChangeAnimations.remove(((Object) (val$changeInfo.oldHolder)));
	//   24   48:aload_0         
	//   25   49:getfield        #21  <Field DefaultItemAnimator this$0>
	//   26   52:getfield        #65  <Field ArrayList DefaultItemAnimator.mChangeAnimations>
	//   27   55:aload_0         
	//   28   56:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
	//   29   59:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//   30   62:invokevirtual   #71  <Method boolean ArrayList.remove(Object)>
	//   31   65:pop             
		dispatchFinishedWhenDone();
	//   32   66:aload_0         
	//   33   67:getfield        #21  <Field DefaultItemAnimator this$0>
	//   34   70:invokevirtual   #74  <Method void DefaultItemAnimator.dispatchFinishedWhenDone()>
	//   35   73:return          
	}

	public void onAnimationStart(Animator animator)
	{
		dispatchChangeStarting(val$changeInfo.oldHolder, true);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DefaultItemAnimator this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
	//    4    8:getfield        #57  <Field RecyclerView$ViewHolder DefaultItemAnimator$ChangeInfo.oldHolder>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #78  <Method void DefaultItemAnimator.dispatchChangeStarting(RecyclerView$ViewHolder, boolean)>
	//    7   15:return          
	}

	final DefaultItemAnimator this$0;
	final angeInfo val$changeInfo;
	final ViewPropertyAnimator val$oldViewAnim;
	final View val$view;

	DefaultItemAnimator$7()
	{
		this$0 = final_defaultitemanimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DefaultItemAnimator this$0>
		val$changeInfo = angeinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field DefaultItemAnimator$ChangeInfo val$changeInfo>
		val$oldViewAnim = viewpropertyanimator;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field ViewPropertyAnimator val$oldViewAnim>
		val$view = View.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field View val$view>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
